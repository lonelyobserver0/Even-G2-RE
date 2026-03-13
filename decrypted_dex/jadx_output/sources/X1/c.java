package X1;

import android.os.Build;
import com.stub.StubApp;
import java.util.HashSet;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class c implements d {

    /* renamed from: c, reason: collision with root package name */
    public static final HashSet f8239c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final String f8240a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8241b;

    public c(String str, String str2) {
        this.f8240a = str;
        this.f8241b = str2;
        f8239c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f8237a;
        String str = this.f8241b;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        if (!StubApp.getString2(6956).equals(str2) && !StubApp.getString2(6957).equals(str2)) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(StubApp.getString2(6958));
        return hashSet.contains(sb2.toString());
    }
}
