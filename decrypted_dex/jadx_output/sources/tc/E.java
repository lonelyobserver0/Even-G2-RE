package tc;

import Kc.C0104k;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class E extends S9.i {
    @Override // S9.i
    public final Object b(S9.o reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Object obj = C0104k.f3820d;
        long d8 = reader.d();
        Object obj2 = "";
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int g10 = reader.g();
            if (g10 == -1) {
                return new F((String) obj2, (C0104k) obj3, (C0104k) obj, (C1762h) obj4, reader.e(d8));
            }
            if (g10 != 1) {
                S9.b bVar = S9.i.f6634m;
                if (g10 == 2) {
                    obj3 = bVar.b(reader);
                } else if (g10 == 3) {
                    obj = bVar.b(reader);
                } else if (g10 != 4) {
                    reader.j(g10);
                } else {
                    obj4 = C1762h.f21315k.b(reader);
                }
            } else {
                obj2 = S9.i.f6635n.b(reader);
            }
        }
    }

    @Override // S9.i
    public final void d(S9.r writer, Object obj) {
        F value = (F) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.d(value.b());
        C1762h c1762h = value.f21268g;
        if (c1762h != null) {
            C1762h.f21315k.f(writer, 4, c1762h);
        }
        C0104k c0104k = C0104k.f3820d;
        C0104k c0104k2 = value.f21267f;
        boolean areEqual = Intrinsics.areEqual(c0104k2, c0104k);
        S9.b bVar = S9.i.f6634m;
        if (!areEqual) {
            bVar.f(writer, 3, c0104k2);
        }
        bVar.f(writer, 2, value.f21266e);
        String str = value.f21265d;
        if (Intrinsics.areEqual(str, "")) {
            return;
        }
        S9.i.f6635n.f(writer, 1, str);
    }

    @Override // S9.i
    public final void e(s2.d writer, Object obj) {
        F value = (F) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!Intrinsics.areEqual(value.f21265d, "")) {
            S9.i.f6635n.g(writer, 1, value.f21265d);
        }
        C0104k c0104k = value.f21266e;
        S9.b bVar = S9.i.f6634m;
        bVar.g(writer, 2, c0104k);
        C0104k c0104k2 = C0104k.f3820d;
        C0104k c0104k3 = value.f21267f;
        if (!Intrinsics.areEqual(c0104k3, c0104k2)) {
            bVar.g(writer, 3, c0104k3);
        }
        C1762h c1762h = value.f21268g;
        if (c1762h != null) {
            C1762h.f21315k.g(writer, 4, c1762h);
        }
        writer.C(value.b());
    }

    @Override // S9.i
    public final int h(Object obj) {
        F value = (F) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        int e10 = value.b().e();
        String str = value.f21265d;
        if (!Intrinsics.areEqual(str, "")) {
            e10 += S9.i.f6635n.i(1, str);
        }
        C0104k c0104k = value.f21266e;
        S9.b bVar = S9.i.f6634m;
        int i3 = bVar.i(2, c0104k) + e10;
        C0104k c0104k2 = C0104k.f3820d;
        C0104k c0104k3 = value.f21267f;
        if (!Intrinsics.areEqual(c0104k3, c0104k2)) {
            i3 += bVar.i(3, c0104k3);
        }
        C1762h c1762h = value.f21268g;
        return c1762h != null ? C1762h.f21315k.i(4, c1762h) + i3 : i3;
    }
}
