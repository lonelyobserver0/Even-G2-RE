package org.bouncycastle.jcajce.provider.symmetric;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.BlowfishEngine;
import org.bouncycastle.crypto.macs.CMac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class Blowfish {

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return StubApp.getString2(31677);
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new CBCBlockCipher(new BlowfishEngine()), 64);
        }
    }

    public static class CMAC extends BaseMac {
        public CMAC() {
            super(new CMac(new BlowfishEngine()));
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlowfishEngine());
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super(StubApp.getString2(28562), 128, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = Blowfish.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            a.x(a.n(sb2, str, StubApp.getString2(31678), configurableProvider, StubApp.getString2(31679)), str, StubApp.getString2(31476), configurableProvider, StubApp.getString2(31680));
            ASN1ObjectIdentifier aSN1ObjectIdentifier = MiscObjectIdentifiers.cryptlib_algorithm_blowfish_CBC;
            configurableProvider.addAlgorithm(StubApp.getString2(30341), aSN1ObjectIdentifier, str + StubApp.getString2(31480));
            a.x(new StringBuilder(), str, StubApp.getString2(31504), configurableProvider, StubApp.getString2(31681));
            String string2 = StubApp.getString2(31682);
            String string22 = StubApp.getString2(30831);
            a.y(a.s(configurableProvider, string2, string22, str, aSN1ObjectIdentifier), StubApp.getString2(31459), configurableProvider, StubApp.getString2(31683));
            configurableProvider.addAlgorithm(StubApp.getString2(31656), aSN1ObjectIdentifier, string22);
        }
    }

    private Blowfish() {
    }
}
