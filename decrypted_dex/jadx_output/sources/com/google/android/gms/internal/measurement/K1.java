package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.util.Log;
import com.stub.StubApp;
import java.util.ArrayDeque;
import v0.RunnableC1806a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class K1 {

    /* renamed from: d, reason: collision with root package name */
    public static K1 f11297d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f11298a;

    /* renamed from: b, reason: collision with root package name */
    public Object f11299b;

    /* renamed from: c, reason: collision with root package name */
    public Object f11300c;

    public K1(int i3) {
        switch (i3) {
            case 3:
                this.f11299b = new Object();
                break;
            default:
                this.f11298a = false;
                this.f11299b = null;
                this.f11300c = null;
                break;
        }
    }

    public static K1 b(Context context) {
        K1 k12;
        K1 k13;
        synchronized (K1.class) {
            try {
                if (f11297d == null) {
                    if (D.a.b(context, StubApp.getString2("11701")) == 0) {
                        k13 = new K1();
                        k13.f11298a = false;
                        k13.f11299b = context;
                        k13.f11300c = new J1(null);
                    } else {
                        k13 = new K1(0);
                    }
                    f11297d = k13;
                }
                K1 k14 = f11297d;
                if (k14 != null && ((J1) k14.f11300c) != null && !k14.f11298a) {
                    try {
                        context.getContentResolver().registerContentObserver(C1.f11238a, true, (J1) f11297d.f11300c);
                        K1 k15 = f11297d;
                        k15.getClass();
                        k15.f11298a = true;
                    } catch (SecurityException e10) {
                        Log.e(StubApp.getString2("11702"), StubApp.getString2("11703"), e10);
                    }
                }
                k12 = f11297d;
                k12.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return k12;
    }

    public void a() {
        if (this.f11298a) {
            ((Context) this.f11299b).unregisterReceiver((RunnableC1806a) this.f11300c);
            this.f11298a = false;
        }
    }

    public void c(q4.q qVar) {
        synchronized (this.f11299b) {
            try {
                if (((ArrayDeque) this.f11300c) == null) {
                    this.f11300c = new ArrayDeque();
                }
                ((ArrayDeque) this.f11300c).add(qVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0040, code lost:
    
        if (r5.isUserRunning(android.os.Process.myUserHandle()) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0042, code lost:
    
        r6 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String d(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f11299b
            android.content.Context r0 = (android.content.Context) r0
            r1 = 0
            if (r0 == 0) goto L9c
            boolean r2 = com.google.android.gms.internal.measurement.F1.f11264b
            r3 = 1
            if (r2 == 0) goto Ld
            goto L63
        Ld:
            java.lang.Class<com.google.android.gms.internal.measurement.F1> r2 = com.google.android.gms.internal.measurement.F1.class
            monitor-enter(r2)
            boolean r4 = com.google.android.gms.internal.measurement.F1.f11264b     // Catch: java.lang.Throwable -> L16
            if (r4 == 0) goto L19
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            goto L63
        L16:
            r9 = move-exception
            goto L9a
        L19:
            r4 = r3
        L1a:
            r5 = 2
            r6 = 0
            if (r4 > r5) goto L59
            android.os.UserManager r5 = com.google.android.gms.internal.measurement.F1.f11263a     // Catch: java.lang.Throwable -> L16
            if (r5 != 0) goto L2c
            java.lang.Class<android.os.UserManager> r5 = android.os.UserManager.class
            java.lang.Object r5 = r0.getSystemService(r5)     // Catch: java.lang.Throwable -> L16
            android.os.UserManager r5 = (android.os.UserManager) r5     // Catch: java.lang.Throwable -> L16
            com.google.android.gms.internal.measurement.F1.f11263a = r5     // Catch: java.lang.Throwable -> L16
        L2c:
            android.os.UserManager r5 = com.google.android.gms.internal.measurement.F1.f11263a     // Catch: java.lang.Throwable -> L16
            if (r5 != 0) goto L32
            r6 = r3
            goto L5d
        L32:
            boolean r7 = r5.isUserUnlocked()     // Catch: java.lang.Throwable -> L16 java.lang.NullPointerException -> L44
            if (r7 != 0) goto L42
            android.os.UserHandle r7 = android.os.Process.myUserHandle()     // Catch: java.lang.Throwable -> L16 java.lang.NullPointerException -> L44
            boolean r0 = r5.isUserRunning(r7)     // Catch: java.lang.Throwable -> L16 java.lang.NullPointerException -> L44
            if (r0 != 0) goto L59
        L42:
            r6 = r3
            goto L59
        L44:
            r5 = move-exception
            java.lang.String r6 = "11704"
            java.lang.String r6 = com.stub.StubApp.getString2(r6)     // Catch: java.lang.Throwable -> L16
            java.lang.String r7 = "11705"
            java.lang.String r7 = com.stub.StubApp.getString2(r7)     // Catch: java.lang.Throwable -> L16
            android.util.Log.w(r6, r7, r5)     // Catch: java.lang.Throwable -> L16
            com.google.android.gms.internal.measurement.F1.f11263a = r1     // Catch: java.lang.Throwable -> L16
            int r4 = r4 + 1
            goto L1a
        L59:
            if (r6 == 0) goto L5d
            com.google.android.gms.internal.measurement.F1.f11263a = r1     // Catch: java.lang.Throwable -> L16
        L5d:
            if (r6 == 0) goto L61
            com.google.android.gms.internal.measurement.F1.f11264b = r3     // Catch: java.lang.Throwable -> L16
        L61:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            r3 = r6
        L63:
            if (r3 != 0) goto L66
            goto L9c
        L66:
            com.google.android.gms.internal.measurement.t r0 = new com.google.android.gms.internal.measurement.t     // Catch: java.lang.NullPointerException -> L7e java.lang.SecurityException -> L80 java.lang.IllegalStateException -> L82
            r0.<init>(r8, r9)     // Catch: java.lang.NullPointerException -> L7e java.lang.SecurityException -> L80 java.lang.IllegalStateException -> L82
            java.lang.Object r0 = r0.a()     // Catch: java.lang.SecurityException -> L70 java.lang.NullPointerException -> L7e java.lang.IllegalStateException -> L82
            goto L7b
        L70:
            long r2 = android.os.Binder.clearCallingIdentity()     // Catch: java.lang.NullPointerException -> L7e java.lang.SecurityException -> L80 java.lang.IllegalStateException -> L82
            java.lang.Object r0 = r0.a()     // Catch: java.lang.Throwable -> L84
            android.os.Binder.restoreCallingIdentity(r2)     // Catch: java.lang.NullPointerException -> L7e java.lang.SecurityException -> L80 java.lang.IllegalStateException -> L82
        L7b:
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NullPointerException -> L7e java.lang.SecurityException -> L80 java.lang.IllegalStateException -> L82
            return r0
        L7e:
            r0 = move-exception
            goto L89
        L80:
            r0 = move-exception
            goto L89
        L82:
            r0 = move-exception
            goto L89
        L84:
            r0 = move-exception
            android.os.Binder.restoreCallingIdentity(r2)     // Catch: java.lang.NullPointerException -> L7e java.lang.SecurityException -> L80 java.lang.IllegalStateException -> L82
            throw r0     // Catch: java.lang.NullPointerException -> L7e java.lang.SecurityException -> L80 java.lang.IllegalStateException -> L82
        L89:
            java.lang.String r2 = "Unable to read GServices for: "
            java.lang.String r9 = r2.concat(r9)
            r2 = 11702(0x2db6, float:1.6398E-41)
            java.lang.String r2 = com.stub.StubApp.getString2(r2)
            android.util.Log.e(r2, r9, r0)
            return r1
        L9a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            throw r9
        L9c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.K1.d(java.lang.String):java.lang.String");
    }

    public void e(q4.j jVar) {
        q4.q qVar;
        synchronized (this.f11299b) {
            if (((ArrayDeque) this.f11300c) != null && !this.f11298a) {
                this.f11298a = true;
                while (true) {
                    synchronized (this.f11299b) {
                        try {
                            qVar = (q4.q) ((ArrayDeque) this.f11300c).poll();
                            if (qVar == null) {
                                this.f11298a = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    qVar.a(jVar);
                }
            }
        }
    }
}
