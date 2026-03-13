package n;

import Z9.C0366a;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import com.stub.StubApp;
import java.lang.reflect.Method;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class H0 extends AbstractC1299C0 implements InterfaceC1301D0 {

    /* renamed from: F, reason: collision with root package name */
    public static final Method f17408F;

    /* renamed from: E, reason: collision with root package name */
    public C0366a f17409E;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f17408F = PopupWindow.class.getDeclaredMethod(StubApp.getString2("21226"), Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i(StubApp.getString2(21037), StubApp.getString2(21227));
        }
    }

    @Override // n.InterfaceC1301D0
    public final void e(m.l lVar, m.n nVar) {
        C0366a c0366a = this.f17409E;
        if (c0366a != null) {
            c0366a.e(lVar, nVar);
        }
    }

    @Override // n.AbstractC1299C0
    public final C1358q0 o(Context context, boolean z2) {
        G0 g02 = new G0(context, z2);
        g02.setHoverListener(this);
        return g02;
    }

    @Override // n.InterfaceC1301D0
    public final void s(m.l lVar, m.n nVar) {
        C0366a c0366a = this.f17409E;
        if (c0366a != null) {
            c0366a.s(lVar, nVar);
        }
    }
}
