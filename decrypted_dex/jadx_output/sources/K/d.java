package K;

import android.util.Base64;
import com.stub.StubApp;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f3544a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3545b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3546c;

    /* renamed from: d, reason: collision with root package name */
    public final List f3547d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3548e;

    public d(String str, String str2, String str3, List list) {
        str.getClass();
        this.f3544a = str;
        str2.getClass();
        this.f3545b = str2;
        this.f3546c = str3;
        list.getClass();
        this.f3547d = list;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        String string2 = StubApp.getString2(999);
        sb2.append(string2);
        sb2.append(str2);
        sb2.append(string2);
        sb2.append(str3);
        this.f3548e = sb2.toString();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(StubApp.getString2(3115) + this.f3544a + StubApp.getString2(3116) + this.f3545b + StubApp.getString2(3117) + this.f3546c + StubApp.getString2(3118));
        int i3 = 0;
        while (true) {
            List list = this.f3547d;
            if (i3 >= list.size()) {
                sb2.append(StubApp.getString2(3121));
                return sb2.toString();
            }
            sb2.append(StubApp.getString2(510));
            List list2 = (List) list.get(i3);
            for (int i10 = 0; i10 < list2.size(); i10++) {
                sb2.append(StubApp.getString2(3119));
                sb2.append(Base64.encodeToString((byte[]) list2.get(i10), 0));
                sb2.append(StubApp.getString2(2123));
            }
            sb2.append(StubApp.getString2(3120));
            i3++;
        }
    }
}
