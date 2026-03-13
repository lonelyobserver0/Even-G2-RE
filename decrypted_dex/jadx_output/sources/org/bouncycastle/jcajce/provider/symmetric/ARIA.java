package org.bouncycastle.jcajce.provider.symmetric;

import com.stub.StubApp;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.engines.ARIAEngine;
import org.bouncycastle.crypto.engines.ARIAWrapEngine;
import org.bouncycastle.crypto.engines.ARIAWrapPadEngine;
import org.bouncycastle.crypto.engines.RFC3211WrapEngine;
import org.bouncycastle.crypto.generators.Poly1305KeyGenerator;
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
import org.bouncycastle.jcajce.spec.AEADParameterSpec;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class ARIA {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            if (this.random == null) {
                this.random = CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance(StubApp.getString2("28558"));
                createParametersInstance.init(new IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (Exception e10) {
                throw new RuntimeException(e10.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException(StubApp.getString2(31653));
        }
    }

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return StubApp.getString2(31654);
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
            super(new CBCBlockCipher(new ARIAEngine()), 128);
        }
    }

    public static class CCM extends BaseBlockCipher {
        public CCM() {
            super((AEADBlockCipher) new CCMBlockCipher(new ARIAEngine()), false, 12);
        }
    }

    public static class CFB extends BaseBlockCipher {
        public CFB() {
            super(new BufferedBlockCipher(new CFBBlockCipher(new ARIAEngine(), 128)), 128);
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.ARIA.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public BlockCipher get() {
                    return new ARIAEngine();
                }
            });
        }
    }

    public static class GCM extends BaseBlockCipher {
        public GCM() {
            super(new GCMBlockCipher(new ARIAEngine()));
        }
    }

    public static class GMAC extends BaseMac {
        public GMAC() {
            super(new GMac(new GCMBlockCipher(new ARIAEngine())));
        }
    }

    public static class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super(StubApp.getString2(28558), null);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            this(256);
        }

        public KeyGen(int i3) {
            super(StubApp.getString2(28558), i3, new CipherKeyGenerator());
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
        private static final String PREFIX = ARIA.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            a.x(sb2, str, StubApp.getString2(31459), configurableProvider, StubApp.getString2(31655));
            ASN1ObjectIdentifier aSN1ObjectIdentifier = NSRIObjectIdentifiers.id_aria128_cbc;
            String string2 = StubApp.getString2(31656);
            String string22 = StubApp.getString2(28558);
            configurableProvider.addAlgorithm(string2, aSN1ObjectIdentifier, string22);
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NSRIObjectIdentifiers.id_aria192_cbc;
            configurableProvider.addAlgorithm(string2, aSN1ObjectIdentifier2, string22);
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NSRIObjectIdentifiers.id_aria256_cbc;
            StringBuilder s10 = a.s(configurableProvider, string2, string22, str, aSN1ObjectIdentifier3);
            String string23 = StubApp.getString2(31469);
            a.y(s10, string23, configurableProvider, StubApp.getString2(31657));
            String string24 = StubApp.getString2(31658);
            configurableProvider.addAlgorithm(string24, aSN1ObjectIdentifier, string22);
            configurableProvider.addAlgorithm(string24, aSN1ObjectIdentifier2, string22);
            configurableProvider.addAlgorithm(string24, aSN1ObjectIdentifier3, string22);
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NSRIObjectIdentifiers.id_aria128_ofb;
            configurableProvider.addAlgorithm(string24, aSN1ObjectIdentifier4, string22);
            ASN1ObjectIdentifier aSN1ObjectIdentifier5 = NSRIObjectIdentifiers.id_aria192_ofb;
            configurableProvider.addAlgorithm(string24, aSN1ObjectIdentifier5, string22);
            ASN1ObjectIdentifier aSN1ObjectIdentifier6 = NSRIObjectIdentifiers.id_aria256_ofb;
            configurableProvider.addAlgorithm(string24, aSN1ObjectIdentifier6, string22);
            ASN1ObjectIdentifier aSN1ObjectIdentifier7 = NSRIObjectIdentifiers.id_aria128_cfb;
            configurableProvider.addAlgorithm(string24, aSN1ObjectIdentifier7, string22);
            ASN1ObjectIdentifier aSN1ObjectIdentifier8 = NSRIObjectIdentifiers.id_aria192_cfb;
            configurableProvider.addAlgorithm(string24, aSN1ObjectIdentifier8, string22);
            ASN1ObjectIdentifier aSN1ObjectIdentifier9 = NSRIObjectIdentifiers.id_aria256_cfb;
            StringBuilder s11 = a.s(configurableProvider, string24, string22, str, aSN1ObjectIdentifier9);
            String string25 = StubApp.getString2(31476);
            a.y(s11, string25, configurableProvider, StubApp.getString2(31659));
            ASN1ObjectIdentifier aSN1ObjectIdentifier10 = NSRIObjectIdentifiers.id_aria128_ecb;
            String string26 = StubApp.getString2(30341);
            a.A(configurableProvider, str, string25, string26, aSN1ObjectIdentifier10);
            ASN1ObjectIdentifier aSN1ObjectIdentifier11 = NSRIObjectIdentifiers.id_aria192_ecb;
            a.A(configurableProvider, str, string25, string26, aSN1ObjectIdentifier11);
            ASN1ObjectIdentifier aSN1ObjectIdentifier12 = NSRIObjectIdentifiers.id_aria256_ecb;
            configurableProvider.addAlgorithm(string26, aSN1ObjectIdentifier12, str + string25);
            StringBuilder sb3 = new StringBuilder();
            String string27 = StubApp.getString2(31480);
            StringBuilder s12 = a.s(configurableProvider, string26, AbstractC1482f.k(a.p(a.s(configurableProvider, string26, AbstractC1482f.k(sb3, str, string27), str, aSN1ObjectIdentifier), string27, configurableProvider, string26, aSN1ObjectIdentifier2), str, string27), str, aSN1ObjectIdentifier3);
            String string28 = StubApp.getString2(31482);
            StringBuilder p8 = a.p(a.s(configurableProvider, string26, AbstractC1482f.k(a.p(s12, string28, configurableProvider, string26, aSN1ObjectIdentifier7), str, string28), str, aSN1ObjectIdentifier8), string28, configurableProvider, string26, aSN1ObjectIdentifier9);
            String string29 = StubApp.getString2(31481);
            a.y(a.o(a.s(configurableProvider, string26, AbstractC1482f.k(a.p(a.s(configurableProvider, string26, AbstractC1482f.k(p8, str, string29), str, aSN1ObjectIdentifier4), string29, configurableProvider, string26, aSN1ObjectIdentifier5), str, string29), str, aSN1ObjectIdentifier6), StubApp.getString2(31492), configurableProvider, StubApp.getString2(31660), str), StubApp.getString2(31484), configurableProvider, StubApp.getString2(31661));
            ASN1ObjectIdentifier aSN1ObjectIdentifier13 = NSRIObjectIdentifiers.id_aria128_kw;
            String string210 = StubApp.getString2(31485);
            String string211 = StubApp.getString2(31662);
            configurableProvider.addAlgorithm(string210, aSN1ObjectIdentifier13, string211);
            ASN1ObjectIdentifier aSN1ObjectIdentifier14 = NSRIObjectIdentifiers.id_aria192_kw;
            configurableProvider.addAlgorithm(string210, aSN1ObjectIdentifier14, string211);
            ASN1ObjectIdentifier aSN1ObjectIdentifier15 = NSRIObjectIdentifiers.id_aria256_kw;
            configurableProvider.addAlgorithm(string210, aSN1ObjectIdentifier15, string211);
            configurableProvider.addAlgorithm(StubApp.getString2(31664), a.c(StubApp.getString2(31663), string211, str, StubApp.getString2(31489), configurableProvider));
            ASN1ObjectIdentifier aSN1ObjectIdentifier16 = NSRIObjectIdentifiers.id_aria128_kwp;
            String string212 = StubApp.getString2(31665);
            configurableProvider.addAlgorithm(string210, aSN1ObjectIdentifier16, string212);
            ASN1ObjectIdentifier aSN1ObjectIdentifier17 = NSRIObjectIdentifiers.id_aria192_kwp;
            configurableProvider.addAlgorithm(string210, aSN1ObjectIdentifier17, string212);
            ASN1ObjectIdentifier aSN1ObjectIdentifier18 = NSRIObjectIdentifiers.id_aria256_kwp;
            configurableProvider.addAlgorithm(string210, aSN1ObjectIdentifier18, string212);
            String string213 = StubApp.getString2(31666);
            String string214 = StubApp.getString2(31504);
            String c10 = a.c(string213, string212, str, string214, configurableProvider);
            String string215 = StubApp.getString2(31667);
            String string216 = StubApp.getString2(31506);
            String c11 = a.c(string215, c10, str, string216, configurableProvider);
            String string217 = StubApp.getString2(31512);
            StringBuilder s13 = a.s(configurableProvider, string217, c11, str, aSN1ObjectIdentifier13);
            String string218 = StubApp.getString2(31508);
            StringBuilder p9 = a.p(s13, string218, configurableProvider, string217, aSN1ObjectIdentifier14);
            String string219 = StubApp.getString2(31510);
            StringBuilder s14 = a.s(configurableProvider, string217, AbstractC1482f.k(a.p(a.s(configurableProvider, string217, AbstractC1482f.k(a.p(a.s(configurableProvider, string217, AbstractC1482f.k(a.p(a.s(configurableProvider, string217, AbstractC1482f.k(a.p(a.s(configurableProvider, string217, AbstractC1482f.k(a.p(a.s(configurableProvider, string217, AbstractC1482f.k(a.p(a.s(configurableProvider, string217, AbstractC1482f.k(a.p(a.s(configurableProvider, string217, AbstractC1482f.k(p9, str, string219), str, aSN1ObjectIdentifier15), string216, configurableProvider, string217, aSN1ObjectIdentifier16), str, string218), str, aSN1ObjectIdentifier17), string219, configurableProvider, string217, aSN1ObjectIdentifier18), str, string216), str, aSN1ObjectIdentifier10), string218, configurableProvider, string217, aSN1ObjectIdentifier11), str, string219), str, aSN1ObjectIdentifier12), string216, configurableProvider, string217, aSN1ObjectIdentifier), str, string218), str, aSN1ObjectIdentifier2), string219, configurableProvider, string217, aSN1ObjectIdentifier3), str, string216), str, aSN1ObjectIdentifier7), string218, configurableProvider, string217, aSN1ObjectIdentifier8), str, string219), str, aSN1ObjectIdentifier9), string216, configurableProvider, string217, aSN1ObjectIdentifier4), str, string218), str, aSN1ObjectIdentifier5);
            s14.append(string219);
            configurableProvider.addAlgorithm(string217, aSN1ObjectIdentifier6, s14.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier19 = NSRIObjectIdentifiers.id_aria128_ccm;
            a.A(configurableProvider, str, string216, string217, aSN1ObjectIdentifier19);
            ASN1ObjectIdentifier aSN1ObjectIdentifier20 = NSRIObjectIdentifiers.id_aria192_ccm;
            a.A(configurableProvider, str, string218, string217, aSN1ObjectIdentifier20);
            ASN1ObjectIdentifier aSN1ObjectIdentifier21 = NSRIObjectIdentifiers.id_aria256_ccm;
            a.A(configurableProvider, str, string219, string217, aSN1ObjectIdentifier21);
            ASN1ObjectIdentifier aSN1ObjectIdentifier22 = NSRIObjectIdentifiers.id_aria128_gcm;
            a.A(configurableProvider, str, string216, string217, aSN1ObjectIdentifier22);
            ASN1ObjectIdentifier aSN1ObjectIdentifier23 = NSRIObjectIdentifiers.id_aria192_gcm;
            a.A(configurableProvider, str, string218, string217, aSN1ObjectIdentifier23);
            ASN1ObjectIdentifier aSN1ObjectIdentifier24 = NSRIObjectIdentifiers.id_aria256_gcm;
            configurableProvider.addAlgorithm(string217, aSN1ObjectIdentifier24, str + string219);
            a.x(new StringBuilder(), str, StubApp.getString2(31566), configurableProvider, StubApp.getString2(31668));
            String string220 = StubApp.getString2(31599);
            configurableProvider.addAlgorithm(string220, aSN1ObjectIdentifier, string22);
            configurableProvider.addAlgorithm(string220, aSN1ObjectIdentifier2, string22);
            StringBuilder s15 = a.s(configurableProvider, string220, string22, str, aSN1ObjectIdentifier3);
            s15.append(string23);
            configurableProvider.addAlgorithm(StubApp.getString2(31669), s15.toString());
            String string221 = StubApp.getString2(31474);
            StringBuilder sb4 = new StringBuilder(string221);
            String string222 = StubApp.getString2(31670);
            a.y(a.C(a.q(a.q(sb4, aSN1ObjectIdentifier19, configurableProvider, string222, string221), aSN1ObjectIdentifier20, configurableProvider, string222, string221), string222, configurableProvider, str, aSN1ObjectIdentifier21), StubApp.getString2(31499), configurableProvider, StubApp.getString2(31671));
            String string223 = StubApp.getString2(29619);
            configurableProvider.addAlgorithm(string210, aSN1ObjectIdentifier19, string223);
            configurableProvider.addAlgorithm(string210, aSN1ObjectIdentifier20, string223);
            StringBuilder s16 = a.s(configurableProvider, string210, string223, str, aSN1ObjectIdentifier21);
            s16.append(string23);
            configurableProvider.addAlgorithm(StubApp.getString2(31672), s16.toString());
            StringBuilder sb5 = new StringBuilder(string221);
            String string224 = StubApp.getString2(31673);
            a.y(a.C(a.q(a.q(sb5, aSN1ObjectIdentifier22, configurableProvider, string224, string221), aSN1ObjectIdentifier23, configurableProvider, string224, string221), string224, configurableProvider, str, aSN1ObjectIdentifier24), StubApp.getString2(31503), configurableProvider, StubApp.getString2(31674));
            configurableProvider.addAlgorithm(string210, aSN1ObjectIdentifier22, string224);
            configurableProvider.addAlgorithm(string210, aSN1ObjectIdentifier23, string224);
            StringBuilder s17 = a.s(configurableProvider, string210, string224, str, aSN1ObjectIdentifier24);
            s17.append(StubApp.getString2(31675));
            addGMacAlgorithm(configurableProvider, string22, s17.toString(), AbstractC1482f.g(str, string214));
            addPoly1305Algorithm(configurableProvider, string22, AbstractC1482f.g(str, StubApp.getString2(31617)), AbstractC1482f.g(str, StubApp.getString2(31618)));
        }
    }

    public static class OFB extends BaseBlockCipher {
        public OFB() {
            super(new BufferedBlockCipher(new OFBBlockCipher(new ARIAEngine(), 128)), 128);
        }
    }

    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new org.bouncycastle.crypto.macs.Poly1305(new ARIAEngine()));
        }
    }

    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super(StubApp.getString2(31676), 256, new Poly1305KeyGenerator());
        }
    }

    public static class RFC3211Wrap extends BaseWrapCipher {
        public RFC3211Wrap() {
            super(new RFC3211WrapEngine(new ARIAEngine()), 16);
        }
    }

    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new ARIAWrapEngine());
        }
    }

    public static class WrapPad extends BaseWrapCipher {
        public WrapPad() {
            super(new ARIAWrapPadEngine());
        }
    }

    private ARIA() {
    }
}
