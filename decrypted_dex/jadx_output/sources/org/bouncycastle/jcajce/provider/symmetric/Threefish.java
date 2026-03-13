package org.bouncycastle.jcajce.provider.symmetric;

import com.stub.StubApp;
import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.crypto.macs.CMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class Threefish {

    public static class AlgParams_1024 extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return StubApp.getString2(32279);
        }
    }

    public static class AlgParams_256 extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return StubApp.getString2(32280);
        }
    }

    public static class AlgParams_512 extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return StubApp.getString2(32281);
        }
    }

    public static class CMAC_1024 extends BaseMac {
        public CMAC_1024() {
            super(new CMac(new ThreefishEngine(1024)));
        }
    }

    public static class CMAC_256 extends BaseMac {
        public CMAC_256() {
            super(new CMac(new ThreefishEngine(256)));
        }
    }

    public static class CMAC_512 extends BaseMac {
        public CMAC_512() {
            super(new CMac(new ThreefishEngine(512)));
        }
    }

    public static class ECB_1024 extends BaseBlockCipher {
        public ECB_1024() {
            super(new ThreefishEngine(1024));
        }
    }

    public static class ECB_256 extends BaseBlockCipher {
        public ECB_256() {
            super(new ThreefishEngine(256));
        }
    }

    public static class ECB_512 extends BaseBlockCipher {
        public ECB_512() {
            super(new ThreefishEngine(512));
        }
    }

    public static class KeyGen_1024 extends BaseKeyGenerator {
        public KeyGen_1024() {
            super(StubApp.getString2(32282), 1024, new CipherKeyGenerator());
        }
    }

    public static class KeyGen_256 extends BaseKeyGenerator {
        public KeyGen_256() {
            super(StubApp.getString2(32283), 256, new CipherKeyGenerator());
        }
    }

    public static class KeyGen_512 extends BaseKeyGenerator {
        public KeyGen_512() {
            super(StubApp.getString2(32284), 512, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = Threefish.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            a.x(a.n(a.n(a.n(a.n(a.n(a.n(a.n(a.n(a.n(a.n(a.n(sb2, str, StubApp.getString2(32285), configurableProvider, StubApp.getString2(32286)), str, StubApp.getString2(32287), configurableProvider, StubApp.getString2(32288)), str, StubApp.getString2(32289), configurableProvider, StubApp.getString2(32290)), str, StubApp.getString2(31881), configurableProvider, StubApp.getString2(32291)), str, StubApp.getString2(31883), configurableProvider, StubApp.getString2(32292)), str, StubApp.getString2(32293), configurableProvider, StubApp.getString2(32294)), str, StubApp.getString2(32295), configurableProvider, StubApp.getString2(32296)), str, StubApp.getString2(32297), configurableProvider, StubApp.getString2(32298)), str, StubApp.getString2(32299), configurableProvider, StubApp.getString2(32300)), str, StubApp.getString2(32301), configurableProvider, StubApp.getString2(32302)), str, StubApp.getString2(32303), configurableProvider, StubApp.getString2(32304)), str, StubApp.getString2(32305), configurableProvider, StubApp.getString2(32306));
        }
    }

    private Threefish() {
    }
}
