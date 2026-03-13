package t0;

import M4.i0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: t0.n, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1714n implements Map {

    /* renamed from: a, reason: collision with root package name */
    public final Map f21096a;

    public C1714n(Map map) {
        this.f21096a = map;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f21096a.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && this.f21096a.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Iterator it = ((i0) entrySet()).iterator();
        it.getClass();
        if (obj == null) {
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(((Map.Entry) it.next()).getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return M4.r.h(this.f21096a.entrySet(), new C1713m(0));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && M4.r.f(this, obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f21096a.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return M4.r.k(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map map = this.f21096a;
        return map.isEmpty() || (map.size() == 1 && map.containsKey(null));
    }

    @Override // java.util.Map
    public final Set keySet() {
        return M4.r.h(this.f21096a.keySet(), new C1713m(1));
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.f21096a.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f21096a.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.f21096a.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        Map map = this.f21096a;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    public final String toString() {
        return this.f21096a.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f21096a.values();
    }
}
