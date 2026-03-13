package com.google.android.gms.internal.measurement;

import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0601d implements Iterable, InterfaceC0651n, InterfaceC0631j {

    /* renamed from: a, reason: collision with root package name */
    public final TreeMap f11469a;

    /* renamed from: b, reason: collision with root package name */
    public final TreeMap f11470b;

    public C0601d() {
        this.f11469a = new TreeMap();
        this.f11470b = new TreeMap();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final Boolean a() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final String b() {
        return u(StubApp.getString2(321));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final Iterator c() {
        return new C0596c(this, this.f11469a.keySet().iterator(), this.f11470b.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final Double d() {
        TreeMap treeMap = this.f11469a;
        return treeMap.size() == 1 ? q(0).d() : treeMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0601d)) {
            return false;
        }
        C0601d c0601d = (C0601d) obj;
        if (p() != c0601d.p()) {
            return false;
        }
        TreeMap treeMap = this.f11469a;
        if (treeMap.isEmpty()) {
            return c0601d.f11469a.isEmpty();
        }
        for (int intValue = ((Integer) treeMap.firstKey()).intValue(); intValue <= ((Integer) treeMap.lastKey()).intValue(); intValue++) {
            if (!q(intValue).equals(c0601d.q(intValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0631j
    public final InterfaceC0651n f(String str) {
        InterfaceC0651n interfaceC0651n;
        return StubApp.getString2(11905).equals(str) ? new C0616g(Double.valueOf(p())) : (!l(str) || (interfaceC0651n = (InterfaceC0651n) this.f11470b.get(str)) == null) ? InterfaceC0651n.f11619U : interfaceC0651n;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0631j
    public final void g(String str, InterfaceC0651n interfaceC0651n) {
        TreeMap treeMap = this.f11470b;
        if (interfaceC0651n == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, interfaceC0651n);
        }
    }

    public final int hashCode() {
        return this.f11469a.hashCode() * 31;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x08da, code lost:
    
        if (Y3.a.F(r29, r31, (com.google.android.gms.internal.measurement.C0646m) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).p() == p()) goto L381;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0770  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0841  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x08a4  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x08e8  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02fc  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.InterfaceC0651n i(java.lang.String r30, p2.h r31, java.util.ArrayList r32) {
        /*
            Method dump skipped, instructions count: 2512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C0601d.i(java.lang.String, p2.h, java.util.ArrayList):com.google.android.gms.internal.measurement.n");
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0661p(this, 2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0631j
    public final boolean l(String str) {
        return StubApp.getString2(11905).equals(str) || this.f11470b.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final InterfaceC0651n m() {
        C0601d c0601d = new C0601d();
        for (Map.Entry entry : this.f11469a.entrySet()) {
            boolean z2 = entry.getValue() instanceof InterfaceC0631j;
            TreeMap treeMap = c0601d.f11469a;
            if (z2) {
                treeMap.put((Integer) entry.getKey(), (InterfaceC0651n) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((InterfaceC0651n) entry.getValue()).m());
            }
        }
        return c0601d;
    }

    public final List n() {
        ArrayList arrayList = new ArrayList(p());
        for (int i3 = 0; i3 < p(); i3++) {
            arrayList.add(q(i3));
        }
        return arrayList;
    }

    public final Iterator o() {
        return this.f11469a.keySet().iterator();
    }

    public final int p() {
        TreeMap treeMap = this.f11469a;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    public final InterfaceC0651n q(int i3) {
        InterfaceC0651n interfaceC0651n;
        if (i3 < p()) {
            return (!s(i3) || (interfaceC0651n = (InterfaceC0651n) this.f11469a.get(Integer.valueOf(i3))) == null) ? InterfaceC0651n.f11619U : interfaceC0651n;
        }
        throw new IndexOutOfBoundsException(StubApp.getString2(11928));
    }

    public final void r(int i3, InterfaceC0651n interfaceC0651n) {
        if (i3 > 32468) {
            throw new IllegalStateException(StubApp.getString2(11929));
        }
        if (i3 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 21);
            sb2.append(StubApp.getString2(8408));
            sb2.append(i3);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        TreeMap treeMap = this.f11469a;
        if (interfaceC0651n == null) {
            treeMap.remove(Integer.valueOf(i3));
        } else {
            treeMap.put(Integer.valueOf(i3), interfaceC0651n);
        }
    }

    public final boolean s(int i3) {
        if (i3 >= 0) {
            TreeMap treeMap = this.f11469a;
            if (i3 <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i3));
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 21);
        sb2.append(StubApp.getString2(8408));
        sb2.append(i3);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    public final void t(int i3) {
        TreeMap treeMap = this.f11469a;
        int intValue = ((Integer) treeMap.lastKey()).intValue();
        if (i3 > intValue || i3 < 0) {
            return;
        }
        treeMap.remove(Integer.valueOf(i3));
        if (i3 == intValue) {
            int i10 = i3 - 1;
            Integer valueOf = Integer.valueOf(i10);
            if (treeMap.containsKey(valueOf) || i10 < 0) {
                return;
            }
            treeMap.put(valueOf, InterfaceC0651n.f11619U);
            return;
        }
        while (true) {
            i3++;
            if (i3 > ((Integer) treeMap.lastKey()).intValue()) {
                return;
            }
            Integer valueOf2 = Integer.valueOf(i3);
            InterfaceC0651n interfaceC0651n = (InterfaceC0651n) treeMap.get(valueOf2);
            if (interfaceC0651n != null) {
                treeMap.put(Integer.valueOf(i3 - 1), interfaceC0651n);
                treeMap.remove(valueOf2);
            }
        }
    }

    public final String toString() {
        return u(StubApp.getString2(321));
    }

    public final String u(String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (!this.f11469a.isEmpty()) {
            int i3 = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i3 >= p()) {
                    break;
                }
                InterfaceC0651n q10 = q(i3);
                sb2.append(str2);
                if (!(q10 instanceof r) && !(q10 instanceof C0641l)) {
                    sb2.append(q10.b());
                }
                i3++;
            }
            sb2.delete(0, str2.length());
        }
        return sb2.toString();
    }

    public C0601d(List list) {
        this();
        if (list != null) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                r(i3, (InterfaceC0651n) list.get(i3));
            }
        }
    }
}
