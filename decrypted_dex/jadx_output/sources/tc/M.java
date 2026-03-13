package tc;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class M extends S9.i {
    @Override // S9.i
    public final Object b(S9.o reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        ArrayList arrayList = new ArrayList();
        long d8 = reader.d();
        Object obj = "";
        Object obj2 = null;
        while (true) {
            int g10 = reader.g();
            if (g10 == -1) {
                return new N((String) obj, arrayList, (C1762h) obj2, reader.e(d8));
            }
            if (g10 == 1) {
                obj = S9.i.f6635n.b(reader);
            } else if (g10 == 2) {
                arrayList.add(C1764j.f21321h.b(reader));
            } else if (g10 != 3) {
                reader.j(g10);
            } else {
                obj2 = C1762h.f21315k.b(reader);
            }
        }
    }

    @Override // S9.i
    public final void d(S9.r writer, Object obj) {
        N value = (N) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.d(value.b());
        C1762h c1762h = value.f21294e;
        if (c1762h != null) {
            C1762h.f21315k.f(writer, 3, c1762h);
        }
        C1764j.f21321h.a().f(writer, 2, value.f21295f);
        String str = value.f21293d;
        if (Intrinsics.areEqual(str, "")) {
            return;
        }
        S9.i.f6635n.f(writer, 1, str);
    }

    @Override // S9.i
    public final void e(s2.d writer, Object obj) {
        N value = (N) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!Intrinsics.areEqual(value.f21293d, "")) {
            S9.i.f6635n.g(writer, 1, value.f21293d);
        }
        C1764j.f21321h.a().g(writer, 2, value.f21295f);
        C1762h c1762h = value.f21294e;
        if (c1762h != null) {
            C1762h.f21315k.g(writer, 3, c1762h);
        }
        writer.C(value.b());
    }

    @Override // S9.i
    public final int h(Object obj) {
        N value = (N) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        int e10 = value.b().e();
        String str = value.f21293d;
        if (!Intrinsics.areEqual(str, "")) {
            e10 += S9.i.f6635n.i(1, str);
        }
        int i3 = C1764j.f21321h.a().i(2, value.f21295f) + e10;
        C1762h c1762h = value.f21294e;
        return c1762h != null ? C1762h.f21315k.i(3, c1762h) + i3 : i3;
    }
}
