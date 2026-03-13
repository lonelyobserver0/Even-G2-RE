package d0;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0446v;
import androidx.lifecycle.EnumC0439n;
import androidx.lifecycle.InterfaceC0434i;
import androidx.lifecycle.InterfaceC0444t;
import com.stub.StubApp;
import i.AbstractActivityC1027h;
import i0.C1028a;
import i0.C1031d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import k0.C1102a;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import l4.E0;
import p0.AbstractC1482f;
import t.C1698k;

/* renamed from: d0.t, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractComponentCallbacksC0789t implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0444t, androidx.lifecycle.W, InterfaceC0434i, M1.e {

    /* renamed from: n0, reason: collision with root package name */
    public static final Object f13345n0 = new Object();

    /* renamed from: A, reason: collision with root package name */
    public int f13346A;

    /* renamed from: B, reason: collision with root package name */
    public String f13347B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f13348C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f13349D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f13350E;

    /* renamed from: G, reason: collision with root package name */
    public boolean f13352G;

    /* renamed from: H, reason: collision with root package name */
    public ViewGroup f13353H;

    /* renamed from: I, reason: collision with root package name */
    public View f13354I;

    /* renamed from: K, reason: collision with root package name */
    public boolean f13355K;

    /* renamed from: O, reason: collision with root package name */
    public C0788s f13357O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f13358P;

    /* renamed from: R, reason: collision with root package name */
    public boolean f13359R;

    /* renamed from: T, reason: collision with root package name */
    public String f13360T;

    /* renamed from: X, reason: collision with root package name */
    public EnumC0439n f13361X;

    /* renamed from: Y, reason: collision with root package name */
    public C0446v f13362Y;

    /* renamed from: Z, reason: collision with root package name */
    public W f13363Z;

    /* renamed from: b, reason: collision with root package name */
    public Bundle f13365b;

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f13366c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f13367d;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f13369f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractComponentCallbacksC0789t f13370g;
    public final androidx.lifecycle.z h0;
    public int j;

    /* renamed from: k0, reason: collision with root package name */
    public Z9.C f13373k0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f13374l;

    /* renamed from: l0, reason: collision with root package name */
    public final ArrayList f13375l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f13376m;

    /* renamed from: m0, reason: collision with root package name */
    public final C0787q f13377m0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f13378n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f13379p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f13380q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f13381r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f13382s;

    /* renamed from: t, reason: collision with root package name */
    public int f13383t;

    /* renamed from: v, reason: collision with root package name */
    public M f13384v;

    /* renamed from: w, reason: collision with root package name */
    public C0791v f13385w;

    /* renamed from: y, reason: collision with root package name */
    public AbstractComponentCallbacksC0789t f13387y;

    /* renamed from: z, reason: collision with root package name */
    public int f13388z;

    /* renamed from: a, reason: collision with root package name */
    public int f13364a = -1;

    /* renamed from: e, reason: collision with root package name */
    public String f13368e = UUID.randomUUID().toString();

    /* renamed from: h, reason: collision with root package name */
    public String f13371h = null;

    /* renamed from: k, reason: collision with root package name */
    public Boolean f13372k = null;

    /* renamed from: x, reason: collision with root package name */
    public M f13386x = new M();

    /* renamed from: F, reason: collision with root package name */
    public final boolean f13351F = true;

    /* renamed from: L, reason: collision with root package name */
    public boolean f13356L = true;

    public AbstractComponentCallbacksC0789t() {
        new L9.n(this, 28);
        this.f13361X = EnumC0439n.f9917e;
        this.h0 = new androidx.lifecycle.z();
        new AtomicInteger();
        this.f13375l0 = new ArrayList();
        this.f13377m0 = new C0787q(this);
        p();
    }

    public void A() {
        this.f13352G = true;
    }

    public LayoutInflater B(Bundle bundle) {
        C0791v c0791v = this.f13385w;
        if (c0791v == null) {
            throw new IllegalStateException(StubApp.getString2(16751));
        }
        AbstractActivityC1027h abstractActivityC1027h = c0791v.f13395e;
        LayoutInflater cloneInContext = abstractActivityC1027h.getLayoutInflater().cloneInContext(abstractActivityC1027h);
        cloneInContext.setFactory2(this.f13386x.f13163f);
        return cloneInContext;
    }

    public void C() {
        this.f13352G = true;
    }

    public abstract void D(Bundle bundle);

    public void E() {
        this.f13352G = true;
    }

    public void F() {
        this.f13352G = true;
    }

    public void G(Bundle bundle) {
        this.f13352G = true;
    }

    public void H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f13386x.P();
        this.f13382s = true;
        this.f13363Z = new W(this, e(), new B0.o(this, 21));
        View x7 = x(layoutInflater, viewGroup);
        this.f13354I = x7;
        if (x7 == null) {
            if (this.f13363Z.f13231d != null) {
                throw new IllegalStateException(StubApp.getString2(16753));
            }
            this.f13363Z = null;
            return;
        }
        this.f13363Z.c();
        if (M.J(3)) {
            Log.d(StubApp.getString2(49), StubApp.getString2(16752) + this.f13354I + StubApp.getString2(16601) + this);
        }
        androidx.lifecycle.L.e(this.f13354I, this.f13363Z);
        View view = this.f13354I;
        W w10 = this.f13363Z;
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(2131231166, w10);
        View view2 = this.f13354I;
        W w11 = this.f13363Z;
        Intrinsics.checkNotNullParameter(view2, "<this>");
        view2.setTag(2131231165, w11);
        this.h0.f(this.f13363Z);
    }

    public final Context I() {
        Context m4 = m();
        if (m4 != null) {
            return m4;
        }
        throw new IllegalStateException(StubApp.getString2(16452) + this + StubApp.getString2(16754));
    }

    public final View J() {
        View view = this.f13354I;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(StubApp.getString2(16452) + this + StubApp.getString2(16755));
    }

    public final void K(int i3, int i10, int i11, int i12) {
        if (this.f13357O == null && i3 == 0 && i10 == 0 && i11 == 0 && i12 == 0) {
            return;
        }
        k().f13336b = i3;
        k().f13337c = i10;
        k().f13338d = i11;
        k().f13339e = i12;
    }

    public final void L(Bundle bundle) {
        M m4 = this.f13384v;
        if (m4 != null && (m4.f13149H || m4.f13150I)) {
            throw new IllegalStateException(StubApp.getString2(16756));
        }
        this.f13369f = bundle;
    }

    @Override // androidx.lifecycle.InterfaceC0434i
    public final C1031d d() {
        Application application;
        Context origApplicationContext = StubApp.getOrigApplicationContext(I().getApplicationContext());
        while (true) {
            if (!(origApplicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (origApplicationContext instanceof Application) {
                application = (Application) origApplicationContext;
                break;
            }
            origApplicationContext = ((ContextWrapper) origApplicationContext).getBaseContext();
        }
        if (application == null && M.J(3)) {
            Log.d(StubApp.getString2(49), StubApp.getString2(16757) + StubApp.getOrigApplicationContext(I().getApplicationContext()) + StubApp.getString2(16758));
        }
        C1031d c1031d = new C1031d(0);
        if (application != null) {
            c1031d.b(androidx.lifecycle.T.f9898f, application);
        }
        c1031d.b(androidx.lifecycle.L.f9880a, this);
        c1031d.b(androidx.lifecycle.L.f9881b, this);
        Bundle bundle = this.f13369f;
        if (bundle != null) {
            c1031d.b(androidx.lifecycle.L.f9882c, bundle);
        }
        return c1031d;
    }

    @Override // androidx.lifecycle.W
    public final androidx.lifecycle.V e() {
        if (this.f13384v == null) {
            throw new IllegalStateException(StubApp.getString2(16760));
        }
        int n10 = n();
        EnumC0439n enumC0439n = EnumC0439n.f9913a;
        if (n10 == 1) {
            throw new IllegalStateException(StubApp.getString2(16759));
        }
        HashMap hashMap = this.f13384v.f13156O.f13195d;
        androidx.lifecycle.V v2 = (androidx.lifecycle.V) hashMap.get(this.f13368e);
        if (v2 != null) {
            return v2;
        }
        androidx.lifecycle.V v8 = new androidx.lifecycle.V();
        hashMap.put(this.f13368e, v8);
        return v8;
    }

    @Override // M1.e
    public final E0 f() {
        return (E0) this.f13373k0.f9078c;
    }

    public AbstractC0793x h() {
        return new r(this);
    }

    @Override // androidx.lifecycle.InterfaceC0444t
    public final C0446v i() {
        return this.f13362Y;
    }

    public void j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        printWriter.print(str);
        printWriter.print(StubApp.getString2(16761));
        printWriter.print(Integer.toHexString(this.f13388z));
        printWriter.print(StubApp.getString2(16762));
        printWriter.print(Integer.toHexString(this.f13346A));
        printWriter.print(StubApp.getString2(16763));
        printWriter.println(this.f13347B);
        printWriter.print(str);
        printWriter.print(StubApp.getString2(16764));
        printWriter.print(this.f13364a);
        printWriter.print(StubApp.getString2(16765));
        printWriter.print(this.f13368e);
        printWriter.print(StubApp.getString2(16766));
        printWriter.println(this.f13383t);
        printWriter.print(str);
        printWriter.print(StubApp.getString2(16767));
        printWriter.print(this.f13374l);
        printWriter.print(StubApp.getString2(16768));
        printWriter.print(this.f13376m);
        printWriter.print(StubApp.getString2(16769));
        printWriter.print(this.f13379p);
        printWriter.print(StubApp.getString2(16770));
        printWriter.println(this.f13380q);
        printWriter.print(str);
        printWriter.print(StubApp.getString2(16771));
        printWriter.print(this.f13348C);
        printWriter.print(StubApp.getString2(16772));
        printWriter.print(this.f13349D);
        printWriter.print(StubApp.getString2(16773));
        printWriter.print(this.f13351F);
        printWriter.print(StubApp.getString2(16774));
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print(StubApp.getString2(16775));
        printWriter.print(this.f13350E);
        printWriter.print(StubApp.getString2(16776));
        printWriter.println(this.f13356L);
        if (this.f13384v != null) {
            printWriter.print(str);
            printWriter.print(StubApp.getString2(16777));
            printWriter.println(this.f13384v);
        }
        if (this.f13385w != null) {
            printWriter.print(str);
            printWriter.print(StubApp.getString2(16778));
            printWriter.println(this.f13385w);
        }
        if (this.f13387y != null) {
            printWriter.print(str);
            printWriter.print(StubApp.getString2(16779));
            printWriter.println(this.f13387y);
        }
        if (this.f13369f != null) {
            printWriter.print(str);
            printWriter.print(StubApp.getString2(16780));
            printWriter.println(this.f13369f);
        }
        if (this.f13365b != null) {
            printWriter.print(str);
            printWriter.print(StubApp.getString2(16781));
            printWriter.println(this.f13365b);
        }
        if (this.f13366c != null) {
            printWriter.print(str);
            printWriter.print(StubApp.getString2(16782));
            printWriter.println(this.f13366c);
        }
        if (this.f13367d != null) {
            printWriter.print(str);
            printWriter.print(StubApp.getString2(16783));
            printWriter.println(this.f13367d);
        }
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = this.f13370g;
        if (abstractComponentCallbacksC0789t == null) {
            M m4 = this.f13384v;
            abstractComponentCallbacksC0789t = (m4 == null || (str2 = this.f13371h) == null) ? null : m4.f13160c.y(str2);
        }
        if (abstractComponentCallbacksC0789t != null) {
            printWriter.print(str);
            printWriter.print(StubApp.getString2(16784));
            printWriter.print(abstractComponentCallbacksC0789t);
            printWriter.print(StubApp.getString2(16785));
            printWriter.println(this.j);
        }
        printWriter.print(str);
        printWriter.print(StubApp.getString2(16786));
        C0788s c0788s = this.f13357O;
        printWriter.println(c0788s == null ? false : c0788s.f13335a);
        C0788s c0788s2 = this.f13357O;
        if ((c0788s2 == null ? 0 : c0788s2.f13336b) != 0) {
            printWriter.print(str);
            printWriter.print(StubApp.getString2(16787));
            C0788s c0788s3 = this.f13357O;
            printWriter.println(c0788s3 == null ? 0 : c0788s3.f13336b);
        }
        C0788s c0788s4 = this.f13357O;
        if ((c0788s4 == null ? 0 : c0788s4.f13337c) != 0) {
            printWriter.print(str);
            printWriter.print(StubApp.getString2(16788));
            C0788s c0788s5 = this.f13357O;
            printWriter.println(c0788s5 == null ? 0 : c0788s5.f13337c);
        }
        C0788s c0788s6 = this.f13357O;
        if ((c0788s6 == null ? 0 : c0788s6.f13338d) != 0) {
            printWriter.print(str);
            printWriter.print(StubApp.getString2(16789));
            C0788s c0788s7 = this.f13357O;
            printWriter.println(c0788s7 == null ? 0 : c0788s7.f13338d);
        }
        C0788s c0788s8 = this.f13357O;
        if ((c0788s8 == null ? 0 : c0788s8.f13339e) != 0) {
            printWriter.print(str);
            printWriter.print(StubApp.getString2(16790));
            C0788s c0788s9 = this.f13357O;
            printWriter.println(c0788s9 == null ? 0 : c0788s9.f13339e);
        }
        if (this.f13353H != null) {
            printWriter.print(str);
            printWriter.print(StubApp.getString2(16791));
            printWriter.println(this.f13353H);
        }
        if (this.f13354I != null) {
            printWriter.print(str);
            printWriter.print(StubApp.getString2(16792));
            printWriter.println(this.f13354I);
        }
        if (m() != null) {
            androidx.lifecycle.V store = e();
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
                printWriter.print(str);
                printWriter.println(StubApp.getString2(16793));
                if (c1698k.f21043c > 0) {
                    if (c1698k.f21042b[0] != null) {
                        throw new ClassCastException();
                    }
                    printWriter.print(str);
                    printWriter.print(StubApp.getString2(16535));
                    printWriter.print(c1698k.f21041a[0]);
                    printWriter.print(StubApp.getString2(994));
                    throw null;
                }
            }
        }
        printWriter.print(str);
        printWriter.println(StubApp.getString2(16794) + this.f13386x + StubApp.getString2(478));
        this.f13386x.v(AbstractC1482f.g(str, StubApp.getString2(6127)), fileDescriptor, printWriter, strArr);
    }

    public final C0788s k() {
        if (this.f13357O == null) {
            C0788s c0788s = new C0788s();
            Object obj = f13345n0;
            c0788s.f13341g = obj;
            c0788s.f13342h = obj;
            c0788s.f13343i = obj;
            c0788s.j = 1.0f;
            c0788s.f13344k = null;
            this.f13357O = c0788s;
        }
        return this.f13357O;
    }

    public final M l() {
        if (this.f13385w != null) {
            return this.f13386x;
        }
        throw new IllegalStateException(StubApp.getString2(16452) + this + StubApp.getString2(16795));
    }

    public final Context m() {
        C0791v c0791v = this.f13385w;
        if (c0791v == null) {
            return null;
        }
        return c0791v.f13392b;
    }

    public final int n() {
        EnumC0439n enumC0439n = this.f13361X;
        return (enumC0439n == EnumC0439n.f9914b || this.f13387y == null) ? enumC0439n.ordinal() : Math.min(enumC0439n.ordinal(), this.f13387y.n());
    }

    public final M o() {
        M m4 = this.f13384v;
        if (m4 != null) {
            return m4;
        }
        throw new IllegalStateException(StubApp.getString2(16452) + this + StubApp.getString2(16796));
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f13352G = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C0791v c0791v = this.f13385w;
        AbstractActivityC1027h abstractActivityC1027h = c0791v == null ? null : c0791v.f13391a;
        if (abstractActivityC1027h != null) {
            abstractActivityC1027h.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException(StubApp.getString2(16452) + this + StubApp.getString2(16797));
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f13352G = true;
    }

    public final void p() {
        this.f13362Y = new C0446v(this);
        Intrinsics.checkNotNullParameter(this, "owner");
        this.f13373k0 = new Z9.C(new C2.c(this, new J2.d(this, 1)));
        ArrayList arrayList = this.f13375l0;
        C0787q c0787q = this.f13377m0;
        if (arrayList.contains(c0787q)) {
            return;
        }
        if (this.f13364a < 0) {
            arrayList.add(c0787q);
            return;
        }
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = c0787q.f13333a;
        ((C2.c) abstractComponentCallbacksC0789t.f13373k0.f9077b).a();
        androidx.lifecycle.L.c(abstractComponentCallbacksC0789t);
        Bundle bundle = abstractComponentCallbacksC0789t.f13365b;
        abstractComponentCallbacksC0789t.f13373k0.v(bundle != null ? bundle.getBundle(StubApp.getString2(16498)) : null);
    }

    public final void q() {
        p();
        this.f13360T = this.f13368e;
        this.f13368e = UUID.randomUUID().toString();
        this.f13374l = false;
        this.f13376m = false;
        this.f13379p = false;
        this.f13380q = false;
        this.f13381r = false;
        this.f13383t = 0;
        this.f13384v = null;
        this.f13386x = new M();
        this.f13385w = null;
        this.f13388z = 0;
        this.f13346A = 0;
        this.f13347B = null;
        this.f13348C = false;
        this.f13349D = false;
    }

    public final boolean r() {
        if (this.f13348C) {
            return true;
        }
        M m4 = this.f13384v;
        if (m4 != null) {
            AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = this.f13387y;
            m4.getClass();
            if (abstractComponentCallbacksC0789t == null ? false : abstractComponentCallbacksC0789t.r()) {
                return true;
            }
        }
        return false;
    }

    public final boolean s() {
        return this.f13383t > 0;
    }

    public final void startActivityForResult(Intent intent, int i3) {
        if (this.f13385w == null) {
            throw new IllegalStateException(StubApp.getString2(16452) + this + StubApp.getString2(16799));
        }
        M o5 = o();
        if (o5.f13144C != null) {
            String str = this.f13368e;
            I i10 = new I();
            i10.f13137a = str;
            i10.f13138b = i3;
            o5.f13147F.addLast(i10);
            o5.f13144C.a(intent);
            return;
        }
        C0791v c0791v = o5.f13179w;
        c0791v.getClass();
        Intrinsics.checkNotNullParameter(this, "fragment");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (i3 != -1) {
            throw new IllegalStateException(StubApp.getString2(16798));
        }
        c0791v.f13392b.startActivity(intent, null);
    }

    public void t() {
        this.f13352G = true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append(StubApp.getString2(1352));
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(StubApp.getString2(16800));
        sb2.append(this.f13368e);
        if (this.f13388z != 0) {
            sb2.append(StubApp.getString2(16567));
            sb2.append(Integer.toHexString(this.f13388z));
        }
        if (this.f13347B != null) {
            sb2.append(StubApp.getString2(16568));
            sb2.append(this.f13347B);
        }
        sb2.append(StubApp.getString2(74));
        return sb2.toString();
    }

    public void u(int i3, int i10, Intent intent) {
        if (M.J(2)) {
            Log.v(StubApp.getString2(49), StubApp.getString2(16452) + this + StubApp.getString2(16801) + i3 + StubApp.getString2(16802) + i10 + StubApp.getString2(16803) + intent);
        }
    }

    public void v(AbstractActivityC1027h abstractActivityC1027h) {
        this.f13352G = true;
        C0791v c0791v = this.f13385w;
        if ((c0791v == null ? null : c0791v.f13391a) != null) {
            this.f13352G = true;
        }
    }

    public void w(Bundle bundle) {
        Bundle bundle2;
        this.f13352G = true;
        Bundle bundle3 = this.f13365b;
        if (bundle3 != null && (bundle2 = bundle3.getBundle(StubApp.getString2(16499))) != null) {
            this.f13386x.V(bundle2);
            M m4 = this.f13386x;
            m4.f13149H = false;
            m4.f13150I = false;
            m4.f13156O.f13198g = false;
            m4.u(1);
        }
        M m10 = this.f13386x;
        if (m10.f13178v >= 1) {
            return;
        }
        m10.f13149H = false;
        m10.f13150I = false;
        m10.f13156O.f13198g = false;
        m10.u(1);
    }

    public View x(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void y() {
        this.f13352G = true;
    }

    public void z() {
        this.f13352G = true;
    }
}
