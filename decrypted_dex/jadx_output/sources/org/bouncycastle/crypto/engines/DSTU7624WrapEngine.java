package org.bouncycastle.crypto.engines;

import com.stub.StubApp;
import java.util.ArrayList;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DSTU7624WrapEngine implements Wrapper {
    private static final int BYTES_IN_INTEGER = 4;

    /* renamed from: B, reason: collision with root package name */
    private byte[] f18941B;
    private ArrayList<byte[]> Btemp;
    private byte[] checkSumArray;
    private DSTU7624Engine engine;
    private boolean forWrapping;
    private byte[] intArray;
    private byte[] zeroArray;

    public DSTU7624WrapEngine(int i3) {
        DSTU7624Engine dSTU7624Engine = new DSTU7624Engine(i3);
        this.engine = dSTU7624Engine;
        this.f18941B = new byte[dSTU7624Engine.getBlockSize() / 2];
        this.checkSumArray = new byte[this.engine.getBlockSize()];
        this.zeroArray = new byte[this.engine.getBlockSize()];
        this.Btemp = new ArrayList<>();
        this.intArray = new byte[4];
    }

    private void intToBytes(int i3, byte[] bArr, int i10) {
        bArr[i10 + 3] = (byte) (i3 >> 24);
        bArr[i10 + 2] = (byte) (i3 >> 16);
        bArr[i10 + 1] = (byte) (i3 >> 8);
        bArr[i10] = (byte) i3;
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public String getAlgorithmName() {
        return StubApp.getString2(28611);
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public void init(boolean z2, CipherParameters cipherParameters) {
        if (cipherParameters instanceof ParametersWithRandom) {
            cipherParameters = ((ParametersWithRandom) cipherParameters).getParameters();
        }
        this.forWrapping = z2;
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(StubApp.getString2(28612));
        }
        this.engine.init(z2, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i3, int i10) throws InvalidCipherTextException {
        if (this.forWrapping) {
            throw new IllegalStateException(StubApp.getString2(28615));
        }
        if (i10 % this.engine.getBlockSize() != 0) {
            throw new DataLengthException(StubApp.getString2(28614) + this.engine.getBlockSize() + StubApp.getString2(693));
        }
        int blockSize = (i10 * 2) / this.engine.getBlockSize();
        int i11 = blockSize - 1;
        int i12 = i11 * 6;
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i3, bArr2, 0, i10);
        byte[] bArr3 = new byte[this.engine.getBlockSize() / 2];
        System.arraycopy(bArr2, 0, bArr3, 0, this.engine.getBlockSize() / 2);
        this.Btemp.clear();
        int blockSize2 = i10 - (this.engine.getBlockSize() / 2);
        int blockSize3 = this.engine.getBlockSize() / 2;
        while (blockSize2 != 0) {
            byte[] bArr4 = new byte[this.engine.getBlockSize() / 2];
            System.arraycopy(bArr2, blockSize3, bArr4, 0, this.engine.getBlockSize() / 2);
            this.Btemp.add(bArr4);
            blockSize2 -= this.engine.getBlockSize() / 2;
            blockSize3 += this.engine.getBlockSize() / 2;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            System.arraycopy(this.Btemp.get(blockSize - 2), 0, bArr2, 0, this.engine.getBlockSize() / 2);
            System.arraycopy(bArr3, 0, bArr2, this.engine.getBlockSize() / 2, this.engine.getBlockSize() / 2);
            intToBytes(i12 - i13, this.intArray, 0);
            for (int i14 = 0; i14 < 4; i14++) {
                int blockSize4 = (this.engine.getBlockSize() / 2) + i14;
                bArr2[blockSize4] = (byte) (bArr2[blockSize4] ^ this.intArray[i14]);
            }
            this.engine.processBlock(bArr2, 0, bArr2, 0);
            System.arraycopy(bArr2, 0, bArr3, 0, this.engine.getBlockSize() / 2);
            for (int i15 = 2; i15 < blockSize; i15++) {
                int i16 = blockSize - i15;
                System.arraycopy(this.Btemp.get(i16 - 1), 0, this.Btemp.get(i16), 0, this.engine.getBlockSize() / 2);
            }
            System.arraycopy(bArr2, this.engine.getBlockSize() / 2, this.Btemp.get(0), 0, this.engine.getBlockSize() / 2);
        }
        System.arraycopy(bArr3, 0, bArr2, 0, this.engine.getBlockSize() / 2);
        int blockSize5 = this.engine.getBlockSize() / 2;
        for (int i17 = 0; i17 < i11; i17++) {
            System.arraycopy(this.Btemp.get(i17), 0, bArr2, blockSize5, this.engine.getBlockSize() / 2);
            blockSize5 += this.engine.getBlockSize() / 2;
        }
        System.arraycopy(bArr2, i10 - this.engine.getBlockSize(), this.checkSumArray, 0, this.engine.getBlockSize());
        byte[] bArr5 = new byte[i10 - this.engine.getBlockSize()];
        if (!Arrays.areEqual(this.checkSumArray, this.zeroArray)) {
            throw new InvalidCipherTextException(StubApp.getString2(28613));
        }
        System.arraycopy(bArr2, 0, bArr5, 0, i10 - this.engine.getBlockSize());
        return bArr5;
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i3, int i10) {
        if (!this.forWrapping) {
            throw new IllegalStateException(StubApp.getString2(28617));
        }
        if (i10 % this.engine.getBlockSize() != 0) {
            throw new DataLengthException(StubApp.getString2(28616) + this.engine.getBlockSize() + StubApp.getString2(693));
        }
        if (i3 + i10 > bArr.length) {
            throw new DataLengthException(StubApp.getString2(28553));
        }
        int blockSize = ((i10 / this.engine.getBlockSize()) + 1) * 2;
        int i11 = blockSize - 1;
        int i12 = i11 * 6;
        int blockSize2 = this.engine.getBlockSize() + i10;
        byte[] bArr2 = new byte[blockSize2];
        System.arraycopy(bArr, i3, bArr2, 0, i10);
        System.arraycopy(bArr2, 0, this.f18941B, 0, this.engine.getBlockSize() / 2);
        this.Btemp.clear();
        int blockSize3 = blockSize2 - (this.engine.getBlockSize() / 2);
        int blockSize4 = this.engine.getBlockSize() / 2;
        while (blockSize3 != 0) {
            byte[] bArr3 = new byte[this.engine.getBlockSize() / 2];
            System.arraycopy(bArr2, blockSize4, bArr3, 0, this.engine.getBlockSize() / 2);
            this.Btemp.add(bArr3);
            blockSize3 -= this.engine.getBlockSize() / 2;
            blockSize4 += this.engine.getBlockSize() / 2;
        }
        int i13 = 0;
        while (i13 < i12) {
            System.arraycopy(this.f18941B, 0, bArr2, 0, this.engine.getBlockSize() / 2);
            System.arraycopy(this.Btemp.get(0), 0, bArr2, this.engine.getBlockSize() / 2, this.engine.getBlockSize() / 2);
            this.engine.processBlock(bArr2, 0, bArr2, 0);
            i13++;
            intToBytes(i13, this.intArray, 0);
            for (int i14 = 0; i14 < 4; i14++) {
                int blockSize5 = (this.engine.getBlockSize() / 2) + i14;
                bArr2[blockSize5] = (byte) (bArr2[blockSize5] ^ this.intArray[i14]);
            }
            System.arraycopy(bArr2, this.engine.getBlockSize() / 2, this.f18941B, 0, this.engine.getBlockSize() / 2);
            for (int i15 = 2; i15 < blockSize; i15++) {
                System.arraycopy(this.Btemp.get(i15 - 1), 0, this.Btemp.get(i15 - 2), 0, this.engine.getBlockSize() / 2);
            }
            System.arraycopy(bArr2, 0, this.Btemp.get(blockSize - 2), 0, this.engine.getBlockSize() / 2);
        }
        System.arraycopy(this.f18941B, 0, bArr2, 0, this.engine.getBlockSize() / 2);
        int blockSize6 = this.engine.getBlockSize() / 2;
        for (int i16 = 0; i16 < i11; i16++) {
            System.arraycopy(this.Btemp.get(i16), 0, bArr2, blockSize6, this.engine.getBlockSize() / 2);
            blockSize6 += this.engine.getBlockSize() / 2;
        }
        return bArr2;
    }
}
