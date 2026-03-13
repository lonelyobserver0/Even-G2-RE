package Vb;

import Qb.I0;
import com.stub.StubApp;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.Volatile;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class v extends e implements I0 {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f7971d = AtomicIntegerFieldUpdater.newUpdater(v.class, StubApp.getString2(25774));

    /* renamed from: c, reason: collision with root package name */
    public final long f7972c;

    @Volatile
    private volatile int cleanedAndPointers;

    public v(long j, v vVar, int i3) {
        super(vVar);
        this.f7972c = j;
        this.cleanedAndPointers = i3 << 16;
    }

    @Override // Vb.e
    public final boolean c() {
        return f7971d.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f7971d.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i3, CoroutineContext coroutineContext);

    public final void h() {
        if (f7971d.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f7971d;
            i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, PKIFailureInfo.notAuthorized + i3));
        return true;
    }
}
