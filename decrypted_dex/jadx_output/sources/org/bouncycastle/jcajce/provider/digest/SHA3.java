package org.bouncycastle.jcajce.provider.digest;

import com.stub.StubApp;
import i2.u;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.ParallelHash;
import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.digests.TupleHash;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.macs.KMAC;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SHA3 {

    public static class Digest224 extends DigestSHA3 {
        public Digest224() {
            super(BERTags.FLAGS);
        }
    }

    public static class Digest256 extends DigestSHA3 {
        public Digest256() {
            super(256);
        }
    }

    public static class Digest384 extends DigestSHA3 {
        public Digest384() {
            super(KyberEngine.KyberPolyBytes);
        }
    }

    public static class Digest512 extends DigestSHA3 {
        public Digest512() {
            super(512);
        }
    }

    public static class DigestParallelHash extends BCMessageDigest implements Cloneable {
        public DigestParallelHash(int i3, int i10) {
            super(new ParallelHash(i3, null, 128, i10));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new ParallelHash((ParallelHash) this.digest);
            return bCMessageDigest;
        }
    }

    public static class DigestParallelHash128_256 extends DigestParallelHash {
        public DigestParallelHash128_256() {
            super(128, 256);
        }
    }

    public static class DigestParallelHash256_512 extends DigestParallelHash {
        public DigestParallelHash256_512() {
            super(256, 512);
        }
    }

    public static class DigestSHA3 extends BCMessageDigest implements Cloneable {
        public DigestSHA3(int i3) {
            super(new SHA3Digest(i3));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new SHA3Digest((SHA3Digest) this.digest);
            return bCMessageDigest;
        }
    }

    public static class DigestSHAKE extends BCMessageDigest implements Cloneable {
        public DigestSHAKE(int i3, int i10) {
            super(new SHAKEDigest(i3));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new SHAKEDigest((SHAKEDigest) this.digest);
            return bCMessageDigest;
        }
    }

    public static class DigestShake128_256 extends DigestSHAKE {
        public DigestShake128_256() {
            super(128, 256);
        }
    }

    public static class DigestShake256_512 extends DigestSHAKE {
        public DigestShake256_512() {
            super(256, 512);
        }
    }

    public static class DigestTupleHash extends BCMessageDigest implements Cloneable {
        public DigestTupleHash(int i3, int i10) {
            super(new TupleHash(i3, null, i10));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new TupleHash((TupleHash) this.digest);
            return bCMessageDigest;
        }
    }

    public static class DigestTupleHash128_256 extends DigestTupleHash {
        public DigestTupleHash128_256() {
            super(128, 256);
        }
    }

    public static class DigestTupleHash256_512 extends DigestTupleHash {
        public DigestTupleHash256_512() {
            super(256, 512);
        }
    }

    public static class HashMac224 extends HashMacSHA3 {
        public HashMac224() {
            super(BERTags.FLAGS);
        }
    }

    public static class HashMac256 extends HashMacSHA3 {
        public HashMac256() {
            super(256);
        }
    }

    public static class HashMac384 extends HashMacSHA3 {
        public HashMac384() {
            super(KyberEngine.KyberPolyBytes);
        }
    }

    public static class HashMac512 extends HashMacSHA3 {
        public HashMac512() {
            super(512);
        }
    }

    public static class HashMacSHA3 extends BaseMac {
        public HashMacSHA3(int i3) {
            super(new HMac(new SHA3Digest(i3)));
        }
    }

    public static class KMac128 extends BaseMac {
        public KMac128() {
            super(new KMAC(128, new byte[0]));
        }
    }

    public static class KMac256 extends BaseMac {
        public KMac256() {
            super(new KMAC(256, new byte[0]));
        }
    }

    public static class KeyGenerator224 extends KeyGeneratorSHA3 {
        public KeyGenerator224() {
            super(BERTags.FLAGS);
        }
    }

    public static class KeyGenerator256 extends KeyGeneratorSHA3 {
        public KeyGenerator256() {
            super(256);
        }
    }

    public static class KeyGenerator384 extends KeyGeneratorSHA3 {
        public KeyGenerator384() {
            super(KyberEngine.KyberPolyBytes);
        }
    }

    public static class KeyGenerator512 extends KeyGeneratorSHA3 {
        public KeyGenerator512() {
            super(512);
        }
    }

    public static class KeyGeneratorSHA3 extends BaseKeyGenerator {
        public KeyGeneratorSHA3(int i3) {
            super(u.p(i3, StubApp.getString2(31093)), i3, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = SHA3.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            String string2 = StubApp.getString2(31037);
            StringBuilder n10 = a.n(sb2, str, string2, configurableProvider, StubApp.getString2(31094));
            String string22 = StubApp.getString2(30981);
            StringBuilder n11 = a.n(n10, str, string22, configurableProvider, StubApp.getString2(31095));
            String string23 = StubApp.getString2(30983);
            StringBuilder n12 = a.n(n11, str, string23, configurableProvider, StubApp.getString2(31096));
            String string24 = StubApp.getString2(30985);
            a.x(n12, str, string24, configurableProvider, StubApp.getString2(31097));
            ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.id_sha3_224;
            String string25 = StubApp.getString2(30413);
            a.A(configurableProvider, str, string2, string25, aSN1ObjectIdentifier);
            a.A(configurableProvider, str, string22, string25, NISTObjectIdentifiers.id_sha3_256);
            a.A(configurableProvider, str, string23, string25, NISTObjectIdentifiers.id_sha3_384);
            configurableProvider.addAlgorithm(string25, NISTObjectIdentifiers.id_sha3_512, str + string24);
            StringBuilder sb3 = new StringBuilder();
            String string26 = StubApp.getString2(31098);
            StringBuilder n13 = a.n(sb3, str, string26, configurableProvider, StubApp.getString2(31099));
            String string27 = StubApp.getString2(31100);
            a.x(n13, str, string27, configurableProvider, StubApp.getString2(31101));
            a.A(configurableProvider, str, string26, string25, NISTObjectIdentifiers.id_shake256);
            a.A(configurableProvider, str, string27, string25, NISTObjectIdentifiers.id_shake128);
            configurableProvider.addAlgorithm(StubApp.getString2(31102), StubApp.getString2(31103));
            configurableProvider.addAlgorithm(StubApp.getString2(31104), StubApp.getString2(31105));
            String k3 = AbstractC1482f.k(new StringBuilder(), str, StubApp.getString2(31044));
            String g10 = AbstractC1482f.g(str, StubApp.getString2(31045));
            String string28 = StubApp.getString2(28174);
            addHMACAlgorithm(configurableProvider, string28, k3, g10);
            addHMACAlias(configurableProvider, string28, NISTObjectIdentifiers.id_hmacWithSHA3_224);
            String g11 = AbstractC1482f.g(str, StubApp.getString2(30987));
            String string29 = StubApp.getString2(30988);
            String g12 = AbstractC1482f.g(str, string29);
            String string210 = StubApp.getString2(28175);
            addHMACAlgorithm(configurableProvider, string210, g11, g12);
            addHMACAlias(configurableProvider, string210, NISTObjectIdentifiers.id_hmacWithSHA3_256);
            String g13 = AbstractC1482f.g(str, StubApp.getString2(30990));
            String g14 = AbstractC1482f.g(str, StubApp.getString2(30991));
            String string211 = StubApp.getString2(28176);
            addHMACAlgorithm(configurableProvider, string211, g13, g14);
            addHMACAlias(configurableProvider, string211, NISTObjectIdentifiers.id_hmacWithSHA3_384);
            String g15 = AbstractC1482f.g(str, StubApp.getString2(30993));
            String string212 = StubApp.getString2(30994);
            String g16 = AbstractC1482f.g(str, string212);
            String string213 = StubApp.getString2(28177);
            addHMACAlgorithm(configurableProvider, string213, g15, g16);
            addHMACAlias(configurableProvider, string213, NISTObjectIdentifiers.id_hmacWithSHA3_512);
            addKMACAlgorithm(configurableProvider, StubApp.getString2(31107), AbstractC1482f.g(str, StubApp.getString2(31106)), AbstractC1482f.g(str, string29));
            addKMACAlgorithm(configurableProvider, StubApp.getString2(31109), AbstractC1482f.g(str, StubApp.getString2(31108)), AbstractC1482f.g(str, string212));
            configurableProvider.addAlgorithm(StubApp.getString2(31111), str + StubApp.getString2(31110));
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            a.y(sb4, StubApp.getString2(31112), configurableProvider, StubApp.getString2(31113));
            configurableProvider.addAlgorithm(StubApp.getString2(31114), StubApp.getString2(31115));
            configurableProvider.addAlgorithm(StubApp.getString2(31116), StubApp.getString2(31117));
            a.x(a.n(new StringBuilder(), str, StubApp.getString2(31118), configurableProvider, StubApp.getString2(31119)), str, StubApp.getString2(31120), configurableProvider, StubApp.getString2(31121));
            configurableProvider.addAlgorithm(StubApp.getString2(31122), StubApp.getString2(31123));
            configurableProvider.addAlgorithm(StubApp.getString2(31124), StubApp.getString2(31125));
        }
    }

    private SHA3() {
    }
}
