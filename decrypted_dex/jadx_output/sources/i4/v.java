package i4;

import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;
import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class v extends T3.a {
    public static final Parcelable.Creator<v> CREATOR = new h1.n(14);

    /* renamed from: a, reason: collision with root package name */
    public final int f14813a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14814b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14815c;

    /* renamed from: d, reason: collision with root package name */
    public final long f14816d;

    public v(int i3, int i10, long j, long j3) {
        this.f14813a = i3;
        this.f14814b = i10;
        this.f14815c = j;
        this.f14816d = j3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            v vVar = (v) obj;
            if (this.f14813a == vVar.f14813a && this.f14814b == vVar.f14814b && this.f14815c == vVar.f14815c && this.f14816d == vVar.f14816d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f14814b), Integer.valueOf(this.f14813a), Long.valueOf(this.f14816d), Long.valueOf(this.f14815c)});
    }

    public final String toString() {
        int i3 = this.f14813a;
        int length = String.valueOf(i3).length();
        int i10 = this.f14814b;
        int length2 = String.valueOf(i10).length();
        long j = this.f14816d;
        int length3 = String.valueOf(j).length();
        long j3 = this.f14815c;
        StringBuilder sb2 = new StringBuilder(length + 50 + length2 + 18 + length3 + 17 + String.valueOf(j3).length());
        sb2.append(StubApp.getString2(18522));
        sb2.append(i3);
        sb2.append(StubApp.getString2(18523));
        sb2.append(i10);
        sb2.append(StubApp.getString2(18524));
        sb2.append(j);
        sb2.append(StubApp.getString2(18525));
        sb2.append(j3);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int I10 = a4.f.I(parcel, 20293);
        a4.f.P(parcel, 1, 4);
        parcel.writeInt(this.f14813a);
        a4.f.P(parcel, 2, 4);
        parcel.writeInt(this.f14814b);
        a4.f.P(parcel, 3, 8);
        parcel.writeLong(this.f14815c);
        a4.f.P(parcel, 4, 8);
        parcel.writeLong(this.f14816d);
        a4.f.N(parcel, I10);
    }
}
