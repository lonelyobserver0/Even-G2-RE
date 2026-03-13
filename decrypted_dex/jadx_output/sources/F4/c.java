package F4;

import android.graphics.Typeface;
import android.text.TextPaint;
import com.google.android.gms.internal.measurement.AbstractC0624h2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c extends AbstractC0624h2 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextPaint f2218c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC0624h2 f2219d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f2220e;

    public c(d dVar, TextPaint textPaint, AbstractC0624h2 abstractC0624h2) {
        this.f2220e = dVar;
        this.f2218c = textPaint;
        this.f2219d = abstractC0624h2;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0624h2
    public final void p(int i3) {
        this.f2219d.p(i3);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0624h2
    public final void q(Typeface typeface, boolean z2) {
        this.f2220e.d(this.f2218c, typeface);
        this.f2219d.q(typeface, z2);
    }
}
