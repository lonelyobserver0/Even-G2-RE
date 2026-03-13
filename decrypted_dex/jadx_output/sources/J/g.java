package J;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3258a = 0;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                Trace.class.getField(StubApp.getString2("2891")).getLong(null);
                String string2 = StubApp.getString2("2892");
                Class cls = Long.TYPE;
                Trace.class.getMethod(string2, cls);
                String string22 = StubApp.getString2("2893");
                Class cls2 = Integer.TYPE;
                Trace.class.getMethod(string22, cls, String.class, cls2);
                Trace.class.getMethod(StubApp.getString2("2894"), cls, String.class, cls2);
                Trace.class.getMethod(StubApp.getString2("2895"), cls, String.class, cls2);
            } catch (Exception e10) {
                Log.i(StubApp.getString2(2896), StubApp.getString2(2897), e10);
            }
        }
    }
}
