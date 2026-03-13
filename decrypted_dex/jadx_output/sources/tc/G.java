package tc;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class G extends S9.i {
    @Override // S9.i
    public final Object b(S9.o reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Object obj = I.f21271d;
        long d8 = reader.d();
        boolean z2 = false;
        Object obj2 = obj;
        while (true) {
            int g10 = reader.g();
            if (g10 == -1) {
                return new J((I) obj, (I) obj2, z2, reader.e(d8));
            }
            if (g10 == 1) {
                try {
                    obj = I.f21270c.b(reader);
                } catch (S9.h e10) {
                    reader.a(g10, S9.d.f6614b, Long.valueOf(e10.f6627a));
                }
            } else if (g10 == 2) {
                try {
                    obj2 = I.f21270c.b(reader);
                } catch (S9.h e11) {
                    reader.a(g10, S9.d.f6614b, Long.valueOf(e11.f6627a));
                }
            } else if (g10 != 3) {
                reader.j(g10);
            } else {
                z2 = ((Boolean) S9.i.f6628f.b(reader)).booleanValue();
            }
        }
    }

    @Override // S9.i
    public final void d(S9.r writer, Object obj) {
        J value = (J) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.d(value.b());
        boolean z2 = value.f21286f;
        if (z2) {
            S9.i.f6628f.f(writer, 3, Boolean.valueOf(z2));
        }
        I i3 = I.f21271d;
        I i10 = value.f21285e;
        if (i10 != i3) {
            I.f21270c.f(writer, 2, i10);
        }
        I i11 = value.f21284d;
        if (i11 != i3) {
            I.f21270c.f(writer, 1, i11);
        }
    }

    @Override // S9.i
    public final void e(s2.d writer, Object obj) {
        J value = (J) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        I i3 = value.f21284d;
        I i10 = I.f21271d;
        if (i3 != i10) {
            I.f21270c.g(writer, 1, i3);
        }
        I i11 = value.f21285e;
        if (i11 != i10) {
            I.f21270c.g(writer, 2, i11);
        }
        boolean z2 = value.f21286f;
        if (z2) {
            S9.i.f6628f.g(writer, 3, Boolean.valueOf(z2));
        }
        writer.C(value.b());
    }

    @Override // S9.i
    public final int h(Object obj) {
        J value = (J) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        int e10 = value.b().e();
        I i3 = I.f21271d;
        I i10 = value.f21284d;
        if (i10 != i3) {
            e10 += I.f21270c.i(1, i10);
        }
        I i11 = value.f21285e;
        if (i11 != i3) {
            e10 += I.f21270c.i(2, i11);
        }
        boolean z2 = value.f21286f;
        if (!z2) {
            return e10;
        }
        return S9.i.f6628f.i(3, Boolean.valueOf(z2)) + e10;
    }
}
