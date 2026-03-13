package org.bouncycastle.jcajce.provider.digest;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SHA256 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new SHA256Digest());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Digest digest = (Digest) super.clone();
            digest.digest = new SHA256Digest((SHA256Digest) this.digest);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new SHA256Digest()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super(StubApp.getString2(28057), 256, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = SHA256.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            a.x(sb2, str, StubApp.getString2(31007), configurableProvider, StubApp.getString2(31086));
            String string2 = StubApp.getString2(31087);
            String string22 = StubApp.getString2(1488);
            StringBuilder r8 = a.r(configurableProvider, string2, string22, StubApp.getString2(30952));
            ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.id_sha256;
            a.y(a.C(r8, string22, configurableProvider, str, aSN1ObjectIdentifier), StubApp.getString2(31025), configurableProvider, StubApp.getString2(31088));
            String string23 = StubApp.getString2(31089);
            String string24 = StubApp.getString2(31090);
            configurableProvider.addAlgorithm(string23, string24);
            String str2 = StubApp.getString2(31027) + aSN1ObjectIdentifier;
            String string25 = StubApp.getString2(31011);
            String c10 = a.c(StubApp.getString2(31091), a.c(str2, string24, str, string25, configurableProvider), str, string25, configurableProvider);
            String g10 = AbstractC1482f.g(str, StubApp.getString2(31012));
            String string26 = StubApp.getString2(21749);
            addHMACAlgorithm(configurableProvider, string26, c10, g10);
            addHMACAlias(configurableProvider, string26, PKCSObjectIdentifiers.id_hmacWithSHA256);
            addHMACAlias(configurableProvider, string26, aSN1ObjectIdentifier);
        }
    }

    public static class PBEWithMacKeyFactory extends PBESecretKeyFactory {
        public PBEWithMacKeyFactory() {
            super(StubApp.getString2(31092), null, false, 2, 4, 256, 0);
        }
    }

    private SHA256() {
    }
}
