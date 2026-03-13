package K5;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements Pb.a, J5.a {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f3718c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Pb.a f3719a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f3720b = f3718c;

    public a(Pb.a aVar) {
        this.f3719a = aVar;
    }

    public static Pb.a a(b bVar) {
        return bVar instanceof a ? bVar : new a(bVar);
    }

    @Override // Pb.a
    public final Object get() {
        Object obj;
        Object obj2 = this.f3720b;
        Object obj3 = f3718c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f3720b;
                if (obj == obj3) {
                    obj = this.f3719a.get();
                    Object obj4 = this.f3720b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException(StubApp.getString2("1292") + obj4 + StubApp.getString2("1293") + obj + StubApp.getString2("1294"));
                    }
                    this.f3720b = obj;
                    this.f3719a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
