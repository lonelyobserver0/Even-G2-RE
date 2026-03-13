package f4;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationAvailability;
import com.stub.StubApp;
import i4.C1052p;
import i4.C1053q;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class j extends c4.b {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f13753f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q4.k f13754g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i3, q4.k kVar) {
        super(StubApp.getString2(17497), 2);
        this.f13753f = i3;
        switch (i3) {
            case 1:
                this.f13754g = kVar;
                super(StubApp.getString2(17499), 2);
                break;
            case 2:
                this.f13754g = kVar;
                super(StubApp.getString2(17498), 2);
                break;
            default:
                this.f13754g = kVar;
                break;
        }
    }

    @Override // c4.b
    public final boolean M(Parcel parcel, int i3) {
        switch (this.f13753f) {
            case 0:
                if (i3 == 1) {
                    C1053q c1053q = (C1053q) g.a(parcel, C1053q.CREATOR);
                    g.c(parcel);
                    Status status = c1053q.f14799a;
                    C1052p c1052p = new C1052p();
                    c1052p.f14798a = c1053q;
                    a4.f.v(status, c1052p, this.f13754g);
                    break;
                }
                break;
            case 1:
                if (i3 == 1) {
                    Status status2 = (Status) g.a(parcel, Status.CREATOR);
                    Location location = (Location) g.a(parcel, Location.CREATOR);
                    g.c(parcel);
                    a4.f.v(status2, location, this.f13754g);
                    break;
                }
                break;
            default:
                if (i3 == 1) {
                    Status status3 = (Status) g.a(parcel, Status.CREATOR);
                    LocationAvailability locationAvailability = (LocationAvailability) g.a(parcel, LocationAvailability.CREATOR);
                    g.c(parcel);
                    a4.f.v(status3, locationAvailability, this.f13754g);
                    break;
                }
                break;
        }
        return true;
    }
}
