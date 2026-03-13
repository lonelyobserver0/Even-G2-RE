package no.nordicsemi.android.dfu;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanFilter;
import android.os.ParcelUuid;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface DfuDeviceSelector {
    default List<ScanFilter> getScanFilters(ParcelUuid parcelUuid) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ScanFilter.Builder().setServiceUuid(parcelUuid).build());
        arrayList.add(new ScanFilter.Builder().build());
        return arrayList;
    }

    boolean matches(BluetoothDevice bluetoothDevice, int i3, byte[] bArr, String str, String str2);
}
