package sb;

import android.content.Context;
import android.hardware.display.DisplayManager;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class c1 extends AbstractC1680w0 {
    public final b1 a() {
        DisplayManager displayManager = (DisplayManager) ((Context) this.f21002a.f653e).getSystemService(StubApp.getString2(3958));
        ArrayList arrayList = new ArrayList();
        b1 b1Var = new b1(this);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.removeAll(arrayList);
        if (!arrayList2.isEmpty()) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                displayManager.unregisterDisplayListener((DisplayManager.DisplayListener) it.next());
                displayManager.registerDisplayListener(new R0.o(arrayList2, displayManager, 2), null);
            }
        }
        return b1Var;
    }
}
