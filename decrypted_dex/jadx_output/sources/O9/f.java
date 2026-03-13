package O9;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f5307a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f5308b;

    public f(i iVar, Object obj) {
        this.f5308b = iVar;
        this.f5307a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5308b.f5314a.success(this.f5307a);
    }
}
