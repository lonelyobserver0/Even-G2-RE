package j1;

import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;
import r0.C1553n;

/* renamed from: j1.k, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1082k extends AbstractC1073b {
    public static final Parcelable.Creator<C1082k> CREATOR = new C1081j(0);

    /* renamed from: a, reason: collision with root package name */
    public final long f15259a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15260b;

    public C1082k(long j, long j3) {
        this.f15259a = j;
        this.f15260b = j3;
    }

    public static long d(long j, C1553n c1553n) {
        long u2 = c1553n.u();
        if ((128 & u2) != 0) {
            return 8589934591L & ((((u2 & 1) << 32) | c1553n.w()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // j1.AbstractC1073b
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(18952));
        sb2.append(this.f15259a);
        sb2.append(StubApp.getString2(18953));
        return Xa.h.q(sb2, this.f15260b, StubApp.getString2(9385));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeLong(this.f15259a);
        parcel.writeLong(this.f15260b);
    }
}
