package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import f5.u0;
import java.util.Arrays;
import l4.C1145A;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class y extends s {

    /* renamed from: w, reason: collision with root package name */
    public static final C1145A f17997w = new C1145A(19);

    /* renamed from: p, reason: collision with root package name */
    public C1145A f17998p;

    /* renamed from: q, reason: collision with root package name */
    public final byte[] f17999q;

    /* renamed from: r, reason: collision with root package name */
    public final int f18000r;

    /* renamed from: s, reason: collision with root package name */
    public byte[] f18001s;

    /* renamed from: t, reason: collision with root package name */
    public byte[] f18002t;

    /* renamed from: u, reason: collision with root package name */
    public int f18003u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f18004v;

    public y(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i3) {
        super(bluetoothGattCharacteristic, i3);
        this.f18003u = 0;
        this.f17999q = null;
        this.f18000r = 0;
        this.f18004v = true;
    }

    public final byte[] g(int i3) {
        C1145A c1145a = this.f17998p;
        byte[] bArr = this.f17999q;
        if (c1145a == null || bArr == null) {
            this.f18004v = true;
            this.f18001s = bArr;
            return bArr != null ? bArr : new byte[0];
        }
        int i10 = this.f18000r != 4 ? i3 - 3 : i3 - 12;
        byte[] bArr2 = this.f18002t;
        byte[] bArr3 = null;
        if (bArr2 == null) {
            int i11 = this.f18003u * i10;
            int min = Math.min(i10, bArr.length - i11);
            if (min <= 0) {
                bArr2 = null;
            } else {
                byte[] bArr4 = new byte[min];
                System.arraycopy(bArr, i11, bArr4, 0, min);
                bArr2 = bArr4;
            }
        }
        if (bArr2 != null) {
            C1145A c1145a2 = this.f17998p;
            int i12 = this.f18003u + 1;
            c1145a2.getClass();
            int i13 = i12 * i10;
            int min2 = Math.min(i10, bArr.length - i13);
            if (min2 > 0) {
                bArr3 = new byte[min2];
                System.arraycopy(bArr, i13, bArr3, 0, min2);
            }
            this.f18002t = bArr3;
        }
        if (this.f18002t == null) {
            this.f18004v = true;
        }
        this.f18001s = bArr2;
        return bArr2 != null ? bArr2 : new byte[0];
    }

    public final boolean h(BluetoothDevice bluetoothDevice, byte[] bArr) {
        int i3 = this.f18003u;
        byte[] bArr2 = this.f18001s;
        this.f17967b.x(new x(this, bluetoothDevice, bArr2, i3));
        this.f18003u++;
        if (this.f18004v) {
            this.f17967b.x(new x(this, bluetoothDevice));
        }
        if (this.f18000r == 2) {
            return Arrays.equals(bArr, bArr2);
        }
        return true;
    }

    public final void i(u0 u0Var) {
        super.f(u0Var);
    }

    public y(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i3) {
        super(bluetoothGattCharacteristic, 7);
        byte[] bArr2;
        this.f18003u = 0;
        this.f18004v = false;
        if (bArr == null || bArr.length < 0) {
            bArr2 = null;
        } else {
            int min = Math.min(bArr.length, i3);
            bArr2 = new byte[min];
            System.arraycopy(bArr, 0, bArr2, 0, min);
        }
        this.f17999q = bArr2;
        this.f18000r = 1;
    }
}
