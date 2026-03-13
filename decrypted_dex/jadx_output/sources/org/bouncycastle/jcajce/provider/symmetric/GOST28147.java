package org.bouncycastle.jcajce.provider.symmetric;

import E1.a;
import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.GOST28147Parameters;
import org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.engines.CryptoProWrapEngine;
import org.bouncycastle.crypto.engines.GOST28147Engine;
import org.bouncycastle.crypto.engines.GOST28147WrapEngine;
import org.bouncycastle.crypto.macs.GOST28147Mac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.GCFBBlockCipher;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.jcajce.spec.GOST28147ParameterSpec;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class GOST28147 {
    private static Map<ASN1ObjectIdentifier, String> oidMappings = new HashMap();
    private static Map<String, ASN1ObjectIdentifier> nameMappings = new HashMap();

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        byte[] iv = new byte[8];
        byte[] sBox = GOST28147Engine.getSBox(StubApp.getString2(28627));

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            if (this.random == null) {
                this.random = CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(this.iv);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance(StubApp.getString2("28261"));
                createParametersInstance.init(new GOST28147ParameterSpec(this.sBox, this.iv));
                return createParametersInstance;
            } catch (Exception e10) {
                throw new RuntimeException(e10.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            if (!(algorithmParameterSpec instanceof GOST28147ParameterSpec)) {
                throw new InvalidAlgorithmParameterException(StubApp.getString2(31930));
            }
            this.sBox = ((GOST28147ParameterSpec) algorithmParameterSpec).getSBox();
        }
    }

    public static class AlgParams extends BaseAlgParams {
        private byte[] iv;
        private ASN1ObjectIdentifier sBox = CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_A_ParamSet;

        @Override // org.bouncycastle.jcajce.provider.symmetric.GOST28147.BaseAlgParams, java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                this.iv = ((IvParameterSpec) algorithmParameterSpec).getIV();
            } else {
                if (!(algorithmParameterSpec instanceof GOST28147ParameterSpec)) {
                    throw new InvalidParameterSpecException(StubApp.getString2(31931));
                }
                this.iv = ((GOST28147ParameterSpec) algorithmParameterSpec).getIV();
                try {
                    this.sBox = BaseAlgParams.getSBoxOID(((GOST28147ParameterSpec) algorithmParameterSpec).getSBox());
                } catch (IllegalArgumentException e10) {
                    throw new InvalidParameterSpecException(e10.getMessage());
                }
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return StubApp.getString2(31932);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.GOST28147.BaseAlgParams, org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.iv);
            }
            if (cls == GOST28147ParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return new GOST28147ParameterSpec(this.sBox, this.iv);
            }
            throw new InvalidParameterSpecException(StubApp.getString2(31455).concat(cls.getName()));
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.GOST28147.BaseAlgParams
        public byte[] localGetEncoded() throws IOException {
            return new GOST28147Parameters(this.iv, this.sBox).getEncoded();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.GOST28147.BaseAlgParams
        public void localInit(byte[] bArr) throws IOException {
            ASN1Primitive fromByteArray = ASN1Primitive.fromByteArray(bArr);
            if (fromByteArray instanceof ASN1OctetString) {
                this.iv = ASN1OctetString.getInstance(fromByteArray).getOctets();
            } else {
                if (!(fromByteArray instanceof ASN1Sequence)) {
                    throw new IOException(StubApp.getString2(31933));
                }
                GOST28147Parameters gOST28147Parameters = GOST28147Parameters.getInstance(fromByteArray);
                this.sBox = gOST28147Parameters.getEncryptionParamSet();
                this.iv = gOST28147Parameters.getIV();
            }
        }
    }

    public static abstract class BaseAlgParams extends BaseAlgorithmParameters {
        private byte[] iv;
        private ASN1ObjectIdentifier sBox = CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_A_ParamSet;

        public static ASN1ObjectIdentifier getSBoxOID(String str) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = str != null ? (ASN1ObjectIdentifier) GOST28147.nameMappings.get(Strings.toUpperCase(str)) : null;
            if (aSN1ObjectIdentifier != null) {
                return aSN1ObjectIdentifier;
            }
            throw new IllegalArgumentException(a.j(StubApp.getString2(31934), str));
        }

        @Override // java.security.AlgorithmParametersSpi
        public final byte[] engineGetEncoded() throws IOException {
            return engineGetEncoded(StubApp.getString2(30489));
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                this.iv = ((IvParameterSpec) algorithmParameterSpec).getIV();
            } else {
                if (!(algorithmParameterSpec instanceof GOST28147ParameterSpec)) {
                    throw new InvalidParameterSpecException(StubApp.getString2(31931));
                }
                this.iv = ((GOST28147ParameterSpec) algorithmParameterSpec).getIV();
                try {
                    this.sBox = getSBoxOID(((GOST28147ParameterSpec) algorithmParameterSpec).getSBox());
                } catch (IllegalArgumentException e10) {
                    throw new InvalidParameterSpecException(e10.getMessage());
                }
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.iv);
            }
            if (cls == GOST28147ParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return new GOST28147ParameterSpec(this.sBox, this.iv);
            }
            throw new InvalidParameterSpecException(StubApp.getString2(31455).concat(cls.getName()));
        }

        public byte[] localGetEncoded() throws IOException {
            return new GOST28147Parameters(this.iv, this.sBox).getEncoded();
        }

        public abstract void localInit(byte[] bArr) throws IOException;

        @Override // java.security.AlgorithmParametersSpi
        public final byte[] engineGetEncoded(String str) throws IOException {
            if (isASN1FormatString(str)) {
                return localGetEncoded();
            }
            throw new IOException(a.j(StubApp.getString2(31935), str));
        }

        @Override // java.security.AlgorithmParametersSpi
        public final void engineInit(byte[] bArr) throws IOException {
            engineInit(bArr, StubApp.getString2(30489));
        }

        @Override // java.security.AlgorithmParametersSpi
        public final void engineInit(byte[] bArr, String str) throws IOException {
            if (bArr == null) {
                throw new NullPointerException(StubApp.getString2(31937));
            }
            if (isASN1FormatString(str)) {
                try {
                    localInit(bArr);
                    return;
                } catch (IOException e10) {
                    throw e10;
                } catch (Exception e11) {
                    throw new IOException(u.r(e11, new StringBuilder(StubApp.getString2(31936))));
                }
            }
            throw new IOException(a.j(StubApp.getString2(31935), str));
        }

        public static ASN1ObjectIdentifier getSBoxOID(byte[] bArr) {
            return getSBoxOID(GOST28147Engine.getSBoxName(bArr));
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new CBCBlockCipher(new GOST28147Engine()), 64);
        }
    }

    public static class CryptoProWrap extends BaseWrapCipher {
        public CryptoProWrap() {
            super(new CryptoProWrapEngine());
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new GOST28147Engine());
        }
    }

    public static class GCFB extends BaseBlockCipher {
        public GCFB() {
            super(new BufferedBlockCipher(new GCFBBlockCipher(new GOST28147Engine())), 64);
        }
    }

    public static class GostWrap extends BaseWrapCipher {
        public GostWrap() {
            super(new GOST28147WrapEngine());
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            this(256);
        }

        public KeyGen(int i3) {
            super(StubApp.getString2(28261), i3, new CipherKeyGenerator());
        }
    }

    public static class Mac extends BaseMac {
        public Mac() {
            super(new GOST28147Mac());
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = GOST28147.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            org.bouncycastle.asn1.a.x(sb2, str, StubApp.getString2(31476), configurableProvider, StubApp.getString2(31938));
            String string2 = StubApp.getString2(31939);
            String string22 = StubApp.getString2(28261);
            configurableProvider.addAlgorithm(string2, string22);
            configurableProvider.addAlgorithm(StubApp.getString2(31940), string22);
            String string23 = StubApp.getString2(31941);
            StringBuilder sb3 = new StringBuilder(string23);
            ASN1ObjectIdentifier aSN1ObjectIdentifier = CryptoProObjectIdentifiers.gostR28147_gcfb;
            sb3.append(aSN1ObjectIdentifier);
            configurableProvider.addAlgorithm(sb3.toString(), str + StubApp.getString2(31942));
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            org.bouncycastle.asn1.a.y(sb4, StubApp.getString2(31504), configurableProvider, StubApp.getString2(31943));
            configurableProvider.addAlgorithm(StubApp.getString2(31944), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(31945), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(31004) + aSN1ObjectIdentifier, string22);
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str);
            StringBuilder o5 = org.bouncycastle.asn1.a.o(sb5, StubApp.getString2(31459), configurableProvider, StubApp.getString2(31946), str);
            o5.append(StubApp.getString2(31469));
            configurableProvider.addAlgorithm(StubApp.getString2(31947), o5.toString());
            StringBuilder q10 = org.bouncycastle.asn1.a.q(org.bouncycastle.asn1.a.q(new StringBuilder(StubApp.getString2(31464)), aSN1ObjectIdentifier, configurableProvider, string22, StubApp.getString2(31474)), aSN1ObjectIdentifier, configurableProvider, string22, string23);
            q10.append(CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_KeyWrap);
            StringBuilder m4 = org.bouncycastle.asn1.a.m(str, StubApp.getString2(31948), q10.toString(), string23, configurableProvider);
            m4.append(CryptoProObjectIdentifiers.id_Gost28147_89_None_KeyWrap);
            configurableProvider.addAlgorithm(m4.toString(), str + StubApp.getString2(31949));
            StringBuilder sb6 = new StringBuilder();
            sb6.append(str);
            org.bouncycastle.asn1.a.y(sb6, StubApp.getString2(31950), configurableProvider, StubApp.getString2(31951));
            configurableProvider.addAlgorithm(StubApp.getString2(31952), StubApp.getString2(31953));
        }
    }

    static {
        oidMappings.put(CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_TestParamSet, StubApp.getString2(28626));
        Map<ASN1ObjectIdentifier, String> map = oidMappings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_A_ParamSet;
        String string2 = StubApp.getString2(28627);
        map.put(aSN1ObjectIdentifier, string2);
        Map<ASN1ObjectIdentifier, String> map2 = oidMappings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_B_ParamSet;
        String string22 = StubApp.getString2(28628);
        map2.put(aSN1ObjectIdentifier2, string22);
        Map<ASN1ObjectIdentifier, String> map3 = oidMappings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_C_ParamSet;
        String string23 = StubApp.getString2(28629);
        map3.put(aSN1ObjectIdentifier3, string23);
        Map<ASN1ObjectIdentifier, String> map4 = oidMappings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_D_ParamSet;
        String string24 = StubApp.getString2(28630);
        map4.put(aSN1ObjectIdentifier4, string24);
        Map<ASN1ObjectIdentifier, String> map5 = oidMappings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = RosstandartObjectIdentifiers.id_tc26_gost_28147_param_Z;
        String string25 = StubApp.getString2(31954);
        map5.put(aSN1ObjectIdentifier5, string25);
        nameMappings.put(string2, aSN1ObjectIdentifier);
        nameMappings.put(string22, aSN1ObjectIdentifier2);
        nameMappings.put(string23, aSN1ObjectIdentifier3);
        nameMappings.put(string24, aSN1ObjectIdentifier4);
        nameMappings.put(string25, aSN1ObjectIdentifier5);
    }

    private GOST28147() {
    }
}
