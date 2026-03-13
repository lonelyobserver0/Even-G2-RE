package org.bouncycastle.jcajce.provider.symmetric;

import com.stub.StubApp;
import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.VMPCKSA3Engine;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class VMPCKSA3 {

    public static class Base extends BaseStreamCipher {
        public Base() {
            super(new VMPCKSA3Engine(), 16);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super(StubApp.getString2(28795), 128, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = VMPCKSA3.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            a.x(a.n(sb2, str, StubApp.getString2(31630), configurableProvider, StubApp.getString2(32325)), str, StubApp.getString2(31504), configurableProvider, StubApp.getString2(32326));
        }
    }

    private VMPCKSA3() {
    }
}
