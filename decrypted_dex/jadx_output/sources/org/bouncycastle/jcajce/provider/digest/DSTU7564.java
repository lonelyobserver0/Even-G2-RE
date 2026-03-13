package org.bouncycastle.jcajce.provider.digest;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.ua.UAObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.DSTU7564Digest;
import org.bouncycastle.crypto.macs.DSTU7564Mac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DSTU7564 {

    public static class Digest256 extends DigestDSTU7564 {
        public Digest256() {
            super(256);
        }
    }

    public static class Digest384 extends DigestDSTU7564 {
        public Digest384() {
            super(KyberEngine.KyberPolyBytes);
        }
    }

    public static class Digest512 extends DigestDSTU7564 {
        public Digest512() {
            super(512);
        }
    }

    public static class DigestDSTU7564 extends BCMessageDigest implements Cloneable {
        public DigestDSTU7564(int i3) {
            super(new DSTU7564Digest(i3));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new DSTU7564Digest((DSTU7564Digest) this.digest);
            return bCMessageDigest;
        }
    }

    public static class HashMac256 extends BaseMac {
        public HashMac256() {
            super(new DSTU7564Mac(256));
        }
    }

    public static class HashMac384 extends BaseMac {
        public HashMac384() {
            super(new DSTU7564Mac(KyberEngine.KyberPolyBytes));
        }
    }

    public static class HashMac512 extends BaseMac {
        public HashMac512() {
            super(new DSTU7564Mac(512));
        }
    }

    public static class KeyGenerator256 extends BaseKeyGenerator {
        public KeyGenerator256() {
            super(StubApp.getString2(30978), 256, new CipherKeyGenerator());
        }
    }

    public static class KeyGenerator384 extends BaseKeyGenerator {
        public KeyGenerator384() {
            super(StubApp.getString2(30979), KyberEngine.KyberPolyBytes, new CipherKeyGenerator());
        }
    }

    public static class KeyGenerator512 extends BaseKeyGenerator {
        public KeyGenerator512() {
            super(StubApp.getString2(30980), 512, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = DSTU7564.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            String string2 = StubApp.getString2(30981);
            StringBuilder n10 = a.n(sb2, str, string2, configurableProvider, StubApp.getString2(30982));
            String string22 = StubApp.getString2(30983);
            StringBuilder n11 = a.n(n10, str, string22, configurableProvider, StubApp.getString2(30984));
            String string23 = StubApp.getString2(30985);
            a.x(n11, str, string23, configurableProvider, StubApp.getString2(30986));
            ASN1ObjectIdentifier aSN1ObjectIdentifier = UAObjectIdentifiers.dstu7564digest_256;
            String string24 = StubApp.getString2(30413);
            a.A(configurableProvider, str, string2, string24, aSN1ObjectIdentifier);
            a.A(configurableProvider, str, string22, string24, UAObjectIdentifiers.dstu7564digest_384);
            configurableProvider.addAlgorithm(string24, UAObjectIdentifiers.dstu7564digest_512, str + string23);
            String k3 = AbstractC1482f.k(new StringBuilder(), str, StubApp.getString2(30987));
            String g10 = AbstractC1482f.g(str, StubApp.getString2(30988));
            String string25 = StubApp.getString2(30989);
            addHMACAlgorithm(configurableProvider, string25, k3, g10);
            String g11 = AbstractC1482f.g(str, StubApp.getString2(30990));
            String g12 = AbstractC1482f.g(str, StubApp.getString2(30991));
            String string26 = StubApp.getString2(30992);
            addHMACAlgorithm(configurableProvider, string26, g11, g12);
            String g13 = AbstractC1482f.g(str, StubApp.getString2(30993));
            String g14 = AbstractC1482f.g(str, StubApp.getString2(30994));
            String string27 = StubApp.getString2(30995);
            addHMACAlgorithm(configurableProvider, string27, g13, g14);
            addHMACAlias(configurableProvider, string25, UAObjectIdentifiers.dstu7564mac_256);
            addHMACAlias(configurableProvider, string26, UAObjectIdentifiers.dstu7564mac_384);
            addHMACAlias(configurableProvider, string27, UAObjectIdentifiers.dstu7564mac_512);
        }
    }

    private DSTU7564() {
    }
}
