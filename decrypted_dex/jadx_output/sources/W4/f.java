package W4;

import D5.C0048l;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.stub.StubApp;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import t5.C1730a;
import t5.InterfaceC1732c;
import t5.InterfaceC1733d;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f implements c {

    /* renamed from: h, reason: collision with root package name */
    public static final C0048l f8124h = new C0048l(1);

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f8125a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f8126b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f8127c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f8128d;

    /* renamed from: e, reason: collision with root package name */
    public final k f8129e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f8130f;

    /* renamed from: g, reason: collision with root package name */
    public final C2.i f8131g;

    public f(ArrayList arrayList, ArrayList arrayList2, C2.i iVar) {
        X4.j jVar = X4.j.f8405a;
        this.f8125a = new HashMap();
        this.f8126b = new HashMap();
        this.f8127c = new HashMap();
        this.f8128d = new HashSet();
        this.f8130f = new AtomicReference();
        k kVar = new k();
        this.f8129e = kVar;
        this.f8131g = iVar;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(b.c(kVar, k.class, InterfaceC1733d.class, InterfaceC1732c.class));
        arrayList3.add(b.c(this, f.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar != null) {
                arrayList3.add(bVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((w5.b) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f8131g.z(componentRegistrar));
                        it3.remove();
                    }
                } catch (l e10) {
                    it3.remove();
                    Log.w(StubApp.getString2("5664"), StubApp.getString2("6903"), e10);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Object[] array = ((b) it4.next()).f8116b.toArray();
                int length = array.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length) {
                        Object obj = array[i3];
                        if (obj.toString().contains(StubApp.getString2("6904"))) {
                            if (this.f8128d.contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            this.f8128d.add(obj.toString());
                        }
                        i3++;
                    }
                }
            }
            if (this.f8125a.isEmpty()) {
                W.a.f(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f8125a.keySet());
                arrayList6.addAll(arrayList3);
                W.a.f(arrayList6);
            }
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                b bVar2 = (b) it5.next();
                this.f8125a.put(bVar2, new m(new R4.d(1, this, bVar2)));
            }
            arrayList5.addAll(i(arrayList3));
            arrayList5.addAll(j());
            h();
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            ((Runnable) it6.next()).run();
        }
        Boolean bool = (Boolean) this.f8130f.get();
        if (bool != null) {
            g(this.f8125a, bool.booleanValue());
        }
    }

    @Override // W4.c
    public final o a(q qVar) {
        w5.b d8 = d(qVar);
        return d8 == null ? new o(o.f8148c, o.f8149d) : d8 instanceof o ? (o) d8 : new o(null, d8);
    }

    @Override // W4.c
    public final synchronized w5.b b(q qVar) {
        n nVar = (n) this.f8127c.get(qVar);
        if (nVar != null) {
            return nVar;
        }
        return f8124h;
    }

    @Override // W4.c
    public final synchronized w5.b d(q qVar) {
        Y3.a.g(qVar, StubApp.getString2("6905"));
        return (w5.b) this.f8126b.get(qVar);
    }

    public final void g(HashMap hashMap, boolean z2) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            b bVar = (b) entry.getKey();
            w5.b bVar2 = (w5.b) entry.getValue();
            int i3 = bVar.f8118d;
            if (i3 == 1 || (i3 == 2 && z2)) {
                bVar2.get();
            }
        }
        k kVar = this.f8129e;
        synchronized (kVar) {
            arrayDeque = kVar.f8141b;
            if (arrayDeque != null) {
                kVar.f8141b = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                kVar.a((C1730a) it.next());
            }
        }
    }

    public final void h() {
        for (b bVar : this.f8125a.keySet()) {
            for (i iVar : bVar.f8117c) {
                boolean z2 = iVar.f8138b == 2;
                q qVar = iVar.f8137a;
                if (z2) {
                    HashMap hashMap = this.f8127c;
                    if (!hashMap.containsKey(qVar)) {
                        Set set = Collections.EMPTY_SET;
                        n nVar = new n();
                        nVar.f8147b = null;
                        nVar.f8146a = Collections.newSetFromMap(new ConcurrentHashMap());
                        nVar.f8146a.addAll(set);
                        hashMap.put(qVar, nVar);
                    }
                }
                HashMap hashMap2 = this.f8126b;
                if (hashMap2.containsKey(qVar)) {
                    continue;
                } else {
                    int i3 = iVar.f8138b;
                    if (i3 == 1) {
                        throw new j(StubApp.getString2(6906) + bVar + StubApp.getString2(994) + qVar);
                    }
                    if (i3 != 2) {
                        hashMap2.put(qVar, new o(o.f8148c, o.f8149d));
                    }
                }
            }
        }
    }

    public final ArrayList i(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f8119e == 0) {
                w5.b bVar2 = (w5.b) this.f8125a.get(bVar);
                for (q qVar : bVar.f8116b) {
                    HashMap hashMap = this.f8126b;
                    if (hashMap.containsKey(qVar)) {
                        arrayList2.add(new Ab.b(19, (o) ((w5.b) hashMap.get(qVar)), bVar2));
                    } else {
                        hashMap.put(qVar, bVar2);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList j() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f8125a.entrySet()) {
            b bVar = (b) entry.getKey();
            if (bVar.f8119e != 0) {
                w5.b bVar2 = (w5.b) entry.getValue();
                for (q qVar : bVar.f8116b) {
                    if (!hashMap.containsKey(qVar)) {
                        hashMap.put(qVar, new HashSet());
                    }
                    ((Set) hashMap.get(qVar)).add(bVar2);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            Object key = entry2.getKey();
            HashMap hashMap2 = this.f8127c;
            if (hashMap2.containsKey(key)) {
                n nVar = (n) hashMap2.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new Ab.b(20, nVar, (w5.b) it.next()));
                }
            } else {
                q qVar2 = (q) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                n nVar2 = new n();
                nVar2.f8147b = null;
                nVar2.f8146a = Collections.newSetFromMap(new ConcurrentHashMap());
                nVar2.f8146a.addAll(set);
                hashMap2.put(qVar2, nVar2);
            }
        }
        return arrayList;
    }
}
