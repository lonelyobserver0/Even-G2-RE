package M4;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class k0 extends AbstractSet {
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        collection.getClass();
        boolean z2 = false;
        if (!(collection instanceof Set) || collection.size() <= size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                z2 |= remove(it.next());
            }
            return z2;
        }
        Iterator<E> it2 = iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                z2 = true;
            }
        }
        return z2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}
