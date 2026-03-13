package com.google.android.gms.location;

import S3.D;
import T3.a;
import W3.d;
import a4.f;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.stub.StubApp;
import f4.q;
import f4.u;
import h1.n;
import i4.y;
import java.util.Arrays;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class LocationRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new n(9);

    /* renamed from: a, reason: collision with root package name */
    public int f11784a;

    /* renamed from: b, reason: collision with root package name */
    public long f11785b;

    /* renamed from: c, reason: collision with root package name */
    public long f11786c;

    /* renamed from: d, reason: collision with root package name */
    public long f11787d;

    /* renamed from: e, reason: collision with root package name */
    public final long f11788e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11789f;

    /* renamed from: g, reason: collision with root package name */
    public float f11790g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f11791h;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public final int f11792k;

    /* renamed from: l, reason: collision with root package name */
    public final int f11793l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f11794m;

    /* renamed from: n, reason: collision with root package name */
    public final WorkSource f11795n;

    /* renamed from: p, reason: collision with root package name */
    public final q f11796p;

    public LocationRequest(int i3, long j, long j3, long j10, long j11, long j12, int i10, float f10, boolean z2, long j13, int i11, int i12, boolean z10, WorkSource workSource, q qVar) {
        this.f11784a = i3;
        if (i3 == 105) {
            this.f11785b = LongCompanionObject.MAX_VALUE;
        } else {
            this.f11785b = j;
        }
        this.f11786c = j3;
        this.f11787d = j10;
        this.f11788e = j11 == LongCompanionObject.MAX_VALUE ? j12 : Math.min(Math.max(1L, j11 - SystemClock.elapsedRealtime()), j12);
        this.f11789f = i10;
        this.f11790g = f10;
        this.f11791h = z2;
        this.j = j13 != -1 ? j13 : j;
        this.f11792k = i11;
        this.f11793l = i12;
        this.f11794m = z10;
        this.f11795n = workSource;
        this.f11796p = qVar;
    }

    public static LocationRequest d() {
        return new LocationRequest(102, 3600000L, 600000L, 0L, LongCompanionObject.MAX_VALUE, LongCompanionObject.MAX_VALUE, IntCompanionObject.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, false, new WorkSource(), null);
    }

    public static String j(long j) {
        String sb2;
        if (j == LongCompanionObject.MAX_VALUE) {
            return StubApp.getString2(12335);
        }
        StringBuilder sb3 = u.f13785b;
        synchronized (sb3) {
            sb3.setLength(0);
            u.a(j, sb3);
            sb2 = sb3.toString();
        }
        return sb2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        int i3 = this.f11784a;
        if (i3 != locationRequest.f11784a) {
            return false;
        }
        if ((i3 == 105 || this.f11785b == locationRequest.f11785b) && this.f11786c == locationRequest.f11786c && f() == locationRequest.f()) {
            return (!f() || this.f11787d == locationRequest.f11787d) && this.f11788e == locationRequest.f11788e && this.f11789f == locationRequest.f11789f && this.f11790g == locationRequest.f11790g && this.f11791h == locationRequest.f11791h && this.f11792k == locationRequest.f11792k && this.f11793l == locationRequest.f11793l && this.f11794m == locationRequest.f11794m && this.f11795n.equals(locationRequest.f11795n) && D.k(this.f11796p, locationRequest.f11796p);
        }
        return false;
    }

    public final boolean f() {
        long j = this.f11787d;
        return j > 0 && (j >> 1) >= this.f11785b;
    }

    public final void g(long j) {
        D.a(StubApp.getString2(1075), j >= 0);
        long j3 = this.f11786c;
        long j10 = this.f11785b;
        if (j3 == j10 / 6) {
            this.f11786c = j / 6;
        }
        if (this.j == j10) {
            this.j = j;
        }
        this.f11785b = j;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11784a), Long.valueOf(this.f11785b), Long.valueOf(this.f11786c), this.f11795n});
    }

    public final void i(float f10) {
        if (f10 >= 0.0f) {
            this.f11790g = f10;
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(f10).length() + 22);
        sb2.append(StubApp.getString2(12336));
        sb2.append(f10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public final String toString() {
        String string2;
        StringBuilder b2 = AbstractC1856e.b(StubApp.getString2(2766));
        int i3 = this.f11784a;
        boolean z2 = i3 == 105;
        String string22 = StubApp.getString2(601);
        if (z2) {
            b2.append(y.b(i3));
            if (this.f11787d > 0) {
                b2.append(string22);
                u.a(this.f11787d, b2);
            }
        } else {
            b2.append(StubApp.getString2(893));
            if (f()) {
                u.a(this.f11785b, b2);
                b2.append(string22);
                u.a(this.f11787d, b2);
            } else {
                u.a(this.f11785b, b2);
            }
            b2.append(StubApp.getString2(397));
            b2.append(y.b(this.f11784a));
        }
        if (this.f11784a == 105 || this.f11786c != this.f11785b) {
            b2.append(StubApp.getString2(2771));
            b2.append(j(this.f11786c));
        }
        if (this.f11790g > 0.0d) {
            b2.append(StubApp.getString2(2772));
            b2.append(this.f11790g);
        }
        if (!(this.f11784a == 105) ? this.j != this.f11785b : this.j != LongCompanionObject.MAX_VALUE) {
            b2.append(StubApp.getString2(12337));
            b2.append(j(this.j));
        }
        long j = this.f11788e;
        if (j != LongCompanionObject.MAX_VALUE) {
            b2.append(StubApp.getString2(5021));
            u.a(j, b2);
        }
        int i10 = this.f11789f;
        if (i10 != Integer.MAX_VALUE) {
            b2.append(StubApp.getString2(12338));
            b2.append(i10);
        }
        int i11 = this.f11793l;
        String string23 = StubApp.getString2(81);
        if (i11 != 0) {
            b2.append(string23);
            if (i11 == 0) {
                string2 = StubApp.getString2(12341);
            } else if (i11 == 1) {
                string2 = StubApp.getString2(12340);
            } else {
                if (i11 != 2) {
                    throw new IllegalArgumentException();
                }
                string2 = StubApp.getString2(12339);
            }
            b2.append(string2);
        }
        int i12 = this.f11792k;
        if (i12 != 0) {
            b2.append(string23);
            b2.append(y.c(i12));
        }
        if (this.f11791h) {
            b2.append(StubApp.getString2(12342));
        }
        if (this.f11794m) {
            b2.append(StubApp.getString2(12343));
        }
        WorkSource workSource = this.f11795n;
        if (!d.b(workSource)) {
            b2.append(string23);
            b2.append(workSource);
        }
        q qVar = this.f11796p;
        if (qVar != null) {
            b2.append(StubApp.getString2(12344));
            b2.append(qVar);
        }
        b2.append(']');
        return b2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int I10 = f.I(parcel, 20293);
        int i10 = this.f11784a;
        f.P(parcel, 1, 4);
        parcel.writeInt(i10);
        long j = this.f11785b;
        f.P(parcel, 2, 8);
        parcel.writeLong(j);
        long j3 = this.f11786c;
        f.P(parcel, 3, 8);
        parcel.writeLong(j3);
        f.P(parcel, 6, 4);
        parcel.writeInt(this.f11789f);
        float f10 = this.f11790g;
        f.P(parcel, 7, 4);
        parcel.writeFloat(f10);
        long j10 = this.f11787d;
        f.P(parcel, 8, 8);
        parcel.writeLong(j10);
        f.P(parcel, 9, 4);
        parcel.writeInt(this.f11791h ? 1 : 0);
        f.P(parcel, 10, 8);
        parcel.writeLong(this.f11788e);
        long j11 = this.j;
        f.P(parcel, 11, 8);
        parcel.writeLong(j11);
        f.P(parcel, 12, 4);
        parcel.writeInt(this.f11792k);
        f.P(parcel, 13, 4);
        parcel.writeInt(this.f11793l);
        f.P(parcel, 15, 4);
        parcel.writeInt(this.f11794m ? 1 : 0);
        f.E(parcel, 16, this.f11795n, i3);
        f.E(parcel, 17, this.f11796p, i3);
        f.N(parcel, I10);
    }
}
