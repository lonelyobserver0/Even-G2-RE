package S3;

/* renamed from: S3.n, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0280n implements InterfaceC0270d, InterfaceC0268b, InterfaceC0269c {

    /* renamed from: b, reason: collision with root package name */
    public static C0280n f6546b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0281o f6547c = new C0281o(0, false, false, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public Object f6548a;

    public static synchronized C0280n b() {
        C0280n c0280n;
        synchronized (C0280n.class) {
            try {
                if (f6546b == null) {
                    f6546b = new C0280n();
                }
                c0280n = f6546b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0280n;
    }

    @Override // S3.InterfaceC0270d
    public void a(com.google.android.gms.common.b bVar) {
        boolean d8 = bVar.d();
        AbstractC0271e abstractC0271e = (AbstractC0271e) this.f6548a;
        if (d8) {
            abstractC0271e.e(null, abstractC0271e.s());
            return;
        }
        InterfaceC0269c interfaceC0269c = abstractC0271e.f6505r;
        if (interfaceC0269c != null) {
            interfaceC0269c.g(bVar);
        }
    }

    @Override // S3.InterfaceC0268b
    public void e(int i3) {
        ((Q3.i) this.f6548a).e(i3);
    }

    @Override // S3.InterfaceC0268b
    public void f() {
        ((Q3.i) this.f6548a).f();
    }

    @Override // S3.InterfaceC0269c
    public void g(com.google.android.gms.common.b bVar) {
        ((Q3.j) this.f6548a).g(bVar);
    }
}
