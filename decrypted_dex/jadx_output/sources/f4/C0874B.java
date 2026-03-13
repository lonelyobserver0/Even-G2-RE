package f4;

import S3.AbstractC0275i;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.stub.StubApp;

/* renamed from: f4.B, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0874B extends AbstractC0275i {
    @Override // S3.AbstractC0271e, Q3.c
    public final int j() {
        return 11717000;
    }

    @Override // S3.AbstractC0271e
    public final /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(StubApp.getString2(17442));
        return queryLocalInterface instanceof F ? (F) queryLocalInterface : new F(iBinder);
    }

    @Override // S3.AbstractC0271e
    public final com.google.android.gms.common.d[] q() {
        return i4.y.f14831c;
    }

    @Override // S3.AbstractC0271e
    public final Bundle r() {
        Bundle bundle = new Bundle();
        bundle.putString(StubApp.getString2(17443), StubApp.getString2(17444));
        return bundle;
    }

    @Override // S3.AbstractC0271e
    public final String u() {
        return StubApp.getString2(17442);
    }

    @Override // S3.AbstractC0271e
    public final String v() {
        return StubApp.getString2(17445);
    }

    @Override // S3.AbstractC0271e
    public final boolean y() {
        return true;
    }
}
