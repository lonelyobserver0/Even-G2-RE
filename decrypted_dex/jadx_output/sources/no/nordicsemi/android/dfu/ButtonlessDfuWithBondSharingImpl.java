package no.nordicsemi.android.dfu;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Intent;
import com.stub.StubApp;
import java.util.UUID;
import no.nordicsemi.android.dfu.internal.exception.DeviceDisconnectedException;
import no.nordicsemi.android.dfu.internal.exception.DfuException;
import no.nordicsemi.android.dfu.internal.exception.UploadAbortedException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class ButtonlessDfuWithBondSharingImpl extends ButtonlessDfuImpl {
    static UUID BUTTONLESS_DFU_SERVICE_UUID;
    static UUID BUTTONLESS_DFU_UUID;
    static final UUID DEFAULT_BUTTONLESS_DFU_SERVICE_UUID;
    static final UUID DEFAULT_BUTTONLESS_DFU_UUID;
    private BluetoothGattCharacteristic mButtonlessDfuCharacteristic;

    static {
        UUID uuid = SecureDfuImpl.DEFAULT_DFU_SERVICE_UUID;
        DEFAULT_BUTTONLESS_DFU_SERVICE_UUID = uuid;
        UUID uuid2 = new UUID(-8157989228746813600L, -6937650605005804976L);
        DEFAULT_BUTTONLESS_DFU_UUID = uuid2;
        BUTTONLESS_DFU_SERVICE_UUID = uuid;
        BUTTONLESS_DFU_UUID = uuid2;
    }

    public ButtonlessDfuWithBondSharingImpl(Intent intent, DfuBaseService dfuBaseService) {
        super(intent, dfuBaseService);
    }

    @Override // no.nordicsemi.android.dfu.ButtonlessDfuImpl
    public BluetoothGattCharacteristic getButtonlessDfuCharacteristic() {
        return this.mButtonlessDfuCharacteristic;
    }

    @Override // no.nordicsemi.android.dfu.BaseDfuImpl
    public UUID getDfuServiceUUID() {
        return SecureDfuImpl.DFU_SERVICE_UUID;
    }

    @Override // no.nordicsemi.android.dfu.ButtonlessDfuImpl
    public int getResponseType() {
        return 2;
    }

    @Override // no.nordicsemi.android.dfu.DfuService
    public boolean isClientCompatible(Intent intent, BluetoothGatt bluetoothGatt) {
        BluetoothGattCharacteristic characteristic;
        BluetoothGattService service = bluetoothGatt.getService(BUTTONLESS_DFU_SERVICE_UUID);
        if (service == null || (characteristic = service.getCharacteristic(BUTTONLESS_DFU_UUID)) == null || characteristic.getDescriptor(BaseDfuImpl.CLIENT_CHARACTERISTIC_CONFIG) == null) {
            return false;
        }
        this.mButtonlessDfuCharacteristic = characteristic;
        return true;
    }

    @Override // no.nordicsemi.android.dfu.ButtonlessDfuImpl, no.nordicsemi.android.dfu.DfuService
    public void performDfu(Intent intent) throws DfuException, DeviceDisconnectedException, UploadAbortedException {
        logi(StubApp.getString2(26385));
        if (isBonded()) {
            intent.putExtra(StubApp.getString2(26275), true);
            intent.putExtra(StubApp.getString2(26294), false);
            super.performDfu(intent);
        } else {
            logw(StubApp.getString2(26386));
            this.mService.sendLogBroadcast(15, StubApp.getString2(26229));
            this.mService.terminateConnection(this.mGatt, DfuBaseService.ERROR_DEVICE_NOT_BONDED);
        }
    }

    @Override // no.nordicsemi.android.dfu.ButtonlessDfuImpl
    public boolean shouldScanForBootloader() {
        return false;
    }
}
