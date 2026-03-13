package A1;

import r0.C1553n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f implements n1.b {

    /* renamed from: a, reason: collision with root package name */
    public int f67a;

    /* renamed from: b, reason: collision with root package name */
    public int f68b;

    /* renamed from: c, reason: collision with root package name */
    public int f69c;

    /* renamed from: d, reason: collision with root package name */
    public int f70d;

    /* renamed from: e, reason: collision with root package name */
    public Object f71e;

    @Override // n1.b
    public int a() {
        return -1;
    }

    @Override // n1.b
    public int b() {
        return this.f67a;
    }

    @Override // n1.b
    public int c() {
        C1553n c1553n = (C1553n) this.f71e;
        int i3 = this.f68b;
        if (i3 == 8) {
            return c1553n.u();
        }
        if (i3 == 16) {
            return c1553n.A();
        }
        int i10 = this.f69c;
        this.f69c = i10 + 1;
        if (i10 % 2 != 0) {
            return this.f70d & 15;
        }
        int u2 = c1553n.u();
        this.f70d = u2;
        return (u2 & 240) >> 4;
    }
}
