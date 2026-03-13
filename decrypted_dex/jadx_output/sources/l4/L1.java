package l4;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.stub.StubApp;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class L1 implements B0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.Q f16151a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f16152b;

    public L1(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.Q q10) {
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f16152b = appMeasurementDynamiteService;
        this.f16151a = q10;
    }

    @Override // l4.B0
    public final void a(long j, Bundle bundle, String str, String str2) {
        try {
            this.f16151a.n(j, bundle, str, str2);
        } catch (RemoteException e10) {
            C1200n0 c1200n0 = this.f16152b.f11804e;
            if (c1200n0 != null) {
                T t3 = c1200n0.f16541f;
                C1200n0.l(t3);
                t3.j.c(e10, StubApp.getString2(20011));
            }
        }
    }
}
