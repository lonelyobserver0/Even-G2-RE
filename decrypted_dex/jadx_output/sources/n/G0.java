package n;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class G0 extends C1358q0 {

    /* renamed from: n, reason: collision with root package name */
    public final int f17402n;

    /* renamed from: p, reason: collision with root package name */
    public final int f17403p;

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC1301D0 f17404q;

    /* renamed from: r, reason: collision with root package name */
    public m.n f17405r;

    public G0(Context context, boolean z2) {
        super(context, z2);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f17402n = 21;
            this.f17403p = 22;
        } else {
            this.f17402n = 22;
            this.f17403p = 21;
        }
    }

    @Override // n.C1358q0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        m.i iVar;
        int i3;
        int pointToPosition;
        int i10;
        if (this.f17404q != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i3 = headerViewListAdapter.getHeadersCount();
                iVar = (m.i) headerViewListAdapter.getWrappedAdapter();
            } else {
                iVar = (m.i) adapter;
                i3 = 0;
            }
            m.n item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i10 = pointToPosition - i3) < 0 || i10 >= iVar.getCount()) ? null : iVar.getItem(i10);
            m.n nVar = this.f17405r;
            if (nVar != item) {
                m.l lVar = iVar.f16915a;
                if (nVar != null) {
                    this.f17404q.s(lVar, nVar);
                }
                this.f17405r = item;
                if (item != null) {
                    this.f17404q.e(lVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i3 == this.f17402n) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i3 != this.f17403p) {
            return super.onKeyDown(i3, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (m.i) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (m.i) adapter).f16915a.c(false);
        return true;
    }

    public void setHoverListener(InterfaceC1301D0 interfaceC1301D0) {
        this.f17404q = interfaceC1301D0;
    }

    @Override // n.C1358q0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
