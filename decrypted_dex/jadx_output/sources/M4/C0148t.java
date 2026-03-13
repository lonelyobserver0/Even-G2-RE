package M4;

import f5.u0;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: M4.t, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0148t extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4651a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0150v f4652b;

    public /* synthetic */ C0148t(C0150v c0150v, int i3) {
        this.f4651a = i3;
        this.f4652b = c0150v;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f4651a) {
            case 0:
                this.f4652b.clear();
                break;
            default:
                this.f4652b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f4651a) {
            case 0:
                C0150v c0150v = this.f4652b;
                Map c10 = c0150v.c();
                if (c10 != null) {
                    return c10.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int e10 = c0150v.e(entry.getKey());
                    if (e10 != -1 && u0.j(c0150v.k()[e10], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f4652b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f4651a) {
            case 0:
                C0150v c0150v = this.f4652b;
                Map c10 = c0150v.c();
                return c10 != null ? c10.entrySet().iterator() : new C0147s(c0150v, 1);
            default:
                C0150v c0150v2 = this.f4652b;
                Map c11 = c0150v2.c();
                return c11 != null ? c11.keySet().iterator() : new C0147s(c0150v2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f4651a) {
            case 0:
                C0150v c0150v = this.f4652b;
                Map c10 = c0150v.c();
                if (c10 != null) {
                    return c10.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!c0150v.g()) {
                        int d8 = c0150v.d();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = c0150v.f4657a;
                        Objects.requireNonNull(obj2);
                        int o5 = r.o(key, value, d8, obj2, c0150v.i(), c0150v.j(), c0150v.k());
                        if (o5 != -1) {
                            c0150v.f(o5, d8);
                            c0150v.f4662f--;
                            c0150v.f4661e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                C0150v c0150v2 = this.f4652b;
                Map c11 = c0150v2.c();
                return c11 != null ? c11.keySet().remove(obj) : c0150v2.h(obj) != C0150v.f4656k;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f4651a) {
        }
        return this.f4652b.size();
    }
}
