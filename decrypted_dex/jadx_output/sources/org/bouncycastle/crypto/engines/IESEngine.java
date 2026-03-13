package org.bouncycastle.crypto.engines;

import Xa.h;
import com.stub.StubApp;
import i2.u;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.bouncycastle.crypto.BasicAgreement;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.EphemeralKeyPair;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.KeyParser;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.generators.EphemeralKeyPairGenerator;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.IESParameters;
import org.bouncycastle.crypto.params.IESWithCipherParameters;
import org.bouncycastle.crypto.params.KDFParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class IESEngine {
    private byte[] IV;

    /* renamed from: V, reason: collision with root package name */
    byte[] f18948V;
    BasicAgreement agree;
    BufferedBlockCipher cipher;
    boolean forEncryption;
    DerivationFunction kdf;
    private EphemeralKeyPairGenerator keyPairGenerator;
    private KeyParser keyParser;
    Mac mac;
    byte[] macBuf;
    IESParameters param;
    CipherParameters privParam;
    CipherParameters pubParam;

    public IESEngine(BasicAgreement basicAgreement, DerivationFunction derivationFunction, Mac mac) {
        this.agree = basicAgreement;
        this.kdf = derivationFunction;
        this.mac = mac;
        this.macBuf = new byte[mac.getMacSize()];
        this.cipher = null;
    }

    private byte[] decryptBlock(byte[] bArr, int i3, int i10) throws InvalidCipherTextException {
        byte[] bArr2;
        byte[] bArr3;
        int processBytes;
        byte[] bArr4;
        if (i10 < this.mac.getMacSize() + this.f18948V.length) {
            throw new InvalidCipherTextException(StubApp.getString2(28670));
        }
        if (this.cipher == null) {
            int length = (i10 - this.f18948V.length) - this.mac.getMacSize();
            byte[] bArr5 = new byte[length];
            int macKeySize = this.param.getMacKeySize() / 8;
            bArr2 = new byte[macKeySize];
            int i11 = length + macKeySize;
            byte[] bArr6 = new byte[i11];
            this.kdf.generateBytes(bArr6, 0, i11);
            if (this.f18948V.length != 0) {
                System.arraycopy(bArr6, 0, bArr2, 0, macKeySize);
                System.arraycopy(bArr6, macKeySize, bArr5, 0, length);
            } else {
                System.arraycopy(bArr6, 0, bArr5, 0, length);
                System.arraycopy(bArr6, length, bArr2, 0, macKeySize);
            }
            bArr4 = new byte[length];
            for (int i12 = 0; i12 != length; i12++) {
                bArr4[i12] = (byte) (bArr[(this.f18948V.length + i3) + i12] ^ bArr5[i12]);
            }
            bArr3 = bArr;
            processBytes = 0;
        } else {
            int cipherKeySize = ((IESWithCipherParameters) this.param).getCipherKeySize() / 8;
            byte[] bArr7 = new byte[cipherKeySize];
            int macKeySize2 = this.param.getMacKeySize() / 8;
            bArr2 = new byte[macKeySize2];
            int i13 = cipherKeySize + macKeySize2;
            byte[] bArr8 = new byte[i13];
            this.kdf.generateBytes(bArr8, 0, i13);
            System.arraycopy(bArr8, 0, bArr7, 0, cipherKeySize);
            System.arraycopy(bArr8, cipherKeySize, bArr2, 0, macKeySize2);
            CipherParameters keyParameter = new KeyParameter(bArr7);
            byte[] bArr9 = this.IV;
            if (bArr9 != null) {
                keyParameter = new ParametersWithIV(keyParameter, bArr9);
            }
            this.cipher.init(false, keyParameter);
            byte[] bArr10 = new byte[this.cipher.getOutputSize((i10 - this.f18948V.length) - this.mac.getMacSize())];
            BufferedBlockCipher bufferedBlockCipher = this.cipher;
            byte[] bArr11 = this.f18948V;
            bArr3 = bArr;
            processBytes = bufferedBlockCipher.processBytes(bArr3, i3 + bArr11.length, (i10 - bArr11.length) - this.mac.getMacSize(), bArr10, 0);
            bArr4 = bArr10;
        }
        byte[] encodingV = this.param.getEncodingV();
        byte[] lengthTag = this.f18948V.length != 0 ? getLengthTag(encodingV) : null;
        int i14 = i3 + i10;
        byte[] copyOfRange = Arrays.copyOfRange(bArr3, i14 - this.mac.getMacSize(), i14);
        int length2 = copyOfRange.length;
        byte[] bArr12 = new byte[length2];
        this.mac.init(new KeyParameter(bArr2));
        Mac mac = this.mac;
        byte[] bArr13 = this.f18948V;
        mac.update(bArr3, i3 + bArr13.length, (i10 - bArr13.length) - length2);
        if (encodingV != null) {
            this.mac.update(encodingV, 0, encodingV.length);
        }
        if (this.f18948V.length != 0) {
            this.mac.update(lengthTag, 0, lengthTag.length);
        }
        this.mac.doFinal(bArr12, 0);
        if (!Arrays.constantTimeAreEqual(copyOfRange, bArr12)) {
            throw new InvalidCipherTextException(StubApp.getString2(28623));
        }
        BufferedBlockCipher bufferedBlockCipher2 = this.cipher;
        return bufferedBlockCipher2 == null ? bArr4 : Arrays.copyOfRange(bArr4, 0, bufferedBlockCipher2.doFinal(bArr4, processBytes) + processBytes);
    }

    private byte[] encryptBlock(byte[] bArr, int i3, int i10) throws InvalidCipherTextException {
        BufferedBlockCipher bufferedBlockCipher;
        CipherParameters keyParameter;
        byte[] bArr2;
        byte[] bArr3;
        if (this.cipher == null) {
            byte[] bArr4 = new byte[i10];
            int macKeySize = this.param.getMacKeySize() / 8;
            bArr2 = new byte[macKeySize];
            int i11 = i10 + macKeySize;
            byte[] bArr5 = new byte[i11];
            this.kdf.generateBytes(bArr5, 0, i11);
            if (this.f18948V.length != 0) {
                System.arraycopy(bArr5, 0, bArr2, 0, macKeySize);
                System.arraycopy(bArr5, macKeySize, bArr4, 0, i10);
            } else {
                System.arraycopy(bArr5, 0, bArr4, 0, i10);
                System.arraycopy(bArr5, i10, bArr2, 0, macKeySize);
            }
            bArr3 = new byte[i10];
            for (int i12 = 0; i12 != i10; i12++) {
                bArr3[i12] = (byte) (bArr[i3 + i12] ^ bArr4[i12]);
            }
        } else {
            int cipherKeySize = ((IESWithCipherParameters) this.param).getCipherKeySize() / 8;
            byte[] bArr6 = new byte[cipherKeySize];
            int macKeySize2 = this.param.getMacKeySize() / 8;
            byte[] bArr7 = new byte[macKeySize2];
            int i13 = cipherKeySize + macKeySize2;
            byte[] bArr8 = new byte[i13];
            this.kdf.generateBytes(bArr8, 0, i13);
            System.arraycopy(bArr8, 0, bArr6, 0, cipherKeySize);
            System.arraycopy(bArr8, cipherKeySize, bArr7, 0, macKeySize2);
            if (this.IV != null) {
                bufferedBlockCipher = this.cipher;
                keyParameter = new ParametersWithIV(new KeyParameter(bArr6), this.IV);
            } else {
                bufferedBlockCipher = this.cipher;
                keyParameter = new KeyParameter(bArr6);
            }
            bufferedBlockCipher.init(true, keyParameter);
            byte[] bArr9 = new byte[this.cipher.getOutputSize(i10)];
            int processBytes = this.cipher.processBytes(bArr, i3, i10, bArr9, 0);
            i10 = this.cipher.doFinal(bArr9, processBytes) + processBytes;
            bArr2 = bArr7;
            bArr3 = bArr9;
        }
        byte[] encodingV = this.param.getEncodingV();
        byte[] lengthTag = this.f18948V.length != 0 ? getLengthTag(encodingV) : null;
        int macSize = this.mac.getMacSize();
        byte[] bArr10 = new byte[macSize];
        this.mac.init(new KeyParameter(bArr2));
        this.mac.update(bArr3, 0, bArr3.length);
        if (encodingV != null) {
            this.mac.update(encodingV, 0, encodingV.length);
        }
        if (this.f18948V.length != 0) {
            this.mac.update(lengthTag, 0, lengthTag.length);
        }
        this.mac.doFinal(bArr10, 0);
        byte[] bArr11 = this.f18948V;
        byte[] bArr12 = new byte[bArr11.length + i10 + macSize];
        System.arraycopy(bArr11, 0, bArr12, 0, bArr11.length);
        System.arraycopy(bArr3, 0, bArr12, this.f18948V.length, i10);
        System.arraycopy(bArr10, 0, bArr12, this.f18948V.length + i10, macSize);
        return bArr12;
    }

    private void extractParams(CipherParameters cipherParameters) {
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.IV = parametersWithIV.getIV();
            cipherParameters = parametersWithIV.getParameters();
        } else {
            this.IV = null;
        }
        this.param = (IESParameters) cipherParameters;
    }

    public BufferedBlockCipher getCipher() {
        return this.cipher;
    }

    public byte[] getLengthTag(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        if (bArr != null) {
            Pack.longToBigEndian(bArr.length * 8, bArr2, 0);
        }
        return bArr2;
    }

    public Mac getMac() {
        return this.mac;
    }

    public void init(AsymmetricKeyParameter asymmetricKeyParameter, CipherParameters cipherParameters, KeyParser keyParser) {
        this.forEncryption = false;
        this.privParam = asymmetricKeyParameter;
        this.keyParser = keyParser;
        extractParams(cipherParameters);
    }

    public byte[] processBlock(byte[] bArr, int i3, int i10) throws InvalidCipherTextException {
        String string2 = StubApp.getString2(28625);
        if (this.forEncryption) {
            EphemeralKeyPairGenerator ephemeralKeyPairGenerator = this.keyPairGenerator;
            if (ephemeralKeyPairGenerator != null) {
                EphemeralKeyPair generate = ephemeralKeyPairGenerator.generate();
                this.privParam = generate.getKeyPair().getPrivate();
                this.f18948V = generate.getEncodedPublicKey();
            }
        } else if (this.keyParser != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, i3, i10);
            try {
                this.pubParam = this.keyParser.readKey(byteArrayInputStream);
                this.f18948V = Arrays.copyOfRange(bArr, i3, (i10 - byteArrayInputStream.available()) + i3);
            } catch (IOException e10) {
                throw new InvalidCipherTextException(u.q(e10, new StringBuilder(string2)), e10);
            } catch (IllegalArgumentException e11) {
                throw new InvalidCipherTextException(h.l(e11, new StringBuilder(string2)), e11);
            }
        }
        this.agree.init(this.privParam);
        byte[] asUnsignedByteArray = BigIntegers.asUnsignedByteArray(this.agree.getFieldSize(), this.agree.calculateAgreement(this.pubParam));
        byte[] bArr2 = this.f18948V;
        if (bArr2.length != 0) {
            byte[] concatenate = Arrays.concatenate(bArr2, asUnsignedByteArray);
            Arrays.fill(asUnsignedByteArray, (byte) 0);
            asUnsignedByteArray = concatenate;
        }
        try {
            this.kdf.init(new KDFParameters(asUnsignedByteArray, this.param.getDerivationV()));
            byte[] encryptBlock = this.forEncryption ? encryptBlock(bArr, i3, i10) : decryptBlock(bArr, i3, i10);
            Arrays.fill(asUnsignedByteArray, (byte) 0);
            return encryptBlock;
        } catch (Throwable th) {
            Arrays.fill(asUnsignedByteArray, (byte) 0);
            throw th;
        }
    }

    public IESEngine(BasicAgreement basicAgreement, DerivationFunction derivationFunction, Mac mac, BufferedBlockCipher bufferedBlockCipher) {
        this.agree = basicAgreement;
        this.kdf = derivationFunction;
        this.mac = mac;
        this.macBuf = new byte[mac.getMacSize()];
        this.cipher = bufferedBlockCipher;
    }

    public void init(AsymmetricKeyParameter asymmetricKeyParameter, CipherParameters cipherParameters, EphemeralKeyPairGenerator ephemeralKeyPairGenerator) {
        this.forEncryption = true;
        this.pubParam = asymmetricKeyParameter;
        this.keyPairGenerator = ephemeralKeyPairGenerator;
        extractParams(cipherParameters);
    }

    public void init(boolean z2, CipherParameters cipherParameters, CipherParameters cipherParameters2, CipherParameters cipherParameters3) {
        this.forEncryption = z2;
        this.privParam = cipherParameters;
        this.pubParam = cipherParameters2;
        this.f18948V = new byte[0];
        extractParams(cipherParameters3);
    }
}
