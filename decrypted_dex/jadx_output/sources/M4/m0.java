package M4;

import java.util.Iterator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class m0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f4637a;

    public m0(Iterator it) {
        it.getClass();
        this.f4637a = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4637a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f4637a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f4637a.remove();
    }
}
