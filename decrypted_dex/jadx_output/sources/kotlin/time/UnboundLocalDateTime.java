package kotlin.time;

import com.mapbox.common.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u0000 !2\u00020\u0001:\u0001!B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJW\u0010\u0014\u001a\u0002H\u0015\"\u0004\b\u0000\u0010\u00152\u0006\u0010\u0016\u001a\u00020\u000326\u0010\u0017\u001a2\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u0002H\u00150\u0018H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u001eJ\b\u0010\u001f\u001a\u00020 H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\""}, d2 = {"Lkotlin/time/UnboundLocalDateTime;", "", "year", "", "month", "day", "hour", "minute", "second", "nanosecond", "<init>", "(IIIIIII)V", "getYear", "()I", "getMonth", "getDay", "getHour", "getMinute", "getSecond", "getNanosecond", "toInstant", "T", "offsetSeconds", "buildInstant", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "epochSeconds", "nanosecondOfSecond", "(ILkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@ExperimentalTime
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
final class UnboundLocalDateTime {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int day;
    private final int hour;
    private final int minute;
    private final int month;
    private final int nanosecond;
    private final int second;
    private final int year;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lkotlin/time/UnboundLocalDateTime$Companion;", "", "<init>", "()V", "fromInstant", "Lkotlin/time/UnboundLocalDateTime;", "instant", "Lkotlin/time/Instant;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final UnboundLocalDateTime fromInstant(Instant instant) {
            long j;
            long j3;
            Intrinsics.checkNotNullParameter(instant, "instant");
            long epochSeconds = instant.getEpochSeconds();
            long j10 = epochSeconds / 86400;
            if ((epochSeconds ^ 86400) < 0 && j10 * 86400 != epochSeconds) {
                j10--;
            }
            long j11 = epochSeconds % 86400;
            int i3 = (int) (j11 + (86400 & (((j11 ^ 86400) & ((-j11) | j11)) >> 63)));
            long j12 = (j10 + 719528) - 60;
            if (j12 < 0) {
                j = -1;
                long j13 = 146097;
                long j14 = ((j12 + 1) / j13) - 1;
                j3 = 400 * j14;
                j12 += (-j14) * j13;
            } else {
                j = -1;
                j3 = 0;
            }
            long j15 = 400;
            long j16 = ((j15 * j12) + 591) / 146097;
            long j17 = 365;
            long j18 = 4;
            long j19 = 100;
            long j20 = j12 - ((j16 / j15) + (((j16 / j18) + (j17 * j16)) - (j16 / j19)));
            if (j20 < 0) {
                j16 += j;
                j20 = j12 - ((j16 / j15) + (((j16 / j18) + (j17 * j16)) - (j16 / j19)));
            }
            int i10 = (int) j20;
            int i11 = ((i10 * 5) + 2) / 153;
            int i12 = i3 / 3600;
            int i13 = i3 - (i12 * 3600);
            int i14 = i13 / 60;
            return new UnboundLocalDateTime((int) (j16 + j3 + (i11 / 10)), ((i11 + 2) % 12) + 1, (i10 - (((i11 * 306) + 5) / 10)) + 1, i12, i14, i13 - (i14 * 60), instant.getNanosecondsOfSecond());
        }

        private Companion() {
        }
    }

    public UnboundLocalDateTime(int i3, int i10, int i11, int i12, int i13, int i14, int i15) {
        this.year = i3;
        this.month = i10;
        this.day = i11;
        this.hour = i12;
        this.minute = i13;
        this.second = i14;
        this.nanosecond = i15;
    }

    public final int getDay() {
        return this.day;
    }

    public final int getHour() {
        return this.hour;
    }

    public final int getMinute() {
        return this.minute;
    }

    public final int getMonth() {
        return this.month;
    }

    public final int getNanosecond() {
        return this.nanosecond;
    }

    public final int getSecond() {
        return this.second;
    }

    public final int getYear() {
        return this.year;
    }

    public final <T> T toInstant(int offsetSeconds, Function2<? super Long, ? super Integer, ? extends T> buildInstant) {
        Intrinsics.checkNotNullParameter(buildInstant, "buildInstant");
        long year = getYear();
        long j = 365 * year;
        long month = (year >= 0 ? ((year + 399) / 400) + (((3 + year) / 4) - ((99 + year) / 100)) + j : j - ((year / (-400)) + ((year / (-4)) - (year / (-100))))) + (((getMonth() * 367) - 362) / 12) + (getDay() - 1);
        if (getMonth() > 2) {
            month = !InstantKt.isLeapYear(getYear()) ? month - 2 : (-1) + month;
        }
        return buildInstant.invoke(Long.valueOf((((month - 719528) * 86400) + (((getMinute() * 60) + (getHour() * 3600)) + getSecond())) - offsetSeconds), Integer.valueOf(getNanosecond()));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UnboundLocalDateTime(");
        sb2.append(this.year);
        sb2.append('-');
        sb2.append(this.month);
        sb2.append('-');
        sb2.append(this.day);
        sb2.append(' ');
        sb2.append(this.hour);
        sb2.append(':');
        sb2.append(this.minute);
        sb2.append(':');
        sb2.append(this.second);
        sb2.append('.');
        return b.j(sb2, this.nanosecond, ')');
    }
}
