package org.bouncycastle.jcajce.provider.symmetric;

import com.stub.StubApp;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.KeySpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.gm.GMObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PBKDF2Params;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.PasswordConverter;
import org.bouncycastle.jcajce.PBKDF2Key;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.PBE;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.jcajce.spec.PBKDF2KeySpec;
import org.bouncycastle.util.Integers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PBEPBKDF2 {
    private static final Map prfCodes;

    public static class AlgParams extends BaseAlgorithmParameters {
        PBKDF2Params params;

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() {
            try {
                return this.params.getEncoded(StubApp.getString2("26791"));
            } catch (IOException e10) {
                throw new RuntimeException(StubApp.getString2(32025) + e10.toString());
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new InvalidParameterSpecException(StubApp.getString2(32031));
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            this.params = new PBKDF2Params(pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
        }

        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return StubApp.getString2(32032);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == PBEParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return new PBEParameterSpec(this.params.getSalt(), this.params.getIterationCount().intValue());
            }
            throw new InvalidParameterSpecException(StubApp.getString2(32033));
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) {
            if (isASN1FormatString(str)) {
                return engineGetEncoded();
            }
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) throws IOException {
            this.params = PBKDF2Params.getInstance(ASN1Primitive.fromByteArray(bArr));
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
            if (!isASN1FormatString(str)) {
                throw new IOException(StubApp.getString2(32027));
            }
            engineInit(bArr);
        }
    }

    public static class BasePBKDF2 extends BaseSecretKeyFactory {
        private int defaultDigest;
        private int scheme;

        public BasePBKDF2(String str, int i3) {
            this(str, i3, 1);
        }

        private int getDigestCode(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws InvalidKeySpecException {
            Integer num = (Integer) PBEPBKDF2.prfCodes.get(aSN1ObjectIdentifier);
            if (num != null) {
                return num.intValue();
            }
            throw new InvalidKeySpecException(a.e(StubApp.getString2(32034), aSN1ObjectIdentifier));
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            if (!(keySpec instanceof PBEKeySpec)) {
                throw new InvalidKeySpecException(StubApp.getString2(31733));
            }
            PBEKeySpec pBEKeySpec = (PBEKeySpec) keySpec;
            if (pBEKeySpec.getSalt() == null) {
                return new PBKDF2Key(pBEKeySpec.getPassword(), this.scheme == 1 ? PasswordConverter.ASCII : PasswordConverter.UTF8);
            }
            if (pBEKeySpec.getIterationCount() <= 0) {
                throw new InvalidKeySpecException(StubApp.getString2(32023) + pBEKeySpec.getIterationCount());
            }
            if (pBEKeySpec.getKeyLength() <= 0) {
                throw new InvalidKeySpecException(StubApp.getString2(32022) + pBEKeySpec.getKeyLength());
            }
            if (pBEKeySpec.getPassword().length == 0) {
                throw new IllegalArgumentException(StubApp.getString2(32021));
            }
            if (pBEKeySpec instanceof PBKDF2KeySpec) {
                int digestCode = getDigestCode(((PBKDF2KeySpec) pBEKeySpec).getPrf().getAlgorithm());
                int keyLength = pBEKeySpec.getKeyLength();
                return new BCPBEKey(this.algName, this.algOid, this.scheme, digestCode, keyLength, -1, pBEKeySpec, PBE.Util.makePBEMacParameters(pBEKeySpec, this.scheme, digestCode, keyLength));
            }
            int i3 = this.defaultDigest;
            int keyLength2 = pBEKeySpec.getKeyLength();
            return new BCPBEKey(this.algName, this.algOid, this.scheme, i3, keyLength2, -1, pBEKeySpec, PBE.Util.makePBEMacParameters(pBEKeySpec, this.scheme, i3, keyLength2));
        }

        public BasePBKDF2(String str, int i3, int i10) {
            super(str, PKCSObjectIdentifiers.id_PBKDF2);
            this.scheme = i3;
            this.defaultDigest = i10;
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = PBEPBKDF2.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            sb2.append(str);
            sb2.append(StubApp.getString2(31459));
            configurableProvider.addAlgorithm(StubApp.getString2(32035), sb2.toString());
            StringBuilder sb3 = new StringBuilder(StubApp.getString2(31464));
            ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.id_PBKDF2;
            String string2 = StubApp.getString2(29643);
            a.y(a.C(sb3, string2, configurableProvider, str, aSN1ObjectIdentifier), StubApp.getString2(32036), configurableProvider, StubApp.getString2(32037));
            configurableProvider.addAlgorithm(StubApp.getString2(32038), string2);
            configurableProvider.addAlgorithm(StubApp.getString2(32039), string2);
            configurableProvider.addAlgorithm(StubApp.getString2(31027) + aSN1ObjectIdentifier, string2);
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            a.y(sb4, StubApp.getString2(32040), configurableProvider, StubApp.getString2(32041));
            String string22 = StubApp.getString2(32042);
            String string23 = StubApp.getString2(32043);
            configurableProvider.addAlgorithm(string22, string23);
            configurableProvider.addAlgorithm(StubApp.getString2(32044), string23);
            a.x(a.n(a.n(a.n(a.n(a.n(a.n(a.n(a.n(a.n(new StringBuilder(), str, StubApp.getString2(32045), configurableProvider, StubApp.getString2(32046)), str, StubApp.getString2(32047), configurableProvider, StubApp.getString2(32048)), str, StubApp.getString2(32049), configurableProvider, StubApp.getString2(32050)), str, StubApp.getString2(32051), configurableProvider, StubApp.getString2(32052)), str, StubApp.getString2(32053), configurableProvider, StubApp.getString2(32054)), str, StubApp.getString2(32055), configurableProvider, StubApp.getString2(32056)), str, StubApp.getString2(32057), configurableProvider, StubApp.getString2(32058)), str, StubApp.getString2(32059), configurableProvider, StubApp.getString2(32060)), str, StubApp.getString2(32061), configurableProvider, StubApp.getString2(32062)), str, StubApp.getString2(32063), configurableProvider, StubApp.getString2(32064));
        }
    }

    public static class PBKDF2with8BIT extends BasePBKDF2 {
        public PBKDF2with8BIT() {
            super(StubApp.getString2(29643), 1);
        }
    }

    public static class PBKDF2withGOST3411 extends BasePBKDF2 {
        public PBKDF2withGOST3411() {
            super(StubApp.getString2(29643), 5, 6);
        }
    }

    public static class PBKDF2withSHA224 extends BasePBKDF2 {
        public PBKDF2withSHA224() {
            super(StubApp.getString2(29643), 5, 7);
        }
    }

    public static class PBKDF2withSHA256 extends BasePBKDF2 {
        public PBKDF2withSHA256() {
            super(StubApp.getString2(29643), 5, 4);
        }
    }

    public static class PBKDF2withSHA384 extends BasePBKDF2 {
        public PBKDF2withSHA384() {
            super(StubApp.getString2(29643), 5, 8);
        }
    }

    public static class PBKDF2withSHA3_224 extends BasePBKDF2 {
        public PBKDF2withSHA3_224() {
            super(StubApp.getString2(29643), 5, 10);
        }
    }

    public static class PBKDF2withSHA3_256 extends BasePBKDF2 {
        public PBKDF2withSHA3_256() {
            super(StubApp.getString2(29643), 5, 11);
        }
    }

    public static class PBKDF2withSHA3_384 extends BasePBKDF2 {
        public PBKDF2withSHA3_384() {
            super(StubApp.getString2(29643), 5, 12);
        }
    }

    public static class PBKDF2withSHA3_512 extends BasePBKDF2 {
        public PBKDF2withSHA3_512() {
            super(StubApp.getString2(29643), 5, 13);
        }
    }

    public static class PBKDF2withSHA512 extends BasePBKDF2 {
        public PBKDF2withSHA512() {
            super(StubApp.getString2(29643), 5, 9);
        }
    }

    public static class PBKDF2withSM3 extends BasePBKDF2 {
        public PBKDF2withSM3() {
            super(StubApp.getString2(29643), 5, 14);
        }
    }

    public static class PBKDF2withUTF8 extends BasePBKDF2 {
        public PBKDF2withUTF8() {
            super(StubApp.getString2(29643), 5);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        prfCodes = hashMap;
        hashMap.put(CryptoProObjectIdentifiers.gostR3411Hmac, Integers.valueOf(6));
        hashMap.put(PKCSObjectIdentifiers.id_hmacWithSHA1, Integers.valueOf(1));
        hashMap.put(PKCSObjectIdentifiers.id_hmacWithSHA256, Integers.valueOf(4));
        hashMap.put(PKCSObjectIdentifiers.id_hmacWithSHA224, Integers.valueOf(7));
        hashMap.put(PKCSObjectIdentifiers.id_hmacWithSHA384, Integers.valueOf(8));
        hashMap.put(PKCSObjectIdentifiers.id_hmacWithSHA512, Integers.valueOf(9));
        hashMap.put(NISTObjectIdentifiers.id_hmacWithSHA3_256, Integers.valueOf(11));
        hashMap.put(NISTObjectIdentifiers.id_hmacWithSHA3_224, Integers.valueOf(10));
        hashMap.put(NISTObjectIdentifiers.id_hmacWithSHA3_384, Integers.valueOf(12));
        hashMap.put(NISTObjectIdentifiers.id_hmacWithSHA3_512, Integers.valueOf(13));
        hashMap.put(GMObjectIdentifiers.hmac_sm3, Integers.valueOf(14));
    }

    private PBEPBKDF2() {
    }
}
