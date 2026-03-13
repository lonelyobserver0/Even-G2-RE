package C;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.provider.Settings;
import com.stub.StubApp;
import java.util.HashSet;
import java.util.Set;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class J {

    /* renamed from: d, reason: collision with root package name */
    public static String f805d;

    /* renamed from: g, reason: collision with root package name */
    public static I f808g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f809a;

    /* renamed from: b, reason: collision with root package name */
    public final NotificationManager f810b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f804c = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static HashSet f806e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public static final Object f807f = new Object();

    public J(Context context) {
        this.f809a = context;
        this.f810b = (NotificationManager) context.getSystemService(StubApp.getString2(490));
    }

    public static Set b(Context context) {
        HashSet hashSet;
        String string = Settings.Secure.getString(context.getContentResolver(), StubApp.getString2(781));
        synchronized (f804c) {
            if (string != null) {
                try {
                    if (!string.equals(f805d)) {
                        String[] split = string.split(StubApp.getString2("478"), -1);
                        HashSet hashSet2 = new HashSet(split.length);
                        for (String str : split) {
                            ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                            if (unflattenFromString != null) {
                                hashSet2.add(unflattenFromString.getPackageName());
                            }
                        }
                        f806e = hashSet2;
                        f805d = string;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            hashSet = f806e;
        }
        return hashSet;
    }

    public final void a(int i3, String str) {
        this.f810b.cancel(str, i3);
    }

    public final void c(String str, int i3, Notification notification) {
        Bundle bundle = notification.extras;
        NotificationManager notificationManager = this.f810b;
        if (bundle == null || !bundle.getBoolean(StubApp.getString2(782))) {
            notificationManager.notify(str, i3, notification);
            return;
        }
        F f10 = new F(this.f809a.getPackageName(), i3, str, notification);
        synchronized (f807f) {
            try {
                if (f808g == null) {
                    f808g = new I(StubApp.getOrigApplicationContext(this.f809a.getApplicationContext()));
                }
                f808g.f801b.obtainMessage(0, f10).sendToTarget();
            } catch (Throwable th) {
                throw th;
            }
        }
        notificationManager.cancel(str, i3);
    }
}
