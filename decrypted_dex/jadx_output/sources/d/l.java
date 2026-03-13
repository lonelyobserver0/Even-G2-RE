package d;

import C.C0028e;
import N.I;
import N.InterfaceC0163i;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.C0446v;
import androidx.lifecycle.EnumC0438m;
import androidx.lifecycle.EnumC0439n;
import androidx.lifecycle.F;
import androidx.lifecycle.H;
import androidx.lifecycle.InterfaceC0434i;
import androidx.lifecycle.InterfaceC0444t;
import androidx.lifecycle.L;
import androidx.lifecycle.T;
import androidx.lifecycle.V;
import androidx.lifecycle.W;
import com.stub.StubApp;
import d0.C0767E;
import e.InterfaceC0827a;
import f5.u0;
import i.AbstractActivityC1027h;
import i0.C1031d;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import l4.E0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class l extends Activity implements W, InterfaceC0434i, M1.e, InterfaceC0756A, D.d, InterfaceC0444t, InterfaceC0163i {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f13075v = 0;

    /* renamed from: a, reason: collision with root package name */
    public final C0446v f13076a = new C0446v(this);

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.common.i f13077b = new com.google.android.gms.common.i();

    /* renamed from: c, reason: collision with root package name */
    public final Q2.g f13078c;

    /* renamed from: d, reason: collision with root package name */
    public final Z9.C f13079d;

    /* renamed from: e, reason: collision with root package name */
    public V f13080e;

    /* renamed from: f, reason: collision with root package name */
    public final i f13081f;

    /* renamed from: g, reason: collision with root package name */
    public final Lazy f13082g;

    /* renamed from: h, reason: collision with root package name */
    public final j f13083h;
    public final CopyOnWriteArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public final CopyOnWriteArrayList f13084k;

    /* renamed from: l, reason: collision with root package name */
    public final CopyOnWriteArrayList f13085l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f13086m;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f13087n;

    /* renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList f13088p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f13089q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f13090r;

    /* renamed from: s, reason: collision with root package name */
    public final Lazy f13091s;

    /* renamed from: t, reason: collision with root package name */
    public final Lazy f13092t;

    public l() {
        final AbstractActivityC1027h abstractActivityC1027h = (AbstractActivityC1027h) this;
        this.f13078c = new Q2.g(new RunnableC0761c(abstractActivityC1027h, 0));
        Intrinsics.checkNotNullParameter(this, "owner");
        C2.c cVar = new C2.c(this, new J2.d(this, 1));
        Z9.C c10 = new Z9.C(cVar);
        this.f13079d = c10;
        this.f13081f = new i(abstractActivityC1027h);
        this.f13082g = LazyKt.lazy(new k(abstractActivityC1027h, 2));
        new AtomicInteger();
        this.f13083h = new j(abstractActivityC1027h);
        this.j = new CopyOnWriteArrayList();
        this.f13084k = new CopyOnWriteArrayList();
        this.f13085l = new CopyOnWriteArrayList();
        this.f13086m = new CopyOnWriteArrayList();
        this.f13087n = new CopyOnWriteArrayList();
        this.f13088p = new CopyOnWriteArrayList();
        C0446v c0446v = this.f13076a;
        if (c0446v == null) {
            throw new IllegalStateException(StubApp.getString2(16424));
        }
        final int i3 = 0;
        c0446v.a(new androidx.lifecycle.r() { // from class: d.d
            @Override // androidx.lifecycle.r
            public final void h(InterfaceC0444t interfaceC0444t, EnumC0438m event) {
                Window window;
                View peekDecorView;
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter(interfaceC0444t, "<anonymous parameter 0>");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event == EnumC0438m.ON_STOP && (window = abstractActivityC1027h.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        AbstractActivityC1027h abstractActivityC1027h2 = abstractActivityC1027h;
                        Intrinsics.checkNotNullParameter(interfaceC0444t, "<anonymous parameter 0>");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event == EnumC0438m.ON_DESTROY) {
                            abstractActivityC1027h2.f13077b.f11192b = null;
                            if (!abstractActivityC1027h2.isChangingConfigurations()) {
                                abstractActivityC1027h2.e().a();
                            }
                            i iVar = abstractActivityC1027h2.f13081f;
                            AbstractActivityC1027h abstractActivityC1027h3 = iVar.f13064d;
                            abstractActivityC1027h3.getWindow().getDecorView().removeCallbacks(iVar);
                            abstractActivityC1027h3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(iVar);
                            break;
                        }
                        break;
                }
            }
        });
        final int i10 = 1;
        this.f13076a.a(new androidx.lifecycle.r() { // from class: d.d
            @Override // androidx.lifecycle.r
            public final void h(InterfaceC0444t interfaceC0444t, EnumC0438m event) {
                Window window;
                View peekDecorView;
                switch (i10) {
                    case 0:
                        Intrinsics.checkNotNullParameter(interfaceC0444t, "<anonymous parameter 0>");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event == EnumC0438m.ON_STOP && (window = abstractActivityC1027h.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        AbstractActivityC1027h abstractActivityC1027h2 = abstractActivityC1027h;
                        Intrinsics.checkNotNullParameter(interfaceC0444t, "<anonymous parameter 0>");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event == EnumC0438m.ON_DESTROY) {
                            abstractActivityC1027h2.f13077b.f11192b = null;
                            if (!abstractActivityC1027h2.isChangingConfigurations()) {
                                abstractActivityC1027h2.e().a();
                            }
                            i iVar = abstractActivityC1027h2.f13081f;
                            AbstractActivityC1027h abstractActivityC1027h3 = iVar.f13064d;
                            abstractActivityC1027h3.getWindow().getDecorView().removeCallbacks(iVar);
                            abstractActivityC1027h3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(iVar);
                            break;
                        }
                        break;
                }
            }
        });
        this.f13076a.a(new M1.b(abstractActivityC1027h, 3));
        cVar.a();
        L.c(this);
        ((E0) c10.f9078c).K(StubApp.getString2(16418), new e(abstractActivityC1027h, 0));
        int i11 = 0;
        h(new f(abstractActivityC1027h, i11));
        this.f13091s = LazyKt.lazy(new k(abstractActivityC1027h, i11));
        this.f13092t = LazyKt.lazy(new k(abstractActivityC1027h, 3));
    }

    @Override // d.InterfaceC0756A
    public final z a() {
        return (z) this.f13092t.getValue();
    }

    @Override // D.d
    public final void b(M.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.j.add(listener);
    }

    @Override // D.d
    public final void c(M.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.j.remove(listener);
    }

    @Override // androidx.lifecycle.InterfaceC0434i
    public final C1031d d() {
        C1031d c1031d = new C1031d(0);
        if (getApplication() != null) {
            I4.e eVar = T.f9898f;
            Application application = getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "application");
            c1031d.b(eVar, application);
        }
        c1031d.b(L.f9880a, this);
        c1031d.b(L.f9881b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            c1031d.b(L.f9882c, extras);
        }
        return c1031d;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullExpressionValue(getWindow().getDecorView(), "window.decorView");
        WeakHashMap weakHashMap = I.f4732a;
        Intrinsics.checkNotNullParameter(event, "event");
        return super.dispatchKeyEvent(event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullExpressionValue(getWindow().getDecorView(), "window.decorView");
        WeakHashMap weakHashMap = I.f4732a;
        return super.dispatchKeyShortcutEvent(event);
    }

    @Override // androidx.lifecycle.W
    public final V e() {
        if (getApplication() == null) {
            throw new IllegalStateException(StubApp.getString2(16425));
        }
        if (this.f13080e == null) {
            h hVar = (h) getLastNonConfigurationInstance();
            if (hVar != null) {
                this.f13080e = hVar.f13060a;
            }
            if (this.f13080e == null) {
                this.f13080e = new V();
            }
        }
        V v2 = this.f13080e;
        Intrinsics.checkNotNull(v2);
        return v2;
    }

    @Override // M1.e
    public final E0 f() {
        return (E0) this.f13079d.f9078c;
    }

    public final void h(InterfaceC0827a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.google.android.gms.common.i iVar = this.f13077b;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        l lVar = (l) iVar.f11192b;
        if (lVar != null) {
            listener.a(lVar);
        }
        ((CopyOnWriteArraySet) iVar.f11191a).add(listener);
    }

    @Override // androidx.lifecycle.InterfaceC0444t
    public final C0446v i() {
        return this.f13076a;
    }

    public final void j() {
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        L.e(decorView, this);
        View decorView2 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "window.decorView");
        Intrinsics.checkNotNullParameter(decorView2, "<this>");
        decorView2.setTag(2131231166, this);
        View decorView3 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "window.decorView");
        Intrinsics.checkNotNullParameter(decorView3, "<this>");
        decorView3.setTag(2131231165, this);
        View decorView4 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView4, "window.decorView");
        Intrinsics.checkNotNullParameter(decorView4, "<this>");
        Intrinsics.checkNotNullParameter(this, "onBackPressedDispatcherOwner");
        decorView4.setTag(2131231164, this);
        View decorView5 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView5, "window.decorView");
        Intrinsics.checkNotNullParameter(decorView5, "<this>");
        Intrinsics.checkNotNullParameter(this, "fullyDrawnReporterOwner");
        decorView5.setTag(2131231024, this);
    }

    public final void k(Bundle bundle) {
        super.onCreate(bundle);
        int i3 = H.f9874b;
        F.b(this);
    }

    public final void l(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        this.f13076a.g(EnumC0439n.f9915c);
        super.onSaveInstanceState(outState);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i3, int i10, Intent intent) {
        if (this.f13083h.a(i3, i10, intent)) {
            return;
        }
        super.onActivityResult(i3, i10, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        a().b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((M.a) it.next()).accept(newConfig);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f13079d.v(bundle);
        com.google.android.gms.common.i iVar = this.f13077b;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(this, "context");
        iVar.f11192b = this;
        Iterator it = ((CopyOnWriteArraySet) iVar.f11191a).iterator();
        while (it.hasNext()) {
            ((InterfaceC0827a) it.next()).a(this);
        }
        k(bundle);
        int i3 = H.f9874b;
        F.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i3, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (i3 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i3, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f13078c.f5712c).iterator();
        while (it.hasNext()) {
            ((C0767E) it.next()).f13132a.k();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i3, MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (super.onMenuItemSelected(i3, item)) {
            return true;
        }
        if (i3 == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.f13078c.f5712c).iterator();
            while (it.hasNext()) {
                if (((C0767E) it.next()).f13132a.p()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2) {
        if (this.f13089q) {
            return;
        }
        Iterator it = this.f13086m.iterator();
        while (it.hasNext()) {
            ((M.a) it.next()).accept(new C0028e(z2));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f13085l.iterator();
        while (it.hasNext()) {
            ((M.a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i3, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Iterator it = ((CopyOnWriteArrayList) this.f13078c.f5712c).iterator();
        while (it.hasNext()) {
            ((C0767E) it.next()).f13132a.q();
        }
        super.onPanelClosed(i3, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2) {
        if (this.f13090r) {
            return;
        }
        Iterator it = this.f13087n.iterator();
        while (it.hasNext()) {
            ((M.a) it.next()).accept(new C.L(z2));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i3, View view, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (i3 != 0) {
            return true;
        }
        super.onPreparePanel(i3, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f13078c.f5712c).iterator();
        while (it.hasNext()) {
            ((C0767E) it.next()).f13132a.t();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i3, String[] permissions, int[] grantResults) {
        StubApp.interface22(i3, permissions, grantResults);
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (this.f13083h.a(i3, -1, new Intent().putExtra(StubApp.getString2(16421), permissions).putExtra(StubApp.getString2(16426), grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(i3, permissions, grantResults);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        h hVar;
        V v2 = this.f13080e;
        if (v2 == null && (hVar = (h) getLastNonConfigurationInstance()) != null) {
            v2 = hVar.f13060a;
        }
        if (v2 == null) {
            return null;
        }
        h hVar2 = new h();
        hVar2.f13060a = v2;
        return hVar2;
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        C0446v c0446v = this.f13076a;
        if (c0446v != null) {
            Intrinsics.checkNotNull(c0446v, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            c0446v.g(EnumC0439n.f9915c);
        }
        l(outState);
        this.f13079d.x(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i3) {
        super.onTrimMemory(i3);
        Iterator it = this.f13084k.iterator();
        while (it.hasNext()) {
            ((M.a) it.next()).accept(Integer.valueOf(i3));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f13088p.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (u0.q()) {
                Trace.beginSection(u0.A(StubApp.getString2("16427")));
            }
            super.reportFullyDrawn();
            ((s) this.f13082g.getValue()).a();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        j();
        View view2 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(view2, "window.decorView");
        i iVar = this.f13081f;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(view2, "view");
        if (!iVar.f13063c) {
            iVar.f13063c = true;
            view2.getViewTreeObserver().addOnDrawListener(iVar);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i3) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startActivityForResult(intent, i3);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intent, int i3, Intent intent2, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startIntentSenderForResult(intent, i3, intent2, i10, i11, i12);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i3, Bundle bundle) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startActivityForResult(intent, i3, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intent, int i3, Intent intent2, int i10, int i11, int i12, Bundle bundle) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startIntentSenderForResult(intent, i3, intent2, i10, i11, i12, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2, Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.f13089q = true;
        try {
            super.onMultiWindowModeChanged(z2, newConfig);
            this.f13089q = false;
            Iterator it = this.f13086m.iterator();
            while (it.hasNext()) {
                M.a aVar = (M.a) it.next();
                Intrinsics.checkNotNullParameter(newConfig, "newConfig");
                aVar.accept(new C0028e(z2));
            }
        } catch (Throwable th) {
            this.f13089q = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2, Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.f13090r = true;
        try {
            super.onPictureInPictureModeChanged(z2, newConfig);
            this.f13090r = false;
            Iterator it = this.f13087n.iterator();
            while (it.hasNext()) {
                M.a aVar = (M.a) it.next();
                Intrinsics.checkNotNullParameter(newConfig, "newConfig");
                aVar.accept(new C.L(z2));
            }
        } catch (Throwable th) {
            this.f13090r = false;
            throw th;
        }
    }
}
