package io.flutter.plugin.common;

import android.content.Intent;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface PluginRegistry {

    public interface ActivityResultListener {
        boolean onActivityResult(int i3, int i10, Intent intent);
    }

    public interface NewIntentListener {
        boolean onNewIntent(Intent intent);
    }

    public interface RequestPermissionsResultListener {
        boolean onRequestPermissionsResult(int i3, String[] strArr, int[] iArr);
    }

    public interface UserLeaveHintListener {
        void onUserLeaveHint();
    }

    public interface WindowFocusChangedListener {
        void onWindowFocusChanged(boolean z2);
    }
}
