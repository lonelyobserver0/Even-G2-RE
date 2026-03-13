package p;

import com.stub.StubApp;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class f implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public c f19598a;

    /* renamed from: b, reason: collision with root package name */
    public c f19599b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f19600c = new WeakHashMap();

    /* renamed from: d, reason: collision with root package name */
    public int f19601d = 0;

    public c a(Object obj) {
        c cVar = this.f19598a;
        while (cVar != null && !cVar.f19591a.equals(obj)) {
            cVar = cVar.f19593c;
        }
        return cVar;
    }

    public Object b(Object obj) {
        c a3 = a(obj);
        if (a3 == null) {
            return null;
        }
        this.f19601d--;
        WeakHashMap weakHashMap = this.f19600c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(a3);
            }
        }
        c cVar = a3.f19594d;
        if (cVar != null) {
            cVar.f19593c = a3.f19593c;
        } else {
            this.f19598a = a3.f19593c;
        }
        c cVar2 = a3.f19593c;
        if (cVar2 != null) {
            cVar2.f19594d = cVar;
        } else {
            this.f19599b = cVar;
        }
        a3.f19593c = null;
        a3.f19594d = null;
        return a3.f19592b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((p.C1476b) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof p.f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            p.f r7 = (p.f) r7
            int r1 = r6.f19601d
            int r3 = r7.f19601d
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            p.b r3 = (p.C1476b) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            p.b r4 = (p.C1476b) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            p.b r7 = (p.C1476b) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p.f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i3 = 0;
        while (true) {
            C1476b c1476b = (C1476b) it;
            if (!c1476b.hasNext()) {
                return i3;
            }
            i3 += ((Map.Entry) c1476b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C1476b c1476b = new C1476b(this.f19598a, this.f19599b, 0);
        this.f19600c.put(c1476b, Boolean.FALSE);
        return c1476b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(1557));
        Iterator it = iterator();
        while (true) {
            C1476b c1476b = (C1476b) it;
            if (!c1476b.hasNext()) {
                sb2.append(StubApp.getString2(511));
                return sb2.toString();
            }
            sb2.append(((Map.Entry) c1476b.next()).toString());
            if (c1476b.hasNext()) {
                sb2.append(StubApp.getString2(81));
            }
        }
    }
}
