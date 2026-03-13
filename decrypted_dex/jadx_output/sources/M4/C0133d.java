package M4;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: M4.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class C0133d extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    public transient C0131b f4597a;

    /* renamed from: b, reason: collision with root package name */
    public transient C0143n f4598b;

    /* renamed from: c, reason: collision with root package name */
    public final transient Map f4599c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ W f4600d;

    public C0133d(W w10, Map map) {
        this.f4600d = w10;
        this.f4599c = map;
    }

    public final E a(Map.Entry entry) {
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        W w10 = this.f4600d;
        w10.getClass();
        List list = (List) collection;
        return new E(key, list instanceof RandomAccess ? new C0137h(w10, key, list, null) : new C0141l(w10, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        W w10 = this.f4600d;
        if (this.f4599c == w10.f4572d) {
            w10.c();
            return;
        }
        C0132c c0132c = new C0132c(this);
        while (c0132c.hasNext()) {
            c0132c.next();
            c0132c.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f4599c;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C0131b c0131b = this.f4597a;
        if (c0131b != null) {
            return c0131b;
        }
        C0131b c0131b2 = new C0131b(this);
        this.f4597a = c0131b2;
        return c0131b2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f4599c.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.f4599c;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        W w10 = this.f4600d;
        w10.getClass();
        List list = (List) collection;
        return list instanceof RandomAccess ? new C0137h(w10, obj, list, null) : new C0141l(w10, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f4599c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        W w10 = this.f4600d;
        Set set = w10.f4640a;
        if (set != null) {
            return set;
        }
        Map map = w10.f4572d;
        Set c0136g = map instanceof NavigableMap ? new C0136g(w10, (NavigableMap) map) : map instanceof SortedMap ? new C0139j(w10, (SortedMap) map) : new C0134e(w10, map);
        w10.f4640a = c0136g;
        return c0136g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.f4599c.remove(obj);
        if (collection == null) {
            return null;
        }
        W w10 = this.f4600d;
        Collection d8 = w10.d();
        d8.addAll(collection);
        w10.f4573e -= collection.size();
        collection.clear();
        return d8;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f4599c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f4599c.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C0143n c0143n = this.f4598b;
        if (c0143n != null) {
            return c0143n;
        }
        C0143n c0143n2 = new C0143n(this);
        this.f4598b = c0143n2;
        return c0143n2;
    }
}
