package kotlin;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0003\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\r\u0010\u0007\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\r\u0010\b\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\r\u0010\t\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\r\u0010\n\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\u0015\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\r\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\u000e\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\f\u001a\u0015\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\f\u001a\r\u0010\u0012\u001a\u00020\u0001*\u00020\u0010H\u0087\b\u001a\r\u0010\u0012\u001a\u00020\u0001*\u00020\u0013H\u0087\b\u001a\r\u0010\u0014\u001a\u00020\u0015*\u00020\u0001H\u0087\b\u001a!\u0010\u0014\u001a\u00020\u0015*\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0087\b¨\u0006\u0019"}, d2 = {"plus", "Ljava/math/BigInteger;", "other", "minus", "times", "div", "rem", "unaryMinus", "inc", "dec", "inv", "and", "or", "xor", "shl", "n", "", "shr", "toBigInteger", "", "toBigDecimal", "Ljava/math/BigDecimal;", "scale", "mathContext", "Ljava/math/MathContext;", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/NumbersKt")
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class NumbersKt__BigIntegersKt extends NumbersKt__BigDecimalsKt {
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger and(BigInteger bigInteger, BigInteger other) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        BigInteger and = bigInteger.and(other);
        Intrinsics.checkNotNullExpressionValue(and, "and(...)");
        return and;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger dec(BigInteger bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        BigInteger subtract = bigInteger.subtract(BigInteger.ONE);
        Intrinsics.checkNotNullExpressionValue(subtract, "subtract(...)");
        return subtract;
    }

    @InlineOnly
    private static final BigInteger div(BigInteger bigInteger, BigInteger other) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        BigInteger divide = bigInteger.divide(other);
        Intrinsics.checkNotNullExpressionValue(divide, "divide(...)");
        return divide;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger inc(BigInteger bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        BigInteger add = bigInteger.add(BigInteger.ONE);
        Intrinsics.checkNotNullExpressionValue(add, "add(...)");
        return add;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger inv(BigInteger bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        BigInteger not = bigInteger.not();
        Intrinsics.checkNotNullExpressionValue(not, "not(...)");
        return not;
    }

    @InlineOnly
    private static final BigInteger minus(BigInteger bigInteger, BigInteger other) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        BigInteger subtract = bigInteger.subtract(other);
        Intrinsics.checkNotNullExpressionValue(subtract, "subtract(...)");
        return subtract;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger or(BigInteger bigInteger, BigInteger other) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        BigInteger or = bigInteger.or(other);
        Intrinsics.checkNotNullExpressionValue(or, "or(...)");
        return or;
    }

    @InlineOnly
    private static final BigInteger plus(BigInteger bigInteger, BigInteger other) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        BigInteger add = bigInteger.add(other);
        Intrinsics.checkNotNullExpressionValue(add, "add(...)");
        return add;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final BigInteger rem(BigInteger bigInteger, BigInteger other) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        BigInteger remainder = bigInteger.remainder(other);
        Intrinsics.checkNotNullExpressionValue(remainder, "remainder(...)");
        return remainder;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger shl(BigInteger bigInteger, int i3) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        BigInteger shiftLeft = bigInteger.shiftLeft(i3);
        Intrinsics.checkNotNullExpressionValue(shiftLeft, "shiftLeft(...)");
        return shiftLeft;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger shr(BigInteger bigInteger, int i3) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        BigInteger shiftRight = bigInteger.shiftRight(i3);
        Intrinsics.checkNotNullExpressionValue(shiftRight, "shiftRight(...)");
        return shiftRight;
    }

    @InlineOnly
    private static final BigInteger times(BigInteger bigInteger, BigInteger other) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        BigInteger multiply = bigInteger.multiply(other);
        Intrinsics.checkNotNullExpressionValue(multiply, "multiply(...)");
        return multiply;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(BigInteger bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        return new BigDecimal(bigInteger);
    }

    public static /* synthetic */ BigDecimal toBigDecimal$default(BigInteger bigInteger, int i3, MathContext mathContext, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i3 = 0;
        }
        if ((i10 & 2) != 0) {
            mathContext = MathContext.UNLIMITED;
            Intrinsics.checkNotNullExpressionValue(mathContext, "UNLIMITED");
        }
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        return new BigDecimal(bigInteger, i3, mathContext);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger toBigInteger(int i3) {
        BigInteger valueOf = BigInteger.valueOf(i3);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        return valueOf;
    }

    @InlineOnly
    private static final BigInteger unaryMinus(BigInteger bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        BigInteger negate = bigInteger.negate();
        Intrinsics.checkNotNullExpressionValue(negate, "negate(...)");
        return negate;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger xor(BigInteger bigInteger, BigInteger other) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        BigInteger xor = bigInteger.xor(other);
        Intrinsics.checkNotNullExpressionValue(xor, "xor(...)");
        return xor;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(BigInteger bigInteger, int i3, MathContext mathContext) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        return new BigDecimal(bigInteger, i3, mathContext);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger toBigInteger(long j) {
        BigInteger valueOf = BigInteger.valueOf(j);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        return valueOf;
    }
}
