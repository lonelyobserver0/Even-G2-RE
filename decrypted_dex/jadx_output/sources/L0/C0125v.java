package L0;

import java.util.Objects;
import o0.AbstractC1416M;
import o0.C1414K;
import o0.C1415L;
import r0.AbstractC1560u;

/* renamed from: L0.v, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0125v extends r {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f4139e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Object f4140c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f4141d;

    public C0125v(AbstractC1416M abstractC1416M, Object obj, Object obj2) {
        super(abstractC1416M);
        this.f4140c = obj;
        this.f4141d = obj2;
    }

    @Override // L0.r, o0.AbstractC1416M
    public final int b(Object obj) {
        Object obj2;
        if (f4139e.equals(obj) && (obj2 = this.f4141d) != null) {
            obj = obj2;
        }
        return this.f4123b.b(obj);
    }

    @Override // L0.r, o0.AbstractC1416M
    public final C1414K f(int i3, C1414K c1414k, boolean z2) {
        this.f4123b.f(i3, c1414k, z2);
        if (Objects.equals(c1414k.f18043b, this.f4141d) && z2) {
            c1414k.f18043b = f4139e;
        }
        return c1414k;
    }

    @Override // L0.r, o0.AbstractC1416M
    public final Object l(int i3) {
        Object l9 = this.f4123b.l(i3);
        int i10 = AbstractC1560u.f20190a;
        return Objects.equals(l9, this.f4141d) ? f4139e : l9;
    }

    @Override // L0.r, o0.AbstractC1416M
    public final C1415L m(int i3, C1415L c1415l, long j) {
        this.f4123b.m(i3, c1415l, j);
        if (Objects.equals(c1415l.f18051a, this.f4140c)) {
            c1415l.f18051a = C1415L.f18049q;
        }
        return c1415l;
    }
}
