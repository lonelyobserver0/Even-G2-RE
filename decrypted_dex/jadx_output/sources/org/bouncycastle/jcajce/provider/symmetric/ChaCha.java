package org.bouncycastle.jcajce.provider.symmetric;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.ChaCha7539Engine;
import org.bouncycastle.crypto.engines.ChaChaEngine;
import org.bouncycastle.crypto.modes.AEADCipher;
import org.bouncycastle.crypto.modes.ChaCha20Poly1305;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class ChaCha {

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return StubApp.getString2(31711);
        }
    }

    public static class AlgParamsCC1305 extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return StubApp.getString2(31712);
        }
    }

    public static class Base extends BaseStreamCipher {
        public Base() {
            super(new ChaChaEngine(), 8);
        }
    }

    public static class Base7539 extends BaseStreamCipher {
        public Base7539() {
            super(new ChaCha7539Engine(), 12);
        }
    }

    public static class BaseCC20P1305 extends BaseBlockCipher {
        public BaseCC20P1305() {
            super((AEADCipher) new ChaCha20Poly1305(), true, 12);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super(StubApp.getString2(28578), 128, new CipherKeyGenerator());
        }
    }

    public static class KeyGen7539 extends BaseKeyGenerator {
        public KeyGen7539() {
            super(StubApp.getString2(28574), 256, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = ChaCha.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            a.x(a.n(a.n(a.n(a.n(sb2, str, StubApp.getString2(31630), configurableProvider, StubApp.getString2(31713)), str, StubApp.getString2(31504), configurableProvider, StubApp.getString2(31714)), str, StubApp.getString2(31715), configurableProvider, StubApp.getString2(31716)), str, StubApp.getString2(31717), configurableProvider, StubApp.getString2(31718)), str, StubApp.getString2(31459), configurableProvider, StubApp.getString2(31719));
            String string2 = StubApp.getString2(31720);
            String string22 = StubApp.getString2(31721);
            configurableProvider.addAlgorithm(string2, string22);
            configurableProvider.addAlgorithm(StubApp.getString2(31722), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(31723), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(31724), string22);
            StringBuilder sb3 = new StringBuilder(StubApp.getString2(31004));
            ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.id_alg_AEADChaCha20Poly1305;
            StringBuilder o5 = a.o(a.C(sb3, string22, configurableProvider, str, aSN1ObjectIdentifier), StubApp.getString2(31725), configurableProvider, StubApp.getString2(31726), str);
            o5.append(StubApp.getString2(31727));
            configurableProvider.addAlgorithm(StubApp.getString2(31728), o5.toString());
            StringBuilder sb4 = new StringBuilder(StubApp.getString2(30221));
            String string23 = StubApp.getString2(31729);
            a.z(a.q(a.q(a.q(sb4, aSN1ObjectIdentifier, configurableProvider, string23, StubApp.getString2(31464)), aSN1ObjectIdentifier, configurableProvider, string23, StubApp.getString2(31730)), aSN1ObjectIdentifier, configurableProvider, string23, StubApp.getString2(31731)), aSN1ObjectIdentifier, configurableProvider, string23);
        }
    }

    private ChaCha() {
    }
}
