package org.bouncycastle.jcajce.provider.digest;

import com.stub.StubApp;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.crypto.digests.Blake2sDigest;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Blake2s {

    public static class Blake2s128 extends BCMessageDigest implements Cloneable {
        public Blake2s128() {
            super(new Blake2sDigest(128));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Blake2s128 blake2s128 = (Blake2s128) super.clone();
            blake2s128.digest = new Blake2sDigest((Blake2sDigest) this.digest);
            return blake2s128;
        }
    }

    public static class Blake2s160 extends BCMessageDigest implements Cloneable {
        public Blake2s160() {
            super(new Blake2sDigest(160));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Blake2s160 blake2s160 = (Blake2s160) super.clone();
            blake2s160.digest = new Blake2sDigest((Blake2sDigest) this.digest);
            return blake2s160;
        }
    }

    public static class Blake2s224 extends BCMessageDigest implements Cloneable {
        public Blake2s224() {
            super(new Blake2sDigest(BERTags.FLAGS));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Blake2s224 blake2s224 = (Blake2s224) super.clone();
            blake2s224.digest = new Blake2sDigest((Blake2sDigest) this.digest);
            return blake2s224;
        }
    }

    public static class Blake2s256 extends BCMessageDigest implements Cloneable {
        public Blake2s256() {
            super(new Blake2sDigest(256));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Blake2s256 blake2s256 = (Blake2s256) super.clone();
            blake2s256.digest = new Blake2sDigest((Blake2sDigest) this.digest);
            return blake2s256;
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = Blake2s.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            sb2.append(str);
            sb2.append(StubApp.getString2(30963));
            configurableProvider.addAlgorithm(StubApp.getString2(30964), sb2.toString());
            String string2 = StubApp.getString2(30952);
            StringBuilder C10 = a.C(new StringBuilder(string2), StubApp.getString2(30965), configurableProvider, str, MiscObjectIdentifiers.id_blake2s256);
            C10.append(StubApp.getString2(30966));
            configurableProvider.addAlgorithm(StubApp.getString2(30967), C10.toString());
            StringBuilder C11 = a.C(new StringBuilder(string2), StubApp.getString2(30968), configurableProvider, str, MiscObjectIdentifiers.id_blake2s224);
            C11.append(StubApp.getString2(30969));
            configurableProvider.addAlgorithm(StubApp.getString2(30970), C11.toString());
            StringBuilder C12 = a.C(new StringBuilder(string2), StubApp.getString2(30971), configurableProvider, str, MiscObjectIdentifiers.id_blake2s160);
            C12.append(StubApp.getString2(30972));
            configurableProvider.addAlgorithm(StubApp.getString2(30973), C12.toString());
            a.z(new StringBuilder(string2), MiscObjectIdentifiers.id_blake2s128, configurableProvider, StubApp.getString2(30974));
        }
    }

    private Blake2s() {
    }
}
