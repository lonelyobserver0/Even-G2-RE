package l4;

import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;
import j1.C1081j;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class H1 extends T3.a {
    public static final Parcelable.Creator<H1> CREATOR = new C1081j(12);

    /* renamed from: a, reason: collision with root package name */
    public final int f16099a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16100b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16101c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f16102d;

    /* renamed from: e, reason: collision with root package name */
    public final String f16103e;

    /* renamed from: f, reason: collision with root package name */
    public final String f16104f;

    /* renamed from: g, reason: collision with root package name */
    public final Double f16105g;

    public H1(int i3, String str, long j, Long l9, Float f10, String str2, String str3, Double d8) {
        this.f16099a = i3;
        this.f16100b = str;
        this.f16101c = j;
        this.f16102d = l9;
        this.f16105g = i3 == 1 ? f10 != null ? Double.valueOf(f10.doubleValue()) : null : d8;
        this.f16103e = str2;
        this.f16104f = str3;
    }

    public final Object d() {
        Long l9 = this.f16102d;
        if (l9 != null) {
            return l9;
        }
        Double d8 = this.f16105g;
        if (d8 != null) {
            return d8;
        }
        String str = this.f16103e;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        C1081j.b(this, parcel);
    }

    public H1(long j, Object obj, String str, String str2) {
        S3.D.e(str);
        this.f16099a = 2;
        this.f16100b = str;
        this.f16101c = j;
        this.f16104f = str2;
        if (obj == null) {
            this.f16102d = null;
            this.f16105g = null;
            this.f16103e = null;
            return;
        }
        if (obj instanceof Long) {
            this.f16102d = (Long) obj;
            this.f16105g = null;
            this.f16103e = null;
        } else if (obj instanceof String) {
            this.f16102d = null;
            this.f16105g = null;
            this.f16103e = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.f16102d = null;
                this.f16105g = (Double) obj;
                this.f16103e = null;
                return;
            }
            throw new IllegalArgumentException(StubApp.getString2(19942));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public H1(l4.I1 r7) {
        /*
            r6 = this;
            java.lang.String r4 = r7.f16116c
            java.lang.Object r3 = r7.f16118e
            java.lang.String r5 = r7.f16115b
            long r1 = r7.f16117d
            r0 = r6
            r0.<init>(r1, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.H1.<init>(l4.I1):void");
    }
}
