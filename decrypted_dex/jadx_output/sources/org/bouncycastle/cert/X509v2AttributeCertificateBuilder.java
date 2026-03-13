package org.bouncycastle.cert;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Date;
import java.util.Enumeration;
import java.util.Locale;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.x509.AttCertIssuer;
import org.bouncycastle.asn1.x509.Attribute;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.ExtensionsGenerator;
import org.bouncycastle.asn1.x509.V2AttributeCertificateInfoGenerator;
import org.bouncycastle.operator.ContentSigner;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class X509v2AttributeCertificateBuilder {
    private V2AttributeCertificateInfoGenerator acInfoGen;
    private ExtensionsGenerator extGenerator;

    public X509v2AttributeCertificateBuilder(AttributeCertificateHolder attributeCertificateHolder, AttributeCertificateIssuer attributeCertificateIssuer, BigInteger bigInteger, Date date, Date date2) {
        this.acInfoGen = new V2AttributeCertificateInfoGenerator();
        this.extGenerator = new ExtensionsGenerator();
        this.acInfoGen.setHolder(attributeCertificateHolder.holder);
        this.acInfoGen.setIssuer(AttCertIssuer.getInstance(attributeCertificateIssuer.form));
        this.acInfoGen.setSerialNumber(new ASN1Integer(bigInteger));
        this.acInfoGen.setStartDate(new ASN1GeneralizedTime(date));
        this.acInfoGen.setEndDate(new ASN1GeneralizedTime(date2));
    }

    private Extension doGetExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return this.extGenerator.generate().getExtension(aSN1ObjectIdentifier);
    }

    public X509v2AttributeCertificateBuilder addAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.acInfoGen.addAttribute(new Attribute(aSN1ObjectIdentifier, new DERSet(aSN1Encodable)));
        return this;
    }

    public X509v2AttributeCertificateBuilder addExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z2, ASN1Encodable aSN1Encodable) throws CertIOException {
        CertUtils.addExtension(this.extGenerator, aSN1ObjectIdentifier, z2, aSN1Encodable);
        return this;
    }

    public X509AttributeCertificateHolder build(ContentSigner contentSigner) {
        this.acInfoGen.setSignature(contentSigner.getAlgorithmIdentifier());
        if (!this.extGenerator.isEmpty()) {
            this.acInfoGen.setExtensions(this.extGenerator.generate());
        }
        return CertUtils.generateFullAttrCert(contentSigner, this.acInfoGen.generateAttributeCertificateInfo());
    }

    public Extension getExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return doGetExtension(aSN1ObjectIdentifier);
    }

    public boolean hasExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return doGetExtension(aSN1ObjectIdentifier) != null;
    }

    public X509v2AttributeCertificateBuilder removeExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.extGenerator = CertUtils.doRemoveExtension(this.extGenerator, aSN1ObjectIdentifier);
        return this;
    }

    public X509v2AttributeCertificateBuilder replaceExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z2, ASN1Encodable aSN1Encodable) throws CertIOException {
        try {
            this.extGenerator = CertUtils.doReplaceExtension(this.extGenerator, new Extension(aSN1ObjectIdentifier, z2, aSN1Encodable.toASN1Primitive().getEncoded(StubApp.getString2("26791"))));
            return this;
        } catch (IOException e10) {
            throw new CertIOException(u.q(e10, new StringBuilder(StubApp.getString2(28004))), e10);
        }
    }

    public void setIssuerUniqueId(boolean[] zArr) {
        this.acInfoGen.setIssuerUniqueID(CertUtils.booleanToBitString(zArr));
    }

    public X509v2AttributeCertificateBuilder(AttributeCertificateHolder attributeCertificateHolder, AttributeCertificateIssuer attributeCertificateIssuer, BigInteger bigInteger, Date date, Date date2, Locale locale) {
        this.acInfoGen = new V2AttributeCertificateInfoGenerator();
        this.extGenerator = new ExtensionsGenerator();
        this.acInfoGen.setHolder(attributeCertificateHolder.holder);
        this.acInfoGen.setIssuer(AttCertIssuer.getInstance(attributeCertificateIssuer.form));
        this.acInfoGen.setSerialNumber(new ASN1Integer(bigInteger));
        this.acInfoGen.setStartDate(new ASN1GeneralizedTime(date, locale));
        this.acInfoGen.setEndDate(new ASN1GeneralizedTime(date2, locale));
    }

    public X509v2AttributeCertificateBuilder addAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable[] aSN1EncodableArr) {
        this.acInfoGen.addAttribute(new Attribute(aSN1ObjectIdentifier, new DERSet(aSN1EncodableArr)));
        return this;
    }

    public X509v2AttributeCertificateBuilder addExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z2, byte[] bArr) throws CertIOException {
        this.extGenerator.addExtension(aSN1ObjectIdentifier, z2, bArr);
        return this;
    }

    public X509v2AttributeCertificateBuilder(X509AttributeCertificateHolder x509AttributeCertificateHolder) {
        V2AttributeCertificateInfoGenerator v2AttributeCertificateInfoGenerator = new V2AttributeCertificateInfoGenerator();
        this.acInfoGen = v2AttributeCertificateInfoGenerator;
        v2AttributeCertificateInfoGenerator.setSerialNumber(new ASN1Integer(x509AttributeCertificateHolder.getSerialNumber()));
        this.acInfoGen.setIssuer(AttCertIssuer.getInstance(x509AttributeCertificateHolder.getIssuer().form));
        this.acInfoGen.setStartDate(new ASN1GeneralizedTime(x509AttributeCertificateHolder.getNotBefore()));
        this.acInfoGen.setEndDate(new ASN1GeneralizedTime(x509AttributeCertificateHolder.getNotAfter()));
        this.acInfoGen.setHolder(x509AttributeCertificateHolder.getHolder().holder);
        boolean[] issuerUniqueID = x509AttributeCertificateHolder.getIssuerUniqueID();
        if (issuerUniqueID != null) {
            this.acInfoGen.setIssuerUniqueID(CertUtils.booleanToBitString(issuerUniqueID));
        }
        Attribute[] attributes = x509AttributeCertificateHolder.getAttributes();
        for (int i3 = 0; i3 != attributes.length; i3++) {
            this.acInfoGen.addAttribute(attributes[i3]);
        }
        this.extGenerator = new ExtensionsGenerator();
        Extensions extensions = x509AttributeCertificateHolder.getExtensions();
        Enumeration oids = extensions.oids();
        while (oids.hasMoreElements()) {
            this.extGenerator.addExtension(extensions.getExtension((ASN1ObjectIdentifier) oids.nextElement()));
        }
    }

    public X509v2AttributeCertificateBuilder addExtension(Extension extension) throws CertIOException {
        this.extGenerator.addExtension(extension);
        return this;
    }

    public X509v2AttributeCertificateBuilder replaceExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z2, byte[] bArr) throws CertIOException {
        this.extGenerator = CertUtils.doReplaceExtension(this.extGenerator, new Extension(aSN1ObjectIdentifier, z2, bArr));
        return this;
    }

    public X509v2AttributeCertificateBuilder replaceExtension(Extension extension) throws CertIOException {
        this.extGenerator = CertUtils.doReplaceExtension(this.extGenerator, extension);
        return this;
    }
}
