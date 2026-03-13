package p4;

import S3.D;
import W3.c;
import W3.d;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.stub.StubApp;
import i.RunnableC1018B;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: p4.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1489a {

    /* renamed from: n, reason: collision with root package name */
    public static final long f19676n = TimeUnit.DAYS.toMillis(366);

    /* renamed from: o, reason: collision with root package name */
    public static volatile ScheduledExecutorService f19677o = null;

    /* renamed from: p, reason: collision with root package name */
    public static final Object f19678p = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f19679a;

    /* renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f19680b;

    /* renamed from: c, reason: collision with root package name */
    public int f19681c;

    /* renamed from: d, reason: collision with root package name */
    public ScheduledFuture f19682d;

    /* renamed from: e, reason: collision with root package name */
    public long f19683e;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f19684f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f19685g;

    /* renamed from: h, reason: collision with root package name */
    public g4.a f19686h;

    /* renamed from: i, reason: collision with root package name */
    public final W3.a f19687i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f19688k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f19689l;

    /* renamed from: m, reason: collision with root package name */
    public final ScheduledExecutorService f19690m;

    public C1489a(Context context) {
        boolean z2;
        String string2 = StubApp.getString2(22110);
        String packageName = context.getPackageName();
        this.f19679a = new Object();
        this.f19681c = 0;
        this.f19684f = new HashSet();
        this.f19685g = true;
        this.f19687i = W3.a.f8099a;
        this.f19688k = new HashMap();
        this.f19689l = new AtomicInteger(0);
        D.f(string2, StubApp.getString2(22111));
        context.getApplicationContext();
        WorkSource workSource = null;
        this.f19686h = null;
        if (StubApp.getString2(0).equals(context.getPackageName())) {
            this.j = string2;
        } else {
            String string22 = StubApp.getString2(22112);
            this.j = string2.length() != 0 ? string22.concat(string2) : new String(string22);
        }
        PowerManager powerManager = (PowerManager) context.getSystemService(StubApp.getString2(1358));
        if (powerManager == null) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append((CharSequence) StubApp.getString2(22115), 0, 29);
            throw new H9.b(sb2.toString());
        }
        this.f19680b = powerManager.newWakeLock(1, string2);
        Method method = d.f8109a;
        synchronized (d.class) {
            Boolean bool = d.f8113e;
            if (bool != null) {
                z2 = bool.booleanValue();
            } else {
                z2 = D.a.a(context, StubApp.getString2("19739")) == 0;
                d.f8113e = Boolean.valueOf(z2);
            }
        }
        if (z2) {
            int i3 = c.f8108a;
            packageName = packageName == null || packageName.trim().isEmpty() ? context.getPackageName() : packageName;
            String string23 = StubApp.getString2(6888);
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo a3 = Y3.c.a(context).a(0, packageName);
                    if (a3 == null) {
                        Log.e(string23, StubApp.getString2(22113).concat(packageName));
                    } else {
                        int i10 = a3.uid;
                        workSource = new WorkSource();
                        d.a(workSource, i10, packageName);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.e(string23, StubApp.getString2(22114).concat(packageName));
                }
            }
            if (workSource != null) {
                try {
                    this.f19680b.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e10) {
                    Log.wtf(StubApp.getString2(18340), e10.toString());
                }
            }
        }
        ScheduledExecutorService scheduledExecutorService = f19677o;
        if (scheduledExecutorService == null) {
            synchronized (f19678p) {
                try {
                    scheduledExecutorService = f19677o;
                    if (scheduledExecutorService == null) {
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f19677o = scheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.f19690m = scheduledExecutorService;
    }

    public final void a(long j) {
        this.f19689l.incrementAndGet();
        long j3 = f19676n;
        long j10 = LongCompanionObject.MAX_VALUE;
        long max = Math.max(Math.min(LongCompanionObject.MAX_VALUE, j3), 1L);
        if (j > 0) {
            max = Math.min(j, max);
        }
        synchronized (this.f19679a) {
            try {
                if (!b()) {
                    this.f19686h = g4.a.f14215a;
                    this.f19680b.acquire();
                    this.f19687i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f19681c++;
                if (this.f19685g) {
                    TextUtils.isEmpty(null);
                }
                C1490b c1490b = (C1490b) this.f19688k.get(null);
                if (c1490b == null) {
                    c1490b = new C1490b();
                    this.f19688k.put(null, c1490b);
                }
                c1490b.f19691a++;
                this.f19687i.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (LongCompanionObject.MAX_VALUE - elapsedRealtime > max) {
                    j10 = elapsedRealtime + max;
                }
                if (j10 > this.f19683e) {
                    this.f19683e = j10;
                    ScheduledFuture scheduledFuture = this.f19682d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f19682d = this.f19690m.schedule(new RunnableC1018B(this, 15), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        boolean z2;
        synchronized (this.f19679a) {
            z2 = this.f19681c > 0;
        }
        return z2;
    }

    public final void c() {
        if (this.f19689l.decrementAndGet() < 0) {
            Log.e(StubApp.getString2(18340), String.valueOf(this.j).concat(StubApp.getString2(22116)));
        }
        synchronized (this.f19679a) {
            try {
                if (this.f19685g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f19688k.containsKey(null)) {
                    C1490b c1490b = (C1490b) this.f19688k.get(null);
                    if (c1490b != null) {
                        int i3 = c1490b.f19691a - 1;
                        c1490b.f19691a = i3;
                        if (i3 == 0) {
                            this.f19688k.remove(null);
                        }
                    }
                } else {
                    Log.w(StubApp.getString2("18340"), String.valueOf(this.j).concat(StubApp.getString2("22117")));
                }
                e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f19684f;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public final void e() {
        synchronized (this.f19679a) {
            try {
                if (b()) {
                    if (this.f19685g) {
                        int i3 = this.f19681c - 1;
                        this.f19681c = i3;
                        if (i3 > 0) {
                            return;
                        }
                    } else {
                        this.f19681c = 0;
                    }
                    d();
                    Iterator it = this.f19688k.values().iterator();
                    while (it.hasNext()) {
                        ((C1490b) it.next()).f19691a = 0;
                    }
                    this.f19688k.clear();
                    ScheduledFuture scheduledFuture = this.f19682d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.f19682d = null;
                        this.f19683e = 0L;
                    }
                    if (this.f19680b.isHeld()) {
                        try {
                            try {
                                this.f19680b.release();
                                if (this.f19686h != null) {
                                    this.f19686h = null;
                                }
                            } catch (RuntimeException e10) {
                                if (!e10.getClass().equals(RuntimeException.class)) {
                                    throw e10;
                                }
                                Log.e(StubApp.getString2("18340"), String.valueOf(this.j).concat(StubApp.getString2("22118")), e10);
                                if (this.f19686h != null) {
                                    this.f19686h = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.f19686h != null) {
                                this.f19686h = null;
                            }
                            throw th;
                        }
                    } else {
                        Log.e(StubApp.getString2("18340"), String.valueOf(this.j).concat(StubApp.getString2("22119")));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
