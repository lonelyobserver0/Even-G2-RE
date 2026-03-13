package C;

import android.app.Notification;
import android.app.Person;
import android.os.Parcelable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class q {
    public static Notification.Builder a(Notification.Builder builder, Person person) {
        return builder.addPerson(person);
    }

    public static Parcelable b(Person person) {
        return person;
    }
}
