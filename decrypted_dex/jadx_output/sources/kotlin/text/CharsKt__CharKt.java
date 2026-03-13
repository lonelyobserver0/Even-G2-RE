package kotlin.text;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0007\u001a\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0005\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0006\u001a\f\u0010\u0007\u001a\u00020\u0002*\u00020\u0001H\u0007\u001a\u0014\u0010\u0007\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0007\u001a\f\u0010\b\u001a\u00020\t*\u00020\u0002H\u0007\u001a\u0015\u0010\n\u001a\u00020\t*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\tH\u0087\n\u001a\u001c\u0010\f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r\u001a\n\u0010\u000f\u001a\u00020\r*\u00020\u0002¨\u0006\u0010"}, d2 = {"digitToInt", "", "", "radix", "digitToIntOrNull", "(C)Ljava/lang/Integer;", "(CI)Ljava/lang/Integer;", "digitToChar", "titlecase", "", "plus", "other", "equals", "", "ignoreCase", "isSurrogate", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/text/CharsKt")
@SourceDebugExtension({"SMAP\nChar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Char.kt\nkotlin/text/CharsKt__CharKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,339:1\n1#2:340\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class CharsKt__CharKt extends CharsKt__CharJVMKt {
    @SinceKotlin(version = "1.5")
    public static final char digitToChar(int i3) {
        if (i3 < 0 || i3 >= 10) {
            throw new IllegalArgumentException(Xa.h.g(i3, "Int ", " is not a decimal digit"));
        }
        return (char) (i3 + 48);
    }

    @SinceKotlin(version = "1.5")
    public static final int digitToInt(char c10) {
        int digitOf = CharsKt__CharJVMKt.digitOf(c10, 10);
        if (digitOf >= 0) {
            return digitOf;
        }
        throw new IllegalArgumentException("Char " + c10 + " is not a decimal digit");
    }

    @SinceKotlin(version = "1.5")
    public static final Integer digitToIntOrNull(char c10) {
        Integer valueOf = Integer.valueOf(CharsKt__CharJVMKt.digitOf(c10, 10));
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    public static final boolean equals(char c10, char c11, boolean z2) {
        if (c10 == c11) {
            return true;
        }
        if (!z2) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static /* synthetic */ boolean equals$default(char c10, char c11, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        return equals(c10, c11, z2);
    }

    public static final boolean isSurrogate(char c10) {
        return 55296 <= c10 && c10 < 57344;
    }

    @InlineOnly
    private static final String plus(char c10, String other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return c10 + other;
    }

    @SinceKotlin(version = "1.5")
    public static final String titlecase(char c10) {
        return _OneToManyTitlecaseMappingsKt.titlecaseImpl(c10);
    }

    @SinceKotlin(version = "1.5")
    public static final Integer digitToIntOrNull(char c10, int i3) {
        CharsKt__CharJVMKt.checkRadix(i3);
        Integer valueOf = Integer.valueOf(CharsKt__CharJVMKt.digitOf(c10, i3));
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    @SinceKotlin(version = "1.5")
    public static final int digitToInt(char c10, int i3) {
        Integer digitToIntOrNull = digitToIntOrNull(c10, i3);
        if (digitToIntOrNull != null) {
            return digitToIntOrNull.intValue();
        }
        throw new IllegalArgumentException("Char " + c10 + " is not a digit in the given radix=" + i3);
    }

    @SinceKotlin(version = "1.5")
    public static final char digitToChar(int i3, int i10) {
        if (2 > i10 || i10 >= 37) {
            throw new IllegalArgumentException(Xa.h.g(i10, "Invalid radix: ", ". Valid radix values are in range 2..36"));
        }
        if (i3 < 0 || i3 >= i10) {
            throw new IllegalArgumentException(Xa.h.o("Digit ", i3, i10, " does not represent a valid digit in radix "));
        }
        return (char) (i3 < 10 ? i3 + 48 : ((char) (i3 + 65)) - '\n');
    }
}
