package h1;

import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;
import java.util.Arrays;
import java.util.Objects;
import r0.AbstractC1560u;

/* renamed from: h1.f, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1003f extends AbstractC1006i {
    public static final Parcelable.Creator<C1003f> CREATOR = new com.google.android.material.datepicker.l(26);

    /* renamed from: b, reason: collision with root package name */
    public final String f14438b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14439c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14440d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f14441e;

    public C1003f(String str, String str2, String str3, byte[] bArr) {
        super(StubApp.getString2(18069));
        this.f14438b = str;
        this.f14439c = str2;
        this.f14440d = str3;
        this.f14441e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1003f.class == obj.getClass()) {
            C1003f c1003f = (C1003f) obj;
            int i3 = AbstractC1560u.f20190a;
            if (Objects.equals(this.f14438b, c1003f.f14438b) && Objects.equals(this.f14439c, c1003f.f14439c) && Objects.equals(this.f14440d, c1003f.f14440d) && Arrays.equals(this.f14441e, c1003f.f14441e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f14438b;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f14439c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f14440d;
        return Arrays.hashCode(this.f14441e) + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // h1.AbstractC1006i
    public final String toString() {
        return this.f14447a + StubApp.getString2(18064) + this.f14438b + StubApp.getString2(18070) + this.f14439c + StubApp.getString2(7300) + this.f14440d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f14438b);
        parcel.writeString(this.f14439c);
        parcel.writeString(this.f14440d);
        parcel.writeByteArray(this.f14441e);
    }

    public C1003f(Parcel parcel) {
        super(StubApp.getString2(18069));
        String readString = parcel.readString();
        int i3 = AbstractC1560u.f20190a;
        this.f14438b = readString;
        this.f14439c = parcel.readString();
        this.f14440d = parcel.readString();
        this.f14441e = parcel.createByteArray();
    }
}
