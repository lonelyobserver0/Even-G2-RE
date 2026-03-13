package h1;

import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;
import java.util.Arrays;
import java.util.Objects;
import o0.x;
import r0.AbstractC1560u;

/* renamed from: h1.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0998a extends AbstractC1006i {
    public static final Parcelable.Creator<C0998a> CREATOR = new com.google.android.material.datepicker.l(21);

    /* renamed from: b, reason: collision with root package name */
    public final String f14419b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14420c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14421d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f14422e;

    public C0998a(int i3, String str, String str2, byte[] bArr) {
        super(StubApp.getString2(18063));
        this.f14419b = str;
        this.f14420c = str2;
        this.f14421d = i3;
        this.f14422e = bArr;
    }

    @Override // o0.z
    public final void b(x xVar) {
        xVar.a(this.f14421d, this.f14422e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0998a.class == obj.getClass()) {
            C0998a c0998a = (C0998a) obj;
            if (this.f14421d == c0998a.f14421d) {
                int i3 = AbstractC1560u.f20190a;
                if (Objects.equals(this.f14419b, c0998a.f14419b) && Objects.equals(this.f14420c, c0998a.f14420c) && Arrays.equals(this.f14422e, c0998a.f14422e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3 = (527 + this.f14421d) * 31;
        String str = this.f14419b;
        int hashCode = (i3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f14420c;
        return Arrays.hashCode(this.f14422e) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // h1.AbstractC1006i
    public final String toString() {
        return this.f14447a + StubApp.getString2(18064) + this.f14419b + StubApp.getString2(7300) + this.f14420c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f14419b);
        parcel.writeString(this.f14420c);
        parcel.writeInt(this.f14421d);
        parcel.writeByteArray(this.f14422e);
    }

    public C0998a(Parcel parcel) {
        super(StubApp.getString2(18063));
        String readString = parcel.readString();
        int i3 = AbstractC1560u.f20190a;
        this.f14419b = readString;
        this.f14420c = parcel.readString();
        this.f14421d = parcel.readInt();
        this.f14422e = parcel.createByteArray();
    }
}
