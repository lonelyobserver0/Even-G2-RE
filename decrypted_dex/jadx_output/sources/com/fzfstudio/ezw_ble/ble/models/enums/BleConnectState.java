package com.fzfstudio.ezw_ble.ble.models.enums;

import com.google.gson.annotations.JsonAdapter;
import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@JsonAdapter(BleConnectStateAdapter.class)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0019\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\u001f\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010 \u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b \u0010\u001bj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006!"}, d2 = {"Lcom/fzfstudio/ezw_ble/ble/models/enums/BleConnectState;", "", "<init>", "(Ljava/lang/String;I)V", "CONNECTING", "CONTACT_DEVICE", "SEARCH_SERVICE", "SEARCH_CHARS", "START_BINDING", "CONNECT_FINISH", "DISCONNECT_BY_USER", "DISCONNECT_FROM_SYS", "EMPTY_UUID", "NO_BLE_CONFIG_FOUND", "NO_DEVICE_FOUND", "ALREADY_BOUND", "BOUND_FAIL", "SERVICE_FAIL", "CHARS_FAIL", "TIMEOUT", "BLE_ERROR", "SYSTEM_ERROR", "CONNECTED", "UPGRADE", "NONE", "isStartConnect", "", "()Z", "isConnecting", "isConnected", "isDisconnected", "isError", "isUpgrade", "flutter_ezw_ble_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class BleConnectState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BleConnectState[] $VALUES;
    public static final BleConnectState CONNECTING = new BleConnectState(StubApp.getString2(11398), 0);
    public static final BleConnectState CONTACT_DEVICE = new BleConnectState(StubApp.getString2(11399), 1);
    public static final BleConnectState SEARCH_SERVICE = new BleConnectState(StubApp.getString2(11400), 2);
    public static final BleConnectState SEARCH_CHARS = new BleConnectState(StubApp.getString2(11401), 3);
    public static final BleConnectState START_BINDING = new BleConnectState(StubApp.getString2(11402), 4);
    public static final BleConnectState CONNECT_FINISH = new BleConnectState(StubApp.getString2(11403), 5);
    public static final BleConnectState DISCONNECT_BY_USER = new BleConnectState(StubApp.getString2(11404), 6);
    public static final BleConnectState DISCONNECT_FROM_SYS = new BleConnectState(StubApp.getString2(11405), 7);
    public static final BleConnectState EMPTY_UUID = new BleConnectState(StubApp.getString2(11406), 8);
    public static final BleConnectState NO_BLE_CONFIG_FOUND = new BleConnectState(StubApp.getString2(11407), 9);
    public static final BleConnectState NO_DEVICE_FOUND = new BleConnectState(StubApp.getString2(11408), 10);
    public static final BleConnectState ALREADY_BOUND = new BleConnectState(StubApp.getString2(11409), 11);
    public static final BleConnectState BOUND_FAIL = new BleConnectState(StubApp.getString2(11410), 12);
    public static final BleConnectState SERVICE_FAIL = new BleConnectState(StubApp.getString2(11411), 13);
    public static final BleConnectState CHARS_FAIL = new BleConnectState(StubApp.getString2(11412), 14);
    public static final BleConnectState TIMEOUT = new BleConnectState(StubApp.getString2(3469), 15);
    public static final BleConnectState BLE_ERROR = new BleConnectState(StubApp.getString2(11413), 16);
    public static final BleConnectState SYSTEM_ERROR = new BleConnectState(StubApp.getString2(11414), 17);
    public static final BleConnectState CONNECTED = new BleConnectState(StubApp.getString2(11415), 18);
    public static final BleConnectState UPGRADE = new BleConnectState(StubApp.getString2(11416), 19);
    public static final BleConnectState NONE = new BleConnectState(StubApp.getString2(207), 20);

    private static final /* synthetic */ BleConnectState[] $values() {
        return new BleConnectState[]{CONNECTING, CONTACT_DEVICE, SEARCH_SERVICE, SEARCH_CHARS, START_BINDING, CONNECT_FINISH, DISCONNECT_BY_USER, DISCONNECT_FROM_SYS, EMPTY_UUID, NO_BLE_CONFIG_FOUND, NO_DEVICE_FOUND, ALREADY_BOUND, BOUND_FAIL, SERVICE_FAIL, CHARS_FAIL, TIMEOUT, BLE_ERROR, SYSTEM_ERROR, CONNECTED, UPGRADE, NONE};
    }

    static {
        BleConnectState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private BleConnectState(String str, int i3) {
    }

    public static EnumEntries<BleConnectState> getEntries() {
        return $ENTRIES;
    }

    public static BleConnectState valueOf(String str) {
        return (BleConnectState) Enum.valueOf(BleConnectState.class, str);
    }

    public static BleConnectState[] values() {
        return (BleConnectState[]) $VALUES.clone();
    }

    public final boolean isConnected() {
        return this == CONNECTED || this == UPGRADE;
    }

    public final boolean isConnecting() {
        return this == CONNECTING || this == CONTACT_DEVICE || this == SEARCH_SERVICE || this == SEARCH_CHARS || this == START_BINDING || this == CONNECT_FINISH;
    }

    public final boolean isDisconnected() {
        return this == DISCONNECT_BY_USER || this == DISCONNECT_FROM_SYS;
    }

    public final boolean isError() {
        return this == EMPTY_UUID || this == NO_DEVICE_FOUND || this == ALREADY_BOUND || this == BOUND_FAIL || this == SERVICE_FAIL || this == CHARS_FAIL || this == TIMEOUT || this == BLE_ERROR || this == SYSTEM_ERROR;
    }

    public final boolean isStartConnect() {
        return this == CONNECTING;
    }

    public final boolean isUpgrade() {
        return this == UPGRADE;
    }
}
