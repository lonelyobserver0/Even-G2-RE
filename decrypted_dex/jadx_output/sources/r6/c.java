package r6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class c implements ServiceConnection {
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName className, IBinder service) {
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(service, "service");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName className) {
        Intrinsics.checkNotNullParameter(className, "className");
    }
}
