package n;

import R8.C0250h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import com.stub.StubApp;

/* renamed from: n.u, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1365u {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f17618b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C1365u f17619c;

    /* renamed from: a, reason: collision with root package name */
    public J0 f17620a;

    public static synchronized C1365u a() {
        C1365u c1365u;
        synchronized (C1365u.class) {
            try {
                if (f17619c == null) {
                    d();
                }
                c1365u = f17619c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1365u;
    }

    public static synchronized PorterDuffColorFilter c(int i3, PorterDuff.Mode mode) {
        PorterDuffColorFilter e10;
        synchronized (C1365u.class) {
            e10 = J0.e(i3, mode);
        }
        return e10;
    }

    public static synchronized void d() {
        synchronized (C1365u.class) {
            if (f17619c == null) {
                C1365u c1365u = new C1365u();
                f17619c = c1365u;
                c1365u.f17620a = J0.b();
                J0 j02 = f17619c.f17620a;
                C0250h c0250h = new C0250h();
                synchronized (j02) {
                    j02.f17421e = c0250h;
                }
            }
        }
    }

    public static void e(Drawable drawable, Q0 q02, int[] iArr) {
        PorterDuff.Mode mode = J0.f17414f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d(StubApp.getString2(21256), StubApp.getString2(21257));
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z2 = q02.f17458b;
        if (!z2 && !q02.f17457a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z2 ? (ColorStateList) q02.f17459c : null;
        PorterDuff.Mode mode2 = q02.f17457a ? (PorterDuff.Mode) q02.f17460d : J0.f17414f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = J0.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i3) {
        return this.f17620a.c(context, i3);
    }
}
