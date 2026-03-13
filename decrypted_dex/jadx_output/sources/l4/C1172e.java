package l4;

import android.os.Parcel;
import android.os.Parcelable;
import j1.C1081j;

/* renamed from: l4.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1172e extends T3.a {
    public static final Parcelable.Creator<C1172e> CREATOR = new C1081j(4);

    /* renamed from: a, reason: collision with root package name */
    public String f16410a;

    /* renamed from: b, reason: collision with root package name */
    public String f16411b;

    /* renamed from: c, reason: collision with root package name */
    public H1 f16412c;

    /* renamed from: d, reason: collision with root package name */
    public long f16413d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16414e;

    /* renamed from: f, reason: collision with root package name */
    public String f16415f;

    /* renamed from: g, reason: collision with root package name */
    public final C1215v f16416g;

    /* renamed from: h, reason: collision with root package name */
    public long f16417h;
    public C1215v j;

    /* renamed from: k, reason: collision with root package name */
    public final long f16418k;

    /* renamed from: l, reason: collision with root package name */
    public final C1215v f16419l;

    public C1172e(String str, String str2, H1 h12, long j, boolean z2, String str3, C1215v c1215v, long j3, C1215v c1215v2, long j10, C1215v c1215v3) {
        this.f16410a = str;
        this.f16411b = str2;
        this.f16412c = h12;
        this.f16413d = j;
        this.f16414e = z2;
        this.f16415f = str3;
        this.f16416g = c1215v;
        this.f16417h = j3;
        this.j = c1215v2;
        this.f16418k = j10;
        this.f16419l = c1215v3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int I10 = a4.f.I(parcel, 20293);
        a4.f.F(parcel, 2, this.f16410a);
        a4.f.F(parcel, 3, this.f16411b);
        a4.f.E(parcel, 4, this.f16412c, i3);
        long j = this.f16413d;
        a4.f.P(parcel, 5, 8);
        parcel.writeLong(j);
        boolean z2 = this.f16414e;
        a4.f.P(parcel, 6, 4);
        parcel.writeInt(z2 ? 1 : 0);
        a4.f.F(parcel, 7, this.f16415f);
        a4.f.E(parcel, 8, this.f16416g, i3);
        long j3 = this.f16417h;
        a4.f.P(parcel, 9, 8);
        parcel.writeLong(j3);
        a4.f.E(parcel, 10, this.j, i3);
        a4.f.P(parcel, 11, 8);
        parcel.writeLong(this.f16418k);
        a4.f.E(parcel, 12, this.f16419l, i3);
        a4.f.N(parcel, I10);
    }

    public C1172e(C1172e c1172e) {
        S3.D.h(c1172e);
        this.f16410a = c1172e.f16410a;
        this.f16411b = c1172e.f16411b;
        this.f16412c = c1172e.f16412c;
        this.f16413d = c1172e.f16413d;
        this.f16414e = c1172e.f16414e;
        this.f16415f = c1172e.f16415f;
        this.f16416g = c1172e.f16416g;
        this.f16417h = c1172e.f16417h;
        this.j = c1172e.j;
        this.f16418k = c1172e.f16418k;
        this.f16419l = c1172e.f16419l;
    }
}
