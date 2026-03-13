package com.google.android.gms.internal.measurement;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class M1 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile L4.f f11309a = L4.a.f4178a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f11310b = new Object();

    /* JADX WARN: Can't wrap try/catch for region: R(11:18|(8:20|(1:22)(1:31)|23|(1:25)|27|28|29|30)|32|33|34|35|(1:37)|27|28|29|30) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
    
        if (com.stub.StubApp.getString2("0").equals(r0.packageName) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.content.Context r5, android.net.Uri r6) {
        /*
            r0 = 11760(0x2df0, float:1.6479E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            java.lang.String r6 = r6.getAuthority()
            boolean r0 = r0.equals(r6)
            r1 = 0
            if (r0 != 0) goto L2c
            java.lang.String r5 = java.lang.String.valueOf(r6)
            r6 = 11761(0x2df1, float:1.648E-41)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            r0 = 11762(0x2df2, float:1.6482E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            java.lang.String r5 = r5.concat(r6)
            android.util.Log.e(r0, r5)
            return r1
        L2c:
            L4.f r6 = com.google.android.gms.internal.measurement.M1.f11309a
            boolean r6 = r6.b()
            if (r6 == 0) goto L41
            L4.f r5 = com.google.android.gms.internal.measurement.M1.f11309a
            java.lang.Object r5 = r5.a()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L41:
            java.lang.Object r6 = com.google.android.gms.internal.measurement.M1.f11310b
            monitor-enter(r6)
            L4.f r0 = com.google.android.gms.internal.measurement.M1.f11309a     // Catch: java.lang.Throwable -> L5a
            boolean r0 = r0.b()     // Catch: java.lang.Throwable -> L5a
            if (r0 == 0) goto L5c
            L4.f r5 = com.google.android.gms.internal.measurement.M1.f11309a     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r5 = r5.a()     // Catch: java.lang.Throwable -> L5a
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L5a
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L5a
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L5a
            return r5
        L5a:
            r5 = move-exception
            goto Lbe
        L5c:
            java.lang.String r0 = "0"
            java.lang.String r0 = com.stub.StubApp.getString2(r0)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r2 = r5.getPackageName()     // Catch: java.lang.Throwable -> L5a
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L5a
            if (r0 != 0) goto L94
            android.content.pm.PackageManager r0 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r2 = "11760"
            java.lang.String r2 = com.stub.StubApp.getString2(r2)     // Catch: java.lang.Throwable -> L5a
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L5a
            r4 = 29
            if (r3 >= r4) goto L7e
            r3 = r1
            goto L80
        L7e:
            r3 = 268435456(0x10000000, float:2.524355E-29)
        L80:
            android.content.pm.ProviderInfo r0 = r0.resolveContentProvider(r2, r3)     // Catch: java.lang.Throwable -> L5a
            if (r0 == 0) goto La5
            java.lang.String r2 = "0"
            java.lang.String r2 = com.stub.StubApp.getString2(r2)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Throwable -> L5a
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L5a
            if (r0 == 0) goto La5
        L94:
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r0 = "com.google.android.gms"
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo(r0, r1)     // Catch: java.lang.Throwable -> L5a android.content.pm.PackageManager.NameNotFoundException -> La5
            int r5 = r5.flags     // Catch: java.lang.Throwable -> L5a
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto La5
            r1 = 1
        La5:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L5a
            L4.i r0 = new L4.i     // Catch: java.lang.Throwable -> L5a
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L5a
            com.google.android.gms.internal.measurement.M1.f11309a = r0     // Catch: java.lang.Throwable -> L5a
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L5a
            L4.f r5 = com.google.android.gms.internal.measurement.M1.f11309a
            java.lang.Object r5 = r5.a()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        Lbe:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L5a
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.M1.a(android.content.Context, android.net.Uri):boolean");
    }
}
