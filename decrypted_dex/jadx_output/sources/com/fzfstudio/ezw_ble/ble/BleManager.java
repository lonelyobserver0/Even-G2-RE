package com.fzfstudio.ezw_ble.ble;

import J2.b;
import Qb.C0219s0;
import Qb.I;
import Qb.InterfaceC0221t0;
import Qb.J;
import Qb.L;
import Qb.L0;
import Qb.W;
import Vb.f;
import Vb.q;
import Xa.h;
import Xb.d;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.os.Build;
import com.fzfstudio.ezw_ble.ble.extension.BluetoothDeviceExtKt;
import com.fzfstudio.ezw_ble.ble.models.BleCmd;
import com.fzfstudio.ezw_ble.ble.models.BleConfig;
import com.fzfstudio.ezw_ble.ble.models.BleConnectTemp;
import com.fzfstudio.ezw_ble.ble.models.BleDevice;
import com.fzfstudio.ezw_ble.ble.models.BleMatchDevice;
import com.fzfstudio.ezw_ble.ble.models.BlePrivateService;
import com.fzfstudio.ezw_ble.ble.models.BleSnRule;
import com.fzfstudio.ezw_ble.ble.models.BluetoothGattStatus;
import com.fzfstudio.ezw_ble.ble.models.enums.BleConnectState;
import com.fzfstudio.ezw_ble.ble.services.BleStateListener;
import com.stub.StubApp;
import i2.u;
import io.flutter.plugin.common.EventChannel;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Timer;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import p0.AbstractC1482f;

