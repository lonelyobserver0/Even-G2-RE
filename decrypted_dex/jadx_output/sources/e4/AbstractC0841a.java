package e4;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;
import i2.u;

/* renamed from: e4.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC0841a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f13595a = 0;

    static {
        AbstractC0841a.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException(u.p(dataAvail, StubApp.getString2(9413)));
        }
    }

    public static void c(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
