package Ia;

import com.stub.StubApp;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final int f3245a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f3246b;

    public c(d dVar, int i3) {
        this.f3246b = dVar;
        this.f3245a = i3;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return getKey().equals(cVar.getKey()) && getValue().equals(cVar.getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f3246b.f3247a[this.f3245a];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f3246b.f3247a[this.f3245a + 1];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return getKey().hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null) {
            throw new NullPointerException(StubApp.getString2(2885));
        }
        Object value = getValue();
        this.f3246b.f3247a[this.f3245a + 1] = obj;
        return value;
    }
}
