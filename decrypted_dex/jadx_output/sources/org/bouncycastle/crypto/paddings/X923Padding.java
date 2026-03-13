package org.bouncycastle.crypto.paddings;

import com.stub.StubApp;
import java.security.SecureRandom;
import kotlin.UByte;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class X923Padding implements BlockCipherPadding {
    SecureRandom random = null;

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int addPadding(byte[] bArr, int i3) {
        byte length = (byte) (bArr.length - i3);
        while (i3 < bArr.length - 1) {
            SecureRandom secureRandom = this.random;
            if (secureRandom == null) {
                bArr[i3] = 0;
            } else {
                bArr[i3] = (byte) secureRandom.nextInt();
            }
            i3++;
        }
        bArr[i3] = length;
        return length;
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public String getPaddingName() {
        return StubApp.getString2(29176);
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public void init(SecureRandom secureRandom) throws IllegalArgumentException {
        this.random = secureRandom;
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int padCount(byte[] bArr) throws InvalidCipherTextException {
        int i3 = bArr[bArr.length - 1] & UByte.MAX_VALUE;
        if ((((bArr.length - i3) | (i3 - 1)) >> 31) == 0) {
            return i3;
        }
        throw new InvalidCipherTextException(StubApp.getString2(29165));
    }
}
