package no.nordicsemi.android.dfu;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.content.Intent;
import com.stub.StubApp;
import f5.u0;
import java.util.Locale;
import no.nordicsemi.android.dfu.internal.exception.DeviceDisconnectedException;
import no.nordicsemi.android.dfu.internal.exception.DfuException;
import no.nordicsemi.android.dfu.internal.exception.RemoteDfuException;
import no.nordicsemi.android.dfu.internal.exception.UnknownResponseException;
import no.nordicsemi.android.dfu.internal.exception.UploadAbortedException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
abstract class ButtonlessDfuImpl extends BaseButtonlessDfuImpl {
    private static final int DFU_STATUS_SUCCESS = 1;
    private static final byte[] OP_CODE_ENTER_BOOTLOADER = {1};
    private static final int OP_CODE_ENTER_BOOTLOADER_KEY = 1;
    private static final int OP_CODE_RESPONSE_CODE_KEY = 32;

    public ButtonlessDfuImpl(Intent intent, DfuBaseService dfuBaseService) {
        super(intent, dfuBaseService);
    }

    private int getStatusCode(byte[] bArr, int i3) throws UnknownResponseException {
        byte b2;
        if (bArr != null && bArr.length >= 3 && bArr[0] == 32 && bArr[1] == i3 && ((b2 = bArr[2]) == 1 || b2 == 2 || b2 == 4)) {
            return b2;
        }
        throw new UnknownResponseException(StubApp.getString2(26371), bArr, 32, i3);
    }

    public abstract BluetoothGattCharacteristic getButtonlessDfuCharacteristic();

    public abstract int getResponseType();

    @Override // no.nordicsemi.android.dfu.DfuService
    public void performDfu(Intent intent) throws DfuException, DeviceDisconnectedException, UploadAbortedException {
        byte[] bArr;
        String string2 = StubApp.getString2(74);
        String string22 = StubApp.getString2(26372);
        String string23 = StubApp.getString2(26373);
        this.mProgressInfo.setProgress(-2);
        BluetoothGatt bluetoothGatt = this.mGatt;
        this.mService.sendLogBroadcast(15, StubApp.getString2(26374));
        this.mService.sendLogBroadcast(1, StubApp.getString2(26375));
        BluetoothGattCharacteristic buttonlessDfuCharacteristic = getButtonlessDfuCharacteristic();
        int responseType = getResponseType();
        enableCCCD(buttonlessDfuCharacteristic, getResponseType());
        this.mService.sendLogBroadcast(10, (responseType == 2 ? StubApp.getString2(26376) : StubApp.getString2(26377)).concat(StubApp.getString2(26378)));
        try {
            this.mProgressInfo.setProgress(-3);
            logi(StubApp.getString2("26379"));
            writeOpCode(buttonlessDfuCharacteristic, OP_CODE_ENTER_BOOTLOADER, true);
            this.mService.sendLogBroadcast(10, StubApp.getString2("26380"));
            try {
                bArr = readNotificationResponse();
            } catch (DeviceDisconnectedException unused) {
                bArr = this.mReceivedData;
            }
            if (bArr != null) {
                int statusCode = getStatusCode(bArr, 1);
                logi(string23 + ((int) bArr[1]) + string22 + statusCode + string2);
                this.mService.sendLogBroadcast(10, string23 + ((int) bArr[1]) + string22 + statusCode + string2);
                if (statusCode != 1) {
                    throw new RemoteDfuException(StubApp.getString2("26382"), statusCode);
                }
                if (shouldScanForBootloader()) {
                    this.mService.waitFor(500L);
                    this.mService.disconnect(bluetoothGatt);
                } else {
                    this.mService.waitUntilDisconnected();
                    this.mService.sendLogBroadcast(5, StubApp.getString2("26381"));
                }
                logi(StubApp.getString2("1227"));
            } else {
                logi(StubApp.getString2("26383"));
            }
            finalize(intent, false, shouldScanForBootloader());
        } catch (RemoteDfuException e10) {
            int errorNumber = e10.getErrorNumber();
            loge(e10.getMessage());
            DfuBaseService dfuBaseService = this.mService;
            Locale locale = Locale.US;
            dfuBaseService.sendLogBroadcast(20, StubApp.getString2(26384) + u0.v(errorNumber | 2048));
            this.mService.terminateConnection(bluetoothGatt, errorNumber | 10240);
        } catch (UnknownResponseException e11) {
            loge(e11.getMessage());
            this.mService.sendLogBroadcast(20, e11.getMessage());
            this.mService.terminateConnection(bluetoothGatt, DfuBaseService.ERROR_INVALID_RESPONSE);
        }
    }

    public abstract boolean shouldScanForBootloader();
}
