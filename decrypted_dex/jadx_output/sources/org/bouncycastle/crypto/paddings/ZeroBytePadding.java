package org.bouncycastle.crypto.paddings;

import com.stub.StubApp;
import java.security.SecureRandom;
import kotlin.UByte;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ZeroBytePadding implements BlockCipherPadding {
    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int addPadding(byte[] bArr, int i3) {
        int length = bArr.length - i3;
        while (i3 < bArr.length) {
            bArr[i3] = 0;
            i3++;
        }
        return length;
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public String getPaddingName() {
        return StubApp.getString2(29177);
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public void init(SecureRandom secureRandom) throws IllegalArgumentException {
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int padCount(byte[] bArr) throws InvalidCipherTextException {
        int length = bArr.length;
        int i3 = 0;
        int i10 = -1;
        while (true) {
            length--;
            if (length < 0) {
                return i3;
            }
            i10 &= ((bArr[length] & UByte.MAX_VALUE) - 1) >> 31;
            i3 -= i10;
        }
    }
}
