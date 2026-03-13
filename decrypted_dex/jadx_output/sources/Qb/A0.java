package Qb;

import com.stub.StubApp;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class A0 implements InterfaceC0212o0 {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f5795b = AtomicIntegerFieldUpdater.newUpdater(A0.class, StubApp.getString2(25441));

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5796c = AtomicReferenceFieldUpdater.newUpdater(A0.class, Object.class, StubApp.getString2(25442));

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5797d = AtomicReferenceFieldUpdater.newUpdater(A0.class, Object.class, StubApp.getString2(25443));

    @Volatile
    private volatile Object _exceptionsHolder;

    @Volatile
    private volatile int _isCompleting = 0;

    @Volatile
    private volatile Object _rootCause;

    /* renamed from: a, reason: collision with root package name */
    public final G0 f5798a;

    public A0(G0 g02, Throwable th) {
        this.f5798a = g02;
        this._rootCause = th;
    }

    @Override // Qb.InterfaceC0212o0
    public final boolean a() {
        return d() == null;
    }

    public final void b(Throwable th) {
        Throwable d8 = d();
        if (d8 == null) {
            f5796c.set(this, th);
            return;
        }
        if (th == d8) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5797d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
                return;
            } else {
                throw new IllegalStateException((StubApp.getString2(25444) + obj).toString());
            }
        }
        if (th == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    @Override // Qb.InterfaceC0212o0
    public final G0 c() {
        return this.f5798a;
    }

    public final Throwable d() {
        return (Throwable) f5796c.get(this);
    }

    public final boolean e() {
        return d() != null;
    }

    public final boolean f() {
        return f5795b.get(this) != 0;
    }

    public final ArrayList g(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5797d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException((StubApp.getString2(25444) + obj).toString());
            }
            arrayList = (ArrayList) obj;
        }
        Throwable d8 = d();
        if (d8 != null) {
            arrayList.add(0, d8);
        }
        if (th != null && !Intrinsics.areEqual(th, d8)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, L.f5822h);
        return arrayList;
    }

    public final String toString() {
        return StubApp.getString2(25445) + e() + StubApp.getString2(25446) + f() + StubApp.getString2(25447) + d() + StubApp.getString2(25448) + f5797d.get(this) + StubApp.getString2(25449) + this.f5798a + ']';
    }
}
