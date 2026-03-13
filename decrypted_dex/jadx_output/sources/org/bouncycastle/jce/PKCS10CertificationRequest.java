package org.bouncycastle.jce;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.CertificationRequest;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSASSAPSSparams;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.X509Name;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PKCS10CertificationRequest extends CertificationRequest {
    private static Hashtable algorithms = new Hashtable();
    private static Hashtable params = new Hashtable();
    private static Hashtable keyAlgorithms = new Hashtable();
    private static Hashtable oids = new Hashtable();
    private static Set noParams = new HashSet();

    static {
        Hashtable hashtable = algorithms;
        String string2 = StubApp.getString2(32457);
        hashtable.put(StubApp.getString2(32458), new ASN1ObjectIdentifier(string2));
        Hashtable hashtable2 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier(string2);
        String string22 = StubApp.getString2(32459);
        hashtable2.put(string22, aSN1ObjectIdentifier);
        Hashtable hashtable3 = algorithms;
        String string23 = StubApp.getString2(32460);
        hashtable3.put(StubApp.getString2(32461), new ASN1ObjectIdentifier(string23));
        Hashtable hashtable4 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = new ASN1ObjectIdentifier(string23);
        String string24 = StubApp.getString2(32462);
        hashtable4.put(string24, aSN1ObjectIdentifier2);
        algorithms.put(StubApp.getString2(32463), new ASN1ObjectIdentifier(string23));
        Hashtable hashtable5 = algorithms;
        String string25 = StubApp.getString2(32464);
        hashtable5.put(StubApp.getString2(32465), new ASN1ObjectIdentifier(string25));
        Hashtable hashtable6 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = new ASN1ObjectIdentifier(string25);
        String string26 = StubApp.getString2(30425);
        hashtable6.put(string26, aSN1ObjectIdentifier3);
        Hashtable hashtable7 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = PKCSObjectIdentifiers.sha224WithRSAEncryption;
        hashtable7.put(StubApp.getString2(32466), aSN1ObjectIdentifier4);
        Hashtable hashtable8 = algorithms;
        String string27 = StubApp.getString2(32467);
        hashtable8.put(string27, aSN1ObjectIdentifier4);
        Hashtable hashtable9 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = PKCSObjectIdentifiers.sha256WithRSAEncryption;
        hashtable9.put(StubApp.getString2(32468), aSN1ObjectIdentifier5);
        Hashtable hashtable10 = algorithms;
        String string28 = StubApp.getString2(32469);
        hashtable10.put(string28, aSN1ObjectIdentifier5);
        Hashtable hashtable11 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = PKCSObjectIdentifiers.sha384WithRSAEncryption;
        hashtable11.put(StubApp.getString2(32470), aSN1ObjectIdentifier6);
        Hashtable hashtable12 = algorithms;
        String string29 = StubApp.getString2(32471);
        hashtable12.put(string29, aSN1ObjectIdentifier6);
        Hashtable hashtable13 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = PKCSObjectIdentifiers.sha512WithRSAEncryption;
        hashtable13.put(StubApp.getString2(32472), aSN1ObjectIdentifier7);
        Hashtable hashtable14 = algorithms;
        String string210 = StubApp.getString2(32473);
        hashtable14.put(string210, aSN1ObjectIdentifier7);
        Hashtable hashtable15 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = PKCSObjectIdentifiers.id_RSASSA_PSS;
        String string211 = StubApp.getString2(32474);
        hashtable15.put(string211, aSN1ObjectIdentifier8);
        Hashtable hashtable16 = algorithms;
        String string212 = StubApp.getString2(32475);
        hashtable16.put(string212, aSN1ObjectIdentifier8);
        Hashtable hashtable17 = algorithms;
        String string213 = StubApp.getString2(32476);
        hashtable17.put(string213, aSN1ObjectIdentifier8);
        Hashtable hashtable18 = algorithms;
        String string214 = StubApp.getString2(32477);
        hashtable18.put(string214, aSN1ObjectIdentifier8);
        Hashtable hashtable19 = algorithms;
        String string215 = StubApp.getString2(32478);
        hashtable19.put(string215, aSN1ObjectIdentifier8);
        algorithms.put(StubApp.getString2(32479), new ASN1ObjectIdentifier(string25));
        Hashtable hashtable20 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = TeleTrusTObjectIdentifiers.rsaSignatureWithripemd128;
        hashtable20.put(StubApp.getString2(32480), aSN1ObjectIdentifier9);
        algorithms.put(StubApp.getString2(32481), aSN1ObjectIdentifier9);
        Hashtable hashtable21 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = TeleTrusTObjectIdentifiers.rsaSignatureWithripemd160;
        hashtable21.put(StubApp.getString2(32482), aSN1ObjectIdentifier10);
        algorithms.put(StubApp.getString2(32483), aSN1ObjectIdentifier10);
        Hashtable hashtable22 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier11 = TeleTrusTObjectIdentifiers.rsaSignatureWithripemd256;
        hashtable22.put(StubApp.getString2(32484), aSN1ObjectIdentifier11);
        algorithms.put(StubApp.getString2(32485), aSN1ObjectIdentifier11);
        Hashtable hashtable23 = algorithms;
        String string216 = StubApp.getString2(32486);
        ASN1ObjectIdentifier aSN1ObjectIdentifier12 = new ASN1ObjectIdentifier(string216);
        String string217 = StubApp.getString2(32487);
        hashtable23.put(string217, aSN1ObjectIdentifier12);
        algorithms.put(StubApp.getString2(32488), new ASN1ObjectIdentifier(string216));
        Hashtable hashtable24 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier13 = NISTObjectIdentifiers.dsa_with_sha224;
        String string218 = StubApp.getString2(32489);
        hashtable24.put(string218, aSN1ObjectIdentifier13);
        Hashtable hashtable25 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier14 = NISTObjectIdentifiers.dsa_with_sha256;
        String string219 = StubApp.getString2(32490);
        hashtable25.put(string219, aSN1ObjectIdentifier14);
        algorithms.put(StubApp.getString2(32491), NISTObjectIdentifiers.dsa_with_sha384);
        algorithms.put(StubApp.getString2(32492), NISTObjectIdentifiers.dsa_with_sha512);
        Hashtable hashtable26 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier15 = X9ObjectIdentifiers.ecdsa_with_SHA1;
        String string220 = StubApp.getString2(32493);
        hashtable26.put(string220, aSN1ObjectIdentifier15);
        Hashtable hashtable27 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier16 = X9ObjectIdentifiers.ecdsa_with_SHA224;
        String string221 = StubApp.getString2(32494);
        hashtable27.put(string221, aSN1ObjectIdentifier16);
        Hashtable hashtable28 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier17 = X9ObjectIdentifiers.ecdsa_with_SHA256;
        String string222 = StubApp.getString2(32495);
        hashtable28.put(string222, aSN1ObjectIdentifier17);
        Hashtable hashtable29 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier18 = X9ObjectIdentifiers.ecdsa_with_SHA384;
        hashtable29.put(StubApp.getString2(32496), aSN1ObjectIdentifier18);
        Hashtable hashtable30 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier19 = X9ObjectIdentifiers.ecdsa_with_SHA512;
        hashtable30.put(StubApp.getString2(32497), aSN1ObjectIdentifier19);
        algorithms.put(StubApp.getString2(32498), aSN1ObjectIdentifier15);
        Hashtable hashtable31 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier20 = CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_94;
        hashtable31.put(StubApp.getString2(32499), aSN1ObjectIdentifier20);
        algorithms.put(StubApp.getString2(32500), aSN1ObjectIdentifier20);
        Hashtable hashtable32 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier21 = CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001;
        hashtable32.put(StubApp.getString2(32501), aSN1ObjectIdentifier21);
        algorithms.put(StubApp.getString2(32502), aSN1ObjectIdentifier21);
        algorithms.put(StubApp.getString2(32503), aSN1ObjectIdentifier21);
        oids.put(new ASN1ObjectIdentifier(string25), string26);
        oids.put(aSN1ObjectIdentifier4, string27);
        oids.put(aSN1ObjectIdentifier5, string28);
        oids.put(aSN1ObjectIdentifier6, string29);
        oids.put(aSN1ObjectIdentifier7, string210);
        oids.put(aSN1ObjectIdentifier20, StubApp.getString2(32499));
        oids.put(aSN1ObjectIdentifier21, StubApp.getString2(32501));
        oids.put(new ASN1ObjectIdentifier(string23), string24);
        oids.put(new ASN1ObjectIdentifier(string2), string22);
        oids.put(new ASN1ObjectIdentifier(string216), string217);
        oids.put(aSN1ObjectIdentifier15, string220);
        oids.put(aSN1ObjectIdentifier16, string221);
        oids.put(aSN1ObjectIdentifier17, string222);
        oids.put(aSN1ObjectIdentifier18, StubApp.getString2(32496));
        oids.put(aSN1ObjectIdentifier19, StubApp.getString2(32497));
        oids.put(OIWObjectIdentifiers.sha1WithRSA, string26);
        Hashtable hashtable33 = oids;
        ASN1ObjectIdentifier aSN1ObjectIdentifier22 = OIWObjectIdentifiers.dsaWithSHA1;
        hashtable33.put(aSN1ObjectIdentifier22, string217);
        oids.put(aSN1ObjectIdentifier13, string218);
        oids.put(aSN1ObjectIdentifier14, string219);
        keyAlgorithms.put(PKCSObjectIdentifiers.rsaEncryption, StubApp.getString2(24659));
        keyAlgorithms.put(X9ObjectIdentifiers.id_dsa, StubApp.getString2(28060));
        noParams.add(aSN1ObjectIdentifier15);
        noParams.add(aSN1ObjectIdentifier16);
        noParams.add(aSN1ObjectIdentifier17);
        noParams.add(aSN1ObjectIdentifier18);
        noParams.add(aSN1ObjectIdentifier19);
        noParams.add(X9ObjectIdentifiers.id_dsa_with_sha1);
        noParams.add(aSN1ObjectIdentifier22);
        noParams.add(aSN1ObjectIdentifier13);
        noParams.add(aSN1ObjectIdentifier14);
        noParams.add(aSN1ObjectIdentifier20);
        noParams.add(aSN1ObjectIdentifier21);
        ASN1ObjectIdentifier aSN1ObjectIdentifier23 = OIWObjectIdentifiers.idSHA1;
        DERNull dERNull = DERNull.INSTANCE;
        params.put(string211, creatPSSParams(new AlgorithmIdentifier(aSN1ObjectIdentifier23, dERNull), 20));
        params.put(string212, creatPSSParams(new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha224, dERNull), 28));
        params.put(string213, creatPSSParams(new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256, dERNull), 32));
        params.put(string214, creatPSSParams(new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha384, dERNull), 48));
        params.put(string215, creatPSSParams(new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha512, dERNull), 64));
    }

    public PKCS10CertificationRequest(String str, X500Principal x500Principal, PublicKey publicKey, ASN1Set aSN1Set, PrivateKey privateKey) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException, SignatureException {
        this(str, convertName(x500Principal), publicKey, aSN1Set, privateKey, StubApp.getString2(21668));
    }

    private static X509Name convertName(X500Principal x500Principal) {
        try {
            return new X509Principal(x500Principal.getEncoded());
        } catch (IOException unused) {
            throw new IllegalArgumentException(StubApp.getString2(32509));
        }
    }

    private static RSASSAPSSparams creatPSSParams(AlgorithmIdentifier algorithmIdentifier, int i3) {
        return new RSASSAPSSparams(algorithmIdentifier, new AlgorithmIdentifier(PKCSObjectIdentifiers.id_mgf1, algorithmIdentifier), new ASN1Integer(i3), new ASN1Integer(1L));
    }

    private static String getDigestAlgName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return PKCSObjectIdentifiers.md5.equals((ASN1Primitive) aSN1ObjectIdentifier) ? StubApp.getString2(4894) : OIWObjectIdentifiers.idSHA1.equals((ASN1Primitive) aSN1ObjectIdentifier) ? StubApp.getString2(21748) : NISTObjectIdentifiers.id_sha224.equals((ASN1Primitive) aSN1ObjectIdentifier) ? StubApp.getString2(28054) : NISTObjectIdentifiers.id_sha256.equals((ASN1Primitive) aSN1ObjectIdentifier) ? StubApp.getString2(21749) : NISTObjectIdentifiers.id_sha384.equals((ASN1Primitive) aSN1ObjectIdentifier) ? StubApp.getString2(21750) : NISTObjectIdentifiers.id_sha512.equals((ASN1Primitive) aSN1ObjectIdentifier) ? StubApp.getString2(21751) : TeleTrusTObjectIdentifiers.ripemd128.equals((ASN1Primitive) aSN1ObjectIdentifier) ? StubApp.getString2(28185) : TeleTrusTObjectIdentifiers.ripemd160.equals((ASN1Primitive) aSN1ObjectIdentifier) ? StubApp.getString2(21747) : TeleTrusTObjectIdentifiers.ripemd256.equals((ASN1Primitive) aSN1ObjectIdentifier) ? StubApp.getString2(28186) : CryptoProObjectIdentifiers.gostR3411.equals((ASN1Primitive) aSN1ObjectIdentifier) ? StubApp.getString2(28192) : aSN1ObjectIdentifier.getId();
    }

    public static String getSignatureName(AlgorithmIdentifier algorithmIdentifier) {
        ASN1Encodable parameters = algorithmIdentifier.getParameters();
        if (parameters == null || DERNull.INSTANCE.equals(parameters) || !algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) PKCSObjectIdentifiers.id_RSASSA_PSS)) {
            return algorithmIdentifier.getAlgorithm().getId();
        }
        return AbstractC1482f.k(new StringBuilder(), getDigestAlgName(RSASSAPSSparams.getInstance(parameters).getHashAlgorithm().getAlgorithm()), StubApp.getString2(30934));
    }

    private void setSignatureParameters(Signature signature, ASN1Encodable aSN1Encodable) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        if (aSN1Encodable == null || DERNull.INSTANCE.equals(aSN1Encodable)) {
            return;
        }
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(signature.getAlgorithm(), signature.getProvider());
        try {
            algorithmParameters.init(aSN1Encodable.toASN1Primitive().getEncoded(StubApp.getString2("26791")));
            if (signature.getAlgorithm().endsWith(StubApp.getString2(30299))) {
                try {
                    signature.setParameter(algorithmParameters.getParameterSpec(PSSParameterSpec.class));
                } catch (GeneralSecurityException e10) {
                    throw new SignatureException(a.h(e10, new StringBuilder(StubApp.getString2(30938))));
                }
            }
        } catch (IOException e11) {
            throw new SignatureException(u.q(e11, new StringBuilder(StubApp.getString2(30939))));
        }
    }

    private static ASN1Sequence toDERSequence(byte[] bArr) {
        try {
            return (ASN1Sequence) new ASN1InputStream(bArr).readObject();
        } catch (Exception unused) {
            throw new IllegalArgumentException(StubApp.getString2(32510));
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.util.Encodable
    public byte[] getEncoded() {
        try {
            return getEncoded(StubApp.getString2("26791"));
        } catch (IOException e10) {
            throw new RuntimeException(e10.toString());
        }
    }

    public PublicKey getPublicKey() throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException {
        return getPublicKey(StubApp.getString2(21668));
    }

    public boolean verify() throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException, SignatureException {
        return verify(StubApp.getString2(21668));
    }

    public PKCS10CertificationRequest(String str, X500Principal x500Principal, PublicKey publicKey, ASN1Set aSN1Set, PrivateKey privateKey, String str2) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException, SignatureException {
        this(str, convertName(x500Principal), publicKey, aSN1Set, privateKey, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.security.PublicKey] */
    public PublicKey getPublicKey(String str) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException {
        String string2 = StubApp.getString2(32511);
        SubjectPublicKeyInfo subjectPublicKeyInfo = this.reqInfo.getSubjectPublicKeyInfo();
        try {
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(new DERBitString(subjectPublicKeyInfo).getOctets());
            AlgorithmIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm();
            try {
                str = (str == 0 ? KeyFactory.getInstance(algorithm.getAlgorithm().getId()) : KeyFactory.getInstance(algorithm.getAlgorithm().getId(), str)).generatePublic(x509EncodedKeySpec);
                return str;
            } catch (NoSuchAlgorithmException e10) {
                if (keyAlgorithms.get(algorithm.getAlgorithm()) == null) {
                    throw e10;
                }
                String str2 = (String) keyAlgorithms.get(algorithm.getAlgorithm());
                return str == 0 ? KeyFactory.getInstance(str2).generatePublic(x509EncodedKeySpec) : KeyFactory.getInstance(str2, str).generatePublic(x509EncodedKeySpec);
            }
        } catch (IOException unused) {
            throw new InvalidKeyException(string2);
        } catch (InvalidKeySpecException unused2) {
            throw new InvalidKeyException(string2);
        }
    }

    public boolean verify(String str) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException, SignatureException {
        return verify(getPublicKey(str), str);
    }

    public PKCS10CertificationRequest(String str, X509Name x509Name, PublicKey publicKey, ASN1Set aSN1Set, PrivateKey privateKey) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException, SignatureException {
        this(str, x509Name, publicKey, aSN1Set, privateKey, StubApp.getString2(21668));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [org.bouncycastle.asn1.pkcs.CertificationRequest, org.bouncycastle.jce.PKCS10CertificationRequest] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.security.Signature] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.security.Signature] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.security.Signature] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public boolean verify(PublicKey publicKey, String str) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException, SignatureException {
        try {
            str = str == 0 ? Signature.getInstance(getSignatureName(this.sigAlgId)) : Signature.getInstance(getSignatureName(this.sigAlgId), (String) str);
        } catch (NoSuchAlgorithmException e10) {
            if (oids.get(this.sigAlgId.getAlgorithm()) == null) {
                throw e10;
            }
            String str2 = (String) oids.get(this.sigAlgId.getAlgorithm());
            str = str == 0 ? Signature.getInstance(str2) : Signature.getInstance(str2, (String) str);
        }
        setSignatureParameters(str, this.sigAlgId.getParameters());
        str.initVerify(publicKey);
        try {
            str.update(this.reqInfo.getEncoded(StubApp.getString2("26791")));
            return str.verify(this.sigBits.getOctets());
        } catch (Exception e11) {
            throw new SignatureException(E1.a.i(StubApp.getString2(32505), e11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PKCS10CertificationRequest(java.lang.String r5, org.bouncycastle.asn1.x509.X509Name r6, java.security.PublicKey r7, org.bouncycastle.asn1.ASN1Set r8, java.security.PrivateKey r9, java.lang.String r10) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.InvalidKeyException, java.security.SignatureException {
        /*
            r4 = this;
            r4.<init>()
            java.lang.String r0 = org.bouncycastle.util.Strings.toUpperCase(r5)
            java.util.Hashtable r1 = org.bouncycastle.jce.PKCS10CertificationRequest.algorithms
            java.lang.Object r1 = r1.get(r0)
            org.bouncycastle.asn1.ASN1ObjectIdentifier r1 = (org.bouncycastle.asn1.ASN1ObjectIdentifier) r1
            if (r1 != 0) goto L24
            org.bouncycastle.asn1.ASN1ObjectIdentifier r1 = new org.bouncycastle.asn1.ASN1ObjectIdentifier     // Catch: java.lang.Exception -> L17
            r1.<init>(r0)     // Catch: java.lang.Exception -> L17
            goto L24
        L17:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r6 = 32504(0x7ef8, float:4.5548E-41)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            r5.<init>(r6)
            throw r5
        L24:
            if (r6 == 0) goto Lc2
            if (r7 == 0) goto Lb5
            java.util.Set r2 = org.bouncycastle.jce.PKCS10CertificationRequest.noParams
            boolean r2 = r2.contains(r1)
            if (r2 == 0) goto L38
            org.bouncycastle.asn1.x509.AlgorithmIdentifier r0 = new org.bouncycastle.asn1.x509.AlgorithmIdentifier
            r0.<init>(r1)
        L35:
            r4.sigAlgId = r0
            goto L58
        L38:
            java.util.Hashtable r2 = org.bouncycastle.jce.PKCS10CertificationRequest.params
            boolean r2 = r2.containsKey(r0)
            if (r2 == 0) goto L50
            org.bouncycastle.asn1.x509.AlgorithmIdentifier r2 = new org.bouncycastle.asn1.x509.AlgorithmIdentifier
            java.util.Hashtable r3 = org.bouncycastle.jce.PKCS10CertificationRequest.params
            java.lang.Object r0 = r3.get(r0)
            org.bouncycastle.asn1.ASN1Encodable r0 = (org.bouncycastle.asn1.ASN1Encodable) r0
            r2.<init>(r1, r0)
            r4.sigAlgId = r2
            goto L58
        L50:
            org.bouncycastle.asn1.x509.AlgorithmIdentifier r0 = new org.bouncycastle.asn1.x509.AlgorithmIdentifier
            org.bouncycastle.asn1.DERNull r2 = org.bouncycastle.asn1.DERNull.INSTANCE
            r0.<init>(r1, r2)
            goto L35
        L58:
            byte[] r7 = r7.getEncoded()     // Catch: java.io.IOException -> La8
            org.bouncycastle.asn1.ASN1Primitive r7 = org.bouncycastle.asn1.ASN1Primitive.fromByteArray(r7)     // Catch: java.io.IOException -> La8
            org.bouncycastle.asn1.ASN1Sequence r7 = (org.bouncycastle.asn1.ASN1Sequence) r7     // Catch: java.io.IOException -> La8
            org.bouncycastle.asn1.pkcs.CertificationRequestInfo r0 = new org.bouncycastle.asn1.pkcs.CertificationRequestInfo     // Catch: java.io.IOException -> La8
            org.bouncycastle.asn1.x509.SubjectPublicKeyInfo r7 = org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(r7)     // Catch: java.io.IOException -> La8
            r0.<init>(r6, r7, r8)     // Catch: java.io.IOException -> La8
            r4.reqInfo = r0     // Catch: java.io.IOException -> La8
            if (r10 != 0) goto L74
            java.security.Signature r5 = java.security.Signature.getInstance(r5)
            goto L78
        L74:
            java.security.Signature r5 = java.security.Signature.getInstance(r5, r10)
        L78:
            r5.initSign(r9)
            org.bouncycastle.asn1.pkcs.CertificationRequestInfo r6 = r4.reqInfo     // Catch: java.lang.Exception -> L96
            java.lang.String r7 = "26791"
            java.lang.String r7 = com.stub.StubApp.getString2(r7)     // Catch: java.lang.Exception -> L96
            byte[] r6 = r6.getEncoded(r7)     // Catch: java.lang.Exception -> L96
            r5.update(r6)     // Catch: java.lang.Exception -> L96
            org.bouncycastle.asn1.DERBitString r6 = new org.bouncycastle.asn1.DERBitString
            byte[] r5 = r5.sign()
            r6.<init>(r5)
            r4.sigBits = r6
            return
        L96:
            r5 = move-exception
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r7 = 32505(0x7ef9, float:4.5549E-41)
            java.lang.String r7 = com.stub.StubApp.getString2(r7)
            java.lang.String r5 = E1.a.i(r7, r5)
            r6.<init>(r5)
            throw r6
        La8:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r6 = 32506(0x7efa, float:4.555E-41)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            r5.<init>(r6)
            throw r5
        Lb5:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r6 = 32507(0x7efb, float:4.5552E-41)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            r5.<init>(r6)
            throw r5
        Lc2:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r6 = 32508(0x7efc, float:4.5553E-41)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.PKCS10CertificationRequest.<init>(java.lang.String, org.bouncycastle.asn1.x509.X509Name, java.security.PublicKey, org.bouncycastle.asn1.ASN1Set, java.security.PrivateKey, java.lang.String):void");
    }

    public PKCS10CertificationRequest(ASN1Sequence aSN1Sequence) {
        super(aSN1Sequence);
    }

    public PKCS10CertificationRequest(byte[] bArr) {
        super(toDERSequence(bArr));
    }
}
