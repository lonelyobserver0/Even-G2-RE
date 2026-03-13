package C;

import android.app.Notification;
import android.graphics.drawable.Icon;
import android.os.Parcelable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class p {
    public static Parcelable a(Icon icon) {
        return icon;
    }

    public static void b(Notification.Builder builder, Icon icon) {
        builder.setLargeIcon(icon);
    }
}
