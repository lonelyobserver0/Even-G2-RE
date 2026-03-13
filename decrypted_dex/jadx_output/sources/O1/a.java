package O1;

import android.text.TextUtils;
import android.util.Log;
import com.stub.StubApp;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import r0.C1553n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public String f5194a;

    public a(String query, int i3) {
        switch (i3) {
            case 1:
                this.f5194a = query;
                break;
            default:
                Intrinsics.checkNotNullParameter(query, "query");
                Intrinsics.checkNotNullParameter(query, "query");
                this.f5194a = query;
                break;
        }
    }

    public static void b(a5.c cVar, k5.d dVar) {
        String str = dVar.f15443a;
        if (str != null) {
            cVar.x(StubApp.getString2(3973), str);
        }
        cVar.x(StubApp.getString2(3974), StubApp.getString2(3400));
        cVar.x(StubApp.getString2(3975), StubApp.getString2(3976));
        cVar.x(StubApp.getString2(395), StubApp.getString2(3394));
        String str2 = dVar.f15444b;
        if (str2 != null) {
            cVar.x(StubApp.getString2(3977), str2);
        }
        String str3 = dVar.f15445c;
        if (str3 != null) {
            cVar.x(StubApp.getString2(3978), str3);
        }
        String str4 = dVar.f15446d;
        if (str4 != null) {
            cVar.x(StubApp.getString2(3979), str4);
        }
        String str5 = dVar.f15447e.c().f10862a;
        if (str5 != null) {
            cVar.x(StubApp.getString2(3980), str5);
        }
    }

    public static HashMap c(k5.d dVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(StubApp.getString2(3403), dVar.f15450h);
        hashMap.put(StubApp.getString2(3404), dVar.f15449g);
        hashMap.put(StubApp.getString2(376), Integer.toString(dVar.f15451i));
        String str = dVar.f15448f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put(StubApp.getString2(3981), str);
        }
        return hashMap;
    }

    public static a f(C1553n c1553n) {
        String string2;
        c1553n.H(2);
        int u2 = c1553n.u();
        int i3 = u2 >> 1;
        int u10 = ((c1553n.u() >> 3) & 31) | ((u2 & 1) << 5);
        if (i3 == 4 || i3 == 5 || i3 == 7) {
            string2 = StubApp.getString2(3983);
        } else if (i3 == 8) {
            string2 = StubApp.getString2(1730);
        } else {
            if (i3 != 9) {
                return null;
            }
            string2 = StubApp.getString2(3982);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(string2);
        String string22 = StubApp.getString2(3984);
        sb2.append(string22);
        sb2.append(i3);
        if (u10 >= 10) {
            string22 = StubApp.getString2(1);
        }
        sb2.append(string22);
        sb2.append(u10);
        return new a(sb2.toString(), 1);
    }

    @Override // O1.e
    public void a(d statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        Intrinsics.checkNotNullParameter(statement, "statement");
    }

    @Override // O1.e
    public String d() {
        return this.f5194a;
    }

    public JSONObject e(I9.a aVar) {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(3985));
        int i3 = aVar.f3236a;
        sb2.append(i3);
        String sb3 = sb2.toString();
        Z4.c cVar = Z4.c.f8980a;
        cVar.f(sb3);
        String str = this.f5194a;
        if (i3 == 200 || i3 == 201 || i3 == 202 || i3 == 203) {
            String str2 = aVar.f3237b;
            try {
                return new JSONObject(str2);
            } catch (Exception e10) {
                cVar.g(StubApp.getString2(3988) + str, e10);
                cVar.g(StubApp.getString2(3989) + str2, null);
            }
        } else {
            String str3 = StubApp.getString2(3986) + i3 + StubApp.getString2(3987) + str;
            if (cVar.b(6)) {
                Log.e(StubApp.getString2(280), str3, null);
                return null;
            }
        }
        return null;
    }
}
