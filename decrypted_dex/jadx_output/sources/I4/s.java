package I4;

import java.util.ArrayList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public float f3211a;

    /* renamed from: b, reason: collision with root package name */
    public float f3212b;

    /* renamed from: c, reason: collision with root package name */
    public float f3213c;

    /* renamed from: d, reason: collision with root package name */
    public float f3214d;

    /* renamed from: e, reason: collision with root package name */
    public float f3215e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3216f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f3217g = new ArrayList();

    public s() {
        c(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f10) {
        float f11 = this.f3214d;
        if (f11 == f10) {
            return;
        }
        float f12 = ((f10 - f11) + 360.0f) % 360.0f;
        if (f12 > 180.0f) {
            return;
        }
        float f13 = this.f3212b;
        float f14 = this.f3213c;
        o oVar = new o(f13, f14, f13, f14);
        oVar.f3205f = this.f3214d;
        oVar.f3206g = f12;
        this.f3217g.add(new m(oVar));
        this.f3214d = f10;
    }

    public final void b(float f10, float f11) {
        p pVar = new p();
        pVar.f3207b = f10;
        pVar.f3208c = f11;
        this.f3216f.add(pVar);
        n nVar = new n(pVar, this.f3212b, this.f3213c);
        float b2 = nVar.b() + 270.0f;
        float b10 = nVar.b() + 270.0f;
        a(b2);
        this.f3217g.add(nVar);
        this.f3214d = b10;
        this.f3212b = f10;
        this.f3213c = f11;
    }

    public final void c(float f10, float f11, float f12) {
        this.f3211a = f10;
        this.f3212b = 0.0f;
        this.f3213c = f10;
        this.f3214d = f11;
        this.f3215e = (f11 + f12) % 360.0f;
        this.f3216f.clear();
        this.f3217g.clear();
    }
}
