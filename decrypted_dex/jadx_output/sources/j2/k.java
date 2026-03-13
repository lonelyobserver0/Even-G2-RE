package j2;

import A3.s;
import J1.p;
import K.m;
import a.AbstractC0378a;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.stub.StubApp;
import f4.C0882f;
import i2.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import k2.C1105b;
import kotlin.jvm.internal.Intrinsics;
import m2.C1271b;
import sa.C1608a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class k extends AbstractC0378a {

    /* renamed from: l, reason: collision with root package name */
    public static k f15293l;

    /* renamed from: m, reason: collision with root package name */
    public static k f15294m;

    /* renamed from: n, reason: collision with root package name */
    public static final Object f15295n;

    /* renamed from: c, reason: collision with root package name */
    public final Context f15296c;

    /* renamed from: d, reason: collision with root package name */
    public final La.b f15297d;

    /* renamed from: e, reason: collision with root package name */
    public final WorkDatabase f15298e;

    /* renamed from: f, reason: collision with root package name */
    public final C1608a f15299f;

    /* renamed from: g, reason: collision with root package name */
    public final List f15300g;

    /* renamed from: h, reason: collision with root package name */
    public final C1084b f15301h;

    /* renamed from: i, reason: collision with root package name */
    public final C0882f f15302i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f15303k;

    static {
        o.g(StubApp.getString2(18999));
        f15293l = null;
        f15294m = null;
        f15295n = new Object();
    }

    public k(Context context, La.b bVar, C1608a c1608a) {
        p r8;
        boolean z2 = context.getResources().getBoolean(2130968584);
        Context context2 = StubApp.getOrigApplicationContext(context.getApplicationContext());
        s2.g executor = (s2.g) c1608a.f20820a;
        int i3 = WorkDatabase.f10369n;
        if (z2) {
            Intrinsics.checkNotNullParameter(context2, "context");
            Intrinsics.checkNotNullParameter(WorkDatabase.class, "klass");
            r8 = new p(context2, WorkDatabase.class, null);
            r8.j = true;
        } else {
            String str = j.f15291a;
            r8 = Ec.d.r(context2, WorkDatabase.class, StubApp.getString2(18994));
            r8.f3352i = new B8.a(context2, 1);
        }
        Intrinsics.checkNotNullParameter(executor, "executor");
        r8.f3350g = executor;
        f callback = new f();
        Intrinsics.checkNotNullParameter(callback, "callback");
        r8.f3347d.add(callback);
        r8.a(i.f15284a);
        r8.a(new h(context2, 2, 3));
        r8.a(i.f15285b);
        r8.a(i.f15286c);
        r8.a(new h(context2, 5, 6));
        r8.a(i.f15287d);
        r8.a(i.f15288e);
        r8.a(i.f15289f);
        r8.a(new h(context2));
        r8.a(new h(context2, 10, 11));
        r8.a(i.f15290g);
        r8.f3354l = false;
        r8.f3355m = true;
        WorkDatabase workDatabase = (WorkDatabase) r8.b();
        Context origApplicationContext = StubApp.getOrigApplicationContext(context.getApplicationContext());
        o oVar = new o(bVar.f4382a);
        synchronized (o.class) {
            o.f14745b = oVar;
        }
        String str2 = AbstractC1086d.f15272a;
        C1271b c1271b = new C1271b(origApplicationContext, this);
        s2.e.a(origApplicationContext, SystemJobService.class, true);
        o.e().b(AbstractC1086d.f15272a, StubApp.getString2(19000), new Throwable[0]);
        List asList = Arrays.asList(c1271b, new C1105b(origApplicationContext, bVar, c1608a, this));
        C1084b c1084b = new C1084b(context, bVar, c1608a, workDatabase, asList);
        Context origApplicationContext2 = StubApp.getOrigApplicationContext(context.getApplicationContext());
        this.f15296c = origApplicationContext2;
        this.f15297d = bVar;
        this.f15299f = c1608a;
        this.f15298e = workDatabase;
        this.f15300g = asList;
        this.f15301h = c1084b;
        this.f15302i = new C0882f(workDatabase, 16);
        this.j = false;
        if (origApplicationContext2.isDeviceProtectedStorage()) {
            throw new IllegalStateException(StubApp.getString2(19001));
        }
        this.f15299f.j(new s2.c(origApplicationContext2, this));
    }

    public static k L(Context context) {
        k kVar;
        Object obj = f15295n;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    kVar = f15293l;
                    if (kVar == null) {
                        kVar = f15294m;
                    }
                }
                return kVar;
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
        if (kVar != null) {
            return kVar;
        }
        context.getApplicationContext();
        throw new IllegalStateException(StubApp.getString2("19002"));
    }

    public final void M() {
        synchronized (f15295n) {
            try {
                this.j = true;
                BroadcastReceiver.PendingResult pendingResult = this.f15303k;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f15303k = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void N() {
        ArrayList e10;
        WorkDatabase workDatabase = this.f15298e;
        Context context = this.f15296c;
        String str = C1271b.f17052e;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService(StubApp.getString2(2528));
        if (jobScheduler != null && (e10 = C1271b.e(context, jobScheduler)) != null && !e10.isEmpty()) {
            Iterator it = e10.iterator();
            while (it.hasNext()) {
                C1271b.c(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        s u2 = workDatabase.u();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) u2.f189a;
        workDatabase_Impl.b();
        Q2.e eVar = (Q2.e) u2.f197i;
        P1.k a3 = eVar.a();
        workDatabase_Impl.c();
        try {
            a3.d();
            workDatabase_Impl.n();
            workDatabase_Impl.j();
            eVar.d(a3);
            AbstractC1086d.a(this.f15297d, workDatabase, this.f15300g);
        } catch (Throwable th) {
            workDatabase_Impl.j();
            eVar.d(a3);
            throw th;
        }
    }

    public final void O(String str, V6.b bVar) {
        C1608a c1608a = this.f15299f;
        m mVar = new m(18);
        mVar.f3571b = this;
        mVar.f3572c = str;
        mVar.f3573d = bVar;
        c1608a.j(mVar);
    }
}
