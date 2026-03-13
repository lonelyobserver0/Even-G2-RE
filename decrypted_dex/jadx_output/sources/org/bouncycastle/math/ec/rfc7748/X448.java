package org.bouncycastle.math.ec.rfc7748;

import java.security.SecureRandom;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.math.ec.rfc8032.Ed448;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class X448 {
    private static final int C_A = 156326;
    private static final int C_A24 = 39082;
    public static final int POINT_SIZE = 56;
    public static final int SCALAR_SIZE = 56;

    public static class F extends X448Field {
        private F() {
        }
    }

    public static class Friend {
        private static final Friend INSTANCE = new Friend();

        private Friend() {
        }
    }

    public static boolean calculateAgreement(byte[] bArr, int i3, byte[] bArr2, int i10, byte[] bArr3, int i11) {
        scalarMult(bArr, i3, bArr2, i10, bArr3, i11);
        return !Arrays.areAllZeroes(bArr3, i11, 56);
    }

    private static int decode32(byte[] bArr, int i3) {
        return (bArr[i3 + 3] << 24) | (bArr[i3] & UByte.MAX_VALUE) | ((bArr[i3 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i3 + 2] & UByte.MAX_VALUE) << 16);
    }

    private static void decodeScalar(byte[] bArr, int i3, int[] iArr) {
        for (int i10 = 0; i10 < 14; i10++) {
            iArr[i10] = decode32(bArr, (i10 * 4) + i3);
        }
        iArr[0] = iArr[0] & (-4);
        iArr[13] = iArr[13] | Integer.MIN_VALUE;
    }

    public static void generatePrivateKey(SecureRandom secureRandom, byte[] bArr) {
        secureRandom.nextBytes(bArr);
        bArr[0] = (byte) (bArr[0] & 252);
        bArr[55] = (byte) (bArr[55] | ByteCompanionObject.MIN_VALUE);
    }

    public static void generatePublicKey(byte[] bArr, int i3, byte[] bArr2, int i10) {
        scalarMultBase(bArr, i3, bArr2, i10);
    }

    private static void pointDouble(int[] iArr, int[] iArr2) {
        int[] create = X448Field.create();
        int[] create2 = X448Field.create();
        X448Field.add(iArr, iArr2, create);
        X448Field.sub(iArr, iArr2, create2);
        X448Field.sqr(create, create);
        X448Field.sqr(create2, create2);
        X448Field.mul(create, create2, iArr);
        X448Field.sub(create, create2, create);
        X448Field.mul(create, C_A24, iArr2);
        X448Field.add(iArr2, create2, iArr2);
        X448Field.mul(iArr2, create, iArr2);
    }

    public static void precompute() {
        Ed448.precompute();
    }

    public static void scalarMult(byte[] bArr, int i3, byte[] bArr2, int i10, byte[] bArr3, int i11) {
        int[] iArr = new int[14];
        decodeScalar(bArr, i3, iArr);
        int[] create = X448Field.create();
        X448Field.decode(bArr2, i10, create);
        int[] create2 = X448Field.create();
        X448Field.copy(create, 0, create2, 0);
        int[] create3 = X448Field.create();
        create3[0] = 1;
        int[] create4 = X448Field.create();
        create4[0] = 1;
        int[] create5 = X448Field.create();
        int[] create6 = X448Field.create();
        int[] create7 = X448Field.create();
        int i12 = 447;
        int i13 = 1;
        while (true) {
            X448Field.add(create4, create5, create6);
            X448Field.sub(create4, create5, create4);
            X448Field.add(create2, create3, create5);
            X448Field.sub(create2, create3, create2);
            X448Field.mul(create6, create2, create6);
            X448Field.mul(create4, create5, create4);
            X448Field.sqr(create5, create5);
            X448Field.sqr(create2, create2);
            X448Field.sub(create5, create2, create7);
            X448Field.mul(create7, C_A24, create3);
            X448Field.add(create3, create2, create3);
            X448Field.mul(create3, create7, create3);
            X448Field.mul(create2, create5, create2);
            X448Field.sub(create6, create4, create5);
            X448Field.add(create6, create4, create4);
            X448Field.sqr(create4, create4);
            X448Field.sqr(create5, create5);
            X448Field.mul(create5, create, create5);
            i12--;
            int i14 = (iArr[i12 >>> 5] >>> (i12 & 31)) & 1;
            int i15 = i13 ^ i14;
            X448Field.cswap(i15, create2, create4);
            X448Field.cswap(i15, create3, create5);
            if (i12 < 2) {
                break;
            } else {
                i13 = i14;
            }
        }
        for (int i16 = 0; i16 < 2; i16++) {
            pointDouble(create2, create3);
        }
        X448Field.inv(create3, create3);
        X448Field.mul(create2, create3, create2);
        X448Field.normalize(create2);
        X448Field.encode(create2, bArr3, i11);
    }

    public static void scalarMultBase(byte[] bArr, int i3, byte[] bArr2, int i10) {
        int[] create = X448Field.create();
        int[] create2 = X448Field.create();
        Ed448.scalarMultBaseXY(Friend.INSTANCE, bArr, i3, create, create2);
        X448Field.inv(create, create);
        X448Field.mul(create, create2, create);
        X448Field.sqr(create, create);
        X448Field.normalize(create);
        X448Field.encode(create, bArr2, i10);
    }
}
