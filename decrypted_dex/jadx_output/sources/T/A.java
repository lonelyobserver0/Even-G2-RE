package T;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class A extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6730a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q f6731b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(Q q10, Continuation continuation) {
        super(2, continuation);
        this.f6731b = q10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new A(this.f6731b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((A) create((Qb.I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
    
        if (r6.p(r1, r5) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (r6 == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.f6730a
            T.Q r2 = r5.f6731b
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L25
            if (r1 == r4) goto L21
            if (r1 != r3) goto L14
            kotlin.ResultKt.throwOnFailure(r6)
            goto L5a
        L14:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r0 = 275(0x113, float:3.85E-43)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r6.<init>(r0)
            throw r6
        L21:
            kotlin.ResultKt.throwOnFailure(r6)
            goto L40
        L25:
            kotlin.ResultKt.throwOnFailure(r6)
            r5.f6730a = r4
            D5.B r6 = r2.f6806i
            java.lang.Object r6 = r6.f1341b
            Qb.q r6 = (Qb.C0215q) r6
            java.lang.Object r6 = r6.p(r5)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r6 != r1) goto L3b
            goto L3d
        L3b:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
        L3d:
            if (r6 != r0) goto L40
            goto L59
        L40:
            T.d0 r6 = r2.g()
            Z9.q r6 = r6.f6844c
            r1 = -1
            Tb.h r6 = Tb.Q.d(r6, r1)
            H5.F r1 = new H5.F
            r4 = 1
            r1.<init>(r2, r4)
            r5.f6730a = r3
            java.lang.Object r6 = r6.p(r1, r5)
            if (r6 != r0) goto L5a
        L59:
            return r0
        L5a:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: T.A.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
