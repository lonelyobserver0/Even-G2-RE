package Tb;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class I extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7282a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y f7283b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0327h f7284c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ P f7285d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(Y y10, InterfaceC0327h interfaceC0327h, P p8, Continuation continuation) {
        super(2, continuation);
        this.f7283b = y10;
        this.f7284c = interfaceC0327h;
        this.f7285d = p8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new I(this.f7283b, this.f7284c, this.f7285d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((I) create((Qb.I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0061, code lost:
    
        if (r3.p(r4, r18) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        if (r3.p(r4, r18) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        if (Tb.Q.j(r2, r6, r18) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bd, code lost:
    
        if (r2 == r1) goto L35;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f7282a
            Tb.h r3 = r0.f7284c
            Tb.P r4 = r0.f7285d
            r5 = 2
            r6 = 4
            r7 = 3
            r8 = 1
            if (r2 == 0) goto L31
            if (r2 == r8) goto L2c
            if (r2 == r5) goto L28
            if (r2 == r7) goto L2c
            if (r2 != r6) goto L1b
            goto L2c
        L1b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r2 = 275(0x113, float:3.85E-43)
            java.lang.String r2 = com.stub.StubApp.getString2(r2)
            r1.<init>(r2)
            throw r1
        L28:
            kotlin.ResultKt.throwOnFailure(r19)
            goto L5b
        L2c:
            kotlin.ResultKt.throwOnFailure(r19)
            goto Lc0
        L31:
            kotlin.ResultKt.throwOnFailure(r19)
            Tb.g r2 = Tb.V.f7322a
            Tb.Y r9 = r0.f7283b
            if (r9 != r2) goto L44
            r0.f7282a = r8
            java.lang.Object r2 = r3.p(r4, r0)
            if (r2 != r1) goto Lc0
            goto Lbf
        L44:
            Tb.g r2 = Tb.V.f7323b
            r8 = 0
            if (r9 != r2) goto L64
            Ub.B r2 = r4.f()
            Tb.G r6 = new Tb.G
            r6.<init>(r5, r8)
            r0.f7282a = r5
            java.lang.Object r2 = Tb.Q.j(r2, r6, r0)
            if (r2 != r1) goto L5b
            goto Lbf
        L5b:
            r0.f7282a = r7
            java.lang.Object r2 = r3.p(r4, r0)
            if (r2 != r1) goto Lc0
            goto Lbf
        L64:
            Ub.B r11 = r4.f()
            Tb.W r10 = new Tb.W
            r10.<init>(r9, r8)
            int r2 = Tb.C.f7262a
            Ub.o r9 = new Ub.o
            kotlin.coroutines.EmptyCoroutineContext r15 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            r13 = -2
            r14 = 1
            r12 = r15
            r9.<init>(r10, r11, r12, r13, r14)
            Tb.X r2 = new Tb.X
            r2.<init>(r5, r8)
            Z9.C r5 = new Z9.C
            r5.<init>(r9, r2)
            Tb.h r2 = Tb.Q.g(r5)
            Tb.h r14 = Tb.Q.g(r2)
            Tb.H r2 = new Tb.H
            r2.<init>(r3, r4, r8)
            r0.f7282a = r6
            Tb.B r13 = new Tb.B
            r13.<init>(r2, r8)
            Ub.o r12 = new Ub.o
            r16 = -2
            r17 = 1
            r12.<init>(r13, r14, r15, r16, r17)
            r2 = 0
            Tb.h r2 = Tb.Q.d(r12, r2)
            Ub.t r3 = Ub.t.f7614a
            java.lang.Object r2 = r2.p(r3, r0)
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r3) goto Lb2
            goto Lb4
        Lb2:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
        Lb4:
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r3) goto Lbb
            goto Lbd
        Lbb:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
        Lbd:
            if (r2 != r1) goto Lc0
        Lbf:
            return r1
        Lc0:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Tb.I.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
