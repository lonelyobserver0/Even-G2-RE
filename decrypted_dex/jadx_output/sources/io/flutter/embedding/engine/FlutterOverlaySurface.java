package io.flutter.embedding.engine;

import android.view.Surface;
import androidx.annotation.Keep;

@Keep
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class FlutterOverlaySurface {
    private final int id;
    private final Surface surface;

    public FlutterOverlaySurface(int i3, Surface surface) {
        this.id = i3;
        this.surface = surface;
    }

    public int getId() {
        return this.id;
    }

    public Surface getSurface() {
        return this.surface;
    }
}
