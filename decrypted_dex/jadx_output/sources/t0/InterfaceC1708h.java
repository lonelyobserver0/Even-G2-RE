package t0;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import o0.InterfaceC1432g;

/* renamed from: t0.h, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface InterfaceC1708h extends InterfaceC1432g {
    void close();

    long n(C1711k c1711k);

    default Map s() {
        return Collections.EMPTY_MAP;
    }

    void y(InterfaceC1726z interfaceC1726z);

    Uri z();
}
