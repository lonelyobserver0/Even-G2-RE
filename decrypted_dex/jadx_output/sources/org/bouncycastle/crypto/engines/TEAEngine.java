package org.bouncycastle.crypto.engines;

import com.stub.StubApp;
import kotlin.UByte;
import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class TEAEngine implements BlockCipher {
    private static final int block_size = 8;
    private static final int d_sum = -957401312;
    private static final int delta = -1640531527;
    private static final int rounds = 32;
    private int _a;
    private int _b;
    private int _c;
    private int _d;
    private boolean _forEncryption;
    private boolean _initialised = false;

    private int bytesToInt(byte[] bArr, int i3) {
        int i10 = ((bArr[i3 + 1] & UByte.MAX_VALUE) << 16) | (bArr[i3] << 24);
        return (bArr[i3 + 3] & UByte.MAX_VALUE) | i10 | ((bArr[i3 + 2] & UByte.MAX_VALUE) << 8);
    }

    private int decryptBlock(byte[] bArr, int i3, byte[] bArr2, int i10) {
        int bytesToInt = bytesToInt(bArr, i3);
        int bytesToInt2 = bytesToInt(bArr, i3 + 4);
        int i11 = d_sum;
        for (int i12 = 0; i12 != 32; i12++) {
            bytesToInt2 -= (((bytesToInt << 4) + this._c) ^ (bytesToInt + i11)) ^ ((bytesToInt >>> 5) + this._d);
            bytesToInt -= (((bytesToInt2 << 4) + this._a) ^ (bytesToInt2 + i11)) ^ ((bytesToInt2 >>> 5) + this._b);
            i11 += 1640531527;
        }
        unpackInt(bytesToInt, bArr2, i10);
        unpackInt(bytesToInt2, bArr2, i10 + 4);
        return 8;
    }

    private int encryptBlock(byte[] bArr, int i3, byte[] bArr2, int i10) {
        int bytesToInt = bytesToInt(bArr, i3);
        int bytesToInt2 = bytesToInt(bArr, i3 + 4);
        int i11 = bytesToInt;
        int i12 = 0;
        for (int i13 = 0; i13 != 32; i13++) {
            i12 -= 1640531527;
            i11 += (((bytesToInt2 << 4) + this._a) ^ (bytesToInt2 + i12)) ^ ((bytesToInt2 >>> 5) + this._b);
            bytesToInt2 += (((i11 << 4) + this._c) ^ (i11 + i12)) ^ ((i11 >>> 5) + this._d);
        }
        unpackInt(i11, bArr2, i10);
        unpackInt(bytesToInt2, bArr2, i10 + 4);
        return 8;
    }

    private void setKey(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException(StubApp.getString2(28776));
        }
        this._a = bytesToInt(bArr, 0);
        this._b = bytesToInt(bArr, 4);
        this._c = bytesToInt(bArr, 8);
        this._d = bytesToInt(bArr, 12);
    }

    private void unpackInt(int i3, byte[] bArr, int i10) {
        bArr[i10] = (byte) (i3 >>> 24);
        bArr[i10 + 1] = (byte) (i3 >>> 16);
        bArr[i10 + 2] = (byte) (i3 >>> 8);
        bArr[i10 + 3] = (byte) i3;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return StubApp.getString2(28777);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(a.g(StubApp.getString2(28778), cipherParameters));
        }
        this._forEncryption = z2;
        this._initialised = true;
        setKey(((KeyParameter) cipherParameters).getKey());
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 128, cipherParameters, Utils.getPurpose(z2)));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i3, byte[] bArr2, int i10) {
        if (!this._initialised) {
            throw new IllegalStateException(getAlgorithmName() + StubApp.getString2(28567));
        }
        if (i3 + 8 > bArr.length) {
            throw new DataLengthException(StubApp.getString2(28553));
        }
        if (i10 + 8 <= bArr2.length) {
            return this._forEncryption ? encryptBlock(bArr, i3, bArr2, i10) : decryptBlock(bArr, i3, bArr2, i10);
        }
        throw new OutputLengthException(StubApp.getString2(28306));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
