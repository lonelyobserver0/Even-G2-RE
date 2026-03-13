package C2;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import com.stub.StubApp;
import i4.AbstractC1047k;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f extends AbstractC1047k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f1062a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f1063b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f1064c;

    public f(g gVar, m mVar, Context context) {
        this.f1064c = gVar;
        this.f1062a = mVar;
        this.f1063b = context;
    }

    @Override // i4.AbstractC1047k
    public final synchronized void onLocationAvailability(LocationAvailability locationAvailability) {
        B2.a aVar;
        if (!(locationAvailability.f11782d < 1000)) {
            g gVar = this.f1064c;
            Context context = this.f1063b;
            gVar.getClass();
            if (!j.a(context) && (aVar = this.f1064c.f1071g) != null) {
                aVar.b(3);
            }
        }
    }

    @Override // i4.AbstractC1047k
    public final synchronized void onLocationResult(LocationResult locationResult) {
        if (this.f1064c.f1072h == null) {
            Log.e(StubApp.getString2("90"), StubApp.getString2("1072"));
            g gVar = this.f1064c;
            gVar.f1067c.removeLocationUpdates(gVar.f1066b);
            B2.a aVar = this.f1064c.f1071g;
            if (aVar != null) {
                aVar.b(2);
            }
            return;
        }
        List list = locationResult.f11798a;
        int size = list.size();
        Location location = size == 0 ? null : (Location) list.get(size - 1);
        if (location == null) {
            return;
        }
        if (location.getExtras() == null) {
            location.setExtras(Bundle.EMPTY);
        }
        if (this.f1062a != null) {
            location.getExtras().putBoolean(StubApp.getString2("1073"), this.f1062a.f1090d);
        }
        this.f1064c.f1068d.a(location);
        this.f1064c.f1072h.a(location);
    }
}
