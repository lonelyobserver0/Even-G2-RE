package g1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.l;
import com.stub.StubApp;
import java.util.Arrays;
import o0.x;
import o0.z;

/* renamed from: g1.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0952c implements z {
    public static final Parcelable.Creator<C0952c> CREATOR = new l(20);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f14211a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14212b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14213c;

    public C0952c(byte[] bArr, String str, String str2) {
        this.f14211a = bArr;
        this.f14212b = str;
        this.f14213c = str2;
    }

    @Override // o0.z
    public final void b(x xVar) {
        String str = this.f14212b;
        if (str != null) {
            xVar.f18256a = str;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0952c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f14211a, ((C0952c) obj).f14211a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f14211a);
    }

    public final String toString() {
        return StubApp.getString2(17762) + this.f14212b + StubApp.getString2(17763) + this.f14213c + StubApp.getString2(17764) + this.f14211a.length + StubApp.getString2(2123);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeByteArray(this.f14211a);
        parcel.writeString(this.f14212b);
        parcel.writeString(this.f14213c);
    }

    public C0952c(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        createByteArray.getClass();
        this.f14211a = createByteArray;
        this.f14212b = parcel.readString();
        this.f14213c = parcel.readString();
    }
}
