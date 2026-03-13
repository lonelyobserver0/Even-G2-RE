package W4;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Class f8152a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f8153b;

    public q(Class cls, Class cls2) {
        this.f8152a = cls;
        this.f8153b = cls2;
    }

    public static q a(Class cls) {
        return new q(p.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f8153b.equals(qVar.f8153b)) {
            return this.f8152a.equals(qVar.f8152a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8152a.hashCode() + (this.f8153b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f8153b;
        Class cls2 = this.f8152a;
        if (cls2 == p.class) {
            return cls.getName();
        }
        return StubApp.getString2(893) + cls2.getName() + StubApp.getString2(397) + cls.getName();
    }
}
