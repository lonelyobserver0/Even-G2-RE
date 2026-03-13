package org.bouncycastle.jcajce.provider.symmetric;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.RC4Engine;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class ARC4 {

    public static class Base extends BaseStreamCipher {
        public Base() {
            super(new RC4Engine(), 0);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super(StubApp.getString2(28260), 128, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = ARC4.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            a.x(sb2, str, StubApp.getString2(31630), configurableProvider, StubApp.getString2(31631));
            ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.rc4;
            String string2 = StubApp.getString2(31485);
            String string22 = StubApp.getString2(28456);
            configurableProvider.addAlgorithm(string2, aSN1ObjectIdentifier, string22);
            configurableProvider.addAlgorithm(StubApp.getString2(31632), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(31633), string22);
            a.x(new StringBuilder(), str, StubApp.getString2(31504), configurableProvider, StubApp.getString2(31634));
            configurableProvider.addAlgorithm(StubApp.getString2(31635), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(31636), string22);
            StringBuilder n10 = a.n(new StringBuilder(), str, StubApp.getString2(31637), configurableProvider, StubApp.getString2(31638));
            n10.append(str);
            n10.append(StubApp.getString2(31639));
            configurableProvider.addAlgorithm(StubApp.getString2(31640), n10.toString());
            String string23 = StubApp.getString2(31464);
            StringBuilder sb3 = new StringBuilder(string23);
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = PKCSObjectIdentifiers.pbeWithSHAAnd128BitRC4;
            String string24 = StubApp.getString2(31601);
            StringBuilder q10 = a.q(sb3, aSN1ObjectIdentifier2, configurableProvider, string24, string23);
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC4;
            a.z(q10, aSN1ObjectIdentifier3, configurableProvider, string24);
            configurableProvider.addAlgorithm(StubApp.getString2(31641), string24);
            configurableProvider.addAlgorithm(StubApp.getString2(31642), string24);
            configurableProvider.addAlgorithm(StubApp.getString2(31643), string24);
            a.x(a.n(new StringBuilder(), str, StubApp.getString2(31644), configurableProvider, StubApp.getString2(31645)), str, StubApp.getString2(31646), configurableProvider, StubApp.getString2(31647));
            String string25 = StubApp.getString2(31599);
            String string26 = StubApp.getString2(31648);
            configurableProvider.addAlgorithm(string25, aSN1ObjectIdentifier2, string26);
            String string27 = StubApp.getString2(31649);
            configurableProvider.addAlgorithm(string25, aSN1ObjectIdentifier3, string27);
            configurableProvider.addAlgorithm(StubApp.getString2(31650), string26);
            configurableProvider.addAlgorithm(StubApp.getString2(31651), string27);
            configurableProvider.addAlgorithm(string2, aSN1ObjectIdentifier2, string26);
            configurableProvider.addAlgorithm(string2, aSN1ObjectIdentifier3, string27);
        }
    }

    public static class PBEWithSHAAnd128Bit extends BaseStreamCipher {
        public PBEWithSHAAnd128Bit() {
            super(new RC4Engine(), 0, 128, 1);
        }
    }

    public static class PBEWithSHAAnd128BitKeyFactory extends PBESecretKeyFactory {
        public PBEWithSHAAnd128BitKeyFactory() {
            super(StubApp.getString2(31652), PKCSObjectIdentifiers.pbeWithSHAAnd128BitRC4, true, 2, 1, 128, 0);
        }
    }

    public static class PBEWithSHAAnd40Bit extends BaseStreamCipher {
        public PBEWithSHAAnd40Bit() {
            super(new RC4Engine(), 0, 40, 1);
        }
    }

    public static class PBEWithSHAAnd40BitKeyFactory extends PBESecretKeyFactory {
        public PBEWithSHAAnd40BitKeyFactory() {
            super(StubApp.getString2(31652), PKCSObjectIdentifiers.pbeWithSHAAnd128BitRC4, true, 2, 1, 40, 0);
        }
    }

    private ARC4() {
    }
}
