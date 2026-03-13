package n;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.stub.StubApp;
import java.lang.reflect.InvocationTargetException;

/* renamed from: n.k0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1346k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f17554a = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f17555b = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Rect f17556c = new Rect();

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 29 || i3 >= 31 || !StubApp.getString2(21250).equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f17554a);
        } else {
            drawable.setState(f17555b);
        }
        drawable.setState(state);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Rect b(Drawable drawable) {
        int i3;
        int i10;
        int i11;
        int i12;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 29) {
            Insets a3 = AbstractC1344j0.a(drawable);
            i3 = a3.left;
            i10 = a3.top;
            i11 = a3.right;
            i12 = a3.bottom;
            return new Rect(i3, i10, i11, i12);
        }
        boolean z2 = drawable instanceof G.b;
        Object obj = drawable;
        if (z2) {
            ((G.c) ((G.b) drawable)).getClass();
            obj = null;
        }
        if (i13 >= 29) {
            boolean z10 = AbstractC1342i0.f17525a;
        } else if (AbstractC1342i0.f17525a) {
            try {
                Object invoke = AbstractC1342i0.f17526b.invoke(obj, new Object[0]);
                if (invoke != null) {
                    return new Rect(AbstractC1342i0.f17527c.getInt(invoke), AbstractC1342i0.f17528d.getInt(invoke), AbstractC1342i0.f17529e.getInt(invoke), AbstractC1342i0.f17530f.getInt(invoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f17556c;
    }

    public static PorterDuff.Mode c(int i3, PorterDuff.Mode mode) {
        if (i3 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i3 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i3 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i3) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
