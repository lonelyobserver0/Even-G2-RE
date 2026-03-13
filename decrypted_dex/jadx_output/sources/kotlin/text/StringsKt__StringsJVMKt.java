package kotlin.text;

import i2.u;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.internal.InlineOnly;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0019\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0081\b\u001a\u001d\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0001H\u0081\b\u001a\u001d\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0081\b\u001a\u001d\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0001H\u0081\b\u001a \u0010\b\u001a\u00020\t*\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a$\u0010\f\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a$\u0010\f\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a$\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a$\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a\r\u0010\u0012\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010\u0013\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010\u0014\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010\u0015\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\f\u0010\u0016\u001a\u00020\u0002*\u00020\u0017H\u0007\u001a \u0010\u0016\u001a\u00020\u0002*\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u0001H\u0007\u001a \u0010\u001a\u001a\u00020\u0017*\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u0001H\u0007\u001a\f\u0010\u001b\u001a\u00020\u0002*\u00020\u001cH\u0007\u001a*\u0010\u001b\u001a\u00020\u0002*\u00020\u001c2\b\b\u0002\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\tH\u0007\u001a\f\u0010\u001e\u001a\u00020\u001c*\u00020\u0002H\u0007\u001a*\u0010\u001e\u001a\u00020\u001c*\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\tH\u0007\u001a\r\u0010\u001a\u001a\u00020\u0017*\u00020\u0002H\u0087\b\u001a3\u0010\u001a\u001a\u00020\u0017*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00172\b\b\u0002\u0010 \u001a\u00020\u00012\b\b\u0002\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u0001H\u0087\b\u001a*\u0010!\u001a\u00020\u0002*\u00020\u00022\u0016\u0010\"\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010$0#\"\u0004\u0018\u00010$H\u0087\b¢\u0006\u0002\u0010%\u001a2\u0010!\u001a\u00020\u0002*\u00020&2\u0006\u0010!\u001a\u00020\u00022\u0016\u0010\"\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010$0#\"\u0004\u0018\u00010$H\u0087\b¢\u0006\u0002\u0010'\u001a4\u0010!\u001a\u00020\u0002*\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010)2\u0016\u0010\"\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010$0#\"\u0004\u0018\u00010$H\u0087\b¢\u0006\u0002\u0010*\u001a<\u0010!\u001a\u00020\u0002*\u00020&2\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010!\u001a\u00020\u00022\u0016\u0010\"\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010$0#\"\u0004\u0018\u00010$H\u0087\b¢\u0006\u0002\u0010+\u001a\"\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020-*\u00020.2\u0006\u0010/\u001a\u0002002\b\b\u0002\u00101\u001a\u00020\u0001\u001a\u0015\u00102\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0001H\u0087\b\u001a\u001d\u00102\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0001H\u0087\b\u001a\u001c\u00103\u001a\u00020\t*\u00020\u00022\u0006\u00104\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a$\u00103\u001a\u00020\t*\u00020\u00022\u0006\u00104\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a\u001c\u00105\u001a\u00020\t*\u00020\u00022\u0006\u00106\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a)\u00107\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u001c2\u0006\u00109\u001a\u00020\u00012\u0006\u0010:\u001a\u00020\u00012\u0006\u0010;\u001a\u00020<H\u0087\b\u001a\u0019\u00107\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020<H\u0087\b\u001a!\u00107\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u001c2\u0006\u00109\u001a\u00020\u00012\u0006\u0010:\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00107\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u001cH\u0087\b\u001a\u0011\u00107\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u0017H\u0087\b\u001a!\u00107\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u00172\u0006\u00109\u001a\u00020\u00012\u0006\u0010:\u001a\u00020\u0001H\u0087\b\u001a!\u00107\u001a\u00020\u00022\u0006\u0010>\u001a\u00020?2\u0006\u00109\u001a\u00020\u00012\u0006\u0010:\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00107\u001a\u00020\u00022\u0006\u0010@\u001a\u00020AH\u0087\b\u001a\u0011\u00107\u001a\u00020\u00022\u0006\u0010B\u001a\u00020CH\u0087\b\u001a\u0015\u0010D\u001a\u00020\u0001*\u00020\u00022\u0006\u0010E\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010F\u001a\u00020\u0001*\u00020\u00022\u0006\u0010E\u001a\u00020\u0001H\u0087\b\u001a\u001d\u0010G\u001a\u00020\u0001*\u00020\u00022\u0006\u0010H\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0001H\u0087\b\u001a\u001c\u0010I\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a\u0015\u0010J\u001a\u00020\t*\u00020\u00022\u0006\u0010K\u001a\u00020.H\u0087\b\u001a\u0015\u0010J\u001a\u00020\t*\u00020\u00022\u0006\u0010B\u001a\u00020AH\u0087\b\u001a\u0019\u0010J\u001a\u00020\t*\u0004\u0018\u00010.2\b\u0010\n\u001a\u0004\u0018\u00010.H\u0087\u0004\u001a \u0010J\u001a\u00020\t*\u0004\u0018\u00010.2\b\u0010\n\u001a\u0004\u0018\u00010.2\u0006\u0010\u000b\u001a\u00020\tH\u0007\u001a\r\u0010L\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\u001d\u0010M\u001a\u00020\u0001*\u00020\u00022\u0006\u0010E\u001a\u00020\u00012\u0006\u0010N\u001a\u00020\u0001H\u0087\b\u001a4\u0010O\u001a\u00020\t*\u00020.2\u0006\u0010P\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020.2\u0006\u0010Q\u001a\u00020\u00012\u0006\u0010:\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a4\u0010O\u001a\u00020\t*\u00020\u00022\u0006\u0010P\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010Q\u001a\u00020\u00012\u0006\u0010:\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a\u0015\u0010\u0014\u001a\u00020\u0002*\u00020\u00022\u0006\u0010(\u001a\u00020)H\u0087\b\u001a\u0015\u0010\u0015\u001a\u00020\u0002*\u00020\u00022\u0006\u0010(\u001a\u00020)H\u0087\b\u001a\u0015\u0010\u0012\u001a\u00020\u0002*\u00020\u00022\u0006\u0010(\u001a\u00020)H\u0087\b\u001a\u0015\u0010\u0013\u001a\u00020\u0002*\u00020\u00022\u0006\u0010(\u001a\u00020)H\u0087\b\u001a\u0017\u0010R\u001a\u00020\u001c*\u00020\u00022\b\b\u0002\u0010;\u001a\u00020<H\u0087\b\u001a\u0017\u0010S\u001a\u000200*\u00020\u00022\b\b\u0002\u0010T\u001a\u00020\u0001H\u0087\b\u001a\f\u0010U\u001a\u00020\u0002*\u00020\u0002H\u0007\u001a\u0014\u0010U\u001a\u00020\u0002*\u00020\u00022\u0006\u0010(\u001a\u00020)H\u0007\u001a\f\u0010V\u001a\u00020\u0002*\u00020\u0002H\u0007\u001a\u0014\u0010V\u001a\u00020\u0002*\u00020\u00022\u0006\u0010(\u001a\u00020)H\u0007\u001a\u0012\u0010W\u001a\u00020\u0002*\u00020.2\u0006\u0010X\u001a\u00020\u0001\"%\u0010Y\u001a\u0012\u0012\u0004\u0012\u00020\u00020Zj\b\u0012\u0004\u0012\u00020\u0002`[*\u00020&8F¢\u0006\u0006\u001a\u0004\b\\\u0010]¨\u0006^"}, d2 = {"nativeIndexOf", "", "", "ch", "", "fromIndex", "str", "nativeLastIndexOf", "equals", "", "other", "ignoreCase", "replace", "oldChar", "newChar", "oldValue", "newValue", "replaceFirst", "toUpperCase", "uppercase", "toLowerCase", "lowercase", "concatToString", "", "startIndex", "endIndex", "toCharArray", "decodeToString", "", "throwOnInvalidSequence", "encodeToByteArray", "destination", "destinationOffset", "format", "args", "", "", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Lkotlin/String$Companion;", "(Lkotlin/jvm/internal/StringCompanionObject;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "locale", "Ljava/util/Locale;", "(Ljava/lang/String;Ljava/util/Locale;[Ljava/lang/Object;)Ljava/lang/String;", "(Lkotlin/jvm/internal/StringCompanionObject;Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "split", "", "", "regex", "Ljava/util/regex/Pattern;", "limit", "substring", "startsWith", "prefix", "endsWith", "suffix", "String", "bytes", "offset", "length", "charset", "Ljava/nio/charset/Charset;", "chars", "codePoints", "", "stringBuffer", "Ljava/lang/StringBuffer;", "stringBuilder", "Ljava/lang/StringBuilder;", "codePointAt", "index", "codePointBefore", "codePointCount", "beginIndex", "compareTo", "contentEquals", "charSequence", "intern", "offsetByCodePoints", "codePointOffset", "regionMatches", "thisOffset", "otherOffset", "toByteArray", "toPattern", "flags", "capitalize", "decapitalize", "repeat", "n", "CASE_INSENSITIVE_ORDER", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "getCASE_INSENSITIVE_ORDER", "(Lkotlin/jvm/internal/StringCompanionObject;)Ljava/util/Comparator;", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/text/StringsKt")
@SourceDebugExtension({"SMAP\nStringsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringsJVM.kt\nkotlin/text/StringsKt__StringsJVMKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,885:1\n1179#2,2:886\n1#3:888\n*S KotlinDebug\n*F\n+ 1 StringsJVM.kt\nkotlin/text/StringsKt__StringsJVMKt\n*L\n73#1:886,2\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class StringsKt__StringsJVMKt extends StringsKt__StringNumberConversionsKt {
    @InlineOnly
    private static final String String(byte[] bytes, int i3, int i10, Charset charset) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new String(bytes, i3, i10, charset);
    }

    @Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @ReplaceWith(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }", imports = {"java.util.Locale"}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static String capitalize(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        return capitalize(str, locale);
    }

    @InlineOnly
    private static final int codePointAt(String str, int i3) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.codePointAt(i3);
    }

    @InlineOnly
    private static final int codePointBefore(String str, int i3) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.codePointBefore(i3);
    }

    @InlineOnly
    private static final int codePointCount(String str, int i3, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.codePointCount(i3, i10);
    }

    public static final int compareTo(String str, String other, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return z2 ? str.compareToIgnoreCase(other) : str.compareTo(other);
    }

    public static /* synthetic */ int compareTo$default(String str, String str2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        return compareTo(str, str2, z2);
    }

    @SinceKotlin(version = "1.4")
    public static String concatToString(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new String(cArr);
    }

    public static /* synthetic */ String concatToString$default(char[] cArr, int i3, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i3 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = cArr.length;
        }
        return concatToString(cArr, i3, i10);
    }

    @InlineOnly
    private static final boolean contentEquals(String str, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        return str.contentEquals(charSequence);
    }

    @Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @ReplaceWith(expression = "replaceFirstChar { it.lowercase(Locale.getDefault()) }", imports = {"java.util.Locale"}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final String decapitalize(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() <= 0 || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        String substring = str.substring(0, 1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        Intrinsics.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = substring.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        sb2.append(lowerCase);
        String substring2 = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        sb2.append(substring2);
        return sb2.toString();
    }

    @SinceKotlin(version = "1.4")
    public static String decodeToString(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new String(bArr, Charsets.UTF_8);
    }

    public static /* synthetic */ String decodeToString$default(byte[] bArr, int i3, int i10, boolean z2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i3 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = bArr.length;
        }
        if ((i11 & 4) != 0) {
            z2 = false;
        }
        return decodeToString(bArr, i3, i10, z2);
    }

    @SinceKotlin(version = "1.4")
    public static byte[] encodeToByteArray(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }

    public static /* synthetic */ byte[] encodeToByteArray$default(String str, int i3, int i10, boolean z2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i3 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        if ((i11 & 4) != 0) {
            z2 = false;
        }
        return encodeToByteArray(str, i3, i10, z2);
    }

    public static boolean endsWith(String str, String suffix, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return !z2 ? str.endsWith(suffix) : regionMatches(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    public static /* synthetic */ boolean endsWith$default(String str, String str2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        return endsWith(str, str2, z2);
    }

    public static boolean equals(String str, String str2, boolean z2) {
        return str == null ? str2 == null : !z2 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static /* synthetic */ boolean equals$default(String str, String str2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        return equals(str, str2, z2);
    }

    @InlineOnly
    private static final String format(String str, Object... args) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        String format = String.format(str, Arrays.copyOf(args, args.length));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public static final Comparator<String> getCASE_INSENSITIVE_ORDER(StringCompanionObject stringCompanionObject) {
        Intrinsics.checkNotNullParameter(stringCompanionObject, "<this>");
        Comparator<String> CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        Intrinsics.checkNotNullExpressionValue(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        return CASE_INSENSITIVE_ORDER;
    }

    @InlineOnly
    private static final String intern(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String intern = str.intern();
        Intrinsics.checkNotNullExpressionValue(intern, "intern(...)");
        return intern;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final String lowercase(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @InlineOnly
    private static final int nativeIndexOf(String str, char c10, int i3) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.indexOf(c10, i3);
    }

    @InlineOnly
    private static final int nativeLastIndexOf(String str, char c10, int i3) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.lastIndexOf(c10, i3);
    }

    @InlineOnly
    private static final int offsetByCodePoints(String str, int i3, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.offsetByCodePoints(i3, i10);
    }

    public static final boolean regionMatches(CharSequence charSequence, int i3, CharSequence other, int i10, int i11, boolean z2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return ((charSequence instanceof String) && (other instanceof String)) ? regionMatches((String) charSequence, i3, (String) other, i10, i11, z2) : StringsKt__StringsKt.regionMatchesImpl(charSequence, i3, other, i10, i11, z2);
    }

    public static /* synthetic */ boolean regionMatches$default(CharSequence charSequence, int i3, CharSequence charSequence2, int i10, int i11, boolean z2, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            z2 = false;
        }
        return regionMatches(charSequence, i3, charSequence2, i10, i11, z2);
    }

    public static String repeat(CharSequence charSequence, int i3) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i3 < 0) {
            throw new IllegalArgumentException(u.s("Count 'n' must be non-negative, but was ", i3, '.').toString());
        }
        if (i3 == 0) {
            return "";
        }
        int i10 = 1;
        if (i3 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char charAt = charSequence.charAt(0);
            char[] cArr = new char[i3];
            for (int i11 = 0; i11 < i3; i11++) {
                cArr[i11] = charAt;
            }
            return new String(cArr);
        }
        StringBuilder sb2 = new StringBuilder(charSequence.length() * i3);
        if (1 <= i3) {
            while (true) {
                sb2.append(charSequence);
                if (i10 == i3) {
                    break;
                }
                i10++;
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNull(sb3);
        return sb3;
    }

    public static final String replace(String str, char c10, char c11, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!z2) {
            String replace = str.replace(c10, c11);
            Intrinsics.checkNotNullExpressionValue(replace, "replace(...)");
            return replace;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i3 = 0; i3 < str.length(); i3++) {
            char charAt = str.charAt(i3);
            if (CharsKt__CharKt.equals(charAt, c10, z2)) {
                charAt = c11;
            }
            sb2.append(charAt);
        }
        return sb2.toString();
    }

    public static /* synthetic */ String replace$default(String str, char c10, char c11, boolean z2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return replace(str, c10, c11, z2);
    }

    public static final String replaceFirst(String str, char c10, char c11, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int indexOf$default = StringsKt__StringsKt.indexOf$default(str, c10, 0, z2, 2, (Object) null);
        return indexOf$default < 0 ? str : StringsKt__StringsKt.replaceRange((CharSequence) str, indexOf$default, indexOf$default + 1, (CharSequence) String.valueOf(c11)).toString();
    }

    public static /* synthetic */ String replaceFirst$default(String str, char c10, char c11, boolean z2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return replaceFirst(str, c10, c11, z2);
    }

    public static final List<String> split(CharSequence charSequence, Pattern regex, int i3) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        StringsKt__StringsKt.requireNonNegativeLimit(i3);
        if (i3 == 0) {
            i3 = -1;
        }
        String[] split = regex.split(charSequence, i3);
        Intrinsics.checkNotNullExpressionValue(split, "split(...)");
        return ArraysKt.asList(split);
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, Pattern pattern, int i3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i3 = 0;
        }
        return split(charSequence, pattern, i3);
    }

    public static boolean startsWith(String str, String prefix, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return !z2 ? str.startsWith(prefix) : regionMatches(str, 0, prefix, 0, prefix.length(), z2);
    }

    public static /* synthetic */ boolean startsWith$default(String str, String str2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        return startsWith(str, str2, z2);
    }

    @InlineOnly
    private static final String substring(String str, int i3) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String substring = str.substring(i3);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    @InlineOnly
    private static final byte[] toByteArray(String str, Charset charset) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }

    public static /* synthetic */ byte[] toByteArray$default(String str, Charset charset, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }

    @SinceKotlin(version = "1.4")
    public static final char[] toCharArray(String str, int i3, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i3, i10, str.length());
        char[] cArr = new char[i10 - i3];
        str.getChars(i3, i10, cArr, 0);
        return cArr;
    }

    public static /* synthetic */ char[] toCharArray$default(String str, int i3, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i3 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        return toCharArray(str, i3, i10);
    }

    @Deprecated(message = "Use lowercase() instead.", replaceWith = @ReplaceWith(expression = "lowercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    @DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.5")
    @InlineOnly
    private static final String toLowerCase(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String lowerCase = str.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @InlineOnly
    private static final Pattern toPattern(String str, int i3) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Pattern compile = Pattern.compile(str, i3);
        Intrinsics.checkNotNullExpressionValue(compile, "compile(...)");
        return compile;
    }

    public static /* synthetic */ Pattern toPattern$default(String str, int i3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i3 = 0;
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Pattern compile = Pattern.compile(str, i3);
        Intrinsics.checkNotNullExpressionValue(compile, "compile(...)");
        return compile;
    }

    @Deprecated(message = "Use uppercase() instead.", replaceWith = @ReplaceWith(expression = "uppercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    @DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.5")
    @InlineOnly
    private static final String toUpperCase(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String upperCase = str.toUpperCase();
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final String uppercase(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    @InlineOnly
    private static final String String(byte[] bytes, Charset charset) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new String(bytes, charset);
    }

    @SinceKotlin(version = "1.4")
    @Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @ReplaceWith(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(locale) else it.toString() }", imports = {}))
    @LowPriorityInOverloadResolution
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final String capitalize(String str, Locale locale) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        if (str.length() <= 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if (!Character.isLowerCase(charAt)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        char titleCase = Character.toTitleCase(charAt);
        if (titleCase != Character.toUpperCase(charAt)) {
            sb2.append(titleCase);
        } else {
            String substring = str.substring(0, 1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            Intrinsics.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
            String upperCase = substring.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            sb2.append(upperCase);
        }
        String substring2 = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        sb2.append(substring2);
        return sb2.toString();
    }

    @SinceKotlin(version = "1.4")
    public static String concatToString(char[] cArr, int i3, int i10) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i3, i10, cArr.length);
        return new String(cArr, i3, i10 - i3);
    }

    @InlineOnly
    private static final boolean contentEquals(String str, StringBuffer stringBuilder) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(stringBuilder, "stringBuilder");
        return str.contentEquals(stringBuilder);
    }

    @SinceKotlin(version = "1.4")
    @Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @ReplaceWith(expression = "replaceFirstChar { it.lowercase(locale) }", imports = {}))
    @LowPriorityInOverloadResolution
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final String decapitalize(String str, Locale locale) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        if (str.length() <= 0 || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        String substring = str.substring(0, 1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        Intrinsics.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = substring.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        sb2.append(lowerCase);
        String substring2 = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        sb2.append(substring2);
        return sb2.toString();
    }

    @SinceKotlin(version = "1.4")
    public static final String decodeToString(byte[] bArr, int i3, int i10, boolean z2) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i3, i10, bArr.length);
        if (!z2) {
            return new String(bArr, i3, i10 - i3, Charsets.UTF_8);
        }
        CharsetDecoder newDecoder = Charsets.UTF_8.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        String charBuffer = newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr, i3, i10 - i3)).toString();
        Intrinsics.checkNotNullExpressionValue(charBuffer, "toString(...)");
        return charBuffer;
    }

    @SinceKotlin(version = "1.4")
    public static final byte[] encodeToByteArray(String str, int i3, int i10, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i3, i10, str.length());
        if (!z2) {
            String substring = str.substring(i3, i10);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            Charset charset = Charsets.UTF_8;
            Intrinsics.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = substring.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return bytes;
        }
        CharsetEncoder newEncoder = Charsets.UTF_8.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        ByteBuffer encode = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(str, i3, i10));
        if (encode.hasArray() && encode.arrayOffset() == 0) {
            int remaining = encode.remaining();
            byte[] array = encode.array();
            Intrinsics.checkNotNull(array);
            if (remaining == array.length) {
                byte[] array2 = encode.array();
                Intrinsics.checkNotNull(array2);
                return array2;
            }
        }
        byte[] bArr = new byte[encode.remaining()];
        encode.get(bArr);
        return bArr;
    }

    @InlineOnly
    private static final String format(StringCompanionObject stringCompanionObject, String format, Object... args) {
        Intrinsics.checkNotNullParameter(stringCompanionObject, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        String format2 = String.format(format, Arrays.copyOf(args, args.length));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        return format2;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final String lowercase(String str, Locale locale) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @InlineOnly
    private static final int nativeIndexOf(String str, String str2, int i3) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str2, "str");
        return str.indexOf(str2, i3);
    }

    @InlineOnly
    private static final int nativeLastIndexOf(String str, String str2, int i3) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str2, "str");
        return str.lastIndexOf(str2, i3);
    }

    public static /* synthetic */ boolean regionMatches$default(String str, int i3, String str2, int i10, int i11, boolean z2, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            z2 = false;
        }
        return regionMatches(str, i3, str2, i10, i11, z2);
    }

    public static /* synthetic */ String replace$default(String str, String str2, String str3, boolean z2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return replace(str, str2, str3, z2);
    }

    public static /* synthetic */ String replaceFirst$default(String str, String str2, String str3, boolean z2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return replaceFirst(str, str2, str3, z2);
    }

    public static /* synthetic */ boolean startsWith$default(String str, String str2, int i3, boolean z2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z2 = false;
        }
        return startsWith(str, str2, i3, z2);
    }

    @InlineOnly
    private static final String substring(String str, int i3, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String substring = str.substring(i3, i10);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ char[] toCharArray$default(String str, char[] destination, int i3, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i3 = 0;
        }
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = str.length();
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        str.getChars(i10, i11, destination, i3);
        return destination;
    }

    @Deprecated(message = "Use lowercase() instead.", replaceWith = @ReplaceWith(expression = "lowercase(locale)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.5")
    @InlineOnly
    private static final String toLowerCase(String str, Locale locale) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @Deprecated(message = "Use uppercase() instead.", replaceWith = @ReplaceWith(expression = "uppercase(locale)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.5")
    @InlineOnly
    private static final String toUpperCase(String str, Locale locale) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        String upperCase = str.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final String uppercase(String str, Locale locale) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        String upperCase = str.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    @InlineOnly
    private static final String String(byte[] bytes, int i3, int i10) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return new String(bytes, i3, i10, Charsets.UTF_8);
    }

    @SinceKotlin(version = "1.5")
    public static final boolean contentEquals(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence instanceof String) && charSequence2 != null) {
            return ((String) charSequence).contentEquals(charSequence2);
        }
        return StringsKt__StringsKt.contentEqualsImpl(charSequence, charSequence2);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final String format(String str, Locale locale, Object... args) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        String format = String.format(locale, str, Arrays.copyOf(args, args.length));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public static final String replaceFirst(String str, String oldValue, String newValue, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        int indexOf$default = StringsKt__StringsKt.indexOf$default(str, oldValue, 0, z2, 2, (Object) null);
        return indexOf$default < 0 ? str : StringsKt__StringsKt.replaceRange((CharSequence) str, indexOf$default, oldValue.length() + indexOf$default, (CharSequence) newValue).toString();
    }

    public static boolean startsWith(String str, String prefix, int i3, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (!z2) {
            return str.startsWith(prefix, i3);
        }
        return regionMatches(str, i3, prefix, 0, prefix.length(), z2);
    }

    @InlineOnly
    private static final char[] toCharArray(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        char[] charArray = str.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        return charArray;
    }

    @InlineOnly
    private static final String String(byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return new String(bytes, Charsets.UTF_8);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final String format(StringCompanionObject stringCompanionObject, Locale locale, String format, Object... args) {
        Intrinsics.checkNotNullParameter(stringCompanionObject, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        String format2 = String.format(locale, format, Arrays.copyOf(args, args.length));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        return format2;
    }

    public static boolean regionMatches(String str, int i3, String other, int i10, int i11, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (!z2) {
            return str.regionMatches(i3, other, i10, i11);
        }
        return str.regionMatches(z2, i3, other, i10, i11);
    }

    @InlineOnly
    private static final char[] toCharArray(String str, char[] destination, int i3, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        str.getChars(i10, i11, destination, i3);
        return destination;
    }

    @InlineOnly
    private static final String String(char[] chars) {
        Intrinsics.checkNotNullParameter(chars, "chars");
        return new String(chars);
    }

    @InlineOnly
    private static final String String(char[] chars, int i3, int i10) {
        Intrinsics.checkNotNullParameter(chars, "chars");
        return new String(chars, i3, i10);
    }

    @SinceKotlin(version = "1.5")
    public static final boolean contentEquals(CharSequence charSequence, CharSequence charSequence2, boolean z2) {
        if (z2) {
            return StringsKt__StringsKt.contentEqualsIgnoreCaseImpl(charSequence, charSequence2);
        }
        return contentEquals(charSequence, charSequence2);
    }

    public static final String replace(String str, String oldValue, String newValue, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        int i3 = 0;
        int indexOf = StringsKt__StringsKt.indexOf(str, oldValue, 0, z2);
        if (indexOf < 0) {
            return str;
        }
        int length = oldValue.length();
        int coerceAtLeast = RangesKt.coerceAtLeast(length, 1);
        int length2 = newValue.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb2 = new StringBuilder(length2);
            do {
                sb2.append((CharSequence) str, i3, indexOf);
                sb2.append(newValue);
                i3 = indexOf + length;
                if (indexOf >= str.length()) {
                    break;
                }
                indexOf = StringsKt__StringsKt.indexOf(str, oldValue, indexOf + coerceAtLeast, z2);
            } while (indexOf > 0);
            sb2.append((CharSequence) str, i3, str.length());
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
            return sb3;
        }
        throw new OutOfMemoryError();
    }

    @InlineOnly
    private static final String String(int[] codePoints, int i3, int i10) {
        Intrinsics.checkNotNullParameter(codePoints, "codePoints");
        return new String(codePoints, i3, i10);
    }

    @InlineOnly
    private static final String String(StringBuffer stringBuffer) {
        Intrinsics.checkNotNullParameter(stringBuffer, "stringBuffer");
        return new String(stringBuffer);
    }

    @InlineOnly
    private static final String String(StringBuilder stringBuilder) {
        Intrinsics.checkNotNullParameter(stringBuilder, "stringBuilder");
        return new String(stringBuilder);
    }
}
