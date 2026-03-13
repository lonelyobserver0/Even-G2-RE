package org.bouncycastle.jcajce.provider.symmetric;

import com.stub.StubApp;
import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.HC256Engine;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class HC256 {

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return StubApp.getString2(31981);
        }
    }

    public static class Base extends BaseStreamCipher {
        public Base() {
            super(new HC256Engine(), 32);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super(StubApp.getString2(31982), 256, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = HC256.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            a.x(a.n(a.n(sb2, str, StubApp.getString2(31630), configurableProvider, StubApp.getString2(31983)), str, StubApp.getString2(31504), configurableProvider, StubApp.getString2(31984)), str, StubApp.getString2(31459), configurableProvider, StubApp.getString2(31985));
        }
    }

    private HC256() {
    }
}
