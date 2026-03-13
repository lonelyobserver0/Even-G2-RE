package Tb;

import Qb.C0203k;
import Ub.AbstractC0346b;
import Ub.AbstractC0347c;
import Ub.AbstractC0348d;
import com.stub.StubApp;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class b0 extends AbstractC0346b implements K, InterfaceC0327h, Ub.r {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f7345f = AtomicReferenceFieldUpdater.newUpdater(b0.class, Object.class, StubApp.getString2(25450));

    @Volatile
    private volatile Object _state;

    /* renamed from: e, reason: collision with root package name */
    public int f7346e;

    public b0(Object obj) {
        this._state = obj;
    }

    @Override // Tb.InterfaceC0328i
    public final Object a(Object obj, Continuation continuation) {
        g(obj);
        return Unit.INSTANCE;
    }

    @Override // Ub.AbstractC0346b
    public final AbstractC0348d c() {
        return new c0();
    }

    @Override // Ub.AbstractC0346b
    public final AbstractC0348d[] d() {
        return new c0[2];
    }

    public final void g(Object obj) {
        if (obj == null) {
            obj = AbstractC0347c.f7577b;
        }
        h(null, obj);
    }

    public final boolean h(Object obj, Object obj2) {
        int i3;
        AbstractC0348d[] abstractC0348dArr;
        F5.c cVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7345f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !Intrinsics.areEqual(obj3, obj)) {
                return false;
            }
            if (Intrinsics.areEqual(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i10 = this.f7346e;
            if ((i10 & 1) != 0) {
                this.f7346e = i10 + 2;
                return true;
            }
            int i11 = i10 + 1;
            this.f7346e = i11;
            AbstractC0348d[] abstractC0348dArr2 = this.f7572a;
            Unit unit = Unit.INSTANCE;
            while (true) {
                c0[] c0VarArr = (c0[]) abstractC0348dArr2;
                if (c0VarArr != null) {
                    for (c0 c0Var : c0VarArr) {
                        if (c0Var != null) {
                            while (true) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = c0.f7349a;
                                Object obj4 = atomicReferenceFieldUpdater2.get(c0Var);
                                if (obj4 != null && obj4 != (cVar = Q.f7312c)) {
                                    F5.c cVar2 = Q.f7311b;
                                    if (obj4 != cVar2) {
                                        while (!atomicReferenceFieldUpdater2.compareAndSet(c0Var, obj4, cVar2)) {
                                            if (atomicReferenceFieldUpdater2.get(c0Var) != obj4) {
                                                break;
                                            }
                                        }
                                        Result.Companion companion = Result.INSTANCE;
                                        ((C0203k) obj4).resumeWith(Result.m40constructorimpl(Unit.INSTANCE));
                                        break;
                                    }
                                    while (!atomicReferenceFieldUpdater2.compareAndSet(c0Var, obj4, cVar)) {
                                        if (atomicReferenceFieldUpdater2.get(c0Var) != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i3 = this.f7346e;
                    if (i3 == i11) {
                        this.f7346e = i11 + 1;
                        return true;
                    }
                    abstractC0348dArr = this.f7572a;
                    Unit unit2 = Unit.INSTANCE;
                }
                abstractC0348dArr2 = abstractC0348dArr;
                i11 = i3;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0098, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r11, r12) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d8, code lost:
    
        if (r6.c(r0) == r1) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084 A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:14:0x0036, B:15:0x007c, B:17:0x0084, B:20:0x008b, B:21:0x0091, B:25:0x0094, B:27:0x00b5, B:30:0x00c8, B:33:0x009a, B:36:0x00a1, B:44:0x0054, B:46:0x005e, B:47:0x006d), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c8 A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #0 {all -> 0x003a, blocks: (B:14:0x0036, B:15:0x007c, B:17:0x0084, B:20:0x008b, B:21:0x0091, B:25:0x0094, B:27:0x00b5, B:30:0x00c8, B:33:0x009a, B:36:0x00a1, B:44:0x0054, B:46:0x005e, B:47:0x006d), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c7 -> B:15:0x007c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00d8 -> B:15:0x007c). Please report as a decompilation issue!!! */
    @Override // Tb.InterfaceC0327h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(Tb.InterfaceC0328i r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Tb.b0.p(Tb.i, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // Ub.r
    public final InterfaceC0327h s(CoroutineContext coroutineContext, int i3, int i10) {
        return (((i3 < 0 || i3 >= 2) && i3 != -2) || i10 != 2) ? Q.l(this, coroutineContext, i3, i10) : this;
    }
}
