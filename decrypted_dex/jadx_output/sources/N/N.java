package N;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import com.stub.StubApp;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class N extends S {

    /* renamed from: c, reason: collision with root package name */
    public static Field f4741c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f4742d;

    /* renamed from: e, reason: collision with root package name */
    public static Constructor f4743e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f4744f;

    /* renamed from: a, reason: collision with root package name */
    public WindowInsets f4745a;

    /* renamed from: b, reason: collision with root package name */
    public F.c f4746b;

    public N() {
        this.f4745a = e();
    }

    private static WindowInsets e() {
        boolean z2 = f4742d;
        String string2 = StubApp.getString2(3609);
        if (!z2) {
            try {
                f4741c = WindowInsets.class.getDeclaredField(StubApp.getString2("3610"));
            } catch (ReflectiveOperationException e10) {
                Log.i(string2, StubApp.getString2(3611), e10);
            }
            f4742d = true;
        }
        Field field = f4741c;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e11) {
                Log.i(string2, StubApp.getString2(3612), e11);
            }
        }
        if (!f4744f) {
            try {
                f4743e = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e12) {
                Log.i(string2, StubApp.getString2(3613), e12);
            }
            f4744f = true;
        }
        Constructor constructor = f4743e;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e13) {
                Log.i(string2, StubApp.getString2(3614), e13);
            }
        }
        return null;
    }

    @Override // N.S
    public c0 b() {
        a();
        c0 g10 = c0.g(this.f4745a, null);
        Z z2 = g10.f4771a;
        z2.o(null);
        z2.q(this.f4746b);
        return g10;
    }

    @Override // N.S
    public void c(F.c cVar) {
        this.f4746b = cVar;
    }

    @Override // N.S
    public void d(F.c cVar) {
        WindowInsets windowInsets = this.f4745a;
        if (windowInsets != null) {
            this.f4745a = windowInsets.replaceSystemWindowInsets(cVar.f2165a, cVar.f2166b, cVar.f2167c, cVar.f2168d);
        }
    }

    public N(c0 c0Var) {
        super(c0Var);
        this.f4745a = c0Var.f();
    }
}
