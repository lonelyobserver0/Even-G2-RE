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
public class XTEAEngine implements BlockCipher {
    private static final int block_size = 8;
    private static final int delta = -1640531527;
    private static final int rounds = 32;
    private boolean _forEncryption;
    private int[] _S = new int[4];
    private int[] _sum0 = new int[32];
    private int[] _sum1 = new int[32];
    private boolean _initialised = false;

    private int bytesToInt(byte[] bArr, int i3) {
        int i10 = ((bArr[i3 + 1] & UByte.MAX_VALUE) << 16) | (bArr[i3] << 24);
        return (bArr[i3 + 3] & UByte.MAX_VALUE) | i10 | ((bArr[i3 + 2] & UByte.MAX_VALUE) << 8);
    }

    private int decryptBlock(byte[] bArr, int i3, byte[] bArr2, int i10) {
        int bytesToInt = bytesToInt(bArr, i3);
        int bytesToInt2 = bytesToInt(bArr, i3 + 4);
        for (int i11 = 31; i11 >= 0; i11--) {
            bytesToInt2 -= (((bytesToInt << 4) ^ (bytesToInt >>> 5)) + bytesToInt) ^ this._sum1[i11];
            bytesToInt -= (((bytesToInt2 << 4) ^ (bytesToInt2 >>> 5)) + bytesToInt2) ^ this._sum0[i11];
        }
        unpackInt(bytesToInt, bArr2, i10);
        unpackInt(bytesToInt2, bArr2, i10 + 4);
        return 8;
    }

    private int encryptBlock(byte[] bArr, int i3, byte[] bArr2, int i10) {
        int bytesToInt = bytesToInt(bArr, i3);
        int bytesToInt2 = bytesToInt(bArr, i3 + 4);
        for (int i11 = 0; i11 < 32; i11++) {
            bytesToInt += (((bytesToInt2 << 4) ^ (bytesToInt2 >>> 5)) + bytesToInt2) ^ this._sum0[i11];
            bytesToInt2 += (((bytesToInt << 4) ^ (bytesToInt >>> 5)) + bytesToInt) ^ this._sum1[i11];
        }
        unpackInt(bytesToInt, bArr2, i10);
        unpackInt(bytesToInt2, bArr2, i10 + 4);
        return 8;
    }

    private void setKey(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException(StubApp.getString2(28776));
        }
        int i3 = 0;
        int i10 = 0;
        while (i3 < 4) {
            this._S[i3] = bytesToInt(bArr, i10);
            i3++;
            i10 += 4;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < 32; i12++) {
            int[] iArr = this._sum0;
            int[] iArr2 = this._S;
            iArr[i12] = iArr2[i11 & 3] + i11;
            i11 -= 1640531527;
            this._sum1[i12] = iArr2[(i11 >>> 11) & 3] + i11;
        }
    }

    private void unpackInt(int i3, byte[] bArr, int i10) {
        bArr[i10] = (byte) (i3 >>> 24);
        bArr[i10 + 1] = (byte) (i3 >>> 16);
        bArr[i10 + 2] = (byte) (i3 >>> 8);
        bArr[i10 + 3] = (byte) i3;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return StubApp.getString2(28799);
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
