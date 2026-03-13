package Vc;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class j {

    /* renamed from: m, reason: collision with root package name */
    public static final boolean[] f8015m = {true, true, false, false, false, false, true, true, false, false, false, true, true, true, false, true, false, false, false, true};

    /* renamed from: n, reason: collision with root package name */
    public static final boolean[] f8016n = {false, false, false, false, false, false, true, true, false, false, false, false, false, false, false, true, false, false, false, true};

    /* renamed from: b, reason: collision with root package name */
    public o f8018b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f8019c;

    /* renamed from: d, reason: collision with root package name */
    public final Wc.d f8020d;

    /* renamed from: k, reason: collision with root package name */
    public h f8026k;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f8017a = {0, 1, 3, 5, 8, 9, 4, 7, 10, 6, 2, 0, 0, 0};

    /* renamed from: e, reason: collision with root package name */
    public final ExecutorService f8021e = Executors.newSingleThreadExecutor();

    /* renamed from: f, reason: collision with root package name */
    public long f8022f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f8023g = -1;

    /* renamed from: h, reason: collision with root package name */
    public final Handler f8024h = new Handler(Looper.getMainLooper());

    /* renamed from: i, reason: collision with root package name */
    public String f8025i = null;
    public long j = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f8027l = 1;

    public j(Wc.d dVar) {
        this.f8020d = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [Vc.h, java.lang.Runnable] */
    public final void a(long j) {
        Handler handler = this.f8019c;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f8019c = null;
        this.j = j;
        if (this.f8018b == null || j == 0) {
            return;
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        Handler handler2 = new Handler();
        this.f8019c = handler2;
        ?? r12 = new Runnable() { // from class: Vc.h
            @Override // java.lang.Runnable
            public final void run() {
                j jVar = j.this;
                jVar.f8024h.post(new i(jVar, elapsedRealtime));
            }
        };
        this.f8026k = r12;
        handler2.post(r12);
    }

    public final void b() {
        try {
            Handler handler = this.f8019c;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f8019c = null;
            o oVar = this.f8018b;
            if (oVar != null) {
                oVar.c();
            }
        } catch (Exception unused) {
        }
        this.f8018b = null;
        this.f8027l = 1;
    }
}
