package i4;

import S3.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;
import java.util.Arrays;

/* renamed from: i4.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1038b extends T3.a {
    public static final Parcelable.Creator<C1038b> CREATOR = new h1.n(19);

    /* renamed from: a, reason: collision with root package name */
    public final int f14754a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14755b;

    public C1038b(int i3, int i10) {
        this.f14754a = i3;
        this.f14755b = i10;
    }

    public static void d(int i3) {
        boolean z2 = false;
        if (i3 >= 0 && i3 <= 1) {
            z2 = true;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 30);
        sb2.append(StubApp.getString2(18486));
        sb2.append(i3);
        sb2.append(StubApp.getString2(18487));
        D.a(sb2.toString(), z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1038b)) {
            return false;
        }
        C1038b c1038b = (C1038b) obj;
        return this.f14754a == c1038b.f14754a && this.f14755b == c1038b.f14755b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f14754a), Integer.valueOf(this.f14755b)});
    }

    public final String toString() {
        int i3 = this.f14754a;
        int length = String.valueOf(i3).length();
        int i10 = this.f14755b;
        StringBuilder sb2 = new StringBuilder(length + 52 + String.valueOf(i10).length() + 1);
        sb2.append(StubApp.getString2(18488));
        sb2.append(i3);
        sb2.append(StubApp.getString2(18489));
        sb2.append(i10);
        sb2.append(StubApp.getString2(511));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        D.h(parcel);
        int I10 = a4.f.I(parcel, 20293);
        a4.f.P(parcel, 1, 4);
        parcel.writeInt(this.f14754a);
        a4.f.P(parcel, 2, 4);
        parcel.writeInt(this.f14755b);
        a4.f.N(parcel, I10);
    }
}
