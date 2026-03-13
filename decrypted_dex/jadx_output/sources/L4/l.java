package L4;

import java.io.Serializable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class l implements k, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final transient Object f4190a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final k f4191b;

    /* renamed from: c, reason: collision with root package name */
    public volatile transient boolean f4192c;

    /* renamed from: d, reason: collision with root package name */
    public transient Object f4193d;

    public l(k kVar) {
        this.f4191b = kVar;
    }

    @Override // L4.k
    public final Object get() {
        if (!this.f4192c) {
            synchronized (this.f4190a) {
                try {
                    if (!this.f4192c) {
                        Object obj = this.f4191b.get();
                        this.f4193d = obj;
                        this.f4192c = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f4193d;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (this.f4192c) {
            obj = "<supplier that returned " + this.f4193d + ">";
        } else {
            obj = this.f4191b;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
