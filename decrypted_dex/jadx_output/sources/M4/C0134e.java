package M4;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: M4.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class C0134e extends k0 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f4604a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W f4605b;

    public C0134e(W w10, Map map) {
        this.f4605b = w10;
        map.getClass();
        this.f4604a = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            C0132c c0132c = (C0132c) it;
            if (!c0132c.hasNext()) {
                return;
            }
            c0132c.next();
            c0132c.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f4604a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f4604a.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f4604a.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f4604a.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f4604a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0132c(this, this.f4604a.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i3;
        Collection collection = (Collection) this.f4604a.remove(obj);
        if (collection != null) {
            i3 = collection.size();
            collection.clear();
            this.f4605b.f4573e -= i3;
        } else {
            i3 = 0;
        }
        return i3 > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f4604a.size();
    }
}
