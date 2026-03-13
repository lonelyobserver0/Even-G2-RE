package org.bouncycastle.cert.ocsp;

import E1.a;
import Xa.h;
import com.stub.StubApp;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1Exception;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ocsp.BasicOCSPResponse;
import org.bouncycastle.asn1.ocsp.OCSPObjectIdentifiers;
import org.bouncycastle.asn1.ocsp.OCSPResponse;
import org.bouncycastle.asn1.ocsp.ResponseBytes;
import org.bouncycastle.cert.CertIOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class OCSPResp {
    public static final int INTERNAL_ERROR = 2;
    public static final int MALFORMED_REQUEST = 1;
    public static final int SIG_REQUIRED = 5;
    public static final int SUCCESSFUL = 0;
    public static final int TRY_LATER = 3;
    public static final int UNAUTHORIZED = 6;
    private OCSPResponse resp;

    public OCSPResp(InputStream inputStream) throws IOException {
        this(new ASN1InputStream(inputStream));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OCSPResp) {
            return this.resp.equals(((OCSPResp) obj).resp);
        }
        return false;
    }

    public byte[] getEncoded() throws IOException {
        return this.resp.getEncoded();
    }

    public Object getResponseObject() throws OCSPException {
        ResponseBytes responseBytes = this.resp.getResponseBytes();
        if (responseBytes == null) {
            return null;
        }
        if (!responseBytes.getResponseType().equals((ASN1Primitive) OCSPObjectIdentifiers.id_pkix_ocsp_basic)) {
            return responseBytes.getResponse();
        }
        try {
            return new BasicOCSPResp(BasicOCSPResponse.getInstance(ASN1Primitive.fromByteArray(responseBytes.getResponse().getOctets())));
        } catch (Exception e10) {
            throw new OCSPException(a.i(StubApp.getString2(28110), e10), e10);
        }
    }

    public int getStatus() {
        return this.resp.getResponseStatus().getIntValue();
    }

    public int hashCode() {
        return this.resp.hashCode();
    }

    public OCSPResponse toASN1Structure() {
        return this.resp;
    }

    private OCSPResp(ASN1InputStream aSN1InputStream) throws IOException {
        String string2 = StubApp.getString2(28108);
        try {
            OCSPResponse oCSPResponse = OCSPResponse.getInstance(aSN1InputStream.readObject());
            this.resp = oCSPResponse;
            if (oCSPResponse == null) {
                throw new CertIOException(StubApp.getString2(28109));
            }
        } catch (ClassCastException e10) {
            throw new CertIOException(string2 + e10.getMessage(), e10);
        } catch (IllegalArgumentException e11) {
            throw new CertIOException(h.l(e11, new StringBuilder(string2)), e11);
        } catch (ASN1Exception e12) {
            throw new CertIOException(string2 + e12.getMessage(), e12);
        }
    }

    public OCSPResp(OCSPResponse oCSPResponse) {
        this.resp = oCSPResponse;
    }

    public OCSPResp(byte[] bArr) throws IOException {
        this(new ByteArrayInputStream(bArr));
    }
}
