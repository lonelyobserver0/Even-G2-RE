package C;

import android.app.Notification;
import android.app.Person;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class x {
    public static Notification.MessagingStyle a(Person person) {
        return new Notification.MessagingStyle(person);
    }

    public static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean z2) {
        return messagingStyle.setGroupConversation(z2);
    }
}
