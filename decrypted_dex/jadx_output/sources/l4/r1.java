package l4;

import android.os.Bundle;
import android.text.TextUtils;
import com.stub.StubApp;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f16608a;

    public r1(Map map) {
        HashMap hashMap = new HashMap();
        this.f16608a = hashMap;
        hashMap.putAll(map);
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        M4.Z z2 = t1.f16632a;
        int i3 = z2.f4580d;
        for (int i10 = 0; i10 < i3; i10++) {
            String str = (String) z2.get(i10);
            HashMap hashMap = this.f16608a;
            if (hashMap.containsKey(str)) {
                if (sb2.length() > 0) {
                    sb2.append(StubApp.getString2(1262));
                }
                sb2.append(str);
                sb2.append(StubApp.getString2(2359));
                sb2.append((String) hashMap.get(str));
            }
        }
        return sb2.toString();
    }

    public final Bundle b() {
        C1147C c1147c = AbstractC1148D.f15972Z0;
        boolean booleanValue = ((Boolean) c1147c.a(null)).booleanValue();
        HashMap hashMap = this.f16608a;
        String string2 = StubApp.getString2(20083);
        String string22 = StubApp.getString2(20084);
        String string23 = StubApp.getString2(878);
        if (!booleanValue ? !(!string23.equals(hashMap.get(StubApp.getString2(20111))) || !string23.equals(hashMap.get(string22)) || !string23.equals(hashMap.get(string2))) : !(!string23.equals(hashMap.get(string22)) || !string23.equals(hashMap.get(string2)))) {
            if (((Boolean) c1147c.a(null)).booleanValue() && hashMap.get(StubApp.getString2(8192)) != null) {
                if (e() >= 0) {
                    Bundle bundle = new Bundle();
                    String string24 = StubApp.getString2(20108);
                    boolean equals = Objects.equals(hashMap.get(string24), string23);
                    String string25 = StubApp.getString2(12542);
                    String string26 = StubApp.getString2(12543);
                    bundle.putString(StubApp.getString2(12544), true != equals ? string26 : string25);
                    bundle.putString(StubApp.getString2(12547), (Objects.equals(hashMap.get(StubApp.getString2(20106)), string23) && Objects.equals(hashMap.get(StubApp.getString2(20107)), string23)) ? string25 : string26);
                    if (e() >= 4) {
                        if (!Objects.equals(hashMap.get(string24), string23) || !Objects.equals(hashMap.get(StubApp.getString2(20109)), string23)) {
                            string25 = string26;
                        }
                        bundle.putString(StubApp.getString2(12546), string25);
                    }
                    return bundle;
                }
            }
            return d();
        }
        return Bundle.EMPTY;
    }

    public final String c() {
        HashMap hashMap = this.f16608a;
        String string2 = StubApp.getString2(878);
        StringBuilder sb2 = new StringBuilder(string2);
        int i3 = -1;
        try {
            String str = (String) hashMap.get(StubApp.getString2("20081"));
            if (!TextUtils.isEmpty(str)) {
                i3 = Integer.parseInt(str);
            }
        } catch (NumberFormatException unused) {
        }
        String string22 = StubApp.getString2(19856);
        if (i3 < 0 || i3 > 4095) {
            sb2.append(StubApp.getString2(1720));
        } else {
            sb2.append(string22.charAt(i3 >> 6));
            sb2.append(string22.charAt(i3 & 63));
        }
        int e10 = e();
        if (e10 < 0 || e10 > 63) {
            sb2.append(StubApp.getString2(824));
        } else {
            sb2.append(string22.charAt(e10));
        }
        int i10 = true != string2.equals(hashMap.get(StubApp.getString2(20084))) ? 0 : 2;
        boolean equals = string2.equals(hashMap.get(StubApp.getString2(20083)));
        int i11 = i10 | 4;
        if (equals) {
            i11 = i10 | 12;
        }
        sb2.append(string22.charAt(i11));
        return sb2.toString();
    }

    public final Bundle d() {
        int e10;
        HashMap hashMap = this.f16608a;
        if (StubApp.getString2(878).equals(hashMap.get(StubApp.getString2(20111))) && (e10 = e()) >= 0) {
            String str = (String) hashMap.get(StubApp.getString2(20112));
            if (!TextUtils.isEmpty(str)) {
                Bundle bundle = new Bundle();
                int length = str.length();
                String string2 = StubApp.getString2(12543);
                String string22 = StubApp.getString2(12542);
                if (length > 0) {
                    bundle.putString(StubApp.getString2(12544), str.charAt(0) == '1' ? string22 : string2);
                }
                if (str.length() > 3) {
                    bundle.putString(StubApp.getString2(12547), (str.charAt(2) == '1' && str.charAt(3) == '1') ? string22 : string2);
                }
                if (str.length() > 6 && e10 >= 4) {
                    if (str.charAt(0) == '1' && str.charAt(6) == '1') {
                        string2 = string22;
                    }
                    bundle.putString(StubApp.getString2(12546), string2);
                }
                return bundle;
            }
        }
        return Bundle.EMPTY;
    }

    public final int e() {
        try {
            String str = (String) this.f16608a.get(StubApp.getString2("20082"));
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r1) {
            return a().equalsIgnoreCase(((r1) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a();
    }
}
