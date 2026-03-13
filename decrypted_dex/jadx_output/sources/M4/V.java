package M4;

import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class V implements L4.k, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final int f4571a;

    public V() {
        r.d(2, "expectedValuesPerKey");
        this.f4571a = 2;
    }

    @Override // L4.k
    public final Object get() {
        return new ArrayList(this.f4571a);
    }
}
