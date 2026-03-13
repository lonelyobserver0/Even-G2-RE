package T;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class P extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Ref.IntRef f6791a;

    /* renamed from: b, reason: collision with root package name */
    public int f6792b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f6793c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f6794d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Q f6795e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6796f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f6797g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(Ref.IntRef intRef, Q q10, Object obj, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.f6794d = intRef;
        this.f6795e = q10;
        this.f6796f = obj;
        this.f6797g = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        P p8 = new P(this.f6794d, this.f6795e, this.f6796f, this.f6797g, continuation);
        p8.f6793c = obj;
        return p8;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((P) create((V.j) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        if (r6.b(r3, r7) == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f6792b
            kotlin.jvm.internal.Ref$IntRef r2 = r7.f6794d
            java.lang.Object r3 = r7.f6796f
            T.Q r4 = r7.f6795e
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L2f
            if (r1 == r6) goto L25
            if (r1 != r5) goto L18
            kotlin.ResultKt.throwOnFailure(r8)
            goto L6a
        L18:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r0 = 275(0x113, float:3.85E-43)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r8.<init>(r0)
            throw r8
        L25:
            kotlin.jvm.internal.Ref$IntRef r1 = r7.f6791a
            java.lang.Object r6 = r7.f6793c
            V.j r6 = (V.j) r6
            kotlin.ResultKt.throwOnFailure(r8)
            goto L54
        L2f:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.Object r8 = r7.f6793c
            V.j r8 = (V.j) r8
            T.d0 r1 = r4.g()
            r7.f6793c = r8
            r7.f6791a = r2
            r7.f6792b = r6
            F5.c r1 = r1.f6843b
            java.lang.Object r1 = r1.f2238b
            java.util.concurrent.atomic.AtomicInteger r1 = (java.util.concurrent.atomic.AtomicInteger) r1
            int r1 = r1.incrementAndGet()
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r1)
            if (r1 != r0) goto L51
            goto L69
        L51:
            r6 = r8
            r8 = r1
            r1 = r2
        L54:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r1.element = r8
            r8 = 0
            r7.f6793c = r8
            r7.f6791a = r8
            r7.f6792b = r5
            java.lang.Object r8 = r6.b(r3, r7)
            if (r8 != r0) goto L6a
        L69:
            return r0
        L6a:
            boolean r8 = r7.f6797g
            if (r8 == 0) goto L82
            Z9.q r8 = r4.f6805h
            T.d r0 = new T.d
            if (r3 == 0) goto L79
            int r1 = r3.hashCode()
            goto L7a
        L79:
            r1 = 0
        L7a:
            int r2 = r2.element
            r0.<init>(r1, r2, r3)
            r8.K(r0)
        L82:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: T.P.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
