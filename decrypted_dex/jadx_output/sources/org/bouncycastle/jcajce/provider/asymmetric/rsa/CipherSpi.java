package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import E1.a;
import Xa.h;
import com.stub.StubApp;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.interfaces.RSAKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.encodings.ISO9796d1Encoding;
import org.bouncycastle.crypto.encodings.OAEPEncoding;
import org.bouncycastle.crypto.encodings.PKCS1Encoding;
import org.bouncycastle.crypto.engines.RSABlindedEngine;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi;
import org.bouncycastle.jcajce.provider.util.BadBlockException;
import org.bouncycastle.jcajce.provider.util.DigestFactory;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.util.Strings;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CipherSpi extends BaseCipherSpi {
    private BaseCipherSpi.ErasableOutputStream bOut;
    private AsymmetricBlockCipher cipher;
    private AlgorithmParameters engineParams;
    private final JcaJceHelper helper;
    private AlgorithmParameterSpec paramSpec;
    private boolean privateKeyOnly;
    private boolean publicKeyOnly;

    public static class ISO9796d1Padding extends CipherSpi {
        public ISO9796d1Padding() {
            super(new ISO9796d1Encoding(new RSABlindedEngine()));
        }
    }

    public static class NoPadding extends CipherSpi {
        public NoPadding() {
            super(new RSABlindedEngine());
        }
    }

    public static class OAEPPadding extends CipherSpi {
        public OAEPPadding() {
            super(OAEPParameterSpec.DEFAULT);
        }
    }

    public static class PKCS1v1_5Padding extends CipherSpi {
        public PKCS1v1_5Padding() {
            super(new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class PKCS1v1_5Padding_PrivateOnly extends CipherSpi {
        public PKCS1v1_5Padding_PrivateOnly() {
            super(false, true, new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class PKCS1v1_5Padding_PublicOnly extends CipherSpi {
        public PKCS1v1_5Padding_PublicOnly() {
            super(true, false, new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public CipherSpi(OAEPParameterSpec oAEPParameterSpec) {
        this.helper = new BCJcaJceHelper();
        this.publicKeyOnly = false;
        this.privateKeyOnly = false;
        this.bOut = new BaseCipherSpi.ErasableOutputStream();
        try {
            initFromSpec(oAEPParameterSpec);
        } catch (NoSuchPaddingException e10) {
            throw new IllegalArgumentException(e10.getMessage());
        }
    }

    private byte[] getOutput() throws BadPaddingException {
        String string2 = StubApp.getString2(30727);
        try {
            try {
                try {
                    return this.cipher.processBlock(this.bOut.getBuf(), 0, this.bOut.size());
                } catch (ArrayIndexOutOfBoundsException e10) {
                    throw new BadBlockException(string2, e10);
                }
            } catch (InvalidCipherTextException e11) {
                throw new BadBlockException(string2, e11);
            }
        } finally {
            this.bOut.erase();
        }
    }

    private void initFromSpec(OAEPParameterSpec oAEPParameterSpec) throws NoSuchPaddingException {
        MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters();
        Digest digest = DigestFactory.getDigest(mGF1ParameterSpec.getDigestAlgorithm());
        if (digest != null) {
            this.cipher = new OAEPEncoding(new RSABlindedEngine(), digest, ((PSource.PSpecified) oAEPParameterSpec.getPSource()).getValue());
            this.paramSpec = oAEPParameterSpec;
        } else {
            throw new NoSuchPaddingException(StubApp.getString2(30728) + mGF1ParameterSpec.getDigestAlgorithm());
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) throws IllegalBlockSizeException, BadPaddingException, ShortBufferException {
        if (engineGetOutputSize(i10) + i11 > bArr2.length) {
            throw new ShortBufferException(StubApp.getString2(30730));
        }
        if (bArr != null) {
            this.bOut.write(bArr, i3, i10);
        }
        boolean z2 = this.cipher instanceof RSABlindedEngine;
        String string2 = StubApp.getString2(30797);
        if (z2) {
            if (this.bOut.size() > this.cipher.getInputBlockSize() + 1) {
                throw new ArrayIndexOutOfBoundsException(string2);
            }
        } else if (this.bOut.size() > this.cipher.getInputBlockSize()) {
            throw new ArrayIndexOutOfBoundsException(string2);
        }
        byte[] output = getOutput();
        for (int i12 = 0; i12 != output.length; i12++) {
            bArr2[i11 + i12] = output[i12];
        }
        return output.length;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        try {
            return this.cipher.getInputBlockSize();
        } catch (NullPointerException unused) {
            throw new IllegalStateException(StubApp.getString2(30798));
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        RSAKey rSAKey;
        if (key instanceof RSAPrivateKey) {
            rSAKey = (RSAPrivateKey) key;
        } else {
            if (!(key instanceof RSAPublicKey)) {
                throw new IllegalArgumentException(StubApp.getString2(30799));
            }
            rSAKey = (RSAPublicKey) key;
        }
        return rSAKey.getModulus().bitLength();
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public int engineGetOutputSize(int i3) {
        try {
            return this.cipher.getOutputBlockSize();
        } catch (NullPointerException unused) {
            throw new IllegalStateException(StubApp.getString2(30798));
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null && this.paramSpec != null) {
            try {
                AlgorithmParameters createAlgorithmParameters = this.helper.createAlgorithmParameters(StubApp.getString2("30365"));
                this.engineParams = createAlgorithmParameters;
                createAlgorithmParameters.init(this.paramSpec);
            } catch (Exception e10) {
                throw new RuntimeException(e10.toString());
            }
        }
        return this.engineParams;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i3, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec parameterSpec;
        if (algorithmParameters != null) {
            try {
                parameterSpec = algorithmParameters.getParameterSpec(OAEPParameterSpec.class);
            } catch (InvalidParameterSpecException e10) {
                throw new InvalidAlgorithmParameterException(StubApp.getString2(30503) + e10.toString(), e10);
            }
        } else {
            parameterSpec = null;
        }
        this.engineParams = algorithmParameters;
        engineInit(i3, key, parameterSpec, secureRandom);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        String upperCase = Strings.toUpperCase(str);
        if (upperCase.equals(StubApp.getString2(207)) || upperCase.equals(StubApp.getString2(30742))) {
            return;
        }
        if (upperCase.equals(StubApp.getString2(878))) {
            this.privateKeyOnly = true;
            this.publicKeyOnly = false;
        } else {
            if (!upperCase.equals(StubApp.getString2(4967))) {
                throw new NoSuchAlgorithmException(a.j(StubApp.getString2(30512), str));
            }
            this.privateKeyOnly = false;
            this.publicKeyOnly = true;
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        String upperCase = Strings.toUpperCase(str);
        if (upperCase.equals(StubApp.getString2(30513))) {
            this.cipher = new RSABlindedEngine();
            return;
        }
        if (upperCase.equals(StubApp.getString2(30743))) {
            this.cipher = new PKCS1Encoding(new RSABlindedEngine());
            return;
        }
        if (upperCase.equals(StubApp.getString2(30744))) {
            this.cipher = new ISO9796d1Encoding(new RSABlindedEngine());
            return;
        }
        boolean equals = upperCase.equals(StubApp.getString2(30746));
        String string2 = StubApp.getString2(30299);
        if (equals) {
            String string22 = StubApp.getString2(4894);
            initFromSpec(new OAEPParameterSpec(string22, string2, new MGF1ParameterSpec(string22), PSource.PSpecified.DEFAULT));
            return;
        }
        if (upperCase.equals(StubApp.getString2(30745))) {
            initFromSpec(OAEPParameterSpec.DEFAULT);
            return;
        }
        if (upperCase.equals(StubApp.getString2(30747)) || upperCase.equals(StubApp.getString2(30805))) {
            initFromSpec(OAEPParameterSpec.DEFAULT);
            return;
        }
        if (upperCase.equals(StubApp.getString2(30748)) || upperCase.equals(StubApp.getString2(30806))) {
            String string23 = StubApp.getString2(28501);
            initFromSpec(new OAEPParameterSpec(string23, string2, new MGF1ParameterSpec(string23), PSource.PSpecified.DEFAULT));
            return;
        }
        if (upperCase.equals(StubApp.getString2(30749)) || upperCase.equals(StubApp.getString2(30807))) {
            initFromSpec(new OAEPParameterSpec(StubApp.getString2(1488), string2, MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT));
            return;
        }
        if (upperCase.equals(StubApp.getString2(30750)) || upperCase.equals(StubApp.getString2(30808))) {
            initFromSpec(new OAEPParameterSpec(StubApp.getString2(23704), string2, MGF1ParameterSpec.SHA384, PSource.PSpecified.DEFAULT));
            return;
        }
        if (upperCase.equals(StubApp.getString2(30751)) || upperCase.equals(StubApp.getString2(30809))) {
            initFromSpec(new OAEPParameterSpec(StubApp.getString2(23705), string2, MGF1ParameterSpec.SHA512, PSource.PSpecified.DEFAULT));
            return;
        }
        if (upperCase.equals(StubApp.getString2(30752))) {
            String string24 = StubApp.getString2(28174);
            initFromSpec(new OAEPParameterSpec(string24, string2, new MGF1ParameterSpec(string24), PSource.PSpecified.DEFAULT));
            return;
        }
        if (upperCase.equals(StubApp.getString2(30753))) {
            String string25 = StubApp.getString2(28175);
            initFromSpec(new OAEPParameterSpec(string25, string2, new MGF1ParameterSpec(string25), PSource.PSpecified.DEFAULT));
        } else if (upperCase.equals(StubApp.getString2(30754))) {
            String string26 = StubApp.getString2(28176);
            initFromSpec(new OAEPParameterSpec(string26, string2, new MGF1ParameterSpec(string26), PSource.PSpecified.DEFAULT));
        } else {
            if (!upperCase.equals(StubApp.getString2(30755))) {
                throw new NoSuchPaddingException(AbstractC1482f.g(str, StubApp.getString2(30810)));
            }
            String string27 = StubApp.getString2(28177);
            initFromSpec(new OAEPParameterSpec(string27, string2, new MGF1ParameterSpec(string27), PSource.PSpecified.DEFAULT));
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) {
        this.bOut.write(bArr, i3, i10);
        boolean z2 = this.cipher instanceof RSABlindedEngine;
        String string2 = StubApp.getString2(30797);
        if (z2) {
            if (this.bOut.size() <= this.cipher.getInputBlockSize() + 1) {
                return 0;
            }
            throw new ArrayIndexOutOfBoundsException(string2);
        }
        if (this.bOut.size() <= this.cipher.getInputBlockSize()) {
            return 0;
        }
        throw new ArrayIndexOutOfBoundsException(string2);
    }

    public CipherSpi(AsymmetricBlockCipher asymmetricBlockCipher) {
        this.helper = new BCJcaJceHelper();
        this.publicKeyOnly = false;
        this.privateKeyOnly = false;
        this.bOut = new BaseCipherSpi.ErasableOutputStream();
        this.cipher = asymmetricBlockCipher;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i3, int i10) throws IllegalBlockSizeException, BadPaddingException {
        if (bArr != null) {
            this.bOut.write(bArr, i3, i10);
        }
        boolean z2 = this.cipher instanceof RSABlindedEngine;
        String string2 = StubApp.getString2(30797);
        if (z2) {
            if (this.bOut.size() > this.cipher.getInputBlockSize() + 1) {
                throw new ArrayIndexOutOfBoundsException(string2);
            }
        } else if (this.bOut.size() > this.cipher.getInputBlockSize()) {
            throw new ArrayIndexOutOfBoundsException(string2);
        }
        return getOutput();
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i3, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i3, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e10) {
            throw new InvalidKeyException(StubApp.getString2(30733) + e10.toString(), e10);
        }
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i3, int i10) {
        this.bOut.write(bArr, i3, i10);
        boolean z2 = this.cipher instanceof RSABlindedEngine;
        String string2 = StubApp.getString2(30797);
        if (z2) {
            if (this.bOut.size() <= this.cipher.getInputBlockSize() + 1) {
                return null;
            }
            throw new ArrayIndexOutOfBoundsException(string2);
        }
        if (this.bOut.size() <= this.cipher.getInputBlockSize()) {
            return null;
        }
        throw new ArrayIndexOutOfBoundsException(string2);
    }

    public CipherSpi(boolean z2, boolean z10, AsymmetricBlockCipher asymmetricBlockCipher) {
        this.helper = new BCJcaJceHelper();
        this.publicKeyOnly = false;
        this.privateKeyOnly = false;
        this.bOut = new BaseCipherSpi.ErasableOutputStream();
        this.publicKeyOnly = z2;
        this.privateKeyOnly = z10;
        this.cipher = asymmetricBlockCipher;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [org.bouncycastle.crypto.params.ParametersWithRandom] */
    /* JADX WARN: Type inference failed for: r8v29, types: [org.bouncycastle.crypto.params.ParametersWithRandom] */
    /* JADX WARN: Type inference failed for: r8v30, types: [org.bouncycastle.crypto.params.ParametersWithRandom] */
    @Override // javax.crypto.CipherSpi
    public void engineInit(int i3, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        RSAKeyParameters generatePrivateKeyParameter;
        if (algorithmParameterSpec != null && !(algorithmParameterSpec instanceof OAEPParameterSpec)) {
            throw new InvalidAlgorithmParameterException(StubApp.getString2(30800).concat(algorithmParameterSpec.getClass().getName()));
        }
        if (key instanceof RSAPublicKey) {
            if (this.privateKeyOnly && i3 == 1) {
                throw new InvalidKeyException(StubApp.getString2(30801));
            }
            generatePrivateKeyParameter = RSAUtil.generatePublicKeyParameter((RSAPublicKey) key);
        } else {
            if (!(key instanceof RSAPrivateKey)) {
                throw new InvalidKeyException(StubApp.getString2(30804));
            }
            if (this.publicKeyOnly && i3 == 1) {
                throw new InvalidKeyException(StubApp.getString2(30802));
            }
            generatePrivateKeyParameter = RSAUtil.generatePrivateKeyParameter((RSAPrivateKey) key);
        }
        if (algorithmParameterSpec != null) {
            OAEPParameterSpec oAEPParameterSpec = (OAEPParameterSpec) algorithmParameterSpec;
            this.paramSpec = algorithmParameterSpec;
            if (!oAEPParameterSpec.getMGFAlgorithm().equalsIgnoreCase(StubApp.getString2(30299)) && !oAEPParameterSpec.getMGFAlgorithm().equals(PKCSObjectIdentifiers.id_mgf1.getId())) {
                throw new InvalidAlgorithmParameterException(StubApp.getString2(30734));
            }
            if (!(oAEPParameterSpec.getMGFParameters() instanceof MGF1ParameterSpec)) {
                throw new InvalidAlgorithmParameterException(StubApp.getString2(30737));
            }
            Digest digest = DigestFactory.getDigest(oAEPParameterSpec.getDigestAlgorithm());
            if (digest == null) {
                throw new InvalidAlgorithmParameterException(StubApp.getString2(30736) + oAEPParameterSpec.getDigestAlgorithm());
            }
            MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters();
            Digest digest2 = DigestFactory.getDigest(mGF1ParameterSpec.getDigestAlgorithm());
            if (digest2 == null) {
                throw new InvalidAlgorithmParameterException(StubApp.getString2(30735) + mGF1ParameterSpec.getDigestAlgorithm());
            }
            this.cipher = new OAEPEncoding(new RSABlindedEngine(), digest, digest2, ((PSource.PSpecified) oAEPParameterSpec.getPSource()).getValue());
        }
        if (!(this.cipher instanceof RSABlindedEngine)) {
            generatePrivateKeyParameter = secureRandom != null ? new ParametersWithRandom(generatePrivateKeyParameter, secureRandom) : new ParametersWithRandom(generatePrivateKeyParameter, CryptoServicesRegistrar.getSecureRandom());
        }
        this.bOut.reset();
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        throw new InvalidParameterException(h.g(i3, StubApp.getString2(30738), StubApp.getString2(30803)));
                    }
                }
            }
            this.cipher.init(false, generatePrivateKeyParameter);
            return;
        }
        this.cipher.init(true, generatePrivateKeyParameter);
    }
}
