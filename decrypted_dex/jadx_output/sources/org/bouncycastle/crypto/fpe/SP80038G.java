package org.bouncycastle.crypto.fpe;

import com.stub.StubApp;
import i2.u;
import java.math.BigInteger;
import kotlin.UByte;
import kotlin.UShort;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.util.RadixConverter;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class SP80038G {
    protected static final int BLOCK_SIZE = 16;
    static final String FF1_DISABLED = StubApp.getString2(28868);
    static final String FPE_DISABLED = StubApp.getString2(28867);
    protected static final double LOG2 = Math.log(2.0d);
    protected static final double TWO_TO_96 = Math.pow(2.0d, 96.0d);

    public static BigInteger[] calculateModUV(BigInteger bigInteger, int i3, int i10) {
        BigInteger pow = bigInteger.pow(i3);
        BigInteger[] bigIntegerArr = {pow, pow};
        if (i10 != i3) {
            bigIntegerArr[1] = pow.multiply(bigInteger);
        }
        return bigIntegerArr;
    }

    public static byte[] calculateP_FF1(int i3, byte b2, int i10, int i11) {
        byte[] bArr = {1, 2, 1, 0, (byte) (i3 >> 8), (byte) i3, 10, b2, 0, 0, 0, 0, 0, 0, 0, 0};
        Pack.intToBigEndian(i10, bArr, 8);
        Pack.intToBigEndian(i11, bArr, 12);
        return bArr;
    }

    public static byte[] calculateTweak64_FF3_1(byte[] bArr) {
        byte b2 = bArr[0];
        byte b10 = bArr[1];
        byte b11 = bArr[2];
        byte b12 = bArr[3];
        return new byte[]{b2, b10, b11, (byte) (b12 & 240), bArr[4], bArr[5], bArr[6], (byte) (b12 << 4)};
    }

    public static BigInteger calculateY_FF1(BlockCipher blockCipher, byte[] bArr, int i3, int i10, int i11, byte[] bArr2, short[] sArr, RadixConverter radixConverter) {
        int length = bArr.length;
        byte[] asUnsignedByteArray = BigIntegers.asUnsignedByteArray(radixConverter.fromEncoding(sArr));
        int i12 = ((-(length + i3 + 1)) & 15) + length;
        int i13 = i12 + 1 + i3;
        byte[] bArr3 = new byte[i13];
        System.arraycopy(bArr, 0, bArr3, 0, length);
        bArr3[i12] = (byte) i11;
        System.arraycopy(asUnsignedByteArray, 0, bArr3, i13 - asUnsignedByteArray.length, asUnsignedByteArray.length);
        byte[] prf = prf(blockCipher, Arrays.concatenate(bArr2, bArr3));
        if (i10 > 16) {
            int i14 = (i10 + 15) / 16;
            byte[] bArr4 = new byte[i14 * 16];
            System.arraycopy(prf, 0, bArr4, 0, 16);
            byte[] bArr5 = new byte[4];
            for (int i15 = 1; i15 < i14; i15++) {
                int i16 = i15 * 16;
                System.arraycopy(prf, 0, bArr4, i16, 16);
                Pack.intToBigEndian(i15, bArr5, 0);
                xor(bArr5, 0, bArr4, i16 + 12, 4);
                blockCipher.processBlock(bArr4, i16, bArr4, i16);
            }
            prf = bArr4;
        }
        return num(prf, 0, i10);
    }

    public static BigInteger calculateY_FF3(BlockCipher blockCipher, byte[] bArr, int i3, int i10, short[] sArr, RadixConverter radixConverter) {
        byte[] bArr2 = new byte[16];
        Pack.intToBigEndian(i10, bArr2, 0);
        xor(bArr, i3, bArr2, 0, 4);
        byte[] asUnsignedByteArray = BigIntegers.asUnsignedByteArray(radixConverter.fromEncoding(sArr));
        if (16 - asUnsignedByteArray.length < 4) {
            throw new IllegalStateException(StubApp.getString2(28875));
        }
        System.arraycopy(asUnsignedByteArray, 0, bArr2, 16 - asUnsignedByteArray.length, asUnsignedByteArray.length);
        rev(bArr2);
        blockCipher.processBlock(bArr2, 0, bArr2, 0);
        rev(bArr2);
        return num(bArr2, 0, 16);
    }

    public static void checkArgs(BlockCipher blockCipher, boolean z2, int i3, byte[] bArr, int i10, int i11) {
        checkCipher(blockCipher);
        if (i3 < 2 || i3 > 256) {
            throw new IllegalArgumentException();
        }
        checkData(z2, i3, bArr, i10, i11);
    }

    public static void checkCipher(BlockCipher blockCipher) {
        if (16 != blockCipher.getBlockSize()) {
            throw new IllegalArgumentException();
        }
    }

    public static void checkData(boolean z2, int i3, byte[] bArr, int i10, int i11) {
        checkLength(z2, i3, i11);
        for (int i12 = 0; i12 < i11; i12++) {
            if ((bArr[i10 + i12] & UByte.MAX_VALUE) >= i3) {
                throw new IllegalArgumentException(StubApp.getString2(28876));
            }
        }
    }

    private static void checkLength(boolean z2, int i3, int i10) {
        int floor;
        if (i10 >= 2) {
            double d8 = i3;
            if (Math.pow(d8, i10) >= 1000000.0d) {
                if (!z2 && i10 > (floor = ((int) Math.floor(Math.log(TWO_TO_96) / Math.log(d8))) * 2)) {
                    throw new IllegalArgumentException(u.p(floor, StubApp.getString2(28877)));
                }
                return;
            }
        }
        throw new IllegalArgumentException(StubApp.getString2(28727));
    }

    public static short[] decFF1(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, int i3, int i10, int i11, short[] sArr, short[] sArr2) {
        int radix = radixConverter.getRadix();
        int length = bArr.length;
        int ceil = (((int) Math.ceil((Math.log(radix) * i11) / LOG2)) + 7) / 8;
        int i12 = (((ceil + 3) / 4) * 4) + 4;
        byte[] calculateP_FF1 = calculateP_FF1(radix, (byte) i10, i3, length);
        BigInteger[] calculateModUV = calculateModUV(BigInteger.valueOf(radix), i10, i11);
        int i13 = 9;
        short[] sArr3 = sArr2;
        int i14 = i10;
        short[] sArr4 = sArr;
        while (i13 >= 0) {
            int i15 = ceil;
            byte[] bArr2 = calculateP_FF1;
            int i16 = i13;
            i14 = i3 - i14;
            radixConverter.toEncoding(radixConverter.fromEncoding(sArr3).subtract(calculateY_FF1(blockCipher, bArr, i15, i12, i16, bArr2, sArr4, radixConverter)).mod(calculateModUV[i16 & 1]), i14, sArr3);
            i13 = i16 - 1;
            short[] sArr5 = sArr3;
            sArr3 = sArr4;
            sArr4 = sArr5;
            calculateP_FF1 = bArr2;
            ceil = i15;
        }
        return Arrays.concatenate(sArr4, sArr3);
    }

    private static short[] decFF3_1(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, int i3, int i10, int i11, short[] sArr, short[] sArr2) {
        BigInteger[] calculateModUV = calculateModUV(BigInteger.valueOf(radixConverter.getRadix()), i10, i11);
        rev(sArr);
        rev(sArr2);
        short[] sArr3 = sArr;
        short[] sArr4 = sArr2;
        int i12 = 7;
        while (i12 >= 0) {
            i11 = i3 - i11;
            int i13 = i12 & 1;
            BlockCipher blockCipher2 = blockCipher;
            RadixConverter radixConverter2 = radixConverter;
            radixConverter2.toEncoding(radixConverter2.fromEncoding(sArr4).subtract(calculateY_FF3(blockCipher2, bArr, 4 - (i13 * 4), i12, sArr3, radixConverter2)).mod(calculateModUV[1 - i13]), i11, sArr4);
            i12--;
            short[] sArr5 = sArr3;
            sArr3 = sArr4;
            sArr4 = sArr5;
            blockCipher = blockCipher2;
            radixConverter = radixConverter2;
        }
        rev(sArr3);
        rev(sArr4);
        return Arrays.concatenate(sArr3, sArr4);
    }

    public static byte[] decryptFF1(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, byte[] bArr2, int i3, int i10) {
        checkArgs(blockCipher, true, radixConverter.getRadix(), bArr2, i3, i10);
        int i11 = i10 / 2;
        int i12 = i10 - i11;
        return toByte(decFF1(blockCipher, radixConverter, bArr, i10, i11, i12, toShort(bArr2, i3, i11), toShort(bArr2, i3 + i11, i12)));
    }

    public static short[] decryptFF1w(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, short[] sArr, int i3, int i10) {
        checkArgs(blockCipher, true, radixConverter.getRadix(), sArr, i3, i10);
        int i11 = i10 / 2;
        int i12 = i10 - i11;
        short[] sArr2 = new short[i11];
        short[] sArr3 = new short[i12];
        System.arraycopy(sArr, i3, sArr2, 0, i11);
        System.arraycopy(sArr, i3 + i11, sArr3, 0, i12);
        return decFF1(blockCipher, radixConverter, bArr, i10, i11, i12, sArr2, sArr3);
    }

    public static byte[] decryptFF3(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, byte[] bArr2, int i3, int i10) {
        checkArgs(blockCipher, false, radixConverter.getRadix(), bArr2, i3, i10);
        if (bArr.length == 8) {
            return implDecryptFF3(blockCipher, radixConverter, bArr, bArr2, i3, i10);
        }
        throw new IllegalArgumentException();
    }

    public static byte[] decryptFF3_1(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, byte[] bArr2, int i3, int i10) {
        checkArgs(blockCipher, false, radixConverter.getRadix(), bArr2, i3, i10);
        if (bArr.length == 7) {
            return implDecryptFF3(blockCipher, radixConverter, calculateTweak64_FF3_1(bArr), bArr2, i3, i10);
        }
        throw new IllegalArgumentException(StubApp.getString2(28874));
    }

    public static short[] decryptFF3_1w(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, short[] sArr, int i3, int i10) {
        checkArgs(blockCipher, false, radixConverter.getRadix(), sArr, i3, i10);
        if (bArr.length == 7) {
            return implDecryptFF3w(blockCipher, radixConverter, calculateTweak64_FF3_1(bArr), sArr, i3, i10);
        }
        throw new IllegalArgumentException(StubApp.getString2(28874));
    }

    private static short[] encFF1(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, int i3, int i10, int i11, short[] sArr, short[] sArr2) {
        int radix = radixConverter.getRadix();
        int length = bArr.length;
        int ceil = (((int) Math.ceil((Math.log(radix) * i11) / LOG2)) + 7) / 8;
        int i12 = (((ceil + 3) / 4) * 4) + 4;
        byte[] calculateP_FF1 = calculateP_FF1(radix, (byte) i10, i3, length);
        BigInteger[] calculateModUV = calculateModUV(BigInteger.valueOf(radix), i10, i11);
        int i13 = 0;
        short[] sArr3 = sArr;
        int i14 = i11;
        short[] sArr4 = sArr2;
        while (i13 < 10) {
            int i15 = ceil;
            byte[] bArr2 = calculateP_FF1;
            int i16 = i13;
            i14 = i3 - i14;
            radixConverter.toEncoding(radixConverter.fromEncoding(sArr3).add(calculateY_FF1(blockCipher, bArr, i15, i12, i16, bArr2, sArr4, radixConverter)).mod(calculateModUV[i16 & 1]), i14, sArr3);
            i13 = i16 + 1;
            short[] sArr5 = sArr3;
            sArr3 = sArr4;
            sArr4 = sArr5;
            calculateP_FF1 = bArr2;
            ceil = i15;
        }
        return Arrays.concatenate(sArr3, sArr4);
    }

    private static short[] encFF3_1(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, int i3, int i10, int i11, short[] sArr, short[] sArr2) {
        BigInteger[] calculateModUV = calculateModUV(BigInteger.valueOf(radixConverter.getRadix()), i10, i11);
        rev(sArr);
        rev(sArr2);
        short[] sArr3 = sArr2;
        int i12 = 0;
        while (i12 < 8) {
            i10 = i3 - i10;
            int i13 = i12 & 1;
            BlockCipher blockCipher2 = blockCipher;
            RadixConverter radixConverter2 = radixConverter;
            radixConverter2.toEncoding(radixConverter2.fromEncoding(sArr).add(calculateY_FF3(blockCipher2, bArr, 4 - (i13 * 4), i12, sArr3, radixConverter2)).mod(calculateModUV[1 - i13]), i10, sArr);
            i12++;
            short[] sArr4 = sArr3;
            sArr3 = sArr;
            sArr = sArr4;
            blockCipher = blockCipher2;
            radixConverter = radixConverter2;
        }
        rev(sArr);
        rev(sArr3);
        return Arrays.concatenate(sArr, sArr3);
    }

    public static byte[] encryptFF1(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, byte[] bArr2, int i3, int i10) {
        checkArgs(blockCipher, true, radixConverter.getRadix(), bArr2, i3, i10);
        int i11 = i10 / 2;
        int i12 = i10 - i11;
        return toByte(encFF1(blockCipher, radixConverter, bArr, i10, i11, i12, toShort(bArr2, i3, i11), toShort(bArr2, i3 + i11, i12)));
    }

    public static short[] encryptFF1w(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, short[] sArr, int i3, int i10) {
        checkArgs(blockCipher, true, radixConverter.getRadix(), sArr, i3, i10);
        int i11 = i10 / 2;
        int i12 = i10 - i11;
        short[] sArr2 = new short[i11];
        short[] sArr3 = new short[i12];
        System.arraycopy(sArr, i3, sArr2, 0, i11);
        System.arraycopy(sArr, i3 + i11, sArr3, 0, i12);
        return encFF1(blockCipher, radixConverter, bArr, i10, i11, i12, sArr2, sArr3);
    }

    public static byte[] encryptFF3(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, byte[] bArr2, int i3, int i10) {
        checkArgs(blockCipher, false, radixConverter.getRadix(), bArr2, i3, i10);
        if (bArr.length == 8) {
            return implEncryptFF3(blockCipher, radixConverter, bArr, bArr2, i3, i10);
        }
        throw new IllegalArgumentException();
    }

    public static byte[] encryptFF3_1(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, byte[] bArr2, int i3, int i10) {
        checkArgs(blockCipher, false, radixConverter.getRadix(), bArr2, i3, i10);
        if (bArr.length == 7) {
            return encryptFF3(blockCipher, radixConverter, calculateTweak64_FF3_1(bArr), bArr2, i3, i10);
        }
        throw new IllegalArgumentException(StubApp.getString2(28874));
    }

    public static short[] encryptFF3_1w(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, short[] sArr, int i3, int i10) {
        checkArgs(blockCipher, false, radixConverter.getRadix(), sArr, i3, i10);
        if (bArr.length == 7) {
            return encryptFF3w(blockCipher, radixConverter, calculateTweak64_FF3_1(bArr), sArr, i3, i10);
        }
        throw new IllegalArgumentException(StubApp.getString2(28874));
    }

    public static short[] encryptFF3w(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, short[] sArr, int i3, int i10) {
        checkArgs(blockCipher, false, radixConverter.getRadix(), sArr, i3, i10);
        if (bArr.length == 8) {
            return implEncryptFF3w(blockCipher, radixConverter, bArr, sArr, i3, i10);
        }
        throw new IllegalArgumentException();
    }

    public static byte[] implDecryptFF3(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, byte[] bArr2, int i3, int i10) {
        int i11 = i10 / 2;
        int i12 = i10 - i11;
        return toByte(decFF3_1(blockCipher, radixConverter, bArr, i10, i11, i12, toShort(bArr2, i3, i12), toShort(bArr2, i3 + i12, i11)));
    }

    public static short[] implDecryptFF3w(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, short[] sArr, int i3, int i10) {
        int i11 = i10 / 2;
        int i12 = i10 - i11;
        short[] sArr2 = new short[i12];
        short[] sArr3 = new short[i11];
        System.arraycopy(sArr, i3, sArr2, 0, i12);
        System.arraycopy(sArr, i3 + i12, sArr3, 0, i11);
        return decFF3_1(blockCipher, radixConverter, bArr, i10, i11, i12, sArr2, sArr3);
    }

    public static byte[] implEncryptFF3(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, byte[] bArr2, int i3, int i10) {
        int i11 = i10 / 2;
        int i12 = i10 - i11;
        return toByte(encFF3_1(blockCipher, radixConverter, bArr, i10, i11, i12, toShort(bArr2, i3, i12), toShort(bArr2, i3 + i12, i11)));
    }

    public static short[] implEncryptFF3w(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, short[] sArr, int i3, int i10) {
        int i11 = i10 / 2;
        int i12 = i10 - i11;
        short[] sArr2 = new short[i12];
        short[] sArr3 = new short[i11];
        System.arraycopy(sArr, i3, sArr2, 0, i12);
        System.arraycopy(sArr, i3 + i12, sArr3, 0, i11);
        return encFF3_1(blockCipher, radixConverter, bArr, i10, i11, i12, sArr2, sArr3);
    }

    public static BigInteger num(byte[] bArr, int i3, int i10) {
        return new BigInteger(1, Arrays.copyOfRange(bArr, i3, i10 + i3));
    }

    public static byte[] prf(BlockCipher blockCipher, byte[] bArr) {
        if (bArr.length % 16 != 0) {
            throw new IllegalArgumentException();
        }
        int length = bArr.length / 16;
        byte[] bArr2 = new byte[16];
        for (int i3 = 0; i3 < length; i3++) {
            xor(bArr, i3 * 16, bArr2, 0, 16);
            blockCipher.processBlock(bArr2, 0, bArr2, 0);
        }
        return bArr2;
    }

    public static void rev(byte[] bArr) {
        int length = bArr.length / 2;
        int length2 = bArr.length - 1;
        for (int i3 = 0; i3 < length; i3++) {
            byte b2 = bArr[i3];
            int i10 = length2 - i3;
            bArr[i3] = bArr[i10];
            bArr[i10] = b2;
        }
    }

    private static byte[] toByte(short[] sArr) {
        int length = sArr.length;
        byte[] bArr = new byte[length];
        for (int i3 = 0; i3 != length; i3++) {
            bArr[i3] = (byte) sArr[i3];
        }
        return bArr;
    }

    private static short[] toShort(byte[] bArr, int i3, int i10) {
        short[] sArr = new short[i10];
        for (int i11 = 0; i11 != i10; i11++) {
            sArr[i11] = (short) (bArr[i3 + i11] & UByte.MAX_VALUE);
        }
        return sArr;
    }

    public static void xor(byte[] bArr, int i3, byte[] bArr2, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = i10 + i12;
            bArr2[i13] = (byte) (bArr2[i13] ^ bArr[i3 + i12]);
        }
    }

    public static void checkArgs(BlockCipher blockCipher, boolean z2, int i3, short[] sArr, int i10, int i11) {
        checkCipher(blockCipher);
        if (i3 < 2 || i3 > 65536) {
            throw new IllegalArgumentException();
        }
        checkData(z2, i3, sArr, i10, i11);
    }

    public static void checkData(boolean z2, int i3, short[] sArr, int i10, int i11) {
        checkLength(z2, i3, i11);
        for (int i12 = 0; i12 < i11; i12++) {
            if ((sArr[i10 + i12] & UShort.MAX_VALUE) >= i3) {
                throw new IllegalArgumentException(StubApp.getString2(28876));
            }
        }
    }

    public static void rev(short[] sArr) {
        int length = sArr.length / 2;
        int length2 = sArr.length - 1;
        for (int i3 = 0; i3 < length; i3++) {
            short s10 = sArr[i3];
            int i10 = length2 - i3;
            sArr[i3] = sArr[i10];
            sArr[i10] = s10;
        }
    }
}
