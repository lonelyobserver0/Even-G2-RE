package h1;

import android.os.Parcel;
import android.os.Parcelable;
import i2.u;
import java.util.Arrays;

/* renamed from: h1.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0999b extends AbstractC1006i {
    public static final Parcelable.Creator<C0999b> CREATOR = new com.google.android.material.datepicker.l(22);

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f14423b;

    public C0999b(String str, byte[] bArr) {
        super(str);
        this.f14423b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0999b.class == obj.getClass()) {
            C0999b c0999b = (C0999b) obj;
            if (this.f14447a.equals(c0999b.f14447a) && Arrays.equals(this.f14423b, c0999b.f14423b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f14423b) + u.d(527, 31, this.f14447a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f14447a);
        parcel.writeByteArray(this.f14423b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0999b(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = r0.AbstractC1560u.f20190a
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            r2.f14423b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.C0999b.<init>(android.os.Parcel):void");
    }
}
