package m;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import ba.AbstractC0534b;
import com.stub.StubApp;
import java.lang.reflect.Method;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class s extends AbstractC0534b implements MenuItem {

    /* renamed from: c, reason: collision with root package name */
    public final H.a f16984c;

    /* renamed from: d, reason: collision with root package name */
    public Method f16985d;

    public s(Context context, H.a aVar) {
        super(context);
        if (aVar == null) {
            throw new IllegalArgumentException(StubApp.getString2(21034));
        }
        this.f16984c = aVar;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.f16984c.collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.f16984c.expandActionView();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        o b2 = this.f16984c.b();
        if (b2 != null) {
            return b2.f16977b;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View actionView = this.f16984c.getActionView();
        return actionView instanceof p ? (View) ((p) actionView).f16979a : actionView;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f16984c.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f16984c.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f16984c.getContentDescription();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f16984c.getGroupId();
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f16984c.getIcon();
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f16984c.getIconTintList();
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f16984c.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f16984c.getIntent();
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f16984c.getItemId();
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f16984c.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f16984c.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f16984c.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f16984c.getOrder();
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f16984c.getSubMenu();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f16984c.getTitle();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.f16984c.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f16984c.getTooltipText();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f16984c.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f16984c.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.f16984c.isCheckable();
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.f16984c.isChecked();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.f16984c.isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.f16984c.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        o oVar = new o(this, actionProvider);
        if (actionProvider == null) {
            oVar = null;
        }
        this.f16984c.a(oVar);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new p(view);
        }
        this.f16984c.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f16984c.setAlphabeticShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        this.f16984c.setCheckable(z2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        this.f16984c.setChecked(z2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f16984c.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        this.f16984c.setEnabled(z2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f16984c.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f16984c.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f16984c.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f16984c.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        this.f16984c.setNumericShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f16984c.setOnActionExpandListener(onActionExpandListener != null ? new q(this, onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f16984c.setOnMenuItemClickListener(onMenuItemClickListener != null ? new r(this, onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f16984c.setShortcut(c10, c11);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i3) {
        this.f16984c.setShowAsAction(i3);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i3) {
        this.f16984c.setShowAsActionFlags(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f16984c.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f16984c.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f16984c.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        return this.f16984c.setVisible(z2);
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i3) {
        this.f16984c.setAlphabeticShortcut(c10, i3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i3) {
        this.f16984c.setIcon(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i3) {
        this.f16984c.setNumericShortcut(c10, i3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i3, int i10) {
        this.f16984c.setShortcut(c10, c11, i3, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i3) {
        this.f16984c.setTitle(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i3) {
        H.a aVar = this.f16984c;
        aVar.setActionView(i3);
        View actionView = aVar.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            aVar.setActionView(new p(actionView));
        }
        return this;
    }
}
