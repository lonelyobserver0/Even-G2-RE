package ob;

import com.stub.StubApp;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class c extends StandardMessageCodec {

    /* renamed from: a, reason: collision with root package name */
    public static final c f18645a = new c();

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public final Object readValueOfType(byte b2, ByteBuffer byteBuffer) {
        if (b2 != -127) {
            if (b2 != -126) {
                return super.readValueOfType(b2, byteBuffer);
            }
            ArrayList arrayList = (ArrayList) readValue(byteBuffer);
            C1474a c1474a = new C1474a();
            Boolean bool = (Boolean) arrayList.get(0);
            if (bool == null) {
                throw new IllegalStateException(StubApp.getString2(22061));
            }
            c1474a.f18643a = bool;
            return c1474a;
        }
        ArrayList arrayList2 = (ArrayList) readValue(byteBuffer);
        f fVar = new f();
        Boolean bool2 = (Boolean) arrayList2.get(0);
        if (bool2 == null) {
            throw new IllegalStateException(StubApp.getString2(22064));
        }
        fVar.f18648a = bool2;
        Boolean bool3 = (Boolean) arrayList2.get(1);
        if (bool3 == null) {
            throw new IllegalStateException(StubApp.getString2(22063));
        }
        fVar.f18649b = bool3;
        Map map = (Map) arrayList2.get(2);
        if (map == null) {
            throw new IllegalStateException(StubApp.getString2(22062));
        }
        fVar.f18650c = map;
        return fVar;
    }

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public final void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (obj instanceof f) {
            byteArrayOutputStream.write(129);
            f fVar = (f) obj;
            fVar.getClass();
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(fVar.f18648a);
            arrayList.add(fVar.f18649b);
            arrayList.add(fVar.f18650c);
            writeValue(byteArrayOutputStream, arrayList);
            return;
        }
        if (!(obj instanceof C1474a)) {
            super.writeValue(byteArrayOutputStream, obj);
            return;
        }
        byteArrayOutputStream.write(130);
        C1474a c1474a = (C1474a) obj;
        c1474a.getClass();
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add(c1474a.f18643a);
        writeValue(byteArrayOutputStream, arrayList2);
    }
}
