package M4;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class T extends AbstractSequentialList implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractCollection f4569a;

    /* renamed from: b, reason: collision with root package name */
    public final L4.e f4570b;

    /* JADX WARN: Multi-variable type inference failed */
    public T(List list, L4.e eVar) {
        list.getClass();
        this.f4569a = (AbstractCollection) list;
        this.f4570b = eVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f4569a.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i3) {
        return new Q(this, this.f4569a.listIterator(i3), 1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList
    public final void removeRange(int i3, int i10) {
        this.f4569a.subList(i3, i10).clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4569a.size();
    }
}
