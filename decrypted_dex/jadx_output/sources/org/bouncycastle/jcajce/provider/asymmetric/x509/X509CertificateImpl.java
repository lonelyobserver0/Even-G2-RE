package org.bouncycastle.jcajce.provider.asymmetric.x509;

import com.stub.StubApp;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.IntCompanionObject;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.asn1.misc.NetscapeCertType;
import org.bouncycastle.asn1.misc.NetscapeRevocationURL;
import org.bouncycastle.asn1.misc.VerisignCzagExtension;
import org.bouncycastle.asn1.util.ASN1Dump;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.style.RFC4519Style;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.KeyUsage;
import org.bouncycastle.asn1.x509.TBSCertificate;
import org.bouncycastle.jcajce.CompositePublicKey;
import org.bouncycastle.jcajce.interfaces.BCX509Certificate;
import org.bouncycastle.jcajce.io.OutputStreamFactory;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.X509Principal;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Properties;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
abstract class X509CertificateImpl extends X509Certificate implements BCX509Certificate {
    protected BasicConstraints basicConstraints;
    protected JcaJceHelper bcHelper;

    /* renamed from: c, reason: collision with root package name */
    protected Certificate f19142c;
    protected boolean[] keyUsage;
    protected String sigAlgName;
    protected byte[] sigAlgParams;

    public X509CertificateImpl(JcaJceHelper jcaJceHelper, Certificate certificate, BasicConstraints basicConstraints, boolean[] zArr, String str, byte[] bArr) {
        this.bcHelper = jcaJceHelper;
        this.f19142c = certificate;
        this.basicConstraints = basicConstraints;
        this.keyUsage = zArr;
        this.sigAlgName = str;
        this.sigAlgParams = bArr;
    }

