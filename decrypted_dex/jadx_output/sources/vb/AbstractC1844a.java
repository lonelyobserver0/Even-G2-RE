package vb;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.cbor.CBORFactory;
import com.stub.StubApp;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.LoggerFactory;
import wb.f;

/* renamed from: vb.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1844a {

    /* renamed from: d, reason: collision with root package name */
    public static final org.slf4j.a f21908d = LoggerFactory.getLogger((Class<?>) AbstractC1844a.class);

    /* renamed from: a, reason: collision with root package name */
    public final int f21909a;

    /* renamed from: b, reason: collision with root package name */
    public final f f21910b;

    /* renamed from: c, reason: collision with root package name */
    public int f21911c = 65543;

    public AbstractC1844a(int i3, f fVar) {
        this.f21909a = i3;
        this.f21910b = fVar;
    }

    public static byte[] a(int i3, int i10, int i11, Map map) {
        EnumC1848e enumC1848e = EnumC1848e.f21933a;
        String string2 = StubApp.getString2(1486);
        if (map == null) {
            try {
                map = new HashMap();
            } catch (IOException e10) {
                throw new Db.c(StubApp.getString2(23728), e10);
            }
        }
        HashMap hashMap = new HashMap(map);
        hashMap.remove(string2);
        CBORFactory cBORFactory = Ob.a.f5373a;
        CBORFactory cBORFactory2 = Ob.a.f5373a;
        byte[] writeValueAsBytes = new ObjectMapper(cBORFactory2).writeValueAsBytes(hashMap);
        int length = writeValueAsBytes.length;
        byte b2 = (byte) 0;
        byte[] bArr = {(byte) ((i3 & 7) | 8), b2, (byte) (length >>> 8), (byte) length, (byte) 0, (byte) i10, b2, (byte) i11};
        if (enumC1848e.a()) {
            if (map.get(string2) == null) {
                map.put(string2, bArr);
            }
            return new ObjectMapper(cBORFactory2).writeValueAsBytes(map);
        }
        byte[] bArr2 = new byte[writeValueAsBytes.length + 8];
        System.arraycopy(bArr, 0, bArr2, 0, 8);
        System.arraycopy(writeValueAsBytes, 0, bArr2, 8, writeValueAsBytes.length);
        return bArr2;
    }

    public final void b(int i3, int i10, Map map, long j, Class cls, InterfaceC1845b interfaceC1845b) {
        InterfaceC1845b interfaceC1845b2;
        try {
            interfaceC1845b2 = interfaceC1845b;
            try {
                this.f21910b.d(a(i3, this.f21909a, i10, map), j, cls, interfaceC1845b2);
            } catch (Db.c e10) {
                e = e10;
                interfaceC1845b2.i(e);
            }
        } catch (Db.c e11) {
            e = e11;
            interfaceC1845b2 = interfaceC1845b;
        }
    }

    public final synchronized boolean c(int i3) {
        if (i3 < 20) {
            f21908d.a(StubApp.getString2("23729"));
            return false;
        }
        if (i3 > 65543) {
            f21908d.a(StubApp.getString2("23730"));
            return false;
        }
        this.f21911c = i3;
        return true;
    }
}
