package Tb;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class W extends SuspendLambda implements Function3 {

    /* renamed from: a, reason: collision with root package name */
    public int f7324a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ InterfaceC0328i f7325b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ int f7326c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y f7327d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(Y y10, Continuation continuation) {
        super(3, continuation);
        this.f7327d = y10;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        W w10 = new W(this.f7327d, (Continuation) obj3);
        w10.f7325b = (InterfaceC0328i) obj;
        w10.f7326c = intValue;
        return w10.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007d, code lost:
    
        if (r1.a(r9, r8) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (Qb.S.a(0, r8) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        if (r9.a(r1, r8) == r0) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f7324a
            r2 = 0
            r4 = 5
            r5 = 2
            r6 = 1
            Tb.Y r7 = r8.f7327d
            if (r1 == 0) goto L4c
            if (r1 == r6) goto L48
            if (r1 == r5) goto L42
            r5 = 4
            r6 = 3
            if (r1 == r6) goto L2f
            if (r1 == r5) goto L29
            if (r1 != r4) goto L1c
            goto L48
        L1c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r0 = 275(0x113, float:3.85E-43)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r9.<init>(r0)
            throw r9
        L29:
            Tb.i r1 = r8.f7325b
            kotlin.ResultKt.throwOnFailure(r9)
            goto L72
        L2f:
            Tb.i r1 = r8.f7325b
            kotlin.ResultKt.throwOnFailure(r9)
            r7.getClass()
            r8.f7325b = r1
            r8.f7324a = r5
            java.lang.Object r9 = Qb.S.a(r2, r8)
            if (r9 != r0) goto L72
            goto L7f
        L42:
            Tb.i r1 = r8.f7325b
            kotlin.ResultKt.throwOnFailure(r9)
            goto L6f
        L48:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L80
        L4c:
            kotlin.ResultKt.throwOnFailure(r9)
            Tb.i r9 = r8.f7325b
            int r1 = r8.f7326c
            if (r1 <= 0) goto L60
            Tb.T r1 = Tb.T.f7315a
            r8.f7324a = r6
            java.lang.Object r9 = r9.a(r1, r8)
            if (r9 != r0) goto L80
            goto L7f
        L60:
            r7.getClass()
            r8.f7325b = r9
            r8.f7324a = r5
            java.lang.Object r1 = Qb.S.a(r2, r8)
            if (r1 != r0) goto L6e
            goto L7f
        L6e:
            r1 = r9
        L6f:
            r7.getClass()
        L72:
            Tb.T r9 = Tb.T.f7316b
            r2 = 0
            r8.f7325b = r2
            r8.f7324a = r4
            java.lang.Object r9 = r1.a(r9, r8)
            if (r9 != r0) goto L80
        L7f:
            return r0
        L80:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Tb.W.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
