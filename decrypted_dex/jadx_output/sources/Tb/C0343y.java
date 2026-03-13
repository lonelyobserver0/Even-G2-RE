package Tb;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* renamed from: Tb.y, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0343y implements InterfaceC0328i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f7409a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0328i f7410b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f7411c;

    /* JADX WARN: Multi-variable type inference failed */
    public C0343y(Ref.BooleanRef booleanRef, InterfaceC0328i interfaceC0328i, Function2 function2) {
        this.f7409a = booleanRef;
        this.f7410b = interfaceC0328i;
        this.f7411c = (SuspendLambda) function2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0088, code lost:
    
        if (r2.f7410b.a(r7, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0059, code lost:
    
        if (r6.f7410b.a(r7, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r8v4, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // Tb.InterfaceC0328i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof Tb.C0342x
            if (r0 == 0) goto L13
            r0 = r8
            Tb.x r0 = (Tb.C0342x) r0
            int r1 = r0.f7408e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7408e = r1
            goto L18
        L13:
            Tb.x r0 = new Tb.x
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f7406c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f7408e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L48
            if (r2 == r5) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L2f
            kotlin.ResultKt.throwOnFailure(r8)
            goto L8b
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r8 = 275(0x113, float:3.85E-43)
            java.lang.String r8 = com.stub.StubApp.getString2(r8)
            r7.<init>(r8)
            throw r7
        L3c:
            java.lang.Object r7 = r0.f7405b
            Tb.y r2 = r0.f7404a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L6f
        L44:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L5c
        L48:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlin.jvm.internal.Ref$BooleanRef r8 = r6.f7409a
            boolean r8 = r8.element
            if (r8 == 0) goto L5f
            r0.f7408e = r5
            Tb.i r8 = r6.f7410b
            java.lang.Object r7 = r8.a(r7, r0)
            if (r7 != r1) goto L5c
            goto L8a
        L5c:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L5f:
            r0.f7404a = r6
            r0.f7405b = r7
            r0.f7408e = r4
            kotlin.coroutines.jvm.internal.SuspendLambda r8 = r6.f7411c
            java.lang.Object r8 = r8.invoke(r7, r0)
            if (r8 != r1) goto L6e
            goto L8a
        L6e:
            r2 = r6
        L6f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L8e
            kotlin.jvm.internal.Ref$BooleanRef r8 = r2.f7409a
            r8.element = r5
            r8 = 0
            r0.f7404a = r8
            r0.f7405b = r8
            r0.f7408e = r3
            Tb.i r8 = r2.f7410b
            java.lang.Object r7 = r8.a(r7, r0)
            if (r7 != r1) goto L8b
        L8a:
            return r1
        L8b:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L8e:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Tb.C0343y.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
