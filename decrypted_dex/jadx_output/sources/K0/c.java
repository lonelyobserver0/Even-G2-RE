package K0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o0.C1412I;
import o0.C1438m;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c implements G0.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f3592a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3593b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3594c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3595d;

    /* renamed from: e, reason: collision with root package name */
    public final a f3596e;

    /* renamed from: f, reason: collision with root package name */
    public final b[] f3597f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3598g;

    /* renamed from: h, reason: collision with root package name */
    public final long f3599h;

    public c(int i3, int i10, long j, long j3, int i11, boolean z2, a aVar, b[] bVarArr) {
        this.f3592a = i3;
        this.f3593b = i10;
        this.f3598g = j;
        this.f3599h = j3;
        this.f3594c = i11;
        this.f3595d = z2;
        this.f3596e = aVar;
        this.f3597f = bVarArr;
    }

    @Override // G0.a
    public final Object a(List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i3 = 0;
        while (i3 < arrayList.size()) {
            C1412I c1412i = (C1412I) arrayList.get(i3);
            b bVar2 = this.f3597f[c1412i.f18040b];
            if (bVar2 != bVar && bVar != null) {
                arrayList2.add(bVar.a((C1438m[]) arrayList3.toArray(new C1438m[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.j[c1412i.f18041c]);
            i3++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.a((C1438m[]) arrayList3.toArray(new C1438m[0])));
        }
        return new c(this.f3592a, this.f3593b, this.f3598g, this.f3599h, this.f3594c, this.f3595d, this.f3596e, (b[]) arrayList2.toArray(new b[0]));
    }
}
