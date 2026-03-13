package r5;

import com.stub.StubApp;
import java.util.Map;

/* renamed from: r5.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class C1568a implements p5.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20342a;

    @Override // p5.InterfaceC1491a
    public final void a(Object obj, Object obj2) {
        switch (this.f20342a) {
            case 0:
                throw new p5.b(StubApp.getString2(22679) + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                p5.e eVar = (p5.e) obj2;
                eVar.b(s5.f.f20762g, entry.getKey());
                eVar.b(s5.f.f20763h, entry.getValue());
                return;
            default:
                throw new p5.b(StubApp.getString2(22679) + obj.getClass().getCanonicalName());
        }
    }
}
