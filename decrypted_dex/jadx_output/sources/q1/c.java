package q1;

import c5.B;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class c extends u0.f implements d {

    /* renamed from: e, reason: collision with root package name */
    public d f19886e;

    /* renamed from: f, reason: collision with root package name */
    public long f19887f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19888g = 1;

    /* renamed from: h, reason: collision with root package name */
    public Object f19889h;

    public /* synthetic */ c() {
        super(5);
    }

    @Override // q1.d
    public final int d(long j) {
        d dVar = this.f19886e;
        dVar.getClass();
        return dVar.d(j - this.f19887f);
    }

    @Override // q1.d
    public final long e(int i3) {
        d dVar = this.f19886e;
        dVar.getClass();
        return dVar.e(i3) + this.f19887f;
    }

    @Override // q1.d
    public final List f(long j) {
        d dVar = this.f19886e;
        dVar.getClass();
        return dVar.f(j - this.f19887f);
    }

    @Override // q1.d
    public final int g() {
        d dVar = this.f19886e;
        dVar.getClass();
        return dVar.g();
    }

    @Override // u0.f
    public final void s() {
        this.f3376b = 0;
        this.f21400c = 0L;
        this.f21401d = false;
        this.f19886e = null;
    }

    @Override // u0.f
    public final void t() {
        switch (this.f19888g) {
            case 0:
                ((D0.b) this.f19889h).k(this);
                break;
            default:
                B b2 = (B) this.f19889h;
                b2.getClass();
                r1.h hVar = (r1.h) b2.f10833b;
                hVar.getClass();
                s();
                hVar.f20285b.add(this);
                break;
        }
    }

    public c(D0.b bVar) {
        super(5);
        this.f19889h = bVar;
    }
}
