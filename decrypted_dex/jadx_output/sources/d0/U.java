package d0;

import N.AbstractC0179z;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.C0446v;
import androidx.lifecycle.EnumC0438m;
import androidx.lifecycle.EnumC0439n;
import com.stub.StubApp;
import e0.AbstractC0831d;
import e0.C0830c;
import e0.C0834g;
import e0.C0835h;
import e0.EnumC0829b;
import i.AbstractActivityC1027h;
import i0.C1028a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import k0.C1102a;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import p0.AbstractC1482f;
import t.C1698k;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public final V6.b f13214a;

    /* renamed from: b, reason: collision with root package name */
    public final D5.B f13215b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0789t f13216c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13217d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f13218e = -1;

    public U(V6.b bVar, D5.B b2, AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t) {
        this.f13214a = bVar;
        this.f13215b = b2;
        this.f13216c = abstractComponentCallbacksC0789t;
    }

    public final void a() {
        boolean J10 = M.J(3);
        String string2 = StubApp.getString2(49);
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = this.f13216c;
        if (J10) {
            Log.d(string2, StubApp.getString2(16577) + abstractComponentCallbacksC0789t);
        }
        Bundle bundle = abstractComponentCallbacksC0789t.f13365b;
        String string22 = StubApp.getString2(16497);
        if (bundle != null) {
            bundle.getBundle(string22);
        }
        abstractComponentCallbacksC0789t.f13386x.P();
        abstractComponentCallbacksC0789t.f13364a = 3;
        abstractComponentCallbacksC0789t.f13352G = false;
        abstractComponentCallbacksC0789t.t();
        boolean z2 = abstractComponentCallbacksC0789t.f13352G;
        String string23 = StubApp.getString2(16452);
        if (!z2) {
            throw new f0(string23 + abstractComponentCallbacksC0789t + StubApp.getString2(16580));
        }
        if (M.J(3)) {
            Log.d(string2, StubApp.getString2(16578) + abstractComponentCallbacksC0789t);
        }
        if (abstractComponentCallbacksC0789t.f13354I != null) {
            Bundle bundle2 = abstractComponentCallbacksC0789t.f13365b;
            Bundle bundle3 = bundle2 != null ? bundle2.getBundle(string22) : null;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC0789t.f13366c;
            if (sparseArray != null) {
                abstractComponentCallbacksC0789t.f13354I.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC0789t.f13366c = null;
            }
            abstractComponentCallbacksC0789t.f13352G = false;
            abstractComponentCallbacksC0789t.G(bundle3);
            if (!abstractComponentCallbacksC0789t.f13352G) {
                throw new f0(string23 + abstractComponentCallbacksC0789t + StubApp.getString2(16579));
            }
            if (abstractComponentCallbacksC0789t.f13354I != null) {
                abstractComponentCallbacksC0789t.f13363Z.b(EnumC0438m.ON_CREATE);
            }
        }
        abstractComponentCallbacksC0789t.f13365b = null;
        M m4 = abstractComponentCallbacksC0789t.f13386x;
        m4.f13149H = false;
        m4.f13150I = false;
        m4.f13156O.f13198g = false;
        m4.u(4);
        this.f13214a.i(abstractComponentCallbacksC0789t, false);
    }

    public final void b() {
        AbstractComponentCallbacksC0789t expectedParentFragment;
        View view;
        View view2;
        int i3 = -1;
        AbstractComponentCallbacksC0789t fragment = this.f13216c;
        View view3 = fragment.f13353H;
        while (true) {
            expectedParentFragment = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(2131230886);
            AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = tag instanceof AbstractComponentCallbacksC0789t ? (AbstractComponentCallbacksC0789t) tag : null;
            if (abstractComponentCallbacksC0789t != null) {
                expectedParentFragment = abstractComponentCallbacksC0789t;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t2 = fragment.f13387y;
        if (expectedParentFragment != null && !expectedParentFragment.equals(abstractComponentCallbacksC0789t2)) {
            int i10 = fragment.f13346A;
            C0830c c0830c = AbstractC0831d.f13570a;
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(expectedParentFragment, "expectedParentFragment");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(expectedParentFragment, "expectedParentFragment");
            StringBuilder sb2 = new StringBuilder(StubApp.getString2(16581));
            sb2.append(fragment);
            sb2.append(StubApp.getString2(16582));
            sb2.append(expectedParentFragment);
            sb2.append(StubApp.getString2(16583));
            C0835h c0835h = new C0835h(fragment, AbstractC1482f.f(i10, StubApp.getString2(16584), sb2));
            AbstractC0831d.c(c0835h);
            C0830c a3 = AbstractC0831d.a(fragment);
            if (a3.f13568a.contains(EnumC0829b.f13564e) && AbstractC0831d.e(a3, fragment.getClass(), C0835h.class)) {
                AbstractC0831d.b(a3, c0835h);
            }
        }
        D5.B b2 = this.f13215b;
        b2.getClass();
        ViewGroup viewGroup = fragment.f13353H;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) b2.f1340a;
            int indexOf = arrayList.indexOf(fragment);
            int i11 = indexOf - 1;
            while (true) {
                if (i11 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t3 = (AbstractComponentCallbacksC0789t) arrayList.get(indexOf);
                        if (abstractComponentCallbacksC0789t3.f13353H == viewGroup && (view = abstractComponentCallbacksC0789t3.f13354I) != null) {
                            i3 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t4 = (AbstractComponentCallbacksC0789t) arrayList.get(i11);
                    if (abstractComponentCallbacksC0789t4.f13353H == viewGroup && (view2 = abstractComponentCallbacksC0789t4.f13354I) != null) {
                        i3 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i11--;
                }
            }
        }
        fragment.f13353H.addView(fragment.f13354I, i3);
    }

    public final void c() {
        U u2;
        boolean J10 = M.J(3);
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = this.f13216c;
        if (J10) {
            Log.d(StubApp.getString2(49), StubApp.getString2(16585) + abstractComponentCallbacksC0789t);
        }
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t2 = abstractComponentCallbacksC0789t.f13370g;
        String string2 = StubApp.getString2(16586);
        String string22 = StubApp.getString2(16587);
        D5.B b2 = this.f13215b;
        String string23 = StubApp.getString2(16452);
        if (abstractComponentCallbacksC0789t2 != null) {
            u2 = (U) ((HashMap) b2.f1341b).get(abstractComponentCallbacksC0789t2.f13368e);
            if (u2 == null) {
                throw new IllegalStateException(string23 + abstractComponentCallbacksC0789t + string22 + abstractComponentCallbacksC0789t.f13370g + string2);
            }
            abstractComponentCallbacksC0789t.f13371h = abstractComponentCallbacksC0789t.f13370g.f13368e;
            abstractComponentCallbacksC0789t.f13370g = null;
        } else {
            String str = abstractComponentCallbacksC0789t.f13371h;
            if (str != null) {
                u2 = (U) ((HashMap) b2.f1341b).get(str);
                if (u2 == null) {
                    StringBuilder sb2 = new StringBuilder(string23);
                    sb2.append(abstractComponentCallbacksC0789t);
                    sb2.append(string22);
                    throw new IllegalStateException(AbstractC1482f.k(sb2, abstractComponentCallbacksC0789t.f13371h, string2));
                }
            } else {
                u2 = null;
            }
        }
        if (u2 != null) {
            u2.k();
        }
        M m4 = abstractComponentCallbacksC0789t.f13384v;
        abstractComponentCallbacksC0789t.f13385w = m4.f13179w;
        abstractComponentCallbacksC0789t.f13387y = m4.f13181y;
        V6.b bVar = this.f13214a;
        bVar.p(abstractComponentCallbacksC0789t, false);
        ArrayList arrayList = abstractComponentCallbacksC0789t.f13375l0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t3 = ((C0787q) it.next()).f13333a;
            ((C2.c) abstractComponentCallbacksC0789t3.f13373k0.f9077b).a();
            androidx.lifecycle.L.c(abstractComponentCallbacksC0789t3);
            Bundle bundle = abstractComponentCallbacksC0789t3.f13365b;
            abstractComponentCallbacksC0789t3.f13373k0.v(bundle != null ? bundle.getBundle(StubApp.getString2(16498)) : null);
        }
        arrayList.clear();
        abstractComponentCallbacksC0789t.f13386x.b(abstractComponentCallbacksC0789t.f13385w, abstractComponentCallbacksC0789t.h(), abstractComponentCallbacksC0789t);
        abstractComponentCallbacksC0789t.f13364a = 0;
        abstractComponentCallbacksC0789t.f13352G = false;
        abstractComponentCallbacksC0789t.v(abstractComponentCallbacksC0789t.f13385w.f13392b);
        if (!abstractComponentCallbacksC0789t.f13352G) {
            throw new f0(string23 + abstractComponentCallbacksC0789t + StubApp.getString2(16588));
        }
        Iterator it2 = abstractComponentCallbacksC0789t.f13384v.f13172p.iterator();
        while (it2.hasNext()) {
            ((Q) it2.next()).d();
        }
        M m10 = abstractComponentCallbacksC0789t.f13386x;
        m10.f13149H = false;
        m10.f13150I = false;
        m10.f13156O.f13198g = false;
        m10.u(0);
        bVar.j(abstractComponentCallbacksC0789t, false);
    }

    public final int d() {
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = this.f13216c;
        if (abstractComponentCallbacksC0789t.f13384v == null) {
            return abstractComponentCallbacksC0789t.f13364a;
        }
        int i3 = this.f13218e;
        int ordinal = abstractComponentCallbacksC0789t.f13361X.ordinal();
        if (ordinal == 1) {
            i3 = Math.min(i3, 0);
        } else if (ordinal == 2) {
            i3 = Math.min(i3, 1);
        } else if (ordinal == 3) {
            i3 = Math.min(i3, 5);
        } else if (ordinal != 4) {
            i3 = Math.min(i3, -1);
        }
        if (abstractComponentCallbacksC0789t.f13379p) {
            if (abstractComponentCallbacksC0789t.f13380q) {
                i3 = Math.max(this.f13218e, 2);
                View view = abstractComponentCallbacksC0789t.f13354I;
                if (view != null && view.getParent() == null) {
                    i3 = Math.min(i3, 2);
                }
            } else {
                i3 = this.f13218e < 4 ? Math.min(i3, abstractComponentCallbacksC0789t.f13364a) : Math.min(i3, 1);
            }
        }
        if (!abstractComponentCallbacksC0789t.f13374l) {
            i3 = Math.min(i3, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0789t.f13353H;
        if (viewGroup != null) {
            e0 m4 = e0.m(viewGroup, abstractComponentCallbacksC0789t.o());
            m4.getClass();
            Intrinsics.checkNotNullParameter(this, "fragmentStateManager");
            Intrinsics.checkNotNullExpressionValue(abstractComponentCallbacksC0789t, "fragmentStateManager.fragment");
            a0 j = m4.j(abstractComponentCallbacksC0789t);
            b0 b0Var = j != null ? j.f13258b : null;
            a0 k3 = m4.k(abstractComponentCallbacksC0789t);
            r9 = k3 != null ? k3.f13258b : null;
            int i10 = b0Var == null ? -1 : d0.f13296a[b0Var.ordinal()];
            if (i10 != -1 && i10 != 1) {
                r9 = b0Var;
            }
        }
        if (r9 == b0.f13282b) {
            i3 = Math.min(i3, 6);
        } else if (r9 == b0.f13283c) {
            i3 = Math.max(i3, 3);
        } else if (abstractComponentCallbacksC0789t.f13376m) {
            i3 = abstractComponentCallbacksC0789t.s() ? Math.min(i3, 1) : Math.min(i3, -1);
        }
        if (abstractComponentCallbacksC0789t.f13355K && abstractComponentCallbacksC0789t.f13364a < 5) {
            i3 = Math.min(i3, 4);
        }
        if (abstractComponentCallbacksC0789t.f13378n && abstractComponentCallbacksC0789t.f13353H != null) {
            i3 = Math.max(i3, 3);
        }
        if (M.J(2)) {
            Log.v(StubApp.getString2(49), StubApp.getString2(16589) + i3 + StubApp.getString2(6035) + abstractComponentCallbacksC0789t);
        }
        return i3;
    }

    public final void e() {
        Bundle bundle;
        boolean J10 = M.J(3);
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = this.f13216c;
        if (J10) {
            Log.d(StubApp.getString2(49), StubApp.getString2(16590) + abstractComponentCallbacksC0789t);
        }
        Bundle bundle2 = abstractComponentCallbacksC0789t.f13365b;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(StubApp.getString2(16497)) : null;
        if (abstractComponentCallbacksC0789t.f13359R) {
            abstractComponentCallbacksC0789t.f13364a = 1;
            Bundle bundle4 = abstractComponentCallbacksC0789t.f13365b;
            if (bundle4 == null || (bundle = bundle4.getBundle(StubApp.getString2(16499))) == null) {
                return;
            }
            abstractComponentCallbacksC0789t.f13386x.V(bundle);
            M m4 = abstractComponentCallbacksC0789t.f13386x;
            m4.f13149H = false;
            m4.f13150I = false;
            m4.f13156O.f13198g = false;
            m4.u(1);
            return;
        }
        V6.b bVar = this.f13214a;
        bVar.r(abstractComponentCallbacksC0789t, false);
        abstractComponentCallbacksC0789t.f13386x.P();
        abstractComponentCallbacksC0789t.f13364a = 1;
        abstractComponentCallbacksC0789t.f13352G = false;
        abstractComponentCallbacksC0789t.f13362Y.a(new M1.b(abstractComponentCallbacksC0789t, 4));
        abstractComponentCallbacksC0789t.w(bundle3);
        abstractComponentCallbacksC0789t.f13359R = true;
        if (abstractComponentCallbacksC0789t.f13352G) {
            abstractComponentCallbacksC0789t.f13362Y.e(EnumC0438m.ON_CREATE);
            bVar.l(abstractComponentCallbacksC0789t, false);
        } else {
            throw new f0(StubApp.getString2(16452) + abstractComponentCallbacksC0789t + StubApp.getString2(16591));
        }
    }

    public final void f() {
        String string2;
        AbstractComponentCallbacksC0789t fragment = this.f13216c;
        if (fragment.f13379p) {
            return;
        }
        boolean J10 = M.J(3);
        String string22 = StubApp.getString2(49);
        if (J10) {
            Log.d(string22, StubApp.getString2(16592) + fragment);
        }
        Bundle bundle = fragment.f13365b;
        String string23 = StubApp.getString2(16497);
        ViewGroup container = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle(string23) : null;
        LayoutInflater B7 = fragment.B(bundle2);
        ViewGroup viewGroup = fragment.f13353H;
        if (viewGroup != null) {
            container = viewGroup;
        } else {
            int i3 = fragment.f13346A;
            if (i3 != 0) {
                if (i3 == -1) {
                    throw new IllegalArgumentException(StubApp.getString2(16597) + fragment + StubApp.getString2(16598));
                }
                container = (ViewGroup) fragment.f13384v.f13180x.g(i3);
                if (container == null) {
                    if (!fragment.f13381r) {
                        try {
                            string2 = fragment.I().getResources().getResourceName(fragment.f13346A);
                        } catch (Resources.NotFoundException unused) {
                            string2 = StubApp.getString2(351);
                        }
                        throw new IllegalArgumentException(StubApp.getString2(16593) + Integer.toHexString(fragment.f13346A) + StubApp.getString2(1561) + string2 + StubApp.getString2(16594) + fragment);
                    }
                } else if (!(container instanceof C0794y)) {
                    C0830c c0830c = AbstractC0831d.f13570a;
                    Intrinsics.checkNotNullParameter(fragment, "fragment");
                    Intrinsics.checkNotNullParameter(container, "container");
                    Intrinsics.checkNotNullParameter(fragment, "fragment");
                    Intrinsics.checkNotNullParameter(container, "container");
                    C0834g c0834g = new C0834g(fragment, StubApp.getString2(16595) + fragment + StubApp.getString2(16457) + container + StubApp.getString2(16596));
                    AbstractC0831d.c(c0834g);
                    C0830c a3 = AbstractC0831d.a(fragment);
                    if (a3.f13568a.contains(EnumC0829b.f13565f) && AbstractC0831d.e(a3, fragment.getClass(), C0834g.class)) {
                        AbstractC0831d.b(a3, c0834g);
                    }
                }
            }
        }
        fragment.f13353H = container;
        fragment.H(B7, container, bundle2);
        if (fragment.f13354I != null) {
            if (M.J(3)) {
                Log.d(string22, StubApp.getString2(16599) + fragment);
            }
            fragment.f13354I.setSaveFromParentEnabled(false);
            fragment.f13354I.setTag(2131230886, fragment);
            if (container != null) {
                b();
            }
            if (fragment.f13348C) {
                fragment.f13354I.setVisibility(8);
            }
            if (fragment.f13354I.isAttachedToWindow()) {
                View view = fragment.f13354I;
                WeakHashMap weakHashMap = N.I.f4732a;
                AbstractC0179z.c(view);
            } else {
                View view2 = fragment.f13354I;
                view2.addOnAttachStateChangeListener(new T(view2, 0));
            }
            Bundle bundle3 = fragment.f13365b;
            if (bundle3 != null) {
                bundle3.getBundle(string23);
            }
            fragment.f13386x.u(2);
            this.f13214a.w(fragment, fragment.f13354I, false);
            int visibility = fragment.f13354I.getVisibility();
            fragment.k().j = fragment.f13354I.getAlpha();
            if (fragment.f13353H != null && visibility == 0) {
                View findFocus = fragment.f13354I.findFocus();
                if (findFocus != null) {
                    fragment.k().f13344k = findFocus;
                    if (M.J(2)) {
                        Log.v(string22, StubApp.getString2(16600) + findFocus + StubApp.getString2(16601) + fragment);
                    }
                }
                fragment.f13354I.setAlpha(0.0f);
            }
        }
        fragment.f13364a = 2;
    }

    public final void g() {
        AbstractComponentCallbacksC0789t y10;
        boolean J10 = M.J(3);
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = this.f13216c;
        if (J10) {
            Log.d(StubApp.getString2(49), StubApp.getString2(16602) + abstractComponentCallbacksC0789t);
        }
        boolean z2 = true;
        boolean z10 = abstractComponentCallbacksC0789t.f13376m && !abstractComponentCallbacksC0789t.s();
        D5.B b2 = this.f13215b;
        if (z10) {
            b2.L(abstractComponentCallbacksC0789t.f13368e, null);
        }
        if (!z10) {
            P p8 = (P) b2.f1343d;
            if (!((p8.f13193b.containsKey(abstractComponentCallbacksC0789t.f13368e) && p8.f13196e) ? p8.f13197f : true)) {
                String str = abstractComponentCallbacksC0789t.f13371h;
                if (str != null && (y10 = b2.y(str)) != null && y10.f13350E) {
                    abstractComponentCallbacksC0789t.f13370g = y10;
                }
                abstractComponentCallbacksC0789t.f13364a = 0;
                return;
            }
        }
        C0791v c0791v = abstractComponentCallbacksC0789t.f13385w;
        if (c0791v != null) {
            z2 = ((P) b2.f1343d).f13197f;
        } else {
            AbstractActivityC1027h abstractActivityC1027h = c0791v.f13392b;
            if (abstractActivityC1027h != null) {
                z2 = true ^ abstractActivityC1027h.isChangingConfigurations();
            }
        }
        if (z10 || z2) {
            ((P) b2.f1343d).c(abstractComponentCallbacksC0789t, false);
        }
        abstractComponentCallbacksC0789t.f13386x.l();
        abstractComponentCallbacksC0789t.f13362Y.e(EnumC0438m.ON_DESTROY);
        abstractComponentCallbacksC0789t.f13364a = 0;
        abstractComponentCallbacksC0789t.f13352G = false;
        abstractComponentCallbacksC0789t.f13359R = false;
        abstractComponentCallbacksC0789t.y();
        if (!abstractComponentCallbacksC0789t.f13352G) {
            throw new f0(StubApp.getString2(16452) + abstractComponentCallbacksC0789t + StubApp.getString2(16603));
        }
        this.f13214a.m(abstractComponentCallbacksC0789t, false);
        Iterator it = b2.A().iterator();
        while (it.hasNext()) {
            U u2 = (U) it.next();
            if (u2 != null) {
                String str2 = abstractComponentCallbacksC0789t.f13368e;
                AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t2 = u2.f13216c;
                if (str2.equals(abstractComponentCallbacksC0789t2.f13371h)) {
                    abstractComponentCallbacksC0789t2.f13370g = abstractComponentCallbacksC0789t;
                    abstractComponentCallbacksC0789t2.f13371h = null;
                }
            }
        }
        String str3 = abstractComponentCallbacksC0789t.f13371h;
        if (str3 != null) {
            abstractComponentCallbacksC0789t.f13370g = b2.y(str3);
        }
        b2.J(this);
    }

    public final void h() {
        View view;
        boolean J10 = M.J(3);
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = this.f13216c;
        if (J10) {
            Log.d(StubApp.getString2(49), StubApp.getString2(16604) + abstractComponentCallbacksC0789t);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0789t.f13353H;
        if (viewGroup != null && (view = abstractComponentCallbacksC0789t.f13354I) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC0789t.f13386x.u(1);
        if (abstractComponentCallbacksC0789t.f13354I != null) {
            W w10 = abstractComponentCallbacksC0789t.f13363Z;
            w10.c();
            if (w10.f13231d.f9925c.a(EnumC0439n.f9915c)) {
                abstractComponentCallbacksC0789t.f13363Z.b(EnumC0438m.ON_DESTROY);
            }
        }
        abstractComponentCallbacksC0789t.f13364a = 1;
        abstractComponentCallbacksC0789t.f13352G = false;
        abstractComponentCallbacksC0789t.z();
        if (!abstractComponentCallbacksC0789t.f13352G) {
            throw new f0(StubApp.getString2(16452) + abstractComponentCallbacksC0789t + StubApp.getString2(16605));
        }
        androidx.lifecycle.V store = abstractComponentCallbacksC0789t.e();
        O factory = C1102a.f15420c;
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        C1028a defaultCreationExtras = C1028a.f14702b;
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        D5.B b2 = new D5.B(store, factory, defaultCreationExtras);
        Intrinsics.checkNotNullParameter(C1102a.class, "modelClass");
        KClass modelClass = JvmClassMappingKt.getKotlinClass(C1102a.class);
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "<this>");
        String qualifiedName = modelClass.getQualifiedName();
        if (qualifiedName == null) {
            throw new IllegalArgumentException(StubApp.getString2(16510));
        }
        C1698k c1698k = ((C1102a) b2.E(modelClass, StubApp.getString2(16509).concat(qualifiedName))).f15421b;
        if (c1698k.f21043c > 0) {
            throw com.mapbox.common.b.d(c1698k.f21042b[0]);
        }
        abstractComponentCallbacksC0789t.f13382s = false;
        this.f13214a.x(abstractComponentCallbacksC0789t, false);
        abstractComponentCallbacksC0789t.f13353H = null;
        abstractComponentCallbacksC0789t.f13354I = null;
        abstractComponentCallbacksC0789t.f13363Z = null;
        abstractComponentCallbacksC0789t.h0.f(null);
        abstractComponentCallbacksC0789t.f13380q = false;
    }

    public final void i() {
        boolean J10 = M.J(3);
        String string2 = StubApp.getString2(49);
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = this.f13216c;
        if (J10) {
            Log.d(string2, StubApp.getString2(16606) + abstractComponentCallbacksC0789t);
        }
        abstractComponentCallbacksC0789t.f13364a = -1;
        abstractComponentCallbacksC0789t.f13352G = false;
        abstractComponentCallbacksC0789t.A();
        if (!abstractComponentCallbacksC0789t.f13352G) {
            throw new f0(StubApp.getString2(16452) + abstractComponentCallbacksC0789t + StubApp.getString2(16608));
        }
        M m4 = abstractComponentCallbacksC0789t.f13386x;
        if (!m4.f13151J) {
            m4.l();
            abstractComponentCallbacksC0789t.f13386x = new M();
        }
        this.f13214a.n(abstractComponentCallbacksC0789t, false);
        abstractComponentCallbacksC0789t.f13364a = -1;
        abstractComponentCallbacksC0789t.f13385w = null;
        abstractComponentCallbacksC0789t.f13387y = null;
        abstractComponentCallbacksC0789t.f13384v = null;
        if (!abstractComponentCallbacksC0789t.f13376m || abstractComponentCallbacksC0789t.s()) {
            P p8 = (P) this.f13215b.f1343d;
            if (!((p8.f13193b.containsKey(abstractComponentCallbacksC0789t.f13368e) && p8.f13196e) ? p8.f13197f : true)) {
                return;
            }
        }
        if (M.J(3)) {
            Log.d(string2, StubApp.getString2(16607) + abstractComponentCallbacksC0789t);
        }
        abstractComponentCallbacksC0789t.q();
    }

    public final void j() {
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = this.f13216c;
        if (abstractComponentCallbacksC0789t.f13379p && abstractComponentCallbacksC0789t.f13380q && !abstractComponentCallbacksC0789t.f13382s) {
            if (M.J(3)) {
                Log.d(StubApp.getString2(49), StubApp.getString2(16592) + abstractComponentCallbacksC0789t);
            }
            Bundle bundle = abstractComponentCallbacksC0789t.f13365b;
            String string2 = StubApp.getString2(16497);
            Bundle bundle2 = bundle != null ? bundle.getBundle(string2) : null;
            abstractComponentCallbacksC0789t.H(abstractComponentCallbacksC0789t.B(bundle2), null, bundle2);
            View view = abstractComponentCallbacksC0789t.f13354I;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC0789t.f13354I.setTag(2131230886, abstractComponentCallbacksC0789t);
                if (abstractComponentCallbacksC0789t.f13348C) {
                    abstractComponentCallbacksC0789t.f13354I.setVisibility(8);
                }
                Bundle bundle3 = abstractComponentCallbacksC0789t.f13365b;
                if (bundle3 != null) {
                    bundle3.getBundle(string2);
                }
                abstractComponentCallbacksC0789t.f13386x.u(2);
                this.f13214a.w(abstractComponentCallbacksC0789t, abstractComponentCallbacksC0789t.f13354I, false);
                abstractComponentCallbacksC0789t.f13364a = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        c0 c0Var;
        D5.B b2 = this.f13215b;
        boolean z2 = this.f13217d;
        String string2 = StubApp.getString2(49);
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = this.f13216c;
        if (z2) {
            if (M.J(2)) {
                Log.v(string2, StubApp.getString2(16609) + abstractComponentCallbacksC0789t);
                return;
            }
            return;
        }
        try {
            this.f13217d = true;
            boolean z10 = false;
            while (true) {
                int d8 = d();
                int i3 = abstractComponentCallbacksC0789t.f13364a;
                if (d8 == i3) {
                    if (!z10 && i3 == -1 && abstractComponentCallbacksC0789t.f13376m && !abstractComponentCallbacksC0789t.s()) {
                        if (M.J(3)) {
                            Log.d(string2, StubApp.getString2("16611") + abstractComponentCallbacksC0789t);
                        }
                        ((P) b2.f1343d).c(abstractComponentCallbacksC0789t, true);
                        b2.J(this);
                        if (M.J(3)) {
                            Log.d(string2, StubApp.getString2("16607") + abstractComponentCallbacksC0789t);
                        }
                        abstractComponentCallbacksC0789t.q();
                    }
                    if (abstractComponentCallbacksC0789t.f13358P) {
                        if (abstractComponentCallbacksC0789t.f13354I != null && (viewGroup = abstractComponentCallbacksC0789t.f13353H) != null) {
                            e0 m4 = e0.m(viewGroup, abstractComponentCallbacksC0789t.o());
                            if (abstractComponentCallbacksC0789t.f13348C) {
                                m4.f(this);
                            } else {
                                m4.h(this);
                            }
                        }
                        M m10 = abstractComponentCallbacksC0789t.f13384v;
                        if (m10 != null && abstractComponentCallbacksC0789t.f13374l && M.K(abstractComponentCallbacksC0789t)) {
                            m10.f13148G = true;
                        }
                        abstractComponentCallbacksC0789t.f13358P = false;
                        abstractComponentCallbacksC0789t.f13386x.o();
                    }
                    this.f13217d = false;
                    return;
                }
                if (d8 <= i3) {
                    switch (i3 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            g();
                            break;
                        case 1:
                            h();
                            abstractComponentCallbacksC0789t.f13364a = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC0789t.f13380q = false;
                            abstractComponentCallbacksC0789t.f13364a = 2;
                            break;
                        case 3:
                            if (M.J(3)) {
                                Log.d(string2, StubApp.getString2("16610") + abstractComponentCallbacksC0789t);
                            }
                            if (abstractComponentCallbacksC0789t.f13354I != null && abstractComponentCallbacksC0789t.f13366c == null) {
                                o();
                            }
                            if (abstractComponentCallbacksC0789t.f13354I != null && (viewGroup2 = abstractComponentCallbacksC0789t.f13353H) != null) {
                                e0.m(viewGroup2, abstractComponentCallbacksC0789t.o()).g(this);
                            }
                            abstractComponentCallbacksC0789t.f13364a = 3;
                            break;
                        case 4:
                            q();
                            break;
                        case 5:
                            abstractComponentCallbacksC0789t.f13364a = 5;
                            break;
                        case 6:
                            l();
                            break;
                    }
                } else {
                    switch (i3 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (abstractComponentCallbacksC0789t.f13354I != null && (viewGroup3 = abstractComponentCallbacksC0789t.f13353H) != null) {
                                e0 m11 = e0.m(viewGroup3, abstractComponentCallbacksC0789t.o());
                                int visibility = abstractComponentCallbacksC0789t.f13354I.getVisibility();
                                if (visibility == 0) {
                                    c0Var = c0.f13288b;
                                } else if (visibility == 4) {
                                    c0Var = c0.f13290d;
                                } else {
                                    if (visibility != 8) {
                                        throw new IllegalArgumentException(StubApp.getString2("16478") + visibility);
                                    }
                                    c0Var = c0.f13289c;
                                }
                                m11.e(c0Var, this);
                            }
                            abstractComponentCallbacksC0789t.f13364a = 4;
                            break;
                        case 5:
                            p();
                            break;
                        case 6:
                            abstractComponentCallbacksC0789t.f13364a = 6;
                            break;
                        case 7:
                            n();
                            break;
                    }
                }
                z10 = true;
            }
        } catch (Throwable th) {
            this.f13217d = false;
            throw th;
        }
    }

    public final void l() {
        boolean J10 = M.J(3);
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = this.f13216c;
        if (J10) {
            Log.d(StubApp.getString2(49), StubApp.getString2(16612) + abstractComponentCallbacksC0789t);
        }
        abstractComponentCallbacksC0789t.f13386x.u(5);
        if (abstractComponentCallbacksC0789t.f13354I != null) {
            abstractComponentCallbacksC0789t.f13363Z.b(EnumC0438m.ON_PAUSE);
        }
        abstractComponentCallbacksC0789t.f13362Y.e(EnumC0438m.ON_PAUSE);
        abstractComponentCallbacksC0789t.f13364a = 6;
        abstractComponentCallbacksC0789t.f13352G = true;
        this.f13214a.o(abstractComponentCallbacksC0789t, false);
    }

    public final void m(ClassLoader classLoader) {
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = this.f13216c;
        Bundle bundle = abstractComponentCallbacksC0789t.f13365b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Bundle bundle2 = abstractComponentCallbacksC0789t.f13365b;
        String string2 = StubApp.getString2(16497);
        if (bundle2.getBundle(string2) == null) {
            abstractComponentCallbacksC0789t.f13365b.putBundle(string2, new Bundle());
        }
        try {
            abstractComponentCallbacksC0789t.f13366c = abstractComponentCallbacksC0789t.f13365b.getSparseParcelableArray(StubApp.getString2("16500"));
            abstractComponentCallbacksC0789t.f13367d = abstractComponentCallbacksC0789t.f13365b.getBundle(StubApp.getString2(16501));
            S s10 = (S) abstractComponentCallbacksC0789t.f13365b.getParcelable(StubApp.getString2(291));
            if (s10 != null) {
                abstractComponentCallbacksC0789t.f13371h = s10.f13209m;
                abstractComponentCallbacksC0789t.j = s10.f13210n;
                abstractComponentCallbacksC0789t.f13356L = s10.f13211p;
            }
            if (abstractComponentCallbacksC0789t.f13356L) {
                return;
            }
            abstractComponentCallbacksC0789t.f13355K = true;
        } catch (BadParcelableException e10) {
            throw new IllegalStateException(StubApp.getString2(16613) + abstractComponentCallbacksC0789t, e10);
        }
    }

    public final void n() {
        boolean J10 = M.J(3);
        String string2 = StubApp.getString2(49);
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = this.f13216c;
        if (J10) {
            Log.d(string2, StubApp.getString2(16614) + abstractComponentCallbacksC0789t);
        }
        C0788s c0788s = abstractComponentCallbacksC0789t.f13357O;
        View view = c0788s == null ? null : c0788s.f13344k;
        if (view != null) {
            if (view != abstractComponentCallbacksC0789t.f13354I) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != abstractComponentCallbacksC0789t.f13354I) {
                    }
                }
            }
            boolean requestFocus = view.requestFocus();
            if (M.J(2)) {
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(16615));
                sb2.append(view);
                sb2.append(StubApp.getString2(397));
                sb2.append(requestFocus ? StubApp.getString2(16616) : StubApp.getString2(16617));
                sb2.append(StubApp.getString2(16618));
                sb2.append(abstractComponentCallbacksC0789t);
                sb2.append(StubApp.getString2(16619));
                sb2.append(abstractComponentCallbacksC0789t.f13354I.findFocus());
                Log.v(string2, sb2.toString());
            }
        }
        abstractComponentCallbacksC0789t.k().f13344k = null;
        abstractComponentCallbacksC0789t.f13386x.P();
        abstractComponentCallbacksC0789t.f13386x.z(true);
        abstractComponentCallbacksC0789t.f13364a = 7;
        abstractComponentCallbacksC0789t.f13352G = false;
        abstractComponentCallbacksC0789t.C();
        if (!abstractComponentCallbacksC0789t.f13352G) {
            throw new f0(StubApp.getString2(16452) + abstractComponentCallbacksC0789t + StubApp.getString2(16620));
        }
        C0446v c0446v = abstractComponentCallbacksC0789t.f13362Y;
        EnumC0438m enumC0438m = EnumC0438m.ON_RESUME;
        c0446v.e(enumC0438m);
        if (abstractComponentCallbacksC0789t.f13354I != null) {
            abstractComponentCallbacksC0789t.f13363Z.f13231d.e(enumC0438m);
        }
        M m4 = abstractComponentCallbacksC0789t.f13386x;
        m4.f13149H = false;
        m4.f13150I = false;
        m4.f13156O.f13198g = false;
        m4.u(7);
        this.f13214a.s(abstractComponentCallbacksC0789t, false);
        this.f13215b.L(abstractComponentCallbacksC0789t.f13368e, null);
        abstractComponentCallbacksC0789t.f13365b = null;
        abstractComponentCallbacksC0789t.f13366c = null;
        abstractComponentCallbacksC0789t.f13367d = null;
    }

    public final void o() {
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = this.f13216c;
        if (abstractComponentCallbacksC0789t.f13354I == null) {
            return;
        }
        if (M.J(2)) {
            Log.v(StubApp.getString2(49), StubApp.getString2(16621) + abstractComponentCallbacksC0789t + StubApp.getString2(16622) + abstractComponentCallbacksC0789t.f13354I);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC0789t.f13354I.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC0789t.f13366c = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC0789t.f13363Z.f13232e.x(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC0789t.f13367d = bundle;
    }

    public final void p() {
        boolean J10 = M.J(3);
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = this.f13216c;
        if (J10) {
            Log.d(StubApp.getString2(49), StubApp.getString2(16623) + abstractComponentCallbacksC0789t);
        }
        abstractComponentCallbacksC0789t.f13386x.P();
        abstractComponentCallbacksC0789t.f13386x.z(true);
        abstractComponentCallbacksC0789t.f13364a = 5;
        abstractComponentCallbacksC0789t.f13352G = false;
        abstractComponentCallbacksC0789t.E();
        if (!abstractComponentCallbacksC0789t.f13352G) {
            throw new f0(StubApp.getString2(16452) + abstractComponentCallbacksC0789t + StubApp.getString2(16624));
        }
        C0446v c0446v = abstractComponentCallbacksC0789t.f13362Y;
        EnumC0438m enumC0438m = EnumC0438m.ON_START;
        c0446v.e(enumC0438m);
        if (abstractComponentCallbacksC0789t.f13354I != null) {
            abstractComponentCallbacksC0789t.f13363Z.f13231d.e(enumC0438m);
        }
        M m4 = abstractComponentCallbacksC0789t.f13386x;
        m4.f13149H = false;
        m4.f13150I = false;
        m4.f13156O.f13198g = false;
        m4.u(5);
        this.f13214a.u(abstractComponentCallbacksC0789t, false);
    }

    public final void q() {
        boolean J10 = M.J(3);
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = this.f13216c;
        if (J10) {
            Log.d(StubApp.getString2(49), StubApp.getString2(16625) + abstractComponentCallbacksC0789t);
        }
        M m4 = abstractComponentCallbacksC0789t.f13386x;
        m4.f13150I = true;
        m4.f13156O.f13198g = true;
        m4.u(4);
        if (abstractComponentCallbacksC0789t.f13354I != null) {
            abstractComponentCallbacksC0789t.f13363Z.b(EnumC0438m.ON_STOP);
        }
        abstractComponentCallbacksC0789t.f13362Y.e(EnumC0438m.ON_STOP);
        abstractComponentCallbacksC0789t.f13364a = 4;
        abstractComponentCallbacksC0789t.f13352G = false;
        abstractComponentCallbacksC0789t.F();
        if (abstractComponentCallbacksC0789t.f13352G) {
            this.f13214a.v(abstractComponentCallbacksC0789t, false);
            return;
        }
        throw new f0(StubApp.getString2(16452) + abstractComponentCallbacksC0789t + StubApp.getString2(16626));
    }

    public U(V6.b bVar, D5.B b2, ClassLoader classLoader, C0768F c0768f, Bundle bundle) {
        this.f13214a = bVar;
        this.f13215b = b2;
        S s10 = (S) bundle.getParcelable(StubApp.getString2(291));
        AbstractComponentCallbacksC0789t a3 = c0768f.a(s10.f13199a);
        a3.f13368e = s10.f13200b;
        a3.f13379p = s10.f13201c;
        a3.f13381r = true;
        a3.f13388z = s10.f13202d;
        a3.f13346A = s10.f13203e;
        a3.f13347B = s10.f13204f;
        a3.f13350E = s10.f13205g;
        a3.f13376m = s10.f13206h;
        a3.f13349D = s10.j;
        a3.f13348C = s10.f13207k;
        a3.f13361X = EnumC0439n.values()[s10.f13208l];
        a3.f13371h = s10.f13209m;
        a3.j = s10.f13210n;
        a3.f13356L = s10.f13211p;
        this.f13216c = a3;
        a3.f13365b = bundle;
        Bundle bundle2 = bundle.getBundle(StubApp.getString2(6400));
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a3.L(bundle2);
        if (M.J(2)) {
            Log.v(StubApp.getString2(49), StubApp.getString2(16576) + a3);
        }
    }

    public U(V6.b bVar, D5.B b2, AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t, Bundle bundle) {
        this.f13214a = bVar;
        this.f13215b = b2;
        this.f13216c = abstractComponentCallbacksC0789t;
        abstractComponentCallbacksC0789t.f13366c = null;
        abstractComponentCallbacksC0789t.f13367d = null;
        abstractComponentCallbacksC0789t.f13383t = 0;
        abstractComponentCallbacksC0789t.f13380q = false;
        abstractComponentCallbacksC0789t.f13374l = false;
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t2 = abstractComponentCallbacksC0789t.f13370g;
        abstractComponentCallbacksC0789t.f13371h = abstractComponentCallbacksC0789t2 != null ? abstractComponentCallbacksC0789t2.f13368e : null;
        abstractComponentCallbacksC0789t.f13370g = null;
        abstractComponentCallbacksC0789t.f13365b = bundle;
        abstractComponentCallbacksC0789t.f13369f = bundle.getBundle(StubApp.getString2(6400));
    }
}
