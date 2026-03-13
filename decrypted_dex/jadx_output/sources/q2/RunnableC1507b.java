package q2;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* renamed from: q2.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class RunnableC1507b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19926a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Notification f19927b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f19928c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f19929d;

    public RunnableC1507b(SystemForegroundService systemForegroundService, int i3, Notification notification, int i10) {
        this.f19929d = systemForegroundService;
        this.f19926a = i3;
        this.f19927b = notification;
        this.f19928c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = Build.VERSION.SDK_INT;
        Notification notification = this.f19927b;
        int i10 = this.f19926a;
        SystemForegroundService systemForegroundService = this.f19929d;
        if (i3 >= 29) {
            systemForegroundService.startForeground(i10, notification, this.f19928c);
        } else {
            systemForegroundService.startForeground(i10, notification);
        }
    }
}
