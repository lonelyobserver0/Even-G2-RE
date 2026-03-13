package no.nordicsemi.android.dfu;

import Xa.h;
import android.annotation.SuppressLint;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Intent;
import android.preference.PreferenceManager;
import com.stub.StubApp;
import i2.u;
import java.util.UUID;
import kotlin.UByte;
import no.nordicsemi.android.dfu.internal.exception.DeviceDisconnectedException;
import no.nordicsemi.android.dfu.internal.exception.DfuException;
import no.nordicsemi.android.dfu.internal.exception.UploadAbortedException;
import p0.AbstractC1482f;

@SuppressLint({"MissingPermission"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class LegacyButtonlessDfuImpl extends BaseButtonlessDfuImpl {
    private BluetoothGattCharacteristic mControlPointCharacteristic;
    private int mVersion;
    static UUID DFU_SERVICE_UUID = LegacyDfuImpl.DEFAULT_DFU_SERVICE_UUID;
    static UUID DFU_CONTROL_POINT_UUID = LegacyDfuImpl.DEFAULT_DFU_CONTROL_POINT_UUID;
    static UUID DFU_VERSION_UUID = LegacyDfuImpl.DEFAULT_DFU_VERSION_UUID;
    private static final byte[] OP_CODE_ENTER_BOOTLOADER = {1, 4};

    public LegacyButtonlessDfuImpl(Intent intent, DfuBaseService dfuBaseService) {
        super(intent, dfuBaseService);
    }

    private String getVersionFeatures(int i3) {
        return i3 != 0 ? i3 != 1 ? i3 != 5 ? i3 != 6 ? i3 != 7 ? i3 != 8 ? StubApp.getString2(26506) : StubApp.getString2(26507) : StubApp.getString2(26508) : StubApp.getString2(26509) : StubApp.getString2(26510) : StubApp.getString2(26511) : StubApp.getString2(26512);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0077 A[EDGE_INSN: B:21:0x0077->B:22:0x0077 BREAK  A[LOOP:0: B:13:0x0054->B:41:0x006f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int readVersion(android.bluetooth.BluetoothGatt r5, android.bluetooth.BluetoothGattCharacteristic r6) throws no.nordicsemi.android.dfu.internal.exception.DeviceDisconnectedException, no.nordicsemi.android.dfu.internal.exception.DfuException, no.nordicsemi.android.dfu.internal.exception.UploadAbortedException {
        /*
            r4 = this;
            boolean r0 = r4.mConnected
            if (r0 == 0) goto Lc1
            boolean r0 = r4.mAborted
            if (r0 != 0) goto Lbb
            r0 = 0
            if (r6 != 0) goto Lc
            return r0
        Lc:
            r1 = 0
            r4.mReceivedData = r1
            r4.mError = r0
            r1 = 26513(0x6791, float:3.7153E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            r4.logi(r1)
            no.nordicsemi.android.dfu.DfuBaseService r1 = r4.mService
            r2 = 1
            r3 = 26513(0x6791, float:3.7153E-41)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            r1.sendLogBroadcast(r2, r3)
            no.nordicsemi.android.dfu.DfuBaseService r1 = r4.mService
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 26223(0x666f, float:3.6746E-41)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            r2.<init>(r3)
            java.util.UUID r3 = r6.getUuid()
            r2.append(r3)
            r3 = 74
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.sendLogBroadcast(r0, r2)
            r5.readCharacteristic(r6)
            java.lang.Object r5 = r4.mLock     // Catch: java.lang.InterruptedException -> L7b
            monitor-enter(r5)     // Catch: java.lang.InterruptedException -> L7b
        L54:
            boolean r6 = r4.mRequestCompleted     // Catch: java.lang.Throwable -> L5d
            if (r6 == 0) goto L5f
            byte[] r6 = r4.mReceivedData     // Catch: java.lang.Throwable -> L5d
            if (r6 != 0) goto L6b
            goto L5f
        L5d:
            r6 = move-exception
            goto L79
        L5f:
            boolean r6 = r4.mConnected     // Catch: java.lang.Throwable -> L5d
            if (r6 == 0) goto L6b
            int r6 = r4.mError     // Catch: java.lang.Throwable -> L5d
            if (r6 != 0) goto L6b
            boolean r6 = r4.mAborted     // Catch: java.lang.Throwable -> L5d
            if (r6 == 0) goto L6f
        L6b:
            boolean r6 = r4.mPaused     // Catch: java.lang.Throwable -> L5d
            if (r6 == 0) goto L77
        L6f:
            r4.mRequestCompleted = r0     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r6 = r4.mLock     // Catch: java.lang.Throwable -> L5d
            r6.wait()     // Catch: java.lang.Throwable -> L5d
            goto L54
        L77:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L5d
            goto L86
        L79:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L5d
            throw r6     // Catch: java.lang.InterruptedException -> L7b
        L7b:
            r5 = move-exception
            r6 = 26291(0x66b3, float:3.6842E-41)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            r4.loge(r6, r5)
        L86:
            boolean r5 = r4.mConnected
            if (r5 == 0) goto Lac
            int r5 = r4.mError
            if (r5 != 0) goto L9d
            byte[] r5 = r4.mReceivedData
            if (r5 == 0) goto L9c
            int r6 = r5.length
            r1 = 2
            if (r6 >= r1) goto L97
            goto L9c
        L97:
            int r5 = r4.getShort(r5, r0)
            return r5
        L9c:
            return r0
        L9d:
            no.nordicsemi.android.dfu.internal.exception.DfuException r5 = new no.nordicsemi.android.dfu.internal.exception.DfuException
            r6 = 26514(0x6792, float:3.7154E-41)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            int r0 = r4.mError
            r5.<init>(r6, r0)
            throw r5
        Lac:
            no.nordicsemi.android.dfu.internal.exception.DeviceDisconnectedException r5 = new no.nordicsemi.android.dfu.internal.exception.DeviceDisconnectedException
            r6 = 26515(0x6793, float:3.7155E-41)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            int r0 = r4.mError
            r5.<init>(r6, r0)
            throw r5
        Lbb:
            no.nordicsemi.android.dfu.internal.exception.UploadAbortedException r5 = new no.nordicsemi.android.dfu.internal.exception.UploadAbortedException
            r5.<init>()
            throw r5
        Lc1:
            no.nordicsemi.android.dfu.internal.exception.DeviceDisconnectedException r5 = new no.nordicsemi.android.dfu.internal.exception.DeviceDisconnectedException
            r6 = 26515(0x6793, float:3.7155E-41)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            int r0 = r4.mError
            r5.<init>(r6, r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: no.nordicsemi.android.dfu.LegacyButtonlessDfuImpl.readVersion(android.bluetooth.BluetoothGatt, android.bluetooth.BluetoothGattCharacteristic):int");
    }

    @Override // no.nordicsemi.android.dfu.BaseDfuImpl
    public UUID getDfuServiceUUID() {
        return LegacyDfuImpl.DFU_SERVICE_UUID;
    }

    public int getShort(byte[] bArr, int i3) {
        return ((bArr[i3 + 1] & UByte.MAX_VALUE) << 8) | (bArr[i3] & UByte.MAX_VALUE);
    }

    @Override // no.nordicsemi.android.dfu.DfuService
    public boolean isClientCompatible(Intent intent, BluetoothGatt bluetoothGatt) throws DfuException, DeviceDisconnectedException, UploadAbortedException {
        BluetoothGattCharacteristic characteristic;
        int i3;
        BluetoothGattService service = bluetoothGatt.getService(DFU_SERVICE_UUID);
        if (service == null || (characteristic = service.getCharacteristic(DFU_CONTROL_POINT_UUID)) == null || characteristic.getDescriptor(BaseDfuImpl.CLIENT_CHARACTERISTIC_CONFIG) == null) {
            return false;
        }
        this.mControlPointCharacteristic = characteristic;
        this.mProgressInfo.setProgress(-2);
        BluetoothGattCharacteristic characteristic2 = service.getCharacteristic(DFU_VERSION_UUID);
        if (characteristic2 != null) {
            i3 = readVersion(bluetoothGatt, characteristic2);
            this.mVersion = i3;
            int i10 = i3 & 15;
            int i11 = i3 >> 8;
            String string2 = StubApp.getString2(26516);
            String string22 = StubApp.getString2(1);
            StringBuilder l9 = AbstractC1482f.l(i11, string2, i10, string22, StubApp.getString2(438));
            l9.append(getVersionFeatures(i3));
            logi(l9.toString());
            this.mService.sendLogBroadcast(10, h.o(string2, i11, i10, string22));
        } else {
            logi(StubApp.getString2(26517) + getVersionFeatures(0));
            this.mService.sendLogBroadcast(10, StubApp.getString2(26518));
            i3 = 0;
        }
        boolean z2 = PreferenceManager.getDefaultSharedPreferences(this.mService).getBoolean(StubApp.getString2(26519), false);
        String string23 = StubApp.getString2(26496);
        if (intent.hasExtra(string23)) {
            z2 = intent.getBooleanExtra(string23, false);
        }
        boolean z10 = bluetoothGatt.getServices().size() > 3;
        if (i3 == 0 && z10) {
            logi(StubApp.getString2(26520));
        }
        return i3 == 1 || (!z2 && i3 == 0 && z10);
    }

    @Override // no.nordicsemi.android.dfu.DfuService
    public void performDfu(Intent intent) throws DfuException, DeviceDisconnectedException, UploadAbortedException {
        logw(StubApp.getString2(26521));
        this.mService.sendLogBroadcast(15, StubApp.getString2(26374));
        boolean z2 = true;
        this.mService.sendLogBroadcast(1, StubApp.getString2(26375));
        String string2 = StubApp.getString2(26498);
        if (intent.hasExtra(string2)) {
            int intExtra = intent.getIntExtra(string2, 517);
            logi(u.p(intExtra, StubApp.getString2(26522)));
            requestMtu(intExtra);
        }
        enableCCCD(this.mControlPointCharacteristic, 1);
        this.mService.sendLogBroadcast(10, StubApp.getString2(26168));
        this.mProgressInfo.setProgress(-3);
        logi(StubApp.getString2(26523));
        writeOpCode(this.mControlPointCharacteristic, OP_CODE_ENTER_BOOTLOADER, true);
        this.mService.sendLogBroadcast(10, StubApp.getString2(26524));
        BluetoothGatt bluetoothGatt = this.mGatt;
        boolean booleanExtra = intent.getBooleanExtra(StubApp.getString2(26497), false);
        if (booleanExtra || this.mVersion == 0) {
            this.mService.disconnect(bluetoothGatt);
        } else {
            this.mService.waitUntilDisconnected();
            this.mService.sendLogBroadcast(5, StubApp.getString2(26381));
        }
        logi(StubApp.getString2(1227));
        if (!booleanExtra && this.mVersion != 0) {
            z2 = false;
        }
        finalize(intent, false, z2);
    }
}
