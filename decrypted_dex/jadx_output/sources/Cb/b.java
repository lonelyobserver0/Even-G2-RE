package Cb;

import com.stub.StubApp;
import java.util.HashMap;
import org.slf4j.LoggerFactory;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class b extends e {

    /* renamed from: b, reason: collision with root package name */
    public static final org.slf4j.a f1159b = LoggerFactory.getLogger((Class<?>) b.class);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f1160a;

    public b(byte[] bArr) {
        this.f1160a = bArr;
    }

    @Override // Cb.e
    public int b() {
        return 4;
    }

    @Override // Cb.e
    public final /* bridge */ /* synthetic */ Ab.h c() {
        return Ab.h.f283e;
    }

    @Override // Cb.e
    public final void e(Mb.a aVar) {
        Gb.c cVar = new Gb.c((wb.f) ((Ab.g) aVar.f4726e).f278e);
        a aVar2 = new a(this, aVar);
        HashMap hashMap = new HashMap();
        hashMap.put(StubApp.getString2(1225), Boolean.TRUE);
        hashMap.put(StubApp.getString2(1226), this.f1160a);
        cVar.b(2, 0, hashMap, 2500L, Kb.a.class, aVar2);
    }
}
