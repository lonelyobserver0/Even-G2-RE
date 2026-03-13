package i4;

import S3.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;
import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class w extends T3.a {
    public static final Parcelable.Creator<w> CREATOR = new h1.n(16);

    /* renamed from: a, reason: collision with root package name */
    public final int f14817a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14818b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14819c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14820d;

    public w(int i3, int i10, int i11, int i12) {
        D.j(StubApp.getString2(18526), i3 >= 0 && i3 <= 23);
        D.j(StubApp.getString2(18527), i10 >= 0 && i10 <= 59);
        D.j(StubApp.getString2(18528), i11 >= 0 && i11 <= 23);
        D.j(StubApp.getString2(18529), i12 >= 0 && i12 <= 59);
        D.j(StubApp.getString2(18530), ((i3 + i10) + i11) + i12 > 0);
        this.f14817a = i3;
        this.f14818b = i10;
        this.f14819c = i11;
        this.f14820d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f14817a == wVar.f14817a && this.f14818b == wVar.f14818b && this.f14819c == wVar.f14819c && this.f14820d == wVar.f14820d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f14817a), Integer.valueOf(this.f14818b), Integer.valueOf(this.f14819c), Integer.valueOf(this.f14820d)});
    }

    public final String toString() {
        int i3 = this.f14817a;
        int length = String.valueOf(i3).length();
        int i10 = this.f14818b;
        int length2 = String.valueOf(i10).length();
        int i11 = this.f14819c;
        int length3 = String.valueOf(i11).length();
        int i12 = this.f14820d;
        StringBuilder sb2 = new StringBuilder(length + 50 + length2 + 10 + length3 + 12 + String.valueOf(i12).length() + 1);
        sb2.append(StubApp.getString2(18531));
        sb2.append(i3);
        sb2.append(StubApp.getString2(18532));
        sb2.append(i10);
        sb2.append(StubApp.getString2(18533));
        sb2.append(i11);
        sb2.append(StubApp.getString2(18534));
        sb2.append(i12);
        sb2.append(StubApp.getString2(511));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        D.h(parcel);
        int I10 = a4.f.I(parcel, 20293);
        a4.f.P(parcel, 1, 4);
        parcel.writeInt(this.f14817a);
        a4.f.P(parcel, 2, 4);
        parcel.writeInt(this.f14818b);
        a4.f.P(parcel, 3, 4);
        parcel.writeInt(this.f14819c);
        a4.f.P(parcel, 4, 4);
        parcel.writeInt(this.f14820d);
        a4.f.N(parcel, I10);
    }
}
