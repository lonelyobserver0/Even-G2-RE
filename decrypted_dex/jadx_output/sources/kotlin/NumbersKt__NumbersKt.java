package kotlin;

import kotlin.internal.InlineOnly;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0005\n\u0002\b\u0007\n\u0002\u0010\n\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0005\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010\u0006\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\u0014\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\t\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0001H\u0007\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\nH\u0087\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\nH\u0087\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\nH\u0087\b\u001a\r\u0010\u0005\u001a\u00020\n*\u00020\nH\u0087\b\u001a\r\u0010\u0006\u001a\u00020\n*\u00020\nH\u0087\b\u001a\u0014\u0010\u0007\u001a\u00020\n*\u00020\n2\u0006\u0010\b\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\t\u001a\u00020\n*\u00020\n2\u0006\u0010\b\u001a\u00020\u0001H\u0007¨\u0006\u000b"}, d2 = {"countOneBits", "", "", "countLeadingZeroBits", "countTrailingZeroBits", "takeHighestOneBit", "takeLowestOneBit", "rotateLeft", "bitCount", "rotateRight", "", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/NumbersKt")
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class NumbersKt__NumbersKt extends NumbersKt__NumbersJVMKt {
    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int countLeadingZeroBits(byte b2) {
        return Integer.numberOfLeadingZeros(b2 & UByte.MAX_VALUE) - 24;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int countOneBits(byte b2) {
        return Integer.bitCount(b2 & UByte.MAX_VALUE);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int countTrailingZeroBits(byte b2) {
        return Integer.numberOfTrailingZeros(b2 | UByte.MIN_VALUE);
    }

    @SinceKotlin(version = "1.6")
    public static final byte rotateLeft(byte b2, int i3) {
        int i10 = i3 & 7;
        return (byte) (((b2 & 255) >>> (8 - i10)) | (b2 << i10));
    }

    @SinceKotlin(version = "1.6")
    public static final byte rotateRight(byte b2, int i3) {
        int i10 = i3 & 7;
        return (byte) (((b2 & 255) >>> i10) | (b2 << (8 - i10)));
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final byte takeHighestOneBit(byte b2) {
        return (byte) Integer.highestOneBit(b2 & UByte.MAX_VALUE);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final byte takeLowestOneBit(byte b2) {
        return (byte) Integer.lowestOneBit(b2);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int countLeadingZeroBits(short s10) {
        return Integer.numberOfLeadingZeros(s10 & UShort.MAX_VALUE) - 16;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int countOneBits(short s10) {
        return Integer.bitCount(s10 & UShort.MAX_VALUE);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int countTrailingZeroBits(short s10) {
        return Integer.numberOfTrailingZeros(s10 | UShort.MIN_VALUE);
    }

    @SinceKotlin(version = "1.6")
    public static final short rotateLeft(short s10, int i3) {
        int i10 = i3 & 15;
        return (short) (((s10 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) >>> (16 - i10)) | (s10 << i10));
    }

    @SinceKotlin(version = "1.6")
    public static final short rotateRight(short s10, int i3) {
        int i10 = i3 & 15;
        return (short) (((s10 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) >>> i10) | (s10 << (16 - i10)));
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final short takeHighestOneBit(short s10) {
        return (short) Integer.highestOneBit(s10 & UShort.MAX_VALUE);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final short takeLowestOneBit(short s10) {
        return (short) Integer.lowestOneBit(s10);
    }
}
