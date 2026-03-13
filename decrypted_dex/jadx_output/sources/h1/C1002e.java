package h1;

import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;
import java.util.Objects;
import r0.AbstractC1560u;

/* renamed from: h1.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1002e extends AbstractC1006i {
    public static final Parcelable.Creator<C1002e> CREATOR = new com.google.android.material.datepicker.l(25);

    /* renamed from: b, reason: collision with root package name */
    public final String f14435b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14436c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14437d;

    public C1002e(String str, String str2, String str3) {
        super(StubApp.getString2(18067));
        this.f14435b = str;
        this.f14436c = str2;
        this.f14437d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1002e.class == obj.getClass()) {
            C1002e c1002e = (C1002e) obj;
            int i3 = AbstractC1560u.f20190a;
            if (Objects.equals(this.f14436c, c1002e.f14436c) && Objects.equals(this.f14435b, c1002e.f14435b) && Objects.equals(this.f14437d, c1002e.f14437d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f14435b;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f14436c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f14437d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // h1.AbstractC1006i
    public final String toString() {
        return this.f14447a + StubApp.getString2(18068) + this.f14435b + StubApp.getString2(7300) + this.f14436c + StubApp.getString2(12693) + this.f14437d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f14447a);
        parcel.writeString(this.f14435b);
        parcel.writeString(this.f14437d);
    }

    public C1002e(Parcel parcel) {
        super(StubApp.getString2(18067));
        String readString = parcel.readString();
        int i3 = AbstractC1560u.f20190a;
        this.f14435b = readString;
        this.f14436c = parcel.readString();
        this.f14437d = parcel.readString();
    }
}
