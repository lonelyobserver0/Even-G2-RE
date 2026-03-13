package tc;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: tc.m, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class C1767m extends S9.i {
    @Override // S9.i
    public final Object b(S9.o reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        ArrayList arrayList = new ArrayList();
        long d8 = reader.d();
        Object obj = "";
        boolean z2 = false;
        while (true) {
            int g10 = reader.g();
            if (g10 == -1) {
                return new C1768n((String) obj, z2, arrayList, reader.e(d8));
            }
            if (g10 == 1) {
                obj = S9.i.f6635n.b(reader);
            } else if (g10 == 2) {
                z2 = ((Boolean) S9.i.f6628f.b(reader)).booleanValue();
            } else if (g10 != 3) {
                reader.j(g10);
            } else {
                arrayList.add(C1766l.f21326n.b(reader));
            }
        }
    }

    @Override // S9.i
    public final void d(S9.r writer, Object obj) {
        C1768n value = (C1768n) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.d(value.b());
        C1766l.f21326n.a().f(writer, 3, value.f21338f);
        boolean z2 = value.f21337e;
        if (z2) {
            S9.i.f6628f.f(writer, 2, Boolean.valueOf(z2));
        }
        String str = value.f21336d;
        if (Intrinsics.areEqual(str, "")) {
            return;
        }
        S9.i.f6635n.f(writer, 1, str);
    }

    @Override // S9.i
    public final void e(s2.d writer, Object obj) {
        C1768n value = (C1768n) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!Intrinsics.areEqual(value.f21336d, "")) {
            S9.i.f6635n.g(writer, 1, value.f21336d);
        }
        boolean z2 = value.f21337e;
        if (z2) {
            S9.i.f6628f.g(writer, 2, Boolean.valueOf(z2));
        }
        C1766l.f21326n.a().g(writer, 3, value.f21338f);
        writer.C(value.b());
    }

    @Override // S9.i
    public final int h(Object obj) {
        C1768n value = (C1768n) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        int e10 = value.b().e();
        String str = value.f21336d;
        if (!Intrinsics.areEqual(str, "")) {
            e10 += S9.i.f6635n.i(1, str);
        }
        boolean z2 = value.f21337e;
        if (z2) {
            e10 += S9.i.f6628f.i(2, Boolean.valueOf(z2));
        }
        return C1766l.f21326n.a().i(3, value.f21338f) + e10;
    }
}
