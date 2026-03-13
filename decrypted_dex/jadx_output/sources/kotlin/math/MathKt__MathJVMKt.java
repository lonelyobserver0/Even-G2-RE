package kotlin.math;

import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0006\n\u0002\b%\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\t\n\u0002\u0010\u0007\n\u0002\b\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0019\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0010\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0010\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0019\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0018\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0001H\u0007\u001a\u0011\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0010\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0011\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0010\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0011\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0019\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u0001H\u0087\b\u001a\u0019\u0010#\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010$\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010%\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010%\u001a\u00020\u0001*\u00020\u00012\u0006\u0010&\u001a\u00020'H\u0087\b\u001a\u0015\u0010(\u001a\u00020\u0001*\u00020\u00012\u0006\u0010)\u001a\u00020\u0001H\u0087\b\u001a\u0015\u00101\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u0001H\u0087\b\u001a\u0015\u00101\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u001f\u001a\u00020'H\u0087\b\u001a\r\u00105\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\r\u00106\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\u0015\u00107\u001a\u00020\u0001*\u00020\u00012\u0006\u00108\u001a\u00020\u0001H\u0087\b\u001a\f\u00109\u001a\u00020'*\u00020\u0001H\u0007\u001a\f\u0010:\u001a\u00020;*\u00020\u0001H\u0007\u001a\u0011\u0010\u0000\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u0003\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u0004\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u0005\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u0006\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u0007\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0019\u0010\b\u001a\u00020<2\u0006\u0010\t\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\n\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u000b\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\f\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\r\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u000e\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u000f\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0019\u0010\u0010\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<2\u0006\u0010\t\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u0011\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u0012\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u0013\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0018\u0010\u0014\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<2\u0006\u0010\u0015\u001a\u00020<H\u0007\u001a\u0011\u0010\u0016\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u0017\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0010\u0010\u0018\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0007\u001a\u0011\u0010\u0019\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u001a\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u001b\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0010\u0010\u001c\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0007\u001a\u0011\u0010\u001d\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u001e\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u001f\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0019\u0010 \u001a\u00020<2\u0006\u0010!\u001a\u00020<2\u0006\u0010\"\u001a\u00020<H\u0087\b\u001a\u0019\u0010#\u001a\u00020<2\u0006\u0010!\u001a\u00020<2\u0006\u0010\"\u001a\u00020<H\u0087\b\u001a\u0011\u0010$\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0015\u0010%\u001a\u00020<*\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0015\u0010%\u001a\u00020<*\u00020<2\u0006\u0010&\u001a\u00020'H\u0087\b\u001a\u0015\u0010(\u001a\u00020<*\u00020<2\u0006\u0010)\u001a\u00020<H\u0087\b\u001a\u0015\u00101\u001a\u00020<*\u00020<2\u0006\u0010\u001f\u001a\u00020<H\u0087\b\u001a\u0015\u00101\u001a\u00020<*\u00020<2\u0006\u0010\u001f\u001a\u00020'H\u0087\b\u001a\r\u00105\u001a\u00020<*\u00020<H\u0087\b\u001a\r\u00106\u001a\u00020<*\u00020<H\u0087\b\u001a\u0015\u00107\u001a\u00020<*\u00020<2\u0006\u00108\u001a\u00020<H\u0087\b\u001a\f\u00109\u001a\u00020'*\u00020<H\u0007\u001a\f\u0010:\u001a\u00020;*\u00020<H\u0007\u001a\u0011\u0010\u001e\u001a\u00020'2\u0006\u0010&\u001a\u00020'H\u0087\b\u001a\u0019\u0010 \u001a\u00020'2\u0006\u0010!\u001a\u00020'2\u0006\u0010\"\u001a\u00020'H\u0087\b\u001a\u0019\u0010#\u001a\u00020'2\u0006\u0010!\u001a\u00020'2\u0006\u0010\"\u001a\u00020'H\u0087\b\u001a\u0011\u0010\u001e\u001a\u00020;2\u0006\u0010&\u001a\u00020;H\u0087\b\u001a\u0019\u0010 \u001a\u00020;2\u0006\u0010!\u001a\u00020;2\u0006\u0010\"\u001a\u00020;H\u0087\b\u001a\u0019\u0010#\u001a\u00020;2\u0006\u0010!\u001a\u00020;2\u0006\u0010\"\u001a\u00020;H\u0087\b\"\u001f\u0010*\u001a\u00020\u0001*\u00020\u00018Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u001f\u0010\u001f\u001a\u00020\u0001*\u00020\u00018Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b/\u0010,\u001a\u0004\b0\u0010.\"\u001f\u00102\u001a\u00020\u0001*\u00020\u00018Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b3\u0010,\u001a\u0004\b4\u0010.\"\u001f\u0010*\u001a\u00020<*\u00020<8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010=\u001a\u0004\b-\u0010>\"\u001f\u0010\u001f\u001a\u00020<*\u00020<8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b/\u0010=\u001a\u0004\b0\u0010>\"\u001f\u00102\u001a\u00020<*\u00020<8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b3\u0010=\u001a\u0004\b4\u0010>\"\u001f\u0010*\u001a\u00020'*\u00020'8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010?\u001a\u0004\b-\u0010@\"\u001e\u0010\u001f\u001a\u00020'*\u00020'8FX\u0087\u0004¢\u0006\f\u0012\u0004\b/\u0010?\u001a\u0004\b0\u0010@\"\u001f\u0010*\u001a\u00020;*\u00020;8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010A\u001a\u0004\b-\u0010B\"\u001e\u0010\u001f\u001a\u00020'*\u00020;8FX\u0087\u0004¢\u0006\f\u0012\u0004\b/\u0010A\u001a\u0004\b0\u0010C¨\u0006D"}, d2 = {"sin", "", "x", "cos", "tan", "asin", "acos", "atan", "atan2", "y", "sinh", "cosh", "tanh", "asinh", "acosh", "atanh", "hypot", "sqrt", "exp", "expm1", "log", "base", "ln", "log10", "log2", "ln1p", "ceil", "floor", "truncate", "round", "abs", "sign", "min", "a", "b", "max", "cbrt", "pow", "n", "", "IEEErem", "divisor", "absoluteValue", "getAbsoluteValue$annotations", "(D)V", "getAbsoluteValue", "(D)D", "getSign$annotations", "getSign", "withSign", "ulp", "getUlp$annotations", "getUlp", "nextUp", "nextDown", "nextTowards", "to", "roundToInt", "roundToLong", "", "", "(F)V", "(F)F", "(I)V", "(I)I", "(J)V", "(J)J", "(J)I", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/math/MathKt")
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class MathKt__MathJVMKt extends MathKt__MathHKt {
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double IEEErem(double d8, double d10) {
        return Math.IEEEremainder(d8, d10);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double abs(double d8) {
        return Math.abs(d8);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double acos(double d8) {
        return Math.acos(d8);
    }

    @SinceKotlin(version = "1.2")
    public static final double acosh(double d8) {
        if (d8 < 1.0d) {
            return Double.NaN;
        }
        if (d8 > Constants.upper_taylor_2_bound) {
            return Math.log(d8) + Constants.LN2;
        }
        double d10 = 1;
        double d11 = d8 - d10;
        if (d11 >= Constants.taylor_n_bound) {
            return Math.log(Math.sqrt((d8 * d8) - d10) + d8);
        }
        double sqrt = Math.sqrt(d11);
        if (sqrt >= Constants.taylor_2_bound) {
            sqrt -= ((sqrt * sqrt) * sqrt) / 12;
        }
        return Math.sqrt(2.0d) * sqrt;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double asin(double d8) {
        return Math.asin(d8);
    }

    @SinceKotlin(version = "1.2")
    public static final double asinh(double d8) {
        double d10 = Constants.taylor_n_bound;
        if (d8 < d10) {
            return d8 <= (-d10) ? -asinh(-d8) : Math.abs(d8) >= Constants.taylor_2_bound ? d8 - (((d8 * d8) * d8) / 6) : d8;
        }
        if (d8 <= Constants.upper_taylor_n_bound) {
            return Math.log(Math.sqrt((d8 * d8) + 1) + d8);
        }
        if (d8 > Constants.upper_taylor_2_bound) {
            return Math.log(d8) + Constants.LN2;
        }
        double d11 = d8 * 2;
        return Math.log((1 / d11) + d11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double atan(double d8) {
        return Math.atan(d8);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double atan2(double d8, double d10) {
        return Math.atan2(d8, d10);
    }

    @SinceKotlin(version = "1.2")
    public static final double atanh(double d8) {
        if (Math.abs(d8) < Constants.taylor_n_bound) {
            return Math.abs(d8) > Constants.taylor_2_bound ? (((d8 * d8) * d8) / 3) + d8 : d8;
        }
        double d10 = 1;
        return Math.log((d10 + d8) / (d10 - d8)) / 2;
    }

    @SinceKotlin(version = "1.8")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final double cbrt(double d8) {
        return Math.cbrt(d8);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double ceil(double d8) {
        return Math.ceil(d8);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double cos(double d8) {
        return Math.cos(d8);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double cosh(double d8) {
        return Math.cosh(d8);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double exp(double d8) {
        return Math.exp(d8);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double expm1(double d8) {
        return Math.expm1(d8);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double floor(double d8) {
        return Math.floor(d8);
    }

    private static final double getAbsoluteValue(double d8) {
        return Math.abs(d8);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getAbsoluteValue$annotations(double d8) {
    }

    private static final double getSign(double d8) {
        return Math.signum(d8);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getSign$annotations(double d8) {
    }

    private static final double getUlp(double d8) {
        return Math.ulp(d8);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getUlp$annotations(double d8) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double hypot(double d8, double d10) {
        return Math.hypot(d8, d10);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double ln(double d8) {
        return Math.log(d8);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double ln1p(double d8) {
        return Math.log1p(d8);
    }

    @SinceKotlin(version = "1.2")
    public static final double log(double d8, double d10) {
        if (d10 <= 0.0d || d10 == 1.0d) {
            return Double.NaN;
        }
        return Math.log(d8) / Math.log(d10);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double log10(double d8) {
        return Math.log10(d8);
    }

    @SinceKotlin(version = "1.2")
    public static double log2(double d8) {
        return Math.log(d8) / Constants.LN2;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double max(double d8, double d10) {
        return Math.max(d8, d10);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double min(double d8, double d10) {
        return Math.min(d8, d10);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double nextDown(double d8) {
        return Math.nextAfter(d8, Double.NEGATIVE_INFINITY);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double nextTowards(double d8, double d10) {
        return Math.nextAfter(d8, d10);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double nextUp(double d8) {
        return Math.nextUp(d8);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double pow(double d8, double d10) {
        return Math.pow(d8, d10);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double round(double d8) {
        return Math.rint(d8);
    }

    @SinceKotlin(version = "1.2")
    public static int roundToInt(double d8) {
        if (Double.isNaN(d8)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d8 > 2.147483647E9d) {
            return IntCompanionObject.MAX_VALUE;
        }
        if (d8 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d8);
    }

    @SinceKotlin(version = "1.2")
    public static long roundToLong(double d8) {
        if (Double.isNaN(d8)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d8);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double sign(double d8) {
        return Math.signum(d8);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double sin(double d8) {
        return Math.sin(d8);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double sinh(double d8) {
        return Math.sinh(d8);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double sqrt(double d8) {
        return Math.sqrt(d8);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double tan(double d8) {
        return Math.tan(d8);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double tanh(double d8) {
        return Math.tanh(d8);
    }

    @SinceKotlin(version = "1.2")
    public static final double truncate(double d8) {
        return (Double.isNaN(d8) || Double.isInfinite(d8)) ? d8 : d8 > 0.0d ? Math.floor(d8) : Math.ceil(d8);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double withSign(double d8, double d10) {
        return Math.copySign(d8, d10);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float IEEErem(float f10, float f11) {
        return (float) Math.IEEEremainder(f10, f11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float abs(float f10) {
        return Math.abs(f10);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float acos(float f10) {
        return (float) Math.acos(f10);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float asin(float f10) {
        return (float) Math.asin(f10);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float atan(float f10) {
        return (float) Math.atan(f10);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float atan2(float f10, float f11) {
        return (float) Math.atan2(f10, f11);
    }

    @SinceKotlin(version = "1.8")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final float cbrt(float f10) {
        return (float) Math.cbrt(f10);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float ceil(float f10) {
        return (float) Math.ceil(f10);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float cos(float f10) {
        return (float) Math.cos(f10);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float cosh(float f10) {
        return (float) Math.cosh(f10);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float exp(float f10) {
        return (float) Math.exp(f10);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float expm1(float f10) {
        return (float) Math.expm1(f10);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float floor(float f10) {
        return (float) Math.floor(f10);
    }

    private static final float getAbsoluteValue(float f10) {
        return Math.abs(f10);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getAbsoluteValue$annotations(float f10) {
    }

    private static final float getSign(float f10) {
        return Math.signum(f10);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getSign$annotations(float f10) {
    }

    private static final float getUlp(float f10) {
        return Math.ulp(f10);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getUlp$annotations(float f10) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float hypot(float f10, float f11) {
        return (float) Math.hypot(f10, f11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float ln(float f10) {
        return (float) Math.log(f10);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float ln1p(float f10) {
        return (float) Math.log1p(f10);
    }

    @SinceKotlin(version = "1.2")
    public static final float log(float f10, float f11) {
        if (f11 <= 0.0f || f11 == 1.0f) {
            return Float.NaN;
        }
        return (float) (Math.log(f10) / Math.log(f11));
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float log10(float f10) {
        return (float) Math.log10(f10);
    }

    @SinceKotlin(version = "1.2")
    public static final float log2(float f10) {
        return (float) (Math.log(f10) / Constants.LN2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float max(float f10, float f11) {
        return Math.max(f10, f11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float min(float f10, float f11) {
        return Math.min(f10, f11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float nextDown(float f10) {
        return Math.nextAfter(f10, Double.NEGATIVE_INFINITY);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float nextTowards(float f10, float f11) {
        return Math.nextAfter(f10, f11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float nextUp(float f10) {
        return Math.nextUp(f10);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double pow(double d8, int i3) {
        return Math.pow(d8, i3);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float round(float f10) {
        return (float) Math.rint(f10);
    }

    @SinceKotlin(version = "1.2")
    public static final long roundToLong(float f10) {
        return roundToLong(f10);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float sign(float f10) {
        return Math.signum(f10);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float sin(float f10) {
        return (float) Math.sin(f10);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float sinh(float f10) {
        return (float) Math.sinh(f10);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float sqrt(float f10) {
        return (float) Math.sqrt(f10);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float tan(float f10) {
        return (float) Math.tan(f10);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float tanh(float f10) {
        return (float) Math.tanh(f10);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double withSign(double d8, int i3) {
        return Math.copySign(d8, i3);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final int abs(int i3) {
        return Math.abs(i3);
    }

    private static final int getAbsoluteValue(int i3) {
        return Math.abs(i3);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getAbsoluteValue$annotations(int i3) {
    }

    public static int getSign(int i3) {
        return Integer.signum(i3);
    }

    @SinceKotlin(version = "1.2")
    public static /* synthetic */ void getSign$annotations(int i3) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final int max(int i3, int i10) {
        return Math.max(i3, i10);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final int min(int i3, int i10) {
        return Math.min(i3, i10);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float pow(float f10, float f11) {
        return (float) Math.pow(f10, f11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float withSign(float f10, float f11) {
        return Math.copySign(f10, f11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final long abs(long j) {
        return Math.abs(j);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float atanh(float f10) {
        return (float) atanh(f10);
    }

    private static final long getAbsoluteValue(long j) {
        return Math.abs(j);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getAbsoluteValue$annotations(long j) {
    }

    public static int getSign(long j) {
        return Long.signum(j);
    }

    @SinceKotlin(version = "1.2")
    public static /* synthetic */ void getSign$annotations(long j) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final long max(long j, long j3) {
        return Math.max(j, j3);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final long min(long j, long j3) {
        return Math.min(j, j3);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float pow(float f10, int i3) {
        return (float) Math.pow(f10, i3);
    }

    @SinceKotlin(version = "1.2")
    public static int roundToInt(float f10) {
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f10);
    }

    @SinceKotlin(version = "1.2")
    public static final float truncate(float f10) {
        double ceil;
        if (Float.isNaN(f10) || Float.isInfinite(f10)) {
            return f10;
        }
        if (f10 > 0.0f) {
            ceil = Math.floor(f10);
        } else {
            ceil = Math.ceil(f10);
        }
        return (float) ceil;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float withSign(float f10, int i3) {
        return Math.copySign(f10, i3);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float acosh(float f10) {
        return (float) acosh(f10);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float asinh(float f10) {
        return (float) asinh(f10);
    }
}
