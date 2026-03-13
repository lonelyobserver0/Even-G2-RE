package no.nordicsemi.android.dfu;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.util.UUID;
import java.util.zip.CRC32;
import no.nordicsemi.android.dfu.BaseDfuImpl;
import no.nordicsemi.android.dfu.internal.exception.DeviceDisconnectedException;
import no.nordicsemi.android.dfu.internal.exception.DfuException;
import no.nordicsemi.android.dfu.internal.exception.HexFileValidationException;
import no.nordicsemi.android.dfu.internal.exception.UploadAbortedException;
import p0.AbstractC1482f;

@SuppressLint({"MissingPermission"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
abstract class BaseCustomDfuImpl extends BaseDfuImpl {
    boolean mFirmwareUploadInProgress;
    private boolean mInitPacketInProgress;
    int mPacketsBeforeNotification;
    private int mPacketsSentSinceNotification;
    boolean mRemoteErrorOccurred;

    public class BaseCustomBluetoothCallback extends BaseDfuImpl.BaseBluetoothGattCallback {
        public BaseCustomBluetoothCallback() {
            super();
        }

        public void handleNotification(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
            BaseCustomDfuImpl.this.mService.sendLogBroadcast(5, StubApp.getString2(26144) + bluetoothGattCharacteristic.getUuid() + StubApp.getString2(26274) + parse(bArr));
            BaseCustomDfuImpl baseCustomDfuImpl = BaseCustomDfuImpl.this;
            baseCustomDfuImpl.mReceivedData = bArr;
            baseCustomDfuImpl.mFirmwareUploadInProgress = false;
        }

        public void handlePacketReceiptNotification(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
            BaseCustomDfuImpl baseCustomDfuImpl = BaseCustomDfuImpl.this;
            if (!baseCustomDfuImpl.mFirmwareUploadInProgress) {
                handleNotification(bluetoothGatt, bluetoothGattCharacteristic, bArr);
                return;
            }
            BluetoothGattCharacteristic characteristic = bluetoothGatt.getService(baseCustomDfuImpl.getDfuServiceUUID()).getCharacteristic(BaseCustomDfuImpl.this.getPacketCharacteristicUUID());
            try {
                BaseCustomDfuImpl.this.mPacketsSentSinceNotification = 0;
                BaseCustomDfuImpl.this.waitIfPaused();
                BaseCustomDfuImpl baseCustomDfuImpl2 = BaseCustomDfuImpl.this;
                if (!baseCustomDfuImpl2.mAborted && baseCustomDfuImpl2.mError == 0 && !baseCustomDfuImpl2.mRemoteErrorOccurred && !baseCustomDfuImpl2.mResetRequestSent) {
                    boolean isComplete = baseCustomDfuImpl2.mProgressInfo.isComplete();
                    boolean isObjectComplete = BaseCustomDfuImpl.this.mProgressInfo.isObjectComplete();
                    if (!isComplete && !isObjectComplete) {
                        int availableObjectSizeIsBytes = BaseCustomDfuImpl.this.mProgressInfo.getAvailableObjectSizeIsBytes();
                        BaseCustomDfuImpl baseCustomDfuImpl3 = BaseCustomDfuImpl.this;
                        byte[] bArr2 = baseCustomDfuImpl3.mBuffer;
                        if (availableObjectSizeIsBytes < bArr2.length) {
                            bArr2 = new byte[availableObjectSizeIsBytes];
                        }
                        BaseCustomDfuImpl.this.writePacket(bluetoothGatt, characteristic, bArr2, baseCustomDfuImpl3.mFirmwareStream.read(bArr2));
                        return;
                    }
                    BaseCustomDfuImpl baseCustomDfuImpl4 = BaseCustomDfuImpl.this;
                    baseCustomDfuImpl4.mFirmwareUploadInProgress = false;
                    baseCustomDfuImpl4.notifyLock();
                    return;
                }
                baseCustomDfuImpl2.mFirmwareUploadInProgress = false;
                baseCustomDfuImpl2.mService.sendLogBroadcast(15, StubApp.getString2("26277"));
            } catch (HexFileValidationException unused) {
                BaseCustomDfuImpl.this.loge(StubApp.getString2(26279));
                BaseCustomDfuImpl.this.mError = DfuBaseService.ERROR_FILE_INVALID;
            } catch (IOException e10) {
                BaseCustomDfuImpl.this.loge(StubApp.getString2(26278), e10);
                BaseCustomDfuImpl.this.mError = DfuBaseService.ERROR_FILE_IO_EXCEPTION;
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i3) {
            if (i3 == 0) {
                UUID uuid = bluetoothGattCharacteristic.getUuid();
                boolean equals = uuid.equals(BaseCustomDfuImpl.this.getPacketCharacteristicUUID());
                String string2 = StubApp.getString2(26151);
                if (!equals) {
                    BaseCustomDfuImpl.this.mService.sendLogBroadcast(5, string2 + uuid);
                    BaseCustomDfuImpl.this.mRequestCompleted = true;
                } else if (BaseCustomDfuImpl.this.mInitPacketInProgress) {
                    BaseCustomDfuImpl.this.mService.sendLogBroadcast(5, string2 + uuid);
                    BaseCustomDfuImpl.this.mInitPacketInProgress = false;
                } else {
                    BaseCustomDfuImpl baseCustomDfuImpl = BaseCustomDfuImpl.this;
                    if (baseCustomDfuImpl.mFirmwareUploadInProgress) {
                        baseCustomDfuImpl.mPacketsSentSinceNotification++;
                        BaseCustomDfuImpl baseCustomDfuImpl2 = BaseCustomDfuImpl.this;
                        boolean z2 = baseCustomDfuImpl2.mPacketsBeforeNotification > 0 && baseCustomDfuImpl2.mPacketsSentSinceNotification >= BaseCustomDfuImpl.this.mPacketsBeforeNotification;
                        boolean isComplete = BaseCustomDfuImpl.this.mProgressInfo.isComplete();
                        boolean isObjectComplete = BaseCustomDfuImpl.this.mProgressInfo.isObjectComplete();
                        if (z2) {
                            return;
                        }
                        if (isComplete || isObjectComplete) {
                            BaseCustomDfuImpl baseCustomDfuImpl3 = BaseCustomDfuImpl.this;
                            baseCustomDfuImpl3.mFirmwareUploadInProgress = false;
                            baseCustomDfuImpl3.notifyLock();
                            return;
                        }
                        try {
                            BaseCustomDfuImpl.this.waitIfPaused();
                            BaseCustomDfuImpl baseCustomDfuImpl4 = BaseCustomDfuImpl.this;
                            if (!baseCustomDfuImpl4.mAborted && baseCustomDfuImpl4.mError == 0 && !baseCustomDfuImpl4.mRemoteErrorOccurred && !baseCustomDfuImpl4.mResetRequestSent) {
                                int availableObjectSizeIsBytes = baseCustomDfuImpl4.mProgressInfo.getAvailableObjectSizeIsBytes();
                                BaseCustomDfuImpl baseCustomDfuImpl5 = BaseCustomDfuImpl.this;
                                byte[] bArr = baseCustomDfuImpl5.mBuffer;
                                if (availableObjectSizeIsBytes < bArr.length) {
                                    bArr = new byte[availableObjectSizeIsBytes];
                                }
                                BaseCustomDfuImpl.this.writePacket(bluetoothGatt, bluetoothGattCharacteristic, bArr, baseCustomDfuImpl5.mFirmwareStream.read(bArr));
                                return;
                            }
                            baseCustomDfuImpl4.mFirmwareUploadInProgress = false;
                            baseCustomDfuImpl4.mService.sendLogBroadcast(15, StubApp.getString2("26277"));
                            BaseCustomDfuImpl.this.notifyLock();
                            return;
                        } catch (HexFileValidationException unused) {
                            BaseCustomDfuImpl.this.loge(StubApp.getString2(26279));
                            BaseCustomDfuImpl.this.mError = DfuBaseService.ERROR_FILE_INVALID;
                        } catch (IOException e10) {
                            BaseCustomDfuImpl.this.loge(StubApp.getString2(26278), e10);
                            BaseCustomDfuImpl.this.mError = DfuBaseService.ERROR_FILE_IO_EXCEPTION;
                        }
                    } else {
                        baseCustomDfuImpl.mService.sendLogBroadcast(5, string2 + uuid);
                        onPacketCharacteristicWrite();
                    }
                }
            } else {
                BaseCustomDfuImpl baseCustomDfuImpl6 = BaseCustomDfuImpl.this;
                if (baseCustomDfuImpl6.mResetRequestSent) {
                    baseCustomDfuImpl6.mRequestCompleted = true;
                } else {
                    baseCustomDfuImpl6.loge(u.p(i3, StubApp.getString2(26280)));
                    BaseCustomDfuImpl.this.mError = i3 | 16384;
                }
            }
            BaseCustomDfuImpl.this.notifyLock();
        }

        public void onPacketCharacteristicWrite() {
        }
    }

    public BaseCustomDfuImpl(Intent intent, DfuBaseService dfuBaseService) {
        super(intent, dfuBaseService);
        String string2 = StubApp.getString2(26281);
        int i3 = 12;
        if (intent.hasExtra(string2)) {
            boolean booleanExtra = intent.getBooleanExtra(string2, false);
            int intExtra = intent.getIntExtra(StubApp.getString2(26282), 12);
            if (intExtra >= 0 && intExtra <= 65535) {
                i3 = intExtra;
            }
            this.mPacketsBeforeNotification = booleanExtra ? i3 : 0;
            return;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(dfuBaseService);
        boolean z2 = defaultSharedPreferences.getBoolean(StubApp.getString2(26283), false);
        try {
            int parseInt = Integer.parseInt(defaultSharedPreferences.getString(StubApp.getString2(26284), String.valueOf(12)));
            if (parseInt >= 0 && parseInt <= 65535) {
                i3 = parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        this.mPacketsBeforeNotification = z2 ? i3 : 0;
    }

    private void writeInitPacket(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i3) throws DeviceDisconnectedException, DfuException, UploadAbortedException {
        if (this.mAborted) {
            throw new UploadAbortedException();
        }
        if (bArr.length != i3) {
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, 0, bArr2, 0, i3);
            bArr = bArr2;
        }
        this.mReceivedData = null;
        this.mError = 0;
        this.mInitPacketInProgress = true;
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(26285));
        sb2.append(bArr.length);
        sb2.append(StubApp.getString2(26286));
        logi(AbstractC1482f.k(sb2, parse(bArr), StubApp.getString2(74)));
        this.mService.sendLogBroadcast(1, StubApp.getString2(26287) + bluetoothGattCharacteristic.getUuid() + StubApp.getString2(26288) + parse(bArr));
        if (Build.VERSION.SDK_INT >= 33) {
            this.mService.sendLogBroadcast(0, StubApp.getString2(26234) + bluetoothGattCharacteristic.getUuid() + StubApp.getString2(26289) + parse(bArr) + StubApp.getString2(26290));
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
                        if (this.mInitPacketInProgress && this.mConnected && this.mError == 0) {
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
        if (!this.mConnected) {
            throw new DeviceDisconnectedException(StubApp.getString2(26293), this.mError);
        }
        if (this.mError != 0) {
            throw new DfuException(StubApp.getString2(26292), this.mError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void writePacket(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i3) {
        if (i3 <= 0) {
            return;
        }
        if (bArr.length != i3) {
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, 0, bArr2, 0, i3);
            bArr = bArr2;
        }
        this.mProgressInfo.addBytesSent(i3);
        if (Build.VERSION.SDK_INT >= 33) {
            bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic, bArr, 1);
            return;
        }
        bluetoothGattCharacteristic.setWriteType(1);
        bluetoothGattCharacteristic.setValue(bArr);
        bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic);
    }

    public void finalize(Intent intent, boolean z2) {
        boolean booleanExtra = intent.getBooleanExtra(StubApp.getString2(26275), false);
        this.mService.refreshDeviceCache(this.mGatt, z2 || !booleanExtra);
        this.mService.close(this.mGatt);
        if (this.mGatt.getDevice().getBondState() == 12) {
            boolean booleanExtra2 = intent.getBooleanExtra(StubApp.getString2(26294), false);
            if (booleanExtra2 || !booleanExtra) {
                removeBond();
                this.mService.waitFor(2000L);
            }
            if (booleanExtra2 && (this.mFileType & 4) > 0 && !createBond()) {
                logw(StubApp.getString2(26295));
            }
        }
        if (this.mProgressInfo.isLastPart()) {
            this.mProgressInfo.setProgress(-6);
            return;
        }
        logi(StubApp.getString2(26296));
        Intent intent2 = new Intent();
        intent2.fillIn(intent, 24);
        intent2.putExtra(StubApp.getString2(26297), StubApp.getString2(20996));
        intent2.putExtra(StubApp.getString2(26298), 4);
        intent2.putExtra(StubApp.getString2(26299), this.mProgressInfo.getCurrentPart() + 1);
        intent2.putExtra(StubApp.getString2(26300), this.mProgressInfo.getTotalParts());
        restartService(intent2, true, getDfuServiceUUID());
    }

    public abstract UUID getControlPointCharacteristicUUID();

    public abstract UUID getPacketCharacteristicUUID();

    public void uploadFirmwareImage(BluetoothGattCharacteristic bluetoothGattCharacteristic) throws DeviceDisconnectedException, DfuException, UploadAbortedException {
        String string2 = StubApp.getString2(26301);
        if (this.mAborted) {
            throw new UploadAbortedException();
        }
        this.mReceivedData = null;
        this.mError = 0;
        this.mFirmwareUploadInProgress = true;
        this.mPacketsSentSinceNotification = 0;
        try {
            int availableObjectSizeIsBytes = this.mProgressInfo.getAvailableObjectSizeIsBytes();
            byte[] bArr = this.mBuffer;
            if (availableObjectSizeIsBytes < bArr.length) {
                bArr = new byte[availableObjectSizeIsBytes];
            }
            int read = this.mFirmwareStream.read(bArr);
            this.mService.sendLogBroadcast(1, string2 + bluetoothGattCharacteristic.getUuid() + StubApp.getString2("10450"));
            writePacket(this.mGatt, bluetoothGattCharacteristic, bArr, read);
            try {
                synchronized (this.mLock) {
                    while (true) {
                        try {
                            if (this.mFirmwareUploadInProgress && this.mReceivedData == null && this.mConnected && this.mError == 0) {
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
            if (!this.mConnected) {
                throw new DeviceDisconnectedException(StubApp.getString2(26303), this.mError);
            }
            if (this.mError != 0) {
                throw new DfuException(StubApp.getString2(26302), this.mError);
            }
        } catch (HexFileValidationException unused) {
            throw new DfuException(StubApp.getString2(26305), DfuBaseService.ERROR_FILE_INVALID);
        } catch (IOException unused2) {
            throw new DfuException(StubApp.getString2(26304), DfuBaseService.ERROR_FILE_IO_EXCEPTION);
        }
    }

    public void writeInitData(BluetoothGattCharacteristic bluetoothGattCharacteristic, CRC32 crc32) throws DfuException, DeviceDisconnectedException, UploadAbortedException {
        try {
            byte[] bArr = this.mBuffer;
            while (true) {
                int read = this.mInitPacketStream.read(bArr, 0, bArr.length);
                if (read == -1) {
                    return;
                }
                writeInitPacket(bluetoothGattCharacteristic, bArr, read);
                if (crc32 != null) {
                    crc32.update(bArr, 0, read);
                }
            }
        } catch (IOException e10) {
            String string2 = StubApp.getString2(26306);
            loge(string2, e10);
            throw new DfuException(string2, DfuBaseService.ERROR_FILE_ERROR);
        }
    }
}
