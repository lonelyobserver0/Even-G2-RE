package g1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.l;
import com.stub.StubApp;
import java.util.Objects;
import o0.x;
import o0.z;
import r0.AbstractC1550k;
import r0.AbstractC1560u;

/* renamed from: g1.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0951b implements z {
    public static final Parcelable.Creator<C0951b> CREATOR = new l(19);

    /* renamed from: a, reason: collision with root package name */
    public final int f14205a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14206b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14207c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14208d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14209e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14210f;

    public C0951b(String str, int i3, int i10, String str2, boolean z2, String str3) {
        AbstractC1550k.c(i10 == -1 || i10 > 0);
        this.f14205a = i3;
        this.f14206b = str;
        this.f14207c = str2;
        this.f14208d = str3;
        this.f14209e = z2;
        this.f14210f = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static g1.C0951b d(java.util.Map r14) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.C0951b.d(java.util.Map):g1.b");
    }

    @Override // o0.z
    public final void b(x xVar) {
        String str = this.f14207c;
        if (str != null) {
            xVar.f18278x = str;
        }
        String str2 = this.f14206b;
        if (str2 != null) {
            xVar.f18277w = str2;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0951b.class == obj.getClass()) {
            C0951b c0951b = (C0951b) obj;
            if (this.f14205a == c0951b.f14205a) {
                int i3 = AbstractC1560u.f20190a;
                if (Objects.equals(this.f14206b, c0951b.f14206b) && Objects.equals(this.f14207c, c0951b.f14207c) && Objects.equals(this.f14208d, c0951b.f14208d) && this.f14209e == c0951b.f14209e && this.f14210f == c0951b.f14210f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3 = (527 + this.f14205a) * 31;
        String str = this.f14206b;
        int hashCode = (i3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f14207c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f14208d;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f14209e ? 1 : 0)) * 31) + this.f14210f;
    }

    public final String toString() {
        return StubApp.getString2(17758) + this.f14207c + StubApp.getString2(17759) + this.f14206b + StubApp.getString2(17760) + this.f14205a + StubApp.getString2(17761) + this.f14210f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f14205a);
        parcel.writeString(this.f14206b);
        parcel.writeString(this.f14207c);
        parcel.writeString(this.f14208d);
        int i10 = AbstractC1560u.f20190a;
        parcel.writeInt(this.f14209e ? 1 : 0);
        parcel.writeInt(this.f14210f);
    }

    public C0951b(Parcel parcel) {
        this.f14205a = parcel.readInt();
        this.f14206b = parcel.readString();
        this.f14207c = parcel.readString();
        this.f14208d = parcel.readString();
        int i3 = AbstractC1560u.f20190a;
        this.f14209e = parcel.readInt() != 0;
        this.f14210f = parcel.readInt();
    }
}
