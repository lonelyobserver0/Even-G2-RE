package kotlin.comparisons;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000J\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\u0010\n\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\u0007\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u0017\n\u0002\u0010\u0015\n\u0002\u0010\u0016\n\u0002\u0010\u0014\n\u0002\u0010\u0013\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0005\u001a\u0019\u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0006H\u0087\b\u001a\u0019\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0087\b\u001a\u0019\u0010\u0000\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\bH\u0087\b\u001a\u0019\u0010\u0000\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\tH\u0087\b\u001a\u0019\u0010\u0000\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\nH\u0087\b\u001a\u0019\u0010\u0000\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000bH\u0087\b\u001a5\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u00012\u0006\u0010\f\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\r\u001a!\u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0087\b\u001a!\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0087\b\u001a!\u0010\u0000\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0087\b\u001a!\u0010\u0000\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0087\b\u001a!\u0010\u0000\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0087\b\u001a!\u0010\u0000\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0087\b\u001a9\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00010\u000f\"\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0010\u001a\u001c\u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\n\u0010\u000e\u001a\u00020\u0011\"\u00020\u0006H\u0007\u001a\u001c\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\n\u0010\u000e\u001a\u00020\u0012\"\u00020\u0007H\u0007\u001a\u001c\u0010\u0000\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\n\u0010\u000e\u001a\u00020\u0013\"\u00020\bH\u0007\u001a\u001c\u0010\u0000\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\n\u0010\u000e\u001a\u00020\u0014\"\u00020\tH\u0007\u001a\u001c\u0010\u0000\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\n\u0010\u000e\u001a\u00020\u0015\"\u00020\nH\u0007\u001a\u001c\u0010\u0000\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\n\u0010\u000e\u001a\u00020\u0016\"\u00020\u000bH\u0007\u001a-\u0010\u0017\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0005\u001a\u0019\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0006H\u0087\b\u001a\u0019\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0087\b\u001a\u0019\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\bH\u0087\b\u001a\u0019\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\tH\u0087\b\u001a\u0019\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\nH\u0087\b\u001a\u0019\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000bH\u0087\b\u001a5\u0010\u0017\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u00012\u0006\u0010\f\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\r\u001a!\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0087\b\u001a!\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0087\b\u001a!\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0087\b\u001a!\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0087\b\u001a!\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0087\b\u001a!\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0087\b\u001a9\u0010\u0017\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00010\u000f\"\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0010\u001a\u001c\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\n\u0010\u000e\u001a\u00020\u0011\"\u00020\u0006H\u0007\u001a\u001c\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\n\u0010\u000e\u001a\u00020\u0012\"\u00020\u0007H\u0007\u001a\u001c\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\n\u0010\u000e\u001a\u00020\u0013\"\u00020\bH\u0007\u001a\u001c\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\n\u0010\u000e\u001a\u00020\u0014\"\u00020\tH\u0007\u001a\u001c\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\n\u0010\u000e\u001a\u00020\u0015\"\u00020\nH\u0007\u001a\u001c\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\n\u0010\u000e\u001a\u00020\u0016\"\u00020\u000bH\u0007¨\u0006\u0018"}, d2 = {"maxOf", "T", "", "a", "b", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "", "", "", "", "", "", "c", "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "other", "", "(Ljava/lang/Comparable;[Ljava/lang/Comparable;)Ljava/lang/Comparable;", "", "", "", "", "", "", "minOf", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/comparisons/ComparisonsKt")
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ComparisonsKt___ComparisonsJvmKt extends ComparisonsKt__ComparisonsKt {
    @SinceKotlin(version = "1.1")
    public static <T extends Comparable<? super T>> T maxOf(T a3, T b2) {
        Intrinsics.checkNotNullParameter(a3, "a");
        Intrinsics.checkNotNullParameter(b2, "b");
        return a3.compareTo(b2) >= 0 ? a3 : b2;
    }

    @SinceKotlin(version = "1.1")
    public static final <T extends Comparable<? super T>> T minOf(T a3, T b2) {
        Intrinsics.checkNotNullParameter(a3, "a");
        Intrinsics.checkNotNullParameter(b2, "b");
        return a3.compareTo(b2) <= 0 ? a3 : b2;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte maxOf(byte b2, byte b10) {
        return (byte) Math.max((int) b2, (int) b10);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte minOf(byte b2, byte b10) {
        return (byte) Math.min((int) b2, (int) b10);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short maxOf(short s10, short s11) {
        return (short) Math.max((int) s10, (int) s11);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short minOf(short s10, short s11) {
        return (short) Math.min((int) s10, (int) s11);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int maxOf(int i3, int i10) {
        return Math.max(i3, i10);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int minOf(int i3, int i10) {
        return Math.min(i3, i10);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long maxOf(long j, long j3) {
        return Math.max(j, j3);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long minOf(long j, long j3) {
        return Math.min(j, j3);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final float maxOf(float f10, float f11) {
        return Math.max(f10, f11);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final float minOf(float f10, float f11) {
        return Math.min(f10, f11);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final double maxOf(double d8, double d10) {
        return Math.max(d8, d10);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final double minOf(double d8, double d10) {
        return Math.min(d8, d10);
    }

    @SinceKotlin(version = "1.1")
    public static final <T extends Comparable<? super T>> T maxOf(T a3, T b2, T c10) {
        Intrinsics.checkNotNullParameter(a3, "a");
        Intrinsics.checkNotNullParameter(b2, "b");
        Intrinsics.checkNotNullParameter(c10, "c");
        return (T) maxOf(a3, maxOf(b2, c10));
    }

    @SinceKotlin(version = "1.1")
    public static final <T extends Comparable<? super T>> T minOf(T a3, T b2, T c10) {
        Intrinsics.checkNotNullParameter(a3, "a");
        Intrinsics.checkNotNullParameter(b2, "b");
        Intrinsics.checkNotNullParameter(c10, "c");
        return (T) minOf(a3, minOf(b2, c10));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte maxOf(byte b2, byte b10, byte b11) {
        return (byte) Math.max((int) b2, Math.max((int) b10, (int) b11));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte minOf(byte b2, byte b10, byte b11) {
        return (byte) Math.min((int) b2, Math.min((int) b10, (int) b11));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short maxOf(short s10, short s11, short s12) {
        return (short) Math.max((int) s10, Math.max((int) s11, (int) s12));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short minOf(short s10, short s11, short s12) {
        return (short) Math.min((int) s10, Math.min((int) s11, (int) s12));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int maxOf(int i3, int i10, int i11) {
        return Math.max(i3, Math.max(i10, i11));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int minOf(int i3, int i10, int i11) {
        return Math.min(i3, Math.min(i10, i11));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long maxOf(long j, long j3, long j10) {
        return Math.max(j, Math.max(j3, j10));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long minOf(long j, long j3, long j10) {
        return Math.min(j, Math.min(j3, j10));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final float maxOf(float f10, float f11, float f12) {
        return Math.max(f10, Math.max(f11, f12));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final float minOf(float f10, float f11, float f12) {
        return Math.min(f10, Math.min(f11, f12));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final double maxOf(double d8, double d10, double d11) {
        return Math.max(d8, Math.max(d10, d11));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final double minOf(double d8, double d10, double d11) {
        return Math.min(d8, Math.min(d10, d11));
    }

    @SinceKotlin(version = "1.4")
    public static final <T extends Comparable<? super T>> T maxOf(T a3, T... other) {
        Intrinsics.checkNotNullParameter(a3, "a");
        Intrinsics.checkNotNullParameter(other, "other");
        for (T t3 : other) {
            a3 = (T) maxOf(a3, t3);
        }
        return a3;
    }

    @SinceKotlin(version = "1.4")
    public static final <T extends Comparable<? super T>> T minOf(T a3, T... other) {
        Intrinsics.checkNotNullParameter(a3, "a");
        Intrinsics.checkNotNullParameter(other, "other");
        for (T t3 : other) {
            a3 = (T) minOf(a3, t3);
        }
        return a3;
    }

    @SinceKotlin(version = "1.4")
    public static final byte maxOf(byte b2, byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (byte b10 : other) {
            b2 = (byte) Math.max((int) b2, (int) b10);
        }
        return b2;
    }

    @SinceKotlin(version = "1.4")
    public static final byte minOf(byte b2, byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (byte b10 : other) {
            b2 = (byte) Math.min((int) b2, (int) b10);
        }
        return b2;
    }

    @SinceKotlin(version = "1.4")
    public static final short maxOf(short s10, short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (short s11 : other) {
            s10 = (short) Math.max((int) s10, (int) s11);
        }
        return s10;
    }

    @SinceKotlin(version = "1.4")
    public static final short minOf(short s10, short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (short s11 : other) {
            s10 = (short) Math.min((int) s10, (int) s11);
        }
        return s10;
    }

    @SinceKotlin(version = "1.4")
    public static final int maxOf(int i3, int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i10 : other) {
            i3 = Math.max(i3, i10);
        }
        return i3;
    }

    @SinceKotlin(version = "1.4")
    public static final int minOf(int i3, int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i10 : other) {
            i3 = Math.min(i3, i10);
        }
        return i3;
    }

    @SinceKotlin(version = "1.4")
    public static final long maxOf(long j, long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (long j3 : other) {
            j = Math.max(j, j3);
        }
        return j;
    }

    @SinceKotlin(version = "1.4")
    public static final long minOf(long j, long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (long j3 : other) {
            j = Math.min(j, j3);
        }
        return j;
    }

    @SinceKotlin(version = "1.4")
    public static final float maxOf(float f10, float... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (float f11 : other) {
            f10 = Math.max(f10, f11);
        }
        return f10;
    }

    @SinceKotlin(version = "1.4")
    public static final float minOf(float f10, float... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (float f11 : other) {
            f10 = Math.min(f10, f11);
        }
        return f10;
    }

    @SinceKotlin(version = "1.4")
    public static final double maxOf(double d8, double... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (double d10 : other) {
            d8 = Math.max(d8, d10);
        }
        return d8;
    }

    @SinceKotlin(version = "1.4")
    public static final double minOf(double d8, double... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (double d10 : other) {
            d8 = Math.min(d8, d10);
        }
        return d8;
    }
}
