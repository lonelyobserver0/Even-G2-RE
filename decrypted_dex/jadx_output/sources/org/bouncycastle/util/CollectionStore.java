package org.bouncycastle.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CollectionStore<T> implements Store<T>, Iterable<T> {
    private Collection<T> _local;

    public CollectionStore(Collection<T> collection) {
        this._local = new ArrayList(collection);
    }

    @Override // org.bouncycastle.util.Store
    public Collection<T> getMatches(Selector<T> selector) {
        if (selector == null) {
            return new ArrayList(this._local);
        }
        ArrayList arrayList = new ArrayList();
        for (T t3 : this._local) {
            if (selector.match(t3)) {
                arrayList.add(t3);
            }
        }
        return arrayList;
    }

    @Override // org.bouncycastle.util.Iterable, java.lang.Iterable
    public Iterator<T> iterator() {
        return getMatches(null).iterator();
    }
}
