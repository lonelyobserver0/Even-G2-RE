package kotlin.experimental;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\n\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\u0003\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0006H\u0087\f\u001a\u0015\u0010\u0003\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0006H\u0087\f\u001a\u0015\u0010\u0004\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0006H\u0087\f\u001a\r\u0010\u0005\u001a\u00020\u0006*\u00020\u0006H\u0087\b¨\u0006\u0007"}, d2 = {"and", "", "other", "or", "xor", "inv", "", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class BitwiseOperationsKt {
    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte and(byte b2, byte b10) {
        return (byte) (b2 & b10);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte inv(byte b2) {
        return (byte) (~b2);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte or(byte b2, byte b10) {
        return (byte) (b2 | b10);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte xor(byte b2, byte b10) {
        return (byte) (b2 ^ b10);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short and(short s10, short s11) {
        return (short) (s10 & s11);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short inv(short s10) {
        return (short) (~s10);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short or(short s10, short s11) {
        return (short) (s10 | s11);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short xor(short s10, short s11) {
        return (short) (s10 ^ s11);
    }
}
