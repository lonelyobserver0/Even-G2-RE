package org.bouncycastle.jcajce.provider.digest;

import com.stub.StubApp;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.SHA384Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.macs.OldHMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SHA384 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new SHA384Digest());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Digest digest = (Digest) super.clone();
            digest.digest = new SHA384Digest((SHA384Digest) this.digest);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new SHA384Digest()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super(StubApp.getString2(28058), KyberEngine.KyberPolyBytes, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = SHA384.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            a.x(sb2, str, StubApp.getString2(31007), configurableProvider, StubApp.getString2(31126));
            String string2 = StubApp.getString2(31127);
            String string22 = StubApp.getString2(23704);
            StringBuilder o5 = a.o(a.C(a.r(configurableProvider, string2, string22, StubApp.getString2(30952)), string22, configurableProvider, str, NISTObjectIdentifiers.id_sha384), StubApp.getString2(31128), configurableProvider, StubApp.getString2(31129), str);
            String string23 = StubApp.getString2(31011);
            StringBuilder o10 = a.o(o5, string23, configurableProvider, StubApp.getString2(31130), str);
            o10.append(string23);
            String sb3 = o10.toString();
            String g10 = AbstractC1482f.g(str, StubApp.getString2(31012));
            String string24 = StubApp.getString2(21750);
            addHMACAlgorithm(configurableProvider, string24, sb3, g10);
            addHMACAlias(configurableProvider, string24, PKCSObjectIdentifiers.id_hmacWithSHA384);
        }
    }

    public static class OldSHA384 extends BaseMac {
        public OldSHA384() {
            super(new OldHMac(new SHA384Digest()));
        }
    }

    private SHA384() {
    }
}
