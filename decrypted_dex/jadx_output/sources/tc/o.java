package tc;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class o extends S9.i {
    @Override // S9.i
    public final Object b(S9.o reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Object obj = q.f21341d;
        Object obj2 = s.f21355d;
        long d8 = reader.d();
        long j = 0;
        Object obj3 = "";
        Object obj4 = obj2;
        while (true) {
            Object obj5 = obj;
            while (true) {
                int g10 = reader.g();
                if (g10 == -1) {
                    return new t((String) obj3, (q) obj5, (s) obj4, j, reader.e(d8));
                }
                if (g10 == 1) {
                    obj3 = S9.i.f6635n.b(reader);
                } else if (g10 == 2) {
                    try {
                        obj = q.f21340c.b(reader);
                        break;
                    } catch (S9.h e10) {
                        reader.a(g10, S9.d.f6614b, Long.valueOf(e10.f6627a));
                    }
                } else if (g10 == 3) {
                    try {
                        obj4 = s.f21354c.b(reader);
                    } catch (S9.h e11) {
                        reader.a(g10, S9.d.f6614b, Long.valueOf(e11.f6627a));
                    }
                } else if (g10 != 4) {
                    reader.j(g10);
                } else {
                    j = ((Number) S9.i.f6631i.b(reader)).longValue();
                }
            }
        }
    }

    @Override // S9.i
    public final void d(S9.r writer, Object obj) {
        t value = (t) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.d(value.b());
        long j = value.f21367g;
        if (j != 0) {
            S9.i.f6631i.f(writer, 4, Long.valueOf(j));
        }
        s sVar = s.f21355d;
        s sVar2 = value.f21366f;
        if (sVar2 != sVar) {
            s.f21354c.f(writer, 3, sVar2);
        }
        q qVar = q.f21341d;
        q qVar2 = value.f21365e;
        if (qVar2 != qVar) {
            q.f21340c.f(writer, 2, qVar2);
        }
        String str = value.f21364d;
        if (Intrinsics.areEqual(str, "")) {
            return;
        }
        S9.i.f6635n.f(writer, 1, str);
    }

    @Override // S9.i
    public final void e(s2.d writer, Object obj) {
        t value = (t) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!Intrinsics.areEqual(value.f21364d, "")) {
            S9.i.f6635n.g(writer, 1, value.f21364d);
        }
        q qVar = q.f21341d;
        q qVar2 = value.f21365e;
        if (qVar2 != qVar) {
            q.f21340c.g(writer, 2, qVar2);
        }
        s sVar = s.f21355d;
        s sVar2 = value.f21366f;
        if (sVar2 != sVar) {
            s.f21354c.g(writer, 3, sVar2);
        }
        long j = value.f21367g;
        if (j != 0) {
            S9.i.f6631i.g(writer, 4, Long.valueOf(j));
        }
        writer.C(value.b());
    }

    @Override // S9.i
    public final int h(Object obj) {
        t value = (t) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        int e10 = value.b().e();
        String str = value.f21364d;
        if (!Intrinsics.areEqual(str, "")) {
            e10 += S9.i.f6635n.i(1, str);
        }
        q qVar = q.f21341d;
        q qVar2 = value.f21365e;
        if (qVar2 != qVar) {
            e10 += q.f21340c.i(2, qVar2);
        }
        s sVar = s.f21355d;
        s sVar2 = value.f21366f;
        if (sVar2 != sVar) {
            e10 += s.f21354c.i(3, sVar2);
        }
        long j = value.f21367g;
        if (j == 0) {
            return e10;
        }
        return S9.i.f6631i.i(4, Long.valueOf(j)) + e10;
    }
}
