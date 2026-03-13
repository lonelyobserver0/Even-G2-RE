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
class ExperimentalButtonlessDfuImpl extends ButtonlessDfuImpl {
    static final UUID DEFAULT_EXPERIMENTAL_BUTTONLESS_DFU_SERVICE_UUID;
    static final UUID DEFAULT_EXPERIMENTAL_BUTTONLESS_DFU_UUID;
    static UUID EXPERIMENTAL_BUTTONLESS_DFU_SERVICE_UUID;
    static UUID EXPERIMENTAL_BUTTONLESS_DFU_UUID;
    private BluetoothGattCharacteristic mButtonlessDfuCharacteristic;

    static {
        UUID uuid = new UUID(-8196551313441075360L, -6937650605005804976L);
        DEFAULT_EXPERIMENTAL_BUTTONLESS_DFU_SERVICE_UUID = uuid;
        UUID uuid2 = new UUID(-8196551313441075360L, -6937650605005804976L);
        DEFAULT_EXPERIMENTAL_BUTTONLESS_DFU_UUID = uuid2;
        EXPERIMENTAL_BUTTONLESS_DFU_SERVICE_UUID = uuid;
        EXPERIMENTAL_BUTTONLESS_DFU_UUID = uuid2;
    }

    public ExperimentalButtonlessDfuImpl(Intent intent, DfuBaseService dfuBaseService) {
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
        return 1;
    }

    @Override // no.nordicsemi.android.dfu.DfuService
    public boolean isClientCompatible(Intent intent, BluetoothGatt bluetoothGatt) {
        BluetoothGattCharacteristic characteristic;
        BluetoothGattService service = bluetoothGatt.getService(EXPERIMENTAL_BUTTONLESS_DFU_SERVICE_UUID);
        if (service == null || (characteristic = service.getCharacteristic(EXPERIMENTAL_BUTTONLESS_DFU_UUID)) == null || characteristic.getDescriptor(BaseDfuImpl.CLIENT_CHARACTERISTIC_CONFIG) == null) {
            return false;
        }
        this.mButtonlessDfuCharacteristic = characteristic;
        return true;
    }

    @Override // no.nordicsemi.android.dfu.ButtonlessDfuImpl, no.nordicsemi.android.dfu.DfuService
    public void performDfu(Intent intent) throws DfuException, DeviceDisconnectedException, UploadAbortedException {
        logi(StubApp.getString2(26505));
        super.performDfu(intent);
    }

    @Override // no.nordicsemi.android.dfu.ButtonlessDfuImpl
    public boolean shouldScanForBootloader() {
        return true;
    }
}
