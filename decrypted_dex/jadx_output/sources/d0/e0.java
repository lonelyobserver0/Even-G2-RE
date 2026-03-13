package d0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import cb.C0585c;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f13298a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f13299b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f13300c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13301d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13302e;

    public e0(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f13298a = container;
        this.f13299b = new ArrayList();
        this.f13300c = new ArrayList();
    }

    public static final e0 m(ViewGroup container, M fragmentManager) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        C0585c factory = fragmentManager.H();
        Intrinsics.checkNotNullExpressionValue(factory, "fragmentManager.specialEffectsControllerFactory");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Object tag = container.getTag(2131231072);
        if (tag instanceof e0) {
            return (e0) tag;
        }
        factory.getClass();
        Intrinsics.checkNotNullParameter(container, "container");
        C0782l c0782l = new C0782l(container);
        Intrinsics.checkNotNullExpressionValue(c0782l, "factory.createController(container)");
        container.setTag(2131231072, c0782l);
        return c0782l;
    }

    public final void a(a0 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (operation.f13265i) {
            c0 c0Var = operation.f13257a;
            View J10 = operation.f13259c.J();
            Intrinsics.checkNotNullExpressionValue(J10, "operation.fragment.requireView()");
            c0Var.a(J10, this.f13298a);
            operation.f13265i = false;
        }
    }

    public abstract void b(List list, boolean z2);

    public final void c(List operations) {
        Set set;
        Intrinsics.checkNotNullParameter(operations, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = operations.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, ((a0) it.next()).f13266k);
        }
        set = CollectionsKt___CollectionsKt.toSet(arrayList);
        List list = CollectionsKt.toList(set);
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((Z) list.get(i3)).b(this.f13298a);
        }
        int size2 = operations.size();
        for (int i10 = 0; i10 < size2; i10++) {
            a((a0) operations.get(i10));
        }
        List list2 = CollectionsKt.toList(operations);
        int size3 = list2.size();
        for (int i11 = 0; i11 < size3; i11++) {
            a0 a0Var = (a0) list2.get(i11);
            if (a0Var.f13266k.isEmpty()) {
                a0Var.b();
            }
        }
    }

    public final void d(c0 c0Var, b0 b0Var, U u2) {
        synchronized (this.f13299b) {
            try {
                AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = u2.f13216c;
                Intrinsics.checkNotNullExpressionValue(abstractComponentCallbacksC0789t, "fragmentStateManager.fragment");
                a0 j = j(abstractComponentCallbacksC0789t);
                if (j == null) {
                    AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t2 = u2.f13216c;
                    if (abstractComponentCallbacksC0789t2.f13378n) {
                        Intrinsics.checkNotNullExpressionValue(abstractComponentCallbacksC0789t2, "fragmentStateManager.fragment");
                        j = k(abstractComponentCallbacksC0789t2);
                    } else {
                        j = null;
                    }
                }
                if (j != null) {
                    j.d(c0Var, b0Var);
                    return;
                }
                final a0 a0Var = new a0(c0Var, b0Var, u2);
                this.f13299b.add(a0Var);
                final int i3 = 0;
                Runnable listener = new Runnable(this) { // from class: d0.Y

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e0 f13236b;

                    {
                        this.f13236b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                e0 this$0 = this.f13236b;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                a0 operation = a0Var;
                                Intrinsics.checkNotNullParameter(operation, "$operation");
                                if (this$0.f13299b.contains(operation)) {
                                    c0 c0Var2 = operation.f13257a;
                                    View view = operation.f13259c.f13354I;
                                    Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
                                    c0Var2.a(view, this$0.f13298a);
                                    break;
                                }
                                break;
                            default:
                                e0 this$02 = this.f13236b;
                                Intrinsics.checkNotNullParameter(this$02, "this$0");
                                a0 operation2 = a0Var;
                                Intrinsics.checkNotNullParameter(operation2, "$operation");
                                this$02.f13299b.remove(operation2);
                                this$02.f13300c.remove(operation2);
                                break;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(listener, "listener");
                a0Var.f13260d.add(listener);
                final int i10 = 1;
                Runnable listener2 = new Runnable(this) { // from class: d0.Y

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e0 f13236b;

                    {
                        this.f13236b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                e0 this$0 = this.f13236b;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                a0 operation = a0Var;
                                Intrinsics.checkNotNullParameter(operation, "$operation");
                                if (this$0.f13299b.contains(operation)) {
                                    c0 c0Var2 = operation.f13257a;
                                    View view = operation.f13259c.f13354I;
                                    Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
                                    c0Var2.a(view, this$0.f13298a);
                                    break;
                                }
                                break;
                            default:
                                e0 this$02 = this.f13236b;
                                Intrinsics.checkNotNullParameter(this$02, "this$0");
                                a0 operation2 = a0Var;
                                Intrinsics.checkNotNullParameter(operation2, "$operation");
                                this$02.f13299b.remove(operation2);
                                this$02.f13300c.remove(operation2);
                                break;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(listener2, "listener");
                a0Var.f13260d.add(listener2);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(c0 finalState, U fragmentStateManager) {
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (M.J(2)) {
            Log.v(StubApp.getString2(49), StubApp.getString2(16700) + fragmentStateManager.f13216c);
        }
        d(finalState, b0.f13282b, fragmentStateManager);
    }

    public final void f(U fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (M.J(2)) {
            Log.v(StubApp.getString2(49), StubApp.getString2(16701) + fragmentStateManager.f13216c);
        }
        d(c0.f13289c, b0.f13281a, fragmentStateManager);
    }

    public final void g(U fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (M.J(2)) {
            Log.v(StubApp.getString2(49), StubApp.getString2(16702) + fragmentStateManager.f13216c);
        }
        d(c0.f13287a, b0.f13283c, fragmentStateManager);
    }

    public final void h(U fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (M.J(2)) {
            Log.v(StubApp.getString2(49), StubApp.getString2(16703) + fragmentStateManager.f13216c);
        }
        d(c0.f13288b, b0.f13281a, fragmentStateManager);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x019a A[Catch: all -> 0x006a, TryCatch #0 {all -> 0x006a, blocks: (B:12:0x0018, B:14:0x0021, B:15:0x0030, B:17:0x0036, B:19:0x0042, B:20:0x006d, B:23:0x007f, B:26:0x0083, B:30:0x007c, B:32:0x01cf, B:36:0x0089, B:37:0x0098, B:39:0x009e, B:41:0x00aa, B:42:0x00c8, B:45:0x00df, B:48:0x00e3, B:53:0x00da, B:54:0x00dc, B:56:0x00e9, B:60:0x00fa, B:62:0x010a, B:63:0x0119, B:64:0x012a, B:66:0x0130, B:68:0x013e, B:70:0x0142, B:74:0x0164, B:81:0x0149, B:82:0x014d, B:84:0x0153, B:92:0x016e, B:94:0x0172, B:95:0x017b, B:97:0x0181, B:99:0x018d, B:102:0x0196, B:104:0x019a, B:105:0x01b8, B:107:0x01c0, B:109:0x01a3, B:111:0x01ad), top: B:11:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c0 A[Catch: all -> 0x006a, TryCatch #0 {all -> 0x006a, blocks: (B:12:0x0018, B:14:0x0021, B:15:0x0030, B:17:0x0036, B:19:0x0042, B:20:0x006d, B:23:0x007f, B:26:0x0083, B:30:0x007c, B:32:0x01cf, B:36:0x0089, B:37:0x0098, B:39:0x009e, B:41:0x00aa, B:42:0x00c8, B:45:0x00df, B:48:0x00e3, B:53:0x00da, B:54:0x00dc, B:56:0x00e9, B:60:0x00fa, B:62:0x010a, B:63:0x0119, B:64:0x012a, B:66:0x0130, B:68:0x013e, B:70:0x0142, B:74:0x0164, B:81:0x0149, B:82:0x014d, B:84:0x0153, B:92:0x016e, B:94:0x0172, B:95:0x017b, B:97:0x0181, B:99:0x018d, B:102:0x0196, B:104:0x019a, B:105:0x01b8, B:107:0x01c0, B:109:0x01a3, B:111:0x01ad), top: B:11:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.e0.i():void");
    }

    public final a0 j(AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t) {
        Object obj;
        Iterator it = this.f13299b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            a0 a0Var = (a0) obj;
            if (Intrinsics.areEqual(a0Var.f13259c, abstractComponentCallbacksC0789t) && !a0Var.f13261e) {
                break;
            }
        }
        return (a0) obj;
    }

    public final a0 k(AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t) {
        Object obj;
        Iterator it = this.f13300c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            a0 a0Var = (a0) obj;
            if (Intrinsics.areEqual(a0Var.f13259c, abstractComponentCallbacksC0789t) && !a0Var.f13261e) {
                break;
            }
        }
        return (a0) obj;
    }

    public final void l() {
        if (M.J(2)) {
            Log.v(StubApp.getString2(49), StubApp.getString2(16708));
        }
        boolean isAttachedToWindow = this.f13298a.isAttachedToWindow();
        synchronized (this.f13299b) {
            try {
                o();
                n(this.f13299b);
                for (a0 a0Var : CollectionsKt.toMutableList((Collection) this.f13300c)) {
                    if (M.J(2)) {
                        Log.v(StubApp.getString2("49"), StubApp.getString2("16628") + (isAttachedToWindow ? "" : StubApp.getString2("16709") + this.f13298a + StubApp.getString2("16710")) + StubApp.getString2("16711") + a0Var);
                    }
                    a0Var.a(this.f13298a);
                }
                for (a0 a0Var2 : CollectionsKt.toMutableList((Collection) this.f13299b)) {
                    if (M.J(2)) {
                        Log.v(StubApp.getString2("49"), StubApp.getString2("16628") + (isAttachedToWindow ? "" : StubApp.getString2("16709") + this.f13298a + StubApp.getString2("16710")) + StubApp.getString2("16712") + a0Var2);
                    }
                    a0Var2.a(this.f13298a);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n(List list) {
        Set set;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            a0 a0Var = (a0) list.get(i3);
            if (!a0Var.f13264h) {
                a0Var.f13264h = true;
                b0 b0Var = a0Var.f13258b;
                b0 b0Var2 = b0.f13282b;
                String string2 = StubApp.getString2(16601);
                String string22 = StubApp.getString2(49);
                String string23 = StubApp.getString2(16627);
                U u2 = a0Var.f13267l;
                if (b0Var == b0Var2) {
                    AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = u2.f13216c;
                    Intrinsics.checkNotNullExpressionValue(abstractComponentCallbacksC0789t, string23);
                    View findFocus = abstractComponentCallbacksC0789t.f13354I.findFocus();
                    if (findFocus != null) {
                        abstractComponentCallbacksC0789t.k().f13344k = findFocus;
                        if (M.J(2)) {
                            Log.v(string22, StubApp.getString2(16600) + findFocus + string2 + abstractComponentCallbacksC0789t);
                        }
                    }
                    View J10 = a0Var.f13259c.J();
                    Intrinsics.checkNotNullExpressionValue(J10, "this.fragment.requireView()");
                    if (J10.getParent() == null) {
                        u2.b();
                        J10.setAlpha(0.0f);
                    }
                    if (J10.getAlpha() == 0.0f && J10.getVisibility() == 0) {
                        J10.setVisibility(4);
                    }
                    C0788s c0788s = abstractComponentCallbacksC0789t.f13357O;
                    J10.setAlpha(c0788s == null ? 1.0f : c0788s.j);
                } else if (b0Var == b0.f13283c) {
                    AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t2 = u2.f13216c;
                    Intrinsics.checkNotNullExpressionValue(abstractComponentCallbacksC0789t2, string23);
                    View J11 = abstractComponentCallbacksC0789t2.J();
                    Intrinsics.checkNotNullExpressionValue(J11, "fragment.requireView()");
                    if (M.J(2)) {
                        Log.v(string22, StubApp.getString2(16713) + J11.findFocus() + StubApp.getString2(16714) + J11 + string2 + abstractComponentCallbacksC0789t2);
                    }
                    J11.clearFocus();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, ((a0) it.next()).f13266k);
        }
        set = CollectionsKt___CollectionsKt.toSet(arrayList);
        List list2 = CollectionsKt.toList(set);
        int size2 = list2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            Z z2 = (Z) list2.get(i10);
            z2.getClass();
            ViewGroup container = this.f13298a;
            Intrinsics.checkNotNullParameter(container, "container");
            if (!z2.f13238a) {
                z2.d(container);
            }
            z2.f13238a = true;
        }
    }

    public final void o() {
        c0 c0Var;
        Iterator it = this.f13299b.iterator();
        while (it.hasNext()) {
            a0 a0Var = (a0) it.next();
            if (a0Var.f13258b == b0.f13282b) {
                View J10 = a0Var.f13259c.J();
                Intrinsics.checkNotNullExpressionValue(J10, "fragment.requireView()");
                int visibility = J10.getVisibility();
                if (visibility == 0) {
                    c0Var = c0.f13288b;
                } else if (visibility == 4) {
                    c0Var = c0.f13290d;
                } else {
                    if (visibility != 8) {
                        throw new IllegalArgumentException(i2.u.p(visibility, StubApp.getString2(16478)));
                    }
                    c0Var = c0.f13289c;
                }
                a0Var.d(c0Var, b0.f13281a);
            }
        }
    }
}
