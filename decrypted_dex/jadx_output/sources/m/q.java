package m;

import android.view.MenuItem;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class q implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f16980a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f16981b;

    public q(s sVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f16981b = sVar;
        this.f16980a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f16980a.onMenuItemActionCollapse(this.f16981b.h(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f16980a.onMenuItemActionExpand(this.f16981b.h(menuItem));
    }
}
