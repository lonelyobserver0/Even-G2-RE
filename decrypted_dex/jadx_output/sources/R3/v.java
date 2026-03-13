package R3;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class v extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public Context f6162a;

    /* renamed from: b, reason: collision with root package name */
    public final u f6163b;

    public v(u uVar) {
        this.f6163b = uVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if (StubApp.getString2(0).equals(data != null ? data.getSchemeSpecificPart() : null)) {
            H h2 = (H) this.f6163b;
            I i3 = (I) h2.f6101b.f5734c;
            i3.f6103c.set(null);
            i3.k();
            Dialog dialog = h2.f6100a;
            if (dialog.isShowing()) {
                dialog.dismiss();
            }
            synchronized (this) {
                try {
                    Context context2 = this.f6162a;
                    if (context2 != null) {
                        context2.unregisterReceiver(this);
                    }
                    this.f6162a = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
