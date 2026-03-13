package xa;

import ba.AbstractC0534b;
import com.stub.StubApp;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import oa.AbstractC1469b;

/* renamed from: xa.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1933a extends AbstractC1935c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f23113c;

    public /* synthetic */ C1933a(int i3) {
        this.f23113c = i3;
    }

    public static C1933a d(AbstractC0534b abstractC0534b) {
        Map unmodifiableMap = Collections.unmodifiableMap((HashMap) abstractC0534b.f10727a);
        C1933a c1933a = new C1933a(1);
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            c1933a.a(((Integer) entry.getKey()).intValue(), (String) entry.getValue());
        }
        return c1933a;
    }

    @Override // ta.InterfaceC1743c
    public final AbstractC1469b p() {
        switch (this.f23113c) {
            case 0:
                throw new UnsupportedOperationException(StubApp.getString2(24224));
            default:
                return null;
        }
    }

    public C1933a(Y9.b bVar) {
        this.f23113c = 1;
        for (Y9.a aVar : Collections.unmodifiableList(bVar.f8856l)) {
            a(aVar.f8842a, aVar.f8844c);
        }
    }
}
