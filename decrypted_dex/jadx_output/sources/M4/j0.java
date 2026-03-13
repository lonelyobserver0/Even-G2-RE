package M4;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class j0 extends i0 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f4626a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f4626a.iterator();
        it.getClass();
        L4.g gVar = this.f4627b;
        gVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (gVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new j0(((SortedSet) this.f4626a).headSet(obj), this.f4627b);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.f4626a;
        while (true) {
            Object last = sortedSet.last();
            if (this.f4627b.apply(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new j0(((SortedSet) this.f4626a).subSet(obj, obj2), this.f4627b);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new j0(((SortedSet) this.f4626a).tailSet(obj), this.f4627b);
    }
}
