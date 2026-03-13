package org.bouncycastle.pqc.crypto.sphincs;

import com.stub.StubApp;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class Permute {
    private static final int CHACHA_ROUNDS = 12;

    public static void permute(int i3, int[] iArr) {
        int i10 = 16;
        if (iArr.length != 16) {
            throw new IllegalArgumentException();
        }
        if (i3 % 2 != 0) {
            throw new IllegalArgumentException(StubApp.getString2(28577));
        }
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        char c10 = 3;
        int i14 = iArr[3];
        char c11 = 4;
        int i15 = iArr[4];
        char c12 = 5;
        int i16 = iArr[5];
        char c13 = 6;
        int i17 = iArr[6];
        int i18 = 7;
        int i19 = iArr[7];
        int i20 = 8;
        int i21 = iArr[8];
        int i22 = iArr[9];
        int i23 = iArr[10];
        int i24 = iArr[11];
        int i25 = iArr[12];
        int i26 = iArr[13];
        int i27 = iArr[14];
        int i28 = iArr[15];
        int i29 = i27;
        int i30 = i26;
        int i31 = i25;
        int i32 = i24;
        int i33 = i23;
        int i34 = i22;
        int i35 = i21;
        int i36 = i19;
        int i37 = i17;
        int i38 = i16;
        int i39 = i15;
        int i40 = i14;
        int i41 = i13;
        int i42 = i12;
        int i43 = i11;
        int i44 = i3;
        while (i44 > 0) {
            int i45 = i43 + i39;
            char c14 = c10;
            int rotl = rotl(i31 ^ i45, i10);
            int i46 = i35 + rotl;
            int rotl2 = rotl(i39 ^ i46, 12);
            int i47 = i45 + rotl2;
            int rotl3 = rotl(rotl ^ i47, i20);
            int i48 = i46 + rotl3;
            int rotl4 = rotl(rotl2 ^ i48, i18);
            int i49 = i42 + i38;
            char c15 = c11;
            int rotl5 = rotl(i30 ^ i49, i10);
            int i50 = i34 + rotl5;
            int rotl6 = rotl(i38 ^ i50, 12);
            int i51 = i49 + rotl6;
            int rotl7 = rotl(rotl5 ^ i51, i20);
            int i52 = i50 + rotl7;
            int rotl8 = rotl(rotl6 ^ i52, i18);
            int i53 = i41 + i37;
            char c16 = c12;
            int rotl9 = rotl(i29 ^ i53, i10);
            int i54 = i33 + rotl9;
            char c17 = c13;
            int rotl10 = rotl(i37 ^ i54, 12);
            int i55 = i53 + rotl10;
            int rotl11 = rotl(rotl9 ^ i55, i20);
            int i56 = i54 + rotl11;
            int rotl12 = rotl(rotl10 ^ i56, i18);
            int i57 = i40 + i36;
            int rotl13 = rotl(i28 ^ i57, i10);
            int i58 = i32 + rotl13;
            int rotl14 = rotl(i36 ^ i58, 12);
            int i59 = i57 + rotl14;
            int rotl15 = rotl(rotl13 ^ i59, i20);
            int i60 = i58 + rotl15;
            int rotl16 = rotl(rotl14 ^ i60, 7);
            int i61 = i47 + rotl8;
            int rotl17 = rotl(rotl15 ^ i61, 16);
            int i62 = i56 + rotl17;
            int rotl18 = rotl(rotl8 ^ i62, 12);
            i43 = i61 + rotl18;
            i28 = rotl(rotl17 ^ i43, 8);
            i33 = i62 + i28;
            i38 = rotl(rotl18 ^ i33, 7);
            int i63 = i51 + rotl12;
            int rotl19 = rotl(rotl3 ^ i63, 16);
            int i64 = i60 + rotl19;
            int rotl20 = rotl(rotl12 ^ i64, 12);
            i42 = i63 + rotl20;
            i31 = rotl(rotl19 ^ i42, 8);
            i32 = i64 + i31;
            i37 = rotl(rotl20 ^ i32, 7);
            int i65 = i55 + rotl16;
            int rotl21 = rotl(rotl7 ^ i65, 16);
            int i66 = i48 + rotl21;
            int rotl22 = rotl(rotl16 ^ i66, 12);
            i41 = i65 + rotl22;
            i30 = rotl(rotl21 ^ i41, 8);
            i35 = i66 + i30;
            i36 = rotl(rotl22 ^ i35, 7);
            int i67 = i59 + rotl4;
            int rotl23 = rotl(rotl11 ^ i67, 16);
            int i68 = i52 + rotl23;
            int rotl24 = rotl(rotl4 ^ i68, 12);
            i40 = i67 + rotl24;
            i29 = rotl(rotl23 ^ i40, 8);
            i34 = i68 + i29;
            i39 = rotl(rotl24 ^ i34, 7);
            i44 -= 2;
            i18 = 7;
            i10 = 16;
            c10 = c14;
            c11 = c15;
            c12 = c16;
            c13 = c17;
            i20 = 8;
        }
        iArr[0] = i43;
        iArr[1] = i42;
        iArr[2] = i41;
        iArr[c10] = i40;
        iArr[c11] = i39;
        iArr[c12] = i38;
        iArr[c13] = i37;
        iArr[i18] = i36;
        iArr[8] = i35;
        iArr[9] = i34;
        iArr[10] = i33;
        iArr[11] = i32;
        iArr[12] = i31;
        iArr[13] = i30;
        iArr[14] = i29;
        iArr[15] = i28;
    }

    public static int rotl(int i3, int i10) {
        return (i3 >>> (-i10)) | (i3 << i10);
    }

    public void chacha_permute(byte[] bArr, byte[] bArr2) {
        int[] iArr = new int[16];
        for (int i3 = 0; i3 < 16; i3++) {
            iArr[i3] = Pack.littleEndianToInt(bArr2, i3 * 4);
        }
        permute(12, iArr);
        for (int i10 = 0; i10 < 16; i10++) {
            Pack.intToLittleEndian(iArr[i10], bArr, i10 * 4);
        }
    }
}
