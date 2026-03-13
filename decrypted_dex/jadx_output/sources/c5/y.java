package c5;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.stub.StubApp;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.regex.Pattern;
import x5.InterfaceC1913d;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class y {

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f10966g = Pattern.compile(StubApp.getString2(9599));

    /* renamed from: h, reason: collision with root package name */
    public static final String f10967h = Pattern.quote(StubApp.getString2(601));

    /* renamed from: a, reason: collision with root package name */
    public final O1.a f10968a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f10969b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10970c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1913d f10971d;

    /* renamed from: e, reason: collision with root package name */
    public final u f10972e;

    /* renamed from: f, reason: collision with root package name */
    public C0569b f10973f;

    public y(Context context, String str, InterfaceC1913d interfaceC1913d, u uVar) {
        if (context == null) {
            throw new IllegalArgumentException(StubApp.getString2(9601));
        }
        if (str == null) {
            throw new IllegalArgumentException(StubApp.getString2(9600));
        }
        this.f10969b = context;
        this.f10970c = str;
        this.f10971d = interfaceC1913d;
        this.f10972e = uVar;
        this.f10968a = new O1.a();
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        String string2 = StubApp.getString2(9602);
        synchronized (this) {
            lowerCase = f10966g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
            String str2 = string2 + lowerCase + StubApp.getString2("9603") + str;
            if (Log.isLoggable(StubApp.getString2("280"), 2)) {
                Log.v(StubApp.getString2("280"), str2, null);
            }
            sharedPreferences.edit().putString(StubApp.getString2("9604"), lowerCase).putString(StubApp.getString2("9605"), str).apply();
        }
        return lowerCase;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(7:13|14|4|5|6|7|8)|3|4|5|6|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        android.util.Log.w(r0, com.stub.StubApp.getString2(9607), r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final c5.x b(boolean r7) {
        /*
            r6 = this;
            d.y r0 = new d.y
            r1 = 4
            r0.<init>(r1)
            d5.c r1 = d5.C0803c.f13419d
            d5.C0804d.a(r0, r1)
            r0 = 280(0x118, float:3.92E-43)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r1 = 10000(0x2710, double:4.9407E-320)
            x5.d r3 = r6.f10971d
            r4 = 0
            if (r7 == 0) goto L36
            r7 = r3
            x5.c r7 = (x5.C1912c) r7     // Catch: java.lang.Exception -> L2b
            q4.s r7 = r7.d()     // Catch: java.lang.Exception -> L2b
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> L2b
            java.lang.Object r7 = a4.f.c(r7, r1, r5)     // Catch: java.lang.Exception -> L2b
            x5.a r7 = (x5.C1910a) r7     // Catch: java.lang.Exception -> L2b
            java.lang.String r7 = r7.f22866a     // Catch: java.lang.Exception -> L2b
            goto L37
        L2b:
            r7 = move-exception
            r5 = 9606(0x2586, float:1.3461E-41)
            java.lang.String r5 = com.stub.StubApp.getString2(r5)
            android.util.Log.w(r0, r5, r7)
        L36:
            r7 = r4
        L37:
            x5.c r3 = (x5.C1912c) r3     // Catch: java.lang.Exception -> L47
            q4.s r3 = r3.c()     // Catch: java.lang.Exception -> L47
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> L47
            java.lang.Object r1 = a4.f.c(r3, r1, r5)     // Catch: java.lang.Exception -> L47
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L47
            r4 = r1
            goto L52
        L47:
            r1 = move-exception
            r2 = 9607(0x2587, float:1.3462E-41)
            java.lang.String r2 = com.stub.StubApp.getString2(r2)
            android.util.Log.w(r0, r2, r1)
        L52:
            c5.x r0 = new c5.x
            r0.<init>(r4, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.y.b(boolean):c5.x");
    }

    public final synchronized C0569b c() {
        String str;
        String string2 = StubApp.getString2(9608);
        String string22 = StubApp.getString2(9609);
        String string23 = StubApp.getString2(9610);
        synchronized (this) {
            C0569b c0569b = this.f10973f;
            if (c0569b != null && (c0569b.f10863b != null || !this.f10972e.a())) {
                return this.f10973f;
            }
            Z4.c cVar = Z4.c.f8980a;
            cVar.f(StubApp.getString2("9611"));
            SharedPreferences sharedPreferences = this.f10969b.getSharedPreferences(StubApp.getString2("1000"), 0);
            String string = sharedPreferences.getString(StubApp.getString2("9605"), null);
            cVar.f(string23 + string);
            if (this.f10972e.a()) {
                x b2 = b(false);
                cVar.f(string22 + b2.f10964a);
                if (b2.f10964a == null) {
                    if (string == null) {
                        str = StubApp.getString2("9612") + UUID.randomUUID().toString();
                    } else {
                        str = string;
                    }
                    b2 = new x(str, null);
                }
                if (Objects.equals(b2.f10964a, string)) {
                    this.f10973f = new C0569b(sharedPreferences.getString(StubApp.getString2("9604"), null), b2.f10964a, b2.f10965b);
                } else {
                    this.f10973f = new C0569b(a(sharedPreferences, b2.f10964a), b2.f10964a, b2.f10965b);
                }
            } else if (string == null || !string.startsWith(StubApp.getString2("9612"))) {
                this.f10973f = new C0569b(a(sharedPreferences, StubApp.getString2("9612") + UUID.randomUUID().toString()), null, null);
            } else {
                this.f10973f = new C0569b(sharedPreferences.getString(StubApp.getString2("9604"), null), null, null);
            }
            cVar.f(string2 + this.f10973f);
            return this.f10973f;
        }
    }

    public final String d() {
        String str;
        O1.a aVar = this.f10968a;
        Context context = this.f10969b;
        synchronized (aVar) {
            try {
                if (aVar.f5194a == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    aVar.f5194a = installerPackageName;
                }
                str = "".equals(aVar.f5194a) ? null : aVar.f5194a;
            } finally {
            }
        }
        return str;
    }
}
