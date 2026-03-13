package D5;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class K implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f1377f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static Boolean f1378g;

    /* renamed from: h, reason: collision with root package name */
    public static Boolean f1379h;

    /* renamed from: a, reason: collision with root package name */
    public final Context f1380a;

    /* renamed from: b, reason: collision with root package name */
    public final u f1381b;

    /* renamed from: c, reason: collision with root package name */
    public final PowerManager.WakeLock f1382c;

    /* renamed from: d, reason: collision with root package name */
    public final I f1383d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1384e;

    public K(I i3, Context context, u uVar, long j) {
        this.f1383d = i3;
        this.f1380a = context;
        this.f1384e = j;
        this.f1381b = uVar;
        this.f1382c = ((PowerManager) context.getSystemService(StubApp.getString2(1358))).newWakeLock(1, StubApp.getString2(1390));
    }

    public static boolean a(Context context) {
        boolean booleanValue;
        synchronized (f1377f) {
            try {
                Boolean bool = f1379h;
                Boolean valueOf = Boolean.valueOf(bool == null ? b(context, StubApp.getString2("1007"), bool) : bool.booleanValue());
                f1379h = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public static boolean b(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z2 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z2) {
            String string2 = StubApp.getString2(493);
            if (Log.isLoggable(string2, 3)) {
                Log.d(string2, StubApp.getString2(1391) + str + StubApp.getString2(1392));
            }
        }
        return z2;
    }

    public static boolean c(Context context) {
        boolean booleanValue;
        synchronized (f1377f) {
            try {
                Boolean bool = f1378g;
                Boolean valueOf = Boolean.valueOf(bool == null ? b(context, StubApp.getString2("1305"), bool) : bool.booleanValue());
                f1378g = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public final synchronized boolean d() {
        boolean z2;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f1380a.getSystemService(StubApp.getString2("1008"));
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                z2 = activeNetworkInfo.isConnected();
            }
        } catch (Throwable th) {
            throw th;
        }
        return z2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:48:0x0040
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        /*
            r10 = this;
            r0 = 1393(0x571, float:1.952E-42)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r1 = 493(0x1ed, float:6.91E-43)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            D5.I r2 = r10.f1383d
            r3 = 1394(0x572, float:1.953E-42)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            android.content.Context r4 = r10.f1380a
            boolean r5 = c(r4)
            android.os.PowerManager$WakeLock r6 = r10.f1382c
            if (r5 == 0) goto L26
            long r7 = D5.AbstractC0042f.f1418a
            r6.acquire(r7)
        L26:
            r5 = 1
            r7 = 0
            r2.e(r5)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            D5.u r5 = r10.f1381b     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            boolean r5 = r5.d()     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            if (r5 != 0) goto L48
            r2.e(r7)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            boolean r2 = c(r4)
            if (r2 == 0) goto L98
        L3c:
            r6.release()     // Catch: java.lang.RuntimeException -> L40
            return
        L40:
            android.util.Log.i(r1, r0)
            goto L98
        L44:
            r2 = move-exception
            goto L99
        L46:
            r5 = move-exception
            goto L79
        L48:
            boolean r5 = a(r4)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            if (r5 == 0) goto L63
            boolean r5 = r10.d()     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            if (r5 != 0) goto L63
            D5.J r5 = new D5.J     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            r5.<init>(r10, r10)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            r5.a()     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            boolean r2 = c(r4)
            if (r2 == 0) goto L98
            goto L3c
        L63:
            boolean r5 = r2.g()     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            if (r5 == 0) goto L6d
            r2.e(r7)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            goto L72
        L6d:
            long r8 = r10.f1384e     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            r2.h(r8)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
        L72:
            boolean r2 = c(r4)
            if (r2 == 0) goto L98
            goto L3c
        L79:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            r8.<init>(r3)     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = r5.getMessage()     // Catch: java.lang.Throwable -> L44
            r8.append(r3)     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = r8.toString()     // Catch: java.lang.Throwable -> L44
            android.util.Log.e(r1, r3)     // Catch: java.lang.Throwable -> L44
            r2.e(r7)     // Catch: java.lang.Throwable -> L44
            boolean r2 = c(r4)
            if (r2 == 0) goto L98
            r6.release()     // Catch: java.lang.RuntimeException -> L40
        L98:
            return
        L99:
            boolean r3 = c(r4)
            if (r3 == 0) goto La6
            r6.release()     // Catch: java.lang.RuntimeException -> La3
            goto La6
        La3:
            android.util.Log.i(r1, r0)
        La6:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: D5.K.run():void");
    }
}
