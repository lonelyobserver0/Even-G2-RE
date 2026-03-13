package m8;

import Qb.I;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class m extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Object f17185a;

    /* renamed from: b, reason: collision with root package name */
    public int f17186b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f17187c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(r rVar, Continuation continuation) {
        super(2, continuation);
        this.f17187c = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new m(this.f17187c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00db, code lost:
    
        if (r9 == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00dd, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0078, code lost:
    
        if (r9 == r0) goto L32;
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
            int r1 = r8.f17186b
            r2 = 2
            m8.r r3 = r8.f17187c
            r4 = 1
            if (r1 == 0) goto L2e
            if (r1 == r4) goto L26
            if (r1 != r2) goto L19
            java.lang.Object r0 = r8.f17185a
            L8.c r0 = (L8.c) r0
            kotlin.ResultKt.throwOnFailure(r9)
            goto Lde
        L19:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r0 = 275(0x113, float:3.85E-43)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r9.<init>(r0)
            throw r9
        L26:
            java.lang.Object r1 = r8.f17185a
            m8.r r1 = (m8.r) r1
            kotlin.ResultKt.throwOnFailure(r9)
            goto L7b
        L2e:
            kotlin.ResultKt.throwOnFailure(r9)
            q8.d r9 = r3.f17228h
            java.util.List r9 = q8.AbstractC1526a.v(r9)
            int r9 = r9.size()
            if (r9 <= r4) goto L7b
            r8.f17185a = r3
            r8.f17186b = r4
            kotlin.coroutines.SafeContinuation r9 = new kotlin.coroutines.SafeContinuation
            kotlin.coroutines.Continuation r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r8)
            r9.<init>(r1)
            q8.d r1 = r3.f17228h
            java.util.List r5 = r1.a()
            java.util.List r5 = kotlin.collections.CollectionsKt.take(r5, r4)
            V8.q r6 = r3.f17229i
            P7.b r6 = r6.f7890v
            if (r6 == 0) goto L5f
            P7.a r1 = r6.f5566e
            int r1 = r1.f5553a
            goto L61
        L5f:
            int r1 = r1.f20093e
        L61:
            a0.a r6 = new a0.a
            r7 = 17
            r6.<init>(r9, r7)
            r3.k(r5, r1, r6)
            java.lang.Object r9 = r9.getOrThrow()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r9 != r1) goto L78
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r8)
        L78:
            if (r9 != r0) goto L7b
            goto Ldd
        L7b:
            B3.s r9 = r3.f17239t
            java.lang.Object r9 = r9.f653e
            L8.f r9 = (L8.f) r9
            r1 = 0
            if (r9 == 0) goto L87
            L8.c r9 = r9.f4318b
            goto L88
        L87:
            r9 = r1
        L88:
            if (r9 == 0) goto Lde
            java.util.List r5 = r9.f4299a
            int r5 = r5.size()
            if (r5 <= r4) goto Lde
            r8.f17185a = r9
            r8.f17186b = r2
            kotlin.coroutines.SafeContinuation r2 = new kotlin.coroutines.SafeContinuation
            kotlin.coroutines.Continuation r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r8)
            r2.<init>(r4)
            java.util.List r4 = r9.f4301c
            int r9 = r9.f4302d
            java.lang.Object r9 = r4.get(r9)
            java.util.List r9 = kotlin.collections.CollectionsKt.listOf(r9)
            Ac.m r4 = new Ac.m
            r5 = 18
            r4.<init>(r2, r5)
            B3.s r3 = r3.f17239t
            r3.getClass()
            java.lang.String r5 = "routesToPreview"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r5)
            java.lang.String r5 = "onCompleted"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            L8.d r5 = new L8.d
            r5.<init>(r3, r4, r9, r1)
            java.lang.Object r9 = r3.f650b
            Vb.f r9 = (Vb.f) r9
            r3 = 3
            Qb.L.j(r9, r1, r5, r3)
            java.lang.Object r9 = r2.getOrThrow()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r9 != r1) goto Ldb
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r8)
        Ldb:
            if (r9 != r0) goto Lde
        Ldd:
            return r0
        Lde:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: m8.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
