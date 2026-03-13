package kotlin.text;

import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0007\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001d\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u001d\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a%\u0010\u0006\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a%\u0010\u0006\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0014\u0010\t\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u0002H\u0007\u001a!\u0010\n\u001a\u00020\u000b*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\fH\u0087\n\u001a-\u0010\r\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0010H\u0087\b\u001a\u001d\u0010\u0011\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0087\b\u001a%\u0010\u0012\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0087\b\u001a7\u0010\u0013\u001a\u00020\u000b*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\bH\u0087\b\u001a-\u0010\u0017\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0087\b\u001a-\u0010\u0017\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0087\b\u001a5\u0010\u0019\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0087\b\u001a5\u0010\u0019\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0087\b\u001a\u001f\u0010\u001a\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u001bH\u0087\b\u001a%\u0010\u001a\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u000e\u0010\u0003\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002H\u0087\b\u001a\u001d\u0010\u001a\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\bH\u0087\b\u001a\u001d\u0010\u001a\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u001d\u0010\u001a\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u001d\u0010\u001a\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u001cH\u0087\b\u001a\u001d\u0010\u001a\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u001dH\u0087\b\u001a\u001d\u0010\u001a\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u001eH\u0087\b\u001a\u0014\u0010\u001f\u001a\u00060 j\u0002`!*\u00060 j\u0002`!H\u0007\u001a\u001f\u0010\u001f\u001a\u00060 j\u0002`!*\u00060 j\u0002`!2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0018H\u0087\b\u001a\u001d\u0010\u001f\u001a\u00060 j\u0002`!*\u00060 j\u0002`!2\u0006\u0010\u0003\u001a\u00020\fH\u0087\b\u001a\u0014\u0010\u001f\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u0002H\u0007\u001a\u001f\u0010\u001f\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u001bH\u0087\b\u001a\u001f\u0010\u001f\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0018H\u0087\b\u001a\u001f\u0010\u001f\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0010H\u0087\b\u001a\u001f\u0010\u001f\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\"H\u0087\b\u001a%\u0010\u001f\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u000e\u0010\u0003\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002H\u0087\b\u001a\u001d\u0010\u001f\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0015H\u0087\b\u001a\u001d\u0010\u001f\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\fH\u0087\b\u001a\u001d\u0010\u001f\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020#H\u0087\b\u001a\u001d\u0010\u001f\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\bH\u0087\b\u001a\u001d\u0010\u001f\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u001d\u0010\u001f\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u001d\u0010\u001f\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u001cH\u0087\b\u001a\u001d\u0010\u001f\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u001dH\u0087\b\u001a\u001d\u0010\u001f\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u001eH\u0087\b¨\u0006$"}, d2 = {"append", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "value", "", "", "insert", "index", "", "clear", "set", "", "", "setRange", "startIndex", "endIndex", "", "deleteAt", "deleteRange", "toCharArray", "destination", "", "destinationOffset", "appendRange", "", "insertRange", "appendLine", "Ljava/lang/StringBuffer;", "", "", "", "appendln", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "", "", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/text/StringsKt")
@SourceDebugExtension({"SMAP\nStringBuilderJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringBuilderJVM.kt\nkotlin/text/StringsKt__StringBuilderJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,417:1\n1#2:418\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class StringsKt__StringBuilderJVMKt extends StringsKt__RegexExtensionsKt {
    @SinceKotlin(version = "1.9")
    @InlineOnly
    private static final StringBuilder append(StringBuilder sb2, byte b2) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append((int) b2);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return sb2;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final StringBuilder appendLine(StringBuilder sb2, StringBuffer stringBuffer) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(stringBuffer);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        return sb2;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final StringBuilder appendRange(StringBuilder sb2, char[] value, int i3, int i10) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        sb2.append(value, i3, i10 - i3);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return sb2;
    }

    @Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.4")
    public static final Appendable appendln(Appendable appendable) {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Appendable append = appendable.append(SystemProperties.LINE_SEPARATOR);
        Intrinsics.checkNotNullExpressionValue(append, "append(...)");
        return append;
    }

    @SinceKotlin(version = "1.3")
    public static final StringBuilder clear(StringBuilder sb2) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.setLength(0);
        return sb2;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final StringBuilder deleteAt(StringBuilder sb2, int i3) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        StringBuilder deleteCharAt = sb2.deleteCharAt(i3);
        Intrinsics.checkNotNullExpressionValue(deleteCharAt, "deleteCharAt(...)");
        return deleteCharAt;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final StringBuilder deleteRange(StringBuilder sb2, int i3, int i10) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        StringBuilder delete = sb2.delete(i3, i10);
        Intrinsics.checkNotNullExpressionValue(delete, "delete(...)");
        return delete;
    }

    @SinceKotlin(version = "1.9")
    @InlineOnly
    private static final StringBuilder insert(StringBuilder sb2, int i3, byte b2) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        StringBuilder insert = sb2.insert(i3, (int) b2);
        Intrinsics.checkNotNullExpressionValue(insert, "insert(...)");
        return insert;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final StringBuilder insertRange(StringBuilder sb2, int i3, char[] value, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        StringBuilder insert = sb2.insert(i3, value, i10, i11 - i10);
        Intrinsics.checkNotNullExpressionValue(insert, "insert(...)");
        return insert;
    }

    @InlineOnly
    private static final void set(StringBuilder sb2, int i3, char c10) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.setCharAt(i3, c10);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final StringBuilder setRange(StringBuilder sb2, int i3, int i10, String value) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        StringBuilder replace = sb2.replace(i3, i10, value);
        Intrinsics.checkNotNullExpressionValue(replace, "replace(...)");
        return replace;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final void toCharArray(StringBuilder sb2, char[] destination, int i3, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        sb2.getChars(i10, i11, destination, i3);
    }

    public static /* synthetic */ void toCharArray$default(StringBuilder sb2, char[] destination, int i3, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i3 = 0;
        }
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = sb2.length();
        }
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        sb2.getChars(i10, i11, destination, i3);
    }

    @SinceKotlin(version = "1.9")
    @InlineOnly
    private static final StringBuilder append(StringBuilder sb2, short s10) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append((int) s10);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return sb2;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final StringBuilder appendLine(StringBuilder sb2, StringBuilder sb3) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append((CharSequence) sb3);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        return sb2;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final StringBuilder appendRange(StringBuilder sb2, CharSequence value, int i3, int i10) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        sb2.append(value, i3, i10);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return sb2;
    }

    @Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.4")
    @InlineOnly
    private static final Appendable appendln(Appendable appendable, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Appendable append = appendable.append(charSequence);
        Intrinsics.checkNotNullExpressionValue(append, "append(...)");
        return appendln(append);
    }

    @SinceKotlin(version = "1.9")
    @InlineOnly
    private static final StringBuilder insert(StringBuilder sb2, int i3, short s10) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        StringBuilder insert = sb2.insert(i3, (int) s10);
        Intrinsics.checkNotNullExpressionValue(insert, "insert(...)");
        return insert;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final StringBuilder insertRange(StringBuilder sb2, int i3, CharSequence value, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        StringBuilder insert = sb2.insert(i3, value, i10, i11);
        Intrinsics.checkNotNullExpressionValue(insert, "insert(...)");
        return insert;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final StringBuilder appendLine(StringBuilder sb2, int i3) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(i3);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        return sb2;
    }

    @Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.4")
    @InlineOnly
    private static final Appendable appendln(Appendable appendable, char c10) {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Appendable append = appendable.append(c10);
        Intrinsics.checkNotNullExpressionValue(append, "append(...)");
        return appendln(append);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final StringBuilder appendLine(StringBuilder sb2, short s10) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append((int) s10);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        return sb2;
    }

    @Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.4")
    public static final StringBuilder appendln(StringBuilder sb2) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(SystemProperties.LINE_SEPARATOR);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return sb2;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final StringBuilder appendLine(StringBuilder sb2, byte b2) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append((int) b2);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        return sb2;
    }

    @Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.4")
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder sb2, StringBuffer stringBuffer) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(stringBuffer);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return appendln(sb2);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final StringBuilder appendLine(StringBuilder sb2, long j) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(j);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        return sb2;
    }

    @Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.4")
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder sb2, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(charSequence);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return appendln(sb2);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final StringBuilder appendLine(StringBuilder sb2, float f10) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(f10);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        return sb2;
    }

    @Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.4")
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder sb2, String str) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(str);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return appendln(sb2);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final StringBuilder appendLine(StringBuilder sb2, double d8) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(d8);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        return sb2;
    }

    @Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.4")
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder sb2, Object obj) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(obj);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return appendln(sb2);
    }

    @Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.4")
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder sb2, StringBuilder sb3) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append((CharSequence) sb3);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return appendln(sb2);
    }

    @Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.4")
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder sb2, char[] value) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        sb2.append(value);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return appendln(sb2);
    }

    @Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.4")
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder sb2, char c10) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(c10);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return appendln(sb2);
    }

    @Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.4")
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder sb2, boolean z2) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(z2);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return appendln(sb2);
    }

    @Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.4")
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder sb2, int i3) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(i3);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return appendln(sb2);
    }

    @Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.4")
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder sb2, short s10) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append((int) s10);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return appendln(sb2);
    }

    @Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.4")
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder sb2, byte b2) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append((int) b2);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return appendln(sb2);
    }

    @Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.4")
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder sb2, long j) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(j);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return appendln(sb2);
    }

    @Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.4")
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder sb2, float f10) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(f10);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return appendln(sb2);
    }

    @Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.4")
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder sb2, double d8) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(d8);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return appendln(sb2);
    }
}
