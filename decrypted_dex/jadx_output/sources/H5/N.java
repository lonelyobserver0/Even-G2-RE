package H5;

import T.InterfaceC0294j;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import l4.E0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f2782a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0294j f2783b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f2784c;

    /* renamed from: d, reason: collision with root package name */
    public final Z9.C f2785d;

    public N(CoroutineContext backgroundDispatcher, InterfaceC0294j dataStore) {
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.f2782a = backgroundDispatcher;
        this.f2783b = dataStore;
        this.f2784c = new AtomicReference();
        this.f2785d = new Z9.C(12, new E0(25, dataStore.getData(), new I(3, null)), this);
        Qb.L.j(Qb.J.a(backgroundDispatcher), null, new G(this, null), 3);
    }
}
