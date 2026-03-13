package i4;

import S3.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;
import java.util.Arrays;

/* renamed from: i4.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1039c extends T3.a {
    public static final Parcelable.Creator<C1039c> CREATOR = new h1.n(20);

    /* renamed from: a, reason: collision with root package name */
    public final int f14756a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14757b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14758c;

    public C1039c(int i3, int i10, long j) {
        C1038b.d(i10);
        this.f14756a = i3;
        this.f14757b = i10;
        this.f14758c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1039c)) {
            return false;
        }
        C1039c c1039c = (C1039c) obj;
        return this.f14756a == c1039c.f14756a && this.f14757b == c1039c.f14757b && this.f14758c == c1039c.f14758c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f14756a), Integer.valueOf(this.f14757b), Long.valueOf(this.f14758c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i3 = this.f14756a;
        StringBuilder sb3 = new StringBuilder(String.valueOf(i3).length() + 13);
        sb3.append(StubApp.getString2(18490));
        sb3.append(i3);
        sb2.append(sb3.toString());
        String string2 = StubApp.getString2(397);
        sb2.append(string2);
        int i10 = this.f14757b;
        StringBuilder sb4 = new StringBuilder(String.valueOf(i10).length() + 15);
        sb4.append(StubApp.getString2(18491));
        sb4.append(i10);
        sb2.append(sb4.toString());
        sb2.append(string2);
        long j = this.f14758c;
        StringBuilder sb5 = new StringBuilder(String.valueOf(j).length() + 21);
        sb5.append(StubApp.getString2(18492));
        sb5.append(j);
        sb2.append(sb5.toString());
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        D.h(parcel);
        int I10 = a4.f.I(parcel, 20293);
        a4.f.P(parcel, 1, 4);
        parcel.writeInt(this.f14756a);
        a4.f.P(parcel, 2, 4);
        parcel.writeInt(this.f14757b);
        a4.f.P(parcel, 3, 8);
        parcel.writeLong(this.f14758c);
        a4.f.N(parcel, I10);
    }
}
