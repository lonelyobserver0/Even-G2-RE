package l4;

import com.stub.StubApp;
import java.util.Iterator;

/* renamed from: l4.t, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1211t implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f16628a;

    public C1211t(C1213u c1213u) {
        this.f16628a = c1213u.f16633a.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16628a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f16628a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException(StubApp.getString2(20906));
    }
}
