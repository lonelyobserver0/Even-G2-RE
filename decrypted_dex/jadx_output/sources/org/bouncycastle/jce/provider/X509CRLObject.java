package org.bouncycastle.jce.provider;

import E1.a;
import com.stub.StubApp;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CRLException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.CertificateList;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.IssuingDistributionPoint;
import org.bouncycastle.asn1.x509.TBSCertList;
import org.bouncycastle.jce.X509Principal;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class X509CRLObject extends X509CRL {

    /* renamed from: c, reason: collision with root package name */
    private CertificateList f19157c;
    private int hashCodeValue;
    private boolean isHashCodeSet = false;
    private boolean isIndirect;
    private String sigAlgName;
    private byte[] sigAlgParams;

    public X509CRLObject(CertificateList certificateList) throws CRLException {
        this.f19157c = certificateList;
        try {
            this.sigAlgName = X509SignatureUtil.getSignatureName(certificateList.getSignatureAlgorithm());
            if (certificateList.getSignatureAlgorithm().getParameters() != null) {
                this.sigAlgParams = certificateList.getSignatureAlgorithm().getParameters().toASN1Primitive().getEncoded(StubApp.getString2("26791"));
            } else {
                this.sigAlgParams = null;
            }
            this.isIndirect = isIndirectCRL(this);
        } catch (Exception e10) {
            throw new CRLException(a.i(StubApp.getString2(30913), e10));
        }
    }

    private void doVerify(PublicKey publicKey, Signature signature) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        if (!this.f19157c.getSignatureAlgorithm().equals(this.f19157c.getTBSCertList().getSignature())) {
            throw new CRLException(StubApp.getString2(30899));
        }
        signature.initVerify(publicKey);
        signature.update(getTBSCertList());
        if (!signature.verify(getSignature())) {
            throw new SignatureException(StubApp.getString2(30896));
        }
    }

    private Set getExtensionOIDs(boolean z2) {
        Extensions extensions;
        if (getVersion() != 2 || (extensions = this.f19157c.getTBSCertList().getExtensions()) == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Enumeration oids = extensions.oids();
        while (oids.hasMoreElements()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) oids.nextElement();
            if (z2 == extensions.getExtension(aSN1ObjectIdentifier).isCritical()) {
                hashSet.add(aSN1ObjectIdentifier.getId());
            }
        }
        return hashSet;
    }

    public static boolean isIndirectCRL(X509CRL x509crl) throws CRLException {
        try {
            byte[] extensionValue = x509crl.getExtensionValue(Extension.issuingDistributionPoint.getId());
            if (extensionValue != null) {
                return IssuingDistributionPoint.getInstance(ASN1OctetString.getInstance(extensionValue).getOctets()).isIndirectCRL();
            }
            return false;
        } catch (Exception e10) {
            throw new ExtCRLException(StubApp.getString2(30914), e10);
        }
    }

    private Set loadCRLEntries() {
        Extension extension;
        HashSet hashSet = new HashSet();
        Enumeration revokedCertificateEnumeration = this.f19157c.getRevokedCertificateEnumeration();
        X500Name x500Name = null;
        while (revokedCertificateEnumeration.hasMoreElements()) {
            TBSCertList.CRLEntry cRLEntry = (TBSCertList.CRLEntry) revokedCertificateEnumeration.nextElement();
            hashSet.add(new X509CRLEntryObject(cRLEntry, this.isIndirect, x500Name));
            if (this.isIndirect && cRLEntry.hasExtensions() && (extension = cRLEntry.getExtensions().getExtension(Extension.certificateIssuer)) != null) {
                x500Name = X500Name.getInstance(GeneralNames.getInstance(extension.getParsedValue()).getNames()[0].getName());
            }
        }
        return hashSet;
    }

    @Override // java.security.cert.X509CRL
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X509CRL)) {
            return false;
        }
        if (!(obj instanceof X509CRLObject)) {
            return super.equals(obj);
        }
        X509CRLObject x509CRLObject = (X509CRLObject) obj;
        if (this.isHashCodeSet && x509CRLObject.isHashCodeSet && x509CRLObject.hashCodeValue != this.hashCodeValue) {
            return false;
        }
        return this.f19157c.equals(x509CRLObject.f19157c);
    }

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        return getExtensionOIDs(true);
    }

    @Override // java.security.cert.X509CRL
    public byte[] getEncoded() throws CRLException {
        try {
            return this.f19157c.getEncoded(StubApp.getString2("26791"));
        } catch (IOException e10) {
            throw new CRLException(e10.toString());
        }
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        Extension extension;
        Extensions extensions = this.f19157c.getTBSCertList().getExtensions();
        if (extensions == null || (extension = extensions.getExtension(new ASN1ObjectIdentifier(str))) == null) {
            return null;
        }
        try {
            return extension.getExtnValue().getEncoded();
        } catch (Exception e10) {
            throw new IllegalStateException(org.bouncycastle.asn1.a.b(e10, new StringBuilder(StubApp.getString2(30900))));
        }
    }

    @Override // java.security.cert.X509CRL
    public Principal getIssuerDN() {
        return new X509Principal(X500Name.getInstance(this.f19157c.getIssuer().toASN1Primitive()));
    }

    @Override // java.security.cert.X509CRL
    public X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.f19157c.getIssuer().getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException(StubApp.getString2(30901));
        }
    }

    @Override // java.security.cert.X509CRL
    public Date getNextUpdate() {
        if (this.f19157c.getNextUpdate() != null) {
            return this.f19157c.getNextUpdate().getDate();
        }
        return null;
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        return getExtensionOIDs(false);
    }

    @Override // java.security.cert.X509CRL
    public X509CRLEntry getRevokedCertificate(BigInteger bigInteger) {
        Extension extension;
        Enumeration revokedCertificateEnumeration = this.f19157c.getRevokedCertificateEnumeration();
        X500Name x500Name = null;
        while (revokedCertificateEnumeration.hasMoreElements()) {
            TBSCertList.CRLEntry cRLEntry = (TBSCertList.CRLEntry) revokedCertificateEnumeration.nextElement();
            if (cRLEntry.getUserCertificate().hasValue(bigInteger)) {
                return new X509CRLEntryObject(cRLEntry, this.isIndirect, x500Name);
            }
            if (this.isIndirect && cRLEntry.hasExtensions() && (extension = cRLEntry.getExtensions().getExtension(Extension.certificateIssuer)) != null) {
                x500Name = X500Name.getInstance(GeneralNames.getInstance(extension.getParsedValue()).getNames()[0].getName());
            }
        }
        return null;
    }

    @Override // java.security.cert.X509CRL
    public Set getRevokedCertificates() {
        Set loadCRLEntries = loadCRLEntries();
        if (loadCRLEntries.isEmpty()) {
            return null;
        }
        return Collections.unmodifiableSet(loadCRLEntries);
    }

    @Override // java.security.cert.X509CRL
    public String getSigAlgName() {
        return this.sigAlgName;
    }

    @Override // java.security.cert.X509CRL
    public String getSigAlgOID() {
        return this.f19157c.getSignatureAlgorithm().getAlgorithm().getId();
    }

    @Override // java.security.cert.X509CRL
    public byte[] getSigAlgParams() {
        byte[] bArr = this.sigAlgParams;
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    @Override // java.security.cert.X509CRL
    public byte[] getSignature() {
        return this.f19157c.getSignature().getOctets();
    }

    @Override // java.security.cert.X509CRL
    public byte[] getTBSCertList() throws CRLException {
        try {
            return this.f19157c.getTBSCertList().getEncoded(StubApp.getString2("26791"));
        } catch (IOException e10) {
            throw new CRLException(e10.toString());
        }
    }

    @Override // java.security.cert.X509CRL
    public Date getThisUpdate() {
        return this.f19157c.getThisUpdate().getDate();
    }

    @Override // java.security.cert.X509CRL
    public int getVersion() {
        return this.f19157c.getVersionNumber();
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        if (criticalExtensionOIDs == null) {
            return false;
        }
        criticalExtensionOIDs.remove(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT);
        criticalExtensionOIDs.remove(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR);
        return !criticalExtensionOIDs.isEmpty();
    }

    @Override // java.security.cert.X509CRL
    public int hashCode() {
        if (!this.isHashCodeSet) {
            this.isHashCodeSet = true;
            this.hashCodeValue = super.hashCode();
        }
        return this.hashCodeValue;
    }

    @Override // java.security.cert.CRL
    public boolean isRevoked(Certificate certificate) {
        X500Name issuer;
        Extension extension;
        if (!certificate.getType().equals(StubApp.getString2(19963))) {
            throw new RuntimeException(StubApp.getString2(30903));
        }
        Enumeration revokedCertificateEnumeration = this.f19157c.getRevokedCertificateEnumeration();
        X500Name issuer2 = this.f19157c.getIssuer();
        if (revokedCertificateEnumeration != null) {
            X509Certificate x509Certificate = (X509Certificate) certificate;
            BigInteger serialNumber = x509Certificate.getSerialNumber();
            while (revokedCertificateEnumeration.hasMoreElements()) {
                TBSCertList.CRLEntry cRLEntry = TBSCertList.CRLEntry.getInstance(revokedCertificateEnumeration.nextElement());
                if (this.isIndirect && cRLEntry.hasExtensions() && (extension = cRLEntry.getExtensions().getExtension(Extension.certificateIssuer)) != null) {
                    issuer2 = X500Name.getInstance(GeneralNames.getInstance(extension.getParsedValue()).getNames()[0].getName());
                }
                if (cRLEntry.getUserCertificate().hasValue(serialNumber)) {
                    if (certificate instanceof X509Certificate) {
                        issuer = X500Name.getInstance(x509Certificate.getIssuerX500Principal().getEncoded());
                    } else {
                        try {
                            issuer = org.bouncycastle.asn1.x509.Certificate.getInstance(certificate.getEncoded()).getIssuer();
                        } catch (CertificateEncodingException unused) {
                            throw new RuntimeException(StubApp.getString2(32856));
                        }
                    }
                    return issuer2.equals(issuer);
                }
            }
        }
        return false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:49:0x01ba
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // java.security.cert.CRL
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.X509CRLObject.toString():java.lang.String");
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        Signature signature;
        try {
            signature = Signature.getInstance(getSigAlgName(), StubApp.getString2("21668"));
        } catch (Exception unused) {
            signature = Signature.getInstance(getSigAlgName());
        }
        doVerify(publicKey, signature);
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey, String str) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        doVerify(publicKey, str != null ? Signature.getInstance(getSigAlgName(), str) : Signature.getInstance(getSigAlgName()));
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey, Provider provider) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        doVerify(publicKey, provider != null ? Signature.getInstance(getSigAlgName(), provider) : Signature.getInstance(getSigAlgName()));
    }
}
