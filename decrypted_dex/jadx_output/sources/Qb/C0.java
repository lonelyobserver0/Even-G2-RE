package Qb;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0 extends RestrictedSuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Vb.k f5803a;

    /* renamed from: b, reason: collision with root package name */
    public C0211o f5804b;

    /* renamed from: c, reason: collision with root package name */
    public int f5805c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f5806d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ D0 f5807e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0(D0 d02, Continuation continuation) {
        super(2, continuation);
        this.f5807e = d02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C0 c02 = new C0(this.f5807e, continuation);
        c02.f5806d = obj;
        return c02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0) create((SequenceScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0082, code lost:
    
        if (r4.yield(r7, r6) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0084, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        if (r7.yield(r1, r6) == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x006c -> B:6:0x0085). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0082 -> B:6:0x0085). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f5805c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2b
            if (r1 == r3) goto L27
            if (r1 != r2) goto L1a
            Qb.o r1 = r6.f5804b
            Vb.k r3 = r6.f5803a
            java.lang.Object r4 = r6.f5806d
            kotlin.sequences.SequenceScope r4 = (kotlin.sequences.SequenceScope) r4
            kotlin.ResultKt.throwOnFailure(r7)
            goto L85
        L1a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r0 = 275(0x113, float:3.85E-43)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r7.<init>(r0)
            throw r7
        L27:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L8a
        L2b:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Object r7 = r6.f5806d
            kotlin.sequences.SequenceScope r7 = (kotlin.sequences.SequenceScope) r7
            Qb.D0 r1 = r6.f5807e
            java.lang.Object r1 = r1.E()
            boolean r4 = r1 instanceof Qb.C0211o
            if (r4 == 0) goto L49
            Qb.o r1 = (Qb.C0211o) r1
            Qb.D0 r1 = r1.f5883e
            r6.f5805c = r3
            java.lang.Object r7 = r7.yield(r1, r6)
            if (r7 != r0) goto L8a
            goto L84
        L49:
            boolean r3 = r1 instanceof Qb.InterfaceC0212o0
            if (r3 == 0) goto L8a
            Qb.o0 r1 = (Qb.InterfaceC0212o0) r1
            Qb.G0 r1 = r1.c()
            if (r1 == 0) goto L8a
            java.lang.Object r3 = r1.f()
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r4)
            Vb.m r3 = (Vb.m) r3
            r4 = r3
            r3 = r1
            r1 = r4
            r4 = r7
        L64:
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r7 != 0) goto L8a
            boolean r7 = r1 instanceof Qb.C0211o
            if (r7 == 0) goto L85
            r7 = r1
            Qb.o r7 = (Qb.C0211o) r7
            Qb.D0 r7 = r7.f5883e
            r6.f5806d = r4
            r6.f5803a = r3
            r5 = r1
            Qb.o r5 = (Qb.C0211o) r5
            r6.f5804b = r5
            r6.f5805c = r2
            java.lang.Object r7 = r4.yield(r7, r6)
            if (r7 != r0) goto L85
        L84:
            return r0
        L85:
            Vb.m r1 = r1.g()
            goto L64
        L8a:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Qb.C0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
