package n;

import m.InterfaceC1255B;

/* renamed from: n.H, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1307H extends AbstractViewOnTouchListenerC1364t0 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1313N f17406k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1316Q f17407l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1307H(C1316Q c1316q, C1316Q c1316q2, C1313N c1313n) {
        super(c1316q2);
        this.f17407l = c1316q;
        this.f17406k = c1313n;
    }

    @Override // n.AbstractViewOnTouchListenerC1364t0
    public final InterfaceC1255B b() {
        return this.f17406k;
    }

    @Override // n.AbstractViewOnTouchListenerC1364t0
    public final boolean c() {
        C1316Q c1316q = this.f17407l;
        if (c1316q.getInternalPopup().a()) {
            return true;
        }
        c1316q.f17454f.l(c1316q.getTextDirection(), c1316q.getTextAlignment());
        return true;
    }
}
