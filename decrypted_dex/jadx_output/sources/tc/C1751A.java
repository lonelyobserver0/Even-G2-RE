package tc;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: tc.A, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class C1751A extends S9.i {
    @Override // S9.i
    public final Object b(S9.o reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        long d8 = reader.d();
        Object obj = "";
        boolean z2 = false;
        while (true) {
            int g10 = reader.g();
            if (g10 == -1) {
                return new C1752B((String) obj, z2, reader.e(d8));
            }
            if (g10 == 1) {
                obj = S9.i.f6635n.b(reader);
            } else if (g10 != 2) {
                reader.j(g10);
            } else {
                z2 = ((Boolean) S9.i.f6628f.b(reader)).booleanValue();
            }
        }
    }

    @Override // S9.i
    public final void d(S9.r writer, Object obj) {
        C1752B value = (C1752B) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.d(value.b());
        boolean z2 = value.f21260e;
        if (z2) {
            S9.i.f6628f.f(writer, 2, Boolean.valueOf(z2));
        }
        String str = value.f21259d;
        if (Intrinsics.areEqual(str, "")) {
            return;
        }
        S9.i.f6635n.f(writer, 1, str);
    }

    @Override // S9.i
    public final void e(s2.d writer, Object obj) {
        C1752B value = (C1752B) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!Intrinsics.areEqual(value.f21259d, "")) {
            S9.i.f6635n.g(writer, 1, value.f21259d);
        }
        boolean z2 = value.f21260e;
        if (z2) {
            S9.i.f6628f.g(writer, 2, Boolean.valueOf(z2));
        }
        writer.C(value.b());
    }

    @Override // S9.i
    public final int h(Object obj) {
        C1752B value = (C1752B) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        int e10 = value.b().e();
        String str = value.f21259d;
        if (!Intrinsics.areEqual(str, "")) {
            e10 += S9.i.f6635n.i(1, str);
        }
        boolean z2 = value.f21260e;
        if (!z2) {
            return e10;
        }
        return S9.i.f6628f.i(2, Boolean.valueOf(z2)) + e10;
    }
}
