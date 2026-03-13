package org.bouncycastle.jcajce.provider.symmetric;

import com.stub.StubApp;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.engines.AESWrapEngine;
import org.bouncycastle.crypto.engines.AESWrapPadEngine;
import org.bouncycastle.crypto.engines.RFC3211WrapEngine;
import org.bouncycastle.crypto.engines.RFC5649WrapEngine;
import org.bouncycastle.crypto.generators.Poly1305KeyGenerator;
import org.bouncycastle.crypto.macs.CMac;
import org.bouncycastle.crypto.macs.GMac;
import org.bouncycastle.crypto.modes.AEADBlockCipher;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.CCMBlockCipher;
import org.bouncycastle.crypto.modes.CFBBlockCipher;
import org.bouncycastle.crypto.modes.GCMBlockCipher;
import org.bouncycastle.crypto.modes.OFBBlockCipher;
import org.bouncycastle.internal.asn1.cms.CCMParameters;
import org.bouncycastle.internal.asn1.cms.GCMParameters;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import org.bouncycastle.jcajce.spec.AEADParameterSpec;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class AES {
    private static final Map<String, String> generalAesAttributes;

    /* renamed from: org.bouncycastle.jcajce.provider.symmetric.AES$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class AESCCMMAC extends BaseMac {

        public static class CCMMac implements Mac {
            private final CCMBlockCipher ccm;
            private int macLength;

            private CCMMac() {
                this.ccm = new CCMBlockCipher(new AESEngine());
                this.macLength = 8;
            }

            @Override // org.bouncycastle.crypto.Mac
            public int doFinal(byte[] bArr, int i3) throws DataLengthException, IllegalStateException {
                try {
                    return this.ccm.doFinal(bArr, 0);
                } catch (InvalidCipherTextException e10) {
                    throw new IllegalStateException(StubApp.getString2(31451) + e10.toString());
                }
            }

            @Override // org.bouncycastle.crypto.Mac
            public String getAlgorithmName() {
                return this.ccm.getAlgorithmName() + StubApp.getString2(17481);
            }

            @Override // org.bouncycastle.crypto.Mac
            public int getMacSize() {
                return this.macLength;
            }

            @Override // org.bouncycastle.crypto.Mac
            public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
                this.ccm.init(true, cipherParameters);
                this.macLength = this.ccm.getMac().length;
            }

            @Override // org.bouncycastle.crypto.Mac
            public void reset() {
                this.ccm.reset();
            }

            @Override // org.bouncycastle.crypto.Mac
            public void update(byte b2) throws IllegalStateException {
                this.ccm.processAADByte(b2);
            }

            public /* synthetic */ CCMMac(AnonymousClass1 anonymousClass1) {
                this();
            }

            @Override // org.bouncycastle.crypto.Mac
            public void update(byte[] bArr, int i3, int i10) throws DataLengthException, IllegalStateException {
                this.ccm.processAADBytes(bArr, i3, i10);
            }
        }

        public AESCCMMAC() {
            super(new CCMMac(null));
        }
    }

    public static class AESCMAC extends BaseMac {
        public AESCMAC() {
            super(new CMac(new AESEngine()));
        }
    }

    public static class AESGMAC extends BaseMac {
        public AESGMAC() {
            super(new GMac(new GCMBlockCipher(new AESEngine())));
        }
    }

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            if (this.random == null) {
                this.random = CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance(StubApp.getString2("461"));
                createParametersInstance.init(new IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (Exception e10) {
                throw new RuntimeException(e10.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException(StubApp.getString2(31452));
        }
    }

    public static class AlgParamGenCCM extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[12];
            if (this.random == null) {
                this.random = new SecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance(StubApp.getString2("29619"));
                createParametersInstance.init(new CCMParameters(bArr, 12).getEncoded());
                return createParametersInstance;
            } catch (Exception e10) {
                throw new RuntimeException(e10.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException(StubApp.getString2(31452));
        }
    }

    public static class AlgParamGenGCM extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[12];
            if (this.random == null) {
                this.random = new SecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance(StubApp.getString2("24655"));
                createParametersInstance.init(new GCMParameters(bArr, 16).getEncoded());
                return createParametersInstance;
            } catch (Exception e10) {
                throw new RuntimeException(e10.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException(StubApp.getString2(31452));
        }
    }

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return StubApp.getString2(31453);
        }
    }

    public static class AlgParamsCCM extends BaseAlgorithmParameters {
        private CCMParameters ccmParams;

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() throws IOException {
            return this.ccmParams.getEncoded();
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (GcmSpecUtil.isGcmSpec(algorithmParameterSpec)) {
                this.ccmParams = CCMParameters.getInstance(GcmSpecUtil.extractGcmParameters(algorithmParameterSpec));
            } else {
                if (!(algorithmParameterSpec instanceof AEADParameterSpec)) {
                    throw new InvalidParameterSpecException(StubApp.getString2(30600).concat(algorithmParameterSpec.getClass().getName()));
                }
                AEADParameterSpec aEADParameterSpec = (AEADParameterSpec) algorithmParameterSpec;
                this.ccmParams = new CCMParameters(aEADParameterSpec.getNonce(), aEADParameterSpec.getMacSizeInBits() / 8);
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return StubApp.getString2(29619);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == AlgorithmParameterSpec.class || GcmSpecUtil.isGcmSpec(cls)) {
                return GcmSpecUtil.gcmSpecExists() ? GcmSpecUtil.extractGcmSpec(this.ccmParams.toASN1Primitive()) : new AEADParameterSpec(this.ccmParams.getNonce(), this.ccmParams.getIcvLen() * 8);
            }
            if (cls == AEADParameterSpec.class) {
                return new AEADParameterSpec(this.ccmParams.getNonce(), this.ccmParams.getIcvLen() * 8);
            }
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.ccmParams.getNonce());
            }
            throw new InvalidParameterSpecException(StubApp.getString2(31455).concat(cls.getName()));
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) throws IOException {
            if (isASN1FormatString(str)) {
                return this.ccmParams.getEncoded();
            }
            throw new IOException(StubApp.getString2(31454));
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) throws IOException {
            this.ccmParams = CCMParameters.getInstance(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
            if (!isASN1FormatString(str)) {
                throw new IOException(StubApp.getString2(31454));
            }
            this.ccmParams = CCMParameters.getInstance(bArr);
        }
    }

    public static class AlgParamsGCM extends BaseAlgorithmParameters {
        private GCMParameters gcmParams;

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() throws IOException {
            return this.gcmParams.getEncoded();
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (GcmSpecUtil.isGcmSpec(algorithmParameterSpec)) {
                this.gcmParams = GcmSpecUtil.extractGcmParameters(algorithmParameterSpec);
            } else {
                if (!(algorithmParameterSpec instanceof AEADParameterSpec)) {
                    throw new InvalidParameterSpecException(StubApp.getString2(30600).concat(algorithmParameterSpec.getClass().getName()));
                }
                AEADParameterSpec aEADParameterSpec = (AEADParameterSpec) algorithmParameterSpec;
                this.gcmParams = new GCMParameters(aEADParameterSpec.getNonce(), aEADParameterSpec.getMacSizeInBits() / 8);
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return StubApp.getString2(24655);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == AlgorithmParameterSpec.class || GcmSpecUtil.isGcmSpec(cls)) {
                return GcmSpecUtil.gcmSpecExists() ? GcmSpecUtil.extractGcmSpec(this.gcmParams.toASN1Primitive()) : new AEADParameterSpec(this.gcmParams.getNonce(), this.gcmParams.getIcvLen() * 8);
            }
            if (cls == AEADParameterSpec.class) {
                return new AEADParameterSpec(this.gcmParams.getNonce(), this.gcmParams.getIcvLen() * 8);
            }
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.gcmParams.getNonce());
            }
            throw new InvalidParameterSpecException(StubApp.getString2(31455).concat(cls.getName()));
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) throws IOException {
            if (isASN1FormatString(str)) {
                return this.gcmParams.getEncoded();
            }
            throw new IOException(StubApp.getString2(31454));
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) throws IOException {
            this.gcmParams = GCMParameters.getInstance(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
            if (!isASN1FormatString(str)) {
                throw new IOException(StubApp.getString2(31454));
            }
            this.gcmParams = GCMParameters.getInstance(bArr);
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new CBCBlockCipher(new AESEngine()), 128);
        }
    }

    public static class CCM extends BaseBlockCipher {
        public CCM() {
            super((AEADBlockCipher) new CCMBlockCipher(new AESEngine()), false, 12);
        }
    }

    public static class CFB extends BaseBlockCipher {
        public CFB() {
            super(new BufferedBlockCipher(new CFBBlockCipher(new AESEngine(), 128)), 128);
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.AES.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public BlockCipher get() {
                    return new AESEngine();
                }
            });
        }
    }

    public static class GCM extends BaseBlockCipher {
        public GCM() {
            super(new GCMBlockCipher(new AESEngine()));
        }
    }

    public static class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super(StubApp.getString2(461), null);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            this(192);
        }

        public KeyGen(int i3) {
            super(StubApp.getString2(461), i3, new CipherKeyGenerator());
        }
    }

    public static class KeyGen128 extends KeyGen {
        public KeyGen128() {
            super(128);
        }
    }

    public static class KeyGen192 extends KeyGen {
        public KeyGen192() {
            super(192);
        }
    }

    public static class KeyGen256 extends KeyGen {
        public KeyGen256() {
            super(256);
        }
    }

    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String wrongAES128 = StubApp.getString2(31456);
        private static final String wrongAES192 = StubApp.getString2(31457);
        private static final String wrongAES256 = StubApp.getString2(31458);
        private static final String PREFIX = AES.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            a.x(sb2, str, StubApp.getString2(31459), configurableProvider, StubApp.getString2(31460));
            String string2 = StubApp.getString2(31461);
            String string22 = StubApp.getString2(461);
            configurableProvider.addAlgorithm(string2, string22);
            configurableProvider.addAlgorithm(StubApp.getString2(31462), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(31463), string22);
            String string23 = StubApp.getString2(31464);
            StringBuilder sb3 = new StringBuilder(string23);
            ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.id_aes128_CBC;
            StringBuilder q10 = a.q(sb3, aSN1ObjectIdentifier, configurableProvider, string22, string23);
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_aes192_CBC;
            StringBuilder q11 = a.q(q10, aSN1ObjectIdentifier2, configurableProvider, string22, string23);
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_aes256_CBC;
            StringBuilder C10 = a.C(q11, string22, configurableProvider, str, aSN1ObjectIdentifier3);
            C10.append(StubApp.getString2(31465));
            configurableProvider.addAlgorithm(StubApp.getString2(31466), C10.toString());
            StringBuilder sb4 = new StringBuilder(string23);
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NISTObjectIdentifiers.id_aes128_GCM;
            String string24 = StubApp.getString2(24655);
            StringBuilder q12 = a.q(sb4, aSN1ObjectIdentifier4, configurableProvider, string24, string23);
            ASN1ObjectIdentifier aSN1ObjectIdentifier5 = NISTObjectIdentifiers.id_aes192_GCM;
            StringBuilder q13 = a.q(q12, aSN1ObjectIdentifier5, configurableProvider, string24, string23);
            ASN1ObjectIdentifier aSN1ObjectIdentifier6 = NISTObjectIdentifiers.id_aes256_GCM;
            StringBuilder C11 = a.C(q13, string24, configurableProvider, str, aSN1ObjectIdentifier6);
            C11.append(StubApp.getString2(31467));
            configurableProvider.addAlgorithm(StubApp.getString2(31468), C11.toString());
            StringBuilder sb5 = new StringBuilder(string23);
            ASN1ObjectIdentifier aSN1ObjectIdentifier7 = NISTObjectIdentifiers.id_aes128_CCM;
            String string25 = StubApp.getString2(29619);
            StringBuilder q14 = a.q(sb5, aSN1ObjectIdentifier7, configurableProvider, string25, string23);
            ASN1ObjectIdentifier aSN1ObjectIdentifier8 = NISTObjectIdentifiers.id_aes192_CCM;
            StringBuilder q15 = a.q(q14, aSN1ObjectIdentifier8, configurableProvider, string25, string23);
            ASN1ObjectIdentifier aSN1ObjectIdentifier9 = NISTObjectIdentifiers.id_aes256_CCM;
            a.y(a.C(q15, string25, configurableProvider, str, aSN1ObjectIdentifier9), StubApp.getString2(31469), configurableProvider, StubApp.getString2(31470));
            configurableProvider.addAlgorithm(StubApp.getString2(31471), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(31472), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(31473), string22);
            String string26 = StubApp.getString2(31474);
            configurableProvider.addAlgorithm(string26 + aSN1ObjectIdentifier, string22);
            StringBuilder q16 = a.q(new StringBuilder(string26), aSN1ObjectIdentifier2, configurableProvider, string22, string26);
            q16.append(aSN1ObjectIdentifier3);
            configurableProvider.addAlgorithm(q16.toString(), string22);
            configurableProvider.addAttributes(StubApp.getString2(31475), AES.generalAesAttributes);
            StringBuilder sb6 = new StringBuilder();
            String string27 = StubApp.getString2(31476);
            a.x(sb6, str, string27, configurableProvider, StubApp.getString2(31475));
            configurableProvider.addAlgorithm(StubApp.getString2(31477), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(31478), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(31479), string22);
            ASN1ObjectIdentifier aSN1ObjectIdentifier10 = NISTObjectIdentifiers.id_aes128_ECB;
            String string28 = StubApp.getString2(30341);
            a.A(configurableProvider, str, string27, string28, aSN1ObjectIdentifier10);
            ASN1ObjectIdentifier aSN1ObjectIdentifier11 = NISTObjectIdentifiers.id_aes192_ECB;
            a.A(configurableProvider, str, string27, string28, aSN1ObjectIdentifier11);
            ASN1ObjectIdentifier aSN1ObjectIdentifier12 = NISTObjectIdentifiers.id_aes256_ECB;
            configurableProvider.addAlgorithm(string28, aSN1ObjectIdentifier12, str + string27);
            configurableProvider.addAlgorithm(string28, aSN1ObjectIdentifier3, AbstractC1482f.k(a.p(a.s(configurableProvider, string28, AbstractC1482f.k(new StringBuilder(), str, StubApp.getString2(31480)), str, aSN1ObjectIdentifier), StubApp.getString2(31480), configurableProvider, string28, aSN1ObjectIdentifier2), str, StubApp.getString2(31480)));
            ASN1ObjectIdentifier aSN1ObjectIdentifier13 = NISTObjectIdentifiers.id_aes128_OFB;
            a.A(configurableProvider, str, StubApp.getString2(31481), string28, aSN1ObjectIdentifier13);
            ASN1ObjectIdentifier aSN1ObjectIdentifier14 = NISTObjectIdentifiers.id_aes192_OFB;
            a.A(configurableProvider, str, StubApp.getString2(31481), string28, aSN1ObjectIdentifier14);
            ASN1ObjectIdentifier aSN1ObjectIdentifier15 = NISTObjectIdentifiers.id_aes256_OFB;
            a.A(configurableProvider, str, StubApp.getString2(31481), string28, aSN1ObjectIdentifier15);
            ASN1ObjectIdentifier aSN1ObjectIdentifier16 = NISTObjectIdentifiers.id_aes128_CFB;
            a.A(configurableProvider, str, StubApp.getString2(31482), string28, aSN1ObjectIdentifier16);
            ASN1ObjectIdentifier aSN1ObjectIdentifier17 = NISTObjectIdentifiers.id_aes192_CFB;
            a.A(configurableProvider, str, StubApp.getString2(31482), string28, aSN1ObjectIdentifier17);
            ASN1ObjectIdentifier aSN1ObjectIdentifier18 = NISTObjectIdentifiers.id_aes256_CFB;
            configurableProvider.addAlgorithm(string28, aSN1ObjectIdentifier18, str + StubApp.getString2(31482));
            configurableProvider.addAttributes(StubApp.getString2(31483), AES.generalAesAttributes);
            configurableProvider.addAlgorithm(StubApp.getString2(31483), str + StubApp.getString2(31484));
            ASN1ObjectIdentifier aSN1ObjectIdentifier19 = NISTObjectIdentifiers.id_aes128_wrap;
            String string29 = StubApp.getString2(31485);
            String string210 = StubApp.getString2(31486);
            configurableProvider.addAlgorithm(string29, aSN1ObjectIdentifier19, string210);
            ASN1ObjectIdentifier aSN1ObjectIdentifier20 = NISTObjectIdentifiers.id_aes192_wrap;
            configurableProvider.addAlgorithm(string29, aSN1ObjectIdentifier20, string210);
            ASN1ObjectIdentifier aSN1ObjectIdentifier21 = NISTObjectIdentifiers.id_aes256_wrap;
            configurableProvider.addAlgorithm(string29, aSN1ObjectIdentifier21, string210);
            configurableProvider.addAlgorithm(StubApp.getString2(31487), string210);
            configurableProvider.addAttributes(StubApp.getString2(31488), AES.generalAesAttributes);
            StringBuilder sb7 = new StringBuilder();
            sb7.append(str);
            a.y(sb7, StubApp.getString2(31489), configurableProvider, StubApp.getString2(31488));
            ASN1ObjectIdentifier aSN1ObjectIdentifier22 = NISTObjectIdentifiers.id_aes128_wrap_pad;
            String string211 = StubApp.getString2(31490);
            configurableProvider.addAlgorithm(string29, aSN1ObjectIdentifier22, string211);
            ASN1ObjectIdentifier aSN1ObjectIdentifier23 = NISTObjectIdentifiers.id_aes192_wrap_pad;
            configurableProvider.addAlgorithm(string29, aSN1ObjectIdentifier23, string211);
            ASN1ObjectIdentifier aSN1ObjectIdentifier24 = NISTObjectIdentifiers.id_aes256_wrap_pad;
            configurableProvider.addAlgorithm(string29, aSN1ObjectIdentifier24, string211);
            configurableProvider.addAlgorithm(StubApp.getString2(31497), a.c(StubApp.getString2(31495), a.c(StubApp.getString2(31493), a.c(StubApp.getString2(31491), string211, str, StubApp.getString2(31492), configurableProvider), str, StubApp.getString2(31494), configurableProvider), str, StubApp.getString2(31496), configurableProvider));
            configurableProvider.addAlgorithm(string26 + aSN1ObjectIdentifier7, string25);
            configurableProvider.addAlgorithm(string26 + aSN1ObjectIdentifier8, string25);
            configurableProvider.addAlgorithm(string26 + aSN1ObjectIdentifier9, string25);
            configurableProvider.addAttributes(StubApp.getString2(31498), AES.generalAesAttributes);
            StringBuilder sb8 = new StringBuilder();
            sb8.append(str);
            a.y(sb8, StubApp.getString2(31499), configurableProvider, StubApp.getString2(31498));
            configurableProvider.addAlgorithm(string29, aSN1ObjectIdentifier7, string25);
            configurableProvider.addAlgorithm(string29, aSN1ObjectIdentifier8, string25);
            StringBuilder s10 = a.s(configurableProvider, string29, string25, str, aSN1ObjectIdentifier9);
            s10.append(StubApp.getString2(31500));
            configurableProvider.addAlgorithm(StubApp.getString2(31501), s10.toString());
            StringBuilder q17 = a.q(a.q(new StringBuilder(string26), aSN1ObjectIdentifier4, configurableProvider, string24, string26), aSN1ObjectIdentifier5, configurableProvider, string24, string26);
            q17.append(aSN1ObjectIdentifier6);
            configurableProvider.addAlgorithm(q17.toString(), string24);
            configurableProvider.addAttributes(StubApp.getString2(31502), AES.generalAesAttributes);
            a.x(new StringBuilder(), str, StubApp.getString2(31503), configurableProvider, StubApp.getString2(31502));
            configurableProvider.addAlgorithm(string29, aSN1ObjectIdentifier4, string24);
            configurableProvider.addAlgorithm(string29, aSN1ObjectIdentifier5, string24);
            StringBuilder o5 = a.o(a.s(configurableProvider, string29, string24, str, aSN1ObjectIdentifier6), StubApp.getString2(31504), configurableProvider, StubApp.getString2(31505), str);
            String string212 = StubApp.getString2(31506);
            StringBuilder o10 = a.o(o5, string212, configurableProvider, StubApp.getString2(31507), str);
            String string213 = StubApp.getString2(31508);
            StringBuilder o11 = a.o(o10, string213, configurableProvider, StubApp.getString2(31509), str);
            String string214 = StubApp.getString2(31510);
            StringBuilder o12 = a.o(o11, string214, configurableProvider, StubApp.getString2(31511), str);
            String string215 = StubApp.getString2(31512);
            StringBuilder o13 = a.o(a.s(configurableProvider, string215, AbstractC1482f.k(a.p(a.s(configurableProvider, string215, AbstractC1482f.k(a.n(a.p(a.s(configurableProvider, string215, AbstractC1482f.k(a.p(a.s(configurableProvider, string215, AbstractC1482f.k(a.p(a.s(configurableProvider, string215, AbstractC1482f.k(a.p(a.s(configurableProvider, string215, AbstractC1482f.k(a.p(a.o(a.s(configurableProvider, string215, AbstractC1482f.k(a.p(a.s(configurableProvider, string215, AbstractC1482f.k(a.p(a.s(configurableProvider, string215, AbstractC1482f.k(a.p(a.s(configurableProvider, string215, AbstractC1482f.k(a.p(a.s(configurableProvider, string215, AbstractC1482f.k(a.p(a.s(configurableProvider, string215, AbstractC1482f.k(a.p(o12, string212, configurableProvider, string215, aSN1ObjectIdentifier10), str, string212), str, aSN1ObjectIdentifier), string212, configurableProvider, string215, aSN1ObjectIdentifier13), str, string212), str, aSN1ObjectIdentifier16), string213, configurableProvider, string215, aSN1ObjectIdentifier11), str, string213), str, aSN1ObjectIdentifier2), string213, configurableProvider, string215, aSN1ObjectIdentifier14), str, string213), str, aSN1ObjectIdentifier17), string214, configurableProvider, string215, aSN1ObjectIdentifier12), str, string214), str, aSN1ObjectIdentifier3), string214, configurableProvider, string215, aSN1ObjectIdentifier15), str, string214), str, aSN1ObjectIdentifier18), StubApp.getString2(31504), configurableProvider, StubApp.getString2(31513), str), string212, configurableProvider, string215, aSN1ObjectIdentifier19), str, string213), str, aSN1ObjectIdentifier20), string214, configurableProvider, string215, aSN1ObjectIdentifier21), str, string212), str, aSN1ObjectIdentifier4), string213, configurableProvider, string215, aSN1ObjectIdentifier5), str, string214), str, aSN1ObjectIdentifier6), string212, configurableProvider, string215, aSN1ObjectIdentifier7), str, string213), str, aSN1ObjectIdentifier8), string214, configurableProvider, string215, aSN1ObjectIdentifier9), str, StubApp.getString2(31504), configurableProvider, StubApp.getString2(31514)), str, string212), str, aSN1ObjectIdentifier22), string213, configurableProvider, string215, aSN1ObjectIdentifier23), str, string214), str, aSN1ObjectIdentifier24), StubApp.getString2(31515), configurableProvider, StubApp.getString2(31516), str);
            o13.append(StubApp.getString2(31517));
            configurableProvider.addAlgorithm(StubApp.getString2(31518), o13.toString());
            configurableProvider.addAlgorithm(StubApp.getString2(31003) + aSN1ObjectIdentifier7.getId(), StubApp.getString2(31519));
            configurableProvider.addAlgorithm(StubApp.getString2(31003) + aSN1ObjectIdentifier8.getId(), StubApp.getString2(31519));
            configurableProvider.addAlgorithm(StubApp.getString2(31003) + aSN1ObjectIdentifier9.getId(), StubApp.getString2(31519));
            ASN1ObjectIdentifier aSN1ObjectIdentifier25 = BCObjectIdentifiers.bc_pbe_sha1_pkcs12_aes128_cbc;
            String string216 = StubApp.getString2(31520);
            configurableProvider.addAlgorithm(string29, aSN1ObjectIdentifier25, string216);
            ASN1ObjectIdentifier aSN1ObjectIdentifier26 = BCObjectIdentifiers.bc_pbe_sha1_pkcs12_aes192_cbc;
            String string217 = StubApp.getString2(31521);
            configurableProvider.addAlgorithm(string29, aSN1ObjectIdentifier26, string217);
            ASN1ObjectIdentifier aSN1ObjectIdentifier27 = BCObjectIdentifiers.bc_pbe_sha1_pkcs12_aes256_cbc;
            String string218 = StubApp.getString2(31522);
            configurableProvider.addAlgorithm(string29, aSN1ObjectIdentifier27, string218);
            ASN1ObjectIdentifier aSN1ObjectIdentifier28 = BCObjectIdentifiers.bc_pbe_sha256_pkcs12_aes128_cbc;
            String string219 = StubApp.getString2(31523);
            configurableProvider.addAlgorithm(string29, aSN1ObjectIdentifier28, string219);
            ASN1ObjectIdentifier aSN1ObjectIdentifier29 = BCObjectIdentifiers.bc_pbe_sha256_pkcs12_aes192_cbc;
            String string220 = StubApp.getString2(31524);
            configurableProvider.addAlgorithm(string29, aSN1ObjectIdentifier29, string220);
            ASN1ObjectIdentifier aSN1ObjectIdentifier30 = BCObjectIdentifiers.bc_pbe_sha256_pkcs12_aes256_cbc;
            String string221 = StubApp.getString2(31525);
            a.y(a.o(a.o(a.o(a.o(a.o(a.s(configurableProvider, string29, string221, str, aSN1ObjectIdentifier30), StubApp.getString2(31526), configurableProvider, StubApp.getString2(31527), str), StubApp.getString2(31528), configurableProvider, StubApp.getString2(31529), str), StubApp.getString2(31530), configurableProvider, StubApp.getString2(31531), str), StubApp.getString2(31532), configurableProvider, StubApp.getString2(31533), str), StubApp.getString2(31534), configurableProvider, StubApp.getString2(31535), str), StubApp.getString2(31536), configurableProvider, StubApp.getString2(31537));
            configurableProvider.addAlgorithm(StubApp.getString2(31538), string216);
            configurableProvider.addAlgorithm(StubApp.getString2(31539), string217);
            configurableProvider.addAlgorithm(StubApp.getString2(31540), string218);
            configurableProvider.addAlgorithm(StubApp.getString2(31541), string216);
            configurableProvider.addAlgorithm(StubApp.getString2(31542), string217);
            configurableProvider.addAlgorithm(StubApp.getString2(31543), string218);
            configurableProvider.addAlgorithm(StubApp.getString2(31544), string216);
            configurableProvider.addAlgorithm(StubApp.getString2(31545), string217);
            configurableProvider.addAlgorithm(StubApp.getString2(31546), string218);
            configurableProvider.addAlgorithm(StubApp.getString2(31547), string216);
            configurableProvider.addAlgorithm(StubApp.getString2(31548), string217);
            configurableProvider.addAlgorithm(StubApp.getString2(31549), string218);
            configurableProvider.addAlgorithm(StubApp.getString2(31550), string216);
            configurableProvider.addAlgorithm(StubApp.getString2(31551), string217);
            configurableProvider.addAlgorithm(StubApp.getString2(31552), string218);
            configurableProvider.addAlgorithm(StubApp.getString2(31553), string219);
            configurableProvider.addAlgorithm(StubApp.getString2(31554), string220);
            configurableProvider.addAlgorithm(StubApp.getString2(31555), string221);
            configurableProvider.addAlgorithm(StubApp.getString2(31556), string219);
            configurableProvider.addAlgorithm(StubApp.getString2(31557), string220);
            configurableProvider.addAlgorithm(StubApp.getString2(31558), string221);
            configurableProvider.addAlgorithm(StubApp.getString2(31559), string219);
            configurableProvider.addAlgorithm(StubApp.getString2(31560), string220);
            configurableProvider.addAlgorithm(StubApp.getString2(31561), string221);
            a.x(a.n(a.n(a.n(new StringBuilder(), str, StubApp.getString2(31562), configurableProvider, StubApp.getString2(31563)), str, StubApp.getString2(31562), configurableProvider, StubApp.getString2(31564)), str, StubApp.getString2(31562), configurableProvider, StubApp.getString2(31565)), str, StubApp.getString2(31566), configurableProvider, StubApp.getString2(31567));
            configurableProvider.addAlgorithm(StubApp.getString2(31568), NISTObjectIdentifiers.aes, str + StubApp.getString2(31566));
            a.x(a.n(a.n(a.n(a.n(a.n(a.n(a.n(a.n(new StringBuilder(), str, StubApp.getString2(31569), configurableProvider, StubApp.getString2(31570)), str, StubApp.getString2(31571), configurableProvider, StubApp.getString2(31572)), str, StubApp.getString2(31573), configurableProvider, StubApp.getString2(31574)), str, StubApp.getString2(31575), configurableProvider, StubApp.getString2(31576)), str, StubApp.getString2(31577), configurableProvider, StubApp.getString2(31578)), str, StubApp.getString2(31579), configurableProvider, StubApp.getString2(31580)), str, StubApp.getString2(31581), configurableProvider, StubApp.getString2(31582)), str, StubApp.getString2(31583), configurableProvider, StubApp.getString2(31584)), str, StubApp.getString2(31585), configurableProvider, StubApp.getString2(31586));
            configurableProvider.addAlgorithm(StubApp.getString2(31587), string216);
            configurableProvider.addAlgorithm(StubApp.getString2(31588), string217);
            configurableProvider.addAlgorithm(StubApp.getString2(31589), string218);
            configurableProvider.addAlgorithm(StubApp.getString2(31590), string216);
            configurableProvider.addAlgorithm(StubApp.getString2(31591), string217);
            configurableProvider.addAlgorithm(StubApp.getString2(31592), string218);
            configurableProvider.addAlgorithm(StubApp.getString2(31593), string219);
            configurableProvider.addAlgorithm(StubApp.getString2(31594), string220);
            configurableProvider.addAlgorithm(StubApp.getString2(31595), string221);
            configurableProvider.addAlgorithm(StubApp.getString2(31596), string219);
            configurableProvider.addAlgorithm(StubApp.getString2(31597), string220);
            configurableProvider.addAlgorithm(StubApp.getString2(31598), string221);
            String string222 = StubApp.getString2(31599);
            configurableProvider.addAlgorithm(string222, aSN1ObjectIdentifier25, string216);
            configurableProvider.addAlgorithm(string222, aSN1ObjectIdentifier26, string217);
            configurableProvider.addAlgorithm(string222, aSN1ObjectIdentifier27, string218);
            configurableProvider.addAlgorithm(string222, aSN1ObjectIdentifier28, string219);
            configurableProvider.addAlgorithm(string222, aSN1ObjectIdentifier29, string220);
            configurableProvider.addAlgorithm(string222, aSN1ObjectIdentifier30, string221);
            String string223 = StubApp.getString2(31600);
            String string224 = StubApp.getString2(31601);
            configurableProvider.addAlgorithm(string223, string224);
            configurableProvider.addAlgorithm(StubApp.getString2(31602), string224);
            configurableProvider.addAlgorithm(StubApp.getString2(31603), string224);
            configurableProvider.addAlgorithm(StubApp.getString2(31604), string224);
            configurableProvider.addAlgorithm(StubApp.getString2(31605), string224);
            configurableProvider.addAlgorithm(StubApp.getString2(31606), string224);
            configurableProvider.addAlgorithm(StubApp.getString2(31607), string224);
            configurableProvider.addAlgorithm(StubApp.getString2(31608), string224);
            configurableProvider.addAlgorithm(StubApp.getString2(31609), string224);
            configurableProvider.addAlgorithm(StubApp.getString2(31610), string224);
            configurableProvider.addAlgorithm(StubApp.getString2(31611), string224);
            configurableProvider.addAlgorithm(StubApp.getString2(31612), string224);
            configurableProvider.addAlgorithm(StubApp.getString2(31613), string224);
            configurableProvider.addAlgorithm(StubApp.getString2(31614), string224);
            configurableProvider.addAlgorithm(StubApp.getString2(31615), string224);
            configurableProvider.addAlgorithm(string23 + aSN1ObjectIdentifier25.getId(), string224);
            configurableProvider.addAlgorithm(string23 + aSN1ObjectIdentifier26.getId(), string224);
            configurableProvider.addAlgorithm(string23 + aSN1ObjectIdentifier27.getId(), string224);
            configurableProvider.addAlgorithm(string23 + aSN1ObjectIdentifier28.getId(), string224);
            configurableProvider.addAlgorithm(string23 + aSN1ObjectIdentifier29.getId(), string224);
            configurableProvider.addAlgorithm(string23 + aSN1ObjectIdentifier30.getId(), string224);
            addGMacAlgorithm(configurableProvider, string22, str + StubApp.getString2(31616), AbstractC1482f.g(str, string212));
            addPoly1305Algorithm(configurableProvider, string22, AbstractC1482f.g(str, StubApp.getString2(31617)), AbstractC1482f.g(str, StubApp.getString2(31618)));
        }
    }

    public static class OFB extends BaseBlockCipher {
        public OFB() {
            super(new BufferedBlockCipher(new OFBBlockCipher(new AESEngine(), 128)), 128);
        }
    }

    public static class PBEWithAESCBC extends BaseBlockCipher {
        public PBEWithAESCBC() {
            super(new CBCBlockCipher(new AESEngine()));
        }
    }

    public static class PBEWithMD5And128BitAESCBCOpenSSL extends PBESecretKeyFactory {
        public PBEWithMD5And128BitAESCBCOpenSSL() {
            super(StubApp.getString2(31619), null, true, 3, 0, 128, 128);
        }
    }

    public static class PBEWithMD5And192BitAESCBCOpenSSL extends PBESecretKeyFactory {
        public PBEWithMD5And192BitAESCBCOpenSSL() {
            super(StubApp.getString2(31620), null, true, 3, 0, 192, 128);
        }
    }

    public static class PBEWithMD5And256BitAESCBCOpenSSL extends PBESecretKeyFactory {
        public PBEWithMD5And256BitAESCBCOpenSSL() {
            super(StubApp.getString2(31621), null, true, 3, 0, 256, 128);
        }
    }

    public static class PBEWithSHA1AESCBC128 extends BaseBlockCipher {
        public PBEWithSHA1AESCBC128() {
            super(new CBCBlockCipher(new AESEngine()), 2, 1, 128, 16);
        }
    }

    public static class PBEWithSHA1AESCBC192 extends BaseBlockCipher {
        public PBEWithSHA1AESCBC192() {
            super(new CBCBlockCipher(new AESEngine()), 2, 1, 192, 16);
        }
    }

    public static class PBEWithSHA1AESCBC256 extends BaseBlockCipher {
        public PBEWithSHA1AESCBC256() {
            super(new CBCBlockCipher(new AESEngine()), 2, 1, 256, 16);
        }
    }

    public static class PBEWithSHA256AESCBC128 extends BaseBlockCipher {
        public PBEWithSHA256AESCBC128() {
            super(new CBCBlockCipher(new AESEngine()), 2, 4, 128, 16);
        }
    }

    public static class PBEWithSHA256AESCBC192 extends BaseBlockCipher {
        public PBEWithSHA256AESCBC192() {
            super(new CBCBlockCipher(new AESEngine()), 2, 4, 192, 16);
        }
    }

    public static class PBEWithSHA256AESCBC256 extends BaseBlockCipher {
        public PBEWithSHA256AESCBC256() {
            super(new CBCBlockCipher(new AESEngine()), 2, 4, 256, 16);
        }
    }

    public static class PBEWithSHA256And128BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHA256And128BitAESBC() {
            super(StubApp.getString2(31622), null, true, 2, 4, 128, 128);
        }
    }

    public static class PBEWithSHA256And192BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHA256And192BitAESBC() {
            super(StubApp.getString2(31623), null, true, 2, 4, 192, 128);
        }
    }

    public static class PBEWithSHA256And256BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHA256And256BitAESBC() {
            super(StubApp.getString2(31624), null, true, 2, 4, 256, 128);
        }
    }

    public static class PBEWithSHAAnd128BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHAAnd128BitAESBC() {
            super(StubApp.getString2(31625), null, true, 2, 1, 128, 128);
        }
    }

    public static class PBEWithSHAAnd192BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHAAnd192BitAESBC() {
            super(StubApp.getString2(31626), null, true, 2, 1, 192, 128);
        }
    }

    public static class PBEWithSHAAnd256BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHAAnd256BitAESBC() {
            super(StubApp.getString2(31627), null, true, 2, 1, 256, 128);
        }
    }

    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new org.bouncycastle.crypto.macs.Poly1305(new AESEngine()));
        }
    }

    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super(StubApp.getString2(31628), 256, new Poly1305KeyGenerator());
        }
    }

    public static class RFC3211Wrap extends BaseWrapCipher {
        public RFC3211Wrap() {
            super(new RFC3211WrapEngine(new AESEngine()), 16);
        }
    }

    public static class RFC5649Wrap extends BaseWrapCipher {
        public RFC5649Wrap() {
            super(new RFC5649WrapEngine(new AESEngine()));
        }
    }

    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new AESWrapEngine());
        }
    }

    public static class WrapPad extends BaseWrapCipher {
        public WrapPad() {
            super(new AESWrapPadEngine());
        }
    }

    static {
        HashMap hashMap = new HashMap();
        generalAesAttributes = hashMap;
        hashMap.put(StubApp.getString2(29653), StubApp.getString2(31629));
        hashMap.put(StubApp.getString2(29655), StubApp.getString2(31343));
    }

    private AES() {
    }
}
