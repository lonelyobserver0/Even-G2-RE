package s0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.D1;
import com.stub.StubApp;
import j1.C1081j;
import o0.z;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class e implements z {
    public static final Parcelable.Creator<e> CREATOR = new C1081j(27);

    /* renamed from: a, reason: collision with root package name */
    public final long f20597a;

    /* renamed from: b, reason: collision with root package name */
    public final long f20598b;

    /* renamed from: c, reason: collision with root package name */
    public final long f20599c;

    public e(long j, long j3, long j10) {
        this.f20597a = j;
        this.f20598b = j3;
        this.f20599c = j10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f20597a == eVar.f20597a && this.f20598b == eVar.f20598b && this.f20599c == eVar.f20599c;
    }

    public final int hashCode() {
        return D1.o(this.f20599c) + ((D1.o(this.f20598b) + ((D1.o(this.f20597a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return StubApp.getString2(23029) + this.f20597a + StubApp.getString2(23030) + this.f20598b + StubApp.getString2(23031) + this.f20599c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeLong(this.f20597a);
        parcel.writeLong(this.f20598b);
        parcel.writeLong(this.f20599c);
    }

    public e(Parcel parcel) {
        this.f20597a = parcel.readLong();
        this.f20598b = parcel.readLong();
        this.f20599c = parcel.readLong();
    }
}
