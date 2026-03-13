package io.flutter.plugin.platform;

import android.view.View;
import io.flutter.view.l;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface PlatformViewsAccessibilityDelegate {
    void attachAccessibilityBridge(l lVar);

    void detachAccessibilityBridge();

    View getPlatformViewById(int i3);

    boolean usesVirtualDisplay(int i3);
}
