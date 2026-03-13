package C;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.graphics.drawable.Icon;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class r {
    public static Notification.CallStyle a(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
    }

    public static Notification.CallStyle b(Person person, PendingIntent pendingIntent) {
        return Notification.CallStyle.forOngoingCall(person, pendingIntent);
    }

    public static Notification.CallStyle c(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
    }

    public static Notification.CallStyle d(Notification.CallStyle callStyle, int i3) {
        return callStyle.setAnswerButtonColorHint(i3);
    }

    public static Notification.CallStyle e(Notification.CallStyle callStyle, int i3) {
        return callStyle.setDeclineButtonColorHint(i3);
    }

    public static Notification.CallStyle f(Notification.CallStyle callStyle, boolean z2) {
        return callStyle.setIsVideo(z2);
    }

    public static Notification.CallStyle g(Notification.CallStyle callStyle, Icon icon) {
        return callStyle.setVerificationIcon(icon);
    }

    public static Notification.CallStyle h(Notification.CallStyle callStyle, CharSequence charSequence) {
        return callStyle.setVerificationText(charSequence);
    }
}
