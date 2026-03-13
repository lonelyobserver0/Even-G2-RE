package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import com.stub.StubApp;
import f5.u0;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Timer;
import java.util.concurrent.LinkedBlockingDeque;
import pc.AbstractC1499a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class b extends u0 {

    /* renamed from: A, reason: collision with root package name */
    public boolean f17897A;

    /* renamed from: C, reason: collision with root package name */
    public k f17899C;

    /* renamed from: D, reason: collision with root package name */
    public q f17900D;

    /* renamed from: G, reason: collision with root package name */
    public u f17903G;

    /* renamed from: H, reason: collision with root package name */
    public w f17904H;

    /* renamed from: f, reason: collision with root package name */
    public BluetoothDevice f17909f;

    /* renamed from: g, reason: collision with root package name */
    public BluetoothGatt f17910g;

    /* renamed from: h, reason: collision with root package name */
    public c f17911h;
    public Handler j;

    /* renamed from: l, reason: collision with root package name */
    public LinkedBlockingDeque f17913l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f17914m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f17915n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f17916p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f17917q;

    /* renamed from: r, reason: collision with root package name */
    public long f17918r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f17920t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f17921v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f17922w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f17923x;

    /* renamed from: e, reason: collision with root package name */
    public final Object f17908e = new Object();

    /* renamed from: k, reason: collision with root package name */
    public final LinkedBlockingDeque f17912k = new LinkedBlockingDeque();

    /* renamed from: s, reason: collision with root package name */
    public int f17919s = 0;

    /* renamed from: y, reason: collision with root package name */
    public int f17924y = 0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f17925z = false;

    /* renamed from: B, reason: collision with root package name */
    public int f17898B = 23;

    /* renamed from: E, reason: collision with root package name */
    public final HashMap f17901E = new HashMap();

    /* renamed from: F, reason: collision with root package name */
    public final HashMap f17902F = new HashMap();

    /* renamed from: I, reason: collision with root package name */
    public final e f17905I = new e(this, 0);

    /* renamed from: K, reason: collision with root package name */
    public final e f17906K = new e(this, 1);

    /* renamed from: L, reason: collision with root package name */
    public final BluetoothGattCallback f17907L = new BleManagerHandler$4(this);

    public static void D(b bVar, int i3) {
        bVar.getClass();
        bVar.U(6, new Ja.b(i3, 1));
        bVar.f17911h.getClass();
    }

    public static BluetoothGattDescriptor G(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i3) {
        if (bluetoothGattCharacteristic == null || (i3 & bluetoothGattCharacteristic.getProperties()) == 0) {
            return null;
        }
        return bluetoothGattCharacteristic.getDescriptor(c.f17926c);
    }

    public final void E() {
        try {
            Context context = this.f17911h.f17931a;
            context.unregisterReceiver(this.f17905I);
            context.unregisterReceiver(this.f17906K);
        } catch (Exception unused) {
        }
        synchronized (this.f17908e) {
            try {
                boolean z2 = this.f17920t;
                BluetoothDevice bluetoothDevice = this.f17909f;
                if (this.f17910g != null) {
                    this.f17911h.getClass();
                    if (3 >= this.f17911h.a()) {
                        this.f17911h.b(3, StubApp.getString2("26155"));
                    }
                    try {
                        this.f17910g.close();
                    } catch (Throwable unused2) {
                    }
                    this.f17910g = null;
                }
                this.f17897A = false;
                this.f17923x = false;
                this.f17912k.clear();
                this.f17913l = null;
                this.f17914m = false;
                this.f17909f = null;
                this.f17920t = false;
                this.f17924y = 0;
                this.f17898B = 23;
                if (z2 && bluetoothDevice != null) {
                    this.f17911h.getClass();
                    this.f17911h.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void F(q qVar) {
        LinkedBlockingDeque linkedBlockingDeque;
        if (!this.f17914m || (linkedBlockingDeque = this.f17913l) == null) {
            linkedBlockingDeque = this.f17912k;
        }
        linkedBlockingDeque.addFirst(qVar);
        qVar.f17975k = true;
        this.f17921v = false;
    }

    public final boolean H() {
        BluetoothGatt bluetoothGatt = this.f17910g;
        if (bluetoothGatt == null || !this.f17920t) {
            return false;
        }
        if (this.f17897A) {
            return true;
        }
        if (2 >= this.f17911h.a()) {
            this.f17911h.b(2, StubApp.getString2(26194));
        }
        if (3 >= this.f17911h.a()) {
            this.f17911h.b(3, StubApp.getString2(26195));
        }
        boolean beginReliableWrite = bluetoothGatt.beginReliableWrite();
        this.f17897A = beginReliableWrite;
        return beginReliableWrite;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        if (r13.f17977m != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean I(android.bluetooth.BluetoothDevice r12, no.nordicsemi.android.ble.k r13) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: no.nordicsemi.android.ble.b.I(android.bluetooth.BluetoothDevice, no.nordicsemi.android.ble.k):boolean");
    }

    public final boolean J(boolean z2) {
        BluetoothDevice bluetoothDevice = this.f17909f;
        if (bluetoothDevice == null) {
            return false;
        }
        if (z2) {
            if (2 >= this.f17911h.a()) {
                this.f17911h.b(2, StubApp.getString2(26202));
            }
        } else if (2 >= this.f17911h.a()) {
            this.f17911h.b(2, StubApp.getString2(26203));
        }
        if (!z2 && bluetoothDevice.getBondState() == 12) {
            if (5 >= this.f17911h.a()) {
                this.f17911h.b(5, StubApp.getString2(26204));
            }
            this.f17900D.e(bluetoothDevice);
            V(true);
            return true;
        }
        if (3 >= this.f17911h.a()) {
            this.f17911h.b(3, StubApp.getString2(26205));
        }
        boolean createBond = bluetoothDevice.createBond();
        if (!z2 || createBond) {
            return createBond;
        }
        r rVar = new r(4);
        rVar.f(this);
        q qVar = this.f17900D;
        rVar.f17971f = qVar.f17971f;
        rVar.f17972g = qVar.f17972g;
        rVar.f17974i = qVar.f17974i;
        rVar.j = qVar.j;
        qVar.f17971f = null;
        qVar.f17972g = null;
        qVar.f17974i = null;
        qVar.j = null;
        F(rVar);
        r rVar2 = new r(6);
        rVar2.f(this);
        F(rVar2);
        V(true);
        return true;
    }

    public final boolean K(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothGattDescriptor G4;
        int writeDescriptor;
        BluetoothGatt bluetoothGatt = this.f17910g;
        if (bluetoothGatt != null && bluetoothGattCharacteristic != null && this.f17920t && (G4 = G(bluetoothGattCharacteristic, 48)) != null) {
            if (3 >= this.f17911h.a()) {
                this.f17911h.b(3, StubApp.getString2(26206) + bluetoothGattCharacteristic.getUuid() + StubApp.getString2(26207));
            }
            bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, false);
            if (2 >= this.f17911h.a()) {
                this.f17911h.b(2, StubApp.getString2(26208) + bluetoothGattCharacteristic.getUuid());
            }
            if (Build.VERSION.SDK_INT < 33) {
                if (3 >= this.f17911h.a()) {
                    this.f17911h.b(3, StubApp.getString2(26210));
                }
                G4.setValue(BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE);
                if (3 >= this.f17911h.a()) {
                    this.f17911h.b(3, StubApp.getString2(26211));
                }
                return bluetoothGatt.writeDescriptor(G4);
            }
            if (3 >= this.f17911h.a()) {
                this.f17911h.b(3, StubApp.getString2(26209));
            }
            writeDescriptor = bluetoothGatt.writeDescriptor(G4, BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
            if (writeDescriptor == 0) {
                return true;
            }
        }
        return false;
    }

    public final void L() {
        this.f17922w = true;
        this.f17923x = false;
        BluetoothGatt bluetoothGatt = this.f17910g;
        if (bluetoothGatt != null) {
            boolean z2 = this.f17920t;
            this.f17924y = 3;
            if (2 >= this.f17911h.a()) {
                this.f17911h.b(2, z2 ? StubApp.getString2(26212) : StubApp.getString2(26213));
            }
            bluetoothGatt.getDevice();
            if (z2) {
                this.f17911h.getClass();
                this.f17911h.getClass();
            }
            if (3 >= this.f17911h.a()) {
                this.f17911h.b(3, StubApp.getString2(26214));
            }
            bluetoothGatt.disconnect();
            if (z2) {
                return;
            }
            this.f17924y = 0;
            if (4 >= this.f17911h.a()) {
                this.f17911h.b(4, StubApp.getString2(15157));
            }
            E();
            this.f17911h.getClass();
            this.f17911h.getClass();
        }
        q qVar = this.f17900D;
        if (qVar != null && qVar.f17969d == 3) {
            BluetoothDevice bluetoothDevice = this.f17909f;
            if (bluetoothDevice == null && bluetoothGatt == null) {
                qVar.c();
            } else {
                if (bluetoothDevice == null) {
                    bluetoothDevice = bluetoothGatt.getDevice();
                }
                qVar.e(bluetoothDevice);
            }
        }
        V(true);
    }

    public final boolean M(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothGattDescriptor G4;
        int writeDescriptor;
        BluetoothGatt bluetoothGatt = this.f17910g;
        if (bluetoothGatt == null || bluetoothGattCharacteristic == null || !this.f17920t || (G4 = G(bluetoothGattCharacteristic, 32)) == null) {
            return false;
        }
        if (3 >= this.f17911h.a()) {
            this.f17911h.b(3, StubApp.getString2(26206) + bluetoothGattCharacteristic.getUuid() + StubApp.getString2(26215));
        }
        bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, true);
        if (2 >= this.f17911h.a()) {
            this.f17911h.b(2, StubApp.getString2(26216) + bluetoothGattCharacteristic.getUuid());
        }
        if (Build.VERSION.SDK_INT >= 33) {
            if (3 >= this.f17911h.a()) {
                this.f17911h.b(3, StubApp.getString2(26217));
            }
            writeDescriptor = bluetoothGatt.writeDescriptor(G4, BluetoothGattDescriptor.ENABLE_INDICATION_VALUE);
            return writeDescriptor == 0;
        }
        if (3 >= this.f17911h.a()) {
            this.f17911h.b(3, StubApp.getString2(26218));
        }
        G4.setValue(BluetoothGattDescriptor.ENABLE_INDICATION_VALUE);
        if (3 >= this.f17911h.a()) {
            this.f17911h.b(3, StubApp.getString2(26211));
        }
        return bluetoothGatt.writeDescriptor(G4);
    }

    public final boolean N(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothGattDescriptor G4;
        int writeDescriptor;
        BluetoothGatt bluetoothGatt = this.f17910g;
        if (bluetoothGatt == null || bluetoothGattCharacteristic == null || !this.f17920t || (G4 = G(bluetoothGattCharacteristic, 16)) == null) {
            return false;
        }
        if (3 >= this.f17911h.a()) {
            this.f17911h.b(3, StubApp.getString2(26206) + bluetoothGattCharacteristic.getUuid() + StubApp.getString2(26215));
        }
        bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, true);
        if (2 >= this.f17911h.a()) {
            this.f17911h.b(2, StubApp.getString2(26219) + bluetoothGattCharacteristic.getUuid());
        }
        if (Build.VERSION.SDK_INT >= 33) {
            if (3 >= this.f17911h.a()) {
                this.f17911h.b(3, StubApp.getString2(26220));
            }
            writeDescriptor = bluetoothGatt.writeDescriptor(G4, BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
            return writeDescriptor == 0;
        }
        if (3 >= this.f17911h.a()) {
            this.f17911h.b(3, StubApp.getString2(26221));
        }
        G4.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
        if (3 >= this.f17911h.a()) {
            this.f17911h.b(3, StubApp.getString2(26211));
        }
        return bluetoothGatt.writeDescriptor(G4);
    }

    public final boolean O(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothGatt bluetoothGatt = this.f17910g;
        if (bluetoothGatt == null || bluetoothGattCharacteristic == null || !this.f17920t || (bluetoothGattCharacteristic.getProperties() & 2) == 0) {
            return false;
        }
        try {
            if (2 >= this.f17911h.a()) {
                this.f17911h.b(2, StubApp.getString2("26222") + bluetoothGattCharacteristic.getUuid());
            }
            if (3 >= this.f17911h.a()) {
                this.f17911h.b(3, StubApp.getString2("26223") + bluetoothGattCharacteristic.getUuid() + StubApp.getString2("74"));
            }
            return bluetoothGatt.readCharacteristic(bluetoothGattCharacteristic);
        } catch (SecurityException e10) {
            if (6 < this.f17911h.a()) {
                return false;
            }
            this.f17911h.b(6, e10.getLocalizedMessage());
            return false;
        }
    }

    public final boolean P() {
        BluetoothGatt bluetoothGatt = this.f17910g;
        if (bluetoothGatt != null) {
            if (2 >= this.f17911h.a()) {
                this.f17911h.b(2, StubApp.getString2(26224));
            }
            if (3 >= this.f17911h.a()) {
                this.f17911h.b(3, StubApp.getString2(26225));
            }
            try {
                if (bluetoothGatt.getClass().getMethod(StubApp.getString2("11304"), new Class[0]).invoke(bluetoothGatt, new Object[0]) == Boolean.TRUE) {
                    return true;
                }
            } catch (Exception e10) {
                Log.w(StubApp.getString2(26147), StubApp.getString2(26226), e10);
                if (5 >= this.f17911h.a()) {
                    this.f17911h.b(5, StubApp.getString2(26227));
                }
            }
        }
        return false;
    }

    public final boolean Q() {
        BluetoothDevice bluetoothDevice = this.f17909f;
        if (bluetoothDevice != null) {
            if (2 >= this.f17911h.a()) {
                this.f17911h.b(2, StubApp.getString2(26228));
            }
            if (bluetoothDevice.getBondState() == 10) {
                if (5 >= this.f17911h.a()) {
                    this.f17911h.b(5, StubApp.getString2(26229));
                }
                this.f17900D.e(bluetoothDevice);
                V(true);
                return true;
            }
            try {
                Method method = bluetoothDevice.getClass().getMethod(StubApp.getString2("11242"), new Class[0]);
                if (3 >= this.f17911h.a()) {
                    this.f17911h.b(3, StubApp.getString2("26230"));
                }
                this.f17922w = true;
                if (method.invoke(bluetoothDevice, new Object[0]) == Boolean.TRUE) {
                    return true;
                }
            } catch (Exception e10) {
                Log.w(StubApp.getString2(26147), StubApp.getString2(26231), e10);
                return false;
            }
        }
        return false;
    }

    public final boolean R(int i3) {
        BluetoothGatt bluetoothGatt = this.f17910g;
        if (bluetoothGatt == null || !this.f17920t) {
            return false;
        }
        if (2 >= this.f17911h.a()) {
            this.f17911h.b(2, StubApp.getString2(26232));
        }
        if (3 >= this.f17911h.a()) {
            this.f17911h.b(3, StubApp.getString2(26233) + i3 + StubApp.getString2(74));
        }
        return bluetoothGatt.requestMtu(i3);
    }

    public final boolean S(boolean z2) {
        BluetoothGattService service;
        BluetoothGatt bluetoothGatt = this.f17910g;
        if (bluetoothGatt == null || !this.f17920t || (service = bluetoothGatt.getService(c.f17927d)) == null) {
            return false;
        }
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(c.f17928e);
        return z2 ? N(characteristic) : K(characteristic);
    }

    public final boolean T(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i3) {
        int writeCharacteristic;
        BluetoothGatt bluetoothGatt = this.f17910g;
        if (bluetoothGatt != null && bluetoothGattCharacteristic != null && this.f17920t && (bluetoothGattCharacteristic.getProperties() & 12) != 0) {
            if (bArr == null) {
                try {
                    bArr = new byte[0];
                } catch (SecurityException e10) {
                    if (6 >= this.f17911h.a()) {
                        this.f17911h.b(6, e10.getLocalizedMessage());
                    }
                }
            }
            int i10 = Build.VERSION.SDK_INT;
            String string2 = StubApp.getString2(26234);
            String string22 = StubApp.getString2(1561);
            String string23 = StubApp.getString2(26235);
            String string24 = StubApp.getString2(74);
            if (i10 < 33) {
                if (2 >= this.f17911h.a()) {
                    this.f17911h.b(2, string23 + bluetoothGattCharacteristic.getUuid() + string22 + AbstractC1499a.e(i3) + string24);
                }
                if (3 >= this.f17911h.a()) {
                    this.f17911h.b(3, StubApp.getString2("26236") + AbstractC1499a.b(bArr) + string24);
                }
                bluetoothGattCharacteristic.setValue(bArr);
                if (3 >= this.f17911h.a()) {
                    this.f17911h.b(3, StubApp.getString2("26237") + AbstractC1499a.e(i3) + string24);
                }
                bluetoothGattCharacteristic.setWriteType(i3);
                if (3 >= this.f17911h.a()) {
                    this.f17911h.b(3, string2 + bluetoothGattCharacteristic.getUuid() + string24);
                }
                return bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic);
            }
            if (2 >= this.f17911h.a()) {
                this.f17911h.b(2, string23 + bluetoothGattCharacteristic.getUuid() + string22 + AbstractC1499a.e(i3) + string24);
            }
            if (3 >= this.f17911h.a()) {
                this.f17911h.b(3, string2 + bluetoothGattCharacteristic.getUuid() + StubApp.getString2("12722") + AbstractC1499a.b(bArr) + StubApp.getString2("81") + AbstractC1499a.e(i3) + string24);
            }
            writeCharacteristic = bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic, bArr, i3);
            if (writeCharacteristic == 0) {
                return true;
            }
        }
        return false;
    }

    public final void U(int i3, j jVar) {
        if (i3 >= this.f17911h.a()) {
            this.f17911h.b(i3, jVar.a());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002d A[Catch: all -> 0x0013, TRY_ENTER, TryCatch #0 {all -> 0x0013, blocks: (B:216:0x0005, B:218:0x0009, B:221:0x0010, B:4:0x0016, B:9:0x001c, B:12:0x001f, B:14:0x0023, B:16:0x002d, B:18:0x0031, B:20:0x003e, B:21:0x0048, B:23:0x004c, B:25:0x0053, B:27:0x005c, B:33:0x0069, B:35:0x006d, B:38:0x0072, B:40:0x007b, B:41:0x0084, B:43:0x0093, B:46:0x0099, B:48:0x009d, B:52:0x00a9, B:54:0x00ad, B:56:0x00b5, B:57:0x00c0, B:59:0x00c6, B:60:0x00cf, B:62:0x00d3, B:63:0x00e1, B:64:0x00e8, B:65:0x00eb, B:69:0x0300, B:72:0x0314, B:73:0x0306, B:79:0x00f0, B:80:0x00f5, B:81:0x00f6, B:83:0x00fc, B:84:0x0109, B:86:0x010d, B:89:0x0112, B:91:0x011a, B:92:0x0125, B:94:0x012d, B:95:0x0138, B:97:0x0141, B:99:0x014e, B:100:0x0153, B:101:0x0154, B:102:0x0159, B:103:0x015a, B:104:0x015f, B:105:0x0160, B:107:0x0169, B:108:0x016f, B:110:0x0173, B:113:0x0185, B:115:0x0189, B:118:0x018f, B:121:0x019d, B:124:0x01a7, B:127:0x01b1, B:129:0x01ba, B:130:0x01c5, B:132:0x01cc, B:133:0x01d2, B:134:0x01d8, B:136:0x01dc, B:139:0x01e2, B:142:0x01ec, B:143:0x01f7, B:144:0x01fc, B:145:0x01fd, B:146:0x0202, B:147:0x0203, B:148:0x020b, B:149:0x0213, B:150:0x021b, B:151:0x0223, B:153:0x0227, B:156:0x022c, B:159:0x0231, B:161:0x0239, B:162:0x0244, B:164:0x024c, B:165:0x0257, B:167:0x025c, B:169:0x0260, B:172:0x0265, B:175:0x026a, B:177:0x0272, B:178:0x027d, B:180:0x0285, B:181:0x0290, B:182:0x0296, B:184:0x029c, B:188:0x02a8, B:189:0x02b1, B:190:0x02b8, B:192:0x02c5, B:193:0x02c9, B:194:0x02db, B:195:0x02e0, B:196:0x02e5, B:197:0x02ea, B:198:0x02ef, B:199:0x0320, B:200:0x0325, B:202:0x00de, B:203:0x0326), top: B:215:0x0005, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006d A[Catch: all -> 0x0013, TRY_LEAVE, TryCatch #0 {all -> 0x0013, blocks: (B:216:0x0005, B:218:0x0009, B:221:0x0010, B:4:0x0016, B:9:0x001c, B:12:0x001f, B:14:0x0023, B:16:0x002d, B:18:0x0031, B:20:0x003e, B:21:0x0048, B:23:0x004c, B:25:0x0053, B:27:0x005c, B:33:0x0069, B:35:0x006d, B:38:0x0072, B:40:0x007b, B:41:0x0084, B:43:0x0093, B:46:0x0099, B:48:0x009d, B:52:0x00a9, B:54:0x00ad, B:56:0x00b5, B:57:0x00c0, B:59:0x00c6, B:60:0x00cf, B:62:0x00d3, B:63:0x00e1, B:64:0x00e8, B:65:0x00eb, B:69:0x0300, B:72:0x0314, B:73:0x0306, B:79:0x00f0, B:80:0x00f5, B:81:0x00f6, B:83:0x00fc, B:84:0x0109, B:86:0x010d, B:89:0x0112, B:91:0x011a, B:92:0x0125, B:94:0x012d, B:95:0x0138, B:97:0x0141, B:99:0x014e, B:100:0x0153, B:101:0x0154, B:102:0x0159, B:103:0x015a, B:104:0x015f, B:105:0x0160, B:107:0x0169, B:108:0x016f, B:110:0x0173, B:113:0x0185, B:115:0x0189, B:118:0x018f, B:121:0x019d, B:124:0x01a7, B:127:0x01b1, B:129:0x01ba, B:130:0x01c5, B:132:0x01cc, B:133:0x01d2, B:134:0x01d8, B:136:0x01dc, B:139:0x01e2, B:142:0x01ec, B:143:0x01f7, B:144:0x01fc, B:145:0x01fd, B:146:0x0202, B:147:0x0203, B:148:0x020b, B:149:0x0213, B:150:0x021b, B:151:0x0223, B:153:0x0227, B:156:0x022c, B:159:0x0231, B:161:0x0239, B:162:0x0244, B:164:0x024c, B:165:0x0257, B:167:0x025c, B:169:0x0260, B:172:0x0265, B:175:0x026a, B:177:0x0272, B:178:0x027d, B:180:0x0285, B:181:0x0290, B:182:0x0296, B:184:0x029c, B:188:0x02a8, B:189:0x02b1, B:190:0x02b8, B:192:0x02c5, B:193:0x02c9, B:194:0x02db, B:195:0x02e0, B:196:0x02e5, B:197:0x02ea, B:198:0x02ef, B:199:0x0320, B:200:0x0325, B:202:0x00de, B:203:0x0326), top: B:215:0x0005, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0072 A[Catch: all -> 0x0013, TRY_ENTER, TryCatch #0 {all -> 0x0013, blocks: (B:216:0x0005, B:218:0x0009, B:221:0x0010, B:4:0x0016, B:9:0x001c, B:12:0x001f, B:14:0x0023, B:16:0x002d, B:18:0x0031, B:20:0x003e, B:21:0x0048, B:23:0x004c, B:25:0x0053, B:27:0x005c, B:33:0x0069, B:35:0x006d, B:38:0x0072, B:40:0x007b, B:41:0x0084, B:43:0x0093, B:46:0x0099, B:48:0x009d, B:52:0x00a9, B:54:0x00ad, B:56:0x00b5, B:57:0x00c0, B:59:0x00c6, B:60:0x00cf, B:62:0x00d3, B:63:0x00e1, B:64:0x00e8, B:65:0x00eb, B:69:0x0300, B:72:0x0314, B:73:0x0306, B:79:0x00f0, B:80:0x00f5, B:81:0x00f6, B:83:0x00fc, B:84:0x0109, B:86:0x010d, B:89:0x0112, B:91:0x011a, B:92:0x0125, B:94:0x012d, B:95:0x0138, B:97:0x0141, B:99:0x014e, B:100:0x0153, B:101:0x0154, B:102:0x0159, B:103:0x015a, B:104:0x015f, B:105:0x0160, B:107:0x0169, B:108:0x016f, B:110:0x0173, B:113:0x0185, B:115:0x0189, B:118:0x018f, B:121:0x019d, B:124:0x01a7, B:127:0x01b1, B:129:0x01ba, B:130:0x01c5, B:132:0x01cc, B:133:0x01d2, B:134:0x01d8, B:136:0x01dc, B:139:0x01e2, B:142:0x01ec, B:143:0x01f7, B:144:0x01fc, B:145:0x01fd, B:146:0x0202, B:147:0x0203, B:148:0x020b, B:149:0x0213, B:150:0x021b, B:151:0x0223, B:153:0x0227, B:156:0x022c, B:159:0x0231, B:161:0x0239, B:162:0x0244, B:164:0x024c, B:165:0x0257, B:167:0x025c, B:169:0x0260, B:172:0x0265, B:175:0x026a, B:177:0x0272, B:178:0x027d, B:180:0x0285, B:181:0x0290, B:182:0x0296, B:184:0x029c, B:188:0x02a8, B:189:0x02b1, B:190:0x02b8, B:192:0x02c5, B:193:0x02c9, B:194:0x02db, B:195:0x02e0, B:196:0x02e5, B:197:0x02ea, B:198:0x02ef, B:199:0x0320, B:200:0x0325, B:202:0x00de, B:203:0x0326), top: B:215:0x0005, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02fe A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0306 A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:216:0x0005, B:218:0x0009, B:221:0x0010, B:4:0x0016, B:9:0x001c, B:12:0x001f, B:14:0x0023, B:16:0x002d, B:18:0x0031, B:20:0x003e, B:21:0x0048, B:23:0x004c, B:25:0x0053, B:27:0x005c, B:33:0x0069, B:35:0x006d, B:38:0x0072, B:40:0x007b, B:41:0x0084, B:43:0x0093, B:46:0x0099, B:48:0x009d, B:52:0x00a9, B:54:0x00ad, B:56:0x00b5, B:57:0x00c0, B:59:0x00c6, B:60:0x00cf, B:62:0x00d3, B:63:0x00e1, B:64:0x00e8, B:65:0x00eb, B:69:0x0300, B:72:0x0314, B:73:0x0306, B:79:0x00f0, B:80:0x00f5, B:81:0x00f6, B:83:0x00fc, B:84:0x0109, B:86:0x010d, B:89:0x0112, B:91:0x011a, B:92:0x0125, B:94:0x012d, B:95:0x0138, B:97:0x0141, B:99:0x014e, B:100:0x0153, B:101:0x0154, B:102:0x0159, B:103:0x015a, B:104:0x015f, B:105:0x0160, B:107:0x0169, B:108:0x016f, B:110:0x0173, B:113:0x0185, B:115:0x0189, B:118:0x018f, B:121:0x019d, B:124:0x01a7, B:127:0x01b1, B:129:0x01ba, B:130:0x01c5, B:132:0x01cc, B:133:0x01d2, B:134:0x01d8, B:136:0x01dc, B:139:0x01e2, B:142:0x01ec, B:143:0x01f7, B:144:0x01fc, B:145:0x01fd, B:146:0x0202, B:147:0x0203, B:148:0x020b, B:149:0x0213, B:150:0x021b, B:151:0x0223, B:153:0x0227, B:156:0x022c, B:159:0x0231, B:161:0x0239, B:162:0x0244, B:164:0x024c, B:165:0x0257, B:167:0x025c, B:169:0x0260, B:172:0x0265, B:175:0x026a, B:177:0x0272, B:178:0x027d, B:180:0x0285, B:181:0x0290, B:182:0x0296, B:184:0x029c, B:188:0x02a8, B:189:0x02b1, B:190:0x02b8, B:192:0x02c5, B:193:0x02c9, B:194:0x02db, B:195:0x02e0, B:196:0x02e5, B:197:0x02ea, B:198:0x02ef, B:199:0x0320, B:200:0x0325, B:202:0x00de, B:203:0x0326), top: B:215:0x0005, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0141 A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:216:0x0005, B:218:0x0009, B:221:0x0010, B:4:0x0016, B:9:0x001c, B:12:0x001f, B:14:0x0023, B:16:0x002d, B:18:0x0031, B:20:0x003e, B:21:0x0048, B:23:0x004c, B:25:0x0053, B:27:0x005c, B:33:0x0069, B:35:0x006d, B:38:0x0072, B:40:0x007b, B:41:0x0084, B:43:0x0093, B:46:0x0099, B:48:0x009d, B:52:0x00a9, B:54:0x00ad, B:56:0x00b5, B:57:0x00c0, B:59:0x00c6, B:60:0x00cf, B:62:0x00d3, B:63:0x00e1, B:64:0x00e8, B:65:0x00eb, B:69:0x0300, B:72:0x0314, B:73:0x0306, B:79:0x00f0, B:80:0x00f5, B:81:0x00f6, B:83:0x00fc, B:84:0x0109, B:86:0x010d, B:89:0x0112, B:91:0x011a, B:92:0x0125, B:94:0x012d, B:95:0x0138, B:97:0x0141, B:99:0x014e, B:100:0x0153, B:101:0x0154, B:102:0x0159, B:103:0x015a, B:104:0x015f, B:105:0x0160, B:107:0x0169, B:108:0x016f, B:110:0x0173, B:113:0x0185, B:115:0x0189, B:118:0x018f, B:121:0x019d, B:124:0x01a7, B:127:0x01b1, B:129:0x01ba, B:130:0x01c5, B:132:0x01cc, B:133:0x01d2, B:134:0x01d8, B:136:0x01dc, B:139:0x01e2, B:142:0x01ec, B:143:0x01f7, B:144:0x01fc, B:145:0x01fd, B:146:0x0202, B:147:0x0203, B:148:0x020b, B:149:0x0213, B:150:0x021b, B:151:0x0223, B:153:0x0227, B:156:0x022c, B:159:0x0231, B:161:0x0239, B:162:0x0244, B:164:0x024c, B:165:0x0257, B:167:0x025c, B:169:0x0260, B:172:0x0265, B:175:0x026a, B:177:0x0272, B:178:0x027d, B:180:0x0285, B:181:0x0290, B:182:0x0296, B:184:0x029c, B:188:0x02a8, B:189:0x02b1, B:190:0x02b8, B:192:0x02c5, B:193:0x02c9, B:194:0x02db, B:195:0x02e0, B:196:0x02e5, B:197:0x02ea, B:198:0x02ef, B:199:0x0320, B:200:0x0325, B:202:0x00de, B:203:0x0326), top: B:215:0x0005, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void V(boolean r10) {
        /*
            Method dump skipped, instructions count: 902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: no.nordicsemi.android.ble.b.V(boolean):void");
    }

    public final void W(BluetoothDevice bluetoothDevice) {
        if (this.f17924y == 0) {
            return;
        }
        boolean z2 = this.f17920t;
        boolean z10 = this.f17915n;
        this.f17920t = false;
        this.f17915n = false;
        this.f17917q = false;
        this.f17916p = false;
        this.f17898B = 23;
        this.f17924y = 0;
        if (!z2) {
            if (5 >= this.f17911h.a()) {
                this.f17911h.b(5, StubApp.getString2(26246));
            }
            E();
            this.f17911h.getClass();
            this.f17911h.getClass();
        } else if (this.f17922w) {
            if (4 >= this.f17911h.a()) {
                this.f17911h.b(4, StubApp.getString2(15157));
            }
            q qVar = this.f17900D;
            if (qVar == null || qVar.f17969d != 6) {
                E();
            }
            this.f17911h.getClass();
            this.f17911h.getClass();
            if (qVar != null && qVar.f17969d == 3) {
                qVar.e(bluetoothDevice);
                this.f17900D = null;
            }
        } else {
            if (5 >= this.f17911h.a()) {
                this.f17911h.b(5, StubApp.getString2(13747));
            }
            this.f17911h.getClass();
            this.f17911h.getClass();
        }
        HashMap hashMap = this.f17901E;
        for (u uVar : hashMap.values()) {
            uVar.f17981a = null;
            uVar.f17982b = null;
            uVar.f17983c = null;
            uVar.f17985e = 0;
        }
        hashMap.clear();
        this.f17902F.clear();
        this.f17903G = null;
        if (z10) {
            this.f17911h.c();
        }
    }

    @Override // f5.u0
    public final void x(Runnable runnable) {
        this.j.post(runnable);
    }

    @Override // f5.u0
    public final void y(Runnable runnable, long j) {
        new Timer().schedule(new E9.j(runnable, 2), j);
    }
}
