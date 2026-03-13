package l4;

import S3.AbstractC0271e;
import android.os.IBinder;
import android.os.IInterface;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class P extends AbstractC0271e {
    @Override // S3.AbstractC0271e, Q3.c
    public final int j() {
        return 12451000;
    }

    @Override // S3.AbstractC0271e
    public final /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(StubApp.getString2(19671));
        return queryLocalInterface instanceof InterfaceC1151G ? (InterfaceC1151G) queryLocalInterface : new C1149E(iBinder);
    }

    @Override // S3.AbstractC0271e
    public final String u() {
        return StubApp.getString2(19671);
    }

    @Override // S3.AbstractC0271e
    public final String v() {
        return StubApp.getString2(12388);
    }
}
