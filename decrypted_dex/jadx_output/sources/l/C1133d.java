package l;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import n.C1345k;

/* renamed from: l.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1133d extends AbstractC1130a implements m.j {

    /* renamed from: c, reason: collision with root package name */
    public Context f15654c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContextView f15655d;

    /* renamed from: e, reason: collision with root package name */
    public Y.m f15656e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f15657f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15658g;

    /* renamed from: h, reason: collision with root package name */
    public m.l f15659h;

    @Override // l.AbstractC1130a
    public final void a() {
        if (this.f15658g) {
            return;
        }
        this.f15658g = true;
        this.f15656e.u(this);
    }

    @Override // l.AbstractC1130a
    public final View b() {
        WeakReference weakReference = this.f15657f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // l.AbstractC1130a
    public final m.l c() {
        return this.f15659h;
    }

    @Override // l.AbstractC1130a
    public final MenuInflater d() {
        return new h(this.f15655d.getContext());
    }

    @Override // l.AbstractC1130a
    public final CharSequence e() {
        return this.f15655d.getSubtitle();
    }

    @Override // l.AbstractC1130a
    public final CharSequence f() {
        return this.f15655d.getTitle();
    }

    @Override // l.AbstractC1130a
    public final void g() {
        this.f15656e.v(this, this.f15659h);
    }

    @Override // m.j
    public final void h(m.l lVar) {
        g();
        C1345k c1345k = this.f15655d.f9428d;
        if (c1345k != null) {
            c1345k.l();
        }
    }

    @Override // l.AbstractC1130a
    public final boolean i() {
        return this.f15655d.f9442v;
    }

    @Override // l.AbstractC1130a
    public final void j(View view) {
        this.f15655d.setCustomView(view);
        this.f15657f = view != null ? new WeakReference(view) : null;
    }

    @Override // l.AbstractC1130a
    public final void k(int i3) {
        l(this.f15654c.getString(i3));
    }

    @Override // l.AbstractC1130a
    public final void l(CharSequence charSequence) {
        this.f15655d.setSubtitle(charSequence);
    }

    @Override // l.AbstractC1130a
    public final void m(int i3) {
        n(this.f15654c.getString(i3));
    }

    @Override // l.AbstractC1130a
    public final void n(CharSequence charSequence) {
        this.f15655d.setTitle(charSequence);
    }

    @Override // l.AbstractC1130a
    public final void o(boolean z2) {
        this.f15647b = z2;
        this.f15655d.setTitleOptional(z2);
    }

    @Override // m.j
    public final boolean q(m.l lVar, MenuItem menuItem) {
        return ((p2.h) this.f15656e.f8674b).e(this, menuItem);
    }
}
