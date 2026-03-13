package org.bouncycastle.jcajce.provider.digest;

import Xa.h;
import com.stub.StubApp;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.SkeinDigest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.macs.SkeinMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Skein {

    public static class DigestSkein1024 extends BCMessageDigest implements Cloneable {
        public DigestSkein1024(int i3) {
            super(new SkeinDigest(1024, i3));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new SkeinDigest((SkeinDigest) this.digest);
            return bCMessageDigest;
        }
    }

    public static class DigestSkein256 extends BCMessageDigest implements Cloneable {
        public DigestSkein256(int i3) {
            super(new SkeinDigest(256, i3));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new SkeinDigest((SkeinDigest) this.digest);
            return bCMessageDigest;
        }
    }

    public static class DigestSkein512 extends BCMessageDigest implements Cloneable {
        public DigestSkein512(int i3) {
            super(new SkeinDigest(512, i3));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new SkeinDigest((SkeinDigest) this.digest);
            return bCMessageDigest;
        }
    }

    public static class Digest_1024_1024 extends DigestSkein1024 {
        public Digest_1024_1024() {
            super(1024);
        }
    }

    public static class Digest_1024_384 extends DigestSkein1024 {
        public Digest_1024_384() {
            super(KyberEngine.KyberPolyBytes);
        }
    }

    public static class Digest_1024_512 extends DigestSkein1024 {
        public Digest_1024_512() {
            super(512);
        }
    }

    public static class Digest_256_128 extends DigestSkein256 {
        public Digest_256_128() {
            super(128);
        }
    }

    public static class Digest_256_160 extends DigestSkein256 {
        public Digest_256_160() {
            super(160);
        }
    }

    public static class Digest_256_224 extends DigestSkein256 {
        public Digest_256_224() {
            super(BERTags.FLAGS);
        }
    }

    public static class Digest_256_256 extends DigestSkein256 {
        public Digest_256_256() {
            super(256);
        }
    }

    public static class Digest_512_128 extends DigestSkein512 {
        public Digest_512_128() {
            super(128);
        }
    }

    public static class Digest_512_160 extends DigestSkein512 {
        public Digest_512_160() {
            super(160);
        }
    }

    public static class Digest_512_224 extends DigestSkein512 {
        public Digest_512_224() {
            super(BERTags.FLAGS);
        }
    }

    public static class Digest_512_256 extends DigestSkein512 {
        public Digest_512_256() {
            super(256);
        }
    }

    public static class Digest_512_384 extends DigestSkein512 {
        public Digest_512_384() {
            super(KyberEngine.KyberPolyBytes);
        }
    }

    public static class Digest_512_512 extends DigestSkein512 {
        public Digest_512_512() {
            super(512);
        }
    }

    public static class HMacKeyGenerator_1024_1024 extends BaseKeyGenerator {
        public HMacKeyGenerator_1024_1024() {
            super(StubApp.getString2(31160), 1024, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_1024_384 extends BaseKeyGenerator {
        public HMacKeyGenerator_1024_384() {
            super(StubApp.getString2(31161), KyberEngine.KyberPolyBytes, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_1024_512 extends BaseKeyGenerator {
        public HMacKeyGenerator_1024_512() {
            super(StubApp.getString2(31162), 512, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_256_128 extends BaseKeyGenerator {
        public HMacKeyGenerator_256_128() {
            super(StubApp.getString2(31163), 128, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_256_160 extends BaseKeyGenerator {
        public HMacKeyGenerator_256_160() {
            super(StubApp.getString2(31164), 160, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_256_224 extends BaseKeyGenerator {
        public HMacKeyGenerator_256_224() {
            super(StubApp.getString2(31165), BERTags.FLAGS, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_256_256 extends BaseKeyGenerator {
        public HMacKeyGenerator_256_256() {
            super(StubApp.getString2(31166), 256, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_512_128 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_128() {
            super(StubApp.getString2(31167), 128, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_512_160 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_160() {
            super(StubApp.getString2(31168), 160, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_512_224 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_224() {
            super(StubApp.getString2(31169), BERTags.FLAGS, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_512_256 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_256() {
            super(StubApp.getString2(31170), 256, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_512_384 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_384() {
            super(StubApp.getString2(31171), KyberEngine.KyberPolyBytes, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_512_512 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_512() {
            super(StubApp.getString2(31172), 512, new CipherKeyGenerator());
        }
    }

    public static class HashMac_1024_1024 extends BaseMac {
        public HashMac_1024_1024() {
            super(new HMac(new SkeinDigest(1024, 1024)));
        }
    }

    public static class HashMac_1024_384 extends BaseMac {
        public HashMac_1024_384() {
            super(new HMac(new SkeinDigest(1024, KyberEngine.KyberPolyBytes)));
        }
    }

    public static class HashMac_1024_512 extends BaseMac {
        public HashMac_1024_512() {
            super(new HMac(new SkeinDigest(1024, 512)));
        }
    }

    public static class HashMac_256_128 extends BaseMac {
        public HashMac_256_128() {
            super(new HMac(new SkeinDigest(256, 128)));
        }
    }

    public static class HashMac_256_160 extends BaseMac {
        public HashMac_256_160() {
            super(new HMac(new SkeinDigest(256, 160)));
        }
    }

    public static class HashMac_256_224 extends BaseMac {
        public HashMac_256_224() {
            super(new HMac(new SkeinDigest(256, BERTags.FLAGS)));
        }
    }

    public static class HashMac_256_256 extends BaseMac {
        public HashMac_256_256() {
            super(new HMac(new SkeinDigest(256, 256)));
        }
    }

    public static class HashMac_512_128 extends BaseMac {
        public HashMac_512_128() {
            super(new HMac(new SkeinDigest(512, 128)));
        }
    }

    public static class HashMac_512_160 extends BaseMac {
        public HashMac_512_160() {
            super(new HMac(new SkeinDigest(512, 160)));
        }
    }

    public static class HashMac_512_224 extends BaseMac {
        public HashMac_512_224() {
            super(new HMac(new SkeinDigest(512, BERTags.FLAGS)));
        }
    }

    public static class HashMac_512_256 extends BaseMac {
        public HashMac_512_256() {
            super(new HMac(new SkeinDigest(512, 256)));
        }
    }

    public static class HashMac_512_384 extends BaseMac {
        public HashMac_512_384() {
            super(new HMac(new SkeinDigest(512, KyberEngine.KyberPolyBytes)));
        }
    }

    public static class HashMac_512_512 extends BaseMac {
        public HashMac_512_512() {
            super(new HMac(new SkeinDigest(512, 512)));
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = Skein.class.getName();

        private void addSkeinMacAlgorithm(ConfigurableProvider configurableProvider, int i3, int i10) {
            String o5 = h.o(StubApp.getString2(29055), i3, i10, StubApp.getString2(999));
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            sb2.append(str);
            sb2.append(StubApp.getString2(31173));
            sb2.append(i3);
            String string2 = StubApp.getString2(4956);
            sb2.append(string2);
            sb2.append(i10);
            String sb3 = sb2.toString();
            String str2 = str + StubApp.getString2(31174) + i3 + string2 + i10;
            configurableProvider.addAlgorithm(StubApp.getString2(30997) + o5, sb3);
            StringBuilder sb4 = new StringBuilder(StubApp.getString2(31175));
            sb4.append(i3);
            String string22 = StubApp.getString2(601);
            sb4.append(string22);
            sb4.append(i10);
            configurableProvider.addAlgorithm(sb4.toString(), o5);
            configurableProvider.addAlgorithm(StubApp.getString2(31000) + o5, str2);
            configurableProvider.addAlgorithm(StubApp.getString2(31176) + i3 + string22 + i10, o5);
        }

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            addHMACAlgorithm(configurableProvider, StubApp.getString2(31205), AbstractC1482f.k(a.n(a.n(a.n(a.n(a.n(a.n(a.n(a.n(a.n(a.n(a.n(a.n(a.n(sb2, str, StubApp.getString2(31177), configurableProvider, StubApp.getString2(31178)), str, StubApp.getString2(31179), configurableProvider, StubApp.getString2(31180)), str, StubApp.getString2(31181), configurableProvider, StubApp.getString2(31182)), str, StubApp.getString2(31183), configurableProvider, StubApp.getString2(31184)), str, StubApp.getString2(31185), configurableProvider, StubApp.getString2(31186)), str, StubApp.getString2(31187), configurableProvider, StubApp.getString2(31188)), str, StubApp.getString2(31189), configurableProvider, StubApp.getString2(31190)), str, StubApp.getString2(31191), configurableProvider, StubApp.getString2(31192)), str, StubApp.getString2(31193), configurableProvider, StubApp.getString2(31194)), str, StubApp.getString2(31195), configurableProvider, StubApp.getString2(31196)), str, StubApp.getString2(31197), configurableProvider, StubApp.getString2(31198)), str, StubApp.getString2(31199), configurableProvider, StubApp.getString2(31200)), str, StubApp.getString2(31201), configurableProvider, StubApp.getString2(31202)), str, StubApp.getString2(31203)), AbstractC1482f.g(str, StubApp.getString2(31204)));
            addHMACAlgorithm(configurableProvider, StubApp.getString2(31208), AbstractC1482f.g(str, StubApp.getString2(31206)), AbstractC1482f.g(str, StubApp.getString2(31207)));
            addHMACAlgorithm(configurableProvider, StubApp.getString2(31211), AbstractC1482f.g(str, StubApp.getString2(31209)), AbstractC1482f.g(str, StubApp.getString2(31210)));
            addHMACAlgorithm(configurableProvider, StubApp.getString2(31214), AbstractC1482f.g(str, StubApp.getString2(31212)), AbstractC1482f.g(str, StubApp.getString2(31213)));
            addHMACAlgorithm(configurableProvider, StubApp.getString2(31217), AbstractC1482f.g(str, StubApp.getString2(31215)), AbstractC1482f.g(str, StubApp.getString2(31216)));
            addHMACAlgorithm(configurableProvider, StubApp.getString2(31220), AbstractC1482f.g(str, StubApp.getString2(31218)), AbstractC1482f.g(str, StubApp.getString2(31219)));
            addHMACAlgorithm(configurableProvider, StubApp.getString2(31223), AbstractC1482f.g(str, StubApp.getString2(31221)), AbstractC1482f.g(str, StubApp.getString2(31222)));
            addHMACAlgorithm(configurableProvider, StubApp.getString2(31226), AbstractC1482f.g(str, StubApp.getString2(31224)), AbstractC1482f.g(str, StubApp.getString2(31225)));
            addHMACAlgorithm(configurableProvider, StubApp.getString2(31229), AbstractC1482f.g(str, StubApp.getString2(31227)), AbstractC1482f.g(str, StubApp.getString2(31228)));
            addHMACAlgorithm(configurableProvider, StubApp.getString2(31232), AbstractC1482f.g(str, StubApp.getString2(31230)), AbstractC1482f.g(str, StubApp.getString2(31231)));
            addHMACAlgorithm(configurableProvider, StubApp.getString2(31235), AbstractC1482f.g(str, StubApp.getString2(31233)), AbstractC1482f.g(str, StubApp.getString2(31234)));
            addHMACAlgorithm(configurableProvider, StubApp.getString2(31238), AbstractC1482f.g(str, StubApp.getString2(31236)), AbstractC1482f.g(str, StubApp.getString2(31237)));
            addHMACAlgorithm(configurableProvider, StubApp.getString2(31241), AbstractC1482f.g(str, StubApp.getString2(31239)), AbstractC1482f.g(str, StubApp.getString2(31240)));
            addSkeinMacAlgorithm(configurableProvider, 256, 128);
            addSkeinMacAlgorithm(configurableProvider, 256, 160);
            addSkeinMacAlgorithm(configurableProvider, 256, BERTags.FLAGS);
            addSkeinMacAlgorithm(configurableProvider, 256, 256);
            addSkeinMacAlgorithm(configurableProvider, 512, 128);
            addSkeinMacAlgorithm(configurableProvider, 512, 160);
            addSkeinMacAlgorithm(configurableProvider, 512, BERTags.FLAGS);
            addSkeinMacAlgorithm(configurableProvider, 512, 256);
            addSkeinMacAlgorithm(configurableProvider, 512, KyberEngine.KyberPolyBytes);
            addSkeinMacAlgorithm(configurableProvider, 512, 512);
            addSkeinMacAlgorithm(configurableProvider, 1024, KyberEngine.KyberPolyBytes);
            addSkeinMacAlgorithm(configurableProvider, 1024, 512);
            addSkeinMacAlgorithm(configurableProvider, 1024, 1024);
        }
    }

    public static class SkeinMacKeyGenerator_1024_1024 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_1024_1024() {
            super(StubApp.getString2(31242), 1024, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_1024_384 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_1024_384() {
            super(StubApp.getString2(31243), KyberEngine.KyberPolyBytes, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_1024_512 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_1024_512() {
            super(StubApp.getString2(31244), 512, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_256_128 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_256_128() {
            super(StubApp.getString2(31245), 128, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_256_160 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_256_160() {
            super(StubApp.getString2(31246), 160, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_256_224 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_256_224() {
            super(StubApp.getString2(31247), BERTags.FLAGS, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_256_256 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_256_256() {
            super(StubApp.getString2(31248), 256, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_512_128 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_128() {
            super(StubApp.getString2(31249), 128, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_512_160 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_160() {
            super(StubApp.getString2(31250), 160, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_512_224 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_224() {
            super(StubApp.getString2(31251), BERTags.FLAGS, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_512_256 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_256() {
            super(StubApp.getString2(31252), 256, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_512_384 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_384() {
            super(StubApp.getString2(31253), KyberEngine.KyberPolyBytes, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_512_512 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_512() {
            super(StubApp.getString2(31254), 512, new CipherKeyGenerator());
        }
    }

    public static class SkeinMac_1024_1024 extends BaseMac {
        public SkeinMac_1024_1024() {
            super(new SkeinMac(1024, 1024));
        }
    }

    public static class SkeinMac_1024_384 extends BaseMac {
        public SkeinMac_1024_384() {
            super(new SkeinMac(1024, KyberEngine.KyberPolyBytes));
        }
    }

    public static class SkeinMac_1024_512 extends BaseMac {
        public SkeinMac_1024_512() {
            super(new SkeinMac(1024, 512));
        }
    }

    public static class SkeinMac_256_128 extends BaseMac {
        public SkeinMac_256_128() {
            super(new SkeinMac(256, 128));
        }
    }

    public static class SkeinMac_256_160 extends BaseMac {
        public SkeinMac_256_160() {
            super(new SkeinMac(256, 160));
        }
    }

    public static class SkeinMac_256_224 extends BaseMac {
        public SkeinMac_256_224() {
            super(new SkeinMac(256, BERTags.FLAGS));
        }
    }

    public static class SkeinMac_256_256 extends BaseMac {
        public SkeinMac_256_256() {
            super(new SkeinMac(256, 256));
        }
    }

    public static class SkeinMac_512_128 extends BaseMac {
        public SkeinMac_512_128() {
            super(new SkeinMac(512, 128));
        }
    }

    public static class SkeinMac_512_160 extends BaseMac {
        public SkeinMac_512_160() {
            super(new SkeinMac(512, 160));
        }
    }

    public static class SkeinMac_512_224 extends BaseMac {
        public SkeinMac_512_224() {
            super(new SkeinMac(512, BERTags.FLAGS));
        }
    }

    public static class SkeinMac_512_256 extends BaseMac {
        public SkeinMac_512_256() {
            super(new SkeinMac(512, 256));
        }
    }

    public static class SkeinMac_512_384 extends BaseMac {
        public SkeinMac_512_384() {
            super(new SkeinMac(512, KyberEngine.KyberPolyBytes));
        }
    }

    public static class SkeinMac_512_512 extends BaseMac {
        public SkeinMac_512_512() {
            super(new SkeinMac(512, 512));
        }
    }

    private Skein() {
    }
}
