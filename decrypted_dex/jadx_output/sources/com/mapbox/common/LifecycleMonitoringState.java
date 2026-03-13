package com.mapbox.common;

import com.stub.StubApp;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'STOPPED' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class LifecycleMonitoringState {
    private static final /* synthetic */ LifecycleMonitoringState[] $VALUES;
    public static final LifecycleMonitoringState STARTED;
    public static final LifecycleMonitoringState STOPPED;
    private String str;

    private static /* synthetic */ LifecycleMonitoringState[] $values() {
        return new LifecycleMonitoringState[]{STOPPED, STARTED};
    }

    static {
        String string2 = StubApp.getString2(6649);
        STOPPED = new LifecycleMonitoringState(string2, 0, string2);
        String string22 = StubApp.getString2(5766);
        STARTED = new LifecycleMonitoringState(string22, 1, string22);
        $VALUES = $values();
    }

    private LifecycleMonitoringState(String str, int i3, String str2) {
        this.str = str2;
    }

    private int getValue() {
        return ordinal();
    }

    public static LifecycleMonitoringState valueOf(String str) {
        return (LifecycleMonitoringState) Enum.valueOf(LifecycleMonitoringState.class, str);
    }

    public static LifecycleMonitoringState[] values() {
        return (LifecycleMonitoringState[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }
}
