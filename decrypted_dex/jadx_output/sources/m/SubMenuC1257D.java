package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.stub.StubApp;

/* renamed from: m.D, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class SubMenuC1257D extends l implements SubMenu {

    /* renamed from: A, reason: collision with root package name */
    public final n f16859A;

    /* renamed from: z, reason: collision with root package name */
    public final l f16860z;

    public SubMenuC1257D(Context context, l lVar, n nVar) {
        super(context);
        this.f16860z = lVar;
        this.f16859A = nVar;
    }

    @Override // m.l
    public final boolean d(n nVar) {
        return this.f16860z.d(nVar);
    }

    @Override // m.l
    public final boolean e(l lVar, MenuItem menuItem) {
        return super.e(lVar, menuItem) || this.f16860z.e(lVar, menuItem);
    }

    @Override // m.l
    public final boolean f(n nVar) {
        return this.f16860z.f(nVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f16859A;
    }

    @Override // m.l
    public final String j() {
        n nVar = this.f16859A;
        int i3 = nVar != null ? nVar.f16951a : 0;
        if (i3 == 0) {
            return null;
        }
        return i2.u.p(i3, StubApp.getString2(21036));
    }

    @Override // m.l
    public final l k() {
        return this.f16860z.k();
    }

    @Override // m.l
    public final boolean m() {
        return this.f16860z.m();
    }

    @Override // m.l
    public final boolean n() {
        return this.f16860z.n();
    }

    @Override // m.l
    public final boolean o() {
        return this.f16860z.o();
    }

    @Override // m.l, android.view.Menu
    public final void setGroupDividerEnabled(boolean z2) {
        this.f16860z.setGroupDividerEnabled(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f16859A.setIcon(drawable);
        return this;
    }

    @Override // m.l, android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f16860z.setQwertyMode(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i3) {
        u(0, null, i3, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i3) {
        u(i3, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i3) {
        this.f16859A.setIcon(i3);
        return this;
    }
}
