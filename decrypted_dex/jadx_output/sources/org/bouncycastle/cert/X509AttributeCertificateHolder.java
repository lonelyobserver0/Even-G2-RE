package org.bouncycastle.cert;

import Xa.h;
import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.AttCertValidityPeriod;
import org.bouncycastle.asn1.x509.Attribute;
import org.bouncycastle.asn1.x509.AttributeCertificate;
import org.bouncycastle.asn1.x509.AttributeCertificateInfo;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.operator.ContentVerifier;
import org.bouncycastle.operator.ContentVerifierProvider;
import org.bouncycastle.util.Encodable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class X509AttributeCertificateHolder implements Encodable, Serializable {
    private static Attribute[] EMPTY_ARRAY = new Attribute[0];
    private static final long serialVersionUID = 20170722001L;
    private transient AttributeCertificate attrCert;
    private transient Extensions extensions;

    public X509AttributeCertificateHolder(AttributeCertificate attributeCertificate) {
        init(attributeCertificate);
    }

    private void init(AttributeCertificate attributeCertificate) {
        this.attrCert = attributeCertificate;
        this.extensions = attributeCertificate.getAcinfo().getExtensions();
    }

    private static AttributeCertificate parseBytes(byte[] bArr) throws IOException {
        String string2 = StubApp.getString2(28012);
        try {
            return AttributeCertificate.getInstance(CertUtils.parseNonEmptyASN1(bArr));
        } catch (ClassCastException e10) {
            throw new CertIOException(string2 + e10.getMessage(), e10);
        } catch (IllegalArgumentException e11) {
            throw new CertIOException(h.l(e11, new StringBuilder(string2)), e11);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        init(AttributeCertificate.getInstance(objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof X509AttributeCertificateHolder) {
            return this.attrCert.equals(((X509AttributeCertificateHolder) obj).attrCert);
        }
        return false;
    }

    public Attribute[] getAttributes() {
        ASN1Sequence attributes = this.attrCert.getAcinfo().getAttributes();
        Attribute[] attributeArr = new Attribute[attributes.size()];
        for (int i3 = 0; i3 != attributes.size(); i3++) {
            attributeArr[i3] = Attribute.getInstance(attributes.getObjectAt(i3));
        }
        return attributeArr;
    }

    public Set getCriticalExtensionOIDs() {
        return CertUtils.getCriticalExtensionOIDs(this.extensions);
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws IOException {
        return this.attrCert.getEncoded();
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

    public AttributeCertificateHolder getHolder() {
        return new AttributeCertificateHolder((ASN1Sequence) this.attrCert.getAcinfo().getHolder().toASN1Primitive());
    }

    public AttributeCertificateIssuer getIssuer() {
        return new AttributeCertificateIssuer(this.attrCert.getAcinfo().getIssuer());
    }

    public boolean[] getIssuerUniqueID() {
        return CertUtils.bitStringToBoolean(this.attrCert.getAcinfo().getIssuerUniqueID());
    }

    public Set getNonCriticalExtensionOIDs() {
        return CertUtils.getNonCriticalExtensionOIDs(this.extensions);
    }

    public Date getNotAfter() {
        return CertUtils.recoverDate(this.attrCert.getAcinfo().getAttrCertValidityPeriod().getNotAfterTime());
    }

    public Date getNotBefore() {
        return CertUtils.recoverDate(this.attrCert.getAcinfo().getAttrCertValidityPeriod().getNotBeforeTime());
    }

    public BigInteger getSerialNumber() {
        return this.attrCert.getAcinfo().getSerialNumber().getValue();
    }

    public byte[] getSignature() {
        return this.attrCert.getSignatureValue().getOctets();
    }

    public AlgorithmIdentifier getSignatureAlgorithm() {
        return this.attrCert.getSignatureAlgorithm();
    }

    public int getVersion() {
        return this.attrCert.getAcinfo().getVersion().intValueExact() + 1;
    }

    public boolean hasExtensions() {
        return this.extensions != null;
    }

    public int hashCode() {
        return this.attrCert.hashCode();
    }

    public boolean isSignatureValid(ContentVerifierProvider contentVerifierProvider) throws CertException {
        AttributeCertificateInfo acinfo = this.attrCert.getAcinfo();
        if (!CertUtils.isAlgIdEqual(acinfo.getSignature(), this.attrCert.getSignatureAlgorithm())) {
            throw new CertException(StubApp.getString2(28014));
        }
        try {
            ContentVerifier contentVerifier = contentVerifierProvider.get(acinfo.getSignature());
            OutputStream outputStream = contentVerifier.getOutputStream();
            acinfo.encodeTo(outputStream, StubApp.getString2("26791"));
            outputStream.close();
            return contentVerifier.verify(getSignature());
        } catch (Exception e10) {
            throw new CertException(u.r(e10, new StringBuilder(StubApp.getString2(28013))), e10);
        }
    }

    public boolean isValidOn(Date date) {
        AttCertValidityPeriod attrCertValidityPeriod = this.attrCert.getAcinfo().getAttrCertValidityPeriod();
        return (date.before(CertUtils.recoverDate(attrCertValidityPeriod.getNotBeforeTime())) || date.after(CertUtils.recoverDate(attrCertValidityPeriod.getNotAfterTime()))) ? false : true;
    }

    public AttributeCertificate toASN1Structure() {
        return this.attrCert;
    }

    public X509AttributeCertificateHolder(byte[] bArr) throws IOException {
        this(parseBytes(bArr));
    }

    public Attribute[] getAttributes(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        ASN1Sequence attributes = this.attrCert.getAcinfo().getAttributes();
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 != attributes.size(); i3++) {
            Attribute attribute = Attribute.getInstance(attributes.getObjectAt(i3));
            if (attribute.getAttrType().equals((ASN1Primitive) aSN1ObjectIdentifier)) {
                arrayList.add(attribute);
            }
        }
        return arrayList.size() == 0 ? EMPTY_ARRAY : (Attribute[]) arrayList.toArray(new Attribute[arrayList.size()]);
    }
}
