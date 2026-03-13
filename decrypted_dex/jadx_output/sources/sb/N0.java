package sb;

import android.os.Build;
import android.util.Log;
import android.webkit.WebSettings;
import com.stub.StubApp;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class N0 extends AbstractC1670r0 {
    public final void a(WebSettings webSettings, boolean z2) {
        A0.c hVar;
        if (!X1.k.f8250d.b()) {
            throw new UnsupportedOperationException(StubApp.getString2(6964));
        }
        try {
            hVar = new A0.c((WebSettingsBoundaryInterface) Oc.a.i(WebSettingsBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) X1.l.f8251a.f20712b).convertSettings(webSettings)));
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT == 30) {
                if (StubApp.getString2(23188).equals(webSettings.getClass().getCanonicalName())) {
                    Log.e(StubApp.getString2(23189), StubApp.getString2(23190), e10);
                    hVar = new X1.h(null);
                }
            }
            throw e10;
        }
        hVar.v(z2);
    }
}
