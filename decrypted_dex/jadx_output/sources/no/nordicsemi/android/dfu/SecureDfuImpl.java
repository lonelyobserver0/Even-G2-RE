package no.nordicsemi.android.dfu;

import Xa.h;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Intent;
import android.os.SystemClock;
import com.stub.StubApp;
import f5.u0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.UUID;
import kotlin.UByte;
import no.nordicsemi.android.dfu.BaseCustomDfuImpl;
import no.nordicsemi.android.dfu.BaseDfuImpl;
import no.nordicsemi.android.dfu.internal.ArchiveInputStream;
import no.nordicsemi.android.dfu.internal.exception.DeviceDisconnectedException;
import no.nordicsemi.android.dfu.internal.exception.DfuException;
import no.nordicsemi.android.dfu.internal.exception.RemoteDfuException;
import no.nordicsemi.android.dfu.internal.exception.RemoteDfuExtendedErrorException;
import no.nordicsemi.android.dfu.internal.exception.UnknownResponseException;
import no.nordicsemi.android.dfu.internal.exception.UploadAbortedException;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class SecureDfuImpl extends BaseCustomDfuImpl {
    static final UUID DEFAULT_DFU_CONTROL_POINT_UUID;
    static final UUID DEFAULT_DFU_PACKET_UUID;
    static final UUID DEFAULT_DFU_SERVICE_UUID;
    static UUID DFU_CONTROL_POINT_UUID = null;
    static UUID DFU_PACKET_UUID = null;
    static UUID DFU_SERVICE_UUID = null;
    private static final int DFU_STATUS_SUCCESS = 1;
    private static final int MAX_ATTEMPTS = 3;
    private static final int OBJECT_COMMAND = 1;
    private static final int OBJECT_DATA = 2;
    private static final byte[] OP_CODE_CALCULATE_CHECKSUM;
    private static final int OP_CODE_CALCULATE_CHECKSUM_KEY = 3;
    private static final byte[] OP_CODE_CREATE_COMMAND;
    private static final byte[] OP_CODE_CREATE_DATA;
    private static final int OP_CODE_CREATE_KEY = 1;
    private static final byte[] OP_CODE_EXECUTE;
    private static final int OP_CODE_EXECUTE_KEY = 4;
    private static final byte[] OP_CODE_PACKET_RECEIPT_NOTIF_REQ;
    private static final int OP_CODE_PACKET_RECEIPT_NOTIF_REQ_KEY = 2;
    private static final int OP_CODE_RESPONSE_CODE_KEY = 96;
    private static final byte[] OP_CODE_SELECT_OBJECT;
    private static final int OP_CODE_SELECT_OBJECT_KEY = 6;
    private final SecureBluetoothCallback mBluetoothCallback;
    private BluetoothGattCharacteristic mControlPointCharacteristic;
    private BluetoothGattCharacteristic mPacketCharacteristic;
    private long prepareObjectDelay;

    public static class ObjectChecksum {
        int CRC32;
        int offset;

        public /* synthetic */ ObjectChecksum(int i3) {
            this();
        }

        private ObjectChecksum() {
        }
    }

    public static class ObjectInfo extends ObjectChecksum {
        int maxSize;

        public /* synthetic */ ObjectInfo(int i3) {
            this();
        }

        private ObjectInfo() {
            super(0);
        }
    }

    public class SecureBluetoothCallback extends BaseCustomDfuImpl.BaseCustomBluetoothCallback {
        public SecureBluetoothCallback() {
            super();
        }

        @Override // no.nordicsemi.android.dfu.BaseDfuImpl.BaseBluetoothGattCallback, android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
            if (bArr.length < 3) {
                SecureDfuImpl.this.loge(StubApp.getString2(26584) + parse(bArr));
                SecureDfuImpl secureDfuImpl = SecureDfuImpl.this;
                secureDfuImpl.mError = DfuBaseService.ERROR_INVALID_RESPONSE;
                secureDfuImpl.notifyLock();
                return;
            }
            if ((bArr[0] & UByte.MAX_VALUE) != SecureDfuImpl.OP_CODE_RESPONSE_CODE_KEY) {
                SecureDfuImpl.this.loge(StubApp.getString2(26585) + parse(bArr));
                SecureDfuImpl.this.mError = DfuBaseService.ERROR_INVALID_RESPONSE;
            } else if ((bArr[1] & UByte.MAX_VALUE) != 3) {
                SecureDfuImpl secureDfuImpl2 = SecureDfuImpl.this;
                if (!secureDfuImpl2.mRemoteErrorOccurred) {
                    if ((bArr[2] & UByte.MAX_VALUE) != 1) {
                        secureDfuImpl2.mRemoteErrorOccurred = true;
                    }
                    handleNotification(bluetoothGatt, bluetoothGattCharacteristic, bArr);
                }
            } else {
                int intValue = bluetoothGattCharacteristic.getIntValue(20, 3).intValue();
                if (((int) (((ArchiveInputStream) SecureDfuImpl.this.mFirmwareStream).getCrc32() & BodyPartID.bodyIdMax)) == bluetoothGattCharacteristic.getIntValue(20, 7).intValue()) {
                    SecureDfuImpl.this.mProgressInfo.setBytesReceived(intValue);
                } else {
                    SecureDfuImpl secureDfuImpl3 = SecureDfuImpl.this;
                    if (secureDfuImpl3.mFirmwareUploadInProgress) {
                        secureDfuImpl3.mFirmwareUploadInProgress = false;
                        secureDfuImpl3.notifyLock();
                        return;
                    }
                }
                handlePacketReceiptNotification(bluetoothGatt, bluetoothGattCharacteristic, bArr);
            }
            SecureDfuImpl.this.notifyLock();
        }
    }

    static {
        UUID uuid = new UUID(279658205548544L, -9223371485494954757L);
        DEFAULT_DFU_SERVICE_UUID = uuid;
        UUID uuid2 = new UUID(-8157989241631715488L, -6937650605005804976L);
        DEFAULT_DFU_CONTROL_POINT_UUID = uuid2;
        UUID uuid3 = new UUID(-8157989237336748192L, -6937650605005804976L);
        DEFAULT_DFU_PACKET_UUID = uuid3;
        DFU_SERVICE_UUID = uuid;
        DFU_CONTROL_POINT_UUID = uuid2;
        DFU_PACKET_UUID = uuid3;
        OP_CODE_CREATE_COMMAND = new byte[]{1, 1, 0, 0, 0, 0};
        OP_CODE_CREATE_DATA = new byte[]{1, 2, 0, 0, 0, 0};
        OP_CODE_PACKET_RECEIPT_NOTIF_REQ = new byte[]{2, 0, 0};
        OP_CODE_CALCULATE_CHECKSUM = new byte[]{3};
        OP_CODE_EXECUTE = new byte[]{4};
        OP_CODE_SELECT_OBJECT = new byte[]{6, 0};
    }

    public SecureDfuImpl(Intent intent, DfuBaseService dfuBaseService) {
        super(intent, dfuBaseService);
        this.mBluetoothCallback = new SecureBluetoothCallback();
    }

    private int getStatusCode(byte[] bArr, int i3) throws UnknownResponseException {
        byte b2;
        if (bArr != null && bArr.length >= 3 && bArr[0] == OP_CODE_RESPONSE_CODE_KEY && bArr[1] == i3 && ((b2 = bArr[2]) == 1 || b2 == 2 || b2 == 3 || b2 == 4 || b2 == 5 || b2 == 7 || b2 == 8 || b2 == 10 || b2 == 11)) {
            return b2;
        }
        throw new UnknownResponseException(StubApp.getString2(26371), bArr, OP_CODE_RESPONSE_CODE_KEY, i3);
    }

    private ObjectChecksum readChecksum() throws DeviceDisconnectedException, DfuException, UploadAbortedException, RemoteDfuException, UnknownResponseException {
        if (!this.mConnected) {
            throw new DeviceDisconnectedException(StubApp.getString2(26587), this.mError);
        }
        writeOpCode(this.mControlPointCharacteristic, OP_CODE_CALCULATE_CHECKSUM);
        byte[] readNotificationResponse = readNotificationResponse();
        int statusCode = getStatusCode(readNotificationResponse, 3);
        String string2 = StubApp.getString2(26586);
        if (statusCode == 11) {
            throw new RemoteDfuExtendedErrorException(string2, readNotificationResponse[3]);
        }
        if (statusCode != 1) {
            throw new RemoteDfuException(string2, statusCode);
        }
        ObjectChecksum objectChecksum = new ObjectChecksum(0);
        objectChecksum.offset = unsignedBytesToInt(readNotificationResponse, 3);
        objectChecksum.CRC32 = unsignedBytesToInt(readNotificationResponse, 7);
        return objectChecksum;
    }

    private ObjectInfo selectObject(int i3) throws DeviceDisconnectedException, DfuException, UploadAbortedException, RemoteDfuException, UnknownResponseException {
        if (!this.mConnected) {
            throw new DeviceDisconnectedException(StubApp.getString2(26589), this.mError);
        }
        byte[] bArr = OP_CODE_SELECT_OBJECT;
        bArr[1] = (byte) i3;
        writeOpCode(this.mControlPointCharacteristic, bArr);
        byte[] readNotificationResponse = readNotificationResponse();
        int statusCode = getStatusCode(readNotificationResponse, 6);
        String string2 = StubApp.getString2(26588);
        if (statusCode == 11) {
            throw new RemoteDfuExtendedErrorException(string2, readNotificationResponse[3]);
        }
        if (statusCode != 1) {
            throw new RemoteDfuException(string2, statusCode);
        }
        ObjectInfo objectInfo = new ObjectInfo(0);
        objectInfo.maxSize = unsignedBytesToInt(readNotificationResponse, 3);
        objectInfo.offset = unsignedBytesToInt(readNotificationResponse, 7);
        objectInfo.CRC32 = unsignedBytesToInt(readNotificationResponse, 11);
        return objectInfo;
    }

    private void sendFirmware(BluetoothGatt bluetoothGatt) throws RemoteDfuException, DeviceDisconnectedException, DfuException, UploadAbortedException, UnknownResponseException {
        int i3;
        String str;
        boolean z2;
        long j;
        long j3;
        String string2 = StubApp.getString2(10450);
        String string22 = StubApp.getString2(26590);
        String string23 = StubApp.getString2(26591);
        String string24 = StubApp.getString2(26592);
        int i10 = this.mPacketsBeforeNotification;
        String string25 = StubApp.getString2(74);
        if (i10 > 0) {
            setPacketReceiptNotifications(i10);
            this.mService.sendLogBroadcast(10, StubApp.getString2(26593) + i10 + string25);
        }
        logi(StubApp.getString2(26594));
        ObjectInfo selectObject = selectObject(2);
        Locale locale = Locale.US;
        Object[] objArr = {Integer.valueOf(selectObject.maxSize), Integer.valueOf(selectObject.offset), Integer.valueOf(selectObject.CRC32)};
        String string26 = StubApp.getString2(26595);
        logi(String.format(locale, string26, objArr));
        this.mService.sendLogBroadcast(10, String.format(locale, string26, Integer.valueOf(selectObject.maxSize), Integer.valueOf(selectObject.offset), Integer.valueOf(selectObject.CRC32)));
        this.mProgressInfo.setMaxObjectSizeInBytes(selectObject.maxSize);
        int i11 = this.mImageSizeInBytes;
        int i12 = selectObject.maxSize;
        int v2 = AbstractC1482f.v(i11, i12, 1, i12);
        int i13 = selectObject.offset;
        String string27 = StubApp.getString2(26596);
        String string28 = StubApp.getString2(26597);
        String string29 = StubApp.getString2(26598);
        if (i13 > 0) {
            try {
                i3 = i13 / i12;
                int i14 = i12 * i3;
                int i15 = i13 - i14;
                if (i15 == 0) {
                    i14 -= i12;
                } else {
                    i12 = i15;
                }
                int i16 = i14;
                if (i16 > 0) {
                    this.mFirmwareStream.read(new byte[i16]);
                    this.mFirmwareStream.mark(selectObject.maxSize);
                }
                this.mFirmwareStream.read(new byte[i12]);
                str = string25;
                if (((int) (((ArchiveInputStream) this.mFirmwareStream).getCrc32() & BodyPartID.bodyIdMax)) == selectObject.CRC32) {
                    logi(selectObject.offset + string23);
                    this.mService.sendLogBroadcast(10, selectObject.offset + string23);
                    this.mProgressInfo.setBytesSent(selectObject.offset);
                    this.mProgressInfo.setBytesReceived(selectObject.offset);
                    if (i12 != selectObject.maxSize || selectObject.offset >= this.mImageSizeInBytes) {
                        z2 = true;
                    } else {
                        logi(string29);
                        try {
                            writeExecute();
                            this.mService.sendLogBroadcast(10, string28);
                        } catch (RemoteDfuException e10) {
                            if (e10.getErrorNumber() != 8) {
                                throw e10;
                            }
                            this.mService.sendLogBroadcast(10, StubApp.getString2("26599"));
                            this.mRemoteErrorOccurred = false;
                        }
                    }
                } else {
                    logi(selectObject.offset + string22);
                    this.mService.sendLogBroadcast(15, selectObject.offset + string22);
                    this.mProgressInfo.setBytesSent(i16);
                    this.mProgressInfo.setBytesReceived(i16);
                    selectObject.offset = selectObject.offset - i12;
                    selectObject.CRC32 = 0;
                    this.mFirmwareStream.reset();
                    logi(string24 + selectObject.offset + string2);
                    this.mService.sendLogBroadcast(10, string24 + selectObject.offset + string2);
                }
                z2 = false;
            } catch (IOException e11) {
                loge(string27, e11);
                this.mService.terminateConnection(bluetoothGatt, DfuBaseService.ERROR_FILE_IO_EXCEPTION);
                return;
            }
        } else {
            str = string25;
            this.mProgressInfo.setBytesSent(0);
            z2 = false;
            i3 = 0;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (selectObject.offset < this.mImageSizeInBytes) {
            int i17 = 1;
            while (this.mProgressInfo.getAvailableObjectSizeIsBytes() > 0) {
                String string210 = StubApp.getString2(26573);
                if (z2) {
                    j3 = elapsedRealtime;
                    this.mService.sendLogBroadcast(10, StubApp.getString2(26604));
                    z2 = false;
                } else {
                    int availableObjectSizeIsBytes = this.mProgressInfo.getAvailableObjectSizeIsBytes();
                    StringBuilder u2 = h.u(availableObjectSizeIsBytes, StubApp.getString2(26600), StubApp.getString2(26601));
                    int i18 = i3 + 1;
                    u2.append(i18);
                    boolean z10 = z2;
                    String string211 = StubApp.getString2(601);
                    u2.append(string211);
                    u2.append(v2);
                    u2.append(str);
                    logi(u2.toString());
                    writeCreateRequest(2, availableObjectSizeIsBytes);
                    j3 = elapsedRealtime;
                    this.mService.sendLogBroadcast(10, AbstractC1482f.e(i18, StubApp.getString2(26602), v2, string211, StubApp.getString2(26603)));
                    long j10 = this.prepareObjectDelay;
                    if (j10 > 0 || v2 == 0) {
                        DfuBaseService dfuBaseService = this.mService;
                        if (j10 <= 0) {
                            j10 = 400;
                        }
                        dfuBaseService.waitFor(j10);
                    }
                    this.mService.sendLogBroadcast(10, string210);
                    z2 = z10;
                }
                try {
                    logi(string210);
                    uploadFirmwareImage(this.mPacketCharacteristic);
                    logi("Sending Calculate Checksum command (Op Code = 3)");
                    ObjectChecksum readChecksum = readChecksum();
                    Locale locale2 = Locale.US;
                    Object[] objArr2 = {Integer.valueOf(readChecksum.offset), Integer.valueOf(readChecksum.CRC32)};
                    String string212 = StubApp.getString2(26605);
                    logi(String.format(locale2, string212, objArr2));
                    this.mService.sendLogBroadcast(10, String.format(locale2, string212, Integer.valueOf(readChecksum.offset), Integer.valueOf(readChecksum.CRC32)));
                    int bytesSent = this.mProgressInfo.getBytesSent() - readChecksum.offset;
                    if (bytesSent > 0) {
                        logw(bytesSent + StubApp.getString2(26606));
                        this.mService.sendLogBroadcast(15, bytesSent + StubApp.getString2(26607));
                        try {
                            this.mFirmwareStream.reset();
                            this.mFirmwareStream.read(new byte[selectObject.maxSize - bytesSent]);
                            this.mProgressInfo.setBytesSent(readChecksum.offset);
                            int i19 = this.mPacketsBeforeNotification;
                            if (i19 == 0 || i19 > 1) {
                                this.mPacketsBeforeNotification = 1;
                                setPacketReceiptNotifications(1);
                                this.mService.sendLogBroadcast(10, StubApp.getString2(26608));
                            }
                        } catch (IOException e12) {
                            loge(string27, e12);
                            this.mService.terminateConnection(bluetoothGatt, DfuBaseService.ERROR_FILE_IO_EXCEPTION);
                            return;
                        } catch (Throwable th) {
                            loge(StubApp.getString2(26609) + this.mProgressInfo.getBytesSent(), th);
                            this.mService.terminateConnection(bluetoothGatt, DfuBaseService.ERROR_PROGRESS_LOST);
                            return;
                        }
                    }
                    int crc32 = (int) (((ArchiveInputStream) this.mFirmwareStream).getCrc32() & BodyPartID.bodyIdMax);
                    if (crc32 != readChecksum.CRC32) {
                        String format = String.format(locale2, StubApp.getString2(26610), Integer.valueOf(crc32), Integer.valueOf(readChecksum.CRC32));
                        if (i17 >= 3) {
                            loge(format);
                            this.mService.sendLogBroadcast(20, format);
                            this.mService.terminateConnection(bluetoothGatt, DfuBaseService.ERROR_CRC_ERROR);
                            return;
                        }
                        i17++;
                        String concat = format.concat(StubApp.getString2(26611) + i17 + StubApp.getString2(26612));
                        logi(concat);
                        this.mService.sendLogBroadcast(15, concat);
                        try {
                            this.mFirmwareStream.reset();
                            this.mProgressInfo.setBytesSent(((ArchiveInputStream) this.mFirmwareStream).getBytesRead());
                        } catch (IOException e13) {
                            loge(StubApp.getString2(26613), e13);
                            this.mService.terminateConnection(bluetoothGatt, DfuBaseService.ERROR_FILE_IO_EXCEPTION);
                            return;
                        }
                    } else if (bytesSent > 0) {
                        elapsedRealtime = j3;
                        z2 = true;
                    } else {
                        logi(string29);
                        writeExecute(this.mProgressInfo.isComplete());
                        this.mService.sendLogBroadcast(10, string28);
                        i3++;
                        this.mFirmwareStream.mark(0);
                        i17 = 1;
                    }
                    elapsedRealtime = j3;
                } catch (DeviceDisconnectedException e14) {
                    loge(StubApp.getString2(26583));
                    throw e14;
                }
            }
            j = elapsedRealtime;
        } else {
            j = elapsedRealtime;
            logi(string29);
            writeExecute(true);
            this.mService.sendLogBroadcast(10, string28);
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(26537));
        sb2.append(this.mProgressInfo.getBytesSent() - selectObject.offset);
        sb2.append(StubApp.getString2(26576));
        long j11 = elapsedRealtime2 - j;
        String string213 = StubApp.getString2(559);
        logi(h.q(sb2, j11, string213));
        this.mService.sendLogBroadcast(10, StubApp.getString2(26536) + j11 + string213);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void sendInitPacket(android.bluetooth.BluetoothGatt r19, boolean r20) throws no.nordicsemi.android.dfu.internal.exception.RemoteDfuException, no.nordicsemi.android.dfu.internal.exception.DeviceDisconnectedException, no.nordicsemi.android.dfu.internal.exception.DfuException, no.nordicsemi.android.dfu.internal.exception.UploadAbortedException, no.nordicsemi.android.dfu.internal.exception.UnknownResponseException {
        /*
            Method dump skipped, instructions count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: no.nordicsemi.android.dfu.SecureDfuImpl.sendInitPacket(android.bluetooth.BluetoothGatt, boolean):void");
    }

    private void setNumberOfPackets(byte[] bArr, int i3) {
        bArr[1] = (byte) (i3 & 255);
        bArr[2] = (byte) ((i3 >> 8) & 255);
    }

    private void setObjectSize(byte[] bArr, int i3) {
        bArr[2] = (byte) (i3 & 255);
        bArr[3] = (byte) ((i3 >> 8) & 255);
        bArr[4] = (byte) ((i3 >> 16) & 255);
        bArr[5] = (byte) ((i3 >> 24) & 255);
    }

    private void setPacketReceiptNotifications(int i3) throws DfuException, DeviceDisconnectedException, UploadAbortedException, UnknownResponseException, RemoteDfuException {
        if (!this.mConnected) {
            throw new DeviceDisconnectedException(StubApp.getString2(26587), this.mError);
        }
        logi(h.g(i3, StubApp.getString2(26636), StubApp.getString2(74)));
        byte[] bArr = OP_CODE_PACKET_RECEIPT_NOTIF_REQ;
        setNumberOfPackets(bArr, i3);
        writeOpCode(this.mControlPointCharacteristic, bArr);
        byte[] readNotificationResponse = readNotificationResponse();
        int statusCode = getStatusCode(readNotificationResponse, 2);
        String string2 = StubApp.getString2(26637);
        if (statusCode == 11) {
            throw new RemoteDfuExtendedErrorException(string2, readNotificationResponse[3]);
        }
        if (statusCode != 1) {
            throw new RemoteDfuException(string2, statusCode);
        }
    }

    private int unsignedBytesToInt(byte[] bArr, int i3) {
        return (bArr[i3] & UByte.MAX_VALUE) + ((bArr[i3 + 1] & UByte.MAX_VALUE) << 8) + ((bArr[i3 + 2] & UByte.MAX_VALUE) << 16) + ((bArr[i3 + 3] & UByte.MAX_VALUE) << 24);
    }

    private void writeCreateRequest(int i3, int i10) throws DeviceDisconnectedException, DfuException, UploadAbortedException, RemoteDfuException, UnknownResponseException {
        if (!this.mConnected) {
            throw new DeviceDisconnectedException(StubApp.getString2(26639), this.mError);
        }
        byte[] bArr = i3 == 1 ? OP_CODE_CREATE_COMMAND : OP_CODE_CREATE_DATA;
        setObjectSize(bArr, i10);
        writeOpCode(this.mControlPointCharacteristic, bArr);
        byte[] readNotificationResponse = readNotificationResponse();
        int statusCode = getStatusCode(readNotificationResponse, 1);
        String string2 = StubApp.getString2(26638);
        if (statusCode == 11) {
            throw new RemoteDfuExtendedErrorException(string2, readNotificationResponse[3]);
        }
        if (statusCode != 1) {
            throw new RemoteDfuException(string2, statusCode);
        }
    }

    private void writeExecute() throws DfuException, DeviceDisconnectedException, UploadAbortedException, UnknownResponseException, RemoteDfuException {
        if (!this.mConnected) {
            throw new DeviceDisconnectedException(StubApp.getString2(26641), this.mError);
        }
        writeOpCode(this.mControlPointCharacteristic, OP_CODE_EXECUTE);
        byte[] readNotificationResponse = readNotificationResponse();
        int statusCode = getStatusCode(readNotificationResponse, 4);
        String string2 = StubApp.getString2(26640);
        if (statusCode == 11) {
            throw new RemoteDfuExtendedErrorException(string2, readNotificationResponse[3]);
        }
        if (statusCode != 1) {
            throw new RemoteDfuException(string2, statusCode);
        }
    }

    private void writeOpCode(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) throws DeviceDisconnectedException, DfuException, UploadAbortedException {
        writeOpCode(bluetoothGattCharacteristic, bArr, false);
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

    @Override // no.nordicsemi.android.dfu.BaseDfuImpl, no.nordicsemi.android.dfu.DfuService
    public boolean initialize(Intent intent, BluetoothGatt bluetoothGatt, int i3, InputStream inputStream, InputStream inputStream2) throws DfuException, DeviceDisconnectedException, UploadAbortedException {
        if (inputStream2 != null) {
            return super.initialize(intent, bluetoothGatt, i3, inputStream, inputStream2);
        }
        this.mService.sendLogBroadcast(20, StubApp.getString2(26551));
        this.mService.terminateConnection(bluetoothGatt, DfuBaseService.ERROR_INIT_PACKET_REQUIRED);
        return false;
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

    /* JADX WARN: Code restructure failed: missing block: B:13:0x009f, code lost:
    
        logi(com.stub.StubApp.getString2("26646"));
     */
    @Override // no.nordicsemi.android.dfu.DfuService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void performDfu(android.content.Intent r8) throws no.nordicsemi.android.dfu.internal.exception.DfuException, no.nordicsemi.android.dfu.internal.exception.DeviceDisconnectedException, no.nordicsemi.android.dfu.internal.exception.UploadAbortedException {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: no.nordicsemi.android.dfu.SecureDfuImpl.performDfu(android.content.Intent):void");
    }

    @Override // no.nordicsemi.android.dfu.DfuCallback
    public BaseDfuImpl.BaseBluetoothGattCallback getGattCallback() {
        return this.mBluetoothCallback;
    }

    private void writeExecute(boolean z2) throws DfuException, DeviceDisconnectedException, UploadAbortedException, UnknownResponseException, RemoteDfuException {
        try {
            writeExecute();
        } catch (RemoteDfuException e10) {
            if (z2 && e10.getErrorNumber() == 5) {
                logw(e10.getMessage() + StubApp.getString2(994) + u0.u(517));
                if (this.mFileType == 1) {
                    logw(StubApp.getString2(26642));
                }
                DfuBaseService dfuBaseService = this.mService;
                Locale locale = Locale.US;
                dfuBaseService.sendLogBroadcast(15, StubApp.getString2(26384) + u0.u(517) + StubApp.getString2(26643));
                logi(StubApp.getString2(26644));
                logi(StubApp.getString2(26598));
                writeExecute();
                return;
            }
            throw e10;
        }
    }
}
