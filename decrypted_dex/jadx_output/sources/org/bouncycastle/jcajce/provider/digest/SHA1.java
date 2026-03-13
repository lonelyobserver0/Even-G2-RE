package org.bouncycastle.jcajce.provider.digest;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.iana.IANAObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SHA1 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new SHA1Digest());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Digest digest = (Digest) super.clone();
            digest.digest = new SHA1Digest((SHA1Digest) this.digest);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new SHA1Digest()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super(StubApp.getString2(28055), 160, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = SHA1.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            a.x(sb2, str, StubApp.getString2(31007), configurableProvider, StubApp.getString2(31072));
            String string2 = StubApp.getString2(31073);
            String string22 = StubApp.getString2(5778);
            configurableProvider.addAlgorithm(string2, string22);
            configurableProvider.addAlgorithm(StubApp.getString2(31074), string22);
            StringBuilder sb3 = new StringBuilder(StubApp.getString2(30952));
            ASN1ObjectIdentifier aSN1ObjectIdentifier = OIWObjectIdentifiers.idSHA1;
            StringBuilder C10 = a.C(sb3, string22, configurableProvider, str, aSN1ObjectIdentifier);
            C10.append(StubApp.getString2(31011));
            String sb4 = C10.toString();
            String g10 = AbstractC1482f.g(str, StubApp.getString2(31012));
            String string23 = StubApp.getString2(21748);
            addHMACAlgorithm(configurableProvider, string23, sb4, g10);
            addHMACAlias(configurableProvider, string23, PKCSObjectIdentifiers.id_hmacWithSHA1);
            addHMACAlias(configurableProvider, string23, IANAObjectIdentifiers.hmacSHA1);
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str);
            String string24 = StubApp.getString2(31075);
            sb5.append(string24);
            configurableProvider.addAlgorithm(StubApp.getString2(31076), sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            sb6.append(str);
            a.y(sb6, string24, configurableProvider, StubApp.getString2(31077));
            String string25 = StubApp.getString2(31078);
            String string26 = StubApp.getString2(31079);
            configurableProvider.addAlgorithm(string25, string26);
            configurableProvider.addAlgorithm(StubApp.getString2(31027) + aSN1ObjectIdentifier, string26);
            configurableProvider.addAlgorithm(StubApp.getString2(31081), a.c(StubApp.getString2(31003) + aSN1ObjectIdentifier, StubApp.getString2(31080), str, StubApp.getString2(31025), configurableProvider));
        }
    }

    public static class PBEWithMacKeyFactory extends PBESecretKeyFactory {
        public PBEWithMacKeyFactory() {
            super(StubApp.getString2(31082), null, false, 2, 1, 160, 0);
        }
    }

    public static class SHA1Mac extends BaseMac {
        public SHA1Mac() {
            super(new HMac(new SHA1Digest()));
        }
    }

    private SHA1() {
    }
}
