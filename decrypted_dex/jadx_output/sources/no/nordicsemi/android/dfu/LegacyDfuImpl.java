package no.nordicsemi.android.dfu;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Intent;
import android.os.Build;
import com.stub.StubApp;
import java.util.UUID;
import kotlin.UByte;
import no.nordicsemi.android.dfu.BaseCustomDfuImpl;
import no.nordicsemi.android.dfu.internal.exception.DeviceDisconnectedException;
import no.nordicsemi.android.dfu.internal.exception.DfuException;
import no.nordicsemi.android.dfu.internal.exception.UnknownResponseException;
import no.nordicsemi.android.dfu.internal.exception.UploadAbortedException;

@SuppressLint({"MissingPermission"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class LegacyDfuImpl extends BaseCustomDfuImpl {
    static final UUID DEFAULT_DFU_CONTROL_POINT_UUID;
    static final UUID DEFAULT_DFU_PACKET_UUID;
    static final UUID DEFAULT_DFU_SERVICE_UUID;
    static final UUID DEFAULT_DFU_VERSION_UUID;
    static UUID DFU_CONTROL_POINT_UUID = null;
    static UUID DFU_PACKET_UUID = null;
    static UUID DFU_SERVICE_UUID = null;
    private static final int DFU_STATUS_SUCCESS = 1;
    static UUID DFU_VERSION_UUID = null;
    private static final byte[] OP_CODE_ACTIVATE_AND_RESET;
    private static final int OP_CODE_ACTIVATE_AND_RESET_KEY = 5;
    private static final byte[] OP_CODE_INIT_DFU_PARAMS;
    private static final byte[] OP_CODE_INIT_DFU_PARAMS_COMPLETE;
    private static final int OP_CODE_INIT_DFU_PARAMS_KEY = 2;
    private static final byte[] OP_CODE_INIT_DFU_PARAMS_START;
    private static final int OP_CODE_PACKET_RECEIPT_NOTIF_KEY = 17;
    private static final byte[] OP_CODE_PACKET_RECEIPT_NOTIF_REQ;
    private static final int OP_CODE_PACKET_RECEIPT_NOTIF_REQ_KEY = 8;
    private static final byte[] OP_CODE_RECEIVE_FIRMWARE_IMAGE;
    private static final int OP_CODE_RECEIVE_FIRMWARE_IMAGE_KEY = 3;
    private static final byte[] OP_CODE_RESET;
    private static final int OP_CODE_RESET_KEY = 6;
    private static final int OP_CODE_RESPONSE_CODE_KEY = 16;
    private static final byte[] OP_CODE_START_DFU;
    private static final int OP_CODE_START_DFU_KEY = 1;
    private static final byte[] OP_CODE_START_DFU_V1;
    private static final byte[] OP_CODE_VALIDATE;
    private static final int OP_CODE_VALIDATE_KEY = 4;
    private final LegacyBluetoothCallback mBluetoothCallback;
    private BluetoothGattCharacteristic mControlPointCharacteristic;
    private boolean mImageSizeInProgress;
    private BluetoothGattCharacteristic mPacketCharacteristic;

    public class LegacyBluetoothCallback extends BaseCustomDfuImpl.BaseCustomBluetoothCallback {
        public LegacyBluetoothCallback() {
            super();
        }

        @Override // no.nordicsemi.android.dfu.BaseDfuImpl.BaseBluetoothGattCallback, android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
            if ((bArr[0] & UByte.MAX_VALUE) == 17) {
                LegacyDfuImpl.this.mProgressInfo.setBytesReceived(getInt(bArr, 1));
                handlePacketReceiptNotification(bluetoothGatt, bluetoothGattCharacteristic, bArr);
            } else {
                LegacyDfuImpl legacyDfuImpl = LegacyDfuImpl.this;
                if (!legacyDfuImpl.mRemoteErrorOccurred) {
                    if ((bArr[2] & UByte.MAX_VALUE) != 1) {
                        legacyDfuImpl.mRemoteErrorOccurred = true;
                    }
                    handleNotification(bluetoothGatt, bluetoothGattCharacteristic, bArr);
                }
            }
            LegacyDfuImpl.this.notifyLock();
        }

        @Override // no.nordicsemi.android.dfu.BaseCustomDfuImpl.BaseCustomBluetoothCallback
        public void onPacketCharacteristicWrite() {
            if (LegacyDfuImpl.this.mImageSizeInProgress) {
                LegacyDfuImpl.this.mImageSizeInProgress = false;
            }
        }
    }

    static {
        UUID uuid = new UUID(23296205844446L, 1523193452336828707L);
        DEFAULT_DFU_SERVICE_UUID = uuid;
        UUID uuid2 = new UUID(23300500811742L, 1523193452336828707L);
        DEFAULT_DFU_CONTROL_POINT_UUID = uuid2;
        UUID uuid3 = new UUID(23304795779038L, 1523193452336828707L);
        DEFAULT_DFU_PACKET_UUID = uuid3;
        UUID uuid4 = new UUID(23313385713630L, 1523193452336828707L);
        DEFAULT_DFU_VERSION_UUID = uuid4;
        DFU_SERVICE_UUID = uuid;
        DFU_CONTROL_POINT_UUID = uuid2;
        DFU_PACKET_UUID = uuid3;
        DFU_VERSION_UUID = uuid4;
        OP_CODE_START_DFU = new byte[]{1, 0};
        OP_CODE_START_DFU_V1 = new byte[]{1};
        OP_CODE_INIT_DFU_PARAMS = new byte[]{2};
        OP_CODE_INIT_DFU_PARAMS_START = new byte[]{2, 0};
        OP_CODE_INIT_DFU_PARAMS_COMPLETE = new byte[]{2, 1};
        OP_CODE_RECEIVE_FIRMWARE_IMAGE = new byte[]{3};
        OP_CODE_VALIDATE = new byte[]{4};
        OP_CODE_ACTIVATE_AND_RESET = new byte[]{5};
        OP_CODE_RESET = new byte[]{6};
        OP_CODE_PACKET_RECEIPT_NOTIF_REQ = new byte[]{8, 0, 0};
    }

    public LegacyDfuImpl(Intent intent, DfuBaseService dfuBaseService) {
        super(intent, dfuBaseService);
        this.mBluetoothCallback = new LegacyBluetoothCallback();
    }

    private int getStatusCode(byte[] bArr, int i3) throws UnknownResponseException {
        byte b2;
        if (bArr == null || bArr.length != 3 || bArr[0] != 16 || bArr[1] != i3 || (b2 = bArr[2]) < 1 || b2 > 6) {
            throw new UnknownResponseException(StubApp.getString2(26371), bArr, 16, i3);
        }
        return b2;
    }

    private int readVersion(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (bluetoothGattCharacteristic != null) {
            return bluetoothGattCharacteristic.getIntValue(18, 0).intValue();
        }
        return 0;
    }

    private void resetAndRestart(BluetoothGatt bluetoothGatt, Intent intent) throws DfuException, DeviceDisconnectedException, UploadAbortedException {
        this.mService.sendLogBroadcast(15, StubApp.getString2(26525));
        this.mProgressInfo.setProgress(-5);
        logi(StubApp.getString2(26526));
        writeOpCode(this.mControlPointCharacteristic, OP_CODE_RESET);
        this.mService.sendLogBroadcast(10, StubApp.getString2(26527));
        this.mService.waitUntilDisconnected();
        this.mService.sendLogBroadcast(5, StubApp.getString2(26381));
        BluetoothGattService service = bluetoothGatt.getService(BaseDfuImpl.GENERIC_ATTRIBUTE_SERVICE_UUID);
        this.mService.refreshDeviceCache(bluetoothGatt, !((service == null || service.getCharacteristic(BaseDfuImpl.SERVICE_CHANGED_UUID) == null) ? false : true));
        this.mService.close(bluetoothGatt);
        logi(StubApp.getString2(26466));
        Intent intent2 = new Intent();
        intent2.fillIn(intent, 24);
        restartService(intent2, false, DFU_SERVICE_UUID);
    }

    private void setImageSize(byte[] bArr, int i3, int i10) {
        bArr[i10] = (byte) (i3 & 255);
        bArr[i10 + 1] = (byte) ((i3 >> 8) & 255);
        bArr[i10 + 2] = (byte) ((i3 >> 16) & 255);
        bArr[i10 + 3] = (byte) ((i3 >> 24) & 255);
    }

    private void setNumberOfPackets(byte[] bArr, int i3) {
        bArr[1] = (byte) (i3 & 255);
        bArr[2] = (byte) ((i3 >> 8) & 255);
    }

    private void writeImageSize(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i3) throws DeviceDisconnectedException, DfuException, UploadAbortedException {
        this.mReceivedData = null;
        this.mError = 0;
        this.mImageSizeInProgress = true;
        byte[] bArr = new byte[4];
        setImageSize(bArr, i3, 0);
        this.mService.sendLogBroadcast(1, StubApp.getString2(26287) + bluetoothGattCharacteristic.getUuid() + StubApp.getString2(26274) + parse(bArr));
        if (Build.VERSION.SDK_INT >= 33) {
            this.mService.sendLogBroadcast(0, StubApp.getString2(26234) + bluetoothGattCharacteristic.getUuid() + StubApp.getString2(12722) + parse(bArr) + StubApp.getString2(26290));
            this.mGatt.writeCharacteristic(bluetoothGattCharacteristic, bArr, 1);
        } else {
            bluetoothGattCharacteristic.setWriteType(1);
            bluetoothGattCharacteristic.setValue(bArr);
            this.mService.sendLogBroadcast(0, StubApp.getString2(26234) + bluetoothGattCharacteristic.getUuid() + StubApp.getString2(74));
            this.mGatt.writeCharacteristic(bluetoothGattCharacteristic);
        }
        try {
            synchronized (this.mLock) {
                while (true) {
                    try {
                        if (this.mImageSizeInProgress && this.mConnected && this.mError == 0 && !this.mAborted) {
                            this.mLock.wait();
                        }
                        if (!this.mPaused) {
                            break;
                        } else {
                            this.mLock.wait();
                        }
                    } finally {
                    }
                }
            }
        } catch (InterruptedException e10) {
            loge(StubApp.getString2(26291), e10);
        }
        if (this.mAborted) {
            throw new UploadAbortedException();
        }
        if (!this.mConnected) {
            throw new DeviceDisconnectedException(StubApp.getString2(26529), this.mError);
        }
        if (this.mError != 0) {
            throw new DfuException(StubApp.getString2(26528), this.mError);
        }
    }

    private void writeOpCode(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) throws DeviceDisconnectedException, DfuException, UploadAbortedException {
        byte b2 = bArr[0];
        writeOpCode(bluetoothGattCharacteristic, bArr, b2 == 6 || b2 == 5);
    }

    @Override // no.nordicsemi.android.dfu.BaseCustomDfuImpl
    public UUID getControlPointCharacteristicUUID() {
        return DFU_CONTROL_POINT_UUID;
    }

    @Override // no.nordicsemi.android.dfu.BaseDfuImpl
    public UUID getDfuServiceUUID() {
        return DFU_SERVICE_UUID;
    }

    @Override // no.nordicsemi.android.dfu.BaseCustomDfuImpl
    public UUID getPacketCharacteristicUUID() {
        return DFU_PACKET_UUID;
    }

    @Override // no.nordicsemi.android.dfu.DfuService
    public boolean isClientCompatible(Intent intent, BluetoothGatt bluetoothGatt) {
        BluetoothGattCharacteristic characteristic;
        BluetoothGattService service = bluetoothGatt.getService(DFU_SERVICE_UUID);
        if (service != null && (characteristic = service.getCharacteristic(DFU_CONTROL_POINT_UUID)) != null && characteristic.getDescriptor(BaseDfuImpl.CLIENT_CHARACTERISTIC_CONFIG) != null) {
            this.mControlPointCharacteristic = characteristic;
            BluetoothGattCharacteristic characteristic2 = service.getCharacteristic(DFU_PACKET_UUID);
            this.mPacketCharacteristic = characteristic2;
            if (characteristic2 != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x04a8 A[Catch: UnknownResponseException -> 0x027e, UploadAbortedException -> 0x0285, RemoteDfuException -> 0x0478, TRY_LEAVE, TryCatch #0 {UnknownResponseException -> 0x027e, blocks: (B:44:0x027a, B:111:0x02b7, B:115:0x02c0, B:117:0x02c4, B:119:0x02fc, B:121:0x0398, B:50:0x047f, B:52:0x04a8, B:55:0x04b9, B:56:0x0537, B:58:0x0563, B:60:0x0569, B:64:0x0576, B:65:0x0581, B:66:0x0507, B:68:0x0584, B:75:0x0594, B:76:0x05cc, B:78:0x05f3, B:79:0x060a, B:82:0x066e, B:85:0x067a, B:87:0x073e, B:90:0x0779, B:93:0x077e, B:94:0x0789, B:95:0x078a, B:96:0x0795, B:100:0x0797, B:101:0x07a0, B:102:0x0590, B:125:0x03a8, B:126:0x03ad, B:135:0x03b8, B:139:0x03c2, B:141:0x0473, B:146:0x07a1, B:147:0x07a6, B:148:0x07a7, B:149:0x07a8, B:129:0x03b4, B:131:0x03b7, B:103:0x0299, B:106:0x029d, B:107:0x02a0), top: B:35:0x01d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0584 A[Catch: UnknownResponseException -> 0x027e, UploadAbortedException -> 0x0285, RemoteDfuException -> 0x0478, TryCatch #0 {UnknownResponseException -> 0x027e, blocks: (B:44:0x027a, B:111:0x02b7, B:115:0x02c0, B:117:0x02c4, B:119:0x02fc, B:121:0x0398, B:50:0x047f, B:52:0x04a8, B:55:0x04b9, B:56:0x0537, B:58:0x0563, B:60:0x0569, B:64:0x0576, B:65:0x0581, B:66:0x0507, B:68:0x0584, B:75:0x0594, B:76:0x05cc, B:78:0x05f3, B:79:0x060a, B:82:0x066e, B:85:0x067a, B:87:0x073e, B:90:0x0779, B:93:0x077e, B:94:0x0789, B:95:0x078a, B:96:0x0795, B:100:0x0797, B:101:0x07a0, B:102:0x0590, B:125:0x03a8, B:126:0x03ad, B:135:0x03b8, B:139:0x03c2, B:141:0x0473, B:146:0x07a1, B:147:0x07a6, B:148:0x07a7, B:149:0x07a8, B:129:0x03b4, B:131:0x03b7, B:103:0x0299, B:106:0x029d, B:107:0x02a0), top: B:35:0x01d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0594 A[Catch: UnknownResponseException -> 0x027e, UploadAbortedException -> 0x0285, RemoteDfuException -> 0x0478, TryCatch #0 {UnknownResponseException -> 0x027e, blocks: (B:44:0x027a, B:111:0x02b7, B:115:0x02c0, B:117:0x02c4, B:119:0x02fc, B:121:0x0398, B:50:0x047f, B:52:0x04a8, B:55:0x04b9, B:56:0x0537, B:58:0x0563, B:60:0x0569, B:64:0x0576, B:65:0x0581, B:66:0x0507, B:68:0x0584, B:75:0x0594, B:76:0x05cc, B:78:0x05f3, B:79:0x060a, B:82:0x066e, B:85:0x067a, B:87:0x073e, B:90:0x0779, B:93:0x077e, B:94:0x0789, B:95:0x078a, B:96:0x0795, B:100:0x0797, B:101:0x07a0, B:102:0x0590, B:125:0x03a8, B:126:0x03ad, B:135:0x03b8, B:139:0x03c2, B:141:0x0473, B:146:0x07a1, B:147:0x07a6, B:148:0x07a7, B:149:0x07a8, B:129:0x03b4, B:131:0x03b7, B:103:0x0299, B:106:0x029d, B:107:0x02a0), top: B:35:0x01d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x066a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x067a A[Catch: UnknownResponseException -> 0x027e, UploadAbortedException -> 0x0285, RemoteDfuException -> 0x0478, TryCatch #0 {UnknownResponseException -> 0x027e, blocks: (B:44:0x027a, B:111:0x02b7, B:115:0x02c0, B:117:0x02c4, B:119:0x02fc, B:121:0x0398, B:50:0x047f, B:52:0x04a8, B:55:0x04b9, B:56:0x0537, B:58:0x0563, B:60:0x0569, B:64:0x0576, B:65:0x0581, B:66:0x0507, B:68:0x0584, B:75:0x0594, B:76:0x05cc, B:78:0x05f3, B:79:0x060a, B:82:0x066e, B:85:0x067a, B:87:0x073e, B:90:0x0779, B:93:0x077e, B:94:0x0789, B:95:0x078a, B:96:0x0795, B:100:0x0797, B:101:0x07a0, B:102:0x0590, B:125:0x03a8, B:126:0x03ad, B:135:0x03b8, B:139:0x03c2, B:141:0x0473, B:146:0x07a1, B:147:0x07a6, B:148:0x07a7, B:149:0x07a8, B:129:0x03b4, B:131:0x03b7, B:103:0x0299, B:106:0x029d, B:107:0x02a0), top: B:35:0x01d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x078a A[Catch: UnknownResponseException -> 0x027e, UploadAbortedException -> 0x0285, RemoteDfuException -> 0x0478, TryCatch #0 {UnknownResponseException -> 0x027e, blocks: (B:44:0x027a, B:111:0x02b7, B:115:0x02c0, B:117:0x02c4, B:119:0x02fc, B:121:0x0398, B:50:0x047f, B:52:0x04a8, B:55:0x04b9, B:56:0x0537, B:58:0x0563, B:60:0x0569, B:64:0x0576, B:65:0x0581, B:66:0x0507, B:68:0x0584, B:75:0x0594, B:76:0x05cc, B:78:0x05f3, B:79:0x060a, B:82:0x066e, B:85:0x067a, B:87:0x073e, B:90:0x0779, B:93:0x077e, B:94:0x0789, B:95:0x078a, B:96:0x0795, B:100:0x0797, B:101:0x07a0, B:102:0x0590, B:125:0x03a8, B:126:0x03ad, B:135:0x03b8, B:139:0x03c2, B:141:0x0473, B:146:0x07a1, B:147:0x07a6, B:148:0x07a7, B:149:0x07a8, B:129:0x03b4, B:131:0x03b7, B:103:0x0299, B:106:0x029d, B:107:0x02a0), top: B:35:0x01d2 }] */
    /* JADX WARN: Type inference failed for: r0v10, types: [no.nordicsemi.android.dfu.DfuBaseService] */
    /* JADX WARN: Type inference failed for: r0v109, types: [no.nordicsemi.android.dfu.DfuBaseService] */
    /* JADX WARN: Type inference failed for: r0v114, types: [no.nordicsemi.android.dfu.DfuBaseService] */
    /* JADX WARN: Type inference failed for: r11v9, types: [android.bluetooth.BluetoothGatt] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14, types: [android.bluetooth.BluetoothGatt] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v19, types: [no.nordicsemi.android.dfu.DfuBaseService] */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v8, types: [android.bluetooth.BluetoothGatt] */
    /* JADX WARN: Type inference failed for: r36v0, types: [no.nordicsemi.android.dfu.BaseCustomDfuImpl, no.nordicsemi.android.dfu.BaseDfuImpl, no.nordicsemi.android.dfu.LegacyDfuImpl] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [android.content.Intent] */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // no.nordicsemi.android.dfu.DfuService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void performDfu(android.content.Intent r37) throws no.nordicsemi.android.dfu.internal.exception.DfuException, no.nordicsemi.android.dfu.internal.exception.DeviceDisconnectedException, no.nordicsemi.android.dfu.internal.exception.UploadAbortedException {
        /*
            Method dump skipped, instructions count: 2142
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: no.nordicsemi.android.dfu.LegacyDfuImpl.performDfu(android.content.Intent):void");
    }

    @Override // no.nordicsemi.android.dfu.DfuCallback
    public BaseCustomDfuImpl.BaseCustomBluetoothCallback getGattCallback() {
        return this.mBluetoothCallback;
    }

    private void writeImageSize(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i3, int i10, int i11) throws DeviceDisconnectedException, DfuException, UploadAbortedException {
        this.mReceivedData = null;
        this.mError = 0;
        this.mImageSizeInProgress = true;
        byte[] bArr = new byte[12];
        setImageSize(bArr, i3, 0);
        setImageSize(bArr, i10, 4);
        setImageSize(bArr, i11, 8);
        this.mService.sendLogBroadcast(1, StubApp.getString2(26287) + bluetoothGattCharacteristic.getUuid() + StubApp.getString2(26274) + parse(bArr));
        if (Build.VERSION.SDK_INT >= 33) {
            this.mService.sendLogBroadcast(0, StubApp.getString2(26234) + bluetoothGattCharacteristic.getUuid() + StubApp.getString2(12722) + parse(bArr) + StubApp.getString2(26290));
            this.mGatt.writeCharacteristic(bluetoothGattCharacteristic, bArr, 1);
        } else {
            bluetoothGattCharacteristic.setWriteType(1);
            bluetoothGattCharacteristic.setValue(bArr);
            this.mService.sendLogBroadcast(0, StubApp.getString2(26234) + bluetoothGattCharacteristic.getUuid() + StubApp.getString2(74));
            this.mGatt.writeCharacteristic(bluetoothGattCharacteristic);
        }
        try {
            synchronized (this.mLock) {
                while (true) {
                    try {
                        if (this.mImageSizeInProgress && this.mConnected && this.mError == 0 && !this.mAborted) {
                            this.mLock.wait();
                        }
                        if (!this.mPaused) {
                            break;
                        } else {
                            this.mLock.wait();
                        }
                    } finally {
                    }
                }
            }
        } catch (InterruptedException e10) {
            loge(StubApp.getString2(26291), e10);
        }
        if (!this.mAborted) {
            if (this.mConnected) {
                if (this.mError != 0) {
                    throw new DfuException(StubApp.getString2(26530), this.mError);
                }
                return;
            }
            throw new DeviceDisconnectedException(StubApp.getString2(26531), this.mError);
        }
        throw new UploadAbortedException();
    }
}
