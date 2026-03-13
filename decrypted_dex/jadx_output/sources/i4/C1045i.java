package i4;

import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;
import java.util.Arrays;

/* renamed from: i4.i, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1045i extends T3.a {
    public static final Parcelable.Creator<C1045i> CREATOR = new h1.n(25);

    /* renamed from: a, reason: collision with root package name */
    public final long f14776a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14777b;

    public C1045i(long j, boolean z2) {
        this.f14776a = j;
        this.f14777b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1045i)) {
            return false;
        }
        C1045i c1045i = (C1045i) obj;
        return this.f14776a == c1045i.f14776a && this.f14777b == c1045i.f14777b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f14776a), Boolean.valueOf(this.f14777b)});
    }

    public final String toString() {
        long j = this.f14776a;
        int length = String.valueOf(j).length();
        String string2 = true != this.f14777b ? "" : StubApp.getString2(18511);
        StringBuilder sb2 = new StringBuilder(string2.length() + length + 46 + 1);
        sb2.append(StubApp.getString2(18512));
        sb2.append(j);
        sb2.append(string2);
        sb2.append(StubApp.getString2(511));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int I10 = a4.f.I(parcel, 20293);
        a4.f.P(parcel, 2, 8);
        parcel.writeLong(this.f14776a);
        a4.f.P(parcel, 6, 4);
        parcel.writeInt(this.f14777b ? 1 : 0);
        a4.f.N(parcel, I10);
    }
}
