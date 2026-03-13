package R0;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.SystemClock;
import no.nordicsemi.android.dfu.DfuServiceInitiator;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import r0.C1555p;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final f f6016a;

    /* renamed from: b, reason: collision with root package name */
    public final q f6017b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6018c;

    /* renamed from: f, reason: collision with root package name */
    public long f6021f;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6024i;

    /* renamed from: d, reason: collision with root package name */
    public int f6019d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f6020e = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    public long f6022g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public long f6023h = -9223372036854775807L;
    public float j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    public C1555p f6025k = C1555p.f20182a;

    public n(Context context, f fVar) {
        this.f6016a = fVar;
        this.f6017b = new q(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0117, code lost:
    
        if (r12 > 100000) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0124, code lost:
    
        if (r29 >= r33) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0076, code lost:
    
        if ((r11 == 0 ? false : r9.f5927g[(int) ((r11 - 1) % 15)]) != false) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x024e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0250  */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [int] */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(long r27, long r29, long r31, long r33, boolean r35, Lc.e r36) {
        /*
            Method dump skipped, instructions count: 621
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.n.a(long, long, long, long, boolean, Lc.e):int");
    }

    public final boolean b(boolean z2) {
        if (z2 && this.f6019d == 3) {
            this.f6023h = -9223372036854775807L;
            return true;
        }
        if (this.f6023h == -9223372036854775807L) {
            return false;
        }
        this.f6025k.getClass();
        if (SystemClock.elapsedRealtime() < this.f6023h) {
            return true;
        }
        this.f6023h = -9223372036854775807L;
        return false;
    }

    public final void c(boolean z2) {
        this.f6024i = z2;
        this.f6025k.getClass();
        this.f6023h = SystemClock.elapsedRealtime() + DfuServiceInitiator.DEFAULT_SCAN_TIMEOUT;
    }

    public final void d(int i3) {
        this.f6019d = Math.min(this.f6019d, i3);
    }

    public final void e() {
        this.f6018c = true;
        this.f6025k.getClass();
        this.f6021f = AbstractC1560u.J(SystemClock.elapsedRealtime());
        q qVar = this.f6017b;
        qVar.f6037d = true;
        qVar.f6045m = 0L;
        qVar.f6048p = -1L;
        qVar.f6046n = -1L;
        o oVar = qVar.f6035b;
        if (oVar != null) {
            p pVar = qVar.f6036c;
            pVar.getClass();
            pVar.f6031b.sendEmptyMessage(2);
            Handler m4 = AbstractC1560u.m(null);
            DisplayManager displayManager = oVar.f6027b;
            displayManager.registerDisplayListener(oVar, m4);
            q.a((q) oVar.f6028c, displayManager.getDisplay(0));
        }
        qVar.d(false);
    }

    public final void f() {
        this.f6018c = false;
        this.f6023h = -9223372036854775807L;
        q qVar = this.f6017b;
        qVar.f6037d = false;
        o oVar = qVar.f6035b;
        if (oVar != null) {
            oVar.f6027b.unregisterDisplayListener(oVar);
            p pVar = qVar.f6036c;
            pVar.getClass();
            pVar.f6031b.sendEmptyMessage(3);
        }
        qVar.b();
    }

    public final void g(float f10) {
        q qVar = this.f6017b;
        qVar.f6039f = f10;
        b bVar = qVar.f6034a;
        bVar.f5929a.c();
        bVar.f5930b.c();
        bVar.f5931c = false;
        bVar.f5932d = -9223372036854775807L;
        bVar.f5933e = 0;
        qVar.c();
    }

    public final void h(float f10) {
        AbstractC1550k.c(f10 > 0.0f);
        if (f10 == this.j) {
            return;
        }
        this.j = f10;
        q qVar = this.f6017b;
        qVar.f6042i = f10;
        qVar.f6045m = 0L;
        qVar.f6048p = -1L;
        qVar.f6046n = -1L;
        qVar.d(false);
    }
}
