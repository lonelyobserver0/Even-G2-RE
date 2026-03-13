package R3;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.stub.StubApp;

/* renamed from: R3.f, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractBinderC0237f extends c4.b implements InterfaceC0238g {
    public AbstractBinderC0237f() {
        super(StubApp.getString2(5638), 0);
    }

    @Override // c4.b
    public final boolean K(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 != 1) {
            return false;
        }
        Status status = (Status) c4.c.a(parcel, Status.CREATOR);
        c4.c.b(parcel);
        p(status);
        return true;
    }
}
