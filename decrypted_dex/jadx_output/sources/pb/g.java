package pb;

import com.stub.StubApp;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class g extends StandardMessageCodec {

    /* renamed from: a, reason: collision with root package name */
    public static final g f19780a = new g();

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public final Object readValueOfType(byte b2, ByteBuffer byteBuffer) {
        String string2 = StubApp.getString2(22162);
        switch (b2) {
            case -127:
                Object readValue = readValue(byteBuffer);
                if (readValue == null) {
                    return null;
                }
                return h.values()[((Long) readValue).intValue()];
            case -126:
                ArrayList arrayList = (ArrayList) readValue(byteBuffer);
                i iVar = new i();
                Long l9 = (Long) arrayList.get(0);
                if (l9 == null) {
                    throw new IllegalStateException(string2);
                }
                iVar.f19783a = l9;
                return iVar;
            case -125:
                ArrayList arrayList2 = (ArrayList) readValue(byteBuffer);
                f fVar = new f();
                String str = (String) arrayList2.get(0);
                if (str == null) {
                    throw new IllegalStateException(StubApp.getString2(22167));
                }
                fVar.f19776a = str;
                fVar.f19777b = (h) arrayList2.get(1);
                Map map = (Map) arrayList2.get(2);
                if (map == null) {
                    throw new IllegalStateException(StubApp.getString2(22166));
                }
                fVar.f19778c = map;
                fVar.f19779d = (String) arrayList2.get(3);
                return fVar;
            case -124:
                ArrayList arrayList3 = (ArrayList) readValue(byteBuffer);
                k kVar = new k();
                Long l10 = (Long) arrayList3.get(0);
                if (l10 == null) {
                    throw new IllegalStateException(string2);
                }
                kVar.f19786a = l10;
                Long l11 = (Long) arrayList3.get(1);
                if (l11 == null) {
                    throw new IllegalStateException(StubApp.getString2(22165));
                }
                kVar.f19787b = l11;
                return kVar;
            case -123:
                ArrayList arrayList4 = (ArrayList) readValue(byteBuffer);
                j jVar = new j();
                Long l12 = (Long) arrayList4.get(0);
                if (l12 == null) {
                    throw new IllegalStateException(StubApp.getString2(22164));
                }
                jVar.f19784a = l12;
                Long l13 = (Long) arrayList4.get(1);
                if (l13 == null) {
                    throw new IllegalStateException(StubApp.getString2(22163));
                }
                jVar.f19785b = l13;
                return jVar;
            default:
                return super.readValueOfType(b2, byteBuffer);
        }
    }

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public final void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (obj instanceof h) {
            byteArrayOutputStream.write(129);
            writeValue(byteArrayOutputStream, obj == null ? null : Integer.valueOf(((h) obj).f19782a));
            return;
        }
        if (obj instanceof i) {
            byteArrayOutputStream.write(130);
            i iVar = (i) obj;
            iVar.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(iVar.f19783a);
            writeValue(byteArrayOutputStream, arrayList);
            return;
        }
        if (obj instanceof f) {
            byteArrayOutputStream.write(131);
            f fVar = (f) obj;
            fVar.getClass();
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(fVar.f19776a);
            arrayList2.add(fVar.f19777b);
            arrayList2.add(fVar.f19778c);
            arrayList2.add(fVar.f19779d);
            writeValue(byteArrayOutputStream, arrayList2);
            return;
        }
        if (obj instanceof k) {
            byteArrayOutputStream.write(132);
            k kVar = (k) obj;
            kVar.getClass();
            ArrayList arrayList3 = new ArrayList(2);
            arrayList3.add(kVar.f19786a);
            arrayList3.add(kVar.f19787b);
            writeValue(byteArrayOutputStream, arrayList3);
            return;
        }
        if (!(obj instanceof j)) {
            super.writeValue(byteArrayOutputStream, obj);
            return;
        }
        byteArrayOutputStream.write(133);
        j jVar = (j) obj;
        jVar.getClass();
        ArrayList arrayList4 = new ArrayList(2);
        arrayList4.add(jVar.f19784a);
        arrayList4.add(jVar.f19785b);
        writeValue(byteArrayOutputStream, arrayList4);
    }
}
