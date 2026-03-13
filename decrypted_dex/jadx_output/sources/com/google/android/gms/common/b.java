package com.google.android.gms.common;

import S3.D;
import Z9.C;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;
import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b extends T3.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f11175a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11176b;

    /* renamed from: c, reason: collision with root package name */
    public final PendingIntent f11177c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11178d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f11174e = new b(0);
    public static final Parcelable.Creator<b> CREATOR = new n(0);

    public b(int i3, int i10, PendingIntent pendingIntent, String str) {
        this.f11175a = i3;
        this.f11176b = i10;
        this.f11177c = pendingIntent;
        this.f11178d = str;
    }

    public static String f(int i3) {
        if (i3 == 99) {
            return StubApp.getString2(11494);
        }
        if (i3 == 1500) {
            return StubApp.getString2(11493);
        }
        switch (i3) {
            case -1:
                return StubApp.getString2(343);
            case 0:
                return StubApp.getString2(5759);
            case 1:
                return StubApp.getString2(11492);
            case 2:
                return StubApp.getString2(11476);
            case 3:
                return StubApp.getString2(11475);
            case 4:
                return StubApp.getString2(11474);
            case 5:
                return StubApp.getString2(11473);
            case 6:
                return StubApp.getString2(11472);
            case 7:
                return StubApp.getString2(7521);
            case 8:
                return StubApp.getString2(11471);
            case 9:
                return StubApp.getString2(11491);
            case 10:
                return StubApp.getString2(11470);
            case 11:
                return StubApp.getString2(11490);
            default:
                switch (i3) {
                    case 13:
                        return StubApp.getString2(5767);
                    case 14:
                        return StubApp.getString2(3469);
                    case 15:
                        return StubApp.getString2(11469);
                    case 16:
                        return StubApp.getString2(11489);
                    case 17:
                        return StubApp.getString2(11488);
                    case 18:
                        return StubApp.getString2(11487);
                    case 19:
                        return StubApp.getString2(11486);
                    case 20:
                        return StubApp.getString2(11485);
                    case 21:
                        return StubApp.getString2(11484);
                    case 22:
                        return StubApp.getString2(11483);
                    case 23:
                        return StubApp.getString2(11482);
                    case 24:
                        return StubApp.getString2(11481);
                    case 25:
                        return StubApp.getString2(11480);
                    default:
                        return Xa.h.g(i3, StubApp.getString2(11479), StubApp.getString2(74));
                }
        }
    }

    public final boolean d() {
        return this.f11176b == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f11176b == bVar.f11176b && D.k(this.f11177c, bVar.f11177c) && D.k(this.f11178d, bVar.f11178d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11176b), this.f11177c, this.f11178d});
    }

    public final String toString() {
        C c10 = new C(this);
        c10.a(f(this.f11176b), StubApp.getString2(11478));
        c10.a(this.f11177c, StubApp.getString2(11453));
        c10.a(this.f11178d, StubApp.getString2(1905));
        return c10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int I10 = a4.f.I(parcel, 20293);
        a4.f.P(parcel, 1, 4);
        parcel.writeInt(this.f11175a);
        a4.f.P(parcel, 2, 4);
        parcel.writeInt(this.f11176b);
        a4.f.E(parcel, 3, this.f11177c, i3);
        a4.f.F(parcel, 4, this.f11178d);
        a4.f.N(parcel, I10);
    }

    public b(int i3) {
        this(1, i3, null, null);
    }

    public b(int i3, PendingIntent pendingIntent) {
        this(1, i3, pendingIntent, null);
    }
}
