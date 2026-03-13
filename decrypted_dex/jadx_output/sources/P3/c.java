package P3;

import a.AbstractC0378a;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5498a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f5498a) {
            case 0:
                int G4 = AbstractC0378a.G(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < G4) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 1) {
                        AbstractC0378a.B(parcel, readInt);
                    } else {
                        intent = (Intent) AbstractC0378a.h(parcel, readInt, Intent.CREATOR);
                    }
                }
                AbstractC0378a.o(parcel, G4);
                return new a(intent);
            default:
                return new g(parcel.readStrongBinder());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        switch (this.f5498a) {
            case 0:
                return new a[i3];
            default:
                return new g[i3];
        }
    }
}
