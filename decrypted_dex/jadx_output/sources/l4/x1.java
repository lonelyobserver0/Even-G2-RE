package l4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j1.C1081j;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class x1 extends T3.a {
    public static final Parcelable.Creator<x1> CREATOR = new C1081j(9);

    /* renamed from: a, reason: collision with root package name */
    public final long f16659a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f16660b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16661c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f16662d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16663e;

    /* renamed from: f, reason: collision with root package name */
    public final long f16664f;

    /* renamed from: g, reason: collision with root package name */
    public String f16665g;

    public x1(long j, byte[] bArr, String str, Bundle bundle, int i3, long j3, String str2) {
        this.f16659a = j;
        this.f16660b = bArr;
        this.f16661c = str;
        this.f16662d = bundle;
        this.f16663e = i3;
        this.f16664f = j3;
        this.f16665g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int I10 = a4.f.I(parcel, 20293);
        a4.f.P(parcel, 1, 8);
        parcel.writeLong(this.f16659a);
        byte[] bArr = this.f16660b;
        if (bArr != null) {
            int I11 = a4.f.I(parcel, 2);
            parcel.writeByteArray(bArr);
            a4.f.N(parcel, I11);
        }
        a4.f.F(parcel, 3, this.f16661c);
        a4.f.B(parcel, 4, this.f16662d);
        a4.f.P(parcel, 5, 4);
        parcel.writeInt(this.f16663e);
        a4.f.P(parcel, 6, 8);
        parcel.writeLong(this.f16664f);
        a4.f.F(parcel, 7, this.f16665g);
        a4.f.N(parcel, I10);
    }
}
