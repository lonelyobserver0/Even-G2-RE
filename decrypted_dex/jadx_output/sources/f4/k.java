package f4;

import a.AbstractC0378a;
import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.location.LocationResult;
import com.stub.StubApp;
import i4.AbstractC1047k;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class k extends AbstractC1047k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q4.k f13755a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f13756b;

    public k(p pVar, q4.k kVar) {
        this.f13755a = kVar;
        this.f13756b = pVar;
    }

    @Override // i4.AbstractC1047k
    public final void onLocationResult(LocationResult locationResult) {
        q4.k kVar = this.f13755a;
        List list = locationResult.f11798a;
        int size = list.size();
        kVar.d(size == 0 ? null : (Location) list.get(size - 1));
        try {
            this.f13756b.D(AbstractC0378a.g(this, StubApp.getString2("6603")), false, new q4.k());
        } catch (RemoteException unused) {
        }
    }
}
