package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\u0087\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0003H\u0087\b\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0003H\u0087\b\u001a\r\u0010\u0006\u001a\u00020\u0007*\u00020\u0002H\u0087\b\u001a\r\u0010\b\u001a\u00020\u0007*\u00020\u0002H\u0087\b\u001a\u0015\u0010\t\u001a\u00020\u0002*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0087\b\u001a\r\u0010\u0006\u001a\u00020\f*\u00020\u0003H\u0087\b\u001a\r\u0010\b\u001a\u00020\f*\u00020\u0003H\u0087\b\u001a\u0015\u0010\t\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u000b\u001a\u00020\fH\u0087\b\u001a\r\u0010\u000e\u001a\u00020\f*\u00020\fH\u0087\b\u001a\r\u0010\u000f\u001a\u00020\f*\u00020\fH\u0087\b\u001a\r\u0010\u0010\u001a\u00020\f*\u00020\fH\u0087\b\u001a\r\u0010\u0011\u001a\u00020\f*\u00020\fH\u0087\b\u001a\r\u0010\u0012\u001a\u00020\f*\u00020\fH\u0087\b\u001a\u0015\u0010\u0013\u001a\u00020\f*\u00020\f2\u0006\u0010\u0014\u001a\u00020\fH\u0087\b\u001a\u0015\u0010\u0015\u001a\u00020\f*\u00020\f2\u0006\u0010\u0014\u001a\u00020\fH\u0087\b\u001a\r\u0010\u000e\u001a\u00020\f*\u00020\u0007H\u0087\b\u001a\r\u0010\u000f\u001a\u00020\f*\u00020\u0007H\u0087\b\u001a\r\u0010\u0010\u001a\u00020\f*\u00020\u0007H\u0087\b\u001a\r\u0010\u0011\u001a\u00020\u0007*\u00020\u0007H\u0087\b\u001a\r\u0010\u0012\u001a\u00020\u0007*\u00020\u0007H\u0087\b\u001a\u0015\u0010\u0013\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0014\u001a\u00020\fH\u0087\b\u001a\u0015\u0010\u0015\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0014\u001a\u00020\fH\u0087\b¨\u0006\u0016"}, d2 = {"isNaN", "", "", "", "isInfinite", "isFinite", "toBits", "", "toRawBits", "fromBits", "Lkotlin/Double$Companion;", "bits", "", "Lkotlin/Float$Companion;", "countOneBits", "countLeadingZeroBits", "countTrailingZeroBits", "takeHighestOneBit", "takeLowestOneBit", "rotateLeft", "bitCount", "rotateRight", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/NumbersKt")
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class NumbersKt__NumbersJVMKt extends NumbersKt__FloorDivModKt {
    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int countLeadingZeroBits(int i3) {
        return Integer.numberOfLeadingZeros(i3);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int countOneBits(int i3) {
        return Integer.bitCount(i3);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int countTrailingZeroBits(int i3) {
        return Integer.numberOfTrailingZeros(i3);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double fromBits(DoubleCompanionObject doubleCompanionObject, long j) {
        Intrinsics.checkNotNullParameter(doubleCompanionObject, "<this>");
        return Double.longBitsToDouble(j);
    }

    @InlineOnly
    private static final boolean isFinite(double d8) {
        return Math.abs(d8) <= Double.MAX_VALUE;
    }

    @InlineOnly
    private static final boolean isInfinite(double d8) {
        return Double.isInfinite(d8);
    }

    @InlineOnly
    private static final boolean isNaN(double d8) {
        return Double.isNaN(d8);
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    private static final int rotateLeft(int i3, int i10) {
        return Integer.rotateLeft(i3, i10);
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    private static final int rotateRight(int i3, int i10) {
        return Integer.rotateRight(i3, i10);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int takeHighestOneBit(int i3) {
        return Integer.highestOneBit(i3);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int takeLowestOneBit(int i3) {
        return Integer.lowestOneBit(i3);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final long toBits(double d8) {
        return Double.doubleToLongBits(d8);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final long toRawBits(double d8) {
        return Double.doubleToRawLongBits(d8);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int countLeadingZeroBits(long j) {
        return Long.numberOfLeadingZeros(j);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int countOneBits(long j) {
        return Long.bitCount(j);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int countTrailingZeroBits(long j) {
        return Long.numberOfTrailingZeros(j);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float fromBits(FloatCompanionObject floatCompanionObject, int i3) {
        Intrinsics.checkNotNullParameter(floatCompanionObject, "<this>");
        return Float.intBitsToFloat(i3);
    }

    @InlineOnly
    private static final boolean isFinite(float f10) {
        return Math.abs(f10) <= Float.MAX_VALUE;
    }

    @InlineOnly
    private static final boolean isInfinite(float f10) {
        return Float.isInfinite(f10);
    }

    @InlineOnly
    private static final boolean isNaN(float f10) {
        return Float.isNaN(f10);
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    private static final long rotateLeft(long j, int i3) {
        return Long.rotateLeft(j, i3);
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    private static final long rotateRight(long j, int i3) {
        return Long.rotateRight(j, i3);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final long takeHighestOneBit(long j) {
        return Long.highestOneBit(j);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final long takeLowestOneBit(long j) {
        return Long.lowestOneBit(j);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final int toBits(float f10) {
        return Float.floatToIntBits(f10);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final int toRawBits(float f10) {
        return Float.floatToRawIntBits(f10);
    }
}
