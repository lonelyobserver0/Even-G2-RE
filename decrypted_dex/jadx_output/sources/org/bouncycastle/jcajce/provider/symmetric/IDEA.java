package org.bouncycastle.jcajce.provider.symmetric;

import com.stub.StubApp;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.misc.IDEACBCPar;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.engines.IDEAEngine;
import org.bouncycastle.crypto.macs.CBCBlockCipherMac;
import org.bouncycastle.crypto.macs.CFBBlockCipherMac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class IDEA {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[8];
            if (this.random == null) {
                this.random = CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance(StubApp.getString2("28667"));
                createParametersInstance.init(new IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (Exception e10) {
                throw new RuntimeException(e10.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException(StubApp.getString2(31986));
        }
    }

    public static class AlgParams extends BaseAlgorithmParameters {
        private byte[] iv;

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() throws IOException {
            return engineGetEncoded(StubApp.getString2(30489));
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (!(algorithmParameterSpec instanceof IvParameterSpec)) {
                throw new InvalidParameterSpecException(StubApp.getString2(31931));
            }
            this.iv = ((IvParameterSpec) algorithmParameterSpec).getIV();
        }

        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return StubApp.getString2(31987);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == IvParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return new IvParameterSpec(this.iv);
            }
            throw new InvalidParameterSpecException(StubApp.getString2(31988));
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) throws IOException {
            boolean isASN1FormatString = isASN1FormatString(str);
            String string2 = StubApp.getString2(31343);
            if (isASN1FormatString) {
                return new IDEACBCPar(engineGetEncoded(string2)).getEncoded();
            }
            if (!str.equals(string2)) {
                return null;
            }
            byte[] bArr = this.iv;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) throws IOException {
            byte[] bArr2 = new byte[bArr.length];
            this.iv = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
            if (str.equals(StubApp.getString2(31343))) {
                engineInit(bArr);
            } else {
                if (!str.equals(StubApp.getString2(30489))) {
                    throw new IOException(StubApp.getString2(31686));
                }
                engineInit(IDEACBCPar.getInstance(bArr).getIV());
            }
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new CBCBlockCipher(new IDEAEngine()), 64);
        }
    }

    public static class CFB8Mac extends BaseMac {
        public CFB8Mac() {
            super(new CFBBlockCipherMac(new IDEAEngine()));
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new IDEAEngine());
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super(StubApp.getString2(28667), 128, new CipherKeyGenerator());
        }
    }

    public static class Mac extends BaseMac {
        public Mac() {
            super(new CBCBlockCipherMac(new IDEAEngine()));
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = IDEA.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            String string2 = StubApp.getString2(31469);
            StringBuilder n10 = a.n(a.n(sb2, str, string2, configurableProvider, StubApp.getString2(31989)), str, string2, configurableProvider, StubApp.getString2(31990));
            String string22 = StubApp.getString2(31459);
            a.x(a.n(n10, str, string22, configurableProvider, StubApp.getString2(31991)), str, string22, configurableProvider, StubApp.getString2(31992));
            String string23 = StubApp.getString2(31993);
            String string24 = StubApp.getString2(31601);
            configurableProvider.addAlgorithm(string23, string24);
            configurableProvider.addAlgorithm(StubApp.getString2(31994), string24);
            a.x(new StringBuilder(), str, StubApp.getString2(31476), configurableProvider, StubApp.getString2(31995));
            ASN1ObjectIdentifier aSN1ObjectIdentifier = MiscObjectIdentifiers.as_sys_sec_alg_ideaCBC;
            configurableProvider.addAlgorithm(StubApp.getString2(30341), aSN1ObjectIdentifier, str + StubApp.getString2(31480));
            StringBuilder n11 = a.n(new StringBuilder(), str, StubApp.getString2(31996), configurableProvider, StubApp.getString2(31997));
            String string25 = StubApp.getString2(31504);
            a.y(a.o(a.s(configurableProvider, StubApp.getString2(31512), AbstractC1482f.k(a.n(n11, str, string25, configurableProvider, StubApp.getString2(31998)), str, string25), str, aSN1ObjectIdentifier), StubApp.getString2(31999), configurableProvider, StubApp.getString2(32000), str), StubApp.getString2(31950), configurableProvider, StubApp.getString2(32001));
            configurableProvider.addAlgorithm(StubApp.getString2(32005), a.c(StubApp.getString2(32002), StubApp.getString2(32003), str, StubApp.getString2(32004), configurableProvider));
            configurableProvider.addAlgorithm(StubApp.getString2(32006), StubApp.getString2(32007));
        }
    }

    public static class PBEWithSHAAndIDEA extends BaseBlockCipher {
        public PBEWithSHAAndIDEA() {
            super(new CBCBlockCipher(new IDEAEngine()));
        }
    }

    public static class PBEWithSHAAndIDEAKeyGen extends PBESecretKeyFactory {
        public PBEWithSHAAndIDEAKeyGen() {
            super(StubApp.getString2(32008), null, true, 2, 1, 128, 64);
        }
    }

    private IDEA() {
    }
}
