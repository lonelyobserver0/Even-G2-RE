package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.URandomKt;
import kotlin.ranges.UIntProgression;
import kotlin.ranges.ULongProgression;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0003\u001a\u0011\u0010\u0000\u001a\u00020\u0004*\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\u000e\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007\u001a\u000e\u0010\u0007\u001a\u0004\u0018\u00010\u0004*\u00020\u0005H\u0007\u001a\u0011\u0010\b\u001a\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0003\u001a\u0011\u0010\b\u001a\u00020\u0004*\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\u000e\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007\u001a\u000e\u0010\t\u001a\u0004\u0018\u00010\u0004*\u00020\u0005H\u0007\u001a\u0012\u0010\n\u001a\u00020\u0001*\u00020\u000bH\u0087\b¢\u0006\u0002\u0010\f\u001a\u0012\u0010\n\u001a\u00020\u0004*\u00020\rH\u0087\b¢\u0006\u0002\u0010\u000e\u001a\u0019\u0010\n\u001a\u00020\u0001*\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a\u0019\u0010\n\u001a\u00020\u0004*\u00020\r2\u0006\u0010\n\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0001*\u00020\u000bH\u0087\b\u001a\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0004*\u00020\rH\u0087\b\u001a\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0001*\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000fH\u0007\u001a\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0004*\u00020\r2\u0006\u0010\n\u001a\u00020\u000fH\u0007\u001a\u001c\u0010\u0013\u001a\u00020\u0014*\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0087\n¢\u0006\u0002\b\u0016\u001a\u001c\u0010\u0013\u001a\u00020\u0014*\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0087\n¢\u0006\u0002\b\u0017\u001a\u001c\u0010\u0013\u001a\u00020\u0014*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001c\u0010\u0013\u001a\u00020\u0014*\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001c\u0010\u0013\u001a\u00020\u0014*\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0001H\u0087\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001c\u0010\u0013\u001a\u00020\u0014*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0004H\u0087\u0002¢\u0006\u0004\b \u0010!\u001a\u001c\u0010\u0013\u001a\u00020\u0014*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\"H\u0087\u0002¢\u0006\u0004\b#\u0010$\u001a\u001c\u0010\u0013\u001a\u00020\u0014*\u00020\r2\u0006\u0010\u0018\u001a\u00020\"H\u0087\u0002¢\u0006\u0004\b%\u0010&\u001a\u001c\u0010'\u001a\u00020\u0002*\u00020\u00192\u0006\u0010(\u001a\u00020\u0019H\u0087\u0004¢\u0006\u0004\b)\u0010*\u001a\u001c\u0010'\u001a\u00020\u0002*\u00020\u00012\u0006\u0010(\u001a\u00020\u0001H\u0087\u0004¢\u0006\u0004\b+\u0010,\u001a\u001c\u0010'\u001a\u00020\u0005*\u00020\u00042\u0006\u0010(\u001a\u00020\u0004H\u0087\u0004¢\u0006\u0004\b-\u0010.\u001a\u001c\u0010'\u001a\u00020\u0002*\u00020\"2\u0006\u0010(\u001a\u00020\"H\u0087\u0004¢\u0006\u0004\b/\u00100\u001a\f\u00101\u001a\u00020\u0002*\u00020\u0002H\u0007\u001a\f\u00101\u001a\u00020\u0005*\u00020\u0005H\u0007\u001a\u0015\u00102\u001a\u00020\u0002*\u00020\u00022\u0006\u00102\u001a\u000203H\u0087\u0004\u001a\u0015\u00102\u001a\u00020\u0005*\u00020\u00052\u0006\u00102\u001a\u000204H\u0087\u0004\u001a\u001c\u00105\u001a\u00020\u000b*\u00020\u00192\u0006\u0010(\u001a\u00020\u0019H\u0087\u0004¢\u0006\u0004\b6\u00107\u001a\u001c\u00105\u001a\u00020\u000b*\u00020\u00012\u0006\u0010(\u001a\u00020\u0001H\u0087\u0004¢\u0006\u0004\b8\u00109\u001a\u001c\u00105\u001a\u00020\r*\u00020\u00042\u0006\u0010(\u001a\u00020\u0004H\u0087\u0004¢\u0006\u0004\b:\u0010;\u001a\u001c\u00105\u001a\u00020\u000b*\u00020\"2\u0006\u0010(\u001a\u00020\"H\u0087\u0004¢\u0006\u0004\b<\u0010=\u001a\u001b\u0010>\u001a\u00020\u0001*\u00020\u00012\u0006\u0010?\u001a\u00020\u0001H\u0007¢\u0006\u0004\b@\u0010A\u001a\u001b\u0010>\u001a\u00020\u0004*\u00020\u00042\u0006\u0010?\u001a\u00020\u0004H\u0007¢\u0006\u0004\bB\u0010C\u001a\u001b\u0010>\u001a\u00020\u0019*\u00020\u00192\u0006\u0010?\u001a\u00020\u0019H\u0007¢\u0006\u0004\bD\u0010E\u001a\u001b\u0010>\u001a\u00020\"*\u00020\"2\u0006\u0010?\u001a\u00020\"H\u0007¢\u0006\u0004\bF\u0010G\u001a\u001b\u0010H\u001a\u00020\u0001*\u00020\u00012\u0006\u0010I\u001a\u00020\u0001H\u0007¢\u0006\u0004\bJ\u0010A\u001a\u001b\u0010H\u001a\u00020\u0004*\u00020\u00042\u0006\u0010I\u001a\u00020\u0004H\u0007¢\u0006\u0004\bK\u0010C\u001a\u001b\u0010H\u001a\u00020\u0019*\u00020\u00192\u0006\u0010I\u001a\u00020\u0019H\u0007¢\u0006\u0004\bL\u0010E\u001a\u001b\u0010H\u001a\u00020\"*\u00020\"2\u0006\u0010I\u001a\u00020\"H\u0007¢\u0006\u0004\bM\u0010G\u001a#\u0010N\u001a\u00020\u0001*\u00020\u00012\u0006\u0010?\u001a\u00020\u00012\u0006\u0010I\u001a\u00020\u0001H\u0007¢\u0006\u0004\bO\u0010P\u001a#\u0010N\u001a\u00020\u0004*\u00020\u00042\u0006\u0010?\u001a\u00020\u00042\u0006\u0010I\u001a\u00020\u0004H\u0007¢\u0006\u0004\bQ\u0010R\u001a#\u0010N\u001a\u00020\u0019*\u00020\u00192\u0006\u0010?\u001a\u00020\u00192\u0006\u0010I\u001a\u00020\u0019H\u0007¢\u0006\u0004\bS\u0010T\u001a#\u0010N\u001a\u00020\"*\u00020\"2\u0006\u0010?\u001a\u00020\"2\u0006\u0010I\u001a\u00020\"H\u0007¢\u0006\u0004\bU\u0010V\u001a!\u0010N\u001a\u00020\u0001*\u00020\u00012\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00010XH\u0007¢\u0006\u0004\bY\u0010Z\u001a!\u0010N\u001a\u00020\u0004*\u00020\u00042\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00040XH\u0007¢\u0006\u0004\b[\u0010\\¨\u0006]"}, d2 = {"first", "Lkotlin/UInt;", "Lkotlin/ranges/UIntProgression;", "(Lkotlin/ranges/UIntProgression;)I", "Lkotlin/ULong;", "Lkotlin/ranges/ULongProgression;", "(Lkotlin/ranges/ULongProgression;)J", "firstOrNull", "last", "lastOrNull", "random", "Lkotlin/ranges/UIntRange;", "(Lkotlin/ranges/UIntRange;)I", "Lkotlin/ranges/ULongRange;", "(Lkotlin/ranges/ULongRange;)J", "Lkotlin/random/Random;", "(Lkotlin/ranges/UIntRange;Lkotlin/random/Random;)I", "(Lkotlin/ranges/ULongRange;Lkotlin/random/Random;)J", "randomOrNull", "contains", "", "element", "contains-biwQdVI", "contains-GYNo2lE", "value", "Lkotlin/UByte;", "contains-68kG9v0", "(Lkotlin/ranges/UIntRange;B)Z", "contains-ULb-yJY", "(Lkotlin/ranges/ULongRange;B)Z", "contains-Gab390E", "(Lkotlin/ranges/ULongRange;I)Z", "contains-fz5IDCE", "(Lkotlin/ranges/UIntRange;J)Z", "Lkotlin/UShort;", "contains-ZsK3CEQ", "(Lkotlin/ranges/UIntRange;S)Z", "contains-uhHAxoY", "(Lkotlin/ranges/ULongRange;S)Z", "downTo", "to", "downTo-Kr8caGY", "(BB)Lkotlin/ranges/UIntProgression;", "downTo-J1ME1BU", "(II)Lkotlin/ranges/UIntProgression;", "downTo-eb3DHEI", "(JJ)Lkotlin/ranges/ULongProgression;", "downTo-5PvTz6A", "(SS)Lkotlin/ranges/UIntProgression;", "reversed", "step", "", "", "until", "until-Kr8caGY", "(BB)Lkotlin/ranges/UIntRange;", "until-J1ME1BU", "(II)Lkotlin/ranges/UIntRange;", "until-eb3DHEI", "(JJ)Lkotlin/ranges/ULongRange;", "until-5PvTz6A", "(SS)Lkotlin/ranges/UIntRange;", "coerceAtLeast", "minimumValue", "coerceAtLeast-J1ME1BU", "(II)I", "coerceAtLeast-eb3DHEI", "(JJ)J", "coerceAtLeast-Kr8caGY", "(BB)B", "coerceAtLeast-5PvTz6A", "(SS)S", "coerceAtMost", "maximumValue", "coerceAtMost-J1ME1BU", "coerceAtMost-eb3DHEI", "coerceAtMost-Kr8caGY", "coerceAtMost-5PvTz6A", "coerceIn", "coerceIn-WZ9TVnA", "(III)I", "coerceIn-sambcqE", "(JJJ)J", "coerceIn-b33U2AM", "(BBB)B", "coerceIn-VKSA0NQ", "(SSS)S", "range", "Lkotlin/ranges/ClosedRange;", "coerceIn-wuiCnnA", "(ILkotlin/ranges/ClosedRange;)I", "coerceIn-JPwROB0", "(JLkotlin/ranges/ClosedRange;)J", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/ranges/URangesKt")
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class URangesKt___URangesKt {
    @SinceKotlin(version = "1.5")
    /* renamed from: coerceAtLeast-5PvTz6A, reason: not valid java name */
    public static final short m1284coerceAtLeast5PvTz6A(short s10, short s11) {
        return Intrinsics.compare(s10 & UShort.MAX_VALUE, 65535 & s11) < 0 ? s11 : s10;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceAtLeast-J1ME1BU, reason: not valid java name */
    public static final int m1285coerceAtLeastJ1ME1BU(int i3, int i10) {
        return Integer.compareUnsigned(i3, i10) < 0 ? i10 : i3;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceAtLeast-Kr8caGY, reason: not valid java name */
    public static final byte m1286coerceAtLeastKr8caGY(byte b2, byte b10) {
        return Intrinsics.compare(b2 & UByte.MAX_VALUE, b10 & UByte.MAX_VALUE) < 0 ? b10 : b2;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceAtLeast-eb3DHEI, reason: not valid java name */
    public static final long m1287coerceAtLeasteb3DHEI(long j, long j3) {
        return Long.compareUnsigned(j, j3) < 0 ? j3 : j;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceAtMost-5PvTz6A, reason: not valid java name */
    public static final short m1288coerceAtMost5PvTz6A(short s10, short s11) {
        return Intrinsics.compare(s10 & UShort.MAX_VALUE, 65535 & s11) > 0 ? s11 : s10;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceAtMost-J1ME1BU, reason: not valid java name */
    public static final int m1289coerceAtMostJ1ME1BU(int i3, int i10) {
        return Integer.compareUnsigned(i3, i10) > 0 ? i10 : i3;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceAtMost-Kr8caGY, reason: not valid java name */
    public static final byte m1290coerceAtMostKr8caGY(byte b2, byte b10) {
        return Intrinsics.compare(b2 & UByte.MAX_VALUE, b10 & UByte.MAX_VALUE) > 0 ? b10 : b2;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceAtMost-eb3DHEI, reason: not valid java name */
    public static final long m1291coerceAtMosteb3DHEI(long j, long j3) {
        return Long.compareUnsigned(j, j3) > 0 ? j3 : j;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceIn-JPwROB0, reason: not valid java name */
    public static final long m1292coerceInJPwROB0(long j, ClosedRange<ULong> range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return ((ULong) RangesKt___RangesKt.coerceIn(ULong.m208boximpl(j), (ClosedFloatingPointRange<ULong>) range)).getData();
        }
        if (!range.isEmpty()) {
            return Long.compareUnsigned(j, range.getStart().getData()) < 0 ? range.getStart().getData() : Long.compareUnsigned(j, range.getEndInclusive().getData()) > 0 ? range.getEndInclusive().getData() : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceIn-VKSA0NQ, reason: not valid java name */
    public static final short m1293coerceInVKSA0NQ(short s10, short s11, short s12) {
        int i3 = s11 & UShort.MAX_VALUE;
        int i10 = s12 & UShort.MAX_VALUE;
        if (Intrinsics.compare(i3, i10) <= 0) {
            int i11 = 65535 & s10;
            return Intrinsics.compare(i11, i3) < 0 ? s11 : Intrinsics.compare(i11, i10) > 0 ? s12 : s10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) UShort.m365toStringimpl(s12)) + " is less than minimum " + ((Object) UShort.m365toStringimpl(s11)) + '.');
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceIn-WZ9TVnA, reason: not valid java name */
    public static final int m1294coerceInWZ9TVnA(int i3, int i10, int i11) {
        if (Integer.compareUnsigned(i10, i11) <= 0) {
            return Integer.compareUnsigned(i3, i10) < 0 ? i10 : Integer.compareUnsigned(i3, i11) > 0 ? i11 : i3;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) UInt.m181toStringimpl(i11)) + " is less than minimum " + ((Object) UInt.m181toStringimpl(i10)) + '.');
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceIn-b33U2AM, reason: not valid java name */
    public static final byte m1295coerceInb33U2AM(byte b2, byte b10, byte b11) {
        int i3 = b10 & UByte.MAX_VALUE;
        int i10 = b11 & UByte.MAX_VALUE;
        if (Intrinsics.compare(i3, i10) <= 0) {
            int i11 = b2 & UByte.MAX_VALUE;
            return Intrinsics.compare(i11, i3) < 0 ? b10 : Intrinsics.compare(i11, i10) > 0 ? b11 : b2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) UByte.m102toStringimpl(b11)) + " is less than minimum " + ((Object) UByte.m102toStringimpl(b10)) + '.');
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceIn-sambcqE, reason: not valid java name */
    public static final long m1296coerceInsambcqE(long j, long j3, long j10) {
        if (Long.compareUnsigned(j3, j10) <= 0) {
            return Long.compareUnsigned(j, j3) < 0 ? j3 : Long.compareUnsigned(j, j10) > 0 ? j10 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) ULong.m260toStringimpl(j10)) + " is less than minimum " + ((Object) ULong.m260toStringimpl(j3)) + '.');
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceIn-wuiCnnA, reason: not valid java name */
    public static final int m1297coerceInwuiCnnA(int i3, ClosedRange<UInt> range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return ((UInt) RangesKt___RangesKt.coerceIn(UInt.m129boximpl(i3), (ClosedFloatingPointRange<UInt>) range)).getData();
        }
        if (!range.isEmpty()) {
            return Integer.compareUnsigned(i3, range.getStart().getData()) < 0 ? range.getStart().getData() : Integer.compareUnsigned(i3, range.getEndInclusive().getData()) > 0 ? range.getEndInclusive().getData() : i3;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: contains-68kG9v0, reason: not valid java name */
    public static final boolean m1298contains68kG9v0(UIntRange contains, byte b2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m1271containsWZ4Q5Ns(UInt.m135constructorimpl(b2 & UByte.MAX_VALUE));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: contains-GYNo2lE, reason: not valid java name */
    private static final boolean m1299containsGYNo2lE(ULongRange contains, ULong uLong) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return uLong != null && contains.m1280containsVKZWuLQ(uLong.getData());
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: contains-Gab390E, reason: not valid java name */
    public static final boolean m1300containsGab390E(ULongRange contains, int i3) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m1280containsVKZWuLQ(ULong.m214constructorimpl(i3 & BodyPartID.bodyIdMax));
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: contains-ULb-yJY, reason: not valid java name */
    public static final boolean m1301containsULbyJY(ULongRange contains, byte b2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m1280containsVKZWuLQ(ULong.m214constructorimpl(b2 & 255));
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: contains-ZsK3CEQ, reason: not valid java name */
    public static final boolean m1302containsZsK3CEQ(UIntRange contains, short s10) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m1271containsWZ4Q5Ns(UInt.m135constructorimpl(s10 & UShort.MAX_VALUE));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: contains-biwQdVI, reason: not valid java name */
    private static final boolean m1303containsbiwQdVI(UIntRange contains, UInt uInt) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return uInt != null && contains.m1271containsWZ4Q5Ns(uInt.getData());
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: contains-fz5IDCE, reason: not valid java name */
    public static final boolean m1304containsfz5IDCE(UIntRange contains, long j) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return ULong.m214constructorimpl(j >>> 32) == 0 && contains.m1271containsWZ4Q5Ns(UInt.m135constructorimpl((int) j));
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: contains-uhHAxoY, reason: not valid java name */
    public static final boolean m1305containsuhHAxoY(ULongRange contains, short s10) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m1280containsVKZWuLQ(ULong.m214constructorimpl(s10 & 65535));
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: downTo-5PvTz6A, reason: not valid java name */
    public static final UIntProgression m1306downTo5PvTz6A(short s10, short s11) {
        return UIntProgression.INSTANCE.m1268fromClosedRangeNkh28Cs(UInt.m135constructorimpl(s10 & UShort.MAX_VALUE), UInt.m135constructorimpl(s11 & UShort.MAX_VALUE), -1);
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: downTo-J1ME1BU, reason: not valid java name */
    public static final UIntProgression m1307downToJ1ME1BU(int i3, int i10) {
        return UIntProgression.INSTANCE.m1268fromClosedRangeNkh28Cs(i3, i10, -1);
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: downTo-Kr8caGY, reason: not valid java name */
    public static final UIntProgression m1308downToKr8caGY(byte b2, byte b10) {
        return UIntProgression.INSTANCE.m1268fromClosedRangeNkh28Cs(UInt.m135constructorimpl(b2 & UByte.MAX_VALUE), UInt.m135constructorimpl(b10 & UByte.MAX_VALUE), -1);
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: downTo-eb3DHEI, reason: not valid java name */
    public static final ULongProgression m1309downToeb3DHEI(long j, long j3) {
        return ULongProgression.INSTANCE.m1277fromClosedRange7ftBX0g(j, j3, -1L);
    }

    @SinceKotlin(version = "1.7")
    public static final int first(UIntProgression uIntProgression) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        if (!uIntProgression.isEmpty()) {
            return uIntProgression.getFirst();
        }
        throw new NoSuchElementException("Progression " + uIntProgression + " is empty.");
    }

    @SinceKotlin(version = "1.7")
    public static final UInt firstOrNull(UIntProgression uIntProgression) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        if (uIntProgression.isEmpty()) {
            return null;
        }
        return UInt.m129boximpl(uIntProgression.getFirst());
    }

    @SinceKotlin(version = "1.7")
    public static final int last(UIntProgression uIntProgression) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        if (!uIntProgression.isEmpty()) {
            return uIntProgression.getLast();
        }
        throw new NoSuchElementException("Progression " + uIntProgression + " is empty.");
    }

    @SinceKotlin(version = "1.7")
    public static final UInt lastOrNull(UIntProgression uIntProgression) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        if (uIntProgression.isEmpty()) {
            return null;
        }
        return UInt.m129boximpl(uIntProgression.getLast());
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int random(UIntRange uIntRange) {
        Intrinsics.checkNotNullParameter(uIntRange, "<this>");
        return random(uIntRange, Random.INSTANCE);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final UInt randomOrNull(UIntRange uIntRange) {
        Intrinsics.checkNotNullParameter(uIntRange, "<this>");
        return randomOrNull(uIntRange, Random.INSTANCE);
    }

    @SinceKotlin(version = "1.5")
    public static final UIntProgression reversed(UIntProgression uIntProgression) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        return UIntProgression.INSTANCE.m1268fromClosedRangeNkh28Cs(uIntProgression.getLast(), uIntProgression.getFirst(), -uIntProgression.getStep());
    }

    @SinceKotlin(version = "1.5")
    public static final UIntProgression step(UIntProgression uIntProgression, int i3) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        RangesKt__RangesKt.checkStepIsPositive(i3 > 0, Integer.valueOf(i3));
        UIntProgression.Companion companion = UIntProgression.INSTANCE;
        int first = uIntProgression.getFirst();
        int last = uIntProgression.getLast();
        if (uIntProgression.getStep() <= 0) {
            i3 = -i3;
        }
        return companion.m1268fromClosedRangeNkh28Cs(first, last, i3);
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: until-5PvTz6A, reason: not valid java name */
    public static final UIntRange m1310until5PvTz6A(short s10, short s11) {
        return Intrinsics.compare(s11 & UShort.MAX_VALUE, 0) <= 0 ? UIntRange.INSTANCE.getEMPTY() : new UIntRange(UInt.m135constructorimpl(s10 & UShort.MAX_VALUE), UInt.m135constructorimpl(UInt.m135constructorimpl(r3) - 1), null);
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: until-J1ME1BU, reason: not valid java name */
    public static UIntRange m1311untilJ1ME1BU(int i3, int i10) {
        return Integer.compareUnsigned(i10, 0) <= 0 ? UIntRange.INSTANCE.getEMPTY() : new UIntRange(i3, UInt.m135constructorimpl(i10 - 1), null);
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: until-Kr8caGY, reason: not valid java name */
    public static final UIntRange m1312untilKr8caGY(byte b2, byte b10) {
        return Intrinsics.compare(b10 & UByte.MAX_VALUE, 0) <= 0 ? UIntRange.INSTANCE.getEMPTY() : new UIntRange(UInt.m135constructorimpl(b2 & UByte.MAX_VALUE), UInt.m135constructorimpl(UInt.m135constructorimpl(r3) - 1), null);
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: until-eb3DHEI, reason: not valid java name */
    public static ULongRange m1313untileb3DHEI(long j, long j3) {
        return Long.compareUnsigned(j3, 0L) <= 0 ? ULongRange.INSTANCE.getEMPTY() : new ULongRange(j, ULong.m214constructorimpl(j3 - ULong.m214constructorimpl(1 & BodyPartID.bodyIdMax)), null);
    }

    @SinceKotlin(version = "1.7")
    public static final ULong firstOrNull(ULongProgression uLongProgression) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        if (uLongProgression.isEmpty()) {
            return null;
        }
        return ULong.m208boximpl(uLongProgression.getFirst());
    }

    @SinceKotlin(version = "1.7")
    public static final ULong lastOrNull(ULongProgression uLongProgression) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        if (uLongProgression.isEmpty()) {
            return null;
        }
        return ULong.m208boximpl(uLongProgression.getLast());
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long random(ULongRange uLongRange) {
        Intrinsics.checkNotNullParameter(uLongRange, "<this>");
        return random(uLongRange, Random.INSTANCE);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final ULong randomOrNull(ULongRange uLongRange) {
        Intrinsics.checkNotNullParameter(uLongRange, "<this>");
        return randomOrNull(uLongRange, Random.INSTANCE);
    }

    @SinceKotlin(version = "1.5")
    public static final ULongProgression reversed(ULongProgression uLongProgression) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        return ULongProgression.INSTANCE.m1277fromClosedRange7ftBX0g(uLongProgression.getLast(), uLongProgression.getFirst(), -uLongProgression.getStep());
    }

    @SinceKotlin(version = "1.5")
    public static final int random(UIntRange uIntRange, Random random) {
        Intrinsics.checkNotNullParameter(uIntRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return URandomKt.nextUInt(random, uIntRange);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @SinceKotlin(version = "1.5")
    public static final UInt randomOrNull(UIntRange uIntRange, Random random) {
        Intrinsics.checkNotNullParameter(uIntRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (uIntRange.isEmpty()) {
            return null;
        }
        return UInt.m129boximpl(URandomKt.nextUInt(random, uIntRange));
    }

    @SinceKotlin(version = "1.5")
    public static final ULongProgression step(ULongProgression uLongProgression, long j) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        RangesKt__RangesKt.checkStepIsPositive(j > 0, Long.valueOf(j));
        ULongProgression.Companion companion = ULongProgression.INSTANCE;
        long first = uLongProgression.getFirst();
        long last = uLongProgression.getLast();
        if (uLongProgression.getStep() <= 0) {
            j = -j;
        }
        return companion.m1277fromClosedRange7ftBX0g(first, last, j);
    }

    @SinceKotlin(version = "1.7")
    public static final long first(ULongProgression uLongProgression) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        if (!uLongProgression.isEmpty()) {
            return uLongProgression.getFirst();
        }
        throw new NoSuchElementException("Progression " + uLongProgression + " is empty.");
    }

    @SinceKotlin(version = "1.7")
    public static final long last(ULongProgression uLongProgression) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        if (!uLongProgression.isEmpty()) {
            return uLongProgression.getLast();
        }
        throw new NoSuchElementException("Progression " + uLongProgression + " is empty.");
    }

    @SinceKotlin(version = "1.5")
    public static final long random(ULongRange uLongRange, Random random) {
        Intrinsics.checkNotNullParameter(uLongRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return URandomKt.nextULong(random, uLongRange);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @SinceKotlin(version = "1.5")
    public static final ULong randomOrNull(ULongRange uLongRange, Random random) {
        Intrinsics.checkNotNullParameter(uLongRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (uLongRange.isEmpty()) {
            return null;
        }
        return ULong.m208boximpl(URandomKt.nextULong(random, uLongRange));
    }
}
