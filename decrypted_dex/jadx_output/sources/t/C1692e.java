package t;

import androidx.datastore.preferences.protobuf.Z;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: t.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1692e extends C1697j implements Map {

    /* renamed from: d, reason: collision with root package name */
    public Z f21020d;

    /* renamed from: e, reason: collision with root package name */
    public C1689b f21021e;

    /* renamed from: f, reason: collision with root package name */
    public C1691d f21022f;

    public C1692e() {
        super(0);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        Z z2 = this.f21020d;
        if (z2 != null) {
            return z2;
        }
        Z z10 = new Z(this, 2);
        this.f21020d = z10;
        return z10;
    }

    public final boolean j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Collection collection) {
        int i3 = this.f21040c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i3 != this.f21040c;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C1689b c1689b = this.f21021e;
        if (c1689b != null) {
            return c1689b;
        }
        C1689b c1689b2 = new C1689b(this);
        this.f21021e = c1689b2;
        return c1689b2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f21040c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        C1691d c1691d = this.f21022f;
        if (c1691d != null) {
            return c1691d;
        }
        C1691d c1691d2 = new C1691d(this);
        this.f21022f = c1691d2;
        return c1691d2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1692e(C1697j map) {
        super(0);
        Intrinsics.checkNotNullParameter(map, "map");
        int i3 = map.f21040c;
        b(this.f21040c + i3);
        if (this.f21040c != 0) {
            for (int i10 = 0; i10 < i3; i10++) {
                put(map.f(i10), map.i(i10));
            }
        } else if (i3 > 0) {
            ArraysKt___ArraysJvmKt.copyInto(map.f21038a, this.f21038a, 0, 0, i3);
            ArraysKt___ArraysJvmKt.copyInto(map.f21039b, this.f21039b, 0, 0, i3 << 1);
            this.f21040c = i3;
        }
    }
}
