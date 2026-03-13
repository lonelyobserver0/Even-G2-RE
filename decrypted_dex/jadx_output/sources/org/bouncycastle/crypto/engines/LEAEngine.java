package org.bouncycastle.crypto.engines;

import com.stub.StubApp;
import java.lang.reflect.Array;
import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class LEAEngine implements BlockCipher {
    private static final int BASEROUNDS = 16;
    private static final int BLOCKSIZE = 16;
    private static final int[] DELTA = {-1007687205, 1147300610, 2044886154, 2027892972, 1902027934, -947529206, -531697110, -440137385};
    private static final int KEY0 = 0;
    private static final int KEY1 = 1;
    private static final int KEY2 = 2;
    private static final int KEY3 = 3;
    private static final int KEY4 = 4;
    private static final int KEY5 = 5;
    private static final int MASK128 = 3;
    private static final int MASK256 = 7;
    private static final int NUMWORDS = 4;
    private static final int NUMWORDS128 = 4;
    private static final int NUMWORDS192 = 6;
    private static final int NUMWORDS256 = 8;
    private static final int ROT1 = 1;
    private static final int ROT11 = 11;
    private static final int ROT13 = 13;
    private static final int ROT17 = 17;
    private static final int ROT3 = 3;
    private static final int ROT5 = 5;
    private static final int ROT6 = 6;
    private static final int ROT9 = 9;
    private boolean forEncryption;
    private final int[] theBlock = new int[4];
    private int[][] theRoundKeys;
    private int theRounds;

    private static int bufLength(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    private static void checkBuffer(byte[] bArr, int i3, boolean z2) {
        int bufLength = bufLength(bArr);
        int i10 = i3 + 16;
        if (i3 < 0 || i10 < 0 || i10 > bufLength) {
            if (!z2) {
                throw new DataLengthException(StubApp.getString2(28674));
            }
        }
    }

    private int decryptBlock(byte[] bArr, int i3, byte[] bArr2, int i10) {
        Pack.littleEndianToInt(bArr, i3, this.theBlock, 0, 4);
        for (int i11 = this.theRounds - 1; i11 >= 0; i11--) {
            decryptRound(i11);
        }
        Pack.intToLittleEndian(this.theBlock, bArr2, i10);
        return 16;
    }

    private void decryptRound(int i3) {
        int[] iArr = this.theRoundKeys[i3];
        int i10 = i3 % 4;
        int rightIndex = rightIndex(i10);
        int[] iArr2 = this.theBlock;
        iArr2[rightIndex] = iArr[1] ^ (ror32(iArr2[rightIndex], 9) - (this.theBlock[i10] ^ iArr[0]));
        int rightIndex2 = rightIndex(rightIndex);
        int[] iArr3 = this.theBlock;
        iArr3[rightIndex2] = (rol32(iArr3[rightIndex2], 5) - (this.theBlock[rightIndex] ^ iArr[2])) ^ iArr[3];
        int rightIndex3 = rightIndex(rightIndex2);
        int[] iArr4 = this.theBlock;
        iArr4[rightIndex3] = iArr[5] ^ (rol32(iArr4[rightIndex3], 3) - (this.theBlock[rightIndex2] ^ iArr[4]));
    }

    private int encryptBlock(byte[] bArr, int i3, byte[] bArr2, int i10) {
        Pack.littleEndianToInt(bArr, i3, this.theBlock, 0, 4);
        for (int i11 = 0; i11 < this.theRounds; i11++) {
            encryptRound(i11);
        }
        Pack.intToLittleEndian(this.theBlock, bArr2, i10);
        return 16;
    }

    private void encryptRound(int i3) {
        int[] iArr = this.theRoundKeys[i3];
        int i10 = (i3 + 3) % 4;
        int leftIndex = leftIndex(i10);
        int[] iArr2 = this.theBlock;
        iArr2[i10] = ror32((iArr[4] ^ iArr2[leftIndex]) + (iArr2[i10] ^ iArr[5]), 3);
        int leftIndex2 = leftIndex(leftIndex);
        int[] iArr3 = this.theBlock;
        iArr3[leftIndex] = ror32((iArr3[leftIndex2] ^ iArr[2]) + (iArr[3] ^ iArr3[leftIndex]), 5);
        int leftIndex3 = leftIndex(leftIndex2);
        int[] iArr4 = this.theBlock;
        iArr4[leftIndex2] = rol32((iArr4[leftIndex3] ^ iArr[0]) + (iArr[1] ^ iArr4[leftIndex2]), 9);
    }

    private void generate128RoundKeys(int[] iArr) {
        for (int i3 = 0; i3 < this.theRounds; i3++) {
            int rol32 = rol32(DELTA[i3 & 3], i3);
            iArr[0] = rol32(iArr[0] + rol32, 1);
            iArr[1] = rol32(iArr[1] + rol32(rol32, 1), 3);
            iArr[2] = rol32(iArr[2] + rol32(rol32, 2), 6);
            iArr[3] = rol32(iArr[3] + rol32(rol32, 3), 11);
            int[] iArr2 = this.theRoundKeys[i3];
            iArr2[0] = iArr[0];
            iArr2[1] = iArr[1];
            iArr2[2] = iArr[2];
            int i10 = iArr[1];
            iArr2[3] = i10;
            iArr2[4] = iArr[3];
            iArr2[5] = i10;
        }
    }

    private void generate192RoundKeys(int[] iArr) {
        for (int i3 = 0; i3 < this.theRounds; i3++) {
            int rol32 = rol32(DELTA[i3 % 6], i3);
            iArr[0] = rol32(iArr[0] + rol32(rol32, 0), 1);
            iArr[1] = rol32(iArr[1] + rol32(rol32, 1), 3);
            iArr[2] = rol32(iArr[2] + rol32(rol32, 2), 6);
            iArr[3] = rol32(iArr[3] + rol32(rol32, 3), 11);
            iArr[4] = rol32(iArr[4] + rol32(rol32, 4), 13);
            iArr[5] = rol32(iArr[5] + rol32(rol32, 5), 17);
            System.arraycopy(iArr, 0, this.theRoundKeys[i3], 0, 6);
        }
    }

    private void generate256RoundKeys(int[] iArr) {
        int i3 = 0;
        for (int i10 = 0; i10 < this.theRounds; i10++) {
            int rol32 = rol32(DELTA[i10 & 7], i10);
            int[] iArr2 = this.theRoundKeys[i10];
            int i11 = i3 & 7;
            int rol322 = rol32(iArr[i11] + rol32, 1);
            iArr2[0] = rol322;
            iArr[i11] = rol322;
            int i12 = (i3 + 1) & 7;
            int rol323 = rol32(iArr[i12] + rol32(rol32, 1), 3);
            iArr2[1] = rol323;
            iArr[i12] = rol323;
            int i13 = (i3 + 2) & 7;
            int rol324 = rol32(iArr[i13] + rol32(rol32, 2), 6);
            iArr2[2] = rol324;
            iArr[i13] = rol324;
            int i14 = (i3 + 3) & 7;
            int rol325 = rol32(iArr[i14] + rol32(rol32, 3), 11);
            iArr2[3] = rol325;
            iArr[i14] = rol325;
            int i15 = (i3 + 4) & 7;
            int rol326 = rol32(iArr[i15] + rol32(rol32, 4), 13);
            iArr2[4] = rol326;
            iArr[i15] = rol326;
            int i16 = (i3 + 5) & 7;
            int rol327 = rol32(iArr[i16] + rol32(rol32, 5), 17);
            iArr2[5] = rol327;
            i3 += 6;
            iArr[i16] = rol327;
        }
    }

    private void generateRoundKeys(byte[] bArr) {
        int length = (bArr.length >> 1) + 16;
        this.theRounds = length;
        this.theRoundKeys = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, length, 6);
        int length2 = bArr.length / 4;
        int[] iArr = new int[length2];
        Pack.littleEndianToInt(bArr, 0, iArr, 0, length2);
        if (length2 == 4) {
            generate128RoundKeys(iArr);
        } else if (length2 != 6) {
            generate256RoundKeys(iArr);
        } else {
            generate192RoundKeys(iArr);
        }
    }

    private static int leftIndex(int i3) {
        if (i3 == 0) {
            return 3;
        }
        return i3 - 1;
    }

    private static int rightIndex(int i3) {
        if (i3 == 3) {
            return 0;
        }
        return i3 + 1;
    }

    private static int rol32(int i3, int i10) {
        return (i3 >>> (32 - i10)) | (i3 << i10);
    }

    private static int ror32(int i3, int i10) {
        return (i3 << (32 - i10)) | (i3 >>> i10);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return StubApp.getString2(28675);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(a.g(StubApp.getString2(28677), cipherParameters));
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        int length = key.length;
        if ((length << 1) % 16 != 0 || length < 16 || length > 32) {
            throw new IllegalArgumentException(StubApp.getString2(28676));
        }
        this.forEncryption = z2;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), length * 8, cipherParameters, Utils.getPurpose(this.forEncryption)));
        generateRoundKeys(key);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i3, byte[] bArr2, int i10) {
        checkBuffer(bArr, i3, false);
        checkBuffer(bArr2, i10, true);
        return this.forEncryption ? encryptBlock(bArr, i3, bArr2, i10) : decryptBlock(bArr, i3, bArr2, i10);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
