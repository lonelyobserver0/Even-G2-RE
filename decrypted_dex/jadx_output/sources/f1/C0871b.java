package f1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.AbstractC0624h2;
import com.google.android.material.datepicker.l;
import com.stub.StubApp;
import i2.u;
import o0.x;
import o0.z;
import r0.AbstractC1560u;

/* renamed from: f1.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class C0871b implements z {
    public static final Parcelable.Creator<C0871b> CREATOR = new l(12);

    /* renamed from: a, reason: collision with root package name */
    public final String f13713a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13714b;

    public C0871b(String str, String str2) {
        this.f13713a = AbstractC0624h2.z(str);
        this.f13714b = str2;
    }

    @Override // o0.z
    public final void b(x xVar) {
        String str = this.f13713a;
        str.getClass();
        String str2 = this.f13714b;
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals(StubApp.getString2(17409))) {
                    c10 = 0;
                    break;
                }
                break;
            case -215998278:
                if (str.equals(StubApp.getString2(17408))) {
                    c10 = 1;
                    break;
                }
                break;
            case -113312716:
                if (str.equals(StubApp.getString2(17407))) {
                    c10 = 2;
                    break;
                }
                break;
            case 62359119:
                if (str.equals(StubApp.getString2(17406))) {
                    c10 = 3;
                    break;
                }
                break;
            case 67703139:
                if (str.equals(StubApp.getString2(17405))) {
                    c10 = 4;
                    break;
                }
                break;
            case 79833656:
                if (str.equals(StubApp.getString2(17404))) {
                    c10 = 5;
                    break;
                }
                break;
            case 428414940:
                if (str.equals(StubApp.getString2(17403))) {
                    c10 = 6;
                    break;
                }
                break;
            case 993300766:
                if (str.equals(StubApp.getString2(17402))) {
                    c10 = 7;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals(StubApp.getString2(17401))) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1939198791:
                if (str.equals(StubApp.getString2(17400))) {
                    c10 = '\t';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                Integer D6 = android.support.v4.media.session.b.D(str2);
                if (D6 != null) {
                    xVar.f18264i = D6;
                    break;
                }
                break;
            case 1:
                Integer D8 = android.support.v4.media.session.b.D(str2);
                if (D8 != null) {
                    xVar.f18276v = D8;
                    break;
                }
                break;
            case 2:
                Integer D10 = android.support.v4.media.session.b.D(str2);
                if (D10 != null) {
                    xVar.f18263h = D10;
                    break;
                }
                break;
            case 3:
                xVar.f18258c = str2;
                break;
            case 4:
                xVar.f18277w = str2;
                break;
            case 5:
                xVar.f18256a = str2;
                break;
            case 6:
                xVar.f18260e = str2;
                break;
            case 7:
                Integer D11 = android.support.v4.media.session.b.D(str2);
                if (D11 != null) {
                    xVar.f18275u = D11;
                    break;
                }
                break;
            case '\b':
                xVar.f18259d = str2;
                break;
            case '\t':
                xVar.f18257b = str2;
                break;
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
        if (obj != null && getClass() == obj.getClass()) {
            C0871b c0871b = (C0871b) obj;
            if (this.f13713a.equals(c0871b.f13713a) && this.f13714b.equals(c0871b.f13714b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f13714b.hashCode() + u.d(527, 31, this.f13713a);
    }

    public final String toString() {
        return StubApp.getString2(17410) + this.f13713a + StubApp.getString2(2359) + this.f13714b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f13713a);
        parcel.writeString(this.f13714b);
    }

    public C0871b(Parcel parcel) {
        String readString = parcel.readString();
        int i3 = AbstractC1560u.f20190a;
        this.f13713a = readString;
        this.f13714b = parcel.readString();
    }
}
