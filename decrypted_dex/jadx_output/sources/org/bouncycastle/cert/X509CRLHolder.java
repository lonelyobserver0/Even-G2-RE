package org.bouncycastle.cert;

import Xa.h;
import com.stub.StubApp;
import i2.u;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.CertificateList;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.IssuingDistributionPoint;
import org.bouncycastle.asn1.x509.TBSCertList;
import org.bouncycastle.asn1.x509.Time;
import org.bouncycastle.operator.ContentVerifier;
import org.bouncycastle.operator.ContentVerifierProvider;
import org.bouncycastle.util.Encodable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class X509CRLHolder implements Encodable, Serializable {
    private static final long serialVersionUID = 20170722001L;
    private transient Extensions extensions;
    private transient boolean isIndirect;
    private transient GeneralNames issuerName;
    private transient CertificateList x509CRL;

    public X509CRLHolder(InputStream inputStream) throws IOException {
        this(parseStream(inputStream));
    }

    private void init(CertificateList certificateList) {
        this.x509CRL = certificateList;
        Extensions extensions = certificateList.getTBSCertList().getExtensions();
        this.extensions = extensions;
        this.isIndirect = isIndirectCRL(extensions);
        this.issuerName = new GeneralNames(new GeneralName(certificateList.getIssuer()));
    }

    private static boolean isIndirectCRL(Extensions extensions) {
        Extension extension;
        return (extensions == null || (extension = extensions.getExtension(Extension.issuingDistributionPoint)) == null || !IssuingDistributionPoint.getInstance(extension.getParsedValue()).isIndirectCRL()) ? false : true;
    }

    private static CertificateList parseStream(InputStream inputStream) throws IOException {
        String string2 = StubApp.getString2(28012);
        try {
            ASN1Primitive readObject = new ASN1InputStream(inputStream, true).readObject();
            if (readObject != null) {
                return CertificateList.getInstance(readObject);
            }
            throw new IOException(StubApp.getString2("28010"));
        } catch (ClassCastException e10) {
            throw new CertIOException(string2 + e10.getMessage(), e10);
        } catch (IllegalArgumentException e11) {
            throw new CertIOException(h.l(e11, new StringBuilder(string2)), e11);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        init(CertificateList.getInstance(objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof X509CRLHolder) {
            return this.x509CRL.equals(((X509CRLHolder) obj).x509CRL);
        }
        return false;
    }

    public Set getCriticalExtensionOIDs() {
        return CertUtils.getCriticalExtensionOIDs(this.extensions);
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws IOException {
        return this.x509CRL.getEncoded();
    }

    public Extension getExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        Extensions extensions = this.extensions;
        if (extensions != null) {
            return extensions.getExtension(aSN1ObjectIdentifier);
        }
        return null;
    }

    public List getExtensionOIDs() {
        return CertUtils.getExtensionOIDs(this.extensions);
    }

    public Extensions getExtensions() {
        return this.extensions;
    }

    public X500Name getIssuer() {
        return X500Name.getInstance(this.x509CRL.getIssuer());
    }

    public Date getNextUpdate() {
        Time nextUpdate = this.x509CRL.getNextUpdate();
        if (nextUpdate != null) {
            return nextUpdate.getDate();
        }
        return null;
    }

    public Set getNonCriticalExtensionOIDs() {
        return CertUtils.getNonCriticalExtensionOIDs(this.extensions);
    }

    public X509CRLEntryHolder getRevokedCertificate(BigInteger bigInteger) {
        Extension extension;
        GeneralNames generalNames = this.issuerName;
        Enumeration revokedCertificateEnumeration = this.x509CRL.getRevokedCertificateEnumeration();
        while (revokedCertificateEnumeration.hasMoreElements()) {
            TBSCertList.CRLEntry cRLEntry = (TBSCertList.CRLEntry) revokedCertificateEnumeration.nextElement();
            if (cRLEntry.getUserCertificate().hasValue(bigInteger)) {
                return new X509CRLEntryHolder(cRLEntry, this.isIndirect, generalNames);
            }
            if (this.isIndirect && cRLEntry.hasExtensions() && (extension = cRLEntry.getExtensions().getExtension(Extension.certificateIssuer)) != null) {
                generalNames = GeneralNames.getInstance(extension.getParsedValue());
            }
        }
        return null;
    }

    public Collection getRevokedCertificates() {
        ArrayList arrayList = new ArrayList(this.x509CRL.getRevokedCertificates().length);
        GeneralNames generalNames = this.issuerName;
        Enumeration revokedCertificateEnumeration = this.x509CRL.getRevokedCertificateEnumeration();
        while (revokedCertificateEnumeration.hasMoreElements()) {
            X509CRLEntryHolder x509CRLEntryHolder = new X509CRLEntryHolder((TBSCertList.CRLEntry) revokedCertificateEnumeration.nextElement(), this.isIndirect, generalNames);
            arrayList.add(x509CRLEntryHolder);
            generalNames = x509CRLEntryHolder.getCertificateIssuer();
        }
        return arrayList;
    }

    public Date getThisUpdate() {
        return this.x509CRL.getThisUpdate().getDate();
    }

    public boolean hasExtensions() {
        return this.extensions != null;
    }

    public int hashCode() {
        return this.x509CRL.hashCode();
    }

    public boolean isSignatureValid(ContentVerifierProvider contentVerifierProvider) throws CertException {
        TBSCertList tBSCertList = this.x509CRL.getTBSCertList();
        if (!CertUtils.isAlgIdEqual(tBSCertList.getSignature(), this.x509CRL.getSignatureAlgorithm())) {
            throw new CertException(StubApp.getString2(28014));
        }
        try {
            ContentVerifier contentVerifier = contentVerifierProvider.get(tBSCertList.getSignature());
            OutputStream outputStream = contentVerifier.getOutputStream();
            tBSCertList.encodeTo(outputStream, StubApp.getString2("26791"));
            outputStream.close();
            return contentVerifier.verify(this.x509CRL.getSignature().getOctets());
        } catch (Exception e10) {
            throw new CertException(u.r(e10, new StringBuilder(StubApp.getString2(28013))), e10);
        }
    }

    public CertificateList toASN1Structure() {
        return this.x509CRL;
    }

    public X509CRLHolder(CertificateList certificateList) {
        init(certificateList);
    }

    public X509CRLHolder(byte[] bArr) throws IOException {
        this(parseStream(new ByteArrayInputStream(bArr)));
    }
}
