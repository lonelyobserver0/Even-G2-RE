package no.nordicsemi.android.dfu;

import Xa.h;
import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.mapbox.common.b;
import com.stub.StubApp;
import i2.u;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.UUID;
import kotlin.UByte;
import no.nordicsemi.android.dfu.DfuCallback;
import no.nordicsemi.android.dfu.internal.exception.DeviceDisconnectedException;
import no.nordicsemi.android.dfu.internal.exception.DfuException;
import no.nordicsemi.android.dfu.internal.exception.UploadAbortedException;
import no.nordicsemi.android.dfu.internal.scanner.BootloaderScannerFactory;
import p0.AbstractC1482f;

@SuppressLint({"MissingPermission"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
abstract class BaseDfuImpl implements DfuService {
    static final int INDICATIONS = 2;
    private static final int MAX_PACKET_SIZE_DEFAULT = 20;
    static final int NOTIFICATIONS = 1;
    boolean mAborted;
    private int mCurrentMtu;
    int mError;
    int mFileType;
    InputStream mFirmwareStream;
    BluetoothGatt mGatt;
    int mImageSizeInBytes;
    int mInitPacketSizeInBytes;
    InputStream mInitPacketStream;
    boolean mPaused;
    DfuProgressInfo mProgressInfo;
    boolean mRequestCompleted;
    boolean mResetRequestSent;
    DfuBaseService mService;
    private static final String TAG = StubApp.getString2(26324);
    static final UUID GENERIC_ATTRIBUTE_SERVICE_UUID = new UUID(26392574038016L, -9223371485494954757L);
    static final UUID SERVICE_CHANGED_UUID = new UUID(46200963207168L, -9223371485494954757L);
    static final UUID CLIENT_CHARACTERISTIC_CONFIG = new UUID(45088566677504L, -9223371485494954757L);
    private static final char[] HEX_ARRAY = StubApp.getString2(3365).toCharArray();
    final Object mLock = new Object();
    byte[] mReceivedData = null;
    byte[] mBuffer = new byte[20];
    boolean mConnected = true;

    public class BaseBluetoothGattCallback extends DfuCallback.DfuGattCallback {
        public BaseBluetoothGattCallback() {
        }

        private String phyToString(int i3) {
            return i3 != 1 ? i3 != 2 ? i3 != 3 ? h.g(i3, StubApp.getString2(3049), StubApp.getString2(74)) : StubApp.getString2(26307) : StubApp.getString2(26308) : StubApp.getString2(26309);
        }

        public int getInt(byte[] bArr, int i3) {
            return ((bArr[i3 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i3] & UByte.MAX_VALUE) | ((bArr[i3 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i3 + 2] & UByte.MAX_VALUE) << 16);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i3) {
            if (i3 == 0) {
                BaseDfuImpl.this.mService.sendLogBroadcast(5, StubApp.getString2(26146) + bluetoothGattCharacteristic.getUuid() + StubApp.getString2(26274) + parse(bArr));
                BaseDfuImpl baseDfuImpl = BaseDfuImpl.this;
                baseDfuImpl.mReceivedData = bArr;
                baseDfuImpl.mRequestCompleted = true;
            } else {
                BaseDfuImpl.this.loge(u.p(i3, StubApp.getString2(26310)));
                BaseDfuImpl.this.mError = i3 | 16384;
            }
            BaseDfuImpl.this.notifyLock();
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i3, byte[] bArr) {
            if (i3 == 0) {
                UUID uuid = bluetoothGattDescriptor.getUuid();
                UUID uuid2 = bluetoothGattDescriptor.getCharacteristic().getUuid();
                BaseDfuImpl.this.mReceivedData = bArr;
                if (BaseDfuImpl.CLIENT_CHARACTERISTIC_CONFIG.equals(uuid)) {
                    BaseDfuImpl.this.mService.sendLogBroadcast(5, StubApp.getString2(26311) + uuid2 + StubApp.getString2(26274) + parse(bArr));
                    if (BaseDfuImpl.SERVICE_CHANGED_UUID.equals(uuid2)) {
                        BaseDfuImpl.this.mRequestCompleted = true;
                    } else {
                        BaseDfuImpl.this.loge(StubApp.getString2(26312));
                    }
                }
            } else {
                BaseDfuImpl.this.loge(u.p(i3, StubApp.getString2(26313)));
                BaseDfuImpl.this.mError = i3 | 16384;
            }
            BaseDfuImpl.this.notifyLock();
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i3) {
            if (i3 == 0) {
                UUID uuid = bluetoothGattDescriptor.getUuid();
                UUID uuid2 = bluetoothGattDescriptor.getCharacteristic().getUuid();
                if (BaseDfuImpl.CLIENT_CHARACTERISTIC_CONFIG.equals(uuid)) {
                    BaseDfuImpl.this.mService.sendLogBroadcast(5, StubApp.getString2(26314) + uuid2);
                    if (BaseDfuImpl.SERVICE_CHANGED_UUID.equals(uuid2)) {
                        BaseDfuImpl.this.mService.sendLogBroadcast(1, StubApp.getString2(26315) + uuid2);
                    } else {
                        BaseDfuImpl.this.mService.sendLogBroadcast(1, StubApp.getString2(26316) + uuid2);
                    }
                }
                BaseDfuImpl.this.mRequestCompleted = true;
            } else {
                BaseDfuImpl.this.loge(u.p(i3, StubApp.getString2(26317)));
                BaseDfuImpl.this.mError = i3 | 16384;
            }
            BaseDfuImpl.this.notifyLock();
        }

        @Override // no.nordicsemi.android.dfu.DfuCallback.DfuGattCallback
        public void onDisconnected(int i3) {
            BaseDfuImpl baseDfuImpl = BaseDfuImpl.this;
            baseDfuImpl.mConnected = false;
            baseDfuImpl.mError = i3;
            baseDfuImpl.notifyLock();
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onMtuChanged(BluetoothGatt bluetoothGatt, int i3, int i10) {
            if (i10 == 0) {
                DfuBaseService dfuBaseService = BaseDfuImpl.this.mService;
                String string2 = StubApp.getString2(26171);
                dfuBaseService.sendLogBroadcast(5, string2 + i3);
                int i11 = i3 + (-3);
                BaseDfuImpl baseDfuImpl = BaseDfuImpl.this;
                if (i11 > baseDfuImpl.mBuffer.length) {
                    baseDfuImpl.mBuffer = new byte[i11];
                }
                baseDfuImpl.logi(u.p(i3, string2));
            } else {
                BaseDfuImpl.this.logw(AbstractC1482f.e(i10, StubApp.getString2(26318), i3, StubApp.getString2(26319), StubApp.getString2(74)));
                if (i10 == 4 && BaseDfuImpl.this.mCurrentMtu > 23) {
                    int i12 = BaseDfuImpl.this.mCurrentMtu - 3;
                    BaseDfuImpl baseDfuImpl2 = BaseDfuImpl.this;
                    if (i12 > baseDfuImpl2.mBuffer.length) {
                        baseDfuImpl2.mBuffer = new byte[baseDfuImpl2.mCurrentMtu - 3];
                        BaseDfuImpl.this.logi(StubApp.getString2(26320) + BaseDfuImpl.this.mCurrentMtu);
                    }
                }
            }
            BaseDfuImpl baseDfuImpl3 = BaseDfuImpl.this;
            baseDfuImpl3.mRequestCompleted = true;
            baseDfuImpl3.notifyLock();
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onPhyUpdate(BluetoothGatt bluetoothGatt, int i3, int i10, int i11) {
            String string2 = StubApp.getString2(74);
            if (i11 != 0) {
                BaseDfuImpl.this.logw(AbstractC1482f.f(i10, string2, AbstractC1482f.l(i11, StubApp.getString2(26321), i3, StubApp.getString2(26322), StubApp.getString2(26323))));
                return;
            }
            DfuBaseService dfuBaseService = BaseDfuImpl.this.mService;
            String string22 = StubApp.getString2(26177);
            StringBuilder sb2 = new StringBuilder(string22);
            sb2.append(phyToString(i3));
            String string23 = StubApp.getString2(26175);
            sb2.append(string23);
            sb2.append(phyToString(i10));
            sb2.append(string2);
            dfuBaseService.sendLogBroadcast(5, sb2.toString());
            BaseDfuImpl baseDfuImpl = BaseDfuImpl.this;
            StringBuilder sb3 = new StringBuilder(string22);
            sb3.append(phyToString(i3));
            sb3.append(string23);
            baseDfuImpl.logi(AbstractC1482f.k(sb3, phyToString(i10), string2));
        }

        public String parse(byte[] bArr) {
            int length;
            if (bArr == null || (length = bArr.length) == 0) {
                return "";
            }
            char[] cArr = new char[(length * 3) - 1];
            for (int i3 = 0; i3 < length; i3++) {
                byte b2 = bArr[i3];
                int i10 = i3 * 3;
                cArr[i10] = BaseDfuImpl.HEX_ARRAY[(b2 & UByte.MAX_VALUE) >>> 4];
                cArr[i10 + 1] = BaseDfuImpl.HEX_ARRAY[b2 & 15];
                if (i3 != length - 1) {
                    cArr[i10 + 2] = '-';
                }
            }
            return new String(cArr);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic, bluetoothGattCharacteristic.getValue());
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i3) {
            onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, bluetoothGattCharacteristic.getValue(), i3);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i3) {
            onDescriptorRead(bluetoothGatt, bluetoothGattDescriptor, i3, bluetoothGattDescriptor.getValue());
        }
    }

    public BaseDfuImpl(Intent intent, DfuBaseService dfuBaseService) {
        this.mService = dfuBaseService;
        this.mProgressInfo = dfuBaseService.mProgressInfo;
    }

    private boolean createBondApi18(BluetoothDevice bluetoothDevice) {
        try {
            Method method = bluetoothDevice.getClass().getMethod(StubApp.getString2("26325"), new Class[0]);
            this.mService.sendLogBroadcast(0, StubApp.getString2("26326"));
            return ((Boolean) method.invoke(bluetoothDevice, new Object[0])).booleanValue();
        } catch (Exception e10) {
            loge(StubApp.getString2(26327), e10);
            return false;
        }
    }

    private boolean isServiceChangedCCCDEnabled() throws DeviceDisconnectedException, DfuException, UploadAbortedException {
        BluetoothGattCharacteristic characteristic;
        BluetoothGattDescriptor descriptor;
        if (!this.mConnected) {
            throw new DeviceDisconnectedException(StubApp.getString2(26331), this.mError);
        }
        if (this.mAborted) {
            throw new UploadAbortedException();
        }
        BluetoothGatt bluetoothGatt = this.mGatt;
        BluetoothGattService service = bluetoothGatt.getService(GENERIC_ATTRIBUTE_SERVICE_UUID);
        if (service == null || (characteristic = service.getCharacteristic(SERVICE_CHANGED_UUID)) == null || (descriptor = characteristic.getDescriptor(CLIENT_CHARACTERISTIC_CONFIG)) == null) {
            return false;
        }
        this.mRequestCompleted = false;
        this.mReceivedData = null;
        this.mError = 0;
        logi(StubApp.getString2(26328));
        this.mService.sendLogBroadcast(1, StubApp.getString2(26328));
        this.mService.sendLogBroadcast(0, StubApp.getString2(26329) + descriptor.getUuid() + StubApp.getString2(74));
        bluetoothGatt.readDescriptor(descriptor);
        try {
            synchronized (this.mLock) {
                while (true) {
                    try {
                        if (!this.mRequestCompleted && this.mConnected && this.mError == 0) {
                            this.mLock.wait();
                        }
                        if (!this.mPaused) {
                            break;
                        }
                        this.mLock.wait();
                    } finally {
                    }
                }
            }
        } catch (InterruptedException e10) {
            loge(StubApp.getString2(26291), e10);
        }
        if (!this.mConnected) {
            throw new DeviceDisconnectedException(StubApp.getString2(26331), this.mError);
        }
        if (this.mError != 0) {
            throw new DfuException(StubApp.getString2(26330), this.mError);
        }
        byte[] bArr = this.mReceivedData;
        if (bArr == null || bArr.length != 2) {
            return false;
        }
        byte b2 = bArr[0];
        byte[] bArr2 = BluetoothGattDescriptor.ENABLE_INDICATION_VALUE;
        return b2 == bArr2[0] && bArr[1] == bArr2[1];
    }

    @Override // no.nordicsemi.android.dfu.DfuController
    public void abort() {
        this.mPaused = false;
        this.mAborted = true;
        notifyLock();
    }

    public boolean createBond() {
        BluetoothDevice device = this.mGatt.getDevice();
        this.mRequestCompleted = false;
        this.mService.sendLogBroadcast(1, StubApp.getString2(26332));
        this.mService.sendLogBroadcast(0, StubApp.getString2(26333));
        boolean createBond = device.createBond();
        try {
            synchronized (this.mLock) {
                while (createBond) {
                    try {
                        if (this.mRequestCompleted || this.mAborted) {
                            break;
                        }
                        this.mLock.wait();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return createBond;
        } catch (InterruptedException e10) {
            loge(StubApp.getString2(26291), e10);
            return createBond;
        }
    }

    public void enableCCCD(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i3) throws DeviceDisconnectedException, DfuException, UploadAbortedException {
        BluetoothGatt bluetoothGatt = this.mGatt;
        String string2 = i3 == 1 ? StubApp.getString2(2114) : StubApp.getString2(13006);
        if (!this.mConnected) {
            throw new DeviceDisconnectedException(E1.a.k(StubApp.getString2(26338), string2, StubApp.getString2(26339)), this.mError);
        }
        if (this.mAborted) {
            throw new UploadAbortedException();
        }
        this.mRequestCompleted = false;
        this.mReceivedData = null;
        this.mError = 0;
        BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(CLIENT_CHARACTERISTIC_CONFIG);
        logi(E1.a.k(StubApp.getString2(26334), string2, StubApp.getString2(10450)));
        DfuBaseService dfuBaseService = this.mService;
        StringBuilder l9 = b.l(StubApp.getString2(26334), string2, StubApp.getString2(6035));
        l9.append(bluetoothGattCharacteristic.getUuid());
        dfuBaseService.sendLogBroadcast(1, l9.toString());
        this.mService.sendLogBroadcast(0, StubApp.getString2(26206) + bluetoothGattCharacteristic.getUuid() + StubApp.getString2(26215));
        bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, true);
        DfuBaseService dfuBaseService2 = this.mService;
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(26335));
        sb2.append(descriptor.getUuid());
        sb2.append(i3 == 1 ? StubApp.getString2(26336) : StubApp.getString2(26337));
        dfuBaseService2.sendLogBroadcast(0, sb2.toString());
        if (Build.VERSION.SDK_INT >= 33) {
            bluetoothGatt.writeDescriptor(descriptor, i3 == 1 ? BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE : BluetoothGattDescriptor.ENABLE_INDICATION_VALUE);
        } else {
            descriptor.setValue(i3 == 1 ? BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE : BluetoothGattDescriptor.ENABLE_INDICATION_VALUE);
            bluetoothGatt.writeDescriptor(descriptor);
        }
        try {
            synchronized (this.mLock) {
                while (true) {
                    try {
                        if (!this.mRequestCompleted && this.mConnected && this.mError == 0) {
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
            throw new DeviceDisconnectedException(E1.a.k(StubApp.getString2(26338), string2, StubApp.getString2(26339)), this.mError);
        }
        if (this.mError != 0) {
            throw new DfuException(E1.a.k(StubApp.getString2(26338), string2, StubApp.getString2(17568)), this.mError);
        }
    }

    public abstract UUID getDfuServiceUUID();

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(1:3)|(1:5)|6|(12:32|33|(1:35)|36|9|10|11|(2:13|(1:15)(1:16))|17|18|(3:24|(1:26)|27)|28)|8|9|10|11|(0)|17|18|(5:20|22|24|(0)|27)|28) */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0080 A[Catch: Exception -> 0x0092, TryCatch #1 {Exception -> 0x0092, blocks: (B:11:0x007a, B:13:0x0080, B:15:0x0084, B:16:0x008b, B:17:0x008e), top: B:10:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb  */
    @Override // no.nordicsemi.android.dfu.DfuService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean initialize(android.content.Intent r6, android.bluetooth.BluetoothGatt r7, int r8, java.io.InputStream r9, java.io.InputStream r10) throws no.nordicsemi.android.dfu.internal.exception.DfuException, no.nordicsemi.android.dfu.internal.exception.DeviceDisconnectedException, no.nordicsemi.android.dfu.internal.exception.UploadAbortedException {
        /*
            r5 = this;
            r5.mGatt = r7
            r5.mFileType = r8
            r5.mFirmwareStream = r9
            r5.mInitPacketStream = r10
            r0 = 26299(0x66bb, float:3.6853E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r1 = 1
            int r0 = r6.getIntExtra(r0, r1)
            r2 = 26300(0x66bc, float:3.6854E-41)
            java.lang.String r2 = com.stub.StubApp.getString2(r2)
            int r2 = r6.getIntExtra(r2, r1)
            r3 = 26340(0x66e4, float:3.691E-41)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            r4 = 23
            int r6 = r6.getIntExtra(r3, r4)
            r5.mCurrentMtu = r6
            r6 = 4
            r3 = 15
            r4 = 2
            if (r8 <= r6) goto L58
            r6 = 26341(0x66e5, float:3.6912E-41)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            r5.logw(r6)
            no.nordicsemi.android.dfu.DfuBaseService r6 = r5.mService
            r8 = 26342(0x66e6, float:3.6913E-41)
            java.lang.String r8 = com.stub.StubApp.getString2(r8)
            r6.sendLogBroadcast(r3, r8)
            int r6 = r5.mFileType
            r6 = r6 & (-5)
            r5.mFileType = r6
            java.io.InputStream r8 = r5.mFirmwareStream
            no.nordicsemi.android.dfu.internal.ArchiveInputStream r8 = (no.nordicsemi.android.dfu.internal.ArchiveInputStream) r8
            r8.setContentType(r6)
            r2 = r4
        L58:
            if (r0 != r4) goto L66
            no.nordicsemi.android.dfu.DfuBaseService r6 = r5.mService
            r8 = 26343(0x66e7, float:3.6914E-41)
            java.lang.String r8 = com.stub.StubApp.getString2(r8)
            r6.sendLogBroadcast(r3, r8)
        L66:
            r6 = 0
            if (r10 == 0) goto L77
            boolean r8 = r10.markSupported()     // Catch: java.lang.Exception -> L77
            if (r8 == 0) goto L72
            r10.reset()     // Catch: java.lang.Exception -> L77
        L72:
            int r8 = r10.available()     // Catch: java.lang.Exception -> L77
            goto L78
        L77:
            r8 = r6
        L78:
            r5.mInitPacketSizeInBytes = r8
            boolean r8 = r9.markSupported()     // Catch: java.lang.Exception -> L92
            if (r8 == 0) goto L8e
            boolean r8 = r9 instanceof no.nordicsemi.android.dfu.internal.ArchiveInputStream     // Catch: java.lang.Exception -> L92
            if (r8 == 0) goto L8b
            r8 = r9
            no.nordicsemi.android.dfu.internal.ArchiveInputStream r8 = (no.nordicsemi.android.dfu.internal.ArchiveInputStream) r8     // Catch: java.lang.Exception -> L92
            r8.fullReset()     // Catch: java.lang.Exception -> L92
            goto L8e
        L8b:
            r9.reset()     // Catch: java.lang.Exception -> L92
        L8e:
            int r6 = r9.available()     // Catch: java.lang.Exception -> L92
        L92:
            r5.mImageSizeInBytes = r6
            no.nordicsemi.android.dfu.DfuProgressInfo r8 = r5.mProgressInfo
            r8.init(r6, r0, r2)
            android.bluetooth.BluetoothDevice r6 = r7.getDevice()
            int r6 = r6.getBondState()
            r8 = 12
            if (r6 != r8) goto Lcf
            java.util.UUID r6 = no.nordicsemi.android.dfu.BaseDfuImpl.GENERIC_ATTRIBUTE_SERVICE_UUID
            android.bluetooth.BluetoothGattService r6 = r7.getService(r6)
            if (r6 == 0) goto Lcf
            java.util.UUID r7 = no.nordicsemi.android.dfu.BaseDfuImpl.SERVICE_CHANGED_UUID
            android.bluetooth.BluetoothGattCharacteristic r6 = r6.getCharacteristic(r7)
            if (r6 == 0) goto Lcf
            boolean r7 = r5.isServiceChangedCCCDEnabled()
            if (r7 != 0) goto Lbe
            r5.enableCCCD(r6, r4)
        Lbe:
            r6 = 26344(0x66e8, float:3.6916E-41)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            r5.logi(r6)
            no.nordicsemi.android.dfu.DfuBaseService r7 = r5.mService
            r8 = 10
            r7.sendLogBroadcast(r8, r6)
        Lcf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: no.nordicsemi.android.dfu.BaseDfuImpl.initialize(android.content.Intent, android.bluetooth.BluetoothGatt, int, java.io.InputStream, java.io.InputStream):boolean");
    }

    public boolean isBonded() {
        return this.mGatt.getDevice().getBondState() == 12;
    }

    public void loge(String str) {
        Log.e(StubApp.getString2(26324), str);
    }

    public void logi(String str) {
        if (DfuBaseService.DEBUG) {
            Log.i(StubApp.getString2(26324), str);
        }
    }

    public void logw(String str) {
        if (DfuBaseService.DEBUG) {
            Log.w(StubApp.getString2(26324), str);
        }
    }

    public void notifyLock() {
        synchronized (this.mLock) {
            this.mLock.notifyAll();
        }
    }

    @Override // no.nordicsemi.android.dfu.DfuCallback
    public void onBondStateChanged(int i3) {
        this.mRequestCompleted = true;
        notifyLock();
    }

    public String parse(byte[] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) == 0) {
            return "";
        }
        char[] cArr = new char[(length * 3) - 1];
        for (int i3 = 0; i3 < length; i3++) {
            byte b2 = bArr[i3];
            int i10 = b2 & UByte.MAX_VALUE;
            int i11 = i3 * 3;
            char[] cArr2 = HEX_ARRAY;
            cArr[i11] = cArr2[i10 >>> 4];
            cArr[i11 + 1] = cArr2[b2 & 15];
            if (i3 != length - 1) {
                cArr[i11 + 2] = '-';
            }
        }
        return new String(cArr);
    }

    @Override // no.nordicsemi.android.dfu.DfuController
    public void pause() {
        this.mPaused = true;
    }

    public byte[] readNotificationResponse() throws DeviceDisconnectedException, DfuException, UploadAbortedException {
        try {
            synchronized (this.mLock) {
                while (true) {
                    try {
                        if (this.mReceivedData == null && this.mConnected && this.mError == 0 && !this.mAborted) {
                            this.mLock.wait();
                        }
                        if (!this.mPaused) {
                            break;
                        }
                        this.mLock.wait();
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
            throw new DeviceDisconnectedException(StubApp.getString2(26346), this.mError);
        }
        if (this.mError == 0) {
            return this.mReceivedData;
        }
        throw new DfuException(StubApp.getString2(26345), this.mError);
    }

    @Override // no.nordicsemi.android.dfu.DfuService
    public void release() {
        this.mService = null;
    }

    public boolean removeBond() {
        String string2 = StubApp.getString2(26347);
        BluetoothDevice device = this.mGatt.getDevice();
        if (device.getBondState() == 10) {
            return true;
        }
        this.mService.sendLogBroadcast(1, StubApp.getString2(26228));
        boolean z2 = false;
        try {
            Method method = device.getClass().getMethod(StubApp.getString2("11242"), new Class[0]);
            this.mRequestCompleted = false;
            this.mService.sendLogBroadcast(0, StubApp.getString2("26348"));
            z2 = ((Boolean) method.invoke(device, new Object[0])).booleanValue();
            logw(string2.concat(z2 ? "removed" : StubApp.getString2("26349")));
            try {
                synchronized (this.mLock) {
                    while (!this.mRequestCompleted && !this.mAborted) {
                        try {
                            this.mLock.wait();
                        } finally {
                        }
                    }
                }
            } catch (InterruptedException e10) {
                loge(StubApp.getString2("26291"), e10);
            }
        } catch (Exception e11) {
            loge(StubApp.getString2(26350), e11);
        }
        return z2;
    }

    public void requestMtu(int i3) throws DeviceDisconnectedException, UploadAbortedException {
        if (Build.HARDWARE.equals(StubApp.getString2(26351))) {
            if (i3 != 516) {
                logw(StubApp.getString2(26353));
                return;
            }
            logw(StubApp.getString2(26352));
        }
        if (this.mAborted) {
            throw new UploadAbortedException();
        }
        this.mRequestCompleted = false;
        this.mService.sendLogBroadcast(1, StubApp.getString2(26232));
        this.mService.sendLogBroadcast(0, StubApp.getString2(26233) + i3 + StubApp.getString2(74));
        if (this.mGatt.requestMtu(i3)) {
            try {
                synchronized (this.mLock) {
                    while (true) {
                        try {
                            if (!this.mRequestCompleted && this.mConnected && this.mError == 0) {
                                this.mLock.wait();
                            }
                            if (!this.mPaused) {
                                break;
                            } else {
                                this.mLock.wait();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (InterruptedException e10) {
                loge(StubApp.getString2(26291), e10);
            }
            if (!this.mConnected) {
                throw new DeviceDisconnectedException(StubApp.getString2(26354), this.mError);
            }
        }
    }

    public void restartService(Intent intent, boolean z2, UUID uuid) {
        String str;
        if (z2) {
            long longExtra = intent.getLongExtra(StubApp.getString2(26355), 0L);
            long longExtra2 = intent.getLongExtra(StubApp.getString2(26356), DfuServiceInitiator.DEFAULT_SCAN_TIMEOUT);
            DfuBaseService dfuBaseService = this.mService;
            String string2 = StubApp.getString2(26357);
            StringBuilder sb2 = new StringBuilder(string2);
            sb2.append(longExtra2);
            String string22 = StubApp.getString2(26358);
            sb2.append(string22);
            dfuBaseService.sendLogBroadcast(1, sb2.toString());
            if (longExtra > 0) {
                this.mService.waitFor(longExtra);
            }
            logi(string2 + longExtra2 + string22);
            str = BootloaderScannerFactory.getScanner(this.mGatt.getDevice().getAddress(), uuid).searchUsing(this.mService.getDeviceSelector(), longExtra2);
            logi(E1.a.j(StubApp.getString2(26359), str));
            if (str != null) {
                this.mService.sendLogBroadcast(5, StubApp.getString2(26360).concat(str));
            } else {
                this.mService.sendLogBroadcast(5, StubApp.getString2(26361));
            }
        } else {
            str = null;
        }
        if (str != null) {
            intent.putExtra(StubApp.getString2(26362), str);
        }
        intent.putExtra(StubApp.getString2(26363), 0);
        if (intent.getBooleanExtra(StubApp.getString2(26364), true)) {
            this.mService.startForegroundService(intent);
        } else {
            this.mService.startService(intent);
        }
    }

    @Override // no.nordicsemi.android.dfu.DfuController
    public void resume() {
        this.mPaused = false;
        notifyLock();
    }

    public void waitIfPaused() {
        try {
            synchronized (this.mLock) {
                while (this.mPaused) {
                    try {
                        this.mLock.wait();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } catch (InterruptedException e10) {
            loge(StubApp.getString2(26291), e10);
        }
    }

    public void writeOpCode(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, boolean z2) throws DeviceDisconnectedException, DfuException, UploadAbortedException {
        if (this.mAborted) {
            throw new UploadAbortedException();
        }
        this.mReceivedData = null;
        this.mError = 0;
        this.mRequestCompleted = false;
        this.mResetRequestSent = z2;
        this.mService.sendLogBroadcast(1, StubApp.getString2(26287) + bluetoothGattCharacteristic.getUuid() + StubApp.getString2(26274) + parse(bArr));
        if (Build.VERSION.SDK_INT >= 33) {
            this.mService.sendLogBroadcast(0, StubApp.getString2(26234) + bluetoothGattCharacteristic.getUuid() + StubApp.getString2(26289) + parse(bArr) + StubApp.getString2(26365));
            this.mGatt.writeCharacteristic(bluetoothGattCharacteristic, bArr, 2);
        } else {
            bluetoothGattCharacteristic.setWriteType(2);
            bluetoothGattCharacteristic.setValue(bArr);
            this.mService.sendLogBroadcast(0, StubApp.getString2(26234) + bluetoothGattCharacteristic.getUuid() + StubApp.getString2(74));
            this.mGatt.writeCharacteristic(bluetoothGattCharacteristic);
        }
        try {
            synchronized (this.mLock) {
                while (true) {
                    try {
                        if (!this.mRequestCompleted && this.mConnected && this.mError == 0) {
                            this.mLock.wait();
                        }
                        if (!this.mPaused) {
                            break;
                        } else {
                            this.mLock.wait();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } catch (InterruptedException e10) {
            loge(StubApp.getString2(26291), e10);
        }
        boolean z10 = this.mResetRequestSent;
        if (!z10 && !this.mConnected) {
            throw new DeviceDisconnectedException(AbstractC1482f.f(bArr[0], StubApp.getString2(26367), new StringBuilder(StubApp.getString2(26366))), this.mError);
        }
        if (z10 || this.mError == 0) {
            return;
        }
        throw new DfuException(StubApp.getString2(26366) + ((int) bArr[0]), this.mError);
    }

    public void loge(String str, Throwable th) {
        Log.e(StubApp.getString2(26324), str, th);
    }
}
