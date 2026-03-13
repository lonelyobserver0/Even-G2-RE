package z1;

import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f23829e = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f23830a;

    /* renamed from: b, reason: collision with root package name */
    public int f23831b;

    /* renamed from: c, reason: collision with root package name */
    public int f23832c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f23833d;

    public final void a(int i3, int i10, byte[] bArr) {
        if (this.f23830a) {
            int i11 = i10 - i3;
            byte[] bArr2 = this.f23833d;
            int length = bArr2.length;
            int i12 = this.f23831b + i11;
            if (length < i12) {
                this.f23833d = Arrays.copyOf(bArr2, i12 * 2);
            }
            System.arraycopy(bArr, i3, this.f23833d, this.f23831b, i11);
            this.f23831b += i11;
        }
    }
}
