package L4;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class n implements k {

    /* renamed from: d, reason: collision with root package name */
    public static final m f4195d = new m(0);

    /* renamed from: a, reason: collision with root package name */
    public final Object f4196a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public volatile k f4197b;

    /* renamed from: c, reason: collision with root package name */
    public Object f4198c;

    public n(k kVar) {
        this.f4197b = kVar;
    }

    @Override // L4.k
    public final Object get() {
        k kVar = this.f4197b;
        m mVar = f4195d;
        if (kVar != mVar) {
            synchronized (this.f4196a) {
                try {
                    if (this.f4197b != mVar) {
                        Object obj = this.f4197b.get();
                        this.f4198c = obj;
                        this.f4197b = mVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f4198c;
    }

    public final String toString() {
        Object obj = this.f4197b;
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(3370));
        if (obj == f4195d) {
            obj = StubApp.getString2(3371) + this.f4198c + StubApp.getString2(3372);
        }
        sb2.append(obj);
        sb2.append(StubApp.getString2(74));
        return sb2.toString();
    }
}
