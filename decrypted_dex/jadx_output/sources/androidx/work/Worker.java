package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import i.RunnableC1018B;
import i2.m;
import t2.j;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class Worker extends ListenableWorker {

    /* renamed from: f, reason: collision with root package name */
    public j f10361f;

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.ListenableWorker
    public final j d() {
        this.f10361f = new j();
        this.f10356b.f10365d.execute(new RunnableC1018B(this, 2));
        return this.f10361f;
    }

    public abstract m h();
}
