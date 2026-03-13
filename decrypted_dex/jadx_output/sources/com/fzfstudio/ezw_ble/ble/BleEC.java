package com.fzfstudio.ezw_ble.ble;

import com.stub.StubApp;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\u0015"}, d2 = {"Lcom/fzfstudio/ezw_ble/ble/BleEC;", "", "<init>", "(Ljava/lang/String;I)V", "BLE_STATE", "SCAN_RESULT", "CONNECT_STATUS", "RECEIVE_DATA", "LOGGER", "eventLabel", "", "getEventLabel", "()Ljava/lang/String;", "event", "Lio/flutter/plugin/common/EventChannel$EventSink;", "getEvent", "()Lio/flutter/plugin/common/EventChannel$EventSink;", "registerEventChannel", "", "binaryMessenger", "Lio/flutter/plugin/common/BinaryMessenger;", "flutter_ezw_ble_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class BleEC {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BleEC[] $VALUES;
    public static final BleEC BLE_STATE = new BleEC(StubApp.getString2(11218), 0);
    public static final BleEC SCAN_RESULT = new BleEC(StubApp.getString2(10093), 1);
    public static final BleEC CONNECT_STATUS = new BleEC(StubApp.getString2(11219), 2);
    public static final BleEC RECEIVE_DATA = new BleEC(StubApp.getString2(11220), 3);
    public static final BleEC LOGGER = new BleEC(StubApp.getString2(11221), 4);

    private static final /* synthetic */ BleEC[] $values() {
        return new BleEC[]{BLE_STATE, SCAN_RESULT, CONNECT_STATUS, RECEIVE_DATA, LOGGER};
    }

    static {
        BleEC[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private BleEC(String str, int i3) {
    }

    public static EnumEntries<BleEC> getEntries() {
        return $ENTRIES;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getEventLabel() {
        return E1.a.j(StubApp.getString2(11222), n3.a.a(name()));
    }

    public static BleEC valueOf(String str) {
        return (BleEC) Enum.valueOf(BleEC.class, str);
    }

    public static BleEC[] values() {
        return (BleEC[]) $VALUES.clone();
    }

    public final EventChannel.EventSink getEvent() {
        Map map;
        map = BleChannelKt.bleEvents;
        return (EventChannel.EventSink) map.get(getEventLabel());
    }

    public final void registerEventChannel(BinaryMessenger binaryMessenger) {
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        new EventChannel(binaryMessenger, getEventLabel()).setStreamHandler(new EventChannel.StreamHandler() { // from class: com.fzfstudio.ezw_ble.ble.BleEC$registerEventChannel$1
            @Override // io.flutter.plugin.common.EventChannel.StreamHandler
            public void onCancel(Object arguments) {
                Map map;
                String eventLabel;
                map = BleChannelKt.bleEvents;
                eventLabel = BleEC.this.getEventLabel();
                map.remove(eventLabel);
            }

            @Override // io.flutter.plugin.common.EventChannel.StreamHandler
            public void onListen(Object arguments, EventChannel.EventSink events) {
                Map map;
                String eventLabel;
                if (events != null) {
                    BleEC bleEC = BleEC.this;
                    map = BleChannelKt.bleEvents;
                    eventLabel = bleEC.getEventLabel();
                    map.put(eventLabel, events);
                }
            }
        });
    }
}
