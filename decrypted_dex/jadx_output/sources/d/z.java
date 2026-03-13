package d;

import Xa.C0362b;
import android.os.Build;
import android.util.Log;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.stub.StubApp;
import d0.AbstractComponentCallbacksC0789t;
import d0.C0766D;
import d0.C0771a;
import d0.M;
import d0.V;
import d0.e0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f13116a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f13117b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public C0766D f13118c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f13119d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f13120e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13121f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13122g;

    public z(Runnable runnable) {
        OnBackInvokedCallback c0362b;
        this.f13116a = runnable;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            if (i3 >= 34) {
                t onBackStarted = new t(this, 0);
                t onBackProgressed = new t(this, 1);
                u onBackInvoked = new u(this, 0);
                u onBackCancelled = new u(this, 1);
                Intrinsics.checkNotNullParameter(onBackStarted, "onBackStarted");
                Intrinsics.checkNotNullParameter(onBackProgressed, "onBackProgressed");
                Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
                Intrinsics.checkNotNullParameter(onBackCancelled, "onBackCancelled");
                c0362b = new v(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
            } else {
                u onBackInvoked2 = new u(this, 2);
                Intrinsics.checkNotNullParameter(onBackInvoked2, "onBackInvoked");
                c0362b = new C0362b(onBackInvoked2, 1);
            }
            this.f13119d = c0362b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void a() {
        C0766D c0766d;
        C0766D c0766d2 = this.f13118c;
        if (c0766d2 == null) {
            ArrayDeque arrayDeque = this.f13117b;
            ListIterator listIterator = arrayDeque.listIterator(arrayDeque.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    c0766d = 0;
                    break;
                } else {
                    c0766d = listIterator.previous();
                    if (((C0766D) c0766d).f13128a) {
                        break;
                    }
                }
            }
            c0766d2 = c0766d;
        }
        this.f13118c = null;
        if (c0766d2 != null) {
            c0766d2.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final void b() {
        C0766D c0766d;
        C0766D c0766d2 = this.f13118c;
        if (c0766d2 == null) {
            ArrayDeque arrayDeque = this.f13117b;
            ListIterator listIterator = arrayDeque.listIterator(arrayDeque.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    c0766d = 0;
                    break;
                } else {
                    c0766d = listIterator.previous();
                    if (((C0766D) c0766d).f13128a) {
                        break;
                    }
                }
            }
            c0766d2 = c0766d;
        }
        this.f13118c = null;
        if (c0766d2 == null) {
            this.f13116a.run();
            return;
        }
        boolean J10 = M.J(3);
        M m4 = c0766d2.f13131d;
        String string2 = StubApp.getString2(49);
        if (J10) {
            Log.d(string2, StubApp.getString2(16443) + m4);
        }
        m4.z(true);
        C0771a c0771a = m4.f13165h;
        C0766D c0766d3 = m4.f13166i;
        if (c0771a == null) {
            if (c0766d3.f13128a) {
                if (M.J(3)) {
                    Log.d(string2, StubApp.getString2(16448));
                }
                m4.Q();
                return;
            } else {
                if (M.J(3)) {
                    Log.d(string2, StubApp.getString2(16449));
                }
                m4.f13164g.b();
                return;
            }
        }
        ArrayList arrayList = m4.f13170n;
        if (!arrayList.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(M.E(m4.f13165h));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                Iterator it2 = linkedHashSet.iterator();
                if (it2.hasNext()) {
                    throw null;
                }
            }
        }
        Iterator it3 = m4.f13165h.f13240a.iterator();
        while (it3.hasNext()) {
            AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = ((V) it3.next()).f13220b;
            if (abstractComponentCallbacksC0789t != null) {
                abstractComponentCallbacksC0789t.f13378n = false;
            }
        }
        Iterator it4 = m4.f(new ArrayList(Collections.singletonList(m4.f13165h)), 0, 1).iterator();
        while (it4.hasNext()) {
            e0 e0Var = (e0) it4.next();
            e0Var.getClass();
            if (M.J(3)) {
                Log.d(string2, StubApp.getString2(16444));
            }
            ArrayList arrayList2 = e0Var.f13300c;
            e0Var.n(arrayList2);
            e0Var.c(arrayList2);
        }
        m4.f13165h = null;
        m4.f0();
        if (M.J(3)) {
            Log.d(string2, StubApp.getString2(16445));
            Log.d(string2, StubApp.getString2(16446) + c0766d3.f13128a + StubApp.getString2(16447) + m4);
        }
    }

    public final void c(boolean z2) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f13120e;
        OnBackInvokedCallback onBackInvokedCallback = this.f13119d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z2 && !this.f13121f) {
            J.b.e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f13121f = true;
        } else {
            if (z2 || !this.f13121f) {
                return;
            }
            J.b.f(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f13121f = false;
        }
    }

    public final void d() {
        boolean z2 = this.f13122g;
        boolean z10 = false;
        ArrayDeque arrayDeque = this.f13117b;
        if (arrayDeque == null || !arrayDeque.isEmpty()) {
            Iterator<E> it = arrayDeque.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((C0766D) it.next()).f13128a) {
                    z10 = true;
                    break;
                }
            }
        }
        this.f13122g = z10;
        if (z10 == z2 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        c(z10);
    }
}
