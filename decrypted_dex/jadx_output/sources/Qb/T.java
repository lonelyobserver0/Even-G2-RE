package Qb;

import Vb.AbstractC0355a;
import com.stub.StubApp;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.Volatile;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class T extends Vb.u {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f5834e = AtomicIntegerFieldUpdater.newUpdater(T.class, StubApp.getString2(25491));

    @Volatile
    @JvmField
    private volatile int _decision;

    @Override // Vb.u, Qb.D0
    public final void n(Object obj) {
        o(obj);
    }

    @Override // Vb.u, Qb.D0
    public final void o(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f5834e;
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException(StubApp.getString2(25492));
                }
                AbstractC0355a.f(AbstractC0224v.a(obj), IntrinsicsKt.intercepted(this.f7970d));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
