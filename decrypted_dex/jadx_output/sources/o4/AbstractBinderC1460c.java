package o4;

import R3.C;
import android.os.Parcel;

/* renamed from: o4.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractBinderC1460c extends c4.b {
    @Override // c4.b
    public final boolean K(int i3, Parcel parcel, Parcel parcel2) {
        switch (i3) {
            case 3:
                c4.c.b(parcel);
                break;
            case 4:
                c4.c.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                c4.c.b(parcel);
                break;
            case 7:
                c4.c.b(parcel);
                break;
            case 8:
                f fVar = (f) c4.c.a(parcel, f.CREATOR);
                c4.c.b(parcel);
                C c10 = (C) this;
                c10.f6082g.post(new Q4.b(c10, fVar, 13, false));
                break;
            case 9:
                c4.c.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
