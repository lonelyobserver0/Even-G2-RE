package v0;

/* renamed from: v0.x, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1828x implements Y {

    /* renamed from: a, reason: collision with root package name */
    public C1828x f21811a;

    /* renamed from: b, reason: collision with root package name */
    public C1828x f21812b;

    public final void a() {
        C1828x c1828x = this.f21812b;
        if (c1828x != null) {
            c1828x.a();
        }
    }

    public final void b() {
        C1828x c1828x = this.f21812b;
        if (c1828x != null) {
            c1828x.b();
        }
    }

    public final void c() {
        C1828x c1828x = this.f21811a;
        if (c1828x != null) {
            c1828x.c();
        }
    }

    @Override // v0.Y
    public final void d(int i3, Object obj) {
        if (i3 == 7) {
            this.f21811a = (C1828x) obj;
        } else if (i3 == 8) {
            this.f21812b = (C1828x) obj;
        } else if (i3 == 10000 && obj != null) {
            throw new ClassCastException();
        }
    }
}
