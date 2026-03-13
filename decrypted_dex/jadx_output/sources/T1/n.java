package T1;

import N.B;
import N.I;
import android.animation.Animator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.jvm.internal.LongCompanionObject;
import p0.AbstractC1482f;
import t.AbstractC1695h;
import t.C1692e;
import t.C1694g;
import u.AbstractC1769a;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class n implements Cloneable {

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f7119v = {2, 1, 3, 4};

    /* renamed from: w, reason: collision with root package name */
    public static final C2.i f7120w = new C2.i();

    /* renamed from: x, reason: collision with root package name */
    public static final ThreadLocal f7121x = new ThreadLocal();

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f7130k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f7131l;

    /* renamed from: a, reason: collision with root package name */
    public final String f7122a = getClass().getName();

    /* renamed from: b, reason: collision with root package name */
    public long f7123b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f7124c = -1;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f7125d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f7126e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public p2.h f7127f = new p2.h(5);

    /* renamed from: g, reason: collision with root package name */
    public p2.h f7128g = new p2.h(5);

    /* renamed from: h, reason: collision with root package name */
    public a f7129h = null;
    public final int[] j = f7119v;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f7132m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public int f7133n = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7134p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7135q = false;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f7136r = null;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f7137s = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public C2.i f7138t = f7120w;

    public static void b(p2.h hVar, View view, s sVar) {
        ((C1692e) hVar.f19671a).put(view, sVar);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) hVar.f19672b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = I.f4732a;
        String f10 = B.f(view);
        if (f10 != null) {
            C1692e c1692e = (C1692e) hVar.f19674d;
            if (c1692e.containsKey(f10)) {
                c1692e.put(f10, null);
            } else {
                c1692e.put(f10, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C1694g c1694g = (C1694g) hVar.f19673c;
                if (c1694g.f21026a) {
                    int i3 = c1694g.f21029d;
                    long[] jArr = c1694g.f21027b;
                    Object[] objArr = c1694g.f21028c;
                    int i10 = 0;
                    for (int i11 = 0; i11 < i3; i11++) {
                        Object obj = objArr[i11];
                        if (obj != AbstractC1695h.f21030a) {
                            if (i11 != i10) {
                                jArr[i10] = jArr[i11];
                                objArr[i10] = obj;
                                objArr[i11] = null;
                            }
                            i10++;
                        }
                    }
                    c1694g.f21026a = false;
                    c1694g.f21029d = i10;
                }
                if (AbstractC1769a.b(c1694g.f21027b, c1694g.f21029d, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c1694g.d(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) c1694g.b(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    c1694g.d(itemIdAtPosition, null);
                }
            }
        }
    }

    public static C1692e o() {
        ThreadLocal threadLocal = f7121x;
        C1692e c1692e = (C1692e) threadLocal.get();
        if (c1692e != null) {
            return c1692e;
        }
        C1692e c1692e2 = new C1692e(0);
        threadLocal.set(c1692e2);
        return c1692e2;
    }

    public static boolean t(s sVar, s sVar2, String str) {
        Object obj = sVar.f7146a.get(str);
        Object obj2 = sVar2.f7146a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A() {
    }

    public void B(C2.i iVar) {
        if (iVar == null) {
            this.f7138t = f7120w;
        } else {
            this.f7138t = iVar;
        }
    }

    public void C() {
    }

    public void D(long j) {
        this.f7123b = j;
    }

    public final void E() {
        if (this.f7133n == 0) {
            ArrayList arrayList = this.f7136r;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f7136r.clone();
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((m) arrayList2.get(i3)).c(this);
                }
            }
            this.f7135q = false;
        }
        this.f7133n++;
    }

    public String F(String str) {
        StringBuilder b2 = AbstractC1856e.b(str);
        b2.append(getClass().getSimpleName());
        b2.append(StubApp.getString2(893));
        b2.append(Integer.toHexString(hashCode()));
        b2.append(StubApp.getString2(994));
        String sb2 = b2.toString();
        long j = this.f7124c;
        String string2 = StubApp.getString2(3046);
        if (j != -1) {
            sb2 = Xa.h.q(AbstractC1482f.n(sb2, StubApp.getString2(6140)), this.f7124c, string2);
        }
        if (this.f7123b != -1) {
            sb2 = Xa.h.q(AbstractC1482f.n(sb2, StubApp.getString2(6141)), this.f7123b, string2);
        }
        ArrayList arrayList = this.f7125d;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f7126e;
        if (size <= 0 && arrayList2.size() <= 0) {
            return sb2;
        }
        String g10 = AbstractC1482f.g(sb2, StubApp.getString2(6142));
        int size2 = arrayList.size();
        String string22 = StubApp.getString2(81);
        if (size2 > 0) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (i3 > 0) {
                    g10 = AbstractC1482f.g(g10, string22);
                }
                StringBuilder b10 = AbstractC1856e.b(g10);
                b10.append(arrayList.get(i3));
                g10 = b10.toString();
            }
        }
        if (arrayList2.size() > 0) {
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                if (i10 > 0) {
                    g10 = AbstractC1482f.g(g10, string22);
                }
                StringBuilder b11 = AbstractC1856e.b(g10);
                b11.append(arrayList2.get(i10));
                g10 = b11.toString();
            }
        }
        return AbstractC1482f.g(g10, StubApp.getString2(74));
    }

    public void a(m mVar) {
        if (this.f7136r == null) {
            this.f7136r = new ArrayList();
        }
        this.f7136r.add(mVar);
    }

    public void c() {
        ArrayList arrayList = this.f7132m;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Animator) arrayList.get(size)).cancel();
        }
        ArrayList arrayList2 = this.f7136r;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        ArrayList arrayList3 = (ArrayList) this.f7136r.clone();
        int size2 = arrayList3.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((m) arrayList3.get(i3)).b();
        }
    }

    public abstract void d(s sVar);

    public final void e(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            s sVar = new s(view);
            if (z2) {
                g(sVar);
            } else {
                d(sVar);
            }
            sVar.f7148c.add(this);
            f(sVar);
            if (z2) {
                b(this.f7127f, view, sVar);
            } else {
                b(this.f7128g, view, sVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                e(viewGroup.getChildAt(i3), z2);
            }
        }
    }

    public void f(s sVar) {
    }

    public abstract void g(s sVar);

    public final void h(ViewGroup viewGroup, boolean z2) {
        i(z2);
        ArrayList arrayList = this.f7125d;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f7126e;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z2);
            return;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i3)).intValue());
            if (findViewById != null) {
                s sVar = new s(findViewById);
                if (z2) {
                    g(sVar);
                } else {
                    d(sVar);
                }
                sVar.f7148c.add(this);
                f(sVar);
                if (z2) {
                    b(this.f7127f, findViewById, sVar);
                } else {
                    b(this.f7128g, findViewById, sVar);
                }
            }
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            View view = (View) arrayList2.get(i10);
            s sVar2 = new s(view);
            if (z2) {
                g(sVar2);
            } else {
                d(sVar2);
            }
            sVar2.f7148c.add(this);
            f(sVar2);
            if (z2) {
                b(this.f7127f, view, sVar2);
            } else {
                b(this.f7128g, view, sVar2);
            }
        }
    }

    public final void i(boolean z2) {
        if (z2) {
            ((C1692e) this.f7127f.f19671a).clear();
            ((SparseArray) this.f7127f.f19672b).clear();
            ((C1694g) this.f7127f.f19673c).a();
        } else {
            ((C1692e) this.f7128g.f19671a).clear();
            ((SparseArray) this.f7128g.f19672b).clear();
            ((C1694g) this.f7128g.f19673c).a();
        }
    }

    @Override // 
    /* renamed from: j */
    public n clone() {
        try {
            n nVar = (n) super.clone();
            nVar.f7137s = new ArrayList();
            nVar.f7127f = new p2.h(5);
            nVar.f7128g = new p2.h(5);
            nVar.f7130k = null;
            nVar.f7131l = null;
            return nVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator k(ViewGroup viewGroup, s sVar, s sVar2) {
        return null;
    }

    public void l(ViewGroup viewGroup, p2.h hVar, p2.h hVar2, ArrayList arrayList, ArrayList arrayList2) {
        Animator k3;
        int i3;
        int i10;
        View view;
        s sVar;
        Animator animator;
        s sVar2;
        C1692e o5 = o();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            s sVar3 = (s) arrayList.get(i11);
            s sVar4 = (s) arrayList2.get(i11);
            if (sVar3 != null && !sVar3.f7148c.contains(this)) {
                sVar3 = null;
            }
            if (sVar4 != null && !sVar4.f7148c.contains(this)) {
                sVar4 = null;
            }
            if (!(sVar3 == null && sVar4 == null) && ((sVar3 == null || sVar4 == null || r(sVar3, sVar4)) && (k3 = k(viewGroup, sVar3, sVar4)) != null)) {
                String str = this.f7122a;
                if (sVar4 != null) {
                    String[] p8 = p();
                    view = sVar4.f7147b;
                    if (p8 != null && p8.length > 0) {
                        sVar2 = new s(view);
                        s sVar5 = (s) ((C1692e) hVar2.f19671a).get(view);
                        i3 = size;
                        if (sVar5 != null) {
                            int i12 = 0;
                            while (i12 < p8.length) {
                                HashMap hashMap = sVar2.f7146a;
                                int i13 = i11;
                                String str2 = p8[i12];
                                hashMap.put(str2, sVar5.f7146a.get(str2));
                                i12++;
                                i11 = i13;
                            }
                        }
                        i10 = i11;
                        int i14 = o5.f21040c;
                        int i15 = 0;
                        while (true) {
                            if (i15 >= i14) {
                                animator = k3;
                                break;
                            }
                            l lVar = (l) o5.get((Animator) o5.f(i15));
                            if (lVar.f7116c != null && lVar.f7114a == view && lVar.f7115b.equals(str) && lVar.f7116c.equals(sVar2)) {
                                animator = null;
                                break;
                            }
                            i15++;
                        }
                    } else {
                        i3 = size;
                        i10 = i11;
                        animator = k3;
                        sVar2 = null;
                    }
                    k3 = animator;
                    sVar = sVar2;
                } else {
                    i3 = size;
                    i10 = i11;
                    view = sVar3.f7147b;
                    sVar = null;
                }
                if (k3 != null) {
                    u uVar = t.f7149a;
                    z zVar = new z(viewGroup);
                    l lVar2 = new l();
                    lVar2.f7114a = view;
                    lVar2.f7115b = str;
                    lVar2.f7116c = sVar;
                    lVar2.f7117d = zVar;
                    lVar2.f7118e = this;
                    o5.put(k3, lVar2);
                    this.f7137s.add(k3);
                }
            } else {
                i3 = size;
                i10 = i11;
            }
            i11 = i10 + 1;
            size = i3;
        }
        if (sparseIntArray.size() != 0) {
            for (int i16 = 0; i16 < sparseIntArray.size(); i16++) {
                Animator animator2 = (Animator) this.f7137s.get(sparseIntArray.keyAt(i16));
                animator2.setStartDelay(animator2.getStartDelay() + (sparseIntArray.valueAt(i16) - LongCompanionObject.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i3 = this.f7133n - 1;
        this.f7133n = i3;
        if (i3 == 0) {
            ArrayList arrayList = this.f7136r;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f7136r.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((m) arrayList2.get(i10)).d(this);
                }
            }
            for (int i11 = 0; i11 < ((C1694g) this.f7127f.f19673c).e(); i11++) {
                View view = (View) ((C1694g) this.f7127f.f19673c).f(i11);
                if (view != null) {
                    WeakHashMap weakHashMap = I.f4732a;
                    view.setHasTransientState(false);
                }
            }
            for (int i12 = 0; i12 < ((C1694g) this.f7128g.f19673c).e(); i12++) {
                View view2 = (View) ((C1694g) this.f7128g.f19673c).f(i12);
                if (view2 != null) {
                    WeakHashMap weakHashMap2 = I.f4732a;
                    view2.setHasTransientState(false);
                }
            }
            this.f7135q = true;
        }
    }

    public final s n(View view, boolean z2) {
        a aVar = this.f7129h;
        if (aVar != null) {
            return aVar.n(view, z2);
        }
        ArrayList arrayList = z2 ? this.f7130k : this.f7131l;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            }
            s sVar = (s) arrayList.get(i3);
            if (sVar == null) {
                return null;
            }
            if (sVar.f7147b == view) {
                break;
            }
            i3++;
        }
        if (i3 >= 0) {
            return (s) (z2 ? this.f7131l : this.f7130k).get(i3);
        }
        return null;
    }

    public String[] p() {
        return null;
    }

    public final s q(View view, boolean z2) {
        a aVar = this.f7129h;
        if (aVar != null) {
            return aVar.q(view, z2);
        }
        return (s) ((C1692e) (z2 ? this.f7127f : this.f7128g).f19671a).get(view);
    }

    public boolean r(s sVar, s sVar2) {
        if (sVar != null && sVar2 != null) {
            String[] p8 = p();
            if (p8 != null) {
                for (String str : p8) {
                    if (t(sVar, sVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = sVar.f7146a.keySet().iterator();
                while (it.hasNext()) {
                    if (t(sVar, sVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean s(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f7125d;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f7126e;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return F("");
    }

    public void u(ViewGroup viewGroup) {
        if (this.f7135q) {
            return;
        }
        ArrayList arrayList = this.f7132m;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Animator) arrayList.get(size)).pause();
        }
        ArrayList arrayList2 = this.f7136r;
        if (arrayList2 != null && arrayList2.size() > 0) {
            ArrayList arrayList3 = (ArrayList) this.f7136r.clone();
            int size2 = arrayList3.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((m) arrayList3.get(i3)).a();
            }
        }
        this.f7134p = true;
    }

    public void v(m mVar) {
        ArrayList arrayList = this.f7136r;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(mVar);
        if (this.f7136r.size() == 0) {
            this.f7136r = null;
        }
    }

    public void w(View view) {
        if (this.f7134p) {
            if (!this.f7135q) {
                ArrayList arrayList = this.f7132m;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((Animator) arrayList.get(size)).resume();
                }
                ArrayList arrayList2 = this.f7136r;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    ArrayList arrayList3 = (ArrayList) this.f7136r.clone();
                    int size2 = arrayList3.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((m) arrayList3.get(i3)).e();
                    }
                }
            }
            this.f7134p = false;
        }
    }

    public void x() {
        E();
        C1692e o5 = o();
        Iterator it = this.f7137s.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (o5.containsKey(animator)) {
                E();
                if (animator != null) {
                    animator.addListener(new k(this, o5));
                    long j = this.f7124c;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j3 = this.f7123b;
                    if (j3 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j3);
                    }
                    animator.addListener(new K4.m(this, 2));
                    animator.start();
                }
            }
        }
        this.f7137s.clear();
        m();
    }

    public void y(long j) {
        this.f7124c = j;
    }

    public void z(Tc.d dVar) {
    }
}
