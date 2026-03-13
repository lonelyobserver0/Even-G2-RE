package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.os.ConditionVariable;
import f5.u0;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class q {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f17965n = 0;

    /* renamed from: a, reason: collision with root package name */
    public u0 f17966a;

    /* renamed from: b, reason: collision with root package name */
    public u0 f17967b;

    /* renamed from: c, reason: collision with root package name */
    public final ConditionVariable f17968c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17969d;

    /* renamed from: e, reason: collision with root package name */
    public final BluetoothGattCharacteristic f17970e;

    /* renamed from: f, reason: collision with root package name */
    public mc.b f17971f;

    /* renamed from: g, reason: collision with root package name */
    public mc.a f17972g;

    /* renamed from: h, reason: collision with root package name */
    public a f17973h;

    /* renamed from: i, reason: collision with root package name */
    public a f17974i;
    public a j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f17975k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f17976l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f17977m;

    public q(int i3) {
        this.f17969d = i3;
        this.f17970e = null;
        this.f17968c = new ConditionVariable(true);
    }

    public void a() {
        LinkedBlockingDeque linkedBlockingDeque;
        b bVar = (b) this.f17966a;
        bVar.getClass();
        if (!this.f17975k) {
            if (!bVar.f17914m || (linkedBlockingDeque = bVar.f17913l) == null) {
                linkedBlockingDeque = bVar.f17912k;
            }
            linkedBlockingDeque.add(this);
            this.f17975k = true;
        }
        bVar.V(false);
    }

    public void b(BluetoothDevice bluetoothDevice, int i3) {
        if (this.f17977m) {
            return;
        }
        this.f17977m = true;
        a aVar = this.j;
        if (aVar != null) {
            aVar.d(bluetoothDevice, i3);
        }
        this.f17967b.x(new g(this, bluetoothDevice, i3));
    }

    public void c() {
        if (this.f17977m) {
            return;
        }
        this.f17977m = true;
        this.f17967b.x(new p(this));
    }

    public void d(BluetoothDevice bluetoothDevice) {
        if (this.f17976l) {
            return;
        }
        this.f17976l = true;
        a aVar = this.f17973h;
        if (aVar != null) {
            aVar.f17896a.f17990s = -123455;
        }
        this.f17967b.x(new p(this, bluetoothDevice, 0));
    }

    public boolean e(BluetoothDevice bluetoothDevice) {
        if (this.f17977m) {
            return false;
        }
        this.f17977m = true;
        a aVar = this.f17974i;
        if (aVar != null) {
            aVar.a();
        }
        this.f17967b.x(new p(this, bluetoothDevice, 1));
        return true;
    }

    public void f(u0 u0Var) {
        this.f17966a = u0Var;
        if (this.f17967b == null) {
            this.f17967b = u0Var;
        }
    }

    public q(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i3) {
        this.f17969d = i3;
        this.f17970e = bluetoothGattCharacteristic;
        this.f17968c = new ConditionVariable(true);
    }
}
