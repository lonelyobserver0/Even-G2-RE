package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import i.RunnableC1018B;
import i2.o;
import java.util.ArrayList;
import java.util.List;
import n2.InterfaceC1381b;
import t2.j;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements InterfaceC1381b {

    /* renamed from: l, reason: collision with root package name */
    public static final String f10393l = o.g("ConstraintTrkngWrkr");

    /* renamed from: f, reason: collision with root package name */
    public final WorkerParameters f10394f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f10395g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f10396h;
    public final j j;

    /* renamed from: k, reason: collision with root package name */
    public ListenableWorker f10397k;

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f10394f = workerParameters;
        this.f10395g = new Object();
        this.f10396h = false;
        this.j = new j();
    }

    @Override // androidx.work.ListenableWorker
    public final boolean b() {
        ListenableWorker listenableWorker = this.f10397k;
        return listenableWorker != null && listenableWorker.b();
    }

    @Override // androidx.work.ListenableWorker
    public final void c() {
        ListenableWorker listenableWorker = this.f10397k;
        if (listenableWorker == null || listenableWorker.f10357c) {
            return;
        }
        this.f10397k.g();
    }

    @Override // androidx.work.ListenableWorker
    public final j d() {
        this.f10356b.f10365d.execute(new RunnableC1018B(this, 17));
        return this.j;
    }

    @Override // n2.InterfaceC1381b
    public final void e(ArrayList arrayList) {
        o.e().b(f10393l, String.format("Constraints changed for %s", arrayList), new Throwable[0]);
        synchronized (this.f10395g) {
            this.f10396h = true;
        }
    }

    @Override // n2.InterfaceC1381b
    public final void f(List list) {
    }
}
