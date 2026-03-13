package S3;

import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;

/* renamed from: S3.f, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0272f extends T3.a {
    public static final Parcelable.Creator<C0272f> CREATOR = new B0.s(8);

    /* renamed from: a, reason: collision with root package name */
    public final int f6513a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6514b;

    public C0272f(int i3, String str) {
        this.f6513a = i3;
        this.f6514b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0272f)) {
            return false;
        }
        C0272f c0272f = (C0272f) obj;
        return c0272f.f6513a == this.f6513a && D.k(c0272f.f6514b, this.f6514b);
    }

    public final int hashCode() {
        return this.f6513a;
    }

    public final String toString() {
        return this.f6513a + StubApp.getString2(478) + this.f6514b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int I10 = a4.f.I(parcel, 20293);
        a4.f.P(parcel, 1, 4);
        parcel.writeInt(this.f6513a);
        a4.f.F(parcel, 2, this.f6514b);
        a4.f.N(parcel, I10);
    }
}
