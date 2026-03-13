package P0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import com.stub.StubApp;
import java.io.IOException;
import r0.AbstractC1550k;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class k extends Handler implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final int f5420a;

    /* renamed from: b, reason: collision with root package name */
    public final l f5421b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5422c;

    /* renamed from: d, reason: collision with root package name */
    public j f5423d;

    /* renamed from: e, reason: collision with root package name */
    public IOException f5424e;

    /* renamed from: f, reason: collision with root package name */
    public int f5425f;

    /* renamed from: g, reason: collision with root package name */
    public Thread f5426g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5427h;
    public volatile boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ o f5428k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, Looper looper, l lVar, j jVar, int i3, long j) {
        super(looper);
        this.f5428k = oVar;
        this.f5421b = lVar;
        this.f5423d = jVar;
        this.f5420a = i3;
        this.f5422c = j;
    }

    public final void a(boolean z2) {
        this.j = z2;
        this.f5424e = null;
        if (hasMessages(1)) {
            this.f5427h = true;
            removeMessages(1);
            if (!z2) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f5427h = true;
                    this.f5421b.o();
                    Thread thread = this.f5426g;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z2) {
            this.f5428k.f5433b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            j jVar = this.f5423d;
            jVar.getClass();
            jVar.o(this.f5421b, elapsedRealtime, elapsedRealtime - this.f5422c, true);
            this.f5423d = null;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.j) {
            return;
        }
        int i3 = message.what;
        if (i3 == 1) {
            SystemClock.elapsedRealtime();
            this.f5423d.getClass();
            this.f5424e = null;
            o oVar = this.f5428k;
            Q0.a aVar = oVar.f5432a;
            k kVar = oVar.f5433b;
            kVar.getClass();
            aVar.execute(kVar);
            return;
        }
        if (i3 == 4) {
            throw ((Error) message.obj);
        }
        this.f5428k.f5433b = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.f5422c;
        j jVar = this.f5423d;
        jVar.getClass();
        if (this.f5427h) {
            jVar.o(this.f5421b, elapsedRealtime, j, false);
            return;
        }
        int i10 = message.what;
        if (i10 == 2) {
            try {
                jVar.r(this.f5421b, elapsedRealtime, j);
                return;
            } catch (RuntimeException e10) {
                AbstractC1550k.l(StubApp.getString2(4767), StubApp.getString2(4768), e10);
                this.f5428k.f5434c = new n(e10);
                return;
            }
        }
        if (i10 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f5424e = iOException;
        int i11 = this.f5425f + 1;
        this.f5425f = i11;
        A1.g t3 = jVar.t(this.f5421b, elapsedRealtime, j, iOException, i11);
        int i12 = t3.f72a;
        if (i12 == 3) {
            this.f5428k.f5434c = this.f5424e;
            return;
        }
        if (i12 != 2) {
            if (i12 == 1) {
                this.f5425f = 1;
            }
            long j3 = t3.f73b;
            if (j3 == -9223372036854775807L) {
                j3 = Math.min((this.f5425f - 1) * 1000, 5000);
            }
            o oVar2 = this.f5428k;
            AbstractC1550k.g(oVar2.f5433b == null);
            oVar2.f5433b = this;
            if (j3 > 0) {
                sendEmptyMessageDelayed(1, j3);
                return;
            }
            SystemClock.elapsedRealtime();
            this.f5423d.getClass();
            this.f5424e = null;
            Q0.a aVar2 = oVar2.f5432a;
            k kVar2 = oVar2.f5433b;
            kVar2.getClass();
            aVar2.execute(kVar2);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2;
        String string2 = StubApp.getString2(4769);
        try {
            synchronized (this) {
                z2 = this.f5427h;
                this.f5426g = Thread.currentThread();
            }
            if (!z2) {
                Trace.beginSection(string2.concat(this.f5421b.getClass().getSimpleName()));
                try {
                    this.f5421b.l();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.f5426g = null;
                Thread.interrupted();
            }
            if (this.j) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e10) {
            if (this.j) {
                return;
            }
            obtainMessage(3, e10).sendToTarget();
        } catch (Error e11) {
            if (!this.j) {
                AbstractC1550k.l(StubApp.getString2(4767), StubApp.getString2(4770), e11);
                obtainMessage(4, e11).sendToTarget();
            }
            throw e11;
        } catch (Exception e12) {
            if (this.j) {
                return;
            }
            AbstractC1550k.l(StubApp.getString2(4767), StubApp.getString2(4772), e12);
            obtainMessage(3, new n(e12)).sendToTarget();
        } catch (OutOfMemoryError e13) {
            if (this.j) {
                return;
            }
            AbstractC1550k.l(StubApp.getString2(4767), StubApp.getString2(4771), e13);
            obtainMessage(3, new n(e13)).sendToTarget();
        }
    }
}
