package Oa;

import android.graphics.RectF;
import java.lang.ref.WeakReference;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f5328a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5329b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5330c = System.currentTimeMillis();

    /* renamed from: d, reason: collision with root package name */
    public final float f5331d;

    /* renamed from: e, reason: collision with root package name */
    public final float f5332e;

    /* renamed from: f, reason: collision with root package name */
    public final float f5333f;

    /* renamed from: g, reason: collision with root package name */
    public final float f5334g;

    /* renamed from: h, reason: collision with root package name */
    public final float f5335h;
    public final float j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f5336k;

    public a(c cVar, long j, float f10, float f11, float f12, float f13, float f14, float f15, boolean z2) {
        this.f5328a = new WeakReference(cVar);
        this.f5329b = j;
        this.f5331d = f10;
        this.f5332e = f11;
        this.f5333f = f12;
        this.f5334g = f13;
        this.f5335h = f14;
        this.j = f15;
        this.f5336k = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c cVar = (c) this.f5328a.get();
        if (cVar == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f5330c;
        long j = this.f5329b;
        float min = Math.min(j, currentTimeMillis);
        float f10 = j;
        float f11 = (min / f10) - 1.0f;
        float f12 = (f11 * f11 * f11) + 1.0f;
        float f13 = (this.f5333f * f12) + 0.0f;
        float f14 = (f12 * this.f5334g) + 0.0f;
        float o5 = android.support.v4.media.session.b.o(min, this.j, f10);
        if (min < f10) {
            float[] fArr = cVar.f5358e;
            cVar.d(f13 - (fArr[0] - this.f5331d), f14 - (fArr[1] - this.f5332e));
            if (!this.f5336k) {
                float f15 = this.f5335h + o5;
                RectF rectF = cVar.f5353x;
                cVar.i(f15, rectF.centerX(), rectF.centerY());
            }
            if (cVar.g(cVar.f5357d)) {
                return;
            }
            cVar.post(this);
        }
    }
}
