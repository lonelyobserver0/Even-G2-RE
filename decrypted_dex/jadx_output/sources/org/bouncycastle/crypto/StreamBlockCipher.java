package org.bouncycastle.crypto;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class StreamBlockCipher extends DefaultMultiBlockCipher implements StreamCipher {
    private final BlockCipher cipher;

    public StreamBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
    }

    public abstract byte calculateByte(byte b2);

    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) throws DataLengthException {
        int i12 = i3 + i10;
        if (i12 > bArr.length) {
            throw new DataLengthException(StubApp.getString2(28344));
        }
        if (i11 + i10 > bArr2.length) {
            throw new OutputLengthException(StubApp.getString2(28306));
        }
        while (i3 < i12) {
            bArr2[i11] = calculateByte(bArr[i3]);
            i11++;
            i3++;
        }
        return i10;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public final byte returnByte(byte b2) {
        return calculateByte(b2);
    }
}
