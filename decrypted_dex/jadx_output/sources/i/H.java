package i;

import N.AbstractC0179z;
import N.I;
import N.K;
import N.L;
import Z9.C0366a;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import com.stub.StubApp;
import h.AbstractC0997a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.AbstractC1130a;
import n.InterfaceC1331d;
import n.InterfaceC1340h0;
import n.U0;
import n.Z0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class H extends Oc.a implements InterfaceC1331d {

    /* renamed from: b, reason: collision with root package name */
    public Context f14527b;

    /* renamed from: c, reason: collision with root package name */
    public Context f14528c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarOverlayLayout f14529d;

    /* renamed from: e, reason: collision with root package name */
    public ActionBarContainer f14530e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC1340h0 f14531f;

    /* renamed from: g, reason: collision with root package name */
    public ActionBarContextView f14532g;

    /* renamed from: h, reason: collision with root package name */
    public final View f14533h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f14534i;
    public G j;

    /* renamed from: k, reason: collision with root package name */
    public G f14535k;

    /* renamed from: l, reason: collision with root package name */
    public Y.m f14536l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f14537m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f14538n;

    /* renamed from: o, reason: collision with root package name */
    public int f14539o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f14540p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f14541q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f14542r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f14543s;

    /* renamed from: t, reason: collision with root package name */
    public l.j f14544t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f14545u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f14546v;

    /* renamed from: w, reason: collision with root package name */
    public final F f14547w;

    /* renamed from: x, reason: collision with root package name */
    public final F f14548x;

    /* renamed from: y, reason: collision with root package name */
    public final C0366a f14549y;

    /* renamed from: z, reason: collision with root package name */
    public static final AccelerateInterpolator f14526z = new AccelerateInterpolator();

    /* renamed from: A, reason: collision with root package name */
    public static final DecelerateInterpolator f14525A = new DecelerateInterpolator();

    public H(Activity activity, boolean z2) {
        new ArrayList();
        this.f14538n = new ArrayList();
        this.f14539o = 0;
        this.f14540p = true;
        this.f14543s = true;
        this.f14547w = new F(this, 0);
        this.f14548x = new F(this, 1);
        this.f14549y = new C0366a(this, 10);
        View decorView = activity.getWindow().getDecorView();
        W(decorView);
        if (z2) {
            return;
        }
        this.f14533h = decorView.findViewById(R.id.content);
    }

    @Override // Oc.a
    public final void D() {
        X(this.f14527b.getResources().getBoolean(2130968576));
    }

    @Override // Oc.a
    public final boolean F(int i3, KeyEvent keyEvent) {
        m.l lVar;
        G g10 = this.j;
        if (g10 == null || (lVar = g10.f14521d) == null) {
            return false;
        }
        lVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return lVar.performShortcut(i3, keyEvent, 0);
    }

    @Override // Oc.a
    public final void N(boolean z2) {
        if (this.f14534i) {
            return;
        }
        int i3 = z2 ? 4 : 0;
        Z0 z02 = (Z0) this.f14531f;
        int i10 = z02.f17489b;
        this.f14534i = true;
        z02.a((i3 & 4) | (i10 & (-5)));
    }

    @Override // Oc.a
    public final void O() {
        Z0 z02 = (Z0) this.f14531f;
        z02.a(z02.f17489b & (-9));
    }

    @Override // Oc.a
    public final void P(boolean z2) {
        l.j jVar;
        this.f14545u = z2;
        if (z2 || (jVar = this.f14544t) == null) {
            return;
        }
        jVar.a();
    }

    @Override // Oc.a
    public final void Q(CharSequence charSequence) {
        Z0 z02 = (Z0) this.f14531f;
        if (z02.f17494g) {
            return;
        }
        z02.f17495h = charSequence;
        if ((z02.f17489b & 8) != 0) {
            Toolbar toolbar = z02.f17488a;
            toolbar.setTitle(charSequence);
            if (z02.f17494g) {
                I.j(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // Oc.a
    public final AbstractC1130a R(Y.m mVar) {
        G g10 = this.j;
        if (g10 != null) {
            g10.a();
        }
        this.f14529d.setHideOnContentScrollEnabled(false);
        this.f14532g.e();
        G g11 = new G(this, this.f14532g.getContext(), mVar);
        m.l lVar = g11.f14521d;
        lVar.w();
        try {
            if (!((p2.h) g11.f14522e.f8674b).f(g11, lVar)) {
                return null;
            }
            this.j = g11;
            g11.g();
            this.f14532g.c(g11);
            V(true);
            return g11;
        } finally {
            lVar.v();
        }
    }

    public final void V(boolean z2) {
        L i3;
        L l9;
        if (z2) {
            if (!this.f14542r) {
                this.f14542r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f14529d;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                Y(false);
            }
        } else if (this.f14542r) {
            this.f14542r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f14529d;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            Y(false);
        }
        if (!this.f14530e.isLaidOut()) {
            if (z2) {
                ((Z0) this.f14531f).f17488a.setVisibility(4);
                this.f14532g.setVisibility(0);
                return;
            } else {
                ((Z0) this.f14531f).f17488a.setVisibility(0);
                this.f14532g.setVisibility(8);
                return;
            }
        }
        if (z2) {
            Z0 z02 = (Z0) this.f14531f;
            i3 = I.a(z02.f17488a);
            i3.a(0.0f);
            i3.c(100L);
            i3.d(new l.i(z02, 4));
            l9 = this.f14532g.i(0, 200L);
        } else {
            Z0 z03 = (Z0) this.f14531f;
            L a3 = I.a(z03.f17488a);
            a3.a(1.0f);
            a3.c(200L);
            a3.d(new l.i(z03, 0));
            i3 = this.f14532g.i(8, 100L);
            l9 = a3;
        }
        l.j jVar = new l.j();
        ArrayList arrayList = jVar.f15705a;
        arrayList.add(i3);
        View view = (View) i3.f4740a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) l9.f4740a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(l9);
        jVar.b();
    }

    public final void W(View view) {
        InterfaceC1340h0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(2131230842);
        this.f14529d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(2131230764);
        if (findViewById instanceof InterfaceC1340h0) {
            wrapper = (InterfaceC1340h0) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException(StubApp.getString2(18372).concat(findViewById != null ? findViewById.getClass().getSimpleName() : StubApp.getString2(1116)));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.f14531f = wrapper;
        this.f14532g = (ActionBarContextView) view.findViewById(2131230772);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(2131230766);
        this.f14530e = actionBarContainer;
        InterfaceC1340h0 interfaceC1340h0 = this.f14531f;
        if (interfaceC1340h0 == null || this.f14532g == null || actionBarContainer == null) {
            throw new IllegalStateException(H.class.getSimpleName().concat(StubApp.getString2(18371)));
        }
        Context context = ((Z0) interfaceC1340h0).f17488a.getContext();
        this.f14527b = context;
        if ((((Z0) this.f14531f).f17489b & 4) != 0) {
            this.f14534i = true;
        }
        int i3 = context.getApplicationInfo().targetSdkVersion;
        this.f14531f.getClass();
        X(context.getResources().getBoolean(2130968576));
        TypedArray obtainStyledAttributes = this.f14527b.obtainStyledAttributes(null, AbstractC0997a.f14394a, 2130903045, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f14529d;
            if (!actionBarOverlayLayout2.f9458g) {
                throw new IllegalStateException(StubApp.getString2(18370));
            }
            this.f14546v = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f14530e;
            WeakHashMap weakHashMap = I.f4732a;
            N.B.k(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void X(boolean z2) {
        if (z2) {
            this.f14530e.setTabContainer(null);
            ((Z0) this.f14531f).getClass();
        } else {
            ((Z0) this.f14531f).getClass();
            this.f14530e.setTabContainer(null);
        }
        this.f14531f.getClass();
        ((Z0) this.f14531f).f17488a.setCollapsible(false);
        this.f14529d.setHasNonEmbeddedTabs(false);
    }

    public final void Y(boolean z2) {
        boolean z10 = this.f14542r || !this.f14541q;
        View view = this.f14533h;
        C0366a c0366a = this.f14549y;
        if (!z10) {
            if (this.f14543s) {
                this.f14543s = false;
                l.j jVar = this.f14544t;
                if (jVar != null) {
                    jVar.a();
                }
                int i3 = this.f14539o;
                F f10 = this.f14547w;
                if (i3 != 0 || (!this.f14545u && !z2)) {
                    f10.c();
                    return;
                }
                this.f14530e.setAlpha(1.0f);
                this.f14530e.setTransitioning(true);
                l.j jVar2 = new l.j();
                float f11 = -this.f14530e.getHeight();
                if (z2) {
                    this.f14530e.getLocationInWindow(new int[]{0, 0});
                    f11 -= r12[1];
                }
                L a3 = I.a(this.f14530e);
                a3.e(f11);
                View view2 = (View) a3.f4740a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(c0366a != null ? new K(c0366a, view2) : null);
                }
                boolean z11 = jVar2.f15709e;
                ArrayList arrayList = jVar2.f15705a;
                if (!z11) {
                    arrayList.add(a3);
                }
                if (this.f14540p && view != null) {
                    L a9 = I.a(view);
                    a9.e(f11);
                    if (!jVar2.f15709e) {
                        arrayList.add(a9);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f14526z;
                boolean z12 = jVar2.f15709e;
                if (!z12) {
                    jVar2.f15707c = accelerateInterpolator;
                }
                if (!z12) {
                    jVar2.f15706b = 250L;
                }
                if (!z12) {
                    jVar2.f15708d = f10;
                }
                this.f14544t = jVar2;
                jVar2.b();
                return;
            }
            return;
        }
        if (this.f14543s) {
            return;
        }
        this.f14543s = true;
        l.j jVar3 = this.f14544t;
        if (jVar3 != null) {
            jVar3.a();
        }
        this.f14530e.setVisibility(0);
        int i10 = this.f14539o;
        F f12 = this.f14548x;
        if (i10 == 0 && (this.f14545u || z2)) {
            this.f14530e.setTranslationY(0.0f);
            float f13 = -this.f14530e.getHeight();
            if (z2) {
                this.f14530e.getLocationInWindow(new int[]{0, 0});
                f13 -= r12[1];
            }
            this.f14530e.setTranslationY(f13);
            l.j jVar4 = new l.j();
            L a10 = I.a(this.f14530e);
            a10.e(0.0f);
            View view3 = (View) a10.f4740a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(c0366a != null ? new K(c0366a, view3) : null);
            }
            boolean z13 = jVar4.f15709e;
            ArrayList arrayList2 = jVar4.f15705a;
            if (!z13) {
                arrayList2.add(a10);
            }
            if (this.f14540p && view != null) {
                view.setTranslationY(f13);
                L a11 = I.a(view);
                a11.e(0.0f);
                if (!jVar4.f15709e) {
                    arrayList2.add(a11);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f14525A;
            boolean z14 = jVar4.f15709e;
            if (!z14) {
                jVar4.f15707c = decelerateInterpolator;
            }
            if (!z14) {
                jVar4.f15706b = 250L;
            }
            if (!z14) {
                jVar4.f15708d = f12;
            }
            this.f14544t = jVar4;
            jVar4.b();
        } else {
            this.f14530e.setAlpha(1.0f);
            this.f14530e.setTranslationY(0.0f);
            if (this.f14540p && view != null) {
                view.setTranslationY(0.0f);
            }
            f12.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f14529d;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = I.f4732a;
            AbstractC0179z.c(actionBarOverlayLayout);
        }
    }

    @Override // Oc.a
    public final boolean k() {
        U0 u02;
        InterfaceC1340h0 interfaceC1340h0 = this.f14531f;
        if (interfaceC1340h0 == null || (u02 = ((Z0) interfaceC1340h0).f17488a.h0) == null || u02.f17467b == null) {
            return false;
        }
        U0 u03 = ((Z0) interfaceC1340h0).f17488a.h0;
        m.n nVar = u03 == null ? null : u03.f17467b;
        if (nVar == null) {
            return true;
        }
        nVar.collapseActionView();
        return true;
    }

    @Override // Oc.a
    public final void n(boolean z2) {
        if (z2 == this.f14537m) {
            return;
        }
        this.f14537m = z2;
        ArrayList arrayList = this.f14538n;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // Oc.a
    public final int o() {
        return ((Z0) this.f14531f).f17489b;
    }

    @Override // Oc.a
    public final Context s() {
        if (this.f14528c == null) {
            TypedValue typedValue = new TypedValue();
            this.f14527b.getTheme().resolveAttribute(2130903050, typedValue, true);
            int i3 = typedValue.resourceId;
            if (i3 != 0) {
                this.f14528c = new ContextThemeWrapper(this.f14527b, i3);
            } else {
                this.f14528c = this.f14527b;
            }
        }
        return this.f14528c;
    }

    public H(Dialog dialog) {
        new ArrayList();
        this.f14538n = new ArrayList();
        this.f14539o = 0;
        this.f14540p = true;
        this.f14543s = true;
        this.f14547w = new F(this, 0);
        this.f14548x = new F(this, 1);
        this.f14549y = new C0366a(this, 10);
        W(dialog.getWindow().getDecorView());
    }
}
