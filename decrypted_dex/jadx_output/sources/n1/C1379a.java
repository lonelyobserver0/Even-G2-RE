package n1;

import T0.AbstractC0311b;
import com.stub.StubApp;
import r0.C1553n;

/* renamed from: n1.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1379a {

    /* renamed from: a, reason: collision with root package name */
    public final int f17640a;

    /* renamed from: b, reason: collision with root package name */
    public int f17641b;

    /* renamed from: c, reason: collision with root package name */
    public int f17642c;

    /* renamed from: d, reason: collision with root package name */
    public long f17643d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f17644e;

    /* renamed from: f, reason: collision with root package name */
    public final C1553n f17645f;

    /* renamed from: g, reason: collision with root package name */
    public final C1553n f17646g;

    /* renamed from: h, reason: collision with root package name */
    public int f17647h;

    /* renamed from: i, reason: collision with root package name */
    public int f17648i;

    public C1379a(C1553n c1553n, C1553n c1553n2, boolean z2) {
        this.f17646g = c1553n;
        this.f17645f = c1553n2;
        this.f17644e = z2;
        c1553n2.G(12);
        this.f17640a = c1553n2.y();
        c1553n.G(12);
        this.f17648i = c1553n.y();
        AbstractC0311b.e(StubApp.getString2(21259), c1553n.h() == 1);
        this.f17641b = -1;
    }

    public final boolean a() {
        int i3 = this.f17641b + 1;
        this.f17641b = i3;
        if (i3 == this.f17640a) {
            return false;
        }
        boolean z2 = this.f17644e;
        C1553n c1553n = this.f17645f;
        this.f17643d = z2 ? c1553n.z() : c1553n.w();
        if (this.f17641b == this.f17647h) {
            C1553n c1553n2 = this.f17646g;
            this.f17642c = c1553n2.y();
            c1553n2.H(4);
            int i10 = this.f17648i - 1;
            this.f17648i = i10;
            this.f17647h = i10 > 0 ? c1553n2.y() - 1 : -1;
        }
        return true;
    }
}
