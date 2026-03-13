package Tb;

import kotlin.jvm.internal.Ref;

/* renamed from: Tb.w, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0341w implements InterfaceC0328i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0328i f7402a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f7403b;

    public C0341w(InterfaceC0328i interfaceC0328i, Ref.ObjectRef objectRef) {
        this.f7402a = interfaceC0328i;
        this.f7403b = objectRef;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Throwable] */
    @Override // Tb.InterfaceC0328i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof Tb.C0340v
            if (r0 == 0) goto L13
            r0 = r6
            Tb.v r0 = (Tb.C0340v) r0
            int r1 = r0.f7401d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7401d = r1
            goto L18
        L13:
            Tb.v r0 = new Tb.v
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f7399b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f7401d
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L2d
            Tb.w r5 = r0.f7398a
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L2b
            goto L4a
        L2b:
            r6 = move-exception
            goto L4f
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r6 = 275(0x113, float:3.85E-43)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            r5.<init>(r6)
            throw r5
        L3a:
            kotlin.ResultKt.throwOnFailure(r6)
            Tb.i r6 = r4.f7402a     // Catch: java.lang.Throwable -> L4d
            r0.f7398a = r4     // Catch: java.lang.Throwable -> L4d
            r0.f7401d = r3     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r5 = r6.a(r5, r0)     // Catch: java.lang.Throwable -> L4d
            if (r5 != r1) goto L4a
            return r1
        L4a:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L4d:
            r6 = move-exception
            r5 = r4
        L4f:
            kotlin.jvm.internal.Ref$ObjectRef r5 = r5.f7403b
            r5.element = r6
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Tb.C0341w.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
