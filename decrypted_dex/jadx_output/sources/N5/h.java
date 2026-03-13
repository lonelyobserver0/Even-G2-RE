package N5;

import b6.C0527g;
import f6.C0928b;
import j6.C1092a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h implements k {

    /* renamed from: c, reason: collision with root package name */
    public static final k[] f4899c = new k[0];

    /* renamed from: a, reason: collision with root package name */
    public EnumMap f4900a;

    /* renamed from: b, reason: collision with root package name */
    public k[] f4901b;

    @Override // N5.k
    public final m a(b bVar, EnumMap enumMap) {
        c(enumMap);
        return b(bVar);
    }

    public final m b(b bVar) {
        k[] kVarArr = this.f4901b;
        if (kVarArr != null) {
            for (k kVar : kVarArr) {
                if (Thread.currentThread().isInterrupted()) {
                    throw i.a();
                }
                try {
                    return kVar.a(bVar, this.f4900a);
                } catch (l unused) {
                }
            }
            EnumMap enumMap = this.f4900a;
            if (enumMap != null && enumMap.containsKey(d.f4892m)) {
                T5.b a3 = bVar.a();
                int length = a3.f7186d.length;
                for (int i3 = 0; i3 < length; i3++) {
                    int[] iArr = a3.f7186d;
                    iArr[i3] = ~iArr[i3];
                }
                for (k kVar2 : this.f4901b) {
                    if (Thread.currentThread().isInterrupted()) {
                        throw i.a();
                    }
                    try {
                        return kVar2.a(bVar, this.f4900a);
                    } catch (l unused2) {
                    }
                }
            }
        }
        throw i.a();
    }

    public final void c(EnumMap enumMap) {
        this.f4900a = enumMap;
        boolean z2 = enumMap != null && enumMap.containsKey(d.f4885d);
        Collection collection = enumMap == null ? null : (Collection) enumMap.get(d.f4884c);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            boolean z10 = collection.contains(a.f4876q) || collection.contains(a.f4877r) || collection.contains(a.f4870h) || collection.contains(a.f4869g) || collection.contains(a.f4864b) || collection.contains(a.f4865c) || collection.contains(a.f4866d) || collection.contains(a.f4867e) || collection.contains(a.j) || collection.contains(a.f4874n) || collection.contains(a.f4875p);
            if (z10 && !z2) {
                arrayList.add(new C0527g(enumMap, 0));
            }
            if (collection.contains(a.f4873m)) {
                arrayList.add(new C1092a());
            }
            if (collection.contains(a.f4868f)) {
                arrayList.add(new W5.a());
            }
            if (collection.contains(a.f4863a)) {
                arrayList.add(new O5.b());
            }
            if (collection.contains(a.f4872l)) {
                arrayList.add(new C0928b());
            }
            if (collection.contains(a.f4871k)) {
                arrayList.add(new Z5.a());
            }
            if (z10 && z2) {
                arrayList.add(new C0527g(enumMap, 0));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z2) {
                arrayList.add(new C0527g(enumMap, 0));
            }
            arrayList.add(new C1092a());
            arrayList.add(new W5.a());
            arrayList.add(new O5.b());
            arrayList.add(new C0928b());
            arrayList.add(new Z5.a());
            if (z2) {
                arrayList.add(new C0527g(enumMap, 0));
            }
        }
        this.f4901b = (k[]) arrayList.toArray(f4899c);
    }

    @Override // N5.k
    public final void reset() {
        k[] kVarArr = this.f4901b;
        if (kVarArr != null) {
            for (k kVar : kVarArr) {
                kVar.reset();
            }
        }
    }
}
