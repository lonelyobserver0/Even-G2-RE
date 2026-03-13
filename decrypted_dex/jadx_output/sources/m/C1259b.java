package m;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import n.AbstractViewOnTouchListenerC1364t0;
import n.C1337g;
import n.C1339h;
import n.C1343j;
import n.C1345k;

/* renamed from: m.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1259b extends AbstractViewOnTouchListenerC1364t0 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f16876k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ View f16877l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1259b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f16877l = actionMenuItemView;
    }

    @Override // n.AbstractViewOnTouchListenerC1364t0
    public final InterfaceC1255B b() {
        C1337g c1337g;
        switch (this.f16876k) {
            case 0:
                AbstractC1260c abstractC1260c = ((ActionMenuItemView) this.f16877l).f9394f;
                if (abstractC1260c == null || (c1337g = ((C1339h) abstractC1260c).f17522a.f17550w) == null) {
                    return null;
                }
                return c1337g.a();
            default:
                C1337g c1337g2 = ((C1343j) this.f16877l).f17531d.f17549v;
                if (c1337g2 == null) {
                    return null;
                }
                return c1337g2.a();
        }
    }

    @Override // n.AbstractViewOnTouchListenerC1364t0
    public final boolean c() {
        InterfaceC1255B b2;
        switch (this.f16876k) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f16877l;
                k kVar = actionMenuItemView.f9392d;
                return kVar != null && kVar.c(actionMenuItemView.f9389a) && (b2 = b()) != null && b2.a();
            default:
                ((C1343j) this.f16877l).f17531d.l();
                return true;
        }
    }

    @Override // n.AbstractViewOnTouchListenerC1364t0
    public boolean d() {
        switch (this.f16876k) {
            case 1:
                C1345k c1345k = ((C1343j) this.f16877l).f17531d;
                if (c1345k.f17551x != null) {
                    return false;
                }
                c1345k.g();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1259b(C1343j c1343j, C1343j c1343j2) {
        super(c1343j2);
        this.f16877l = c1343j;
    }
}
