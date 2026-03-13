package n;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import l.InterfaceC1131b;
import m.SubMenuC1257D;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class U0 implements m.x {

    /* renamed from: a, reason: collision with root package name */
    public m.l f17466a;

    /* renamed from: b, reason: collision with root package name */
    public m.n f17467b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f17468c;

    public U0(Toolbar toolbar) {
        this.f17468c = toolbar;
    }

    @Override // m.x
    public final void b(m.l lVar, boolean z2) {
    }

    @Override // m.x
    public final void c(Context context, m.l lVar) {
        m.n nVar;
        m.l lVar2 = this.f17466a;
        if (lVar2 != null && (nVar = this.f17467b) != null) {
            lVar2.d(nVar);
        }
        this.f17466a = lVar;
    }

    @Override // m.x
    public final boolean d() {
        return false;
    }

    @Override // m.x
    public final void f() {
        if (this.f17467b != null) {
            m.l lVar = this.f17466a;
            if (lVar != null) {
                int size = lVar.f16927f.size();
                for (int i3 = 0; i3 < size; i3++) {
                    if (this.f17466a.getItem(i3) == this.f17467b) {
                        return;
                    }
                }
            }
            j(this.f17467b);
        }
    }

    @Override // m.x
    public final boolean h(m.n nVar) {
        Toolbar toolbar = this.f17468c;
        toolbar.c();
        ViewParent parent = toolbar.f9583h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f9583h);
            }
            toolbar.addView(toolbar.f9583h);
        }
        View actionView = nVar.getActionView();
        toolbar.j = actionView;
        this.f17467b = nVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.j);
            }
            V0 h2 = Toolbar.h();
            h2.f17469a = (toolbar.f9593p & 112) | 8388611;
            h2.f17470b = 2;
            toolbar.j.setLayoutParams(h2);
            toolbar.addView(toolbar.j);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((V0) childAt.getLayoutParams()).f17470b != 2 && childAt != toolbar.f9576a) {
                toolbar.removeViewAt(childCount);
                toolbar.f9568H.add(childAt);
            }
        }
        toolbar.requestLayout();
        nVar.f16950C = true;
        nVar.f16963n.p(false);
        KeyEvent.Callback callback = toolbar.j;
        if (callback instanceof InterfaceC1131b) {
            ((m.p) ((InterfaceC1131b) callback)).f16979a.onActionViewExpanded();
        }
        toolbar.v();
        return true;
    }

    @Override // m.x
    public final boolean i(SubMenuC1257D subMenuC1257D) {
        return false;
    }

    @Override // m.x
    public final boolean j(m.n nVar) {
        Toolbar toolbar = this.f17468c;
        KeyEvent.Callback callback = toolbar.j;
        if (callback instanceof InterfaceC1131b) {
            ((m.p) ((InterfaceC1131b) callback)).f16979a.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.j);
        toolbar.removeView(toolbar.f9583h);
        toolbar.j = null;
        ArrayList arrayList = toolbar.f9568H;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f17467b = null;
        toolbar.requestLayout();
        nVar.f16950C = false;
        nVar.f16963n.p(false);
        toolbar.v();
        return true;
    }
}
