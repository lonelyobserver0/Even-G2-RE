package Qb;

import kotlin.Unit;

/* renamed from: Qb.o, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0211o extends AbstractC0225v0 implements InterfaceC0209n {

    /* renamed from: e, reason: collision with root package name */
    public final D0 f5883e;

    public C0211o(D0 d02) {
        this.f5883e = d02;
    }

    @Override // Qb.InterfaceC0209n
    public final boolean b(Throwable th) {
        return i().v(th);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        j((Throwable) obj);
        return Unit.INSTANCE;
    }

    @Override // Qb.AbstractC0229x0
    public final void j(Throwable th) {
        this.f5883e.r(i());
    }
}
