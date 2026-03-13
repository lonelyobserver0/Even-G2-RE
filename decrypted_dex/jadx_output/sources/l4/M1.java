package l4;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j1.C1081j;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class M1 extends T3.a {
    public static final Parcelable.Creator<M1> CREATOR = new C1081j(13);

    /* renamed from: A, reason: collision with root package name */
    public final int f16157A;

    /* renamed from: B, reason: collision with root package name */
    public final String f16158B;

    /* renamed from: C, reason: collision with root package name */
    public final int f16159C;

    /* renamed from: D, reason: collision with root package name */
    public final long f16160D;

    /* renamed from: E, reason: collision with root package name */
    public final String f16161E;

    /* renamed from: F, reason: collision with root package name */
    public final String f16162F;

    /* renamed from: G, reason: collision with root package name */
    public final long f16163G;

    /* renamed from: H, reason: collision with root package name */
    public final int f16164H;

    /* renamed from: a, reason: collision with root package name */
    public final String f16165a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16166b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16167c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16168d;

    /* renamed from: e, reason: collision with root package name */
    public final long f16169e;

    /* renamed from: f, reason: collision with root package name */
    public final long f16170f;

    /* renamed from: g, reason: collision with root package name */
    public final String f16171g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f16172h;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final long f16173k;

    /* renamed from: l, reason: collision with root package name */
    public final String f16174l;

    /* renamed from: m, reason: collision with root package name */
    public final long f16175m;

    /* renamed from: n, reason: collision with root package name */
    public final int f16176n;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f16177p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f16178q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f16179r;

    /* renamed from: s, reason: collision with root package name */
    public final long f16180s;

    /* renamed from: t, reason: collision with root package name */
    public final List f16181t;

    /* renamed from: v, reason: collision with root package name */
    public final String f16182v;

    /* renamed from: w, reason: collision with root package name */
    public final String f16183w;

    /* renamed from: x, reason: collision with root package name */
    public final String f16184x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f16185y;

    /* renamed from: z, reason: collision with root package name */
    public final long f16186z;

    public M1(String str, String str2, String str3, long j, String str4, long j3, long j10, String str5, boolean z2, boolean z10, String str6, long j11, int i3, boolean z11, boolean z12, Boolean bool, long j12, List list, String str7, String str8, String str9, boolean z13, long j13, int i10, String str10, int i11, long j14, String str11, String str12, long j15, int i12) {
        S3.D.e(str);
        this.f16165a = str;
        this.f16166b = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f16167c = str3;
        this.f16173k = j;
        this.f16168d = str4;
        this.f16169e = j3;
        this.f16170f = j10;
        this.f16171g = str5;
        this.f16172h = z2;
        this.j = z10;
        this.f16174l = str6;
        this.f16175m = j11;
        this.f16176n = i3;
        this.f16177p = z11;
        this.f16178q = z12;
        this.f16179r = bool;
        this.f16180s = j12;
        this.f16181t = list;
        this.f16182v = str7;
        this.f16183w = str8;
        this.f16184x = str9;
        this.f16185y = z13;
        this.f16186z = j13;
        this.f16157A = i10;
        this.f16158B = str10;
        this.f16159C = i11;
        this.f16160D = j14;
        this.f16161E = str11;
        this.f16162F = str12;
        this.f16163G = j15;
        this.f16164H = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int I10 = a4.f.I(parcel, 20293);
        a4.f.F(parcel, 2, this.f16165a);
        a4.f.F(parcel, 3, this.f16166b);
        a4.f.F(parcel, 4, this.f16167c);
        a4.f.F(parcel, 5, this.f16168d);
        a4.f.P(parcel, 6, 8);
        parcel.writeLong(this.f16169e);
        a4.f.P(parcel, 7, 8);
        parcel.writeLong(this.f16170f);
        a4.f.F(parcel, 8, this.f16171g);
        a4.f.P(parcel, 9, 4);
        parcel.writeInt(this.f16172h ? 1 : 0);
        a4.f.P(parcel, 10, 4);
        parcel.writeInt(this.j ? 1 : 0);
        a4.f.P(parcel, 11, 8);
        parcel.writeLong(this.f16173k);
        a4.f.F(parcel, 12, this.f16174l);
        a4.f.P(parcel, 14, 8);
        parcel.writeLong(this.f16175m);
        a4.f.P(parcel, 15, 4);
        parcel.writeInt(this.f16176n);
        a4.f.P(parcel, 16, 4);
        parcel.writeInt(this.f16177p ? 1 : 0);
        a4.f.P(parcel, 18, 4);
        parcel.writeInt(this.f16178q ? 1 : 0);
        Boolean bool = this.f16179r;
        if (bool != null) {
            a4.f.P(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        a4.f.P(parcel, 22, 8);
        parcel.writeLong(this.f16180s);
        List<String> list = this.f16181t;
        if (list != null) {
            int I11 = a4.f.I(parcel, 23);
            parcel.writeStringList(list);
            a4.f.N(parcel, I11);
        }
        a4.f.F(parcel, 25, this.f16182v);
        a4.f.F(parcel, 26, this.f16183w);
        a4.f.F(parcel, 27, this.f16184x);
        a4.f.P(parcel, 28, 4);
        parcel.writeInt(this.f16185y ? 1 : 0);
        a4.f.P(parcel, 29, 8);
        parcel.writeLong(this.f16186z);
        a4.f.P(parcel, 30, 4);
        parcel.writeInt(this.f16157A);
        a4.f.F(parcel, 31, this.f16158B);
        a4.f.P(parcel, 32, 4);
        parcel.writeInt(this.f16159C);
        a4.f.P(parcel, 34, 8);
        parcel.writeLong(this.f16160D);
        a4.f.F(parcel, 35, this.f16161E);
        a4.f.F(parcel, 36, this.f16162F);
        a4.f.P(parcel, 37, 8);
        parcel.writeLong(this.f16163G);
        a4.f.P(parcel, 38, 4);
        parcel.writeInt(this.f16164H);
        a4.f.N(parcel, I10);
    }

    public M1(String str, String str2, String str3, String str4, long j, long j3, String str5, boolean z2, boolean z10, long j10, String str6, long j11, int i3, boolean z11, boolean z12, Boolean bool, long j12, ArrayList arrayList, String str7, String str8, String str9, boolean z13, long j13, int i10, String str10, int i11, long j14, String str11, String str12, long j15, int i12) {
        this.f16165a = str;
        this.f16166b = str2;
        this.f16167c = str3;
        this.f16173k = j10;
        this.f16168d = str4;
        this.f16169e = j;
        this.f16170f = j3;
        this.f16171g = str5;
        this.f16172h = z2;
        this.j = z10;
        this.f16174l = str6;
        this.f16175m = j11;
        this.f16176n = i3;
        this.f16177p = z11;
        this.f16178q = z12;
        this.f16179r = bool;
        this.f16180s = j12;
        this.f16181t = arrayList;
        this.f16182v = str7;
        this.f16183w = str8;
        this.f16184x = str9;
        this.f16185y = z13;
        this.f16186z = j13;
        this.f16157A = i10;
        this.f16158B = str10;
        this.f16159C = i11;
        this.f16160D = j14;
        this.f16161E = str11;
        this.f16162F = str12;
        this.f16163G = j15;
        this.f16164H = i12;
    }
}
