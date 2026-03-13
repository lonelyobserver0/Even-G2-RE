package T;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class H extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public Serializable f6764a;

    /* renamed from: b, reason: collision with root package name */
    public int f6765b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f6766c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q f6767d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f6768e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(Ref.ObjectRef objectRef, Q q10, Ref.IntRef intRef, Continuation continuation) {
        super(1, continuation);
        this.f6766c = objectRef;
        this.f6767d = q10;
        this.f6768e = intRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new H(this.f6766c, this.f6767d, this.f6768e, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((H) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        if (r9 != r0) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f6765b
            kotlin.jvm.internal.Ref$IntRef r2 = r8.f6768e
            kotlin.jvm.internal.Ref$ObjectRef r3 = r8.f6766c
            r4 = 3
            r5 = 2
            T.Q r6 = r8.f6767d
            r7 = 1
            if (r1 == 0) goto L3d
            if (r1 == r7) goto L35
            if (r1 == r5) goto L2d
            if (r1 != r4) goto L20
            java.io.Serializable r0 = r8.f6764a
            r2 = r0
            kotlin.jvm.internal.Ref$IntRef r2 = (kotlin.jvm.internal.Ref.IntRef) r2
            kotlin.ResultKt.throwOnFailure(r9)
            goto L74
        L20:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r0 = 275(0x113, float:3.85E-43)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r9.<init>(r0)
            throw r9
        L2d:
            java.io.Serializable r1 = r8.f6764a
            kotlin.jvm.internal.Ref$IntRef r1 = (kotlin.jvm.internal.Ref.IntRef) r1
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: T.C0286b -> L67
            goto L5e
        L35:
            java.io.Serializable r1 = r8.f6764a
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: T.C0286b -> L67
            goto L4c
        L3d:
            kotlin.ResultKt.throwOnFailure(r9)
            r8.f6764a = r3     // Catch: T.C0286b -> L67
            r8.f6765b = r7     // Catch: T.C0286b -> L67
            java.lang.Object r9 = r6.i(r8)     // Catch: T.C0286b -> L67
            if (r9 != r0) goto L4b
            goto L73
        L4b:
            r1 = r3
        L4c:
            r1.element = r9     // Catch: T.C0286b -> L67
            T.d0 r9 = r6.g()     // Catch: T.C0286b -> L67
            r8.f6764a = r2     // Catch: T.C0286b -> L67
            r8.f6765b = r5     // Catch: T.C0286b -> L67
            java.lang.Integer r9 = r9.a()     // Catch: T.C0286b -> L67
            if (r9 != r0) goto L5d
            goto L73
        L5d:
            r1 = r2
        L5e:
            java.lang.Number r9 = (java.lang.Number) r9     // Catch: T.C0286b -> L67
            int r9 = r9.intValue()     // Catch: T.C0286b -> L67
            r1.element = r9     // Catch: T.C0286b -> L67
            goto L7c
        L67:
            T r9 = r3.element
            r8.f6764a = r2
            r8.f6765b = r4
            java.lang.Object r9 = r6.j(r9, r7, r8)
            if (r9 != r0) goto L74
        L73:
            return r0
        L74:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r2.element = r9
        L7c:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: T.H.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
