package A9;

import Qb.I;
import Z9.C;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class n extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Zb.a f242a;

    /* renamed from: b, reason: collision with root package name */
    public SuspendLambda f243b;

    /* renamed from: c, reason: collision with root package name */
    public int f244c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C f245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f246e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(C c10, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f245d = c10;
        this.f246e = (SuspendLambda) function1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new n(this.f245d, this.f246e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0044, code lost:
    
        if (r7.e(r6) == r0) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r3v2, types: [Zb.a] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f244c
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L2f
            if (r1 == r3) goto L24
            if (r1 != r2) goto L17
            Zb.a r0 = r6.f242a
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L15
            goto L55
        L15:
            r7 = move-exception
            goto L63
        L17:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r0 = 275(0x113, float:3.85E-43)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r7.<init>(r0)
            throw r7
        L24:
            kotlin.coroutines.jvm.internal.SuspendLambda r1 = r6.f243b
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            Zb.a r3 = r6.f242a
            kotlin.ResultKt.throwOnFailure(r7)
            r7 = r3
            goto L47
        L2f:
            kotlin.ResultKt.throwOnFailure(r7)
            Z9.C r7 = r6.f245d
            java.lang.Object r7 = r7.f9078c
            Zb.e r7 = (Zb.e) r7
            r6.f242a = r7
            kotlin.coroutines.jvm.internal.SuspendLambda r1 = r6.f246e
            r6.f243b = r1
            r6.f244c = r3
            java.lang.Object r3 = r7.e(r6)
            if (r3 != r0) goto L47
            goto L53
        L47:
            r6.f242a = r7     // Catch: java.lang.Throwable -> L5f
            r6.f243b = r4     // Catch: java.lang.Throwable -> L5f
            r6.f244c = r2     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r1 = r1.invoke(r6)     // Catch: java.lang.Throwable -> L5f
            if (r1 != r0) goto L54
        L53:
            return r0
        L54:
            r0 = r7
        L55:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L15
            Zb.e r0 = (Zb.e) r0
            r0.g(r4)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L5f:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L63:
            Zb.e r0 = (Zb.e) r0
            r0.g(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: A9.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
