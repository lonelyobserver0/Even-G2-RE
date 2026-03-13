package com.google.android.gms.common.api;

import B0.s;
import S3.D;
import T3.a;
import Z9.C;
import a4.f;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.stub.StubApp;
import i2.u;
import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class Status extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new s(7);

    /* renamed from: a, reason: collision with root package name */
    public final int f11170a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11171b;

    /* renamed from: c, reason: collision with root package name */
    public final PendingIntent f11172c;

    /* renamed from: d, reason: collision with root package name */
    public final b f11173d;

    public Status(int i3, String str, PendingIntent pendingIntent, b bVar) {
        this.f11170a = i3;
        this.f11171b = str;
        this.f11172c = pendingIntent;
        this.f11173d = bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f11170a == status.f11170a && D.k(this.f11171b, status.f11171b) && D.k(this.f11172c, status.f11172c) && D.k(this.f11173d, status.f11173d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11170a), this.f11171b, this.f11172c, this.f11173d});
    }

    public final String toString() {
        C c10 = new C(this);
        String str = this.f11171b;
        if (str == null) {
            int i3 = this.f11170a;
            switch (i3) {
                case -1:
                    str = StubApp.getString2(11477);
                    break;
                case 0:
                    str = StubApp.getString2(5759);
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    str = u.p(i3, StubApp.getString2(11462));
                    break;
                case 2:
                    str = StubApp.getString2(11476);
                    break;
                case 3:
                    str = StubApp.getString2(11475);
                    break;
                case 4:
                    str = StubApp.getString2(11474);
                    break;
                case 5:
                    str = StubApp.getString2(11473);
                    break;
                case 6:
                    str = StubApp.getString2(11472);
                    break;
                case 7:
                    str = StubApp.getString2(7521);
                    break;
                case 8:
                    str = StubApp.getString2(11471);
                    break;
                case 10:
                    str = StubApp.getString2(11470);
                    break;
                case 13:
                    str = StubApp.getString2(3789);
                    break;
                case 14:
                    str = StubApp.getString2(11469);
                    break;
                case 15:
                    str = StubApp.getString2(3469);
                    break;
                case 16:
                    str = StubApp.getString2(5767);
                    break;
                case 17:
                    str = StubApp.getString2(11468);
                    break;
                case 18:
                    str = StubApp.getString2(11467);
                    break;
                case 19:
                    str = StubApp.getString2(11466);
                    break;
                case 20:
                    str = StubApp.getString2(11465);
                    break;
                case 21:
                    str = StubApp.getString2(11464);
                    break;
                case 22:
                    str = StubApp.getString2(11463);
                    break;
            }
        }
        c10.a(str, StubApp.getString2(11478));
        c10.a(this.f11172c, StubApp.getString2(11453));
        return c10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int I10 = f.I(parcel, 20293);
        f.P(parcel, 1, 4);
        parcel.writeInt(this.f11170a);
        f.F(parcel, 2, this.f11171b);
        f.E(parcel, 3, this.f11172c, i3);
        f.E(parcel, 4, this.f11173d, i3);
        f.N(parcel, I10);
    }
}
