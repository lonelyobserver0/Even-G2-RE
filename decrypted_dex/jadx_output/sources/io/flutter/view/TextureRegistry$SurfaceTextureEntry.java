package io.flutter.view;

import android.graphics.SurfaceTexture;
import androidx.annotation.Keep;

@Keep
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface TextureRegistry$SurfaceTextureEntry {
    /* synthetic */ long id();

    /* synthetic */ void release();

    default void setOnFrameConsumedListener(o oVar) {
    }

    default void setOnTrimMemoryListener(p pVar) {
    }

    SurfaceTexture surfaceTexture();
}
