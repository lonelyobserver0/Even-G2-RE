package io.flutter.view;

import android.view.Surface;
import androidx.annotation.Keep;

@Keep
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface TextureRegistry$SurfaceProducer {
    int getHeight();

    Surface getSurface();

    int getWidth();

    boolean handlesCropAndRotation();

    /* synthetic */ long id();

    /* synthetic */ void release();

    void scheduleFrame();

    void setCallback(q qVar);

    void setSize(int i3, int i10);
}
