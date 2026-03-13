package o0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.D1;
import com.stub.StubApp;
import j1.C1081j;
import java.util.Arrays;
import java.util.List;
import r0.AbstractC1560u;

/* renamed from: o0.A, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1404A implements Parcelable {
    public static final Parcelable.Creator<C1404A> CREATOR = new C1081j(19);

    /* renamed from: a, reason: collision with root package name */
    public final z[] f18017a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18018b;

    public C1404A(z... zVarArr) {
        this(-9223372036854775807L, zVarArr);
    }

    public final C1404A d(z... zVarArr) {
        if (zVarArr.length == 0) {
            return this;
        }
        int i3 = AbstractC1560u.f20190a;
        z[] zVarArr2 = this.f18017a;
        Object[] copyOf = Arrays.copyOf(zVarArr2, zVarArr2.length + zVarArr.length);
        System.arraycopy(zVarArr, 0, copyOf, zVarArr2.length, zVarArr.length);
        return new C1404A(this.f18018b, (z[]) copyOf);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final C1404A e(C1404A c1404a) {
        return c1404a == null ? this : d(c1404a.f18017a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1404A.class == obj.getClass()) {
            C1404A c1404a = (C1404A) obj;
            if (Arrays.equals(this.f18017a, c1404a.f18017a) && this.f18018b == c1404a.f18018b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return D1.o(this.f18018b) + (Arrays.hashCode(this.f18017a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(21489));
        sb2.append(Arrays.toString(this.f18017a));
        long j = this.f18018b;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = StubApp.getString2(21490) + j;
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        z[] zVarArr = this.f18017a;
        parcel.writeInt(zVarArr.length);
        for (z zVar : zVarArr) {
            parcel.writeParcelable(zVar, 0);
        }
        parcel.writeLong(this.f18018b);
    }

    public C1404A(long j, z... zVarArr) {
        this.f18018b = j;
        this.f18017a = zVarArr;
    }

    public C1404A(List list) {
        this((z[]) list.toArray(new z[0]));
    }

    public C1404A(Parcel parcel) {
        this.f18017a = new z[parcel.readInt()];
        int i3 = 0;
        while (true) {
            z[] zVarArr = this.f18017a;
            if (i3 < zVarArr.length) {
                zVarArr[i3] = (z) parcel.readParcelable(z.class.getClassLoader());
                i3++;
            } else {
                this.f18018b = parcel.readLong();
                return;
            }
        }
    }
}
