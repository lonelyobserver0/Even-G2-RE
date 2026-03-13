package z1;

import T0.H;
import r0.AbstractC1550k;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final H f23856a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f23857b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23858c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f23859d;

    /* renamed from: e, reason: collision with root package name */
    public int f23860e;

    /* renamed from: f, reason: collision with root package name */
    public int f23861f;

    /* renamed from: g, reason: collision with root package name */
    public long f23862g;

    /* renamed from: h, reason: collision with root package name */
    public long f23863h;

    public m(H h2) {
        this.f23856a = h2;
    }

    public final void a(int i3, int i10, byte[] bArr) {
        if (this.f23858c) {
            int i11 = this.f23861f;
            int i12 = (i3 + 1) - i11;
            if (i12 >= i10) {
                this.f23861f = (i10 - i3) + i11;
            } else {
                this.f23859d = ((bArr[i12] & 192) >> 6) == 0;
                this.f23858c = false;
            }
        }
    }

    public final void b(boolean z2, long j, int i3) {
        AbstractC1550k.g(this.f23863h != -9223372036854775807L);
        if (this.f23860e == 182 && z2 && this.f23857b) {
            this.f23856a.c(this.f23863h, this.f23859d ? 1 : 0, (int) (j - this.f23862g), i3, null);
        }
        if (this.f23860e != 179) {
            this.f23862g = j;
        }
    }
}
