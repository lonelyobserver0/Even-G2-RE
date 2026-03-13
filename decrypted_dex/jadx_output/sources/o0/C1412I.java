package o0;

import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;
import j1.C1081j;
import r0.AbstractC1560u;

/* renamed from: o0.I, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1412I implements Comparable, Parcelable {
    public static final Parcelable.Creator<C1412I> CREATOR = new C1081j(20);

    /* renamed from: a, reason: collision with root package name */
    public final int f18039a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18040b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18041c;

    static {
        AbstractC1560u.E(0);
        AbstractC1560u.E(1);
        AbstractC1560u.E(2);
    }

    public C1412I() {
        this.f18039a = -1;
        this.f18040b = -1;
        this.f18041c = -1;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C1412I c1412i = (C1412I) obj;
        int i3 = this.f18039a - c1412i.f18039a;
        if (i3 != 0) {
            return i3;
        }
        int i10 = this.f18040b - c1412i.f18040b;
        return i10 == 0 ? this.f18041c - c1412i.f18041c : i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1412I.class == obj.getClass()) {
            C1412I c1412i = (C1412I) obj;
            if (this.f18039a == c1412i.f18039a && this.f18040b == c1412i.f18040b && this.f18041c == c1412i.f18041c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f18039a * 31) + this.f18040b) * 31) + this.f18041c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f18039a);
        String string2 = StubApp.getString2(1);
        sb2.append(string2);
        sb2.append(this.f18040b);
        sb2.append(string2);
        sb2.append(this.f18041c);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f18039a);
        parcel.writeInt(this.f18040b);
        parcel.writeInt(this.f18041c);
    }

    public C1412I(Parcel parcel) {
        this.f18039a = parcel.readInt();
        this.f18040b = parcel.readInt();
        this.f18041c = parcel.readInt();
    }
}
