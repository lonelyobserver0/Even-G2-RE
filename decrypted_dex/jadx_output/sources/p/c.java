package p;

import com.stub.StubApp;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class c implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final Object f19591a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f19592b;

    /* renamed from: c, reason: collision with root package name */
    public c f19593c;

    /* renamed from: d, reason: collision with root package name */
    public c f19594d;

    public c(Object obj, Object obj2) {
        this.f19591a = obj;
        this.f19592b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f19591a.equals(cVar.f19591a) && this.f19592b.equals(cVar.f19592b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f19591a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f19592b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f19591a.hashCode() ^ this.f19592b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException(StubApp.getString2(22068));
    }

    public final String toString() {
        return this.f19591a + StubApp.getString2(2359) + this.f19592b;
    }
}
