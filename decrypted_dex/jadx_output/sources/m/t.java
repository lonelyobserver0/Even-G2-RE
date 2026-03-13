package m;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class t implements InterfaceC1255B, x, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Rect f16986a;

    public static int l(ListAdapter listAdapter, Context context, int i3) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i10 = 0;
        int i11 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i12 = 0; i12 < count; i12++) {
            int itemViewType = listAdapter.getItemViewType(i12);
            if (itemViewType != i11) {
                view = null;
                i11 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i12, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i3) {
                return i3;
            }
            if (measuredWidth > i10) {
                i10 = measuredWidth;
            }
        }
        return i10;
    }

    public static boolean t(l lVar) {
        int size = lVar.f16927f.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItem item = lVar.getItem(i3);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // m.x
    public final void c(Context context, l lVar) {
    }

    @Override // m.x
    public final boolean h(n nVar) {
        return false;
    }

    @Override // m.x
    public final boolean j(n nVar) {
        return false;
    }

    public abstract void k(l lVar);

    public abstract void m(View view);

    public abstract void n(boolean z2);

    public abstract void o(int i3);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (i) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (i) listAdapter).f16915a.q((MenuItem) listAdapter.getItem(i3), this, !(this instanceof f) ? 0 : 4);
    }

    public abstract void p(int i3);

    public abstract void q(PopupWindow.OnDismissListener onDismissListener);

    public abstract void r(boolean z2);

    public abstract void s(int i3);
}
