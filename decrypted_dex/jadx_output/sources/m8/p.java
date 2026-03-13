package m8;

import Qb.I;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class p extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Zb.a f17198a;

    /* renamed from: b, reason: collision with root package name */
    public r f17199b;

    /* renamed from: c, reason: collision with root package name */
    public int f17200c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f17201d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, Continuation continuation) {
        super(2, continuation);
        this.f17201d = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new p(this.f17201d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x003e, code lost:
    
        if (r9.e(r8) == r0) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [Zb.a] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f17200c
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L2d
            if (r1 == r3) goto L24
            if (r1 != r2) goto L17
            Zb.a r0 = r8.f17198a
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L15
            goto L6c
        L15:
            r9 = move-exception
            goto L76
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r0 = 275(0x113, float:3.85E-43)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r9.<init>(r0)
            throw r9
        L24:
            m8.r r1 = r8.f17199b
            Zb.a r3 = r8.f17198a
            kotlin.ResultKt.throwOnFailure(r9)
            r9 = r3
            goto L41
        L2d:
            kotlin.ResultKt.throwOnFailure(r9)
            m8.r r1 = r8.f17201d
            Zb.e r9 = r1.f17240u
            r8.f17198a = r9
            r8.f17199b = r1
            r8.f17200c = r3
            java.lang.Object r3 = r9.e(r8)
            if (r3 != r0) goto L41
            goto L6a
        L41:
            q8.d r3 = r1.f17228h     // Catch: java.lang.Throwable -> L50
            java.util.List r3 = r3.a()     // Catch: java.lang.Throwable -> L50
            java.lang.Integer r5 = r1.f17213G     // Catch: java.lang.Throwable -> L50
            if (r5 == 0) goto L55
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> L50
            goto L59
        L50:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
            goto L76
        L55:
            q8.d r5 = r1.f17228h     // Catch: java.lang.Throwable -> L50
            int r5 = r5.f20093e     // Catch: java.lang.Throwable -> L50
        L59:
            m8.C r6 = new m8.C     // Catch: java.lang.Throwable -> L50
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L50
            r8.f17198a = r9     // Catch: java.lang.Throwable -> L50
            r8.f17199b = r4     // Catch: java.lang.Throwable -> L50
            r8.f17200c = r2     // Catch: java.lang.Throwable -> L50
            java.lang.Object r1 = m8.r.b(r1, r3, r6, r8)     // Catch: java.lang.Throwable -> L50
            if (r1 != r0) goto L6b
        L6a:
            return r0
        L6b:
            r0 = r9
        L6c:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L15
            Zb.e r0 = (Zb.e) r0
            r0.g(r4)
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L76:
            Zb.e r0 = (Zb.e) r0
            r0.g(r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: m8.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
