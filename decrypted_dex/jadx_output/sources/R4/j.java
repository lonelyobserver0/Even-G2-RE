package R4;

import S3.D;
import Z9.C;
import android.content.Context;
import android.text.TextUtils;
import com.stub.StubApp;
import java.util.Arrays;
import l4.E0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f6203a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6204b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6205c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6206d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6207e;

    /* renamed from: f, reason: collision with root package name */
    public final String f6208f;

    /* renamed from: g, reason: collision with root package name */
    public final String f6209g;

    public j(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i3 = W3.c.f8108a;
        D.j(StubApp.getString2(2233), true ^ (str == null || str.trim().isEmpty()));
        this.f6204b = str;
        this.f6203a = str2;
        this.f6205c = str3;
        this.f6206d = str4;
        this.f6207e = str5;
        this.f6208f = str6;
        this.f6209g = str7;
    }

    public static j a(Context context) {
        E0 e02 = new E0(context, 22);
        String D6 = e02.D(StubApp.getString2(5702));
        if (TextUtils.isEmpty(D6)) {
            return null;
        }
        return new j(D6, e02.D(StubApp.getString2(5703)), e02.D(StubApp.getString2(5704)), e02.D(StubApp.getString2(5705)), e02.D(StubApp.getString2(5706)), e02.D(StubApp.getString2(5707)), e02.D(StubApp.getString2(5708)));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return D.k(this.f6204b, jVar.f6204b) && D.k(this.f6203a, jVar.f6203a) && D.k(this.f6205c, jVar.f6205c) && D.k(this.f6206d, jVar.f6206d) && D.k(this.f6207e, jVar.f6207e) && D.k(this.f6208f, jVar.f6208f) && D.k(this.f6209g, jVar.f6209g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6204b, this.f6203a, this.f6205c, this.f6206d, this.f6207e, this.f6208f, this.f6209g});
    }

    public final String toString() {
        C c10 = new C(this);
        c10.a(this.f6204b, StubApp.getString2(5709));
        c10.a(this.f6203a, StubApp.getString2(5710));
        c10.a(this.f6205c, StubApp.getString2(5711));
        c10.a(this.f6207e, StubApp.getString2(5712));
        c10.a(this.f6208f, StubApp.getString2(5713));
        c10.a(this.f6209g, StubApp.getString2(5714));
        return c10.toString();
    }
}
