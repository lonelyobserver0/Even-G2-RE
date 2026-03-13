package P3;

import Dc.B;
import L9.n;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.stub.StubApp;
import d4.AbstractC0800a;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import q4.s;
import t.C1697j;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b {

    /* renamed from: h, reason: collision with root package name */
    public static int f5489h;

    /* renamed from: i, reason: collision with root package name */
    public static PendingIntent f5490i;
    public static final Pattern j = Pattern.compile(StubApp.getString2(4846));

    /* renamed from: a, reason: collision with root package name */
    public final C1697j f5491a = new C1697j(0);

    /* renamed from: b, reason: collision with root package name */
    public final Context f5492b;

    /* renamed from: c, reason: collision with root package name */
    public final B f5493c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f5494d;

    /* renamed from: e, reason: collision with root package name */
    public final Messenger f5495e;

    /* renamed from: f, reason: collision with root package name */
    public Messenger f5496f;

    /* renamed from: g, reason: collision with root package name */
    public g f5497g;

    public b(Context context) {
        this.f5492b = context;
        B b2 = new B();
        b2.f1540b = 0;
        b2.f1541c = context;
        this.f5493c = b2;
        this.f5495e = new Messenger(new e(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f5494d = scheduledThreadPoolExecutor;
    }

    public final s a(Bundle bundle) {
        String num;
        synchronized (b.class) {
            int i3 = f5489h;
            f5489h = i3 + 1;
            num = Integer.toString(i3);
        }
        q4.k kVar = new q4.k();
        synchronized (this.f5491a) {
            this.f5491a.put(num, kVar);
        }
        Intent intent = new Intent();
        intent.setPackage(StubApp.getString2(0));
        if (this.f5493c.k() == 2) {
            intent.setAction(StubApp.getString2(1479));
        } else {
            intent.setAction(StubApp.getString2(4847));
        }
        intent.putExtras(bundle);
        Context context = this.f5492b;
        synchronized (b.class) {
            try {
                if (f5490i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage(StubApp.getString2("4848"));
                    f5490i = PendingIntent.getBroadcast(context, 0, intent2, AbstractC0800a.f13412a);
                }
                intent.putExtra(StubApp.getString2("4849"), f5490i);
            } finally {
            }
        }
        intent.putExtra(StubApp.getString2(4852), StubApp.getString2(4850) + num + StubApp.getString2(4851));
        if (Log.isLoggable(StubApp.getString2(3470), 3)) {
            Log.d(StubApp.getString2(3470), StubApp.getString2(4853).concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra(StubApp.getString2(4854), this.f5495e);
        if (this.f5496f != null || this.f5497g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f5496f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    Messenger messenger2 = this.f5497g.f5504a;
                    messenger2.getClass();
                    messenger2.send(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable(StubApp.getString2(3470), 3)) {
                    Log.d(StubApp.getString2(3470), StubApp.getString2(4855));
                }
            }
            kVar.f20051a.addOnCompleteListener(h.f5506c, new Q2.g(this, num, this.f5494d.schedule(new n(kVar, 14), 30L, TimeUnit.SECONDS), 19));
            return kVar.f20051a;
        }
        if (this.f5493c.k() == 2) {
            this.f5492b.sendBroadcast(intent);
        } else {
            this.f5492b.startService(intent);
        }
        kVar.f20051a.addOnCompleteListener(h.f5506c, new Q2.g(this, num, this.f5494d.schedule(new n(kVar, 14), 30L, TimeUnit.SECONDS), 19));
        return kVar.f20051a;
    }

    public final void b(String str, Bundle bundle) {
        String string2 = StubApp.getString2(4856);
        synchronized (this.f5491a) {
            try {
                q4.k kVar = (q4.k) this.f5491a.remove(str);
                if (kVar != null) {
                    kVar.b(bundle);
                    return;
                }
                Log.w(StubApp.getString2("3470"), string2 + str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
