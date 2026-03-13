package org.bouncycastle.jcajce.provider.symmetric;

import com.stub.StubApp;
import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.SkipjackEngine;
import org.bouncycastle.crypto.macs.CBCBlockCipherMac;
import org.bouncycastle.crypto.macs.CFBBlockCipherMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class Skipjack {

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return StubApp.getString2(32240);
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new SkipjackEngine());
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super(StubApp.getString2(32241), 80, new CipherKeyGenerator());
        }
    }

    public static class Mac extends BaseMac {
        public Mac() {
            super(new CBCBlockCipherMac(new SkipjackEngine()));
        }
    }

    public static class MacCFB8 extends BaseMac {
        public MacCFB8() {
            super(new CFBBlockCipherMac(new SkipjackEngine()));
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = Skipjack.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            a.x(a.n(a.n(a.n(sb2, str, StubApp.getString2(31476), configurableProvider, StubApp.getString2(32242)), str, StubApp.getString2(31504), configurableProvider, StubApp.getString2(32243)), str, StubApp.getString2(31459), configurableProvider, StubApp.getString2(32244)), str, StubApp.getString2(31950), configurableProvider, StubApp.getString2(32245));
            configurableProvider.addAlgorithm(StubApp.getString2(32249), a.c(StubApp.getString2(32246), StubApp.getString2(32247), str, StubApp.getString2(32248), configurableProvider));
            configurableProvider.addAlgorithm(StubApp.getString2(32250), StubApp.getString2(32251));
        }
    }

    private Skipjack() {
    }
}
