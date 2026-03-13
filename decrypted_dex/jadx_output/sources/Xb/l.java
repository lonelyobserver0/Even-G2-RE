package Xb;

import com.stub.StubApp;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.Volatile;
import org.bouncycastle.asn1.eac.CertificateBody;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8645b = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, StubApp.getString2(25947));

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f8646c = AtomicIntegerFieldUpdater.newUpdater(l.class, StubApp.getString2(25948));

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f8647d = AtomicIntegerFieldUpdater.newUpdater(l.class, StubApp.getString2(25949));

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f8648e = AtomicIntegerFieldUpdater.newUpdater(l.class, StubApp.getString2(25950));

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f8649a = new AtomicReferenceArray(128);

    @Volatile
    private volatile int blockingTasksInBuffer;

    @Volatile
    private volatile int consumerIndex;

    @Volatile
    private volatile Object lastScheduledTask;

    @Volatile
    private volatile int producerIndex;

    public final h a(h hVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f8646c;
        if (atomicIntegerFieldUpdater.get(this) - f8647d.get(this) == 127) {
            return hVar;
        }
        if (hVar.f8634b.f14746a == 1) {
            f8648e.incrementAndGet(this);
        }
        int i3 = atomicIntegerFieldUpdater.get(this) & CertificateBody.profileType;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f8649a;
            if (atomicReferenceArray.get(i3) == null) {
                atomicReferenceArray.lazySet(i3, hVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final h b() {
        h hVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f8647d;
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 - f8646c.get(this) == 0) {
                return null;
            }
            int i10 = i3 & CertificateBody.profileType;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i3, i3 + 1) && (hVar = (h) this.f8649a.getAndSet(i10, null)) != null) {
                if (hVar.f8634b.f14746a == 1) {
                    f8648e.decrementAndGet(this);
                }
                return hVar;
            }
        }
    }

    public final h c(int i3, boolean z2) {
        int i10 = i3 & CertificateBody.profileType;
        AtomicReferenceArray atomicReferenceArray = this.f8649a;
        h hVar = (h) atomicReferenceArray.get(i10);
        if (hVar != null) {
            if ((hVar.f8634b.f14746a == 1) == z2) {
                while (!atomicReferenceArray.compareAndSet(i10, hVar, null)) {
                    if (atomicReferenceArray.get(i10) != hVar) {
                    }
                }
                if (z2) {
                    f8648e.decrementAndGet(this);
                }
                return hVar;
            }
        }
        return null;
    }
}
