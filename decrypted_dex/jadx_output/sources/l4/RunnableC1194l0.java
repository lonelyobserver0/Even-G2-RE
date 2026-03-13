package l4;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;

/* renamed from: l4.l0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class RunnableC1194l0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16504a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.L f16505b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f16506c;

    public RunnableC1194l0(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.L l9, int i3) {
        this.f16504a = i3;
        switch (i3) {
            case 1:
                this.f16505b = l9;
                Objects.requireNonNull(appMeasurementDynamiteService);
                this.f16506c = appMeasurementDynamiteService;
                break;
            default:
                this.f16505b = l9;
                this.f16506c = appMeasurementDynamiteService;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16504a) {
            case 0:
                C1189j1 o5 = this.f16506c.f11804e.o();
                o5.k();
                o5.l();
                o5.y(new K.m(14, o5, o5.A(false), this.f16505b, false));
                break;
            default:
                AppMeasurementDynamiteService appMeasurementDynamiteService = this.f16506c;
                K1 k12 = appMeasurementDynamiteService.f11804e.j;
                C1200n0.j(k12);
                C1200n0 c1200n0 = appMeasurementDynamiteService.f11804e;
                k12.W(this.f16505b, c1200n0.f16530B != null && c1200n0.f16530B.booleanValue());
                break;
        }
    }
}
