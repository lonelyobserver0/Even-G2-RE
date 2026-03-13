package tc;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: tc.C, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class C1753C extends S9.i {
    @Override // S9.i
    public final Object b(S9.o reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        ArrayList arrayList = new ArrayList();
        long d8 = reader.d();
        Object obj = "";
        while (true) {
            int g10 = reader.g();
            if (g10 == -1) {
                return new C1754D((String) obj, arrayList, reader.e(d8));
            }
            if (g10 == 1) {
                obj = S9.i.f6635n.b(reader);
            } else if (g10 != 2) {
                reader.j(g10);
            } else {
                arrayList.add(t.f21363h.b(reader));
            }
        }
    }

    @Override // S9.i
    public final void d(S9.r writer, Object obj) {
        C1754D value = (C1754D) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.d(value.b());
        t.f21363h.a().f(writer, 2, value.f21263e);
        String str = value.f21262d;
        if (Intrinsics.areEqual(str, "")) {
            return;
        }
        S9.i.f6635n.f(writer, 1, str);
    }

    @Override // S9.i
    public final void e(s2.d writer, Object obj) {
        C1754D value = (C1754D) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!Intrinsics.areEqual(value.f21262d, "")) {
            S9.i.f6635n.g(writer, 1, value.f21262d);
        }
        t.f21363h.a().g(writer, 2, value.f21263e);
        writer.C(value.b());
    }

    @Override // S9.i
    public final int h(Object obj) {
        C1754D value = (C1754D) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        int e10 = value.b().e();
        String str = value.f21262d;
        if (!Intrinsics.areEqual(str, "")) {
            e10 += S9.i.f6635n.i(1, str);
        }
        return t.f21363h.a().i(2, value.f21263e) + e10;
    }
}
