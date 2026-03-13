package h1;

import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;
import i2.u;
import java.util.Objects;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class p extends AbstractC1006i {
    public static final Parcelable.Creator<p> CREATOR = new n(1);

    /* renamed from: b, reason: collision with root package name */
    public final String f14462b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14463c;

    public p(String str, String str2, String str3) {
        super(str);
        this.f14462b = str2;
        this.f14463c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (this.f14447a.equals(pVar.f14447a)) {
                int i3 = AbstractC1560u.f20190a;
                if (Objects.equals(this.f14462b, pVar.f14462b) && Objects.equals(this.f14463c, pVar.f14463c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int d8 = u.d(527, 31, this.f14447a);
        String str = this.f14462b;
        int hashCode = (d8 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f14463c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // h1.AbstractC1006i
    public final String toString() {
        return this.f14447a + StubApp.getString2(18306) + this.f14463c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f14447a);
        parcel.writeString(this.f14462b);
        parcel.writeString(this.f14463c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = r0.AbstractC1560u.f20190a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f14462b = r0
            java.lang.String r3 = r3.readString()
            r2.f14463c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.p.<init>(android.os.Parcel):void");
    }
}
