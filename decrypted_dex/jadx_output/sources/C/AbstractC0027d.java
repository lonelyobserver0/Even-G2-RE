package C;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;

/* renamed from: C.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractC0027d {
    public static String a(Context context) {
        return context.getOpPackageName();
    }

    public static void b(Notification.Builder builder, boolean z2) {
        builder.setAllowSystemGeneratedContextualActions(z2);
    }

    public static void c(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static void d(Notification.Action.Builder builder, boolean z2) {
        builder.setContextual(z2);
    }

    public static void e(RemoteInput.Builder builder) {
        builder.setEditChoicesBeforeSending(0);
    }
}
