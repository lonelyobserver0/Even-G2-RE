package C2;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.GoogleApiAvailability;
import io.flutter.plugin.common.PluginRegistry;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h implements PluginRegistry.ActivityResultListener {

    /* renamed from: b, reason: collision with root package name */
    public static h f1073b;

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f1074a = new CopyOnWriteArrayList();

    public static j a(Context context, boolean z2, m mVar) {
        if (z2) {
            return new k(context, mVar);
        }
        try {
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                return new g(context, mVar);
            }
        } catch (NoClassDefFoundError unused) {
        }
        return new k(context, mVar);
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public final boolean onActivityResult(int i3, int i10, Intent intent) {
        Iterator it = this.f1074a.iterator();
        while (it.hasNext()) {
            if (((j) it.next()).c(i3, i10)) {
                return true;
            }
        }
        return false;
    }
}
