package org.bouncycastle.crypto.paddings;

import com.stub.StubApp;
import java.security.SecureRandom;
import kotlin.UByte;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class TBCPadding implements BlockCipherPadding {
    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int addPadding(byte[] bArr, int i3) {
        int length = bArr.length - i3;
        int i10 = 0;
        if (i3 <= 0 ? (bArr[bArr.length - 1] & 1) == 0 : (bArr[i3 - 1] & 1) == 0) {
            i10 = 255;
        }
        byte b2 = (byte) i10;
        while (i3 < bArr.length) {
            bArr[i3] = b2;
            i3++;
        }
        return length;
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public String getPaddingName() {
        return StubApp.getString2(29175);
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public void init(SecureRandom secureRandom) throws IllegalArgumentException {
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int padCount(byte[] bArr) throws InvalidCipherTextException {
        int length = bArr.length - 1;
        int i3 = bArr[length] & UByte.MAX_VALUE;
        int i10 = -1;
        int i11 = 1;
        while (true) {
            length--;
            if (length < 0) {
                return i11;
            }
            i10 &= (((bArr[length] & UByte.MAX_VALUE) ^ i3) - 1) >> 31;
            i11 -= i10;
        }
    }
}
