package no.nordicsemi.android.dfu;

import C.C0036m;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.IntentService;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import com.stub.StubApp;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import l0.C1137b;
import no.nordicsemi.android.dfu.DfuProgressInfo;
import no.nordicsemi.android.dfu.internal.ArchiveInputStream;
import no.nordicsemi.android.dfu.internal.HexInputStream;
import p0.AbstractC1482f;

@SuppressLint({"MissingPermission"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class DfuBaseService extends IntentService implements DfuProgressInfo.ProgressListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int ACTION_ABORT = 2;
    public static final int ACTION_PAUSE = 0;
    public static final int ACTION_RESUME = 1;
    static boolean DEBUG = false;
    public static final int ERROR_BLUETOOTH_DISABLED = 4106;
    public static final int ERROR_CONNECTION_MASK = 16384;
    public static final int ERROR_CONNECTION_STATE_MASK = 32768;
    public static final int ERROR_CRC_ERROR = 4109;
    public static final int ERROR_DEVICE_DISCONNECTED = 4096;
    public static final int ERROR_DEVICE_NOT_BONDED = 4110;
    public static final int ERROR_FILE_ERROR = 4098;
    public static final int ERROR_FILE_INVALID = 4099;
    public static final int ERROR_FILE_IO_EXCEPTION = 4100;
    public static final int ERROR_FILE_NOT_FOUND = 4097;
    public static final int ERROR_FILE_SIZE_INVALID = 4108;
    public static final int ERROR_FILE_TYPE_UNSUPPORTED = 4105;
    public static final int ERROR_INIT_PACKET_REQUIRED = 4107;
    public static final int ERROR_INVALID_RESPONSE = 4104;
    public static final int ERROR_MASK = 4096;
    public static final int ERROR_PROGRESS_LOST = 4111;
    public static final int ERROR_REMOTE_MASK = 8192;
    public static final int ERROR_REMOTE_TYPE_LEGACY = 256;
    public static final int ERROR_REMOTE_TYPE_SECURE = 512;
    public static final int ERROR_REMOTE_TYPE_SECURE_BUTTONLESS = 2048;
    public static final int ERROR_REMOTE_TYPE_SECURE_EXTENDED = 1024;
    public static final int ERROR_SERVICE_DISCOVERY_NOT_STARTED = 4101;
    public static final int ERROR_SERVICE_NOT_FOUND = 4102;
    public static final int ERROR_TYPE_COMMUNICATION = 2;
    public static final int ERROR_TYPE_COMMUNICATION_STATE = 1;
    public static final int ERROR_TYPE_DFU_REMOTE = 3;
    public static final int ERROR_TYPE_OTHER = 0;
    public static final int LOG_LEVEL_APPLICATION = 10;
    public static final int LOG_LEVEL_DEBUG = 0;
    public static final int LOG_LEVEL_ERROR = 20;
    public static final int LOG_LEVEL_INFO = 5;
    public static final int LOG_LEVEL_VERBOSE = 1;
    public static final int LOG_LEVEL_WARNING = 15;
    public static final int NOTIFICATION_ID = 283;
    public static final int PROGRESS_ABORTED = -7;
    public static final int PROGRESS_COMPLETED = -6;
    public static final int PROGRESS_CONNECTING = -1;
    public static final int PROGRESS_DISCONNECTING = -5;
    public static final int PROGRESS_ENABLING_DFU_MODE = -3;
    public static final int PROGRESS_STARTING = -2;
    public static final int PROGRESS_VALIDATING = -4;
    protected static final int STATE_CLOSED = -5;
    protected static final int STATE_CONNECTED = -2;
    protected static final int STATE_CONNECTED_AND_READY = -3;
    protected static final int STATE_CONNECTING = -1;
    protected static final int STATE_DISCONNECTED = 0;
    protected static final int STATE_DISCONNECTING = -4;
    public static final int TYPE_APPLICATION = 4;
    public static final int TYPE_AUTO = 0;
    public static final int TYPE_BOOTLOADER = 2;
    public static final int TYPE_SOFT_DEVICE = 1;
    private boolean mAborted;
    private BluetoothAdapter mBluetoothAdapter;
    private final BroadcastReceiver mBluetoothStateBroadcastReceiver;
    private final BroadcastReceiver mBondStateBroadcastReceiver;
    protected int mConnectionState;
    private final BroadcastReceiver mConnectionStateBroadcastReceiver;
    private String mDeviceAddress;
    private String mDeviceName;
    private final BroadcastReceiver mDfuActionReceiver;
    private DfuCallback mDfuServiceImpl;
    private boolean mDisableNotification;
    private int mError;
    private InputStream mFirmwareInputStream;
    private final BluetoothGattCallback mGattCallback;
    private Handler mHandler;
    private InputStream mInitFileInputStream;
    private long mLastNotificationTime;
    private int mLastProgress;
    private final Object mLock;
    DfuProgressInfo mProgressInfo;
    public static final String BROADCAST_ACTION = StubApp.getString2(26411);
    public static final String BROADCAST_ERROR = StubApp.getString2(26417);
    public static final String BROADCAST_LOG = StubApp.getString2(26486);
    public static final String BROADCAST_PROGRESS = StubApp.getString2(26420);
    public static final String EXTRA_ACTION = StubApp.getString2(26389);
    public static final String EXTRA_AVG_SPEED_B_PER_MS = StubApp.getString2(26422);
    public static final String EXTRA_CURRENT_MTU = StubApp.getString2(26340);
    public static final String EXTRA_CUSTOM_UUIDS_FOR_BUTTONLESS_DFU_WITHOUT_BOND_SHARING = StubApp.getString2(26489);
    public static final String EXTRA_CUSTOM_UUIDS_FOR_BUTTONLESS_DFU_WITH_BOND_SHARING = StubApp.getString2(26490);
    public static final String EXTRA_CUSTOM_UUIDS_FOR_EXPERIMENTAL_BUTTONLESS_DFU = StubApp.getString2(26491);
    public static final String EXTRA_CUSTOM_UUIDS_FOR_LEGACY_DFU = StubApp.getString2(26492);
    public static final String EXTRA_CUSTOM_UUIDS_FOR_SECURE_DFU = StubApp.getString2(26493);
    public static final String EXTRA_DATA = StubApp.getString2(26419);
    public static final String EXTRA_DATA_OBJECT_DELAY = StubApp.getString2(26494);
    public static final String EXTRA_DEVICE_ADDRESS = StubApp.getString2(26362);
    public static final String EXTRA_DEVICE_NAME = StubApp.getString2(26415);
    static final String EXTRA_DFU_ATTEMPT = StubApp.getString2(26363);
    public static final String EXTRA_DISABLE_NOTIFICATION = StubApp.getString2(26440);
    public static final String EXTRA_DISABLE_RESUME = StubApp.getString2(26495);
    public static final String EXTRA_ERROR_TYPE = StubApp.getString2(26418);
    public static final String EXTRA_FILE_MIME_TYPE = StubApp.getString2(26297);
    public static final String EXTRA_FILE_PATH = StubApp.getString2(26441);
    public static final String EXTRA_FILE_RES_ID = StubApp.getString2(26443);
    public static final String EXTRA_FILE_TYPE = StubApp.getString2(26298);
    public static final String EXTRA_FILE_URI = StubApp.getString2(26442);
    public static final String EXTRA_FORCE_DFU = StubApp.getString2(26496);
    public static final String EXTRA_FORCE_SCANNING_FOR_BOOTLOADER_IN_LEGACY_DFU = StubApp.getString2(26497);
    public static final String EXTRA_FOREGROUND_SERVICE = StubApp.getString2(26364);
    public static final String EXTRA_INIT_FILE_PATH = StubApp.getString2(26444);
    public static final String EXTRA_INIT_FILE_RES_ID = StubApp.getString2(26446);
    public static final String EXTRA_INIT_FILE_URI = StubApp.getString2(26445);
    public static final String EXTRA_KEEP_BOND = StubApp.getString2(26275);
    public static final String EXTRA_LOG_LEVEL = StubApp.getString2(26488);
    public static final String EXTRA_LOG_MESSAGE = StubApp.getString2(26487);
    public static final String EXTRA_MAX_DFU_ATTEMPTS = StubApp.getString2(26471);
    public static final String EXTRA_MBR_SIZE = StubApp.getString2(26452);
    public static final String EXTRA_MTU = StubApp.getString2(26498);
    public static final String EXTRA_PACKET_RECEIPT_NOTIFICATIONS_ENABLED = StubApp.getString2(26281);
    public static final String EXTRA_PACKET_RECEIPT_NOTIFICATIONS_VALUE = StubApp.getString2(26282);
    public static final String EXTRA_PARTS_TOTAL = StubApp.getString2(26300);
    public static final String EXTRA_PART_CURRENT = StubApp.getString2(26299);
    public static final String EXTRA_PROGRESS = StubApp.getString2(26416);
    private static final String EXTRA_RECONNECTION_ATTEMPT = StubApp.getString2(26462);
    public static final String EXTRA_RESTORE_BOND = StubApp.getString2(26294);
    public static final String EXTRA_SCAN_DELAY = StubApp.getString2(26355);
    public static final String EXTRA_SCAN_TIMEOUT = StubApp.getString2(26356);
    public static final String EXTRA_SPEED_B_PER_MS = StubApp.getString2(26421);
    public static final String EXTRA_UNSAFE_EXPERIMENTAL_BUTTONLESS_DFU = StubApp.getString2(26499);
    public static final String MIME_TYPE_OCTET_STREAM = StubApp.getString2(1267);
    public static final String MIME_TYPE_ZIP = StubApp.getString2(20996);
    public static final String NOTIFICATION_CHANNEL_DFU = StubApp.getString2(26414);
    private static final String TAG = StubApp.getString2(26408);

    /* renamed from: no.nordicsemi.android.dfu.DfuBaseService$5, reason: invalid class name */
    public class AnonymousClass5 extends BluetoothGattCallback {
        public AnonymousClass5() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: discoverServices, reason: merged with bridge method [inline-methods] */
        public void lambda$onServiceChanged$1(BluetoothGatt bluetoothGatt) {
            DfuBaseService.this.sendLogBroadcast(1, StubApp.getString2(26254));
            DfuBaseService.this.sendLogBroadcast(0, StubApp.getString2(26141));
            boolean discoverServices = bluetoothGatt.discoverServices();
            DfuBaseService.this.logi(StubApp.getString2(26400).concat(discoverServices ? StubApp.getString2(26399) : StubApp.getString2(16617)));
            if (discoverServices) {
                return;
            }
            DfuBaseService.this.mError = DfuBaseService.ERROR_SERVICE_DISCOVERY_NOT_STARTED;
            synchronized (DfuBaseService.this.mLock) {
                DfuBaseService.this.mLock.notifyAll();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onConnectionStateChange$0(BluetoothGatt bluetoothGatt) {
            DfuBaseService dfuBaseService = DfuBaseService.this;
            if (dfuBaseService.mConnectionState != -1) {
                return;
            }
            dfuBaseService.mConnectionState = -2;
            lambda$onServiceChanged$1(bluetoothGatt);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            if (DfuBaseService.this.mDfuServiceImpl != null) {
                DfuBaseService.this.mDfuServiceImpl.getGattCallback().onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i3) {
            if (DfuBaseService.this.mDfuServiceImpl != null) {
                DfuBaseService.this.mDfuServiceImpl.getGattCallback().onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, i3);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i3) {
            if (DfuBaseService.this.mDfuServiceImpl != null) {
                DfuBaseService.this.mDfuServiceImpl.getGattCallback().onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i3);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i3, int i10) {
            if (i3 != 0) {
                if (i3 == 8 || i3 == 19) {
                    DfuBaseService.this.logw(StubApp.getString2(26406) + i3);
                } else {
                    DfuBaseService.this.loge(StubApp.getString2(26404) + i3 + StubApp.getString2(26405) + i10);
                }
                DfuBaseService.this.mError = i3 | 32768;
                if (i10 == 0) {
                    DfuBaseService dfuBaseService = DfuBaseService.this;
                    dfuBaseService.mConnectionState = 0;
                    if (dfuBaseService.mDfuServiceImpl != null) {
                        DfuBaseService.this.mDfuServiceImpl.getGattCallback().onDisconnected(DfuBaseService.this.mError);
                    }
                }
            } else {
                if (i10 == 2) {
                    DfuBaseService.this.logi(StubApp.getString2(26401));
                    DfuBaseService.this.sendLogBroadcast(5, StubApp.getString2(26156) + DfuBaseService.this.mDeviceAddress);
                    if (bluetoothGatt.getDevice().getBondState() == 12) {
                        DfuBaseService.this.logi(StubApp.getString2(26402));
                        DfuBaseService.this.mHandler.postDelayed(new a(this, bluetoothGatt, 1), 4000L);
                        return;
                    } else {
                        DfuBaseService.this.mConnectionState = -2;
                        lambda$onServiceChanged$1(bluetoothGatt);
                        return;
                    }
                }
                if (i10 == 0) {
                    DfuBaseService.this.logi(StubApp.getString2(26403));
                    DfuBaseService dfuBaseService2 = DfuBaseService.this;
                    dfuBaseService2.mConnectionState = 0;
                    if (dfuBaseService2.mDfuServiceImpl != null) {
                        DfuBaseService.this.mDfuServiceImpl.getGattCallback().onDisconnected(0);
                    }
                }
            }
            synchronized (DfuBaseService.this.mLock) {
                DfuBaseService.this.mLock.notifyAll();
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i3) {
            if (DfuBaseService.this.mDfuServiceImpl != null) {
                DfuBaseService.this.mDfuServiceImpl.getGattCallback().onDescriptorRead(bluetoothGatt, bluetoothGattDescriptor, i3);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i3) {
            if (DfuBaseService.this.mDfuServiceImpl != null) {
                DfuBaseService.this.mDfuServiceImpl.getGattCallback().onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i3);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        @SuppressLint({"NewApi"})
        public void onMtuChanged(BluetoothGatt bluetoothGatt, int i3, int i10) {
            if (DfuBaseService.this.mDfuServiceImpl != null) {
                DfuBaseService.this.mDfuServiceImpl.getGattCallback().onMtuChanged(bluetoothGatt, i3, i10);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        @SuppressLint({"NewApi"})
        public void onPhyUpdate(BluetoothGatt bluetoothGatt, int i3, int i10, int i11) {
            if (DfuBaseService.this.mDfuServiceImpl != null) {
                DfuBaseService.this.mDfuServiceImpl.getGattCallback().onPhyUpdate(bluetoothGatt, i3, i10, i11);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServiceChanged(BluetoothGatt bluetoothGatt) {
            DfuBaseService dfuBaseService = DfuBaseService.this;
            if (dfuBaseService.mConnectionState != -1) {
                return;
            }
            String string2 = StubApp.getString2(26139);
            dfuBaseService.logi(string2);
            DfuBaseService.this.sendLogBroadcast(5, string2);
            DfuBaseService dfuBaseService2 = DfuBaseService.this;
            dfuBaseService2.mConnectionState = -2;
            dfuBaseService2.mHandler.postDelayed(new a(this, bluetoothGatt, 0), 1000L);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i3) {
            if (i3 == 0) {
                DfuBaseService.this.logi(StubApp.getString2(26187));
                DfuBaseService.this.mConnectionState = -3;
            } else {
                DfuBaseService.this.loge(StubApp.getString2(26407) + i3);
                DfuBaseService.this.mError = i3 | 16384;
            }
            synchronized (DfuBaseService.this.mLock) {
                DfuBaseService.this.mLock.notifyAll();
            }
        }
    }

    public DfuBaseService() {
        super(StubApp.getString2(26408));
        this.mLock = new Object();
        this.mLastProgress = -1;
        this.mDfuActionReceiver = new BroadcastReceiver() { // from class: no.nordicsemi.android.dfu.DfuBaseService.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                int intExtra = intent.getIntExtra(StubApp.getString2(26389), 0);
                DfuBaseService.this.logi(StubApp.getString2(26390) + intExtra);
                if (intExtra == 0) {
                    DfuBaseService.this.sendLogBroadcast(15, StubApp.getString2(26393));
                    if (DfuBaseService.this.mDfuServiceImpl != null) {
                        DfuBaseService.this.mDfuServiceImpl.pause();
                        return;
                    }
                    return;
                }
                if (intExtra == 1) {
                    DfuBaseService.this.sendLogBroadcast(15, StubApp.getString2(26392));
                    if (DfuBaseService.this.mDfuServiceImpl != null) {
                        DfuBaseService.this.mDfuServiceImpl.resume();
                        return;
                    }
                    return;
                }
                if (intExtra != 2) {
                    return;
                }
                DfuBaseService.this.sendLogBroadcast(15, StubApp.getString2(26391));
                DfuBaseService.this.mAborted = true;
                if (DfuBaseService.this.mDfuServiceImpl != null) {
                    DfuBaseService.this.mDfuServiceImpl.abort();
                }
            }
        };
        this.mBluetoothStateBroadcastReceiver = new BroadcastReceiver() { // from class: no.nordicsemi.android.dfu.DfuBaseService.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                int intExtra = intent.getIntExtra(StubApp.getString2(11422), 10);
                int intExtra2 = intent.getIntExtra(StubApp.getString2(26258), 12);
                DfuBaseService.this.logw(AbstractC1482f.e(intExtra, StubApp.getString2(26394), intExtra2, StubApp.getString2(26395), StubApp.getString2(511)));
                if (intExtra2 == 12) {
                    if (intExtra == 13 || intExtra == 10) {
                        DfuBaseService.this.sendLogBroadcast(15, StubApp.getString2(26396));
                        DfuBaseService dfuBaseService = DfuBaseService.this;
                        dfuBaseService.mConnectionState = 0;
                        if (dfuBaseService.mDfuServiceImpl != null) {
                            DfuBaseService.this.mDfuServiceImpl.getGattCallback().onDisconnected(22);
                        }
                        synchronized (DfuBaseService.this.mLock) {
                            DfuBaseService.this.mLock.notifyAll();
                        }
                    }
                }
            }
        };
        this.mBondStateBroadcastReceiver = new BroadcastReceiver() { // from class: no.nordicsemi.android.dfu.DfuBaseService.3
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                int intExtra;
                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra(StubApp.getString2(1287));
                if (bluetoothDevice == null || !bluetoothDevice.getAddress().equals(DfuBaseService.this.mDeviceAddress) || (intExtra = intent.getIntExtra(StubApp.getString2(11418), -1)) == 11 || DfuBaseService.this.mDfuServiceImpl == null) {
                    return;
                }
                DfuBaseService.this.mDfuServiceImpl.onBondStateChanged(intExtra);
            }
        };
        this.mConnectionStateBroadcastReceiver = new BroadcastReceiver() { // from class: no.nordicsemi.android.dfu.DfuBaseService.4
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra(StubApp.getString2(1287));
                if (bluetoothDevice == null || !bluetoothDevice.getAddress().equals(DfuBaseService.this.mDeviceAddress)) {
                    return;
                }
                String action = intent.getAction();
                DfuBaseService.this.logi(StubApp.getString2(26397) + action);
                DfuBaseService.this.sendLogBroadcast(0, StubApp.getString2(26398) + action);
            }
        };
        this.mGattCallback = new AnonymousClass5();
    }

    private boolean initialize() {
        BluetoothManager bluetoothManager = (BluetoothManager) getSystemService(StubApp.getString2(1815));
        if (bluetoothManager == null) {
            loge(StubApp.getString2(26409));
            return $assertionsDisabled;
        }
        BluetoothAdapter adapter = bluetoothManager.getAdapter();
        this.mBluetoothAdapter = adapter;
        if (adapter != null) {
            return true;
        }
        loge(StubApp.getString2(26410));
        return $assertionsDisabled;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loge(String str) {
        Log.e(StubApp.getString2(26408), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logi(String str) {
        if (DEBUG) {
            Log.i(StubApp.getString2(26408), str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logw(String str) {
        if (DEBUG) {
            Log.w(StubApp.getString2(26408), str);
        }
    }

    private static IntentFilter makeDfuActionIntentFilter() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(StubApp.getString2(26411));
        return intentFilter;
    }

    private InputStream openInputStream(String str, String str2, int i3, int i10) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(str);
        return StubApp.getString2(20996).equals(str2) ? new ArchiveInputStream(fileInputStream, i3, i10) : str.toLowerCase(Locale.US).endsWith(StubApp.getString2(26413)) ? new HexInputStream(fileInputStream, i3) : fileInputStream;
    }

    private void report(int i3) {
        sendErrorBroadcast(i3);
        if (this.mDisableNotification) {
            return;
        }
        String str = this.mDeviceAddress;
        String str2 = this.mDeviceName;
        if (str2 == null) {
            str2 = getString(R.string.dfu_unknown_name);
        }
        C0036m c0036m = new C0036m(this, StubApp.getString2(26414));
        c0036m.f857I.icon = android.R.drawable.stat_sys_upload;
        c0036m.d(8, true);
        c0036m.f884z = -65536;
        c0036m.d(2, $assertionsDisabled);
        c0036m.f864e = C0036m.c(getString(R.string.dfu_status_error));
        c0036m.f857I.icon = android.R.drawable.stat_sys_upload_done;
        c0036m.f865f = C0036m.c(getString(R.string.dfu_status_error_msg));
        c0036m.d(16, true);
        Intent intent = new Intent(this, getNotificationTarget());
        intent.addFlags(268435456);
        intent.putExtra(StubApp.getString2(26362), str);
        intent.putExtra(StubApp.getString2(26415), str2);
        intent.putExtra(StubApp.getString2(26416), i3);
        c0036m.f866g = PendingIntent.getActivity(this, 0, intent, 201326592);
        updateErrorNotification(c0036m);
        NotificationManager notificationManager = (NotificationManager) getSystemService(StubApp.getString2(490));
        if (notificationManager != null) {
            notificationManager.notify(NOTIFICATION_ID, c0036m.b());
        }
    }

    private void sendErrorBroadcast(int i3) {
        Intent intent = new Intent(StubApp.getString2(26417));
        int i10 = i3 & 16384;
        String string2 = StubApp.getString2(26418);
        String string22 = StubApp.getString2(26419);
        if (i10 > 0) {
            intent.putExtra(string22, i3 & (-16385));
            intent.putExtra(string2, 2);
        } else if ((32768 & i3) > 0) {
            intent.putExtra(string22, i3 & (-32769));
            intent.putExtra(string2, 1);
        } else if ((i3 & 8192) > 0) {
            intent.putExtra(string22, i3 & (-8193));
            intent.putExtra(string2, 3);
        } else {
            intent.putExtra(string22, i3);
            intent.putExtra(string2, 0);
        }
        intent.putExtra(StubApp.getString2(26362), this.mDeviceAddress);
        C1137b.a(this).c(intent);
    }

    private void sendProgressBroadcast(DfuProgressInfo dfuProgressInfo) {
        Intent intent = new Intent(StubApp.getString2(26420));
        intent.putExtra(StubApp.getString2(26419), dfuProgressInfo.getProgress());
        intent.putExtra(StubApp.getString2(26362), this.mDeviceAddress);
        intent.putExtra(StubApp.getString2(26299), dfuProgressInfo.getCurrentPart());
        intent.putExtra(StubApp.getString2(26300), dfuProgressInfo.getTotalParts());
        intent.putExtra(StubApp.getString2(26421), dfuProgressInfo.getSpeed());
        intent.putExtra(StubApp.getString2(26422), dfuProgressInfo.getAverageSpeed());
        C1137b.a(this).c(intent);
    }

    private void startForeground() {
        C0036m c0036m = new C0036m(this, StubApp.getString2(26414));
        c0036m.f857I.icon = android.R.drawable.stat_sys_upload;
        c0036m.f864e = C0036m.c(getString(R.string.dfu_status_foreground_title));
        c0036m.f865f = C0036m.c(getString(R.string.dfu_status_foreground_content));
        c0036m.f884z = -7829368;
        c0036m.f869k = -1;
        c0036m.d(2, true);
        Class<? extends Activity> notificationTarget = getNotificationTarget();
        if (notificationTarget != null) {
            Intent intent = new Intent(this, notificationTarget);
            intent.addFlags(268435456);
            intent.putExtra(StubApp.getString2(26362), this.mDeviceAddress);
            intent.putExtra(StubApp.getString2(26415), this.mDeviceName);
            c0036m.f866g = PendingIntent.getActivity(this, 0, intent, 201326592);
        } else {
            logw(StubApp.getString2(26423));
        }
        updateForegroundNotification(c0036m);
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                startForeground(NOTIFICATION_ID, c0036m.b(), 16);
            } else {
                startForeground(NOTIFICATION_ID, c0036m.b());
            }
        } catch (SecurityException e10) {
            loge(StubApp.getString2(26424), e10);
            logi(StubApp.getString2(26425));
        }
    }

    public void close(BluetoothGatt bluetoothGatt) {
        logi(StubApp.getString2(26426));
        sendLogBroadcast(0, StubApp.getString2(26214));
        bluetoothGatt.disconnect();
        sendLogBroadcast(0, StubApp.getString2(26155));
        bluetoothGatt.close();
        this.mConnectionState = -5;
    }

    public BluetoothGatt connect(String str) {
        if (!this.mBluetoothAdapter.isEnabled()) {
            return null;
        }
        this.mConnectionState = -1;
        logi(StubApp.getString2(26427));
        BluetoothDevice remoteDevice = this.mBluetoothAdapter.getRemoteDevice(str);
        sendLogBroadcast(0, StubApp.getString2(26428));
        BluetoothGatt connectGatt = remoteDevice.connectGatt(this, $assertionsDisabled, this.mGattCallback, 2, 3);
        try {
            synchronized (this.mLock) {
                while (true) {
                    try {
                        int i3 = this.mConnectionState;
                        if ((i3 == -1 || i3 == -2) && this.mError == 0 && !this.mAborted) {
                            this.mLock.wait();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return connectGatt;
        } catch (InterruptedException e10) {
            loge(StubApp.getString2(26291), e10);
            return connectGatt;
        }
    }

    public void disconnect(BluetoothGatt bluetoothGatt) {
        if (this.mConnectionState == 0) {
            return;
        }
        sendLogBroadcast(1, StubApp.getString2(26212));
        this.mProgressInfo.setProgress(-5);
        logi(StubApp.getString2(26429));
        sendLogBroadcast(0, StubApp.getString2(26214));
        bluetoothGatt.disconnect();
        waitUntilDisconnected();
        sendLogBroadcast(5, StubApp.getString2(15157));
    }

    public DfuDeviceSelector getDeviceSelector() {
        return new DfuDefaultDeviceSelector();
    }

    public abstract Class<? extends Activity> getNotificationTarget();

    public boolean isDebug() {
        return $assertionsDisabled;
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        this.mHandler = new Handler();
        DEBUG = isDebug();
        logi(StubApp.getString2(26430));
        initialize();
        C1137b a3 = C1137b.a(this);
        IntentFilter makeDfuActionIntentFilter = makeDfuActionIntentFilter();
        a3.b(this.mDfuActionReceiver, makeDfuActionIntentFilter);
        D.a.c(this, this.mDfuActionReceiver, makeDfuActionIntentFilter, 2);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(StubApp.getString2(11420));
        intentFilter.addAction(StubApp.getString2(26431));
        intentFilter.addAction(StubApp.getString2(11419));
        D.a.c(this, this.mConnectionStateBroadcastReceiver, intentFilter, 2);
        D.a.c(this, this.mBondStateBroadcastReceiver, new IntentFilter(StubApp.getString2(11417)), 2);
        D.a.c(this, this.mBluetoothStateBroadcastReceiver, new IntentFilter(StubApp.getString2(11421)), 2);
    }

    @Override // android.app.IntentService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.mHandler = null;
        DfuCallback dfuCallback = this.mDfuServiceImpl;
        if (dfuCallback != null) {
            dfuCallback.abort();
        }
        C1137b.a(this).d(this.mDfuActionReceiver);
        unregisterReceiver(this.mDfuActionReceiver);
        unregisterReceiver(this.mConnectionStateBroadcastReceiver);
        unregisterReceiver(this.mBondStateBroadcastReceiver);
        unregisterReceiver(this.mBluetoothStateBroadcastReceiver);
        try {
            InputStream inputStream = this.mFirmwareInputStream;
            if (inputStream != null) {
                inputStream.close();
            }
            InputStream inputStream2 = this.mInitFileInputStream;
            if (inputStream2 != null) {
                inputStream2.close();
            }
        } catch (IOException unused) {
        } catch (Throwable th) {
            this.mFirmwareInputStream = null;
            this.mInitFileInputStream = null;
            throw th;
        }
        this.mFirmwareInputStream = null;
        this.mInitFileInputStream = null;
        logi(StubApp.getString2(26432));
    }

    /* JADX WARN: Code restructure failed: missing block: B:190:0x0670, code lost:
    
        if (r4 == null) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x05d4, code lost:
    
        if (r4 == null) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x01cc, code lost:
    
        if (r4 < 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01b7, code lost:
    
        if (r4 < 0) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    @Override // android.app.IntentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onHandleIntent(android.content.Intent r35) {
        /*
            Method dump skipped, instructions count: 1873
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: no.nordicsemi.android.dfu.DfuBaseService.onHandleIntent(android.content.Intent):void");
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        NotificationManager notificationManager = (NotificationManager) getSystemService(StubApp.getString2(490));
        if (notificationManager != null) {
            notificationManager.cancel(NOTIFICATION_ID);
        }
        stopSelf();
    }

    public void refreshDeviceCache(BluetoothGatt bluetoothGatt, boolean z2) {
        String string2 = StubApp.getString2(26483);
        if (z2 || bluetoothGatt.getDevice().getBondState() == 10) {
            sendLogBroadcast(0, StubApp.getString2(26225));
            try {
                logi(string2 + ((Boolean) bluetoothGatt.getClass().getMethod(StubApp.getString2("11304"), new Class[0]).invoke(bluetoothGatt, new Object[0])).booleanValue());
            } catch (Exception e10) {
                loge(StubApp.getString2(26226), e10);
                sendLogBroadcast(15, StubApp.getString2(26484));
            }
        }
    }

    public void sendLogBroadcast(int i3, String str) {
        String j = E1.a.j(StubApp.getString2(26485), str);
        Intent intent = new Intent(StubApp.getString2(26486));
        intent.putExtra(StubApp.getString2(26487), j);
        intent.putExtra(StubApp.getString2(26488), i3);
        intent.putExtra(StubApp.getString2(26362), this.mDeviceAddress);
        C1137b.a(this).c(intent);
    }

    public void terminateConnection(BluetoothGatt bluetoothGatt, int i3) {
        if (this.mConnectionState != 0) {
            disconnect(bluetoothGatt);
        }
        refreshDeviceCache(bluetoothGatt, $assertionsDisabled);
        close(bluetoothGatt);
        waitFor(600L);
        if (i3 != 0) {
            report(i3);
        }
    }

    public void updateErrorNotification(C0036m c0036m) {
    }

    public void updateForegroundNotification(C0036m c0036m) {
    }

    @Override // no.nordicsemi.android.dfu.DfuProgressInfo.ProgressListener
    public void updateProgressNotification() {
        DfuProgressInfo dfuProgressInfo = this.mProgressInfo;
        int progress = dfuProgressInfo.getProgress();
        if (this.mLastProgress == progress) {
            return;
        }
        this.mLastProgress = progress;
        sendProgressBroadcast(dfuProgressInfo);
        if (this.mDisableNotification) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.mLastNotificationTime >= 250 || -6 == progress || -7 == progress) {
            this.mLastNotificationTime = elapsedRealtime;
            String str = this.mDeviceAddress;
            String str2 = this.mDeviceName;
            if (str2 == null) {
                str2 = getString(R.string.dfu_unknown_name);
            }
            C0036m c0036m = new C0036m(this, StubApp.getString2(26414));
            c0036m.f857I.icon = android.R.drawable.stat_sys_upload;
            c0036m.d(8, true);
            c0036m.f884z = -7829368;
            switch (progress) {
                case PROGRESS_ABORTED /* -7 */:
                    c0036m.d(2, $assertionsDisabled);
                    c0036m.f864e = C0036m.c(getString(R.string.dfu_status_aborted));
                    c0036m.f857I.icon = android.R.drawable.stat_sys_upload_done;
                    c0036m.f865f = C0036m.c(getString(R.string.dfu_status_aborted_msg));
                    c0036m.d(16, true);
                    break;
                case PROGRESS_COMPLETED /* -6 */:
                    c0036m.d(2, $assertionsDisabled);
                    c0036m.f864e = C0036m.c(getString(R.string.dfu_status_completed));
                    c0036m.f857I.icon = android.R.drawable.stat_sys_upload_done;
                    c0036m.f865f = C0036m.c(getString(R.string.dfu_status_completed_msg));
                    c0036m.d(16, true);
                    c0036m.f884z = -16730086;
                    break;
                case -5:
                    c0036m.d(2, true);
                    c0036m.f864e = C0036m.c(getString(R.string.dfu_status_disconnecting));
                    c0036m.f865f = C0036m.c(getString(R.string.dfu_status_disconnecting_msg, str2));
                    c0036m.e(100, 0, true);
                    break;
                case -4:
                    c0036m.d(2, true);
                    c0036m.f864e = C0036m.c(getString(R.string.dfu_status_validating));
                    c0036m.f865f = C0036m.c(getString(R.string.dfu_status_validating_msg));
                    c0036m.e(100, 0, true);
                    break;
                case -3:
                    c0036m.d(2, true);
                    c0036m.f864e = C0036m.c(getString(R.string.dfu_status_switching_to_dfu));
                    c0036m.f865f = C0036m.c(getString(R.string.dfu_status_switching_to_dfu_msg));
                    c0036m.e(100, 0, true);
                    break;
                case -2:
                    c0036m.d(2, true);
                    c0036m.f864e = C0036m.c(getString(R.string.dfu_status_starting));
                    c0036m.f865f = C0036m.c(getString(R.string.dfu_status_starting_msg));
                    c0036m.e(100, 0, true);
                    break;
                case -1:
                    c0036m.d(2, true);
                    c0036m.f864e = C0036m.c(getString(R.string.dfu_status_connecting));
                    c0036m.f865f = C0036m.c(getString(R.string.dfu_status_connecting_msg, str2));
                    c0036m.e(100, 0, true);
                    break;
                default:
                    String string = dfuProgressInfo.getTotalParts() == 1 ? getString(R.string.dfu_status_uploading) : getString(R.string.dfu_status_uploading_part, Integer.valueOf(dfuProgressInfo.getCurrentPart()), Integer.valueOf(dfuProgressInfo.getTotalParts()));
                    String string2 = getString(R.string.dfu_status_uploading_msg, str2);
                    c0036m.d(2, true);
                    c0036m.f864e = C0036m.c(string);
                    c0036m.f865f = C0036m.c(string2);
                    c0036m.e(100, progress, $assertionsDisabled);
                    break;
            }
            Intent intent = new Intent(this, getNotificationTarget());
            intent.addFlags(268435456);
            intent.putExtra(StubApp.getString2(26362), str);
            intent.putExtra(StubApp.getString2(26415), str2);
            intent.putExtra(StubApp.getString2(26416), progress);
            c0036m.f866g = PendingIntent.getActivity(this, 0, intent, 201326592);
            updateProgressNotification(c0036m, progress);
            NotificationManager notificationManager = (NotificationManager) getSystemService(StubApp.getString2(490));
            if (notificationManager != null) {
                notificationManager.notify(NOTIFICATION_ID, c0036m.b());
            }
        }
    }

    public void waitFor(long j) {
        String string2 = StubApp.getString2(26153);
        synchronized (this.mLock) {
            try {
                sendLogBroadcast(0, string2 + j + StubApp.getString2("74"));
                this.mLock.wait(j);
            } catch (InterruptedException e10) {
                loge(StubApp.getString2("26291"), e10);
            }
        }
    }

    public void waitUntilDisconnected() {
        try {
            synchronized (this.mLock) {
                while (this.mConnectionState != 0 && this.mError == 0) {
                    try {
                        this.mLock.wait();
                    } finally {
                    }
                }
            }
        } catch (InterruptedException e10) {
            loge(StubApp.getString2(26291), e10);
        }
    }

    private void loge(String str, Throwable th) {
        Log.e(StubApp.getString2(26408), str, th);
    }

    private InputStream openInputStream(Uri uri, String str, int i3, int i10) throws IOException {
        InputStream openInputStream;
        if (uri.toString().startsWith(StubApp.getString2(26412))) {
            openInputStream = getAssets().open(uri.getPath().substring(15));
        } else {
            openInputStream = getContentResolver().openInputStream(uri);
        }
        if (StubApp.getString2(20996).equals(str)) {
            return new ArchiveInputStream(openInputStream, i3, i10);
        }
        Cursor query = getContentResolver().query(uri, new String[]{StubApp.getString2(1245)}, null, null, null);
        if (query != null) {
            try {
                if (query.moveToNext() && query.getString(0).toLowerCase(Locale.US).endsWith(StubApp.getString2("26413"))) {
                    HexInputStream hexInputStream = new HexInputStream(openInputStream, i3);
                    query.close();
                    return hexInputStream;
                }
            } finally {
            }
        }
        if (query != null) {
            query.close();
        }
        return openInputStream;
    }

    private InputStream openInputStream(int i3, String str, int i10, int i11) throws IOException {
        InputStream openRawResource = getResources().openRawResource(i3);
        if (StubApp.getString2(20996).equals(str)) {
            return new ArchiveInputStream(openRawResource, i10, i11);
        }
        openRawResource.mark(2);
        int read = openRawResource.read();
        openRawResource.reset();
        return read == 58 ? new HexInputStream(openRawResource, i10) : openRawResource;
    }

    public void updateProgressNotification(C0036m c0036m, int i3) {
        if (i3 == -7 || i3 == -6) {
            return;
        }
        Intent intent = new Intent(StubApp.getString2(26411));
        intent.putExtra(StubApp.getString2(26389), 2);
        c0036m.a(R.drawable.ic_action_notify_cancel, getString(R.string.dfu_action_abort), PendingIntent.getBroadcast(this, 1, intent, 201326592));
    }
}
