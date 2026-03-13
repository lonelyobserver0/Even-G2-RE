package T;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class I extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6769a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q f6770b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(Q q10, Continuation continuation) {
        super(2, continuation);
        this.f6770b = q10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new I(this.f6770b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((I) create((Qb.I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r6 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (r4.h(r5) == r0) goto L22;
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
            int r1 = r5.f6769a
            r2 = 2
            r3 = 1
            T.Q r4 = r5.f6770b
            if (r1 == 0) goto L27
            if (r1 == r3) goto L21
            if (r1 != r2) goto L14
            kotlin.ResultKt.throwOnFailure(r6)
            goto L4e
        L14:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r0 = 275(0x113, float:3.85E-43)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r6.<init>(r0)
            throw r6
        L21:
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L25
            goto L44
        L25:
            r6 = move-exception
            goto L51
        L27:
            kotlin.ResultKt.throwOnFailure(r6)
            Z9.q r6 = r4.f6805h
            T.e0 r6 = r6.u()
            boolean r6 = r6 instanceof T.S
            if (r6 == 0) goto L3b
            Z9.q r6 = r4.f6805h
            T.e0 r6 = r6.u()
            return r6
        L3b:
            r5.f6769a = r3     // Catch: java.lang.Throwable -> L25
            java.lang.Object r6 = r4.h(r5)     // Catch: java.lang.Throwable -> L25
            if (r6 != r0) goto L44
            goto L4d
        L44:
            r5.f6769a = r2
            r6 = 0
            java.lang.Object r6 = T.Q.e(r4, r6, r5)
            if (r6 != r0) goto L4e
        L4d:
            return r0
        L4e:
            T.e0 r6 = (T.e0) r6
            return r6
        L51:
            T.V r0 = new T.V
            r1 = -1
            r0.<init>(r6, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: T.I.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
