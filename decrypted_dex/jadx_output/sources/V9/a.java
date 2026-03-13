package V9;

import D5.B;
import com.stub.StubApp;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a extends hc.b {

    /* renamed from: c, reason: collision with root package name */
    public final Map f7906c;

    /* renamed from: d, reason: collision with root package name */
    public final B f7907d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7908e;

    public a(Map map, boolean z2) {
        super(8);
        this.f7907d = new B();
        this.f7906c = map;
        this.f7908e = z2;
    }

    @Override // hc.b
    public final String C() {
        return (String) this.f7906c.get(StubApp.getString2(6738));
    }

    @Override // hc.b
    public final boolean E() {
        return this.f7908e;
    }

    @Override // hc.b
    public final d F() {
        return this.f7907d;
    }

    @Override // hc.b
    public final boolean J() {
        return this.f7906c.containsKey(StubApp.getString2(6382));
    }

    public final void Y(ArrayList arrayList) {
        if (this.f7908e) {
            return;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        B b2 = this.f7907d;
        hashMap2.put(StubApp.getString2(1052), (String) b2.f1340a);
        hashMap2.put(StubApp.getString2(1905), (String) b2.f1342c);
        hashMap2.put(StubApp.getString2(1485), (HashMap) b2.f1343d);
        hashMap.put(StubApp.getString2(435), hashMap2);
        arrayList.add(hashMap);
    }

    public final void Z(ArrayList arrayList) {
        if (this.f7908e) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(StubApp.getString2(1890), (Serializable) this.f7907d.f1341b);
        arrayList.add(hashMap);
    }

    @Override // hc.b
    public final Object u(String str) {
        return this.f7906c.get(str);
    }
}
