package B0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class t implements Parcelable {
    public static final Parcelable.Creator<t> CREATOR = new s(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f569a;

    /* renamed from: b, reason: collision with root package name */
    public final int f570b;

    /* renamed from: c, reason: collision with root package name */
    public final String f571c;

    /* renamed from: d, reason: collision with root package name */
    public final String f572d;

    /* renamed from: e, reason: collision with root package name */
    public final String f573e;

    /* renamed from: f, reason: collision with root package name */
    public final String f574f;

    public t(int i3, int i10, String str, String str2, String str3, String str4) {
        this.f569a = i3;
        this.f570b = i10;
        this.f571c = str;
        this.f572d = str2;
        this.f573e = str3;
        this.f574f = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t.class == obj.getClass()) {
            t tVar = (t) obj;
            if (this.f569a == tVar.f569a && this.f570b == tVar.f570b && TextUtils.equals(this.f571c, tVar.f571c) && TextUtils.equals(this.f572d, tVar.f572d) && TextUtils.equals(this.f573e, tVar.f573e) && TextUtils.equals(this.f574f, tVar.f574f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3 = ((this.f569a * 31) + this.f570b) * 31;
        String str = this.f571c;
        int hashCode = (i3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f572d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f573e;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f574f;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f569a);
        parcel.writeInt(this.f570b);
        parcel.writeString(this.f571c);
        parcel.writeString(this.f572d);
        parcel.writeString(this.f573e);
        parcel.writeString(this.f574f);
    }

    public t(Parcel parcel) {
        this.f569a = parcel.readInt();
        this.f570b = parcel.readInt();
        this.f571c = parcel.readString();
        this.f572d = parcel.readString();
        this.f573e = parcel.readString();
        this.f574f = parcel.readString();
    }
}
