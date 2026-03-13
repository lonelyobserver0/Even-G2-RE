package Q3;

import R3.C0233b;
import S3.D;
import android.text.TextUtils;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;
import t.C1688a;
import t.C1689b;
import t.C1692e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final C1692e f5718a;

    public f(C1692e c1692e) {
        this.f5718a = c1692e;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        ArrayList arrayList = new ArrayList();
        C1692e c1692e = this.f5718a;
        Iterator it = ((C1689b) c1692e.keySet()).iterator();
        boolean z2 = true;
        while (true) {
            C1688a c1688a = (C1688a) it;
            if (!c1688a.hasNext()) {
                break;
            }
            C0233b c0233b = (C0233b) c1688a.next();
            com.google.android.gms.common.b bVar = (com.google.android.gms.common.b) c1692e.get(c0233b);
            D.h(bVar);
            z2 &= !bVar.d();
            arrayList.add(c0233b.f6111b.f5716b + StubApp.getString2(994) + String.valueOf(bVar));
        }
        StringBuilder sb2 = new StringBuilder();
        if (z2) {
            sb2.append(StubApp.getString2(5154));
        } else {
            sb2.append(StubApp.getString2(5155));
        }
        sb2.append(TextUtils.join(StubApp.getString2(5156), arrayList));
        return sb2.toString();
    }
}
