package org.bouncycastle.openssl.jcajce;

import E1.a;
import com.stub.StubApp;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.spec.InvalidKeySpecException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.openssl.EncryptionException;
import org.bouncycastle.openssl.PEMException;
import org.bouncycastle.util.Integers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class PEMUtilities {
    private static final Map CIPHER_NAMES;
    private static final Map KEYSIZES;
    private static final Map KEY_NAMES;
    private static final Set PKCS5_SCHEME_1;
    private static final Set PKCS5_SCHEME_2;
    private static final Map PRFS;
    private static final Map PRFS_SALT;

    static {
        HashMap hashMap = new HashMap();
        KEYSIZES = hashMap;
        HashSet hashSet = new HashSet();
        PKCS5_SCHEME_1 = hashSet;
        HashSet hashSet2 = new HashSet();
        PKCS5_SCHEME_2 = hashSet2;
        HashMap hashMap2 = new HashMap();
        PRFS = hashMap2;
        HashMap hashMap3 = new HashMap();
        PRFS_SALT = hashMap3;
        HashMap hashMap4 = new HashMap();
        CIPHER_NAMES = hashMap4;
        HashMap hashMap5 = new HashMap();
        KEY_NAMES = hashMap5;
        hashSet.add(PKCSObjectIdentifiers.pbeWithMD2AndDES_CBC);
        hashSet.add(PKCSObjectIdentifiers.pbeWithMD2AndRC2_CBC);
        hashSet.add(PKCSObjectIdentifiers.pbeWithMD5AndDES_CBC);
        hashSet.add(PKCSObjectIdentifiers.pbeWithMD5AndRC2_CBC);
        hashSet.add(PKCSObjectIdentifiers.pbeWithSHA1AndDES_CBC);
        hashSet.add(PKCSObjectIdentifiers.pbeWithSHA1AndRC2_CBC);
        hashSet2.add(PKCSObjectIdentifiers.id_PBES2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.des_EDE3_CBC;
        hashSet2.add(aSN1ObjectIdentifier);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_aes128_CBC;
        hashSet2.add(aSN1ObjectIdentifier2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_aes192_CBC;
        hashSet2.add(aSN1ObjectIdentifier3);
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NISTObjectIdentifiers.id_aes256_CBC;
        hashSet2.add(aSN1ObjectIdentifier4);
        hashMap.put(aSN1ObjectIdentifier.getId(), Integers.valueOf(192));
        hashMap.put(aSN1ObjectIdentifier2.getId(), Integers.valueOf(128));
        hashMap.put(aSN1ObjectIdentifier3.getId(), Integers.valueOf(192));
        hashMap.put(aSN1ObjectIdentifier4.getId(), Integers.valueOf(256));
        hashMap.put(PKCSObjectIdentifiers.pbeWithSHAAnd128BitRC4.getId(), Integers.valueOf(128));
        hashMap.put(PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC4, Integers.valueOf(40));
        hashMap.put(PKCSObjectIdentifiers.pbeWithSHAAnd2_KeyTripleDES_CBC, Integers.valueOf(128));
        hashMap.put(PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC, Integers.valueOf(192));
        hashMap.put(PKCSObjectIdentifiers.pbeWithSHAAnd128BitRC2_CBC, Integers.valueOf(128));
        hashMap.put(PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC2_CBC, Integers.valueOf(40));
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = PKCSObjectIdentifiers.id_hmacWithSHA1;
        hashMap2.put(aSN1ObjectIdentifier5, StubApp.getString2(33682));
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = PKCSObjectIdentifiers.id_hmacWithSHA256;
        hashMap2.put(aSN1ObjectIdentifier6, StubApp.getString2(33683));
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = PKCSObjectIdentifiers.id_hmacWithSHA512;
        hashMap2.put(aSN1ObjectIdentifier7, StubApp.getString2(33684));
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = PKCSObjectIdentifiers.id_hmacWithSHA224;
        hashMap2.put(aSN1ObjectIdentifier8, StubApp.getString2(33685));
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = PKCSObjectIdentifiers.id_hmacWithSHA384;
        hashMap2.put(aSN1ObjectIdentifier9, StubApp.getString2(33686));
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = NISTObjectIdentifiers.id_hmacWithSHA3_224;
        hashMap2.put(aSN1ObjectIdentifier10, StubApp.getString2(33687));
        ASN1ObjectIdentifier aSN1ObjectIdentifier11 = NISTObjectIdentifiers.id_hmacWithSHA3_256;
        hashMap2.put(aSN1ObjectIdentifier11, StubApp.getString2(33688));
        ASN1ObjectIdentifier aSN1ObjectIdentifier12 = NISTObjectIdentifiers.id_hmacWithSHA3_384;
        hashMap2.put(aSN1ObjectIdentifier12, StubApp.getString2(33689));
        ASN1ObjectIdentifier aSN1ObjectIdentifier13 = NISTObjectIdentifiers.id_hmacWithSHA3_512;
        hashMap2.put(aSN1ObjectIdentifier13, StubApp.getString2(33690));
        ASN1ObjectIdentifier aSN1ObjectIdentifier14 = CryptoProObjectIdentifiers.gostR3411Hmac;
        hashMap2.put(aSN1ObjectIdentifier14, StubApp.getString2(33691));
        hashMap3.put(aSN1ObjectIdentifier5, Integers.valueOf(20));
        hashMap3.put(aSN1ObjectIdentifier6, Integers.valueOf(32));
        hashMap3.put(aSN1ObjectIdentifier7, Integers.valueOf(64));
        hashMap3.put(aSN1ObjectIdentifier8, Integers.valueOf(28));
        hashMap3.put(aSN1ObjectIdentifier9, Integers.valueOf(48));
        hashMap3.put(aSN1ObjectIdentifier10, Integers.valueOf(28));
        hashMap3.put(aSN1ObjectIdentifier11, Integers.valueOf(32));
        hashMap3.put(aSN1ObjectIdentifier12, Integers.valueOf(48));
        hashMap3.put(aSN1ObjectIdentifier13, Integers.valueOf(64));
        hashMap3.put(aSN1ObjectIdentifier14, Integers.valueOf(32));
        hashMap4.put(aSN1ObjectIdentifier, StubApp.getString2(28052));
        String string2 = StubApp.getString2(460);
        hashMap4.put(aSN1ObjectIdentifier2, string2);
        hashMap4.put(aSN1ObjectIdentifier3, string2);
        hashMap4.put(aSN1ObjectIdentifier4, string2);
        hashMap5.put(aSN1ObjectIdentifier.getId(), StubApp.getString2(28051));
        String id = aSN1ObjectIdentifier2.getId();
        String string22 = StubApp.getString2(461);
        hashMap5.put(id, string22);
        hashMap5.put(aSN1ObjectIdentifier3.getId(), string22);
        hashMap5.put(aSN1ObjectIdentifier4.getId(), string22);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [javax.crypto.spec.RC2ParameterSpec] */
    /* JADX WARN: Type inference failed for: r0v18, types: [javax.crypto.spec.RC2ParameterSpec] */
    /* JADX WARN: Type inference failed for: r0v6, types: [javax.crypto.spec.RC2ParameterSpec] */
    public static byte[] crypt(boolean z2, JcaJceHelper jcaJceHelper, byte[] bArr, char[] cArr, String str, byte[] bArr2) throws PEMException {
        String string2;
        String string22;
        String str2;
        byte[] bArr3;
        String string23;
        SecretKey key;
        String string24;
        String str3;
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
        boolean endsWith = str.endsWith(StubApp.getString2(33654));
        String string25 = StubApp.getString2(32419);
        if (endsWith) {
            string2 = StubApp.getString2(29076);
            string22 = string25;
        } else {
            string2 = StubApp.getString2(32384);
            string22 = StubApp.getString2(33692);
        }
        boolean endsWith2 = str.endsWith(StubApp.getString2(33655));
        String string26 = StubApp.getString2(33656);
        String string27 = StubApp.getString2(33657);
        if (endsWith2 || string27.equals(str) || string26.equals(str)) {
            string2 = StubApp.getString2(30742);
            ivParameterSpec = null;
        }
        IvParameterSpec ivParameterSpec2 = ivParameterSpec;
        if (str.endsWith(StubApp.getString2(33658))) {
            string2 = StubApp.getString2(32385);
            str2 = string25;
        } else {
            str2 = string22;
        }
        String str4 = string2;
        boolean startsWith = str.startsWith(string27);
        int i3 = 1;
        if (startsWith) {
            boolean z10 = !str.startsWith(string26);
            str3 = StubApp.getString2(28590);
            key = getKey(jcaJceHelper, cArr, str3, 24, bArr2, z10);
        } else {
            if (str.startsWith(StubApp.getString2(33659))) {
                string23 = StubApp.getString2(28171);
                key = getKey(jcaJceHelper, cArr, string23, 8, bArr2);
            } else {
                if (str.startsWith(StubApp.getString2(33660))) {
                    string24 = StubApp.getString2(28562);
                    key = getKey(jcaJceHelper, cArr, string24, 16, bArr2);
                } else {
                    int i10 = 128;
                    if (str.startsWith(StubApp.getString2(33661))) {
                        if (str.startsWith(StubApp.getString2(33662))) {
                            i10 = 40;
                        } else if (str.startsWith(StubApp.getString2(33663))) {
                            i10 = 64;
                        }
                        string24 = StubApp.getString2(28256);
                        key = getKey(jcaJceHelper, cArr, string24, i10 / 8, bArr2);
                        ivParameterSpec2 = ivParameterSpec2 == null ? new RC2ParameterSpec(i10) : new RC2ParameterSpec(i10, bArr2);
                    } else {
                        if (!str.startsWith(StubApp.getString2(33664))) {
                            throw new EncryptionException(StubApp.getString2(33694));
                        }
                        if (bArr2.length > 8) {
                            bArr3 = new byte[8];
                            System.arraycopy(bArr2, 0, bArr3, 0, 8);
                        } else {
                            bArr3 = bArr2;
                        }
                        if (!str.startsWith(StubApp.getString2(33665))) {
                            if (str.startsWith(StubApp.getString2(33666))) {
                                i10 = 192;
                            } else {
                                if (!str.startsWith(StubApp.getString2(33667))) {
                                    throw new EncryptionException(StubApp.getString2(33693));
                                }
                                i10 = 256;
                            }
                        }
                        string23 = StubApp.getString2(461);
                        key = getKey(jcaJceHelper, cArr, string23, i10 / 8, bArr3);
                    }
                }
                str3 = string24;
            }
            str3 = string23;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        String string28 = StubApp.getString2(601);
        sb2.append(string28);
        sb2.append(str4);
        sb2.append(string28);
        sb2.append(str2);
        try {
            Cipher createCipher = jcaJceHelper.createCipher(sb2.toString());
            if (!z2) {
                i3 = 2;
            }
            if (ivParameterSpec2 == null) {
                createCipher.init(i3, key);
            } else {
                createCipher.init(i3, key, ivParameterSpec2);
            }
            return createCipher.doFinal(bArr);
        } catch (Exception e10) {
            throw new EncryptionException(StubApp.getString2(33668), e10);
        }
    }

    public static SecretKey generateSecretKeyForPKCS5Scheme2(JcaJceHelper jcaJceHelper, String str, char[] cArr, byte[] bArr, int i3) throws NoSuchProviderException, NoSuchAlgorithmException, InvalidKeySpecException {
        return new SecretKeySpec(jcaJceHelper.createSecretKeyFactory(StubApp.getString2(28272)).generateSecret(new PBEKeySpec(cArr, bArr, i3, getKeySize(str))).getEncoded(), getAlgorithmName(str));
    }

    public static String getAlgorithmName(String str) {
        String str2 = (String) KEY_NAMES.get(str);
        return str2 != null ? str2 : str;
    }

    public static String getCipherName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String str = (String) CIPHER_NAMES.get(aSN1ObjectIdentifier);
        return str != null ? str : aSN1ObjectIdentifier.getId();
    }

    private static SecretKey getKey(JcaJceHelper jcaJceHelper, char[] cArr, String str, int i3, byte[] bArr) throws PEMException {
        return getKey(jcaJceHelper, cArr, str, i3, bArr, false);
    }

    public static int getKeySize(String str) {
        Map map = KEYSIZES;
        if (map.containsKey(str)) {
            return ((Integer) map.get(str)).intValue();
        }
        throw new IllegalStateException(a.j(StubApp.getString2(33671), str));
    }

    public static int getSaltSize(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        Map map = PRFS_SALT;
        if (map.containsKey(aSN1ObjectIdentifier)) {
            return ((Integer) map.get(aSN1ObjectIdentifier)).intValue();
        }
        throw new IllegalStateException(org.bouncycastle.asn1.a.e(StubApp.getString2(29377), aSN1ObjectIdentifier));
    }

    public static boolean isHmacSHA1(AlgorithmIdentifier algorithmIdentifier) {
        return algorithmIdentifier == null || algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) PKCSObjectIdentifiers.id_hmacWithSHA1);
    }

    public static boolean isPKCS12(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return aSN1ObjectIdentifier.getId().startsWith(PKCSObjectIdentifiers.pkcs_12PbeIds.getId());
    }

    public static boolean isPKCS5Scheme1(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return PKCS5_SCHEME_1.contains(aSN1ObjectIdentifier);
    }

    public static boolean isPKCS5Scheme2(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return PKCS5_SCHEME_2.contains(aSN1ObjectIdentifier);
    }

    public static SecretKey generateSecretKeyForPKCS5Scheme2(JcaJceHelper jcaJceHelper, String str, char[] cArr, byte[] bArr, int i3, AlgorithmIdentifier algorithmIdentifier) throws NoSuchProviderException, NoSuchAlgorithmException, InvalidKeySpecException {
        String str2 = (String) PRFS.get(algorithmIdentifier.getAlgorithm());
        if (str2 != null) {
            return new SecretKeySpec(jcaJceHelper.createSecretKeyFactory(str2).generateSecret(new PBEKeySpec(cArr, bArr, i3, getKeySize(str))).getEncoded(), str);
        }
        throw new NoSuchAlgorithmException(StubApp.getString2(33695) + algorithmIdentifier.getAlgorithm());
    }

    private static SecretKey getKey(JcaJceHelper jcaJceHelper, char[] cArr, String str, int i3, byte[] bArr, boolean z2) throws PEMException {
        try {
            byte[] encoded = jcaJceHelper.createSecretKeyFactory(StubApp.getString2("32019")).generateSecret(new PBEKeySpec(cArr, bArr, 1, i3 * 8)).getEncoded();
            if (z2 && encoded.length >= 24) {
                System.arraycopy(encoded, 0, encoded, 16, 8);
            }
            return new SecretKeySpec(encoded, str);
        } catch (GeneralSecurityException e10) {
            throw new PEMException(org.bouncycastle.asn1.a.h(e10, new StringBuilder(StubApp.getString2(33696))), e10);
        }
    }
}
