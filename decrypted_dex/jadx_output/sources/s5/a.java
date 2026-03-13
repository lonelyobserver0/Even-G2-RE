package s5;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final int f20757a;

    public a(int i3) {
        this.f20757a = i3;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return e.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        a aVar = (a) ((e) obj);
        if (this.f20757a != aVar.f20757a) {
            return false;
        }
        Object obj2 = d.f20759a;
        aVar.getClass();
        return obj2.equals(obj2);
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.f20757a) + (d.f20759a.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return StubApp.getString2(23129) + this.f20757a + StubApp.getString2(23130) + d.f20759a + ')';
    }
}
