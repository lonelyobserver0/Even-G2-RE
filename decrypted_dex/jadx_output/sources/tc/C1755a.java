package tc;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: tc.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class C1755a extends S9.i {
    @Override // S9.i
    public final Object b(S9.o reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        long d8 = reader.d();
        Object obj = "";
        while (true) {
            int g10 = reader.g();
            if (g10 == -1) {
                return new C1756b(reader.e(d8), (String) obj);
            }
            if (g10 == 1) {
                obj = S9.i.f6635n.b(reader);
            } else {
                reader.j(g10);
            }
        }
    }

    @Override // S9.i
    public final void d(S9.r writer, Object obj) {
        C1756b value = (C1756b) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.d(value.b());
        String str = value.f21297d;
        if (Intrinsics.areEqual(str, "")) {
            return;
        }
        S9.i.f6635n.f(writer, 1, str);
    }

    @Override // S9.i
    public final void e(s2.d writer, Object obj) {
        C1756b value = (C1756b) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!Intrinsics.areEqual(value.f21297d, "")) {
            S9.i.f6635n.g(writer, 1, value.f21297d);
        }
        writer.C(value.b());
    }

    @Override // S9.i
    public final int h(Object obj) {
        C1756b value = (C1756b) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        int e10 = value.b().e();
        String str = value.f21297d;
        return !Intrinsics.areEqual(str, "") ? S9.i.f6635n.i(1, str) + e10 : e10;
    }
}
