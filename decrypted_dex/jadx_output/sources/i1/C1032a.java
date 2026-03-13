package i1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.D1;
import com.stub.StubApp;
import h1.n;
import o0.z;

/* renamed from: i1.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1032a implements z {
    public static final Parcelable.Creator<C1032a> CREATOR = new n(2);

    /* renamed from: a, reason: collision with root package name */
    public final long f14704a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14705b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14706c;

    /* renamed from: d, reason: collision with root package name */
    public final long f14707d;

    /* renamed from: e, reason: collision with root package name */
    public final long f14708e;

    public C1032a(long j, long j3, long j10, long j11, long j12) {
        this.f14704a = j;
        this.f14705b = j3;
        this.f14706c = j10;
        this.f14707d = j11;
        this.f14708e = j12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1032a.class == obj.getClass()) {
            C1032a c1032a = (C1032a) obj;
            if (this.f14704a == c1032a.f14704a && this.f14705b == c1032a.f14705b && this.f14706c == c1032a.f14706c && this.f14707d == c1032a.f14707d && this.f14708e == c1032a.f14708e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return D1.o(this.f14708e) + ((D1.o(this.f14707d) + ((D1.o(this.f14706c) + ((D1.o(this.f14705b) + ((D1.o(this.f14704a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return StubApp.getString2(18450) + this.f14704a + StubApp.getString2(18451) + this.f14705b + StubApp.getString2(18452) + this.f14706c + StubApp.getString2(18453) + this.f14707d + StubApp.getString2(18454) + this.f14708e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeLong(this.f14704a);
        parcel.writeLong(this.f14705b);
        parcel.writeLong(this.f14706c);
        parcel.writeLong(this.f14707d);
        parcel.writeLong(this.f14708e);
    }

    public C1032a(Parcel parcel) {
        this.f14704a = parcel.readLong();
        this.f14705b = parcel.readLong();
        this.f14706c = parcel.readLong();
        this.f14707d = parcel.readLong();
        this.f14708e = parcel.readLong();
    }
}
