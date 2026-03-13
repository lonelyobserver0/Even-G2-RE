package T;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class Y extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public N f6823a;

    /* renamed from: b, reason: collision with root package name */
    public int f6824b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Z f6825c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(Z z2, Continuation continuation) {
        super(2, continuation);
        this.f6825c = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Y(this.f6825c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Y) create((Qb.I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0057, code lost:
    
        if (r1.invoke(r7, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0059, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004b, code lost:
    
        if (r7 != r0) goto L15;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0057 -> B:6:0x005a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f6824b
            r2 = 2
            r3 = 1
            T.Z r4 = r6.f6825c
            if (r1 == 0) goto L27
            if (r1 == r3) goto L21
            if (r1 != r2) goto L14
            kotlin.ResultKt.throwOnFailure(r7)
            goto L5a
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r0 = 275(0x113, float:3.85E-43)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r7.<init>(r0)
            throw r7
        L21:
            T.N r1 = r6.f6823a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L4e
        L27:
            kotlin.ResultKt.throwOnFailure(r7)
            F5.c r7 = r4.f6829d
            java.lang.Object r7 = r7.f2238b
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            int r7 = r7.get()
            if (r7 <= 0) goto L69
        L36:
            Qb.I r7 = r4.f6826a
            kotlin.coroutines.CoroutineContext r7 = r7.h()
            Qb.L.g(r7)
            T.N r1 = r4.f6827b
            Sb.e r7 = r4.f6828c
            r6.f6823a = r1
            r6.f6824b = r3
            java.lang.Object r7 = r7.f(r6)
            if (r7 != r0) goto L4e
            goto L59
        L4e:
            r5 = 0
            r6.f6823a = r5
            r6.f6824b = r2
            java.lang.Object r7 = r1.invoke(r7, r6)
            if (r7 != r0) goto L5a
        L59:
            return r0
        L5a:
            F5.c r7 = r4.f6829d
            java.lang.Object r7 = r7.f2238b
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            int r7 = r7.decrementAndGet()
            if (r7 != 0) goto L36
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L69:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r0 = 6068(0x17b4, float:8.503E-42)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: T.Y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
