package T8;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b extends Mb.b {
    @Override // Mb.b
    public final Mb.b i(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "<this>");
        AudioManager audioManager = (AudioManager) context.getSystemService(StubApp.getString2(643));
        if (audioManager == null) {
            return new d();
        }
        AudioDeviceInfo[] devices = audioManager.getDevices(2);
        Intrinsics.checkNotNullExpressionValue(devices, "devices");
        if (devices.length != 0) {
            return new b();
        }
        Mb.b bVar = (Mb.b) this.f4728a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chain");
            bVar = null;
        }
        return bVar.i(context);
    }
}
