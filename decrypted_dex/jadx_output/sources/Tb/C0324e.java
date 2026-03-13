package Tb;

import kotlin.jvm.internal.Ref;

/* renamed from: Tb.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0324e implements InterfaceC0328i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0325f f7354a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f7355b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0328i f7356c;

    public C0324e(C0325f c0325f, Ref.ObjectRef objectRef, InterfaceC0328i interfaceC0328i) {
        this.f7354a = c0325f;
        this.f7355b = objectRef;
        this.f7356c = interfaceC0328i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // Tb.InterfaceC0328i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof Tb.C0323d
            if (r0 == 0) goto L13
            r0 = r8
            Tb.d r0 = (Tb.C0323d) r0
            int r1 = r0.f7352c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7352c = r1
            goto L18
        L13:
            Tb.d r0 = new Tb.d
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f7350a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f7352c
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r8)
            goto L67
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r8 = 275(0x113, float:3.85E-43)
            java.lang.String r8 = com.stub.StubApp.getString2(r8)
            r7.<init>(r8)
            throw r7
        L36:
            kotlin.ResultKt.throwOnFailure(r8)
            Tb.f r8 = r6.f7354a
            Tb.m r2 = r8.f7358b
            r2.getClass()
            kotlin.jvm.internal.Ref$ObjectRef r2 = r6.f7355b
            T r4 = r2.element
            F5.c r5 = Ub.AbstractC0347c.f7577b
            if (r4 == r5) goto L5a
            Tb.l r8 = r8.f7359c
            java.lang.Object r8 = r8.invoke(r4, r7)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L57
            goto L5a
        L57:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L5a:
            r2.element = r7
            r0.f7352c = r3
            Tb.i r8 = r6.f7356c
            java.lang.Object r7 = r8.a(r7, r0)
            if (r7 != r1) goto L67
            return r1
        L67:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Tb.C0324e.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
