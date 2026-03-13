package L1;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class a {
    public static boolean a(String current, String str) {
        CharSequence trim;
        Intrinsics.checkNotNullParameter(current, "current");
        if (Intrinsics.areEqual(current, str)) {
            return true;
        }
        if (current.length() != 0) {
            int i3 = 0;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i3 < current.length()) {
                    char charAt = current.charAt(i3);
                    int i12 = i11 + 1;
                    if (i11 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt != '(') {
                        if (charAt == ')' && i10 - 1 == 0 && i11 != current.length() - 1) {
                            break;
                        }
                    } else {
                        i10++;
                    }
                    i3++;
                    i11 = i12;
                } else if (i10 == 0) {
                    String substring = current.substring(1, current.length() - 1);
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    trim = StringsKt__StringsKt.trim((CharSequence) substring);
                    return Intrinsics.areEqual(trim.toString(), str);
                }
            }
        }
        return false;
    }
}
