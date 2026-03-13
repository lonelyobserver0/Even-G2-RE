package l;

import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class l {
    public static void a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i3) {
        callback.onProvideKeyboardShortcuts(list, menu, i3);
    }
}
