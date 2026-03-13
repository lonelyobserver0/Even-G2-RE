package Ya;

import D5.r;
import Xa.AbstractActivityC0364d;
import com.stub.StubApp;
import io.flutter.plugin.platform.PlatformViewsController;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f8891a = new ArrayList();

    public f(AbstractActivityC0364d abstractActivityC0364d, String[] strArr) {
        bb.d dVar = (bb.d) Q2.g.H().f5711b;
        if (dVar.f10743b) {
            return;
        }
        dVar.c(StubApp.getOrigApplicationContext(abstractActivityC0364d.getApplicationContext()));
        dVar.a(StubApp.getOrigApplicationContext(abstractActivityC0364d.getApplicationContext()), strArr);
    }

    public final c a(Mb.a aVar) {
        c cVar;
        AbstractActivityC0364d abstractActivityC0364d = (AbstractActivityC0364d) aVar.f4724c;
        Za.b bVar = (Za.b) aVar.f4725d;
        String str = (String) aVar.f4726e;
        List<String> list = (List) aVar.f4727f;
        PlatformViewsController platformViewsController = new PlatformViewsController();
        boolean z2 = aVar.f4722a;
        boolean z10 = aVar.f4723b;
        if (bVar == null) {
            bb.d dVar = (bb.d) Q2.g.H().f5711b;
            if (!dVar.f10743b) {
                throw new AssertionError(StubApp.getString2(7588));
            }
            bVar = new Za.b((String) ((r) dVar.f10745d).f1449c, StubApp.getString2(470));
        }
        ArrayList arrayList = this.f8891a;
        if (arrayList.size() == 0) {
            cVar = new c(abstractActivityC0364d, null, platformViewsController, null, z2, z10);
            if (str != null) {
                cVar.f8869i.f14365a.invokeMethod(StubApp.getString2(7387), str);
            }
            cVar.f8863c.b(bVar, list);
        } else {
            c cVar2 = (c) arrayList.get(0);
            if (!cVar2.f8861a.isAttached()) {
                throw new IllegalStateException(StubApp.getString2(7589));
            }
            long j = c.f8859w;
            cVar = new c(abstractActivityC0364d, cVar2.f8861a.spawn(bVar.f9161c, bVar.f9160b, str, list, j), platformViewsController, null, z2, z10);
        }
        arrayList.add(cVar);
        cVar.f8879t.add(new e(this, cVar));
        return cVar;
    }
}
