package org.bouncycastle.jcajce.provider.asymmetric.util;

import E1.a;
import com.stub.StubApp;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import javax.crypto.KeyAgreementSpi;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.gnu.GNUObjectIdentifiers;
import org.bouncycastle.asn1.kisa.KISAObjectIdentifiers;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.ntt.NTTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.agreement.kdf.DHKDFParameters;
import org.bouncycastle.crypto.agreement.kdf.DHKEKGenerator;
import org.bouncycastle.crypto.params.DESParameters;
import org.bouncycastle.crypto.params.KDFParameters;
import org.bouncycastle.jcajce.spec.HybridValueParameterSpec;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Strings;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class BaseAgreementSpi extends KeyAgreementSpi {
    private static final Map<String, ASN1ObjectIdentifier> defaultOids;
    private static final Hashtable des;
    private static final Map<String, Integer> keySizes;
    private static final Map<String, String> nameTable;
    private static final Hashtable oids;
    private HybridValueParameterSpec hybridSpec;
    protected final String kaAlgorithm;
    protected final DerivationFunction kdf;
    protected byte[] ukmParameters;

    static {
        HashMap hashMap = new HashMap();
        defaultOids = hashMap;
        HashMap hashMap2 = new HashMap();
        keySizes = hashMap2;
        HashMap hashMap3 = new HashMap();
        nameTable = hashMap3;
        Hashtable hashtable = new Hashtable();
        oids = hashtable;
        Hashtable hashtable2 = new Hashtable();
        des = hashtable2;
        Integer valueOf = Integers.valueOf(64);
        Integer valueOf2 = Integers.valueOf(128);
        Integer valueOf3 = Integers.valueOf(192);
        Integer valueOf4 = Integers.valueOf(256);
        String string2 = StubApp.getString2(28171);
        hashMap2.put(string2, valueOf);
        String string22 = StubApp.getString2(28051);
        hashMap2.put(string22, valueOf3);
        hashMap2.put(StubApp.getString2(30831), valueOf2);
        String string23 = StubApp.getString2(461);
        hashMap2.put(string23, valueOf4);
        hashMap2.put(NISTObjectIdentifiers.id_aes128_ECB.getId(), valueOf2);
        hashMap2.put(NISTObjectIdentifiers.id_aes192_ECB.getId(), valueOf3);
        hashMap2.put(NISTObjectIdentifiers.id_aes256_ECB.getId(), valueOf4);
        hashMap2.put(NISTObjectIdentifiers.id_aes128_CBC.getId(), valueOf2);
        hashMap2.put(NISTObjectIdentifiers.id_aes192_CBC.getId(), valueOf3);
        ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.id_aes256_CBC;
        hashMap2.put(aSN1ObjectIdentifier.getId(), valueOf4);
        hashMap2.put(NISTObjectIdentifiers.id_aes128_CFB.getId(), valueOf2);
        hashMap2.put(NISTObjectIdentifiers.id_aes192_CFB.getId(), valueOf3);
        hashMap2.put(NISTObjectIdentifiers.id_aes256_CFB.getId(), valueOf4);
        hashMap2.put(NISTObjectIdentifiers.id_aes128_OFB.getId(), valueOf2);
        hashMap2.put(NISTObjectIdentifiers.id_aes192_OFB.getId(), valueOf3);
        hashMap2.put(NISTObjectIdentifiers.id_aes256_OFB.getId(), valueOf4);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_aes128_wrap;
        hashMap2.put(aSN1ObjectIdentifier2.getId(), valueOf2);
        hashMap2.put(NISTObjectIdentifiers.id_aes192_wrap.getId(), valueOf3);
        hashMap2.put(NISTObjectIdentifiers.id_aes256_wrap.getId(), valueOf4);
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_aes128_CCM;
        hashMap2.put(aSN1ObjectIdentifier3.getId(), valueOf2);
        hashMap2.put(NISTObjectIdentifiers.id_aes192_CCM.getId(), valueOf3);
        hashMap2.put(NISTObjectIdentifiers.id_aes256_CCM.getId(), valueOf4);
        hashMap2.put(NISTObjectIdentifiers.id_aes128_GCM.getId(), valueOf2);
        hashMap2.put(NISTObjectIdentifiers.id_aes192_GCM.getId(), valueOf3);
        hashMap2.put(NISTObjectIdentifiers.id_aes256_GCM.getId(), valueOf4);
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NTTObjectIdentifiers.id_camellia128_wrap;
        hashMap2.put(aSN1ObjectIdentifier4.getId(), valueOf2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = NTTObjectIdentifiers.id_camellia192_wrap;
        hashMap2.put(aSN1ObjectIdentifier5.getId(), valueOf3);
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = NTTObjectIdentifiers.id_camellia256_wrap;
        hashMap2.put(aSN1ObjectIdentifier6.getId(), valueOf4);
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = KISAObjectIdentifiers.id_npki_app_cmsSeed_wrap;
        hashMap2.put(aSN1ObjectIdentifier7.getId(), valueOf2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = PKCSObjectIdentifiers.id_alg_CMS3DESwrap;
        hashMap2.put(aSN1ObjectIdentifier8.getId(), valueOf3);
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = PKCSObjectIdentifiers.des_EDE3_CBC;
        hashMap2.put(aSN1ObjectIdentifier9.getId(), valueOf3);
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = OIWObjectIdentifiers.desCBC;
        hashMap2.put(aSN1ObjectIdentifier10.getId(), valueOf);
        ASN1ObjectIdentifier aSN1ObjectIdentifier11 = CryptoProObjectIdentifiers.gostR28147_gcfb;
        hashMap2.put(aSN1ObjectIdentifier11.getId(), valueOf4);
        hashMap2.put(CryptoProObjectIdentifiers.id_Gost28147_89_None_KeyWrap.getId(), valueOf4);
        hashMap2.put(CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_KeyWrap.getId(), valueOf4);
        ASN1ObjectIdentifier aSN1ObjectIdentifier12 = PKCSObjectIdentifiers.id_hmacWithSHA1;
        hashMap2.put(aSN1ObjectIdentifier12.getId(), Integers.valueOf(160));
        ASN1ObjectIdentifier aSN1ObjectIdentifier13 = PKCSObjectIdentifiers.id_hmacWithSHA256;
        hashMap2.put(aSN1ObjectIdentifier13.getId(), valueOf4);
        ASN1ObjectIdentifier aSN1ObjectIdentifier14 = PKCSObjectIdentifiers.id_hmacWithSHA384;
        hashMap2.put(aSN1ObjectIdentifier14.getId(), Integers.valueOf(KyberEngine.KyberPolyBytes));
        ASN1ObjectIdentifier aSN1ObjectIdentifier15 = PKCSObjectIdentifiers.id_hmacWithSHA512;
        hashMap2.put(aSN1ObjectIdentifier15.getId(), Integers.valueOf(512));
        hashMap.put(string22, aSN1ObjectIdentifier9);
        hashMap.put(string23, aSN1ObjectIdentifier);
        ASN1ObjectIdentifier aSN1ObjectIdentifier16 = NTTObjectIdentifiers.id_camellia256_cbc;
        hashMap.put(StubApp.getString2(30832), aSN1ObjectIdentifier16);
        ASN1ObjectIdentifier aSN1ObjectIdentifier17 = KISAObjectIdentifiers.id_seedCBC;
        String string24 = StubApp.getString2(28259);
        hashMap.put(string24, aSN1ObjectIdentifier17);
        hashMap.put(string2, aSN1ObjectIdentifier10);
        hashMap3.put(MiscObjectIdentifiers.cast5CBC.getId(), StubApp.getString2(28257));
        hashMap3.put(MiscObjectIdentifiers.as_sys_sec_alg_ideaCBC.getId(), StubApp.getString2(28667));
        String id = MiscObjectIdentifiers.cryptlib_algorithm_blowfish_ECB.getId();
        String string25 = StubApp.getString2(28562);
        hashMap3.put(id, string25);
        hashMap3.put(MiscObjectIdentifiers.cryptlib_algorithm_blowfish_CBC.getId(), string25);
        hashMap3.put(MiscObjectIdentifiers.cryptlib_algorithm_blowfish_CFB.getId(), string25);
        hashMap3.put(MiscObjectIdentifiers.cryptlib_algorithm_blowfish_OFB.getId(), string25);
        hashMap3.put(OIWObjectIdentifiers.desECB.getId(), string2);
        hashMap3.put(aSN1ObjectIdentifier10.getId(), string2);
        hashMap3.put(OIWObjectIdentifiers.desCFB.getId(), string2);
        hashMap3.put(OIWObjectIdentifiers.desOFB.getId(), string2);
        String id2 = OIWObjectIdentifiers.desEDE.getId();
        String string26 = StubApp.getString2(28590);
        hashMap3.put(id2, string26);
        hashMap3.put(aSN1ObjectIdentifier9.getId(), string26);
        hashMap3.put(aSN1ObjectIdentifier8.getId(), string26);
        hashMap3.put(PKCSObjectIdentifiers.id_alg_CMSRC2wrap.getId(), StubApp.getString2(28256));
        hashMap3.put(aSN1ObjectIdentifier12.getId(), StubApp.getString2(30833));
        hashMap3.put(PKCSObjectIdentifiers.id_hmacWithSHA224.getId(), StubApp.getString2(30834));
        hashMap3.put(aSN1ObjectIdentifier13.getId(), StubApp.getString2(30835));
        hashMap3.put(aSN1ObjectIdentifier14.getId(), StubApp.getString2(30836));
        hashMap3.put(aSN1ObjectIdentifier15.getId(), StubApp.getString2(29629));
        String id3 = NTTObjectIdentifiers.id_camellia128_cbc.getId();
        String string27 = StubApp.getString2(28258);
        hashMap3.put(id3, string27);
        hashMap3.put(NTTObjectIdentifiers.id_camellia192_cbc.getId(), string27);
        hashMap3.put(aSN1ObjectIdentifier16.getId(), string27);
        hashMap3.put(aSN1ObjectIdentifier4.getId(), string27);
        hashMap3.put(aSN1ObjectIdentifier5.getId(), string27);
        hashMap3.put(aSN1ObjectIdentifier6.getId(), string27);
        hashMap3.put(aSN1ObjectIdentifier7.getId(), string24);
        hashMap3.put(aSN1ObjectIdentifier17.getId(), string24);
        hashMap3.put(KISAObjectIdentifiers.id_seedMAC.getId(), string24);
        hashMap3.put(aSN1ObjectIdentifier11.getId(), StubApp.getString2(28261));
        hashMap3.put(aSN1ObjectIdentifier2.getId(), string23);
        hashMap3.put(aSN1ObjectIdentifier3.getId(), string23);
        hashMap3.put(aSN1ObjectIdentifier3.getId(), string23);
        hashtable.put(string22, aSN1ObjectIdentifier9);
        hashtable.put(string23, aSN1ObjectIdentifier);
        hashtable.put(string2, aSN1ObjectIdentifier10);
        hashtable2.put(string2, string2);
        hashtable2.put(string22, string2);
        hashtable2.put(aSN1ObjectIdentifier10.getId(), string2);
        hashtable2.put(aSN1ObjectIdentifier9.getId(), string2);
        hashtable2.put(aSN1ObjectIdentifier8.getId(), string2);
    }

    public BaseAgreementSpi(String str, DerivationFunction derivationFunction) {
        this.kaAlgorithm = str;
        this.kdf = derivationFunction;
    }

    private byte[] calcSecret() {
        if (this.hybridSpec == null) {
            return doCalcSecret();
        }
        byte[] doCalcSecret = doCalcSecret();
        byte[] concatenate = Arrays.concatenate(doCalcSecret, this.hybridSpec.getT());
        Arrays.clear(doCalcSecret);
        return concatenate;
    }

    public static String getAlgorithm(String str) {
        if (str.indexOf(91) > 0) {
            return str.substring(0, str.indexOf(91));
        }
        if (str.startsWith(NISTObjectIdentifiers.aes.getId())) {
            return StubApp.getString2(461);
        }
        if (str.startsWith(GNUObjectIdentifiers.Serpent.getId())) {
            return StubApp.getString2(28768);
        }
        String str2 = nameTable.get(Strings.toUpperCase(str));
        return str2 != null ? str2 : str;
    }

    public static int getKeySize(String str) {
        if (str.indexOf(91) > 0) {
            return Integer.parseInt(str.substring(str.indexOf(91) + 1, str.indexOf(93)));
        }
        String upperCase = Strings.toUpperCase(str);
        Map<String, Integer> map = keySizes;
        if (map.containsKey(upperCase)) {
            return map.get(upperCase).intValue();
        }
        return -1;
    }

    private byte[] getSharedSecretBytes(byte[] bArr, String str, int i3) throws NoSuchAlgorithmException {
        DerivationParameters kDFParameters;
        DerivationFunction derivationFunction = this.kdf;
        if (derivationFunction == null) {
            if (i3 <= 0) {
                return bArr;
            }
            int i10 = i3 / 8;
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 0, bArr2, 0, i10);
            Arrays.clear(bArr);
            return bArr2;
        }
        if (i3 < 0) {
            throw new NoSuchAlgorithmException(a.j(StubApp.getString2(30839), str));
        }
        int i11 = i3 / 8;
        byte[] bArr3 = new byte[i11];
        if (!(derivationFunction instanceof DHKEKGenerator)) {
            kDFParameters = new KDFParameters(bArr, this.ukmParameters);
        } else {
            if (str == null) {
                throw new NoSuchAlgorithmException(StubApp.getString2(30838));
            }
            try {
                kDFParameters = new DHKDFParameters(new ASN1ObjectIdentifier(str), i3, bArr, this.ukmParameters);
            } catch (IllegalArgumentException unused) {
                throw new NoSuchAlgorithmException(StubApp.getString2(30837).concat(str));
            }
        }
        this.kdf.init(kDFParameters);
        this.kdf.generateBytes(bArr3, 0, i11);
        Arrays.clear(bArr);
        return bArr3;
    }

    public static byte[] trimZeroes(byte[] bArr) {
        if (bArr[0] != 0) {
            return bArr;
        }
        int i3 = 0;
        while (i3 < bArr.length && bArr[i3] == 0) {
            i3++;
        }
        int length = bArr.length - i3;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, i3, bArr2, 0, length);
        return bArr2;
    }

    public abstract byte[] doCalcSecret();

    public abstract void doInitFromKey(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException;

    @Override // javax.crypto.KeyAgreementSpi
    public int engineGenerateSecret(byte[] bArr, int i3) throws IllegalStateException, ShortBufferException {
        byte[] engineGenerateSecret = engineGenerateSecret();
        if (bArr.length - i3 >= engineGenerateSecret.length) {
            System.arraycopy(engineGenerateSecret, 0, bArr, i3, engineGenerateSecret.length);
            return engineGenerateSecret.length;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.kaAlgorithm);
        sb2.append(StubApp.getString2(30840));
        throw new ShortBufferException(AbstractC1482f.f(engineGenerateSecret.length, StubApp.getString2(693), sb2));
    }

    @Override // javax.crypto.KeyAgreementSpi
    public void engineInit(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            doInitFromKey(key, null, secureRandom);
        } catch (InvalidAlgorithmParameterException e10) {
            throw new InvalidKeyException(e10.getMessage());
        }
    }

    @Override // javax.crypto.KeyAgreementSpi
    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (algorithmParameterSpec instanceof HybridValueParameterSpec) {
            HybridValueParameterSpec hybridValueParameterSpec = (HybridValueParameterSpec) algorithmParameterSpec;
            this.hybridSpec = hybridValueParameterSpec;
            algorithmParameterSpec = hybridValueParameterSpec.getBaseParameterSpec();
        } else {
            this.hybridSpec = null;
        }
        doInitFromKey(key, algorithmParameterSpec, secureRandom);
    }

    @Override // javax.crypto.KeyAgreementSpi
    public SecretKey engineGenerateSecret(String str) throws NoSuchAlgorithmException {
        String upperCase = Strings.toUpperCase(str);
        Hashtable hashtable = oids;
        String id = hashtable.containsKey(upperCase) ? ((ASN1ObjectIdentifier) hashtable.get(upperCase)).getId() : str;
        byte[] sharedSecretBytes = getSharedSecretBytes(calcSecret(), id, getKeySize(id));
        String algorithm = getAlgorithm(str);
        if (des.containsKey(algorithm)) {
            DESParameters.setOddParity(sharedSecretBytes);
        }
        return new SecretKeySpec(sharedSecretBytes, algorithm);
    }

    @Override // javax.crypto.KeyAgreementSpi
    public byte[] engineGenerateSecret() throws IllegalStateException {
        if (this.kdf == null) {
            return calcSecret();
        }
        byte[] calcSecret = calcSecret();
        try {
            return getSharedSecretBytes(calcSecret, null, calcSecret.length * 8);
        } catch (NoSuchAlgorithmException e10) {
            throw new IllegalStateException(e10.getMessage());
        }
    }
}
