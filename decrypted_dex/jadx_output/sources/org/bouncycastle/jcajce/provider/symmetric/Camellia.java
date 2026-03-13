package org.bouncycastle.jcajce.provider.symmetric;

import com.stub.StubApp;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.ntt.NTTObjectIdentifiers;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.engines.CamelliaEngine;
import org.bouncycastle.crypto.engines.CamelliaWrapEngine;
import org.bouncycastle.crypto.engines.RFC3211WrapEngine;
import org.bouncycastle.crypto.generators.Poly1305KeyGenerator;
import org.bouncycastle.crypto.macs.GMac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.GCMBlockCipher;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class Camellia {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            if (this.random == null) {
                this.random = CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance(StubApp.getString2("28258"));
                createParametersInstance.init(new IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (Exception e10) {
                throw new RuntimeException(e10.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException(StubApp.getString2(31700));
        }
    }

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return StubApp.getString2(31701);
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new CBCBlockCipher(new CamelliaEngine()), 128);
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.Camellia.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public BlockCipher get() {
                    return new CamelliaEngine();
                }
            });
        }
    }

    public static class GMAC extends BaseMac {
        public GMAC() {
            super(new GMac(new GCMBlockCipher(new CamelliaEngine())));
        }
    }

    public static class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super(StubApp.getString2(28258), null);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            this(256);
        }

        public KeyGen(int i3) {
            super(StubApp.getString2(28258), i3, new CipherKeyGenerator());
        }
    }

    public static class KeyGen128 extends KeyGen {
        public KeyGen128() {
            super(128);
        }
    }

    public static class KeyGen192 extends KeyGen {
        public KeyGen192() {
            super(192);
        }
    }

    public static class KeyGen256 extends KeyGen {
        public KeyGen256() {
            super(256);
        }
    }

    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = Camellia.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            a.x(sb2, str, StubApp.getString2(31459), configurableProvider, StubApp.getString2(31702));
            ASN1ObjectIdentifier aSN1ObjectIdentifier = NTTObjectIdentifiers.id_camellia128_cbc;
            String string2 = StubApp.getString2(31656);
            String string22 = StubApp.getString2(30832);
            configurableProvider.addAlgorithm(string2, aSN1ObjectIdentifier, string22);
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NTTObjectIdentifiers.id_camellia192_cbc;
            configurableProvider.addAlgorithm(string2, aSN1ObjectIdentifier2, string22);
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NTTObjectIdentifiers.id_camellia256_cbc;
            a.y(a.s(configurableProvider, string2, string22, str, aSN1ObjectIdentifier3), StubApp.getString2(31469), configurableProvider, StubApp.getString2(31703));
            String string23 = StubApp.getString2(31658);
            configurableProvider.addAlgorithm(string23, aSN1ObjectIdentifier, string22);
            configurableProvider.addAlgorithm(string23, aSN1ObjectIdentifier2, string22);
            StringBuilder o5 = a.o(a.s(configurableProvider, string23, string22, str, aSN1ObjectIdentifier3), StubApp.getString2(31476), configurableProvider, StubApp.getString2(31704), str);
            String string24 = StubApp.getString2(31480);
            String string25 = StubApp.getString2(30341);
            a.x(a.n(a.p(a.s(configurableProvider, string25, AbstractC1482f.k(a.p(o5, string24, configurableProvider, string25, aSN1ObjectIdentifier), str, string24), str, aSN1ObjectIdentifier2), string24, configurableProvider, string25, aSN1ObjectIdentifier3), str, StubApp.getString2(31492), configurableProvider, StubApp.getString2(31705)), str, StubApp.getString2(31484), configurableProvider, StubApp.getString2(31706));
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NTTObjectIdentifiers.id_camellia128_wrap;
            String string26 = StubApp.getString2(31485);
            String string27 = StubApp.getString2(31707);
            configurableProvider.addAlgorithm(string26, aSN1ObjectIdentifier4, string27);
            ASN1ObjectIdentifier aSN1ObjectIdentifier5 = NTTObjectIdentifiers.id_camellia192_wrap;
            configurableProvider.addAlgorithm(string26, aSN1ObjectIdentifier5, string27);
            ASN1ObjectIdentifier aSN1ObjectIdentifier6 = NTTObjectIdentifiers.id_camellia256_wrap;
            a.y(a.s(configurableProvider, string26, string27, str, aSN1ObjectIdentifier6), StubApp.getString2(31566), configurableProvider, StubApp.getString2(31708));
            String string28 = StubApp.getString2(31599);
            configurableProvider.addAlgorithm(string28, aSN1ObjectIdentifier, string22);
            configurableProvider.addAlgorithm(string28, aSN1ObjectIdentifier2, string22);
            StringBuilder s10 = a.s(configurableProvider, string28, string22, str, aSN1ObjectIdentifier3);
            String string29 = StubApp.getString2(31504);
            StringBuilder o10 = a.o(s10, string29, configurableProvider, StubApp.getString2(31709), str);
            String string210 = StubApp.getString2(31506);
            String string211 = StubApp.getString2(31512);
            StringBuilder p8 = a.p(o10, string210, configurableProvider, string211, aSN1ObjectIdentifier4);
            String string212 = StubApp.getString2(31508);
            StringBuilder s11 = a.s(configurableProvider, string211, AbstractC1482f.k(p8, str, string212), str, aSN1ObjectIdentifier5);
            String string213 = StubApp.getString2(31510);
            StringBuilder s12 = a.s(configurableProvider, string211, AbstractC1482f.k(a.p(a.s(configurableProvider, string211, AbstractC1482f.k(a.p(s11, string213, configurableProvider, string211, aSN1ObjectIdentifier6), str, string210), str, aSN1ObjectIdentifier), string212, configurableProvider, string211, aSN1ObjectIdentifier2), str, string213), str, aSN1ObjectIdentifier3);
            s12.append(StubApp.getString2(31675));
            addGMacAlgorithm(configurableProvider, string22, s12.toString(), AbstractC1482f.g(str, string29));
            addPoly1305Algorithm(configurableProvider, string22, AbstractC1482f.g(str, StubApp.getString2(31617)), AbstractC1482f.g(str, StubApp.getString2(31618)));
        }
    }

    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new org.bouncycastle.crypto.macs.Poly1305(new CamelliaEngine()));
        }
    }

    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super(StubApp.getString2(31710), 256, new Poly1305KeyGenerator());
        }
    }

    public static class RFC3211Wrap extends BaseWrapCipher {
        public RFC3211Wrap() {
            super(new RFC3211WrapEngine(new CamelliaEngine()), 16);
        }
    }

    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new CamelliaWrapEngine());
        }
    }

    private Camellia() {
    }
}
