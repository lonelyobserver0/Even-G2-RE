package i4;

import S3.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;
import java.util.Arrays;
import kotlin.jvm.internal.LongCompanionObject;
import w.AbstractC1856e;

/* renamed from: i4.j, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1046j extends T3.a {
    public static final Parcelable.Creator<C1046j> CREATOR = new h1.n(6);

    /* renamed from: a, reason: collision with root package name */
    public final long f14778a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14779b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14780c;

    /* renamed from: d, reason: collision with root package name */
    public final f4.q f14781d;

    public C1046j(long j, int i3, boolean z2, f4.q qVar) {
        this.f14778a = j;
        this.f14779b = i3;
        this.f14780c = z2;
        this.f14781d = qVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1046j)) {
            return false;
        }
        C1046j c1046j = (C1046j) obj;
        return this.f14778a == c1046j.f14778a && this.f14779b == c1046j.f14779b && this.f14780c == c1046j.f14780c && D.k(this.f14781d, c1046j.f14781d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f14778a), Integer.valueOf(this.f14779b), Boolean.valueOf(this.f14780c)});
    }

    public final String toString() {
        StringBuilder b2 = AbstractC1856e.b(StubApp.getString2(18513));
        long j = this.f14778a;
        if (j != LongCompanionObject.MAX_VALUE) {
            b2.append(StubApp.getString2(18514));
            f4.u.a(j, b2);
        }
        int i3 = this.f14779b;
        if (i3 != 0) {
            b2.append(StubApp.getString2(81));
            b2.append(y.c(i3));
        }
        if (this.f14780c) {
            b2.append(StubApp.getString2(12343));
        }
        f4.q qVar = this.f14781d;
        if (qVar != null) {
            b2.append(StubApp.getString2(12344));
            b2.append(qVar);
        }
        b2.append(']');
        return b2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int I10 = a4.f.I(parcel, 20293);
        a4.f.P(parcel, 1, 8);
        parcel.writeLong(this.f14778a);
        a4.f.P(parcel, 2, 4);
        parcel.writeInt(this.f14779b);
        a4.f.P(parcel, 3, 4);
        parcel.writeInt(this.f14780c ? 1 : 0);
        a4.f.E(parcel, 5, this.f14781d, i3);
        a4.f.N(parcel, I10);
    }
}
