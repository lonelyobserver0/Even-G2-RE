package C;

import android.app.Notification;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class v {
    public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
        return messagingStyle.addMessage(message);
    }

    public static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
        return messagingStyle.setConversationTitle(charSequence);
    }
}
