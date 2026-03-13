package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import i2.o;
import j2.InterfaceC1083a;
import j2.k;
import java.util.HashMap;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class SystemJobService extends JobService implements InterfaceC1083a {

    /* renamed from: c, reason: collision with root package name */
    public static final String f10383c = o.g("SystemJobService");

    /* renamed from: a, reason: collision with root package name */
    public k f10384a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f10385b = new HashMap();

    @Override // j2.InterfaceC1083a
    public final void c(String str, boolean z2) {
        JobParameters jobParameters;
        o.e().b(f10383c, AbstractC1482f.g(str, " executed on JobScheduler"), new Throwable[0]);
        synchronized (this.f10385b) {
            jobParameters = (JobParameters) this.f10385b.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z2);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            k L10 = k.L(getApplicationContext());
            this.f10384a = L10;
            L10.f15301h.a(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            o.e().h(f10383c, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        k kVar = this.f10384a;
        if (kVar != null) {
            kVar.f15301h.e(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    @Override // android.app.job.JobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onStartJob(android.app.job.JobParameters r9) {
        /*
            r8 = this;
            java.lang.String r0 = "onStartJob for "
            java.lang.String r1 = "Job is already being executed by SystemJobService: "
            j2.k r2 = r8.f10384a
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L1b
            i2.o r0 = i2.o.e()
            java.lang.String r1 = androidx.work.impl.background.systemjob.SystemJobService.f10383c
            java.lang.String r2 = "WorkManager is not initialized; requesting retry."
            java.lang.Throwable[] r5 = new java.lang.Throwable[r4]
            r0.b(r1, r2, r5)
            r8.jobFinished(r9, r3)
            return r4
        L1b:
            java.lang.String r2 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r5 = r9.getExtras()     // Catch: java.lang.NullPointerException -> L2e
            if (r5 == 0) goto L2e
            boolean r6 = r5.containsKey(r2)     // Catch: java.lang.NullPointerException -> L2e
            if (r6 == 0) goto L2e
            java.lang.String r2 = r5.getString(r2)     // Catch: java.lang.NullPointerException -> L2e
            goto L2f
        L2e:
            r2 = 0
        L2f:
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 == 0) goto L43
            i2.o r9 = i2.o.e()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.f10383c
            java.lang.String r1 = "WorkSpec id not found!"
            java.lang.Throwable[] r2 = new java.lang.Throwable[r4]
            r9.d(r0, r1, r2)
            return r4
        L43:
            java.util.HashMap r5 = r8.f10385b
            monitor-enter(r5)
            java.util.HashMap r6 = r8.f10385b     // Catch: java.lang.Throwable -> L67
            boolean r6 = r6.containsKey(r2)     // Catch: java.lang.Throwable -> L67
            if (r6 == 0) goto L69
            i2.o r9 = i2.o.e()     // Catch: java.lang.Throwable -> L67
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.f10383c     // Catch: java.lang.Throwable -> L67
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L67
            r3.append(r2)     // Catch: java.lang.Throwable -> L67
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L67
            java.lang.Throwable[] r2 = new java.lang.Throwable[r4]     // Catch: java.lang.Throwable -> L67
            r9.b(r0, r1, r2)     // Catch: java.lang.Throwable -> L67
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L67
            return r4
        L67:
            r9 = move-exception
            goto Lb6
        L69:
            i2.o r1 = i2.o.e()     // Catch: java.lang.Throwable -> L67
            java.lang.String r6 = androidx.work.impl.background.systemjob.SystemJobService.f10383c     // Catch: java.lang.Throwable -> L67
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L67
            r7.append(r2)     // Catch: java.lang.Throwable -> L67
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> L67
            java.lang.Throwable[] r4 = new java.lang.Throwable[r4]     // Catch: java.lang.Throwable -> L67
            r1.b(r6, r0, r4)     // Catch: java.lang.Throwable -> L67
            java.util.HashMap r0 = r8.f10385b     // Catch: java.lang.Throwable -> L67
            r0.put(r2, r9)     // Catch: java.lang.Throwable -> L67
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L67
            V6.b r0 = new V6.b
            r1 = 18
            r0.<init>(r1)
            android.net.Uri[] r1 = r9.getTriggeredContentUris()
            if (r1 == 0) goto L9d
            android.net.Uri[] r1 = r9.getTriggeredContentUris()
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.f7762c = r1
        L9d:
            java.lang.String[] r1 = r9.getTriggeredContentAuthorities()
            if (r1 == 0) goto Lad
            java.lang.String[] r1 = r9.getTriggeredContentAuthorities()
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.f7761b = r1
        Lad:
            r9.getNetwork()
            j2.k r9 = r8.f10384a
            r9.O(r2, r0)
            return r3
        Lb6:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L67
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    @Override // android.app.job.JobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onStopJob(android.app.job.JobParameters r7) {
        /*
            r6 = this;
            j2.k r0 = r6.f10384a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L14
            i2.o r7 = i2.o.e()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.f10383c
            java.lang.String r3 = "WorkManager is not initialized; requesting retry."
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r7.b(r0, r3, r2)
            return r1
        L14:
            java.lang.String r0 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r7 = r7.getExtras()     // Catch: java.lang.NullPointerException -> L27
            if (r7 == 0) goto L27
            boolean r3 = r7.containsKey(r0)     // Catch: java.lang.NullPointerException -> L27
            if (r3 == 0) goto L27
            java.lang.String r7 = r7.getString(r0)     // Catch: java.lang.NullPointerException -> L27
            goto L28
        L27:
            r7 = 0
        L28:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L3c
            i2.o r7 = i2.o.e()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.f10383c
            java.lang.String r1 = "WorkSpec id not found!"
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            r7.d(r0, r1, r3)
            return r2
        L3c:
            i2.o r0 = i2.o.e()
            java.lang.String r3 = androidx.work.impl.background.systemjob.SystemJobService.f10383c
            java.lang.String r4 = "onStopJob for "
            java.lang.String r4 = E1.a.j(r4, r7)
            java.lang.Throwable[] r5 = new java.lang.Throwable[r2]
            r0.b(r3, r4, r5)
            java.util.HashMap r0 = r6.f10385b
            monitor-enter(r0)
            java.util.HashMap r3 = r6.f10385b     // Catch: java.lang.Throwable -> L75
            r3.remove(r7)     // Catch: java.lang.Throwable -> L75
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L75
            j2.k r0 = r6.f10384a
            sa.a r3 = r0.f15299f
            s2.h r4 = new s2.h
            r4.<init>(r0, r7, r2)
            r3.j(r4)
            j2.k r0 = r6.f10384a
            j2.b r0 = r0.f15301h
            java.lang.Object r2 = r0.f15271l
            monitor-enter(r2)
            java.util.HashSet r0 = r0.j     // Catch: java.lang.Throwable -> L72
            boolean r7 = r0.contains(r7)     // Catch: java.lang.Throwable -> L72
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L72
            r7 = r7 ^ r1
            return r7
        L72:
            r7 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L72
            throw r7
        L75:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L75
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStopJob(android.app.job.JobParameters):boolean");
    }
}
