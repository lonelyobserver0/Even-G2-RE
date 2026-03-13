package l;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import m.MenuC1254A;

/* renamed from: l.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1134e extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15660a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1130a f15661b;

    public C1134e(Context context, AbstractC1130a abstractC1130a) {
        this.f15660a = context;
        this.f15661b = abstractC1130a;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f15661b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f15661b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC1254A(this.f15660a, this.f15661b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f15661b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f15661b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f15661b.f15646a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f15661b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f15661b.f15647b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f15661b.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f15661b.i();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f15661b.j(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f15661b.l(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f15661b.f15646a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f15661b.n(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z2) {
        this.f15661b.o(z2);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i3) {
        this.f15661b.k(i3);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i3) {
        this.f15661b.m(i3);
    }
}
