package e1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.l;
import com.stub.StubApp;
import java.util.Arrays;
import java.util.Objects;
import o0.AbstractC1405B;
import o0.C1437l;
import o0.C1438m;
import o0.z;
import r0.AbstractC1560u;

/* renamed from: e1.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0836a implements z {
    public static final Parcelable.Creator<C0836a> CREATOR;

    /* renamed from: g, reason: collision with root package name */
    public static final C1438m f13572g;

    /* renamed from: h, reason: collision with root package name */
    public static final C1438m f13573h;

    /* renamed from: a, reason: collision with root package name */
    public final String f13574a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13575b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13576c;

    /* renamed from: d, reason: collision with root package name */
    public final long f13577d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f13578e;

    /* renamed from: f, reason: collision with root package name */
    public int f13579f;

    static {
        C1437l c1437l = new C1437l();
        c1437l.f18177m = AbstractC1405B.m(StubApp.getString2(474));
        f13572g = new C1438m(c1437l);
        C1437l c1437l2 = new C1437l();
        c1437l2.f18177m = AbstractC1405B.m(StubApp.getString2(2004));
        f13573h = new C1438m(c1437l2);
        CREATOR = new l(8);
    }

    public C0836a(String str, String str2, long j, long j3, byte[] bArr) {
        this.f13574a = str;
        this.f13575b = str2;
        this.f13576c = j;
        this.f13577d = j3;
        this.f13578e = bArr;
    }

    @Override // o0.z
    public final C1438m a() {
        String str = this.f13574a;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals(StubApp.getString2(17260))) {
                    c10 = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals(StubApp.getString2(17259))) {
                    c10 = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals(StubApp.getString2(17258))) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return f13573h;
            case 1:
            case 2:
                return f13572g;
            default:
                return null;
        }
    }

    @Override // o0.z
    public final byte[] c() {
        if (a() != null) {
            return this.f13578e;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0836a.class == obj.getClass()) {
            C0836a c0836a = (C0836a) obj;
            if (this.f13576c == c0836a.f13576c && this.f13577d == c0836a.f13577d) {
                int i3 = AbstractC1560u.f20190a;
                if (Objects.equals(this.f13574a, c0836a.f13574a) && Objects.equals(this.f13575b, c0836a.f13575b) && Arrays.equals(this.f13578e, c0836a.f13578e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f13579f == 0) {
            String str = this.f13574a;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f13575b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j = this.f13576c;
            int i3 = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j3 = this.f13577d;
            this.f13579f = Arrays.hashCode(this.f13578e) + ((i3 + ((int) (j3 ^ (j3 >>> 32)))) * 31);
        }
        return this.f13579f;
    }

    public final String toString() {
        return StubApp.getString2(17261) + this.f13574a + StubApp.getString2(2296) + this.f13577d + StubApp.getString2(17262) + this.f13576c + StubApp.getString2(12722) + this.f13575b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f13574a);
        parcel.writeString(this.f13575b);
        parcel.writeLong(this.f13576c);
        parcel.writeLong(this.f13577d);
        parcel.writeByteArray(this.f13578e);
    }

    public C0836a(Parcel parcel) {
        String readString = parcel.readString();
        int i3 = AbstractC1560u.f20190a;
        this.f13574a = readString;
        this.f13575b = parcel.readString();
        this.f13576c = parcel.readLong();
        this.f13577d = parcel.readLong();
        this.f13578e = parcel.createByteArray();
    }
}
