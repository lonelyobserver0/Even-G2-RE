package c5;

import H0.C0067j;
import android.util.Log;
import com.stub.StubApp;
import i5.C1059c;
import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final g f10876d = new g(0);

    /* renamed from: e, reason: collision with root package name */
    public static final C0067j f10877e = new C0067j(12);

    /* renamed from: a, reason: collision with root package name */
    public final C1059c f10878a;

    /* renamed from: b, reason: collision with root package name */
    public String f10879b = null;

    /* renamed from: c, reason: collision with root package name */
    public String f10880c = null;

    public h(C1059c c1059c) {
        this.f10878a = c1059c;
    }

    public static void a(C1059c c1059c, String str, String str2) {
        String string2 = StubApp.getString2(9468);
        if (str == null || str2 == null) {
            return;
        }
        try {
            c1059c.k(str, string2.concat(str2)).createNewFile();
        } catch (IOException e10) {
            Log.w(StubApp.getString2(280), StubApp.getString2(9469), e10);
        }
    }
}
