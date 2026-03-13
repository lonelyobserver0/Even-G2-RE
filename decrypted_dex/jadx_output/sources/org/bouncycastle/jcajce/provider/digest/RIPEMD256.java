package org.bouncycastle.jcajce.provider.digest;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.RIPEMD256Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class RIPEMD256 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new RIPEMD256Digest());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Digest digest = (Digest) super.clone();
            digest.digest = new RIPEMD256Digest((RIPEMD256Digest) this.digest);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new RIPEMD256Digest()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super(StubApp.getString2(31068), 256, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = RIPEMD256.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            sb2.append(str);
            sb2.append(StubApp.getString2(31007));
            configurableProvider.addAlgorithm(StubApp.getString2(31069), sb2.toString());
            StringBuilder sb3 = new StringBuilder(StubApp.getString2(30952));
            ASN1ObjectIdentifier aSN1ObjectIdentifier = TeleTrusTObjectIdentifiers.ripemd256;
            String string2 = StubApp.getString2(28186);
            StringBuilder C10 = a.C(sb3, string2, configurableProvider, str, aSN1ObjectIdentifier);
            C10.append(StubApp.getString2(31011));
            addHMACAlgorithm(configurableProvider, string2, C10.toString(), AbstractC1482f.g(str, StubApp.getString2(31012)));
        }
    }

    private RIPEMD256() {
    }
}
