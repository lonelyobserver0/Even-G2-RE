package m;

import Z9.C0366a;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import d0.T;
import java.util.ArrayList;
import java.util.Iterator;
import n.AbstractC1303E0;
import n.C1358q0;
import n.H0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class f extends t implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: A, reason: collision with root package name */
    public ViewTreeObserver f16883A;

    /* renamed from: B, reason: collision with root package name */
    public u f16884B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f16885C;

    /* renamed from: b, reason: collision with root package name */
    public final Context f16886b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16887c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16888d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f16889e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f16890f;

    /* renamed from: p, reason: collision with root package name */
    public View f16897p;

    /* renamed from: q, reason: collision with root package name */
    public View f16898q;

    /* renamed from: r, reason: collision with root package name */
    public int f16899r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f16900s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f16901t;

    /* renamed from: v, reason: collision with root package name */
    public int f16902v;

    /* renamed from: w, reason: collision with root package name */
    public int f16903w;

    /* renamed from: y, reason: collision with root package name */
    public boolean f16905y;

    /* renamed from: z, reason: collision with root package name */
    public w f16906z;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f16891g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f16892h = new ArrayList();
    public final ViewTreeObserverOnGlobalLayoutListenerC1261d j = new ViewTreeObserverOnGlobalLayoutListenerC1261d(this, 0);

    /* renamed from: k, reason: collision with root package name */
    public final T f16893k = new T(this, 2);

    /* renamed from: l, reason: collision with root package name */
    public final C0366a f16894l = new C0366a(this, 16);

    /* renamed from: m, reason: collision with root package name */
    public int f16895m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f16896n = 0;

    /* renamed from: x, reason: collision with root package name */
    public boolean f16904x = false;

    public f(Context context, View view, int i3, boolean z2) {
        this.f16886b = context;
        this.f16897p = view;
        this.f16888d = i3;
        this.f16889e = z2;
        this.f16899r = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f16887c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131099671));
        this.f16890f = new Handler();
    }

    @Override // m.InterfaceC1255B
    public final boolean a() {
        ArrayList arrayList = this.f16892h;
        return arrayList.size() > 0 && ((e) arrayList.get(0)).f16880a.f17372B.isShowing();
    }

    @Override // m.x
    public final void b(l lVar, boolean z2) {
        ArrayList arrayList = this.f16892h;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (lVar == ((e) arrayList.get(i3)).f16881b) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 < 0) {
            return;
        }
        int i10 = i3 + 1;
        if (i10 < arrayList.size()) {
            ((e) arrayList.get(i10)).f16881b.c(false);
        }
        e eVar = (e) arrayList.remove(i3);
        eVar.f16881b.r(this);
        boolean z10 = this.f16885C;
        H0 h0 = eVar.f16880a;
        if (z10) {
            AbstractC1303E0.b(h0.f17372B, null);
            h0.f17372B.setAnimationStyle(0);
        }
        h0.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f16899r = ((e) arrayList.get(size2 - 1)).f16882c;
        } else {
            this.f16899r = this.f16897p.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z2) {
                ((e) arrayList.get(0)).f16881b.c(false);
                return;
            }
            return;
        }
        dismiss();
        w wVar = this.f16906z;
        if (wVar != null) {
            wVar.b(lVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f16883A;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f16883A.removeGlobalOnLayoutListener(this.j);
            }
            this.f16883A = null;
        }
        this.f16898q.removeOnAttachStateChangeListener(this.f16893k);
        this.f16884B.onDismiss();
    }

    @Override // m.x
    public final boolean d() {
        return false;
    }

    @Override // m.InterfaceC1255B
    public final void dismiss() {
        ArrayList arrayList = this.f16892h;
        int size = arrayList.size();
        if (size > 0) {
            e[] eVarArr = (e[]) arrayList.toArray(new e[size]);
            for (int i3 = size - 1; i3 >= 0; i3--) {
                e eVar = eVarArr[i3];
                if (eVar.f16880a.f17372B.isShowing()) {
                    eVar.f16880a.dismiss();
                }
            }
        }
    }

    @Override // m.x
    public final void e(w wVar) {
        this.f16906z = wVar;
    }

    @Override // m.x
    public final void f() {
        Iterator it = this.f16892h.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((e) it.next()).f16880a.f17375c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((i) adapter).notifyDataSetChanged();
        }
    }

    @Override // m.InterfaceC1255B
    public final C1358q0 g() {
        ArrayList arrayList = this.f16892h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((e) i2.u.j(1, arrayList)).f16880a.f17375c;
    }

    @Override // m.x
    public final boolean i(SubMenuC1257D subMenuC1257D) {
        Iterator it = this.f16892h.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (subMenuC1257D == eVar.f16881b) {
                eVar.f16880a.f17375c.requestFocus();
                return true;
            }
        }
        if (!subMenuC1257D.hasVisibleItems()) {
            return false;
        }
        k(subMenuC1257D);
        w wVar = this.f16906z;
        if (wVar != null) {
            wVar.m(subMenuC1257D);
        }
        return true;
    }

    @Override // m.t
    public final void k(l lVar) {
        lVar.b(this, this.f16886b);
        if (a()) {
            u(lVar);
        } else {
            this.f16891g.add(lVar);
        }
    }

    @Override // m.t
    public final void m(View view) {
        if (this.f16897p != view) {
            this.f16897p = view;
            this.f16896n = Gravity.getAbsoluteGravity(this.f16895m, view.getLayoutDirection());
        }
    }

    @Override // m.t
    public final void n(boolean z2) {
        this.f16904x = z2;
    }

    @Override // m.t
    public final void o(int i3) {
        if (this.f16895m != i3) {
            this.f16895m = i3;
            this.f16896n = Gravity.getAbsoluteGravity(i3, this.f16897p.getLayoutDirection());
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        e eVar;
        ArrayList arrayList = this.f16892h;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                eVar = null;
                break;
            }
            eVar = (e) arrayList.get(i3);
            if (!eVar.f16880a.f17372B.isShowing()) {
                break;
            } else {
                i3++;
            }
        }
        if (eVar != null) {
            eVar.f16881b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i3 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // m.t
    public final void p(int i3) {
        this.f16900s = true;
        this.f16902v = i3;
    }

    @Override // m.t
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.f16884B = (u) onDismissListener;
    }

    @Override // m.t
    public final void r(boolean z2) {
        this.f16905y = z2;
    }

    @Override // m.t
    public final void s(int i3) {
        this.f16901t = true;
        this.f16903w = i3;
    }

    @Override // m.InterfaceC1255B
    public final void show() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f16891g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u((l) it.next());
        }
        arrayList.clear();
        View view = this.f16897p;
        this.f16898q = view;
        if (view != null) {
            boolean z2 = this.f16883A == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f16883A = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.j);
            }
            this.f16898q.addOnAttachStateChangeListener(this.f16893k);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x014b, code lost:
    
        if (((r8.getWidth() + r9[0]) + r5) > r11.right) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x014d, code lost:
    
        r13 = 0;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0150, code lost:
    
        r8 = 1;
        r13 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0156, code lost:
    
        if ((r9[0] - r5) < 0) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(m.l r18) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m.f.u(m.l):void");
    }
}
