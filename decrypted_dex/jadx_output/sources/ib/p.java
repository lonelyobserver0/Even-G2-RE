package ib;

import com.stub.StubApp;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class p extends StandardMessageCodec {

    /* renamed from: a, reason: collision with root package name */
    public static final p f15012a = new p();

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public final Object readValueOfType(byte b2, ByteBuffer byteBuffer) {
        if (b2 != -127) {
            if (b2 != -126) {
                return super.readValueOfType(b2, byteBuffer);
            }
            ArrayList arrayList = (ArrayList) readValue(byteBuffer);
            f fVar = new f();
            String str = (String) arrayList.get(0);
            if (str == null) {
                throw new IllegalStateException(StubApp.getString2(431));
            }
            fVar.f14994a = str;
            e eVar = (e) arrayList.get(1);
            if (eVar == null) {
                throw new IllegalStateException(StubApp.getString2(18617));
            }
            fVar.f14995b = eVar;
            fVar.f14996c = (Boolean) arrayList.get(2);
            Map map = (Map) arrayList.get(3);
            if (map == null) {
                throw new IllegalStateException(StubApp.getString2(430));
            }
            fVar.f14997d = map;
            return fVar;
        }
        ArrayList arrayList2 = (ArrayList) readValue(byteBuffer);
        e eVar2 = new e();
        String str2 = (String) arrayList2.get(0);
        if (str2 == null) {
            throw new IllegalStateException(StubApp.getString2(18615));
        }
        eVar2.f14981a = str2;
        String str3 = (String) arrayList2.get(1);
        if (str3 == null) {
            throw new IllegalStateException(StubApp.getString2(18614));
        }
        eVar2.f14982b = str3;
        String str4 = (String) arrayList2.get(2);
        if (str4 == null) {
            throw new IllegalStateException(StubApp.getString2(18613));
        }
        eVar2.f14983c = str4;
        String str5 = (String) arrayList2.get(3);
        if (str5 == null) {
            throw new IllegalStateException(StubApp.getString2(18612));
        }
        eVar2.f14984d = str5;
        eVar2.f14985e = (String) arrayList2.get(4);
        eVar2.f14986f = (String) arrayList2.get(5);
        eVar2.f14987g = (String) arrayList2.get(6);
        eVar2.f14988h = (String) arrayList2.get(7);
        eVar2.f14989i = (String) arrayList2.get(8);
        eVar2.j = (String) arrayList2.get(9);
        eVar2.f14990k = (String) arrayList2.get(10);
        eVar2.f14991l = (String) arrayList2.get(11);
        eVar2.f14992m = (String) arrayList2.get(12);
        eVar2.f14993n = (String) arrayList2.get(13);
        return eVar2;
    }

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public final void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (!(obj instanceof e)) {
            if (!(obj instanceof f)) {
                super.writeValue(byteArrayOutputStream, obj);
                return;
            }
            byteArrayOutputStream.write(130);
            f fVar = (f) obj;
            fVar.getClass();
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(fVar.f14994a);
            arrayList.add(fVar.f14995b);
            arrayList.add(fVar.f14996c);
            arrayList.add(fVar.f14997d);
            writeValue(byteArrayOutputStream, arrayList);
            return;
        }
        byteArrayOutputStream.write(129);
        e eVar = (e) obj;
        eVar.getClass();
        ArrayList arrayList2 = new ArrayList(14);
        arrayList2.add(eVar.f14981a);
        arrayList2.add(eVar.f14982b);
        arrayList2.add(eVar.f14983c);
        arrayList2.add(eVar.f14984d);
        arrayList2.add(eVar.f14985e);
        arrayList2.add(eVar.f14986f);
        arrayList2.add(eVar.f14987g);
        arrayList2.add(eVar.f14988h);
        arrayList2.add(eVar.f14989i);
        arrayList2.add(eVar.j);
        arrayList2.add(eVar.f14990k);
        arrayList2.add(eVar.f14991l);
        arrayList2.add(eVar.f14992m);
        arrayList2.add(eVar.f14993n);
        writeValue(byteArrayOutputStream, arrayList2);
    }
}
