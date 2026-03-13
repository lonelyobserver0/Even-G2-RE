package N;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class H {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C0160f b(View view, C0160f c0160f) {
        ContentInfo g10 = c0160f.f4781a.g();
        Objects.requireNonNull(g10);
        ContentInfo performReceiveContent = view.performReceiveContent(g10);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == g10 ? c0160f : new C0160f(new s2.d(performReceiveContent));
    }
}
