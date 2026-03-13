package m;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.stub.StubApp;
import d0.T;
import n.C1358q0;
import n.H0;

/* renamed from: m.C, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class ViewOnKeyListenerC1256C extends t implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f16841b;

    /* renamed from: c, reason: collision with root package name */
    public final l f16842c;

    /* renamed from: d, reason: collision with root package name */
    public final i f16843d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f16844e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16845f;

    /* renamed from: g, reason: collision with root package name */
    public final int f16846g;

    /* renamed from: h, reason: collision with root package name */
    public final H0 f16847h;

    /* renamed from: l, reason: collision with root package name */
    public u f16849l;

    /* renamed from: m, reason: collision with root package name */
    public View f16850m;

    /* renamed from: n, reason: collision with root package name */
    public View f16851n;

    /* renamed from: p, reason: collision with root package name */
    public w f16852p;

    /* renamed from: q, reason: collision with root package name */
    public ViewTreeObserver f16853q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f16854r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f16855s;

    /* renamed from: t, reason: collision with root package name */
    public int f16856t;

    /* renamed from: w, reason: collision with root package name */
    public boolean f16858w;
    public final ViewTreeObserverOnGlobalLayoutListenerC1261d j = new ViewTreeObserverOnGlobalLayoutListenerC1261d(this, 1);

    /* renamed from: k, reason: collision with root package name */
    public final T f16848k = new T(this, 3);

    /* renamed from: v, reason: collision with root package name */
    public int f16857v = 0;

    public ViewOnKeyListenerC1256C(int i3, Context context, View view, l lVar, boolean z2) {
        this.f16841b = context;
        this.f16842c = lVar;
        this.f16844e = z2;
        this.f16843d = new i(lVar, LayoutInflater.from(context), z2, 2131427347);
        this.f16846g = i3;
        Resources resources = context.getResources();
        this.f16845f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131099671));
        this.f16850m = view;
        this.f16847h = new H0(context, null, i3);
        lVar.b(this, context);
    }

    @Override // m.InterfaceC1255B
    public final boolean a() {
        return !this.f16854r && this.f16847h.f17372B.isShowing();
    }

    @Override // m.x
    public final void b(l lVar, boolean z2) {
        if (lVar != this.f16842c) {
            return;
        }
        dismiss();
        w wVar = this.f16852p;
        if (wVar != null) {
            wVar.b(lVar, z2);
        }
    }

    @Override // m.x
    public final boolean d() {
        return false;
    }

    @Override // m.InterfaceC1255B
    public final void dismiss() {
        if (a()) {
            this.f16847h.dismiss();
        }
    }

    @Override // m.x
    public final void e(w wVar) {
        this.f16852p = wVar;
    }

    @Override // m.x
    public final void f() {
        this.f16855s = false;
        i iVar = this.f16843d;
        if (iVar != null) {
            iVar.notifyDataSetChanged();
        }
    }

    @Override // m.InterfaceC1255B
    public final C1358q0 g() {
        return this.f16847h.f17375c;
    }

    @Override // m.x
    public final boolean i(SubMenuC1257D subMenuC1257D) {
        if (subMenuC1257D.hasVisibleItems()) {
            View view = this.f16851n;
            v vVar = new v(this.f16846g, this.f16841b, view, subMenuC1257D, this.f16844e);
            w wVar = this.f16852p;
            vVar.f16995h = wVar;
            t tVar = vVar.f16996i;
            if (tVar != null) {
                tVar.e(wVar);
            }
            boolean t3 = t.t(subMenuC1257D);
            vVar.f16994g = t3;
            t tVar2 = vVar.f16996i;
            if (tVar2 != null) {
                tVar2.n(t3);
            }
            vVar.j = this.f16849l;
            this.f16849l = null;
            this.f16842c.c(false);
            H0 h0 = this.f16847h;
            int i3 = h0.f17378f;
            int m4 = h0.m();
            if ((Gravity.getAbsoluteGravity(this.f16857v, this.f16850m.getLayoutDirection()) & 7) == 5) {
                i3 += this.f16850m.getWidth();
            }
            if (!vVar.b()) {
                if (vVar.f16992e != null) {
                    vVar.d(i3, m4, true, true);
                }
            }
            w wVar2 = this.f16852p;
            if (wVar2 != null) {
                wVar2.m(subMenuC1257D);
            }
            return true;
        }
        return false;
    }

    @Override // m.t
    public final void k(l lVar) {
    }

    @Override // m.t
    public final void m(View view) {
        this.f16850m = view;
    }

    @Override // m.t
    public final void n(boolean z2) {
        this.f16843d.f16917c = z2;
    }

    @Override // m.t
    public final void o(int i3) {
        this.f16857v = i3;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f16854r = true;
        this.f16842c.c(true);
        ViewTreeObserver viewTreeObserver = this.f16853q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f16853q = this.f16851n.getViewTreeObserver();
            }
            this.f16853q.removeGlobalOnLayoutListener(this.j);
            this.f16853q = null;
        }
        this.f16851n.removeOnAttachStateChangeListener(this.f16848k);
        u uVar = this.f16849l;
        if (uVar != null) {
            uVar.onDismiss();
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
        this.f16847h.f17378f = i3;
    }

    @Override // m.t
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.f16849l = (u) onDismissListener;
    }

    @Override // m.t
    public final void r(boolean z2) {
        this.f16858w = z2;
    }

    @Override // m.t
    public final void s(int i3) {
        this.f16847h.j(i3);
    }

    @Override // m.InterfaceC1255B
    public final void show() {
        View view;
        if (a()) {
            return;
        }
        if (this.f16854r || (view = this.f16850m) == null) {
            throw new IllegalStateException(StubApp.getString2(21035));
        }
        this.f16851n = view;
        H0 h0 = this.f16847h;
        h0.f17372B.setOnDismissListener(this);
        h0.f17387r = this;
        h0.f17371A = true;
        h0.f17372B.setFocusable(true);
        View view2 = this.f16851n;
        boolean z2 = this.f16853q == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f16853q = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.j);
        }
        view2.addOnAttachStateChangeListener(this.f16848k);
        h0.f17386q = view2;
        h0.f17383m = this.f16857v;
        boolean z10 = this.f16855s;
        Context context = this.f16841b;
        i iVar = this.f16843d;
        if (!z10) {
            this.f16856t = t.l(iVar, context, this.f16845f);
            this.f16855s = true;
        }
        h0.p(this.f16856t);
        h0.f17372B.setInputMethodMode(2);
        Rect rect = this.f16986a;
        h0.f17394z = rect != null ? new Rect(rect) : null;
        h0.show();
        C1358q0 c1358q0 = h0.f17375c;
        c1358q0.setOnKeyListener(this);
        if (this.f16858w) {
            l lVar = this.f16842c;
            if (lVar.f16933m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(2131427346, (ViewGroup) c1358q0, false);
                TextView textView = (TextView) frameLayout.findViewById(R.id.title);
                if (textView != null) {
                    textView.setText(lVar.f16933m);
                }
                frameLayout.setEnabled(false);
                c1358q0.addHeaderView(frameLayout, null, false);
            }
        }
        h0.n(iVar);
        h0.show();
    }
}
