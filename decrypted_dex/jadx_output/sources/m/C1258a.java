package m;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1258a implements H.a {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f16861a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f16862b;

    /* renamed from: c, reason: collision with root package name */
    public Intent f16863c;

    /* renamed from: d, reason: collision with root package name */
    public char f16864d;

    /* renamed from: e, reason: collision with root package name */
    public int f16865e;

    /* renamed from: f, reason: collision with root package name */
    public char f16866f;

    /* renamed from: g, reason: collision with root package name */
    public int f16867g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f16868h;

    /* renamed from: i, reason: collision with root package name */
    public Context f16869i;
    public CharSequence j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f16870k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f16871l;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f16872m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f16873n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f16874o;

    /* renamed from: p, reason: collision with root package name */
    public int f16875p;

    @Override // H.a
    public final H.a a(o oVar) {
        throw new UnsupportedOperationException();
    }

    @Override // H.a
    public final o b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.f16868h;
        if (drawable != null) {
            if (this.f16873n || this.f16874o) {
                this.f16868h = drawable;
                Drawable mutate = drawable.mutate();
                this.f16868h = mutate;
                if (this.f16873n) {
                    mutate.setTintList(this.f16871l);
                }
                if (this.f16874o) {
                    this.f16868h.setTintMode(this.f16872m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // H.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f16867g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f16866f;
    }

    @Override // H.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f16868h;
    }

    @Override // H.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f16871l;
    }

    @Override // H.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f16872m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f16863c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // H.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f16865e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f16864d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f16861a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f16862b;
        return charSequence != null ? charSequence : this.f16861a;
    }

    @Override // H.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f16870k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f16875p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f16875p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f16875p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f16875p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f16866f = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        this.f16875p = (z2 ? 1 : 0) | (this.f16875p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        this.f16875p = (z2 ? 2 : 0) | (this.f16875p & (-3));
        return this;
    }

    @Override // H.a, android.view.MenuItem
    public final H.a setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        this.f16875p = (z2 ? 16 : 0) | (this.f16875p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f16868h = drawable;
        c();
        return this;
    }

    @Override // H.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f16871l = colorStateList;
        this.f16873n = true;
        c();
        return this;
    }

    @Override // H.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f16872m = mode;
        this.f16874o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f16863c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        this.f16864d = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f16864d = c10;
        this.f16866f = Character.toLowerCase(c11);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i3) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i3) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f16861a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f16862b = charSequence;
        return this;
    }

    @Override // H.a, android.view.MenuItem
    public final H.a setTooltipText(CharSequence charSequence) {
        this.f16870k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        this.f16875p = (this.f16875p & 8) | (z2 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i3) {
        throw new UnsupportedOperationException();
    }

    @Override // H.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i3) {
        this.f16866f = Character.toLowerCase(c10);
        this.f16867g = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    @Override // H.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i3) {
        this.f16864d = c10;
        this.f16865e = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i3) {
        this.f16861a = this.f16869i.getResources().getString(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f16870k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i3) {
        this.f16868h = this.f16869i.getDrawable(i3);
        c();
        return this;
    }

    @Override // H.a, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i3, int i10) {
        this.f16864d = c10;
        this.f16865e = KeyEvent.normalizeMetaState(i3);
        this.f16866f = Character.toLowerCase(c11);
        this.f16867g = KeyEvent.normalizeMetaState(i10);
        return this;
    }
}
