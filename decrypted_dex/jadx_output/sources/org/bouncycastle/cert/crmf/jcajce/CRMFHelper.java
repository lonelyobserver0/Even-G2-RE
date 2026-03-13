package org.bouncycastle.cert.crmf.jcajce;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.security.AlgorithmParameterGenerator;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.iana.IANAObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.cert.crmf.CRMFException;
import org.bouncycastle.cms.CMSAlgorithm;
import org.bouncycastle.jcajce.util.AlgorithmParametersUtils;
import org.bouncycastle.jcajce.util.JcaJceHelper;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class CRMFHelper {
    protected static final Map BASE_CIPHER_NAMES;
    protected static final Map CIPHER_ALG_NAMES;
    protected static final Map DIGEST_ALG_NAMES;
    protected static final Map KEY_ALG_NAMES;
    protected static final Map MAC_ALG_NAMES;
    private JcaJceHelper helper;

    public interface JCECallback {
        Object doInJCE() throws CRMFException, InvalidAlgorithmParameterException, InvalidKeyException, InvalidParameterSpecException, NoSuchAlgorithmException, NoSuchPaddingException, NoSuchProviderException;
    }

    static {
        HashMap hashMap = new HashMap();
        BASE_CIPHER_NAMES = hashMap;
        HashMap hashMap2 = new HashMap();
        CIPHER_ALG_NAMES = hashMap2;
        HashMap hashMap3 = new HashMap();
        DIGEST_ALG_NAMES = hashMap3;
        HashMap hashMap4 = new HashMap();
        KEY_ALG_NAMES = hashMap4;
        HashMap hashMap5 = new HashMap();
        MAC_ALG_NAMES = hashMap5;
        hashMap.put(PKCSObjectIdentifiers.des_EDE3_CBC, StubApp.getString2(28051));
        ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.id_aes128_CBC;
        String string2 = StubApp.getString2(461);
        hashMap.put(aSN1ObjectIdentifier, string2);
        hashMap.put(NISTObjectIdentifiers.id_aes192_CBC, string2);
        hashMap.put(NISTObjectIdentifiers.id_aes256_CBC, string2);
        hashMap2.put(CMSAlgorithm.DES_EDE3_CBC, StubApp.getString2(28052));
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = CMSAlgorithm.AES128_CBC;
        String string22 = StubApp.getString2(23699);
        hashMap2.put(aSN1ObjectIdentifier2, string22);
        hashMap2.put(CMSAlgorithm.AES192_CBC, string22);
        hashMap2.put(CMSAlgorithm.AES256_CBC, string22);
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = PKCSObjectIdentifiers.rsaEncryption;
        hashMap2.put(new ASN1ObjectIdentifier(aSN1ObjectIdentifier3.getId()), StubApp.getString2(28053));
        hashMap3.put(OIWObjectIdentifiers.idSHA1, StubApp.getString2(21748));
        hashMap3.put(NISTObjectIdentifiers.id_sha224, StubApp.getString2(28054));
        hashMap3.put(NISTObjectIdentifiers.id_sha256, StubApp.getString2(21749));
        hashMap3.put(NISTObjectIdentifiers.id_sha384, StubApp.getString2(21750));
        hashMap3.put(NISTObjectIdentifiers.id_sha512, StubApp.getString2(21751));
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = IANAObjectIdentifiers.hmacSHA1;
        String string23 = StubApp.getString2(28055);
        hashMap5.put(aSN1ObjectIdentifier4, string23);
        hashMap5.put(PKCSObjectIdentifiers.id_hmacWithSHA1, string23);
        hashMap5.put(PKCSObjectIdentifiers.id_hmacWithSHA224, StubApp.getString2(28056));
        hashMap5.put(PKCSObjectIdentifiers.id_hmacWithSHA256, StubApp.getString2(28057));
        hashMap5.put(PKCSObjectIdentifiers.id_hmacWithSHA384, StubApp.getString2(28058));
        hashMap5.put(PKCSObjectIdentifiers.id_hmacWithSHA512, StubApp.getString2(28059));
        hashMap4.put(aSN1ObjectIdentifier3, StubApp.getString2(24659));
        hashMap4.put(X9ObjectIdentifiers.id_dsa, StubApp.getString2(28060));
    }

    public CRMFHelper(JcaJceHelper jcaJceHelper) {
        this.helper = jcaJceHelper;
    }

    public static Object execute(JCECallback jCECallback) throws CRMFException {
        try {
            return jCECallback.doInJCE();
        } catch (InvalidAlgorithmParameterException e10) {
            throw new CRMFException(StubApp.getString2(28062), e10);
        } catch (InvalidKeyException e11) {
            throw new CRMFException(StubApp.getString2(28065), e11);
        } catch (NoSuchAlgorithmException e12) {
            throw new CRMFException(StubApp.getString2(28066), e12);
        } catch (NoSuchProviderException e13) {
            throw new CRMFException(StubApp.getString2(28064), e13);
        } catch (InvalidParameterSpecException e14) {
            throw new CRMFException(StubApp.getString2(28061), e14);
        } catch (NoSuchPaddingException e15) {
            throw new CRMFException(StubApp.getString2(28063), e15);
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

    public Cipher createCipher(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws CRMFException {
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
            throw new CRMFException(a.h(e10, new StringBuilder(StubApp.getString2(28067))), e10);
        }
    }

    public Cipher createContentCipher(final Key key, final AlgorithmIdentifier algorithmIdentifier) throws CRMFException {
        return (Cipher) execute(new JCECallback() { // from class: org.bouncycastle.cert.crmf.jcajce.CRMFHelper.1
            @Override // org.bouncycastle.cert.crmf.jcajce.CRMFHelper.JCECallback
            public Object doInJCE() throws CRMFException, InvalidAlgorithmParameterException, InvalidKeyException, InvalidParameterSpecException, NoSuchAlgorithmException, NoSuchPaddingException, NoSuchProviderException {
                Cipher createCipher = CRMFHelper.this.createCipher(algorithmIdentifier.getAlgorithm());
                ASN1Primitive aSN1Primitive = (ASN1Primitive) algorithmIdentifier.getParameters();
                ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
                if (aSN1Primitive == null || (aSN1Primitive instanceof ASN1Null)) {
                    if (algorithm.equals((ASN1Primitive) CMSAlgorithm.DES_EDE3_CBC) || algorithm.equals((ASN1Primitive) CMSAlgorithm.IDEA_CBC) || algorithm.equals((ASN1Primitive) CMSAlgorithm.CAST5_CBC)) {
                        createCipher.init(2, key, new IvParameterSpec(new byte[8]));
                        return createCipher;
                    }
                    createCipher.init(2, key);
                    return createCipher;
                }
                try {
                    AlgorithmParameters createAlgorithmParameters = CRMFHelper.this.createAlgorithmParameters(algorithmIdentifier.getAlgorithm());
                    try {
                        AlgorithmParametersUtils.loadParameters(createAlgorithmParameters, aSN1Primitive);
                        createCipher.init(2, key, createAlgorithmParameters);
                        return createCipher;
                    } catch (IOException e10) {
                        throw new CRMFException(StubApp.getString2("28050"), e10);
                    }
                } catch (NoSuchAlgorithmException e11) {
                    if (!algorithm.equals((ASN1Primitive) CMSAlgorithm.DES_EDE3_CBC) && !algorithm.equals((ASN1Primitive) CMSAlgorithm.IDEA_CBC) && !algorithm.equals((ASN1Primitive) CMSAlgorithm.AES128_CBC) && !algorithm.equals((ASN1Primitive) CMSAlgorithm.AES192_CBC) && !algorithm.equals((ASN1Primitive) CMSAlgorithm.AES256_CBC)) {
                        throw e11;
                    }
                    createCipher.init(2, key, new IvParameterSpec(ASN1OctetString.getInstance(aSN1Primitive).getOctets()));
                    return createCipher;
                }
            }
        });
    }

    public MessageDigest createDigest(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws CRMFException {
        try {
            String str = (String) DIGEST_ALG_NAMES.get(aSN1ObjectIdentifier);
            if (str != null) {
                try {
                    return this.helper.createMessageDigest(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return this.helper.createMessageDigest(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e10) {
            throw new CRMFException(a.h(e10, new StringBuilder(StubApp.getString2(28067))), e10);
        }
    }

    public KeyFactory createKeyFactory(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws CRMFException {
        try {
            String str = (String) KEY_ALG_NAMES.get(aSN1ObjectIdentifier);
            if (str != null) {
                try {
                    return this.helper.createKeyFactory(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return this.helper.createKeyFactory(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e10) {
            throw new CRMFException(a.h(e10, new StringBuilder(StubApp.getString2(28067))), e10);
        }
    }

    public KeyGenerator createKeyGenerator(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws CRMFException {
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
            throw new CRMFException(a.h(e10, new StringBuilder(StubApp.getString2(28068))), e10);
        }
    }

    public Mac createMac(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws CRMFException {
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
            throw new CRMFException(a.h(e10, new StringBuilder(StubApp.getString2(28069))), e10);
        }
    }

    public AlgorithmParameters generateParameters(ASN1ObjectIdentifier aSN1ObjectIdentifier, SecretKey secretKey, SecureRandom secureRandom) throws CRMFException {
        String string2 = StubApp.getString2(28070);
        try {
            AlgorithmParameterGenerator createAlgorithmParameterGenerator = createAlgorithmParameterGenerator(aSN1ObjectIdentifier);
            if (aSN1ObjectIdentifier.equals((ASN1Primitive) CMSAlgorithm.RC2_CBC)) {
                byte[] bArr = new byte[8];
                secureRandom.nextBytes(bArr);
                try {
                    createAlgorithmParameterGenerator.init(new RC2ParameterSpec(secretKey.getEncoded().length * 8, bArr), secureRandom);
                } catch (InvalidAlgorithmParameterException e10) {
                    throw new CRMFException(string2 + e10, e10);
                }
            }
            return createAlgorithmParameterGenerator.generateParameters();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        } catch (GeneralSecurityException e11) {
            throw new CRMFException(StubApp.getString2(28071) + e11, e11);
        }
    }

    public AlgorithmIdentifier getAlgorithmIdentifier(ASN1ObjectIdentifier aSN1ObjectIdentifier, AlgorithmParameters algorithmParameters) throws CRMFException {
        ASN1Encodable extractParameters;
        if (algorithmParameters != null) {
            try {
                extractParameters = AlgorithmParametersUtils.extractParameters(algorithmParameters);
            } catch (IOException e10) {
                throw new CRMFException(u.q(e10, new StringBuilder(StubApp.getString2(28072))), e10);
            }
        } else {
            extractParameters = DERNull.INSTANCE;
        }
        return new AlgorithmIdentifier(aSN1ObjectIdentifier, extractParameters);
    }

    public PublicKey toPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) throws CRMFException {
        try {
            return createKeyFactory(subjectPublicKeyInfo.getAlgorithm().getAlgorithm()).generatePublic(new X509EncodedKeySpec(subjectPublicKeyInfo.getEncoded()));
        } catch (Exception e10) {
            throw new CRMFException(u.r(e10, new StringBuilder(StubApp.getString2(28073))), e10);
        }
    }
}
