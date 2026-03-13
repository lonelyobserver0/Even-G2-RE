package hc;

import Z9.C0366a;
import com.stub.StubApp;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0366a f14498a;

    static {
        C0366a c0366a = new C0366a(8, false);
        c0366a.f9105b = null;
        try {
            Properties properties = new Properties();
            c0366a.f9105b = properties;
            properties.load(new BufferedInputStream(b.class.getResourceAsStream(StubApp.getString2("26015"))));
        } catch (FileNotFoundException e10) {
            e10.printStackTrace();
        } catch (IOException e11) {
            e11.printStackTrace();
        }
        f14498a = c0366a;
    }
}
