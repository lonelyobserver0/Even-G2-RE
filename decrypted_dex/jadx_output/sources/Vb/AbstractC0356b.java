package Vb;

import com.stub.StubApp;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.Volatile;

/* renamed from: Vb.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class AbstractC0356b extends r {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f7936a = AtomicReferenceFieldUpdater.newUpdater(AbstractC0356b.class, Object.class, StubApp.getString2(25754));

    @Volatile
    private volatile Object _consensus = AbstractC0355a.f7932a;

    @Override // Vb.r
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7936a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        F5.c cVar = AbstractC0355a.f7932a;
        if (obj2 == cVar) {
            F5.c c10 = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == cVar) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, cVar, c10)) {
                        obj2 = c10;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != cVar) {
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        break;
                    }
                }
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public abstract F5.c c(Object obj);
}
