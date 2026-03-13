package Y3;

import S3.D;
import android.app.Service;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8739a;

    public b(Context context) {
        this.f8739a = context;
    }

    public ApplicationInfo a(int i3, String str) {
        return this.f8739a.getPackageManager().getApplicationInfo(str, i3);
    }

    public PackageInfo b(int i3, String str) {
        return this.f8739a.getPackageManager().getPackageInfo(str, i3);
    }

    public boolean c() {
        int callingUid = Binder.getCallingUid();
        int myUid = Process.myUid();
        Context context = this.f8739a;
        if (callingUid == myUid) {
            return a.o(context);
        }
        String nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid());
        if (nameForUid != null) {
            return context.getPackageManager().isInstantApp(nameForUid);
        }
        return false;
    }

    public b(Service service) {
        D.h(service);
        Context origApplicationContext = StubApp.getOrigApplicationContext(service.getApplicationContext());
        D.h(origApplicationContext);
        this.f8739a = origApplicationContext;
    }
}
