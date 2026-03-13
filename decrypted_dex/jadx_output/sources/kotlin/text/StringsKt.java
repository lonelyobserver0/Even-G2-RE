package kotlin.text;

import kotlin.Metadata;

@Metadata(d1 = {"kotlin/text/StringsKt__AppendableKt", "kotlin/text/StringsKt__IndentKt", "kotlin/text/StringsKt__RegexExtensionsJVMKt", "kotlin/text/StringsKt__RegexExtensionsKt", "kotlin/text/StringsKt__StringBuilderJVMKt", "kotlin/text/StringsKt__StringBuilderKt", "kotlin/text/StringsKt__StringNumberConversionsJVMKt", "kotlin/text/StringsKt__StringNumberConversionsKt", "kotlin/text/StringsKt__StringsJVMKt", "kotlin/text/StringsKt__StringsKt", "kotlin/text/StringsKt___StringsJvmKt", "kotlin/text/StringsKt___StringsKt"}, k = 4, mv = {2, 2, 0}, xi = 49)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class StringsKt extends StringsKt___StringsKt {
    private StringsKt() {
    }

    public static /* bridge */ /* synthetic */ boolean L(String str, String str2) {
        return StringsKt__StringsJVMKt.startsWith(str, str2, true);
    }

    public static /* bridge */ /* synthetic */ boolean O(String str, String str2) {
        return StringsKt__StringsJVMKt.startsWith$default(str, str2, false, 2, null);
    }

    public static /* bridge */ /* synthetic */ boolean u(String str, String str2) {
        return StringsKt__StringsJVMKt.endsWith$default(str, str2, false, 2, null);
    }

    public static /* bridge */ /* synthetic */ int x(String str, String str2) {
        return StringsKt__StringsKt.indexOf$default((CharSequence) str, str2, 0, false, 6, (Object) null);
    }
}
