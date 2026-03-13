package org.bouncycastle.jcajce.provider.digest;

import com.stub.StubApp;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHA512tDigest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.macs.OldHMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SHA512 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new SHA512Digest());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Digest digest = (Digest) super.clone();
            digest.digest = new SHA512Digest((SHA512Digest) this.digest);
            return digest;
        }
    }

    public static class DigestT extends BCMessageDigest implements Cloneable {
        public DigestT(int i3) {
            super(new SHA512tDigest(i3));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            DigestT digestT = (DigestT) super.clone();
            digestT.digest = new SHA512tDigest((SHA512tDigest) this.digest);
            return digestT;
        }
    }

    public static class DigestT224 extends DigestT {
        public DigestT224() {
            super(BERTags.FLAGS);
        }
    }

    public static class DigestT256 extends DigestT {
        public DigestT256() {
            super(256);
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new SHA512Digest()));
        }
    }

    public static class HashMacT224 extends BaseMac {
        public HashMacT224() {
            super(new HMac(new SHA512tDigest(BERTags.FLAGS)));
        }
    }

    public static class HashMacT256 extends BaseMac {
        public HashMacT256() {
            super(new HMac(new SHA512tDigest(256)));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super(StubApp.getString2(28059), 512, new CipherKeyGenerator());
        }
    }

    public static class KeyGeneratorT224 extends BaseKeyGenerator {
        public KeyGeneratorT224() {
            super(StubApp.getString2(31131), BERTags.FLAGS, new CipherKeyGenerator());
        }
    }

    public static class KeyGeneratorT256 extends BaseKeyGenerator {
        public KeyGeneratorT256() {
            super(StubApp.getString2(31132), 256, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = SHA512.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            a.x(sb2, str, StubApp.getString2(31007), configurableProvider, StubApp.getString2(31133));
            String string2 = StubApp.getString2(31134);
            String string22 = StubApp.getString2(23705);
            String string23 = StubApp.getString2(30952);
            a.y(a.C(a.r(configurableProvider, string2, string22, string23), string22, configurableProvider, str, NISTObjectIdentifiers.id_sha512), StubApp.getString2(31135), configurableProvider, StubApp.getString2(31136));
            String string24 = StubApp.getString2(31137);
            String string25 = StubApp.getString2(29286);
            configurableProvider.addAlgorithm(string24, string25);
            configurableProvider.addAlgorithm(StubApp.getString2(31138), string25);
            configurableProvider.addAlgorithm(StubApp.getString2(31139), string25);
            configurableProvider.addAlgorithm(StubApp.getString2(31140), string25);
            a.y(a.C(new StringBuilder(string23), string25, configurableProvider, str, NISTObjectIdentifiers.id_sha512_224), StubApp.getString2(31141), configurableProvider, StubApp.getString2(31142));
            String string26 = StubApp.getString2(31143);
            String string27 = StubApp.getString2(29285);
            configurableProvider.addAlgorithm(string26, string27);
            configurableProvider.addAlgorithm(StubApp.getString2(31144), string27);
            configurableProvider.addAlgorithm(StubApp.getString2(31145), string27);
            configurableProvider.addAlgorithm(StubApp.getString2(31146), string27);
            StringBuilder o5 = a.o(a.C(new StringBuilder(string23), string27, configurableProvider, str, NISTObjectIdentifiers.id_sha512_256), StubApp.getString2(31147), configurableProvider, StubApp.getString2(31148), str);
            String string28 = StubApp.getString2(31011);
            StringBuilder o10 = a.o(o5, string28, configurableProvider, StubApp.getString2(31149), str);
            o10.append(string28);
            String sb3 = o10.toString();
            String g10 = AbstractC1482f.g(str, StubApp.getString2(31012));
            String string29 = StubApp.getString2(21751);
            addHMACAlgorithm(configurableProvider, string29, sb3, g10);
            addHMACAlias(configurableProvider, string29, PKCSObjectIdentifiers.id_hmacWithSHA512);
            addHMACAlgorithm(configurableProvider, StubApp.getString2(31152), AbstractC1482f.g(str, StubApp.getString2(31150)), AbstractC1482f.g(str, StubApp.getString2(31151)));
            addHMACAlgorithm(configurableProvider, StubApp.getString2(31155), AbstractC1482f.g(str, StubApp.getString2(31153)), AbstractC1482f.g(str, StubApp.getString2(31154)));
        }
    }

    public static class OldSHA512 extends BaseMac {
        public OldSHA512() {
            super(new OldHMac(new SHA512Digest()));
        }
    }

    private SHA512() {
    }
}
