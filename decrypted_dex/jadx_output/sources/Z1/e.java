package Z1;

import androidx.window.extensions.WindowExtensionsProvider;
import kotlin.jvm.internal.Reflection;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class e {
    static {
        Reflection.getOrCreateKotlinClass(e.class).getSimpleName();
    }

    public static int a() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return 0;
        }
    }
}
