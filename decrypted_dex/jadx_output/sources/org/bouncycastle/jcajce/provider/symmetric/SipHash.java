package org.bouncycastle.jcajce.provider.symmetric;

import com.stub.StubApp;
import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class SipHash {

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super(StubApp.getString2(32220), 128, new CipherKeyGenerator());
        }
    }

    public static class Mac24 extends BaseMac {
        public Mac24() {
            super(new org.bouncycastle.crypto.macs.SipHash());
        }
    }

    public static class Mac48 extends BaseMac {
        public Mac48() {
            super(new org.bouncycastle.crypto.macs.SipHash(4, 8));
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = SipHash.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            a.x(sb2, str, StubApp.getString2(32221), configurableProvider, StubApp.getString2(32222));
            configurableProvider.addAlgorithm(StubApp.getString2(32227), a.c(StubApp.getString2(32226), a.c(StubApp.getString2(32223), StubApp.getString2(32224), str, StubApp.getString2(32225), configurableProvider), str, StubApp.getString2(31504), configurableProvider));
            String string2 = StubApp.getString2(32228);
            String string22 = StubApp.getString2(32229);
            configurableProvider.addAlgorithm(string2, string22);
            configurableProvider.addAlgorithm(StubApp.getString2(32230), string22);
        }
    }

    private SipHash() {
    }
}
