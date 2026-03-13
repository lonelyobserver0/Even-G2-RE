package S9;

import com.stub.StubApp;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class m extends i {
    @Override // S9.i
    public final Object b(o reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        long d8 = reader.d();
        while (true) {
            Object obj = null;
            while (true) {
                int g10 = reader.g();
                if (g10 == -1) {
                    reader.e(d8);
                    return obj;
                }
                switch (g10) {
                    case 1:
                        break;
                    case 2:
                        obj = i.f6633l.b(reader);
                        break;
                    case 3:
                        obj = i.f6635n.b(reader);
                        break;
                    case 4:
                        obj = i.f6628f.b(reader);
                        break;
                    case 5:
                        obj = i.f6636o.b(reader);
                        break;
                    case 6:
                        obj = i.f6637p.b(reader);
                        break;
                    default:
                        reader.m();
                        break;
                }
            }
            i.f6638q.b(reader);
        }
    }

    @Override // S9.i
    public final void d(r writer, Object obj) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (obj == null) {
            i.f6638q.f(writer, 1, obj);
            return;
        }
        if (obj instanceof Number) {
            i.f6633l.f(writer, 2, Double.valueOf(((Number) obj).doubleValue()));
            return;
        }
        if (obj instanceof String) {
            i.f6635n.f(writer, 3, obj);
            return;
        }
        if (obj instanceof Boolean) {
            i.f6628f.f(writer, 4, obj);
            return;
        }
        if (obj instanceof Map) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, *>");
            i.f6636o.f(writer, 5, (Map) obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException(Xa.h.m(obj, StubApp.getString2(6047)));
            }
            i.f6637p.f(writer, 6, obj);
        }
    }

    @Override // S9.i
    public final void e(s2.d writer, Object obj) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (obj == null) {
            i.f6638q.g(writer, 1, obj);
            return;
        }
        if (obj instanceof Number) {
            i.f6633l.g(writer, 2, Double.valueOf(((Number) obj).doubleValue()));
            return;
        }
        if (obj instanceof String) {
            i.f6635n.g(writer, 3, obj);
            return;
        }
        if (obj instanceof Boolean) {
            i.f6628f.g(writer, 4, obj);
            return;
        }
        if (obj instanceof Map) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, *>");
            i.f6636o.g(writer, 5, (Map) obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException(Xa.h.m(obj, StubApp.getString2(6047)));
            }
            i.f6637p.g(writer, 6, obj);
        }
    }

    @Override // S9.i
    public final void f(r writer, int i3, Object obj) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (obj != null) {
            super.f(writer, i3, obj);
            return;
        }
        int b2 = writer.b();
        d(writer, obj);
        writer.h(writer.b() - b2);
        writer.g(i3, this.f6640a);
    }

    @Override // S9.i
    public final void g(s2.d writer, int i3, Object obj) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (obj != null) {
            super.g(writer, i3, obj);
            return;
        }
        writer.D(i3, this.f6640a);
        writer.E(h(obj));
        e(writer, obj);
    }

    @Override // S9.i
    public final int h(Object obj) {
        if (obj == null) {
            return i.f6638q.i(1, obj);
        }
        if (obj instanceof Number) {
            return i.f6633l.i(2, Double.valueOf(((Number) obj).doubleValue()));
        }
        if (obj instanceof String) {
            return i.f6635n.i(3, obj);
        }
        if (obj instanceof Boolean) {
            return i.f6628f.i(4, obj);
        }
        if (obj instanceof Map) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, *>");
            return i.f6636o.i(5, (Map) obj);
        }
        if (obj instanceof List) {
            return i.f6637p.i(6, obj);
        }
        throw new IllegalArgumentException(Xa.h.m(obj, StubApp.getString2(6047)));
    }

    @Override // S9.i
    public final int i(int i3, Object obj) {
        if (obj != null) {
            return super.i(i3, obj);
        }
        int h2 = h(obj);
        d fieldEncoding = d.f6614b;
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        return Ec.d.K(h2) + Ec.d.K(i3 << 3) + h2;
    }
}
