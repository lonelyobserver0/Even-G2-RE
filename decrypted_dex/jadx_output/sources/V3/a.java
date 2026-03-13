package V3;

import S3.D;
import S3.M;
import Y3.c;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.stub.StubApp;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f7743b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static volatile a f7744c;

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f7745a = new ConcurrentHashMap();

    public static a b() {
        if (f7744c == null) {
            synchronized (f7743b) {
                try {
                    if (f7744c == null) {
                        f7744c = new a();
                    }
                } finally {
                }
            }
        }
        a aVar = f7744c;
        D.h(aVar);
        return aVar;
    }

    public final boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i3) {
        return d(context, context.getClass().getName(), intent, serviceConnection, i3, null);
    }

    public final void c(Context context, ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof M)) {
            ConcurrentHashMap concurrentHashMap = this.f7745a;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i3, Executor executor) {
        boolean bindService;
        ComponentName component = intent.getComponent();
        String string2 = StubApp.getString2(6508);
        if (component != null) {
            String packageName = component.getPackageName();
            StubApp.getString2(0).equals(packageName);
            try {
                if ((c.a(context).a(0, packageName).flags & PKIFailureInfo.badSenderNonce) != 0) {
                    Log.w(string2, StubApp.getString2(6509));
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof M) {
            if (executor == null) {
                executor = null;
            }
            if (Build.VERSION.SDK_INT < 29 || executor == null) {
                return context.bindService(intent, serviceConnection, i3);
            }
            bindService = context.bindService(intent, i3, executor, serviceConnection);
            return bindService;
        }
        ConcurrentHashMap concurrentHashMap = this.f7745a;
        ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w(string2, String.format(StubApp.getString2(6510), serviceConnection, str, intent.getAction()));
        }
        if (executor == null) {
            executor = null;
        }
        try {
            boolean bindService2 = (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i3) : context.bindService(intent, i3, executor, serviceConnection);
            if (bindService2) {
                return bindService2;
            }
            return false;
        } finally {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
        }
    }
}
