package org.bouncycastle.math.ec.rfc7748;

import java.security.SecureRandom;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import org.bouncycastle.math.ec.rfc8032.Ed25519;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class X25519 {
    private static final int C_A = 486662;
    private static final int C_A24 = 121666;
    public static final int POINT_SIZE = 32;
    public static final int SCALAR_SIZE = 32;

    public static class F extends X25519Field {
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
        return !Arrays.areAllZeroes(bArr3, i11, 32);
    }

    private static int decode32(byte[] bArr, int i3) {
        return (bArr[i3 + 3] << 24) | (bArr[i3] & UByte.MAX_VALUE) | ((bArr[i3 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i3 + 2] & UByte.MAX_VALUE) << 16);
    }

    private static void decodeScalar(byte[] bArr, int i3, int[] iArr) {
        for (int i10 = 0; i10 < 8; i10++) {
            iArr[i10] = decode32(bArr, (i10 * 4) + i3);
        }
        iArr[0] = iArr[0] & (-8);
        int i11 = iArr[7] & IntCompanionObject.MAX_VALUE;
        iArr[7] = i11;
        iArr[7] = i11 | 1073741824;
    }

    public static void generatePrivateKey(SecureRandom secureRandom, byte[] bArr) {
        secureRandom.nextBytes(bArr);
        bArr[0] = (byte) (bArr[0] & 248);
        byte b2 = (byte) (bArr[31] & ByteCompanionObject.MAX_VALUE);
        bArr[31] = b2;
        bArr[31] = (byte) (b2 | 64);
    }

    public static void generatePublicKey(byte[] bArr, int i3, byte[] bArr2, int i10) {
        scalarMultBase(bArr, i3, bArr2, i10);
    }

    private static void pointDouble(int[] iArr, int[] iArr2) {
        int[] create = X25519Field.create();
        int[] create2 = X25519Field.create();
        X25519Field.apm(iArr, iArr2, create, create2);
        X25519Field.sqr(create, create);
        X25519Field.sqr(create2, create2);
        X25519Field.mul(create, create2, iArr);
        X25519Field.sub(create, create2, create);
        X25519Field.mul(create, C_A24, iArr2);
        X25519Field.add(iArr2, create2, iArr2);
        X25519Field.mul(iArr2, create, iArr2);
    }

    public static void precompute() {
        Ed25519.precompute();
    }

    public static void scalarMult(byte[] bArr, int i3, byte[] bArr2, int i10, byte[] bArr3, int i11) {
        int[] iArr = new int[8];
        decodeScalar(bArr, i3, iArr);
        int[] create = X25519Field.create();
        X25519Field.decode(bArr2, i10, create);
        int[] create2 = X25519Field.create();
        X25519Field.copy(create, 0, create2, 0);
        int[] create3 = X25519Field.create();
        create3[0] = 1;
        int[] create4 = X25519Field.create();
        create4[0] = 1;
        int[] create5 = X25519Field.create();
        int[] create6 = X25519Field.create();
        int[] create7 = X25519Field.create();
        int i12 = 254;
        int i13 = 1;
        while (true) {
            X25519Field.apm(create4, create5, create6, create4);
            X25519Field.apm(create2, create3, create5, create2);
            X25519Field.mul(create6, create2, create6);
            X25519Field.mul(create4, create5, create4);
            X25519Field.sqr(create5, create5);
            X25519Field.sqr(create2, create2);
            X25519Field.sub(create5, create2, create7);
            X25519Field.mul(create7, C_A24, create3);
            X25519Field.add(create3, create2, create3);
            X25519Field.mul(create3, create7, create3);
            X25519Field.mul(create2, create5, create2);
            X25519Field.apm(create6, create4, create4, create5);
            X25519Field.sqr(create4, create4);
            X25519Field.sqr(create5, create5);
            X25519Field.mul(create5, create, create5);
            i12--;
            int i14 = (iArr[i12 >>> 5] >>> (i12 & 31)) & 1;
            int i15 = i13 ^ i14;
            X25519Field.cswap(i15, create2, create4);
            X25519Field.cswap(i15, create3, create5);
            if (i12 < 3) {
                break;
            } else {
                i13 = i14;
            }
        }
        for (int i16 = 0; i16 < 3; i16++) {
            pointDouble(create2, create3);
        }
        X25519Field.inv(create3, create3);
        X25519Field.mul(create2, create3, create2);
        X25519Field.normalize(create2);
        X25519Field.encode(create2, bArr3, i11);
    }

    public static void scalarMultBase(byte[] bArr, int i3, byte[] bArr2, int i10) {
        int[] create = X25519Field.create();
        int[] create2 = X25519Field.create();
        Ed25519.scalarMultBaseYZ(Friend.INSTANCE, bArr, i3, create, create2);
        X25519Field.apm(create2, create, create, create2);
        X25519Field.inv(create2, create2);
        X25519Field.mul(create, create2, create);
        X25519Field.normalize(create);
        X25519Field.encode(create, bArr2, i10);
    }
}
