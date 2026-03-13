package io.flutter.plugin.platform;

import android.view.Surface;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface PlatformViewRenderTarget {
    int getHeight();

    long getId();

    Surface getSurface();

    int getWidth();

    boolean isReleased();

    void release();

    void resize(int i3, int i10);

    default void scheduleFrame() {
    }
}
