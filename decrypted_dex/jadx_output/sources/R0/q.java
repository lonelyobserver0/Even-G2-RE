package R0;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;
import com.stub.StubApp;
import r0.AbstractC1550k;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final b f6034a;

    /* renamed from: b, reason: collision with root package name */
    public final o f6035b;

    /* renamed from: c, reason: collision with root package name */
    public final p f6036c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6037d;

    /* renamed from: e, reason: collision with root package name */
    public Surface f6038e;

    /* renamed from: f, reason: collision with root package name */
    public float f6039f;

    /* renamed from: g, reason: collision with root package name */
    public float f6040g;

    /* renamed from: h, reason: collision with root package name */
    public float f6041h;

    /* renamed from: i, reason: collision with root package name */
    public float f6042i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public long f6043k;

    /* renamed from: l, reason: collision with root package name */
    public long f6044l;

    /* renamed from: m, reason: collision with root package name */
    public long f6045m;

    /* renamed from: n, reason: collision with root package name */
    public long f6046n;

    /* renamed from: o, reason: collision with root package name */
    public long f6047o;

    /* renamed from: p, reason: collision with root package name */
    public long f6048p;

    /* renamed from: q, reason: collision with root package name */
    public long f6049q;

    public q(Context context) {
        DisplayManager displayManager;
        b bVar = new b();
        bVar.f5929a = new a();
        bVar.f5930b = new a();
        bVar.f5932d = -9223372036854775807L;
        this.f6034a = bVar;
        o oVar = (context == null || (displayManager = (DisplayManager) context.getSystemService(StubApp.getString2(3958))) == null) ? null : new o(this, displayManager, 0);
        this.f6035b = oVar;
        this.f6036c = oVar != null ? p.f6029e : null;
        this.f6043k = -9223372036854775807L;
        this.f6044l = -9223372036854775807L;
        this.f6039f = -1.0f;
        this.f6042i = 1.0f;
        this.j = 0;
    }

    public static void a(q qVar, Display display) {
        qVar.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            qVar.f6043k = refreshRate;
            qVar.f6044l = (refreshRate * 80) / 100;
        } else {
            AbstractC1550k.w(StubApp.getString2(5591), StubApp.getString2(5593));
            qVar.f6043k = -9223372036854775807L;
            qVar.f6044l = -9223372036854775807L;
        }
    }

    public final void b() {
        Surface surface;
        if (AbstractC1560u.f20190a < 30 || (surface = this.f6038e) == null || this.j == Integer.MIN_VALUE || this.f6041h == 0.0f) {
            return;
        }
        this.f6041h = 0.0f;
        try {
            surface.setFrameRate(0.0f, 0);
        } catch (IllegalStateException e10) {
            AbstractC1550k.l(StubApp.getString2(5591), StubApp.getString2(5594), e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r9 = this;
            int r0 = r0.AbstractC1560u.f20190a
            r1 = 30
            if (r0 < r1) goto L8d
            android.view.Surface r0 = r9.f6038e
            if (r0 != 0) goto Lc
            goto L8d
        Lc:
            R0.b r0 = r9.f6034a
            R0.a r2 = r0.f5929a
            boolean r2 = r2.a()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L39
            R0.a r2 = r0.f5929a
            boolean r2 = r2.a()
            if (r2 == 0) goto L37
            R0.a r2 = r0.f5929a
            long r4 = r2.f5925e
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L2b
            goto L2e
        L2b:
            long r6 = r2.f5926f
            long r6 = r6 / r4
        L2e:
            double r4 = (double) r6
            r6 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r6 = r6 / r4
            float r2 = (float) r6
            goto L3b
        L37:
            r2 = r3
            goto L3b
        L39:
            float r2 = r9.f6039f
        L3b:
            float r4 = r9.f6040g
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 != 0) goto L42
            goto L8d
        L42:
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 == 0) goto L80
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 == 0) goto L80
            R0.a r1 = r0.f5929a
            boolean r1 = r1.a()
            if (r1 == 0) goto L71
            R0.a r1 = r0.f5929a
            boolean r1 = r1.a()
            if (r1 == 0) goto L5f
            R0.a r0 = r0.f5929a
            long r0 = r0.f5926f
            goto L64
        L5f:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L64:
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L71
            r0 = 1017370378(0x3ca3d70a, float:0.02)
            goto L73
        L71:
            r0 = 1065353216(0x3f800000, float:1.0)
        L73:
            float r1 = r9.f6040g
            float r1 = r2 - r1
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L8d
            goto L87
        L80:
            if (r5 == 0) goto L83
            goto L87
        L83:
            int r0 = r0.f5933e
            if (r0 < r1) goto L8d
        L87:
            r9.f6040g = r2
            r0 = 0
            r9.d(r0)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.q.c():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(boolean r5) {
        /*
            r4 = this;
            int r0 = r0.AbstractC1560u.f20190a
            r1 = 30
            if (r0 < r1) goto L4b
            android.view.Surface r0 = r4.f6038e
            if (r0 == 0) goto L4b
            int r1 = r4.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L11
            goto L4b
        L11:
            boolean r1 = r4.f6037d
            r2 = 0
            if (r1 == 0) goto L22
            float r1 = r4.f6040g
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L22
            float r3 = r4.f6042i
            float r1 = r1 * r3
            goto L23
        L22:
            r1 = r2
        L23:
            if (r5 != 0) goto L2c
            float r5 = r4.f6041h
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2c
            goto L4b
        L2c:
            r4.f6041h = r1
            int r5 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r5 != 0) goto L34
            r5 = 0
            goto L35
        L34:
            r5 = 1
        L35:
            D1.a.l(r0, r1, r5)     // Catch: java.lang.IllegalStateException -> L39
            return
        L39:
            r5 = move-exception
            r0 = 5591(0x15d7, float:7.835E-42)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r1 = 5594(0x15da, float:7.839E-42)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            r0.AbstractC1550k.l(r0, r1, r5)
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.q.d(boolean):void");
    }
}
