package no.nordicsemi.android.dfu.internal.scanner;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.os.ParcelUuid;
import com.stub.StubApp;
import java.util.List;
import java.util.UUID;
import no.nordicsemi.android.dfu.DfuDeviceSelector;

@SuppressLint({"MissingPermission"})
@TargetApi(21)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class BootloaderScannerLollipop extends ScanCallback implements BootloaderScanner {
    private String mBootloaderAddress;
    private final String mDeviceAddress;
    private final String mDeviceAddressIncremented;
    private final ParcelUuid mDfuServiceUuid;
    private boolean mFound;
    private final Object mLock = new Object();
    private DfuDeviceSelector mSelector;

    public BootloaderScannerLollipop(String str, String str2, UUID uuid) {
        this.mDeviceAddress = str;
        this.mDeviceAddressIncremented = str2;
        this.mDfuServiceUuid = new ParcelUuid(uuid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$searchUsing$0(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
        }
        if (this.mFound) {
            return;
        }
        this.mBootloaderAddress = null;
        this.mFound = true;
        synchronized (this.mLock) {
            this.mLock.notifyAll();
        }
    }

    @Override // android.bluetooth.le.ScanCallback
    public void onScanResult(int i3, ScanResult scanResult) {
        String address = scanResult.getDevice().getAddress();
        if (this.mFound || !this.mSelector.matches(scanResult.getDevice(), scanResult.getRssi(), scanResult.getScanRecord().getBytes(), this.mDeviceAddress, this.mDeviceAddressIncremented)) {
            return;
        }
        this.mBootloaderAddress = address;
        this.mFound = true;
        synchronized (this.mLock) {
            this.mLock.notifyAll();
        }
    }

    @Override // no.nordicsemi.android.dfu.internal.scanner.BootloaderScanner
    public String searchUsing(DfuDeviceSelector dfuDeviceSelector, long j) {
        BluetoothLeScanner bluetoothLeScanner;
        this.mSelector = dfuDeviceSelector;
        this.mBootloaderAddress = null;
        this.mFound = false;
        new Thread(new a(this, j, 0), StubApp.getString2(26683)).start();
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null || defaultAdapter.getState() != 12 || (bluetoothLeScanner = defaultAdapter.getBluetoothLeScanner()) == null) {
            return null;
        }
        ScanSettings build = new ScanSettings.Builder().setScanMode(2).build();
        if (defaultAdapter.isOffloadedFilteringSupported()) {
            bluetoothLeScanner.startScan(dfuDeviceSelector.getScanFilters(this.mDfuServiceUuid), build, this);
        } else {
            bluetoothLeScanner.startScan((List<ScanFilter>) null, build, this);
        }
        try {
            synchronized (this.mLock) {
                while (!this.mFound) {
                    try {
                        this.mLock.wait();
                    } finally {
                    }
                }
            }
        } catch (InterruptedException unused) {
        }
        bluetoothLeScanner.stopScan(this);
        return this.mBootloaderAddress;
    }
}
