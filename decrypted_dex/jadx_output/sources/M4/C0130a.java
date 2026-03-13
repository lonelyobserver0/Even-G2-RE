package M4;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: M4.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0130a implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f4581a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4582b = null;

    /* renamed from: c, reason: collision with root package name */
    public Collection f4583c = null;

    /* renamed from: d, reason: collision with root package name */
    public Iterator f4584d = O.f4561a;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ W f4585e;

    public C0130a(W w10) {
        this.f4585e = w10;
        this.f4581a = w10.f4572d.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4581a.hasNext() || this.f4584d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f4584d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f4581a.next();
            this.f4582b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f4583c = collection;
            this.f4584d = collection.iterator();
        }
        return this.f4584d.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f4584d.remove();
        Collection collection = this.f4583c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f4581a.remove();
        }
        W w10 = this.f4585e;
        w10.f4573e--;
    }
}
