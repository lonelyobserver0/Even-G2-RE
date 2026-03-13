package org.bouncycastle.cms.bc;

import com.stub.StubApp;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cms.CMSAlgorithm;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.digests.SHA224Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA384Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.engines.DESEngine;
import org.bouncycastle.crypto.engines.DESedeEngine;
import org.bouncycastle.crypto.engines.RC2Engine;
import org.bouncycastle.crypto.engines.RFC3211WrapEngine;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.util.AlgorithmIdentifierFactory;
import org.bouncycastle.crypto.util.CipherFactory;
import org.bouncycastle.crypto.util.CipherKeyGeneratorFactory;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.bc.BcDigestProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class EnvelopedDataHelper {
    protected static final Map BASE_CIPHER_NAMES;
    protected static final Map MAC_ALG_NAMES;
    private static final Set authEnvelopedAlgorithms;
    private static final Map prfs;

    static {
        HashMap hashMap = new HashMap();
        BASE_CIPHER_NAMES = hashMap;
        HashMap hashMap2 = new HashMap();
        MAC_ALG_NAMES = hashMap2;
        HashSet hashSet = new HashSet();
        authEnvelopedAlgorithms = hashSet;
        prfs = createTable();
        ASN1ObjectIdentifier aSN1ObjectIdentifier = CMSAlgorithm.DES_EDE3_CBC;
        hashMap.put(aSN1ObjectIdentifier, StubApp.getString2(28051));
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = CMSAlgorithm.AES128_CBC;
        String string2 = StubApp.getString2(461);
        hashMap.put(aSN1ObjectIdentifier2, string2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = CMSAlgorithm.AES192_CBC;
        hashMap.put(aSN1ObjectIdentifier3, string2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = CMSAlgorithm.AES256_CBC;
        hashMap.put(aSN1ObjectIdentifier4, string2);
        hashMap2.put(aSN1ObjectIdentifier, StubApp.getString2(28250));
        String string22 = StubApp.getString2(28251);
        hashMap2.put(aSN1ObjectIdentifier2, string22);
        hashMap2.put(aSN1ObjectIdentifier3, string22);
        hashMap2.put(aSN1ObjectIdentifier4, string22);
        hashMap2.put(CMSAlgorithm.RC2_CBC, StubApp.getString2(28252));
        hashSet.add(NISTObjectIdentifiers.id_aes128_GCM);
        hashSet.add(NISTObjectIdentifiers.id_aes192_GCM);
        hashSet.add(NISTObjectIdentifiers.id_aes256_GCM);
        hashSet.add(NISTObjectIdentifiers.id_aes128_CCM);
        hashSet.add(NISTObjectIdentifiers.id_aes192_CCM);
        hashSet.add(NISTObjectIdentifiers.id_aes256_CCM);
    }

    public static Object createContentCipher(boolean z2, CipherParameters cipherParameters, AlgorithmIdentifier algorithmIdentifier) throws CMSException {
        try {
            return CipherFactory.createContentCipher(z2, cipherParameters, algorithmIdentifier);
        } catch (IllegalArgumentException e10) {
            throw new CMSException(e10.getMessage(), e10);
        }
    }

    public static Wrapper createRFC3211Wrapper(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws CMSException {
        if (NISTObjectIdentifiers.id_aes128_CBC.equals((ASN1Primitive) aSN1ObjectIdentifier) || NISTObjectIdentifiers.id_aes192_CBC.equals((ASN1Primitive) aSN1ObjectIdentifier) || NISTObjectIdentifiers.id_aes256_CBC.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
            return new RFC3211WrapEngine(new AESEngine());
        }
        if (PKCSObjectIdentifiers.des_EDE3_CBC.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
            return new RFC3211WrapEngine(new DESedeEngine());
        }
        if (OIWObjectIdentifiers.desCBC.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
            return new RFC3211WrapEngine(new DESEngine());
        }
        if (PKCSObjectIdentifiers.RC2_CBC.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
            return new RFC3211WrapEngine(new RC2Engine());
        }
        throw new CMSException(a.e(StubApp.getString2(28253), aSN1ObjectIdentifier));
    }

    private static Map createTable() {
        HashMap hashMap = new HashMap();
        hashMap.put(PKCSObjectIdentifiers.id_hmacWithSHA1, new BcDigestProvider() { // from class: org.bouncycastle.cms.bc.EnvelopedDataHelper.1
            @Override // org.bouncycastle.operator.bc.BcDigestProvider
            public ExtendedDigest get(AlgorithmIdentifier algorithmIdentifier) {
                return new SHA1Digest();
            }
        });
        hashMap.put(PKCSObjectIdentifiers.id_hmacWithSHA224, new BcDigestProvider() { // from class: org.bouncycastle.cms.bc.EnvelopedDataHelper.2
            @Override // org.bouncycastle.operator.bc.BcDigestProvider
            public ExtendedDigest get(AlgorithmIdentifier algorithmIdentifier) {
                return new SHA224Digest();
            }
        });
        hashMap.put(PKCSObjectIdentifiers.id_hmacWithSHA256, new BcDigestProvider() { // from class: org.bouncycastle.cms.bc.EnvelopedDataHelper.3
            @Override // org.bouncycastle.operator.bc.BcDigestProvider
            public ExtendedDigest get(AlgorithmIdentifier algorithmIdentifier) {
                return new SHA256Digest();
            }
        });
        hashMap.put(PKCSObjectIdentifiers.id_hmacWithSHA384, new BcDigestProvider() { // from class: org.bouncycastle.cms.bc.EnvelopedDataHelper.4
            @Override // org.bouncycastle.operator.bc.BcDigestProvider
            public ExtendedDigest get(AlgorithmIdentifier algorithmIdentifier) {
                return new SHA384Digest();
            }
        });
        hashMap.put(PKCSObjectIdentifiers.id_hmacWithSHA512, new BcDigestProvider() { // from class: org.bouncycastle.cms.bc.EnvelopedDataHelper.5
            @Override // org.bouncycastle.operator.bc.BcDigestProvider
            public ExtendedDigest get(AlgorithmIdentifier algorithmIdentifier) {
                return new SHA512Digest();
            }
        });
        return Collections.unmodifiableMap(hashMap);
    }

    public static ExtendedDigest getPRF(AlgorithmIdentifier algorithmIdentifier) throws OperatorCreationException {
        return ((BcDigestProvider) prfs.get(algorithmIdentifier.getAlgorithm())).get(null);
    }

    public CipherKeyGenerator createKeyGenerator(ASN1ObjectIdentifier aSN1ObjectIdentifier, int i3, SecureRandom secureRandom) throws CMSException {
        try {
            return CipherKeyGeneratorFactory.createKeyGenerator(aSN1ObjectIdentifier, secureRandom);
        } catch (IllegalArgumentException e10) {
            throw new CMSException(e10.getMessage(), e10);
        }
    }

    public AlgorithmIdentifier generateEncryptionAlgID(ASN1ObjectIdentifier aSN1ObjectIdentifier, KeyParameter keyParameter, SecureRandom secureRandom) throws CMSException {
        try {
            return AlgorithmIdentifierFactory.generateEncryptionAlgID(aSN1ObjectIdentifier, keyParameter.getKey().length * 8, secureRandom);
        } catch (IllegalArgumentException e10) {
            throw new CMSException(e10.getMessage(), e10);
        }
    }

    public boolean isAuthEnveloped(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return authEnvelopedAlgorithms.contains(aSN1ObjectIdentifier);
    }
}
