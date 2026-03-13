package org.bouncycastle.jcajce.provider.symmetric;

import com.stub.StubApp;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.kisa.KISAObjectIdentifiers;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.engines.SEEDEngine;
import org.bouncycastle.crypto.engines.SEEDWrapEngine;
import org.bouncycastle.crypto.generators.Poly1305KeyGenerator;
import org.bouncycastle.crypto.macs.CMac;
import org.bouncycastle.crypto.macs.GMac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.GCMBlockCipher;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class SEED {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            if (this.random == null) {
                this.random = CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance(StubApp.getString2("28259"));
                createParametersInstance.init(new IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (Exception e10) {
                throw new RuntimeException(e10.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException(StubApp.getString2(32170));
        }
    }

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return StubApp.getString2(32171);
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new CBCBlockCipher(new SEEDEngine()), 128);
        }
    }

    public static class CMAC extends BaseMac {
        public CMAC() {
            super(new CMac(new SEEDEngine()));
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.SEED.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public BlockCipher get() {
                    return new SEEDEngine();
                }
            });
        }
    }

    public static class GMAC extends BaseMac {
        public GMAC() {
            super(new GMac(new GCMBlockCipher(new SEEDEngine())));
        }
    }

    public static class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super(StubApp.getString2(28259), null);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super(StubApp.getString2(28259), 128, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = SEED.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            sb2.append(str);
            sb2.append(StubApp.getString2(31459));
            configurableProvider.addAlgorithm(StubApp.getString2(32172), sb2.toString());
            StringBuilder sb3 = new StringBuilder(StubApp.getString2(31464));
            ASN1ObjectIdentifier aSN1ObjectIdentifier = KISAObjectIdentifiers.id_seedCBC;
            String string2 = StubApp.getString2(28259);
            StringBuilder C10 = a.C(sb3, string2, configurableProvider, str, aSN1ObjectIdentifier);
            C10.append(StubApp.getString2(31469));
            configurableProvider.addAlgorithm(StubApp.getString2(32173), C10.toString());
            a.x(a.p(a.o(a.C(new StringBuilder(StubApp.getString2(31474)), string2, configurableProvider, str, aSN1ObjectIdentifier), StubApp.getString2(31476), configurableProvider, StubApp.getString2(32174), str), StubApp.getString2(31480), configurableProvider, StubApp.getString2(30341), aSN1ObjectIdentifier), str, StubApp.getString2(31484), configurableProvider, StubApp.getString2(32175));
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = KISAObjectIdentifiers.id_npki_app_cmsSeed_wrap;
            String string22 = StubApp.getString2(31485);
            String string23 = StubApp.getString2(32176);
            configurableProvider.addAlgorithm(string22, aSN1ObjectIdentifier2, string23);
            String string24 = StubApp.getString2(32177);
            String string25 = StubApp.getString2(31504);
            String c10 = a.c(StubApp.getString2(32178), a.c(string24, string23, str, string25, configurableProvider), str, string25, configurableProvider);
            String string26 = StubApp.getString2(31512);
            a.x(a.p(a.s(configurableProvider, string26, c10, str, aSN1ObjectIdentifier), string25, configurableProvider, string26, aSN1ObjectIdentifier2), str, StubApp.getString2(31566), configurableProvider, StubApp.getString2(32179));
            StringBuilder s10 = a.s(configurableProvider, StubApp.getString2(31599), string2, str, aSN1ObjectIdentifier);
            s10.append(StubApp.getString2(31678));
            addCMacAlgorithm(configurableProvider, string2, s10.toString(), AbstractC1482f.g(str, string25));
            addGMacAlgorithm(configurableProvider, string2, AbstractC1482f.g(str, StubApp.getString2(31675)), AbstractC1482f.g(str, string25));
            addPoly1305Algorithm(configurableProvider, string2, AbstractC1482f.g(str, StubApp.getString2(31617)), AbstractC1482f.g(str, StubApp.getString2(31618)));
        }
    }

    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new org.bouncycastle.crypto.macs.Poly1305(new SEEDEngine()));
        }
    }

    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super(StubApp.getString2(32180), 256, new Poly1305KeyGenerator());
        }
    }

    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new SEEDWrapEngine());
        }
    }

    private SEED() {
    }
}
