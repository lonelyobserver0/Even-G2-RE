package com.builttoroam.devicecalendar.models;

import com.builttoroam.devicecalendar.common.DayOfWeek;
import com.builttoroam.devicecalendar.common.RecurrenceFrequency;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b!\u0010\u000b\"\u0004\b\"\u0010\rR\u001e\u0010#\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b$\u0010\u000b\"\u0004\b%\u0010\rR\u001e\u0010&\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b'\u0010\u000b\"\u0004\b(\u0010\r¨\u0006)"}, d2 = {"Lcom/builttoroam/devicecalendar/models/RecurrenceRule;", "", "recurrenceFrequency", "Lcom/builttoroam/devicecalendar/common/RecurrenceFrequency;", "<init>", "(Lcom/builttoroam/devicecalendar/common/RecurrenceFrequency;)V", "getRecurrenceFrequency", "()Lcom/builttoroam/devicecalendar/common/RecurrenceFrequency;", "totalOccurrences", "", "getTotalOccurrences", "()Ljava/lang/Integer;", "setTotalOccurrences", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "interval", "getInterval", "setInterval", "endDate", "", "getEndDate", "()Ljava/lang/Long;", "setEndDate", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "daysOfWeek", "", "Lcom/builttoroam/devicecalendar/common/DayOfWeek;", "getDaysOfWeek", "()Ljava/util/List;", "setDaysOfWeek", "(Ljava/util/List;)V", "dayOfMonth", "getDayOfMonth", "setDayOfMonth", "monthOfYear", "getMonthOfYear", "setMonthOfYear", "weekOfMonth", "getWeekOfMonth", "setWeekOfMonth", "device_calendar_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class RecurrenceRule {
    private Integer dayOfMonth;
    private List<DayOfWeek> daysOfWeek;
    private Long endDate;
    private Integer interval;
    private Integer monthOfYear;
    private final RecurrenceFrequency recurrenceFrequency;
    private Integer totalOccurrences;
    private Integer weekOfMonth;

    public RecurrenceRule(RecurrenceFrequency recurrenceFrequency) {
        Intrinsics.checkNotNullParameter(recurrenceFrequency, "recurrenceFrequency");
        this.recurrenceFrequency = recurrenceFrequency;
    }

    public final Integer getDayOfMonth() {
        return this.dayOfMonth;
    }

    public final List<DayOfWeek> getDaysOfWeek() {
        return this.daysOfWeek;
    }

    public final Long getEndDate() {
        return this.endDate;
    }

    public final Integer getInterval() {
        return this.interval;
    }

    public final Integer getMonthOfYear() {
        return this.monthOfYear;
    }

    public final RecurrenceFrequency getRecurrenceFrequency() {
        return this.recurrenceFrequency;
    }

    public final Integer getTotalOccurrences() {
        return this.totalOccurrences;
    }

    public final Integer getWeekOfMonth() {
        return this.weekOfMonth;
    }

    public final void setDayOfMonth(Integer num) {
        this.dayOfMonth = num;
    }

    public final void setDaysOfWeek(List<DayOfWeek> list) {
        this.daysOfWeek = list;
    }

    public final void setEndDate(Long l9) {
        this.endDate = l9;
    }

    public final void setInterval(Integer num) {
        this.interval = num;
    }

    public final void setMonthOfYear(Integer num) {
        this.monthOfYear = num;
    }

    public final void setTotalOccurrences(Integer num) {
        this.totalOccurrences = num;
    }

    public final void setWeekOfMonth(Integer num) {
        this.weekOfMonth = num;
    }
}
