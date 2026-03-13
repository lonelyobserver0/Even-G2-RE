package pb;

import com.stub.StubApp;
import java.util.HashMap;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final p f19802a;

    public t(p pVar) {
        this.f19802a = pVar;
    }

    public final void a(int i3, int i10, long j, int i11) {
        HashMap hashMap = new HashMap();
        hashMap.put(StubApp.getString2(1420), StubApp.getString2(22172));
        AbstractC1482f.q(i3, hashMap, StubApp.getString2(1650), i10, StubApp.getString2(1651));
        hashMap.put(StubApp.getString2(2091), Long.valueOf(j));
        if (i11 != 0) {
            hashMap.put(StubApp.getString2(22173), Integer.valueOf(i11));
        }
        this.f19802a.success(hashMap);
    }
}
