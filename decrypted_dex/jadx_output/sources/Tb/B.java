package Tb;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class B extends SuspendLambda implements Function3 {

    /* renamed from: a, reason: collision with root package name */
    public int f7258a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ InterfaceC0328i f7259b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f7260c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ H f7261d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(H h2, Continuation continuation) {
        super(3, continuation);
        this.f7261d = h2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        B b2 = new B(this.f7261d, (Continuation) obj3);
        b2.f7259b = (InterfaceC0328i) obj;
        b2.f7260c = obj2;
        return b2.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r1.a(r5, r4) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
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
            int r1 = r4.f7258a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L25
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L12
            kotlin.ResultKt.throwOnFailure(r5)
            goto L45
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r0 = 275(0x113, float:3.85E-43)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r5.<init>(r0)
            throw r5
        L1f:
            Tb.i r1 = r4.f7259b
            kotlin.ResultKt.throwOnFailure(r5)
            goto L39
        L25:
            kotlin.ResultKt.throwOnFailure(r5)
            Tb.i r1 = r4.f7259b
            java.lang.Object r5 = r4.f7260c
            r4.f7259b = r1
            r4.f7258a = r3
            Tb.H r3 = r4.f7261d
            java.lang.Object r5 = r3.invoke(r5, r4)
            if (r5 != r0) goto L39
            goto L44
        L39:
            r3 = 0
            r4.f7259b = r3
            r4.f7258a = r2
            java.lang.Object r5 = r1.a(r5, r4)
            if (r5 != r0) goto L45
        L44:
            return r0
        L45:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Tb.B.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
