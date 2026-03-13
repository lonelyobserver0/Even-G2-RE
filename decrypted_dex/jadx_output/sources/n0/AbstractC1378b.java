package n0;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;

/* renamed from: n0.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1378b {
    @SuppressLint({"MissingPermission"})
    public static Notification.MediaStyle a(Notification.MediaStyle mediaStyle, CharSequence charSequence, int i3, PendingIntent pendingIntent, Boolean bool) {
        if (bool.booleanValue()) {
            mediaStyle.setRemotePlaybackInfo(charSequence, i3, pendingIntent);
        }
        return mediaStyle;
    }
}
