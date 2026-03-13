package kotlin.time;

import X2.q;
import Xa.h;
import i2.u;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Typography;
import kotlin.time.InstantParseResult;
import p0.AbstractC1482f;

@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\f\n\u0002\u0010\u0015\n\u0002\b\u0006\u001a\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0003\u001a\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0003\u001a'\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0082\b\u001a'\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0082\b\u001a\u0010\u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u0015H\u0000\u001a\u0014\u0010'\u001a\u00020\u0015*\u00020\u00152\u0006\u0010%\u001a\u00020\u0001H\u0002\u001a\u0014\u0010-\u001a\u00020\u0012*\u00020\u00102\u0006\u0010.\u001a\u00020\u0015H\u0002\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0000\u0010\u0005\"\u001f\u0010\u0006\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0006\u0010\u0005\"\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010!\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\"\u001a\u00020\u0015X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010#\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010$\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010*\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010+\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010,\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"isDistantPast", "", "Lkotlin/time/Instant;", "isDistantPast$annotations", "(Lkotlin/time/Instant;)V", "(Lkotlin/time/Instant;)Z", "isDistantFuture", "isDistantFuture$annotations", "DISTANT_PAST_SECONDS", "", "DISTANT_FUTURE_SECONDS", "MIN_SECOND", "MAX_SECOND", "parseIso", "Lkotlin/time/InstantParseResult;", "isoString", "", "formatIso", "", "instant", "DAYS_PER_CYCLE", "", "DAYS_0000_TO_1970", "safeAddOrElse", "a", "b", "action", "Lkotlin/Function0;", "", "safeMultiplyOrElse", "SECONDS_PER_HOUR", "SECONDS_PER_MINUTE", "HOURS_PER_DAY", "SECONDS_PER_DAY", "NANOS_PER_SECOND", "NANOS_PER_MILLI", "MILLIS_PER_SECOND", "isLeapYear", "year", "monthLength", "POWERS_OF_TEN", "", "asciiDigitPositionsInIsoStringAfterYear", "colonsInIsoOffsetString", "asciiDigitsInIsoOffsetString", "truncateForErrorMessage", "maxLength", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInstant.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Instant.kt\nkotlin/time/InstantKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Instant.kt\nkotlin/time/UnboundLocalDateTime\n*L\n1#1,864:1\n1#2:865\n479#3,28:866\n*S KotlinDebug\n*F\n+ 1 Instant.kt\nkotlin/time/InstantKt\n*L\n689#1:866,28\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class InstantKt {
    private static final int DAYS_0000_TO_1970 = 719528;
    private static final int DAYS_PER_CYCLE = 146097;
    private static final long DISTANT_FUTURE_SECONDS = 3093527980800L;
    private static final long DISTANT_PAST_SECONDS = -3217862419201L;
    private static final int HOURS_PER_DAY = 24;
    private static final long MAX_SECOND = 31556889864403199L;
    private static final long MIN_SECOND = -31557014167219200L;
    private static final int NANOS_PER_MILLI = 1000000;
    private static final int SECONDS_PER_DAY = 86400;
    private static final int SECONDS_PER_HOUR = 3600;
    private static final int SECONDS_PER_MINUTE = 60;
    private static final int MILLIS_PER_SECOND = 1000;
    public static final int NANOS_PER_SECOND = 1000000000;
    private static final int[] POWERS_OF_TEN = {1, 10, 100, MILLIS_PER_SECOND, 10000, 100000, 1000000, 10000000, 100000000, NANOS_PER_SECOND};
    private static final int[] asciiDigitPositionsInIsoStringAfterYear = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};
    private static final int[] colonsInIsoOffsetString = {3, 6};
    private static final int[] asciiDigitsInIsoOffsetString = {1, 2, 4, 5, 7, 8};

    /* JADX INFO: Access modifiers changed from: private */
    @ExperimentalTime
    public static final String formatIso(Instant instant) {
        int[] iArr;
        StringBuilder sb2 = new StringBuilder();
        UnboundLocalDateTime fromInstant = UnboundLocalDateTime.INSTANCE.fromInstant(instant);
        int year = fromInstant.getYear();
        int i3 = 0;
        if (Math.abs(year) < MILLIS_PER_SECOND) {
            StringBuilder sb3 = new StringBuilder();
            if (year >= 0) {
                sb3.append(year + 10000);
                Intrinsics.checkNotNullExpressionValue(sb3.deleteCharAt(0), "deleteCharAt(...)");
            } else {
                sb3.append(year - 10000);
                Intrinsics.checkNotNullExpressionValue(sb3.deleteCharAt(1), "deleteCharAt(...)");
            }
            sb2.append((CharSequence) sb3);
        } else {
            if (year >= 10000) {
                sb2.append('+');
            }
            sb2.append(year);
        }
        sb2.append('-');
        formatIso$lambda$0$appendTwoDigits(sb2, sb2, fromInstant.getMonth());
        sb2.append('-');
        formatIso$lambda$0$appendTwoDigits(sb2, sb2, fromInstant.getDay());
        sb2.append('T');
        formatIso$lambda$0$appendTwoDigits(sb2, sb2, fromInstant.getHour());
        sb2.append(':');
        formatIso$lambda$0$appendTwoDigits(sb2, sb2, fromInstant.getMinute());
        sb2.append(':');
        formatIso$lambda$0$appendTwoDigits(sb2, sb2, fromInstant.getSecond());
        if (fromInstant.getNanosecond() != 0) {
            sb2.append('.');
            while (true) {
                int nanosecond = fromInstant.getNanosecond();
                iArr = POWERS_OF_TEN;
                int i10 = i3 + 1;
                if (nanosecond % iArr[i10] != 0) {
                    break;
                }
                i3 = i10;
            }
            int i11 = i3 - (i3 % 3);
            String valueOf = String.valueOf((fromInstant.getNanosecond() / iArr[i11]) + iArr[9 - i11]);
            Intrinsics.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
            String substring = valueOf.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            sb2.append(substring);
        }
        sb2.append('Z');
        return sb2.toString();
    }

    private static final void formatIso$lambda$0$appendTwoDigits(Appendable appendable, StringBuilder sb2, int i3) {
        if (i3 < 10) {
            appendable.append('0');
        }
        sb2.append(i3);
    }

    private static final boolean isDistantFuture(Instant instant) {
        Intrinsics.checkNotNullParameter(instant, "<this>");
        return instant.compareTo(Instant.INSTANCE.getDISTANT_FUTURE()) >= 0;
    }

    @SinceKotlin(version = "2.1")
    @InlineOnly
    @ExperimentalTime
    public static /* synthetic */ void isDistantFuture$annotations(Instant instant) {
    }

    private static final boolean isDistantPast(Instant instant) {
        Intrinsics.checkNotNullParameter(instant, "<this>");
        return instant.compareTo(Instant.INSTANCE.getDISTANT_PAST()) <= 0;
    }

    @SinceKotlin(version = "2.1")
    @InlineOnly
    @ExperimentalTime
    public static /* synthetic */ void isDistantPast$annotations(Instant instant) {
    }

    public static final boolean isLeapYear(int i3) {
        if ((i3 & 3) == 0) {
            return i3 % 100 != 0 || i3 % 400 == 0;
        }
        return false;
    }

    private static final int monthLength(int i3, boolean z2) {
        return i3 != 2 ? (i3 == 4 || i3 == 6 || i3 == 9 || i3 == 11) ? 30 : 31 : z2 ? 29 : 28;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ExperimentalTime
    public static final InstantParseResult parseIso(CharSequence charSequence) {
        int i3;
        int i10;
        int i11;
        int c10;
        char charAt;
        char charAt2;
        if (charSequence.length() == 0) {
            return new InstantParseResult.Failure("An empty string is not a valid Instant", charSequence);
        }
        char charAt3 = charSequence.charAt(0);
        if (charAt3 == '+' || charAt3 == '-') {
            i3 = 1;
        } else {
            i3 = 0;
            charAt3 = ' ';
        }
        int i12 = 0;
        int i13 = i3;
        while (i13 < charSequence.length() && '0' <= (charAt2 = charSequence.charAt(i13)) && charAt2 < ':') {
            i12 = (i12 * 10) + (charSequence.charAt(i13) - '0');
            i13++;
        }
        int i14 = i13 - i3;
        if (i14 > 10) {
            return parseIso$parseFailure(charSequence, h.g(i14, "Expected at most 10 digits for the year number, got ", " digits"));
        }
        if (i14 == 10 && Intrinsics.compare((int) charSequence.charAt(i3), 50) >= 0) {
            return parseIso$parseFailure(charSequence, h.g(i14, "Expected at most 9 digits for the year number or year 1000000000, got ", " digits"));
        }
        if (i14 < 4) {
            return parseIso$parseFailure(charSequence, h.g(i14, "The year number must be padded to 4 digits, got ", " digits"));
        }
        if (charAt3 == '+' && i14 == 4) {
            return parseIso$parseFailure(charSequence, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
        }
        if (charAt3 == ' ' && i14 != 4) {
            return parseIso$parseFailure(charSequence, "A '+' or '-' sign is required for year numbers longer than 4 digits");
        }
        if (charAt3 == '-') {
            i12 = -i12;
        }
        int i15 = i12;
        int i16 = i13 + 16;
        if (charSequence.length() < i16) {
            return parseIso$parseFailure(charSequence, "The input string is too short");
        }
        InstantParseResult.Failure parseIso$expect = parseIso$expect(charSequence, "'-'", i13, new q(2));
        if (parseIso$expect != null) {
            return parseIso$expect;
        }
        InstantParseResult.Failure parseIso$expect2 = parseIso$expect(charSequence, "'-'", i13 + 3, new q(3));
        if (parseIso$expect2 != null) {
            return parseIso$expect2;
        }
        InstantParseResult.Failure parseIso$expect3 = parseIso$expect(charSequence, "'T' or 't'", i13 + 6, new q(4));
        if (parseIso$expect3 != null) {
            return parseIso$expect3;
        }
        InstantParseResult.Failure parseIso$expect4 = parseIso$expect(charSequence, "':'", i13 + 9, new q(5));
        if (parseIso$expect4 != null) {
            return parseIso$expect4;
        }
        InstantParseResult.Failure parseIso$expect5 = parseIso$expect(charSequence, "':'", i13 + 12, new q(6));
        if (parseIso$expect5 != null) {
            return parseIso$expect5;
        }
        for (int i17 : asciiDigitPositionsInIsoStringAfterYear) {
            InstantParseResult.Failure parseIso$expect6 = parseIso$expect(charSequence, "an ASCII digit", i17 + i13, new q(7));
            if (parseIso$expect6 != null) {
                return parseIso$expect6;
            }
        }
        int parseIso$twoDigitNumber = parseIso$twoDigitNumber(charSequence, i13 + 1);
        int parseIso$twoDigitNumber2 = parseIso$twoDigitNumber(charSequence, i13 + 4);
        int parseIso$twoDigitNumber3 = parseIso$twoDigitNumber(charSequence, i13 + 7);
        int parseIso$twoDigitNumber4 = parseIso$twoDigitNumber(charSequence, i13 + 10);
        int parseIso$twoDigitNumber5 = parseIso$twoDigitNumber(charSequence, i13 + 13);
        int i18 = i13 + 15;
        if (charSequence.charAt(i18) == '.') {
            i18 = i16;
            int i19 = 0;
            while (i18 < charSequence.length() && '0' <= (charAt = charSequence.charAt(i18)) && charAt < ':') {
                i19 = (i19 * 10) + (charSequence.charAt(i18) - '0');
                i18++;
            }
            int i20 = i18 - i16;
            if (1 > i20 || i20 >= 10) {
                return parseIso$parseFailure(charSequence, h.g(i20, "1..9 digits are supported for the fraction of the second, got ", " digits"));
            }
            i10 = i19 * POWERS_OF_TEN[9 - i20];
        } else {
            i10 = 0;
        }
        if (i18 >= charSequence.length()) {
            return parseIso$parseFailure(charSequence, "The UTC offset at the end of the string is missing");
        }
        char charAt4 = charSequence.charAt(i18);
        if (charAt4 == '+' || charAt4 == '-') {
            int length = charSequence.length() - i18;
            if (length > 9) {
                return parseIso$parseFailure(charSequence, AbstractC1482f.k(new StringBuilder("The UTC offset string \""), truncateForErrorMessage(charSequence.subSequence(i18, charSequence.length()).toString(), 16), "\" is too long"));
            }
            if (length % 3 != 0) {
                return parseIso$parseFailure(charSequence, "Invalid UTC offset string \"" + charSequence.subSequence(i18, charSequence.length()).toString() + Typography.quote);
            }
            for (int i21 : colonsInIsoOffsetString) {
                int i22 = i18 + i21;
                if (i22 >= charSequence.length()) {
                    break;
                }
                if (charSequence.charAt(i22) != ':') {
                    StringBuilder u2 = h.u(i22, "Expected ':' at index ", ", got '");
                    u2.append(charSequence.charAt(i22));
                    u2.append('\'');
                    return parseIso$parseFailure(charSequence, u2.toString());
                }
            }
            int[] iArr = asciiDigitsInIsoOffsetString;
            int length2 = iArr.length;
            int i23 = 0;
            while (i23 < length2) {
                int i24 = iArr[i23] + i18;
                if (i24 >= charSequence.length()) {
                    break;
                }
                char charAt5 = charSequence.charAt(i24);
                int[] iArr2 = iArr;
                if ('0' > charAt5 || charAt5 >= ':') {
                    StringBuilder u10 = h.u(i24, "Expected an ASCII digit at index ", ", got '");
                    u10.append(charSequence.charAt(i24));
                    u10.append('\'');
                    return parseIso$parseFailure(charSequence, u10.toString());
                }
                i23++;
                iArr = iArr2;
            }
            int parseIso$twoDigitNumber6 = parseIso$twoDigitNumber(charSequence, i18 + 1);
            i11 = 3;
            int parseIso$twoDigitNumber7 = length > 3 ? parseIso$twoDigitNumber(charSequence, i18 + 4) : 0;
            int parseIso$twoDigitNumber8 = length > 6 ? parseIso$twoDigitNumber(charSequence, i18 + 7) : 0;
            if (parseIso$twoDigitNumber7 > 59) {
                return parseIso$parseFailure(charSequence, u.p(parseIso$twoDigitNumber7, "Expected offset-minute-of-hour in 0..59, got "));
            }
            if (parseIso$twoDigitNumber8 > 59) {
                return parseIso$parseFailure(charSequence, u.p(parseIso$twoDigitNumber8, "Expected offset-second-of-minute in 0..59, got "));
            }
            if (parseIso$twoDigitNumber6 > 17 && (parseIso$twoDigitNumber6 != 18 || parseIso$twoDigitNumber7 != 0 || parseIso$twoDigitNumber8 != 0)) {
                return parseIso$parseFailure(charSequence, "Expected an offset in -18:00..+18:00, got " + charSequence.subSequence(i18, charSequence.length()).toString());
            }
            c10 = (charAt4 == '-' ? -1 : 1) * AbstractC1482f.c(parseIso$twoDigitNumber7, 60, parseIso$twoDigitNumber6 * SECONDS_PER_HOUR, parseIso$twoDigitNumber8);
        } else {
            if (charAt4 != 'Z' && charAt4 != 'z') {
                return parseIso$parseFailure(charSequence, "Expected the UTC offset at position " + i18 + ", got '" + charAt4 + '\'');
            }
            int i25 = i18 + 1;
            if (charSequence.length() != i25) {
                return parseIso$parseFailure(charSequence, u.p(i25, "Extra text after the instant at position "));
            }
            c10 = 0;
            i11 = 3;
        }
        if (1 > parseIso$twoDigitNumber || parseIso$twoDigitNumber >= 13) {
            return parseIso$parseFailure(charSequence, u.p(parseIso$twoDigitNumber, "Expected a month number in 1..12, got "));
        }
        if (1 > parseIso$twoDigitNumber2 || parseIso$twoDigitNumber2 > monthLength(parseIso$twoDigitNumber, isLeapYear(i15))) {
            StringBuilder l9 = AbstractC1482f.l(parseIso$twoDigitNumber, "Expected a valid day-of-month for month ", i15, " of year ", ", got ");
            l9.append(parseIso$twoDigitNumber2);
            return parseIso$parseFailure(charSequence, l9.toString());
        }
        if (parseIso$twoDigitNumber3 > 23) {
            return parseIso$parseFailure(charSequence, u.p(parseIso$twoDigitNumber3, "Expected hour in 0..23, got "));
        }
        if (parseIso$twoDigitNumber4 > 59) {
            return parseIso$parseFailure(charSequence, u.p(parseIso$twoDigitNumber4, "Expected minute-of-hour in 0..59, got "));
        }
        if (parseIso$twoDigitNumber5 > 59) {
            return parseIso$parseFailure(charSequence, u.p(parseIso$twoDigitNumber5, "Expected second-of-minute in 0..59, got "));
        }
        UnboundLocalDateTime unboundLocalDateTime = new UnboundLocalDateTime(i15, parseIso$twoDigitNumber, parseIso$twoDigitNumber2, parseIso$twoDigitNumber3, parseIso$twoDigitNumber4, parseIso$twoDigitNumber5, i10);
        long year = unboundLocalDateTime.getYear();
        long j = 365 * year;
        long month = (year >= 0 ? ((year + 399) / 400) + (((i11 + year) / 4) - ((99 + year) / 100)) + j : j - ((year / (-400)) + ((year / (-4)) - (year / (-100))))) + (((unboundLocalDateTime.getMonth() * 367) - 362) / 12) + (unboundLocalDateTime.getDay() - 1);
        if (unboundLocalDateTime.getMonth() > 2) {
            month = !isLeapYear(unboundLocalDateTime.getYear()) ? month - 2 : (-1) + month;
        }
        return new InstantParseResult.Success((((month - DAYS_0000_TO_1970) * SECONDS_PER_DAY) + (((unboundLocalDateTime.getMinute() * 60) + (unboundLocalDateTime.getHour() * SECONDS_PER_HOUR)) + unboundLocalDateTime.getSecond())) - c10, unboundLocalDateTime.getNanosecond());
    }

    private static final InstantParseResult.Failure parseIso$expect(CharSequence charSequence, String str, int i3, Function1<? super Character, Boolean> function1) {
        char charAt = charSequence.charAt(i3);
        if (function1.invoke(Character.valueOf(charAt)).booleanValue()) {
            return null;
        }
        return parseIso$parseFailure(charSequence, "Expected " + str + ", but got '" + charAt + "' at position " + i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean parseIso$lambda$0(char c10) {
        return c10 == '-';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean parseIso$lambda$10(char c10) {
        return '0' <= c10 && c10 < ':';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean parseIso$lambda$2(char c10) {
        return c10 == '-';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean parseIso$lambda$4(char c10) {
        return c10 == 'T' || c10 == 't';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean parseIso$lambda$6(char c10) {
        return c10 == ':';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean parseIso$lambda$8(char c10) {
        return c10 == ':';
    }

    private static final InstantParseResult.Failure parseIso$parseFailure(CharSequence charSequence, String str) {
        return new InstantParseResult.Failure(h.s(AbstractC1482f.n(str, " when parsing an Instant from \""), truncateForErrorMessage(charSequence, 64), Typography.quote), charSequence);
    }

    private static final int parseIso$twoDigitNumber(CharSequence charSequence, int i3) {
        return (charSequence.charAt(i3 + 1) - '0') + ((charSequence.charAt(i3) - '0') * 10);
    }

    private static final long safeAddOrElse(long j, long j3, Function0 function0) {
        long j10 = j + j3;
        if ((j ^ j10) >= 0 || (j ^ j3) < 0) {
            return j10;
        }
        function0.invoke();
        throw new KotlinNothingValueException();
    }

    private static final long safeMultiplyOrElse(long j, long j3, Function0 function0) {
        if (j3 == 1) {
            return j;
        }
        if (j == 1) {
            return j3;
        }
        if (j == 0 || j3 == 0) {
            return 0L;
        }
        long j10 = j * j3;
        if (j10 / j3 == j && ((j != Long.MIN_VALUE || j3 != -1) && (j3 != Long.MIN_VALUE || j != -1))) {
            return j10;
        }
        function0.invoke();
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String truncateForErrorMessage(CharSequence charSequence, int i3) {
        if (charSequence.length() <= i3) {
            return charSequence.toString();
        }
        return charSequence.subSequence(0, i3).toString() + "...";
    }
}
