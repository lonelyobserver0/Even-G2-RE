package y0;

import L0.Z;
import o0.C1438m;
import r0.AbstractC1560u;
import v0.C1803F;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class j implements Z {

    /* renamed from: a, reason: collision with root package name */
    public final C1438m f23419a;

    /* renamed from: c, reason: collision with root package name */
    public long[] f23421c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f23422d;

    /* renamed from: e, reason: collision with root package name */
    public z0.g f23423e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23424f;

    /* renamed from: g, reason: collision with root package name */
    public int f23425g;

    /* renamed from: b, reason: collision with root package name */
    public final Y.m f23420b = new Y.m(10);

    /* renamed from: h, reason: collision with root package name */
    public long f23426h = -9223372036854775807L;

    public j(z0.g gVar, C1438m c1438m, boolean z2) {
        this.f23419a = c1438m;
        this.f23423e = gVar;
        this.f23421c = gVar.f23675b;
        b(gVar, z2);
    }

    @Override // L0.Z
    public final void a() {
    }

    public final void b(z0.g gVar, boolean z2) {
        int i3 = this.f23425g;
        long j = -9223372036854775807L;
        long j3 = i3 == 0 ? -9223372036854775807L : this.f23421c[i3 - 1];
        this.f23422d = z2;
        this.f23423e = gVar;
        long[] jArr = gVar.f23675b;
        this.f23421c = jArr;
        long j10 = this.f23426h;
        if (j10 == -9223372036854775807L) {
            if (j3 != -9223372036854775807L) {
                this.f23425g = AbstractC1560u.a(jArr, j3, false);
            }
        } else {
            int a3 = AbstractC1560u.a(jArr, j10, true);
            this.f23425g = a3;
            if (this.f23422d && a3 == this.f23421c.length) {
                j = j10;
            }
            this.f23426h = j;
        }
    }

    @Override // L0.Z
    public final boolean h() {
        return true;
    }

    @Override // L0.Z
    public final int i(C1803F c1803f, u0.e eVar, int i3) {
        int i10 = this.f23425g;
        boolean z2 = i10 == this.f23421c.length;
        if (z2 && !this.f23422d) {
            eVar.f3376b = 4;
            return -4;
        }
        if ((i3 & 2) != 0 || !this.f23424f) {
            c1803f.f21582b = this.f23419a;
            this.f23424f = true;
            return -5;
        }
        if (z2) {
            return -3;
        }
        if ((i3 & 1) == 0) {
            this.f23425g = i10 + 1;
        }
        if ((i3 & 4) == 0) {
            byte[] l9 = this.f23420b.l(this.f23423e.f23674a[i10]);
            eVar.u(l9.length);
            eVar.f21396e.put(l9);
        }
        eVar.f21398g = this.f23421c[i10];
        eVar.f3376b = 1;
        return -4;
    }

    @Override // L0.Z
    public final int m(long j) {
        int max = Math.max(this.f23425g, AbstractC1560u.a(this.f23421c, j, true));
        int i3 = max - this.f23425g;
        this.f23425g = max;
        return i3;
    }
}
