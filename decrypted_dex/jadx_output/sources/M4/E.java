package M4;

import java.io.Serializable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class E extends AbstractC0142m implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4541a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4542b;

    public E(Object obj, Object obj2) {
        this.f4541a = obj;
        this.f4542b = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4541a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f4542b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
