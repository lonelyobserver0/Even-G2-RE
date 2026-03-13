package tc;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: tc.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class C1757c extends S9.i {
    @Override // S9.i
    public final Object b(S9.o reader) {
        long j;
        boolean z2;
        Intrinsics.checkNotNullParameter(reader, "reader");
        Object obj = EnumC1761g.f21308d;
        Object obj2 = EnumC1759e.f21300d;
        long d8 = reader.d();
        long j3 = 0;
        long j10 = 0;
        boolean z10 = false;
        Object obj3 = obj2;
        long j11 = 0;
        Object obj4 = obj;
        while (true) {
            int g10 = reader.g();
            if (g10 == -1) {
                return new C1762h(j11, z10, j3, (EnumC1761g) obj4, j10, (EnumC1759e) obj3, reader.e(d8));
            }
            S9.b bVar = S9.i.f6631i;
            switch (g10) {
                case 1:
                    j11 = ((Number) bVar.b(reader)).longValue();
                    break;
                case 2:
                    z10 = ((Boolean) S9.i.f6628f.b(reader)).booleanValue();
                    break;
                case 3:
                    j = j11;
                    j3 = ((Number) bVar.b(reader)).longValue();
                    j11 = j;
                    break;
                case 4:
                    j = j11;
                    try {
                        obj4 = EnumC1761g.f21307c.b(reader);
                    } catch (S9.h e10) {
                        z2 = z10;
                        reader.a(g10, S9.d.f6614b, Long.valueOf(e10.f6627a));
                        break;
                    }
                    j11 = j;
                    break;
                case 5:
                    j = j11;
                    j10 = ((Number) S9.i.j.b(reader)).longValue();
                    j11 = j;
                    break;
                case 6:
                    try {
                        obj3 = EnumC1759e.f21299c.b(reader);
                        break;
                    } catch (S9.h e11) {
                        j = j11;
                        reader.a(g10, S9.d.f6614b, Long.valueOf(e11.f6627a));
                        break;
                    }
                default:
                    reader.j(g10);
                    j = j11;
                    z2 = z10;
                    z10 = z2;
                    j11 = j;
                    break;
            }
        }
    }

    @Override // S9.i
    public final void d(S9.r writer, Object obj) {
        C1762h value = (C1762h) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.d(value.b());
        EnumC1759e enumC1759e = EnumC1759e.f21300d;
        EnumC1759e enumC1759e2 = value.j;
        if (enumC1759e2 != enumC1759e) {
            EnumC1759e.f21299c.f(writer, 6, enumC1759e2);
        }
        long j = value.f21320h;
        if (j != 0) {
            S9.i.j.f(writer, 5, Long.valueOf(j));
        }
        EnumC1761g enumC1761g = EnumC1761g.f21308d;
        EnumC1761g enumC1761g2 = value.f21319g;
        if (enumC1761g2 != enumC1761g) {
            EnumC1761g.f21307c.f(writer, 4, enumC1761g2);
        }
        long j3 = value.f21318f;
        S9.b bVar = S9.i.f6631i;
        if (j3 != 0) {
            bVar.f(writer, 3, Long.valueOf(j3));
        }
        boolean z2 = value.f21317e;
        if (z2) {
            S9.i.f6628f.f(writer, 2, Boolean.valueOf(z2));
        }
        long j10 = value.f21316d;
        if (j10 != 0) {
            bVar.f(writer, 1, Long.valueOf(j10));
        }
    }

    @Override // S9.i
    public final void e(s2.d writer, Object obj) {
        C1762h value = (C1762h) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        long j = value.f21316d;
        S9.b bVar = S9.i.f6631i;
        if (j != 0) {
            bVar.g(writer, 1, Long.valueOf(j));
        }
        boolean z2 = value.f21317e;
        if (z2) {
            S9.i.f6628f.g(writer, 2, Boolean.valueOf(z2));
        }
        long j3 = value.f21318f;
        if (j3 != 0) {
            bVar.g(writer, 3, Long.valueOf(j3));
        }
        EnumC1761g enumC1761g = EnumC1761g.f21308d;
        EnumC1761g enumC1761g2 = value.f21319g;
        if (enumC1761g2 != enumC1761g) {
            EnumC1761g.f21307c.g(writer, 4, enumC1761g2);
        }
        long j10 = value.f21320h;
        if (j10 != 0) {
            S9.i.j.g(writer, 5, Long.valueOf(j10));
        }
        EnumC1759e enumC1759e = EnumC1759e.f21300d;
        EnumC1759e enumC1759e2 = value.j;
        if (enumC1759e2 != enumC1759e) {
            EnumC1759e.f21299c.g(writer, 6, enumC1759e2);
        }
        writer.C(value.b());
    }

    @Override // S9.i
    public final int h(Object obj) {
        C1762h value = (C1762h) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        int e10 = value.b().e();
        long j = value.f21316d;
        S9.b bVar = S9.i.f6631i;
        if (j != 0) {
            e10 += bVar.i(1, Long.valueOf(j));
        }
        boolean z2 = value.f21317e;
        if (z2) {
            e10 += S9.i.f6628f.i(2, Boolean.valueOf(z2));
        }
        long j3 = value.f21318f;
        if (j3 != 0) {
            e10 += bVar.i(3, Long.valueOf(j3));
        }
        EnumC1761g enumC1761g = EnumC1761g.f21308d;
        EnumC1761g enumC1761g2 = value.f21319g;
        if (enumC1761g2 != enumC1761g) {
            e10 += EnumC1761g.f21307c.i(4, enumC1761g2);
        }
        long j10 = value.f21320h;
        if (j10 != 0) {
            e10 += S9.i.j.i(5, Long.valueOf(j10));
        }
        EnumC1759e enumC1759e = EnumC1759e.f21300d;
        EnumC1759e enumC1759e2 = value.j;
        return enumC1759e2 != enumC1759e ? EnumC1759e.f21299c.i(6, enumC1759e2) + e10 : e10;
    }
}
