package kotlin.text;

import i2.u;
import kotlin.ExperimentalStdlibApi;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.WasExperimental;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.HexFormat;
import p0.AbstractC1482f;

@Metadata(d1 = {"\u0000r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0019\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0001\n\u0000\u001a\u0016\u0010\u000b\u001a\u00020\u0001*\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a*\u0010\u000b\u001a\u00020\u0001*\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a,\u0010\u0012\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0004H\u0002\u001a,\u0010\u0016\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0004H\u0002\u001a,\u0010\u0017\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0004H\u0002\u001a,\u0010\u0018\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0004H\u0002\u001a<\u0010\u0019\u001a\u00020\u0010*\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0010H\u0002\u001a,\u0010\u0019\u001a\u00020\u0010*\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0010H\u0002\u001a(\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0010H\u0002\u001a@\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0010H\u0000\u001a\u0010\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020*H\u0002\u001a\u0016\u0010+\u001a\u00020\f*\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a*\u0010+\u001a\u00020\f*\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0002\u001a&\u0010,\u001a\u0004\u0018\u00010\f*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a&\u0010-\u001a\u0004\u0018\u00010\f*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a&\u0010.\u001a\u0004\u0018\u00010\f*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a$\u0010/\u001a\u00020\f*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a\u0014\u00100\u001a\u000201*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0010H\u0002\u001a@\u00102\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0010H\u0000\u001a \u00104\u001a\u00020*2\u0006\u00105\u001a\u00020*2\u0006\u00106\u001a\u00020\u00102\u0006\u00107\u001a\u00020\u0010H\u0002\u001a \u00108\u001a\u00020*2\u0006\u00104\u001a\u00020*2\u0006\u00105\u001a\u00020*2\u0006\u00107\u001a\u00020\u0010H\u0002\u001a\u001c\u00109\u001a\u00020\u0010*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u001a\u0016\u0010\u000b\u001a\u00020\u0001*\u0002012\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a\u0016\u0010:\u001a\u000201*\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a*\u0010:\u001a\u000201*\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0002\u001a\u0016\u0010\u000b\u001a\u00020\u0001*\u00020;2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a\u0016\u0010<\u001a\u00020;*\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a*\u0010<\u001a\u00020;*\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0002\u001a\u0016\u0010\u000b\u001a\u00020\u0001*\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a\u0016\u0010=\u001a\u00020\u0010*\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a*\u0010=\u001a\u00020\u0010*\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0000\u001a\u0016\u0010\u000b\u001a\u00020\u0001*\u00020*2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a\u0016\u0010>\u001a\u00020**\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a*\u0010>\u001a\u00020**\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0000\u001a$\u0010?\u001a\u00020\u0001*\u00020*2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u00012\u0006\u0010C\u001a\u00020\u0010H\u0002\u001a\u001c\u0010D\u001a\u00020\u0010*\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0010H\u0002\u001a,\u0010E\u001a\u00020\u0010*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020\u0010H\u0002\u001a,\u0010G\u001a\u00020**\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020\u0010H\u0002\u001a<\u0010H\u001a\u00020I*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010J\u001a\u00020\u00012\u0006\u0010K\u001a\u00020\u00012\u0006\u0010L\u001a\u00020M2\u0006\u0010F\u001a\u00020\u0010H\u0002\u001a$\u0010N\u001a\u00020I*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010F\u001a\u00020\u0010H\u0002\u001a\u001c\u0010O\u001a\u00020I*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u001a\u001c\u0010P\u001a\u00020\u0010*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u001a\u001c\u0010Q\u001a\u00020**\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u001a5\u0010R\u001a\u00020\u0010*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010S\u001a\u00020\u00012\u0006\u0010L\u001a\u00020M2\u0006\u0010T\u001a\u00020\u0001H\u0082\b\u001a\u0015\u0010U\u001a\u00020\u0010*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0010H\u0082\b\u001a\u0015\u0010V\u001a\u00020**\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0010H\u0082\b\u001a,\u0010W\u001a\u00020I*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010X\u001a\u00020\u00012\u0006\u0010Y\u001a\u00020\u0010H\u0002\u001a,\u0010Z\u001a\u00020I*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010S\u001a\u00020\u00012\u0006\u0010T\u001a\u00020\u0001H\u0002\u001a,\u0010[\u001a\u00020I*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010J\u001a\u00020\u00012\u0006\u0010K\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\\\u001a\u00020]*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0010H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006^"}, d2 = {"LOWER_CASE_HEX_DIGITS", "", "UPPER_CASE_HEX_DIGITS", "BYTE_TO_LOWER_CASE_HEX_DIGITS", "", "getBYTE_TO_LOWER_CASE_HEX_DIGITS", "()[I", "BYTE_TO_UPPER_CASE_HEX_DIGITS", "HEX_DIGITS_TO_DECIMAL", "HEX_DIGITS_TO_LONG_DECIMAL", "", "toHexString", "", "format", "Lkotlin/text/HexFormat;", "startIndex", "", "endIndex", "toHexStringNoLineAndGroupSeparator", "bytesFormat", "Lkotlin/text/HexFormat$BytesHexFormat;", "byteToDigits", "toHexStringShortByteSeparatorNoPrefixAndSuffix", "toHexStringNoLineAndGroupSeparatorSlowPath", "toHexStringSlowPath", "formatByteAt", "index", "bytePrefix", "byteSuffix", "destination", "", "destinationOffset", "formattedStringLength", "numberOfBytes", "byteSeparatorLength", "bytePrefixLength", "byteSuffixLength", "bytesPerLine", "bytesPerGroup", "groupSeparatorLength", "checkFormatLength", "formatLength", "", "hexToByteArray", "hexToByteArrayNoLineAndGroupSeparator", "hexToByteArrayShortByteSeparatorNoPrefixAndSuffix", "hexToByteArrayNoLineAndGroupSeparatorSlowPath", "hexToByteArraySlowPath", "parseByteAt", "", "parsedByteArrayMaxSize", "stringLength", "charsPerSet", "charsPerElement", "elementsPerSet", "elementSeparatorLength", "wholeElementsPerSet", "checkNewLineAt", "hexToByte", "", "hexToShort", "hexToInt", "hexToLong", "toHexStringImpl", "numberFormat", "Lkotlin/text/HexFormat$NumberHexFormat;", "digits", "bits", "toCharArrayIfNotEmpty", "hexToIntImpl", "typeHexLength", "hexToLongImpl", "checkPrefixSuffixNumberOfDigits", "", "prefix", "suffix", "ignoreCase", "", "checkNumberOfDigits", "checkZeroDigits", "parseInt", "parseLong", "checkContainsAt", "part", "partName", "decimalFromHexDigitAt", "longDecimalFromHexDigitAt", "throwInvalidNumberOfDigits", "specifier", "expected", "throwNotContainedAt", "throwInvalidPrefixSuffix", "throwInvalidDigitAt", "", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHexExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,1237:1\n1186#1,7:1239\n1186#1,7:1246\n1186#1,7:1253\n1186#1,7:1260\n1186#1,7:1267\n1186#1,7:1274\n1186#1,7:1281\n1186#1,7:1288\n1197#1,5:1295\n1197#1,5:1300\n1186#1,7:1305\n1186#1,7:1312\n1197#1,5:1319\n1206#1,5:1324\n1#2:1238\n1188#3,3:1329\n1188#3,3:1332\n1188#3,3:1335\n1188#3,3:1338\n*S KotlinDebug\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n*L\n450#1:1239,7\n482#1:1246,7\n486#1:1253,7\n489#1:1260,7\n529#1:1267,7\n532#1:1274,7\n537#1:1281,7\n542#1:1288,7\n549#1:1295,5\n550#1:1300,5\n1141#1:1305,7\n1143#1:1312,7\n1171#1:1319,5\n1179#1:1324,5\n42#1:1329,3\n43#1:1332,3\n54#1:1335,3\n55#1:1338,3\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class HexExtensionsKt {
    private static final int[] BYTE_TO_LOWER_CASE_HEX_DIGITS;
    private static final int[] BYTE_TO_UPPER_CASE_HEX_DIGITS;
    private static final int[] HEX_DIGITS_TO_DECIMAL;
    private static final long[] HEX_DIGITS_TO_LONG_DECIMAL;
    private static final String LOWER_CASE_HEX_DIGITS = "0123456789abcdef";
    private static final String UPPER_CASE_HEX_DIGITS = "0123456789ABCDEF";

    static {
        int[] iArr = new int[256];
        int i3 = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            iArr[i10] = LOWER_CASE_HEX_DIGITS.charAt(i10 & 15) | (LOWER_CASE_HEX_DIGITS.charAt(i10 >> 4) << '\b');
        }
        BYTE_TO_LOWER_CASE_HEX_DIGITS = iArr;
        int[] iArr2 = new int[256];
        for (int i11 = 0; i11 < 256; i11++) {
            iArr2[i11] = UPPER_CASE_HEX_DIGITS.charAt(i11 & 15) | (UPPER_CASE_HEX_DIGITS.charAt(i11 >> 4) << '\b');
        }
        BYTE_TO_UPPER_CASE_HEX_DIGITS = iArr2;
        int[] iArr3 = new int[256];
        for (int i12 = 0; i12 < 256; i12++) {
            iArr3[i12] = -1;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < LOWER_CASE_HEX_DIGITS.length()) {
            iArr3[LOWER_CASE_HEX_DIGITS.charAt(i13)] = i14;
            i13++;
            i14++;
        }
        int i15 = 0;
        int i16 = 0;
        while (i15 < UPPER_CASE_HEX_DIGITS.length()) {
            iArr3[UPPER_CASE_HEX_DIGITS.charAt(i15)] = i16;
            i15++;
            i16++;
        }
        HEX_DIGITS_TO_DECIMAL = iArr3;
        long[] jArr = new long[256];
        for (int i17 = 0; i17 < 256; i17++) {
            jArr[i17] = -1;
        }
        int i18 = 0;
        int i19 = 0;
        while (i18 < LOWER_CASE_HEX_DIGITS.length()) {
            jArr[LOWER_CASE_HEX_DIGITS.charAt(i18)] = i19;
            i18++;
            i19++;
        }
        int i20 = 0;
        while (i3 < UPPER_CASE_HEX_DIGITS.length()) {
            jArr[UPPER_CASE_HEX_DIGITS.charAt(i3)] = i20;
            i3++;
            i20++;
        }
        HEX_DIGITS_TO_LONG_DECIMAL = jArr;
    }

    private static final long charsPerSet(long j, int i3, int i10) {
        if (i3 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j3 = i3;
        return ((j3 - 1) * i10) + (j * j3);
    }

    private static final int checkContainsAt(String str, int i3, int i10, String str2, boolean z2, String str3) {
        if (str2.length() == 0) {
            return i3;
        }
        int length = str2.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (!CharsKt__CharKt.equals(str2.charAt(i11), str.charAt(i3 + i11), z2)) {
                throwNotContainedAt(str, i3, i10, str2, str3);
            }
        }
        return str2.length() + i3;
    }

    private static final int checkFormatLength(long j) {
        if (0 <= j && j <= 2147483647L) {
            return (int) j;
        }
        throw new IllegalArgumentException("The resulting string length is too big: " + ((Object) ULong.m260toStringimpl(ULong.m214constructorimpl(j))));
    }

    private static final int checkNewLineAt(String str, int i3, int i10) {
        if (str.charAt(i3) == '\r') {
            int i11 = i3 + 1;
            return (i11 >= i10 || str.charAt(i11) != '\n') ? i11 : i3 + 2;
        }
        if (str.charAt(i3) == '\n') {
            return i3 + 1;
        }
        StringBuilder u2 = Xa.h.u(i3, "Expected a new line at index ", ", but was ");
        u2.append(str.charAt(i3));
        throw new NumberFormatException(u2.toString());
    }

    private static final void checkNumberOfDigits(String str, int i3, int i10, int i11) {
        int i12 = i10 - i3;
        if (i12 < 1) {
            throwInvalidNumberOfDigits(str, i3, i10, "at least", 1);
        } else if (i12 > i11) {
            checkZeroDigits(str, i3, (i12 + i3) - i11);
        }
    }

    private static final void checkPrefixSuffixNumberOfDigits(String str, int i3, int i10, String str2, String str3, boolean z2, int i11) {
        if ((i10 - i3) - str2.length() <= str3.length()) {
            throwInvalidPrefixSuffix(str, i3, i10, str2, str3);
        }
        if (str2.length() != 0) {
            int length = str2.length();
            for (int i12 = 0; i12 < length; i12++) {
                if (!CharsKt__CharKt.equals(str2.charAt(i12), str.charAt(i3 + i12), z2)) {
                    throwNotContainedAt(str, i3, i10, str2, "prefix");
                }
            }
            i3 += str2.length();
        }
        int length2 = i10 - str3.length();
        if (str3.length() != 0) {
            int length3 = str3.length();
            for (int i13 = 0; i13 < length3; i13++) {
                if (!CharsKt__CharKt.equals(str3.charAt(i13), str.charAt(length2 + i13), z2)) {
                    throwNotContainedAt(str, length2, i10, str3, "suffix");
                }
            }
        }
        checkNumberOfDigits(str, i3, length2, i11);
    }

    private static final void checkZeroDigits(String str, int i3, int i10) {
        while (i3 < i10) {
            if (str.charAt(i3) != '0') {
                StringBuilder u2 = Xa.h.u(i3, "Expected the hexadecimal digit '0' at index ", ", but was '");
                u2.append(str.charAt(i3));
                u2.append("'.\nThe result won't fit the type being parsed.");
                throw new NumberFormatException(u2.toString());
            }
            i3++;
        }
    }

    private static final int decimalFromHexDigitAt(String str, int i3) {
        int i10;
        char charAt = str.charAt(i3);
        if ((charAt >>> '\b') == 0 && (i10 = HEX_DIGITS_TO_DECIMAL[charAt]) >= 0) {
            return i10;
        }
        throwInvalidDigitAt(str, i3);
        throw new KotlinNothingValueException();
    }

    private static final int formatByteAt(byte[] bArr, int i3, String str, String str2, int[] iArr, char[] cArr, int i10) {
        return toCharArrayIfNotEmpty(str2, cArr, formatByteAt(bArr, i3, iArr, cArr, toCharArrayIfNotEmpty(str, cArr, i10)));
    }

    private static final int formattedStringLength(int i3, int i10, int i11, int i12) {
        if (i3 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j = i10;
        return checkFormatLength((i3 * (((i11 + 2) + i12) + j)) - j);
    }

    public static final int[] getBYTE_TO_LOWER_CASE_HEX_DIGITS() {
        return BYTE_TO_LOWER_CASE_HEX_DIGITS;
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final byte hexToByte(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToByte(str, 0, str.length(), format);
    }

    public static /* synthetic */ byte hexToByte$default(String str, HexFormat hexFormat, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToByte(str, hexFormat);
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final byte[] hexToByteArray(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToByteArray(str, 0, str.length(), format);
    }

    public static /* synthetic */ byte[] hexToByteArray$default(String str, HexFormat hexFormat, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToByteArray(str, hexFormat);
    }

    private static final byte[] hexToByteArrayNoLineAndGroupSeparator(String str, int i3, int i10, HexFormat.BytesHexFormat bytesHexFormat) {
        return bytesHexFormat.getShortByteSeparatorNoPrefixAndSuffix() ? hexToByteArrayShortByteSeparatorNoPrefixAndSuffix(str, i3, i10, bytesHexFormat) : hexToByteArrayNoLineAndGroupSeparatorSlowPath(str, i3, i10, bytesHexFormat);
    }

    private static final byte[] hexToByteArrayNoLineAndGroupSeparatorSlowPath(String str, int i3, int i10, HexFormat.BytesHexFormat bytesHexFormat) {
        String bytePrefix = bytesHexFormat.getBytePrefix();
        String byteSuffix = bytesHexFormat.getByteSuffix();
        String byteSeparator = bytesHexFormat.getByteSeparator();
        long length = byteSeparator.length();
        long length2 = bytePrefix.length() + 2 + byteSuffix.length() + length;
        long j = i10 - i3;
        int i11 = (int) ((j + length) / length2);
        if ((i11 * length2) - length != j) {
            return null;
        }
        boolean ignoreCase = bytesHexFormat.getIgnoreCase();
        byte[] bArr = new byte[i11];
        if (bytePrefix.length() != 0) {
            int length3 = bytePrefix.length();
            for (int i12 = 0; i12 < length3; i12++) {
                if (!CharsKt__CharKt.equals(bytePrefix.charAt(i12), str.charAt(i3 + i12), ignoreCase)) {
                    throwNotContainedAt(str, i3, i10, bytePrefix, "byte prefix");
                }
            }
            i3 += bytePrefix.length();
        }
        String h2 = AbstractC1482f.h(byteSuffix, byteSeparator, bytePrefix);
        int i13 = i11 - 1;
        for (int i14 = 0; i14 < i13; i14++) {
            bArr[i14] = parseByteAt(str, i3);
            i3 += 2;
            if (h2.length() != 0) {
                int length4 = h2.length();
                for (int i15 = 0; i15 < length4; i15++) {
                    if (!CharsKt__CharKt.equals(h2.charAt(i15), str.charAt(i3 + i15), ignoreCase)) {
                        throwNotContainedAt(str, i3, i10, h2, "byte suffix + byte separator + byte prefix");
                    }
                }
                i3 = h2.length() + i3;
            }
        }
        bArr[i13] = parseByteAt(str, i3);
        int i16 = i3 + 2;
        if (byteSuffix.length() == 0) {
            return bArr;
        }
        int length5 = byteSuffix.length();
        for (int i17 = 0; i17 < length5; i17++) {
            if (!CharsKt__CharKt.equals(byteSuffix.charAt(i17), str.charAt(i16 + i17), ignoreCase)) {
                throwNotContainedAt(str, i16, i10, byteSuffix, "byte suffix");
            }
        }
        return bArr;
    }

    private static final byte[] hexToByteArrayShortByteSeparatorNoPrefixAndSuffix(String str, int i3, int i10, HexFormat.BytesHexFormat bytesHexFormat) {
        int length = bytesHexFormat.getByteSeparator().length();
        if (length > 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i11 = i10 - i3;
        int i12 = 2;
        if (length == 0) {
            if ((i11 & 1) != 0) {
                return null;
            }
            int i13 = i11 >> 1;
            byte[] bArr = new byte[i13];
            int i14 = 0;
            for (int i15 = 0; i15 < i13; i15++) {
                bArr[i15] = parseByteAt(str, i14);
                i14 += 2;
            }
            return bArr;
        }
        if (i11 % 3 != 2) {
            return null;
        }
        int i16 = (i11 / 3) + 1;
        byte[] bArr2 = new byte[i16];
        char charAt = bytesHexFormat.getByteSeparator().charAt(0);
        bArr2[0] = parseByteAt(str, 0);
        for (int i17 = 1; i17 < i16; i17++) {
            if (str.charAt(i12) != charAt) {
                String byteSeparator = bytesHexFormat.getByteSeparator();
                boolean ignoreCase = bytesHexFormat.getIgnoreCase();
                if (byteSeparator.length() != 0) {
                    int length2 = byteSeparator.length();
                    for (int i18 = 0; i18 < length2; i18++) {
                        if (!CharsKt__CharKt.equals(byteSeparator.charAt(i18), str.charAt(i12 + i18), ignoreCase)) {
                            throwNotContainedAt(str, i12, i10, byteSeparator, "byte separator");
                        }
                    }
                    byteSeparator.length();
                }
            }
            bArr2[i17] = parseByteAt(str, i12 + 1);
            i12 += 3;
        }
        return bArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final byte[] hexToByteArraySlowPath(java.lang.String r18, int r19, int r20, kotlin.text.HexFormat.BytesHexFormat r21) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.HexExtensionsKt.hexToByteArraySlowPath(java.lang.String, int, int, kotlin.text.HexFormat$BytesHexFormat):byte[]");
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final int hexToInt(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToInt(str, 0, str.length(), format);
    }

    public static /* synthetic */ int hexToInt$default(String str, HexFormat hexFormat, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToInt(str, hexFormat);
    }

    private static final int hexToIntImpl(String str, int i3, int i10, HexFormat hexFormat, int i11) {
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i3, i10, str.length());
        HexFormat.NumberHexFormat number = hexFormat.getNumber();
        if (number.getIsDigitsOnly()) {
            checkNumberOfDigits(str, i3, i10, i11);
            return parseInt(str, i3, i10);
        }
        String prefix = number.getPrefix();
        String suffix = number.getSuffix();
        checkPrefixSuffixNumberOfDigits(str, i3, i10, prefix, suffix, number.getIgnoreCase(), i11);
        return parseInt(str, prefix.length() + i3, i10 - suffix.length());
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final long hexToLong(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToLong(str, 0, str.length(), format);
    }

    public static /* synthetic */ long hexToLong$default(String str, HexFormat hexFormat, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToLong(str, hexFormat);
    }

    private static final long hexToLongImpl(String str, int i3, int i10, HexFormat hexFormat, int i11) {
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i3, i10, str.length());
        HexFormat.NumberHexFormat number = hexFormat.getNumber();
        if (number.getIsDigitsOnly()) {
            checkNumberOfDigits(str, i3, i10, i11);
            return parseLong(str, i3, i10);
        }
        String prefix = number.getPrefix();
        String suffix = number.getSuffix();
        checkPrefixSuffixNumberOfDigits(str, i3, i10, prefix, suffix, number.getIgnoreCase(), i11);
        return parseLong(str, prefix.length() + i3, i10 - suffix.length());
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final short hexToShort(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToShort(str, 0, str.length(), format);
    }

    public static /* synthetic */ short hexToShort$default(String str, HexFormat hexFormat, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToShort(str, hexFormat);
    }

    private static final long longDecimalFromHexDigitAt(String str, int i3) {
        char charAt = str.charAt(i3);
        if ((charAt >>> '\b') == 0) {
            long j = HEX_DIGITS_TO_LONG_DECIMAL[charAt];
            if (j >= 0) {
                return j;
            }
        }
        throwInvalidDigitAt(str, i3);
        throw new KotlinNothingValueException();
    }

    private static final byte parseByteAt(String str, int i3) {
        int[] iArr;
        int i10;
        int i11;
        char charAt = str.charAt(i3);
        if ((charAt >>> '\b') != 0 || (i10 = (iArr = HEX_DIGITS_TO_DECIMAL)[charAt]) < 0) {
            throwInvalidDigitAt(str, i3);
            throw new KotlinNothingValueException();
        }
        int i12 = i3 + 1;
        char charAt2 = str.charAt(i12);
        if ((charAt2 >>> '\b') == 0 && (i11 = iArr[charAt2]) >= 0) {
            return (byte) ((i10 << 4) | i11);
        }
        throwInvalidDigitAt(str, i12);
        throw new KotlinNothingValueException();
    }

    private static final int parseInt(String str, int i3, int i10) {
        int i11;
        int i12 = 0;
        while (i3 < i10) {
            int i13 = i12 << 4;
            char charAt = str.charAt(i3);
            if ((charAt >>> '\b') != 0 || (i11 = HEX_DIGITS_TO_DECIMAL[charAt]) < 0) {
                throwInvalidDigitAt(str, i3);
                throw new KotlinNothingValueException();
            }
            i12 = i13 | i11;
            i3++;
        }
        return i12;
    }

    private static final long parseLong(String str, int i3, int i10) {
        long j = 0;
        while (i3 < i10) {
            long j3 = j << 4;
            char charAt = str.charAt(i3);
            if ((charAt >>> '\b') == 0) {
                long j10 = HEX_DIGITS_TO_LONG_DECIMAL[charAt];
                if (j10 >= 0) {
                    j = j3 | j10;
                    i3++;
                }
            }
            throwInvalidDigitAt(str, i3);
            throw new KotlinNothingValueException();
        }
        return j;
    }

    public static final int parsedByteArrayMaxSize(int i3, int i10, int i11, int i12, int i13, int i14, int i15) {
        long charsPerSet;
        if (i3 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j = i14 + 2 + i15;
        long charsPerSet2 = charsPerSet(j, i11, i13);
        if (i10 <= i11) {
            charsPerSet = charsPerSet(j, i10, i13);
        } else {
            charsPerSet = charsPerSet(charsPerSet2, i10 / i11, i12);
            int i16 = i10 % i11;
            if (i16 != 0) {
                charsPerSet = charsPerSet + i12 + charsPerSet(j, i16, i13);
            }
        }
        long j3 = i3;
        long wholeElementsPerSet = wholeElementsPerSet(j3, charsPerSet, 1);
        long j10 = j3 - ((charsPerSet + 1) * wholeElementsPerSet);
        long wholeElementsPerSet2 = wholeElementsPerSet(j10, charsPerSet2, i12);
        long j11 = j10 - ((charsPerSet2 + i12) * wholeElementsPerSet2);
        long wholeElementsPerSet3 = wholeElementsPerSet(j11, j, i13);
        return (int) (u.i(wholeElementsPerSet2, i11, wholeElementsPerSet * i10, wholeElementsPerSet3) + (j11 - ((j + ((long) i13)) * wholeElementsPerSet3) <= 0 ? 0 : 1));
    }

    private static final Void throwInvalidDigitAt(String str, int i3) {
        StringBuilder u2 = Xa.h.u(i3, "Expected a hexadecimal digit at index ", ", but was ");
        u2.append(str.charAt(i3));
        throw new NumberFormatException(u2.toString());
    }

    private static final void throwInvalidNumberOfDigits(String str, int i3, int i10, String str2, int i11) {
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(i3, i10);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        throw new NumberFormatException("Expected " + str2 + ' ' + i11 + " hexadecimal digits at index " + i3 + ", but was \"" + substring + "\" of length " + (i10 - i3));
    }

    private static final void throwInvalidPrefixSuffix(String str, int i3, int i10, String str2, String str3) {
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(i3, i10);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        StringBuilder t3 = u.t("Expected a hexadecimal number with prefix \"", str2, "\" and suffix \"", str3, "\", but was ");
        t3.append(substring);
        throw new NumberFormatException(t3.toString());
    }

    private static final void throwNotContainedAt(String str, int i3, int i10, String str2, String str3) {
        int coerceAtMost = RangesKt.coerceAtMost(str2.length() + i3, i10);
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(i3, coerceAtMost);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        StringBuilder t3 = u.t("Expected ", str3, " \"", str2, "\" at index ");
        t3.append(i3);
        t3.append(", but was ");
        t3.append(substring);
        throw new NumberFormatException(t3.toString());
    }

    private static final int toCharArrayIfNotEmpty(String str, char[] cArr, int i3) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                int length2 = str.length();
                Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                str.getChars(0, length2, cArr, i3);
            } else {
                cArr[i3] = str.charAt(0);
            }
        }
        return str.length() + i3;
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final String toHexString(byte[] bArr, HexFormat format) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return toHexString(bArr, 0, bArr.length, format);
    }

    public static /* synthetic */ String toHexString$default(byte[] bArr, HexFormat hexFormat, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(bArr, hexFormat);
    }

    private static final String toHexStringImpl(long j, HexFormat.NumberHexFormat numberHexFormat, String str, int i3) {
        if ((i3 & 3) != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i10 = i3 >> 2;
        int minLength = numberHexFormat.getMinLength();
        int coerceAtLeast = RangesKt.coerceAtLeast(minLength - i10, 0);
        String prefix = numberHexFormat.getPrefix();
        String suffix = numberHexFormat.getSuffix();
        boolean removeLeadingZeros = numberHexFormat.getRemoveLeadingZeros();
        int checkFormatLength = checkFormatLength(prefix.length() + coerceAtLeast + i10 + suffix.length());
        char[] cArr = new char[checkFormatLength];
        int charArrayIfNotEmpty = toCharArrayIfNotEmpty(prefix, cArr, 0);
        if (coerceAtLeast > 0) {
            int i11 = coerceAtLeast + charArrayIfNotEmpty;
            ArraysKt.fill(cArr, str.charAt(0), charArrayIfNotEmpty, i11);
            charArrayIfNotEmpty = i11;
        }
        int i12 = i3;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 -= 4;
            int i14 = (int) ((j >> i12) & 15);
            removeLeadingZeros = removeLeadingZeros && i14 == 0 && (i12 >> 2) >= minLength;
            if (!removeLeadingZeros) {
                cArr[charArrayIfNotEmpty] = str.charAt(i14);
                charArrayIfNotEmpty++;
            }
        }
        int charArrayIfNotEmpty2 = toCharArrayIfNotEmpty(suffix, cArr, charArrayIfNotEmpty);
        return charArrayIfNotEmpty2 == checkFormatLength ? StringsKt__StringsJVMKt.concatToString(cArr) : StringsKt__StringsJVMKt.concatToString$default(cArr, 0, charArrayIfNotEmpty2, 1, null);
    }

    private static final String toHexStringNoLineAndGroupSeparator(byte[] bArr, int i3, int i10, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        return bytesHexFormat.getShortByteSeparatorNoPrefixAndSuffix() ? toHexStringShortByteSeparatorNoPrefixAndSuffix(bArr, i3, i10, bytesHexFormat, iArr) : toHexStringNoLineAndGroupSeparatorSlowPath(bArr, i3, i10, bytesHexFormat, iArr);
    }

    private static final String toHexStringNoLineAndGroupSeparatorSlowPath(byte[] bArr, int i3, int i10, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        String bytePrefix = bytesHexFormat.getBytePrefix();
        String byteSuffix = bytesHexFormat.getByteSuffix();
        String byteSeparator = bytesHexFormat.getByteSeparator();
        char[] cArr = new char[formattedStringLength(i10 - i3, byteSeparator.length(), bytePrefix.length(), byteSuffix.length())];
        int formatByteAt = formatByteAt(bArr, i3, bytePrefix, byteSuffix, iArr, cArr, 0);
        for (int i11 = i3 + 1; i11 < i10; i11++) {
            formatByteAt = formatByteAt(bArr, i11, bytePrefix, byteSuffix, iArr, cArr, toCharArrayIfNotEmpty(byteSeparator, cArr, formatByteAt));
        }
        return StringsKt__StringsJVMKt.concatToString(cArr);
    }

    private static final String toHexStringShortByteSeparatorNoPrefixAndSuffix(byte[] bArr, int i3, int i10, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        int length = bytesHexFormat.getByteSeparator().length();
        if (length > 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i11 = i10 - i3;
        int i12 = 0;
        if (length == 0) {
            char[] cArr = new char[checkFormatLength(i11 * 2)];
            while (i3 < i10) {
                i12 = formatByteAt(bArr, i3, iArr, cArr, i12);
                i3++;
            }
            return StringsKt__StringsJVMKt.concatToString(cArr);
        }
        char[] cArr2 = new char[checkFormatLength((i11 * 3) - 1)];
        char charAt = bytesHexFormat.getByteSeparator().charAt(0);
        int formatByteAt = formatByteAt(bArr, i3, iArr, cArr2, 0);
        for (int i13 = i3 + 1; i13 < i10; i13++) {
            cArr2[formatByteAt] = charAt;
            formatByteAt = formatByteAt(bArr, i13, iArr, cArr2, formatByteAt + 1);
        }
        return StringsKt__StringsJVMKt.concatToString(cArr2);
    }

    private static final String toHexStringSlowPath(byte[] bArr, int i3, int i10, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        int i11;
        int i12;
        int bytesPerLine = bytesHexFormat.getBytesPerLine();
        int bytesPerGroup = bytesHexFormat.getBytesPerGroup();
        String bytePrefix = bytesHexFormat.getBytePrefix();
        String byteSuffix = bytesHexFormat.getByteSuffix();
        String byteSeparator = bytesHexFormat.getByteSeparator();
        String groupSeparator = bytesHexFormat.getGroupSeparator();
        int formattedStringLength = formattedStringLength(i10 - i3, bytesPerLine, bytesPerGroup, groupSeparator.length(), byteSeparator.length(), bytePrefix.length(), byteSuffix.length());
        char[] cArr = new char[formattedStringLength];
        int i13 = i3;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i13 < i10) {
            if (i15 == bytesPerLine) {
                cArr[i14] = '\n';
                i14++;
                i11 = 0;
                i12 = 0;
            } else if (i16 == bytesPerGroup) {
                i14 = toCharArrayIfNotEmpty(groupSeparator, cArr, i14);
                i11 = i15;
                i12 = 0;
            } else {
                i11 = i15;
                i12 = i16;
            }
            if (i12 != 0) {
                i14 = toCharArrayIfNotEmpty(byteSeparator, cArr, i14);
            }
            String str = bytePrefix;
            int formatByteAt = formatByteAt(bArr, i13, str, byteSuffix, iArr, cArr, i14);
            i13++;
            i16 = i12 + 1;
            i14 = formatByteAt;
            bytePrefix = str;
            i15 = i11 + 1;
        }
        if (i14 == formattedStringLength) {
            return StringsKt__StringsJVMKt.concatToString(cArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    private static final long wholeElementsPerSet(long j, long j3, int i3) {
        if (j <= 0 || j3 <= 0) {
            return 0L;
        }
        long j10 = i3;
        return (j + j10) / (j3 + j10);
    }

    private static final byte hexToByte(String str, int i3, int i10, HexFormat hexFormat) {
        return (byte) hexToIntImpl(str, i3, i10, hexFormat, 2);
    }

    public static /* synthetic */ byte hexToByte$default(String str, int i3, int i10, HexFormat hexFormat, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i3 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        if ((i11 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToByte(str, i3, i10, hexFormat);
    }

    private static final byte[] hexToByteArray(String str, int i3, int i10, HexFormat hexFormat) {
        byte[] hexToByteArrayNoLineAndGroupSeparator;
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i3, i10, str.length());
        if (i3 == i10) {
            return new byte[0];
        }
        HexFormat.BytesHexFormat bytes = hexFormat.getBytes();
        return (!bytes.getNoLineAndGroupSeparator() || (hexToByteArrayNoLineAndGroupSeparator = hexToByteArrayNoLineAndGroupSeparator(str, i3, i10, bytes)) == null) ? hexToByteArraySlowPath(str, i3, i10, bytes) : hexToByteArrayNoLineAndGroupSeparator;
    }

    public static /* synthetic */ byte[] hexToByteArray$default(String str, int i3, int i10, HexFormat hexFormat, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i3 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        if ((i11 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToByteArray(str, i3, i10, hexFormat);
    }

    public static final int hexToInt(String str, int i3, int i10, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToIntImpl(str, i3, i10, format, 8);
    }

    public static /* synthetic */ int hexToInt$default(String str, int i3, int i10, HexFormat hexFormat, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i3 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        if ((i11 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToInt(str, i3, i10, hexFormat);
    }

    public static final long hexToLong(String str, int i3, int i10, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToLongImpl(str, i3, i10, format, 16);
    }

    public static /* synthetic */ long hexToLong$default(String str, int i3, int i10, HexFormat hexFormat, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i3 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        if ((i11 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToLong(str, i3, i10, hexFormat);
    }

    private static final short hexToShort(String str, int i3, int i10, HexFormat hexFormat) {
        return (short) hexToIntImpl(str, i3, i10, hexFormat, 4);
    }

    public static /* synthetic */ short hexToShort$default(String str, int i3, int i10, HexFormat hexFormat, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i3 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        if ((i11 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToShort(str, i3, i10, hexFormat);
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final String toHexString(byte[] bArr, int i3, int i10, HexFormat format) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i3, i10, bArr.length);
        if (i3 == i10) {
            return "";
        }
        int[] iArr = format.getUpperCase() ? BYTE_TO_UPPER_CASE_HEX_DIGITS : BYTE_TO_LOWER_CASE_HEX_DIGITS;
        HexFormat.BytesHexFormat bytes = format.getBytes();
        return bytes.getNoLineAndGroupSeparator() ? toHexStringNoLineAndGroupSeparator(bArr, i3, i10, bytes, iArr) : toHexStringSlowPath(bArr, i3, i10, bytes, iArr);
    }

    public static /* synthetic */ String toHexString$default(byte[] bArr, int i3, int i10, HexFormat hexFormat, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i3 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = bArr.length;
        }
        if ((i11 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(bArr, i3, i10, hexFormat);
    }

    public static final int formattedStringLength(int i3, int i10, int i11, int i12, int i13, int i14, int i15) {
        if (i3 > 0) {
            int i16 = i3 - 1;
            int i17 = i16 / i10;
            int i18 = (i10 - 1) / i11;
            int i19 = i3 % i10;
            if (i19 != 0) {
                i10 = i19;
            }
            int i20 = (i18 * i17) + ((i10 - 1) / i11);
            return checkFormatLength(((i14 + 2 + i15) * i3) + (((i16 - i17) - i20) * i13) + (i20 * i12) + i17);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    private static final int formatByteAt(byte[] bArr, int i3, int[] iArr, char[] cArr, int i10) {
        int i11 = iArr[bArr[i3] & UByte.MAX_VALUE];
        cArr[i10] = (char) (i11 >> 8);
        cArr[i10 + 1] = (char) (i11 & 255);
        return i10 + 2;
    }

    public static /* synthetic */ String toHexString$default(byte b2, HexFormat hexFormat, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(b2, hexFormat);
    }

    public static /* synthetic */ String toHexString$default(short s10, HexFormat hexFormat, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(s10, hexFormat);
    }

    public static /* synthetic */ String toHexString$default(int i3, HexFormat hexFormat, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(i3, hexFormat);
    }

    public static /* synthetic */ String toHexString$default(long j, HexFormat hexFormat, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(j, hexFormat);
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final String toHexString(byte b2, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        String str = format.getUpperCase() ? UPPER_CASE_HEX_DIGITS : LOWER_CASE_HEX_DIGITS;
        HexFormat.NumberHexFormat number = format.getNumber();
        if (number.getIsDigitsOnlyAndNoPadding()) {
            char[] cArr = {str.charAt((b2 >> 4) & 15), str.charAt(b2 & 15)};
            if (number.getRemoveLeadingZeros()) {
                return StringsKt__StringsJVMKt.concatToString$default(cArr, RangesKt.coerceAtMost((Integer.numberOfLeadingZeros(b2 & UByte.MAX_VALUE) - 24) >> 2, 1), 0, 2, null);
            }
            return StringsKt__StringsJVMKt.concatToString(cArr);
        }
        return toHexStringImpl(b2, number, str, 8);
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final String toHexString(short s10, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        String str = format.getUpperCase() ? UPPER_CASE_HEX_DIGITS : LOWER_CASE_HEX_DIGITS;
        HexFormat.NumberHexFormat number = format.getNumber();
        if (number.getIsDigitsOnlyAndNoPadding()) {
            char[] cArr = {str.charAt((s10 >> 12) & 15), str.charAt((s10 >> 8) & 15), str.charAt((s10 >> 4) & 15), str.charAt(s10 & 15)};
            if (number.getRemoveLeadingZeros()) {
                return StringsKt__StringsJVMKt.concatToString$default(cArr, RangesKt.coerceAtMost((Integer.numberOfLeadingZeros(s10 & UShort.MAX_VALUE) - 16) >> 2, 3), 0, 2, null);
            }
            return StringsKt__StringsJVMKt.concatToString(cArr);
        }
        return toHexStringImpl(s10, number, str, 16);
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final String toHexString(int i3, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        String str = format.getUpperCase() ? UPPER_CASE_HEX_DIGITS : LOWER_CASE_HEX_DIGITS;
        HexFormat.NumberHexFormat number = format.getNumber();
        if (number.getIsDigitsOnlyAndNoPadding()) {
            char[] cArr = {str.charAt((i3 >> 28) & 15), str.charAt((i3 >> 24) & 15), str.charAt((i3 >> 20) & 15), str.charAt((i3 >> 16) & 15), str.charAt((i3 >> 12) & 15), str.charAt((i3 >> 8) & 15), str.charAt((i3 >> 4) & 15), str.charAt(i3 & 15)};
            if (number.getRemoveLeadingZeros()) {
                return StringsKt__StringsJVMKt.concatToString$default(cArr, RangesKt.coerceAtMost(Integer.numberOfLeadingZeros(i3) >> 2, 7), 0, 2, null);
            }
            return StringsKt__StringsJVMKt.concatToString(cArr);
        }
        return toHexStringImpl(i3, number, str, 32);
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final String toHexString(long j, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        String str = format.getUpperCase() ? UPPER_CASE_HEX_DIGITS : LOWER_CASE_HEX_DIGITS;
        HexFormat.NumberHexFormat number = format.getNumber();
        if (number.getIsDigitsOnlyAndNoPadding()) {
            char[] cArr = {str.charAt((int) ((j >> 60) & 15)), str.charAt((int) ((j >> 56) & 15)), str.charAt((int) ((j >> 52) & 15)), str.charAt((int) ((j >> 48) & 15)), str.charAt((int) ((j >> 44) & 15)), str.charAt((int) ((j >> 40) & 15)), str.charAt((int) ((j >> 36) & 15)), str.charAt((int) ((j >> 32) & 15)), str.charAt((int) ((j >> 28) & 15)), str.charAt((int) ((j >> 24) & 15)), str.charAt((int) ((j >> 20) & 15)), str.charAt((int) ((j >> 16) & 15)), str.charAt((int) ((j >> 12) & 15)), str.charAt((int) ((j >> 8) & 15)), str.charAt((int) ((j >> 4) & 15)), str.charAt((int) (j & 15))};
            if (number.getRemoveLeadingZeros()) {
                return StringsKt__StringsJVMKt.concatToString$default(cArr, RangesKt.coerceAtMost(Long.numberOfLeadingZeros(j) >> 2, 15), 0, 2, null);
            }
            return StringsKt__StringsJVMKt.concatToString(cArr);
        }
        return toHexStringImpl(j, number, str, 64);
    }
}
