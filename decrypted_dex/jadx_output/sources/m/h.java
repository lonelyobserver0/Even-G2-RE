package m;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import i.C1021b;
import i.DialogInterfaceC1025f;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class h implements x, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Context f16909a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f16910b;

    /* renamed from: c, reason: collision with root package name */
    public l f16911c;

    /* renamed from: d, reason: collision with root package name */
    public ExpandedMenuView f16912d;

    /* renamed from: e, reason: collision with root package name */
    public w f16913e;

    /* renamed from: f, reason: collision with root package name */
    public g f16914f;

    public h(ContextWrapper contextWrapper) {
        this.f16909a = contextWrapper;
        this.f16910b = LayoutInflater.from(contextWrapper);
    }

    @Override // m.x
    public final void b(l lVar, boolean z2) {
        w wVar = this.f16913e;
        if (wVar != null) {
            wVar.b(lVar, z2);
        }
    }

    @Override // m.x
    public final void c(Context context, l lVar) {
        if (this.f16909a != null) {
            this.f16909a = context;
            if (this.f16910b == null) {
                this.f16910b = LayoutInflater.from(context);
            }
        }
        this.f16911c = lVar;
        g gVar = this.f16914f;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override // m.x
    public final boolean d() {
        return false;
    }

    @Override // m.x
    public final void e(w wVar) {
        throw null;
    }

    @Override // m.x
    public final void f() {
        g gVar = this.f16914f;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override // m.x
    public final boolean h(n nVar) {
        return false;
    }

    @Override // m.x
    public final boolean i(SubMenuC1257D subMenuC1257D) {
        if (!subMenuC1257D.hasVisibleItems()) {
            return false;
        }
        m mVar = new m();
        mVar.f16945a = subMenuC1257D;
        Context context = subMenuC1257D.f16922a;
        E0.x xVar = new E0.x(context);
        C1021b c1021b = (C1021b) xVar.f1862b;
        h hVar = new h(c1021b.f14552a);
        mVar.f16947c = hVar;
        hVar.f16913e = mVar;
        subMenuC1257D.b(hVar, context);
        h hVar2 = mVar.f16947c;
        if (hVar2.f16914f == null) {
            hVar2.f16914f = new g(hVar2);
        }
        c1021b.f14564n = hVar2.f16914f;
        c1021b.f14565o = mVar;
        View view = subMenuC1257D.f16935o;
        if (view != null) {
            c1021b.f14556e = view;
        } else {
            c1021b.f14554c = subMenuC1257D.f16934n;
            c1021b.f14555d = subMenuC1257D.f16933m;
        }
        c1021b.f14563m = mVar;
        DialogInterfaceC1025f e10 = xVar.e();
        mVar.f16946b = e10;
        e10.setOnDismissListener(mVar);
        WindowManager.LayoutParams attributes = mVar.f16946b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= PKIFailureInfo.unsupportedVersion;
        mVar.f16946b.show();
        w wVar = this.f16913e;
        if (wVar == null) {
            return true;
        }
        wVar.m(subMenuC1257D);
        return true;
    }

    @Override // m.x
    public final boolean j(n nVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j) {
        this.f16911c.q(this.f16914f.getItem(i3), this, 0);
    }
}
