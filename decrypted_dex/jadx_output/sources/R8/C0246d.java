package R8;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: R8.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0246d extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6282a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f6283b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A3.s f6284c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f6285d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0246d(boolean z2, A3.s sVar, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f6283b = z2;
        this.f6284c = sVar;
        this.f6285d = (SuspendLambda) function1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0246d(this.f6283b, this.f6284c, this.f6285d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0246d) create((Qb.I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
    
        if (r8.invoke(r7) == r0) goto L32;
     */
    /* JADX WARN: Type inference failed for: r8v13, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f6282a
            r2 = 3
            r3 = 1
            A3.s r4 = r7.f6284c
            r5 = 2
            if (r1 == 0) goto L2a
            if (r1 == r3) goto L26
            if (r1 == r5) goto L26
            if (r1 != r2) goto L19
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.util.concurrent.CancellationException -> L17
            goto L6e
        L17:
            r8 = move-exception
            goto L71
        L19:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r0 = 275(0x113, float:3.85E-43)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r8.<init>(r0)
            throw r8
        L26:
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.util.concurrent.CancellationException -> L17
            goto L63
        L2a:
            kotlin.ResultKt.throwOnFailure(r8)
            boolean r8 = r7.f6283b     // Catch: java.util.concurrent.CancellationException -> L17
            if (r8 == 0) goto L49
            java.lang.Object r8 = r4.f190b     // Catch: java.util.concurrent.CancellationException -> L17
            Lc.e r8 = (Lc.e) r8     // Catch: java.util.concurrent.CancellationException -> L17
            r7.f6282a = r3     // Catch: java.util.concurrent.CancellationException -> L17
            long r5 = r8.f4405b     // Catch: java.util.concurrent.CancellationException -> L17
            java.lang.Object r8 = r8.a(r5, r7)     // Catch: java.util.concurrent.CancellationException -> L17
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: java.util.concurrent.CancellationException -> L17
            if (r8 != r1) goto L44
            goto L46
        L44:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch: java.util.concurrent.CancellationException -> L17
        L46:
            if (r8 != r0) goto L63
            goto L6d
        L49:
            java.lang.Object r8 = r4.f190b     // Catch: java.util.concurrent.CancellationException -> L17
            Lc.e r8 = (Lc.e) r8     // Catch: java.util.concurrent.CancellationException -> L17
            r7.f6282a = r5     // Catch: java.util.concurrent.CancellationException -> L17
            long r5 = r8.f4404a     // Catch: java.util.concurrent.CancellationException -> L17
            r8.f4405b = r5     // Catch: java.util.concurrent.CancellationException -> L17
            java.lang.Object r8 = r8.a(r5, r7)     // Catch: java.util.concurrent.CancellationException -> L17
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: java.util.concurrent.CancellationException -> L17
            if (r8 != r1) goto L5e
            goto L60
        L5e:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch: java.util.concurrent.CancellationException -> L17
        L60:
            if (r8 != r0) goto L63
            goto L6d
        L63:
            kotlin.coroutines.jvm.internal.SuspendLambda r8 = r7.f6285d     // Catch: java.util.concurrent.CancellationException -> L17
            r7.f6282a = r2     // Catch: java.util.concurrent.CancellationException -> L17
            java.lang.Object r8 = r8.invoke(r7)     // Catch: java.util.concurrent.CancellationException -> L17
            if (r8 != r0) goto L6e
        L6d:
            return r0
        L6e:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L71:
            java.lang.Object r0 = r4.f191c
            Z9.C r0 = (Z9.C) r0
            java.lang.Object r1 = r0.f9078c
            R8.j r1 = (R8.j) r1
            r2 = 0
            if (r1 == 0) goto L7f
            java.lang.String r1 = r1.f6303a
            goto L80
        L7f:
            r1 = r2
        L80:
            java.lang.String r3 = "STARTED"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 == 0) goto L92
            r1 = 5767(0x1687, float:8.081E-42)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            r0.n(r1, r2)
        L92:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: R8.C0246d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
