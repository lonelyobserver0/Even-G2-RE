package Oa;

import java.lang.ref.WeakReference;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f5337a;

    /* renamed from: d, reason: collision with root package name */
    public final float f5340d;

    /* renamed from: e, reason: collision with root package name */
    public final float f5341e;

    /* renamed from: f, reason: collision with root package name */
    public final float f5342f;

    /* renamed from: g, reason: collision with root package name */
    public final float f5343g;

    /* renamed from: c, reason: collision with root package name */
    public final long f5339c = System.currentTimeMillis();

    /* renamed from: b, reason: collision with root package name */
    public final long f5338b = 200;

    public b(c cVar, float f10, float f11, float f12, float f13) {
        this.f5337a = new WeakReference(cVar);
        this.f5340d = f10;
        this.f5341e = f11;
        this.f5342f = f12;
        this.f5343g = f13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c cVar = (c) this.f5337a.get();
        if (cVar == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f5339c;
        long j = this.f5338b;
        float min = Math.min(j, currentTimeMillis);
        float f10 = j;
        float o5 = android.support.v4.media.session.b.o(min, this.f5341e, f10);
        if (min >= f10) {
            cVar.setImageToWrapCropBounds(true);
        } else {
            cVar.i(this.f5340d + o5, this.f5342f, this.f5343g);
            cVar.post(this);
        }
    }
}
