package M4;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: M4.g, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0136g extends C0139j implements NavigableSet {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ W f4620d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0136g(W w10, NavigableMap navigableMap) {
        super(w10, navigableMap);
        this.f4620d = w10;
    }

    @Override // M4.C0139j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final NavigableMap a() {
        return (NavigableMap) ((SortedMap) this.f4604a);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return a().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((C0134e) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new C0136g(this.f4620d, a().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return a().floorKey(obj);
    }

    @Override // M4.C0139j, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return a().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return a().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        C0132c c0132c = (C0132c) iterator();
        if (!c0132c.hasNext()) {
            return null;
        }
        Object next = c0132c.next();
        c0132c.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator descendingIterator = descendingIterator();
        if (!descendingIterator.hasNext()) {
            return null;
        }
        Object next = descendingIterator.next();
        descendingIterator.remove();
        return next;
    }

    @Override // M4.C0139j, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // M4.C0139j, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z2) {
        return new C0136g(this.f4620d, a().headMap(obj, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z2, Object obj2, boolean z10) {
        return new C0136g(this.f4620d, a().subMap(obj, z2, obj2, z10));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z2) {
        return new C0136g(this.f4620d, a().tailMap(obj, z2));
    }
}
