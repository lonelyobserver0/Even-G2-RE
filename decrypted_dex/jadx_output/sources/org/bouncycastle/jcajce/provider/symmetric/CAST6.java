package org.bouncycastle.jcajce.provider.symmetric;

import com.stub.StubApp;
import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.CAST6Engine;
import org.bouncycastle.crypto.generators.Poly1305KeyGenerator;
import org.bouncycastle.crypto.macs.GMac;
import org.bouncycastle.crypto.modes.GCMBlockCipher;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class CAST6 {

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return StubApp.getString2(31695);
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.CAST6.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public BlockCipher get() {
                    return new CAST6Engine();
                }
            });
        }
    }

    public static class GMAC extends BaseMac {
        public GMAC() {
            super(new GMac(new GCMBlockCipher(new CAST6Engine())));
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super(StubApp.getString2(28568), 256, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = CAST6.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            StringBuilder n10 = a.n(sb2, str, StubApp.getString2(31476), configurableProvider, StubApp.getString2(31696));
            String string2 = StubApp.getString2(31504);
            String k3 = AbstractC1482f.k(a.n(a.n(n10, str, string2, configurableProvider, StubApp.getString2(31697)), str, StubApp.getString2(31459), configurableProvider, StubApp.getString2(31698)), str, StubApp.getString2(31675));
            String g10 = AbstractC1482f.g(str, string2);
            String string22 = StubApp.getString2(28568);
            addGMacAlgorithm(configurableProvider, string22, k3, g10);
            addPoly1305Algorithm(configurableProvider, string22, AbstractC1482f.g(str, StubApp.getString2(31617)), AbstractC1482f.g(str, StubApp.getString2(31618)));
        }
    }

    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new org.bouncycastle.crypto.macs.Poly1305(new CAST6Engine()));
        }
    }

    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super(StubApp.getString2(31699), 256, new Poly1305KeyGenerator());
        }
    }

    private CAST6() {
    }
}
