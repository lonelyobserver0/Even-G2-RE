package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import E1.a;
import Xa.h;
import com.stub.StubApp;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.interfaces.DHKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.encodings.ISO9796d1Encoding;
import org.bouncycastle.crypto.encodings.OAEPEncoding;
import org.bouncycastle.crypto.encodings.PKCS1Encoding;
import org.bouncycastle.crypto.engines.ElGamalEngine;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi;
import org.bouncycastle.jcajce.provider.util.BadBlockException;
import org.bouncycastle.jcajce.provider.util.DigestFactory;
import org.bouncycastle.jce.interfaces.ElGamalKey;
import org.bouncycastle.util.Strings;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CipherSpi extends BaseCipherSpi {
    private BaseCipherSpi.ErasableOutputStream bOut = new BaseCipherSpi.ErasableOutputStream();
    private AsymmetricBlockCipher cipher;
    private AlgorithmParameters engineParams;
    private AlgorithmParameterSpec paramSpec;

    public static class NoPadding extends CipherSpi {
        public NoPadding() {
            super(new ElGamalEngine());
        }
    }

    public static class PKCS1v1_5Padding extends CipherSpi {
        public PKCS1v1_5Padding() {
            super(new PKCS1Encoding(new ElGamalEngine()));
        }
    }

    public CipherSpi(AsymmetricBlockCipher asymmetricBlockCipher) {
        this.cipher = asymmetricBlockCipher;
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
            this.cipher = new OAEPEncoding(new ElGamalEngine(), digest, ((PSource.PSpecified) oAEPParameterSpec.getPSource()).getValue());
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
        boolean z2 = this.cipher instanceof ElGamalEngine;
        String string2 = StubApp.getString2(30729);
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
        return this.cipher.getInputBlockSize();
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        BigInteger p8;
        if (key instanceof ElGamalKey) {
            p8 = ((ElGamalKey) key).getParameters().getP();
        } else {
            if (!(key instanceof DHKey)) {
                throw new IllegalArgumentException(StubApp.getString2(30731));
            }
            p8 = ((DHKey) key).getParams().getP();
        }
        return p8.bitLength();
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public int engineGetOutputSize(int i3) {
        return this.cipher.getOutputBlockSize();
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null && this.paramSpec != null) {
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance(StubApp.getString2("30365"));
                this.engineParams = createParametersInstance;
                createParametersInstance.init(this.paramSpec);
            } catch (Exception e10) {
                throw new RuntimeException(e10.toString());
            }
        }
        return this.engineParams;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i3, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException(StubApp.getString2(30732));
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        String upperCase = Strings.toUpperCase(str);
        if (!upperCase.equals(StubApp.getString2(207)) && !upperCase.equals(StubApp.getString2(30742))) {
            throw new NoSuchAlgorithmException(a.j(StubApp.getString2(30512), str));
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        String upperCase = Strings.toUpperCase(str);
        if (upperCase.equals(StubApp.getString2(30513))) {
            this.cipher = new ElGamalEngine();
            return;
        }
        if (upperCase.equals(StubApp.getString2(30743))) {
            this.cipher = new PKCS1Encoding(new ElGamalEngine());
            return;
        }
        if (upperCase.equals(StubApp.getString2(30744))) {
            this.cipher = new ISO9796d1Encoding(new ElGamalEngine());
            return;
        }
        if (upperCase.equals(StubApp.getString2(30745))) {
            initFromSpec(OAEPParameterSpec.DEFAULT);
            return;
        }
        boolean equals = upperCase.equals(StubApp.getString2(30746));
        String string2 = StubApp.getString2(30299);
        if (equals) {
            String string22 = StubApp.getString2(4894);
            initFromSpec(new OAEPParameterSpec(string22, string2, new MGF1ParameterSpec(string22), PSource.PSpecified.DEFAULT));
            return;
        }
        if (upperCase.equals(StubApp.getString2(30747))) {
            initFromSpec(OAEPParameterSpec.DEFAULT);
            return;
        }
        if (upperCase.equals(StubApp.getString2(30748))) {
            String string23 = StubApp.getString2(28501);
            initFromSpec(new OAEPParameterSpec(string23, string2, new MGF1ParameterSpec(string23), PSource.PSpecified.DEFAULT));
            return;
        }
        if (upperCase.equals(StubApp.getString2(30749))) {
            initFromSpec(new OAEPParameterSpec(StubApp.getString2(1488), string2, MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT));
            return;
        }
        if (upperCase.equals(StubApp.getString2(30750))) {
            initFromSpec(new OAEPParameterSpec(StubApp.getString2(23704), string2, MGF1ParameterSpec.SHA384, PSource.PSpecified.DEFAULT));
            return;
        }
        if (upperCase.equals(StubApp.getString2(30751))) {
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
                throw new NoSuchPaddingException(AbstractC1482f.g(str, StubApp.getString2(30756)));
            }
            String string27 = StubApp.getString2(28177);
            initFromSpec(new OAEPParameterSpec(string27, string2, new MGF1ParameterSpec(string27), PSource.PSpecified.DEFAULT));
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) {
        this.bOut.write(bArr, i3, i10);
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i3, int i10) throws IllegalBlockSizeException, BadPaddingException {
        if (bArr != null) {
            this.bOut.write(bArr, i3, i10);
        }
        boolean z2 = this.cipher instanceof ElGamalEngine;
        String string2 = StubApp.getString2(30729);
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
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i3, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        CipherParameters generatePrivateKeyParameter;
        AsymmetricBlockCipher asymmetricBlockCipher;
        if (key instanceof DHPublicKey) {
            generatePrivateKeyParameter = ElGamalUtil.generatePublicKeyParameter((PublicKey) key);
        } else {
            if (!(key instanceof DHPrivateKey)) {
                throw new InvalidKeyException(StubApp.getString2(30741));
            }
            generatePrivateKeyParameter = ElGamalUtil.generatePrivateKeyParameter((PrivateKey) key);
        }
        if (algorithmParameterSpec instanceof OAEPParameterSpec) {
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
            this.cipher = new OAEPEncoding(new ElGamalEngine(), digest, digest2, ((PSource.PSpecified) oAEPParameterSpec.getPSource()).getValue());
        } else if (algorithmParameterSpec != null) {
            throw new InvalidAlgorithmParameterException(StubApp.getString2(30740));
        }
        if (secureRandom != null) {
            generatePrivateKeyParameter = new ParametersWithRandom(generatePrivateKeyParameter, secureRandom);
        }
        boolean z2 = true;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        throw new InvalidParameterException(h.g(i3, StubApp.getString2(30738), StubApp.getString2(30739)));
                    }
                }
            }
            asymmetricBlockCipher = this.cipher;
            z2 = false;
            asymmetricBlockCipher.init(z2, generatePrivateKeyParameter);
        }
        asymmetricBlockCipher = this.cipher;
        asymmetricBlockCipher.init(z2, generatePrivateKeyParameter);
    }
}
