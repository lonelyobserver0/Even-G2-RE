package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.net.Uri;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import t.C1691d;
import t.C1692e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class H1 {

    /* renamed from: h, reason: collision with root package name */
    public static final C1692e f11277h = new C1692e(0);

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f11278i = {StubApp.getString2(728), StubApp.getString2(1061)};

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f11279a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f11280b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f11281c;

    /* renamed from: d, reason: collision with root package name */
    public final Xa.p f11282d;

    /* renamed from: f, reason: collision with root package name */
    public volatile Map f11284f;

    /* renamed from: e, reason: collision with root package name */
    public final Object f11283e = new Object();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f11285g = new ArrayList();

    public H1(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        contentResolver.getClass();
        uri.getClass();
        this.f11279a = contentResolver;
        this.f11280b = uri;
        this.f11281c = runnable;
        this.f11282d = new Xa.p(this);
    }

    public static H1 a(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        H1 h12;
        synchronized (H1.class) {
            C1692e c1692e = f11277h;
            h12 = (H1) c1692e.get(uri);
            if (h12 == null) {
                try {
                    H1 h13 = new H1(contentResolver, uri, runnable);
                    try {
                        contentResolver.registerContentObserver(uri, false, h13.f11282d);
                        c1692e.put(uri, h13);
                    } catch (SecurityException unused) {
                    }
                    h12 = h13;
                } catch (SecurityException unused2) {
                }
            }
        }
        return h12;
    }

    public static synchronized void c() {
        synchronized (H1.class) {
            try {
                C1692e c1692e = f11277h;
                Iterator it = ((C1691d) c1692e.values()).iterator();
                while (it.hasNext()) {
                    H1 h12 = (H1) it.next();
                    h12.f11279a.unregisterContentObserver(h12.f11282d);
                }
                c1692e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0056  */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.StrictMode$ThreadPolicy, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map b() {
        /*
            r5 = this;
            java.util.Map r0 = r5.f11284f
            if (r0 != 0) goto L53
            java.lang.Object r1 = r5.f11283e
            monitor-enter(r1)
            java.util.Map r0 = r5.f11284f     // Catch: java.lang.Throwable -> L2a
            if (r0 != 0) goto L4f
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()     // Catch: java.lang.Throwable -> L2a
            com.google.android.gms.internal.measurement.y2 r2 = new com.google.android.gms.internal.measurement.y2     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
            java.lang.Object r2 = r2.c()     // Catch: java.lang.SecurityException -> L19 java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30
            goto L24
        L19:
            long r3 = android.os.Binder.clearCallingIdentity()     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
            java.lang.Object r2 = r2.c()     // Catch: java.lang.Throwable -> L34
            android.os.Binder.restoreCallingIdentity(r3)     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
        L24:
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
        L26:
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> L2a
            goto L47
        L2a:
            r0 = move-exception
            goto L51
        L2c:
            r2 = move-exception
            goto L4b
        L2e:
            r2 = move-exception
            goto L39
        L30:
            r2 = move-exception
            goto L39
        L32:
            r2 = move-exception
            goto L39
        L34:
            r2 = move-exception
            android.os.Binder.restoreCallingIdentity(r3)     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
            throw r2     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
        L39:
            java.lang.String r3 = "ConfigurationContentLdr"
            java.lang.String r4 = "11679"
            java.lang.String r4 = com.stub.StubApp.getString2(r4)     // Catch: java.lang.Throwable -> L2c
            android.util.Log.w(r3, r4, r2)     // Catch: java.lang.Throwable -> L2c
            java.util.Map r2 = java.util.Collections.EMPTY_MAP     // Catch: java.lang.Throwable -> L2c
            goto L26
        L47:
            r5.f11284f = r2     // Catch: java.lang.Throwable -> L2a
            r0 = r2
            goto L4f
        L4b:
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> L2a
            throw r2     // Catch: java.lang.Throwable -> L2a
        L4f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2a
            goto L53
        L51:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2a
            throw r0
        L53:
            if (r0 == 0) goto L56
            return r0
        L56:
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.H1.b():java.util.Map");
    }
}
