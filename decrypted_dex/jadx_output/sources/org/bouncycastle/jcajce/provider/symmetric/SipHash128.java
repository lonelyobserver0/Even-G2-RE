package org.bouncycastle.jcajce.provider.symmetric;

import com.stub.StubApp;
import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class SipHash128 {

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super(StubApp.getString2(32231), 128, new CipherKeyGenerator());
        }
    }

    public static class Mac24 extends BaseMac {
        public Mac24() {
            super(new org.bouncycastle.crypto.macs.SipHash128());
        }
    }

    public static class Mac48 extends BaseMac {
        public Mac48() {
            super(new org.bouncycastle.crypto.macs.SipHash128(4, 8));
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = SipHash128.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            a.x(sb2, str, StubApp.getString2(32221), configurableProvider, StubApp.getString2(32232));
            configurableProvider.addAlgorithm(StubApp.getString2(32236), a.c(StubApp.getString2(32235), a.c(StubApp.getString2(32233), StubApp.getString2(32234), str, StubApp.getString2(32225), configurableProvider), str, StubApp.getString2(31504), configurableProvider));
            String string2 = StubApp.getString2(32237);
            String string22 = StubApp.getString2(32238);
            configurableProvider.addAlgorithm(string2, string22);
            configurableProvider.addAlgorithm(StubApp.getString2(32239), string22);
        }
    }

    private SipHash128() {
    }
}
