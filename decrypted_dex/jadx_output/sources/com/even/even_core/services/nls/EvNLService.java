package com.even.even_core.services.nls;

import Qb.J;
import Qb.L;
import Qb.W;
import Vb.f;
import Vb.q;
import android.app.Notification;
import android.content.Intent;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/even/even_core/services/nls/EvNLService;", "Landroid/service/notification/NotificationListenerService;", "<init>", "()V", "even_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class EvNLService extends NotificationListenerService {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f11127h;

    /* renamed from: a, reason: collision with root package name */
    public boolean f11128a;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11132e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11134g;

    /* renamed from: b, reason: collision with root package name */
    public final f f11129b = J.a(CoroutineContext.Element.DefaultImpls.plus(L.b(), W.f5839b));

    /* renamed from: c, reason: collision with root package name */
    public final f f11130c = new f(CoroutineContext.Element.DefaultImpls.plus(L.b(), q.f7968a));

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f11131d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f11133f = new ArrayList();

    static {
        StubApp.interface11(3048);
    }

    public static final native void b(EvNLService evNLService);

    public static final native void c(EvNLService evNLService);

    public static final native void d(EvNLService evNLService, Map map);

    public static final native String f(EvNLService evNLService, long j);

    public final native Notification g();

    public final native synchronized void h(StatusBarNotification statusBarNotification);

    public final native synchronized void i(StatusBarNotification statusBarNotification);

    public final native void j();

    @Override // android.app.Service
    public final native void onCreate();

    @Override // android.service.notification.NotificationListenerService, android.app.Service
    public final native void onDestroy();

    @Override // android.service.notification.NotificationListenerService
    public final native void onListenerConnected();

    @Override // android.service.notification.NotificationListenerService
    public final native void onListenerDisconnected();

    @Override // android.service.notification.NotificationListenerService
    public final native void onNotificationPosted(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap);

    @Override // android.service.notification.NotificationListenerService
    public final native void onNotificationRemoved(StatusBarNotification statusBarNotification);

    @Override // android.app.Service
    public final native int onStartCommand(Intent intent, int i3, int i10);
}
