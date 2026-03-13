package e5;

import android.util.Log;
import com.stub.StubApp;
import java.util.HashMap;
import java.util.Map;

/* renamed from: e5.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0846e {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f13610a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final int f13611b = 64;

    /* renamed from: c, reason: collision with root package name */
    public final int f13612c;

    public C0846e(int i3) {
        this.f13612c = i3;
    }

    public static String a(int i3, String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() > i3) {
                return str.substring(0, i3);
            }
        }
        return str;
    }

    public final synchronized boolean b(String str, String str2) {
        String string2 = StubApp.getString2(17283);
        synchronized (this) {
            if (str == null) {
                throw new IllegalArgumentException(StubApp.getString2("17285"));
            }
            String a3 = a(this.f13612c, str);
            if (this.f13610a.size() >= this.f13611b && !this.f13610a.containsKey(a3)) {
                Log.w(StubApp.getString2("280"), string2 + str + StubApp.getString2("17284") + this.f13611b, null);
                return false;
            }
            String a9 = a(this.f13612c, str2);
            String str3 = (String) this.f13610a.get(a3);
            if (str3 == null ? a9 == null : str3.equals(a9)) {
                return false;
            }
            HashMap hashMap = this.f13610a;
            if (str2 == null) {
                a9 = "";
            }
            hashMap.put(a3, a9);
            return true;
        }
    }

    public final synchronized void c(Map map) {
        try {
            int i3 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new IllegalArgumentException(StubApp.getString2("17285"));
                }
                String a3 = a(this.f13612c, str);
                if (this.f13610a.size() >= this.f13611b && !this.f13610a.containsKey(a3)) {
                    i3++;
                }
                String str2 = (String) entry.getValue();
                this.f13610a.put(a3, str2 == null ? "" : a(this.f13612c, str2));
            }
            if (i3 > 0) {
                Log.w(StubApp.getString2("280"), StubApp.getString2("17286") + i3 + StubApp.getString2("17287") + this.f13611b, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
