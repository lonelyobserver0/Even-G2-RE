package D5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Base64;
import android.util.Log;
import com.stub.StubApp;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import q4.InterfaceC1521b;
import t.C1692e;

/* renamed from: D5.k, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0047k {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f1432c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static O f1433d;

    /* renamed from: a, reason: collision with root package name */
    public final Object f1434a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1435b;

    public C0047k(ExecutorService executorService) {
        this.f1435b = new C1692e(0);
        this.f1434a = executorService;
    }

    public static q4.j a(Context context, Intent intent, boolean z2) {
        O o5;
        if (Log.isLoggable(StubApp.getString2(493), 3)) {
            Log.d(StubApp.getString2(493), StubApp.getString2(1456));
        }
        synchronized (f1432c) {
            try {
                if (f1433d == null) {
                    f1433d = new O(context);
                }
                o5 = f1433d;
            } finally {
            }
        }
        if (!z2) {
            return o5.b(intent).continueWith(new G1.c(0), new A1.a(6));
        }
        if (B.D().G(context)) {
            synchronized (L.f1386b) {
                try {
                    L.a(context);
                    boolean booleanExtra = intent.getBooleanExtra(StubApp.getString2("1395"), false);
                    intent.putExtra(StubApp.getString2("1395"), true);
                    if (!booleanExtra) {
                        L.f1387c.a(L.f1385a);
                    }
                    o5.b(intent).addOnCompleteListener(new C2.d(intent, 5));
                } finally {
                }
            }
        } else {
            o5.b(intent);
        }
        return a4.f.m(-1);
    }

    public q4.j b(final Intent intent) {
        String string2 = StubApp.getString2(1457);
        String stringExtra = intent.getStringExtra(string2);
        if (stringExtra != null) {
            intent.putExtra(StubApp.getString2(1458), Base64.decode(stringExtra, 0));
            intent.removeExtra(string2);
        }
        final Context context = (Context) this.f1434a;
        boolean z2 = context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z10 = (intent.getFlags() & 268435456) != 0;
        if (z2 && !z10) {
            return a(context, intent, z10);
        }
        G1.c cVar = (G1.c) this.f1435b;
        return a4.f.e(cVar, new Callable() { // from class: D5.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                ServiceInfo serviceInfo;
                String str2;
                int i3;
                ComponentName startService;
                Context context2 = context;
                Intent intent2 = intent;
                B D6 = B.D();
                D6.getClass();
                if (Log.isLoggable(StubApp.getString2(493), 3)) {
                    Log.d(StubApp.getString2(493), StubApp.getString2(1448));
                }
                ((ArrayDeque) D6.f1343d).offer(intent2);
                Intent intent3 = new Intent(StubApp.getString2(1399));
                intent3.setPackage(context2.getPackageName());
                String string22 = StubApp.getString2(1449);
                synchronized (D6) {
                    try {
                        str = (String) D6.f1340a;
                        if (str == null) {
                            ResolveInfo resolveService = context2.getPackageManager().resolveService(intent3, 0);
                            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                                if (context2.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                                    if (str2.startsWith(StubApp.getString2("1"))) {
                                        D6.f1340a = context2.getPackageName() + serviceInfo.name;
                                    } else {
                                        D6.f1340a = serviceInfo.name;
                                    }
                                    str = (String) D6.f1340a;
                                }
                                Log.e(StubApp.getString2("493"), string22 + serviceInfo.packageName + StubApp.getString2("601") + serviceInfo.name);
                                str = null;
                            }
                            Log.e(StubApp.getString2("493"), StubApp.getString2("1450"));
                            str = null;
                        }
                    } finally {
                    }
                }
                if (str != null) {
                    if (Log.isLoggable(StubApp.getString2(493), 3)) {
                        Log.d(StubApp.getString2(493), StubApp.getString2(1451).concat(str));
                    }
                    intent3.setClassName(context2.getPackageName(), str);
                }
                try {
                    if (D6.G(context2)) {
                        startService = L.c(context2, intent3);
                    } else {
                        startService = context2.startService(intent3);
                        Log.d(StubApp.getString2("493"), StubApp.getString2("1452"));
                    }
                    if (startService == null) {
                        Log.e(StubApp.getString2("493"), StubApp.getString2("1453"));
                        i3 = 404;
                    } else {
                        i3 = -1;
                    }
                } catch (IllegalStateException e10) {
                    Log.e(StubApp.getString2(493), StubApp.getString2(1454) + e10);
                    i3 = 402;
                } catch (SecurityException e11) {
                    Log.e(StubApp.getString2(493), StubApp.getString2(1455), e11);
                    i3 = 401;
                }
                return Integer.valueOf(i3);
            }
        }).continueWithTask(cVar, new InterfaceC1521b() { // from class: D5.j
            @Override // q4.InterfaceC1521b
            public final Object e(q4.j jVar) {
                if (((Integer) jVar.getResult()).intValue() != 402) {
                    return jVar;
                }
                return C0047k.a(context, intent, z10).continueWith(new G1.c(0), new A1.a(5));
            }
        });
    }

    public C0047k(Context context) {
        this.f1434a = context;
        this.f1435b = new G1.c(0);
    }
}
