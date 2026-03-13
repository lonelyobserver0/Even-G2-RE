package Rc;

import com.stub.StubApp;
import java.util.HashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class O {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f6395a;

    static {
        HashMap hashMap = new HashMap(10);
        f6395a = hashMap;
        Qc.b bVar = Qc.c.f5905c;
        hashMap.put(StubApp.getString2(25538), bVar);
        hashMap.put(StubApp.getString2(25573), bVar);
        Qc.b bVar2 = Qc.f.f5915g;
        hashMap.put(StubApp.getString2(25537), bVar2);
        hashMap.put(StubApp.getString2(25574), bVar2);
        String string2 = StubApp.getString2(25575);
        hashMap.put(string2, new Qc.d(string2, false));
        String string22 = StubApp.getString2(25576);
        hashMap.put(string22, new Qc.d(string22, true));
        hashMap.put(StubApp.getString2(25577), hashMap.get(string22));
    }
}
