package org.bouncycastle.jcajce.provider.digest;

import com.stub.StubApp;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.crypto.digests.Blake3Digest;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Blake3 {

    public static class Blake3_256 extends BCMessageDigest implements Cloneable {
        public Blake3_256() {
            super(new Blake3Digest(256));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Blake3_256 blake3_256 = (Blake3_256) super.clone();
            blake3_256.digest = new Blake3Digest((Blake3Digest) this.digest);
            return blake3_256;
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = Blake3.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm(StubApp.getString2(30976), PREFIX + StubApp.getString2(30975));
            a.z(new StringBuilder(StubApp.getString2(30952)), MiscObjectIdentifiers.blake3_256, configurableProvider, StubApp.getString2(30977));
        }
    }

    private Blake3() {
    }
}
