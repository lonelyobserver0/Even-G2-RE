package m2;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.stub.StubApp;
import i2.c;
import i2.o;
import j2.InterfaceC1085c;
import j2.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import r2.C1565c;
import r2.f;
import s2.d;
import w.AbstractC1856e;

/* renamed from: m2.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1271b implements InterfaceC1085c {

    /* renamed from: e, reason: collision with root package name */
    public static final String f17052e = o.g(StubApp.getString2(21057));

    /* renamed from: a, reason: collision with root package name */
    public final Context f17053a;

    /* renamed from: b, reason: collision with root package name */
    public final JobScheduler f17054b;

    /* renamed from: c, reason: collision with root package name */
    public final k f17055c;

    /* renamed from: d, reason: collision with root package name */
    public final C1270a f17056d;

    public C1271b(Context context, k kVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService(StubApp.getString2(2528));
        C1270a c1270a = new C1270a(context);
        this.f17053a = context;
        this.f17055c = kVar;
        this.f17054b = jobScheduler;
        this.f17056d = c1270a;
    }

    public static void c(JobScheduler jobScheduler, int i3) {
        try {
            jobScheduler.cancel(i3);
        } catch (Throwable th) {
            o e10 = o.e();
            Locale locale = Locale.getDefault();
            Object[] objArr = {Integer.valueOf(i3)};
            e10.d(f17052e, String.format(locale, StubApp.getString2(21058), objArr), th);
        }
    }

    public static ArrayList e(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            o.e().d(f17052e, StubApp.getString2(21059), th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    @Override // j2.InterfaceC1085c
    public final void a(f... fVarArr) {
        int y10;
        k kVar = this.f17055c;
        WorkDatabase workDatabase = kVar.f15298e;
        d dVar = new d(workDatabase, 0);
        for (f fVar : fVarArr) {
            workDatabase.c();
            try {
                f k3 = workDatabase.u().k(fVar.f20302a);
                String str = f17052e;
                if (k3 == null) {
                    o.e().h(str, "Skipping scheduling " + fVar.f20302a + StubApp.getString2("19327"), new Throwable[0]);
                    workDatabase.n();
                } else if (k3.f20303b != 1) {
                    o.e().h(str, "Skipping scheduling " + fVar.f20302a + StubApp.getString2("21060"), new Throwable[0]);
                    workDatabase.n();
                } else {
                    C1565c u2 = workDatabase.r().u(fVar.f20302a);
                    if (u2 != null) {
                        y10 = u2.f20296b;
                    } else {
                        kVar.f15297d.getClass();
                        y10 = dVar.y(kVar.f15297d.f4383b);
                    }
                    if (u2 == null) {
                        kVar.f15298e.r().z(new C1565c(fVar.f20302a, y10));
                    }
                    f(fVar, y10);
                    workDatabase.n();
                }
            } finally {
                workDatabase.j();
            }
        }
    }

    @Override // j2.InterfaceC1085c
    public final boolean b() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0016 A[SYNTHETIC] */
    @Override // j2.InterfaceC1085c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.String r9) {
        /*
            r8 = this;
            android.content.Context r0 = r8.f17053a
            android.app.job.JobScheduler r1 = r8.f17054b
            java.util.ArrayList r0 = e(r0, r1)
            r2 = 0
            if (r0 != 0) goto Lc
            goto L4e
        Lc:
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 2
            r3.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L4d
            java.lang.Object r4 = r0.next()
            android.app.job.JobInfo r4 = (android.app.job.JobInfo) r4
            r5 = 21061(0x5245, float:2.9513E-41)
            java.lang.String r5 = com.stub.StubApp.getString2(r5)
            android.os.PersistableBundle r6 = r4.getExtras()
            if (r6 == 0) goto L3a
            boolean r7 = r6.containsKey(r5)     // Catch: java.lang.NullPointerException -> L3a
            if (r7 == 0) goto L3a
            java.lang.String r5 = r6.getString(r5)     // Catch: java.lang.NullPointerException -> L3a
            goto L3b
        L3a:
            r5 = r2
        L3b:
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L16
            int r4 = r4.getId()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            goto L16
        L4d:
            r2 = r3
        L4e:
            if (r2 == 0) goto L79
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L79
            java.util.Iterator r0 = r2.iterator()
        L5a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L6e
            java.lang.Object r2 = r0.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            c(r1, r2)
            goto L5a
        L6e:
            j2.k r0 = r8.f17055c
            androidx.work.impl.WorkDatabase r0 = r0.f15298e
            a5.c r0 = r0.r()
            r0.J(r9)
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.C1271b.d(java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(f fVar, int i3) {
        int i10;
        JobScheduler jobScheduler = this.f17054b;
        C1270a c1270a = this.f17056d;
        c1270a.getClass();
        i2.b bVar = fVar.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(StubApp.getString2(21061), fVar.f20302a);
        persistableBundle.putBoolean(StubApp.getString2(21062), fVar.c());
        JobInfo.Builder extras = new JobInfo.Builder(i3, c1270a.f17051a).setRequiresCharging(bVar.f14719b).setRequiresDeviceIdle(bVar.f14720c).setExtras(persistableBundle);
        int i11 = bVar.f14718a;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 30 || i11 != 6) {
            int c10 = AbstractC1856e.c(i11);
            if (c10 != 0) {
                if (c10 != 1) {
                    if (c10 != 2) {
                        i10 = 3;
                        if (c10 != 3) {
                            i10 = 4;
                            if (c10 != 4) {
                                o.e().b(C1270a.f17050b, StubApp.getString2(21063).concat(com.mapbox.common.b.y(i11)), new Throwable[0]);
                            }
                        }
                    } else {
                        i10 = 2;
                    }
                }
                i10 = 1;
            } else {
                i10 = 0;
            }
            extras.setRequiredNetworkType(i10);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!bVar.f14720c) {
            extras.setBackoffCriteria(fVar.f20313m, fVar.f20312l == 2 ? 0 : 1);
        }
        long max = Math.max(fVar.a() - System.currentTimeMillis(), 0L);
        if (i12 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!fVar.f20317q) {
            extras.setImportantWhileForeground(true);
        }
        if (bVar.f14725h.f14728a.size() > 0) {
            Iterator it = bVar.f14725h.f14728a.iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(cVar.f14726a, cVar.f14727b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(bVar.f14723f);
            extras.setTriggerContentMaxDelay(bVar.f14724g);
        }
        extras.setPersisted(false);
        extras.setRequiresBatteryNotLow(bVar.f14721d);
        extras.setRequiresStorageNotLow(bVar.f14722e);
        Object[] objArr = fVar.f20311k > 0;
        Object[] objArr2 = max > 0;
        if (J.a.a() && fVar.f20317q && objArr == false && objArr2 == false) {
            extras.setExpedited(true);
        }
        JobInfo build = extras.build();
        o e10 = o.e();
        String str = fVar.f20302a;
        String str2 = f17052e;
        e10.b(str2, StubApp.getString2(21064) + str + StubApp.getString2(21065) + i3, new Throwable[0]);
        try {
            if (jobScheduler.schedule(build) == 0) {
                o.e().h(str2, StubApp.getString2("21066") + fVar.f20302a, new Throwable[0]);
                if (fVar.f20317q && fVar.f20318r == 1) {
                    fVar.f20317q = false;
                    o.e().b(str2, StubApp.getString2("21067") + fVar.f20302a + StubApp.getString2("74"), new Throwable[0]);
                    f(fVar, i3);
                }
            }
        } catch (IllegalStateException e11) {
            ArrayList e12 = e(this.f17053a, jobScheduler);
            int size = e12 != null ? e12.size() : 0;
            Locale locale = Locale.getDefault();
            Integer valueOf = Integer.valueOf(size);
            k kVar = this.f17055c;
            String format = String.format(locale, StubApp.getString2(21069), valueOf, Integer.valueOf(kVar.f15298e.u().g().size()), Integer.valueOf(kVar.f15297d.f4384c));
            o.e().d(str2, format, new Throwable[0]);
            throw new IllegalStateException(format, e11);
        } catch (Throwable th) {
            o.e().d(str2, StubApp.getString2(21068) + fVar, th);
        }
    }
}
