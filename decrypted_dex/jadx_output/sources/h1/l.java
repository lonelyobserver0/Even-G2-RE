package h1;

import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;
import java.util.Arrays;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class l extends AbstractC1006i {
    public static final Parcelable.Creator<l> CREATOR = new com.google.android.material.datepicker.l(28);

    /* renamed from: b, reason: collision with root package name */
    public final int f14452b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14453c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14454d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f14455e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f14456f;

    public l(int i3, int i10, int[] iArr, int[] iArr2, int i11) {
        super(StubApp.getString2(18277));
        this.f14452b = i3;
        this.f14453c = i10;
        this.f14454d = i11;
        this.f14455e = iArr;
        this.f14456f = iArr2;
    }

    @Override // h1.AbstractC1006i, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f14452b == lVar.f14452b && this.f14453c == lVar.f14453c && this.f14454d == lVar.f14454d && Arrays.equals(this.f14455e, lVar.f14455e) && Arrays.equals(this.f14456f, lVar.f14456f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f14456f) + ((Arrays.hashCode(this.f14455e) + ((((((527 + this.f14452b) * 31) + this.f14453c) * 31) + this.f14454d) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f14452b);
        parcel.writeInt(this.f14453c);
        parcel.writeInt(this.f14454d);
        parcel.writeIntArray(this.f14455e);
        parcel.writeIntArray(this.f14456f);
    }

    public l(Parcel parcel) {
        super(StubApp.getString2(18277));
        this.f14452b = parcel.readInt();
        this.f14453c = parcel.readInt();
        this.f14454d = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i3 = AbstractC1560u.f20190a;
        this.f14455e = createIntArray;
        this.f14456f = parcel.createIntArray();
    }
}
