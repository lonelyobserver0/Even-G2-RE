package kotlin;

import kotlin.internal.InlineOnly;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b¢\u0006\u0002\u0010\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u0004H\u0087\b¢\u0006\u0002\u0010\u0005\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u0006H\u0087\b¢\u0006\u0002\u0010\u0007\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\bH\u0087\b¢\u0006\u0002\u0010\t\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\nH\u0087\b¢\u0006\u0002\u0010\u000b\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\fH\u0087\b¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"toULong", "Lkotlin/ULong;", "", "(B)J", "", "(S)J", "", "(I)J", "", "(J)J", "", "(F)J", "", "(D)J", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class ULongKt {
    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long toULong(byte b2) {
        return ULong.m214constructorimpl(b2);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long toULong(short s10) {
        return ULong.m214constructorimpl(s10);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long toULong(int i3) {
        return ULong.m214constructorimpl(i3);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long toULong(long j) {
        return ULong.m214constructorimpl(j);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long toULong(float f10) {
        return UnsignedKt.doubleToULong(f10);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long toULong(double d8) {
        return UnsignedKt.doubleToULong(d8);
    }
}
