package i4;

import S3.D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: i4.s, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1055s extends T3.a {
    public static final Parcelable.Creator<C1055s> CREATOR = new h1.n(15);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f14807a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14808b;

    public C1055s(int i3, ArrayList arrayList) {
        this.f14807a = arrayList;
        this.f14808b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1055s)) {
            return false;
        }
        C1055s c1055s = (C1055s) obj;
        return D.k(this.f14807a, c1055s.f14807a) && this.f14808b == c1055s.f14808b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14807a, Integer.valueOf(this.f14808b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        D.h(parcel);
        int I10 = a4.f.I(parcel, 20293);
        a4.f.H(parcel, 1, this.f14807a);
        a4.f.P(parcel, 2, 4);
        parcel.writeInt(this.f14808b);
        a4.f.N(parcel, I10);
    }
}
