package Vb;

import Qb.AbstractRunnableC0192e0;
import Qb.C0194f0;
import com.stub.StubApp;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class C {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f7927b = AtomicIntegerFieldUpdater.newUpdater(C.class, StubApp.getString2(1246));

    @Volatile
    private volatile int _size;

    /* renamed from: a, reason: collision with root package name */
    public AbstractRunnableC0192e0[] f7928a;

    public final void a(AbstractRunnableC0192e0 abstractRunnableC0192e0) {
        abstractRunnableC0192e0.c((C0194f0) this);
        AbstractRunnableC0192e0[] abstractRunnableC0192e0Arr = this.f7928a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7927b;
        if (abstractRunnableC0192e0Arr == null) {
            abstractRunnableC0192e0Arr = new AbstractRunnableC0192e0[4];
            this.f7928a = abstractRunnableC0192e0Arr;
        } else if (atomicIntegerFieldUpdater.get(this) >= abstractRunnableC0192e0Arr.length) {
            Object[] copyOf = Arrays.copyOf(abstractRunnableC0192e0Arr, atomicIntegerFieldUpdater.get(this) * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            abstractRunnableC0192e0Arr = (AbstractRunnableC0192e0[]) copyOf;
            this.f7928a = abstractRunnableC0192e0Arr;
        }
        int i3 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i3 + 1);
        abstractRunnableC0192e0Arr[i3] = abstractRunnableC0192e0;
        abstractRunnableC0192e0.f5862b = i3;
        c(i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Qb.AbstractRunnableC0192e0 b(int r9) {
        /*
            r8 = this;
            Qb.e0[] r0 = r8.f7928a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = Vb.C.f7927b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.d(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r5 = r0[r2]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.d(r9, r2)
            r8.c(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            Qb.e0[] r5 = r8.f7928a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            r7 = r5[r4]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r5 = r5[r2]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.d(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
            r2 = 0
            r9.c(r2)
            r9.f5862b = r3
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Vb.C.b(int):Qb.e0");
    }

    public final void c(int i3) {
        while (i3 > 0) {
            AbstractRunnableC0192e0[] abstractRunnableC0192e0Arr = this.f7928a;
            Intrinsics.checkNotNull(abstractRunnableC0192e0Arr);
            int i10 = (i3 - 1) / 2;
            AbstractRunnableC0192e0 abstractRunnableC0192e0 = abstractRunnableC0192e0Arr[i10];
            Intrinsics.checkNotNull(abstractRunnableC0192e0);
            AbstractRunnableC0192e0 abstractRunnableC0192e02 = abstractRunnableC0192e0Arr[i3];
            Intrinsics.checkNotNull(abstractRunnableC0192e02);
            if (abstractRunnableC0192e0.compareTo(abstractRunnableC0192e02) <= 0) {
                return;
            }
            d(i3, i10);
            i3 = i10;
        }
    }

    public final void d(int i3, int i10) {
        AbstractRunnableC0192e0[] abstractRunnableC0192e0Arr = this.f7928a;
        Intrinsics.checkNotNull(abstractRunnableC0192e0Arr);
        AbstractRunnableC0192e0 abstractRunnableC0192e0 = abstractRunnableC0192e0Arr[i10];
        Intrinsics.checkNotNull(abstractRunnableC0192e0);
        AbstractRunnableC0192e0 abstractRunnableC0192e02 = abstractRunnableC0192e0Arr[i3];
        Intrinsics.checkNotNull(abstractRunnableC0192e02);
        abstractRunnableC0192e0Arr[i3] = abstractRunnableC0192e0;
        abstractRunnableC0192e0Arr[i10] = abstractRunnableC0192e02;
        abstractRunnableC0192e0.f5862b = i3;
        abstractRunnableC0192e02.f5862b = i10;
    }
}
