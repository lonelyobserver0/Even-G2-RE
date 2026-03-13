package D5;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class M extends Binder {

    /* renamed from: e, reason: collision with root package name */
    public final Z9.q f1388e;

    public M(Z9.q qVar) {
        this.f1388e = qVar;
    }

    public final void a(N n10) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException(StubApp.getString2(1397));
        }
        String string2 = StubApp.getString2(493);
        if (Log.isLoggable(string2, 3)) {
            Log.d(string2, StubApp.getString2(1396));
        }
        Intent intent = n10.f1389a;
        AbstractServiceC0044h abstractServiceC0044h = (AbstractServiceC0044h) this.f1388e.f9143b;
        q4.k kVar = new q4.k();
        abstractServiceC0044h.f1422a.execute(new Ab.c(abstractServiceC0044h, intent, kVar, 2));
        kVar.f20051a.addOnCompleteListener(new G1.c(0), new C2.d(n10, 6));
    }
}
