package p2;

import H0.C0067j;
import H3.j;
import H5.a0;
import M4.G;
import M4.Z;
import M4.r;
import Qb.I;
import Qb.J;
import Qb.K0;
import Qb.L;
import Y.u;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.gms.internal.measurement.C0601d;
import com.google.android.gms.internal.measurement.C0611f;
import com.google.android.gms.internal.measurement.C0680t;
import com.google.android.gms.internal.measurement.InterfaceC0651n;
import com.stub.StubApp;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC1130a;
import l.C1134e;
import m.MenuC1254A;
import m.l;
import m.s;
import p0.AbstractC1482f;
import s.C1590a;
import sa.C1608a;
import t.C1692e;
import t.C1694g;
import t.C1697j;
import z0.C1986b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class h implements D3.b, Nb.e {

    /* renamed from: e, reason: collision with root package name */
    public static h f19670e;

    /* renamed from: a, reason: collision with root package name */
    public Object f19671a;

    /* renamed from: b, reason: collision with root package name */
    public Object f19672b;

    /* renamed from: c, reason: collision with root package name */
    public Object f19673c;

    /* renamed from: d, reason: collision with root package name */
    public Object f19674d;

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f19671a = obj;
        this.f19672b = obj2;
        this.f19673c = obj3;
        this.f19674d = obj4;
    }

    public static final Message a(h hVar, ArrayList arrayList, int i3) {
        Object obj;
        hVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((Message) next).what == i3) {
                arrayList2.add(next);
            }
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            Object next2 = it2.next();
            if (it2.hasNext()) {
                long when = ((Message) next2).getWhen();
                do {
                    Object next3 = it2.next();
                    long when2 = ((Message) next3).getWhen();
                    if (when < when2) {
                        next2 = next3;
                        when = when2;
                    }
                } while (it2.hasNext());
            }
            obj = next2;
        } else {
            obj = null;
        }
        return (Message) obj;
    }

    public static synchronized h d(Context context, C1608a c1608a) {
        h hVar;
        synchronized (h.class) {
            try {
                if (f19670e == null) {
                    h hVar2 = new h();
                    Context origApplicationContext = StubApp.getOrigApplicationContext(context.getApplicationContext());
                    hVar2.f19671a = new C1486a(origApplicationContext, c1608a);
                    hVar2.f19672b = new C1487b(origApplicationContext, c1608a);
                    hVar2.f19673c = new f(origApplicationContext, c1608a);
                    hVar2.f19674d = new g(origApplicationContext, c1608a);
                    f19670e = hVar2;
                }
                hVar = f19670e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    public static void h(long j, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            hashMap.remove(arrayList.get(i3));
        }
    }

    public ArrayList b(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = (HashMap) this.f19671a;
        h(elapsedRealtime, hashMap);
        HashMap hashMap2 = (HashMap) this.f19672b;
        h(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            C1986b c1986b = (C1986b) list.get(i3);
            if (!hashMap.containsKey(c1986b.f23643b) && !hashMap2.containsKey(Integer.valueOf(c1986b.f23644c))) {
                arrayList.add(c1986b);
            }
        }
        return arrayList;
    }

    public C1134e c(AbstractC1130a abstractC1130a) {
        ArrayList arrayList = (ArrayList) this.f19673c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C1134e c1134e = (C1134e) arrayList.get(i3);
            if (c1134e != null && c1134e.f15661b == abstractC1130a) {
                return c1134e;
            }
        }
        C1134e c1134e2 = new C1134e((Context) this.f19672b, abstractC1130a);
        arrayList.add(c1134e2);
        return c1134e2;
    }

    @Override // Nb.e
    public void cancel() {
        K0 k02 = (K0) this.f19671a;
        if (k02 != null) {
            k02.d(null);
        }
        ((K0) this.f19674d).d(null);
    }

    public boolean e(AbstractC1130a abstractC1130a, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f19671a).onActionItemClicked(c(abstractC1130a), new s((Context) this.f19672b, (H.a) menuItem));
    }

    public boolean f(AbstractC1130a abstractC1130a, l lVar) {
        C1134e c10 = c(abstractC1130a);
        C1697j c1697j = (C1697j) this.f19674d;
        Menu menu = (Menu) c1697j.get(lVar);
        if (menu == null) {
            menu = new MenuC1254A((Context) this.f19672b, lVar);
            c1697j.put(lVar, menu);
        }
        return ((ActionMode.Callback) this.f19671a).onCreateActionMode(c10, menu);
    }

    public void g(Message message) {
        LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) this.f19673c;
        boolean offer = linkedBlockingDeque.offer(message);
        String string2 = StubApp.getString2(88);
        if (!offer) {
            Log.d(string2, StubApp.getString2(22108) + message.what + StubApp.getString2(22109));
            return;
        }
        Log.d(string2, StubApp.getString2(22106) + message.what + StubApp.getString2(22107) + linkedBlockingDeque.size());
    }

    @Override // Pb.a
    public Object get() {
        return new j((Executor) ((Pb.a) this.f19671a).get(), (I3.d) ((Pb.a) this.f19672b).get(), (H3.d) ((Q2.g) this.f19673c).get(), (J3.c) ((Pb.a) this.f19674d).get());
    }

    public C1986b i(List list) {
        C1986b c1986b;
        ArrayList b2 = b(list);
        if (b2.size() < 2) {
            return (C1986b) r.i(b2, null);
        }
        Collections.sort(b2, new C0067j(17));
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i10 = ((C1986b) b2.get(0)).f23644c;
        int i11 = 0;
        while (true) {
            if (i11 >= b2.size()) {
                break;
            }
            C1986b c1986b2 = (C1986b) b2.get(i11);
            if (i10 == c1986b2.f23644c) {
                arrayList.add(new Pair(c1986b2.f23643b, Integer.valueOf(c1986b2.f23645d)));
                i11++;
            } else if (arrayList.size() == 1) {
                return (C1986b) b2.get(0);
            }
        }
        HashMap hashMap = (HashMap) this.f19673c;
        C1986b c1986b3 = (C1986b) hashMap.get(arrayList);
        if (c1986b3 != null) {
            return c1986b3;
        }
        List subList = b2.subList(0, arrayList.size());
        int i12 = 0;
        for (int i13 = 0; i13 < subList.size(); i13++) {
            i12 += ((C1986b) subList.get(i13)).f23645d;
        }
        int nextInt = ((Random) this.f19674d).nextInt(i12);
        int i14 = 0;
        while (true) {
            if (i3 >= subList.size()) {
                c1986b = (C1986b) r.j(subList);
                break;
            }
            c1986b = (C1986b) subList.get(i3);
            i14 += c1986b.f23645d;
            if (nextInt < i14) {
                break;
            }
            i3++;
        }
        hashMap.put(arrayList, c1986b);
        return c1986b;
    }

    public void j(int i3) {
        ArrayList arrayList = new ArrayList();
        ((LinkedBlockingDeque) this.f19673c).drainTo(arrayList);
        Message obtain = Message.obtain(null, i3, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain(null, messageCode, 0, 0)");
        arrayList.add(obtain);
        L.j(J.a((CoroutineContext) this.f19671a), null, new a0(this, arrayList, null), 3);
    }

    public InterfaceC0651n k(InterfaceC0651n interfaceC0651n) {
        return ((C0680t) this.f19672b).c(this, interfaceC0651n);
    }

    public InterfaceC0651n l(C0601d c0601d) {
        InterfaceC0651n interfaceC0651n = InterfaceC0651n.f11619U;
        Iterator o5 = c0601d.o();
        while (o5.hasNext()) {
            interfaceC0651n = ((C0680t) this.f19672b).c(this, c0601d.q(((Integer) o5.next()).intValue()));
            if (interfaceC0651n instanceof C0611f) {
                break;
            }
        }
        return interfaceC0651n;
    }

    public h m() {
        return new h(this, (C0680t) this.f19672b);
    }

    public boolean n(String str) {
        if (((HashMap) this.f19673c).containsKey(str)) {
            return true;
        }
        h hVar = (h) this.f19671a;
        if (hVar != null) {
            return hVar.n(str);
        }
        return false;
    }

    public void o(String str, InterfaceC0651n interfaceC0651n) {
        h hVar;
        HashMap hashMap = (HashMap) this.f19673c;
        if (!hashMap.containsKey(str) && (hVar = (h) this.f19671a) != null && hVar.n(str)) {
            hVar.o(str, interfaceC0651n);
        } else {
            if (((HashMap) this.f19674d).containsKey(str)) {
                return;
            }
            if (interfaceC0651n == null) {
                hashMap.remove(str);
            } else {
                hashMap.put(str, interfaceC0651n);
            }
        }
    }

    public void p(String str, InterfaceC0651n interfaceC0651n) {
        if (((HashMap) this.f19674d).containsKey(str)) {
            return;
        }
        HashMap hashMap = (HashMap) this.f19673c;
        if (interfaceC0651n == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, interfaceC0651n);
        }
    }

    @Override // Nb.e
    public void pause() {
        this.f19671a = L.j((I) this.f19672b, null, new Nb.s((Nb.c) this.f19673c, this, null), 3);
    }

    public InterfaceC0651n q(String str) {
        HashMap hashMap = (HashMap) this.f19673c;
        if (hashMap.containsKey(str)) {
            return (InterfaceC0651n) hashMap.get(str);
        }
        h hVar = (h) this.f19671a;
        if (hVar != null) {
            return hVar.q(str);
        }
        throw new IllegalArgumentException(AbstractC1482f.g(str, StubApp.getString2(12237)));
    }

    @Override // Nb.e
    public void resume() {
        ((Nb.c) this.f19673c).j.c();
        this.f19671a = null;
    }

    public h(h hVar, C0680t c0680t) {
        this.f19673c = new HashMap();
        this.f19674d = new HashMap();
        this.f19671a = hVar;
        this.f19672b = c0680t;
    }

    public h(int i3) {
        switch (i3) {
            case 13:
                Random random = new Random();
                this.f19673c = new HashMap();
                this.f19674d = random;
                this.f19671a = new HashMap();
                this.f19672b = new HashMap();
                break;
            default:
                this.f19671a = new C1692e(0);
                this.f19672b = new SparseArray();
                this.f19673c = new C1694g();
                this.f19674d = new C1692e(0);
                break;
        }
    }

    public h(Typeface typeface, Z.b bVar) {
        int i3;
        int i10;
        int i11;
        int i12;
        this.f19674d = typeface;
        this.f19671a = bVar;
        this.f19673c = new Y.r(1024);
        int a3 = bVar.a(6);
        if (a3 != 0) {
            int i13 = a3 + bVar.f4809a;
            i3 = ((ByteBuffer) bVar.f4812d).getInt(((ByteBuffer) bVar.f4812d).getInt(i13) + i13);
        } else {
            i3 = 0;
        }
        this.f19672b = new char[i3 * 2];
        int a9 = bVar.a(6);
        if (a9 != 0) {
            int i14 = a9 + bVar.f4809a;
            i10 = ((ByteBuffer) bVar.f4812d).getInt(((ByteBuffer) bVar.f4812d).getInt(i14) + i14);
        } else {
            i10 = 0;
        }
        for (int i15 = 0; i15 < i10; i15++) {
            u uVar = new u(this, i15);
            Z.a b2 = uVar.b();
            int a10 = b2.a(4);
            Character.toChars(a10 != 0 ? ((ByteBuffer) b2.f4812d).getInt(a10 + b2.f4809a) : 0, (char[]) this.f19672b, i15 * 2);
            Z.a b10 = uVar.b();
            int a11 = b10.a(16);
            if (a11 != 0) {
                int i16 = a11 + b10.f4809a;
                i11 = ((ByteBuffer) b10.f4812d).getInt(((ByteBuffer) b10.f4812d).getInt(i16) + i16);
            } else {
                i11 = 0;
            }
            M.d.a(StubApp.getString2(22105), i11 > 0);
            Z.a b11 = uVar.b();
            int a12 = b11.a(16);
            if (a12 != 0) {
                int i17 = a12 + b11.f4809a;
                i12 = ((ByteBuffer) b11.f4812d).getInt(((ByteBuffer) b11.f4812d).getInt(i17) + i17);
            } else {
                i12 = 0;
            }
            ((Y.r) this.f19673c).a(uVar, 0, i12 - 1);
        }
    }

    public h(Z z2, s0.h hVar, C1590a c1590a, s0.h hVar2) {
        Object obj;
        if (z2 != null) {
            obj = M4.I.m(z2);
        } else {
            G g10 = M4.I.f4549b;
            obj = Z.f4578e;
        }
        this.f19671a = obj;
        this.f19672b = hVar;
        this.f19673c = c1590a;
        this.f19674d = hVar2;
    }
}
