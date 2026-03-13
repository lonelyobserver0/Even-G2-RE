package org.bouncycastle.jcajce.provider.digest;

import com.stub.StubApp;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.crypto.digests.Blake2bDigest;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Blake2b {

    public static class Blake2b160 extends BCMessageDigest implements Cloneable {
        public Blake2b160() {
            super(new Blake2bDigest(160));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Blake2b160 blake2b160 = (Blake2b160) super.clone();
            blake2b160.digest = new Blake2bDigest((Blake2bDigest) this.digest);
            return blake2b160;
        }
    }

    public static class Blake2b256 extends BCMessageDigest implements Cloneable {
        public Blake2b256() {
            super(new Blake2bDigest(256));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Blake2b256 blake2b256 = (Blake2b256) super.clone();
            blake2b256.digest = new Blake2bDigest((Blake2bDigest) this.digest);
            return blake2b256;
        }
    }

    public static class Blake2b384 extends BCMessageDigest implements Cloneable {
        public Blake2b384() {
            super(new Blake2bDigest(KyberEngine.KyberPolyBytes));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Blake2b384 blake2b384 = (Blake2b384) super.clone();
            blake2b384.digest = new Blake2bDigest((Blake2bDigest) this.digest);
            return blake2b384;
        }
    }

    public static class Blake2b512 extends BCMessageDigest implements Cloneable {
        public Blake2b512() {
            super(new Blake2bDigest(512));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Blake2b512 blake2b512 = (Blake2b512) super.clone();
            blake2b512.digest = new Blake2bDigest((Blake2bDigest) this.digest);
            return blake2b512;
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = Blake2b.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            sb2.append(str);
            sb2.append(StubApp.getString2(30950));
            configurableProvider.addAlgorithm(StubApp.getString2(30951), sb2.toString());
            String string2 = StubApp.getString2(30952);
            StringBuilder C10 = a.C(new StringBuilder(string2), StubApp.getString2(30953), configurableProvider, str, MiscObjectIdentifiers.id_blake2b512);
            C10.append(StubApp.getString2(30954));
            configurableProvider.addAlgorithm(StubApp.getString2(30955), C10.toString());
            StringBuilder C11 = a.C(new StringBuilder(string2), StubApp.getString2(30956), configurableProvider, str, MiscObjectIdentifiers.id_blake2b384);
            C11.append(StubApp.getString2(30957));
            configurableProvider.addAlgorithm(StubApp.getString2(30958), C11.toString());
            StringBuilder C12 = a.C(new StringBuilder(string2), StubApp.getString2(30959), configurableProvider, str, MiscObjectIdentifiers.id_blake2b256);
            C12.append(StubApp.getString2(30960));
            configurableProvider.addAlgorithm(StubApp.getString2(30961), C12.toString());
            a.z(new StringBuilder(string2), MiscObjectIdentifiers.id_blake2b160, configurableProvider, StubApp.getString2(30962));
        }
    }

    private Blake2b() {
    }
}