@Metadata(d1 = {"\u0000ã\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001J\u0018\u0000 \u0096\u00012\u00020\u0001:\u0002\u0096\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003J\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u0017JK\u0010 \u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\u00142\b\b\u0002\u0010\u001e\u001a\u00020\u00142\b\b\u0002\u0010\u001f\u001a\u00020\u0014¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b$\u0010#J\u001f\u0010&\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010%\u001a\u00020\u0014¢\u0006\u0004\b&\u0010'J'\u0010,\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010)\u001a\u00020(2\b\b\u0002\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J'\u0010.\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010)\u001a\u00020(2\b\b\u0002\u0010+\u001a\u00020*¢\u0006\u0004\b.\u0010-J\u0015\u0010/\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b/\u0010#J\u0015\u00100\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b0\u0010#J\r\u00101\u001a\u00020\u0006¢\u0006\u0004\b1\u0010\u0003J\r\u00102\u001a\u00020\u0006¢\u0006\u0004\b2\u0010\u0003J\r\u00103\u001a\u00020\u0006¢\u0006\u0004\b3\u0010\u0003J\u000f\u00104\u001a\u00020\u0014H\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0014H\u0002¢\u0006\u0004\b6\u00105J\u000f\u00107\u001a\u00020\u0014H\u0002¢\u0006\u0004\b7\u00105J\u000f\u00108\u001a\u00020\u0014H\u0002¢\u0006\u0004\b8\u00105J\u000f\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b=\u0010>J!\u0010B\u001a\u00020\n2\b\u0010?\u001a\u0004\u0018\u00010(2\u0006\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bB\u0010CJ\u001f\u0010E\u001a\u00020\n2\u0006\u0010D\u001a\u00020\n2\u0006\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bE\u0010FJ%\u0010H\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\n2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\f0\u000fH\u0002¢\u0006\u0004\bH\u0010IJ\u000f\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bK\u0010LJ)\u0010O\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010N\u001a\u00020M2\b\b\u0002\u0010%\u001a\u00020\u0014H\u0002¢\u0006\u0004\bO\u0010PJ;\u0010R\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010N\u001a\u00020M2\b\b\u0002\u0010%\u001a\u00020\u00142\b\b\u0002\u0010Q\u001a\u00020*H\u0002¢\u0006\u0004\bR\u0010SJ\u0019\u0010V\u001a\u00020\u00142\b\u0010U\u001a\u0004\u0018\u00010TH\u0002¢\u0006\u0004\bV\u0010WJ\u0017\u0010%\u001a\u00020\u00062\u0006\u0010X\u001a\u00020\nH\u0002¢\u0006\u0004\b%\u0010#J\u001f\u0010\\\u001a\u00020\u00062\u0006\u0010Z\u001a\u00020Y2\u0006\u0010[\u001a\u00020\nH\u0002¢\u0006\u0004\b\\\u0010]R\u0016\u0010_\u001a\u00020^8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b_\u0010`R#\u0010g\u001a\n b*\u0004\u0018\u00010a0a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020\f0h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u001a\u0010k\u001a\b\u0012\u0004\u0012\u00020\f0h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010jR\u001a\u0010m\u001a\b\u0012\u0004\u0012\u00020l0h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010jR&\u0010q\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020p0o0n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u001a\u0010s\u001a\b\u0012\u0004\u0012\u00020\n0h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010jR\u001a\u0010v\u001a\b\u0012\u0004\u0012\u00020u0t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR&\u0010x\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020M0o0h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010jR\u001a\u0010z\u001a\b\u0012\u0004\u0012\u00020\n0y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u001e\u0010}\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010|8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u0019\u0010\u0080\u0001\u001a\u00020\u007f8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001a\u0010\u0083\u0001\u001a\u00030\u0082\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0019\u0010\u0085\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0019\u0010\u0087\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0086\u0001R\u001b\u0010\u0088\u0001\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0019\u0010\u008a\u0001\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0019\u0010\u008c\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u0086\u0001R\u0019\u0010\u008d\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u0086\u0001R\u001e\u0010\u008e\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010jR\u0014\u0010\u0091\u0001\u001a\u00020*8F¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0018\u0010\u0095\u0001\u001a\u00030\u0092\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001¨\u0006\u0097\u0001"}, d2 = {"Lcom/fzfstudio/ezw_ble/ble/BleManager;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "init", "(Landroid/content/Context;)V", "checkBluetoothPermission", "", "uuid", "Lcom/fzfstudio/ezw_ble/ble/models/BleDevice;", "findConnectedDevice", "(Ljava/lang/String;)Lcom/fzfstudio/ezw_ble/ble/models/BleDevice;", "", "Lcom/fzfstudio/ezw_ble/ble/models/BleConfig;", "newConfigs", "initConfigs", "(Ljava/util/List;)V", "", "pureModel", "startScan", "(Z)V", "isStartScan", "stopScan", "belongConfig", "name", "sn", "isWaitingDevice", "afterUpgrade", "retryWhenNoFoudDevice", "connect", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V", "setPreConnected", "(Ljava/lang/String;)V", "setConnected", "removeBond", "disconnect", "(Ljava/lang/String;Z)V", "", "data", "", "psType", "sendCmd", "(Ljava/lang/String;[BI)V", "sendCmdNoWait", "enterUpgradeState", "quiteUpgradeState", "cleanConnectCache", "reset", "release", "checkBleConfigIsConfigured", "()Z", "checkBleStatus", "checkIsFunctionCanBeCalled", "isBluetoothEnabled", "Lcom/fzfstudio/ezw_ble/ble/services/BleStateListener$BluetoothStateCallback;", "createBleStateListener", "()Lcom/fzfstudio/ezw_ble/ble/services/BleStateListener$BluetoothStateCallback;", "Landroid/bluetooth/le/ScanCallback;", "createScanCallBack", "()Landroid/bluetooth/le/ScanCallback;", "bytes", "Lcom/fzfstudio/ezw_ble/ble/models/BleSnRule;", "snRule", "parseDataToObtainSn", "([BLcom/fzfstudio/ezw_ble/ble/models/BleSnRule;)Ljava/lang/String;", "preSn", "replaceControlCharacters", "(Ljava/lang/String;Lcom/fzfstudio/ezw_ble/ble/models/BleSnRule;)Ljava/lang/String;", "devices", "sendMatchDevices", "(Ljava/lang/String;Ljava/util/List;)V", "com/fzfstudio/ezw_ble/ble/BleManager$createConnectCallBack$1", "createConnectCallBack", "()Lcom/fzfstudio/ezw_ble/ble/BleManager$createConnectCallBack$1;", "Lcom/fzfstudio/ezw_ble/ble/models/enums/BleConnectState;", "state", "disconnectDevice", "(Ljava/lang/String;Lcom/fzfstudio/ezw_ble/ble/models/enums/BleConnectState;Z)V", "mtu", "handleConnectState", "(Ljava/lang/String;Ljava/lang/String;Lcom/fzfstudio/ezw_ble/ble/models/enums/BleConnectState;ZI)V", "Landroid/bluetooth/BluetoothGatt;", "gatt", "refreshDeviceCache", "(Landroid/bluetooth/BluetoothGatt;)Z", "address", "La;", "tag", "log", "sendLog", "(La;Ljava/lang/String;)V", "LQb/I;", "mainScope", "LQb/I;", "Landroid/bluetooth/le/ScanSettings;", "kotlin.jvm.PlatformType", "scanSettings$delegate", "Lkotlin/Lazy;", "getScanSettings", "()Landroid/bluetooth/le/ScanSettings;", "scanSettings", "", "connectedDevices", "Ljava/util/List;", "scanResultTemp", "Lcom/fzfstudio/ezw_ble/ble/models/BleConnectTemp;", "waitingConnectDevices", "Ljava/util/Queue;", "Lkotlin/Pair;", "Landroid/bluetooth/BluetoothGattDescriptor;", "descriptorQueue", "Ljava/util/Queue;", "upgradeDevices", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lcom/fzfstudio/ezw_ble/ble/models/BleCmd;", "sendCmdQueue", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "disconnectingDevices", "", "preConnectedDevices", "Ljava/util/Set;", "Ljava/lang/ref/WeakReference;", "weakContext", "Ljava/lang/ref/WeakReference;", "Landroid/bluetooth/BluetoothManager;", "bluetoothManager", "Landroid/bluetooth/BluetoothManager;", "Lcom/fzfstudio/ezw_ble/ble/services/BleStateListener;", "bleStateListener", "Lcom/fzfstudio/ezw_ble/ble/services/BleStateListener;", "isScanning", "Z", "scanPureMode", "scanCallback", "Landroid/bluetooth/le/ScanCallback;", "bleState", "I", "blePermission", "bleLocation", "bleConfigs", "getCurrentBleState", "()I", "currentBleState", "Landroid/bluetooth/BluetoothAdapter;", "getBluetoothAdapter", "()Landroid/bluetooth/BluetoothAdapter;", "bluetoothAdapter", "Companion", "flutter_ezw_ble_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBleManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleManager.kt\ncom/fzfstudio/ezw_ble/ble/BleManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1143:1\n295#2,2:1144\n295#2,2:1146\n1761#2,3:1148\n295#2,2:1151\n295#2,2:1153\n295#2,2:1155\n295#2,2:1157\n295#2,2:1159\n295#2,2:1161\n295#2,2:1163\n295#2,2:1165\n295#2,2:1167\n1869#2,2:1169\n1869#2,2:1171\n295#2,2:1173\n1869#2,2:1175\n*S KotlinDebug\n*F\n+ 1 BleManager.kt\ncom/fzfstudio/ezw_ble/ble/BleManager\n*L\n171#1:1144,2\n240#1:1146,2\n279#1:1148,3\n287#1:1151,2\n292#1:1153,2\n338#1:1155,2\n371#1:1157,2\n383#1:1159,2\n409#1:1161,2\n422#1:1163,2\n434#1:1165,2\n446#1:1167,2\n456#1:1169,2\n469#1:1171,2\n1028#1:1173,2\n1054#1:1175,2\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class BleManager {
    private static final UUID cccdDescriptor;
    private List<BleConfig> bleConfigs;
    private boolean bleLocation;
    private boolean blePermission;
    private int bleState;
    private BleStateListener bleStateListener;
    private BluetoothManager bluetoothManager;
    private final List<BleDevice> connectedDevices;
    private final Queue<Pair<Integer, BluetoothGattDescriptor>> descriptorQueue;
    private final List<Pair<String, BleConnectState>> disconnectingDevices;
    private boolean isScanning;
    private I mainScope;
    private final Set<String> preConnectedDevices;
    private ScanCallback scanCallback;
    private boolean scanPureMode;
    private final List<BleDevice> scanResultTemp;

    /* renamed from: scanSettings$delegate, reason: from kotlin metadata */
    private final Lazy scanSettings = LazyKt.lazy(new b(6));
    private final ConcurrentLinkedQueue<BleCmd> sendCmdQueue;
    private final List<String> upgradeDevices;
    private final List<BleConnectTemp> waitingConnectDevices;
    private WeakReference<Context> weakContext;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final BleManager instance = new BleManager();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/fzfstudio/ezw_ble/ble/BleManager$Companion;", "", "<init>", "()V", "instance", "Lcom/fzfstudio/ezw_ble/ble/BleManager;", "getInstance", "()Lcom/fzfstudio/ezw_ble/ble/BleManager;", "cccdDescriptor", "Ljava/util/UUID;", "getCccdDescriptor", "()Ljava/util/UUID;", "flutter_ezw_ble_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final UUID getCccdDescriptor() {
            return BleManager.cccdDescriptor;
        }

        public final BleManager getInstance() {
            return BleManager.instance;
        }

        private Companion() {
        }
    }

    static {
        UUID fromString = UUID.fromString(StubApp.getString2(11299));
        Intrinsics.checkNotNullExpressionValue(fromString, "fromString(...)");
        cccdDescriptor = fromString;
    }

    private BleManager() {
        List<BleDevice> synchronizedList = Collections.synchronizedList(new ArrayList());
        Intrinsics.checkNotNullExpressionValue(synchronizedList, "synchronizedList(...)");
        this.connectedDevices = synchronizedList;
        this.scanResultTemp = new ArrayList();
        List<BleConnectTemp> synchronizedList2 = Collections.synchronizedList(new ArrayList());
        Intrinsics.checkNotNullExpressionValue(synchronizedList2, "synchronizedList(...)");
        this.waitingConnectDevices = synchronizedList2;
        this.descriptorQueue = new LinkedList();
        List<String> synchronizedList3 = Collections.synchronizedList(new ArrayList());
        Intrinsics.checkNotNullExpressionValue(synchronizedList3, "synchronizedList(...)");
        this.upgradeDevices = synchronizedList3;
        this.sendCmdQueue = new ConcurrentLinkedQueue<>();
        List<Pair<String, BleConnectState>> synchronizedList4 = Collections.synchronizedList(new ArrayList());
        Intrinsics.checkNotNullExpressionValue(synchronizedList4, "synchronizedList(...)");
        this.disconnectingDevices = synchronizedList4;
        Set<String> synchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        Intrinsics.checkNotNullExpressionValue(synchronizedSet, "synchronizedSet(...)");
        this.preConnectedDevices = synchronizedSet;
        this.bleConfigs = CollectionsKt.emptyList();
    }

    private final boolean checkBleConfigIsConfigured() {
        List<BlePrivateService> privateServices;
        BleConfig bleConfig = (BleConfig) CollectionsKt.firstOrNull((List) this.bleConfigs);
        BlePrivateService blePrivateService = (bleConfig == null || (privateServices = bleConfig.getPrivateServices()) == null) ? null : (BlePrivateService) CollectionsKt.firstOrNull((List) privateServices);
        if (blePrivateService == null) {
            sendLog(defpackage.a.f9226b, StubApp.getString2(11300));
            return false;
        }
        if (blePrivateService.getType() == 0) {
            return true;
        }
        sendLog(defpackage.a.f9226b, StubApp.getString2(11301));
        return false;
    }

    private final boolean checkBleStatus() {
        int i3 = this.bleState;
        if (i3 == 5) {
            return true;
        }
        sendLog(defpackage.a.f9226b, u.p(i3, StubApp.getString2(11302)));
        return false;
    }

    private final boolean checkIsFunctionCanBeCalled() {
        return checkBleStatus() && checkBleConfigIsConfigured();
    }

    public static /* synthetic */ void connect$default(BleManager bleManager, String str, String str2, String str3, String str4, boolean z2, boolean z10, boolean z11, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            z2 = false;
        }
        if ((i3 & 32) != 0) {
            z10 = false;
        }
        if ((i3 & 64) != 0) {
            z11 = true;
        }
        bleManager.connect(str, str2, str3, str4, z2, z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean connect$lambda$7(Ref.ObjectRef objectRef, BleConnectTemp it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!Intrinsics.areEqual(it.getUuid(), ((BleDevice) objectRef.element).getUuid())) {
            return false;
        }
        Timer timeoutTimer = it.getTimeoutTimer();
        if (timeoutTimer != null) {
            timeoutTimer.cancel();
        }
        it.setTimeoutTimer(null);
        return true;
    }

    private final BleStateListener.BluetoothStateCallback createBleStateListener() {
        return new BleStateListener.BluetoothStateCallback() { // from class: com.fzfstudio.ezw_ble.ble.BleManager$createBleStateListener$1
            @Override // com.fzfstudio.ezw_ble.ble.services.BleStateListener.BluetoothStateCallback
            public void onBluetoothStateChanged(int state) {
                int i3;
                int i10;
                int i11;
                List list;
                List<BleDevice> list2;
                BleManager bleManager = BleManager.this;
                if (state == Integer.MIN_VALUE) {
                    i3 = 0;
                } else if (state == 10) {
                    i3 = 4;
                } else if (state != 12) {
                    return;
                } else {
                    i3 = 5;
                }
                bleManager.bleState = i3;
                i10 = BleManager.this.bleState;
                if (i10 != 5) {
                    list = BleManager.this.upgradeDevices;
                    list.clear();
                    list2 = BleManager.this.connectedDevices;
                    BleManager bleManager2 = BleManager.this;
                    for (BleDevice bleDevice : list2) {
                        if (bleDevice.isConnected()) {
                            BleManager.disconnect$default(bleManager2, bleDevice.getUuid(), false, 2, null);
                        }
                    }
                }
                BleManager bleManager3 = BleManager.this;
                defpackage.a aVar = defpackage.a.f9225a;
                i11 = bleManager3.bleState;
                bleManager3.sendLog(aVar, h.o(StubApp.getString2(11250), state, i11, StubApp.getString2(11251)));
                BleManager.this.checkBluetoothPermission();
            }

            @Override // com.fzfstudio.ezw_ble.ble.services.BleStateListener.BluetoothStateCallback
            public void onDeviceBondStateChanged(BluetoothDevice device, boolean isBonded) {
                I i3;
                Intrinsics.checkNotNullParameter(device, "device");
                BleDevice findConnectedDevice = BleManager.this.findConnectedDevice(device.getAddress());
                String string2 = StubApp.getString2(11252);
                if (findConnectedDevice == null) {
                    BleManager.this.sendLog(defpackage.a.f9226b, string2 + device.getAddress() + StubApp.getString2(11253));
                    return;
                }
                if (!isBonded) {
                    if (findConnectedDevice.getConnectState().isConnecting() || findConnectedDevice.getConnectState().isDisconnected()) {
                        return;
                    }
                    i3 = BleManager.this.mainScope;
                    if (i3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mainScope");
                        i3 = null;
                    }
                    L.j(i3, null, new BleManager$createBleStateListener$1$onDeviceBondStateChanged$1(BleManager.this, null), 3);
                    BleManager.this.sendLog(defpackage.a.f9226b, string2 + device.getAddress() + StubApp.getString2(11254));
                    BleManager.handleConnectState$default(BleManager.this, findConnectedDevice.getUuid(), findConnectedDevice.getName(), BleConnectState.BOUND_FAIL, false, 0, 24, null);
                    return;
                }
                if (findConnectedDevice.getConnectState().isConnected()) {
                    BleManager.this.sendLog(defpackage.a.f9226b, string2 + device.getAddress() + StubApp.getString2(11255));
                    return;
                }
                if (findConnectedDevice.getConnectState().isError()) {
                    BleManager.this.sendLog(defpackage.a.f9226b, string2 + device.getAddress() + StubApp.getString2(11256) + findConnectedDevice.getConnectState() + StubApp.getString2(11257));
                    BleManager.handleConnectState$default(BleManager.this, findConnectedDevice.getUuid(), findConnectedDevice.getName(), BleConnectState.BOUND_FAIL, false, 0, 24, null);
                    return;
                }
                if (findConnectedDevice.getBelongConfig().getInitiateBinding()) {
                    BleManager.handleConnectState$default(BleManager.this, findConnectedDevice.getUuid(), findConnectedDevice.getName(), BleConnectState.CONNECT_FINISH, false, 0, 24, null);
                }
                BleManager.this.sendLog(defpackage.a.f9225a, string2 + device.getAddress() + StubApp.getString2(11258) + findConnectedDevice.getConnectState() + StubApp.getString2(11259));
            }

            @Override // com.fzfstudio.ezw_ble.ble.services.BleStateListener.BluetoothStateCallback
            public void onDeviceConnected(BluetoothDevice bluetoothDevice) {
                BleStateListener.BluetoothStateCallback.DefaultImpls.onDeviceConnected(this, bluetoothDevice);
            }

            @Override // com.fzfstudio.ezw_ble.ble.services.BleStateListener.BluetoothStateCallback
            public void onDeviceDisconnected(BluetoothDevice bluetoothDevice) {
                BleStateListener.BluetoothStateCallback.DefaultImpls.onDeviceDisconnected(this, bluetoothDevice);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.fzfstudio.ezw_ble.ble.BleManager$createConnectCallBack$1] */
    private final BleManager$createConnectCallBack$1 createConnectCallBack() {
        return new BluetoothGattCallback() { // from class: com.fzfstudio.ezw_ble.ble.BleManager$createConnectCallBack$1
            private boolean isPsHandleFinish;

            private final void connectingFlowFinish(BluetoothGatt gatt, int mtu) {
                String address = gatt.getDevice().getAddress();
                String name = gatt.getDevice().getName();
                BleDevice findConnectedDevice = BleManager.this.findConnectedDevice(address);
                if (findConnectedDevice == null) {
                    return;
                }
                boolean initiateBinding = findConnectedDevice.getBelongConfig().getInitiateBinding();
                String string2 = StubApp.getString2(11260);
                if (!initiateBinding || gatt.getDevice().getBondState() == 12) {
                    BleManager bleManager = BleManager.this;
                    Intrinsics.checkNotNull(address);
                    Intrinsics.checkNotNull(name);
                    BleManager.handleConnectState$default(bleManager, address, name, BleConnectState.CONNECT_FINISH, false, mtu, 8, null);
                    BleManager.this.sendLog(defpackage.a.f9225a, string2 + address + StubApp.getString2(11262));
                    return;
                }
                gatt.getDevice().createBond();
                BleManager.this.sendLog(defpackage.a.f9225a, string2 + address + StubApp.getString2(11261));
                BleManager bleManager2 = BleManager.this;
                Intrinsics.checkNotNull(address);
                Intrinsics.checkNotNull(name);
                BleManager.handleConnectState$default(bleManager2, address, name, BleConnectState.START_BINDING, false, 0, 24, null);
            }

            private final void processNextDescriptor(BluetoothGatt gatt) {
                Queue queue;
                Queue queue2;
                boolean writeDescriptor;
                int writeDescriptor2;
                Queue queue3;
                if (gatt == null) {
                    queue3 = BleManager.this.descriptorQueue;
                    queue3.clear();
                    return;
                }
                queue = BleManager.this.descriptorQueue;
                if (queue.isEmpty()) {
                    requestDeviceMtu(gatt);
                    return;
                }
                queue2 = BleManager.this.descriptorQueue;
                Pair pair = (Pair) queue2.poll();
                if (pair == null) {
                    return;
                }
                BluetoothGattDescriptor bluetoothGattDescriptor = (BluetoothGattDescriptor) pair.getSecond();
                if (Build.VERSION.SDK_INT >= 33) {
                    writeDescriptor2 = gatt.writeDescriptor(bluetoothGattDescriptor, BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
                    writeDescriptor = writeDescriptor2 == 0;
                } else {
                    bluetoothGattDescriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
                    writeDescriptor = gatt.writeDescriptor(bluetoothGattDescriptor);
                }
                BleManager.this.sendLog(defpackage.a.f9225a, StubApp.getString2(11260) + gatt.getDevice().getAddress() + StubApp.getString2(11263) + bluetoothGattDescriptor.getUuid() + StubApp.getString2(11264) + bluetoothGattDescriptor.getCharacteristic().getUuid() + StubApp.getString2(11265) + pair.getFirst() + StubApp.getString2(11266) + writeDescriptor);
            }

            private final void requestDeviceMtu(BluetoothGatt gatt) {
                BleDevice findConnectedDevice = BleManager.this.findConnectedDevice(gatt.getDevice().getAddress());
                if (findConnectedDevice == null) {
                    return;
                }
                BleConfig belongConfig = findConnectedDevice.getBelongConfig();
                gatt.requestMtu(belongConfig.getMtu());
                BleManager.this.sendLog(defpackage.a.f9225a, StubApp.getString2(11260) + findConnectedDevice.getUuid() + StubApp.getString2(11267) + belongConfig.getMtu());
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onCharacteristicChanged(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic) {
                BluetoothDevice device;
                BlePrivateService blePrivateService;
                I i3;
                BleConfig belongConfig;
                List<BlePrivateService> privateServices;
                Object obj;
                super.onCharacteristicChanged(gatt, characteristic);
                String string2 = StubApp.getString2(11268);
                String str = null;
                if (gatt == null || characteristic == null) {
                    BleManager bleManager = BleManager.this;
                    defpackage.a aVar = defpackage.a.f9226b;
                    if (gatt != null && (device = gatt.getDevice()) != null) {
                        str = device.getAddress();
                    }
                    bleManager.sendLog(aVar, string2 + str + StubApp.getString2(11272));
                    return;
                }
                BleDevice findConnectedDevice = BleManager.this.findConnectedDevice(gatt.getDevice().getAddress());
                if (findConnectedDevice == null || (belongConfig = findConnectedDevice.getBelongConfig()) == null || (privateServices = belongConfig.getPrivateServices()) == null) {
                    blePrivateService = null;
                } else {
                    Iterator<T> it = privateServices.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it.next();
                            if (Intrinsics.areEqual(((BlePrivateService) obj).getReadCharsUUID(), characteristic.getUuid())) {
                                break;
                            }
                        }
                    }
                    blePrivateService = (BlePrivateService) obj;
                }
                if (blePrivateService == null) {
                    BleManager.this.sendLog(defpackage.a.f9226b, string2 + gatt.getDevice().getAddress() + StubApp.getString2(11269));
                    return;
                }
                String address = gatt.getDevice().getAddress();
                Intrinsics.checkNotNullExpressionValue(address, "getAddress(...)");
                Map<String, Object> map = new BleCmd(address, blePrivateService.getType(), characteristic.getValue(), true).toMap();
                i3 = BleManager.this.mainScope;
                if (i3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mainScope");
                    i3 = null;
                }
                L.j(i3, null, new BleManager$createConnectCallBack$1$onCharacteristicChanged$1(map, null), 3);
                BleManager.this.sendLog(defpackage.a.f9225a, StubApp.getString2(11270) + gatt.getDevice().getAddress() + StubApp.getString2(2148) + blePrivateService.getType() + StubApp.getString2(5307) + characteristic.getValue().length + StubApp.getString2(11271) + characteristic.getWriteType());
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onCharacteristicWrite(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic, int status) {
                BluetoothDevice device;
                String address;
                ConcurrentLinkedQueue concurrentLinkedQueue;
                List list;
                Object obj;
                super.onCharacteristicWrite(gatt, characteristic, status);
                if (gatt == null || (device = gatt.getDevice()) == null || (address = device.getAddress()) == null) {
                    return;
                }
                BleManager bleManager = BleManager.this;
                concurrentLinkedQueue = bleManager.sendCmdQueue;
                BleCmd bleCmd = (BleCmd) concurrentLinkedQueue.poll();
                if (bleCmd != null) {
                    list = bleManager.connectedDevices;
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it.next();
                            if (Intrinsics.areEqual(((BleDevice) obj).getUuid(), address)) {
                                break;
                            }
                        }
                    }
                    BleDevice bleDevice = (BleDevice) obj;
                    if (bleDevice != null) {
                        bleDevice.writeCharacteristic(bleCmd.getData(), bleCmd.getPsType());
                    }
                    bleManager.sendLog(defpackage.a.f9225a, StubApp.getString2(11273) + gatt.getDevice().getAddress() + StubApp.getString2(11274) + (status == 0));
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public synchronized void onConnectionStateChange(BluetoothGatt gatt, int status, int newState) {
                Queue queue;
                boolean isBluetoothEnabled;
                List list;
                Object obj;
                Object obj2;
                List list2;
                List list3;
                String string2 = StubApp.getString2(11260);
                String string22 = StubApp.getString2(11260);
                synchronized (this) {
                    try {
                        Intrinsics.checkNotNullParameter(gatt, "gatt");
                        BluetoothDevice device = gatt.getDevice();
                        queue = BleManager.this.descriptorQueue;
                        queue.clear();
                        if (newState == 0) {
                            isBluetoothEnabled = BleManager.this.isBluetoothEnabled();
                            if (!isBluetoothEnabled) {
                                BleManager.this.sendLog(defpackage.a.f9226b, string2 + gatt.getDevice().getAddress() + StubApp.getString2("11276"));
                                return;
                            }
                            this.isPsHandleFinish = false;
                            list = BleManager.this.connectedDevices;
                            Iterator it = list.iterator();
                            while (true) {
                                obj = null;
                                if (!it.hasNext()) {
                                    obj2 = null;
                                    break;
                                } else {
                                    obj2 = it.next();
                                    if (Intrinsics.areEqual(((BleDevice) obj2).getUuid(), device.getAddress())) {
                                        break;
                                    }
                                }
                            }
                            BleDevice bleDevice = (BleDevice) obj2;
                            if (bleDevice == null) {
                                BleManager.this.sendLog(defpackage.a.f9226b, StubApp.getString2("11260") + gatt.getDevice().getAddress() + StubApp.getString2("11277") + status + StubApp.getString2("74"));
                                return;
                            }
                            if (bleDevice.getConnectState().isConnecting()) {
                                BleManager.this.sendLog(defpackage.a.f9226b, StubApp.getString2("11260") + gatt.getDevice().getAddress() + StubApp.getString2("11278"));
                                return;
                            }
                            try {
                                gatt.close();
                            } catch (Exception e10) {
                                BleManager.this.sendLog(defpackage.a.f9226b, StubApp.getString2("11260") + gatt.getDevice().getAddress() + StubApp.getString2("11279") + e10.getMessage());
                            }
                            if (status == 8) {
                                BleManager.this.refreshDeviceCache(gatt);
                            }
                            list2 = BleManager.this.disconnectingDevices;
                            Iterator it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                Object next = it2.next();
                                if (Intrinsics.areEqual(((Pair) next).getFirst(), bleDevice.getUuid())) {
                                    obj = next;
                                    break;
                                }
                            }
                            Pair pair = (Pair) obj;
                            if (pair != null) {
                                list3 = BleManager.this.disconnectingDevices;
                                list3.remove(pair);
                                BleManager.this.sendLog(defpackage.a.f9226b, StubApp.getString2("11260") + gatt.getDevice().getAddress() + StubApp.getString2("11280") + pair.getSecond() + StubApp.getString2("11281"));
                                return;
                            }
                            BleManager.this.sendLog(defpackage.a.f9226b, StubApp.getString2("11260") + gatt.getDevice().getAddress() + StubApp.getString2("11282") + BluetoothGattStatus.INSTANCE.getStatusDescription(status) + StubApp.getString2("74"));
                            if (status == 22) {
                                return;
                            }
                            BleManager bleManager = BleManager.this;
                            String address = device.getAddress();
                            Intrinsics.checkNotNullExpressionValue(address, "getAddress(...)");
                            String name = device.getName();
                            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                            BleManager.handleConnectState$default(bleManager, address, name, BleConnectState.DISCONNECT_FROM_SYS, false, 0, 24, null);
                        } else if (newState == 2) {
                            gatt.discoverServices();
                            BleManager bleManager2 = BleManager.this;
                            String address2 = device.getAddress();
                            Intrinsics.checkNotNullExpressionValue(address2, "getAddress(...)");
                            String name2 = device.getName();
                            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                            BleManager.handleConnectState$default(bleManager2, address2, name2, BleConnectState.SEARCH_SERVICE, false, 0, 24, null);
                            BleManager.this.sendLog(defpackage.a.f9225a, string22 + device.getAddress() + StubApp.getString2("11275"));
                        }
                    } finally {
                    }
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onDescriptorWrite(BluetoothGatt gatt, BluetoothGattDescriptor descriptor, int status) {
                BluetoothDevice device;
                super.onDescriptorWrite(gatt, descriptor, status);
                if (this.isPsHandleFinish) {
                    BleManager.this.sendLog(defpackage.a.f9225a, StubApp.getString2(11260) + ((gatt == null || (device = gatt.getDevice()) == null) ? null : device.getAddress()) + StubApp.getString2(11283) + (status == 0));
                    processNextDescriptor(gatt);
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onMtuChanged(BluetoothGatt gatt, int mtu, int status) {
                BluetoothDevice device;
                super.onMtuChanged(gatt, mtu, status);
                if (this.isPsHandleFinish) {
                    BleManager bleManager = BleManager.this;
                    defpackage.a aVar = defpackage.a.f9225a;
                    StringBuilder t3 = u.t(StubApp.getString2(11260), (gatt == null || (device = gatt.getDevice()) == null) ? null : device.getAddress(), StubApp.getString2(11286), status == 0 ? StubApp.getString2(11284) : StubApp.getString2(11285), StubApp.getString2(11287));
                    t3.append(mtu);
                    t3.append(StubApp.getString2(11288));
                    bleManager.sendLog(aVar, t3.toString());
                    if (gatt != null) {
                        connectingFlowFinish(gatt, mtu);
                    }
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onServicesDiscovered(BluetoothGatt gatt, int status) {
                List list;
                Object obj;
                Queue queue;
                Intrinsics.checkNotNullParameter(gatt, "gatt");
                String address = gatt.getDevice().getAddress();
                String name = gatt.getDevice().getName();
                list = BleManager.this.connectedDevices;
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (Intrinsics.areEqual(((BleDevice) obj).getUuid(), gatt.getDevice().getAddress())) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                BleDevice bleDevice = (BleDevice) obj;
                if (bleDevice == null) {
                    return;
                }
                String string2 = StubApp.getString2(11260);
                if (status != 0) {
                    BleManager bleManager = BleManager.this;
                    Intrinsics.checkNotNull(address);
                    Intrinsics.checkNotNull(name);
                    BleManager.handleConnectState$default(bleManager, address, name, BleConnectState.SERVICE_FAIL, false, 0, 24, null);
                    BleManager.this.sendLog(defpackage.a.f9226b, string2 + address + StubApp.getString2(11289));
                    return;
                }
                boolean z2 = true;
                this.isPsHandleFinish = true;
                List<BlePrivateService> privateServices = bleDevice.getBelongConfig().getPrivateServices();
                BleManager bleManager2 = BleManager.this;
                for (BlePrivateService blePrivateService : privateServices) {
                    String service = blePrivateService.getService();
                    BluetoothGattService service2 = gatt.getService(blePrivateService.getServiceUUID());
                    BluetoothGattCharacteristic characteristic = service2 != null ? service2.getCharacteristic(blePrivateService.getWriteCharsUUID()) : null;
                    String string22 = StubApp.getString2(81);
                    if (characteristic == null) {
                        bleManager2.sendLog(defpackage.a.f9226b, AbstractC1482f.j(string2, address, string22, service, StubApp.getString2(11290)));
                        Intrinsics.checkNotNull(address);
                        Intrinsics.checkNotNull(name);
                        BleManager.handleConnectState$default(bleManager2, address, name, BleConnectState.CHARS_FAIL, false, 0, 24, null);
                        this.isPsHandleFinish = false;
                        return;
                    }
                    BluetoothGattCharacteristic characteristic2 = service2.getCharacteristic(blePrivateService.getReadCharsUUID());
                    if (characteristic2 == null) {
                        bleManager2.sendLog(defpackage.a.f9226b, AbstractC1482f.j(string2, address, string22, service, StubApp.getString2(11291)));
                        Intrinsics.checkNotNull(address);
                        Intrinsics.checkNotNull(name);
                        BleManager.handleConnectState$default(bleManager2, address, name, BleConnectState.CHARS_FAIL, false, 0, 24, null);
                        this.isPsHandleFinish = false;
                        return;
                    }
                    boolean characteristicNotification = gatt.setCharacteristicNotification(characteristic2, z2);
                    defpackage.a aVar = defpackage.a.f9225a;
                    StringBuilder t3 = u.t(string2, address, string22, service, StubApp.getString2(11292));
                    t3.append(characteristicNotification);
                    bleManager2.sendLog(aVar, t3.toString());
                    BluetoothGattDescriptor descriptor = characteristic2.getDescriptor(BleManager.INSTANCE.getCccdDescriptor());
                    queue = bleManager2.descriptorQueue;
                    queue.add(new Pair(Integer.valueOf(blePrivateService.getType()), descriptor));
                    bleDevice.update(gatt, Integer.valueOf(blePrivateService.getType()), characteristic, characteristic2);
                    z2 = true;
                }
                if (this.isPsHandleFinish) {
                    processNextDescriptor(gatt);
                }
            }
        };
    }

    private final ScanCallback createScanCallBack() {
        return new ScanCallback() { // from class: com.fzfstudio.ezw_ble.ble.BleManager$createScanCallBack$1
            @Override // android.bluetooth.le.ScanCallback
            public void onBatchScanResults(List<ScanResult> results) {
                Intrinsics.checkNotNullParameter(results, "results");
                BleManager.this.sendLog(defpackage.a.f9225a, StubApp.getString2(11293) + results);
            }

            @Override // android.bluetooth.le.ScanCallback
            public void onScanFailed(int errorCode) {
                BleManager.this.sendLog(defpackage.a.f9226b, StubApp.getString2(11294) + errorCode);
            }

            @Override // android.bluetooth.le.ScanCallback
            public void onScanResult(int callbackType, ScanResult result) {
                List list;
                Object obj;
                List list2;
                Object obj2;
                boolean z2;
                List list3;
                List list4;
                boolean contains$default;
                List list5;
                Object obj3;
                boolean contains$default2;
                String string2 = StubApp.getString2(3674);
                Intrinsics.checkNotNullParameter(result, "result");
                try {
                    BluetoothDevice device = result.getDevice();
                    String name = device.getName();
                    if (name != null && name.length() != 0) {
                        list = BleManager.this.scanResultTemp;
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                if (Intrinsics.areEqual(((BleDevice) obj).getUuid(), device.getAddress())) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        if (obj != null) {
                            return;
                        }
                        list2 = BleManager.this.bleConfigs;
                        Iterator it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it2.next();
                            Iterator<T> it3 = ((BleConfig) obj2).getScan().getNameFilters().iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    obj3 = null;
                                    break;
                                }
                                obj3 = it3.next();
                                String name2 = device.getName();
                                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                                contains$default2 = StringsKt__StringsKt.contains$default(name2, (CharSequence) ((String) obj3), false, 2, (Object) null);
                                if (contains$default2) {
                                    break;
                                }
                            }
                            if (obj3 != null) {
                                break;
                            }
                        }
                        BleConfig bleConfig = (BleConfig) obj2;
                        if (bleConfig == null) {
                            return;
                        }
                        z2 = BleManager.this.scanPureMode;
                        if (z2) {
                            String uuid = UUID.randomUUID().toString();
                            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                            Intrinsics.checkNotNull(device);
                            BleDevice bleDevice = BluetoothDeviceExtKt.toBleDevice(device, bleConfig, uuid, result.getRssi());
                            list5 = BleManager.this.scanResultTemp;
                            list5.add(bleDevice);
                            BleManager.this.sendMatchDevices(uuid, CollectionsKt.listOf(bleDevice));
                            return;
                        }
                        String name3 = device.getName();
                        BleSnRule snRule = bleConfig.getScan().getSnRule();
                        if (snRule != null) {
                            BleManager bleManager = BleManager.this;
                            ScanRecord scanRecord = result.getScanRecord();
                            name3 = bleManager.parseDataToObtainSn(scanRecord != null ? scanRecord.getBytes() : null, snRule);
                            if (name3.length() == 0) {
                                return;
                            }
                            if (!snRule.getFilters().isEmpty()) {
                                List<String> filters = snRule.getFilters();
                                if (filters == null || !filters.isEmpty()) {
                                    Iterator<T> it4 = filters.iterator();
                                    while (it4.hasNext()) {
                                        contains$default = StringsKt__StringsKt.contains$default(name3, (CharSequence) ((String) it4.next()), false, 2, (Object) null);
                                        if (contains$default) {
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                        }
                        Intrinsics.checkNotNull(device);
                        Intrinsics.checkNotNullExpressionValue(name3, string2);
                        BleDevice bleDevice2 = BluetoothDeviceExtKt.toBleDevice(device, bleConfig, name3, result.getRssi());
                        list3 = BleManager.this.scanResultTemp;
                        list3.add(bleDevice2);
                        if (bleConfig.getScan().getMatchCount() < 2) {
                            BleManager bleManager2 = BleManager.this;
                            Intrinsics.checkNotNullExpressionValue(name3, string2);
                            bleManager2.sendMatchDevices(name3, CollectionsKt.listOf(bleDevice2));
                            return;
                        }
                        list4 = BleManager.this.scanResultTemp;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj4 : list4) {
                            if (Intrinsics.areEqual(((BleDevice) obj4).getSn(), bleDevice2.getSn())) {
                                arrayList.add(obj4);
                            }
                        }
                        if (arrayList.size() != bleConfig.getScan().getMatchCount()) {
                            return;
                        }
                        BleManager bleManager3 = BleManager.this;
                        Intrinsics.checkNotNullExpressionValue(name3, string2);
                        bleManager3.sendMatchDevices(name3, arrayList);
                    }
                } catch (Exception e10) {
                    BleManager.this.sendLog(defpackage.a.f9226b, StubApp.getString2(11295) + e10.getMessage());
                }
            }
        };
    }

    public static /* synthetic */ void disconnect$default(BleManager bleManager, String str, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        bleManager.disconnect(str, z2);
    }

    private final void disconnectDevice(String uuid, BleConnectState state, boolean removeBond) {
        Object obj;
        if (state != BleConnectState.DISCONNECT_FROM_SYS) {
            CollectionsKt__MutableCollectionsKt.removeAll((List) this.disconnectingDevices, (Function1) new a(uuid, 0));
            this.disconnectingDevices.add(new Pair<>(uuid, state));
        }
        Iterator<T> it = this.connectedDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.areEqual(((BleDevice) obj).getUuid(), uuid)) {
                    break;
                }
            }
        }
        BleDevice bleDevice = (BleDevice) obj;
        if (bleDevice != null) {
            bleDevice.releaseAndClear();
            if (removeBond) {
                removeBond(bleDevice.getUuid());
            }
            sendLog(defpackage.a.f9225a, AbstractC1482f.g(bleDevice.getName(), StubApp.getString2(11303)));
        }
        CollectionsKt__MutableCollectionsKt.removeAll((List) this.waitingConnectDevices, (Function1) new a(uuid, 1));
        this.sendCmdQueue.clear();
    }

    public static /* synthetic */ void disconnectDevice$default(BleManager bleManager, String str, BleConnectState bleConnectState, boolean z2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        bleManager.disconnectDevice(str, bleConnectState, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean disconnectDevice$lambda$17(String str, Pair it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getFirst(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean disconnectDevice$lambda$20(String str, BleConnectTemp temp) {
        Intrinsics.checkNotNullParameter(temp, "temp");
        if (!Intrinsics.areEqual(temp.getUuid(), str)) {
            return false;
        }
        Timer timeoutTimer = temp.getTimeoutTimer();
        if (timeoutTimer != null) {
            timeoutTimer.cancel();
        }
        temp.setTimeoutTimer(null);
        return true;
    }

    private final BluetoothAdapter getBluetoothAdapter() {
        BluetoothManager bluetoothManager = this.bluetoothManager;
        if (bluetoothManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bluetoothManager");
            bluetoothManager = null;
        }
        BluetoothAdapter adapter = bluetoothManager.getAdapter();
        Intrinsics.checkNotNullExpressionValue(adapter, "getAdapter(...)");
        return adapter;
    }

    private final ScanSettings getScanSettings() {
        return (ScanSettings) this.scanSettings.getValue();
    }

    private final void handleConnectState(String uuid, String name, BleConnectState state, boolean removeBond, int mtu) {
        I i3;
        for (BleDevice bleDevice : this.connectedDevices) {
            if (Intrinsics.areEqual(bleDevice.getUuid(), uuid)) {
                bleDevice.setConnectState(state);
            }
        }
        if (state.isConnecting()) {
            CollectionsKt__MutableCollectionsKt.removeAll((List) this.disconnectingDevices, (Function1) new a(uuid, 2));
        } else if (state.isDisconnected() || state.isError()) {
            disconnectDevice(uuid, state, removeBond);
        } else if (state.isConnected()) {
            CollectionsKt__MutableCollectionsKt.removeAll((List) this.waitingConnectDevices, (Function1) new a(uuid, 3));
            CollectionsKt__MutableCollectionsKt.removeAll((List) this.disconnectingDevices, (Function1) new a(uuid, 4));
        }
        if (!state.isConnecting() && !this.upgradeDevices.contains(uuid) && !this.waitingConnectDevices.isEmpty()) {
            BleConnectTemp bleConnectTemp = (BleConnectTemp) CollectionsKt.first((List) this.waitingConnectDevices);
            connect$default(this, bleConnectTemp.getBelongConfig().getName(), bleConnectTemp.getUuid(), bleConnectTemp.getName(), bleConnectTemp.getSn(), true, bleConnectTemp.getAfterUpgrade(), false, 64, null);
        }
        I i10 = this.mainScope;
        if (i10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainScope");
            i3 = null;
        } else {
            i3 = i10;
        }
        L.j(i3, null, new BleManager$handleConnectState$5(uuid, name, state, mtu, null), 3);
    }

    public static /* synthetic */ void handleConnectState$default(BleManager bleManager, String str, String str2, BleConnectState bleConnectState, boolean z2, int i3, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z2 = false;
        }
        boolean z10 = z2;
        if ((i10 & 16) != 0) {
            i3 = 247;
        }
        bleManager.handleConnectState(str, str2, bleConnectState, z10, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean handleConnectState$lambda$22(String str, Pair it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getFirst(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean handleConnectState$lambda$23(String str, BleConnectTemp it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!Intrinsics.areEqual(it.getUuid(), str)) {
            return false;
        }
        Timer timeoutTimer = it.getTimeoutTimer();
        if (timeoutTimer != null) {
            timeoutTimer.cancel();
        }
        it.setTimeoutTimer(null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean handleConnectState$lambda$24(String str, Pair it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getFirst(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isBluetoothEnabled() {
        try {
            return getBluetoothAdapter().isEnabled();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String parseDataToObtainSn(byte[] bytes, BleSnRule snRule) {
        if (bytes == null) {
            return "";
        }
        int startSubIndex = snRule.getStartSubIndex();
        if (startSubIndex > bytes.length) {
            startSubIndex = 0;
        }
        int length = bytes.length;
        if (snRule.getByteLength() > 0 && length > snRule.getByteLength() - startSubIndex) {
            length = snRule.getByteLength();
        }
        return replaceControlCharacters(new String(ArraysKt.copyOfRange(bytes, startSubIndex, length), Charsets.UTF_8), snRule);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean refreshDeviceCache(BluetoothGatt gatt) {
        String string2 = StubApp.getString2(999);
        if (gatt != null) {
            try {
                Method method = gatt.getClass().getMethod(StubApp.getString2("11304"), new Class[0]);
                if (method != null) {
                    Object invoke = method.invoke(gatt, new Object[0]);
                    Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type kotlin.Boolean");
                    boolean booleanValue = ((Boolean) invoke).booleanValue();
                    sendLog(defpackage.a.f9225a, gatt.getDevice().getAddress() + string2 + gatt.getDevice().getName() + StubApp.getString2("11305") + booleanValue);
                    return booleanValue;
                }
            } catch (Exception e10) {
                sendLog(defpackage.a.f9226b, gatt.getDevice().getAddress() + string2 + gatt.getDevice().getName() + StubApp.getString2(11306) + e10.getMessage());
            }
        }
        return false;
    }

    private final void removeBond(String address) {
        BluetoothDevice remoteDevice = getBluetoothAdapter().getRemoteDevice(address);
        Intrinsics.checkNotNullExpressionValue(remoteDevice, "getRemoteDevice(...)");
        try {
            Object invoke = remoteDevice.getClass().getMethod(StubApp.getString2("11242"), new Class[0]).invoke(remoteDevice, new Object[0]);
            Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((Boolean) invoke).booleanValue();
            sendLog(defpackage.a.f9225a, address + StubApp.getString2("11307") + booleanValue);
        } catch (Exception e10) {
            sendLog(defpackage.a.f9226b, AbstractC1482f.h(address, StubApp.getString2(11308), e10.getMessage()));
        }
    }

    private final String replaceControlCharacters(String preSn, BleSnRule snRule) {
        if (snRule.getReplaceRex().length() == 0) {
            return preSn;
        }
        String replaceAll = Pattern.compile(snRule.getReplaceRex()).matcher(preSn).replaceAll("");
        Intrinsics.checkNotNullExpressionValue(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScanSettings scanSettings_delegate$lambda$0() {
        return new ScanSettings.Builder().setScanMode(2).build();
    }

    public static /* synthetic */ void sendCmd$default(BleManager bleManager, String str, byte[] bArr, int i3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            i3 = 0;
        }
        bleManager.sendCmd(str, bArr, i3);
    }

    public static /* synthetic */ void sendCmdNoWait$default(BleManager bleManager, String str, byte[] bArr, int i3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            i3 = 0;
        }
        bleManager.sendCmdNoWait(str, bArr, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendLog(defpackage.a tag, String log) {
        I i3 = this.mainScope;
        if (i3 != null) {
            InterfaceC0221t0 interfaceC0221t0 = (InterfaceC0221t0) i3.h().get(C0219s0.f5892a);
            if (interfaceC0221t0 != null ? interfaceC0221t0.a() : true) {
                I i10 = this.mainScope;
                if (i10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mainScope");
                    i10 = null;
                }
                L.j(i10, null, new BleManager$sendLog$1(tag, log, null), 3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendMatchDevices(String sn, List<BleDevice> devices) {
        BleMatchDevice bleMatchDevice = new BleMatchDevice(sn, devices);
        String json = bleMatchDevice.toJson();
        EventChannel.EventSink event = BleEC.SCAN_RESULT.getEvent();
        if (event != null) {
            event.success(bleMatchDevice.toJson());
        }
        sendLog(defpackage.a.f9225a, E1.a.k(StubApp.getString2(11309), json, StubApp.getString2(74)));
    }

    public static /* synthetic */ void startScan$default(BleManager bleManager, boolean z2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z2 = false;
        }
        bleManager.startScan(z2);
    }

    public static /* synthetic */ void stopScan$default(BleManager bleManager, boolean z2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z2 = false;
        }
        bleManager.stopScan(z2);
    }

    public final void checkBluetoothPermission() {
        Context context;
        WeakReference<Context> weakReference = this.weakContext;
        if (weakReference == null || (context = weakReference.get()) == null) {
            return;
        }
        boolean z2 = false;
        boolean z10 = Build.VERSION.SDK_INT < 31 ? context.checkSelfPermission(StubApp.getString2(11310)) == 0 : context.checkSelfPermission(StubApp.getString2(1850)) == 0 && context.checkSelfPermission(StubApp.getString2(1829)) == 0;
        this.blePermission = z10;
        defpackage.a aVar = defpackage.a.f9225a;
        sendLog(aVar, StubApp.getString2(11311) + z10);
        if (context.checkSelfPermission(StubApp.getString2(140)) == 0 && context.checkSelfPermission(StubApp.getString2(141)) == 0) {
            z2 = true;
        }
        this.bleLocation = z2;
        EventChannel.EventSink event = BleEC.BLE_STATE.getEvent();
        if (event != null) {
            event.success(Integer.valueOf(getCurrentBleState()));
        }
        sendLog(aVar, StubApp.getString2(11312) + this.bleLocation + StubApp.getString2(11313) + getCurrentBleState());
    }

    public final void cleanConnectCache() {
        Iterator<T> it = this.waitingConnectDevices.iterator();
        while (it.hasNext()) {
            Timer timeoutTimer = ((BleConnectTemp) it.next()).getTimeoutTimer();
            if (timeoutTimer != null) {
                timeoutTimer.cancel();
            }
        }
        this.waitingConnectDevices.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11, types: [T, com.fzfstudio.ezw_ble.ble.models.BleDevice, java.lang.Object] */
    public final synchronized void connect(String belongConfig, String uuid, String name, String sn, boolean isWaitingDevice, boolean afterUpgrade, boolean retryWhenNoFoudDevice) {
        Object obj;
        Object obj2;
        String str;
        boolean z2;
        BleConfig bleConfig;
        T t3;
        Ref.ObjectRef objectRef;
        BleManager bleManager;
        Object obj3;
        I i3;
        String string2 = StubApp.getString2(11247);
        synchronized (this) {
            try {
                try {
                    Intrinsics.checkNotNullParameter(belongConfig, "belongConfig");
                    Intrinsics.checkNotNullParameter(uuid, "uuid");
                    Intrinsics.checkNotNullParameter(name, "name");
                    Intrinsics.checkNotNullParameter(sn, "sn");
                    if (checkIsFunctionCanBeCalled()) {
                        if (uuid.length() == 0) {
                            handleConnectState$default(this, uuid, name, BleConnectState.EMPTY_UUID, false, 0, 24, null);
                            sendLog(defpackage.a.f9226b, string2 + uuid + StubApp.getString2("11314"));
                            return;
                        }
                        Iterator<T> it = this.bleConfigs.iterator();
                        while (true) {
                            obj = null;
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            } else {
                                obj2 = it.next();
                                if (Intrinsics.areEqual(((BleConfig) obj2).getName(), belongConfig)) {
                                    break;
                                }
                            }
                        }
                        BleConfig bleConfig2 = (BleConfig) obj2;
                        if (bleConfig2 == null) {
                            handleConnectState$default(this, uuid, name, BleConnectState.NO_BLE_CONFIG_FOUND, false, 0, 24, null);
                            sendLog(defpackage.a.f9226b, StubApp.getString2("11247") + uuid + StubApp.getString2("11315"));
                            return;
                        }
                        this.preConnectedDevices.remove(uuid);
                        if (!afterUpgrade && this.upgradeDevices.contains(uuid)) {
                            this.upgradeDevices.remove(uuid);
                        }
                        BluetoothDevice remoteDevice = getBluetoothAdapter().getRemoteDevice(uuid);
                        defpackage.a aVar = defpackage.a.f9226b;
                        sendLog(aVar, StubApp.getString2("11247") + uuid + StubApp.getString2("11316") + remoteDevice.getName() + StubApp.getString2("11317") + remoteDevice.getBondState());
                        if (retryWhenNoFoudDevice && remoteDevice.getName() == null) {
                            handleConnectState$default(this, uuid, name, BleConnectState.CONNECTING, false, 0, 24, null);
                            startScan$default(this, false, 1, null);
                            I i10 = this.mainScope;
                            if (i10 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mainScope");
                                i3 = null;
                            } else {
                                i3 = i10;
                            }
                            L.j(i3, null, new BleManager$connect$1(this, belongConfig, uuid, name, sn, isWaitingDevice, afterUpgrade, null), 3);
                            sendLog(aVar, StubApp.getString2("11247") + uuid + StubApp.getString2("11318"));
                            return;
                        }
                        try {
                            try {
                                if (remoteDevice.getName() == null) {
                                    handleConnectState$default(this, uuid, name, BleConnectState.NO_DEVICE_FOUND, false, 0, 24, null);
                                    sendLog(aVar, StubApp.getString2("11247") + uuid + StubApp.getString2("11319"));
                                    return;
                                }
                                BleConnectTemp bleConnectTemp = (BleConnectTemp) CollectionsKt.firstOrNull((List) this.waitingConnectDevices);
                                if (bleConnectTemp != null && !Intrinsics.areEqual(bleConnectTemp.getBelongConfig().getName(), bleConfig2.getName())) {
                                    sendLog(defpackage.a.f9225a, StubApp.getString2("11247") + uuid + StubApp.getString2("11320") + bleConfig2.getName() + StubApp.getString2("11321") + bleConnectTemp.getName());
                                    return;
                                }
                                List<BleConnectTemp> list = this.waitingConnectDevices;
                                if (list == null || !list.isEmpty()) {
                                    Iterator<T> it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        if (Intrinsics.areEqual(((BleConnectTemp) it2.next()).getUuid(), uuid)) {
                                            str = sn;
                                            z2 = afterUpgrade;
                                            bleConfig = bleConfig2;
                                            break;
                                        }
                                    }
                                }
                                bleConfig = bleConfig2;
                                str = sn;
                                z2 = afterUpgrade;
                                this.waitingConnectDevices.add(new BleConnectTemp(bleConfig, uuid, name, sn, afterUpgrade));
                                if (this.waitingConnectDevices.size() > 1) {
                                    handleConnectState$default(this, uuid, name, BleConnectState.CONNECTING, false, 0, 24, null);
                                    Iterator<T> it3 = this.waitingConnectDevices.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            obj3 = null;
                                            break;
                                        } else {
                                            obj3 = it3.next();
                                            if (!Intrinsics.areEqual(((BleConnectTemp) obj3).getUuid(), uuid)) {
                                                break;
                                            }
                                        }
                                    }
                                    BleConnectTemp bleConnectTemp2 = (BleConnectTemp) obj3;
                                    sendLog(defpackage.a.f9225a, StubApp.getString2("11247") + uuid + StubApp.getString2("11322") + (bleConnectTemp2 != null ? bleConnectTemp2.getUuid() : null) + StubApp.getString2("11323"));
                                    return;
                                }
                                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                                Iterator<T> it4 = this.connectedDevices.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        t3 = 0;
                                        break;
                                    }
                                    Object next = it4.next();
                                    if (Intrinsics.areEqual(((BleDevice) next).getUuid(), uuid)) {
                                        t3 = next;
                                        break;
                                    }
                                }
                                objectRef2.element = t3;
                                if (t3 == 0) {
                                    ?? bleDevice = BluetoothDeviceExtKt.toBleDevice(remoteDevice, bleConfig, str, 0);
                                    objectRef2.element = bleDevice;
                                    this.connectedDevices.add(bleDevice);
                                } else if (((BleDevice) t3).isConnected()) {
                                    CollectionsKt__MutableCollectionsKt.removeAll((List) this.waitingConnectDevices, (Function1) new X2.u(objectRef2, 2));
                                    sendLog(defpackage.a.f9225a, StubApp.getString2("11247") + uuid + StubApp.getString2("11324"));
                                    return;
                                }
                                BleManager$createConnectCallBack$1 createConnectCallBack = createConnectCallBack();
                                WeakReference<Context> weakReference = this.weakContext;
                                BluetoothGatt connectGatt = remoteDevice.connectGatt(weakReference != null ? weakReference.get() : null, false, createConnectCallBack, 2, 2);
                                BleDevice bleDevice2 = (BleDevice) objectRef2.element;
                                Intrinsics.checkNotNull(connectGatt);
                                BleDevice.update$default(bleDevice2, connectGatt, null, null, null, 14, null);
                                connectGatt.readRemoteRssi();
                                Timer timer = new Timer();
                                timer.schedule(new BleManager$connect$4(this, uuid, name), ((long) bleConfig.getConnectTimeout()) + (z2 ? (long) bleConfig.getUpgradeSwapTime() : 0L));
                                Iterator<T> it5 = this.waitingConnectDevices.iterator();
                                while (true) {
                                    if (!it5.hasNext()) {
                                        break;
                                    }
                                    Object next2 = it5.next();
                                    if (Intrinsics.areEqual(((BleConnectTemp) next2).getUuid(), uuid)) {
                                        obj = next2;
                                        break;
                                    }
                                }
                                BleConnectTemp bleConnectTemp3 = (BleConnectTemp) obj;
                                if (bleConnectTemp3 != null) {
                                    bleConnectTemp3.setTimeoutTimer(timer);
                                }
                                if (isWaitingDevice) {
                                    objectRef = objectRef2;
                                    bleManager = this;
                                } else {
                                    objectRef = objectRef2;
                                    bleManager = this;
                                    handleConnectState$default(bleManager, uuid, name, BleConnectState.CONNECTING, false, 0, 24, null);
                                }
                                bleManager.sendLog(defpackage.a.f9225a, StubApp.getString2("11247") + uuid + StubApp.getString2("11325") + ((BleDevice) objectRef.element).getBelongConfig() + StubApp.getString2("11326") + z2);
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public final void disconnect(String uuid, boolean removeBond) {
        Object obj;
        String str;
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        sendLog(defpackage.a.f9225a, E1.a.k(StubApp.getString2(11327), uuid, StubApp.getString2(11328)));
        this.preConnectedDevices.remove(uuid);
        Iterator<T> it = this.connectedDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.areEqual(((BleDevice) obj).getUuid(), uuid)) {
                    break;
                }
            }
        }
        BleDevice bleDevice = (BleDevice) obj;
        if (bleDevice == null || (str = bleDevice.getName()) == null) {
            str = "";
        }
        handleConnectState$default(this, uuid, str, BleConnectState.DISCONNECT_BY_USER, removeBond, 0, 16, null);
    }

    public final void enterUpgradeState(String uuid) {
        Object obj;
        String str;
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        if (this.upgradeDevices.contains(uuid)) {
            return;
        }
        this.upgradeDevices.add(uuid);
        Iterator<T> it = this.connectedDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.areEqual(((BleDevice) obj).getUuid(), uuid)) {
                    break;
                }
            }
        }
        BleDevice bleDevice = (BleDevice) obj;
        if (bleDevice == null || (str = bleDevice.getName()) == null) {
            str = "";
        }
        handleConnectState$default(this, uuid, str, BleConnectState.UPGRADE, false, 0, 24, null);
        sendLog(defpackage.a.f9225a, E1.a.k(StubApp.getString2(11329), uuid, StubApp.getString2(11330)));
    }

    public final BleDevice findConnectedDevice(String uuid) {
        Object obj = null;
        if (uuid == null || uuid.length() == 0) {
            return null;
        }
        Iterator<T> it = this.connectedDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((BleDevice) next).getUuid(), uuid)) {
                obj = next;
                break;
            }
        }
        return (BleDevice) obj;
    }

    public final int getCurrentBleState() {
        if (!this.bleLocation) {
            return 6;
        }
        if (this.blePermission) {
            return this.bleState;
        }
        return 3;
    }

    public final void init(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        L0 b2 = L.b();
        d dVar = W.f5838a;
        this.mainScope = new f(CoroutineContext.Element.DefaultImpls.plus(b2, q.f7968a));
        this.weakContext = new WeakReference<>(context);
        Object systemService = context.getSystemService((Class<Object>) BluetoothManager.class);
        Intrinsics.checkNotNull(systemService);
        this.bluetoothManager = (BluetoothManager) systemService;
        this.bleState = getBluetoothAdapter().isEnabled() ? 5 : 4;
        BleStateListener bleStateListener = new BleStateListener(context);
        this.bleStateListener = bleStateListener;
        bleStateListener.register(createBleStateListener());
        sendLog(defpackage.a.f9225a, StubApp.getString2(11331));
    }

    public final void initConfigs(List<BleConfig> newConfigs) {
        Intrinsics.checkNotNullParameter(newConfigs, "newConfigs");
        this.bleConfigs = newConfigs;
    }

    public final void quiteUpgradeState(String uuid) {
        Object obj;
        String str;
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        if (this.upgradeDevices.contains(uuid)) {
            Iterator<T> it = this.connectedDevices.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (Intrinsics.areEqual(((BleDevice) obj).getUuid(), uuid)) {
                        break;
                    }
                }
            }
            BleDevice bleDevice = (BleDevice) obj;
            if (bleDevice == null || (str = bleDevice.getName()) == null) {
                str = "";
            }
            handleConnectState$default(this, uuid, str, BleConnectState.CONNECTED, false, 0, 24, null);
            this.upgradeDevices.remove(uuid);
            sendLog(defpackage.a.f9225a, E1.a.k(StubApp.getString2(11332), uuid, StubApp.getString2(11333)));
        }
    }

    public final void release() {
        reset();
        BleStateListener bleStateListener = this.bleStateListener;
        if (bleStateListener != null) {
            bleStateListener.unregister();
        }
        I i3 = this.mainScope;
        if (i3 != null) {
            J.b(i3);
        }
        WeakReference<Context> weakReference = this.weakContext;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.weakContext = null;
        sendLog(defpackage.a.f9225a, StubApp.getString2(11334));
    }

    public final void reset() {
        stopScan$default(this, false, 1, null);
        Iterator it = CollectionsKt.toList(this.connectedDevices).iterator();
        while (it.hasNext()) {
            disconnect$default(this, ((BleDevice) it.next()).getUuid(), false, 2, null);
        }
        this.connectedDevices.clear();
        this.scanResultTemp.clear();
        cleanConnectCache();
        this.descriptorQueue.clear();
        this.upgradeDevices.clear();
        this.sendCmdQueue.clear();
        this.disconnectingDevices.clear();
        this.preConnectedDevices.clear();
        sendLog(defpackage.a.f9225a, StubApp.getString2(11335));
    }

    public final void sendCmd(String uuid, byte[] data, int psType) {
        Object obj;
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(data, "data");
        if (!checkIsFunctionCanBeCalled() || uuid.length() == 0) {
            return;
        }
        if (this.upgradeDevices.contains(uuid) && psType != 1) {
            sendLog(defpackage.a.f9226b, E1.a.k(StubApp.getString2(11273), uuid, StubApp.getString2(11336)));
            return;
        }
        this.sendCmdQueue.add(new BleCmd(uuid, psType, data, false));
        if (this.sendCmdQueue.size() == 1) {
            this.sendCmdQueue.poll();
            Iterator<T> it = this.connectedDevices.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (Intrinsics.areEqual(((BleDevice) obj).getUuid(), uuid)) {
                        break;
                    }
                }
            }
            BleDevice bleDevice = (BleDevice) obj;
            if (bleDevice != null) {
                bleDevice.writeCharacteristic(data, psType);
            }
        }
    }

    public final void sendCmdNoWait(String uuid, byte[] data, int psType) {
        Object obj;
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(data, "data");
        if (!checkIsFunctionCanBeCalled() || uuid.length() == 0) {
            return;
        }
        Iterator<T> it = this.connectedDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.areEqual(((BleDevice) obj).getUuid(), uuid)) {
                    break;
                }
            }
        }
        BleDevice bleDevice = (BleDevice) obj;
        if (bleDevice != null) {
            bleDevice.writeCharacteristic(data, psType);
        }
        sendLog(defpackage.a.f9225a, StubApp.getString2(11337) + uuid + StubApp.getString2(2148) + psType + StubApp.getString2(11338) + data.length);
    }

    public final void setConnected(String uuid) {
        Object obj;
        String str;
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        if (!checkIsFunctionCanBeCalled() || uuid.length() == 0) {
            return;
        }
        boolean contains = this.preConnectedDevices.contains(uuid);
        String string2 = StubApp.getString2(11339);
        if (!contains) {
            sendLog(defpackage.a.f9226b, E1.a.k(string2, uuid, StubApp.getString2(11340)));
            return;
        }
        sendLog(defpackage.a.f9225a, E1.a.k(string2, uuid, StubApp.getString2(11341)));
        this.preConnectedDevices.remove(uuid);
        Iterator<T> it = this.connectedDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.areEqual(((BleDevice) obj).getUuid(), uuid)) {
                    break;
                }
            }
        }
        BleDevice bleDevice = (BleDevice) obj;
        if (bleDevice == null || (str = bleDevice.getName()) == null) {
            str = "";
        }
        handleConnectState$default(this, uuid, str, BleConnectState.CONNECTED, false, 0, 24, null);
    }

    public final void setPreConnected(String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        if (uuid.length() == 0) {
            return;
        }
        this.preConnectedDevices.add(uuid);
        sendLog(defpackage.a.f9225a, E1.a.k(StubApp.getString2(11339), uuid, StubApp.getString2(11342)));
    }

    public final void startScan(boolean pureModel) {
        if (!checkIsFunctionCanBeCalled() || this.isScanning) {
            return;
        }
        this.scanPureMode = pureModel;
        stopScan$default(this, false, 1, null);
        this.isScanning = true;
        this.scanResultTemp.clear();
        this.scanCallback = createScanCallBack();
        BluetoothLeScanner bluetoothLeScanner = getBluetoothAdapter().getBluetoothLeScanner();
        if (bluetoothLeScanner != null) {
            bluetoothLeScanner.startScan((List<ScanFilter>) null, getScanSettings(), this.scanCallback);
        }
        sendLog(defpackage.a.f9225a, StubApp.getString2(11343));
    }

    public final void stopScan(boolean isStartScan) {
        if (checkIsFunctionCanBeCalled()) {
            if (this.scanCallback == null) {
                sendLog(defpackage.a.f9225a, StubApp.getString2(11344));
                return;
            }
            this.scanPureMode = false;
            this.isScanning = false;
            BluetoothLeScanner bluetoothLeScanner = getBluetoothAdapter().getBluetoothLeScanner();
            if (bluetoothLeScanner != null) {
                bluetoothLeScanner.stopScan(this.scanCallback);
            }
            this.scanCallback = null;
            sendLog(defpackage.a.f9225a, isStartScan ? StubApp.getString2(11345) : StubApp.getString2(11346));
        }
    }
}
