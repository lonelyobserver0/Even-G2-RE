package N5;

import com.stub.StubApp;
import kotlin.UByte;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f4897a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4898b;

    public g(int i3, int i10) {
        this.f4897a = i3;
        this.f4898b = i10;
    }

    public abstract byte[] a();

    public abstract byte[] b(int i3, byte[] bArr);

    public boolean c() {
        return false;
    }

    public g d() {
        throw new UnsupportedOperationException(StubApp.getString2(3762));
    }

    public final String toString() {
        int i3 = this.f4897a;
        byte[] bArr = new byte[i3];
        int i10 = this.f4898b;
        StringBuilder sb2 = new StringBuilder((i3 + 1) * i10);
        for (int i11 = 0; i11 < i10; i11++) {
            bArr = b(i11, bArr);
            for (int i12 = 0; i12 < i3; i12++) {
                int i13 = bArr[i12] & UByte.MAX_VALUE;
                sb2.append(i13 < 64 ? '#' : i13 < 128 ? '+' : i13 < 192 ? '.' : ' ');
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
