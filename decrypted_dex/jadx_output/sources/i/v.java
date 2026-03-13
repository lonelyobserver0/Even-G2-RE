package i;

import C.AbstractC0026c;
import N.I;
import N.L;
import Z9.C0366a;
import a0.C0379a;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import ba.AbstractC0534b;
import com.stub.StubApp;
import f4.C0879c;
import f4.C0882f;
import h.AbstractC0997a;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import l.AbstractC1130a;
import l.C1132c;
import n.C1337g;
import n.C1345k;
import n.C1365u;
import n.InterfaceC1338g0;
import n.Z0;
import n.b1;
import t.C1697j;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class v extends l implements m.j, LayoutInflater.Factory2 {

    /* renamed from: B0, reason: collision with root package name */
    public static final C1697j f14645B0 = new C1697j(0);

    /* renamed from: C0, reason: collision with root package name */
    public static final int[] f14646C0 = {R.attr.windowBackground};

    /* renamed from: D0, reason: collision with root package name */
    public static final boolean f14647D0 = !StubApp.getString2(13196).equals(Build.FINGERPRINT);

    /* renamed from: A, reason: collision with root package name */
    public m f14648A;

    /* renamed from: A0, reason: collision with root package name */
    public OnBackInvokedCallback f14649A0;

    /* renamed from: C, reason: collision with root package name */
    public boolean f14651C;

    /* renamed from: D, reason: collision with root package name */
    public ViewGroup f14652D;

    /* renamed from: E, reason: collision with root package name */
    public TextView f14653E;

    /* renamed from: F, reason: collision with root package name */
    public View f14654F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f14655G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f14656H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f14657I;

    /* renamed from: K, reason: collision with root package name */
    public boolean f14658K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f14659L;

    /* renamed from: O, reason: collision with root package name */
    public boolean f14660O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f14661P;

    /* renamed from: R, reason: collision with root package name */
    public boolean f14662R;

    /* renamed from: T, reason: collision with root package name */
    public u[] f14663T;

    /* renamed from: X, reason: collision with root package name */
    public u f14664X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f14665Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f14666Z;
    public boolean h0;

    /* renamed from: k, reason: collision with root package name */
    public final Object f14667k;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f14668k0;

    /* renamed from: l, reason: collision with root package name */
    public final Context f14669l;

    /* renamed from: l0, reason: collision with root package name */
    public Configuration f14670l0;

    /* renamed from: m, reason: collision with root package name */
    public Window f14671m;

    /* renamed from: m0, reason: collision with root package name */
    public final int f14672m0;

    /* renamed from: n, reason: collision with root package name */
    public r f14673n;

    /* renamed from: n0, reason: collision with root package name */
    public int f14674n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f14675o0;

    /* renamed from: p, reason: collision with root package name */
    public final Object f14676p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f14677p0;

    /* renamed from: q, reason: collision with root package name */
    public Oc.a f14678q;

    /* renamed from: q0, reason: collision with root package name */
    public s f14679q0;

    /* renamed from: r, reason: collision with root package name */
    public l.h f14680r;

    /* renamed from: r0, reason: collision with root package name */
    public s f14681r0;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f14682s;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f14683s0;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC1338g0 f14684t;

    /* renamed from: t0, reason: collision with root package name */
    public int f14685t0;

    /* renamed from: v, reason: collision with root package name */
    public C0879c f14687v;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f14688v0;

    /* renamed from: w, reason: collision with root package name */
    public C0366a f14689w;

    /* renamed from: w0, reason: collision with root package name */
    public Rect f14690w0;

    /* renamed from: x, reason: collision with root package name */
    public AbstractC1130a f14691x;

    /* renamed from: x0, reason: collision with root package name */
    public Rect f14692x0;

    /* renamed from: y, reason: collision with root package name */
    public ActionBarContextView f14693y;

    /* renamed from: y0, reason: collision with root package name */
    public y f14694y0;

    /* renamed from: z, reason: collision with root package name */
    public PopupWindow f14695z;

    /* renamed from: z0, reason: collision with root package name */
    public OnBackInvokedDispatcher f14696z0;

    /* renamed from: B, reason: collision with root package name */
    public L f14650B = null;

    /* renamed from: u0, reason: collision with root package name */
    public final m f14686u0 = new m(this, 0);

    public v(Context context, Window window, i iVar, Object obj) {
        AbstractActivityC1027h abstractActivityC1027h = null;
        this.f14672m0 = -100;
        this.f14669l = context;
        this.f14676p = iVar;
        this.f14667k = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof AbstractActivityC1027h)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        abstractActivityC1027h = (AbstractActivityC1027h) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (abstractActivityC1027h != null) {
                this.f14672m0 = ((v) abstractActivityC1027h.m()).f14672m0;
            }
        }
        if (this.f14672m0 == -100) {
            C1697j c1697j = f14645B0;
            Integer num = (Integer) c1697j.get(this.f14667k.getClass().getName());
            if (num != null) {
                this.f14672m0 = num.intValue();
                c1697j.remove(this.f14667k.getClass().getName());
            }
        }
        if (window != null) {
            n(window);
        }
        C1365u.d();
    }

    public static J.e o(Context context) {
        J.e eVar;
        J.e eVar2;
        if (Build.VERSION.SDK_INT >= 33 || (eVar = l.f14611c) == null) {
            return null;
        }
        J.e b2 = p.b(StubApp.getOrigApplicationContext(context.getApplicationContext()).getResources().getConfiguration());
        J.f fVar = eVar.f3256a;
        if (fVar.f3257a.isEmpty()) {
            eVar2 = J.e.f3255b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i3 = 0;
            while (i3 < b2.f3256a.f3257a.size() + fVar.f3257a.size()) {
                Locale locale = i3 < fVar.f3257a.size() ? fVar.f3257a.get(i3) : b2.f3256a.f3257a.get(i3 - fVar.f3257a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i3++;
            }
            eVar2 = new J.e(new J.f(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return eVar2.f3256a.f3257a.isEmpty() ? b2 : eVar2;
    }

    public static Configuration t(Context context, int i3, J.e eVar, Configuration configuration, boolean z2) {
        int i10 = i3 != 1 ? i3 != 2 ? z2 ? 0 : StubApp.getOrigApplicationContext(context.getApplicationContext()).getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i10 | (configuration2.uiMode & (-49));
        if (eVar != null) {
            p.d(configuration2, eVar);
        }
        return configuration2;
    }

    public final void A() {
        w();
        if (this.f14657I && this.f14678q == null) {
            Object obj = this.f14667k;
            if (obj instanceof Activity) {
                this.f14678q = new H((Activity) obj, this.f14658K);
            } else if (obj instanceof Dialog) {
                this.f14678q = new H((Dialog) obj);
            }
            Oc.a aVar = this.f14678q;
            if (aVar != null) {
                aVar.N(this.f14688v0);
            }
        }
    }

    public final void B(int i3) {
        this.f14685t0 = (1 << i3) | this.f14685t0;
        if (this.f14683s0) {
            return;
        }
        View decorView = this.f14671m.getDecorView();
        m mVar = this.f14686u0;
        WeakHashMap weakHashMap = I.f4732a;
        decorView.postOnAnimation(mVar);
        this.f14683s0 = true;
    }

    public final int C(Context context, int i3) {
        if (i3 != -100) {
            if (i3 != -1) {
                if (i3 != 0) {
                    if (i3 != 1 && i3 != 2) {
                        if (i3 != 3) {
                            throw new IllegalStateException(StubApp.getString2(18402));
                        }
                        if (this.f14681r0 == null) {
                            this.f14681r0 = new s(this, context);
                        }
                        return this.f14681r0.g();
                    }
                } else if (((UiModeManager) StubApp.getOrigApplicationContext(context.getApplicationContext()).getSystemService(StubApp.getString2(18403))).getNightMode() != 0) {
                    return y(context).g();
                }
            }
            return i3;
        }
        return -1;
    }

    public final boolean D() {
        boolean z2 = this.f14665Y;
        this.f14665Y = false;
        u z10 = z(0);
        if (!z10.f14641m) {
            AbstractC1130a abstractC1130a = this.f14691x;
            if (abstractC1130a != null) {
                abstractC1130a.a();
                return true;
            }
            A();
            Oc.a aVar = this.f14678q;
            if (aVar == null || !aVar.k()) {
                return false;
            }
        } else if (!z2) {
            s(z10, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x017c, code lost:
    
        if (r3.f16914f.getCount() > 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x015c, code lost:
    
        if (r3 != null) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(i.u r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.v.E(i.u, android.view.KeyEvent):void");
    }

    public final boolean F(u uVar, int i3, KeyEvent keyEvent) {
        m.l lVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((uVar.f14639k || G(uVar, keyEvent)) && (lVar = uVar.f14637h) != null) {
            return lVar.performShortcut(i3, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d5, code lost:
    
        if (r13.f14637h == null) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean G(i.u r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.v.G(i.u, android.view.KeyEvent):boolean");
    }

    public final void H() {
        if (this.f14651C) {
            throw new AndroidRuntimeException(StubApp.getString2(18404));
        }
    }

    public final void I() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z2 = false;
            if (this.f14696z0 != null && (z(0).f14641m || this.f14691x != null)) {
                z2 = true;
            }
            if (z2 && this.f14649A0 == null) {
                this.f14649A0 = q.b(this.f14696z0, this);
            } else {
                if (z2 || (onBackInvokedCallback = this.f14649A0) == null) {
                    return;
                }
                q.c(this.f14696z0, onBackInvokedCallback);
                this.f14649A0 = null;
            }
        }
    }

    @Override // i.l
    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.f14669l);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof v) {
                return;
            }
            Log.i(StubApp.getString2(18392), StubApp.getString2(18405));
        }
    }

    @Override // i.l
    public final void b() {
        if (this.f14678q != null) {
            A();
            if (this.f14678q.v()) {
                return;
            }
            B(0);
        }
    }

    @Override // i.l
    public final void d() {
        String str;
        this.f14666Z = true;
        m(false, true);
        x();
        Object obj = this.f14667k;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = AbstractC0026c.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new IllegalArgumentException(e10);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                Oc.a aVar = this.f14678q;
                if (aVar == null) {
                    this.f14688v0 = true;
                } else {
                    aVar.N(true);
                }
            }
            synchronized (l.f14616h) {
                l.f(this);
                l.f14615g.add(new WeakReference(this));
            }
        }
        this.f14670l0 = new Configuration(this.f14669l.getResources().getConfiguration());
        this.h0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // i.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f14667k
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = i.l.f14616h
            monitor-enter(r0)
            i.l.f(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.f14683s0
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f14671m
            android.view.View r0 = r0.getDecorView()
            i.m r1 = r3.f14686u0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.f14668k0 = r0
            int r0 = r3.f14672m0
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.f14667k
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            t.j r0 = i.v.f14645B0
            java.lang.Object r1 = r3.f14667k
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f14672m0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            t.j r0 = i.v.f14645B0
            java.lang.Object r1 = r3.f14667k
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            Oc.a r0 = r3.f14678q
            if (r0 == 0) goto L63
            r0.E()
        L63:
            i.s r0 = r3.f14679q0
            if (r0 == 0) goto L6a
            r0.d()
        L6a:
            i.s r0 = r3.f14681r0
            if (r0 == 0) goto L71
            r0.d()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.v.e():void");
    }

    @Override // i.l
    public final boolean g(int i3) {
        String string2 = StubApp.getString2(18392);
        if (i3 == 8) {
            Log.i(string2, StubApp.getString2(18406));
            i3 = 108;
        } else if (i3 == 9) {
            Log.i(string2, StubApp.getString2(18407));
            i3 = 109;
        }
        if (this.f14661P && i3 == 108) {
            return false;
        }
        if (this.f14657I && i3 == 1) {
            this.f14657I = false;
        }
        if (i3 == 1) {
            H();
            this.f14661P = true;
            return true;
        }
        if (i3 == 2) {
            H();
            this.f14655G = true;
            return true;
        }
        if (i3 == 5) {
            H();
            this.f14656H = true;
            return true;
        }
        if (i3 == 10) {
            H();
            this.f14659L = true;
            return true;
        }
        if (i3 == 108) {
            H();
            this.f14657I = true;
            return true;
        }
        if (i3 != 109) {
            return this.f14671m.requestFeature(i3);
        }
        H();
        this.f14658K = true;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.k() != false) goto L20;
     */
    @Override // m.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(m.l r6) {
        /*
            r5 = this;
            n.g0 r6 = r5.f14684t
            r0 = 1
            r1 = 0
            if (r6 == 0) goto Ld3
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.k()
            n.h0 r6 = r6.f9456e
            n.Z0 r6 = (n.Z0) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f17488a
            int r2 = r6.getVisibility()
            if (r2 != 0) goto Ld3
            androidx.appcompat.widget.ActionMenuView r6 = r6.f9576a
            if (r6 == 0) goto Ld3
            boolean r6 = r6.f9481v
            if (r6 == 0) goto Ld3
            android.content.Context r6 = r5.f14669l
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            boolean r6 = r6.hasPermanentMenuKey()
            if (r6 == 0) goto L4a
            n.g0 r6 = r5.f14684t
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.k()
            n.h0 r6 = r6.f9456e
            n.Z0 r6 = (n.Z0) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f17488a
            androidx.appcompat.widget.ActionMenuView r6 = r6.f9576a
            if (r6 == 0) goto Ld3
            n.k r6 = r6.f9482w
            if (r6 == 0) goto Ld3
            n.i r2 = r6.f17551x
            if (r2 != 0) goto L4a
            boolean r6 = r6.k()
            if (r6 == 0) goto Ld3
        L4a:
            android.view.Window r6 = r5.f14671m
            android.view.Window$Callback r6 = r6.getCallback()
            n.g0 r2 = r5.f14684t
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = (androidx.appcompat.widget.ActionBarOverlayLayout) r2
            r2.k()
            n.h0 r2 = r2.f9456e
            n.Z0 r2 = (n.Z0) r2
            androidx.appcompat.widget.Toolbar r2 = r2.f17488a
            boolean r2 = r2.o()
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 == 0) goto L8c
            n.g0 r0 = r5.f14684t
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.k()
            n.h0 r0 = r0.f9456e
            n.Z0 r0 = (n.Z0) r0
            androidx.appcompat.widget.Toolbar r0 = r0.f17488a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f9576a
            if (r0 == 0) goto L7e
            n.k r0 = r0.f9482w
            if (r0 == 0) goto L7e
            boolean r0 = r0.g()
        L7e:
            boolean r0 = r5.f14668k0
            if (r0 != 0) goto Ld2
            i.u r0 = r5.z(r1)
            m.l r0 = r0.f14637h
            r6.onPanelClosed(r3, r0)
            return
        L8c:
            if (r6 == 0) goto Ld2
            boolean r2 = r5.f14668k0
            if (r2 != 0) goto Ld2
            boolean r2 = r5.f14683s0
            if (r2 == 0) goto La9
            int r2 = r5.f14685t0
            r0 = r0 & r2
            if (r0 == 0) goto La9
            android.view.Window r0 = r5.f14671m
            android.view.View r0 = r0.getDecorView()
            i.m r2 = r5.f14686u0
            r0.removeCallbacks(r2)
            r2.run()
        La9:
            i.u r0 = r5.z(r1)
            m.l r2 = r0.f14637h
            if (r2 == 0) goto Ld2
            boolean r4 = r0.f14643o
            if (r4 != 0) goto Ld2
            android.view.View r4 = r0.f14636g
            boolean r1 = r6.onPreparePanel(r1, r4, r2)
            if (r1 == 0) goto Ld2
            m.l r0 = r0.f14637h
            r6.onMenuOpened(r3, r0)
            n.g0 r6 = r5.f14684t
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.k()
            n.h0 r6 = r6.f9456e
            n.Z0 r6 = (n.Z0) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f17488a
            r6.u()
        Ld2:
            return
        Ld3:
            i.u r6 = r5.z(r1)
            r6.f14642n = r0
            r5.s(r6, r1)
            r0 = 0
            r5.E(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.v.h(m.l):void");
    }

    @Override // i.l
    public final void i(int i3) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.f14652D.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f14669l).inflate(i3, viewGroup);
        this.f14673n.a(this.f14671m.getCallback());
    }

    @Override // i.l
    public final void j(View view) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.f14652D.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f14673n.a(this.f14671m.getCallback());
    }

    @Override // i.l
    public final void k(View view, ViewGroup.LayoutParams layoutParams) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.f14652D.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f14673n.a(this.f14671m.getCallback());
    }

    @Override // i.l
    public final void l(CharSequence charSequence) {
        this.f14682s = charSequence;
        InterfaceC1338g0 interfaceC1338g0 = this.f14684t;
        if (interfaceC1338g0 != null) {
            interfaceC1338g0.setWindowTitle(charSequence);
            return;
        }
        Oc.a aVar = this.f14678q;
        if (aVar != null) {
            aVar.Q(charSequence);
            return;
        }
        TextView textView = this.f14653E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ee A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(boolean r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.v.m(boolean, boolean):boolean");
    }

    public final void n(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        Window window2 = this.f14671m;
        String string2 = StubApp.getString2(18409);
        if (window2 != null) {
            throw new IllegalStateException(string2);
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof r) {
            throw new IllegalStateException(string2);
        }
        r rVar = new r(this, callback);
        this.f14673n = rVar;
        window.setCallback(rVar);
        int[] iArr = f14646C0;
        Context context = this.f14669l;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            C1365u a3 = C1365u.a();
            synchronized (a3) {
                drawable = a3.f17620a.d(context, resourceId, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.f14671m = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f14696z0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f14649A0) != null) {
            q.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f14649A0 = null;
        }
        Object obj = this.f14667k;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f14696z0 = q.a(activity);
                I();
            }
        }
        this.f14696z0 = null;
        I();
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (this.f14694y0 == null) {
            int[] iArr = AbstractC0997a.j;
            Context context2 = this.f14669l;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = obtainStyledAttributes.getString(116);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.f14694y0 = new y();
            } else {
                try {
                    this.f14694y0 = (y) context2.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i(StubApp.getString2(18392), StubApp.getString2(18410) + string + StubApp.getString2(18411), th);
                    this.f14694y0 = new y();
                }
            }
        }
        y yVar = this.f14694y0;
        int i3 = b1.f17506a;
        return yVar.createView(view, str, context, attributeSet, false, false, true, false);
    }

    public final void p(int i3, u uVar, m.l lVar) {
        if (lVar == null) {
            if (uVar == null && i3 >= 0) {
                u[] uVarArr = this.f14663T;
                if (i3 < uVarArr.length) {
                    uVar = uVarArr[i3];
                }
            }
            if (uVar != null) {
                lVar = uVar.f14637h;
            }
        }
        if ((uVar == null || uVar.f14641m) && !this.f14668k0) {
            r rVar = this.f14673n;
            Window.Callback callback = this.f14671m.getCallback();
            rVar.getClass();
            try {
                rVar.f14625e = true;
                callback.onPanelClosed(i3, lVar);
            } finally {
                rVar.f14625e = false;
            }
        }
    }

    @Override // m.j
    public final boolean q(m.l lVar, MenuItem menuItem) {
        u uVar;
        Window.Callback callback = this.f14671m.getCallback();
        if (callback != null && !this.f14668k0) {
            m.l k3 = lVar.k();
            u[] uVarArr = this.f14663T;
            int length = uVarArr != null ? uVarArr.length : 0;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    uVar = uVarArr[i3];
                    if (uVar != null && uVar.f14637h == k3) {
                        break;
                    }
                    i3++;
                } else {
                    uVar = null;
                    break;
                }
            }
            if (uVar != null) {
                return callback.onMenuItemSelected(uVar.f14630a, menuItem);
            }
        }
        return false;
    }

    public final void r(m.l lVar) {
        C1345k c1345k;
        if (this.f14662R) {
            return;
        }
        this.f14662R = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f14684t;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((Z0) actionBarOverlayLayout.f9456e).f17488a.f9576a;
        if (actionMenuView != null && (c1345k = actionMenuView.f9482w) != null) {
            c1345k.g();
            C1337g c1337g = c1345k.f17550w;
            if (c1337g != null && c1337g.b()) {
                c1337g.f16996i.dismiss();
            }
        }
        Window.Callback callback = this.f14671m.getCallback();
        if (callback != null && !this.f14668k0) {
            callback.onPanelClosed(108, lVar);
        }
        this.f14662R = false;
    }

    public final void s(u uVar, boolean z2) {
        t tVar;
        InterfaceC1338g0 interfaceC1338g0;
        if (z2 && uVar.f14630a == 0 && (interfaceC1338g0 = this.f14684t) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1338g0;
            actionBarOverlayLayout.k();
            if (((Z0) actionBarOverlayLayout.f9456e).f17488a.o()) {
                r(uVar.f14637h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f14669l.getSystemService(StubApp.getString2(526));
        if (windowManager != null && uVar.f14641m && (tVar = uVar.f14634e) != null) {
            windowManager.removeView(tVar);
            if (z2) {
                p(uVar.f14630a, uVar, null);
            }
        }
        uVar.f14639k = false;
        uVar.f14640l = false;
        uVar.f14641m = false;
        uVar.f14635f = null;
        uVar.f14642n = true;
        if (this.f14664X == uVar) {
            this.f14664X = null;
        }
        if (uVar.f14630a == 0) {
            I();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        if (r4.dispatchKeyEvent(r7) != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ea, code lost:
    
        if (r7.g() != false) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean u(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.v.u(android.view.KeyEvent):boolean");
    }

    public final void v(int i3) {
        u z2 = z(i3);
        if (z2.f14637h != null) {
            Bundle bundle = new Bundle();
            z2.f14637h.t(bundle);
            if (bundle.size() > 0) {
                z2.f14644p = bundle;
            }
            z2.f14637h.w();
            z2.f14637h.clear();
        }
        z2.f14643o = true;
        z2.f14642n = true;
        if ((i3 == 108 || i3 == 0) && this.f14684t != null) {
            u z10 = z(0);
            z10.f14639k = false;
            G(z10, null);
        }
    }

    public final void w() {
        ViewGroup viewGroup;
        if (this.f14651C) {
            return;
        }
        int[] iArr = AbstractC0997a.j;
        Context context = this.f14669l;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException(StubApp.getString2(18421));
        }
        if (obtainStyledAttributes.getBoolean(126, false)) {
            g(1);
        } else if (obtainStyledAttributes.getBoolean(117, false)) {
            g(108);
        }
        if (obtainStyledAttributes.getBoolean(118, false)) {
            g(109);
        }
        if (obtainStyledAttributes.getBoolean(119, false)) {
            g(10);
        }
        this.f14660O = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        x();
        this.f14671m.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.f14661P) {
            viewGroup = this.f14659L ? (ViewGroup) from.inflate(2131427350, (ViewGroup) null) : (ViewGroup) from.inflate(2131427349, (ViewGroup) null);
        } else if (this.f14660O) {
            viewGroup = (ViewGroup) from.inflate(2131427340, (ViewGroup) null);
            this.f14658K = false;
            this.f14657I = false;
        } else if (this.f14657I) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(2130903049, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C1132c(context, typedValue.resourceId) : context).inflate(2131427351, (ViewGroup) null);
            InterfaceC1338g0 interfaceC1338g0 = (InterfaceC1338g0) viewGroup.findViewById(2131230842);
            this.f14684t = interfaceC1338g0;
            interfaceC1338g0.setWindowCallback(this.f14671m.getCallback());
            if (this.f14658K) {
                ((ActionBarOverlayLayout) this.f14684t).j(109);
            }
            if (this.f14655G) {
                ((ActionBarOverlayLayout) this.f14684t).j(2);
            }
            if (this.f14656H) {
                ((ActionBarOverlayLayout) this.f14684t).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException(StubApp.getString2(18416) + this.f14657I + StubApp.getString2(18417) + this.f14658K + StubApp.getString2(18418) + this.f14660O + StubApp.getString2(18419) + this.f14659L + StubApp.getString2(18420) + this.f14661P + StubApp.getString2(9385));
        }
        C0882f c0882f = new C0882f(this, 3);
        WeakHashMap weakHashMap = I.f4732a;
        N.B.l(viewGroup, c0882f);
        if (this.f14684t == null) {
            this.f14653E = (TextView) viewGroup.findViewById(2131231133);
        }
        String string2 = StubApp.getString2(18413);
        String string22 = StubApp.getString2(17475);
        try {
            Method method = viewGroup.getClass().getMethod(StubApp.getString2("18414"), new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, new Object[0]);
        } catch (IllegalAccessException e10) {
            Log.d(string22, string2, e10);
        } catch (NoSuchMethodException unused) {
            Log.d(string22, StubApp.getString2(18415));
        } catch (InvocationTargetException e11) {
            Log.d(string22, string2, e11);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(2131230765);
        ViewGroup viewGroup2 = (ViewGroup) this.f14671m.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f14671m.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C0379a(this, 9));
        this.f14652D = viewGroup;
        Object obj = this.f14667k;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f14682s;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC1338g0 interfaceC1338g02 = this.f14684t;
            if (interfaceC1338g02 != null) {
                interfaceC1338g02.setWindowTitle(title);
            } else {
                Oc.a aVar = this.f14678q;
                if (aVar != null) {
                    aVar.Q(title);
                } else {
                    TextView textView = this.f14653E;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f14652D.findViewById(R.id.content);
        View decorView = this.f14671m.getDecorView();
        contentFrameLayout2.f9499g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (obtainStyledAttributes2.hasValue(122)) {
            obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (obtainStyledAttributes2.hasValue(123)) {
            obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (obtainStyledAttributes2.hasValue(120)) {
            obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (obtainStyledAttributes2.hasValue(121)) {
            obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f14651C = true;
        u z2 = z(0);
        if (this.f14668k0 || z2.f14637h != null) {
            return;
        }
        B(108);
    }

    public final void x() {
        if (this.f14671m == null) {
            Object obj = this.f14667k;
            if (obj instanceof Activity) {
                n(((Activity) obj).getWindow());
            }
        }
        if (this.f14671m == null) {
            throw new IllegalStateException(StubApp.getString2(18422));
        }
    }

    public final AbstractC0534b y(Context context) {
        if (this.f14679q0 == null) {
            if (a5.c.f9279e == null) {
                Context origApplicationContext = StubApp.getOrigApplicationContext(context.getApplicationContext());
                a5.c.f9279e = new a5.c(origApplicationContext, (LocationManager) origApplicationContext.getSystemService(StubApp.getString2(662)));
            }
            this.f14679q0 = new s(this, a5.c.f9279e);
        }
        return this.f14679q0;
    }

    public final u z(int i3) {
        u[] uVarArr = this.f14663T;
        if (uVarArr == null || uVarArr.length <= i3) {
            u[] uVarArr2 = new u[i3 + 1];
            if (uVarArr != null) {
                System.arraycopy(uVarArr, 0, uVarArr2, 0, uVarArr.length);
            }
            this.f14663T = uVarArr2;
            uVarArr = uVarArr2;
        }
        u uVar = uVarArr[i3];
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u();
        uVar2.f14630a = i3;
        uVar2.f14642n = false;
        uVarArr[i3] = uVar2;
        return uVar2;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
