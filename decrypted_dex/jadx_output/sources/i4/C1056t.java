package i4;

import S3.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;
import java.util.Arrays;
import w.AbstractC1856e;

/* renamed from: i4.t, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1056t extends T3.a {
    public static final Parcelable.Creator<C1056t> CREATOR = new h1.n(8);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14809a;

    /* renamed from: b, reason: collision with root package name */
    public final f4.q f14810b;

    public C1056t(boolean z2, f4.q qVar) {
        this.f14809a = z2;
        this.f14810b = qVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1056t)) {
            return false;
        }
        C1056t c1056t = (C1056t) obj;
        return this.f14809a == c1056t.f14809a && D.k(this.f14810b, c1056t.f14810b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f14809a)});
    }

    public final String toString() {
        StringBuilder b2 = AbstractC1856e.b(StubApp.getString2(18517));
        if (this.f14809a) {
            b2.append(StubApp.getString2(18518));
        }
        f4.q qVar = this.f14810b;
        if (qVar != null) {
            b2.append(StubApp.getString2(18519));
            b2.append(qVar);
            b2.append(StubApp.getString2(81));
        }
        b2.setLength(b2.length() - 2);
        b2.append(']');
        return b2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int I10 = a4.f.I(parcel, 20293);
        a4.f.P(parcel, 1, 4);
        parcel.writeInt(this.f14809a ? 1 : 0);
        a4.f.E(parcel, 2, this.f14810b, i3);
        a4.f.N(parcel, I10);
    }
}
