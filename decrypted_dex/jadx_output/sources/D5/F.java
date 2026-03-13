package D5;

import android.util.Log;
import com.stub.StubApp;
import java.util.Arrays;
import java.util.regex.Pattern;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class F {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f1355d = Pattern.compile(StubApp.getString2(1370));

    /* renamed from: a, reason: collision with root package name */
    public final String f1356a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1357b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1358c;

    public F(String str, String str2) {
        String str3;
        if (str2 == null || !str2.startsWith(StubApp.getString2(1371))) {
            str3 = str2;
        } else {
            Log.w(StubApp.getString2(493), StubApp.getString2(1372) + str + StubApp.getString2(1));
            str3 = str2.substring(8);
        }
        if (str3 == null || !f1355d.matcher(str3).matches()) {
            throw new IllegalArgumentException(E1.a.k(StubApp.getString2(1374), str3, StubApp.getString2(1375)));
        }
        this.f1356a = str3;
        this.f1357b = str;
        this.f1358c = AbstractC1482f.h(str, StubApp.getString2(1373), str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof F)) {
            return false;
        }
        F f10 = (F) obj;
        return this.f1356a.equals(f10.f1356a) && this.f1357b.equals(f10.f1357b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1357b, this.f1356a});
    }
}
