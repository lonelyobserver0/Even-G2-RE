package i1;

import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;
import h1.n;
import java.util.Arrays;
import java.util.Locale;
import r0.AbstractC1550k;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new n(4);

    /* renamed from: a, reason: collision with root package name */
    public final long f14709a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14710b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14711c;

    public b(long j, int i3, long j3) {
        AbstractC1550k.c(j < j3);
        this.f14709a = j;
        this.f14710b = j3;
        this.f14711c = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f14709a == bVar.f14709a && this.f14710b == bVar.f14710b && this.f14711c == bVar.f14711c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f14709a), Long.valueOf(this.f14710b), Integer.valueOf(this.f14711c)});
    }

    public final String toString() {
        int i3 = AbstractC1560u.f20190a;
        Locale locale = Locale.US;
        return StubApp.getString2(18455) + this.f14709a + StubApp.getString2(18456) + this.f14710b + StubApp.getString2(18457) + this.f14711c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeLong(this.f14709a);
        parcel.writeLong(this.f14710b);
        parcel.writeInt(this.f14711c);
    }
}
