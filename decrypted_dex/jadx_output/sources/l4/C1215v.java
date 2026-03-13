package l4;

import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;
import j1.C1081j;
import p0.AbstractC1482f;

/* renamed from: l4.v, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1215v extends T3.a {
    public static final Parcelable.Creator<C1215v> CREATOR = new C1081j(7);

    /* renamed from: a, reason: collision with root package name */
    public final String f16638a;

    /* renamed from: b, reason: collision with root package name */
    public final C1213u f16639b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16640c;

    /* renamed from: d, reason: collision with root package name */
    public final long f16641d;

    public C1215v(String str, C1213u c1213u, String str2, long j) {
        this.f16638a = str;
        this.f16639b = c1213u;
        this.f16640c = str2;
        this.f16641d = j;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f16639b);
        String str = this.f16640c;
        int length = String.valueOf(str).length();
        String str2 = this.f16638a;
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + valueOf.length());
        E1.a.v(sb2, StubApp.getString2(20054), str, StubApp.getString2(17735), str2);
        return AbstractC1482f.k(sb2, StubApp.getString2(20055), valueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        C1081j.a(this, parcel, i3);
    }

    public C1215v(C1215v c1215v, long j) {
        S3.D.h(c1215v);
        this.f16638a = c1215v.f16638a;
        this.f16639b = c1215v.f16639b;
        this.f16640c = c1215v.f16640c;
        this.f16641d = j;
    }
}
