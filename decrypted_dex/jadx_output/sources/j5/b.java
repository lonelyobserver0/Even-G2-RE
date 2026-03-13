package j5;

import B3.s;
import android.os.SystemClock;
import android.util.Log;
import c5.C0568a;
import com.stub.StubApp;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k5.C1107b;
import q4.k;
import y3.C1968a;
import y3.d;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final double f15330a;

    /* renamed from: b, reason: collision with root package name */
    public final double f15331b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15332c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15333d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15334e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayBlockingQueue f15335f;

    /* renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f15336g;

    /* renamed from: h, reason: collision with root package name */
    public final s f15337h;

    /* renamed from: i, reason: collision with root package name */
    public final V6.b f15338i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public long f15339k;

    public b(s sVar, C1107b c1107b, V6.b bVar) {
        double d8 = c1107b.f15440d;
        this.f15330a = d8;
        this.f15331b = c1107b.f15441e;
        this.f15332c = c1107b.f15442f * 1000;
        this.f15337h = sVar;
        this.f15338i = bVar;
        this.f15333d = SystemClock.elapsedRealtime();
        int i3 = (int) d8;
        this.f15334e = i3;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i3);
        this.f15335f = arrayBlockingQueue;
        this.f15336g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.j = 0;
        this.f15339k = 0L;
    }

    public final int a() {
        if (this.f15339k == 0) {
            this.f15339k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f15339k) / this.f15332c);
        int min = this.f15335f.size() == this.f15334e ? Math.min(100, this.j + currentTimeMillis) : Math.max(0, this.j - currentTimeMillis);
        if (this.j != min) {
            this.j = min;
            this.f15339k = System.currentTimeMillis();
        }
        return min;
    }

    public final void b(C0568a c0568a, k kVar) {
        String str = StubApp.getString2(19039) + c0568a.f10860b;
        String string2 = StubApp.getString2(280);
        if (Log.isLoggable(string2, 3)) {
            Log.d(string2, str, null);
        }
        this.f15337h.q(new C1968a(c0568a.f10859a, d.f23508c, null), new O0.d(this, kVar, SystemClock.elapsedRealtime() - this.f15333d < 2000, c0568a));
    }
}
