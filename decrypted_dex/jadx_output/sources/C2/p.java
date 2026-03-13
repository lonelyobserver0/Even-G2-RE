package C2;

import android.location.GnssStatus;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class p extends GnssStatus.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f1094a;

    public p(q qVar) {
        this.f1094a = qVar;
    }

    @Override // android.location.GnssStatus.Callback
    public final void onSatelliteStatusChanged(GnssStatus gnssStatus) {
        double satelliteCount = gnssStatus.getSatelliteCount();
        q qVar = this.f1094a;
        qVar.f1101g = satelliteCount;
        qVar.f1102h = 0.0d;
        for (int i3 = 0; i3 < qVar.f1101g; i3++) {
            if (gnssStatus.usedInFix(i3)) {
                qVar.f1102h += 1.0d;
            }
        }
    }
}
