package J7;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Zb.e f3449a = Zb.f.a();

    /* renamed from: b, reason: collision with root package name */
    public Object f3450b = new n(1, null);

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(J7.a r5, P8.g r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof J7.k
            if (r0 == 0) goto L13
            r0 = r7
            J7.k r0 = (J7.k) r0
            int r1 = r0.f3439c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3439c = r1
            goto L18
        L13:
            J7.k r0 = new J7.k
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f3437a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f3439c
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r7)
            goto L6c
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r6 = 275(0x113, float:3.85E-43)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            r5.<init>(r6)
            throw r5
        L36:
            kotlin.ResultKt.throwOnFailure(r7)
            Zb.e r7 = r4.f3449a
            boolean r7 = r7.d()
            if (r7 == 0) goto L61
            com.mapbox.common.LoggingLevel r5 = D9.l.g()
            com.mapbox.common.LoggingLevel r6 = com.mapbox.common.LoggingLevel.DEBUG
            boolean r5 = D9.l.a(r5, r6)
            if (r5 == 0) goto L5e
            r5 = 3029(0xbd5, float:4.245E-42)
            java.lang.String r5 = com.stub.StubApp.getString2(r5)
            r6 = 1222(0x4c6, float:1.712E-42)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            D9.l.d(r5, r6)
        L5e:
            J7.b r5 = J7.b.f3414a
            return r5
        L61:
            J7.p r5 = r5.f3413a
            r0.f3439c = r3
            java.lang.Object r7 = r4.b(r5, r6, r0)
            if (r7 != r1) goto L6c
            return r1
        L6c:
            J7.c r5 = new J7.c
            r5.<init>(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: J7.o.a(J7.a, P8.g, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c1, code lost:
    
        if (r11 == r1) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(J7.p r9, kotlin.jvm.functions.Function1 r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof J7.l
            if (r0 == 0) goto L13
            r0 = r11
            J7.l r0 = (J7.l) r0
            int r1 = r0.f3445f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3445f = r1
            goto L18
        L13:
            J7.l r0 = new J7.l
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f3443d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f3445f
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L66
            if (r2 == r6) goto L62
            if (r2 == r5) goto L54
            if (r2 == r4) goto L48
            if (r2 != r3) goto L3b
            java.lang.Object r9 = r0.f3440a
            Zb.a r9 = (Zb.a) r9
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.lang.Throwable -> L38
            goto Lc4
        L38:
            r10 = move-exception
            goto Lca
        L3b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r10 = 275(0x113, float:3.85E-43)
            java.lang.String r10 = com.stub.StubApp.getString2(r10)
            r9.<init>(r10)
            throw r9
        L48:
            java.lang.Object r9 = r0.f3441b
            Zb.a r9 = (Zb.a) r9
            java.lang.Object r10 = r0.f3440a
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.lang.Throwable -> L38
            goto Lb7
        L54:
            Zb.e r9 = r0.f3442c
            java.lang.Object r10 = r0.f3441b
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            java.lang.Object r2 = r0.f3440a
            J7.o r2 = (J7.o) r2
            kotlin.ResultKt.throwOnFailure(r11)
            goto La8
        L62:
            kotlin.ResultKt.throwOnFailure(r11)
            return r11
        L66:
            kotlin.ResultKt.throwOnFailure(r11)
            int r9 = r9.f3451a
            r11 = 20971520(0x1400000, float:3.526483E-38)
            if (r9 >= r11) goto L79
            r0.f3445f = r6
            java.lang.Object r9 = r10.invoke(r0)
            if (r9 != r1) goto L78
            goto Lc3
        L78:
            return r9
        L79:
            com.mapbox.common.LoggingLevel r9 = D9.l.g()
            com.mapbox.common.LoggingLevel r11 = com.mapbox.common.LoggingLevel.DEBUG
            boolean r9 = D9.l.a(r9, r11)
            if (r9 == 0) goto L96
            r9 = 3030(0xbd6, float:4.246E-42)
            java.lang.String r9 = com.stub.StubApp.getString2(r9)
            r11 = 1222(0x4c6, float:1.712E-42)
            java.lang.String r11 = com.stub.StubApp.getString2(r11)
            D9.l.d(r9, r11)
        L96:
            r0.f3440a = r8
            r0.f3441b = r10
            Zb.e r9 = r8.f3449a
            r0.f3442c = r9
            r0.f3445f = r5
            java.lang.Object r11 = r9.e(r0)
            if (r11 != r1) goto La7
            goto Lc3
        La7:
            r2 = r8
        La8:
            r0.f3440a = r10     // Catch: java.lang.Throwable -> L38
            r0.f3441b = r9     // Catch: java.lang.Throwable -> L38
            r0.f3442c = r7     // Catch: java.lang.Throwable -> L38
            r0.f3445f = r4     // Catch: java.lang.Throwable -> L38
            java.lang.Object r11 = r2.c(r0)     // Catch: java.lang.Throwable -> L38
            if (r11 != r1) goto Lb7
            goto Lc3
        Lb7:
            r0.f3440a = r9     // Catch: java.lang.Throwable -> L38
            r0.f3441b = r7     // Catch: java.lang.Throwable -> L38
            r0.f3445f = r3     // Catch: java.lang.Throwable -> L38
            java.lang.Object r11 = r10.invoke(r0)     // Catch: java.lang.Throwable -> L38
            if (r11 != r1) goto Lc4
        Lc3:
            return r1
        Lc4:
            Zb.e r9 = (Zb.e) r9
            r9.g(r7)
            return r11
        Lca:
            Zb.e r9 = (Zb.e) r9
            r9.g(r7)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: J7.o.b(J7.p, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof J7.m
            if (r0 == 0) goto L13
            r0 = r6
            J7.m r0 = (J7.m) r0
            int r1 = r0.f3448c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3448c = r1
            goto L18
        L13:
            J7.m r0 = new J7.m
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f3446a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f3448c
            r3 = 1222(0x4c6, float:1.712E-42)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 != r4) goto L30
            kotlin.ResultKt.throwOnFailure(r6)
            goto L61
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r0 = 275(0x113, float:3.85E-43)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r6.<init>(r0)
            throw r6
        L3d:
            kotlin.ResultKt.throwOnFailure(r6)
            com.mapbox.common.LoggingLevel r6 = D9.l.g()
            com.mapbox.common.LoggingLevel r2 = com.mapbox.common.LoggingLevel.DEBUG
            boolean r6 = D9.l.a(r6, r2)
            if (r6 == 0) goto L56
            r6 = 3031(0xbd7, float:4.247E-42)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            D9.l.d(r6, r3)
        L56:
            java.lang.Object r6 = r5.f3450b
            r0.f3448c = r4
            java.lang.Object r6 = r6.invoke(r0)
            if (r6 != r1) goto L61
            return r1
        L61:
            com.mapbox.common.LoggingLevel r6 = D9.l.g()
            com.mapbox.common.LoggingLevel r0 = com.mapbox.common.LoggingLevel.DEBUG
            boolean r6 = D9.l.a(r6, r0)
            if (r6 == 0) goto L77
            r6 = 3032(0xbd8, float:4.249E-42)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            D9.l.d(r6, r3)
        L77:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: J7.o.c(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
