package xb;

import Qb.I;
import i5.C1059c;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: xb.i, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1952i extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f23170a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1947d f23171b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1059c f23172c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f23173d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1952i(C1947d c1947d, C1059c c1059c, int i3, Continuation continuation) {
        super(2, continuation);
        this.f23171b = c1947d;
        this.f23172c = c1059c;
        this.f23173d = i3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1952i(this.f23171b, this.f23172c, this.f23173d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1952i) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
    
        if (r8 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0034, code lost:
    
        if (Qb.S.a(r8.f23145b, r7) == r0) goto L15;
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
            int r1 = r7.f23170a
            i5.c r2 = r7.f23172c
            int r3 = r7.f23173d
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L27
            if (r1 == r5) goto L23
            if (r1 != r4) goto L16
            kotlin.ResultKt.throwOnFailure(r8)
            goto L41
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r0 = 275(0x113, float:3.85E-43)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r8.<init>(r0)
            throw r8
        L23:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L37
        L27:
            kotlin.ResultKt.throwOnFailure(r8)
            xb.d r8 = r7.f23171b
            r7.f23170a = r5
            long r5 = r8.f23145b
            java.lang.Object r8 = Qb.S.a(r5, r7)
            if (r8 != r0) goto L37
            goto L40
        L37:
            r7.f23170a = r4
            r8 = 0
            java.lang.Object r8 = r2.i(r3, r8, r7)
            if (r8 != r0) goto L41
        L40:
            return r0
        L41:
            wb.e r8 = (wb.e) r8
            if (r8 == 0) goto L70
            java.lang.Object r0 = r2.f14842a
            android.os.Handler r0 = (android.os.Handler) r0
            xb.k r1 = new xb.k
            r2 = 18564(0x4884, float:2.6014E-41)
            java.lang.String r2 = com.stub.StubApp.getString2(r2)
            r4 = 24552(0x5fe8, float:3.4405E-41)
            java.lang.String r4 = com.stub.StubApp.getString2(r4)
            java.lang.String r2 = Xa.h.g(r3, r2, r4)
            r1.<init>(r2)
            if (r0 != 0) goto L66
            r8.a(r1)
            goto L70
        L66:
            com.even.translate.a r2 = new com.even.translate.a
            r3 = 24
            r2.<init>(r3, r8, r1)
            r0.post(r2)
        L70:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: xb.C1952i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
