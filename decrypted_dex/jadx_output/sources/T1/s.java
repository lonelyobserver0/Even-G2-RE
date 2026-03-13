package T1;

import android.view.View;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.HashMap;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    public final View f7147b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f7146a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f7148c = new ArrayList();

    public s(View view) {
        this.f7147b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f7147b == sVar.f7147b && this.f7146a.equals(sVar.f7146a);
    }

    public final int hashCode() {
        return this.f7146a.hashCode() + (this.f7147b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder n10 = AbstractC1482f.n(StubApp.getString2(6143) + Integer.toHexString(hashCode()) + StubApp.getString2(6144), StubApp.getString2(6145));
        n10.append(this.f7147b);
        String string2 = StubApp.getString2(3692);
        n10.append(string2);
        String g10 = AbstractC1482f.g(n10.toString(), StubApp.getString2(6146));
        HashMap hashMap = this.f7146a;
        for (String str : hashMap.keySet()) {
            g10 = g10 + StubApp.getString2(6147) + str + StubApp.getString2(994) + hashMap.get(str) + string2;
        }
        return g10;
    }
}
