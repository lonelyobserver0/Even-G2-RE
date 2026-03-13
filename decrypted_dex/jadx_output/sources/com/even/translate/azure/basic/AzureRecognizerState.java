package com.even.translate.azure.basic;

import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/even/translate/azure/basic/AzureRecognizerState;", "", "<init>", "(Ljava/lang/String;I)V", "IDLE", "STARTING", "RUNNING", "PAUSED", "STOPPING", "ERROR", "translate_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class AzureRecognizerState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AzureRecognizerState[] $VALUES;
    public static final AzureRecognizerState IDLE = new AzureRecognizerState(StubApp.getString2(5276), 0);
    public static final AzureRecognizerState STARTING = new AzureRecognizerState(StubApp.getString2(6503), 1);
    public static final AzureRecognizerState RUNNING = new AzureRecognizerState(StubApp.getString2(5273), 2);
    public static final AzureRecognizerState PAUSED = new AzureRecognizerState(StubApp.getString2(2400), 3);
    public static final AzureRecognizerState STOPPING = new AzureRecognizerState(StubApp.getString2(6504), 4);
    public static final AzureRecognizerState ERROR = new AzureRecognizerState(StubApp.getString2(3789), 5);

    private static final /* synthetic */ AzureRecognizerState[] $values() {
        return new AzureRecognizerState[]{IDLE, STARTING, RUNNING, PAUSED, STOPPING, ERROR};
    }

    static {
        AzureRecognizerState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private AzureRecognizerState(String str, int i3) {
    }

    public static EnumEntries<AzureRecognizerState> getEntries() {
        return $ENTRIES;
    }

    public static AzureRecognizerState valueOf(String str) {
        return (AzureRecognizerState) Enum.valueOf(AzureRecognizerState.class, str);
    }

    public static AzureRecognizerState[] values() {
        return (AzureRecognizerState[]) $VALUES.clone();
    }
}
