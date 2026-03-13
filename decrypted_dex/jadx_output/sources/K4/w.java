package K4;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class w extends R.b {
    public static final Parcelable.Creator<w> CREATOR = new A.g(2);

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f3716c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3717d;

    public w(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3716c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3717d = parcel.readInt() == 1;
    }

    public final String toString() {
        return StubApp.getString2(3259) + Integer.toHexString(System.identityHashCode(this)) + StubApp.getString2(3260) + ((Object) this.f3716c) + StubApp.getString2(265);
    }

    @Override // R.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        TextUtils.writeToParcel(this.f3716c, parcel, i3);
        parcel.writeInt(this.f3717d ? 1 : 0);
    }
}
