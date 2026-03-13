package org.bouncycastle.crypto.paddings;

import com.stub.StubApp;
import java.security.SecureRandom;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ISO7816d4Padding implements BlockCipherPadding {
    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int addPadding(byte[] bArr, int i3) {
        int length = bArr.length - i3;
        bArr[i3] = ByteCompanionObject.MIN_VALUE;
        while (true) {
            i3++;
            if (i3 >= bArr.length) {
                return length;
            }
            bArr[i3] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public String getPaddingName() {
        return StubApp.getString2(29173);
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public void init(SecureRandom secureRandom) throws IllegalArgumentException {
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int padCount(byte[] bArr) throws InvalidCipherTextException {
        int length = bArr.length;
        int i3 = -1;
        int i10 = -1;
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            i3 ^= ((((r4 ^ 128) - 1) >> 31) & i10) & (length ^ i3);
            i10 &= ((bArr[length] & UByte.MAX_VALUE) - 1) >> 31;
        }
        if (i3 >= 0) {
            return bArr.length - i3;
        }
        throw new InvalidCipherTextException(StubApp.getString2(29165));
    }
}
