package org.bouncycastle.jcajce.provider.digest;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.iana.IANAObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.RIPEMD160Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class RIPEMD160 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new RIPEMD160Digest());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Digest digest = (Digest) super.clone();
            digest.digest = new RIPEMD160Digest((RIPEMD160Digest) this.digest);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new RIPEMD160Digest()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super(StubApp.getString2(31061), 160, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = RIPEMD160.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            sb2.append(str);
            sb2.append(StubApp.getString2(31007));
            configurableProvider.addAlgorithm(StubApp.getString2(31062), sb2.toString());
            StringBuilder sb3 = new StringBuilder(StubApp.getString2(30952));
            ASN1ObjectIdentifier aSN1ObjectIdentifier = TeleTrusTObjectIdentifiers.ripemd160;
            String string2 = StubApp.getString2(21747);
            StringBuilder C10 = a.C(sb3, string2, configurableProvider, str, aSN1ObjectIdentifier);
            C10.append(StubApp.getString2(31011));
            addHMACAlgorithm(configurableProvider, string2, C10.toString(), AbstractC1482f.g(str, StubApp.getString2(31012)));
            addHMACAlias(configurableProvider, string2, IANAObjectIdentifiers.hmacRIPEMD160);
            configurableProvider.addAlgorithm(StubApp.getString2(31064), str + StubApp.getString2(31063));
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            a.y(sb4, StubApp.getString2(31065), configurableProvider, StubApp.getString2(31066));
        }
    }

    public static class PBEWithHmac extends BaseMac {
        public PBEWithHmac() {
            super(new HMac(new RIPEMD160Digest()), 2, 2, 160);
        }
    }

    public static class PBEWithHmacKeyFactory extends PBESecretKeyFactory {
        public PBEWithHmacKeyFactory() {
            super(StubApp.getString2(31067), null, false, 2, 2, 160, 0);
        }
    }

    private RIPEMD160() {
    }
}
