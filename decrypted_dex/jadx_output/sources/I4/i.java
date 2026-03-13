package I4;

import com.google.android.gms.internal.measurement.D1;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i extends D1 {
    @Override // com.google.android.gms.internal.measurement.D1
    public final void l(s sVar, float f10, float f11) {
        sVar.c(f11 * f10, 180.0f, 90.0f);
        float f12 = f11 * 2.0f * f10;
        o oVar = new o(0.0f, 0.0f, f12, f12);
        oVar.f3205f = 180.0f;
        oVar.f3206g = 90.0f;
        sVar.f3216f.add(oVar);
        m mVar = new m(oVar);
        sVar.a(180.0f);
        sVar.f3217g.add(mVar);
        sVar.f3214d = 270.0f;
        float f13 = (0.0f + f12) * 0.5f;
        float f14 = (f12 - 0.0f) / 2.0f;
        double d8 = 270.0f;
        sVar.f3212b = (((float) Math.cos(Math.toRadians(d8))) * f14) + f13;
        sVar.f3213c = (f14 * ((float) Math.sin(Math.toRadians(d8)))) + f13;
    }
}
