package Vc;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;
import com.stub.StubApp;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Timer;
import q8.AbstractC1526a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class b implements MediaPlayer.OnErrorListener {

    /* renamed from: l, reason: collision with root package name */
    public static final boolean[] f7979l = {true, true, true, false, true, true, true, true, true, false, true, true, true, true, false, false, false, true, true, true};

    /* renamed from: m, reason: collision with root package name */
    public static int f7980m = 0;

    /* renamed from: b, reason: collision with root package name */
    public Ec.d f7982b;

    /* renamed from: c, reason: collision with root package name */
    public Timer f7983c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7985e;

    /* renamed from: f, reason: collision with root package name */
    public final Wc.b f7986f;

    /* renamed from: a, reason: collision with root package name */
    public long f7981a = 0;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f7984d = new Handler(Looper.getMainLooper());

    /* renamed from: g, reason: collision with root package name */
    public double f7987g = -1.0d;

    /* renamed from: h, reason: collision with root package name */
    public double f7988h = -2.0d;

    /* renamed from: i, reason: collision with root package name */
    public double f7989i = -1.0d;
    public long j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f7990k = 0;

    public b(Wc.b bVar) {
        this.f7986f = bVar;
    }

    public final void a() {
        String string2 = StubApp.getString2(25780);
        String string22 = StubApp.getString2(25781);
        String c10 = c();
        try {
            File file = new File(c10);
            if (file.exists()) {
                if (!file.delete()) {
                    d(string2 + c10);
                } else {
                    this.f7986f.f(2, string22 + c10);
                }
            }
        } catch (Exception unused) {
        }
    }

    public final int b() {
        Ec.d dVar = this.f7982b;
        if (dVar == null) {
            return 1;
        }
        if (!dVar.d()) {
            return this.f7985e ? 3 : 1;
        }
        if (this.f7985e) {
            throw new RuntimeException();
        }
        return 2;
    }

    public final String c() {
        return AbstractC1526a.f20083a.getCacheDir().getPath() + StubApp.getString2(25782) + this.f7990k;
    }

    public final void d(String str) {
        this.f7986f.f(5, str);
    }

    public final void e() {
        this.f7984d.post(new a(this, 0));
    }

    public final boolean f() {
        try {
            Timer timer = this.f7983c;
            if (timer != null) {
                timer.cancel();
            }
            this.f7983c = null;
            Ec.d dVar = this.f7982b;
            Wc.b bVar = this.f7986f;
            if (dVar == null) {
                bVar.c(StubApp.getString2("25783"), false, false);
                return false;
            }
            dVar.e();
            this.f7985e = true;
            bVar.c(StubApp.getString2("25784"), true, true);
            return true;
        } catch (Exception e10) {
            d(StubApp.getString2(25785) + e10.getMessage());
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024 A[Catch: Exception -> 0x003b, TryCatch #0 {Exception -> 0x003b, blocks: (B:6:0x0005, B:8:0x000d, B:10:0x0015, B:11:0x001e, B:13:0x0024, B:14:0x0027, B:16:0x002f, B:17:0x0032, B:19:0x0038, B:24:0x001b), top: B:5:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f A[Catch: Exception -> 0x003b, TryCatch #0 {Exception -> 0x003b, blocks: (B:6:0x0005, B:8:0x000d, B:10:0x0015, B:11:0x001e, B:13:0x0024, B:14:0x0027, B:16:0x002f, B:17:0x0032, B:19:0x0038, B:24:0x001b), top: B:5:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038 A[Catch: Exception -> 0x003b, TRY_LEAVE, TryCatch #0 {Exception -> 0x003b, blocks: (B:6:0x0005, B:8:0x000d, B:10:0x0015, B:11:0x001e, B:13:0x0024, B:14:0x0027, B:16:0x002f, B:17:0x0032, B:19:0x0038, B:24:0x001b), top: B:5:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            r9 = this;
            Ec.d r0 = r9.f7982b
            if (r0 != 0) goto L5
            return
        L5:
            double r0 = r9.f7987g     // Catch: java.lang.Exception -> L3b
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L19
            double r5 = r9.f7988h     // Catch: java.lang.Exception -> L3b
            r7 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 < 0) goto L19
            r9.m(r0, r5)     // Catch: java.lang.Exception -> L3b
            goto L1e
        L19:
            if (r4 < 0) goto L1e
            r9.l(r0)     // Catch: java.lang.Exception -> L3b
        L1e:
            double r0 = r9.f7989i     // Catch: java.lang.Exception -> L3b
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L27
            r9.j(r0)     // Catch: java.lang.Exception -> L3b
        L27:
            long r0 = r9.f7981a     // Catch: java.lang.Exception -> L3b
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L32
            r9.k(r0)     // Catch: java.lang.Exception -> L3b
        L32:
            long r0 = r9.j     // Catch: java.lang.Exception -> L3b
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L3b
            r9.i(r0)     // Catch: java.lang.Exception -> L3b
        L3b:
            Ec.d r0 = r9.f7982b
            r0.f()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Vc.b.g():void");
    }

    public final boolean h() {
        try {
            Ec.d dVar = this.f7982b;
            if (dVar == null) {
                return false;
            }
            dVar.g();
            this.f7985e = false;
            k(this.f7981a);
            this.f7986f.c(StubApp.getString2("25783"), true, true);
            return true;
        } catch (Exception e10) {
            d(StubApp.getString2(25786) + e10.getMessage());
            return false;
        }
    }

    public final void i(long j) {
        if (this.f7982b == null) {
            this.j = j;
            return;
        }
        this.f7986f.f(2, Xa.h.h(j, StubApp.getString2(25787)));
        this.j = -1L;
        this.f7982b.h(j);
    }

    public final void j(double d8) {
        try {
            this.f7989i = d8;
            Ec.d dVar = this.f7982b;
            if (dVar == null) {
                return;
            }
            dVar.i(d8);
        } catch (Exception e10) {
            d(StubApp.getString2(25788) + e10.getMessage());
        }
    }

    public final void k(long j) {
        Timer timer = this.f7983c;
        if (timer != null) {
            timer.cancel();
        }
        this.f7983c = null;
        this.f7981a = j;
        if (this.f7982b == null || j == 0 || j <= 0) {
            return;
        }
        E9.j jVar = new E9.j(this, 1);
        Timer timer2 = new Timer();
        this.f7983c = timer2;
        timer2.schedule(jVar, 0L, j);
    }

    public final void l(double d8) {
        try {
            this.f7987g = d8;
            Ec.d dVar = this.f7982b;
            if (dVar == null) {
                return;
            }
            dVar.j(d8);
        } catch (Exception e10) {
            d(StubApp.getString2(25789) + e10.getMessage());
        }
    }

    public final void m(double d8, double d10) {
        try {
            this.f7987g = d8;
            this.f7988h = d10;
            Ec.d dVar = this.f7982b;
            if (dVar == null) {
                return;
            }
            dVar.k(d8, d10);
        } catch (Exception e10) {
            d(StubApp.getString2(25789) + e10.getMessage());
        }
    }

    public final boolean n(int i3, String str, byte[] bArr, int i10, boolean z2, int i11, int i12) {
        Exception exc;
        String str2;
        o();
        if (bArr != null) {
            try {
                String c10 = c();
                a();
                File file = new File(c10);
                new FileOutputStream(file).write(bArr);
                str = file.getPath();
            } catch (Exception unused) {
                return false;
            }
        }
        boolean z10 = str == null && (i3 == 7 || i3 == 16);
        if (z10) {
            try {
                d dVar = new d();
                dVar.f7994d = null;
                dVar.f7995e = 0;
                dVar.f7996f = 0L;
                dVar.f7997g = -1L;
                dVar.f7998h = 0L;
                dVar.f7999i = null;
                dVar.j = 0;
                dVar.f7995e = ((AudioManager) AbstractC1526a.f20083a.getSystemService(StubApp.getString2("643"))).generateAudioSessionId();
                this.f7982b = dVar;
            } catch (Exception e10) {
                exc = e10;
                d(StubApp.getString2(25790));
                d(exc.toString());
                o();
                return false;
            }
        } else {
            try {
                g gVar = new g();
                gVar.f8008d = null;
                gVar.f8009e = this;
                this.f7982b = gVar;
            } catch (Exception e11) {
                e = e11;
                exc = e;
                d(StubApp.getString2(25790));
                d(exc.toString());
                o();
                return false;
            }
        }
        if (str == null) {
            str2 = null;
        } else {
            if (!str.contains("/")) {
                str = AbstractC1526a.K(str);
            }
            str2 = str;
        }
        try {
            this.f7982b.l(i3, str2, i11, i10, i12, this);
            if (!z10) {
                return true;
            }
            g();
            return true;
        } catch (Exception e12) {
            e = e12;
            exc = e;
            d(StubApp.getString2(25790));
            d(exc.toString());
            o();
            return false;
        }
    }

    public final void o() {
        a();
        Timer timer = this.f7983c;
        if (timer != null) {
            timer.cancel();
        }
        this.f7983c = null;
        this.f7985e = false;
        Ec.d dVar = this.f7982b;
        if (dVar != null) {
            dVar.m();
        }
        this.f7982b = null;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i3, int i10) {
        return false;
    }
}
