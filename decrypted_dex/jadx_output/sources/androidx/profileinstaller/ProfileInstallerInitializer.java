package androidx.profileinstaller;

import I4.e;
import R1.b;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ProfileInstallerInitializer implements b {
    @Override // R1.b
    public final Object create(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: H1.e
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                ProfileInstallerInitializer.this.getClass();
                Handler.createAsync(Looper.getMainLooper()).postDelayed(new f(applicationContext, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
            }
        });
        return new e(9);
    }

    @Override // R1.b
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
