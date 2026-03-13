package org.bouncycastle.cert.ocsp;

import E1.a;
import Xa.h;
import com.stub.StubApp;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.ASN1Exception;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ocsp.OCSPRequest;
import org.bouncycastle.asn1.ocsp.Request;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.cert.CertIOException;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.operator.ContentVerifier;
import org.bouncycastle.operator.ContentVerifierProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class OCSPReq {
    private static final X509CertificateHolder[] EMPTY_CERTS = new X509CertificateHolder[0];
    private Extensions extensions;
    private OCSPRequest req;

    private OCSPReq(ASN1InputStream aSN1InputStream) throws IOException {
        String string2 = StubApp.getString2(28102);
        try {
            OCSPRequest oCSPRequest = OCSPRequest.getInstance(aSN1InputStream.readObject());
            this.req = oCSPRequest;
            if (oCSPRequest == null) {
                throw new CertIOException(StubApp.getString2("28103"));
            }
            this.extensions = oCSPRequest.getTbsRequest().getRequestExtensions();
        } catch (ClassCastException e10) {
            throw new CertIOException(string2 + e10.getMessage(), e10);
        } catch (IllegalArgumentException e11) {
            throw new CertIOException(h.l(e11, new StringBuilder(string2)), e11);
        } catch (ASN1Exception e12) {
            throw new CertIOException(string2 + e12.getMessage(), e12);
        }
    }

    public X509CertificateHolder[] getCerts() {
        ASN1Sequence certs;
        if (this.req.getOptionalSignature() != null && (certs = this.req.getOptionalSignature().getCerts()) != null) {
            int size = certs.size();
            X509CertificateHolder[] x509CertificateHolderArr = new X509CertificateHolder[size];
            for (int i3 = 0; i3 != size; i3++) {
                x509CertificateHolderArr[i3] = new X509CertificateHolder(Certificate.getInstance(certs.getObjectAt(i3)));
            }
            return x509CertificateHolderArr;
        }
        return EMPTY_CERTS;
    }

    public Set getCriticalExtensionOIDs() {
        return OCSPUtils.getCriticalExtensionOIDs(this.extensions);
    }

    public byte[] getEncoded() throws IOException {
        return this.req.getEncoded();
    }

    public Extension getExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        Extensions extensions = this.extensions;
        if (extensions != null) {
            return extensions.getExtension(aSN1ObjectIdentifier);
        }
        return null;
    }

    public List getExtensionOIDs() {
        return OCSPUtils.getExtensionOIDs(this.extensions);
    }

    public Set getNonCriticalExtensionOIDs() {
        return OCSPUtils.getNonCriticalExtensionOIDs(this.extensions);
    }

    public Req[] getRequestList() {
        ASN1Sequence requestList = this.req.getTbsRequest().getRequestList();
        int size = requestList.size();
        Req[] reqArr = new Req[size];
        for (int i3 = 0; i3 != size; i3++) {
            reqArr[i3] = new Req(Request.getInstance(requestList.getObjectAt(i3)));
        }
        return reqArr;
    }

    public GeneralName getRequestorName() {
        return GeneralName.getInstance(this.req.getTbsRequest().getRequestorName());
    }

    public byte[] getSignature() {
        if (isSigned()) {
            return this.req.getOptionalSignature().getSignature().getOctets();
        }
        return null;
    }

    public ASN1ObjectIdentifier getSignatureAlgOID() {
        if (isSigned()) {
            return this.req.getOptionalSignature().getSignatureAlgorithm().getAlgorithm();
        }
        return null;
    }

    public int getVersionNumber() {
        return this.req.getTbsRequest().getVersion().intValueExact() + 1;
    }

    public boolean hasExtensions() {
        return this.extensions != null;
    }

    public boolean isSignatureValid(ContentVerifierProvider contentVerifierProvider) throws OCSPException {
        if (!isSigned()) {
            throw new OCSPException(StubApp.getString2(28105));
        }
        try {
            ContentVerifier contentVerifier = contentVerifierProvider.get(this.req.getOptionalSignature().getSignatureAlgorithm());
            contentVerifier.getOutputStream().write(this.req.getTbsRequest().getEncoded(StubApp.getString2("26791")));
            return contentVerifier.verify(getSignature());
        } catch (Exception e10) {
            throw new OCSPException(a.i(StubApp.getString2(28104), e10), e10);
        }
    }

    public boolean isSigned() {
        return this.req.getOptionalSignature() != null;
    }

    public OCSPReq(OCSPRequest oCSPRequest) {
        this.req = oCSPRequest;
        this.extensions = oCSPRequest.getTbsRequest().getRequestExtensions();
    }

    public OCSPReq(byte[] bArr) throws IOException {
        this(new ASN1InputStream(bArr));
    }
}
