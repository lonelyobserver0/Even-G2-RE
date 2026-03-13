package c4;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;
import i2.u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f10823a = 0;

    static {
        c.class.getClassLoader();
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
}
