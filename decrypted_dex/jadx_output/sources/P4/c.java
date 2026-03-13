package P4;

import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f5538a;

    static {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i3 = 0; i3 < 10; i3++) {
            bArr[i3 + 48] = (byte) i3;
        }
        for (int i10 = 0; i10 < 26; i10++) {
            byte b2 = (byte) (i10 + 10);
            bArr[i10 + 65] = b2;
            bArr[i10 + 97] = b2;
        }
        f5538a = bArr;
    }
}
