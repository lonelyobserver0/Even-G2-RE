package com.google.android.gms.measurement;

import Z9.C0366a;
import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.stub.StubApp;
import l4.InterfaceC1198m1;

@TargetApi(24)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class AppMeasurementJobService extends JobService implements InterfaceC1198m1 {

    /* renamed from: a, reason: collision with root package name */
    public C0366a f11801a;

    static {
        StubApp.interface11(4269);
    }

    @Override // l4.InterfaceC1198m1
    public final native boolean a(int i3);

    @Override // l4.InterfaceC1198m1
    public final native void b(Intent intent);

    @Override // l4.InterfaceC1198m1
    public final native void c(JobParameters jobParameters);

    public final native C0366a d();

    @Override // android.app.Service
    public final native void onCreate();

    @Override // android.app.Service
    public final native void onDestroy();

    @Override // android.app.Service
    public final native void onRebind(Intent intent);

    @Override // android.app.job.JobService
    public final native boolean onStartJob(JobParameters jobParameters);

    @Override // android.app.job.JobService
    public final native boolean onStopJob(JobParameters jobParameters);

    @Override // android.app.Service
    public final native boolean onUnbind(Intent intent);
}
