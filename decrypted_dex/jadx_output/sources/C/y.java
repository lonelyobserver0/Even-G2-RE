package C;

import android.app.Notification;
import android.net.Uri;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class y {
    public static Notification.MessagingStyle.Message a(Notification.MessagingStyle.Message message, String str, Uri uri) {
        return message.setData(str, uri);
    }
}
