package F4;

import android.graphics.Typeface;
import com.google.android.gms.internal.measurement.AbstractC0624h2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a extends AbstractC0624h2 {

    /* renamed from: c, reason: collision with root package name */
    public final Typeface f2213c;

    /* renamed from: d, reason: collision with root package name */
    public final A0.c f2214d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2215e;

    public a(A0.c cVar, Typeface typeface) {
        this.f2213c = typeface;
        this.f2214d = cVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0624h2
    public final void p(int i3) {
        if (this.f2215e) {
            return;
        }
        D4.c cVar = (D4.c) this.f2214d.f29a;
        a aVar = cVar.f1310v;
        if (aVar != null) {
            aVar.f2215e = true;
        }
        Typeface typeface = cVar.f1307s;
        Typeface typeface2 = this.f2213c;
        if (typeface != typeface2) {
            cVar.f1307s = typeface2;
            cVar.f();
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0624h2
    public final void q(Typeface typeface, boolean z2) {
        if (this.f2215e) {
            return;
        }
        D4.c cVar = (D4.c) this.f2214d.f29a;
        a aVar = cVar.f1310v;
        if (aVar != null) {
            aVar.f2215e = true;
        }
        if (cVar.f1307s != typeface) {
            cVar.f1307s = typeface;
            cVar.f();
        }
    }
}
