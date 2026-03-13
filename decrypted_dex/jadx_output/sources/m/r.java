package m;

import android.view.MenuItem;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class r implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f16982a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f16983b;

    public r(s sVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f16983b = sVar;
        this.f16982a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f16982a.onMenuItemClick(this.f16983b.h(menuItem));
    }
}
