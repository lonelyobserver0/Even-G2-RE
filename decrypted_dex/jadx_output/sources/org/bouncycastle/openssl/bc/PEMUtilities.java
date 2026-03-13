package org.bouncycastle.openssl.bc;

import E1.a;
import com.stub.StubApp;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.generators.OpenSSLPBEParametersGenerator;
import org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.openssl.PEMException;
import org.bouncycastle.util.Integers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class PEMUtilities {
    private static final Map KEYSIZES;
    private static final Set PKCS5_SCHEME_1;
    private static final Set PKCS5_SCHEME_2;

    static {
        HashMap hashMap = new HashMap();
        KEYSIZES = hashMap;
        HashSet hashSet = new HashSet();
        PKCS5_SCHEME_1 = hashSet;
        HashSet hashSet2 = new HashSet();
        PKCS5_SCHEME_2 = hashSet2;
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
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x018a A[Catch: Exception -> 0x01c0, TRY_ENTER, TryCatch #0 {Exception -> 0x01c0, blocks: (B:23:0x018a, B:25:0x0197, B:26:0x01a3, B:30:0x01ba, B:33:0x019b, B:34:0x0190), top: B:21:0x0188 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0197 A[Catch: Exception -> 0x01c0, TryCatch #0 {Exception -> 0x01c0, blocks: (B:23:0x018a, B:25:0x0197, B:26:0x01a3, B:30:0x01ba, B:33:0x019b, B:34:0x0190), top: B:21:0x0188 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01ba A[Catch: Exception -> 0x01c0, TRY_LEAVE, TryCatch #0 {Exception -> 0x01c0, blocks: (B:23:0x018a, B:25:0x0197, B:26:0x01a3, B:30:0x01ba, B:33:0x019b, B:34:0x0190), top: B:21:0x0188 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x019b A[Catch: Exception -> 0x01c0, TryCatch #0 {Exception -> 0x01c0, blocks: (B:23:0x018a, B:25:0x0197, B:26:0x01a3, B:30:0x01ba, B:33:0x019b, B:34:0x0190), top: B:21:0x0188 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0190 A[Catch: Exception -> 0x01c0, TryCatch #0 {Exception -> 0x01c0, blocks: (B:23:0x018a, B:25:0x0197, B:26:0x01a3, B:30:0x01ba, B:33:0x019b, B:34:0x0190), top: B:21:0x0188 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] crypt(boolean r16, byte[] r17, char[] r18, java.lang.String r19, byte[] r20) throws org.bouncycastle.openssl.PEMException {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.openssl.bc.PEMUtilities.crypt(boolean, byte[], char[], java.lang.String, byte[]):byte[]");
    }

    public static KeyParameter generateSecretKeyForPKCS5Scheme2(String str, char[] cArr, byte[] bArr, int i3) {
        PKCS5S2ParametersGenerator pKCS5S2ParametersGenerator = new PKCS5S2ParametersGenerator(new SHA1Digest());
        pKCS5S2ParametersGenerator.init(PBEParametersGenerator.PKCS5PasswordToBytes(cArr), bArr, i3);
        return (KeyParameter) pKCS5S2ParametersGenerator.generateDerivedParameters(getKeySize(str));
    }

    private static KeyParameter getKey(char[] cArr, int i3, byte[] bArr) throws PEMException {
        return getKey(cArr, i3, bArr, false);
    }

    public static int getKeySize(String str) {
        Map map = KEYSIZES;
        if (map.containsKey(str)) {
            return ((Integer) map.get(str)).intValue();
        }
        throw new IllegalStateException(a.j(StubApp.getString2(33671), str));
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

    private static KeyParameter getKey(char[] cArr, int i3, byte[] bArr, boolean z2) throws PEMException {
        OpenSSLPBEParametersGenerator openSSLPBEParametersGenerator = new OpenSSLPBEParametersGenerator();
        openSSLPBEParametersGenerator.init(PBEParametersGenerator.PKCS5PasswordToBytes(cArr), bArr, 1);
        KeyParameter keyParameter = (KeyParameter) openSSLPBEParametersGenerator.generateDerivedParameters(i3 * 8);
        if (!z2 || keyParameter.getKey().length != 24) {
            return keyParameter;
        }
        byte[] key = keyParameter.getKey();
        System.arraycopy(key, 0, key, 16, 8);
        return new KeyParameter(key);
    }
}
