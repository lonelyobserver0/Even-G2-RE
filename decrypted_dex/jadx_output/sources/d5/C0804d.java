package d5;

import android.util.Log;
import com.stub.StubApp;
import kotlin.jvm.functions.Function0;

/* renamed from: d5.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0804d {
    public static void a(Function0 function0, Function0 function02) {
        if (((Boolean) function0.invoke()).booleanValue()) {
            return;
        }
        String str = (String) function02.invoke();
        String string2 = StubApp.getString2(280);
        if (Log.isLoggable(string2, 3)) {
            Log.d(string2, str, null);
        }
    }
}
