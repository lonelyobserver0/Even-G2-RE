package org.bouncycastle.jcajce.provider.symmetric;

import com.stub.StubApp;
import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.Zuc128Engine;
import org.bouncycastle.crypto.engines.Zuc256Engine;
import org.bouncycastle.crypto.macs.Zuc128Mac;
import org.bouncycastle.crypto.macs.Zuc256Mac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Zuc {

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return StubApp.getString2(32335);
        }
    }

    public static class KeyGen128 extends BaseKeyGenerator {
        public KeyGen128() {
            super(StubApp.getString2(32336), 128, new CipherKeyGenerator());
        }
    }

    public static class KeyGen256 extends BaseKeyGenerator {
        public KeyGen256() {
            super(StubApp.getString2(32337), 256, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = Zuc.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            StringBuilder n10 = a.n(a.n(sb2, str, StubApp.getString2(32338), configurableProvider, StubApp.getString2(32339)), str, StubApp.getString2(31506), configurableProvider, StubApp.getString2(32340));
            String string2 = StubApp.getString2(31459);
            a.x(a.n(a.n(a.n(a.n(a.n(n10, str, string2, configurableProvider, StubApp.getString2(32341)), str, StubApp.getString2(32342), configurableProvider, StubApp.getString2(32343)), str, StubApp.getString2(31510), configurableProvider, StubApp.getString2(32344)), str, string2, configurableProvider, StubApp.getString2(32345)), str, StubApp.getString2(32346), configurableProvider, StubApp.getString2(32347)), str, StubApp.getString2(32348), configurableProvider, StubApp.getString2(32349));
            configurableProvider.addAlgorithm(StubApp.getString2(32355), a.c(StubApp.getString2(32353), a.c(StubApp.getString2(32350), StubApp.getString2(32351), str, StubApp.getString2(32352), configurableProvider), str, StubApp.getString2(32354), configurableProvider));
        }
    }

    public static class Zuc128 extends BaseStreamCipher {
        public Zuc128() {
            super(new Zuc128Engine(), 16, 128);
        }
    }

    public static class Zuc256 extends BaseStreamCipher {
        public Zuc256() {
            super(new Zuc256Engine(), 25, 256);
        }
    }

    public static class ZucMac128 extends BaseMac {
        public ZucMac128() {
            super(new Zuc128Mac());
        }
    }

    public static class ZucMac256 extends BaseMac {
        public ZucMac256() {
            super(new Zuc256Mac(128));
        }
    }

    public static class ZucMac256_32 extends BaseMac {
        public ZucMac256_32() {
            super(new Zuc256Mac(32));
        }
    }

    public static class ZucMac256_64 extends BaseMac {
        public ZucMac256_64() {
            super(new Zuc256Mac(64));
        }
    }

    private Zuc() {
    }
}
