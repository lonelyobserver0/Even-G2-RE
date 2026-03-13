package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u001f\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\tH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\f\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\tH\u0001¢\u0006\u0004\b\r\u0010\u000b\u001a\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000fH\u0001\u001a\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0011H\u0001\u001a\u0016\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000fH\u0081\b¢\u0006\u0002\u0010\u0014\u001a\u0011\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000fH\u0081\b\u001a\u0011\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u000fH\u0081\b\u001a\u0016\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0017H\u0081\b¢\u0006\u0002\u0010\u0019\u001a\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u000fH\u0001\u001a\u0015\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u001bH\u0001¢\u0006\u0002\u0010\u001d\u001a\u0011\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0011H\u0081\b\u001a\u0016\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0017H\u0081\b¢\u0006\u0002\u0010 \u001a\u0010\u0010!\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u0011H\u0001\u001a\u0015\u0010\"\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u001bH\u0001¢\u0006\u0002\u0010#\u001a\u0011\u0010$\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u000fH\u0081\b\u001a\u0019\u0010$\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u000fH\u0081\b\u001a\u0011\u0010'\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u0011H\u0081\b\u001a\u0018\u0010'\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u000fH\u0000¨\u0006("}, d2 = {"uintRemainder", "Lkotlin/UInt;", "v1", "v2", "uintRemainder-J1ME1BU", "(II)I", "uintDivide", "uintDivide-J1ME1BU", "ulongDivide", "Lkotlin/ULong;", "ulongDivide-eb3DHEI", "(JJ)J", "ulongRemainder", "ulongRemainder-eb3DHEI", "uintCompare", "", "ulongCompare", "", "uintToULong", "value", "(I)J", "uintToLong", "uintToFloat", "", "floatToUInt", "(F)I", "uintToDouble", "", "doubleToUInt", "(D)I", "ulongToFloat", "floatToULong", "(F)J", "ulongToDouble", "doubleToULong", "(D)J", "uintToString", "", "base", "ulongToString", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
@JvmName(name = "UnsignedKt")
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class UnsignedKt {
    @PublishedApi
    public static final int doubleToUInt(double d8) {
        if (Double.isNaN(d8) || d8 <= uintToDouble(0)) {
            return 0;
        }
        if (d8 >= uintToDouble(-1)) {
            return -1;
        }
        if (d8 <= 2.147483647E9d) {
            return UInt.m135constructorimpl((int) d8);
        }
        return UInt.m135constructorimpl(UInt.m135constructorimpl(IntCompanionObject.MAX_VALUE) + UInt.m135constructorimpl((int) (d8 - IntCompanionObject.MAX_VALUE)));
    }

    @PublishedApi
    public static final long doubleToULong(double d8) {
        if (Double.isNaN(d8) || d8 <= ulongToDouble(0L)) {
            return 0L;
        }
        if (d8 >= ulongToDouble(-1L)) {
            return -1L;
        }
        return d8 < 9.223372036854776E18d ? ULong.m214constructorimpl((long) d8) : ULong.m214constructorimpl(ULong.m214constructorimpl((long) (d8 - 9.223372036854776E18d)) - Long.MIN_VALUE);
    }

    @PublishedApi
    @InlineOnly
    private static final int floatToUInt(float f10) {
        return doubleToUInt(f10);
    }

    @PublishedApi
    @InlineOnly
    private static final long floatToULong(float f10) {
        return doubleToULong(f10);
    }

    @PublishedApi
    public static final int uintCompare(int i3, int i10) {
        return Intrinsics.compare(i3 ^ Integer.MIN_VALUE, i10 ^ Integer.MIN_VALUE);
    }

    @PublishedApi
    /* renamed from: uintDivide-J1ME1BU, reason: not valid java name */
    public static final int m391uintDivideJ1ME1BU(int i3, int i10) {
        return UInt.m135constructorimpl((int) ((i3 & BodyPartID.bodyIdMax) / (i10 & BodyPartID.bodyIdMax)));
    }

    @PublishedApi
    /* renamed from: uintRemainder-J1ME1BU, reason: not valid java name */
    public static final int m392uintRemainderJ1ME1BU(int i3, int i10) {
        return UInt.m135constructorimpl((int) ((i3 & BodyPartID.bodyIdMax) % (i10 & BodyPartID.bodyIdMax)));
    }

    @PublishedApi
    public static final double uintToDouble(int i3) {
        return (((i3 >>> 31) << 30) * 2) + (Integer.MAX_VALUE & i3);
    }

    @PublishedApi
    @InlineOnly
    private static final float uintToFloat(int i3) {
        return (float) uintToDouble(i3);
    }

    @PublishedApi
    @InlineOnly
    private static final long uintToLong(int i3) {
        return i3 & BodyPartID.bodyIdMax;
    }

    @InlineOnly
    private static final String uintToString(int i3) {
        return String.valueOf(i3 & BodyPartID.bodyIdMax);
    }

    @PublishedApi
    @InlineOnly
    private static final long uintToULong(int i3) {
        return ULong.m214constructorimpl(i3 & BodyPartID.bodyIdMax);
    }

    @PublishedApi
    public static final int ulongCompare(long j, long j3) {
        return Intrinsics.compare(j ^ Long.MIN_VALUE, j3 ^ Long.MIN_VALUE);
    }

    @PublishedApi
    /* renamed from: ulongDivide-eb3DHEI, reason: not valid java name */
    public static final long m393ulongDivideeb3DHEI(long j, long j3) {
        if (j3 < 0) {
            return Long.compareUnsigned(j, j3) < 0 ? ULong.m214constructorimpl(0L) : ULong.m214constructorimpl(1L);
        }
        if (j >= 0) {
            return ULong.m214constructorimpl(j / j3);
        }
        long j10 = ((j >>> 1) / j3) << 1;
        return ULong.m214constructorimpl(j10 + (Long.compareUnsigned(ULong.m214constructorimpl(j - (j10 * j3)), ULong.m214constructorimpl(j3)) < 0 ? 0 : 1));
    }

    @PublishedApi
    /* renamed from: ulongRemainder-eb3DHEI, reason: not valid java name */
    public static final long m394ulongRemaindereb3DHEI(long j, long j3) {
        if (j3 < 0) {
            return Long.compareUnsigned(j, j3) < 0 ? j : ULong.m214constructorimpl(j - j3);
        }
        if (j >= 0) {
            return ULong.m214constructorimpl(j % j3);
        }
        long j10 = j - ((((j >>> 1) / j3) << 1) * j3);
        if (Long.compareUnsigned(ULong.m214constructorimpl(j10), ULong.m214constructorimpl(j3)) < 0) {
            j3 = 0;
        }
        return ULong.m214constructorimpl(j10 - j3);
    }

    @PublishedApi
    public static final double ulongToDouble(long j) {
        return ((j >>> 11) * 2048) + (j & 2047);
    }

    @PublishedApi
    @InlineOnly
    private static final float ulongToFloat(long j) {
        return (float) ulongToDouble(j);
    }

    @InlineOnly
    private static final String ulongToString(long j) {
        return ulongToString(j, 10);
    }

    @InlineOnly
    private static final String uintToString(int i3, int i10) {
        return ulongToString(i3 & BodyPartID.bodyIdMax, i10);
    }

    public static final String ulongToString(long j, int i3) {
        if (j >= 0) {
            String l9 = Long.toString(j, CharsKt.checkRadix(i3));
            Intrinsics.checkNotNullExpressionValue(l9, "toString(...)");
            return l9;
        }
        long j3 = i3;
        long j10 = ((j >>> 1) / j3) << 1;
        long j11 = j - (j10 * j3);
        if (j11 >= j3) {
            j11 -= j3;
            j10++;
        }
        StringBuilder sb2 = new StringBuilder();
        String l10 = Long.toString(j10, CharsKt.checkRadix(i3));
        Intrinsics.checkNotNullExpressionValue(l10, "toString(...)");
        sb2.append(l10);
        String l11 = Long.toString(j11, CharsKt.checkRadix(i3));
        Intrinsics.checkNotNullExpressionValue(l11, "toString(...)");
        sb2.append(l11);
        return sb2.toString();
    }
}
