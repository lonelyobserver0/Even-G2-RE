package androidx.work;

import R1.b;
import i2.o;
import java.util.Collections;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class WorkManagerInitializer implements b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f10360a = o.g("WrkMgrInitializer");

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0090, code lost:
    
        r2 = r9.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0096, code lost:
    
        if (j2.k.f15294m != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0098, code lost:
    
        r5 = (java.util.concurrent.ExecutorService) r0.f4386e;
        r4 = new sa.C1608a();
        r4.f20821b = new android.os.Handler(android.os.Looper.getMainLooper());
        r4.f20822c = new B3.q(r4, 5);
        r4.f20820a = new s2.g(r5);
        j2.k.f15294m = new j2.k(r2, r0, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c2, code lost:
    
        j2.k.f15293l = j2.k.f15294m;
     */
    @Override // R1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object create(android.content.Context r9) {
        /*
            r8 = this;
            i2.o r0 = i2.o.e()
            r1 = 0
            java.lang.Throwable[] r1 = new java.lang.Throwable[r1]
            java.lang.String r2 = androidx.work.WorkManagerInitializer.f10360a
            java.lang.String r3 = "Initializing WorkManager with default configuration."
            r0.b(r2, r3, r1)
            c7.f r0 = new c7.f
            r1 = 6
            r0.<init>(r1)
            La.b r0 = new La.b
            r0.<init>()
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()
            int r1 = r1.availableProcessors()
            r2 = 1
            int r1 = r1 - r2
            r3 = 4
            int r1 = java.lang.Math.min(r1, r3)
            r4 = 2
            int r1 = java.lang.Math.max(r4, r1)
            i2.a r5 = new i2.a
            r6 = 0
            r5.<init>(r6)
            java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.newFixedThreadPool(r1, r5)
            r0.f4385d = r1
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()
            int r1 = r1.availableProcessors()
            int r1 = r1 - r2
            int r1 = java.lang.Math.min(r1, r3)
            int r1 = java.lang.Math.max(r4, r1)
            i2.a r4 = new i2.a
            r4.<init>(r2)
            java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.newFixedThreadPool(r1, r4)
            r0.f4386e = r1
            i2.v r1 = new i2.v
            r1.<init>()
            r0.f4387f = r1
            cb.c r1 = new cb.c
            r2 = 6
            r1.<init>(r2)
            r0.f4388g = r1
            a0.a r1 = new a0.a
            r2 = 11
            r1.<init>(r2)
            r0.f4389h = r1
            r0.f4382a = r3
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0.f4383b = r1
            r1 = 20
            r0.f4384c = r1
            java.lang.Object r1 = j2.k.f15295n
            monitor-enter(r1)
            j2.k r2 = j2.k.f15293l     // Catch: java.lang.Throwable -> L8c
            if (r2 == 0) goto L8e
            j2.k r3 = j2.k.f15294m     // Catch: java.lang.Throwable -> L8c
            if (r3 != 0) goto L84
            goto L8e
        L84:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L8c
            java.lang.String r0 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L8c
            throw r9     // Catch: java.lang.Throwable -> L8c
        L8c:
            r9 = move-exception
            goto Lcc
        L8e:
            if (r2 != 0) goto Lc6
            android.content.Context r2 = r9.getApplicationContext()     // Catch: java.lang.Throwable -> L8c
            j2.k r3 = j2.k.f15294m     // Catch: java.lang.Throwable -> L8c
            if (r3 != 0) goto Lc2
            j2.k r3 = new j2.k     // Catch: java.lang.Throwable -> L8c
            sa.a r4 = new sa.a     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r5 = r0.f4386e     // Catch: java.lang.Throwable -> L8c
            java.util.concurrent.ExecutorService r5 = (java.util.concurrent.ExecutorService) r5     // Catch: java.lang.Throwable -> L8c
            r4.<init>()     // Catch: java.lang.Throwable -> L8c
            android.os.Handler r6 = new android.os.Handler     // Catch: java.lang.Throwable -> L8c
            android.os.Looper r7 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L8c
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L8c
            r4.f20821b = r6     // Catch: java.lang.Throwable -> L8c
            B3.q r6 = new B3.q     // Catch: java.lang.Throwable -> L8c
            r7 = 5
            r6.<init>(r4, r7)     // Catch: java.lang.Throwable -> L8c
            r4.f20822c = r6     // Catch: java.lang.Throwable -> L8c
            s2.g r6 = new s2.g     // Catch: java.lang.Throwable -> L8c
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L8c
            r4.f20820a = r6     // Catch: java.lang.Throwable -> L8c
            r3.<init>(r2, r0, r4)     // Catch: java.lang.Throwable -> L8c
            j2.k.f15294m = r3     // Catch: java.lang.Throwable -> L8c
        Lc2:
            j2.k r0 = j2.k.f15294m     // Catch: java.lang.Throwable -> L8c
            j2.k.f15293l = r0     // Catch: java.lang.Throwable -> L8c
        Lc6:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8c
            j2.k r9 = j2.k.L(r9)
            return r9
        Lcc:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8c
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.WorkManagerInitializer.create(android.content.Context):java.lang.Object");
    }

    @Override // R1.b
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
