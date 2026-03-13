package D5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;
import java.util.Map;
import t.C1692e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class z extends T3.a {
    public static final Parcelable.Creator<z> CREATOR = new B0.s(2);

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f1486a;

    /* renamed from: b, reason: collision with root package name */
    public C1692e f1487b;

    /* renamed from: c, reason: collision with root package name */
    public y f1488c;

    public z(Bundle bundle) {
        this.f1486a = bundle;
    }

    public final Map d() {
        if (this.f1487b == null) {
            C1692e c1692e = new C1692e(0);
            Bundle bundle = this.f1486a;
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith(StubApp.getString2(1516)) && !str.startsWith(StubApp.getString2(1517)) && !str.equals(StubApp.getString2(1518)) && !str.equals(StubApp.getString2(1519)) && !str.equals(StubApp.getString2(1520))) {
                        c1692e.put(str, str2);
                    }
                }
            }
            this.f1487b = c1692e;
        }
        return this.f1487b;
    }

    public final String f() {
        String string2 = StubApp.getString2(1178);
        Bundle bundle = this.f1486a;
        String string = bundle.getString(string2);
        return string == null ? bundle.getString(StubApp.getString2(1179)) : string;
    }

    public final y g() {
        if (this.f1488c == null) {
            Bundle bundle = this.f1486a;
            if (s2.d.x(bundle)) {
                this.f1488c = new y(new s2.d(bundle));
            }
        }
        return this.f1488c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int I10 = a4.f.I(parcel, 20293);
        a4.f.B(parcel, 2, this.f1486a);
        a4.f.N(parcel, I10);
    }
}
