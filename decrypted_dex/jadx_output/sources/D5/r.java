package D5;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;
import com.stub.StubApp;
import t5.C1730a;
import t5.InterfaceC1731b;
import t5.InterfaceC1733d;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1447a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1448b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1449c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1450d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1451e;

    public r(String str, String str2, String str3, String str4, boolean z2) {
        this.f1448b = str == null ? StubApp.getString2(1463) : str;
        this.f1449c = str2 == null ? StubApp.getString2(1464) : str2;
        this.f1451e = str4;
        this.f1450d = str3 == null ? "" : str3;
        this.f1447a = z2;
    }

    public synchronized void a() {
        try {
            if (this.f1447a) {
                return;
            }
            Boolean c10 = c();
            this.f1450d = c10;
            if (c10 == null) {
                InterfaceC1731b interfaceC1731b = new InterfaceC1731b() { // from class: D5.q
                    @Override // t5.InterfaceC1731b
                    public final void a(C1730a c1730a) {
                        r rVar = r.this;
                        if (rVar.b()) {
                            F5.c cVar = FirebaseMessaging.f12055l;
                            ((FirebaseMessaging) rVar.f1451e).k();
                        }
                    }
                };
                this.f1449c = interfaceC1731b;
                W4.k kVar = (W4.k) ((InterfaceC1733d) this.f1448b);
                kVar.b(kVar.f8142c, interfaceC1731b);
            }
            this.f1447a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean b() {
        Boolean bool;
        try {
            a();
            bool = (Boolean) this.f1450d;
        } catch (Throwable th) {
            throw th;
        }
        return bool != null ? bool.booleanValue() : ((FirebaseMessaging) this.f1451e).f12058a.k();
    }

    public Boolean c() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        String string2 = StubApp.getString2(1465);
        R4.h hVar = ((FirebaseMessaging) this.f1451e).f12058a;
        hVar.a();
        String string22 = StubApp.getString2(1466);
        Context context = hVar.f6193a;
        SharedPreferences sharedPreferences = context.getSharedPreferences(string22, 0);
        String string23 = StubApp.getString2(1467);
        if (sharedPreferences.contains(string23)) {
            return Boolean.valueOf(sharedPreferences.getBoolean(string23, false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(string2)) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean(string2));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public r(FirebaseMessaging firebaseMessaging, InterfaceC1733d interfaceC1733d) {
        this.f1451e = firebaseMessaging;
        this.f1448b = interfaceC1733d;
    }
}
