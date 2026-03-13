package h1;

import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;
import java.util.Arrays;
import java.util.Objects;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class m extends AbstractC1006i {
    public static final Parcelable.Creator<m> CREATOR = new com.google.android.material.datepicker.l(29);

    /* renamed from: b, reason: collision with root package name */
    public final String f14457b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f14458c;

    public m(String str, byte[] bArr) {
        super(StubApp.getString2(18278));
        this.f14457b = str;
        this.f14458c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            int i3 = AbstractC1560u.f20190a;
            if (Objects.equals(this.f14457b, mVar.f14457b) && Arrays.equals(this.f14458c, mVar.f14458c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f14457b;
        return Arrays.hashCode(this.f14458c) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // h1.AbstractC1006i
    public final String toString() {
        return this.f14447a + StubApp.getString2(18279) + this.f14457b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f14457b);
        parcel.writeByteArray(this.f14458c);
    }

    public m(Parcel parcel) {
        super(StubApp.getString2(18278));
        String readString = parcel.readString();
        int i3 = AbstractC1560u.f20190a;
        this.f14457b = readString;
        this.f14458c = parcel.createByteArray();
    }
}
