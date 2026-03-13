package kb;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.Intent;
import android.util.Log;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    public final JobWorkItem f15552a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f15553b;

    public l(m mVar, JobWorkItem jobWorkItem) {
        this.f15553b = mVar;
        this.f15552a = jobWorkItem;
    }

    @Override // kb.k
    public final void a() {
        synchronized (this.f15553b.f15555b) {
            JobParameters jobParameters = this.f15553b.f15556c;
            if (jobParameters != null) {
                try {
                    jobParameters.completeWork(this.f15552a);
                } catch (IllegalArgumentException e10) {
                    Log.e(StubApp.getString2("18363"), StubApp.getString2("19193"), e10);
                } catch (SecurityException e11) {
                    Log.e(StubApp.getString2("18363"), StubApp.getString2("19194"), e11);
                }
            }
        }
    }

    @Override // kb.k
    public final Intent getIntent() {
        return this.f15552a.getIntent();
    }
}
