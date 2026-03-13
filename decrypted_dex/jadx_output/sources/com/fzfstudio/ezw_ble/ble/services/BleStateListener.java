package com.fzfstudio.ezw_ble.ble.services;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000'\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\t\u0018\u00002\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\r\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/fzfstudio/ezw_ble/ble/services/BleStateListener;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "callback", "Lcom/fzfstudio/ezw_ble/ble/services/BleStateListener$BluetoothStateCallback;", "bluetoothReceiver", "com/fzfstudio/ezw_ble/ble/services/BleStateListener$bluetoothReceiver$1", "Lcom/fzfstudio/ezw_ble/ble/services/BleStateListener$bluetoothReceiver$1;", "register", "", "unregister", "BluetoothStateCallback", "flutter_ezw_ble_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class BleStateListener {
    private final BleStateListener$bluetoothReceiver$1 bluetoothReceiver;
    private BluetoothStateCallback callback;
    private final Context context;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\r"}, d2 = {"Lcom/fzfstudio/ezw_ble/ble/services/BleStateListener$BluetoothStateCallback;", "", "onBluetoothStateChanged", "", "state", "", "onDeviceBondStateChanged", "device", "Landroid/bluetooth/BluetoothDevice;", "isBonded", "", "onDeviceConnected", "onDeviceDisconnected", "flutter_ezw_ble_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface BluetoothStateCallback {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class DefaultImpls {
            public static void onDeviceBondStateChanged(BluetoothStateCallback bluetoothStateCallback, BluetoothDevice device, boolean z2) {
                Intrinsics.checkNotNullParameter(device, "device");
            }

            public static void onDeviceConnected(BluetoothStateCallback bluetoothStateCallback, BluetoothDevice device) {
                Intrinsics.checkNotNullParameter(device, "device");
            }

            public static void onDeviceDisconnected(BluetoothStateCallback bluetoothStateCallback, BluetoothDevice device) {
                Intrinsics.checkNotNullParameter(device, "device");
            }
        }

        void onBluetoothStateChanged(int state);

        void onDeviceBondStateChanged(BluetoothDevice device, boolean isBonded);

        void onDeviceConnected(BluetoothDevice device);

        void onDeviceDisconnected(BluetoothDevice device);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.fzfstudio.ezw_ble.ble.services.BleStateListener$bluetoothReceiver$1] */
    public BleStateListener(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.bluetoothReceiver = new BroadcastReceiver() { // from class: com.fzfstudio.ezw_ble.ble.services.BleStateListener$bluetoothReceiver$1
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
            
                r0 = r2.this$0.callback;
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
            
                r4 = r2.this$0.callback;
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x0093, code lost:
            
                r4 = r2.this$0.callback;
             */
            @Override // android.content.BroadcastReceiver
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onReceive(android.content.Context r3, android.content.Intent r4) {
                /*
                    r2 = this;
                    int r3 = android.os.Build.VERSION.SDK_INT
                    r0 = 33
                    r1 = 0
                    if (r3 < r0) goto L12
                    if (r4 == 0) goto L10
                    java.lang.Object r3 = D2.b.D(r4)
                    android.bluetooth.BluetoothDevice r3 = (android.bluetooth.BluetoothDevice) r3
                    goto L21
                L10:
                    r3 = r1
                    goto L21
                L12:
                    if (r4 == 0) goto L10
                    r3 = 1287(0x507, float:1.803E-42)
                    java.lang.String r3 = com.stub.StubApp.getString2(r3)
                    android.os.Parcelable r3 = r4.getParcelableExtra(r3)
                    android.bluetooth.BluetoothDevice r3 = (android.bluetooth.BluetoothDevice) r3
                L21:
                    if (r4 == 0) goto L27
                    java.lang.String r1 = r4.getAction()
                L27:
                    if (r1 == 0) goto Lc5
                    int r0 = r1.hashCode()
                    switch(r0) {
                        case -1530327060: goto L9f;
                        case -301431627: goto L83;
                        case 1821585647: goto L67;
                        case 2116862345: goto L32;
                        default: goto L30;
                    }
                L30:
                    goto Lc5
                L32:
                    r0 = 11417(0x2c99, float:1.5999E-41)
                    java.lang.String r0 = com.stub.StubApp.getString2(r0)
                    boolean r0 = r1.equals(r0)
                    if (r0 != 0) goto L41
                    goto Lc5
                L41:
                    r0 = 11418(0x2c9a, float:1.6E-41)
                    java.lang.String r0 = com.stub.StubApp.getString2(r0)
                    r1 = -1
                    int r4 = r4.getIntExtra(r0, r1)
                    r0 = 11
                    if (r4 != r0) goto L52
                    goto Lc5
                L52:
                    if (r3 == 0) goto Lc5
                    com.fzfstudio.ezw_ble.ble.services.BleStateListener r0 = com.fzfstudio.ezw_ble.ble.services.BleStateListener.this
                    com.fzfstudio.ezw_ble.ble.services.BleStateListener$BluetoothStateCallback r0 = com.fzfstudio.ezw_ble.ble.services.BleStateListener.access$getCallback$p(r0)
                    if (r0 == 0) goto Lc5
                    r1 = 12
                    if (r4 != r1) goto L62
                    r4 = 1
                    goto L63
                L62:
                    r4 = 0
                L63:
                    r0.onDeviceBondStateChanged(r3, r4)
                    return
                L67:
                    r4 = 11419(0x2c9b, float:1.6001E-41)
                    java.lang.String r4 = com.stub.StubApp.getString2(r4)
                    boolean r4 = r1.equals(r4)
                    if (r4 != 0) goto L75
                    goto Lc5
                L75:
                    if (r3 == 0) goto Lc5
                    com.fzfstudio.ezw_ble.ble.services.BleStateListener r4 = com.fzfstudio.ezw_ble.ble.services.BleStateListener.this
                    com.fzfstudio.ezw_ble.ble.services.BleStateListener$BluetoothStateCallback r4 = com.fzfstudio.ezw_ble.ble.services.BleStateListener.access$getCallback$p(r4)
                    if (r4 == 0) goto Lc5
                    r4.onDeviceDisconnected(r3)
                    return
                L83:
                    r4 = 11420(0x2c9c, float:1.6003E-41)
                    java.lang.String r4 = com.stub.StubApp.getString2(r4)
                    boolean r4 = r1.equals(r4)
                    if (r4 != 0) goto L91
                    goto Lc5
                L91:
                    if (r3 == 0) goto Lc5
                    com.fzfstudio.ezw_ble.ble.services.BleStateListener r4 = com.fzfstudio.ezw_ble.ble.services.BleStateListener.this
                    com.fzfstudio.ezw_ble.ble.services.BleStateListener$BluetoothStateCallback r4 = com.fzfstudio.ezw_ble.ble.services.BleStateListener.access$getCallback$p(r4)
                    if (r4 == 0) goto Lc5
                    r4.onDeviceConnected(r3)
                    return
                L9f:
                    r3 = 11421(0x2c9d, float:1.6004E-41)
                    java.lang.String r3 = com.stub.StubApp.getString2(r3)
                    boolean r3 = r1.equals(r3)
                    if (r3 != 0) goto Lad
                    goto Lc5
                Lad:
                    r3 = 11422(0x2c9e, float:1.6006E-41)
                    java.lang.String r3 = com.stub.StubApp.getString2(r3)
                    r0 = -2147483648(0xffffffff80000000, float:-0.0)
                    int r3 = r4.getIntExtra(r3, r0)
                    com.fzfstudio.ezw_ble.ble.services.BleStateListener r4 = com.fzfstudio.ezw_ble.ble.services.BleStateListener.this
                    com.fzfstudio.ezw_ble.ble.services.BleStateListener$BluetoothStateCallback r4 = com.fzfstudio.ezw_ble.ble.services.BleStateListener.access$getCallback$p(r4)
                    if (r4 == 0) goto Lc5
                    r4.onBluetoothStateChanged(r3)
                Lc5:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.fzfstudio.ezw_ble.ble.services.BleStateListener$bluetoothReceiver$1.onReceive(android.content.Context, android.content.Intent):void");
            }
        };
    }

    public final void register(BluetoothStateCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callback = callback;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(StubApp.getString2(11421));
        intentFilter.addAction(StubApp.getString2(11420));
        intentFilter.addAction(StubApp.getString2(11417));
        intentFilter.addAction(StubApp.getString2(11419));
        this.context.registerReceiver(this.bluetoothReceiver, intentFilter);
    }

    public final void unregister() {
        this.context.unregisterReceiver(this.bluetoothReceiver);
    }
}
