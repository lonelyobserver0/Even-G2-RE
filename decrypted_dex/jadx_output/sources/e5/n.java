package e5;

import com.stub.StubApp;
import f4.C0879c;
import org.json.JSONObject;
import r5.C1571d;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final C0879c f13634a;

    static {
        C1571d c1571d = new C1571d();
        C0842a c0842a = C0842a.f13596a;
        c1571d.a(n.class, c0842a);
        c1571d.a(C0843b.class, c0842a);
        f13634a = new C0879c(c1571d);
    }

    public static C0843b a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString(StubApp.getString2(17267));
        String string2 = jSONObject.getString(StubApp.getString2(17268));
        String string3 = jSONObject.getString(StubApp.getString2(17269));
        String string4 = jSONObject.getString(StubApp.getString2(17270));
        long j = jSONObject.getLong(StubApp.getString2(17271));
        if (string3.length() > 256) {
            string3 = string3.substring(0, 256);
        }
        return new C0843b(string, string2, string3, string4, j);
    }
}
