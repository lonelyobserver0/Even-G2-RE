package Qb;

import kotlin.Unit;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class z0 extends AbstractC0229x0 {

    /* renamed from: e, reason: collision with root package name */
    public final D0 f5900e;

    /* renamed from: f, reason: collision with root package name */
    public final A0 f5901f;

    /* renamed from: g, reason: collision with root package name */
    public final C0211o f5902g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f5903h;

    public z0(D0 d02, A0 a02, C0211o c0211o, Object obj) {
        this.f5900e = d02;
        this.f5901f = a02;
        this.f5902g = c0211o;
        this.f5903h = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        j((Throwable) obj);
        return Unit.INSTANCE;
    }

    @Override // Qb.AbstractC0229x0
    public final void j(Throwable th) {
        Y J10;
        C0211o c0211o = this.f5902g;
        D0 d02 = this.f5900e;
        d02.getClass();
        C0211o O7 = D0.O(c0211o);
        A0 a02 = this.f5901f;
        Object obj = this.f5903h;
        if (O7 != null) {
            do {
                J10 = O7.f5883e.J((r5 & 1) == 0, (r5 & 2) != 0, new z0(d02, a02, O7, obj));
                if (J10 != H0.f5814a) {
                    return;
                } else {
                    O7 = D0.O(O7);
                }
            } while (O7 != null);
        }
        d02.n(d02.y(a02, obj));
    }
}
