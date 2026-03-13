package org.bouncycastle.jcajce.provider.digest;

import com.stub.StubApp;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.KeccakDigest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Keccak {

    public static class Digest224 extends DigestKeccak {
        public Digest224() {
            super(BERTags.FLAGS);
        }
    }

    public static class Digest256 extends DigestKeccak {
        public Digest256() {
            super(256);
        }
    }

    public static class Digest288 extends DigestKeccak {
        public Digest288() {
            super(288);
        }
    }

    public static class Digest384 extends DigestKeccak {
        public Digest384() {
            super(KyberEngine.KyberPolyBytes);
        }
    }

    public static class Digest512 extends DigestKeccak {
        public Digest512() {
            super(512);
        }
    }

    public static class DigestKeccak extends BCMessageDigest implements Cloneable {
        public DigestKeccak(int i3) {
            super(new KeccakDigest(i3));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new KeccakDigest((KeccakDigest) this.digest);
            return bCMessageDigest;
        }
    }

    public static class HashMac224 extends BaseMac {
        public HashMac224() {
            super(new HMac(new KeccakDigest(BERTags.FLAGS)));
        }
    }

    public static class HashMac256 extends BaseMac {
        public HashMac256() {
            super(new HMac(new KeccakDigest(256)));
        }
    }

    public static class HashMac288 extends BaseMac {
        public HashMac288() {
            super(new HMac(new KeccakDigest(288)));
        }
    }

    public static class HashMac384 extends BaseMac {
        public HashMac384() {
            super(new HMac(new KeccakDigest(KyberEngine.KyberPolyBytes)));
        }
    }

    public static class HashMac512 extends BaseMac {
        public HashMac512() {
            super(new HMac(new KeccakDigest(512)));
        }
    }

    public static class KeyGenerator224 extends BaseKeyGenerator {
        public KeyGenerator224() {
            super(StubApp.getString2(31032), BERTags.FLAGS, new CipherKeyGenerator());
        }
    }

    public static class KeyGenerator256 extends BaseKeyGenerator {
        public KeyGenerator256() {
            super(StubApp.getString2(31033), 256, new CipherKeyGenerator());
        }
    }

    public static class KeyGenerator288 extends BaseKeyGenerator {
        public KeyGenerator288() {
            super(StubApp.getString2(31034), 288, new CipherKeyGenerator());
        }
    }

    public static class KeyGenerator384 extends BaseKeyGenerator {
        public KeyGenerator384() {
            super(StubApp.getString2(31035), KyberEngine.KyberPolyBytes, new CipherKeyGenerator());
        }
    }

    public static class KeyGenerator512 extends BaseKeyGenerator {
        public KeyGenerator512() {
            super(StubApp.getString2(31036), 512, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = Keccak.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            addHMACAlgorithm(configurableProvider, StubApp.getString2(31046), AbstractC1482f.k(a.n(a.n(a.n(a.n(a.n(sb2, str, StubApp.getString2(31037), configurableProvider, StubApp.getString2(31038)), str, StubApp.getString2(31039), configurableProvider, StubApp.getString2(31040)), str, StubApp.getString2(30981), configurableProvider, StubApp.getString2(31041)), str, StubApp.getString2(30983), configurableProvider, StubApp.getString2(31042)), str, StubApp.getString2(30985), configurableProvider, StubApp.getString2(31043)), str, StubApp.getString2(31044)), AbstractC1482f.g(str, StubApp.getString2(31045)));
            addHMACAlgorithm(configurableProvider, StubApp.getString2(31047), AbstractC1482f.g(str, StubApp.getString2(30987)), AbstractC1482f.g(str, StubApp.getString2(30988)));
            addHMACAlgorithm(configurableProvider, StubApp.getString2(31050), AbstractC1482f.g(str, StubApp.getString2(31048)), AbstractC1482f.g(str, StubApp.getString2(31049)));
            addHMACAlgorithm(configurableProvider, StubApp.getString2(31051), AbstractC1482f.g(str, StubApp.getString2(30990)), AbstractC1482f.g(str, StubApp.getString2(30991)));
            addHMACAlgorithm(configurableProvider, StubApp.getString2(31052), AbstractC1482f.g(str, StubApp.getString2(30993)), AbstractC1482f.g(str, StubApp.getString2(30994)));
        }
    }

    private Keccak() {
    }
}
