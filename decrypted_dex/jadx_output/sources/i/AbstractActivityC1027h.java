package i;

import C.AbstractC0026c;
import C.InterfaceC0024a;
import a0.C0379a;
import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0446v;
import androidx.lifecycle.EnumC0438m;
import androidx.lifecycle.EnumC0439n;
import com.stub.StubApp;
import d0.AbstractComponentCallbacksC0789t;
import d0.C0791v;
import d0.M;
import d0.W;
import i.AbstractActivityC1027h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import l.C1132c;
import l4.E0;
import n.C1365u;
import n.J0;
import n.b1;
import t.C1694g;

/* renamed from: i.h, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractActivityC1027h extends d.l implements i, InterfaceC0024a {

    /* renamed from: B, reason: collision with root package name */
    public v f14604B;

    /* renamed from: y, reason: collision with root package name */
    public boolean f14607y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f14608z;

    /* renamed from: w, reason: collision with root package name */
    public final C0379a f14605w = new C0379a(new C0791v(this), 2);

    /* renamed from: x, reason: collision with root package name */
    public final C0446v f14606x = new C0446v(this);

    /* renamed from: A, reason: collision with root package name */
    public boolean f14603A = true;

    public AbstractActivityC1027h() {
        ((E0) this.f13079d.f9078c).K(StubApp.getString2(18375), new d.e(this, 1));
        final int i3 = 0;
        b(new M.a(this) { // from class: d0.u

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC1027h f13390b;

            {
                this.f13390b = this;
            }

            @Override // M.a
            public final void accept(Object obj) {
                switch (i3) {
                    case 0:
                        this.f13390b.f14605w.u();
                        break;
                    default:
                        this.f13390b.f14605w.u();
                        break;
                }
            }
        });
        final int i10 = 1;
        M.a listener = new M.a(this) { // from class: d0.u

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC1027h f13390b;

            {
                this.f13390b = this;
            }

            @Override // M.a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        this.f13390b.f14605w.u();
                        break;
                    default:
                        this.f13390b.f14605w.u();
                        break;
                }
            }
        };
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f13085l.add(listener);
        h(new d.f(this, 1));
    }

    public static boolean o(M m4) {
        EnumC0439n enumC0439n = EnumC0439n.f9915c;
        boolean z2 = false;
        for (AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t : m4.f13160c.C()) {
            if (abstractComponentCallbacksC0789t != null) {
                C0791v c0791v = abstractComponentCallbacksC0789t.f13385w;
                if ((c0791v == null ? null : c0791v.f13395e) != null) {
                    z2 |= o(abstractComponentCallbacksC0789t.l());
                }
                W w10 = abstractComponentCallbacksC0789t.f13363Z;
                if (w10 != null && w10.i().f9925c.a(EnumC0439n.f9916d)) {
                    abstractComponentCallbacksC0789t.f13363Z.f13231d.g(enumC0439n);
                    z2 = true;
                }
                if (abstractComponentCallbacksC0789t.f13362Y.f9925c.a(EnumC0439n.f9916d)) {
                    abstractComponentCallbacksC0789t.f13362Y.g(enumC0439n);
                    z2 = true;
                }
            }
        }
        return z2;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j();
        v vVar = (v) m();
        vVar.w();
        ((ViewGroup) vVar.f14652D.findViewById(R.id.content)).addView(view, layoutParams);
        vVar.f14673n.a(vVar.f14671m.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        v vVar = (v) m();
        vVar.f14666Z = true;
        int i3 = vVar.f14672m0;
        if (i3 == -100) {
            i3 = l.f14610b;
        }
        int C10 = vVar.C(context, i3);
        if (l.c(context) && l.c(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (l.j) {
                    try {
                        J.e eVar = l.f14611c;
                        if (eVar == null) {
                            if (l.f14612d == null) {
                                l.f14612d = J.e.a(AbstractC0026c.e(context));
                            }
                            if (!l.f14612d.f3256a.f3257a.isEmpty()) {
                                l.f14611c = l.f14612d;
                            }
                        } else if (!eVar.equals(l.f14612d)) {
                            J.e eVar2 = l.f14611c;
                            l.f14612d = eVar2;
                            AbstractC0026c.d(context, eVar2.f3256a.f3257a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            } else if (!l.f14614f) {
                l.f14609a.execute(new H1.f(context, 2));
            }
        }
        J.e o5 = v.o(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(v.t(context, C10, o5, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof C1132c) {
            try {
                ((C1132c) context).a(v.t(context, C10, o5, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (v.f14647D0) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (configuration3.equals(configuration4)) {
                configuration = null;
            } else {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f10 = configuration3.fontScale;
                    float f11 = configuration4.fontScale;
                    if (f10 != f11) {
                        configuration.fontScale = f11;
                    }
                    int i10 = configuration3.mcc;
                    int i11 = configuration4.mcc;
                    if (i10 != i11) {
                        configuration.mcc = i11;
                    }
                    int i12 = configuration3.mnc;
                    int i13 = configuration4.mnc;
                    if (i12 != i13) {
                        configuration.mnc = i13;
                    }
                    p.a(configuration3, configuration4, configuration);
                    int i14 = configuration3.touchscreen;
                    int i15 = configuration4.touchscreen;
                    if (i14 != i15) {
                        configuration.touchscreen = i15;
                    }
                    int i16 = configuration3.keyboard;
                    int i17 = configuration4.keyboard;
                    if (i16 != i17) {
                        configuration.keyboard = i17;
                    }
                    int i18 = configuration3.keyboardHidden;
                    int i19 = configuration4.keyboardHidden;
                    if (i18 != i19) {
                        configuration.keyboardHidden = i19;
                    }
                    int i20 = configuration3.navigation;
                    int i21 = configuration4.navigation;
                    if (i20 != i21) {
                        configuration.navigation = i21;
                    }
                    int i22 = configuration3.navigationHidden;
                    int i23 = configuration4.navigationHidden;
                    if (i22 != i23) {
                        configuration.navigationHidden = i23;
                    }
                    int i24 = configuration3.orientation;
                    int i25 = configuration4.orientation;
                    if (i24 != i25) {
                        configuration.orientation = i25;
                    }
                    int i26 = configuration3.screenLayout & 15;
                    int i27 = configuration4.screenLayout & 15;
                    if (i26 != i27) {
                        configuration.screenLayout |= i27;
                    }
                    int i28 = configuration3.screenLayout & 192;
                    int i29 = configuration4.screenLayout & 192;
                    if (i28 != i29) {
                        configuration.screenLayout |= i29;
                    }
                    int i30 = configuration3.screenLayout & 48;
                    int i31 = configuration4.screenLayout & 48;
                    if (i30 != i31) {
                        configuration.screenLayout |= i31;
                    }
                    int i32 = configuration3.screenLayout & 768;
                    int i33 = configuration4.screenLayout & 768;
                    if (i32 != i33) {
                        configuration.screenLayout |= i33;
                    }
                    int i34 = configuration3.colorMode & 3;
                    int i35 = configuration4.colorMode & 3;
                    if (i34 != i35) {
                        configuration.colorMode |= i35;
                    }
                    int i36 = configuration3.colorMode & 12;
                    int i37 = configuration4.colorMode & 12;
                    if (i36 != i37) {
                        configuration.colorMode |= i37;
                    }
                    int i38 = configuration3.uiMode & 15;
                    int i39 = configuration4.uiMode & 15;
                    if (i38 != i39) {
                        configuration.uiMode |= i39;
                    }
                    int i40 = configuration3.uiMode & 48;
                    int i41 = configuration4.uiMode & 48;
                    if (i40 != i41) {
                        configuration.uiMode |= i41;
                    }
                    int i42 = configuration3.screenWidthDp;
                    int i43 = configuration4.screenWidthDp;
                    if (i42 != i43) {
                        configuration.screenWidthDp = i43;
                    }
                    int i44 = configuration3.screenHeightDp;
                    int i45 = configuration4.screenHeightDp;
                    if (i44 != i45) {
                        configuration.screenHeightDp = i45;
                    }
                    int i46 = configuration3.smallestScreenWidthDp;
                    int i47 = configuration4.smallestScreenWidthDp;
                    if (i46 != i47) {
                        configuration.smallestScreenWidthDp = i47;
                    }
                    int i48 = configuration3.densityDpi;
                    int i49 = configuration4.densityDpi;
                    if (i48 != i49) {
                        configuration.densityDpi = i49;
                    }
                }
            }
            Configuration t3 = v.t(context, C10, o5, configuration, true);
            C1132c c1132c = new C1132c(context, 2131821017);
            c1132c.a(t3);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = c1132c.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        E.k.a(theme);
                    } else {
                        synchronized (E.b.f1692e) {
                            if (!E.b.f1694g) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod(StubApp.getString2("18376"), new Class[0]);
                                    E.b.f1693f = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e10) {
                                    Log.i(StubApp.getString2("1575"), StubApp.getString2("18377"), e10);
                                }
                                E.b.f1694g = true;
                            }
                            Method method = E.b.f1693f;
                            if (method != null) {
                                try {
                                    method.invoke(theme, new Object[0]);
                                } catch (IllegalAccessException | InvocationTargetException e11) {
                                    Log.i(StubApp.getString2("1575"), StubApp.getString2("18378"), e11);
                                    E.b.f1693f = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused3) {
            }
            context = c1132c;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        Oc.a n10 = n();
        if (getWindow().hasFeature(0)) {
            if (n10 == null || !n10.j()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // d.l, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        Oc.a n10 = n();
        if (keyCode == 82 && n10 != null && n10.G(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (r1.equals(com.stub.StubApp.getString2(18381)) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        if (r1.equals(com.stub.StubApp.getString2(18382)) == false) goto L34;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dump(java.lang.String r8, java.io.FileDescriptor r9, java.io.PrintWriter r10, java.lang.String[] r11) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.AbstractActivityC1027h.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    @Override // android.app.Activity
    public final View findViewById(int i3) {
        v vVar = (v) m();
        vVar.w();
        return vVar.f14671m.findViewById(i3);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        v vVar = (v) m();
        if (vVar.f14680r == null) {
            vVar.A();
            Oc.a aVar = vVar.f14678q;
            vVar.f14680r = new l.h(aVar != null ? aVar.s() : vVar.f14669l);
        }
        return vVar.f14680r;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i3 = b1.f17506a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        m().b();
    }

    public final l m() {
        if (this.f14604B == null) {
            J1.A a3 = l.f14609a;
            this.f14604B = new v(this, null, this, this);
        }
        return this.f14604B;
    }

    public final Oc.a n() {
        v vVar = (v) m();
        vVar.A();
        return vVar.f14678q;
    }

    @Override // d.l, android.app.Activity
    public final void onActivityResult(int i3, int i10, Intent intent) {
        this.f14605w.u();
        super.onActivityResult(i3, i10, intent);
    }

    @Override // d.l, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v vVar = (v) m();
        if (vVar.f14657I && vVar.f14651C) {
            vVar.A();
            Oc.a aVar = vVar.f14678q;
            if (aVar != null) {
                aVar.D();
            }
        }
        C1365u a3 = C1365u.a();
        Context context = vVar.f14669l;
        synchronized (a3) {
            J0 j02 = a3.f17620a;
            synchronized (j02) {
                C1694g c1694g = (C1694g) j02.f17418b.get(context);
                if (c1694g != null) {
                    c1694g.a();
                }
            }
        }
        vVar.f14670l0 = new Configuration(vVar.f14669l.getResources().getConfiguration());
        vVar.m(false, false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // d.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f14606x.e(EnumC0438m.ON_CREATE);
        M m4 = ((C0791v) this.f14605w.f9233b).f13394d;
        m4.f13149H = false;
        m4.f13150I = false;
        m4.f13156O.f13198g = false;
        m4.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C0791v) this.f14605w.f9233b).f13394d.f13163f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        p();
        m().e();
    }

    @Override // d.l, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i3, MenuItem menuItem) {
        Intent a3;
        if (!q(i3, menuItem)) {
            Oc.a n10 = n();
            if (menuItem.getItemId() != 16908332 || n10 == null || (n10.o() & 4) == 0 || (a3 = AbstractC0026c.a(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(a3)) {
                navigateUpTo(a3);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent a9 = AbstractC0026c.a(this);
            if (a9 == null) {
                a9 = AbstractC0026c.a(this);
            }
            if (a9 != null) {
                ComponentName component = a9.getComponent();
                if (component == null) {
                    component = a9.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent b2 = AbstractC0026c.b(this, component);
                    while (b2 != null) {
                        arrayList.add(size, b2);
                        b2 = AbstractC0026c.b(this, b2.getComponent());
                    }
                    arrayList.add(a9);
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.e(StubApp.getString2(18388), StubApp.getString2(18389));
                    throw new IllegalArgumentException(e10);
                }
            }
            if (arrayList.isEmpty()) {
                throw new IllegalStateException(StubApp.getString2(18390));
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            startActivities(intentArr, null);
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f14608z = false;
        ((C0791v) this.f14605w.f9233b).f13394d.u(5);
        this.f14606x.e(EnumC0438m.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((v) m()).w();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        r();
        v vVar = (v) m();
        vVar.A();
        Oc.a aVar = vVar.f14678q;
        if (aVar != null) {
            aVar.P(true);
        }
    }

    @Override // d.l, android.app.Activity
    public final void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        StubApp.interface22(i3, strArr, iArr);
        this.f14605w.u();
        super.onRequestPermissionsResult(i3, strArr, iArr);
    }

    @Override // android.app.Activity
    public final void onResume() {
        C0379a c0379a = this.f14605w;
        c0379a.u();
        super.onResume();
        this.f14608z = true;
        ((C0791v) c0379a.f9233b).f13394d.z(true);
    }

    @Override // android.app.Activity
    public final void onStart() {
        s();
        ((v) m()).m(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f14605w.u();
    }

    @Override // android.app.Activity
    public void onStop() {
        t();
        v vVar = (v) m();
        vVar.A();
        Oc.a aVar = vVar.f14678q;
        if (aVar != null) {
            aVar.P(false);
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i3) {
        super.onTitleChanged(charSequence, i3);
        m().l(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        Oc.a n10 = n();
        if (getWindow().hasFeature(0)) {
            if (n10 == null || !n10.H()) {
                super.openOptionsMenu();
            }
        }
    }

    public final void p() {
        super.onDestroy();
        ((C0791v) this.f14605w.f9233b).f13394d.l();
        this.f14606x.e(EnumC0438m.ON_DESTROY);
    }

    public final boolean q(int i3, MenuItem menuItem) {
        if (super.onMenuItemSelected(i3, menuItem)) {
            return true;
        }
        if (i3 == 6) {
            return ((C0791v) this.f14605w.f9233b).f13394d.j();
        }
        return false;
    }

    public final void r() {
        super.onPostResume();
        this.f14606x.e(EnumC0438m.ON_RESUME);
        M m4 = ((C0791v) this.f14605w.f9233b).f13394d;
        m4.f13149H = false;
        m4.f13150I = false;
        m4.f13156O.f13198g = false;
        m4.u(7);
    }

    public final void s() {
        C0379a c0379a = this.f14605w;
        c0379a.u();
        super.onStart();
        this.f14603A = false;
        boolean z2 = this.f14607y;
        C0791v c0791v = (C0791v) c0379a.f9233b;
        if (!z2) {
            this.f14607y = true;
            M m4 = c0791v.f13394d;
            m4.f13149H = false;
            m4.f13150I = false;
            m4.f13156O.f13198g = false;
            m4.u(4);
        }
        c0791v.f13394d.z(true);
        this.f14606x.e(EnumC0438m.ON_START);
        M m10 = c0791v.f13394d;
        m10.f13149H = false;
        m10.f13150I = false;
        m10.f13156O.f13198g = false;
        m10.u(5);
    }

    @Override // android.app.Activity
    public final void setContentView(int i3) {
        j();
        m().i(i3);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i3) {
        super.setTheme(i3);
        ((v) m()).f14674n0 = i3;
    }

    public final void t() {
        C0379a c0379a;
        C0791v c0791v;
        super.onStop();
        this.f14603A = true;
        do {
            c0379a = this.f14605w;
            c0791v = (C0791v) c0379a.f9233b;
            EnumC0439n enumC0439n = EnumC0439n.f9913a;
        } while (o(c0791v.f13394d));
        M m4 = ((C0791v) c0379a.f9233b).f13394d;
        m4.f13150I = true;
        m4.f13156O.f13198g = true;
        m4.u(4);
        this.f14606x.e(EnumC0438m.ON_STOP);
    }

    @Override // d.l, android.app.Activity
    public void setContentView(View view) {
        j();
        m().j(view);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C0791v) this.f14605w.f9233b).f13394d.f13163f.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j();
        m().k(view, layoutParams);
    }
}
