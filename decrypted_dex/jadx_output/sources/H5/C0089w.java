package H5;

/* renamed from: H5.w, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0089w implements K5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2922a;

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(6:11|12|13|14|15|16)(2:19|20))(2:21|22))(6:29|30|31|32|(1:34)|27)|23|24|25))|42|6|7|(0)(0)|23|24|25|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a3, code lost:
    
        if (r10 != r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x003a, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00af, code lost:
    
        android.util.Log.w(r4, com.stub.StubApp.getString2(2683), r10);
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0052, code lost:
    
        r10 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(x5.InterfaceC1913d r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof H5.A
            if (r0 == 0) goto L13
            r0 = r10
            H5.A r0 = (H5.A) r0
            int r1 = r0.f2750d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2750d = r1
            goto L18
        L13:
            H5.A r0 = new H5.A
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f2748b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f2750d
            java.lang.String r3 = ""
            r4 = 2681(0xa79, float:3.757E-42)
            java.lang.String r4 = com.stub.StubApp.getString2(r4)
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L54
            if (r2 == r6) goto L4a
            if (r2 != r5) goto L3d
            java.lang.Object r9 = r0.f2747a
            java.lang.String r9 = (java.lang.String) r9
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Exception -> L3a
            goto La6
        L3a:
            r10 = move-exception
            goto Laf
        L3d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r10 = 275(0x113, float:3.85E-43)
            java.lang.String r10 = com.stub.StubApp.getString2(r10)
            r9.<init>(r10)
            throw r9
        L4a:
            java.lang.Object r9 = r0.f2747a
            x5.d r9 = (x5.InterfaceC1913d) r9
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Exception -> L52
            goto L71
        L52:
            r10 = move-exception
            goto L84
        L54:
            kotlin.ResultKt.throwOnFailure(r10)
            r10 = r9
            x5.c r10 = (x5.C1912c) r10     // Catch: java.lang.Exception -> L52
            q4.s r9 = r10.d()     // Catch: java.lang.Exception -> L52
            java.lang.String r2 = "firebaseInstallations.getToken(false)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r2)     // Catch: java.lang.Exception -> L82
            r0.f2747a = r10     // Catch: java.lang.Exception -> L82
            r0.f2750d = r6     // Catch: java.lang.Exception -> L82
            java.lang.Object r9 = android.support.v4.media.session.b.b(r9, r0)     // Catch: java.lang.Exception -> L82
            if (r9 != r1) goto L6e
            goto La5
        L6e:
            r7 = r10
            r10 = r9
            r9 = r7
        L71:
            x5.a r10 = (x5.C1910a) r10     // Catch: java.lang.Exception -> L52
            java.lang.String r10 = r10.f22866a     // Catch: java.lang.Exception -> L52
            java.lang.String r2 = "{\n          firebaseInst…).await().token\n        }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r2)     // Catch: java.lang.Exception -> L52
            r7 = r10
            r10 = r9
            r9 = r7
            goto L90
        L7e:
            r7 = r10
            r10 = r9
            r9 = r7
            goto L84
        L82:
            r9 = move-exception
            goto L7e
        L84:
            r2 = 2682(0xa7a, float:3.758E-42)
            java.lang.String r2 = com.stub.StubApp.getString2(r2)
            android.util.Log.w(r4, r2, r10)
            r10 = r9
            r9 = r3
        L90:
            x5.c r10 = (x5.C1912c) r10     // Catch: java.lang.Exception -> L3a
            q4.s r10 = r10.c()     // Catch: java.lang.Exception -> L3a
            java.lang.String r2 = "firebaseInstallations.id"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r2)     // Catch: java.lang.Exception -> L3a
            r0.f2747a = r9     // Catch: java.lang.Exception -> L3a
            r0.f2750d = r5     // Catch: java.lang.Exception -> L3a
            java.lang.Object r10 = android.support.v4.media.session.b.b(r10, r0)     // Catch: java.lang.Exception -> L3a
            if (r10 != r1) goto La6
        La5:
            return r1
        La6:
            java.lang.String r0 = "{\n          firebaseInst…ions.id.await()\n        }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)     // Catch: java.lang.Exception -> L3a
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L3a
            r3 = r10
            goto Lb9
        Laf:
            r0 = 2683(0xa7b, float:3.76E-42)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            android.util.Log.w(r4, r0, r10)
        Lb9:
            H5.B r10 = new H5.B
            r10.<init>(r3, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: H5.C0089w.a(x5.d, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // Pb.a
    public Object get() {
        switch (this.f2922a) {
            case 0:
                return f0.f2867a;
            default:
                return g0.f2872a;
        }
    }
}
