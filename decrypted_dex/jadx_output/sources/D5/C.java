package D5;

import android.text.TextUtils;
import android.util.Log;
import com.stub.StubApp;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C {

    /* renamed from: d, reason: collision with root package name */
    public static final long f1344d = TimeUnit.DAYS.toMillis(7);

    /* renamed from: a, reason: collision with root package name */
    public final String f1345a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1346b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1347c;

    public C(long j, String str, String str2) {
        this.f1345a = str;
        this.f1346b = str2;
        this.f1347c = j;
    }

    public static String a(long j, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StubApp.getString2("1071"), str);
            jSONObject.put(StubApp.getString2("1349"), str2);
            jSONObject.put(StubApp.getString2("1350"), j);
            return jSONObject.toString();
        } catch (JSONException e10) {
            Log.w(StubApp.getString2(493), StubApp.getString2(1351) + e10);
            return null;
        }
    }

    public static C b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith(StubApp.getString2(1352))) {
            return new C(0L, str, null);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C(jSONObject.getLong(StubApp.getString2("1350")), jSONObject.getString(StubApp.getString2("1071")), jSONObject.getString(StubApp.getString2("1349")));
        } catch (JSONException e10) {
            Log.w(StubApp.getString2(493), StubApp.getString2(1353) + e10);
            return null;
        }
    }
}
