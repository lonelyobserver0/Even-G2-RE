package Cb;

import no.nordicsemi.android.dfu.DfuServiceInitiator;
import org.slf4j.LoggerFactory;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class n extends e {

    /* renamed from: d, reason: collision with root package name */
    public static final org.slf4j.a f1183d = LoggerFactory.getLogger((Class<?>) n.class);

    /* renamed from: a, reason: collision with root package name */
    public final Bb.a f1184a;

    /* renamed from: b, reason: collision with root package name */
    public final Ab.f f1185b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1186c;

    public n(Ab.f fVar, Bb.a aVar, boolean z2) {
        this.f1185b = fVar;
        this.f1184a = aVar;
        this.f1186c = z2;
    }

    public static void f(n nVar, Mb.a aVar, boolean z2, boolean z10) {
        nVar.getClass();
        new Gb.c((wb.f) ((Ab.g) aVar.f4726e).f278e).b(0, 0, null, DfuServiceInitiator.DEFAULT_SCAN_TIMEOUT, Kb.a.class, new m(nVar, aVar, z2, z10));
    }

    @Override // Cb.e
    public final int b() {
        return 0;
    }

    @Override // Cb.e
    public final /* bridge */ /* synthetic */ Ab.h c() {
        return Ab.h.f279a;
    }

    @Override // Cb.e
    public final void e(Mb.a aVar) {
        Gb.b bVar = new Gb.b(0, (wb.f) ((Ab.g) aVar.f4726e).f278e);
        bVar.b(0, 8, null, 2500L, Ib.a.class, new Q2.g(this, bVar, aVar));
    }
}
