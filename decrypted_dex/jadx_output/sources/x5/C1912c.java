package x5;

import S3.D;
import W4.m;
import android.net.TrafficStats;
import android.util.Log;
import com.stub.StubApp;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import q4.k;
import q4.s;
import s.C1590a;
import w.AbstractC1856e;
import z5.C2010a;

/* renamed from: x5.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1912c implements InterfaceC1913d {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f22871m = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final R4.h f22872a;

    /* renamed from: b, reason: collision with root package name */
    public final z5.c f22873b;

    /* renamed from: c, reason: collision with root package name */
    public final C1590a f22874c;

    /* renamed from: d, reason: collision with root package name */
    public final j f22875d;

    /* renamed from: e, reason: collision with root package name */
    public final m f22876e;

    /* renamed from: f, reason: collision with root package name */
    public final h f22877f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f22878g;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f22879h;

    /* renamed from: i, reason: collision with root package name */
    public final X4.i f22880i;
    public String j;

    /* renamed from: k, reason: collision with root package name */
    public final HashSet f22881k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f22882l;

    static {
        new AtomicInteger(1);
    }

    public C1912c(R4.h hVar, w5.b bVar, ExecutorService executorService, X4.i iVar) {
        hVar.a();
        z5.c cVar = new z5.c(hVar.f6193a, bVar);
        C1590a c1590a = new C1590a(hVar);
        if (C2.i.f1076b == null) {
            C2.i.f1076b = new C2.i();
        }
        C2.i iVar2 = C2.i.f1076b;
        if (j.f22890d == null) {
            j.f22890d = new j(iVar2);
        }
        j jVar = j.f22890d;
        m mVar = new m(new W4.d(hVar, 2));
        h hVar2 = new h();
        this.f22878g = new Object();
        this.f22881k = new HashSet();
        this.f22882l = new ArrayList();
        this.f22872a = hVar;
        this.f22873b = cVar;
        this.f22874c = c1590a;
        this.f22875d = jVar;
        this.f22876e = mVar;
        this.f22877f = hVar2;
        this.f22879h = executorService;
        this.f22880i = iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        r3 = f(r2);
        r4 = r6.f22874c;
        r2 = r2.a();
        r2.f1210d = r3;
        r2.f1209c = 3;
        r2 = r2.j();
        r4.k(r2);
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r6 = this;
            java.lang.Object r0 = x5.C1912c.f22871m
            monitor-enter(r0)
            R4.h r1 = r6.f22872a     // Catch: java.lang.Throwable -> L3f
            r1.a()     // Catch: java.lang.Throwable -> L3f
            android.content.Context r1 = r1.f6193a     // Catch: java.lang.Throwable -> L3f
            v0.F r1 = v0.C1803F.a(r1)     // Catch: java.lang.Throwable -> L3f
            s.a r2 = r6.f22874c     // Catch: java.lang.Throwable -> L37
            y5.a r2 = r2.m()     // Catch: java.lang.Throwable -> L37
            int r3 = r2.f23514b     // Catch: java.lang.Throwable -> L37
            r4 = 1
            r5 = 2
            if (r3 == r5) goto L1e
            if (r3 != r4) goto L1d
            goto L1e
        L1d:
            r4 = 0
        L1e:
            if (r4 == 0) goto L39
            java.lang.String r3 = r6.f(r2)     // Catch: java.lang.Throwable -> L37
            s.a r4 = r6.f22874c     // Catch: java.lang.Throwable -> L37
            Cc.h r2 = r2.a()     // Catch: java.lang.Throwable -> L37
            r2.f1210d = r3     // Catch: java.lang.Throwable -> L37
            r3 = 3
            r2.f1209c = r3     // Catch: java.lang.Throwable -> L37
            y5.a r2 = r2.j()     // Catch: java.lang.Throwable -> L37
            r4.k(r2)     // Catch: java.lang.Throwable -> L37
            goto L39
        L37:
            r2 = move-exception
            goto L51
        L39:
            if (r1 == 0) goto L41
            r1.i()     // Catch: java.lang.Throwable -> L3f
            goto L41
        L3f:
            r1 = move-exception
            goto L57
        L41:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            r6.i(r2)
            X4.i r0 = r6.f22880i
            x5.b r1 = new x5.b
            r2 = 2
            r1.<init>(r6, r2)
            r0.execute(r1)
            return
        L51:
            if (r1 == 0) goto L56
            r1.i()     // Catch: java.lang.Throwable -> L3f
        L56:
            throw r2     // Catch: java.lang.Throwable -> L3f
        L57:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.C1912c.a():void");
    }

    public final y5.a b(y5.a aVar) {
        int responseCode;
        z5.b f10;
        R4.h hVar = this.f22872a;
        hVar.a();
        String str = hVar.f6195c.f6203a;
        String str2 = aVar.f23513a;
        R4.h hVar2 = this.f22872a;
        hVar2.a();
        String str3 = hVar2.f6195c.f6209g;
        String str4 = aVar.f23516d;
        z5.c cVar = this.f22873b;
        z5.d dVar = cVar.f24119c;
        boolean a3 = dVar.a();
        String string2 = StubApp.getString2(24159);
        if (!a3) {
            throw new e(string2);
        }
        URL a9 = z5.c.a(StubApp.getString2(24160) + str3 + StubApp.getString2(24161) + str2 + StubApp.getString2(24162));
        for (int i3 = 0; i3 <= 1; i3++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection c10 = cVar.c(str, a9);
            try {
                try {
                    c10.setRequestMethod(StubApp.getString2("13314"));
                    c10.addRequestProperty(StubApp.getString2("2407"), StubApp.getString2("24163") + str4);
                    c10.setDoOutput(true);
                    z5.c.h(c10);
                    responseCode = c10.getResponseCode();
                    dVar.b(responseCode);
                } catch (IOException | AssertionError unused) {
                }
                if (responseCode >= 200 && responseCode < 300) {
                    f10 = z5.c.f(c10);
                } else {
                    z5.c.b(c10, null, str, str3);
                    if (responseCode == 401 || responseCode == 404) {
                        Bc.i a10 = z5.b.a();
                        a10.f766b = 3;
                        f10 = a10.g();
                    } else {
                        if (responseCode == 429) {
                            throw new e(StubApp.getString2("24166"));
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            Log.e(StubApp.getString2("24164"), StubApp.getString2("24165"));
                            Bc.i a11 = z5.b.a();
                            a11.f766b = 2;
                            f10 = a11.g();
                        }
                        c10.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                }
                c10.disconnect();
                TrafficStats.clearThreadStatsTag();
                int c11 = AbstractC1856e.c(f10.f24114c);
                if (c11 == 0) {
                    j jVar = this.f22875d;
                    jVar.getClass();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    jVar.f22891a.getClass();
                    long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                    Cc.h a12 = aVar.a();
                    a12.f1211e = f10.f24112a;
                    a12.f1208b = Long.valueOf(f10.f24113b);
                    a12.f1212f = Long.valueOf(seconds);
                    return a12.j();
                }
                if (c11 == 1) {
                    Cc.h a13 = aVar.a();
                    a13.f1213g = StubApp.getString2(24167);
                    a13.f1209c = 5;
                    return a13.j();
                }
                if (c11 != 2) {
                    throw new e(string2);
                }
                synchronized (this) {
                    this.j = null;
                }
                Cc.h a14 = aVar.a();
                a14.f1209c = 2;
                return a14.j();
            } catch (Throwable th) {
                c10.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        throw new e(string2);
    }

    public final s c() {
        String str;
        e();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return a4.f.m(str);
        }
        k kVar = new k();
        g gVar = new g(kVar);
        synchronized (this.f22878g) {
            this.f22882l.add(gVar);
        }
        s sVar = kVar.f20051a;
        this.f22879h.execute(new RunnableC1911b(this, 0));
        return sVar;
    }

    public final s d() {
        e();
        k kVar = new k();
        f fVar = new f(this.f22875d, kVar);
        synchronized (this.f22878g) {
            this.f22882l.add(fVar);
        }
        this.f22879h.execute(new RunnableC1911b(this, 1));
        return kVar.f20051a;
    }

    public final void e() {
        R4.h hVar = this.f22872a;
        hVar.a();
        String str = hVar.f6195c.f6204b;
        String string2 = StubApp.getString2(24168);
        D.f(str, string2);
        hVar.a();
        D.f(hVar.f6195c.f6209g, StubApp.getString2(24169));
        hVar.a();
        String str2 = hVar.f6195c.f6203a;
        String string22 = StubApp.getString2(24170);
        D.f(str2, string22);
        hVar.a();
        String str3 = hVar.f6195c.f6204b;
        Pattern pattern = j.f22889c;
        D.a(string2, str3.contains(StubApp.getString2(478)));
        hVar.a();
        D.a(string22, j.f22889c.matcher(hVar.f6195c.f6203a).matches());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0026, code lost:
    
        if (com.stub.StubApp.getString2(429).equals(r0.f6194b) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String f(y5.a r6) {
        /*
            r5 = this;
            R4.h r0 = r5.f22872a
            r0.a()
            java.lang.String r0 = r0.f6194b
            r1 = 24171(0x5e6b, float:3.3871E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L28
            R4.h r0 = r5.f22872a
            r0.a()
            r1 = 429(0x1ad, float:6.01E-43)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            java.lang.String r0 = r0.f6194b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6a
        L28:
            r0 = 1
            int r6 = r6.f23514b
            if (r6 != r0) goto L6a
            W4.m r6 = r5.f22876e
            java.lang.Object r6 = r6.get()
            y5.b r6 = (y5.b) r6
            android.content.SharedPreferences r0 = r6.f23521a
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r6.f23521a     // Catch: java.lang.Throwable -> L4d
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L4d
            android.content.SharedPreferences r2 = r6.f23521a     // Catch: java.lang.Throwable -> L65
            java.lang.String r3 = "24172"
            java.lang.String r3 = com.stub.StubApp.getString2(r3)     // Catch: java.lang.Throwable -> L65
            r4 = 0
            java.lang.String r2 = r2.getString(r3, r4)     // Catch: java.lang.Throwable -> L65
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L65
            if (r2 == 0) goto L4f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4d
            goto L54
        L4d:
            r6 = move-exception
            goto L68
        L4f:
            java.lang.String r2 = r6.a()     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4d
        L54:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L64
            x5.h r6 = r5.f22877f
            r6.getClass()
            java.lang.String r6 = x5.h.a()
            return r6
        L64:
            return r2
        L65:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L65
            throw r6     // Catch: java.lang.Throwable -> L4d
        L68:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4d
            throw r6
        L6a:
            x5.h r6 = r5.f22877f
            r6.getClass()
            java.lang.String r6 = x5.h.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.C1912c.f(y5.a):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [z5.c] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [z5.a] */
    public final y5.a g(y5.a aVar) {
        int responseCode;
        String str = aVar.f23513a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            y5.b bVar = (y5.b) this.f22876e.get();
            synchronized (bVar.f23521a) {
                try {
                    String[] strArr = y5.b.f23520c;
                    int i3 = 0;
                    while (true) {
                        if (i3 < 4) {
                            String str3 = strArr[i3];
                            String string = bVar.f23521a.getString(StubApp.getString2("2019") + bVar.f23522b + StubApp.getString2("4851") + str3, null);
                            if (string == null || string.isEmpty()) {
                                i3++;
                            } else if (string.startsWith(StubApp.getString2("1352"))) {
                                try {
                                    str2 = new JSONObject(string).getString(StubApp.getString2("1071"));
                                } catch (JSONException unused) {
                                }
                            } else {
                                str2 = string;
                            }
                        }
                    }
                } finally {
                }
            }
        }
        z5.c cVar = this.f22873b;
        R4.h hVar = this.f22872a;
        hVar.a();
        String str4 = hVar.f6195c.f6203a;
        String str5 = aVar.f23513a;
        R4.h hVar2 = this.f22872a;
        hVar2.a();
        String str6 = hVar2.f6195c.f6209g;
        R4.h hVar3 = this.f22872a;
        hVar3.a();
        String str7 = hVar3.f6195c.f6204b;
        z5.d dVar = cVar.f24119c;
        boolean a3 = dVar.a();
        String string2 = StubApp.getString2(24159);
        if (!a3) {
            throw new e(string2);
        }
        URL a9 = z5.c.a(StubApp.getString2(24160) + str6 + StubApp.getString2(24173));
        int i10 = 0;
        C2010a c2010a = cVar;
        while (i10 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection c10 = c2010a.c(str4, a9);
            try {
                try {
                    c10.setRequestMethod(StubApp.getString2("13314"));
                    c10.setDoOutput(true);
                    if (str2 != null) {
                        c10.addRequestProperty(StubApp.getString2("24174"), str2);
                    }
                    z5.c.g(c10, str5, str7);
                    responseCode = c10.getResponseCode();
                    dVar.b(responseCode);
                } catch (IOException | AssertionError unused2) {
                }
                if (responseCode >= 200 && responseCode < 300) {
                    C2010a e10 = z5.c.e(c10);
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    c2010a = e10;
                } else {
                    try {
                        z5.c.b(c10, str7, str4, str6);
                    } catch (IOException | AssertionError unused3) {
                        c10.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i10++;
                        c2010a = c2010a;
                    }
                    if (responseCode == 429) {
                        throw new e(StubApp.getString2("24166"));
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e(StubApp.getString2("24164"), StubApp.getString2("24165"));
                        C2010a c2010a2 = new C2010a(null, null, null, null, 2);
                        c10.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        c2010a = c2010a2;
                    } else {
                        c10.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i10++;
                        c2010a = c2010a;
                    }
                }
                int c11 = AbstractC1856e.c(c2010a.f24111e);
                if (c11 != 0) {
                    if (c11 != 1) {
                        throw new e(StubApp.getString2(24159));
                    }
                    Cc.h a10 = aVar.a();
                    a10.f1213g = StubApp.getString2(24167);
                    a10.f1209c = 5;
                    return a10.j();
                }
                String str8 = c2010a.f24108b;
                String str9 = c2010a.f24109c;
                j jVar = this.f22875d;
                jVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                jVar.f22891a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                z5.b bVar2 = c2010a.f24110d;
                String str10 = bVar2.f24112a;
                long j = bVar2.f24113b;
                Cc.h a11 = aVar.a();
                a11.f1210d = str8;
                a11.f1209c = 4;
                a11.f1211e = str10;
                a11.f1207a = str9;
                a11.f1208b = Long.valueOf(j);
                a11.f1212f = Long.valueOf(seconds);
                return a11.j();
            } finally {
                c10.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new e(string2);
    }

    public final void h(Exception exc) {
        synchronized (this.f22878g) {
            try {
                Iterator it = this.f22882l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(y5.a aVar) {
        synchronized (this.f22878g) {
            try {
                Iterator it = this.f22882l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).b(aVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
