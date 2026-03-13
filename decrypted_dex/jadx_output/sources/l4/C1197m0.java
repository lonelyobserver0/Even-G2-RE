package l4;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.stub.StubApp;
import java.io.IOException;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: l4.m0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class C1197m0 implements R0 {

    /* renamed from: a, reason: collision with root package name */
    public final C1200n0 f16515a;

    public /* synthetic */ C1197m0(C1200n0 c1200n0) {
        this.f16515a = c1200n0;
    }

    @Override // l4.R0
    public void a(int i3, IOException iOException, byte[] bArr) {
        int i10;
        T t3;
        T t10;
        BroadcastOptions makeBasic;
        BroadcastOptions shareIdentityEnabled;
        Bundle bundle;
        String string2 = StubApp.getString2(1350);
        String string22 = StubApp.getString2(19863);
        String string23 = StubApp.getString2(19862);
        String string24 = StubApp.getString2(19810);
        String string25 = StubApp.getString2(20549);
        C1200n0 c1200n0 = this.f16515a;
        T t11 = c1200n0.f16541f;
        if (i3 == 200 || i3 == 204) {
            i10 = i3;
        } else {
            i10 = 304;
            if (i3 != 304) {
                i10 = i3;
                C1200n0.l(t11);
                t11.j.d(StubApp.getString2(20558), Integer.valueOf(i10), iOException);
            }
        }
        if (iOException == null) {
            C1164b0 c1164b0 = c1200n0.f16540e;
            C1200n0.j(c1164b0);
            c1164b0.f16384w.b(true);
            if (bArr == null || bArr.length == 0) {
                C1200n0.l(t11);
                t11.f16248n.b(StubApp.getString2(20557));
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString(string25, "");
                if (TextUtils.isEmpty(optString)) {
                    C1200n0.l(t11);
                    t11.f16248n.b(StubApp.getString2("20550"));
                    return;
                }
                String optString2 = jSONObject.optString(string24, "");
                String optString3 = jSONObject.optString(string23, "");
                String optString4 = jSONObject.optString(string22, "");
                double optDouble = jSONObject.optDouble(string2, 0.0d);
                Bundle bundle2 = new Bundle();
                K1 k12 = c1200n0.j;
                C1200n0.j(k12);
                C1200n0 c1200n02 = (C1200n0) k12.f4728a;
                if (TextUtils.isEmpty(optString)) {
                    t10 = t11;
                } else {
                    Context context = c1200n02.f16536a;
                    t10 = t11;
                    try {
                        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent(StubApp.getString2("5111"), Uri.parse(optString)), 0);
                        if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                            if (!TextUtils.isEmpty(optString3)) {
                                bundle2.putString(string23, optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                bundle2.putString(string22, optString4);
                            }
                            bundle2.putString(string24, optString2);
                            bundle2.putString(StubApp.getString2("3151"), StubApp.getString2("20551"));
                            c1200n0.f16547n.r(StubApp.getString2("3305"), StubApp.getString2("1191"), bundle2);
                            if (TextUtils.isEmpty(optString)) {
                                return;
                            }
                            try {
                                SharedPreferences.Editor edit = context.getSharedPreferences(StubApp.getString2("20552"), 0).edit();
                                edit.putString(string25, optString);
                                edit.putLong(string2, Double.doubleToRawLongBits(optDouble));
                                if (edit.commit()) {
                                    Intent intent = new Intent(StubApp.getString2("20553"));
                                    Context context2 = c1200n02.f16536a;
                                    if (Build.VERSION.SDK_INT < 34) {
                                        context2.sendBroadcast(intent);
                                        return;
                                    }
                                    makeBasic = BroadcastOptions.makeBasic();
                                    shareIdentityEnabled = makeBasic.setShareIdentityEnabled(true);
                                    bundle = shareIdentityEnabled.toBundle();
                                    context2.sendBroadcast(intent, null, bundle);
                                    return;
                                }
                                return;
                            } catch (RuntimeException e10) {
                                T t12 = c1200n02.f16541f;
                                C1200n0.l(t12);
                                t12.f16242f.c(e10, StubApp.getString2("20554"));
                                return;
                            }
                        }
                    } catch (JSONException e11) {
                        e = e11;
                        t3 = t10;
                        C1200n0.l(t3);
                        t3.f16242f.c(e, StubApp.getString2(20556));
                        return;
                    }
                }
                C1200n0.l(t10);
                t3 = t10;
                try {
                    t3.j.e(StubApp.getString2("20555"), optString2, optString3, optString);
                    return;
                } catch (JSONException e12) {
                    e = e12;
                    C1200n0.l(t3);
                    t3.f16242f.c(e, StubApp.getString2(20556));
                    return;
                }
            } catch (JSONException e13) {
                e = e13;
                t3 = t11;
            }
        }
        C1200n0.l(t11);
        t11.j.d(StubApp.getString2(20558), Integer.valueOf(i10), iOException);
    }

    public void b(String str, Bundle bundle) {
        String uri;
        C1200n0 c1200n0 = this.f16515a;
        C1191k0 c1191k0 = c1200n0.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
        if (c1200n0.d()) {
            return;
        }
        if (bundle.isEmpty()) {
            uri = null;
        } else {
            if (true == str.isEmpty()) {
                str = StubApp.getString2(3305);
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            uri = builder.build().toString();
        }
        if (TextUtils.isEmpty(uri)) {
            return;
        }
        C1164b0 c1164b0 = c1200n0.f16540e;
        C1200n0.j(c1164b0);
        c1164b0.f16387z.l(uri);
        c1200n0.f16545l.getClass();
        c1164b0.f16366A.h(System.currentTimeMillis());
    }

    public boolean c() {
        if (!d()) {
            return false;
        }
        C1200n0 c1200n0 = this.f16515a;
        c1200n0.f16545l.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        C1164b0 c1164b0 = c1200n0.f16540e;
        C1200n0.j(c1164b0);
        return currentTimeMillis - c1164b0.f16366A.g() > c1200n0.f16539d.r(null, AbstractC1148D.f15998j0);
    }

    public boolean d() {
        C1164b0 c1164b0 = this.f16515a.f16540e;
        C1200n0.j(c1164b0);
        return c1164b0.f16366A.g() > 0;
    }
}
