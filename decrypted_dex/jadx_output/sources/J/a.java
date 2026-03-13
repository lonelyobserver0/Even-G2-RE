package J;

import android.os.Build;
import com.stub.StubApp;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class a {
    static {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            G.a.b(30);
        }
        if (i3 >= 30) {
            G.a.b(31);
        }
        if (i3 >= 30) {
            G.a.b(33);
        }
        if (i3 >= 30) {
            G.a.b(DurationKt.NANOS_IN_MILLIS);
        }
    }

    public static final boolean a() {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31) {
            return true;
        }
        if (i3 >= 30) {
            String buildCodename = Build.VERSION.CODENAME;
            Intrinsics.checkNotNullExpressionValue(buildCodename, "CODENAME");
            String codename = StubApp.getString2(1384);
            Intrinsics.checkNotNullParameter(codename, "codename");
            Intrinsics.checkNotNullParameter(buildCodename, "buildCodename");
            if (!Intrinsics.areEqual("REL", buildCodename)) {
                Locale locale = Locale.ROOT;
                String upperCase = buildCodename.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                Integer num = Intrinsics.areEqual(upperCase, "BAKLAVA") ? 0 : null;
                String upperCase2 = codename.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                Integer num2 = Intrinsics.areEqual(upperCase2, "BAKLAVA") ? 0 : null;
                if (num == null || num2 == null) {
                    if (num == null && num2 == null) {
                        String upperCase3 = buildCodename.toUpperCase(locale);
                        Intrinsics.checkNotNullExpressionValue(upperCase3, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                        String upperCase4 = codename.toUpperCase(locale);
                        Intrinsics.checkNotNullExpressionValue(upperCase4, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                        if (upperCase3.compareTo(upperCase4) >= 0) {
                            return true;
                        }
                    } else if (num != null) {
                        return true;
                    }
                } else if (num.intValue() >= num2.intValue()) {
                    return true;
                }
            }
        }
        return false;
    }
}
