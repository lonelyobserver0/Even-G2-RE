package H5;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.util.Base64;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2761a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f2762b;

    static {
        String processName;
        if (Build.VERSION.SDK_INT > 33) {
            processName = Process.myProcessName();
            Intrinsics.checkNotNullExpressionValue(processName, "myProcessName()");
        } else {
            processName = Application.getProcessName();
            if (processName == null && (processName = W3.b.a()) == null) {
                processName = "";
            }
        }
        String encodeToString = Base64.encodeToString(StringsKt.encodeToByteArray(processName), 10);
        String string2 = StubApp.getString2(2566);
        f2761a = E1.a.k(string2, encodeToString, StubApp.getString2(2567));
        f2762b = E1.a.k(string2, encodeToString, StubApp.getString2(2568));
    }
}
