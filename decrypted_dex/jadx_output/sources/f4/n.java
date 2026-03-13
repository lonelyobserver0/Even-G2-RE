package f4;

import Z9.C0366a;
import a0.C0379a;
import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import com.stub.StubApp;
import i4.InterfaceC1034A;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class n extends c4.b implements InterfaceC1034A {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f13759g = 0;

    /* renamed from: f, reason: collision with root package name */
    public final m f13760f;

    public n(m mVar) {
        super(StubApp.getString2(17500), 2);
        this.f13760f = mVar;
    }

    @Override // c4.b
    public final boolean M(Parcel parcel, int i3) {
        m mVar = this.f13760f;
        if (i3 == 1) {
            LocationResult locationResult = (LocationResult) g.a(parcel, LocationResult.CREATOR);
            g.c(parcel);
            mVar.a().b(new C0379a(locationResult, 6));
            return true;
        }
        if (i3 != 2) {
            if (i3 != 3) {
                return false;
            }
            N();
            return true;
        }
        LocationAvailability locationAvailability = (LocationAvailability) g.a(parcel, LocationAvailability.CREATOR);
        g.c(parcel);
        mVar.a().b(new C0879c(locationAvailability));
        return true;
    }

    public final void N() {
        this.f13760f.a().b(new C0366a(this, 6));
    }
}
