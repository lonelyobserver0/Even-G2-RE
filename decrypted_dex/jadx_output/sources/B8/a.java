package B8;

import D9.l;
import J1.s;
import O1.b;
import O1.c;
import P1.i;
import android.content.Context;
import com.stub.StubApp;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f743a;

    public a(Context applicationContext, int i3) {
        switch (i3) {
            case 1:
                this.f743a = applicationContext;
                break;
            default:
                Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
                this.f743a = applicationContext;
                break;
        }
    }

    public static String a(String str) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        boolean exists = file.exists();
        String string2 = StubApp.getString2(691);
        if (!exists) {
            l.e(StubApp.getString2(694) + file.getAbsolutePath(), string2);
            return null;
        }
        l.f(StubApp.getString2(692) + file.length() + StubApp.getString2(693), string2);
        return file.getAbsolutePath();
    }

    public String b() {
        String absolutePath = new File(this.f743a.getFilesDir(), StubApp.getString2(695)).getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "File(applicationContext.…ATH_SUB_DIR).absolutePath");
        return a(absolutePath);
    }

    @Override // O1.b
    public c p(O0.l lVar) {
        Context context = this.f743a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        String string2 = StubApp.getString2(696);
        s sVar = (s) lVar.f5145d;
        Intrinsics.checkNotNullParameter(sVar, string2);
        if (sVar == null) {
            throw new IllegalArgumentException(StubApp.getString2(698));
        }
        String str = (String) lVar.f5144c;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException(StubApp.getString2(697));
        }
        O0.l configuration = new O0.l(context, str, sVar, true);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new i((Context) configuration.f5143b, (String) configuration.f5144c, (s) configuration.f5145d, configuration.f5142a);
    }
}
