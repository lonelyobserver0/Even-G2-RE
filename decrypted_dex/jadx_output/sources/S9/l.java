package S9;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class l extends i {
    @Override // S9.i
    public final Object b(o reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long d8 = reader.d();
        while (true) {
            int g10 = reader.g();
            if (g10 == -1) {
                reader.e(d8);
                return linkedHashMap;
            }
            if (g10 != 1) {
                reader.m();
            } else {
                long d10 = reader.d();
                Object obj = null;
                Object obj2 = null;
                while (true) {
                    int g11 = reader.g();
                    if (g11 == -1) {
                        break;
                    }
                    if (g11 == 1) {
                        obj = i.f6635n.b(reader);
                    } else if (g11 != 2) {
                        reader.j(g11);
                    } else {
                        obj2 = i.f6639r.b(reader);
                    }
                }
                reader.e(d10);
                if (obj != null) {
                    linkedHashMap.put(obj, obj2);
                }
            }
        }
    }

    @Override // S9.i
    public final void d(r writer, Object obj) {
        Map map = (Map) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (map == null) {
            return;
        }
        Map.Entry[] entryArr = (Map.Entry[]) map.entrySet().toArray(new Map.Entry[0]);
        ArraysKt.reverse(entryArr);
        for (Map.Entry entry : entryArr) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            int b2 = writer.b();
            i.f6639r.f(writer, 2, value);
            i.f6635n.f(writer, 1, str);
            writer.h(writer.b() - b2);
            writer.g(1, d.f6616d);
        }
    }

    @Override // S9.i
    public final void e(s2.d writer, Object obj) {
        Map map = (Map) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (map == null) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            b bVar = i.f6635n;
            int i3 = bVar.i(1, str);
            m mVar = i.f6639r;
            int i10 = mVar.i(2, value) + i3;
            writer.D(1, d.f6616d);
            writer.E(i10);
            bVar.g(writer, 1, str);
            mVar.g(writer, 2, value);
        }
    }

    @Override // S9.i
    public final int h(Object obj) {
        Map map = (Map) obj;
        int i3 = 0;
        if (map == null) {
            return 0;
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            int i10 = i.f6639r.i(2, value) + i.f6635n.i(1, str);
            d fieldEncoding = d.f6614b;
            Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
            i3 += Ec.d.K(i10) + Ec.d.K(8) + i10;
        }
        return i3;
    }
}
