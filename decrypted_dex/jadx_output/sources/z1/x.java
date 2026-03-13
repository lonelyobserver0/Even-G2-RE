package z1;

import T0.J;
import com.stub.StubApp;
import p0.AbstractC1482f;
import r0.AbstractC1550k;
import r0.C1553n;
import r0.C1558s;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class x implements InterfaceC1995G {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2004i f24003a;

    /* renamed from: b, reason: collision with root package name */
    public final J f24004b = new J(new byte[10], 10);

    /* renamed from: c, reason: collision with root package name */
    public int f24005c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f24006d;

    /* renamed from: e, reason: collision with root package name */
    public C1558s f24007e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f24008f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f24009g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f24010h;

    /* renamed from: i, reason: collision with root package name */
    public int f24011i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f24012k;

    /* renamed from: l, reason: collision with root package name */
    public long f24013l;

    public x(InterfaceC2004i interfaceC2004i) {
        this.f24003a = interfaceC2004i;
    }

    @Override // z1.InterfaceC1995G
    public final void a() {
        this.f24005c = 0;
        this.f24006d = 0;
        this.f24010h = false;
        this.f24003a.a();
    }

    @Override // z1.InterfaceC1995G
    public final void b(C1558s c1558s, T0.q qVar, C1994F c1994f) {
        this.f24007e = c1558s;
        this.f24003a.f(qVar, c1994f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [T0.J] */
    /* JADX WARN: Type inference failed for: r3v0, types: [z1.i] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    @Override // z1.InterfaceC1995G
    public final void c(int i3, C1553n c1553n) {
        int i10;
        int i11;
        int i12;
        AbstractC1550k.h(this.f24007e);
        int i13 = i3 & 1;
        ?? r32 = this.f24003a;
        String string2 = StubApp.getString2(24884);
        int i14 = 2;
        ?? r92 = 0;
        if (i13 != 0) {
            int i15 = this.f24005c;
            if (i15 != 0 && i15 != 1) {
                if (i15 == 2) {
                    AbstractC1550k.w(string2, StubApp.getString2(24887));
                } else {
                    if (i15 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.j != -1) {
                        AbstractC1550k.w(string2, StubApp.getString2(24885) + this.j + StubApp.getString2(24886));
                    }
                    r32.d(c1553n.f20178c == 0);
                }
            }
            this.f24005c = 1;
            this.f24006d = 0;
        }
        int i16 = i3;
        while (c1553n.a() > 0) {
            int i17 = this.f24005c;
            if (i17 != 0) {
                ?? r11 = this.f24004b;
                if (i17 != 1) {
                    if (i17 == i14) {
                        if (d(c1553n, r11.f6949b, Math.min(10, this.f24011i)) && d(c1553n, null, this.f24011i)) {
                            r11.q(r92);
                            this.f24013l = -9223372036854775807L;
                            if (this.f24008f) {
                                r11.t(4);
                                r11.t(1);
                                r11.t(1);
                                long i18 = (r11.i(15) << 15) | (r11.i(3) << 30) | r11.i(15);
                                r11.t(1);
                                if (!this.f24010h && this.f24009g) {
                                    r11.t(4);
                                    r11.t(1);
                                    r11.t(1);
                                    r11.t(1);
                                    this.f24007e.b((r11.i(3) << 30) | (r11.i(15) << 15) | r11.i(15));
                                    this.f24010h = true;
                                }
                                this.f24013l = this.f24007e.b(i18);
                            }
                            i16 |= this.f24012k ? 4 : 0;
                            r32.e(i16, this.f24013l);
                            this.f24005c = 3;
                            this.f24006d = 0;
                            r92 = 0;
                            i14 = 2;
                        }
                    } else {
                        if (i17 != 3) {
                            throw new IllegalStateException();
                        }
                        int a3 = c1553n.a();
                        int i19 = this.j;
                        int i20 = i19 == -1 ? r92 : a3 - i19;
                        if (i20 > 0) {
                            a3 -= i20;
                            c1553n.F(c1553n.f20177b + a3);
                        }
                        r32.c(c1553n);
                        int i21 = this.j;
                        if (i21 != -1) {
                            int i22 = i21 - a3;
                            this.j = i22;
                            if (i22 == 0) {
                                r32.d(r92);
                                this.f24005c = 1;
                                this.f24006d = r92;
                            }
                        }
                    }
                    i10 = i14;
                    i11 = r92;
                } else {
                    i11 = r92;
                    if (d(c1553n, r11.f6949b, 9)) {
                        r11.q(i11);
                        int i23 = r11.i(24);
                        if (i23 != 1) {
                            AbstractC1482f.p(i23, StubApp.getString2(24888), string2);
                            this.j = -1;
                            i12 = 0;
                            i10 = 2;
                        } else {
                            r11.t(8);
                            int i24 = r11.i(16);
                            r11.t(5);
                            this.f24012k = r11.h();
                            i10 = 2;
                            r11.t(2);
                            this.f24008f = r11.h();
                            this.f24009g = r11.h();
                            r11.t(6);
                            int i25 = r11.i(8);
                            this.f24011i = i25;
                            if (i24 == 0) {
                                this.j = -1;
                            } else {
                                int i26 = (i24 - 3) - i25;
                                this.j = i26;
                                if (i26 < 0) {
                                    AbstractC1550k.w(string2, StubApp.getString2(24889) + this.j);
                                    this.j = -1;
                                }
                            }
                            i12 = 2;
                        }
                        this.f24005c = i12;
                        i11 = 0;
                        this.f24006d = 0;
                    } else {
                        i10 = 2;
                    }
                }
            } else {
                i10 = i14;
                i11 = r92;
                c1553n.H(c1553n.a());
            }
            r92 = i11;
            i14 = i10;
        }
    }

    public final boolean d(C1553n c1553n, byte[] bArr, int i3) {
        int min = Math.min(c1553n.a(), i3 - this.f24006d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            c1553n.H(min);
        } else {
            c1553n.f(this.f24006d, min, bArr);
        }
        int i10 = this.f24006d + min;
        this.f24006d = i10;
        return i10 == i3;
    }
}
