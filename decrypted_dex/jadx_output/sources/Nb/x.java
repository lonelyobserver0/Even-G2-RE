package Nb;

import Qb.I;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class x extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5048a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Sb.e f5049b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f5050c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Sb.e eVar, p pVar, Continuation continuation) {
        super(2, continuation);
        this.f5049b = eVar;
        this.f5050c = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new x(this.f5049b, this.f5050c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r4.f5050c.invoke((Nb.k) r5, r4) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r5 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.f5048a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L23
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L12
            kotlin.ResultKt.throwOnFailure(r5)
            goto L3e
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r0 = 275(0x113, float:3.85E-43)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r5.<init>(r0)
            throw r5
        L1f:
            kotlin.ResultKt.throwOnFailure(r5)
            goto L31
        L23:
            kotlin.ResultKt.throwOnFailure(r5)
            r4.f5048a = r3
            Sb.e r5 = r4.f5049b
            java.lang.Object r5 = r5.f(r4)
            if (r5 != r0) goto L31
            goto L3d
        L31:
            Nb.k r5 = (Nb.k) r5
            r4.f5048a = r2
            Nb.p r1 = r4.f5050c
            java.lang.Object r5 = r1.invoke(r5, r4)
            if (r5 != r0) goto L3e
        L3d:
            return r0
        L3e:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Nb.x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