    private void checkSignature(PublicKey publicKey, Signature signature, ASN1Encodable aSN1Encodable, byte[] bArr) throws CertificateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        if (!isAlgIdEqual(this.f19142c.getSignatureAlgorithm(), this.f19142c.getTBSCertificate().getSignature())) {
            throw new CertificateException(StubApp.getString2(30916));
        }
        X509SignatureUtil.setSignatureParameters(signature, aSN1Encodable);
        signature.initVerify(publicKey);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(OutputStreamFactory.createStream(signature), 512);
            this.f19142c.getTBSCertificate().encodeTo(bufferedOutputStream, StubApp.getString2("26791"));
            bufferedOutputStream.close();
            if (!signature.verify(bArr)) {
                throw new SignatureException(StubApp.getString2(30915));
            }
        } catch (IOException e10) {
            throw new CertificateEncodingException(e10.toString());
        }
    }

    private void doVerify(PublicKey publicKey, SignatureCreator signatureCreator) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, SignatureException, NoSuchProviderException {
        boolean z2 = publicKey instanceof CompositePublicKey;
        String string2 = StubApp.getString2(30897);
        int i3 = 0;
        if (z2 && X509SignatureUtil.isCompositeAlgorithm(this.f19142c.getSignatureAlgorithm())) {
            List<PublicKey> publicKeys = ((CompositePublicKey) publicKey).getPublicKeys();
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(this.f19142c.getSignatureAlgorithm().getParameters());
            ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(DERBitString.getInstance((Object) this.f19142c.getSignature()).getBytes());
            boolean z10 = false;
            while (i3 != publicKeys.size()) {
                if (publicKeys.get(i3) != null) {
                    AlgorithmIdentifier algorithmIdentifier = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(i3));
                    try {
                        checkSignature(publicKeys.get(i3), signatureCreator.createSignature(X509SignatureUtil.getSignatureName(algorithmIdentifier)), algorithmIdentifier.getParameters(), DERBitString.getInstance((Object) aSN1Sequence2.getObjectAt(i3)).getBytes());
                        e = null;
                        z10 = true;
                    } catch (SignatureException e10) {
                        e = e10;
                    }
                    if (e != null) {
                        throw e;
                    }
                }
                i3++;
            }
            if (!z10) {
                throw new InvalidKeyException(string2);
            }
            return;
        }
        if (!X509SignatureUtil.isCompositeAlgorithm(this.f19142c.getSignatureAlgorithm())) {
            Signature createSignature = signatureCreator.createSignature(X509SignatureUtil.getSignatureName(this.f19142c.getSignatureAlgorithm()));
            if (!z2) {
                checkSignature(publicKey, createSignature, this.f19142c.getSignatureAlgorithm().getParameters(), getSignature());
                return;
            }
            List<PublicKey> publicKeys2 = ((CompositePublicKey) publicKey).getPublicKeys();
            while (i3 != publicKeys2.size()) {
                try {
                    checkSignature(publicKeys2.get(i3), createSignature, this.f19142c.getSignatureAlgorithm().getParameters(), getSignature());
                    return;
                } catch (InvalidKeyException unused) {
                    i3++;
                }
            }
            throw new InvalidKeyException(StubApp.getString2(30917));
        }
        ASN1Sequence aSN1Sequence3 = ASN1Sequence.getInstance(this.f19142c.getSignatureAlgorithm().getParameters());
        ASN1Sequence aSN1Sequence4 = ASN1Sequence.getInstance(DERBitString.getInstance((Object) this.f19142c.getSignature()).getBytes());
        boolean z11 = false;
        while (i3 != aSN1Sequence4.size()) {
            AlgorithmIdentifier algorithmIdentifier2 = AlgorithmIdentifier.getInstance(aSN1Sequence3.getObjectAt(i3));
            try {
                checkSignature(publicKey, signatureCreator.createSignature(X509SignatureUtil.getSignatureName(algorithmIdentifier2)), algorithmIdentifier2.getParameters(), DERBitString.getInstance((Object) aSN1Sequence4.getObjectAt(i3)).getBytes());
                e = null;
                z11 = true;
            } catch (InvalidKeyException | NoSuchAlgorithmException unused2) {
                e = null;
            } catch (SignatureException e11) {
                e = e11;
            }
            if (e != null) {
                throw e;
            }
            i3++;
        }
        if (!z11) {
            throw new InvalidKeyException(string2);
        }
    }

    private static Collection getAlternativeNames(Certificate certificate, String str) throws CertificateParsingException {
        Object encoded;
        byte[] extensionOctets = getExtensionOctets(certificate, str);
        if (extensionOctets == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Enumeration objects = ASN1Sequence.getInstance(extensionOctets).getObjects();
            while (objects.hasMoreElements()) {
                GeneralName generalName = GeneralName.getInstance(objects.nextElement());
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Integers.valueOf(generalName.getTagNo()));
                switch (generalName.getTagNo()) {
                    case 0:
                    case 3:
                    case 5:
                        encoded = generalName.getEncoded();
                        arrayList2.add(encoded);
                        arrayList.add(Collections.unmodifiableList(arrayList2));
                    case 1:
                    case 2:
                    case 6:
                        encoded = ((ASN1String) generalName.getName()).getString();
                        arrayList2.add(encoded);
                        arrayList.add(Collections.unmodifiableList(arrayList2));
                    case 4:
                        encoded = X500Name.getInstance(RFC4519Style.INSTANCE, generalName.getName()).toString();
                        arrayList2.add(encoded);
                        arrayList.add(Collections.unmodifiableList(arrayList2));
                    case 7:
                        try {
                            encoded = InetAddress.getByAddress(ASN1OctetString.getInstance(generalName.getName()).getOctets()).getHostAddress();
                            arrayList2.add(encoded);
                            arrayList.add(Collections.unmodifiableList(arrayList2));
                        } catch (UnknownHostException unused) {
                        }
                    case 8:
                        encoded = ASN1ObjectIdentifier.getInstance(generalName.getName()).getId();
                        arrayList2.add(encoded);
                        arrayList.add(Collections.unmodifiableList(arrayList2));
                    default:
                        throw new IOException(StubApp.getString2("27122") + generalName.getTagNo());
                }
            }
            if (arrayList.size() == 0) {
                return null;
            }
            return Collections.unmodifiableCollection(arrayList);
        } catch (Exception e10) {
            throw new CertificateParsingException(e10.getMessage());
        }
    }

    public static byte[] getExtensionOctets(Certificate certificate, String str) {
        ASN1OctetString extensionValue = getExtensionValue(certificate, str);
        if (extensionValue != null) {
            return extensionValue.getOctets();
        }
        return null;
    }

    public static ASN1OctetString getExtensionValue(Certificate certificate, String str) {
        Extension extension;
        Extensions extensions = certificate.getTBSCertificate().getExtensions();
        if (extensions == null || (extension = extensions.getExtension(new ASN1ObjectIdentifier(str))) == null) {
            return null;
        }
        return extension.getExtnValue();
    }

    private boolean isAlgIdEqual(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2) {
        if (!algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) algorithmIdentifier2.getAlgorithm())) {
            return false;
        }
        if (Properties.isOverrideSet(StubApp.getString2(28009))) {
            if (algorithmIdentifier.getParameters() == null) {
                return algorithmIdentifier2.getParameters() == null || algorithmIdentifier2.getParameters().equals(DERNull.INSTANCE);
            }
            if (algorithmIdentifier2.getParameters() == null) {
                return algorithmIdentifier.getParameters() == null || algorithmIdentifier.getParameters().equals(DERNull.INSTANCE);
            }
        }
        if (algorithmIdentifier.getParameters() != null) {
            return algorithmIdentifier.getParameters().equals(algorithmIdentifier2.getParameters());
        }
        if (algorithmIdentifier2.getParameters() != null) {
            return algorithmIdentifier2.getParameters().equals(algorithmIdentifier.getParameters());
        }
        return true;
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity() throws CertificateExpiredException, CertificateNotYetValidException {
        checkValidity(new Date());
    }

    @Override // java.security.cert.X509Certificate
    public int getBasicConstraints() {
        BasicConstraints basicConstraints = this.basicConstraints;
        if (basicConstraints == null || !basicConstraints.isCA()) {
            return -1;
        }
        return this.basicConstraints.getPathLenConstraint() == null ? IntCompanionObject.MAX_VALUE : this.basicConstraints.getPathLenConstraint().intValue();
    }

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        if (getVersion() != 3) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Extensions extensions = this.f19142c.getTBSCertificate().getExtensions();
        if (extensions == null) {
            return null;
        }
        Enumeration oids = extensions.oids();
        while (oids.hasMoreElements()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) oids.nextElement();
            if (extensions.getExtension(aSN1ObjectIdentifier).isCritical()) {
                hashSet.add(aSN1ObjectIdentifier.getId());
            }
        }
        return hashSet;
    }

    @Override // java.security.cert.X509Certificate
    public List getExtendedKeyUsage() throws CertificateParsingException {
        byte[] extensionOctets = getExtensionOctets(this.f19142c, StubApp.getString2(27768));
        if (extensionOctets == null) {
            return null;
        }
        try {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(ASN1Primitive.fromByteArray(extensionOctets));
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 != aSN1Sequence.size(); i3++) {
                arrayList.add(((ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(i3)).getId());
            }
            return Collections.unmodifiableList(arrayList);
        } catch (Exception unused) {
            throw new CertificateParsingException(StubApp.getString2(30920));
        }
    }

    @Override // java.security.cert.X509Certificate
    public Collection getIssuerAlternativeNames() throws CertificateParsingException {
        return getAlternativeNames(this.f19142c, Extension.issuerAlternativeName.getId());
    }

    @Override // java.security.cert.X509Certificate
    public Principal getIssuerDN() {
        return new X509Principal(this.f19142c.getIssuer());
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getIssuerUniqueID() {
        ASN1BitString issuerUniqueId = this.f19142c.getTBSCertificate().getIssuerUniqueId();
        if (issuerUniqueId == null) {
            return null;
        }
        byte[] bytes = issuerUniqueId.getBytes();
        int length = (bytes.length * 8) - issuerUniqueId.getPadBits();
        boolean[] zArr = new boolean[length];
        for (int i3 = 0; i3 != length; i3++) {
            zArr[i3] = (bytes[i3 / 8] & (128 >>> (i3 % 8))) != 0;
        }
        return zArr;
    }

    @Override // org.bouncycastle.jcajce.interfaces.BCX509Certificate
    public X500Name getIssuerX500Name() {
        return this.f19142c.getIssuer();
    }

    @Override // java.security.cert.X509Certificate
    public X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.f19142c.getIssuer().getEncoded(StubApp.getString2("26791")));
        } catch (IOException unused) {
            throw new IllegalStateException(StubApp.getString2(30901));
        }
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getKeyUsage() {
        return Arrays.clone(this.keyUsage);
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        if (getVersion() != 3) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Extensions extensions = this.f19142c.getTBSCertificate().getExtensions();
        if (extensions == null) {
            return null;
        }
        Enumeration oids = extensions.oids();
        while (oids.hasMoreElements()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) oids.nextElement();
            if (!extensions.getExtension(aSN1ObjectIdentifier).isCritical()) {
                hashSet.add(aSN1ObjectIdentifier.getId());
            }
        }
        return hashSet;
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotAfter() {
        return this.f19142c.getEndDate().getDate();
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotBefore() {
        return this.f19142c.getStartDate().getDate();
    }

    @Override // java.security.cert.Certificate
    public PublicKey getPublicKey() {
        try {
            return BouncyCastleProvider.getPublicKey(this.f19142c.getSubjectPublicKeyInfo());
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509Certificate
    public BigInteger getSerialNumber() {
        return this.f19142c.getSerialNumber().getValue();
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgName() {
        return this.sigAlgName;
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgOID() {
        return this.f19142c.getSignatureAlgorithm().getAlgorithm().getId();
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSigAlgParams() {
        return Arrays.clone(this.sigAlgParams);
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSignature() {
        return this.f19142c.getSignature().getOctets();
    }

    @Override // java.security.cert.X509Certificate
    public Collection getSubjectAlternativeNames() throws CertificateParsingException {
        return getAlternativeNames(this.f19142c, Extension.subjectAlternativeName.getId());
    }

    @Override // java.security.cert.X509Certificate
    public Principal getSubjectDN() {
        return new X509Principal(this.f19142c.getSubject());
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getSubjectUniqueID() {
        ASN1BitString subjectUniqueId = this.f19142c.getTBSCertificate().getSubjectUniqueId();
        if (subjectUniqueId == null) {
            return null;
        }
        byte[] bytes = subjectUniqueId.getBytes();
        int length = (bytes.length * 8) - subjectUniqueId.getPadBits();
        boolean[] zArr = new boolean[length];
        for (int i3 = 0; i3 != length; i3++) {
            zArr[i3] = (bytes[i3 / 8] & (128 >>> (i3 % 8))) != 0;
        }
        return zArr;
    }

    @Override // org.bouncycastle.jcajce.interfaces.BCX509Certificate
    public X500Name getSubjectX500Name() {
        return this.f19142c.getSubject();
    }

    @Override // java.security.cert.X509Certificate
    public X500Principal getSubjectX500Principal() {
        try {
            return new X500Principal(this.f19142c.getSubject().getEncoded(StubApp.getString2("26791")));
        } catch (IOException unused) {
            throw new IllegalStateException(StubApp.getString2(30921));
        }
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getTBSCertificate() throws CertificateEncodingException {
        try {
            return this.f19142c.getTBSCertificate().getEncoded(StubApp.getString2("26791"));
        } catch (IOException e10) {
            throw new CertificateEncodingException(e10.toString());
        }
    }

    @Override // org.bouncycastle.jcajce.interfaces.BCX509Certificate
    public TBSCertificate getTBSCertificateNative() {
        return this.f19142c.getTBSCertificate();
    }

    @Override // java.security.cert.X509Certificate
    public int getVersion() {
        return this.f19142c.getVersionNumber();
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        Extensions extensions;
        if (getVersion() != 3 || (extensions = this.f19142c.getTBSCertificate().getExtensions()) == null) {
            return false;
        }
        Enumeration oids = extensions.oids();
        while (oids.hasMoreElements()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) oids.nextElement();
            if (!aSN1ObjectIdentifier.equals((ASN1Primitive) Extension.keyUsage) && !aSN1ObjectIdentifier.equals((ASN1Primitive) Extension.certificatePolicies) && !aSN1ObjectIdentifier.equals((ASN1Primitive) Extension.policyMappings) && !aSN1ObjectIdentifier.equals((ASN1Primitive) Extension.inhibitAnyPolicy) && !aSN1ObjectIdentifier.equals((ASN1Primitive) Extension.cRLDistributionPoints) && !aSN1ObjectIdentifier.equals((ASN1Primitive) Extension.issuingDistributionPoint) && !aSN1ObjectIdentifier.equals((ASN1Primitive) Extension.deltaCRLIndicator) && !aSN1ObjectIdentifier.equals((ASN1Primitive) Extension.policyConstraints) && !aSN1ObjectIdentifier.equals((ASN1Primitive) Extension.basicConstraints) && !aSN1ObjectIdentifier.equals((ASN1Primitive) Extension.subjectAlternativeName) && !aSN1ObjectIdentifier.equals((ASN1Primitive) Extension.nameConstraints) && extensions.getExtension(aSN1ObjectIdentifier).isCritical()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.cert.Certificate
    public String toString() {
        Object verisignCzagExtension;
        String string2 = StubApp.getString2(29562);
        StringBuffer stringBuffer = new StringBuffer();
        String lineSeparator = Strings.lineSeparator();
        stringBuffer.append(StubApp.getString2(30922));
        stringBuffer.append(getVersion());
        stringBuffer.append(lineSeparator);
        stringBuffer.append(StubApp.getString2(30923));
        stringBuffer.append(getSerialNumber());
        stringBuffer.append(lineSeparator);
        stringBuffer.append(StubApp.getString2(30905));
        stringBuffer.append(getIssuerDN());
        stringBuffer.append(lineSeparator);
        stringBuffer.append(StubApp.getString2(30924));
        stringBuffer.append(getNotBefore());
        stringBuffer.append(lineSeparator);
        stringBuffer.append(StubApp.getString2(30925));
        stringBuffer.append(getNotAfter());
        stringBuffer.append(lineSeparator);
        stringBuffer.append(StubApp.getString2(30926));
        stringBuffer.append(getSubjectDN());
        stringBuffer.append(lineSeparator);
        stringBuffer.append(StubApp.getString2(30927));
        stringBuffer.append(getPublicKey());
        stringBuffer.append(lineSeparator);
        stringBuffer.append(StubApp.getString2(30908));
        stringBuffer.append(getSigAlgName());
        stringBuffer.append(lineSeparator);
        X509SignatureUtil.prettyPrintSignature(getSignature(), stringBuffer, lineSeparator);
        Extensions extensions = this.f19142c.getTBSCertificate().getExtensions();
        if (extensions != null) {
            Enumeration oids = extensions.oids();
            if (oids.hasMoreElements()) {
                stringBuffer.append(StubApp.getString2(30928));
            }
            while (oids.hasMoreElements()) {
                ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) oids.nextElement();
                Extension extension = extensions.getExtension(aSN1ObjectIdentifier);
                if (extension.getExtnValue() != null) {
                    ASN1InputStream aSN1InputStream = new ASN1InputStream(extension.getExtnValue().getOctets());
                    stringBuffer.append(StubApp.getString2(30893));
                    stringBuffer.append(extension.isCritical());
                    stringBuffer.append(StubApp.getString2(3046));
                    try {
                    } catch (Exception unused) {
                        stringBuffer.append(aSN1ObjectIdentifier.getId());
                        stringBuffer.append(string2);
                        stringBuffer.append(StubApp.getString2(30911));
                    }
                    if (aSN1ObjectIdentifier.equals((ASN1Primitive) Extension.basicConstraints)) {
                        verisignCzagExtension = BasicConstraints.getInstance(aSN1InputStream.readObject());
                    } else if (aSN1ObjectIdentifier.equals((ASN1Primitive) Extension.keyUsage)) {
                        verisignCzagExtension = KeyUsage.getInstance(aSN1InputStream.readObject());
                    } else if (aSN1ObjectIdentifier.equals((ASN1Primitive) MiscObjectIdentifiers.netscapeCertType)) {
                        verisignCzagExtension = new NetscapeCertType(DERBitString.getInstance((Object) aSN1InputStream.readObject()));
                    } else if (aSN1ObjectIdentifier.equals((ASN1Primitive) MiscObjectIdentifiers.netscapeRevocationURL)) {
                        verisignCzagExtension = new NetscapeRevocationURL(ASN1IA5String.getInstance(aSN1InputStream.readObject()));
                    } else if (aSN1ObjectIdentifier.equals((ASN1Primitive) MiscObjectIdentifiers.verisignCzagExtension)) {
                        verisignCzagExtension = new VerisignCzagExtension(ASN1IA5String.getInstance(aSN1InputStream.readObject()));
                    } else {
                        stringBuffer.append(aSN1ObjectIdentifier.getId());
                        stringBuffer.append(string2);
                        stringBuffer.append(ASN1Dump.dumpAsString(aSN1InputStream.readObject()));
                        stringBuffer.append(lineSeparator);
                    }
                    stringBuffer.append(verisignCzagExtension);
                    stringBuffer.append(lineSeparator);
                }
                stringBuffer.append(lineSeparator);
            }
        }
        return stringBuffer.toString();
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        doVerify(publicKey, new SignatureCreator() { // from class: org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl.1
            @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator
            public Signature createSignature(String str) throws NoSuchAlgorithmException {
                try {
                    return X509CertificateImpl.this.bcHelper.createSignature(str);
                } catch (Exception unused) {
                    return Signature.getInstance(str);
                }
            }
        });
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity(Date date) throws CertificateExpiredException, CertificateNotYetValidException {
        if (date.getTime() > getNotAfter().getTime()) {
            throw new CertificateExpiredException(StubApp.getString2(30919) + this.f19142c.getEndDate().getTime());
        }
        if (date.getTime() >= getNotBefore().getTime()) {
            return;
        }
        throw new CertificateNotYetValidException(StubApp.getString2(30918) + this.f19142c.getStartDate().getTime());
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        ASN1OctetString extensionValue = getExtensionValue(this.f19142c, str);
        if (extensionValue == null) {
            return null;
        }
        try {
            return extensionValue.getEncoded();
        } catch (Exception e10) {
            throw new IllegalStateException(a.b(e10, new StringBuilder(StubApp.getString2(30900))));
        }
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey, final String str) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        doVerify(publicKey, new SignatureCreator() { // from class: org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl.2
            @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator
            public Signature createSignature(String str2) throws NoSuchAlgorithmException, NoSuchProviderException {
                String str3 = str;
                return str3 != null ? Signature.getInstance(str2, str3) : Signature.getInstance(str2);
            }
        });
    }

    @Override // java.security.cert.X509Certificate, java.security.cert.Certificate
    public final void verify(PublicKey publicKey, final Provider provider) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        try {
            doVerify(publicKey, new SignatureCreator() { // from class: org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl.3
                @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator
                public Signature createSignature(String str) throws NoSuchAlgorithmException {
                    Provider provider2 = provider;
                    return provider2 != null ? Signature.getInstance(str, provider2) : Signature.getInstance(str);
                }
            });
        } catch (NoSuchProviderException e10) {
            throw new NoSuchAlgorithmException(StubApp.getString2(30912) + e10.getMessage());
        }
    }
}
