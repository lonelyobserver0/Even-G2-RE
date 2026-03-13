package org.bouncycastle.crypto.modes;

import com.stub.StubApp;
import kotlin.UByte;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.SkippingStreamCipher;
import org.bouncycastle.crypto.StreamBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SICBlockCipher extends StreamBlockCipher implements SkippingStreamCipher {
    private byte[] IV;
    private final int blockSize;
    private int byteCount;
    private final BlockCipher cipher;
    private byte[] counter;
    private byte[] counterOut;

    public SICBlockCipher(BlockCipher blockCipher) {
        super(blockCipher);
        this.cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.IV = new byte[blockSize];
        this.counter = new byte[blockSize];
        this.counterOut = new byte[blockSize];
        this.byteCount = 0;
    }

    private void adjustCounter(long j) {
        int i3 = 5;
        if (j >= 0) {
            long j3 = (this.byteCount + j) / this.blockSize;
            long j10 = j3;
            if (j3 > 255) {
                while (i3 >= 1) {
                    long j11 = 1 << (i3 * 8);
                    while (j10 >= j11) {
                        incrementCounterAt(i3);
                        j10 -= j11;
                    }
                    i3--;
                }
            }
            incrementCounter((int) j10);
            this.byteCount = (int) ((j + this.byteCount) - (this.blockSize * j3));
            return;
        }
        long j12 = ((-j) - this.byteCount) / this.blockSize;
        long j13 = j12;
        if (j12 > 255) {
            while (i3 >= 1) {
                long j14 = 1 << (i3 * 8);
                while (j13 > j14) {
                    decrementCounterAt(i3);
                    j13 -= j14;
                }
                i3--;
            }
        }
        for (long j15 = 0; j15 != j13; j15++) {
            decrementCounterAt(0);
        }
        int i10 = (int) ((this.blockSize * j12) + this.byteCount + j);
        if (i10 >= 0) {
            this.byteCount = 0;
        } else {
            decrementCounterAt(0);
            this.byteCount = this.blockSize + i10;
        }
    }

    private void checkCounter() {
        if (this.IV.length >= this.blockSize) {
            return;
        }
        int i3 = 0;
        while (true) {
            byte[] bArr = this.IV;
            if (i3 == bArr.length) {
                return;
            }
            if (this.counter[i3] != bArr[i3]) {
                throw new IllegalStateException(StubApp.getString2(29167));
            }
            i3++;
        }
    }

    private void decrementCounterAt(int i3) {
        byte b2;
        int length = this.counter.length - i3;
        do {
            length--;
            if (length < 0) {
                return;
            }
            b2 = (byte) (r1[length] - 1);
            this.counter[length] = b2;
        } while (b2 == -1);
    }

    private void incrementCounter(int i3) {
        byte[] bArr = this.counter;
        byte b2 = bArr[bArr.length - 1];
        int length = bArr.length - 1;
        bArr[length] = (byte) (bArr[length] + i3);
        if (b2 == 0 || bArr[bArr.length - 1] >= b2) {
            return;
        }
        incrementCounterAt(1);
    }

    private void incrementCounterAt(int i3) {
        byte b2;
        int length = this.counter.length - i3;
        do {
            length--;
            if (length < 0) {
                return;
            }
            byte[] bArr = this.counter;
            b2 = (byte) (bArr[length] + 1);
            bArr[length] = b2;
        } while (b2 == 0);
    }

    private void incrementCounterChecked() {
        byte b2;
        int length = this.counter.length;
        do {
            length--;
            if (length < 0) {
                break;
            }
            byte[] bArr = this.counter;
            b2 = (byte) (bArr[length] + 1);
            bArr[length] = b2;
        } while (b2 == 0);
        byte[] bArr2 = this.IV;
        if (length < bArr2.length && bArr2.length < this.blockSize) {
            throw new IllegalStateException(StubApp.getString2(29167));
        }
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    public byte calculateByte(byte b2) throws DataLengthException, IllegalStateException {
        int i3 = this.byteCount;
        if (i3 == 0) {
            this.cipher.processBlock(this.counter, 0, this.counterOut, 0);
            byte[] bArr = this.counterOut;
            int i10 = this.byteCount;
            this.byteCount = i10 + 1;
            return (byte) (b2 ^ bArr[i10]);
        }
        byte[] bArr2 = this.counterOut;
        int i11 = i3 + 1;
        this.byteCount = i11;
        byte b10 = (byte) (b2 ^ bArr2[i3]);
        if (i11 == this.counter.length) {
            this.byteCount = 0;
            incrementCounterChecked();
        }
        return b10;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + StubApp.getString2(29168);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long getPosition() {
        byte[] bArr = this.counter;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        int i3 = length - 1;
        while (i3 >= 1) {
            byte[] bArr3 = this.IV;
            int i10 = i3 < bArr3.length ? (bArr2[i3] & UByte.MAX_VALUE) - (bArr3[i3] & UByte.MAX_VALUE) : bArr2[i3] & UByte.MAX_VALUE;
            if (i10 < 0) {
                int i11 = i3 - 1;
                bArr2[i11] = (byte) (bArr2[i11] - 1);
                i10 += 256;
            }
            bArr2[i3] = (byte) i10;
            i3--;
        }
        return (Pack.bigEndianToLong(bArr2, length - 8) * this.blockSize) + this.byteCount;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException(StubApp.getString2(29171));
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] clone = Arrays.clone(parametersWithIV.getIV());
        this.IV = clone;
        int i3 = this.blockSize;
        int length = clone.length;
        String string2 = StubApp.getString2(8609);
        if (i3 < length) {
            throw new IllegalArgumentException(AbstractC1482f.f(this.blockSize, string2, new StringBuilder(StubApp.getString2(29170))));
        }
        int i10 = 8 > i3 / 2 ? i3 / 2 : 8;
        if (i3 - clone.length <= i10) {
            if (parametersWithIV.getParameters() != null) {
                this.cipher.init(true, parametersWithIV.getParameters());
            }
            reset();
        } else {
            throw new IllegalArgumentException(StubApp.getString2(29169) + (this.blockSize - i10) + string2);
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i3, byte[] bArr2, int i10) throws DataLengthException, IllegalStateException {
        SICBlockCipher sICBlockCipher;
        if (this.byteCount != 0) {
            sICBlockCipher = this;
            sICBlockCipher.processBytes(bArr, i3, this.blockSize, bArr2, i10);
        } else {
            sICBlockCipher = this;
            int i11 = sICBlockCipher.blockSize;
            if (i3 + i11 > bArr.length) {
                throw new DataLengthException(StubApp.getString2(28344));
            }
            if (i10 + i11 > bArr2.length) {
                throw new OutputLengthException(StubApp.getString2(28306));
            }
            sICBlockCipher.cipher.processBlock(sICBlockCipher.counter, 0, sICBlockCipher.counterOut, 0);
            for (int i12 = 0; i12 < sICBlockCipher.blockSize; i12++) {
                bArr2[i10 + i12] = (byte) (bArr[i3 + i12] ^ sICBlockCipher.counterOut[i12]);
            }
            incrementCounterChecked();
        }
        return sICBlockCipher.blockSize;
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher, org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) throws DataLengthException {
        byte b2;
        if (i3 + i10 > bArr.length) {
            throw new DataLengthException(StubApp.getString2(28344));
        }
        if (i11 + i10 > bArr2.length) {
            throw new OutputLengthException(StubApp.getString2(28306));
        }
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = this.byteCount;
            if (i13 == 0) {
                this.cipher.processBlock(this.counter, 0, this.counterOut, 0);
                byte b10 = bArr[i3 + i12];
                byte[] bArr3 = this.counterOut;
                int i14 = this.byteCount;
                this.byteCount = i14 + 1;
                b2 = (byte) (b10 ^ bArr3[i14]);
            } else {
                byte b11 = bArr[i3 + i12];
                byte[] bArr4 = this.counterOut;
                int i15 = i13 + 1;
                this.byteCount = i15;
                b2 = (byte) (bArr4[i13] ^ b11);
                if (i15 == this.counter.length) {
                    this.byteCount = 0;
                    incrementCounterChecked();
                }
            }
            bArr2[i11 + i12] = b2;
        }
        return i10;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        Arrays.fill(this.counter, (byte) 0);
        byte[] bArr = this.IV;
        System.arraycopy(bArr, 0, this.counter, 0, bArr.length);
        this.cipher.reset();
        this.byteCount = 0;
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long seekTo(long j) {
        reset();
        return skip(j);
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long skip(long j) {
        adjustCounter(j);
        checkCounter();
        this.cipher.processBlock(this.counter, 0, this.counterOut, 0);
        return j;
    }
}
