package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class W extends AbstractMap {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f9747f = 0;

    /* renamed from: a, reason: collision with root package name */
    public List f9748a;

    /* renamed from: b, reason: collision with root package name */
    public Map f9749b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9750c;

    /* renamed from: d, reason: collision with root package name */
    public volatile Z f9751d;

    /* renamed from: e, reason: collision with root package name */
    public Map f9752e;

    public static W f() {
        W w10 = new W();
        w10.f9748a = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        w10.f9749b = map;
        w10.f9752e = map;
        return w10;
    }

    public final int a(Comparable comparable) {
        int i3;
        int size = this.f9748a.size();
        int i10 = size - 1;
        if (i10 >= 0) {
            int compareTo = comparable.compareTo(((X) this.f9748a.get(i10)).f9753a);
            if (compareTo > 0) {
                i3 = size + 1;
                return -i3;
            }
            if (compareTo == 0) {
                return i10;
            }
        }
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) / 2;
            int compareTo2 = comparable.compareTo(((X) this.f9748a.get(i12)).f9753a);
            if (compareTo2 < 0) {
                i10 = i12 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i12;
                }
                i11 = i12 + 1;
            }
        }
        i3 = i11 + 1;
        return -i3;
    }

    public final void b() {
        if (this.f9750c) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i3) {
        return (Map.Entry) this.f9748a.get(i3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f9748a.isEmpty()) {
            this.f9748a.clear();
        }
        if (this.f9749b.isEmpty()) {
            return;
        }
        this.f9749b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f9749b.containsKey(comparable);
    }

    public final Set d() {
        return this.f9749b.isEmpty() ? Collections.EMPTY_SET : this.f9749b.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f9749b.isEmpty() && !(this.f9749b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f9749b = treeMap;
            this.f9752e = treeMap.descendingMap();
        }
        return (SortedMap) this.f9749b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f9751d == null) {
            this.f9751d = new Z(this, 0);
        }
        return this.f9751d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return super.equals(obj);
        }
        W w10 = (W) obj;
        int size = size();
        if (size == w10.size()) {
            int size2 = this.f9748a.size();
            if (size2 != w10.f9748a.size()) {
                return ((AbstractSet) entrySet()).equals(w10.entrySet());
            }
            for (int i3 = 0; i3 < size2; i3++) {
                if (c(i3).equals(w10.c(i3))) {
                }
            }
            if (size2 != size) {
                return this.f9749b.equals(w10.f9749b);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int a3 = a(comparable);
        if (a3 >= 0) {
            return ((X) this.f9748a.get(a3)).setValue(obj);
        }
        b();
        if (this.f9748a.isEmpty() && !(this.f9748a instanceof ArrayList)) {
            this.f9748a = new ArrayList(16);
        }
        int i3 = -(a3 + 1);
        if (i3 >= 16) {
            return e().put(comparable, obj);
        }
        if (this.f9748a.size() == 16) {
            X x7 = (X) this.f9748a.remove(15);
            e().put(x7.f9753a, x7.f9754b);
        }
        this.f9748a.add(i3, new X(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a3 = a(comparable);
        return a3 >= 0 ? ((X) this.f9748a.get(a3)).f9754b : this.f9749b.get(comparable);
    }

    public final Object h(int i3) {
        b();
        Object obj = ((X) this.f9748a.remove(i3)).f9754b;
        if (!this.f9749b.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f9748a;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new X(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f9748a.size();
        int i3 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i3 += ((X) this.f9748a.get(i10)).hashCode();
        }
        return this.f9749b.size() > 0 ? this.f9749b.hashCode() + i3 : i3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a3 = a(comparable);
        if (a3 >= 0) {
            return h(a3);
        }
        if (this.f9749b.isEmpty()) {
            return null;
        }
        return this.f9749b.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f9749b.size() + this.f9748a.size();
    }
}
