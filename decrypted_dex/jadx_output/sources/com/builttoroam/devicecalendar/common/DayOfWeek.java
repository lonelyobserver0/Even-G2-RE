package com.builttoroam.devicecalendar.common;

import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/builttoroam/devicecalendar/common/DayOfWeek;", "", "<init>", "(Ljava/lang/String;I)V", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "device_calendar_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class DayOfWeek {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DayOfWeek[] $VALUES;
    public static final DayOfWeek SUNDAY = new DayOfWeek(StubApp.getString2(9766), 0);
    public static final DayOfWeek MONDAY = new DayOfWeek(StubApp.getString2(9767), 1);
    public static final DayOfWeek TUESDAY = new DayOfWeek(StubApp.getString2(9768), 2);
    public static final DayOfWeek WEDNESDAY = new DayOfWeek(StubApp.getString2(9769), 3);
    public static final DayOfWeek THURSDAY = new DayOfWeek(StubApp.getString2(9770), 4);
    public static final DayOfWeek FRIDAY = new DayOfWeek(StubApp.getString2(9771), 5);
    public static final DayOfWeek SATURDAY = new DayOfWeek(StubApp.getString2(9772), 6);

    private static final /* synthetic */ DayOfWeek[] $values() {
        return new DayOfWeek[]{SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY};
    }

    static {
        DayOfWeek[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private DayOfWeek(String str, int i3) {
    }

    public static EnumEntries<DayOfWeek> getEntries() {
        return $ENTRIES;
    }

    public static DayOfWeek valueOf(String str) {
        return (DayOfWeek) Enum.valueOf(DayOfWeek.class, str);
    }

    public static DayOfWeek[] values() {
        return (DayOfWeek[]) $VALUES.clone();
    }
}
