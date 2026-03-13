package M2;

import io.flutter.plugin.common.PluginRegistry;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class b implements PluginRegistry.RequestPermissionsResultListener {
    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public final boolean onRequestPermissionsResult(int i3, String[] permissions, int[] grantResults) {
        LinkedHashMap linkedHashMap = c.f4515g;
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        Intrinsics.checkNotNullParameter(O2.c.f5198a, "<this>");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        LinkedHashMap linkedHashMap2 = O2.c.f5199b;
        Function1 function1 = (Function1) linkedHashMap2.get(Integer.valueOf(i3));
        if (function1 != null) {
            boolean z2 = false;
            if (grantResults.length != 0 && grantResults[0] == 0) {
                z2 = true;
            }
            function1.invoke(Boolean.valueOf(z2));
        }
        return true;
    }
}
