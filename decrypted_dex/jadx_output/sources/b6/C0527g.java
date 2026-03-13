package b6;

import N5.l;
import N5.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;

/* renamed from: b6.g, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0527g extends AbstractC0528h {

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC0528h[] f10692c = new AbstractC0528h[0];

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC0531k[] f10693d = new AbstractC0531k[0];

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10694a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0528h[] f10695b;

    public C0527g(EnumMap enumMap, int i3) {
        this.f10694a = i3;
        switch (i3) {
            case 1:
                Collection collection = enumMap == null ? null : (Collection) enumMap.get(N5.d.f4884c);
                ArrayList arrayList = new ArrayList();
                if (collection != null) {
                    if (collection.contains(N5.a.f4870h)) {
                        arrayList.add(new C0525e(0));
                    } else if (collection.contains(N5.a.f4876q)) {
                        arrayList.add(new C0525e(3));
                    }
                    if (collection.contains(N5.a.f4869g)) {
                        arrayList.add(new C0525e(2));
                    }
                    if (collection.contains(N5.a.f4877r)) {
                        arrayList.add(new C0525e(1));
                    }
                }
                if (arrayList.isEmpty()) {
                    arrayList.add(new C0525e(0));
                    arrayList.add(new C0525e(2));
                    arrayList.add(new C0525e(1));
                }
                this.f10695b = (AbstractC0531k[]) arrayList.toArray(f10693d);
                break;
            default:
                Collection collection2 = enumMap == null ? null : (Collection) enumMap.get(N5.d.f4884c);
                boolean z2 = (enumMap == null || enumMap.get(N5.d.f4888g) == null) ? false : true;
                ArrayList arrayList2 = new ArrayList();
                if (collection2 != null) {
                    if (collection2.contains(N5.a.f4870h) || collection2.contains(N5.a.f4876q) || collection2.contains(N5.a.f4869g) || collection2.contains(N5.a.f4877r)) {
                        arrayList2.add(new C0527g(enumMap, 1));
                    }
                    if (collection2.contains(N5.a.f4865c)) {
                        arrayList2.add(new C0523c(z2));
                    }
                    if (collection2.contains(N5.a.f4866d)) {
                        arrayList2.add(new C0524d());
                    }
                    if (collection2.contains(N5.a.f4867e)) {
                        arrayList2.add(new C0522b());
                    }
                    if (collection2.contains(N5.a.j)) {
                        arrayList2.add(new C0526f());
                    }
                    if (collection2.contains(N5.a.f4864b)) {
                        arrayList2.add(new C0521a());
                    }
                    if (collection2.contains(N5.a.f4874n)) {
                        arrayList2.add(new c6.e());
                    }
                    if (collection2.contains(N5.a.f4875p)) {
                        arrayList2.add(new d6.c());
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2.add(new C0527g(enumMap, 1));
                    arrayList2.add(new C0523c(false));
                    arrayList2.add(new C0521a());
                    arrayList2.add(new C0524d());
                    arrayList2.add(new C0522b());
                    arrayList2.add(new C0526f());
                    arrayList2.add(new c6.e());
                    arrayList2.add(new d6.c());
                }
                this.f10695b = (AbstractC0528h[]) arrayList2.toArray(f10692c);
                break;
        }
    }

    @Override // b6.AbstractC0528h
    public final m b(int i3, T5.a aVar, EnumMap enumMap) {
        boolean z2;
        switch (this.f10694a) {
            case 0:
                for (AbstractC0528h abstractC0528h : this.f10695b) {
                    try {
                        return abstractC0528h.b(i3, aVar, enumMap);
                    } catch (l unused) {
                    }
                }
                throw N5.i.a();
            default:
                int[] m4 = AbstractC0531k.m(aVar);
                for (AbstractC0531k abstractC0531k : (AbstractC0531k[]) this.f10695b) {
                    try {
                        m k3 = abstractC0531k.k(i3, aVar, m4, enumMap);
                        N5.a aVar2 = k3.f4911d;
                        N5.a aVar3 = N5.a.f4870h;
                        String str = k3.f4908a;
                        boolean z10 = aVar2 == aVar3 && str.charAt(0) == '0';
                        Collection collection = enumMap == null ? null : (Collection) enumMap.get(N5.d.f4884c);
                        N5.a aVar4 = N5.a.f4876q;
                        if (collection != null && !collection.contains(aVar4)) {
                            z2 = false;
                            if (!z10 && z2) {
                                m mVar = new m(str.substring(1), k3.f4909b, k3.f4910c, aVar4);
                                mVar.a(k3.f4912e);
                                return mVar;
                            }
                        }
                        z2 = true;
                        return !z10 ? k3 : k3;
                    } catch (l unused2) {
                    }
                }
                throw N5.i.a();
        }
    }

    @Override // b6.AbstractC0528h, N5.k
    public final void reset() {
        switch (this.f10694a) {
            case 0:
                for (AbstractC0528h abstractC0528h : this.f10695b) {
                    abstractC0528h.reset();
                }
                break;
            default:
                for (AbstractC0531k abstractC0531k : (AbstractC0531k[]) this.f10695b) {
                    abstractC0531k.getClass();
                }
                break;
        }
    }
}
