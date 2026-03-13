package kb;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class n extends o {

    /* renamed from: d, reason: collision with root package name */
    public final JobInfo f15557d;

    /* renamed from: e, reason: collision with root package name */
    public final JobScheduler f15558e;

    public n(Context context, ComponentName componentName, int i3) {
        super(componentName);
        b(i3);
        this.f15557d = new JobInfo.Builder(i3, componentName).setOverrideDeadline(0L).build();
        this.f15558e = (JobScheduler) StubApp.getOrigApplicationContext(context.getApplicationContext()).getSystemService(StubApp.getString2(2528));
    }

    @Override // kb.o
    public final void a(Intent intent) {
        this.f15558e.enqueue(this.f15557d, new JobWorkItem(intent));
    }
}
