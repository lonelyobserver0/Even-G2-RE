package E;

import android.bluetooth.BluetoothDevice;
import android.util.Log;
import com.stub.StubApp;
import o0.C1428c;
import p0.AbstractC1482f;
import sb.C1674t0;
import v0.C1802E;
import v0.C1808c;
import v0.C1809d;
import v0.C1830z;
import v0.SurfaceHolderCallbackC1827w;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1713a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1714b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1715c;

    public /* synthetic */ j(int i3, int i10, Object obj) {
        this.f1713a = i10;
        this.f1715c = obj;
        this.f1714b = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.f1714b;
        Object obj = this.f1715c;
        switch (this.f1713a) {
            case 0:
                ((b) obj).e(i3);
                break;
            case 1:
                Object obj2 = ((no.nordicsemi.android.ble.m) obj).f17978o;
                if (obj2 != null) {
                    try {
                        wb.f fVar = ((wb.c) obj2).f22287a;
                        fVar.f22298l = Math.max(i3 - 3, fVar.f22298l);
                        break;
                    } catch (Throwable th) {
                        Log.e(StubApp.getString2(1573), StubApp.getString2(1574), th);
                        return;
                    }
                }
                break;
            case 2:
                C1809d c1809d = ((C1808c) obj).f21704b;
                c1809d.getClass();
                if (i3 != -3 && i3 != -2) {
                    if (i3 == -1) {
                        SurfaceHolderCallbackC1827w surfaceHolderCallbackC1827w = c1809d.f21710c;
                        if (surfaceHolderCallbackC1827w != null) {
                            C1830z c1830z = surfaceHolderCallbackC1827w.f21810a;
                            c1830z.I(-1, 2, c1830z.w());
                        }
                        c1809d.a();
                        c1809d.c(1);
                        break;
                    } else if (i3 == 1) {
                        c1809d.c(2);
                        SurfaceHolderCallbackC1827w surfaceHolderCallbackC1827w2 = c1809d.f21710c;
                        if (surfaceHolderCallbackC1827w2 != null) {
                            C1830z c1830z2 = surfaceHolderCallbackC1827w2.f21810a;
                            c1830z2.I(1, 1, c1830z2.w());
                            break;
                        }
                    } else {
                        AbstractC1482f.p(i3, StubApp.getString2(1571), StubApp.getString2(1572));
                        break;
                    }
                } else {
                    if (i3 != -2) {
                        C1428c c1428c = c1809d.f21711d;
                        if (!(c1428c != null && c1428c.f18128a == 1)) {
                            c1809d.c(4);
                            break;
                        }
                    }
                    SurfaceHolderCallbackC1827w surfaceHolderCallbackC1827w3 = c1809d.f21710c;
                    if (surfaceHolderCallbackC1827w3 != null) {
                        C1830z c1830z3 = surfaceHolderCallbackC1827w3.f21810a;
                        c1830z3.I(0, 1, c1830z3.w());
                    }
                    c1809d.c(3);
                    break;
                }
                break;
            default:
                C1802E c1802e = (C1802E) obj;
                int i10 = c1802e.f21553a[i3].f21717b;
                w0.c cVar = c1802e.f21535A;
                cVar.J(cVar.I(), 1033, new C1674t0(28));
                break;
        }
    }

    public /* synthetic */ j(no.nordicsemi.android.ble.m mVar, BluetoothDevice bluetoothDevice, int i3) {
        this.f1713a = 1;
        this.f1715c = mVar;
        this.f1714b = i3;
    }

    public /* synthetic */ j(C1802E c1802e, int i3, boolean z2) {
        this.f1713a = 3;
        this.f1715c = c1802e;
        this.f1714b = i3;
    }
}
