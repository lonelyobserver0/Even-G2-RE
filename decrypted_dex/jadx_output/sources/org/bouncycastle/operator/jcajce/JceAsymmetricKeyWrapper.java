package org.bouncycastle.operator.jcajce;

import E1.a;
import com.stub.StubApp;
import i2.u;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.security.ProviderException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.Gost2814789EncryptedKey;
import org.bouncycastle.asn1.cryptopro.GostR3410KeyTransport;
import org.bouncycastle.asn1.cryptopro.GostR3410TransportParameters;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSAESOAEPparams;
import org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.jcajce.spec.GOST28147WrapParameterSpec;
import org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.operator.AsymmetricKeyWrapper;
import org.bouncycastle.operator.GenericKey;
import org.bouncycastle.operator.OperatorException;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class JceAsymmetricKeyWrapper extends AsymmetricKeyWrapper {
    private static final Map digests;
    private static final Set gostAlgs;
    private Map extraMappings;
    private OperatorHelper helper;
    private PublicKey publicKey;
    private SecureRandom random;

    static {
        HashSet hashSet = new HashSet();
        gostAlgs = hashSet;
        hashSet.add(CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_ESDH);
        hashSet.add(CryptoProObjectIdentifiers.gostR3410_2001);
        hashSet.add(RosstandartObjectIdentifiers.id_tc26_agreement_gost_3410_12_256);
        hashSet.add(RosstandartObjectIdentifiers.id_tc26_agreement_gost_3410_12_512);
        hashSet.add(RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256);
        hashSet.add(RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512);
        HashMap hashMap = new HashMap();
        digests = hashMap;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = OIWObjectIdentifiers.idSHA1;
        DERNull dERNull = DERNull.INSTANCE;
        hashMap.put(StubApp.getString2(21748), new AlgorithmIdentifier(aSN1ObjectIdentifier, dERNull));
        hashMap.put(StubApp.getString2(5778), new AlgorithmIdentifier(aSN1ObjectIdentifier, dERNull));
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_sha224;
        hashMap.put(StubApp.getString2(28054), new AlgorithmIdentifier(aSN1ObjectIdentifier2, dERNull));
        hashMap.put(StubApp.getString2(28501), new AlgorithmIdentifier(aSN1ObjectIdentifier2, dERNull));
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_sha256;
        hashMap.put(StubApp.getString2(21749), new AlgorithmIdentifier(aSN1ObjectIdentifier3, dERNull));
        hashMap.put(StubApp.getString2(1488), new AlgorithmIdentifier(aSN1ObjectIdentifier3, dERNull));
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NISTObjectIdentifiers.id_sha384;
        hashMap.put(StubApp.getString2(21750), new AlgorithmIdentifier(aSN1ObjectIdentifier4, dERNull));
        hashMap.put(StubApp.getString2(23704), new AlgorithmIdentifier(aSN1ObjectIdentifier4, dERNull));
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = NISTObjectIdentifiers.id_sha512;
        hashMap.put(StubApp.getString2(21751), new AlgorithmIdentifier(aSN1ObjectIdentifier5, dERNull));
        hashMap.put(StubApp.getString2(23705), new AlgorithmIdentifier(aSN1ObjectIdentifier5, dERNull));
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = NISTObjectIdentifiers.id_sha512_224;
        hashMap.put(StubApp.getString2(31152), new AlgorithmIdentifier(aSN1ObjectIdentifier6, dERNull));
        hashMap.put(StubApp.getString2(29286), new AlgorithmIdentifier(aSN1ObjectIdentifier6, dERNull));
        hashMap.put(StubApp.getString2(30820), new AlgorithmIdentifier(aSN1ObjectIdentifier6, dERNull));
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = NISTObjectIdentifiers.id_sha512_256;
        hashMap.put(StubApp.getString2(31155), new AlgorithmIdentifier(aSN1ObjectIdentifier7, dERNull));
        hashMap.put(StubApp.getString2(29285), new AlgorithmIdentifier(aSN1ObjectIdentifier7, dERNull));
        hashMap.put(StubApp.getString2(30821), new AlgorithmIdentifier(aSN1ObjectIdentifier7, dERNull));
    }

    public JceAsymmetricKeyWrapper(AlgorithmParameters algorithmParameters, PublicKey publicKey) throws InvalidParameterSpecException {
        super(extractFromSpec(algorithmParameters.getParameterSpec(AlgorithmParameterSpec.class)));
        this.helper = new OperatorHelper(new DefaultJcaJceHelper());
        this.extraMappings = new HashMap();
        this.publicKey = publicKey;
    }

    private static AlgorithmIdentifier extractFromSpec(AlgorithmParameterSpec algorithmParameterSpec) {
        if (!(algorithmParameterSpec instanceof OAEPParameterSpec)) {
            throw new IllegalArgumentException(StubApp.getString2(33863).concat(algorithmParameterSpec.getClass().getName()));
        }
        OAEPParameterSpec oAEPParameterSpec = (OAEPParameterSpec) algorithmParameterSpec;
        if (!oAEPParameterSpec.getMGFAlgorithm().equals(OAEPParameterSpec.DEFAULT.getMGFAlgorithm())) {
            throw new IllegalArgumentException(StubApp.getString2(33862) + oAEPParameterSpec.getMGFAlgorithm());
        }
        if (oAEPParameterSpec.getPSource() instanceof PSource.PSpecified) {
            return new AlgorithmIdentifier(PKCSObjectIdentifiers.id_RSAES_OAEP, new RSAESOAEPparams(getDigest(oAEPParameterSpec.getDigestAlgorithm()), new AlgorithmIdentifier(PKCSObjectIdentifiers.id_mgf1, getDigest(((MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters()).getDigestAlgorithm())), new AlgorithmIdentifier(PKCSObjectIdentifiers.id_pSpecified, new DEROctetString(((PSource.PSpecified) oAEPParameterSpec.getPSource()).getValue()))));
        }
        throw new IllegalArgumentException(StubApp.getString2(33861) + oAEPParameterSpec.getPSource().getAlgorithm());
    }

    private static AlgorithmIdentifier getDigest(String str) {
        AlgorithmIdentifier algorithmIdentifier = (AlgorithmIdentifier) digests.get(str);
        if (algorithmIdentifier != null) {
            return algorithmIdentifier;
        }
        throw new IllegalArgumentException(a.j(StubApp.getString2(33864), str));
    }

    public static boolean isGOST(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return gostAlgs.contains(aSN1ObjectIdentifier);
    }

    @Override // org.bouncycastle.operator.KeyWrapper
    public byte[] generateWrappedKey(GenericKey genericKey) throws OperatorException {
        AlgorithmParameters algorithmParameters;
        if (!isGOST(getAlgorithmIdentifier().getAlgorithm())) {
            Cipher createAsymmetricWrapper = this.helper.createAsymmetricWrapper(getAlgorithmIdentifier().getAlgorithm(), this.extraMappings);
            byte[] bArr = null;
            try {
                algorithmParameters = this.helper.createAlgorithmParameters(getAlgorithmIdentifier());
                try {
                    if (algorithmParameters != null) {
                        createAsymmetricWrapper.init(3, this.publicKey, algorithmParameters, this.random);
                    } else {
                        createAsymmetricWrapper.init(3, this.publicKey, this.random);
                    }
                    bArr = createAsymmetricWrapper.wrap(OperatorUtils.getJceKey(genericKey));
                } catch (IllegalStateException | UnsupportedOperationException | InvalidKeyException | GeneralSecurityException | ProviderException unused) {
                }
            } catch (IllegalStateException | UnsupportedOperationException | InvalidKeyException | GeneralSecurityException | ProviderException unused2) {
                algorithmParameters = null;
            }
            if (bArr != null) {
                return bArr;
            }
            String string2 = StubApp.getString2(33839);
            try {
                if (algorithmParameters != null) {
                    createAsymmetricWrapper.init(1, this.publicKey, algorithmParameters, this.random);
                } else {
                    createAsymmetricWrapper.init(1, this.publicKey, this.random);
                }
                return createAsymmetricWrapper.doFinal(OperatorUtils.getJceKey(genericKey).getEncoded());
            } catch (InvalidKeyException e10) {
                throw new OperatorException(string2, e10);
            } catch (GeneralSecurityException e11) {
                throw new OperatorException(string2, e11);
            }
        }
        try {
            this.random = CryptoServicesRegistrar.getSecureRandom(this.random);
            KeyPairGenerator createKeyPairGenerator = this.helper.createKeyPairGenerator(getAlgorithmIdentifier().getAlgorithm());
            createKeyPairGenerator.initialize(((ECPublicKey) this.publicKey).getParams(), this.random);
            KeyPair generateKeyPair = createKeyPairGenerator.generateKeyPair();
            byte[] bArr2 = new byte[8];
            this.random.nextBytes(bArr2);
            SubjectPublicKeyInfo subjectPublicKeyInfo = SubjectPublicKeyInfo.getInstance(generateKeyPair.getPublic().getEncoded());
            GostR3410TransportParameters gostR3410TransportParameters = subjectPublicKeyInfo.getAlgorithm().getAlgorithm().on(RosstandartObjectIdentifiers.id_tc26) ? new GostR3410TransportParameters(RosstandartObjectIdentifiers.id_tc26_gost_28147_param_Z, subjectPublicKeyInfo, bArr2) : new GostR3410TransportParameters(CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_A_ParamSet, subjectPublicKeyInfo, bArr2);
            KeyAgreement createKeyAgreement = this.helper.createKeyAgreement(getAlgorithmIdentifier().getAlgorithm());
            createKeyAgreement.init(generateKeyPair.getPrivate(), new UserKeyingMaterialSpec(gostR3410TransportParameters.getUkm()));
            createKeyAgreement.doPhase(this.publicKey, true);
            ASN1ObjectIdentifier aSN1ObjectIdentifier = CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_KeyWrap;
            SecretKey generateSecret = createKeyAgreement.generateSecret(aSN1ObjectIdentifier.getId());
            byte[] encoded = OperatorUtils.getJceKey(genericKey).getEncoded();
            Cipher createCipher = this.helper.createCipher(aSN1ObjectIdentifier);
            createCipher.init(3, generateSecret, new GOST28147WrapParameterSpec(gostR3410TransportParameters.getEncryptionParamSet(), gostR3410TransportParameters.getUkm()));
            byte[] wrap = createCipher.wrap(new SecretKeySpec(encoded, StubApp.getString2("32410")));
            return new GostR3410KeyTransport(new Gost2814789EncryptedKey(Arrays.copyOfRange(wrap, 0, 32), Arrays.copyOfRange(wrap, 32, 36)), gostR3410TransportParameters).getEncoded();
        } catch (Exception e12) {
            throw new OperatorException(u.r(e12, new StringBuilder(StubApp.getString2(33865))), e12);
        }
    }

    public JceAsymmetricKeyWrapper setAlgorithmMapping(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        this.extraMappings.put(aSN1ObjectIdentifier, str);
        return this;
    }

    public JceAsymmetricKeyWrapper setProvider(String str) {
        this.helper = new OperatorHelper(new NamedJcaJceHelper(str));
        return this;
    }

    public JceAsymmetricKeyWrapper setSecureRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
        return this;
    }

    public JceAsymmetricKeyWrapper(PublicKey publicKey) {
        super(SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()).getAlgorithm());
        this.helper = new OperatorHelper(new DefaultJcaJceHelper());
        this.extraMappings = new HashMap();
        this.publicKey = publicKey;
    }

    public JceAsymmetricKeyWrapper setProvider(Provider provider) {
        this.helper = new OperatorHelper(new ProviderJcaJceHelper(provider));
        return this;
    }

    public JceAsymmetricKeyWrapper(X509Certificate x509Certificate) {
        this(x509Certificate.getPublicKey());
    }

    public JceAsymmetricKeyWrapper(AlgorithmParameterSpec algorithmParameterSpec, PublicKey publicKey) {
        super(extractFromSpec(algorithmParameterSpec));
        this.helper = new OperatorHelper(new DefaultJcaJceHelper());
        this.extraMappings = new HashMap();
        this.publicKey = publicKey;
    }

    public JceAsymmetricKeyWrapper(AlgorithmIdentifier algorithmIdentifier, PublicKey publicKey) {
        super(algorithmIdentifier);
        this.helper = new OperatorHelper(new DefaultJcaJceHelper());
        this.extraMappings = new HashMap();
        this.publicKey = publicKey;
    }
}
