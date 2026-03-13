package no.nordicsemi.android.dfu;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.content.Intent;
import com.stub.StubApp;
import no.nordicsemi.android.dfu.BaseDfuImpl;

@SuppressLint({"MissingPermission"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
abstract class BaseButtonlessDfuImpl extends BaseDfuImpl {
    private final ButtonlessBluetoothCallback mBluetoothCallback;

    public class ButtonlessBluetoothCallback extends BaseDfuImpl.BaseBluetoothGattCallback {
        public ButtonlessBluetoothCallback() {
            super();
        }

        @Override // no.nordicsemi.android.dfu.BaseDfuImpl.BaseBluetoothGattCallback, android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
            BaseButtonlessDfuImpl.this.mService.sendLogBroadcast(5, StubApp.getString2(26144) + bluetoothGattCharacteristic.getUuid() + StubApp.getString2(26274) + parse(bArr));
            BaseButtonlessDfuImpl.this.mReceivedData = bluetoothGattCharacteristic.getValue();
            BaseButtonlessDfuImpl.this.notifyLock();
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i3) {
            BaseButtonlessDfuImpl baseButtonlessDfuImpl = BaseButtonlessDfuImpl.this;
            baseButtonlessDfuImpl.mRequestCompleted = true;
            baseButtonlessDfuImpl.notifyLock();
        }
    }

    public BaseButtonlessDfuImpl(Intent intent, DfuBaseService dfuBaseService) {
        super(intent, dfuBaseService);
        this.mBluetoothCallback = new ButtonlessBluetoothCallback();
    }

    public void finalize(Intent intent, boolean z2, boolean z10) {
        this.mService.refreshDeviceCache(this.mGatt, z2 || !intent.getBooleanExtra(StubApp.getString2(26275), false));
        this.mService.close(this.mGatt);
        logi(StubApp.getString2(26276));
        Intent intent2 = new Intent();
        intent2.fillIn(intent, 24);
        restartService(intent2, z10, getDfuServiceUUID());
    }

    @Override // no.nordicsemi.android.dfu.DfuCallback
    public BaseDfuImpl.BaseBluetoothGattCallback getGattCallback() {
        return this.mBluetoothCallback;
    }
}
