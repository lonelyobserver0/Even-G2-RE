package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f11151a = 0;

    static {
        StubApp.interface11(3945);
    }

    @Override // android.app.job.JobService
    public final native boolean onStartJob(JobParameters jobParameters);

    @Override // android.app.job.JobService
    public final native boolean onStopJob(JobParameters jobParameters);
}
