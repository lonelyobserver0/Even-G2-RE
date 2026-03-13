package t2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final j f21150a;

    /* renamed from: b, reason: collision with root package name */
    public final Q4.c f21151b;

    public e(j jVar, Q4.c cVar) {
        this.f21150a = jVar;
        this.f21151b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f21150a.f21159a != this) {
            return;
        }
        if (h.f21157f.e(this.f21150a, this, h.f(this.f21151b))) {
            h.c(this.f21150a);
        }
    }
}
