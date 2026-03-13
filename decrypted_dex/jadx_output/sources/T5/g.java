package T5;

import com.stub.StubApp;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f7209a = Charset.defaultCharset();

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f7210b = Charset.forName(StubApp.getString2(6195));

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f7211c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f7212d;

    static {
        Charset charset;
        try {
            charset = Charset.forName(StubApp.getString2("6210"));
        } catch (UnsupportedCharsetException unused) {
            charset = null;
        }
        f7211c = charset;
        Charset forName = Charset.forName(StubApp.getString2(6215));
        Charset charset2 = f7210b;
        Charset charset3 = f7209a;
        f7212d = charset2.equals(charset3) || forName.equals(charset3);
    }
}
