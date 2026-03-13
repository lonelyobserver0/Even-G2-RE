package s2;

import android.content.ComponentName;
import android.content.Context;
import com.stub.StubApp;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final String f20713a = i2.o.g(StubApp.getString2(23097));

    public static void a(Context context, Class cls, boolean z2) {
        String string2 = StubApp.getString2(23098);
        String string22 = StubApp.getString2(427);
        String str = f20713a;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z2 ? 1 : 2, 1);
            i2.o.e().b(str, cls.getName() + StubApp.getString2("397") + (z2 ? string22 : string2), new Throwable[0]);
        } catch (Exception e10) {
            i2.o e11 = i2.o.e();
            String name = cls.getName();
            if (z2) {
                string2 = string22;
            }
            e11.b(str, AbstractC1482f.h(name, StubApp.getString2(23099), string2), e10);
        }
    }
}
