package com.mapbox.navigator;

import android.bluetooth.le.ScanRecord;
import android.os.Build;
import android.os.ParcelUuid;
import android.util.Log;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u0005*\u00060\u0006j\u0002`\u0007*\n\u0010\b\"\u00020\u00062\u00020\u0006*\n\u0010\t\"\u00020\n2\u00020\n¨\u0006\u000b"}, d2 = {"compatGetServiceSolicitationUuids", "", "Landroid/os/ParcelUuid;", "Landroid/bluetooth/le/ScanRecord;", "compatIsConnectable", "", "Landroid/bluetooth/le/ScanResult;", "Lcom/mapbox/navigator/BLEScanResult;", "BLEScanResult", "NNScanResult", "Lcom/mapbox/navigator/ScanResult;", "dash-native_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class BLEServiceKt {
    public static final List<ParcelUuid> compatGetServiceSolicitationUuids(ScanRecord scanRecord) {
        List<ParcelUuid> serviceSolicitationUuids;
        Intrinsics.checkNotNullParameter(scanRecord, "<this>");
        if (Build.VERSION.SDK_INT >= 29) {
            serviceSolicitationUuids = scanRecord.getServiceSolicitationUuids();
            return serviceSolicitationUuids == null ? new ArrayList() : serviceSolicitationUuids;
        }
        Log.w(StubApp.getString2(14904), StubApp.getString2(14909));
        return new ArrayList();
    }

    public static final boolean compatIsConnectable(android.bluetooth.le.ScanResult scanResult) {
        Intrinsics.checkNotNullParameter(scanResult, "<this>");
        return scanResult.isConnectable();
    }
}
