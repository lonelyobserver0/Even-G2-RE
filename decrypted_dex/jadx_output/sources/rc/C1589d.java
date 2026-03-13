package rc;

import Ab.i;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;
import uc.C1787a;
import vc.C1850b;

/* renamed from: rc.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class C1589d {

    /* renamed from: a, reason: collision with root package name */
    public final C1850b f20565a;

    /* renamed from: b, reason: collision with root package name */
    public final C1850b f20566b;

    /* renamed from: c, reason: collision with root package name */
    public final C1850b f20567c;

    /* renamed from: d, reason: collision with root package name */
    public final i f20568d;

    /* renamed from: e, reason: collision with root package name */
    public final String f20569e;

    /* renamed from: f, reason: collision with root package name */
    public final C1787a f20570f;

    /* renamed from: g, reason: collision with root package name */
    public final Gb.c f20571g;

    /* renamed from: h, reason: collision with root package name */
    public final String f20572h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f20573i;
    public final boolean j;

    public C1589d(C1787a transport, C1850b updateStateStreamHandler, C1850b updateProgressStreamHandler, C1850b logStreamHandler) {
        boolean z2;
        boolean z10;
        Intrinsics.checkNotNullParameter(transport, "transport");
        Intrinsics.checkNotNullParameter(updateStateStreamHandler, "updateStateStreamHandler");
        Intrinsics.checkNotNullParameter(updateProgressStreamHandler, "updateProgressStreamHandler");
        Intrinsics.checkNotNullParameter(logStreamHandler, "logStreamHandler");
        this.f20565a = updateStateStreamHandler;
        this.f20566b = updateProgressStreamHandler;
        this.f20567c = logStreamHandler;
        i iVar = new i(transport, this);
        this.f20568d = iVar;
        String address = transport.j.getAddress();
        Intrinsics.checkNotNullExpressionValue(address, "getAddress(...)");
        this.f20569e = address;
        this.f20570f = transport;
        this.f20571g = new Gb.c(transport);
        iVar.b(4);
        iVar.a(5000);
        iVar.c(3);
        this.f20572h = StubApp.getString2(35319);
        synchronized (iVar) {
            Mb.a aVar = (Mb.a) iVar.f286a.f4728a;
            z2 = false;
            z10 = aVar != null ? aVar.f4722a : false;
        }
        this.f20573i = z10;
        synchronized (iVar) {
            if (iVar.f286a.g()) {
                synchronized (iVar) {
                    Mb.a aVar2 = (Mb.a) iVar.f286a.f4728a;
                    boolean z11 = aVar2 != null ? aVar2.f4722a : false;
                    if (!z11) {
                        z2 = true;
                    }
                }
            }
        }
        this.j = z2;
    }
}
