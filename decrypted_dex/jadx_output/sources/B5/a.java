package B5;

import R4.b;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.stub.StubApp;
import t5.C1730a;
import t5.InterfaceC1732c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f663a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f664b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1732c f665c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f666d;

    public a(Context context, String str, InterfaceC1732c interfaceC1732c) {
        Context createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        this.f663a = createDeviceProtectedStorageContext;
        SharedPreferences sharedPreferences = createDeviceProtectedStorageContext.getSharedPreferences(StubApp.getString2(641) + str, 0);
        this.f664b = sharedPreferences;
        this.f665c = interfaceC1732c;
        String string2 = StubApp.getString2(642);
        this.f666d = sharedPreferences.contains(string2) ? sharedPreferences.getBoolean(string2, true) : a();
    }

    public final boolean a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        String string2 = StubApp.getString2(642);
        Context context = this.f663a;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(string2)) {
                return true;
            }
            return applicationInfo.metaData.getBoolean(string2);
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public final synchronized void b(boolean z2) {
        if (this.f666d != z2) {
            this.f666d = z2;
            this.f665c.a(new C1730a(new b(z2, 0)));
        }
    }
}
