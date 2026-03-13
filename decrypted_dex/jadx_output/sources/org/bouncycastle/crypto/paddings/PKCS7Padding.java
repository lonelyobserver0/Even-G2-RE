package org.bouncycastle.crypto.paddings;

import com.stub.StubApp;
import java.security.SecureRandom;
import kotlin.UByte;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PKCS7Padding implements BlockCipherPadding {
    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int addPadding(byte[] bArr, int i3) {
        byte length = (byte) (bArr.length - i3);
        while (i3 < bArr.length) {
            bArr[i3] = length;
            i3++;
        }
        return length;
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public String getPaddingName() {
        return StubApp.getString2(29174);
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public void init(SecureRandom secureRandom) throws IllegalArgumentException {
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int padCount(byte[] bArr) throws InvalidCipherTextException {
        byte b2 = bArr[bArr.length - 1];
        int i3 = b2 & UByte.MAX_VALUE;
        int length = bArr.length - i3;
        int i10 = ((i3 - 1) | length) >> 31;
        for (int i11 = 0; i11 < bArr.length; i11++) {
            i10 |= (bArr[i11] ^ b2) & (~((i11 - length) >> 31));
        }
        if (i10 == 0) {
            return i3;
        }
        throw new InvalidCipherTextException(StubApp.getString2(29165));
    }
}
