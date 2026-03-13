package f1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.l;
import com.stub.StubApp;
import i2.u;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import o0.AbstractC1405B;
import o0.x;
import o0.z;
import r0.AbstractC1560u;
import r0.C1553n;

/* renamed from: f1.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0870a implements z {
    public static final Parcelable.Creator<C0870a> CREATOR = new l(11);

    /* renamed from: a, reason: collision with root package name */
    public final int f13705a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13706b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13707c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13708d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13709e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13710f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13711g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f13712h;

    public C0870a(int i3, String str, String str2, int i10, int i11, int i12, int i13, byte[] bArr) {
        this.f13705a = i3;
        this.f13706b = str;
        this.f13707c = str2;
        this.f13708d = i10;
        this.f13709e = i11;
        this.f13710f = i12;
        this.f13711g = i13;
        this.f13712h = bArr;
    }

    public static C0870a d(C1553n c1553n) {
        int h2 = c1553n.h();
        String m4 = AbstractC1405B.m(c1553n.s(c1553n.h(), StandardCharsets.US_ASCII));
        String s10 = c1553n.s(c1553n.h(), StandardCharsets.UTF_8);
        int h4 = c1553n.h();
        int h5 = c1553n.h();
        int h9 = c1553n.h();
        int h10 = c1553n.h();
        int h11 = c1553n.h();
        byte[] bArr = new byte[h11];
        c1553n.f(0, h11, bArr);
        return new C0870a(h2, m4, s10, h4, h5, h9, h10, bArr);
    }

    @Override // o0.z
    public final void b(x xVar) {
        xVar.a(this.f13705a, this.f13712h);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0870a.class == obj.getClass()) {
            C0870a c0870a = (C0870a) obj;
            if (this.f13705a == c0870a.f13705a && this.f13706b.equals(c0870a.f13706b) && this.f13707c.equals(c0870a.f13707c) && this.f13708d == c0870a.f13708d && this.f13709e == c0870a.f13709e && this.f13710f == c0870a.f13710f && this.f13711g == c0870a.f13711g && Arrays.equals(this.f13712h, c0870a.f13712h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f13712h) + ((((((((u.d(u.d((527 + this.f13705a) * 31, 31, this.f13706b), 31, this.f13707c) + this.f13708d) * 31) + this.f13709e) * 31) + this.f13710f) * 31) + this.f13711g) * 31);
    }

    public final String toString() {
        return StubApp.getString2(17399) + this.f13706b + StubApp.getString2(7300) + this.f13707c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f13705a);
        parcel.writeString(this.f13706b);
        parcel.writeString(this.f13707c);
        parcel.writeInt(this.f13708d);
        parcel.writeInt(this.f13709e);
        parcel.writeInt(this.f13710f);
        parcel.writeInt(this.f13711g);
        parcel.writeByteArray(this.f13712h);
    }

    public C0870a(Parcel parcel) {
        this.f13705a = parcel.readInt();
        String readString = parcel.readString();
        int i3 = AbstractC1560u.f20190a;
        this.f13706b = readString;
        this.f13707c = parcel.readString();
        this.f13708d = parcel.readInt();
        this.f13709e = parcel.readInt();
        this.f13710f = parcel.readInt();
        this.f13711g = parcel.readInt();
        this.f13712h = parcel.createByteArray();
    }
}
