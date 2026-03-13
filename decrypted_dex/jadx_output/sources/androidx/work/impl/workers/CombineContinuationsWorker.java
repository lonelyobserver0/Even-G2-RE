package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import i2.m;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class CombineContinuationsWorker extends Worker {
    public CombineContinuationsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public final m h() {
        return new m(this.f10356b.f10363b);
    }
}
