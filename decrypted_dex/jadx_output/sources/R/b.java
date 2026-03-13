package R;

import A.g;
import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class b implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final Parcelable f5920a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f5919b = new a();
    public static final Parcelable.Creator<b> CREATOR = new g(3);

    public b() {
        this.f5920a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeParcelable(this.f5920a, i3);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f5920a = parcelable == f5919b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException(StubApp.getString2(5378));
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f5920a = readParcelable == null ? f5919b : readParcelable;
    }
}
