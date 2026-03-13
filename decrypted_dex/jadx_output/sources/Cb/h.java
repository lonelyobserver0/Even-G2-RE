package Cb;

import Z9.C;
import org.slf4j.LoggerFactory;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class h extends e {

    /* renamed from: c, reason: collision with root package name */
    public static final org.slf4j.a f1169c = LoggerFactory.getLogger((Class<?>) h.class);

    /* renamed from: a, reason: collision with root package name */
    public long f1170a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1171b;

    public h(boolean z2) {
        this.f1171b = z2;
    }

    @Override // Cb.e
    public int b() {
        return 10;
    }

    @Override // Cb.e
    public final /* bridge */ /* synthetic */ Ab.h c() {
        return Ab.h.f282d;
    }

    @Override // Cb.e
    public final void e(Mb.a aVar) {
        Ab.g gVar = (Ab.g) aVar.f4726e;
        wb.f fVar = (wb.f) gVar.f278e;
        g gVar2 = new g(this, fVar, aVar, gVar);
        synchronized (fVar) {
            fVar.f22305s.add(gVar2);
        }
        new Gb.b(0, fVar).b(2, 5, null, 2500L, Ib.b.class, new C(this, aVar, 6, false));
    }
}
