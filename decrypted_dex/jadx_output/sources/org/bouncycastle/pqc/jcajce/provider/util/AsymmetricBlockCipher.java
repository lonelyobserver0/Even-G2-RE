package org.bouncycastle.pqc.jcajce.provider.util;

import Xa.h;
import com.stub.StubApp;
import java.io.ByteArrayOutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class AsymmetricBlockCipher extends CipherSpiExt {
    protected ByteArrayOutputStream buf = new ByteArrayOutputStream();
    protected int cipherTextSize;
    protected int maxPlainTextSize;
    protected AlgorithmParameterSpec paramSpec;

    public void checkLength(int i3) throws IllegalBlockSizeException {
        int size = this.buf.size() + i3;
        int i10 = this.opMode;
        String string2 = StubApp.getString2(34715);
        if (i10 == 1) {
            if (size <= this.maxPlainTextSize) {
                return;
            }
            throw new IllegalBlockSizeException(AbstractC1482f.f(this.maxPlainTextSize, string2, h.u(size, StubApp.getString2(34716), StubApp.getString2(34717))));
        }
        if (i10 != 2 || size == this.cipherTextSize) {
            return;
        }
        throw new IllegalBlockSizeException(StubApp.getString2(34718) + this.cipherTextSize + StubApp.getString2(34719) + size + string2);
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final int doFinal(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
        if (bArr2.length < getOutputSize(i10)) {
            throw new ShortBufferException(StubApp.getString2(28673));
        }
        byte[] doFinal = doFinal(bArr, i3, i10);
        System.arraycopy(doFinal, 0, bArr2, i11, doFinal.length);
        return doFinal.length;
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final int getBlockSize() {
        return this.opMode == 1 ? this.maxPlainTextSize : this.cipherTextSize;
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final byte[] getIV() {
        return null;
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final int getOutputSize(int i3) {
        if (this.buf.size() + i3 > getBlockSize()) {
            return 0;
        }
        return this.opMode == 1 ? this.cipherTextSize : this.maxPlainTextSize;
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final AlgorithmParameterSpec getParameters() {
        return this.paramSpec;
    }

    public abstract void initCipherDecrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException;

    public abstract void initCipherEncrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException;

    public final void initDecrypt(Key key) throws InvalidKeyException {
        try {
            initDecrypt(key, null);
        } catch (InvalidAlgorithmParameterException unused) {
            throw new InvalidParameterException(StubApp.getString2(34720));
        }
    }

    public final void initEncrypt(Key key) throws InvalidKeyException {
        try {
            initEncrypt(key, null, CryptoServicesRegistrar.getSecureRandom());
        } catch (InvalidAlgorithmParameterException unused) {
            throw new InvalidParameterException(StubApp.getString2(34720));
        }
    }

    public abstract byte[] messageDecrypt(byte[] bArr) throws IllegalBlockSizeException, BadPaddingException;

    public abstract byte[] messageEncrypt(byte[] bArr) throws IllegalBlockSizeException, BadPaddingException;

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final void setMode(String str) {
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final void setPadding(String str) {
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final int update(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) {
        update(bArr, i3, i10);
        return 0;
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final byte[] doFinal(byte[] bArr, int i3, int i10) throws IllegalBlockSizeException, BadPaddingException {
        checkLength(i10);
        update(bArr, i3, i10);
        byte[] byteArray = this.buf.toByteArray();
        this.buf.reset();
        int i11 = this.opMode;
        if (i11 == 1) {
            return messageEncrypt(byteArray);
        }
        if (i11 != 2) {
            return null;
        }
        return messageDecrypt(byteArray);
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final void initDecrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        this.opMode = 2;
        initCipherDecrypt(key, algorithmParameterSpec);
    }

    public final void initEncrypt(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            initEncrypt(key, null, secureRandom);
        } catch (InvalidAlgorithmParameterException unused) {
            throw new InvalidParameterException(StubApp.getString2(34720));
        }
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final byte[] update(byte[] bArr, int i3, int i10) {
        if (i10 != 0) {
            this.buf.write(bArr, i3, i10);
        }
        return new byte[0];
    }

    public final void initEncrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        initEncrypt(key, algorithmParameterSpec, CryptoServicesRegistrar.getSecureRandom());
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final void initEncrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        this.opMode = 1;
        initCipherEncrypt(key, algorithmParameterSpec, secureRandom);
    }
}
