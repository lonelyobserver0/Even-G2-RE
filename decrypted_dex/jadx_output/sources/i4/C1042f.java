package i4;

import S3.D;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.stub.StubApp;
import java.util.Arrays;
import kotlin.jvm.internal.LongCompanionObject;
import w.AbstractC1856e;

/* renamed from: i4.f, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1042f extends T3.a {
    public static final Parcelable.Creator<C1042f> CREATOR = new h1.n(23);

    /* renamed from: a, reason: collision with root package name */
    public final long f14766a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14767b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14768c;

    /* renamed from: d, reason: collision with root package name */
    public final long f14769d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14770e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14771f;

    /* renamed from: g, reason: collision with root package name */
    public final WorkSource f14772g;

    /* renamed from: h, reason: collision with root package name */
    public final f4.q f14773h;

    public C1042f(long j, int i3, int i10, long j3, boolean z2, int i11, WorkSource workSource, f4.q qVar) {
        this.f14766a = j;
        this.f14767b = i3;
        this.f14768c = i10;
        this.f14769d = j3;
        this.f14770e = z2;
        this.f14771f = i11;
        this.f14772g = workSource;
        this.f14773h = qVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1042f)) {
            return false;
        }
        C1042f c1042f = (C1042f) obj;
        return this.f14766a == c1042f.f14766a && this.f14767b == c1042f.f14767b && this.f14768c == c1042f.f14768c && this.f14769d == c1042f.f14769d && this.f14770e == c1042f.f14770e && this.f14771f == c1042f.f14771f && D.k(this.f14772g, c1042f.f14772g) && D.k(this.f14773h, c1042f.f14773h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f14766a), Integer.valueOf(this.f14767b), Integer.valueOf(this.f14768c), Long.valueOf(this.f14769d)});
    }

    public final String toString() {
        String string2;
        StringBuilder b2 = AbstractC1856e.b(StubApp.getString2(18502));
        b2.append(y.b(this.f14768c));
        long j = this.f14766a;
        if (j != LongCompanionObject.MAX_VALUE) {
            b2.append(StubApp.getString2(18503));
            f4.u.a(j, b2);
        }
        long j3 = this.f14769d;
        if (j3 != LongCompanionObject.MAX_VALUE) {
            b2.append(StubApp.getString2(5021));
            b2.append(j3);
            b2.append(StubApp.getString2(6642));
        }
        String string22 = StubApp.getString2(81);
        int i3 = this.f14767b;
        if (i3 != 0) {
            b2.append(string22);
            b2.append(y.c(i3));
        }
        if (this.f14770e) {
            b2.append(StubApp.getString2(12343));
        }
        int i10 = this.f14771f;
        if (i10 != 0) {
            b2.append(string22);
            if (i10 == 0) {
                string2 = StubApp.getString2(12341);
            } else if (i10 == 1) {
                string2 = StubApp.getString2(12340);
            } else {
                if (i10 != 2) {
                    throw new IllegalArgumentException();
                }
                string2 = StubApp.getString2(12339);
            }
            b2.append(string2);
        }
        WorkSource workSource = this.f14772g;
        if (!W3.d.b(workSource)) {
            b2.append(StubApp.getString2(18504));
            b2.append(workSource);
        }
        f4.q qVar = this.f14773h;
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
        parcel.writeLong(this.f14766a);
        a4.f.P(parcel, 2, 4);
        parcel.writeInt(this.f14767b);
        a4.f.P(parcel, 3, 4);
        parcel.writeInt(this.f14768c);
        a4.f.P(parcel, 4, 8);
        parcel.writeLong(this.f14769d);
        a4.f.P(parcel, 5, 4);
        parcel.writeInt(this.f14770e ? 1 : 0);
        a4.f.E(parcel, 6, this.f14772g, i3);
        a4.f.P(parcel, 7, 4);
        parcel.writeInt(this.f14771f);
        a4.f.E(parcel, 9, this.f14773h, i3);
        a4.f.N(parcel, I10);
    }
}
