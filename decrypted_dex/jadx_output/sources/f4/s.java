package f4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class s extends T3.a {
    public static final Parcelable.Creator<s> CREATOR = new com.google.android.material.datepicker.l(14);

    /* renamed from: a, reason: collision with root package name */
    public final LocationRequest f13776a;

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s(com.google.android.gms.location.LocationRequest r12, java.util.ArrayList r13, boolean r14, boolean r15, boolean r16, boolean r17, long r18) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.s.<init>(com.google.android.gms.location.LocationRequest, java.util.ArrayList, boolean, boolean, boolean, boolean, long):void");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return S3.D.k(this.f13776a, ((s) obj).f13776a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13776a.hashCode();
    }

    public final String toString() {
        return this.f13776a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int I10 = a4.f.I(parcel, 20293);
        a4.f.E(parcel, 1, this.f13776a, i3);
        a4.f.N(parcel, I10);
    }
}
