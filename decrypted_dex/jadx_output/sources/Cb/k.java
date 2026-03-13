package Cb;

import com.stub.StubApp;
import java.util.HashMap;
import org.slf4j.LoggerFactory;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class k extends e {

    /* renamed from: b, reason: collision with root package name */
    public static final org.slf4j.a f1174b = LoggerFactory.getLogger((Class<?>) k.class);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f1175a;

    public k(byte[] bArr) {
        this.f1175a = bArr;
    }

    @Override // Cb.e
    public final int b() {
        return 4;
    }

    @Override // Cb.e
    public final /* bridge */ /* synthetic */ Ab.h c() {
        return Ab.h.f281c;
    }

    @Override // Cb.e
    public final void e(Mb.a aVar) {
        Gb.c cVar = new Gb.c((wb.f) ((Ab.g) aVar.f4726e).f278e);
        j jVar = new j(this, aVar);
        HashMap hashMap = new HashMap();
        hashMap.put(StubApp.getString2(1226), this.f1175a);
        hashMap.put(StubApp.getString2(1225), Boolean.FALSE);
        cVar.b(2, 0, hashMap, 2500L, Kb.a.class, jVar);
    }
}
