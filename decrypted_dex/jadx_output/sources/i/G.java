package i;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import l.AbstractC1130a;
import n.C1345k;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class G extends AbstractC1130a implements m.j {

    /* renamed from: c, reason: collision with root package name */
    public final Context f14520c;

    /* renamed from: d, reason: collision with root package name */
    public final m.l f14521d;

    /* renamed from: e, reason: collision with root package name */
    public Y.m f14522e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f14523f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ H f14524g;

    public G(H h2, Context context, Y.m mVar) {
        this.f14524g = h2;
        this.f14520c = context;
        this.f14522e = mVar;
        m.l lVar = new m.l(context);
        lVar.f16932l = 1;
        this.f14521d = lVar;
        lVar.f16926e = this;
    }

    @Override // l.AbstractC1130a
    public final void a() {
        H h2 = this.f14524g;
        if (h2.j != this) {
            return;
        }
        if (h2.f14541q) {
            h2.f14535k = this;
            h2.f14536l = this.f14522e;
        } else {
            this.f14522e.u(this);
        }
        this.f14522e = null;
        h2.V(false);
        ActionBarContextView actionBarContextView = h2.f14532g;
        if (actionBarContextView.f9434l == null) {
            actionBarContextView.e();
        }
        h2.f14529d.setHideOnContentScrollEnabled(h2.f14546v);
        h2.j = null;
    }

    @Override // l.AbstractC1130a
    public final View b() {
        WeakReference weakReference = this.f14523f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // l.AbstractC1130a
    public final m.l c() {
        return this.f14521d;
    }

    @Override // l.AbstractC1130a
    public final MenuInflater d() {
        return new l.h(this.f14520c);
    }

    @Override // l.AbstractC1130a
    public final CharSequence e() {
        return this.f14524g.f14532g.getSubtitle();
    }

    @Override // l.AbstractC1130a
    public final CharSequence f() {
        return this.f14524g.f14532g.getTitle();
    }

    @Override // l.AbstractC1130a
    public final void g() {
        if (this.f14524g.j != this) {
            return;
        }
        m.l lVar = this.f14521d;
        lVar.w();
        try {
            this.f14522e.v(this, lVar);
        } finally {
            lVar.v();
        }
    }

    @Override // m.j
    public final void h(m.l lVar) {
        if (this.f14522e == null) {
            return;
        }
        g();
        C1345k c1345k = this.f14524g.f14532g.f9428d;
        if (c1345k != null) {
            c1345k.l();
        }
    }

    @Override // l.AbstractC1130a
    public final boolean i() {
        return this.f14524g.f14532g.f9442v;
    }

    @Override // l.AbstractC1130a
    public final void j(View view) {
        this.f14524g.f14532g.setCustomView(view);
        this.f14523f = new WeakReference(view);
    }

    @Override // l.AbstractC1130a
    public final void k(int i3) {
        l(this.f14524g.f14527b.getResources().getString(i3));
    }

    @Override // l.AbstractC1130a
    public final void l(CharSequence charSequence) {
        this.f14524g.f14532g.setSubtitle(charSequence);
    }

    @Override // l.AbstractC1130a
    public final void m(int i3) {
        n(this.f14524g.f14527b.getResources().getString(i3));
    }

    @Override // l.AbstractC1130a
    public final void n(CharSequence charSequence) {
        this.f14524g.f14532g.setTitle(charSequence);
    }

    @Override // l.AbstractC1130a
    public final void o(boolean z2) {
        this.f15647b = z2;
        this.f14524g.f14532g.setTitleOptional(z2);
    }

    @Override // m.j
    public final boolean q(m.l lVar, MenuItem menuItem) {
        Y.m mVar = this.f14522e;
        if (mVar != null) {
            return ((p2.h) mVar.f8674b).e(this, menuItem);
        }
        return false;
    }
}
