package d;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import i.AbstractActivityC1027h;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class i implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: a, reason: collision with root package name */
    public final long f13061a = SystemClock.uptimeMillis() + 10000;

    /* renamed from: b, reason: collision with root package name */
    public Runnable f13062b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13063c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC1027h f13064d;

    public i(AbstractActivityC1027h abstractActivityC1027h) {
        this.f13064d = abstractActivityC1027h;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f13062b = runnable;
        View decorView = this.f13064d.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        if (!this.f13063c) {
            decorView.postOnAnimation(new B0.o(this, 19));
        } else if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z2;
        Runnable runnable = this.f13062b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f13061a) {
                this.f13063c = false;
                this.f13064d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f13062b = null;
        s sVar = (s) this.f13064d.f13082g.getValue();
        synchronized (sVar.f13098b) {
            z2 = sVar.f13099c;
        }
        if (z2) {
            this.f13063c = false;
            this.f13064d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13064d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
