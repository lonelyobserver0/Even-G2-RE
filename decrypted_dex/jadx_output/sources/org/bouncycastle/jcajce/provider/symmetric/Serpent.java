package org.bouncycastle.jcajce.provider.symmetric;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.gnu.GNUObjectIdentifiers;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.SerpentEngine;
import org.bouncycastle.crypto.engines.TnepresEngine;
import org.bouncycastle.crypto.generators.Poly1305KeyGenerator;
import org.bouncycastle.crypto.macs.GMac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.CFBBlockCipher;
import org.bouncycastle.crypto.modes.GCMBlockCipher;
import org.bouncycastle.crypto.modes.OFBBlockCipher;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class Serpent {

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return StubApp.getString2(32192);
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new CBCBlockCipher(new SerpentEngine()), 128);
        }
    }

    public static class CFB extends BaseBlockCipher {
        public CFB() {
            super(new BufferedBlockCipher(new CFBBlockCipher(new SerpentEngine(), 128)), 128);
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.Serpent.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public BlockCipher get() {
                    return new SerpentEngine();
                }
            });
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super(StubApp.getString2(28768), 192, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = Serpent.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            String string2 = StubApp.getString2(31476);
            StringBuilder n10 = a.n(sb2, str, string2, configurableProvider, StubApp.getString2(32193));
            String string22 = StubApp.getString2(31504);
            StringBuilder n11 = a.n(a.n(a.n(n10, str, string22, configurableProvider, StubApp.getString2(32194)), str, StubApp.getString2(31459), configurableProvider, StubApp.getString2(32195)), str, StubApp.getString2(32196), configurableProvider, StubApp.getString2(32197));
            String string23 = StubApp.getString2(32198);
            a.x(a.n(n11, str, string23, configurableProvider, StubApp.getString2(32199)), str, StubApp.getString2(32200), configurableProvider, StubApp.getString2(32201));
            ASN1ObjectIdentifier aSN1ObjectIdentifier = GNUObjectIdentifiers.Serpent_128_ECB;
            String string24 = StubApp.getString2(30341);
            a.A(configurableProvider, str, string2, string24, aSN1ObjectIdentifier);
            a.A(configurableProvider, str, string2, string24, GNUObjectIdentifiers.Serpent_192_ECB);
            a.A(configurableProvider, str, string2, string24, GNUObjectIdentifiers.Serpent_256_ECB);
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = GNUObjectIdentifiers.Serpent_128_CBC;
            String string25 = StubApp.getString2(31480);
            a.A(configurableProvider, str, string25, string24, aSN1ObjectIdentifier2);
            a.A(configurableProvider, str, string25, string24, GNUObjectIdentifiers.Serpent_192_CBC);
            a.A(configurableProvider, str, string25, string24, GNUObjectIdentifiers.Serpent_256_CBC);
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = GNUObjectIdentifiers.Serpent_128_CFB;
            String string26 = StubApp.getString2(31482);
            a.A(configurableProvider, str, string26, string24, aSN1ObjectIdentifier3);
            a.A(configurableProvider, str, string26, string24, GNUObjectIdentifiers.Serpent_192_CFB);
            a.A(configurableProvider, str, string26, string24, GNUObjectIdentifiers.Serpent_256_CFB);
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = GNUObjectIdentifiers.Serpent_128_OFB;
            String string27 = StubApp.getString2(31481);
            a.A(configurableProvider, str, string27, string24, aSN1ObjectIdentifier4);
            a.A(configurableProvider, str, string27, string24, GNUObjectIdentifiers.Serpent_192_OFB);
            configurableProvider.addAlgorithm(string24, GNUObjectIdentifiers.Serpent_256_OFB, str + string27);
            String k3 = AbstractC1482f.k(new StringBuilder(), str, StubApp.getString2(32202));
            String g10 = AbstractC1482f.g(str, string22);
            String string28 = StubApp.getString2(32203);
            addGMacAlgorithm(configurableProvider, string28, k3, g10);
            addGMacAlgorithm(configurableProvider, StubApp.getString2(32205), AbstractC1482f.g(str, StubApp.getString2(32204)), AbstractC1482f.g(str, string23));
            addPoly1305Algorithm(configurableProvider, string28, AbstractC1482f.g(str, StubApp.getString2(31617)), AbstractC1482f.g(str, StubApp.getString2(31618)));
        }
    }

    public static class OFB extends BaseBlockCipher {
        public OFB() {
            super(new BufferedBlockCipher(new OFBBlockCipher(new SerpentEngine(), 128)), 128);
        }
    }

    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new org.bouncycastle.crypto.macs.Poly1305(new SerpentEngine()));
        }
    }

    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super(StubApp.getString2(32206), 256, new Poly1305KeyGenerator());
        }
    }

    public static class SerpentGMAC extends BaseMac {
        public SerpentGMAC() {
            super(new GMac(new GCMBlockCipher(new SerpentEngine())));
        }
    }

    public static class TAlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return StubApp.getString2(32207);
        }
    }

    public static class TECB extends BaseBlockCipher {
        public TECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.Serpent.TECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public BlockCipher get() {
                    return new TnepresEngine();
                }
            });
        }
    }

    public static class TKeyGen extends BaseKeyGenerator {
        public TKeyGen() {
            super(StubApp.getString2(28787), 192, new CipherKeyGenerator());
        }
    }

    public static class TSerpentGMAC extends BaseMac {
        public TSerpentGMAC() {
            super(new GMac(new GCMBlockCipher(new TnepresEngine())));
        }
    }

    private Serpent() {
    }
}
