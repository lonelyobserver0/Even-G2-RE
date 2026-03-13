package org.bouncycastle.jcajce.provider.digest;

import com.stub.StubApp;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.SHA224Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SHA224 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new SHA224Digest());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Digest digest = (Digest) super.clone();
            digest.digest = new SHA224Digest((SHA224Digest) this.digest);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new SHA224Digest()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super(StubApp.getString2(28056), BERTags.FLAGS, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = SHA224.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            a.x(sb2, str, StubApp.getString2(31007), configurableProvider, StubApp.getString2(31083));
            String string2 = StubApp.getString2(31084);
            String string22 = StubApp.getString2(28501);
            StringBuilder C10 = a.C(a.r(configurableProvider, string2, string22, StubApp.getString2(30952)), string22, configurableProvider, str, NISTObjectIdentifiers.id_sha224);
            String string23 = StubApp.getString2(31011);
            StringBuilder o5 = a.o(C10, string23, configurableProvider, StubApp.getString2(31085), str);
            o5.append(string23);
            String sb3 = o5.toString();
            String g10 = AbstractC1482f.g(str, StubApp.getString2(31012));
            String string24 = StubApp.getString2(28054);
            addHMACAlgorithm(configurableProvider, string24, sb3, g10);
            addHMACAlias(configurableProvider, string24, PKCSObjectIdentifiers.id_hmacWithSHA224);
        }
    }

    private SHA224() {
    }
}
