package Ob;

import com.fasterxml.jackson.dataformat.cbor.CBORFactory;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final CBORFactory f5373a = new CBORFactory();

    public static int a(String str) {
        return str.length() + b(str.length());
    }

    public static int b(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException(StubApp.getString2(25425));
        }
        if (i3 < 24) {
            return 1;
        }
        if (i3 < 256) {
            return 2;
        }
        return i3 < 65535 ? 3 : 5;
    }
}
