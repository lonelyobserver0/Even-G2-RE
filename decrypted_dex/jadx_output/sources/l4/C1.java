package l4;

import android.net.Uri;
import android.text.TextUtils;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1 extends w1 {
    public static final boolean n(String str) {
        String str2 = (String) AbstractC1148D.f16018t.a(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(StubApp.getString2(321))) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x008e, code lost:
    
        if (java.lang.Math.abs(r5.hashCode() % 100) < r8.E().p()) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l4.B1 l(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.C1.l(java.lang.String):l4.B1");
    }

    public final String m(String str) {
        C1179g0 c1179g0 = this.f16651b.f16059a;
        F1.S(c1179g0);
        String x7 = c1179g0.x(str);
        if (TextUtils.isEmpty(x7)) {
            return (String) AbstractC1148D.f16014r.a(null);
        }
        Uri parse = Uri.parse((String) AbstractC1148D.f16014r.a(null));
        Uri.Builder buildUpon = parse.buildUpon();
        String authority = parse.getAuthority();
        StringBuilder sb2 = new StringBuilder(String.valueOf(x7).length() + 1 + String.valueOf(authority).length());
        sb2.append(x7);
        sb2.append(StubApp.getString2(1));
        sb2.append(authority);
        buildUpon.authority(sb2.toString());
        return buildUpon.build().toString();
    }
}
