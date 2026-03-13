package D3;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements Pb.a {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f1272c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile b f1273a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f1274b;

    public static Pb.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.f1274b = f1272c;
        aVar.f1273a = bVar;
        return aVar;
    }

    @Override // Pb.a
    public final Object get() {
        Object obj;
        Object obj2 = this.f1274b;
        Object obj3 = f1272c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f1274b;
                if (obj == obj3) {
                    obj = this.f1273a.get();
                    Object obj4 = this.f1274b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException(StubApp.getString2("1292") + obj4 + StubApp.getString2("1293") + obj + StubApp.getString2("1294"));
                    }
                    this.f1274b = obj;
                    this.f1273a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
