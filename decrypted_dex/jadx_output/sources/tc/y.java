package tc;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class y extends S9.i {
    @Override // S9.i
    public final Object b(S9.o reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        long d8 = reader.d();
        Object obj = "";
        Object obj2 = null;
        boolean z2 = false;
        Object obj3 = null;
        while (true) {
            int g10 = reader.g();
            if (g10 == -1) {
                return new z((String) obj, z2, (C1756b) obj2, (x) obj3, reader.e(d8));
            }
            if (g10 == 1) {
                obj = S9.i.f6635n.b(reader);
            } else if (g10 == 2) {
                z2 = ((Boolean) S9.i.f6628f.b(reader)).booleanValue();
            } else if (g10 == 3) {
                obj2 = C1756b.f21296e.b(reader);
            } else if (g10 != 4) {
                reader.j(g10);
            } else {
                obj3 = x.f21373g.b(reader);
            }
        }
    }

    @Override // S9.i
    public final void d(S9.r writer, Object obj) {
        z value = (z) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.d(value.b());
        x xVar = value.f21381g;
        if (xVar != null) {
            x.f21373g.f(writer, 4, xVar);
        }
        C1756b c1756b = value.f21380f;
        if (c1756b != null) {
            C1756b.f21296e.f(writer, 3, c1756b);
        }
        boolean z2 = value.f21379e;
        if (z2) {
            S9.i.f6628f.f(writer, 2, Boolean.valueOf(z2));
        }
        String str = value.f21378d;
        if (Intrinsics.areEqual(str, "")) {
            return;
        }
        S9.i.f6635n.f(writer, 1, str);
    }

    @Override // S9.i
    public final void e(s2.d writer, Object obj) {
        z value = (z) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!Intrinsics.areEqual(value.f21378d, "")) {
            S9.i.f6635n.g(writer, 1, value.f21378d);
        }
        boolean z2 = value.f21379e;
        if (z2) {
            S9.i.f6628f.g(writer, 2, Boolean.valueOf(z2));
        }
        C1756b c1756b = value.f21380f;
        if (c1756b != null) {
            C1756b.f21296e.g(writer, 3, c1756b);
        }
        x xVar = value.f21381g;
        if (xVar != null) {
            x.f21373g.g(writer, 4, xVar);
        }
        writer.C(value.b());
    }

    @Override // S9.i
    public final int h(Object obj) {
        z value = (z) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        int e10 = value.b().e();
        String str = value.f21378d;
        if (!Intrinsics.areEqual(str, "")) {
            e10 += S9.i.f6635n.i(1, str);
        }
        boolean z2 = value.f21379e;
        if (z2) {
            e10 += S9.i.f6628f.i(2, Boolean.valueOf(z2));
        }
        C1756b c1756b = value.f21380f;
        if (c1756b != null) {
            e10 += C1756b.f21296e.i(3, c1756b);
        }
        x xVar = value.f21381g;
        return xVar != null ? x.f21373g.i(4, xVar) + e10 : e10;
    }
}
