package M4;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: M4.f, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0135f extends C0138i implements NavigableMap {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ W f4613g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0135f(W w10, NavigableMap navigableMap) {
        super(w10, navigableMap);
        this.f4613g = w10;
    }

    @Override // M4.C0138i
    public final SortedSet b() {
        return new C0136g(this.f4613g, d());
    }

    @Override // M4.C0138i
    /* renamed from: c */
    public final SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = d().ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return a(ceilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return d().ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new C0135f(this.f4613g, d().descendingMap());
    }

    public final E e(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection d8 = this.f4613g.d();
        d8.addAll((Collection) entry.getValue());
        it.remove();
        return new E(entry.getKey(), Collections.unmodifiableList((List) d8));
    }

    @Override // M4.C0138i
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final NavigableMap d() {
        return (NavigableMap) ((SortedMap) this.f4599c);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = d().firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return a(firstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = d().floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return a(floorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return d().floorKey(obj);
    }

    @Override // M4.C0138i, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = d().higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return a(higherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return d().higherKey(obj);
    }

    @Override // M4.C0138i, M4.C0133d, java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = d().lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return a(lastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = d().lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return a(lowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return d().lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return e(((C0131b) entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return e(((C0131b) ((C0133d) descendingMap()).entrySet()).iterator());
    }

    @Override // M4.C0138i, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // M4.C0138i, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z2) {
        return new C0135f(this.f4613g, d().headMap(obj, z2));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z2, Object obj2, boolean z10) {
        return new C0135f(this.f4613g, d().subMap(obj, z2, obj2, z10));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z2) {
        return new C0135f(this.f4613g, d().tailMap(obj, z2));
    }
}
