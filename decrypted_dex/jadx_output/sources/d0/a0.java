package d0;

import android.util.Log;
import android.view.ViewGroup;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public c0 f13257a;

    /* renamed from: b, reason: collision with root package name */
    public b0 f13258b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0789t f13259c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f13260d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13261e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13262f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13263g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f13264h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f13265i;
    public final ArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f13266k;

    /* renamed from: l, reason: collision with root package name */
    public final U f13267l;

    public a0(c0 finalState, b0 lifecycleImpact, U fragmentStateManager) {
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        String string2 = StubApp.getString2(16627);
        AbstractComponentCallbacksC0789t fragment = fragmentStateManager.f13216c;
        Intrinsics.checkNotNullExpressionValue(fragment, string2);
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f13257a = finalState;
        this.f13258b = lifecycleImpact;
        this.f13259c = fragment;
        this.f13260d = new ArrayList();
        this.f13265i = true;
        ArrayList arrayList = new ArrayList();
        this.j = arrayList;
        this.f13266k = arrayList;
        this.f13267l = fragmentStateManager;
    }

    public final void a(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f13264h = false;
        if (this.f13261e) {
            return;
        }
        this.f13261e = true;
        if (this.j.isEmpty()) {
            b();
            return;
        }
        for (Z z2 : CollectionsKt.toList(this.f13266k)) {
            z2.getClass();
            Intrinsics.checkNotNullParameter(container, "container");
            if (!z2.f13239b) {
                z2.a(container);
            }
            z2.f13239b = true;
        }
    }

    public final void b() {
        this.f13264h = false;
        if (!this.f13262f) {
            if (M.J(2)) {
                Log.v(StubApp.getString2(49), StubApp.getString2(16628) + this + StubApp.getString2(16629));
            }
            this.f13262f = true;
            Iterator it = this.f13260d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f13259c.f13378n = false;
        this.f13267l.k();
    }

    public final void c(Z effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        ArrayList arrayList = this.j;
        if (arrayList.remove(effect) && arrayList.isEmpty()) {
            b();
        }
    }

    public final void d(c0 finalState, b0 lifecycleImpact) {
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
        int ordinal = lifecycleImpact.ordinal();
        c0 c0Var = c0.f13287a;
        String string2 = StubApp.getString2(16630);
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = this.f13259c;
        String string22 = StubApp.getString2(16631);
        String string23 = StubApp.getString2(49);
        if (ordinal == 0) {
            if (this.f13257a != c0Var) {
                if (M.J(2)) {
                    Log.v(string23, string22 + abstractComponentCallbacksC0789t + string2 + this.f13257a + StubApp.getString2(438) + finalState + '.');
                }
                this.f13257a = finalState;
                return;
            }
            return;
        }
        if (ordinal == 1) {
            if (this.f13257a == c0Var) {
                if (M.J(2)) {
                    Log.v(string23, string22 + abstractComponentCallbacksC0789t + StubApp.getString2(16634) + this.f13258b + StubApp.getString2(16635));
                }
                this.f13257a = c0.f13288b;
                this.f13258b = b0.f13282b;
                this.f13265i = true;
                return;
            }
            return;
        }
        if (ordinal != 2) {
            return;
        }
        if (M.J(2)) {
            Log.v(string23, string22 + abstractComponentCallbacksC0789t + string2 + this.f13257a + StubApp.getString2(16632) + this.f13258b + StubApp.getString2(16633));
        }
        this.f13257a = c0Var;
        this.f13258b = b0.f13283c;
        this.f13265i = true;
    }

    public final String toString() {
        StringBuilder l9 = com.mapbox.common.b.l(StubApp.getString2(16636), Integer.toHexString(System.identityHashCode(this)), StubApp.getString2(16637));
        l9.append(this.f13257a);
        l9.append(StubApp.getString2(16638));
        l9.append(this.f13258b);
        l9.append(StubApp.getString2(16639));
        l9.append(this.f13259c);
        l9.append('}');
        return l9.toString();
    }
}
