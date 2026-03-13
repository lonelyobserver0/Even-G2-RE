package tc;

import Kc.C0104k;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: tc.i, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class C1763i extends S9.i {
    @Override // S9.i
    public final Object b(S9.o reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Object obj = C0104k.f3820d;
        long d8 = reader.d();
        Object obj2 = null;
        int i3 = 0;
        Object obj3 = null;
        while (true) {
            int g10 = reader.g();
            if (g10 == -1) {
                return new C1764j(i3, (Integer) obj3, (C0104k) obj2, (C0104k) obj, reader.e(d8));
            }
            S9.b bVar = S9.i.f6629g;
            if (g10 == 1) {
                i3 = ((Number) bVar.b(reader)).intValue();
            } else if (g10 != 2) {
                S9.b bVar2 = S9.i.f6634m;
                if (g10 == 3) {
                    obj2 = bVar2.b(reader);
                } else if (g10 != 4) {
                    reader.j(g10);
                } else {
                    obj = bVar2.b(reader);
                }
            } else {
                obj3 = bVar.b(reader);
            }
        }
    }

    @Override // S9.i
    public final void d(S9.r writer, Object obj) {
        C1764j value = (C1764j) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.d(value.b());
        C0104k c0104k = C0104k.f3820d;
        C0104k c0104k2 = value.f21325g;
        boolean areEqual = Intrinsics.areEqual(c0104k2, c0104k);
        S9.b bVar = S9.i.f6634m;
        if (!areEqual) {
            bVar.f(writer, 4, c0104k2);
        }
        bVar.f(writer, 3, value.f21324f);
        Integer num = value.f21323e;
        S9.b bVar2 = S9.i.f6629g;
        bVar2.f(writer, 2, num);
        int i3 = value.f21322d;
        if (i3 != 0) {
            bVar2.f(writer, 1, Integer.valueOf(i3));
        }
    }

    @Override // S9.i
    public final void e(s2.d writer, Object obj) {
        C1764j value = (C1764j) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        int i3 = value.f21322d;
        S9.b bVar = S9.i.f6629g;
        if (i3 != 0) {
            bVar.g(writer, 1, Integer.valueOf(i3));
        }
        bVar.g(writer, 2, value.f21323e);
        C0104k c0104k = value.f21324f;
        S9.b bVar2 = S9.i.f6634m;
        bVar2.g(writer, 3, c0104k);
        C0104k c0104k2 = C0104k.f3820d;
        C0104k c0104k3 = value.f21325g;
        if (!Intrinsics.areEqual(c0104k3, c0104k2)) {
            bVar2.g(writer, 4, c0104k3);
        }
        writer.C(value.b());
    }

    @Override // S9.i
    public final int h(Object obj) {
        C1764j value = (C1764j) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        int e10 = value.b().e();
        S9.b bVar = S9.i.f6629g;
        int i3 = value.f21322d;
        if (i3 != 0) {
            e10 += bVar.i(1, Integer.valueOf(i3));
        }
        int i10 = bVar.i(2, value.f21323e) + e10;
        C0104k c0104k = value.f21324f;
        S9.b bVar2 = S9.i.f6634m;
        int i11 = bVar2.i(3, c0104k) + i10;
        C0104k c0104k2 = C0104k.f3820d;
        C0104k c0104k3 = value.f21325g;
        return !Intrinsics.areEqual(c0104k3, c0104k2) ? bVar2.i(4, c0104k3) + i11 : i11;
    }
}
