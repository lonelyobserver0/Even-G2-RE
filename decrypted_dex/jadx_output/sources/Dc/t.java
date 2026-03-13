package Dc;

import com.stub.StubApp;
import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class t {
    public static int a(int i3, int i10, int i11) {
        if ((i10 & 8) != 0) {
            i3--;
        }
        if (i11 <= i3) {
            return i3 - i11;
        }
        throw new IOException(Xa.h.o(StubApp.getString2(25172), i11, i3, StubApp.getString2(25173)));
    }
}
