package wa;

import Z9.C0367b;
import Z9.F;
import Z9.G;
import Z9.L;
import android.graphics.PointF;
import com.stub.StubApp;
import fa.C0935a;
import ha.C1013a;
import java.io.IOException;
import java.util.List;
import ta.C1747g;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class k extends j {

    /* renamed from: k, reason: collision with root package name */
    public final C0367b f22215k;

    /* renamed from: l, reason: collision with root package name */
    public final X9.b f22216l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f22217m;

    /* renamed from: n, reason: collision with root package name */
    public Float f22218n;

    /* renamed from: p, reason: collision with root package name */
    public Ia.b f22219p;

    /* renamed from: q, reason: collision with root package name */
    public final C1013a f22220q;

    /* renamed from: r, reason: collision with root package name */
    public C0935a f22221r;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k(oa.C1471d r7, wa.s r8) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wa.k.<init>(oa.d, wa.s):void");
    }

    @Override // wa.o
    public final Ia.b a() {
        List a3;
        if (this.f22219p == null) {
            C0367b c0367b = this.f22215k;
            if (c0367b != null) {
                a3 = c0367b.a();
            } else {
                try {
                    a3 = this.f22216l.a();
                } catch (IOException unused) {
                    return new Ia.b(0.001f, 0.0f, 0.0f, 0.001f, 0.0f, 0.0f);
                }
            }
            if (a3 == null || a3.size() != 6) {
                this.f22219p = new Ia.b(0.001f, 0.0f, 0.0f, 0.001f, 0.0f, 0.0f);
            } else {
                this.f22219p = new Ia.b(((Number) a3.get(0)).floatValue(), ((Number) a3.get(1)).floatValue(), ((Number) a3.get(2)).floatValue(), ((Number) a3.get(3)).floatValue(), ((Number) a3.get(4)).floatValue(), ((Number) a3.get(5)).floatValue());
            }
        }
        return this.f22219p;
    }

    @Override // wa.o
    public final C0935a b() {
        C0935a c0935a;
        if (this.f22221r == null) {
            if (k() != null) {
                C1747g a3 = k().a();
                if (a3.a() != 0.0f || a3.b() != 0.0f || a3.c() != 0.0f || a3.d() != 0.0f) {
                    c0935a = new C0935a(a3.a(), a3.b(), a3.c(), a3.d());
                    this.f22221r = c0935a;
                }
            }
            C0367b c0367b = this.f22215k;
            if (c0367b != null) {
                c0935a = c0367b.d();
            } else {
                try {
                    c0935a = this.f22216l.d();
                } catch (IOException unused) {
                    c0935a = new C0935a();
                }
            }
            this.f22221r = c0935a;
        }
        return this.f22221r;
    }

    @Override // wa.o
    public final float c(int i3) {
        float h2;
        int i10;
        int e10 = e(i3);
        C0367b c0367b = this.f22215k;
        if (c0367b != null) {
            G f10 = c0367b.f(e10);
            if (f10.f9093d == null) {
                f10.a();
            }
            i10 = f10.f9094e;
        } else {
            boolean z2 = this.f22217m;
            X9.b bVar = this.f22216l;
            if (!z2 || !(bVar instanceof F)) {
                String r8 = this.f22207a.r(i3);
                h2 = bVar.h(r8 == null ? StubApp.getString2(7719) : Tc.d.k(r8.codePointAt(0)));
                PointF pointF = new PointF(h2, 0.0f);
                C1013a c1013a = this.f22220q;
                c1013a.getClass();
                double d8 = pointF.x;
                double d10 = c1013a.f14471a * d8;
                double d11 = pointF.y;
                pointF.set((float) ((c1013a.f14473c * d11) + d10 + c1013a.f14475e), (float) ((d11 * c1013a.f14474d) + (d8 * c1013a.f14472b) + c1013a.f14476f));
                return pointF.x;
            }
            F f11 = (F) bVar;
            f11.getClass();
            L f12 = f11.f(e10, StubApp.getString2(23980) + e10);
            if (f12.f9093d == null) {
                f12.a();
            }
            i10 = f12.f9094e;
        }
        h2 = i10;
        PointF pointF2 = new PointF(h2, 0.0f);
        C1013a c1013a2 = this.f22220q;
        c1013a2.getClass();
        double d82 = pointF2.x;
        double d102 = c1013a2.f14471a * d82;
        double d112 = pointF2.y;
        pointF2.set((float) ((c1013a2.f14473c * d112) + d102 + c1013a2.f14475e), (float) ((d112 * c1013a2.f14474d) + (d82 * c1013a2.f14472b) + c1013a2.f14476f));
        return pointF2.x;
    }

    @Override // wa.o
    public final boolean d() {
        return this.f22217m;
    }

    @Override // wa.j
    public final int e(int i3) {
        return this.f22207a.f22254l.b(i3);
    }

    @Override // wa.j
    public final int f(int i3) {
        int e10 = e(i3);
        C0367b c0367b = this.f22215k;
        return c0367b != null ? c0367b.f9125c.c(e10) : e10;
    }

    @Override // wa.j
    public final float g() {
        if (this.f22218n == null) {
            this.f22218n = Float.valueOf(500.0f);
        }
        return this.f22218n.floatValue();
    }
}
