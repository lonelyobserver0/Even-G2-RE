package n6;

import android.hardware.Camera;
import android.util.Log;
import com.stub.StubApp;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: n6.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1389c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f17813a = 0;

    static {
        Pattern.compile(StubApp.getString2(1262));
    }

    public static String a(String str, List list, String... strArr) {
        StringBuilder l9 = com.mapbox.common.b.l(StubApp.getString2(21395), str, StubApp.getString2(21396));
        l9.append(Arrays.toString(strArr));
        String sb2 = l9.toString();
        String string2 = StubApp.getString2(21397);
        Log.i(string2, sb2);
        Log.i(string2, StubApp.getString2(21398) + str + StubApp.getString2(21399) + list);
        if (list != null) {
            for (String str2 : strArr) {
                if (list.contains(str2)) {
                    Log.i(string2, StubApp.getString2(21400) + str + StubApp.getString2(21401) + str2);
                    return str2;
                }
            }
        }
        Log.i(string2, StubApp.getString2(21402));
        return null;
    }

    public static void b(Camera.Parameters parameters, boolean z2) {
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        String string2 = StubApp.getString2(21403);
        String a3 = z2 ? a(string2, supportedFlashModes, StubApp.getString2(21081), StubApp.getString2(16330)) : a(string2, supportedFlashModes, StubApp.getString2(1484));
        if (a3 != null) {
            boolean equals = a3.equals(parameters.getFlashMode());
            String string22 = StubApp.getString2(21397);
            if (equals) {
                Log.i(string22, StubApp.getString2(21404).concat(a3));
            } else {
                Log.i(string22, StubApp.getString2(21405).concat(a3));
                parameters.setFlashMode(a3);
            }
        }
    }
}
