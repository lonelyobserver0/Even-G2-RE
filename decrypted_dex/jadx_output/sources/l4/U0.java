package l4;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class U0 extends AbstractC1150F {

    /* renamed from: c, reason: collision with root package name */
    public JobScheduler f16250c;

    @Override // l4.AbstractC1150F
    public final boolean n() {
        return true;
    }

    public final void o(long j) {
        l();
        k();
        JobScheduler jobScheduler = this.f16250c;
        String string2 = StubApp.getString2(20151);
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        if (jobScheduler != null && jobScheduler.getPendingJob(string2.concat(String.valueOf(c1200n0.f16536a.getPackageName())).hashCode()) != null) {
            T t3 = c1200n0.f16541f;
            C1200n0.l(t3);
            t3.f16249p.b(StubApp.getString2(20152));
            return;
        }
        int p8 = p();
        if (p8 != 2) {
            T t10 = c1200n0.f16541f;
            C1200n0.l(t10);
            t10.f16249p.c(Xa.h.C(p8), StubApp.getString2(20155));
            return;
        }
        T t11 = c1200n0.f16541f;
        C1200n0.l(t11);
        t11.f16249p.c(Long.valueOf(j), StubApp.getString2(20153));
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(StubApp.getString2(652), StubApp.getString2(12374));
        JobInfo build = new JobInfo.Builder(string2.concat(String.valueOf(c1200n0.f16536a.getPackageName())).hashCode(), new ComponentName(c1200n0.f16536a, StubApp.getString2(19738))).setRequiredNetworkType(1).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build();
        JobScheduler jobScheduler2 = this.f16250c;
        S3.D.h(jobScheduler2);
        int schedule = jobScheduler2.schedule(build);
        T t12 = c1200n0.f16541f;
        C1200n0.l(t12);
        t12.f16249p.c(schedule == 1 ? StubApp.getString2(5759) : StubApp.getString2(5760), StubApp.getString2(20154));
    }

    public final int p() {
        l();
        k();
        if (this.f16250c == null) {
            return 7;
        }
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        Boolean w10 = c1200n0.f16539d.w(StubApp.getString2(20018));
        if (!(w10 == null ? false : w10.booleanValue())) {
            return 8;
        }
        if (c1200n0.q().f16138k < 119000) {
            return 6;
        }
        if (K1.D(c1200n0.f16536a)) {
            return !c1200n0.o().r() ? 5 : 2;
        }
        return 3;
    }
}
