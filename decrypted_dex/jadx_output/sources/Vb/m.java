package Vb;

import Qb.L;
import com.stub.StubApp;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f7956a = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, StubApp.getString2(25757));

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f7957b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, StubApp.getString2(25758));

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f7958c = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, StubApp.getString2(25765));

    @Volatile
    private volatile Object _next = this;

    @Volatile
    private volatile Object _prev = this;

    @Volatile
    private volatile Object _removedRef;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        r6 = ((Vb.s) r6).f7969a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r5.get(r4) == r3) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Vb.m d() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Vb.m.f7957b
            java.lang.Object r1 = r0.get(r9)
            Vb.m r1 = (Vb.m) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = Vb.m.f7956a
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            goto L2d
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
            goto L2d
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.h()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            if (r6 != 0) goto L2e
        L2d:
            return r3
        L2e:
            boolean r7 = r6 instanceof Vb.r
            if (r7 == 0) goto L38
            Vb.r r6 = (Vb.r) r6
            r6.a(r3)
            goto L0
        L38:
            boolean r7 = r6 instanceof Vb.s
            if (r7 == 0) goto L58
            if (r4 == 0) goto L51
            Vb.s r6 = (Vb.s) r6
            Vb.m r6 = r6.f7969a
        L42:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L4a
            r3 = r4
            goto La
        L4a:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L42
            goto L0
        L51:
            java.lang.Object r3 = r0.get(r3)
            Vb.m r3 = (Vb.m) r3
            goto Lb
        L58:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6, r4)
            r4 = r6
            Vb.m r4 = (Vb.m) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Vb.m.d():Vb.m");
    }

    public final void e(m mVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7957b;
            m mVar2 = (m) atomicReferenceFieldUpdater.get(mVar);
            if (f() != mVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(mVar, mVar2, this)) {
                if (atomicReferenceFieldUpdater.get(mVar) != mVar2) {
                    break;
                }
            }
            if (h()) {
                mVar.d();
                return;
            }
            return;
        }
    }

    public final Object f() {
        while (true) {
            Object obj = f7956a.get(this);
            if (!(obj instanceof r)) {
                return obj;
            }
            ((r) obj).a(this);
        }
    }

    public final m g() {
        m mVar;
        Object f10 = f();
        s sVar = f10 instanceof s ? (s) f10 : null;
        if (sVar != null && (mVar = sVar.f7969a) != null) {
            return mVar;
        }
        Intrinsics.checkNotNull(f10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (m) f10;
    }

    public boolean h() {
        return f() instanceof s;
    }

    public String toString() {
        return new l(this, L.class, StubApp.getString2(25767), StubApp.getString2(25766), 1) + '@' + L.h(this);
    }
}
