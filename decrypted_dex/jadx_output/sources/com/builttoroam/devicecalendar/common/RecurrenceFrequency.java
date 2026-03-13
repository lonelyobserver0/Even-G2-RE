package com.builttoroam.devicecalendar.common;

import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/builttoroam/devicecalendar/common/RecurrenceFrequency;", "", "<init>", "(Ljava/lang/String;I)V", "DAILY", "WEEKLY", "MONTHLY", "YEARLY", "device_calendar_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class RecurrenceFrequency {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RecurrenceFrequency[] $VALUES;
    public static final RecurrenceFrequency DAILY = new RecurrenceFrequency(StubApp.getString2(9773), 0);
    public static final RecurrenceFrequency WEEKLY = new RecurrenceFrequency(StubApp.getString2(9774), 1);
    public static final RecurrenceFrequency MONTHLY = new RecurrenceFrequency(StubApp.getString2(9775), 2);
    public static final RecurrenceFrequency YEARLY = new RecurrenceFrequency(StubApp.getString2(9776), 3);

    private static final /* synthetic */ RecurrenceFrequency[] $values() {
        return new RecurrenceFrequency[]{DAILY, WEEKLY, MONTHLY, YEARLY};
    }

    static {
        RecurrenceFrequency[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private RecurrenceFrequency(String str, int i3) {
    }

    public static EnumEntries<RecurrenceFrequency> getEntries() {
        return $ENTRIES;
    }

    public static RecurrenceFrequency valueOf(String str) {
        return (RecurrenceFrequency) Enum.valueOf(RecurrenceFrequency.class, str);
    }

    public static RecurrenceFrequency[] values() {
        return (RecurrenceFrequency[]) $VALUES.clone();
    }
}
