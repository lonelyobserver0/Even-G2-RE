package kotlin.time;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\b\u001a\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\u0010\u001a%\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0014\u001a%\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0014\u001a%\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u001b\u001a\u00020\u001c*\u00020\u0001H\u0080\b¨\u0006\u001d"}, d2 = {"saturatingAdd", "", "value", "unit", "Lkotlin/time/DurationUnit;", "duration", "Lkotlin/time/Duration;", "saturatingAdd-NuflL3o", "(JLkotlin/time/DurationUnit;J)J", "checkInfiniteSumDefined", "durationInUnit", "checkInfiniteSumDefined-PjuGub4", "(JJJ)J", "saturatingAddInHalves", "saturatingAddInHalves-NuflL3o", "infinityOfSign", "(J)J", "saturatingDiff", "valueNs", "origin", "(JJLkotlin/time/DurationUnit;)J", "saturatingOriginsDiff", "origin1", "origin2", "saturatingFiniteDiff", "value1", "value2", "isSaturated", "", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nlongSaturatedMath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,81:1\n80#1:82\n80#1:83\n80#1:84\n80#1:85\n80#1:86\n80#1:87\n*S KotlinDebug\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n14#1:82\n17#1:83\n36#1:84\n46#1:85\n53#1:86\n57#1:87\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class LongSaturatedMathKt {
    /* renamed from: checkInfiniteSumDefined-PjuGub4, reason: not valid java name */
    private static final long m1469checkInfiniteSumDefinedPjuGub4(long j, long j3, long j10) {
        if (!Duration.m1393isInfiniteimpl(j3) || (j ^ j10) >= 0) {
            return j;
        }
        throw new IllegalArgumentException("Summing infinities of different signs");
    }

    private static final long infinityOfSign(long j) {
        return j < 0 ? Duration.INSTANCE.m1458getNEG_INFINITEUwyO8pc$kotlin_stdlib() : Duration.INSTANCE.m1457getINFINITEUwyO8pc();
    }

    public static final boolean isSaturated(long j) {
        return ((j - 1) | 1) == LongCompanionObject.MAX_VALUE;
    }

    /* renamed from: saturatingAdd-NuflL3o, reason: not valid java name */
    public static final long m1470saturatingAddNuflL3o(long j, DurationUnit unit, long j3) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        long m1407toLongimpl = Duration.m1407toLongimpl(j3, unit);
        if (((j - 1) | 1) == LongCompanionObject.MAX_VALUE) {
            return m1469checkInfiniteSumDefinedPjuGub4(j, j3, m1407toLongimpl);
        }
        if (((m1407toLongimpl - 1) | 1) == LongCompanionObject.MAX_VALUE) {
            return m1471saturatingAddInHalvesNuflL3o(j, unit, j3);
        }
        long j10 = j + m1407toLongimpl;
        if (((j ^ j10) & (m1407toLongimpl ^ j10)) >= 0) {
            return j10;
        }
        if (j < 0) {
            return Long.MIN_VALUE;
        }
        return LongCompanionObject.MAX_VALUE;
    }

    /* renamed from: saturatingAddInHalves-NuflL3o, reason: not valid java name */
    private static final long m1471saturatingAddInHalvesNuflL3o(long j, DurationUnit durationUnit, long j3) {
        long m1371divUwyO8pc = Duration.m1371divUwyO8pc(j3, 2);
        long m1407toLongimpl = Duration.m1407toLongimpl(m1371divUwyO8pc, durationUnit);
        return (1 | (m1407toLongimpl - 1)) == LongCompanionObject.MAX_VALUE ? m1407toLongimpl : m1470saturatingAddNuflL3o(m1470saturatingAddNuflL3o(j, durationUnit, m1371divUwyO8pc), durationUnit, Duration.m1396minusLRDsOJo(j3, m1371divUwyO8pc));
    }

    public static final long saturatingDiff(long j, long j3, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return (1 | (j3 - 1)) == LongCompanionObject.MAX_VALUE ? Duration.m1412unaryMinusUwyO8pc(infinityOfSign(j3)) : saturatingFiniteDiff(j, j3, unit);
    }

    private static final long saturatingFiniteDiff(long j, long j3, DurationUnit durationUnit) {
        long j10 = j - j3;
        if (((j10 ^ j) & (~(j10 ^ j3))) >= 0) {
            return DurationKt.toDuration(j10, durationUnit);
        }
        DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
        if (durationUnit.compareTo(durationUnit2) >= 0) {
            return Duration.m1412unaryMinusUwyO8pc(infinityOfSign(j10));
        }
        long convertDurationUnit = DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(1L, durationUnit2, durationUnit);
        long j11 = (j / convertDurationUnit) - (j3 / convertDurationUnit);
        long j12 = (j % convertDurationUnit) - (j3 % convertDurationUnit);
        Duration.Companion companion = Duration.INSTANCE;
        return Duration.m1397plusLRDsOJo(DurationKt.toDuration(j11, durationUnit2), DurationKt.toDuration(j12, durationUnit));
    }

    public static final long saturatingOriginsDiff(long j, long j3, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return ((j3 - 1) | 1) == LongCompanionObject.MAX_VALUE ? j == j3 ? Duration.INSTANCE.m1459getZEROUwyO8pc() : Duration.m1412unaryMinusUwyO8pc(infinityOfSign(j3)) : (1 | (j - 1)) == LongCompanionObject.MAX_VALUE ? infinityOfSign(j) : saturatingFiniteDiff(j, j3, unit);
    }
}
