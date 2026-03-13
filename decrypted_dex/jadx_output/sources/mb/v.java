package mb;

import com.stub.StubApp;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class v extends StandardMessageCodec {

    /* renamed from: a, reason: collision with root package name */
    public static final v f17349a = new v();

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public final Object readValueOfType(byte b2, ByteBuffer byteBuffer) {
        String string2 = StubApp.getString2(21207);
        switch (b2) {
            case -127:
                Object readValue = readValue(byteBuffer);
                if (readValue == null) {
                    return null;
                }
                return x.values()[((Long) readValue).intValue()];
            case -126:
                Object readValue2 = readValue(byteBuffer);
                if (readValue2 == null) {
                    return null;
                }
                return z.values()[((Long) readValue2).intValue()];
            case -125:
                Object readValue3 = readValue(byteBuffer);
                if (readValue3 == null) {
                    return null;
                }
                return l.values()[((Long) readValue3).intValue()];
            case -124:
                ArrayList arrayList = (ArrayList) readValue(byteBuffer);
                n nVar = new n();
                Boolean bool = (Boolean) arrayList.get(0);
                if (bool == null) {
                    throw new IllegalStateException(StubApp.getString2(21215));
                }
                nVar.f17334a = bool;
                Boolean bool2 = (Boolean) arrayList.get(1);
                if (bool2 == null) {
                    throw new IllegalStateException(StubApp.getString2(21214));
                }
                nVar.f17335b = bool2;
                nVar.f17336c = (Long) arrayList.get(2);
                return nVar;
            case -123:
                ArrayList arrayList2 = (ArrayList) readValue(byteBuffer);
                t tVar = new t();
                tVar.f17345a = (Double) arrayList2.get(0);
                tVar.f17346b = (Double) arrayList2.get(1);
                Long l9 = (Long) arrayList2.get(2);
                if (l9 == null) {
                    throw new IllegalStateException(StubApp.getString2(21213));
                }
                tVar.f17347c = l9;
                return tVar;
            case -122:
                ArrayList arrayList3 = (ArrayList) readValue(byteBuffer);
                u uVar = new u();
                t tVar2 = (t) arrayList3.get(0);
                if (tVar2 == null) {
                    throw new IllegalStateException(StubApp.getString2(21212));
                }
                uVar.f17348a = tVar2;
                return uVar;
            case -121:
                ArrayList arrayList4 = (ArrayList) readValue(byteBuffer);
                C1291A c1291a = new C1291A();
                c1291a.f17289a = (Long) arrayList4.get(0);
                return c1291a;
            case -120:
                ArrayList arrayList5 = (ArrayList) readValue(byteBuffer);
                y yVar = new y();
                z zVar = (z) arrayList5.get(0);
                if (zVar == null) {
                    throw new IllegalStateException(string2);
                }
                yVar.f17352a = zVar;
                yVar.f17353b = (x) arrayList5.get(1);
                return yVar;
            case -119:
                ArrayList arrayList6 = (ArrayList) readValue(byteBuffer);
                j jVar = new j();
                String str = (String) arrayList6.get(0);
                if (str == null) {
                    throw new IllegalStateException(StubApp.getString2(21202));
                }
                jVar.f17324a = str;
                jVar.f17325b = (String) arrayList6.get(1);
                return jVar;
            case -118:
                ArrayList arrayList7 = (ArrayList) readValue(byteBuffer);
                k kVar = new k();
                l lVar = (l) arrayList7.get(0);
                if (lVar == null) {
                    throw new IllegalStateException(string2);
                }
                kVar.f17326a = lVar;
                kVar.f17327b = (j) arrayList7.get(1);
                List list = (List) arrayList7.get(2);
                if (list == null) {
                    throw new IllegalStateException(StubApp.getString2(21206));
                }
                kVar.f17328c = list;
                return kVar;
            default:
                return super.readValueOfType(b2, byteBuffer);
        }
    }

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public final void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (obj instanceof x) {
            byteArrayOutputStream.write(129);
            writeValue(byteArrayOutputStream, obj != null ? Integer.valueOf(((x) obj).f17351a) : null);
            return;
        }
        if (obj instanceof z) {
            byteArrayOutputStream.write(130);
            writeValue(byteArrayOutputStream, obj != null ? Integer.valueOf(((z) obj).f17355a) : null);
            return;
        }
        if (obj instanceof l) {
            byteArrayOutputStream.write(131);
            writeValue(byteArrayOutputStream, obj != null ? Integer.valueOf(((l) obj).f17332a) : null);
            return;
        }
        if (obj instanceof n) {
            byteArrayOutputStream.write(132);
            n nVar = (n) obj;
            nVar.getClass();
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(nVar.f17334a);
            arrayList.add(nVar.f17335b);
            arrayList.add(nVar.f17336c);
            writeValue(byteArrayOutputStream, arrayList);
            return;
        }
        if (obj instanceof t) {
            byteArrayOutputStream.write(133);
            t tVar = (t) obj;
            tVar.getClass();
            ArrayList arrayList2 = new ArrayList(3);
            arrayList2.add(tVar.f17345a);
            arrayList2.add(tVar.f17346b);
            arrayList2.add(tVar.f17347c);
            writeValue(byteArrayOutputStream, arrayList2);
            return;
        }
        if (obj instanceof u) {
            byteArrayOutputStream.write(134);
            u uVar = (u) obj;
            uVar.getClass();
            ArrayList arrayList3 = new ArrayList(1);
            arrayList3.add(uVar.f17348a);
            writeValue(byteArrayOutputStream, arrayList3);
            return;
        }
        if (obj instanceof C1291A) {
            byteArrayOutputStream.write(135);
            C1291A c1291a = (C1291A) obj;
            c1291a.getClass();
            ArrayList arrayList4 = new ArrayList(1);
            arrayList4.add(c1291a.f17289a);
            writeValue(byteArrayOutputStream, arrayList4);
            return;
        }
        if (obj instanceof y) {
            byteArrayOutputStream.write(136);
            y yVar = (y) obj;
            yVar.getClass();
            ArrayList arrayList5 = new ArrayList(2);
            arrayList5.add(yVar.f17352a);
            arrayList5.add(yVar.f17353b);
            writeValue(byteArrayOutputStream, arrayList5);
            return;
        }
        if (obj instanceof j) {
            byteArrayOutputStream.write(137);
            j jVar = (j) obj;
            jVar.getClass();
            ArrayList arrayList6 = new ArrayList(2);
            arrayList6.add(jVar.f17324a);
            arrayList6.add(jVar.f17325b);
            writeValue(byteArrayOutputStream, arrayList6);
            return;
        }
        if (!(obj instanceof k)) {
            super.writeValue(byteArrayOutputStream, obj);
            return;
        }
        byteArrayOutputStream.write(138);
        k kVar = (k) obj;
        kVar.getClass();
        ArrayList arrayList7 = new ArrayList(3);
        arrayList7.add(kVar.f17326a);
        arrayList7.add(kVar.f17327b);
        arrayList7.add(kVar.f17328c);
        writeValue(byteArrayOutputStream, arrayList7);
    }
}
