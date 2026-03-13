package com.builttoroam.devicecalendar.models;

import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/builttoroam/devicecalendar/models/Availability;", "", "<init>", "(Ljava/lang/String;I)V", "BUSY", "FREE", "TENTATIVE", "device_calendar_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class Availability {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Availability[] $VALUES;
    public static final Availability BUSY = new Availability(StubApp.getString2(9777), 0);
    public static final Availability FREE = new Availability(StubApp.getString2(9778), 1);
    public static final Availability TENTATIVE = new Availability(StubApp.getString2(9779), 2);

    private static final /* synthetic */ Availability[] $values() {
        return new Availability[]{BUSY, FREE, TENTATIVE};
    }

    static {
        Availability[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private Availability(String str, int i3) {
    }

    public static EnumEntries<Availability> getEntries() {
        return $ENTRIES;
    }

    public static Availability valueOf(String str) {
        return (Availability) Enum.valueOf(Availability.class, str);
    }

    public static Availability[] values() {
        return (Availability[]) $VALUES.clone();
    }
}
