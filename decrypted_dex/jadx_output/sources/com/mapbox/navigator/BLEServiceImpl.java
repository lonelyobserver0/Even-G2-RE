package com.mapbox.navigator;

import Xa.h;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.os.ParcelUuid;
import android.util.Log;
import android.util.SparseArray;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000[\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0010\b\u0002\u0018\u0000 %2\u00020\u0001:\u0001%B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\b\u0010\u0019\u001a\u00020\tH\u0002J\u0014\u0010\u001a\u001a\u00020\u001b2\n\u0010\u001c\u001a\u00060\u001dj\u0002`\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\nH\u0016J\b\u0010!\u001a\u00020\u001bH\u0002J\b\u0010\"\u001a\u00020\u001bH\u0002J\u0010\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\tH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/mapbox/navigator/BLEServiceImpl;", "Lcom/mapbox/navigator/BLEService;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "bluetoothAdapter", "Landroid/bluetooth/BluetoothAdapter;", "callbacks", "", "", "Lcom/mapbox/navigator/ScanResultCallback;", "getContext", "()Landroid/content/Context;", "nextCallbackId", "Ljava/util/concurrent/atomic/AtomicInteger;", "scanCallback", "com/mapbox/navigator/BLEServiceImpl$scanCallback$1", "Lcom/mapbox/navigator/BLEServiceImpl$scanCallback$1;", "scanner", "Landroid/bluetooth/le/BluetoothLeScanner;", "hasPermission", "", "permission", "", "hasPermissions", "makeNextCallbackId", "notifyCallbacks", "", "scanResult", "Lcom/mapbox/navigator/ScanResult;", "Lcom/mapbox/navigator/NNScanResult;", "registerScanResultCallback", "callback", "startScan", "stopScan", "unregisterCallback", "id", "Companion", "dash-native_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class BLEServiceImpl implements BLEService {
    private BluetoothAdapter bluetoothAdapter;
    private final Map<Integer, ScanResultCallback> callbacks;
    private final Context context;
    private final AtomicInteger nextCallbackId;
    private final BLEServiceImpl$scanCallback$1 scanCallback;
    private BluetoothLeScanner scanner;
    public static final String TAG = StubApp.getString2(14904);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/mapbox/navigator/BLEServiceImpl$Companion;", "", "()V", "TAG", "", "createPlatformBLEService", "Lcom/mapbox/navigator/BLEService;", "dash-native_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final BLEService createPlatformBLEService() {
            return new BLEServiceImpl(MapboxNavigationNative.INSTANCE.getAppContext$dash_native_release());
        }

        private Companion() {
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [com.mapbox.navigator.BLEServiceImpl$scanCallback$1] */
    public BLEServiceImpl(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.nextCallbackId = new AtomicInteger(0);
        this.callbacks = new LinkedHashMap();
        this.scanCallback = new ScanCallback() { // from class: com.mapbox.navigator.BLEServiceImpl$scanCallback$1
            public final void handle(android.bluetooth.le.ScanResult result) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(result, StubApp.getString2(1890));
                ScanRecord scanRecord = result.getScanRecord();
                if (scanRecord == null) {
                    return;
                }
                SparseArray<byte[]> manufacturerSpecificData = scanRecord.getManufacturerSpecificData();
                if (manufacturerSpecificData == null) {
                    manufacturerSpecificData = new SparseArray<>();
                }
                ArrayList arrayList2 = new ArrayList();
                int size = manufacturerSpecificData.size();
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList2.add(new ManufacturerData(manufacturerSpecificData.keyAt(i3), manufacturerSpecificData.valueAt(i3)));
                }
                Map<ParcelUuid, byte[]> serviceData = scanRecord.getServiceData();
                ArrayList arrayList3 = new ArrayList();
                if (serviceData != null) {
                    for (Map.Entry<ParcelUuid, byte[]> entry : serviceData.entrySet()) {
                        ParcelUuid key = entry.getKey();
                        arrayList3.add(new ServiceData(key.toString(), entry.getValue()));
                    }
                }
                String address = result.getDevice().getAddress();
                String deviceName = scanRecord.getDeviceName();
                if (deviceName == null) {
                    deviceName = "";
                }
                String str = deviceName;
                ArrayList arrayList4 = new ArrayList(arrayList2);
                ArrayList arrayList5 = new ArrayList(arrayList3);
                int txPowerLevel = scanRecord.getTxPowerLevel();
                List<ParcelUuid> serviceUuids = scanRecord.getServiceUuids();
                if (serviceUuids != null) {
                    arrayList = new ArrayList(CollectionsKt.f(serviceUuids));
                    Iterator<T> it = serviceUuids.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ParcelUuid) it.next()).toString());
                    }
                } else {
                    arrayList = new ArrayList();
                }
                ArrayList arrayList6 = arrayList;
                List emptyList = CollectionsKt.emptyList();
                List<ParcelUuid> compatGetServiceSolicitationUuids = BLEServiceKt.compatGetServiceSolicitationUuids(scanRecord);
                ArrayList arrayList7 = new ArrayList(CollectionsKt.f(compatGetServiceSolicitationUuids));
                Iterator<T> it2 = compatGetServiceSolicitationUuids.iterator();
                while (it2.hasNext()) {
                    arrayList7.add(((ParcelUuid) it2.next()).toString());
                }
                BLEServiceImpl.this.notifyCallbacks(new ScanResult(address, str, arrayList4, arrayList5, txPowerLevel, arrayList6, emptyList, arrayList7, BLEServiceKt.compatIsConnectable(result), result.getRssi(), result.getTimestampNanos()));
            }

            @Override // android.bluetooth.le.ScanCallback
            public void onBatchScanResults(List<android.bluetooth.le.ScanResult> results) {
                Intrinsics.checkNotNullParameter(results, "results");
                Iterator<android.bluetooth.le.ScanResult> it = results.iterator();
                while (it.hasNext()) {
                    handle(it.next());
                }
            }

            @Override // android.bluetooth.le.ScanCallback
            public void onScanFailed(int errorCode) {
                h.B(errorCode, StubApp.getString2(14903), StubApp.getString2(14904));
            }

            @Override // android.bluetooth.le.ScanCallback
            public void onScanResult(int callbackType, android.bluetooth.le.ScanResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                handle(result);
            }
        };
    }

    @JvmStatic
    public static final BLEService createPlatformBLEService() {
        return INSTANCE.createPlatformBLEService();
    }

    private final boolean hasPermission(String permission) {
        return D.a.a(this.context, permission) == 0;
    }

    private final boolean hasPermissions() {
        return hasPermission(StubApp.getString2(6790)) && hasPermission(StubApp.getString2(11310)) && hasPermission(StubApp.getString2(140)) && hasPermission(StubApp.getString2(141));
    }

    private final int makeNextCallbackId() {
        return this.nextCallbackId.addAndGet(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void notifyCallbacks(ScanResult scanResult) {
        Iterator<Map.Entry<Integer, ScanResultCallback>> it = this.callbacks.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().run(scanResult);
        }
    }

    private final void startScan() {
        if (!hasPermissions()) {
            Log.i(StubApp.getString2(14905), StubApp.getString2(14906));
            return;
        }
        if (this.scanner != null) {
            return;
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.bluetoothAdapter = defaultAdapter;
        String string2 = StubApp.getString2(14904);
        if (defaultAdapter == null) {
            Log.e(string2, StubApp.getString2(14907));
            return;
        }
        Intrinsics.checkNotNull(defaultAdapter);
        if (!defaultAdapter.isEnabled()) {
            Log.e(string2, StubApp.getString2(14908));
            return;
        }
        ScanSettings build = new ScanSettings.Builder().setScanMode(2).build();
        BluetoothAdapter bluetoothAdapter = this.bluetoothAdapter;
        Intrinsics.checkNotNull(bluetoothAdapter);
        BluetoothLeScanner bluetoothLeScanner = bluetoothAdapter.getBluetoothLeScanner();
        this.scanner = bluetoothLeScanner;
        if (bluetoothLeScanner != null) {
            bluetoothLeScanner.startScan(CollectionsKt.emptyList(), build, this.scanCallback);
        }
    }

    private final void stopScan() {
        if (!hasPermissions()) {
            Log.i(StubApp.getString2(14905), StubApp.getString2(14906));
            return;
        }
        BluetoothLeScanner bluetoothLeScanner = this.scanner;
        if (bluetoothLeScanner != null) {
            bluetoothLeScanner.stopScan(this.scanCallback);
        }
        this.scanner = null;
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // com.mapbox.navigator.BLEService
    public synchronized int registerScanResultCallback(ScanResultCallback callback) {
        int makeNextCallbackId;
        Intrinsics.checkNotNullParameter(callback, "callback");
        makeNextCallbackId = makeNextCallbackId();
        this.callbacks.put(Integer.valueOf(makeNextCallbackId), callback);
        startScan();
        return makeNextCallbackId;
    }

    @Override // com.mapbox.navigator.BLEService
    public synchronized void unregisterCallback(int id) {
        this.callbacks.remove(Integer.valueOf(id));
        if (this.callbacks.isEmpty()) {
            stopScan();
        }
    }
}
