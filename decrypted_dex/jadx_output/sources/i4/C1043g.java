package i4;

import S3.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;
import java.util.Arrays;

/* renamed from: i4.g, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1043g extends T3.a {
    public static final Parcelable.Creator<C1043g> CREATOR = new h1.n(24);

    /* renamed from: a, reason: collision with root package name */
    public final int f14774a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14775b;

    public C1043g(int i3, int i10) {
        this.f14774a = i3;
        this.f14775b = i10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1043g) {
            C1043g c1043g = (C1043g) obj;
            if (this.f14774a == c1043g.f14774a && this.f14775b == c1043g.f14775b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f14774a), Integer.valueOf(this.f14775b)});
    }

    public final String toString() {
        int i3 = this.f14774a;
        if (i3 > 22 || i3 < 0) {
            i3 = 4;
        }
        String num = i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? i3 != 5 ? i3 != 7 ? i3 != 8 ? i3 != 16 ? i3 != 17 ? Integer.toString(i3) : StubApp.getString2(18505) : StubApp.getString2(18506) : StubApp.getString2(5273) : StubApp.getString2(7084) : StubApp.getString2(18507) : StubApp.getString2(343) : StubApp.getString2(18508) : StubApp.getString2(13400) : StubApp.getString2(18509) : StubApp.getString2(13395);
        int length = String.valueOf(num).length();
        int i10 = this.f14775b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + length + 36 + 1);
        sb2.append(StubApp.getString2(18510));
        sb2.append(num);
        sb2.append(StubApp.getString2(2301));
        sb2.append(i10);
        sb2.append(StubApp.getString2(511));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        D.h(parcel);
        int I10 = a4.f.I(parcel, 20293);
        a4.f.P(parcel, 1, 4);
        parcel.writeInt(this.f14774a);
        a4.f.P(parcel, 2, 4);
        parcel.writeInt(this.f14775b);
        a4.f.N(parcel, I10);
    }
}
