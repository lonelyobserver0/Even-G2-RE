package D5;

import R8.C0250h;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.messaging.FirebaseMessaging;
import com.stub.StubApp;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import t.C1692e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class I {

    /* renamed from: i, reason: collision with root package name */
    public static final long f1366i = TimeUnit.HOURS.toSeconds(8);
    public static final /* synthetic */ int j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f1367a;

    /* renamed from: b, reason: collision with root package name */
    public final u f1368b;

    /* renamed from: c, reason: collision with root package name */
    public final C0250h f1369c;

    /* renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f1370d;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f1372f;

    /* renamed from: h, reason: collision with root package name */
    public final G f1374h;

    /* renamed from: e, reason: collision with root package name */
    public final C1692e f1371e = new C1692e(0);

    /* renamed from: g, reason: collision with root package name */
    public boolean f1373g = false;

    public I(FirebaseMessaging firebaseMessaging, u uVar, G g10, C0250h c0250h, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f1370d = firebaseMessaging;
        this.f1368b = uVar;
        this.f1374h = g10;
        this.f1369c = c0250h;
        this.f1367a = context;
        this.f1372f = scheduledThreadPoolExecutor;
    }

    public static void a(q4.j jVar) {
        try {
            a4.f.c(jVar, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e10) {
            throw new IOException(StubApp.getString2(964), e10);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e11);
            }
            throw ((RuntimeException) cause);
        }
    }

    public final void b(String str) {
        String a3 = this.f1370d.a();
        C0250h c0250h = this.f1369c;
        Bundle bundle = new Bundle();
        String string2 = StubApp.getString2(1371);
        bundle.putString(StubApp.getString2(1377), string2 + str);
        a(c0250h.d(c0250h.k(a3, string2 + str, bundle)));
    }

    public final void c(String str) {
        String a3 = this.f1370d.a();
        C0250h c0250h = this.f1369c;
        Bundle bundle = new Bundle();
        String string2 = StubApp.getString2(1371);
        bundle.putString(StubApp.getString2(1377), string2 + str);
        bundle.putString(StubApp.getString2(1378), StubApp.getString2(878));
        a(c0250h.d(c0250h.k(a3, string2 + str, bundle)));
    }

    public final q4.s d(F f10) {
        ArrayDeque arrayDeque;
        G g10 = this.f1374h;
        synchronized (g10) {
            B3.s sVar = g10.f1360a;
            String str = f10.f1358c;
            sVar.getClass();
            if (!TextUtils.isEmpty(str) && !str.contains((String) sVar.f652d)) {
                synchronized (((ArrayDeque) sVar.f653e)) {
                    if (((ArrayDeque) sVar.f653e).add(str)) {
                        ((ScheduledThreadPoolExecutor) sVar.f654f).execute(new B0.o(sVar, 1));
                    }
                }
            }
        }
        q4.k kVar = new q4.k();
        synchronized (this.f1371e) {
            try {
                String str2 = f10.f1358c;
                if (this.f1371e.containsKey(str2)) {
                    arrayDeque = (ArrayDeque) this.f1371e.get(str2);
                } else {
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    this.f1371e.put(str2, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(kVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return kVar.f20051a;
    }

    public final synchronized void e(boolean z2) {
        this.f1373g = z2;
    }

    public final void f() {
        boolean z2;
        if (this.f1374h.a() != null) {
            synchronized (this) {
                z2 = this.f1373g;
            }
            if (z2) {
                return;
            }
            h(0L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c8 A[Catch: IOException -> 0x0062, TryCatch #3 {IOException -> 0x0062, blocks: (B:8:0x0045, B:17:0x0081, B:19:0x008d, B:65:0x00a6, B:67:0x00b5, B:68:0x00c8, B:70:0x00d7, B:71:0x0054, B:74:0x0065), top: B:7:0x0045 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g() {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D5.I.g():boolean");
    }

    public final void h(long j3) {
        long min = Math.min(Math.max(30L, 2 * j3), f1366i);
        this.f1372f.schedule(new K(this, this.f1367a, this.f1368b, min), j3, TimeUnit.SECONDS);
        e(true);
    }
}
