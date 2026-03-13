package org.bouncycastle.its;

import java.util.Date;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Time32;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.UINT16;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.ValidityPeriod;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ITSValidityPeriod {
    private final UINT16 duration;
    private final long startDate;
    private final Unit timeUnit;

    public static class Builder {
        private final long startDate;

        public Builder(Date date) {
            this.startDate = date.getTime();
        }

        public ITSValidityPeriod plusSixtyHours(int i3) {
            return new ITSValidityPeriod(this.startDate, UINT16.valueOf(i3), Unit.sixtyHours);
        }

        public ITSValidityPeriod plusYears(int i3) {
            return new ITSValidityPeriod(this.startDate, UINT16.valueOf(i3), Unit.years);
        }
    }

    public enum Unit {
        microseconds(0),
        milliseconds(1),
        seconds(2),
        minutes(3),
        hours(4),
        sixtyHours(5),
        years(6);

        private final int unitTag;

        Unit(int i3) {
            this.unitTag = i3;
        }
    }

    public ITSValidityPeriod(long j, UINT16 uint16, Unit unit) {
        this.startDate = j;
        this.duration = uint16;
        this.timeUnit = unit;
    }

    public static Builder from(Date date) {
        return new Builder(date);
    }

    public Date getStartDate() {
        return new Date(this.startDate);
    }

    public ValidityPeriod toASN1Structure() {
        return ValidityPeriod.builder().setStart(new Time32(this.startDate / 1000)).setDuration(new Duration(this.timeUnit.unitTag, this.duration)).createValidityPeriod();
    }

    public ITSValidityPeriod(ValidityPeriod validityPeriod) {
        this.startDate = validityPeriod.getStart().getValue().longValue();
        Duration duration = validityPeriod.getDuration();
        this.duration = duration.getDuration();
        this.timeUnit = Unit.values()[duration.getChoice()];
    }
}
