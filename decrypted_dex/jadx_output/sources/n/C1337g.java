package n;

import android.content.Context;
import android.view.View;
import f4.C0882f;
import m.SubMenuC1257D;

/* renamed from: n.g, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1337g extends m.v {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f17520l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1345k f17521m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1337g(C1345k c1345k, Context context, m.l lVar, View view) {
        super(2130903072, context, view, lVar, true);
        this.f17521m = c1345k;
        this.f16993f = 8388613;
        C0882f c0882f = c1345k.f17553z;
        this.f16995h = c0882f;
        m.t tVar = this.f16996i;
        if (tVar != null) {
            tVar.e(c0882f);
        }
    }

    @Override // m.v
    public final void c() {
        switch (this.f17520l) {
            case 0:
                C1345k c1345k = this.f17521m;
                c1345k.f17550w = null;
                c1345k.getClass();
                super.c();
                break;
            default:
                C1345k c1345k2 = this.f17521m;
                m.l lVar = c1345k2.f17534c;
                if (lVar != null) {
                    lVar.c(true);
                }
                c1345k2.f17549v = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1337g(C1345k c1345k, Context context, SubMenuC1257D subMenuC1257D, View view) {
        super(2130903072, context, view, subMenuC1257D, false);
        this.f17521m = c1345k;
        if ((subMenuC1257D.f16859A.f16973x & 32) != 32) {
            View view2 = c1345k.j;
            this.f16992e = view2 == null ? (View) c1345k.f17539h : view2;
        }
        C0882f c0882f = c1345k.f17553z;
        this.f16995h = c0882f;
        m.t tVar = this.f16996i;
        if (tVar != null) {
            tVar.e(c0882f);
        }
    }
}
