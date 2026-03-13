package f2;

import android.content.Context;
import android.text.TextUtils;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class h {
    public static SidecarInterface a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return SidecarProvider.getSidecarImpl(StubApp.getOrigApplicationContext(context.getApplicationContext()));
    }

    public static Z1.i b() {
        try {
            String apiVersion = SidecarProvider.getApiVersion();
            if (TextUtils.isEmpty(apiVersion)) {
                return null;
            }
            Z1.i iVar = Z1.i.f8964f;
            return Oc.a.I(apiVersion);
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return null;
        }
    }
}
