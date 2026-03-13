package c5;

import android.content.SharedPreferences;
import android.util.Log;
import com.stub.StubApp;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f10952a;

    /* renamed from: b, reason: collision with root package name */
    public final R4.h f10953b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10954c;

    /* renamed from: d, reason: collision with root package name */
    public q4.k f10955d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10956e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10957f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f10958g;

    /* renamed from: h, reason: collision with root package name */
    public final q4.k f10959h;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public u(R4.h r8) {
        /*
            r7 = this;
            r7.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r7.f10954c = r0
            q4.k r1 = new q4.k
            r1.<init>()
            r7.f10955d = r1
            r1 = 0
            r7.f10956e = r1
            r7.f10957f = r1
            q4.k r2 = new q4.k
            r2.<init>()
            r7.f10959h = r2
            r8.a()
            android.content.Context r2 = r8.f6193a
            r7.f10953b = r8
            r8 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r8 = com.stub.StubApp.getString2(r8)
            android.content.SharedPreferences r8 = r2.getSharedPreferences(r8, r1)
            r7.f10952a = r8
            r3 = 7535(0x1d6f, float:1.0559E-41)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            boolean r4 = r8.contains(r3)
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L4b
            r7.f10957f = r1
            boolean r8 = r8.getBoolean(r3, r6)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            goto L4c
        L4b:
            r8 = r5
        L4c:
            if (r8 != 0) goto La4
            r8 = 7535(0x1d6f, float:1.0559E-41)
            java.lang.String r8 = com.stub.StubApp.getString2(r8)
            r1 = 0
            android.content.pm.PackageManager r3 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7d
            if (r3 == 0) goto L8f
            java.lang.String r2 = r2.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7d
            r4 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r2 = r3.getApplicationInfo(r2, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7d
            if (r2 == 0) goto L8f
            android.os.Bundle r3 = r2.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7d
            if (r3 == 0) goto L8f
            boolean r3 = r3.containsKey(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7d
            if (r3 == 0) goto L8f
            android.os.Bundle r2 = r2.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7d
            boolean r8 = r2.getBoolean(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7d
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7d
            goto L90
        L7d:
            r8 = move-exception
            r2 = 280(0x118, float:3.92E-43)
            java.lang.String r2 = com.stub.StubApp.getString2(r2)
            r3 = 9588(0x2574, float:1.3436E-41)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            android.util.Log.e(r2, r3, r8)
        L8f:
            r8 = r1
        L90:
            if (r8 != 0) goto L97
            r8 = 0
            r7.f10957f = r8
            r8 = r1
            goto La4
        L97:
            r1 = 1
            r7.f10957f = r1
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r8 = r1.equals(r8)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
        La4:
            r7.f10958g = r8
            monitor-enter(r0)
            boolean r8 = r7.a()     // Catch: java.lang.Throwable -> Lb5
            if (r8 == 0) goto Lb7
            q4.k r8 = r7.f10955d     // Catch: java.lang.Throwable -> Lb5
            r8.d(r5)     // Catch: java.lang.Throwable -> Lb5
            r7.f10956e = r6     // Catch: java.lang.Throwable -> Lb5
            goto Lb7
        Lb5:
            r8 = move-exception
            goto Lb9
        Lb7:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb5
            return
        Lb9:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb5
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.u.<init>(R4.h):void");
    }

    public final synchronized boolean a() {
        boolean z2;
        Boolean bool = this.f10958g;
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            try {
                z2 = this.f10953b.k();
            } catch (IllegalStateException unused) {
                z2 = false;
            }
        }
        String j = AbstractC1482f.j(StubApp.getString2("9590"), z2 ? "ENABLED" : StubApp.getString2("8429"), StubApp.getString2("9591"), this.f10958g == null ? "global Firebase setting" : this.f10957f ? "firebase_crashlytics_collection_enabled manifest flag" : StubApp.getString2("9589"), StubApp.getString2("1"));
        String string2 = StubApp.getString2("280");
        if (Log.isLoggable(string2, 3)) {
            Log.d(string2, j, null);
        }
        return z2;
    }
}
