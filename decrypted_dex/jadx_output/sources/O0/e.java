package O0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class e implements L4.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f5098a;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a9, code lost:
    
        if (r4.f5177g.e(r4.f5178h, r9) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0045, code lost:
    
        if (r6.equals(com.stub.StubApp.getString2(3955)) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070 A[Catch: all -> 0x007d, TRY_ENTER, TryCatch #0 {all -> 0x007d, blocks: (B:4:0x000b, B:6:0x0011, B:8:0x0015, B:11:0x001b, B:16:0x0070, B:18:0x0074, B:20:0x0078, B:23:0x007f, B:25:0x0083, B:27:0x0087, B:29:0x008b, B:31:0x0095, B:33:0x00a1, B:35:0x00ac), top: B:3:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095 A[Catch: all -> 0x007d, TryCatch #0 {all -> 0x007d, blocks: (B:4:0x000b, B:6:0x0011, B:8:0x0015, B:11:0x001b, B:16:0x0070, B:18:0x0074, B:20:0x0078, B:23:0x007f, B:25:0x0083, B:27:0x0087, B:29:0x008b, B:31:0x0095, B:33:0x00a1, B:35:0x00ac), top: B:3:0x000b }] */
    @Override // L4.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean apply(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 2
            r2 = -1
            r3 = 1
            O0.q r4 = r8.f5098a
            o0.m r9 = (o0.C1438m) r9
            java.lang.Object r5 = r4.f5173c
            monitor-enter(r5)
            O0.j r6 = r4.f5176f     // Catch: java.lang.Throwable -> L7d
            boolean r6 = r6.f5136v     // Catch: java.lang.Throwable -> L7d
            if (r6 == 0) goto Lab
            boolean r6 = r4.f5175e     // Catch: java.lang.Throwable -> L7d
            if (r6 != 0) goto Lab
            int r6 = r9.f18193C     // Catch: java.lang.Throwable -> L7d
            if (r6 == r2) goto Lab
            if (r6 <= r1) goto Lab
            java.lang.String r6 = r9.f18216n     // Catch: java.lang.Throwable -> L7d
            if (r6 != 0) goto L21
        L1f:
            r1 = r0
            goto L6c
        L21:
            int r7 = r6.hashCode()
            switch(r7) {
                case -2123537834: goto L58;
                case 187078296: goto L48;
                case 187078297: goto L3a;
                case 1504578661: goto L2a;
                default: goto L28;
            }
        L28:
            r1 = r2
            goto L67
        L2a:
            r1 = 935(0x3a7, float:1.31E-42)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L38
            goto L28
        L38:
            r1 = 3
            goto L67
        L3a:
            r7 = 3955(0xf73, float:5.542E-42)
            java.lang.String r7 = com.stub.StubApp.getString2(r7)
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L67
            goto L28
        L48:
            r1 = 1629(0x65d, float:2.283E-42)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L56
            goto L28
        L56:
            r1 = r3
            goto L67
        L58:
            r1 = 938(0x3aa, float:1.314E-42)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L66
            goto L28
        L66:
            r1 = r0
        L67:
            switch(r1) {
                case 0: goto L6b;
                case 1: goto L6b;
                case 2: goto L6b;
                case 3: goto L6b;
                default: goto L6a;
            }
        L6a:
            goto L1f
        L6b:
            r1 = r3
        L6c:
            r2 = 32
            if (r1 == 0) goto L7f
            int r1 = r0.AbstractC1560u.f20190a     // Catch: java.lang.Throwable -> L7d
            if (r1 < r2) goto Lab
            O0.l r1 = r4.f5177g     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto Lab
            boolean r1 = r1.f5142a     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto Lab
            goto L7f
        L7d:
            r9 = move-exception
            goto Lae
        L7f:
            int r1 = r0.AbstractC1560u.f20190a     // Catch: java.lang.Throwable -> L7d
            if (r1 < r2) goto Lac
            O0.l r1 = r4.f5177g     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto Lac
            boolean r2 = r1.f5142a     // Catch: java.lang.Throwable -> L7d
            if (r2 == 0) goto Lac
            java.lang.Object r1 = r1.f5143b     // Catch: java.lang.Throwable -> L7d
            android.media.Spatializer r1 = (android.media.Spatializer) r1     // Catch: java.lang.Throwable -> L7d
            boolean r1 = O.c.g(r1)     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto Lac
            O0.l r1 = r4.f5177g     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r1 = r1.f5143b     // Catch: java.lang.Throwable -> L7d
            android.media.Spatializer r1 = (android.media.Spatializer) r1     // Catch: java.lang.Throwable -> L7d
            boolean r1 = O.c.j(r1)     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto Lac
            O0.l r1 = r4.f5177g     // Catch: java.lang.Throwable -> L7d
            o0.c r2 = r4.f5178h     // Catch: java.lang.Throwable -> L7d
            boolean r9 = r1.e(r2, r9)     // Catch: java.lang.Throwable -> L7d
            if (r9 == 0) goto Lac
        Lab:
            r0 = r3
        Lac:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L7d
            return r0
        Lae:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L7d
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.e.apply(java.lang.Object):boolean");
    }
}
