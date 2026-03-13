package l4;

import android.os.Looper;
import android.os.SystemClock;
import f4.C0882f;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class q1 extends AbstractC1150F {

    /* renamed from: c, reason: collision with root package name */
    public c4.h f16592c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16593d;

    /* renamed from: e, reason: collision with root package name */
    public final C0882f f16594e;

    /* renamed from: f, reason: collision with root package name */
    public final L0.U f16595f;

    /* renamed from: g, reason: collision with root package name */
    public final Y.m f16596g;

    public q1(C1200n0 c1200n0) {
        super(c1200n0);
        this.f16593d = true;
        this.f16594e = new C0882f(this);
        L0.U u2 = new L0.U();
        Objects.requireNonNull(this);
        u2.f3997d = this;
        C1200n0 c1200n02 = (C1200n0) this.f4728a;
        u2.f3996c = new p1(u2, c1200n02);
        c1200n02.f16545l.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        u2.f3994a = elapsedRealtime;
        u2.f3995b = elapsedRealtime;
        this.f16595f = u2;
        this.f16596g = new Y.m(this);
    }

    @Override // l4.AbstractC1150F
    public final boolean n() {
        return false;
    }

    public final void o() {
        k();
        if (this.f16592c == null) {
            this.f16592c = new c4.h(Looper.getMainLooper(), 1);
        }
    }
}
