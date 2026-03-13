package F4;

import android.graphics.Typeface;
import com.google.android.gms.internal.measurement.AbstractC0624h2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b extends E.b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractC0624h2 f2216h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d f2217i;

    public b(d dVar, AbstractC0624h2 abstractC0624h2) {
        this.f2217i = dVar;
        this.f2216h = abstractC0624h2;
    }

    @Override // E.b
    public final void e(int i3) {
        this.f2217i.f2230k = true;
        this.f2216h.p(i3);
    }

    @Override // E.b
    public final void f(Typeface typeface) {
        d dVar = this.f2217i;
        dVar.f2231l = Typeface.create(typeface, dVar.f2223c);
        dVar.f2230k = true;
        this.f2216h.q(dVar.f2231l, false);
    }
}
