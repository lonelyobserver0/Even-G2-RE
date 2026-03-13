package androidx.work;

import Q4.c;
import Qb.C0227w0;
import Qb.J;
import Qb.L;
import Qb.W;
import Vb.f;
import Xb.d;
import android.content.Context;
import i.RunnableC1018B;
import i2.e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import s2.g;
import t2.j;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/ListenableWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime-ktx_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class CoroutineWorker extends ListenableWorker {

    /* renamed from: f, reason: collision with root package name */
    public final C0227w0 f10352f;

    /* renamed from: g, reason: collision with root package name */
    public final j f10353g;

    /* renamed from: h, reason: collision with root package name */
    public final d f10354h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f10352f = L.a();
        j jVar = new j();
        Intrinsics.checkNotNullExpressionValue(jVar, "create()");
        this.f10353g = jVar;
        jVar.a(new RunnableC1018B(this, 1), (g) this.f10356b.f10366e.f20820a);
        this.f10354h = W.f5838a;
    }

    @Override // androidx.work.ListenableWorker
    public final c a() {
        C0227w0 a3 = L.a();
        f a9 = J.a(this.f10354h.plus(a3));
        i2.j jVar = new i2.j(a3);
        L.j(a9, null, new e(jVar, this, null), 3);
        return jVar;
    }

    @Override // androidx.work.ListenableWorker
    public final void c() {
        this.f10353g.cancel(false);
    }

    @Override // androidx.work.ListenableWorker
    public final j d() {
        L.j(J.a(this.f10354h.plus(this.f10352f)), null, new i2.f(this, null), 3);
        return this.f10353g;
    }

    public abstract Object h(ContinuationImpl continuationImpl);
}
