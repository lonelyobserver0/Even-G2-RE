package n3;

import com.stub.StubApp;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class a {
    public static final String a(String str) {
        boolean contains$default;
        List<String> split$default;
        Intrinsics.checkNotNullParameter(str, "<this>");
        String string2 = StubApp.getString2(4956);
        contains$default = StringsKt__StringsKt.contains$default(str, (CharSequence) string2, false, 2, (Object) null);
        String string22 = StubApp.getString2(3673);
        if (!contains$default) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, string22);
            return lowerCase;
        }
        String lowerCase2 = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, string22);
        split$default = StringsKt__StringsKt.split$default(lowerCase2, new String[]{string2}, false, 0, 6, (Object) null);
        String str2 = "";
        for (String str3 : split$default) {
            if (!Intrinsics.areEqual(str3, CollectionsKt.first(split$default)) && str3.length() > 0) {
                StringBuilder sb2 = new StringBuilder();
                String valueOf = String.valueOf(str3.charAt(0));
                Intrinsics.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
                String upperCase = valueOf.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                sb2.append((Object) upperCase);
                String substring = str3.substring(1);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                sb2.append(substring);
                str3 = sb2.toString();
            }
            str2 = ((Object) str2) + str3;
        }
        return str2;
    }
}
