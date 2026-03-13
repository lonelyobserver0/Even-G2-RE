package A9;

import android.util.LruCache;
import kotlin.jvm.functions.Function3;
import l4.E0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h implements Function3 {

    /* renamed from: a, reason: collision with root package name */
    public final E0 f235a;

    public h(Zb.d dVar, LruCache lruCache) {
        this.f235a = new E0(dVar, lruCache);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return this.f235a.E(new c(obj, obj2, obj3));
    }
}
