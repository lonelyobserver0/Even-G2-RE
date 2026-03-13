package T;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class K extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public Object f6774a;

    /* renamed from: b, reason: collision with root package name */
    public int f6775b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Q f6776c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f6777d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f6778e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public K(Q q10, CoroutineContext coroutineContext, Function2 function2, Continuation continuation) {
        super(1, continuation);
        this.f6776c = q10;
        this.f6777d = coroutineContext;
        this.f6778e = (SuspendLambda) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new K(this.f6776c, this.f6777d, this.f6778e, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((K) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        if (r9 == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003b, code lost:
    
        if (r9 == r0) goto L29;
     */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f6775b
            T.Q r2 = r8.f6776c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L32
            if (r1 == r5) goto L2e
            if (r1 == r4) goto L26
            if (r1 != r3) goto L19
            java.lang.Object r0 = r8.f6774a
            kotlin.ResultKt.throwOnFailure(r9)
            return r0
        L19:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r0 = 275(0x113, float:3.85E-43)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r9.<init>(r0)
            throw r9
        L26:
            java.lang.Object r1 = r8.f6774a
            T.d r1 = (T.C0288d) r1
            kotlin.ResultKt.throwOnFailure(r9)
            goto L56
        L2e:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L3e
        L32:
            kotlin.ResultKt.throwOnFailure(r9)
            r8.f6775b = r5
            java.lang.Object r9 = T.Q.f(r2, r5, r8)
            if (r9 != r0) goto L3e
            goto L76
        L3e:
            r1 = r9
            T.d r1 = (T.C0288d) r1
            T.J r9 = new T.J
            kotlin.coroutines.jvm.internal.SuspendLambda r6 = r8.f6778e
            r7 = 0
            r9.<init>(r6, r1, r7)
            r8.f6774a = r1
            r8.f6775b = r4
            kotlin.coroutines.CoroutineContext r4 = r8.f6777d
            java.lang.Object r9 = Qb.L.n(r4, r9, r8)
            if (r9 != r0) goto L56
            goto L76
        L56:
            java.lang.Object r4 = r1.f6840b
            if (r4 == 0) goto L5f
            int r4 = r4.hashCode()
            goto L60
        L5f:
            r4 = 0
        L60:
            int r6 = r1.f6841c
            if (r4 != r6) goto L78
            java.lang.Object r1 = r1.f6840b
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r9)
            if (r1 != 0) goto L77
            r8.f6774a = r9
            r8.f6775b = r3
            java.lang.Object r1 = r2.j(r9, r5, r8)
            if (r1 != r0) goto L77
        L76:
            return r0
        L77:
            return r9
        L78:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r0 = 6082(0x17c2, float:8.523E-42)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: T.K.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
