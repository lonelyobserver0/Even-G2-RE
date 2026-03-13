package h1;

import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;
import java.util.Objects;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class k extends AbstractC1006i {
    public static final Parcelable.Creator<k> CREATOR = new com.google.android.material.datepicker.l(27);

    /* renamed from: b, reason: collision with root package name */
    public final String f14449b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14450c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14451d;

    public k(String str, String str2, String str3) {
        super(StubApp.getString2(18275));
        this.f14449b = str;
        this.f14450c = str2;
        this.f14451d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            int i3 = AbstractC1560u.f20190a;
            if (Objects.equals(this.f14450c, kVar.f14450c) && Objects.equals(this.f14449b, kVar.f14449b) && Objects.equals(this.f14451d, kVar.f14451d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f14449b;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f14450c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f14451d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // h1.AbstractC1006i
    public final String toString() {
        return this.f14447a + StubApp.getString2(18276) + this.f14449b + StubApp.getString2(7300) + this.f14450c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f14447a);
        parcel.writeString(this.f14449b);
        parcel.writeString(this.f14451d);
    }

    public k(Parcel parcel) {
        super(StubApp.getString2(18275));
        String readString = parcel.readString();
        int i3 = AbstractC1560u.f20190a;
        this.f14449b = readString;
        this.f14450c = parcel.readString();
        this.f14451d = parcel.readString();
    }
}
