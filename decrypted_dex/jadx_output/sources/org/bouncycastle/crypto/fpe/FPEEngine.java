package org.bouncycastle.crypto.fpe;

import com.stub.StubApp;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.FPEParameters;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class FPEEngine {
    protected final BlockCipher baseCipher;
    protected boolean forEncryption;
    protected FPEParameters fpeParameters;

    public FPEEngine(BlockCipher blockCipher) {
        this.baseCipher = blockCipher;
    }

    public static byte[] toByteArray(short[] sArr) {
        byte[] bArr = new byte[sArr.length * 2];
        for (int i3 = 0; i3 != sArr.length; i3++) {
            Pack.shortToBigEndian(sArr[i3], bArr, i3 * 2);
        }
        return bArr;
    }

    public static short[] toShortArray(byte[] bArr) {
        if ((bArr.length & 1) != 0) {
            throw new IllegalArgumentException(StubApp.getString2(28863));
        }
        int length = bArr.length / 2;
        short[] sArr = new short[length];
        for (int i3 = 0; i3 != length; i3++) {
            sArr[i3] = Pack.bigEndianToShort(bArr, i3 * 2);
        }
        return sArr;
    }

    public abstract int decryptBlock(byte[] bArr, int i3, int i10, byte[] bArr2, int i11);

    public abstract int encryptBlock(byte[] bArr, int i3, int i10, byte[] bArr2, int i11);

    public abstract String getAlgorithmName();

    public abstract void init(boolean z2, CipherParameters cipherParameters);

    public int processBlock(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) {
        if (this.fpeParameters == null) {
            throw new IllegalStateException(StubApp.getString2(28866));
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(StubApp.getString2(28865));
        }
        if (bArr == null || bArr2 == null) {
            throw new NullPointerException(StubApp.getString2(28864));
        }
        if (bArr.length < i3 + i10) {
            throw new DataLengthException(StubApp.getString2(28553));
        }
        if (bArr2.length >= i11 + i10) {
            return this.forEncryption ? encryptBlock(bArr, i3, i10, bArr2, i11) : decryptBlock(bArr, i3, i10, bArr2, i11);
        }
        throw new OutputLengthException(StubApp.getString2(28306));
    }
}
