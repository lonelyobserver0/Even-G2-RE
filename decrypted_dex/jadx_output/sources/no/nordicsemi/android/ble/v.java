package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import android.widget.Toast;
import c5.B;
import com.stub.StubApp;
import f4.C0879c;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.MessageCodec;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import r7.C1580f;
import sb.C1637b;
import sb.C1643e;
import sb.C1649h;
import ub.C1786c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final /* synthetic */ class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17986a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17987b;

    public /* synthetic */ v(Object obj, int i3) {
        this.f17986a = i3;
        this.f17987b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17986a) {
            case 0:
                ((w) this.f17987b).getClass();
                return;
            case 1:
                ((C1580f) this.f17987b).requestLayout();
                return;
            case 2:
                C1637b c1637b = (C1637b) this.f17987b;
                if (c1637b.j) {
                    return;
                }
                while (true) {
                    WeakReference weakReference = (WeakReference) c1637b.f20935e.poll();
                    if (weakReference == null) {
                        c1637b.f20937g.postDelayed(c1637b.f20938h, c1637b.f20940k);
                        return;
                    }
                    Long l9 = (Long) TypeIntrinsics.asMutableMap(c1637b.f20936f).remove(weakReference);
                    if (l9 != null) {
                        c1637b.f20933c.remove(l9);
                        c1637b.f20934d.remove(l9);
                        long longValue = l9.longValue();
                        C0879c c0879c = c1637b.f20931a;
                        C1649h callback = new C1649h(longValue);
                        C1643e c1643e = (C1643e) c0879c.f13742a;
                        Intrinsics.checkNotNullParameter(callback, "callback");
                        new BasicMessageChannel(c1643e.f20951a, StubApp.getString2(9424), (MessageCodec) C1643e.f20950b.getValue()).send(CollectionsKt.listOf(l9), new B(callback, 27));
                    }
                }
            case 3:
                Intrinsics.checkNotNullParameter((t7.c) this.f17987b, StubApp.getString2(26273));
                t7.c currentStatus = t7.c.f21217a;
                Intrinsics.checkNotNullParameter(currentStatus, "$currentStatus");
                u7.c reason = u7.c.f21461a;
                Intrinsics.checkNotNullParameter(reason, "$reason");
                throw null;
            case 4:
                Toast toast = ((C1786c) this.f17987b).f21485b;
                if (toast != null) {
                    toast.show();
                    return;
                }
                return;
            case 5:
                w0.c cVar = (w0.c) this.f17987b;
                cVar.J(cVar.E(), 1028, new w0.b(13));
                cVar.f21994f.d();
                return;
            case 6:
                wb.f fVar = (wb.f) this.f17987b;
                synchronized (fVar) {
                    Iterator it = fVar.f22305s.iterator();
                    while (it.hasNext()) {
                        ((Cb.g) it.next()).a();
                    }
                }
                return;
            default:
                x0.s sVar = (x0.s) this.f17987b;
                if (sVar.h0 >= 300000) {
                    ((x0.v) sVar.f22783r.f9233b).f22804i1 = true;
                    sVar.h0 = 0L;
                    return;
                }
                return;
        }
    }

    public /* synthetic */ v(w wVar, BluetoothDevice bluetoothDevice, byte[] bArr, int i3) {
        this.f17986a = 0;
        this.f17987b = wVar;
    }
}
