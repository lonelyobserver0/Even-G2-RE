package d0;

import android.util.Log;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class P extends androidx.lifecycle.S {

    /* renamed from: h, reason: collision with root package name */
    public static final O f13192h = new O(0);

    /* renamed from: e, reason: collision with root package name */
    public final boolean f13196e;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f13193b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f13194c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f13195d = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public boolean f13197f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13198g = false;

    public P(boolean z2) {
        this.f13196e = z2;
    }

    @Override // androidx.lifecycle.S
    public final void b() {
        if (M.J(3)) {
            Log.d(StubApp.getString2(49), StubApp.getString2(16555) + this);
        }
        this.f13197f = true;
    }

    public final void c(AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t, boolean z2) {
        if (M.J(3)) {
            Log.d(StubApp.getString2(49), StubApp.getString2(16556) + abstractComponentCallbacksC0789t);
        }
        e(abstractComponentCallbacksC0789t.f13368e, z2);
    }

    public final void d(String str, boolean z2) {
        if (M.J(3)) {
            Log.d(StubApp.getString2(49), StubApp.getString2(16557) + str);
        }
        e(str, z2);
    }

    public final void e(String str, boolean z2) {
        HashMap hashMap = this.f13194c;
        P p8 = (P) hashMap.get(str);
        if (p8 != null) {
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(p8.f13194c.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    p8.d((String) it.next(), true);
                }
            }
            p8.b();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.f13195d;
        androidx.lifecycle.V v2 = (androidx.lifecycle.V) hashMap2.get(str);
        if (v2 != null) {
            v2.a();
            hashMap2.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && P.class == obj.getClass()) {
            P p8 = (P) obj;
            if (this.f13193b.equals(p8.f13193b) && this.f13194c.equals(p8.f13194c) && this.f13195d.equals(p8.f13195d)) {
                return true;
            }
        }
        return false;
    }

    public final void f(AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t) {
        boolean z2 = this.f13198g;
        String string2 = StubApp.getString2(49);
        if (z2) {
            if (M.J(2)) {
                Log.v(string2, StubApp.getString2(16558));
            }
        } else {
            if (this.f13193b.remove(abstractComponentCallbacksC0789t.f13368e) == null || !M.J(2)) {
                return;
            }
            Log.v(string2, StubApp.getString2(16559) + abstractComponentCallbacksC0789t);
        }
    }

    public final int hashCode() {
        return this.f13195d.hashCode() + ((this.f13194c.hashCode() + (this.f13193b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        String string2;
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(16560));
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(StubApp.getString2(16561));
        Iterator it = this.f13193b.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            string2 = StubApp.getString2(81);
            if (!hasNext) {
                break;
            }
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(string2);
            }
        }
        sb2.append(StubApp.getString2(16562));
        Iterator it2 = this.f13194c.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append((String) it2.next());
            if (it2.hasNext()) {
                sb2.append(string2);
            }
        }
        sb2.append(StubApp.getString2(16563));
        Iterator it3 = this.f13195d.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append((String) it3.next());
            if (it3.hasNext()) {
                sb2.append(string2);
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
