package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\u0010\t\n\u0002\u0010\u0007\n\u0002\u0010\u0006\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0006*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0006*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\b*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\bH\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0087\b¨\u0006\t"}, d2 = {"floorDiv", "", "", "other", "mod", "", "", "", "", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/NumbersKt")
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class NumbersKt__FloorDivModKt extends NumbersKt__BigIntegersKt {
    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(byte b2, byte b10) {
        int i3 = b2 / b10;
        return ((b2 ^ b10) >= 0 || b10 * i3 == b2) ? i3 : i3 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final byte mod(byte b2, byte b10) {
        int i3 = b2 % b10;
        return (byte) (i3 + (b10 & (((i3 ^ b10) & ((-i3) | i3)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(byte b2, short s10) {
        int i3 = b2 / s10;
        return ((b2 ^ s10) >= 0 || s10 * i3 == b2) ? i3 : i3 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final short mod(byte b2, short s10) {
        int i3 = b2 % s10;
        return (short) (i3 + (s10 & (((i3 ^ s10) & ((-i3) | i3)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(byte b2, int i3) {
        int i10 = b2 / i3;
        return ((b2 ^ i3) >= 0 || i3 * i10 == b2) ? i10 : i10 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int mod(byte b2, int i3) {
        int i10 = b2 % i3;
        return i10 + (i3 & (((i10 ^ i3) & ((-i10) | i10)) >> 31));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long floorDiv(byte b2, long j) {
        long j3 = b2;
        long j10 = j3 / j;
        return ((j3 ^ j) >= 0 || j * j10 == j3) ? j10 : j10 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long mod(byte b2, long j) {
        long j3 = b2 % j;
        return j3 + (j & (((j3 ^ j) & ((-j3) | j3)) >> 63));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(short s10, byte b2) {
        int i3 = s10 / b2;
        return ((s10 ^ b2) >= 0 || b2 * i3 == s10) ? i3 : i3 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final byte mod(short s10, byte b2) {
        int i3 = s10 % b2;
        return (byte) (i3 + (b2 & (((i3 ^ b2) & ((-i3) | i3)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(short s10, short s11) {
        int i3 = s10 / s11;
        return ((s10 ^ s11) >= 0 || s11 * i3 == s10) ? i3 : i3 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final short mod(short s10, short s11) {
        int i3 = s10 % s11;
        return (short) (i3 + (s11 & (((i3 ^ s11) & ((-i3) | i3)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(short s10, int i3) {
        int i10 = s10 / i3;
        return ((s10 ^ i3) >= 0 || i3 * i10 == s10) ? i10 : i10 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int mod(short s10, int i3) {
        int i10 = s10 % i3;
        return i10 + (i3 & (((i10 ^ i3) & ((-i10) | i10)) >> 31));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long floorDiv(short s10, long j) {
        long j3 = s10;
        long j10 = j3 / j;
        return ((j3 ^ j) >= 0 || j * j10 == j3) ? j10 : j10 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long mod(short s10, long j) {
        long j3 = s10 % j;
        return j3 + (j & (((j3 ^ j) & ((-j3) | j3)) >> 63));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(int i3, byte b2) {
        int i10 = i3 / b2;
        return ((i3 ^ b2) >= 0 || b2 * i10 == i3) ? i10 : i10 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final byte mod(int i3, byte b2) {
        int i10 = i3 % b2;
        return (byte) (i10 + (b2 & (((i10 ^ b2) & ((-i10) | i10)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(int i3, short s10) {
        int i10 = i3 / s10;
        return ((i3 ^ s10) >= 0 || s10 * i10 == i3) ? i10 : i10 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final short mod(int i3, short s10) {
        int i10 = i3 % s10;
        return (short) (i10 + (s10 & (((i10 ^ s10) & ((-i10) | i10)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(int i3, int i10) {
        int i11 = i3 / i10;
        return ((i3 ^ i10) >= 0 || i10 * i11 == i3) ? i11 : i11 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int mod(int i3, int i10) {
        int i11 = i3 % i10;
        return i11 + (i10 & (((i11 ^ i10) & ((-i11) | i11)) >> 31));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long floorDiv(int i3, long j) {
        long j3 = i3;
        long j10 = j3 / j;
        return ((j3 ^ j) >= 0 || j * j10 == j3) ? j10 : j10 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long mod(int i3, long j) {
        long j3 = i3 % j;
        return j3 + (j & (((j3 ^ j) & ((-j3) | j3)) >> 63));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long floorDiv(long j, byte b2) {
        long j3 = b2;
        long j10 = j / j3;
        return ((j ^ j3) >= 0 || j3 * j10 == j) ? j10 : j10 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final byte mod(long j, byte b2) {
        long j3 = j % b2;
        return (byte) (j3 + (r0 & (((j3 ^ r0) & ((-j3) | j3)) >> 63)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long floorDiv(long j, short s10) {
        long j3 = s10;
        long j10 = j / j3;
        return ((j ^ j3) >= 0 || j3 * j10 == j) ? j10 : j10 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final short mod(long j, short s10) {
        long j3 = j % s10;
        return (short) (j3 + (r0 & (((j3 ^ r0) & ((-j3) | j3)) >> 63)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long floorDiv(long j, int i3) {
        long j3 = i3;
        long j10 = j / j3;
        return ((j ^ j3) >= 0 || j3 * j10 == j) ? j10 : j10 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int mod(long j, int i3) {
        long j3 = i3;
        long j10 = j % j3;
        return (int) (j10 + (j3 & (((j10 ^ j3) & ((-j10) | j10)) >> 63)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long floorDiv(long j, long j3) {
        long j10 = j / j3;
        return ((j ^ j3) >= 0 || j3 * j10 == j) ? j10 : j10 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long mod(long j, long j3) {
        long j10 = j % j3;
        return j10 + (j3 & (((j10 ^ j3) & ((-j10) | j10)) >> 63));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final float mod(float f10, float f11) {
        float f12 = f10 % f11;
        return (f12 == 0.0f || Math.signum(f12) == Math.signum(f11)) ? f12 : f12 + f11;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final double mod(float f10, double d8) {
        double d10 = f10 % d8;
        return (d10 == 0.0d || Math.signum(d10) == Math.signum(d8)) ? d10 : d10 + d8;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final double mod(double d8, float f10) {
        double d10 = f10;
        double d11 = d8 % d10;
        return (d11 == 0.0d || Math.signum(d11) == Math.signum(d10)) ? d11 : d11 + d10;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final double mod(double d8, double d10) {
        double d11 = d8 % d10;
        return (d11 == 0.0d || Math.signum(d11) == Math.signum(d10)) ? d11 : d11 + d10;
    }
}
