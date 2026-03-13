package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Keep;
import com.stub.StubApp;
import f4.C0882f;
import i5.C1059c;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingDeque;
import nc.C1401a;
import p0.AbstractC1482f;
import pc.AbstractC1499a;
import sb.C1644e0;
import wb.C1875a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class BleManagerHandler$4 extends BluetoothGattCallback {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f17894b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f17895a;

    public BleManagerHandler$4(b bVar) {
        this.f17895a = bVar;
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic, bluetoothGattCharacteristic.getValue());
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i3) {
        onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, bluetoothGattCharacteristic.getValue(), i3);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i3) {
        b bVar = this.f17895a;
        if (i3 == 0) {
            if (4 >= bVar.f17911h.a()) {
                bVar.f17911h.b(4, StubApp.getString2(26151) + bluetoothGattCharacteristic.getUuid());
            }
            q qVar = bVar.f17900D;
            if (qVar instanceof y) {
                y yVar = (y) qVar;
                yVar.h(bluetoothGatt.getDevice(), bluetoothGattCharacteristic.getValue());
                if (yVar.f18004v) {
                    yVar.e(bluetoothGatt.getDevice());
                } else {
                    bVar.F(yVar);
                }
            }
        } else {
            String string2 = StubApp.getString2(26147);
            if (i3 == 5 || i3 == 8 || i3 == 137) {
                if (5 >= bVar.f17911h.a()) {
                    bVar.f17911h.b(5, StubApp.getString2(26149) + i3 + StubApp.getString2(74));
                }
                if (bluetoothGatt.getDevice().getBondState() != 10) {
                    Log.w(string2, StubApp.getString2(26150));
                    bVar.f17911h.getClass();
                    return;
                }
                return;
            }
            Xa.h.B(i3, StubApp.getString2(26152), string2);
            q qVar2 = bVar.f17900D;
            if (qVar2 instanceof y) {
                qVar2.b(bluetoothGatt.getDevice(), i3);
            }
            bVar.f17904H = null;
            bluetoothGatt.getDevice();
            b.D(bVar, i3);
        }
        bVar.getClass();
        bVar.V(true);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onConnectionStateChange(BluetoothGatt bluetoothGatt, final int i3, final int i10) {
        boolean z2;
        int i11;
        int i12;
        j jVar = new j() { // from class: no.nordicsemi.android.ble.f
            @Override // no.nordicsemi.android.ble.j
            public final String a() {
                int i13 = BleManagerHandler$4.f17894b;
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(26262));
                sb2.append(i3);
                sb2.append(StubApp.getString2(26263));
                int i14 = i10;
                sb2.append(i14);
                sb2.append(StubApp.getString2(1561));
                char[] cArr = AbstractC1499a.f19808a;
                String string2 = StubApp.getString2(74);
                return AbstractC1482f.k(sb2, i14 != 0 ? i14 != 1 ? i14 != 2 ? i14 != 3 ? Xa.h.g(i14, StubApp.getString2(3049), string2) : StubApp.getString2(26264) : StubApp.getString2(11415) : StubApp.getString2(11398) : StubApp.getString2(15158), string2);
            }
        };
        b bVar = this.f17895a;
        bVar.U(3, jVar);
        String string2 = StubApp.getString2(74);
        String string22 = StubApp.getString2(26153);
        if (i3 == 0 && i10 == 2) {
            if (bVar.f17909f == null) {
                Log.e(StubApp.getString2(26147), StubApp.getString2(26154));
                if (3 >= bVar.f17911h.a()) {
                    bVar.f17911h.b(3, StubApp.getString2(26155));
                }
                try {
                    bluetoothGatt.close();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
            if (4 >= bVar.f17911h.a()) {
                bVar.f17911h.b(4, StubApp.getString2(26156) + bluetoothGatt.getDevice().getAddress());
            }
            bVar.f17920t = true;
            bVar.f17918r = 0L;
            bVar.f17924y = 2;
            bVar.f17911h.getClass();
            bVar.f17911h.getClass();
            if (bVar.f17917q) {
                return;
            }
            boolean z10 = bluetoothGatt.getDevice().getBondState() == 12;
            bVar.f17911h.getClass();
            int i13 = z10 ? 1600 : 300;
            if (i13 > 0 && 3 >= bVar.f17911h.a()) {
                bVar.f17911h.b(3, string22 + i13 + string2);
            }
            int i14 = bVar.f17919s + 1;
            bVar.f17919s = i14;
            bVar.y(new g(this, i14, bluetoothGatt), i13);
            return;
        }
        String string23 = StubApp.getString2(3055);
        if (i10 == 0) {
            q qVar = bVar.f17900D;
            k kVar = bVar.f17899C;
            w wVar = bVar.f17904H;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = bVar.f17918r;
            boolean z11 = j > 0;
            boolean z12 = z11 && elapsedRealtime > j + 20000;
            if (i3 == 0 || 5 < bVar.f17911h.a()) {
                z2 = true;
            } else {
                z2 = true;
                bVar.f17911h.b(5, StubApp.getString2(26157) + Integer.toHexString(i3) + string23 + Oc.a.J(i3));
            }
            if (i3 != 0 && z11 && !z12 && kVar != null && (i12 = kVar.f17956t) > 0) {
                kVar.f17956t = i12 - 1;
                int i15 = kVar.f17957u;
                if (i15 > 0 && 3 >= bVar.f17911h.a()) {
                    bVar.f17911h.b(3, string22 + i15 + string2);
                }
                bVar.y(new d(this, bluetoothGatt, kVar, 2), i15);
                return;
            }
            bVar.f17921v = z2;
            bVar.f17912k.clear();
            bVar.f17913l = null;
            boolean z13 = bVar.f17920t;
            boolean z14 = bVar.f17916p;
            if (z12) {
                bVar.W(bluetoothGatt.getDevice());
            } else if (z14) {
                bVar.W(bluetoothGatt.getDevice());
            } else if (qVar == null || qVar.f17969d != 3) {
                bVar.W(bluetoothGatt.getDevice());
            } else {
                bVar.W(bluetoothGatt.getDevice());
            }
            int i16 = -1;
            if (qVar != null && (i11 = qVar.f17969d) != 3 && i11 != 6) {
                qVar.b(bluetoothGatt.getDevice(), i3 == 0 ? -1 : i3);
                bVar.f17900D = null;
            }
            if (wVar != null) {
                wVar.b(bluetoothGatt.getDevice(), -1);
                bVar.f17904H = null;
            }
            if (kVar != null) {
                if (z14) {
                    i16 = -2;
                } else if (i3 != 0) {
                    i16 = (i3 == 133 && z12) ? -5 : i3;
                }
                kVar.b(bluetoothGatt.getDevice(), i16);
                bVar.f17899C = null;
            }
            bVar.f17921v = false;
            if (z13 && bVar.f17923x) {
                bVar.I(bluetoothGatt.getDevice(), null);
            } else {
                bVar.f17923x = false;
                bVar.V(false);
            }
            if (z13 || i3 == 0) {
                return;
            }
        } else if (i3 != 0 && 6 >= bVar.f17911h.a()) {
            bVar.f17911h.b(6, StubApp.getString2(3054) + Integer.toHexString(i3) + string23 + Oc.a.J(i3));
        }
        bVar.f17911h.getClass();
    }

    @Keep
    public void onConnectionUpdated(BluetoothGatt bluetoothGatt, final int i3, final int i10, final int i11, final int i12) {
        b bVar = this.f17895a;
        if (i12 == 0) {
            final int i13 = 0;
            bVar.U(4, new j() { // from class: no.nordicsemi.android.ble.h
                @Override // no.nordicsemi.android.ble.j
                public final String a() {
                    String string2 = StubApp.getString2(26266);
                    int i14 = i11;
                    String string22 = StubApp.getString2(26158);
                    int i15 = i10;
                    String string23 = StubApp.getString2(26267);
                    int i16 = i3;
                    switch (i13) {
                        case 0:
                            int i17 = BleManagerHandler$4.f17894b;
                            return StubApp.getString2(26269) + (i16 * 1.25d) + string23 + i15 + string22 + (i14 * 10) + string2;
                        default:
                            int i18 = BleManagerHandler$4.f17894b;
                            return StubApp.getString2(26268) + (i16 * 1.25d) + string23 + i15 + string22 + (i14 * 10) + string2;
                    }
                }
            });
        } else {
            String string2 = StubApp.getString2(26158);
            String string22 = StubApp.getString2(26159);
            String string23 = StubApp.getString2(26147);
            if (i12 == 59) {
                StringBuilder l9 = AbstractC1482f.l(i3, StubApp.getString2(26160), i10, string22, string2);
                l9.append(i11);
                Log.e(string23, l9.toString());
                final int i14 = 1;
                bVar.U(5, new j() { // from class: no.nordicsemi.android.ble.h
                    @Override // no.nordicsemi.android.ble.j
                    public final String a() {
                        String string24 = StubApp.getString2(26266);
                        int i142 = i11;
                        String string222 = StubApp.getString2(26158);
                        int i15 = i10;
                        String string232 = StubApp.getString2(26267);
                        int i16 = i3;
                        switch (i14) {
                            case 0:
                                int i17 = BleManagerHandler$4.f17894b;
                                return StubApp.getString2(26269) + (i16 * 1.25d) + string232 + i15 + string222 + (i142 * 10) + string24;
                            default:
                                int i18 = BleManagerHandler$4.f17894b;
                                return StubApp.getString2(26268) + (i16 * 1.25d) + string232 + i15 + string222 + (i142 * 10) + string24;
                        }
                    }
                });
            } else {
                StringBuilder l10 = AbstractC1482f.l(i12, StubApp.getString2(26161), i3, StubApp.getString2(26162), string22);
                l10.append(i10);
                l10.append(string2);
                l10.append(i11);
                Log.e(string23, l10.toString());
                bVar.U(5, new j() { // from class: no.nordicsemi.android.ble.i
                    @Override // no.nordicsemi.android.ble.j
                    public final String a() {
                        int i15 = BleManagerHandler$4.f17894b;
                        return StubApp.getString2(26270) + i12 + StubApp.getString2(26271) + (i3 * 1.25d) + StubApp.getString2(26267) + i10 + StubApp.getString2(26158) + (i11 * 10) + StubApp.getString2(26266);
                    }
                });
                bVar.f17911h.getClass();
            }
        }
        if (bVar.f17925z) {
            bVar.f17925z = false;
            bVar.V(true);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i3) {
        byte[] value = bluetoothGattDescriptor.getValue();
        b bVar = this.f17895a;
        if (i3 == 0) {
            if (4 >= bVar.f17911h.a()) {
                bVar.f17911h.b(4, StubApp.getString2(26163) + bluetoothGattDescriptor.getUuid() + StubApp.getString2(26142) + AbstractC1499a.a(value));
            }
            q qVar = bVar.f17900D;
            if (qVar instanceof o) {
                o oVar = (o) qVar;
                BluetoothDevice device = bluetoothGatt.getDevice();
                wb.d dVar = (wb.d) oVar.f17978o;
                if (dVar == null) {
                    oVar.f17962p = true;
                } else {
                    oVar.f17962p = true;
                    oVar.f17967b.x(new n(dVar, device, new C1401a(value), 0));
                }
                if (oVar.f17962p) {
                    oVar.e(bluetoothGatt.getDevice());
                } else {
                    bVar.F(oVar);
                }
            }
        } else {
            String string2 = StubApp.getString2(26147);
            if (i3 == 5 || i3 == 8 || i3 == 137) {
                if (5 >= bVar.f17911h.a()) {
                    bVar.f17911h.b(5, StubApp.getString2(26149) + i3 + StubApp.getString2(74));
                }
                if (bluetoothGatt.getDevice().getBondState() != 10) {
                    Log.w(string2, StubApp.getString2(26150));
                    bVar.f17911h.getClass();
                    return;
                }
                return;
            }
            Xa.h.B(i3, StubApp.getString2(26164), string2);
            q qVar2 = bVar.f17900D;
            if (qVar2 instanceof o) {
                qVar2.b(bluetoothGatt.getDevice(), i3);
            }
            bVar.f17904H = null;
            bluetoothGatt.getDevice();
            b.D(bVar, i3);
        }
        bVar.getClass();
        bVar.V(true);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i3) {
        byte[] value = bluetoothGattDescriptor.getValue();
        b bVar = this.f17895a;
        if (i3 == 0) {
            if (4 >= bVar.f17911h.a()) {
                bVar.f17911h.b(4, StubApp.getString2(26165) + bluetoothGattDescriptor.getUuid());
            }
            if (c.f17930g.equals(bluetoothGattDescriptor.getCharacteristic().getUuid())) {
                if (4 >= bVar.f17911h.a()) {
                    bVar.f17911h.b(4, StubApp.getString2(26166));
                }
            } else if (c.f17926c.equals(bluetoothGattDescriptor.getUuid()) && value != null && value.length == 2 && value[1] == 0) {
                byte b2 = value[0];
                if (b2 != 0) {
                    if (b2 != 1) {
                        if (b2 == 2 && 4 >= bVar.f17911h.a()) {
                            bVar.f17911h.b(4, StubApp.getString2(26167));
                        }
                    } else if (4 >= bVar.f17911h.a()) {
                        bVar.f17911h.b(4, StubApp.getString2(26168));
                    }
                } else if (4 >= bVar.f17911h.a()) {
                    bVar.f17911h.b(4, StubApp.getString2(26169));
                }
            }
            q qVar = bVar.f17900D;
            if (qVar instanceof y) {
                y yVar = (y) qVar;
                yVar.h(bluetoothGatt.getDevice(), value);
                if (yVar.f18004v) {
                    yVar.e(bluetoothGatt.getDevice());
                } else {
                    bVar.F(yVar);
                }
            }
        } else {
            String string2 = StubApp.getString2(26147);
            if (i3 == 5 || i3 == 8 || i3 == 137) {
                if (5 >= bVar.f17911h.a()) {
                    bVar.f17911h.b(5, StubApp.getString2(26149) + i3 + StubApp.getString2(74));
                }
                if (bluetoothGatt.getDevice().getBondState() != 10) {
                    Log.w(string2, StubApp.getString2(26150));
                    bVar.f17911h.getClass();
                    return;
                }
                return;
            }
            Xa.h.B(i3, StubApp.getString2(26170), string2);
            q qVar2 = bVar.f17900D;
            if (qVar2 instanceof y) {
                qVar2.b(bluetoothGatt.getDevice(), i3);
            }
            bVar.f17904H = null;
            bluetoothGatt.getDevice();
            b.D(bVar, i3);
        }
        bVar.getClass();
        bVar.V(true);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onMtuChanged(BluetoothGatt bluetoothGatt, int i3, int i10) {
        b bVar = this.f17895a;
        if (i10 == 0) {
            if (4 >= bVar.f17911h.a()) {
                bVar.f17911h.b(4, StubApp.getString2(26171) + i3);
            }
            bVar.f17898B = i3;
            q qVar = bVar.f17900D;
            if (qVar instanceof m) {
                m mVar = (m) qVar;
                mVar.f17967b.x(new E.j(mVar, bluetoothGatt.getDevice(), i3));
                bVar.f17900D.e(bluetoothGatt.getDevice());
            }
        } else {
            Log.e(StubApp.getString2(26147), StubApp.getString2(26172) + i10 + StubApp.getString2(26173) + i3);
            q qVar2 = bVar.f17900D;
            if (qVar2 instanceof m) {
                qVar2.b(bluetoothGatt.getDevice(), i10);
                bVar.f17904H = null;
            }
            bluetoothGatt.getDevice();
            b.D(bVar, i10);
        }
        bVar.getClass();
        if (bVar.f17915n) {
            bVar.V(true);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onPhyRead(BluetoothGatt bluetoothGatt, int i3, int i10, int i11) {
        b bVar = this.f17895a;
        if (i11 != 0) {
            if (5 >= bVar.f17911h.a()) {
                bVar.f17911h.b(5, StubApp.getString2(26176) + i11);
            }
            bVar.f17904H = null;
            bVar.f17911h.getClass();
        } else if (4 >= bVar.f17911h.a()) {
            bVar.f17911h.b(4, StubApp.getString2(26174) + AbstractC1499a.d(i3) + StubApp.getString2(26175) + AbstractC1499a.d(i10) + StubApp.getString2(74));
        }
        bVar.getClass();
        bVar.V(true);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onPhyUpdate(BluetoothGatt bluetoothGatt, int i3, int i10, int i11) {
        b bVar = this.f17895a;
        if (i11 != 0) {
            if (5 >= bVar.f17911h.a()) {
                bVar.f17911h.b(5, StubApp.getString2(26178) + i11);
            }
            bVar.f17911h.getClass();
        } else if (4 >= bVar.f17911h.a()) {
            bVar.f17911h.b(4, StubApp.getString2(26177) + AbstractC1499a.d(i3) + StubApp.getString2(26175) + AbstractC1499a.d(i10) + StubApp.getString2(74));
        }
        bVar.getClass();
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i3, int i10) {
        b bVar = this.f17895a;
        if (i10 != 0) {
            if (5 >= bVar.f17911h.a()) {
                bVar.f17911h.b(5, StubApp.getString2(26181) + i10);
            }
            bVar.f17904H = null;
            bVar.f17911h.getClass();
        } else if (4 >= bVar.f17911h.a()) {
            bVar.f17911h.b(4, StubApp.getString2(26179) + i3 + StubApp.getString2(26180));
        }
        bVar.getClass();
        bVar.V(true);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onReliableWriteCompleted(BluetoothGatt bluetoothGatt, int i3) {
        b bVar = this.f17895a;
        boolean z2 = bVar.f17900D.f17969d == 14;
        bVar.f17897A = false;
        if (i3 != 0) {
            Log.e(StubApp.getString2(26147), StubApp.getString2(26184) + z2 + StubApp.getString2(26185) + i3);
            bVar.f17900D.b(bluetoothGatt.getDevice(), i3);
            bluetoothGatt.getDevice();
            b.D(bVar, i3);
        } else {
            if (!z2) {
                if (5 >= bVar.f17911h.a()) {
                    bVar.f17911h.b(5, StubApp.getString2(26183));
                }
                bVar.f17900D.e(bluetoothGatt.getDevice());
                bluetoothGatt.getDevice();
                throw null;
            }
            if (4 >= bVar.f17911h.a()) {
                bVar.f17911h.b(4, StubApp.getString2(26182));
            }
            bVar.f17900D.e(bluetoothGatt.getDevice());
        }
        bVar.V(true);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    @Keep
    public void onServiceChanged(BluetoothGatt bluetoothGatt) {
        b bVar = this.f17895a;
        if (4 >= bVar.f17911h.a()) {
            bVar.f17911h.b(4, StubApp.getString2(26186));
        }
        bVar.f17921v = true;
        bVar.f17911h.c();
        bVar.f17912k.clear();
        bVar.f17913l = null;
        bVar.f17917q = true;
        bVar.f17915n = false;
        if (2 >= bVar.f17911h.a()) {
            bVar.f17911h.b(2, StubApp.getString2(26140));
        }
        if (3 >= bVar.f17911h.a()) {
            bVar.f17911h.b(3, StubApp.getString2(26141));
        }
        bluetoothGatt.discoverServices();
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i3) {
        boolean z2 = false;
        b bVar = this.f17895a;
        if (bVar.f17917q) {
            bVar.f17917q = false;
            if (i3 != 0) {
                Log.e(StubApp.getString2(26147), StubApp.getString2(26193) + i3);
                bluetoothGatt.getDevice();
                b.D(bVar, i3);
                k kVar = bVar.f17899C;
                if (kVar != null) {
                    kVar.b(bluetoothGatt.getDevice(), -4);
                    bVar.f17899C = null;
                }
                bVar.L();
                return;
            }
            if (4 >= bVar.f17911h.a()) {
                bVar.f17911h.b(4, StubApp.getString2(26187));
            }
            bVar.f17915n = true;
            wb.f fVar = (wb.f) bVar.f17911h;
            fVar.f22303q.getClass();
            BluetoothGattService service = bluetoothGatt.getService(C1875a.f22279a);
            org.slf4j.a aVar = wb.f.f22294t;
            if (service == null) {
                aVar.a(StubApp.getString2(26188));
            } else {
                BluetoothGattCharacteristic characteristic = service.getCharacteristic(C1875a.f22280b);
                fVar.f22296i = characteristic;
                if (characteristic == null) {
                    aVar.a(StubApp.getString2(26189));
                } else {
                    int properties = characteristic.getProperties();
                    boolean z10 = (4 & properties) > 0;
                    boolean z11 = (properties & 16) > 0;
                    if (z10 && z11) {
                        fVar.f22295h = fVar.f22296i;
                        if (2 >= bVar.f17911h.a()) {
                            bVar.f17911h.b(2, StubApp.getString2(26190));
                        }
                        bVar.f17916p = false;
                        bVar.f17911h.f17932b.getClass();
                        bVar.f17911h.getClass();
                        bVar.f17921v = true;
                        bVar.f17914m = true;
                        bVar.f17913l = null;
                        if (bVar.f17913l == null) {
                            bVar.f17913l = new LinkedBlockingDeque();
                        }
                        if (Build.VERSION.SDK_INT == 28) {
                            y yVar = new y(null, 30);
                            yVar.i(bVar);
                            bVar.F(yVar);
                            bVar.f17921v = true;
                        }
                        wb.f fVar2 = (wb.f) bVar.f17911h;
                        fVar2.f22301o = new C1059c(fVar2.f22302p);
                        m mVar = new m(fVar2.f22299m);
                        b bVar2 = fVar2.f17932b;
                        mVar.g(bVar2);
                        mVar.f17978o = new wb.c(fVar2);
                        mVar.f17972g = new C1644e0(fVar2, 15);
                        mVar.a();
                        y yVar2 = new y(fVar2.f22296i, 16);
                        yVar2.i(bVar2);
                        yVar2.a();
                        w wVar = new w(fVar2.f22296i, 20);
                        wVar.f17990s = 0;
                        wVar.f17993v = 0;
                        wVar.f17994w = false;
                        wVar.g(bVar2);
                        BluetoothGattCharacteristic bluetoothGattCharacteristic = fVar2.f22295h;
                        byte[] bArr = fVar2.f22304r;
                        y yVar3 = new y(bluetoothGattCharacteristic, bArr, bArr != null ? bArr.length : 0);
                        yVar3.i(bVar2);
                        wVar.f17989r = yVar3;
                        wVar.f17990s = -123456;
                        yVar3.f17973h = new a(wVar);
                        yVar3.f17974i = new a(wVar);
                        yVar3.j = new a(wVar);
                        if (wVar.f17979o != null) {
                            throw new IllegalStateException(StubApp.getString2(26191));
                        }
                        wVar.f17980p = 1000L;
                        wVar.f17991t = new C0882f(18, z2);
                        wVar.f17988q = new wb.d(0, fVar2);
                        wVar.a();
                        BluetoothGattCharacteristic bluetoothGattCharacteristic2 = fVar2.f22296i;
                        HashMap hashMap = bVar2.f17901E;
                        u uVar = (u) hashMap.get(bluetoothGattCharacteristic2);
                        if (uVar == null) {
                            uVar = new u();
                            uVar.f17985e = 0;
                            uVar.f17984d = bVar2;
                            if (bluetoothGattCharacteristic2 != null) {
                                hashMap.put(bluetoothGattCharacteristic2, uVar);
                            }
                        } else if (bVar2.f17909f != null) {
                            uVar.f17981a = null;
                            uVar.f17982b = null;
                            uVar.f17983c = null;
                            uVar.f17985e = 0;
                        }
                        uVar.f17982b = fVar2.f22297k;
                        uVar.f17981a = new wb.d(1, fVar2);
                        bVar.f17914m = false;
                        bVar.V(true);
                        return;
                    }
                    aVar.p(Boolean.valueOf(z10), Boolean.valueOf(z11));
                }
            }
            if (5 >= bVar.f17911h.a()) {
                bVar.f17911h.b(5, StubApp.getString2(26192));
            }
            bVar.f17916p = true;
            bVar.f17911h.getClass();
            bVar.L();
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        b bVar = this.f17895a;
        bVar.getClass();
        if (bluetoothGattCharacteristic != null && c.f17930g.equals(bluetoothGattCharacteristic.getUuid())) {
            if (Build.VERSION.SDK_INT <= 30) {
                if (4 >= bVar.f17911h.a()) {
                    bVar.f17911h.b(4, StubApp.getString2(26139));
                }
                bVar.f17921v = true;
                bVar.f17911h.c();
                bVar.f17912k.clear();
                bVar.f17913l = null;
                bVar.f17917q = true;
                if (2 >= bVar.f17911h.a()) {
                    bVar.f17911h.b(2, StubApp.getString2(26140));
                }
                if (3 >= bVar.f17911h.a()) {
                    bVar.f17911h.b(3, StubApp.getString2(26141));
                }
                bluetoothGatt.discoverServices();
                return;
            }
            return;
        }
        BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(c.f17926c);
        String string2 = StubApp.getString2(26142);
        if (descriptor == null || descriptor.getValue() == null || descriptor.getValue().length != 2 || descriptor.getValue()[0] == 1) {
            if (4 >= bVar.f17911h.a()) {
                bVar.f17911h.b(4, StubApp.getString2(26144) + bluetoothGattCharacteristic.getUuid() + string2 + AbstractC1499a.a(bArr));
            }
        } else if (4 >= bVar.f17911h.a()) {
            bVar.f17911h.b(4, StubApp.getString2(26143) + bluetoothGattCharacteristic.getUuid() + string2 + AbstractC1499a.a(bArr));
        }
        if (bVar.f17903G != null && c.f17928e.equals(bluetoothGattCharacteristic.getUuid())) {
            bVar.f17903G.a(bluetoothGatt.getDevice(), bArr);
        }
        u uVar = (u) bVar.f17901E.get(bluetoothGattCharacteristic);
        if (uVar != null) {
            uVar.a(bluetoothGatt.getDevice(), bArr);
        }
        w wVar = bVar.f17904H;
        if ((wVar instanceof w) && wVar.f17970e == bluetoothGattCharacteristic && wVar.f17990s != -123456) {
            wVar.getClass();
            BluetoothDevice device = bluetoothGatt.getDevice();
            wb.d dVar = wVar.f17988q;
            if (dVar == null) {
                wVar.f17994w = true;
            } else if (wVar.f17991t == null) {
                wVar.f17994w = true;
                wVar.f17967b.x(new n(dVar, device, new C1401a(bArr), 3));
            } else {
                wVar.f17967b.x(new v(wVar, device, bArr, wVar.f17993v));
                if (wVar.f17992u == null) {
                    wVar.f17992u = new C0882f(14);
                }
                C0882f c0882f = wVar.f17991t;
                C0882f c0882f2 = wVar.f17992u;
                int i3 = wVar.f17993v;
                wVar.f17993v = i3 + 1;
                if (c0882f.i(c0882f2, bArr, i3)) {
                    byte[] byteArray = ((ByteArrayOutputStream) wVar.f17992u.f13748b).toByteArray();
                    wVar.f17994w = true;
                    wVar.f17967b.x(new n(dVar, device, new C1401a(byteArray), 4));
                    wVar.f17992u = null;
                    wVar.f17993v = 0;
                }
            }
            if (wVar.f17994w) {
                if (4 >= bVar.f17911h.a()) {
                    bVar.f17911h.b(4, StubApp.getString2(26145));
                }
                wVar.e(bluetoothGatt.getDevice());
                bVar.f17904H = null;
                if (wVar.f17990s != -123455) {
                    bVar.V(true);
                }
            }
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i3) {
        b bVar = this.f17895a;
        if (i3 == 0) {
            if (4 >= bVar.f17911h.a()) {
                bVar.f17911h.b(4, StubApp.getString2(26146) + bluetoothGattCharacteristic.getUuid() + StubApp.getString2(26142) + AbstractC1499a.a(bArr));
            }
            q qVar = bVar.f17900D;
            if (qVar instanceof o) {
                o oVar = (o) qVar;
                oVar.getClass();
                BluetoothDevice device = bluetoothGatt.getDevice();
                wb.d dVar = (wb.d) oVar.f17978o;
                if (dVar == null) {
                    oVar.f17962p = true;
                } else {
                    oVar.f17962p = true;
                    oVar.f17967b.x(new n(dVar, device, new C1401a(bArr), 0));
                }
                if (oVar.f17962p) {
                    oVar.e(bluetoothGatt.getDevice());
                } else {
                    bVar.F(oVar);
                }
            }
        } else {
            String string2 = StubApp.getString2(26147);
            if (i3 == 5 || i3 == 8 || i3 == 137) {
                if (5 >= bVar.f17911h.a()) {
                    bVar.f17911h.b(5, StubApp.getString2(26149) + i3 + StubApp.getString2(74));
                }
                if (bluetoothGatt.getDevice().getBondState() != 10) {
                    Log.w(string2, StubApp.getString2(26150));
                    bVar.f17911h.getClass();
                    return;
                }
                return;
            }
            Xa.h.B(i3, StubApp.getString2(26148), string2);
            q qVar2 = bVar.f17900D;
            if (qVar2 instanceof o) {
                qVar2.b(bluetoothGatt.getDevice(), i3);
            }
            bVar.f17904H = null;
            bluetoothGatt.getDevice();
            b.D(bVar, i3);
        }
        bVar.getClass();
        bVar.V(true);
    }
}
