package l4;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class v1 extends A1 {

    /* renamed from: d, reason: collision with root package name */
    public final AlarmManager f16642d;

    /* renamed from: e, reason: collision with root package name */
    public p1 f16643e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f16644f;

    public v1(F1 f12) {
        super(f12);
        this.f16642d = (AlarmManager) ((C1200n0) this.f4728a).f16536a.getSystemService(StubApp.getString2(1822));
    }

    @Override // l4.A1
    public final void n() {
        AlarmManager alarmManager = this.f16642d;
        if (alarmManager != null) {
            Context context = ((C1200n0) this.f4728a).f16536a;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, StubApp.getString2(19952)).setAction(StubApp.getString2(12372)), com.google.android.gms.internal.measurement.E.f11250a));
        }
        q();
    }

    public final void o() {
        l();
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        T t3 = c1200n0.f16541f;
        C1200n0.l(t3);
        t3.f16249p.b(StubApp.getString2(20907));
        AlarmManager alarmManager = this.f16642d;
        if (alarmManager != null) {
            Context context = c1200n0.f16536a;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, StubApp.getString2(19952)).setAction(StubApp.getString2(12372)), com.google.android.gms.internal.measurement.E.f11250a));
        }
        p().c();
        q();
    }

    public final AbstractC1202o p() {
        if (this.f16643e == null) {
            this.f16643e = new p1(this, this.f16651b.f16069m);
        }
        return this.f16643e;
    }

    public final void q() {
        JobScheduler jobScheduler = (JobScheduler) ((C1200n0) this.f4728a).f16536a.getSystemService(StubApp.getString2(2528));
        if (jobScheduler != null) {
            jobScheduler.cancel(r());
        }
    }

    public final int r() {
        if (this.f16644f == null) {
            this.f16644f = Integer.valueOf(StubApp.getString2(20908).concat(String.valueOf(((C1200n0) this.f4728a).f16536a.getPackageName())).hashCode());
        }
        return this.f16644f.intValue();
    }
}
