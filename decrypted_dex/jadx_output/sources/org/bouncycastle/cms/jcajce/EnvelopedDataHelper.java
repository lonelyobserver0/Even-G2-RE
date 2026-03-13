package org.bouncycastle.cms.jcajce;

import com.stub.StubApp;
import java.security.AlgorithmParameterGenerator;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PBKDF2Params;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RC2CBCParameter;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cms.CMSAlgorithm;
import org.bouncycastle.cms.CMSEnvelopedGenerator;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.cms.PasswordRecipient;
import org.bouncycastle.operator.DefaultSecretKeySizeProvider;
import org.bouncycastle.operator.GenericKey;
import org.bouncycastle.operator.SecretKeySizeProvider;
import org.bouncycastle.operator.SymmetricKeyUnwrapper;
import org.bouncycastle.operator.jcajce.JceAsymmetricKeyUnwrapper;
import org.bouncycastle.operator.jcajce.JceKTSKeyUnwrapper;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class EnvelopedDataHelper {
    protected static final Map BASE_CIPHER_NAMES;
    protected static final Map CIPHER_ALG_NAMES;
    protected static final SecretKeySizeProvider KEY_SIZE_PROVIDER = DefaultSecretKeySizeProvider.INSTANCE;
    protected static final Map MAC_ALG_NAMES;
    private static final Map PBKDF2_ALG_NAMES;
    private static final Set authEnvelopedAlgorithms;
    private static final short[] rc2Ekb;
    private static final short[] rc2Table;
    private JcaJceExtHelper helper;

    public interface JCECallback {
        Object doInJCE() throws CMSException, InvalidAlgorithmParameterException, InvalidKeyException, InvalidParameterSpecException, NoSuchAlgorithmException, NoSuchPaddingException, NoSuchProviderException;
    }

    static {
        HashSet hashSet = new HashSet();
        authEnvelopedAlgorithms = hashSet;
        HashMap hashMap = new HashMap();
        BASE_CIPHER_NAMES = hashMap;
        HashMap hashMap2 = new HashMap();
        CIPHER_ALG_NAMES = hashMap2;
        HashMap hashMap3 = new HashMap();
        MAC_ALG_NAMES = hashMap3;
        HashMap hashMap4 = new HashMap();
        PBKDF2_ALG_NAMES = hashMap4;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = CMSAlgorithm.DES_CBC;
        hashMap.put(aSN1ObjectIdentifier, StubApp.getString2(28171));
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = CMSAlgorithm.DES_EDE3_CBC;
        hashMap.put(aSN1ObjectIdentifier2, StubApp.getString2(28051));
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = CMSAlgorithm.AES128_CBC;
        String string2 = StubApp.getString2(461);
        hashMap.put(aSN1ObjectIdentifier3, string2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = CMSAlgorithm.AES192_CBC;
        hashMap.put(aSN1ObjectIdentifier4, string2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = CMSAlgorithm.AES256_CBC;
        hashMap.put(aSN1ObjectIdentifier5, string2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = CMSAlgorithm.RC2_CBC;
        hashMap.put(aSN1ObjectIdentifier6, StubApp.getString2(28256));
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = CMSAlgorithm.CAST5_CBC;
        hashMap.put(aSN1ObjectIdentifier7, StubApp.getString2(28257));
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = CMSAlgorithm.CAMELLIA128_CBC;
        String string22 = StubApp.getString2(28258);
        hashMap.put(aSN1ObjectIdentifier8, string22);
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = CMSAlgorithm.CAMELLIA192_CBC;
        hashMap.put(aSN1ObjectIdentifier9, string22);
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = CMSAlgorithm.CAMELLIA256_CBC;
        hashMap.put(aSN1ObjectIdentifier10, string22);
        ASN1ObjectIdentifier aSN1ObjectIdentifier11 = CMSAlgorithm.SEED_CBC;
        hashMap.put(aSN1ObjectIdentifier11, StubApp.getString2(28259));
        ASN1ObjectIdentifier aSN1ObjectIdentifier12 = PKCSObjectIdentifiers.rc4;
        String string23 = StubApp.getString2(28260);
        hashMap.put(aSN1ObjectIdentifier12, string23);
        hashMap.put(CryptoProObjectIdentifiers.gostR28147_gcfb, StubApp.getString2(28261));
        hashMap2.put(aSN1ObjectIdentifier, StubApp.getString2(28262));
        hashMap2.put(aSN1ObjectIdentifier6, StubApp.getString2(28263));
        hashMap2.put(aSN1ObjectIdentifier2, StubApp.getString2(28052));
        String string24 = StubApp.getString2(23699);
        hashMap2.put(aSN1ObjectIdentifier3, string24);
        hashMap2.put(aSN1ObjectIdentifier4, string24);
        hashMap2.put(aSN1ObjectIdentifier5, string24);
        hashMap2.put(PKCSObjectIdentifiers.rsaEncryption, StubApp.getString2(28053));
        hashMap2.put(aSN1ObjectIdentifier7, StubApp.getString2(28264));
        String string25 = StubApp.getString2(28265);
        hashMap2.put(aSN1ObjectIdentifier8, string25);
        hashMap2.put(aSN1ObjectIdentifier9, string25);
        hashMap2.put(aSN1ObjectIdentifier10, string25);
        hashMap2.put(aSN1ObjectIdentifier11, StubApp.getString2(28266));
        hashMap2.put(aSN1ObjectIdentifier12, string23);
        hashMap3.put(aSN1ObjectIdentifier2, StubApp.getString2(28250));
        String string26 = StubApp.getString2(28251);
        hashMap3.put(aSN1ObjectIdentifier3, string26);
        hashMap3.put(aSN1ObjectIdentifier4, string26);
        hashMap3.put(aSN1ObjectIdentifier5, string26);
        hashMap3.put(aSN1ObjectIdentifier6, StubApp.getString2(28252));
        hashMap4.put(PasswordRecipient.PRF.HMacSHA1.getAlgorithmID(), StubApp.getString2(28267));
        hashMap4.put(PasswordRecipient.PRF.HMacSHA224.getAlgorithmID(), StubApp.getString2(28268));
        hashMap4.put(PasswordRecipient.PRF.HMacSHA256.getAlgorithmID(), StubApp.getString2(28269));
        hashMap4.put(PasswordRecipient.PRF.HMacSHA384.getAlgorithmID(), StubApp.getString2(28270));
        hashMap4.put(PasswordRecipient.PRF.HMacSHA512.getAlgorithmID(), StubApp.getString2(28271));
        hashSet.add(NISTObjectIdentifiers.id_aes128_GCM);
        hashSet.add(NISTObjectIdentifiers.id_aes192_GCM);
        hashSet.add(NISTObjectIdentifiers.id_aes256_GCM);
        hashSet.add(NISTObjectIdentifiers.id_aes128_CCM);
        hashSet.add(NISTObjectIdentifiers.id_aes192_CCM);
        hashSet.add(NISTObjectIdentifiers.id_aes256_CCM);
        rc2Table = new short[]{189, 86, 234, 242, 162, 241, 172, 42, 176, 147, 209, 156, 27, 51, 253, 208, 48, 4, 182, 220, 125, 223, 50, 75, 247, 203, 69, 155, 49, 187, 33, 90, 65, 159, 225, 217, 74, 77, 158, 218, 160, 104, 44, 195, 39, 95, 128, 54, 62, 238, 251, 149, 26, 254, 206, 168, 52, 169, 19, 240, 166, 63, 216, 12, 120, 36, 175, 35, 82, 193, 103, 23, 245, 102, 144, 231, 232, 7, 184, 96, 72, 230, 30, 83, 243, 146, 164, 114, 140, 8, 21, 110, 134, 0, 132, 250, 244, 127, 138, 66, 25, 246, 219, 205, 20, 141, 80, 18, 186, 60, 6, 78, 236, 179, 53, 17, 161, 136, 142, 43, 148, 153, 183, 113, 116, 211, 228, 191, 58, 222, 150, 14, 188, 10, 237, 119, 252, 55, 107, 3, 121, 137, 98, 198, 215, 192, 210, 124, 106, 139, 34, 163, 91, 5, 93, 2, 117, 213, 97, 227, 24, 143, 85, 81, 173, 31, 11, 94, 133, 229, 194, 87, 99, 202, 61, 108, 180, 197, 204, 112, 178, 145, 89, 13, 71, 32, 200, 79, 88, 224, 1, 226, 22, 56, 196, 111, 59, 15, 101, 70, 190, 126, 45, 123, 130, 249, 64, 181, 29, 115, 248, 235, 38, 199, 135, 151, 37, 84, 177, 40, 170, 152, 157, 165, 100, 109, 122, 212, 16, 129, 68, 239, 73, 214, 174, 46, 221, 118, 92, 47, 167, 28, 201, 9, 105, 154, 131, 207, 41, 57, 185, 233, 76, 255, 67, 171};
        rc2Ekb = new short[]{93, 190, 155, 139, 17, 153, 110, 77, 89, 243, 133, 166, 63, 183, 131, 197, 228, 115, 107, 58, 104, 90, 192, 71, 160, 100, 52, 12, 241, 208, 82, 165, 185, 30, 150, 67, 65, 216, 212, 44, 219, 248, 7, 119, 42, 202, 235, 239, 16, 28, 22, 13, 56, 114, 47, 137, 193, 249, 128, 196, 109, 174, 48, 61, 206, 32, 99, 254, 230, 26, 199, 184, 80, 232, 36, 23, 252, 37, 111, 187, 106, 163, 68, 83, 217, 162, 1, 171, 188, 182, 31, 152, 238, 154, 167, 45, 79, 158, 142, 172, 224, 198, 73, 70, 41, 244, 148, 138, 175, 225, 91, 195, 179, 123, 87, 209, 124, 156, 237, 135, 64, 140, 226, 203, 147, 20, 201, 97, 46, 229, 204, 246, 94, 168, 92, 214, 117, 141, 98, 149, 88, 105, 118, 161, 74, 181, 85, 9, 120, 51, 130, 215, 221, 121, 245, 27, 11, 222, 38, 33, 40, 116, 4, 151, 86, 223, 60, 240, 55, 57, 220, 255, 6, 164, 234, 66, 8, 218, 180, 113, 176, 207, 18, 122, 78, 250, 108, 29, 132, 0, 200, 127, 145, 69, 170, 43, 194, 177, 143, 213, 186, 242, 173, 25, 178, 103, 54, 247, 15, 10, 146, 125, 227, 157, 233, 144, 62, 35, 39, 102, 19, 236, 129, 21, 189, 34, 191, 159, 126, 169, 81, 75, 76, 251, 2, 211, 112, 134, 49, 231, 59, 5, 3, 84, 96, 72, 101, 24, 210, 205, 95, 50, 136, 14, 53, 253};
    }

    public EnvelopedDataHelper(JcaJceExtHelper jcaJceExtHelper) {
        this.helper = jcaJceExtHelper;
    }

    public static Object execute(JCECallback jCECallback) throws CMSException {
        try {
            return jCECallback.doInJCE();
        } catch (InvalidAlgorithmParameterException e10) {
            throw new CMSException(StubApp.getString2(28062), e10);
        } catch (InvalidKeyException e11) {
            throw new CMSException(StubApp.getString2(28065), e11);
        } catch (NoSuchAlgorithmException e12) {
            throw new CMSException(StubApp.getString2(28066), e12);
        } catch (NoSuchProviderException e13) {
            throw new CMSException(StubApp.getString2(28064), e13);
        } catch (InvalidParameterSpecException e14) {
            throw new CMSException(StubApp.getString2(28061), e14);
        } catch (NoSuchPaddingException e15) {
            throw new CMSException(StubApp.getString2(28063), e15);
        }
    }

    public byte[] calculateDerivedKey(int i3, char[] cArr, AlgorithmIdentifier algorithmIdentifier, int i10) throws CMSException {
        JcaJceExtHelper jcaJceExtHelper;
        String str;
        PBKDF2Params pBKDF2Params = PBKDF2Params.getInstance(algorithmIdentifier.getParameters());
        try {
            if (i3 == 0) {
                jcaJceExtHelper = this.helper;
                str = StubApp.getString2("28272");
            } else {
                jcaJceExtHelper = this.helper;
                str = (String) PBKDF2_ALG_NAMES.get(pBKDF2Params.getPrf());
            }
            return jcaJceExtHelper.createSecretKeyFactory(str).generateSecret(new PBEKeySpec(cArr, pBKDF2Params.getSalt(), pBKDF2Params.getIterationCount().intValue(), i10)).getEncoded();
        } catch (GeneralSecurityException e10) {
            throw new CMSException(a.h(e10, new StringBuilder(StubApp.getString2(28273))), e10);
        }
    }

    public AlgorithmParameterGenerator createAlgorithmParameterGenerator(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws GeneralSecurityException {
        String str = (String) BASE_CIPHER_NAMES.get(aSN1ObjectIdentifier);
        if (str != null) {
            try {
                return this.helper.createAlgorithmParameterGenerator(str);
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return this.helper.createAlgorithmParameterGenerator(aSN1ObjectIdentifier.getId());
    }

    public AlgorithmParameters createAlgorithmParameters(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws NoSuchAlgorithmException, NoSuchProviderException {
        String str = (String) BASE_CIPHER_NAMES.get(aSN1ObjectIdentifier);
        if (str != null) {
            try {
                return this.helper.createAlgorithmParameters(str);
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return this.helper.createAlgorithmParameters(aSN1ObjectIdentifier.getId());
    }

    public JceAsymmetricKeyUnwrapper createAsymmetricUnwrapper(AlgorithmIdentifier algorithmIdentifier, PrivateKey privateKey) {
        return this.helper.createAsymmetricUnwrapper(algorithmIdentifier, CMSUtils.cleanPrivateKey(privateKey));
    }

    public Cipher createCipher(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws CMSException {
        try {
            String str = (String) CIPHER_ALG_NAMES.get(aSN1ObjectIdentifier);
            if (str != null) {
                try {
                    return this.helper.createCipher(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return this.helper.createCipher(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e10) {
            throw new CMSException(a.h(e10, new StringBuilder(StubApp.getString2(28067))), e10);
        }
    }

    public Cipher createContentCipher(final Key key, final AlgorithmIdentifier algorithmIdentifier) throws CMSException {
        return (Cipher) execute(new JCECallback() { // from class: org.bouncycastle.cms.jcajce.EnvelopedDataHelper.1
            @Override // org.bouncycastle.cms.jcajce.EnvelopedDataHelper.JCECallback
            public Object doInJCE() throws CMSException, InvalidAlgorithmParameterException, InvalidKeyException, InvalidParameterSpecException, NoSuchAlgorithmException, NoSuchPaddingException, NoSuchProviderException {
                Cipher createCipher = EnvelopedDataHelper.this.createCipher(algorithmIdentifier.getAlgorithm());
                ASN1Encodable parameters = algorithmIdentifier.getParameters();
                String id = algorithmIdentifier.getAlgorithm().getId();
                String string2 = StubApp.getString2(27377);
                if (parameters == null || (parameters instanceof ASN1Null)) {
                    if (id.equals(CMSAlgorithm.DES_CBC.getId()) || id.equals(CMSEnvelopedGenerator.DES_EDE3_CBC) || id.equals(string2) || id.equals(StubApp.getString2(27378))) {
                        createCipher.init(2, key, new IvParameterSpec(new byte[8]));
                        return createCipher;
                    }
                    createCipher.init(2, key);
                    return createCipher;
                }
                try {
                    AlgorithmParameters createAlgorithmParameters = EnvelopedDataHelper.this.createAlgorithmParameters(algorithmIdentifier.getAlgorithm());
                    CMSUtils.loadParameters(createAlgorithmParameters, parameters);
                    createCipher.init(2, key, createAlgorithmParameters);
                    return createCipher;
                } catch (NoSuchAlgorithmException e10) {
                    if (!id.equals(CMSAlgorithm.DES_CBC.getId()) && !id.equals(CMSEnvelopedGenerator.DES_EDE3_CBC) && !id.equals(string2) && !id.equals(CMSEnvelopedGenerator.AES128_CBC) && !id.equals(CMSEnvelopedGenerator.AES192_CBC) && !id.equals(CMSEnvelopedGenerator.AES256_CBC)) {
                        throw e10;
                    }
                    createCipher.init(2, key, new IvParameterSpec(ASN1OctetString.getInstance(parameters).getOctets()));
                    return createCipher;
                }
            }
        });
    }

    public Mac createContentMac(final Key key, final AlgorithmIdentifier algorithmIdentifier) throws CMSException {
        return (Mac) execute(new JCECallback() { // from class: org.bouncycastle.cms.jcajce.EnvelopedDataHelper.2
            @Override // org.bouncycastle.cms.jcajce.EnvelopedDataHelper.JCECallback
            public Object doInJCE() throws CMSException, InvalidAlgorithmParameterException, InvalidKeyException, InvalidParameterSpecException, NoSuchAlgorithmException, NoSuchPaddingException, NoSuchProviderException {
                Mac createMac = EnvelopedDataHelper.this.createMac(algorithmIdentifier.getAlgorithm());
                ASN1Encodable parameters = algorithmIdentifier.getParameters();
                algorithmIdentifier.getAlgorithm().getId();
                if (parameters == null || (parameters instanceof ASN1Null)) {
                    createMac.init(key);
                    return createMac;
                }
                AlgorithmParameters createAlgorithmParameters = EnvelopedDataHelper.this.createAlgorithmParameters(algorithmIdentifier.getAlgorithm());
                CMSUtils.loadParameters(createAlgorithmParameters, parameters);
                createMac.init(key, createAlgorithmParameters.getParameterSpec(AlgorithmParameterSpec.class));
                return createMac;
            }
        });
    }

    public KeyAgreement createKeyAgreement(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws CMSException {
        try {
            String str = (String) BASE_CIPHER_NAMES.get(aSN1ObjectIdentifier);
            if (str != null) {
                try {
                    return this.helper.createKeyAgreement(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return this.helper.createKeyAgreement(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e10) {
            throw new CMSException(a.h(e10, new StringBuilder(StubApp.getString2(28274))), e10);
        }
    }

    public KeyFactory createKeyFactory(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws CMSException {
        try {
            String str = (String) BASE_CIPHER_NAMES.get(aSN1ObjectIdentifier);
            if (str != null) {
                try {
                    return this.helper.createKeyFactory(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return this.helper.createKeyFactory(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e10) {
            throw new CMSException(a.h(e10, new StringBuilder(StubApp.getString2(28275))), e10);
        }
    }

    public KeyGenerator createKeyGenerator(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws CMSException {
        try {
            String str = (String) BASE_CIPHER_NAMES.get(aSN1ObjectIdentifier);
            if (str != null) {
                try {
                    return this.helper.createKeyGenerator(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return this.helper.createKeyGenerator(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e10) {
            throw new CMSException(a.h(e10, new StringBuilder(StubApp.getString2(28068))), e10);
        }
    }

    public KeyPairGenerator createKeyPairGenerator(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws CMSException {
        try {
            String str = (String) BASE_CIPHER_NAMES.get(aSN1ObjectIdentifier);
            if (str != null) {
                try {
                    return this.helper.createKeyPairGenerator(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return this.helper.createKeyPairGenerator(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e10) {
            throw new CMSException(a.h(e10, new StringBuilder(StubApp.getString2(28276))), e10);
        }
    }

    public Mac createMac(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws CMSException {
        try {
            String str = (String) MAC_ALG_NAMES.get(aSN1ObjectIdentifier);
            if (str != null) {
                try {
                    return this.helper.createMac(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return this.helper.createMac(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e10) {
            throw new CMSException(a.h(e10, new StringBuilder(StubApp.getString2(28069))), e10);
        }
    }

    public Cipher createRFC3211Wrapper(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws CMSException {
        String str = (String) BASE_CIPHER_NAMES.get(aSN1ObjectIdentifier);
        if (str == null) {
            throw new CMSException(a.e(StubApp.getString2(28278), aSN1ObjectIdentifier));
        }
        try {
            return this.helper.createCipher(str.concat(StubApp.getString2(28277)));
        } catch (GeneralSecurityException e10) {
            throw new CMSException(a.h(e10, new StringBuilder(StubApp.getString2(28067))), e10);
        }
    }

    public SecretKeyFactory createSecretKeyFactory(String str) throws NoSuchProviderException, NoSuchAlgorithmException {
        return this.helper.createSecretKeyFactory(str);
    }

    public SymmetricKeyUnwrapper createSymmetricUnwrapper(AlgorithmIdentifier algorithmIdentifier, SecretKey secretKey) {
        return this.helper.createSymmetricUnwrapper(algorithmIdentifier, secretKey);
    }

    public AlgorithmParameters generateParameters(ASN1ObjectIdentifier aSN1ObjectIdentifier, SecretKey secretKey, SecureRandom secureRandom) throws CMSException {
        String string2 = StubApp.getString2(28070);
        try {
            AlgorithmParameterGenerator createAlgorithmParameterGenerator = createAlgorithmParameterGenerator(aSN1ObjectIdentifier);
            if (aSN1ObjectIdentifier.equals((ASN1Primitive) CMSAlgorithm.RC2_CBC)) {
                byte[] bArr = new byte[8];
                secureRandom.nextBytes(bArr);
                try {
                    createAlgorithmParameterGenerator.init(new RC2ParameterSpec(secretKey.getEncoded().length * 8, bArr), secureRandom);
                } catch (InvalidAlgorithmParameterException e10) {
                    throw new CMSException(string2 + e10, e10);
                }
            }
            return createAlgorithmParameterGenerator.generateParameters();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        } catch (GeneralSecurityException e11) {
            throw new CMSException(StubApp.getString2(28071) + e11, e11);
        }
    }

    public AlgorithmIdentifier getAlgorithmIdentifier(ASN1ObjectIdentifier aSN1ObjectIdentifier, AlgorithmParameters algorithmParameters) throws CMSException {
        return new AlgorithmIdentifier(aSN1ObjectIdentifier, algorithmParameters != null ? CMSUtils.extractParameters(algorithmParameters) : DERNull.INSTANCE);
    }

    public String getBaseCipherName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String str = (String) BASE_CIPHER_NAMES.get(aSN1ObjectIdentifier);
        return str == null ? aSN1ObjectIdentifier.getId() : str;
    }

    public Key getJceKey(ASN1ObjectIdentifier aSN1ObjectIdentifier, GenericKey genericKey) {
        if (genericKey.getRepresentation() instanceof Key) {
            return (Key) genericKey.getRepresentation();
        }
        if (genericKey.getRepresentation() instanceof byte[]) {
            return new SecretKeySpec((byte[]) genericKey.getRepresentation(), getBaseCipherName(aSN1ObjectIdentifier));
        }
        throw new IllegalArgumentException(StubApp.getString2(28249));
    }

    public boolean isAuthEnveloped(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return authEnvelopedAlgorithms.contains(aSN1ObjectIdentifier);
    }

    public void keySizeCheck(AlgorithmIdentifier algorithmIdentifier, Key key) throws CMSException {
        byte[] bArr;
        int keySize = KEY_SIZE_PROVIDER.getKeySize(algorithmIdentifier);
        if (keySize > 0) {
            try {
                bArr = key.getEncoded();
            } catch (Exception unused) {
                bArr = null;
            }
            if (bArr != null && bArr.length * 8 != keySize) {
                throw new CMSException(StubApp.getString2(28281));
            }
        }
    }

    public JceKTSKeyUnwrapper createAsymmetricUnwrapper(AlgorithmIdentifier algorithmIdentifier, PrivateKey privateKey, byte[] bArr, byte[] bArr2) {
        return this.helper.createAsymmetricUnwrapper(algorithmIdentifier, CMSUtils.cleanPrivateKey(privateKey), bArr, bArr2);
    }

    public AlgorithmIdentifier getAlgorithmIdentifier(ASN1ObjectIdentifier aSN1ObjectIdentifier, AlgorithmParameterSpec algorithmParameterSpec) {
        if (algorithmParameterSpec instanceof IvParameterSpec) {
            return new AlgorithmIdentifier(aSN1ObjectIdentifier, new DEROctetString(((IvParameterSpec) algorithmParameterSpec).getIV()));
        }
        if (!(algorithmParameterSpec instanceof RC2ParameterSpec)) {
            throw new IllegalStateException(StubApp.getString2(28279) + algorithmParameterSpec);
        }
        RC2ParameterSpec rC2ParameterSpec = (RC2ParameterSpec) algorithmParameterSpec;
        int effectiveKeyBits = rC2ParameterSpec.getEffectiveKeyBits();
        if (effectiveKeyBits == -1) {
            return new AlgorithmIdentifier(aSN1ObjectIdentifier, new RC2CBCParameter(rC2ParameterSpec.getIV()));
        }
        int i3 = effectiveKeyBits;
        if (effectiveKeyBits < 256) {
            i3 = rc2Table[effectiveKeyBits];
        }
        return new AlgorithmIdentifier(aSN1ObjectIdentifier, new RC2CBCParameter(i3, rC2ParameterSpec.getIV()));
    }

    public Key getJceKey(GenericKey genericKey) {
        if (genericKey.getRepresentation() instanceof Key) {
            return (Key) genericKey.getRepresentation();
        }
        if (genericKey.getRepresentation() instanceof byte[]) {
            return new SecretKeySpec((byte[]) genericKey.getRepresentation(), StubApp.getString2(28280));
        }
        throw new IllegalArgumentException(StubApp.getString2(28249));
    }
}
