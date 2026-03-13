package wb;

import Cb.g;
import Sb.l;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.os.Handler;
import com.stub.StubApp;
import f4.C0882f;
import i5.C1059c;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import no.nordicsemi.android.ble.k;
import no.nordicsemi.android.ble.v;
import org.slf4j.LoggerFactory;
import sb.C1644e0;
import vb.InterfaceC1845b;
import xb.C1947d;
import yb.C1983a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class f extends no.nordicsemi.android.ble.c {

    /* renamed from: t, reason: collision with root package name */
    public static final org.slf4j.a f22294t = LoggerFactory.getLogger((Class<?>) f.class);

    /* renamed from: h, reason: collision with root package name */
    public BluetoothGattCharacteristic f22295h;

    /* renamed from: i, reason: collision with root package name */
    public BluetoothGattCharacteristic f22296i;
    public final BluetoothDevice j;

    /* renamed from: k, reason: collision with root package name */
    public final C0882f f22297k;

    /* renamed from: l, reason: collision with root package name */
    public int f22298l;

    /* renamed from: m, reason: collision with root package name */
    public final int f22299m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f22300n;

    /* renamed from: o, reason: collision with root package name */
    public C1059c f22301o;

    /* renamed from: p, reason: collision with root package name */
    public final Handler f22302p;

    /* renamed from: q, reason: collision with root package name */
    public final C1875a f22303q;

    /* renamed from: r, reason: collision with root package name */
    public final byte[] f22304r;

    /* renamed from: s, reason: collision with root package name */
    public final LinkedList f22305s;

    static {
        UUID uuid = C1875a.f22279a;
        UUID.fromString(StubApp.getString2(11299));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f(android.content.Context r5, android.bluetooth.BluetoothDevice r6) {
        /*
            r4 = this;
            r0 = 0
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            wb.a r2 = new wb.a
            r2.<init>()
            r4.<init>(r5, r1)
            f4.f r5 = new f4.f
            r3 = 18
            r5.<init>(r3, r0)
            r4.f22297k = r5
            r5 = 498(0x1f2, float:6.98E-43)
            r4.f22299m = r5
            r5 = 9
            byte[] r5 = new byte[r5]
            r5 = {x0036: FILL_ARRAY_DATA , data: [0, 0, 0, 1, 0, 0, -1, 6, -96} // fill-array
            r4.f22304r = r5
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            r4.f22305s = r5
            r4.f22302p = r1
            r4.j = r6
            r4.f22303q = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wb.f.<init>(android.content.Context, android.bluetooth.BluetoothDevice):void");
    }

    @Override // no.nordicsemi.android.ble.c
    public final int a() {
        return this.f22300n ? 4 : 5;
    }

    @Override // no.nordicsemi.android.ble.c
    public final void c() {
        C1059c c1059c = this.f22301o;
        if (c1059c != null) {
            C1983a e10 = new C1983a();
            Intrinsics.checkNotNullParameter(e10, "e");
            ((Sb.e) c1059c.f14844c).i(e10, false);
            ((Sb.e) c1059c.f14845d).i(e10, false);
        }
        this.f22301o = null;
        this.f22295h = null;
        this.f22296i = null;
        this.f22298l = 0;
        this.f17932b.x(new v(this, 6));
    }

    public final void d(final byte[] bArr, final long j, final Class cls, final InterfaceC1845b interfaceC1845b) {
        no.nordicsemi.android.ble.b bVar = this.f17932b;
        final boolean z2 = bVar.f17920t;
        k kVar = new k(this.j);
        kVar.g(bVar);
        kVar.f17971f = new mc.b() { // from class: wb.b
            @Override // mc.b
            public final void a() {
                f fVar = f.this;
                boolean z10 = z2;
                byte[] data = bArr;
                InterfaceC1845b interfaceC1845b2 = interfaceC1845b;
                long j3 = j;
                Class cls2 = cls;
                if (!z10) {
                    synchronized (fVar) {
                        Iterator it = fVar.f22305s.iterator();
                        while (it.hasNext()) {
                            ((g) it.next()).getClass();
                        }
                    }
                }
                if (fVar.f22298l < data.length) {
                    interfaceC1845b2.i(new Db.a(data.length, fVar.f22298l));
                    return;
                }
                C1059c c1059c = fVar.f22301o;
                e transaction = new e(fVar, data, cls2, interfaceC1845b2);
                c1059c.getClass();
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                if (((Sb.e) c1059c.f14844c).j(new C1947d(data, j3, transaction)) instanceof l) {
                    throw new IllegalStateException(StubApp.getString2(24080));
                }
            }
        };
        kVar.f17972g = new C1644e0(interfaceC1845b, 14);
        kVar.f17956t = 3;
        kVar.f17957u = 500;
        kVar.a();
    }
}
