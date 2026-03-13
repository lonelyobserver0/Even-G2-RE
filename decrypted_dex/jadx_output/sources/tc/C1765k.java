package tc;

import Kc.C0104k;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: tc.k, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class C1765k extends S9.i {
    @Override // S9.i
    public final Object b(S9.o reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Object obj = C0104k.f3820d;
        long d8 = reader.d();
        boolean z2 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        long j = 0;
        Object obj2 = null;
        long j3 = 0;
        while (true) {
            int g10 = reader.g();
            if (g10 == -1) {
                return new C1766l(j3, j, (String) obj2, (C0104k) obj, z2, z10, z11, z12, z13, reader.e(d8));
            }
            S9.b bVar = S9.i.j;
            Object obj3 = obj;
            S9.b bVar2 = S9.i.f6628f;
            switch (g10) {
                case 1:
                    j3 = ((Number) bVar.b(reader)).longValue();
                    break;
                case 2:
                    j = ((Number) bVar.b(reader)).longValue();
                    break;
                case 3:
                    obj2 = S9.i.f6635n.b(reader);
                    break;
                case 4:
                    obj = S9.i.f6634m.b(reader);
                    continue;
                case 5:
                    z2 = ((Boolean) bVar2.b(reader)).booleanValue();
                    break;
                case 6:
                    z10 = ((Boolean) bVar2.b(reader)).booleanValue();
                    break;
                case 7:
                    z11 = ((Boolean) bVar2.b(reader)).booleanValue();
                    break;
                case 8:
                    z12 = ((Boolean) bVar2.b(reader)).booleanValue();
                    break;
                case 9:
                    z13 = ((Boolean) bVar2.b(reader)).booleanValue();
                    break;
                default:
                    reader.j(g10);
                    break;
            }
            obj = obj3;
        }
    }

    @Override // S9.i
    public final void d(S9.r writer, Object obj) {
        C1766l value = (C1766l) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.d(value.b());
        S9.b bVar = S9.i.f6628f;
        boolean z2 = value.f21334m;
        if (z2) {
            bVar.f(writer, 9, Boolean.valueOf(z2));
        }
        boolean z10 = value.f21333l;
        if (z10) {
            bVar.f(writer, 8, Boolean.valueOf(z10));
        }
        boolean z11 = value.f21332k;
        if (z11) {
            bVar.f(writer, 7, Boolean.valueOf(z11));
        }
        boolean z12 = value.j;
        if (z12) {
            bVar.f(writer, 6, Boolean.valueOf(z12));
        }
        boolean z13 = value.f21331h;
        if (z13) {
            bVar.f(writer, 5, Boolean.valueOf(z13));
        }
        C0104k c0104k = C0104k.f3820d;
        C0104k c0104k2 = value.f21330g;
        if (!Intrinsics.areEqual(c0104k2, c0104k)) {
            S9.i.f6634m.f(writer, 4, c0104k2);
        }
        S9.i.f6635n.f(writer, 3, value.f21329f);
        long j = value.f21328e;
        S9.b bVar2 = S9.i.j;
        if (j != 0) {
            bVar2.f(writer, 2, Long.valueOf(j));
        }
        long j3 = value.f21327d;
        if (j3 != 0) {
            bVar2.f(writer, 1, Long.valueOf(j3));
        }
    }

    @Override // S9.i
    public final void e(s2.d writer, Object obj) {
        C1766l value = (C1766l) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        long j = value.f21327d;
        S9.b bVar = S9.i.j;
        if (j != 0) {
            bVar.g(writer, 1, Long.valueOf(j));
        }
        long j3 = value.f21328e;
        if (j3 != 0) {
            bVar.g(writer, 2, Long.valueOf(j3));
        }
        S9.i.f6635n.g(writer, 3, value.f21329f);
        C0104k c0104k = C0104k.f3820d;
        C0104k c0104k2 = value.f21330g;
        if (!Intrinsics.areEqual(c0104k2, c0104k)) {
            S9.i.f6634m.g(writer, 4, c0104k2);
        }
        S9.b bVar2 = S9.i.f6628f;
        boolean z2 = value.f21331h;
        if (z2) {
            bVar2.g(writer, 5, Boolean.valueOf(z2));
        }
        boolean z10 = value.j;
        if (z10) {
            bVar2.g(writer, 6, Boolean.valueOf(z10));
        }
        boolean z11 = value.f21332k;
        if (z11) {
            bVar2.g(writer, 7, Boolean.valueOf(z11));
        }
        boolean z12 = value.f21333l;
        if (z12) {
            bVar2.g(writer, 8, Boolean.valueOf(z12));
        }
        boolean z13 = value.f21334m;
        if (z13) {
            bVar2.g(writer, 9, Boolean.valueOf(z13));
        }
        writer.C(value.b());
    }

    @Override // S9.i
    public final int h(Object obj) {
        C1766l value = (C1766l) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        int e10 = value.b().e();
        long j = value.f21327d;
        S9.b bVar = S9.i.j;
        if (j != 0) {
            e10 += bVar.i(1, Long.valueOf(j));
        }
        long j3 = value.f21328e;
        if (j3 != 0) {
            e10 += bVar.i(2, Long.valueOf(j3));
        }
        int i3 = S9.i.f6635n.i(3, value.f21329f) + e10;
        C0104k c0104k = C0104k.f3820d;
        C0104k c0104k2 = value.f21330g;
        if (!Intrinsics.areEqual(c0104k2, c0104k)) {
            i3 += S9.i.f6634m.i(4, c0104k2);
        }
        S9.b bVar2 = S9.i.f6628f;
        boolean z2 = value.f21331h;
        if (z2) {
            i3 += bVar2.i(5, Boolean.valueOf(z2));
        }
        boolean z10 = value.j;
        if (z10) {
            i3 += bVar2.i(6, Boolean.valueOf(z10));
        }
        boolean z11 = value.f21332k;
        if (z11) {
            i3 += bVar2.i(7, Boolean.valueOf(z11));
        }
        boolean z12 = value.f21333l;
        if (z12) {
            i3 += bVar2.i(8, Boolean.valueOf(z12));
        }
        boolean z13 = value.f21334m;
        return z13 ? bVar2.i(9, Boolean.valueOf(z13)) + i3 : i3;
    }
}
