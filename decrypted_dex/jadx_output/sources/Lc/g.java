package Lc;

import Ac.m;
import Kc.C0101h;
import Kc.C0104k;
import Kc.n;
import Kc.o;
import Kc.t;
import Kc.y;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class g extends o {

    /* renamed from: e, reason: collision with root package name */
    public static final y f4407e;

    /* renamed from: b, reason: collision with root package name */
    public final ClassLoader f4408b;

    /* renamed from: c, reason: collision with root package name */
    public final t f4409c;

    /* renamed from: d, reason: collision with root package name */
    public final Lazy f4410d;

    static {
        String str = y.f3858b;
        f4407e = C2.i.v(StubApp.getString2(601), false);
    }

    public g(ClassLoader classLoader) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        String string2 = StubApp.getString2(25393);
        t tVar = o.f3837a;
        Intrinsics.checkNotNullParameter(tVar, string2);
        this.f4408b = classLoader;
        this.f4409c = tVar;
        this.f4410d = LazyKt.lazy(new m(this, 5));
    }

    @Override // Kc.o
    public final n b(y child) {
        y d8;
        Intrinsics.checkNotNullParameter(child, "path");
        if (!C2.i.s(child)) {
            return null;
        }
        y other = f4407e;
        other.getClass();
        Intrinsics.checkNotNullParameter(child, "child");
        y b2 = c.b(other, child, true);
        b2.getClass();
        Intrinsics.checkNotNullParameter(other, "other");
        int a3 = c.a(b2);
        C0104k c0104k = b2.f3859a;
        y yVar = a3 == -1 ? null : new y(c0104k.o(0, a3));
        other.getClass();
        int a9 = c.a(other);
        C0104k c0104k2 = other.f3859a;
        boolean areEqual = Intrinsics.areEqual(yVar, a9 != -1 ? new y(c0104k2.o(0, a9)) : null);
        String string2 = StubApp.getString2(3542);
        if (!areEqual) {
            throw new IllegalArgumentException((StubApp.getString2(25395) + b2 + string2 + other).toString());
        }
        ArrayList a10 = b2.a();
        ArrayList a11 = other.a();
        int min = Math.min(a10.size(), a11.size());
        int i3 = 0;
        while (i3 < min && Intrinsics.areEqual(a10.get(i3), a11.get(i3))) {
            i3++;
        }
        if (i3 == min && c0104k.e() == c0104k2.e()) {
            d8 = C2.i.v(StubApp.getString2(1), false);
        } else {
            if (a11.subList(i3, a11.size()).indexOf(c.f4403e) != -1) {
                throw new IllegalArgumentException((StubApp.getString2(25394) + b2 + string2 + other).toString());
            }
            C0101h c0101h = new C0101h();
            C0104k c10 = c.c(other);
            if (c10 == null && (c10 = c.c(b2)) == null) {
                c10 = c.f(y.f3858b);
            }
            int size = a11.size();
            for (int i10 = i3; i10 < size; i10++) {
                c0101h.N(c.f4403e);
                c0101h.N(c10);
            }
            int size2 = a10.size();
            while (i3 < size2) {
                c0101h.N((C0104k) a10.get(i3));
                c0101h.N(c10);
                i3++;
            }
            d8 = c.d(c0101h, false);
        }
        String s10 = d8.f3859a.s();
        for (Pair pair : (List) this.f4410d.getValue()) {
            n b10 = ((o) pair.component1()).b(((y) pair.component2()).d(s10));
            if (b10 != null) {
                return b10;
            }
        }
        return null;
    }
}
