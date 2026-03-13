package P3;

import android.util.Log;
import com.stub.StubApp;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f extends ClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z2) {
        if (!Objects.equals(str, StubApp.getString2(4866))) {
            return super.loadClass(str, z2);
        }
        String string2 = StubApp.getString2(4867);
        if (!Log.isLoggable(string2, 3)) {
            return g.class;
        }
        Log.d(string2, StubApp.getString2(4868));
        return g.class;
    }
}
