package f4;

import android.os.IBinder;
import android.os.Parcel;
import c4.AbstractC0566a;
import com.google.android.gms.location.LocationRequest;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class F extends AbstractC0566a {
    public F(IBinder iBinder) {
        super(iBinder, StubApp.getString2(17442), 3);
    }

    public final void N(t tVar) {
        Parcel g10 = g();
        g.b(g10, tVar);
        L(g10, 59);
    }

    public final void O(r rVar, LocationRequest locationRequest, l lVar) {
        Parcel g10 = g();
        g.b(g10, rVar);
        g.b(g10, locationRequest);
        g10.writeStrongBinder(lVar);
        L(g10, 88);
    }
}
