package kotlin.text;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\u001a\u0013\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0003\u001a\u001b\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\u0002H\u0007¢\u0006\u0002\u0010\t\u001a\u001b\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\n\u001a\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005*\u00020\u0002H\u0007¢\u0006\u0002\u0010\f\u001a\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\r\u001a\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0010\u001a\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0011\u001a\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0000¨\u0006\u0015"}, d2 = {"toByteOrNull", "", "", "(Ljava/lang/String;)Ljava/lang/Byte;", "radix", "", "(Ljava/lang/String;I)Ljava/lang/Byte;", "toShortOrNull", "", "(Ljava/lang/String;)Ljava/lang/Short;", "(Ljava/lang/String;I)Ljava/lang/Short;", "toIntOrNull", "(Ljava/lang/String;)Ljava/lang/Integer;", "(Ljava/lang/String;I)Ljava/lang/Integer;", "toLongOrNull", "", "(Ljava/lang/String;)Ljava/lang/Long;", "(Ljava/lang/String;I)Ljava/lang/Long;", "numberFormatError", "", "input", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class StringsKt__StringNumberConversionsKt extends StringsKt__StringNumberConversionsJVMKt {
    public static final Void numberFormatError(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        throw new NumberFormatException(Xa.h.n("Invalid number format: '", '\'', input));
    }

    @SinceKotlin(version = "1.1")
    public static final Byte toByteOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toByteOrNull(str, 10);
    }

    @SinceKotlin(version = "1.1")
    public static Integer toIntOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toIntOrNull(str, 10);
    }

    @SinceKotlin(version = "1.1")
    public static Long toLongOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toLongOrNull(str, 10);
    }

    @SinceKotlin(version = "1.1")
    public static final Short toShortOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toShortOrNull(str, 10);
    }

    @SinceKotlin(version = "1.1")
    public static final Byte toByteOrNull(String str, int i3) {
        int intValue;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Integer intOrNull = toIntOrNull(str, i3);
        if (intOrNull == null || (intValue = intOrNull.intValue()) < -128 || intValue > 127) {
            return null;
        }
        return Byte.valueOf((byte) intValue);
    }

    @SinceKotlin(version = "1.1")
    public static final Integer toIntOrNull(String str, int i3) {
        boolean z2;
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(i3);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char charAt = str.charAt(0);
        int i13 = -2147483647;
        if (Intrinsics.compare((int) charAt, 48) < 0) {
            i10 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z2 = false;
            } else {
                if (charAt != '-') {
                    return null;
                }
                i13 = Integer.MIN_VALUE;
                z2 = true;
            }
        } else {
            z2 = false;
            i10 = 0;
        }
        int i14 = -59652323;
        while (i10 < length) {
            int digitOf = CharsKt__CharJVMKt.digitOf(str.charAt(i10), i3);
            if (digitOf < 0) {
                return null;
            }
            if ((i12 < i14 && (i14 != -59652323 || i12 < (i14 = i13 / i3))) || (i11 = i12 * i3) < i13 + digitOf) {
                return null;
            }
            i12 = i11 - digitOf;
            i10++;
        }
        return z2 ? Integer.valueOf(i12) : Integer.valueOf(-i12);
    }

    @SinceKotlin(version = "1.1")
    public static final Long toLongOrNull(String str, int i3) {
        boolean z2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(i3);
        int length = str.length();
        Long l9 = null;
        if (length == 0) {
            return null;
        }
        int i10 = 0;
        char charAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (Intrinsics.compare((int) charAt, 48) < 0) {
            z2 = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z2 = false;
                i10 = 1;
            } else {
                if (charAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                i10 = 1;
            }
        } else {
            z2 = false;
        }
        long j3 = 0;
        long j10 = -256204778801521550L;
        while (i10 < length) {
            int digitOf = CharsKt__CharJVMKt.digitOf(str.charAt(i10), i3);
            if (digitOf < 0) {
                return l9;
            }
            if (j3 < j10) {
                if (j10 != -256204778801521550L) {
                    return l9;
                }
                j10 = j / i3;
                if (j3 < j10) {
                    return l9;
                }
            }
            Long l10 = l9;
            int i11 = i10;
            long j11 = j3 * i3;
            long j12 = digitOf;
            if (j11 < j + j12) {
                return l10;
            }
            j3 = j11 - j12;
            i10 = i11 + 1;
            l9 = l10;
        }
        return z2 ? Long.valueOf(j3) : Long.valueOf(-j3);
    }

    @SinceKotlin(version = "1.1")
    public static final Short toShortOrNull(String str, int i3) {
        int intValue;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Integer intOrNull = toIntOrNull(str, i3);
        if (intOrNull == null || (intValue = intOrNull.intValue()) < -32768 || intValue > 32767) {
            return null;
        }
        return Short.valueOf((short) intValue);
    }
}
