package Ab;

import com.stub.StubApp;
import io.flutter.plugin.common.EventChannel;
import l4.E0;
import rc.C1589d;
import tc.I;
import tc.J;
import tc.L;
import tc.v;
import tc.z;
import uc.C1787a;
import vc.C1850b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f254a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E0 f255b;

    public /* synthetic */ a(E0 e02) {
        this.f255b = e02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f254a) {
            case 0:
                ((i) this.f255b.f16038c).f288c.f20570f.f22300n = true;
                break;
            default:
                C1589d c1589d = ((i) this.f255b.f16038c).f288c;
                C1787a c1787a = c1589d.f20570f;
                c1787a.f22300n = true;
                c1787a.e(StubApp.getString2(379));
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                Object[] objArr3 = 0;
                Object[] objArr4 = 0;
                String str = c1589d.f20569e;
                Object[] objArr5 = 0 == true ? 1 : 0;
                L l9 = new L(str, objArr5, new J(null, I.f21276k, 13), 22);
                C1850b c1850b = c1589d.f20565a;
                EventChannel.EventSink eventSink = c1850b.f21940a;
                if (eventSink != null) {
                    eventSink.success(l9.a());
                }
                int i3 = 28;
                L l10 = new L(str, objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0, i3);
                EventChannel.EventSink eventSink2 = c1850b.f21940a;
                if (eventSink2 != null) {
                    eventSink2.success(l10.a());
                }
                z zVar = new z(str, objArr2 == true ? 1 : 0, i3);
                EventChannel.EventSink eventSink3 = c1589d.f20566b.f21940a;
                if (eventSink3 != null) {
                    eventSink3.success(zVar.a());
                }
                v vVar = new v(str, objArr == true ? 1 : 0, i3);
                EventChannel.EventSink eventSink4 = c1589d.f20567c.f21940a;
                if (eventSink4 != null) {
                    eventSink4.success(vVar.a());
                    break;
                }
                break;
        }
    }

    public /* synthetic */ a(E0 e02, i iVar) {
        this.f255b = e02;
    }
}
