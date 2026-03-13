package com.fzfstudio.ezw_ble.ble.models;

import Xa.h;
import com.stub.StubApp;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0006R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/fzfstudio/ezw_ble/ble/models/BluetoothGattStatus;", "", "<init>", "()V", "statusMessages", "", "", "", "getStatusMessages", "()Ljava/util/Map;", "getStatusDescription", "status", "flutter_ezw_ble_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class BluetoothGattStatus {
    public static final BluetoothGattStatus INSTANCE = new BluetoothGattStatus();
    private static final Map<Integer, String> statusMessages = MapsKt.mapOf(TuplesKt.to(0, StubApp.getString2(11373)), TuplesKt.to(1, StubApp.getString2(11374)), TuplesKt.to(2, StubApp.getString2(11375)), TuplesKt.to(3, StubApp.getString2(11376)), TuplesKt.to(4, StubApp.getString2(11377)), TuplesKt.to(5, StubApp.getString2(11378)), TuplesKt.to(6, StubApp.getString2(11379)), TuplesKt.to(7, StubApp.getString2(11380)), TuplesKt.to(8, StubApp.getString2(11381)), TuplesKt.to(9, StubApp.getString2(11382)), TuplesKt.to(10, StubApp.getString2(11383)), TuplesKt.to(11, StubApp.getString2(11384)), TuplesKt.to(12, StubApp.getString2(11385)), TuplesKt.to(13, StubApp.getString2(11386)), TuplesKt.to(14, StubApp.getString2(11387)), TuplesKt.to(15, StubApp.getString2(11388)), TuplesKt.to(16, StubApp.getString2(11389)), TuplesKt.to(17, StubApp.getString2(11390)), TuplesKt.to(19, StubApp.getString2(11391)), TuplesKt.to(22, StubApp.getString2(11392)), TuplesKt.to(34, StubApp.getString2(11393)), TuplesKt.to(62, StubApp.getString2(11394)), TuplesKt.to(133, StubApp.getString2(11395)), TuplesKt.to(257, StubApp.getString2(11396)));

    private BluetoothGattStatus() {
    }

    public final String getStatusDescription(int status) {
        String str = statusMessages.get(Integer.valueOf(status));
        return str == null ? h.g(status, StubApp.getString2(11397), StubApp.getString2(74)) : str;
    }

    public final Map<Integer, String> getStatusMessages() {
        return statusMessages;
    }
}
