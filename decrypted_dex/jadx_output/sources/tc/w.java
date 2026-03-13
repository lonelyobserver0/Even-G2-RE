package tc;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class w extends S9.i {
    @Override // S9.i
    public final Object b(S9.o reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        long d8 = reader.d();
        long j = 0;
        long j3 = 0;
        double d10 = 0.0d;
        while (true) {
            int g10 = reader.g();
            if (g10 == -1) {
                return new x(j, j3, d10, reader.e(d8));
            }
            S9.b bVar = S9.i.j;
            if (g10 == 1) {
                j = ((Number) bVar.b(reader)).longValue();
            } else if (g10 == 2) {
                j3 = ((Number) bVar.b(reader)).longValue();
            } else if (g10 != 3) {
                reader.j(g10);
            } else {
                d10 = ((Number) S9.i.f6633l.b(reader)).doubleValue();
            }
        }
    }

    @Override // S9.i
    public final void d(S9.r writer, Object obj) {
        x value = (x) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.d(value.b());
        double d8 = value.f21376f;
        if (!Double.valueOf(d8).equals(Double.valueOf(0.0d))) {
            S9.i.f6633l.f(writer, 3, Double.valueOf(d8));
        }
        long j = value.f21375e;
        S9.b bVar = S9.i.j;
        if (j != 0) {
            bVar.f(writer, 2, Long.valueOf(j));
        }
        long j3 = value.f21374d;
        if (j3 != 0) {
            bVar.f(writer, 1, Long.valueOf(j3));
        }
    }

    @Override // S9.i
    public final void e(s2.d writer, Object obj) {
        x value = (x) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        long j = value.f21374d;
        S9.b bVar = S9.i.j;
        if (j != 0) {
            bVar.g(writer, 1, Long.valueOf(j));
        }
        long j3 = value.f21375e;
        if (j3 != 0) {
            bVar.g(writer, 2, Long.valueOf(j3));
        }
        double d8 = value.f21376f;
        if (!Double.valueOf(d8).equals(Double.valueOf(0.0d))) {
            S9.i.f6633l.g(writer, 3, Double.valueOf(d8));
        }
        writer.C(value.b());
    }

    @Override // S9.i
    public final int h(Object obj) {
        x value = (x) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        int e10 = value.b().e();
        long j = value.f21374d;
        S9.b bVar = S9.i.j;
        if (j != 0) {
            e10 += bVar.i(1, Long.valueOf(j));
        }
        long j3 = value.f21375e;
        if (j3 != 0) {
            e10 += bVar.i(2, Long.valueOf(j3));
        }
        double d8 = value.f21376f;
        if (Double.valueOf(d8).equals(Double.valueOf(0.0d))) {
            return e10;
        }
        return S9.i.f6633l.i(3, Double.valueOf(d8)) + e10;
    }
}
