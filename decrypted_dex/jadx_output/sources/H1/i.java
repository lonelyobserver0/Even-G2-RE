package H1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.stub.StubApp;
import v.k;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final k f2695a = new k();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f2696b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static u5.d f2697c = null;

    public static long a(Context context) {
        PackageManager packageManager = StubApp.getOrigApplicationContext(context.getApplicationContext()).getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? g.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static u5.d b() {
        u5.d dVar = new u5.d(9);
        f2697c = dVar;
        f2695a.j(dVar);
        return f2697c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:24|(1:91)(1:28)|29|(1:90)(1:33)|34|35|36|(2:76|77)(1:38)|39|(9:46|(1:50)|(1:57)|58|(2:66|67)|62|63|64|65)|(1:73)(1:(1:75))|(1:50)|(3:52|55|57)|58|(1:60)|66|67|62|63|64|65) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00dd, code lost:
    
        r5 = 327680;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(android.content.Context r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H1.i.c(android.content.Context, boolean):void");
    }
}
