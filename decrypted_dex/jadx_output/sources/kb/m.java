package kb;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class m extends JobServiceEngine {

    /* renamed from: a, reason: collision with root package name */
    public final io.flutter.plugins.firebase.messaging.a f15554a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15555b;

    /* renamed from: c, reason: collision with root package name */
    public JobParameters f15556c;

    public m(io.flutter.plugins.firebase.messaging.a aVar) {
        super(aVar);
        this.f15555b = new Object();
        this.f15554a = aVar;
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStartJob(JobParameters jobParameters) {
        this.f15556c = jobParameters;
        this.f15554a.a(false);
        return true;
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStopJob(JobParameters jobParameters) {
        a5.c cVar = this.f15554a.f15091c;
        if (cVar != null) {
            ((io.flutter.plugins.firebase.messaging.a) cVar.f9284d).c();
        }
        synchronized (this.f15555b) {
            this.f15556c = null;
        }
        return true;
    }
}
