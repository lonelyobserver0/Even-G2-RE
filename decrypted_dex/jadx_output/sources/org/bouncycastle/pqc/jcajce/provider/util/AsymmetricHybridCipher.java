package org.bouncycastle.pqc.jcajce.provider.util;

import com.stub.StubApp;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.ShortBufferException;
import org.bouncycastle.crypto.CryptoServicesRegistrar;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class AsymmetricHybridCipher extends CipherSpiExt {
    protected AlgorithmParameterSpec paramSpec;

    public abstract int decryptOutputSize(int i3);

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final int doFinal(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) throws ShortBufferException, BadPaddingException {
        if (bArr2.length < getOutputSize(i10)) {
            throw new ShortBufferException(StubApp.getString2(28673));
        }
        byte[] doFinal = doFinal(bArr, i3, i10);
        System.arraycopy(doFinal, 0, bArr2, i11, doFinal.length);
        return doFinal.length;
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public abstract byte[] doFinal(byte[] bArr, int i3, int i10) throws BadPaddingException;

    public abstract int encryptOutputSize(int i3);

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final int getBlockSize() {
        return 0;
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final byte[] getIV() {
        return null;
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final int getOutputSize(int i3) {
        return this.opMode == 1 ? encryptOutputSize(i3) : decryptOutputSize(i3);
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

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final void setMode(String str) {
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final void setPadding(String str) {
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final int update(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) throws ShortBufferException {
        if (bArr2.length < getOutputSize(i10)) {
            throw new ShortBufferException(StubApp.getString2(295));
        }
        byte[] update = update(bArr, i3, i10);
        System.arraycopy(update, 0, bArr2, i11, update.length);
        return update.length;
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public abstract byte[] update(byte[] bArr, int i3, int i10);

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

    public final void initEncrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        initEncrypt(key, algorithmParameterSpec, CryptoServicesRegistrar.getSecureRandom());
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final void initEncrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        this.opMode = 1;
        initCipherEncrypt(key, algorithmParameterSpec, secureRandom);
    }
}
