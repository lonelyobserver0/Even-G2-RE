package aa;

import com.stub.StubApp;
import kotlin.UByte;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f9345a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f9346b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9347c;

    public f(byte[] bArr, byte[] bArr2) {
        this.f9347c = 0;
        if (bArr.length != bArr2.length && bArr.length == 1 && bArr[0] == 0) {
            bArr = new byte[bArr2.length];
        } else if (bArr.length != bArr2.length) {
            throw new IllegalArgumentException(StubApp.getString2(8607));
        }
        this.f9345a = new int[bArr.length];
        this.f9346b = new int[bArr2.length];
        for (int i3 = 0; i3 < bArr.length; i3++) {
            this.f9345a[i3] = bArr[i3] & UByte.MAX_VALUE;
            this.f9346b[i3] = bArr2[i3] & UByte.MAX_VALUE;
        }
        this.f9347c = bArr2.length;
    }
}
