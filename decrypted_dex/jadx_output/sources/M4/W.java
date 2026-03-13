package M4;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class W extends AbstractC0144o implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final transient Map f4572d;

    /* renamed from: e, reason: collision with root package name */
    public transient int f4573e;

    /* renamed from: f, reason: collision with root package name */
    public transient V f4574f;

    public W(Map map) {
        if (!map.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.f4572d = map;
    }

    @Override // M4.AbstractC0144o
    public final Map a() {
        Map map = this.f4642c;
        if (map != null) {
            return map;
        }
        Map map2 = this.f4572d;
        Map c0135f = map2 instanceof NavigableMap ? new C0135f(this, (NavigableMap) map2) : map2 instanceof SortedMap ? new C0138i(this, (SortedMap) map2) : new C0133d(this, map2);
        this.f4642c = c0135f;
        return c0135f;
    }

    public final void c() {
        Map map = this.f4572d;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f4573e = 0;
    }

    public final Collection d() {
        return (List) this.f4574f.get();
    }
}
