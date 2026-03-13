package org.bouncycastle.jcajce.provider.symmetric;

import com.stub.StubApp;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.ua.UAObjectIdentifiers;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.engines.DSTU7624Engine;
import org.bouncycastle.crypto.engines.DSTU7624WrapEngine;
import org.bouncycastle.crypto.macs.KGMac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.CFBBlockCipher;
import org.bouncycastle.crypto.modes.KCCMBlockCipher;
import org.bouncycastle.crypto.modes.KCTRBlockCipher;
import org.bouncycastle.crypto.modes.KGCMBlockCipher;
import org.bouncycastle.crypto.modes.OFBBlockCipher;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DSTU7624 {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        private final int ivLength;

        public AlgParamGen(int i3) {
            this.ivLength = i3 / 8;
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[this.ivLength];
            if (this.random == null) {
                this.random = CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance(StubApp.getString2("28603"));
                createParametersInstance.init(new IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (Exception e10) {
                throw new RuntimeException(e10.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException(StubApp.getString2(31869));
        }
    }

    public static class AlgParamGen128 extends AlgParamGen {
        public AlgParamGen128() {
            super(128);
        }
    }

    public static class AlgParamGen256 extends AlgParamGen {
        public AlgParamGen256() {
            super(256);
        }
    }

    public static class AlgParamGen512 extends AlgParamGen {
        public AlgParamGen512() {
            super(512);
        }
    }

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return StubApp.getString2(31870);
        }
    }

    public static class CBC128 extends BaseBlockCipher {
        public CBC128() {
            super(new CBCBlockCipher(new DSTU7624Engine(128)), 128);
        }
    }

    public static class CBC256 extends BaseBlockCipher {
        public CBC256() {
            super(new CBCBlockCipher(new DSTU7624Engine(256)), 256);
        }
    }

    public static class CBC512 extends BaseBlockCipher {
        public CBC512() {
            super(new CBCBlockCipher(new DSTU7624Engine(512)), 512);
        }
    }

    public static class CCM128 extends BaseBlockCipher {
        public CCM128() {
            super(new KCCMBlockCipher(new DSTU7624Engine(128)));
        }
    }

    public static class CCM256 extends BaseBlockCipher {
        public CCM256() {
            super(new KCCMBlockCipher(new DSTU7624Engine(256)));
        }
    }

    public static class CCM512 extends BaseBlockCipher {
        public CCM512() {
            super(new KCCMBlockCipher(new DSTU7624Engine(512)));
        }
    }

    public static class CFB128 extends BaseBlockCipher {
        public CFB128() {
            super(new BufferedBlockCipher(new CFBBlockCipher(new DSTU7624Engine(128), 128)), 128);
        }
    }

    public static class CFB256 extends BaseBlockCipher {
        public CFB256() {
            super(new BufferedBlockCipher(new CFBBlockCipher(new DSTU7624Engine(256), 256)), 256);
        }
    }

    public static class CFB512 extends BaseBlockCipher {
        public CFB512() {
            super(new BufferedBlockCipher(new CFBBlockCipher(new DSTU7624Engine(512), 512)), 512);
        }
    }

    public static class CTR128 extends BaseBlockCipher {
        public CTR128() {
            super(new BufferedBlockCipher(new KCTRBlockCipher(new DSTU7624Engine(128))), 128);
        }
    }

    public static class CTR256 extends BaseBlockCipher {
        public CTR256() {
            super(new BufferedBlockCipher(new KCTRBlockCipher(new DSTU7624Engine(256))), 256);
        }
    }

    public static class CTR512 extends BaseBlockCipher {
        public CTR512() {
            super(new BufferedBlockCipher(new KCTRBlockCipher(new DSTU7624Engine(512))), 512);
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.DSTU7624.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public BlockCipher get() {
                    return new DSTU7624Engine(128);
                }
            });
        }
    }

    public static class ECB128 extends BaseBlockCipher {
        public ECB128() {
            super(new DSTU7624Engine(128));
        }
    }

    public static class ECB256 extends BaseBlockCipher {
        public ECB256() {
            super(new DSTU7624Engine(256));
        }
    }

    public static class ECB512 extends BaseBlockCipher {
        public ECB512() {
            super(new DSTU7624Engine(512));
        }
    }

    public static class ECB_128 extends BaseBlockCipher {
        public ECB_128() {
            super(new DSTU7624Engine(128));
        }
    }

    public static class ECB_256 extends BaseBlockCipher {
        public ECB_256() {
            super(new DSTU7624Engine(256));
        }
    }

    public static class ECB_512 extends BaseBlockCipher {
        public ECB_512() {
            super(new DSTU7624Engine(512));
        }
    }

    public static class GCM128 extends BaseBlockCipher {
        public GCM128() {
            super(new KGCMBlockCipher(new DSTU7624Engine(128)));
        }
    }

    public static class GCM256 extends BaseBlockCipher {
        public GCM256() {
            super(new KGCMBlockCipher(new DSTU7624Engine(256)));
        }
    }

    public static class GCM512 extends BaseBlockCipher {
        public GCM512() {
            super(new KGCMBlockCipher(new DSTU7624Engine(512)));
        }
    }

    public static class GMAC extends BaseMac {
        public GMAC() {
            super(new KGMac(new KGCMBlockCipher(new DSTU7624Engine(128)), 128));
        }
    }

    public static class GMAC128 extends BaseMac {
        public GMAC128() {
            super(new KGMac(new KGCMBlockCipher(new DSTU7624Engine(128)), 128));
        }
    }

    public static class GMAC256 extends BaseMac {
        public GMAC256() {
            super(new KGMac(new KGCMBlockCipher(new DSTU7624Engine(256)), 256));
        }
    }

    public static class GMAC512 extends BaseMac {
        public GMAC512() {
            super(new KGMac(new KGCMBlockCipher(new DSTU7624Engine(512)), 512));
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            this(256);
        }

        public KeyGen(int i3) {
            super(StubApp.getString2(28603), i3, new CipherKeyGenerator());
        }
    }

    public static class KeyGen128 extends KeyGen {
        public KeyGen128() {
            super(128);
        }
    }

    public static class KeyGen256 extends KeyGen {
        public KeyGen256() {
            super(256);
        }
    }

    public static class KeyGen512 extends KeyGen {
        public KeyGen512() {
            super(512);
        }
    }

    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = DSTU7624.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            String string2 = StubApp.getString2(31459);
            a.x(sb2, str, string2, configurableProvider, StubApp.getString2(31871));
            ASN1ObjectIdentifier aSN1ObjectIdentifier = UAObjectIdentifiers.dstu7624cbc_128;
            String string22 = StubApp.getString2(31872);
            a.A(configurableProvider, str, string2, string22, aSN1ObjectIdentifier);
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = UAObjectIdentifiers.dstu7624cbc_256;
            a.A(configurableProvider, str, string2, string22, aSN1ObjectIdentifier2);
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = UAObjectIdentifiers.dstu7624cbc_512;
            configurableProvider.addAlgorithm(string22, aSN1ObjectIdentifier3, str + string2);
            StringBuilder sb3 = new StringBuilder();
            String string23 = StubApp.getString2(31873);
            String k3 = AbstractC1482f.k(a.n(sb3, str, string23, configurableProvider, StubApp.getString2(31874)), str, string23);
            String string24 = StubApp.getString2(31875);
            StringBuilder s10 = a.s(configurableProvider, string24, AbstractC1482f.k(a.p(a.s(configurableProvider, string24, k3, str, aSN1ObjectIdentifier), StubApp.getString2(31876), configurableProvider, string24, aSN1ObjectIdentifier2), str, StubApp.getString2(31877)), str, aSN1ObjectIdentifier3);
            String string25 = StubApp.getString2(31878);
            a.y(a.o(a.o(a.o(s10, string25, configurableProvider, StubApp.getString2(31879), str), string25, configurableProvider, StubApp.getString2(31880), str), StubApp.getString2(31881), configurableProvider, StubApp.getString2(31882), str), StubApp.getString2(31883), configurableProvider, StubApp.getString2(31884));
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = UAObjectIdentifiers.dstu7624ecb_128;
            String string26 = StubApp.getString2(31885);
            String string27 = StubApp.getString2(30341);
            a.A(configurableProvider, str, string26, string27, aSN1ObjectIdentifier4);
            ASN1ObjectIdentifier aSN1ObjectIdentifier5 = UAObjectIdentifiers.dstu7624ecb_256;
            a.A(configurableProvider, str, StubApp.getString2(31886), string27, aSN1ObjectIdentifier5);
            ASN1ObjectIdentifier aSN1ObjectIdentifier6 = UAObjectIdentifiers.dstu7624ecb_512;
            configurableProvider.addAlgorithm(string27, aSN1ObjectIdentifier6, str + StubApp.getString2(31887));
            configurableProvider.addAlgorithm(string27, aSN1ObjectIdentifier3, AbstractC1482f.k(a.p(a.s(configurableProvider, string27, AbstractC1482f.k(new StringBuilder(), str, StubApp.getString2(31888)), str, aSN1ObjectIdentifier), StubApp.getString2(31889), configurableProvider, string27, aSN1ObjectIdentifier2), str, StubApp.getString2(31890)));
            ASN1ObjectIdentifier aSN1ObjectIdentifier7 = UAObjectIdentifiers.dstu7624ofb_128;
            a.A(configurableProvider, str, StubApp.getString2(31891), string27, aSN1ObjectIdentifier7);
            ASN1ObjectIdentifier aSN1ObjectIdentifier8 = UAObjectIdentifiers.dstu7624ofb_256;
            a.A(configurableProvider, str, StubApp.getString2(31892), string27, aSN1ObjectIdentifier8);
            ASN1ObjectIdentifier aSN1ObjectIdentifier9 = UAObjectIdentifiers.dstu7624ofb_512;
            a.A(configurableProvider, str, StubApp.getString2(31893), string27, aSN1ObjectIdentifier9);
            ASN1ObjectIdentifier aSN1ObjectIdentifier10 = UAObjectIdentifiers.dstu7624cfb_128;
            a.A(configurableProvider, str, StubApp.getString2(31894), string27, aSN1ObjectIdentifier10);
            ASN1ObjectIdentifier aSN1ObjectIdentifier11 = UAObjectIdentifiers.dstu7624cfb_256;
            a.A(configurableProvider, str, StubApp.getString2(31895), string27, aSN1ObjectIdentifier11);
            ASN1ObjectIdentifier aSN1ObjectIdentifier12 = UAObjectIdentifiers.dstu7624cfb_512;
            a.A(configurableProvider, str, StubApp.getString2(31896), string27, aSN1ObjectIdentifier12);
            ASN1ObjectIdentifier aSN1ObjectIdentifier13 = UAObjectIdentifiers.dstu7624ctr_128;
            a.A(configurableProvider, str, StubApp.getString2(31897), string27, aSN1ObjectIdentifier13);
            ASN1ObjectIdentifier aSN1ObjectIdentifier14 = UAObjectIdentifiers.dstu7624ctr_256;
            a.A(configurableProvider, str, StubApp.getString2(31898), string27, aSN1ObjectIdentifier14);
            ASN1ObjectIdentifier aSN1ObjectIdentifier15 = UAObjectIdentifiers.dstu7624ctr_512;
            a.A(configurableProvider, str, StubApp.getString2(31899), string27, aSN1ObjectIdentifier15);
            ASN1ObjectIdentifier aSN1ObjectIdentifier16 = UAObjectIdentifiers.dstu7624ccm_128;
            a.A(configurableProvider, str, StubApp.getString2(31900), string27, aSN1ObjectIdentifier16);
            ASN1ObjectIdentifier aSN1ObjectIdentifier17 = UAObjectIdentifiers.dstu7624ccm_256;
            a.A(configurableProvider, str, StubApp.getString2(31901), string27, aSN1ObjectIdentifier17);
            ASN1ObjectIdentifier aSN1ObjectIdentifier18 = UAObjectIdentifiers.dstu7624ccm_512;
            configurableProvider.addAlgorithm(string27, aSN1ObjectIdentifier18, str + StubApp.getString2(31902));
            a.x(new StringBuilder(), str, StubApp.getString2(31484), configurableProvider, StubApp.getString2(31903));
            String c10 = a.c(StubApp.getString2(31904), StubApp.getString2(31905), str, StubApp.getString2(31906), configurableProvider);
            String string28 = StubApp.getString2(31907);
            String string29 = StubApp.getString2(30221);
            StringBuilder r8 = a.r(configurableProvider, string28, c10, string29);
            ASN1ObjectIdentifier aSN1ObjectIdentifier19 = UAObjectIdentifiers.dstu7624kw_128;
            r8.append(aSN1ObjectIdentifier19.getId());
            String sb4 = r8.toString();
            String string210 = StubApp.getString2(31908);
            configurableProvider.addAlgorithm(sb4, string210);
            StringBuilder r10 = a.r(configurableProvider, StubApp.getString2(31911), a.c(StubApp.getString2(31909), string210, str, StubApp.getString2(31910), configurableProvider), string29);
            ASN1ObjectIdentifier aSN1ObjectIdentifier20 = UAObjectIdentifiers.dstu7624kw_256;
            r10.append(aSN1ObjectIdentifier20.getId());
            String sb5 = r10.toString();
            String string211 = StubApp.getString2(31912);
            configurableProvider.addAlgorithm(sb5, string211);
            StringBuilder r11 = a.r(configurableProvider, StubApp.getString2(31915), a.c(StubApp.getString2(31913), string211, str, StubApp.getString2(31914), configurableProvider), string29);
            ASN1ObjectIdentifier aSN1ObjectIdentifier21 = UAObjectIdentifiers.dstu7624kw_512;
            r11.append(aSN1ObjectIdentifier21.getId());
            String sb6 = r11.toString();
            String string212 = StubApp.getString2(31916);
            configurableProvider.addAlgorithm(sb6, string212);
            String c11 = a.c(StubApp.getString2(31918), a.c(StubApp.getString2(31917), string212, str, StubApp.getString2(31675), configurableProvider), str, StubApp.getString2(31919), configurableProvider);
            String string213 = StubApp.getString2(31920);
            String string214 = StubApp.getString2(31003);
            StringBuilder r12 = a.r(configurableProvider, string213, c11, string214);
            ASN1ObjectIdentifier aSN1ObjectIdentifier22 = UAObjectIdentifiers.dstu7624gmac_128;
            r12.append(aSN1ObjectIdentifier22.getId());
            configurableProvider.addAlgorithm(r12.toString(), StubApp.getString2(31921));
            configurableProvider.addAlgorithm(StubApp.getString2(31923), str + StubApp.getString2(31922));
            StringBuilder sb7 = new StringBuilder(string214);
            ASN1ObjectIdentifier aSN1ObjectIdentifier23 = UAObjectIdentifiers.dstu7624gmac_256;
            sb7.append(aSN1ObjectIdentifier23.getId());
            configurableProvider.addAlgorithm(sb7.toString(), StubApp.getString2(31924));
            configurableProvider.addAlgorithm(StubApp.getString2(31926), str + StubApp.getString2(31925));
            StringBuilder sb8 = new StringBuilder(string214);
            ASN1ObjectIdentifier aSN1ObjectIdentifier24 = UAObjectIdentifiers.dstu7624gmac_512;
            sb8.append(aSN1ObjectIdentifier24.getId());
            configurableProvider.addAlgorithm(sb8.toString(), StubApp.getString2(31927));
            StringBuilder sb9 = new StringBuilder();
            sb9.append(str);
            StringBuilder o5 = a.o(sb9, StubApp.getString2(31504), configurableProvider, StubApp.getString2(31928), str);
            String string215 = StubApp.getString2(31506);
            String string216 = StubApp.getString2(31512);
            StringBuilder p8 = a.p(o5, string215, configurableProvider, string216, aSN1ObjectIdentifier19);
            String string217 = StubApp.getString2(31510);
            StringBuilder s11 = a.s(configurableProvider, string216, AbstractC1482f.k(p8, str, string217), str, aSN1ObjectIdentifier20);
            String string218 = StubApp.getString2(31929);
            configurableProvider.addAlgorithm(string216, aSN1ObjectIdentifier24, AbstractC1482f.k(a.p(a.s(configurableProvider, string216, AbstractC1482f.k(a.p(a.s(configurableProvider, string216, AbstractC1482f.k(a.p(a.s(configurableProvider, string216, AbstractC1482f.k(a.p(a.s(configurableProvider, string216, AbstractC1482f.k(a.p(a.s(configurableProvider, string216, AbstractC1482f.k(a.p(a.s(configurableProvider, string216, AbstractC1482f.k(a.p(a.s(configurableProvider, string216, AbstractC1482f.k(a.p(a.s(configurableProvider, string216, AbstractC1482f.k(a.p(a.s(configurableProvider, string216, AbstractC1482f.k(a.p(a.s(configurableProvider, string216, AbstractC1482f.k(a.p(s11, string218, configurableProvider, string216, aSN1ObjectIdentifier21), str, string215), str, aSN1ObjectIdentifier4), string217, configurableProvider, string216, aSN1ObjectIdentifier5), str, string218), str, aSN1ObjectIdentifier6), string215, configurableProvider, string216, aSN1ObjectIdentifier), str, string217), str, aSN1ObjectIdentifier2), string218, configurableProvider, string216, aSN1ObjectIdentifier3), str, string215), str, aSN1ObjectIdentifier7), string217, configurableProvider, string216, aSN1ObjectIdentifier8), str, string218), str, aSN1ObjectIdentifier9), string215, configurableProvider, string216, aSN1ObjectIdentifier10), str, string217), str, aSN1ObjectIdentifier11), string218, configurableProvider, string216, aSN1ObjectIdentifier12), str, string215), str, aSN1ObjectIdentifier13), string217, configurableProvider, string216, aSN1ObjectIdentifier14), str, string218), str, aSN1ObjectIdentifier15), string215, configurableProvider, string216, aSN1ObjectIdentifier16), str, string217), str, aSN1ObjectIdentifier17), string218, configurableProvider, string216, aSN1ObjectIdentifier18), str, string215), str, aSN1ObjectIdentifier22), string217, configurableProvider, string216, aSN1ObjectIdentifier23), str, string218));
        }
    }

    public static class OFB128 extends BaseBlockCipher {
        public OFB128() {
            super(new BufferedBlockCipher(new OFBBlockCipher(new DSTU7624Engine(128), 128)), 128);
        }
    }

    public static class OFB256 extends BaseBlockCipher {
        public OFB256() {
            super(new BufferedBlockCipher(new OFBBlockCipher(new DSTU7624Engine(256), 256)), 256);
        }
    }

    public static class OFB512 extends BaseBlockCipher {
        public OFB512() {
            super(new BufferedBlockCipher(new OFBBlockCipher(new DSTU7624Engine(512), 512)), 512);
        }
    }

    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new DSTU7624WrapEngine(128));
        }
    }

    public static class Wrap128 extends BaseWrapCipher {
        public Wrap128() {
            super(new DSTU7624WrapEngine(128));
        }
    }

    public static class Wrap256 extends BaseWrapCipher {
        public Wrap256() {
            super(new DSTU7624WrapEngine(256));
        }
    }

    public static class Wrap512 extends BaseWrapCipher {
        public Wrap512() {
            super(new DSTU7624WrapEngine(512));
        }
    }

    private DSTU7624() {
    }
}
