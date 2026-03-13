package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0001\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0000\u001a\u00020\u0001H\u0001\u001a\u0018\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0001¨\u0006\t"}, d2 = {"shortName", "", "Lkotlin/time/DurationUnit;", "durationUnitByShortName", "durationUnitByIsoChar", "isoChar", "", "isTimeComponent", "", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/time/DurationUnitKt")
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class DurationUnitKt__DurationUnitKt extends DurationUnitKt__DurationUnitJvmKt {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DurationUnit.values().length];
            try {
                iArr[DurationUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DurationUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DurationUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DurationUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DurationUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DurationUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DurationUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @SinceKotlin(version = "1.5")
    public static final DurationUnit durationUnitByIsoChar(char c10, boolean z2) {
        if (!z2) {
            if (c10 == 'D') {
                return DurationUnit.DAYS;
            }
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c10);
        }
        if (c10 == 'H') {
            return DurationUnit.HOURS;
        }
        if (c10 == 'M') {
            return DurationUnit.MINUTES;
        }
        if (c10 == 'S') {
            return DurationUnit.SECONDS;
        }
        throw new IllegalArgumentException("Invalid duration ISO time unit: " + c10);
    }

    @SinceKotlin(version = "1.5")
    public static final DurationUnit durationUnitByShortName(String shortName) {
        Intrinsics.checkNotNullParameter(shortName, "shortName");
        int hashCode = shortName.hashCode();
        if (hashCode != 100) {
            if (hashCode != 104) {
                if (hashCode != 109) {
                    if (hashCode != 115) {
                        if (hashCode != 3494) {
                            if (hashCode != 3525) {
                                if (hashCode == 3742 && shortName.equals("us")) {
                                    return DurationUnit.MICROSECONDS;
                                }
                            } else if (shortName.equals("ns")) {
                                return DurationUnit.NANOSECONDS;
                            }
                        } else if (shortName.equals("ms")) {
                            return DurationUnit.MILLISECONDS;
                        }
                    } else if (shortName.equals("s")) {
                        return DurationUnit.SECONDS;
                    }
                } else if (shortName.equals("m")) {
                    return DurationUnit.MINUTES;
                }
            } else if (shortName.equals("h")) {
                return DurationUnit.HOURS;
            }
        } else if (shortName.equals("d")) {
            return DurationUnit.DAYS;
        }
        throw new IllegalArgumentException("Unknown duration unit short name: ".concat(shortName));
    }

    @SinceKotlin(version = "1.3")
    public static final String shortName(DurationUnit durationUnit) {
        Intrinsics.checkNotNullParameter(durationUnit, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[durationUnit.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "us";
            case 3:
                return "ms";
            case 4:
                return "s";
            case 5:
                return "m";
            case 6:
                return "h";
            case 7:
                return "d";
            default:
                throw new IllegalStateException(("Unknown unit: " + durationUnit).toString());
        }
    }
}
