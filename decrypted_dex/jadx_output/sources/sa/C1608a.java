package sa;

import H0.C0067j;
import O0.u;
import T0.H;
import T0.q;
import android.os.ConditionVariable;
import com.mapbox.common.MemoryMonitorFactory;
import com.mapbox.common.MemoryMonitorInterface;
import com.stub.StubApp;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m8.C1284e;
import o0.AbstractC1405B;
import o0.C1437l;
import o0.C1438m;
import q0.C1504b;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import r0.C1553n;
import r0.C1558s;
import sb.C1644e0;
import z1.C1994F;
import z1.InterfaceC1990B;

/* renamed from: sa.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1608a implements q1.d, InterfaceC1990B {

    /* renamed from: a, reason: collision with root package name */
    public Object f20820a;

    /* renamed from: b, reason: collision with root package name */
    public Object f20821b;

    /* renamed from: c, reason: collision with root package name */
    public Object f20822c;

    public /* synthetic */ C1608a(Serializable serializable, Object obj, Serializable serializable2) {
        this.f20820a = serializable;
        this.f20821b = obj;
        this.f20822c = serializable2;
    }

    public void a(C1284e observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        synchronized (((CopyOnWriteArrayList) this.f20821b)) {
            try {
                ((CopyOnWriteArrayList) this.f20821b).add(observer);
                if (((CopyOnWriteArrayList) this.f20821b).size() == 1) {
                    ((MemoryMonitorInterface) this.f20820a).registerObserver((C1644e0) this.f20822c);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // z1.InterfaceC1990B
    public void b(C1558s c1558s, q qVar, C1994F c1994f) {
        this.f20821b = c1558s;
        c1994f.a();
        c1994f.b();
        H w10 = qVar.w(c1994f.f23754d, 5);
        this.f20822c = w10;
        w10.d((C1438m) this.f20820a);
    }

    @Override // z1.InterfaceC1990B
    public void c(C1553n c1553n) {
        long d8;
        long j;
        AbstractC1550k.h((C1558s) this.f20821b);
        int i3 = AbstractC1560u.f20190a;
        C1558s c1558s = (C1558s) this.f20821b;
        synchronized (c1558s) {
            try {
                long j3 = c1558s.f20188c;
                d8 = j3 != -9223372036854775807L ? j3 + c1558s.f20187b : c1558s.d();
            } finally {
            }
        }
        C1558s c1558s2 = (C1558s) this.f20821b;
        synchronized (c1558s2) {
            j = c1558s2.f20187b;
        }
        if (d8 == -9223372036854775807L || j == -9223372036854775807L) {
            return;
        }
        C1438m c1438m = (C1438m) this.f20820a;
        if (j != c1438m.f18221s) {
            C1437l a3 = c1438m.a();
            a3.f18182r = j;
            C1438m c1438m2 = new C1438m(a3);
            this.f20820a = c1438m2;
            ((H) this.f20822c).d(c1438m2);
        }
        int a9 = c1553n.a();
        ((H) this.f20822c).a(c1553n, a9, 0);
        ((H) this.f20822c).c(d8, 1, a9, 0, null);
    }

    @Override // q1.d
    public int d(long j) {
        long[] jArr = (long[]) this.f20822c;
        int a3 = AbstractC1560u.a(jArr, j, false);
        if (a3 < jArr.length) {
            return a3;
        }
        return -1;
    }

    @Override // q1.d
    public long e(int i3) {
        AbstractC1550k.c(i3 >= 0);
        long[] jArr = (long[]) this.f20822c;
        AbstractC1550k.c(i3 < jArr.length);
        return jArr[i3];
    }

    @Override // q1.d
    public List f(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        while (true) {
            List list = (List) this.f20820a;
            if (i3 >= list.size()) {
                break;
            }
            int i10 = i3 * 2;
            long[] jArr = (long[]) this.f20821b;
            if (jArr[i10] <= j && j < jArr[i10 + 1]) {
                y1.c cVar = (y1.c) list.get(i3);
                C1504b c1504b = cVar.f23462a;
                if (c1504b.f19848e == -3.4028235E38f) {
                    arrayList2.add(cVar);
                } else {
                    arrayList.add(c1504b);
                }
            }
            i3++;
        }
        Collections.sort(arrayList2, new C0067j(19));
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            C1504b c1504b2 = ((y1.c) arrayList2.get(i11)).f23462a;
            arrayList.add(new C1504b(c1504b2.f19844a, c1504b2.f19845b, c1504b2.f19846c, c1504b2.f19847d, (-1) - i11, 1, c1504b2.f19850g, c1504b2.f19851h, c1504b2.f19852i, c1504b2.f19856n, c1504b2.f19857o, c1504b2.j, c1504b2.f19853k, c1504b2.f19854l, c1504b2.f19855m, c1504b2.f19858p, c1504b2.f19859q));
        }
        return arrayList;
    }

    @Override // q1.d
    public int g() {
        return ((long[]) this.f20822c).length;
    }

    public String h(long j, String str, long j3, int i3) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f20821b;
            int size = arrayList.size();
            ArrayList arrayList2 = (ArrayList) this.f20820a;
            if (i10 >= size) {
                sb2.append((String) arrayList2.get(arrayList.size()));
                return sb2.toString();
            }
            sb2.append((String) arrayList2.get(i10));
            if (((Integer) arrayList.get(i10)).intValue() == 1) {
                sb2.append(str);
            } else {
                int intValue = ((Integer) arrayList.get(i10)).intValue();
                ArrayList arrayList3 = (ArrayList) this.f20822c;
                if (intValue == 2) {
                    sb2.append(String.format(Locale.US, (String) arrayList3.get(i10), Long.valueOf(j)));
                } else if (((Integer) arrayList.get(i10)).intValue() == 3) {
                    sb2.append(String.format(Locale.US, (String) arrayList3.get(i10), Integer.valueOf(i3)));
                } else if (((Integer) arrayList.get(i10)).intValue() == 4) {
                    sb2.append(String.format(Locale.US, (String) arrayList3.get(i10), Long.valueOf(j3)));
                }
            }
            i10++;
        }
    }

    public void i(q qVar, C1994F c1994f) {
        int i3 = 0;
        while (true) {
            H[] hArr = (H[]) this.f20821b;
            if (i3 >= hArr.length) {
                return;
            }
            c1994f.a();
            c1994f.b();
            H w10 = qVar.w(c1994f.f23754d, 3);
            C1438m c1438m = (C1438m) ((List) this.f20820a).get(i3);
            String str = c1438m.f18216n;
            AbstractC1550k.b(StubApp.getString2(23151) + str, StubApp.getString2(467).equals(str) || StubApp.getString2(503).equals(str));
            String str2 = c1438m.f18204a;
            if (str2 == null) {
                c1994f.b();
                str2 = c1994f.f23755e;
            }
            C1437l c1437l = new C1437l();
            c1437l.f18166a = str2;
            c1437l.f18177m = AbstractC1405B.m(str);
            c1437l.f18170e = c1438m.f18208e;
            c1437l.f18169d = c1438m.f18207d;
            c1437l.f18161G = c1438m.f18198H;
            c1437l.f18180p = c1438m.f18219q;
            E1.a.w(c1437l, w10);
            hArr[i3] = w10;
            i3++;
        }
    }

    public void j(Runnable runnable) {
        ((s2.g) this.f20820a).execute(runnable);
    }

    public void k(C1284e observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        synchronized (((CopyOnWriteArrayList) this.f20821b)) {
            try {
                ((CopyOnWriteArrayList) this.f20821b).remove(observer);
                if (((CopyOnWriteArrayList) this.f20821b).isEmpty()) {
                    ((MemoryMonitorInterface) this.f20820a).unregisterObserver((C1644e0) this.f20822c);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C1608a(int i3) {
        switch (i3) {
            case 2:
                MemoryMonitorInterface memoryMonitor = MemoryMonitorFactory.getOrCreate();
                Intrinsics.checkNotNullExpressionValue(memoryMonitor, "getOrCreate()");
                Intrinsics.checkNotNullParameter(memoryMonitor, "memoryMonitor");
                this.f20820a = memoryMonitor;
                this.f20821b = new CopyOnWriteArrayList();
                this.f20822c = new C1644e0(this, 4);
                break;
            case 12:
                this.f20822c = new ConditionVariable(false);
                break;
            default:
                this.f20820a = new HashMap();
                new HashMap();
                this.f20821b = new HashMap();
                this.f20822c = new HashMap();
                new HashMap();
                new HashMap();
                new HashMap();
                break;
        }
    }

    public C1608a(List list) {
        this.f20820a = list;
        this.f20821b = new H[list.size()];
        this.f20822c = new u(new C1644e0(this, 18));
    }

    public C1608a(String str) {
        C1437l c1437l = new C1437l();
        c1437l.f18177m = AbstractC1405B.m(str);
        this.f20820a = new C1438m(c1437l);
    }
}
