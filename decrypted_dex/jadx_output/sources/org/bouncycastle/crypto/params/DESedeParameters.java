package org.bouncycastle.crypto.params;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DESedeParameters extends DESParameters {
    public static final int DES_EDE_KEY_LENGTH = 24;

    public DESedeParameters(byte[] bArr) {
        super(bArr);
        if (isWeakKey(bArr, 0, bArr.length)) {
            throw new IllegalArgumentException(StubApp.getString2(29182));
        }
    }

    public static boolean isReal2Key(byte[] bArr, int i3) {
        boolean z2 = false;
        for (int i10 = i3; i10 != i3 + 8; i10++) {
            if (bArr[i10] != bArr[i10 + 8]) {
                z2 = true;
            }
        }
        return z2;
    }

    public static boolean isReal3Key(byte[] bArr, int i3) {
        int i10 = i3;
        boolean z2 = false;
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            boolean z12 = true;
            if (i10 == i3 + 8) {
                break;
            }
            byte b2 = bArr[i10];
            byte b10 = bArr[i10 + 8];
            z2 |= b2 != b10;
            byte b11 = bArr[i10 + 16];
            z10 |= b2 != b11;
            if (b10 == b11) {
                z12 = false;
            }
            z11 |= z12;
            i10++;
        }
        return z2 && z10 && z11;
    }

    public static boolean isRealEDEKey(byte[] bArr, int i3) {
        return bArr.length == 16 ? isReal2Key(bArr, i3) : isReal3Key(bArr, i3);
    }

    public static boolean isWeakKey(byte[] bArr, int i3) {
        return isWeakKey(bArr, i3, bArr.length - i3);
    }

    public static boolean isWeakKey(byte[] bArr, int i3, int i10) {
        while (i3 < i10) {
            if (DESParameters.isWeakKey(bArr, i3)) {
                return true;
            }
            i3 += 8;
        }
        return false;
    }
}
