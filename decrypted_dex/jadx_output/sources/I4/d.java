package I4;

import com.google.android.gms.internal.measurement.D1;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d extends D1 {
    @Override // com.google.android.gms.internal.measurement.D1
    public final void l(s sVar, float f10, float f11) {
        sVar.c(f11 * f10, 180.0f, 90.0f);
        double d8 = f11;
        double d10 = f10;
        sVar.b((float) (Math.sin(Math.toRadians(90.0f)) * d8 * d10), (float) (Math.sin(Math.toRadians(0.0f)) * d8 * d10));
    }
}
