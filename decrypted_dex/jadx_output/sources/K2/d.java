package K2;

import com.stub.StubApp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d {
    public static long a(String dateString) {
        Intrinsics.checkNotNullParameter(dateString, "dateString");
        Intrinsics.checkNotNullParameter("yyyy-MM-dd HH:mm:ss", StubApp.getString2(3255));
        Date parse = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).parse(dateString);
        if (parse != null) {
            return parse.getTime();
        }
        return 0L;
    }
}
