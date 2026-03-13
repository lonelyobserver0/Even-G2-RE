package U8;

import D9.f;
import D9.h;
import P7.g;
import Qb.K0;
import Qb.L;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.mapbox.navigation.core.trip.service.NavigationNotificationService;
import h8.InterfaceC1012b;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d {

    /* renamed from: f, reason: collision with root package name */
    public static InterfaceC1012b f7488f;

    /* renamed from: g, reason: collision with root package name */
    public static final CopyOnWriteArraySet f7489g = new CopyOnWriteArraySet();

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1012b f7490a;

    /* renamed from: b, reason: collision with root package name */
    public final b f7491b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f7492c;

    /* renamed from: d, reason: collision with root package name */
    public final f f7493d;

    /* renamed from: e, reason: collision with root package name */
    public K0 f7494e;

    public d(Context applicationContext, InterfaceC1012b tripNotification, h threadController) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(tripNotification, "tripNotification");
        Intrinsics.checkNotNullParameter(threadController, "threadController");
        Intent intent = new Intent(applicationContext, (Class<?>) NavigationNotificationService.class);
        b initializeLambda = new b(applicationContext, 0, intent);
        b terminateLambda = new b(applicationContext, 1, intent);
        Intrinsics.checkNotNullParameter(tripNotification, "tripNotification");
        Intrinsics.checkNotNullParameter(initializeLambda, "initializeLambda");
        Intrinsics.checkNotNullParameter(terminateLambda, "terminateLambda");
        Intrinsics.checkNotNullParameter(threadController, "threadController");
        this.f7490a = tripNotification;
        this.f7491b = terminateLambda;
        this.f7492c = new AtomicBoolean(false);
        this.f7493d = threadController.a();
    }

    public final void a(g tripNotificationState) {
        Intrinsics.checkNotNullParameter(tripNotificationState, "tripNotificationState");
        K0 k02 = this.f7494e;
        if (k02 != null) {
            k02.d(null);
        }
        if (SystemClock.elapsedRealtime() >= 0) {
            this.f7490a.updateNotification(tripNotificationState);
        } else {
            this.f7494e = L.j(this.f7493d.f1513b, null, new c(this, tripNotificationState, null), 3);
        }
    }
}
