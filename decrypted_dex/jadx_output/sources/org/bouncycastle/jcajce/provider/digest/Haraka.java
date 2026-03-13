package org.bouncycastle.jcajce.provider.digest;

import com.stub.StubApp;
import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.digests.Haraka256Digest;
import org.bouncycastle.crypto.digests.Haraka512Digest;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Haraka {

    public static class Digest256 extends BCMessageDigest implements Cloneable {
        public Digest256() {
            super(new Haraka256Digest());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Digest256 digest256 = (Digest256) super.clone();
            digest256.digest = new Haraka256Digest((Haraka256Digest) this.digest);
            return digest256;
        }
    }

    public static class Digest512 extends BCMessageDigest implements Cloneable {
        public Digest512() {
            super(new Haraka512Digest());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Digest512 digest512 = (Digest512) super.clone();
            digest512.digest = new Haraka512Digest((Haraka512Digest) this.digest);
            return digest512;
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = Haraka.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            a.x(a.n(sb2, str, StubApp.getString2(30981), configurableProvider, StubApp.getString2(31030)), str, StubApp.getString2(30985), configurableProvider, StubApp.getString2(31031));
        }
    }

    private Haraka() {
    }
}
