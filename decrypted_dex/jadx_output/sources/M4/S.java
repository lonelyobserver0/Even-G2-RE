package M4;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class S extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractCollection f4567a;

    /* renamed from: b, reason: collision with root package name */
    public final L4.e f4568b;

    /* JADX WARN: Multi-variable type inference failed */
    public S(List list, L4.e eVar) {
        list.getClass();
        this.f4567a = (AbstractCollection) list;
        this.f4568b = eVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        return this.f4568b.apply(this.f4567a.get(i3));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f4567a.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i3) {
        return new Q(this, this.f4567a.listIterator(i3), 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i3) {
        return this.f4568b.apply(this.f4567a.remove(i3));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList
    public final void removeRange(int i3, int i10) {
        this.f4567a.subList(i3, i10).clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4567a.size();
    }
}
