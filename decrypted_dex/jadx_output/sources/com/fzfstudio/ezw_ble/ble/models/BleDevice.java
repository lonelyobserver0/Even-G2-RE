package com.fzfstudio.ezw_ble.ble.models;

import X2.u;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.os.Build;
import android.util.Log;
import com.fzfstudio.ezw_ble.ble.BleEC;
import com.fzfstudio.ezw_ble.ble.models.enums.BleConfigOutAdapter;
import com.fzfstudio.ezw_ble.ble.models.enums.BleConnectState;
import com.google.gson.annotations.JsonAdapter;
import com.stub.StubApp;
import io.flutter.plugin.common.EventChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o3.AbstractC1457a;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ9\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b$\u0010#R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b%\u0010#R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b0\u0010!R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u00101R\u001a\u00104\u001a\b\u0012\u0004\u0012\u000203028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0013\u00108\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0011\u00109\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lcom/fzfstudio/ezw_ble/ble/models/BleDevice;", "Lo3/a;", "Lcom/fzfstudio/ezw_ble/ble/models/BleConfig;", "belongConfig", "", "name", "uuid", "sn", "", "rssi", "Lcom/fzfstudio/ezw_ble/ble/models/enums/BleConnectState;", "connectState", "<init>", "(Lcom/fzfstudio/ezw_ble/ble/models/BleConfig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/fzfstudio/ezw_ble/ble/models/enums/BleConnectState;)V", "Landroid/bluetooth/BluetoothGatt;", "gatt", "psType", "Landroid/bluetooth/BluetoothGattCharacteristic;", "write", "read", "", "update", "(Landroid/bluetooth/BluetoothGatt;Ljava/lang/Integer;Landroid/bluetooth/BluetoothGattCharacteristic;Landroid/bluetooth/BluetoothGattCharacteristic;)V", "releaseAndClear", "()V", "", "data", "", "writeCharacteristic", "([BI)Z", "Lcom/fzfstudio/ezw_ble/ble/models/BleConfig;", "getBelongConfig", "()Lcom/fzfstudio/ezw_ble/ble/models/BleConfig;", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getUuid", "getSn", "I", "getRssi", "()I", "setRssi", "(I)V", "Lcom/fzfstudio/ezw_ble/ble/models/enums/BleConnectState;", "getConnectState", "()Lcom/fzfstudio/ezw_ble/ble/models/enums/BleConnectState;", "setConnectState", "(Lcom/fzfstudio/ezw_ble/ble/models/enums/BleConnectState;)V", "tag", "Landroid/bluetooth/BluetoothGatt;", "", "Lcom/fzfstudio/ezw_ble/ble/models/BleWriteAndRead;", "writeAndReadList", "Ljava/util/List;", "getMyGatt", "()Landroid/bluetooth/BluetoothGatt;", "myGatt", "isConnected", "()Z", "flutter_ezw_ble_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBleDevice.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleDevice.kt\ncom/fzfstudio/ezw_ble/ble/models/BleDevice\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,120:1\n295#2,2:121\n*S KotlinDebug\n*F\n+ 1 BleDevice.kt\ncom/fzfstudio/ezw_ble/ble/models/BleDevice\n*L\n90#1:121,2\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class BleDevice extends AbstractC1457a {

    @JsonAdapter(BleConfigOutAdapter.class)
    private final BleConfig belongConfig;
    private BleConnectState connectState;
    private BluetoothGatt gatt;
    private final String name;
    private int rssi;
    private final String sn;
    private final String tag;
    private final String uuid;
    private final List<BleWriteAndRead> writeAndReadList;

    public BleDevice(BleConfig belongConfig, String name, String uuid, String sn, int i3, BleConnectState connectState) {
        Intrinsics.checkNotNullParameter(belongConfig, "belongConfig");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(sn, "sn");
        Intrinsics.checkNotNullParameter(connectState, "connectState");
        this.belongConfig = belongConfig;
        this.name = name;
        this.uuid = uuid;
        this.sn = sn;
        this.rssi = i3;
        this.connectState = connectState;
        this.tag = StubApp.getString2(11363);
        List<BleWriteAndRead> synchronizedList = Collections.synchronizedList(new ArrayList());
        Intrinsics.checkNotNullExpressionValue(synchronizedList, "synchronizedList(...)");
        this.writeAndReadList = synchronizedList;
    }

    public static /* synthetic */ void update$default(BleDevice bleDevice, BluetoothGatt bluetoothGatt, Integer num, BluetoothGattCharacteristic bluetoothGattCharacteristic, BluetoothGattCharacteristic bluetoothGattCharacteristic2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            num = null;
        }
        if ((i3 & 4) != 0) {
            bluetoothGattCharacteristic = null;
        }
        if ((i3 & 8) != 0) {
            bluetoothGattCharacteristic2 = null;
        }
        bleDevice.update(bluetoothGatt, num, bluetoothGattCharacteristic, bluetoothGattCharacteristic2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean update$lambda$0(Integer num, BleWriteAndRead it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getPsType(), num);
    }

    public final BleConfig getBelongConfig() {
        return this.belongConfig;
    }

    public final BleConnectState getConnectState() {
        return this.connectState;
    }

    /* renamed from: getMyGatt, reason: from getter */
    public final BluetoothGatt getGatt() {
        return this.gatt;
    }

    public final String getName() {
        return this.name;
    }

    public final int getRssi() {
        return this.rssi;
    }

    public final String getSn() {
        return this.sn;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final boolean isConnected() {
        return this.connectState == BleConnectState.CONNECTED;
    }

    public final void releaseAndClear() {
        BluetoothGatt bluetoothGatt = this.gatt;
        if (bluetoothGatt != null) {
            bluetoothGatt.disconnect();
        }
        BluetoothGatt bluetoothGatt2 = this.gatt;
        if (bluetoothGatt2 != null) {
            bluetoothGatt2.close();
        }
        this.gatt = null;
        this.writeAndReadList.clear();
    }

    public final void setConnectState(BleConnectState bleConnectState) {
        Intrinsics.checkNotNullParameter(bleConnectState, "<set-?>");
        this.connectState = bleConnectState;
    }

    public final void setRssi(int i3) {
        this.rssi = i3;
    }

    public final void update(BluetoothGatt gatt, Integer psType, BluetoothGattCharacteristic write, BluetoothGattCharacteristic read) {
        Intrinsics.checkNotNullParameter(gatt, "gatt");
        this.gatt = gatt;
        if (psType == null || write == null || read == null) {
            return;
        }
        CollectionsKt__MutableCollectionsKt.removeAll((List) this.writeAndReadList, (Function1) new u(psType, 3));
        this.writeAndReadList.add(new BleWriteAndRead(psType, write, read));
    }

    public final boolean writeCharacteristic(byte[] data, int psType) {
        Object obj;
        EventChannel.EventSink event;
        int writeCharacteristic;
        String string2 = StubApp.getString2(11364);
        String string22 = StubApp.getString2(11273);
        boolean z2 = false;
        if (data == null) {
            Log.i(this.tag, string22 + this.uuid + string2 + psType + StubApp.getString2(11365));
            return false;
        }
        Iterator<T> it = this.writeAndReadList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Integer psType2 = ((BleWriteAndRead) obj).getPsType();
            if (psType2 != null && psType2.intValue() == psType) {
                break;
            }
        }
        BleWriteAndRead bleWriteAndRead = (BleWriteAndRead) obj;
        BluetoothGattCharacteristic writeChars = bleWriteAndRead != null ? bleWriteAndRead.getWriteChars() : null;
        BluetoothGatt bluetoothGatt = this.gatt;
        if (bluetoothGatt == null || writeChars == null) {
            EventChannel.EventSink event2 = BleEC.RECEIVE_DATA.getEvent();
            if (event2 != null) {
                event2.success(BleCmd.INSTANCE.fail(this.uuid, psType).toMap());
            }
            Log.i(this.tag, string22 + this.uuid + string2 + psType + StubApp.getString2(81) + data + StubApp.getString2(11367));
            return false;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            writeCharacteristic = bluetoothGatt.writeCharacteristic(writeChars, data, 1);
            if (writeCharacteristic == 0) {
                z2 = true;
            }
        } else {
            writeChars.setValue(data);
            BluetoothGatt bluetoothGatt2 = this.gatt;
            if (bluetoothGatt2 != null) {
                z2 = bluetoothGatt2.writeCharacteristic(writeChars);
            }
        }
        if (!z2 && (event = BleEC.RECEIVE_DATA.getEvent()) != null) {
            event.success(BleCmd.INSTANCE.fail(this.uuid, psType).toMap());
        }
        Log.i(this.tag, string22 + this.uuid + StubApp.getString2(11366) + z2 + StubApp.getString2(1065) + this.name + StubApp.getString2(2148) + psType + StubApp.getString2(11338) + data.length);
        return true;
    }
}
