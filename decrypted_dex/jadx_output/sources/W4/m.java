package W4;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class m implements w5.b {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f8143c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f8144a = f8143c;

    /* renamed from: b, reason: collision with root package name */
    public volatile w5.b f8145b;

    public m(w5.b bVar) {
        this.f8145b = bVar;
    }

    @Override // w5.b
    public final Object get() {
        Object obj;
        Object obj2 = this.f8144a;
        Object obj3 = f8143c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f8144a;
                if (obj == obj3) {
                    obj = this.f8145b.get();
                    this.f8144a = obj;
                    this.f8145b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
