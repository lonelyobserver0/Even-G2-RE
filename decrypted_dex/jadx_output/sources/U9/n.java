package U9;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.Log;
import com.stub.StubApp;
import db.C0824a;
import db.InterfaceC0825b;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class n implements InterfaceC0825b, MethodChannel.MethodCallHandler {

    /* renamed from: h, reason: collision with root package name */
    public static String f7554h;

    /* renamed from: m, reason: collision with root package name */
    public static g f7557m;

    /* renamed from: a, reason: collision with root package name */
    public Context f7558a;

    /* renamed from: b, reason: collision with root package name */
    public MethodChannel f7559b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f7549c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f7550d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final Object f7551e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static final Object f7552f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static int f7553g = 0;
    public static int j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static int f7555k = 1;

    /* renamed from: l, reason: collision with root package name */
    public static int f7556l = 0;

    public static void a(n nVar, d dVar) {
        try {
            if (dVar.f7503d >= 1) {
                Log.d(StubApp.getString2("6389"), dVar.h() + StubApp.getString2("6425"));
            }
            dVar.a();
        } catch (Exception e10) {
            Log.e(StubApp.getString2(6389), StubApp.getString2(6422) + e10 + StubApp.getString2(6424) + f7556l);
        }
        synchronized (f7551e) {
            try {
                if (f7550d.isEmpty() && f7557m != null) {
                    if (dVar.f7503d >= 1) {
                        Log.d(StubApp.getString2("6389"), dVar.h() + StubApp.getString2("6426"));
                    }
                    f7557m.c();
                    f7557m = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static d b(MethodCall methodCall, MethodChannel.Result result) {
        Integer num = (Integer) methodCall.argument(StubApp.getString2(290));
        int intValue = num.intValue();
        d dVar = (d) f7550d.get(num);
        if (dVar != null) {
            return dVar;
        }
        result.error(StubApp.getString2(1340), StubApp.getString2(6427) + intValue, null);
        return null;
    }

    public static HashMap c(int i3, boolean z2, boolean z10) {
        HashMap hashMap = new HashMap();
        hashMap.put(StubApp.getString2(290), Integer.valueOf(i3));
        if (z2) {
            hashMap.put(StubApp.getString2(6428), Boolean.TRUE);
        }
        if (z10) {
            hashMap.put(StubApp.getString2(6429), Boolean.TRUE);
        }
        return hashMap;
    }

    @Override // db.InterfaceC0825b
    public final void onAttachedToEngine(C0824a c0824a) {
        this.f7558a = c0824a.f13553a;
        StandardMethodCodec standardMethodCodec = StandardMethodCodec.INSTANCE;
        BinaryMessenger binaryMessenger = c0824a.f13554b;
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, StubApp.getString2(6430), standardMethodCodec, binaryMessenger.makeBackgroundTaskQueue());
        this.f7559b = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // db.InterfaceC0825b
    public final void onDetachedFromEngine(C0824a c0824a) {
        this.f7558a = null;
        this.f7559b.setMethodCallHandler(null);
        this.f7559b = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(final MethodCall methodCall, final MethodChannel.Result result) {
        final int i3;
        d dVar;
        int i10 = 5;
        int i11 = 4;
        int i12 = 2;
        String str = methodCall.method;
        str.getClass();
        d dVar2 = null;
        int i13 = 1;
        boolean z2 = false;
        Object[] objArr = 0;
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1319569547:
                if (str.equals(StubApp.getString2(6416))) {
                    c10 = 0;
                    break;
                }
                break;
            case -1253581933:
                if (str.equals(StubApp.getString2(6440))) {
                    c10 = 1;
                    break;
                }
                break;
            case -1249474914:
                if (str.equals(StubApp.getString2(5688))) {
                    c10 = 2;
                    break;
                }
                break;
            case -1183792455:
                if (str.equals(StubApp.getString2(6415))) {
                    c10 = 3;
                    break;
                }
                break;
            case -838846263:
                if (str.equals(StubApp.getString2(6414))) {
                    c10 = 4;
                    break;
                }
                break;
            case -396289107:
                if (str.equals(StubApp.getString2(6439))) {
                    c10 = 5;
                    break;
                }
                break;
            case -263511994:
                if (str.equals(StubApp.getString2(6438))) {
                    c10 = 6;
                    break;
                }
                break;
            case -198450538:
                if (str.equals(StubApp.getString2(6437))) {
                    c10 = 7;
                    break;
                }
                break;
            case -17190427:
                if (str.equals(StubApp.getString2(6436))) {
                    c10 = '\b';
                    break;
                }
                break;
            case 93509434:
                if (str.equals(StubApp.getString2(2074))) {
                    c10 = '\t';
                    break;
                }
                break;
            case 95458899:
                if (str.equals(StubApp.getString2(6435))) {
                    c10 = '\n';
                    break;
                }
                break;
            case 107944136:
                if (str.equals(StubApp.getString2(2268))) {
                    c10 = 11;
                    break;
                }
                break;
            case 956410295:
                if (str.equals(StubApp.getString2(6434))) {
                    c10 = '\f';
                    break;
                }
                break;
            case 1193546321:
                if (str.equals(StubApp.getString2(6433))) {
                    c10 = '\r';
                    break;
                }
                break;
            case 1385449135:
                if (str.equals(StubApp.getString2(6432))) {
                    c10 = 14;
                    break;
                }
                break;
            case 1863829223:
                if (str.equals(StubApp.getString2(6431))) {
                    c10 = 15;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                d b2 = b(methodCall, result);
                if (b2 == null) {
                    return;
                }
                f7557m.a(b2, new j(methodCall, result, b2, i11));
                return;
            case 1:
                Integer num = (Integer) methodCall.argument(StubApp.getString2(290));
                int intValue = num.intValue();
                d b10 = b(methodCall, result);
                if (b10 == null) {
                    return;
                }
                if (b10.f7503d >= 1) {
                    Log.d(StubApp.getString2(6389), b10.h() + StubApp.getString2(6456) + intValue + StubApp.getString2(397) + b10.f7501b);
                }
                String str2 = b10.f7501b;
                synchronized (f7551e) {
                    try {
                        f7550d.remove(num);
                        if (b10.f7500a) {
                            f7549c.remove(str2);
                        }
                    } finally {
                    }
                }
                f7557m.a(b10, new l(this, b10, result));
                return;
            case 2:
                Object argument = methodCall.argument(StubApp.getString2(6454));
                if (argument != null) {
                    j = ((Integer) argument).intValue();
                }
                Object argument2 = methodCall.argument(StubApp.getString2(6455));
                if (argument2 != null && !argument2.equals(Integer.valueOf(f7555k))) {
                    f7555k = ((Integer) argument2).intValue();
                    g gVar = f7557m;
                    if (gVar != null) {
                        gVar.c();
                        f7557m = null;
                    }
                }
                Integer num2 = (Integer) methodCall.argument(StubApp.getString2(6444));
                if (num2 != null) {
                    f7553g = num2.intValue();
                }
                result.success(null);
                return;
            case 3:
                d b11 = b(methodCall, result);
                if (b11 == null) {
                    return;
                }
                f7557m.a(b11, new j(methodCall, result, b11, i13));
                return;
            case 4:
                d b12 = b(methodCall, result);
                if (b12 == null) {
                    return;
                }
                f7557m.a(b12, new j(methodCall, result, b12, i10));
                return;
            case 5:
                d b13 = b(methodCall, result);
                if (b13 == null) {
                    return;
                }
                f7557m.a(b13, new j(methodCall, b13, result));
                return;
            case 6:
                String string2 = StubApp.getString2(6447);
                String str3 = (String) methodCall.argument(StubApp.getString2(1251));
                synchronized (f7551e) {
                    try {
                        if (a.a(f7553g)) {
                            Log.d(StubApp.getString2("6389"), string2 + str3 + StubApp.getString2("943") + f7549c.keySet());
                        }
                        HashMap hashMap = f7549c;
                        Integer num3 = (Integer) hashMap.get(str3);
                        if (num3 != null) {
                            HashMap hashMap2 = f7550d;
                            d dVar3 = (d) hashMap2.get(num3);
                            if (dVar3 != null && dVar3.f7508i.isOpen()) {
                                if (a.a(f7553g)) {
                                    String string22 = StubApp.getString2("6389");
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(dVar3.h());
                                    sb2.append(StubApp.getString2("6453"));
                                    sb2.append(dVar3.j() ? "(in transaction) " : "");
                                    sb2.append(num3);
                                    sb2.append(StubApp.getString2("397"));
                                    sb2.append(str3);
                                    Log.d(string22, sb2.toString());
                                }
                                hashMap2.remove(num3);
                                hashMap.remove(str3);
                                dVar2 = dVar3;
                            }
                        }
                    } finally {
                    }
                }
                m mVar = new m(this, dVar2, str3, result);
                g gVar2 = f7557m;
                if (gVar2 != null) {
                    gVar2.a(dVar2, mVar);
                    return;
                } else {
                    mVar.run();
                    return;
                }
            case 7:
                boolean equals = Boolean.TRUE.equals(methodCall.arguments());
                if (!equals) {
                    f7553g = 0;
                } else if (equals) {
                    f7553g = 1;
                }
                result.success(null);
                return;
            case '\b':
                String string23 = StubApp.getString2(6447);
                final String str4 = (String) methodCall.argument(StubApp.getString2(1251));
                final Boolean bool = (Boolean) methodCall.argument(StubApp.getString2(6448));
                final boolean z10 = str4 == null || str4.equals(StubApp.getString2(2950));
                boolean z11 = (Boolean.FALSE.equals(methodCall.argument(StubApp.getString2(6445))) || z10) ? false : true;
                if (z11) {
                    synchronized (f7551e) {
                        try {
                            if (a.a(f7553g)) {
                                Log.d(StubApp.getString2("6389"), string23 + str4 + StubApp.getString2("943") + f7549c.keySet());
                            }
                            Integer num4 = (Integer) f7549c.get(str4);
                            if (num4 != null && (dVar = (d) f7550d.get(num4)) != null) {
                                if (dVar.f7508i.isOpen()) {
                                    if (a.a(f7553g)) {
                                        String string24 = StubApp.getString2("6389");
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append(dVar.h());
                                        sb3.append(StubApp.getString2("6451"));
                                        sb3.append(dVar.j() ? "(in transaction) " : "");
                                        sb3.append(num4);
                                        sb3.append(StubApp.getString2("397"));
                                        sb3.append(str4);
                                        Log.d(string24, sb3.toString());
                                    }
                                    result.success(c(num4.intValue(), true, dVar.j()));
                                    return;
                                }
                                if (a.a(f7553g)) {
                                    Log.d(StubApp.getString2("6389"), dVar.h() + StubApp.getString2("6449") + str4 + StubApp.getString2("6450"));
                                }
                            }
                        } finally {
                        }
                    }
                }
                Object obj = f7551e;
                synchronized (obj) {
                    i3 = f7556l + 1;
                    f7556l = i3;
                }
                final d dVar4 = new d(this.f7558a, str4, i3, z11, f7553g);
                synchronized (obj) {
                    try {
                        if (f7557m == null) {
                            int i14 = f7555k;
                            int i15 = j;
                            g iVar = i14 == 1 ? new Bc.i(i15, 9) : new h(i14, i15);
                            f7557m = iVar;
                            iVar.start();
                            if (dVar4.f7503d >= 1) {
                                Log.d(StubApp.getString2("6389"), dVar4.h() + StubApp.getString2("6452") + j);
                            }
                        }
                        dVar4.f7507h = f7557m;
                        if (dVar4.f7503d >= 1) {
                            Log.d(StubApp.getString2("6389"), dVar4.h() + StubApp.getString2("6421") + i3 + StubApp.getString2("397") + str4);
                        }
                        final boolean z12 = z11;
                        f7557m.a(dVar4, new Runnable() { // from class: U9.k
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z13 = z10;
                                String str5 = str4;
                                MethodChannel.Result result2 = result;
                                Boolean bool2 = bool;
                                d dVar5 = dVar4;
                                MethodCall methodCall2 = methodCall;
                                boolean z14 = z12;
                                int i16 = i3;
                                String string25 = StubApp.getString2(6404);
                                synchronized (n.f7552f) {
                                    if (!z13) {
                                        File file = new File(new File(str5).getParent());
                                        if (!file.exists() && !file.mkdirs() && !file.exists()) {
                                            result2.error(StubApp.getString2("1340"), string25 + str5, null);
                                            return;
                                        }
                                    }
                                    try {
                                        if (Boolean.TRUE.equals(bool2)) {
                                            dVar5.f7508i = SQLiteDatabase.openDatabase(dVar5.f7501b, null, 1, new c());
                                        } else {
                                            dVar5.k();
                                        }
                                        synchronized (n.f7551e) {
                                            if (z14) {
                                                try {
                                                    n.f7549c.put(str5, Integer.valueOf(i16));
                                                } finally {
                                                }
                                            }
                                            n.f7550d.put(Integer.valueOf(i16), dVar5);
                                        }
                                        if (dVar5.f7503d >= 1) {
                                            Log.d(StubApp.getString2("6389"), dVar5.h() + StubApp.getString2("6421") + i16 + StubApp.getString2("397") + str5);
                                        }
                                        result2.success(n.c(i16, false, false));
                                    } catch (Exception e10) {
                                        dVar5.i(e10, new V9.c(methodCall2, result2));
                                    }
                                }
                            }
                        });
                    } finally {
                    }
                }
                return;
            case '\t':
                d b14 = b(methodCall, result);
                if (b14 == null) {
                    return;
                }
                f7557m.a(b14, new j(b14, methodCall, result));
                return;
            case '\n':
                String str5 = (String) methodCall.argument(StubApp.getString2(6442));
                HashMap hashMap3 = new HashMap();
                if (StubApp.getString2(6443).equals(str5)) {
                    int i16 = f7553g;
                    String string25 = StubApp.getString2(6444);
                    if (i16 > 0) {
                        hashMap3.put(string25, Integer.valueOf(i16));
                    }
                    HashMap hashMap4 = f7550d;
                    if (!hashMap4.isEmpty()) {
                        HashMap hashMap5 = new HashMap();
                        for (Map.Entry entry : hashMap4.entrySet()) {
                            d dVar5 = (d) entry.getValue();
                            HashMap hashMap6 = new HashMap();
                            hashMap6.put(StubApp.getString2(1251), dVar5.f7501b);
                            hashMap6.put(StubApp.getString2(6445), Boolean.valueOf(dVar5.f7500a));
                            int i17 = dVar5.f7503d;
                            if (i17 > 0) {
                                hashMap6.put(string25, Integer.valueOf(i17));
                            }
                            hashMap5.put(((Integer) entry.getKey()).toString(), hashMap6);
                        }
                        hashMap3.put(StubApp.getString2(6446), hashMap5);
                    }
                }
                result.success(hashMap3);
                return;
            case 11:
                d b15 = b(methodCall, result);
                if (b15 == null) {
                    return;
                }
                f7557m.a(b15, new j(methodCall, result, b15, i12));
                return;
            case '\f':
                try {
                    z2 = new File((String) methodCall.argument(StubApp.getString2(1251))).exists();
                } catch (Exception unused) {
                }
                result.success(Boolean.valueOf(z2));
                return;
            case '\r':
                d b16 = b(methodCall, result);
                if (b16 == null) {
                    return;
                }
                f7557m.a(b16, new j(methodCall, result, b16, objArr == true ? 1 : 0));
                return;
            case 14:
                result.success(StubApp.getString2(2817) + Build.VERSION.RELEASE);
                return;
            case 15:
                if (f7554h == null) {
                    f7554h = this.f7558a.getDatabasePath(StubApp.getString2(6441)).getParent();
                }
                result.success(f7554h);
                return;
            default:
                result.notImplemented();
                return;
        }
    }
}
