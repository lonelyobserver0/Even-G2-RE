package org.bouncycastle.jcajce.provider.digest;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.GOST3411Digest;
import org.bouncycastle.crypto.digests.GOST3411_2012_256Digest;
import org.bouncycastle.crypto.digests.GOST3411_2012_512Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GOST3411 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new GOST3411Digest());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Digest digest = (Digest) super.clone();
            digest.digest = new GOST3411Digest((GOST3411Digest) this.digest);
            return digest;
        }
    }

    public static class Digest2012_256 extends BCMessageDigest implements Cloneable {
        public Digest2012_256() {
            super(new GOST3411_2012_256Digest());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Digest2012_256 digest2012_256 = (Digest2012_256) super.clone();
            digest2012_256.digest = new GOST3411_2012_256Digest((GOST3411_2012_256Digest) this.digest);
            return digest2012_256;
        }
    }

    public static class Digest2012_512 extends BCMessageDigest implements Cloneable {
        public Digest2012_512() {
            super(new GOST3411_2012_512Digest());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Digest2012_512 digest2012_512 = (Digest2012_512) super.clone();
            digest2012_512.digest = new GOST3411_2012_512Digest((GOST3411_2012_512Digest) this.digest);
            return digest2012_512;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new GOST3411Digest()));
        }
    }

    public static class HashMac2012_256 extends BaseMac {
        public HashMac2012_256() {
            super(new HMac(new GOST3411_2012_256Digest()));
        }
    }

    public static class HashMac2012_512 extends BaseMac {
        public HashMac2012_512() {
            super(new HMac(new GOST3411_2012_512Digest()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super(StubApp.getString2(31006), 256, new CipherKeyGenerator());
        }
    }

    public static class KeyGenerator2012_256 extends BaseKeyGenerator {
        public KeyGenerator2012_256() {
            super(StubApp.getString2(31006), 256, new CipherKeyGenerator());
        }
    }

    public static class KeyGenerator2012_512 extends BaseKeyGenerator {
        public KeyGenerator2012_512() {
            super(StubApp.getString2(31006), 512, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = GOST3411.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            a.x(sb2, str, StubApp.getString2(31007), configurableProvider, StubApp.getString2(31008));
            String string2 = StubApp.getString2(31009);
            String string22 = StubApp.getString2(28192);
            configurableProvider.addAlgorithm(string2, string22);
            configurableProvider.addAlgorithm(StubApp.getString2(31010), string22);
            String string23 = StubApp.getString2(30952);
            StringBuilder sb3 = new StringBuilder(string23);
            ASN1ObjectIdentifier aSN1ObjectIdentifier = CryptoProObjectIdentifiers.gostR3411;
            StringBuilder C10 = a.C(sb3, string22, configurableProvider, str, aSN1ObjectIdentifier);
            C10.append(StubApp.getString2(31011));
            addHMACAlgorithm(configurableProvider, string22, C10.toString(), AbstractC1482f.g(str, StubApp.getString2(31012)));
            addHMACAlias(configurableProvider, string22, aSN1ObjectIdentifier);
            configurableProvider.addAlgorithm(StubApp.getString2(31014), str + StubApp.getString2(31013));
            String string24 = StubApp.getString2(31015);
            String string25 = StubApp.getString2(28194);
            configurableProvider.addAlgorithm(string24, string25);
            configurableProvider.addAlgorithm(StubApp.getString2(31016), string25);
            StringBuilder C11 = a.C(new StringBuilder(string23), string25, configurableProvider, str, RosstandartObjectIdentifiers.id_tc26_gost_3411_12_256);
            C11.append(StubApp.getString2(31017));
            addHMACAlgorithm(configurableProvider, string25, C11.toString(), AbstractC1482f.g(str, StubApp.getString2(31018)));
            addHMACAlias(configurableProvider, string25, RosstandartObjectIdentifiers.id_tc26_hmac_gost_3411_12_256);
            configurableProvider.addAlgorithm(StubApp.getString2(31020), str + StubApp.getString2(31019));
            String string26 = StubApp.getString2(31021);
            String string27 = StubApp.getString2(28195);
            configurableProvider.addAlgorithm(string26, string27);
            configurableProvider.addAlgorithm(StubApp.getString2(31022), string27);
            StringBuilder C12 = a.C(new StringBuilder(string23), string27, configurableProvider, str, RosstandartObjectIdentifiers.id_tc26_gost_3411_12_512);
            C12.append(StubApp.getString2(31023));
            addHMACAlgorithm(configurableProvider, string27, C12.toString(), AbstractC1482f.g(str, StubApp.getString2(31024)));
            addHMACAlias(configurableProvider, string27, RosstandartObjectIdentifiers.id_tc26_hmac_gost_3411_12_512);
            a.z(a.m(str, StubApp.getString2(31025), StubApp.getString2(31026), StubApp.getString2(31027), configurableProvider), aSN1ObjectIdentifier, configurableProvider, StubApp.getString2(31028));
        }
    }

    public static class PBEWithMacKeyFactory extends PBESecretKeyFactory {
        public PBEWithMacKeyFactory() {
            super(StubApp.getString2(31029), null, false, 2, 6, 256, 0);
        }
    }

    private GOST3411() {
    }
}
