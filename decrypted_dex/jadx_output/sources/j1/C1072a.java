package j1;

import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;
import h1.n;
import r0.AbstractC1560u;

/* renamed from: j1.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1072a extends AbstractC1073b {
    public static final Parcelable.Creator<C1072a> CREATOR = new n(26);

    /* renamed from: a, reason: collision with root package name */
    public final long f15224a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15225b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f15226c;

    public C1072a(long j, byte[] bArr, long j3) {
        this.f15224a = j3;
        this.f15225b = j;
        this.f15226c = bArr;
    }

    @Override // j1.AbstractC1073b
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(18947));
        sb2.append(this.f15224a);
        sb2.append(StubApp.getString2(18948));
        return Xa.h.q(sb2, this.f15225b, StubApp.getString2(9385));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeLong(this.f15224a);
        parcel.writeLong(this.f15225b);
        parcel.writeByteArray(this.f15226c);
    }

    public C1072a(Parcel parcel) {
        this.f15224a = parcel.readLong();
        this.f15225b = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        int i3 = AbstractC1560u.f20190a;
        this.f15226c = createByteArray;
    }
}
