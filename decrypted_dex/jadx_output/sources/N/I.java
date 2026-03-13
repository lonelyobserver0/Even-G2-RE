package N;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.stub.StubApp;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n.C1369w;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class I {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap f4732a;

    /* renamed from: b, reason: collision with root package name */
    public static Field f4733b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f4734c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0175v f4735d = new C0175v();

    /* renamed from: e, reason: collision with root package name */
    public static final ViewTreeObserverOnGlobalLayoutListenerC0177x f4736e = new ViewTreeObserverOnGlobalLayoutListenerC0177x();

    public static L a(View view) {
        if (f4732a == null) {
            f4732a = new WeakHashMap();
        }
        L l9 = (L) f4732a.get(view);
        if (l9 != null) {
            return l9;
        }
        L l10 = new L(view);
        f4732a.put(view, l10);
        return l10;
    }

    public static void b(View view, c0 c0Var) {
        int i3 = Build.VERSION.SDK_INT;
        WindowInsets f10 = c0Var.f();
        if (f10 != null) {
            WindowInsets a3 = i3 >= 30 ? G.a(view, f10) : AbstractC0179z.a(view, f10);
            if (a3.equals(f10)) {
                return;
            }
            c0.g(a3, view);
        }
    }

    public static View.AccessibilityDelegate c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return F.a(view);
        }
        if (f4734c) {
            return null;
        }
        if (f4733b == null) {
            try {
                Field declaredField = View.class.getDeclaredField(StubApp.getString2("3604"));
                f4733b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f4734c = true;
                return null;
            }
        }
        try {
            Object obj = f4733b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f4734c = true;
            return null;
        }
    }

    public static String[] d(C1369w c1369w) {
        return Build.VERSION.SDK_INT >= 31 ? H.a(c1369w) : (String[]) c1369w.getTag(2131231106);
    }

    public static void e(View view, int i3) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService(StubApp.getString2(3258));
        if (accessibilityManager.isEnabled()) {
            boolean z2 = E.a(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z2) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z2 ? 32 : 2048);
                obtain.setContentChangeTypes(i3);
                if (z2) {
                    obtain.getText().add(E.a(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i3 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i3);
                        return;
                    } catch (AbstractMethodError e10) {
                        Log.e(StubApp.getString2(3606), view.getParent().getClass().getSimpleName().concat(StubApp.getString2(3605)), e10);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            obtain2.setContentChangeTypes(i3);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            obtain2.getText().add(E.a(view));
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C0160f f(View view, C0160f c0160f) {
        String string2 = StubApp.getString2(3606);
        if (Log.isLoggable(string2, 3)) {
            Log.d(string2, StubApp.getString2(3607) + c0160f + StubApp.getString2(3608) + view.getClass().getSimpleName() + StubApp.getString2(1557) + view.getId() + StubApp.getString2(511));
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return H.b(view, c0160f);
        }
        Q.h hVar = (Q.h) view.getTag(2131231105);
        InterfaceC0168n interfaceC0168n = f4735d;
        if (hVar == null) {
            if (view instanceof InterfaceC0168n) {
                interfaceC0168n = (InterfaceC0168n) view;
            }
            return interfaceC0168n.a(c0160f);
        }
        C0160f a3 = Q.h.a(view, c0160f);
        if (a3 == null) {
            return null;
        }
        if (view instanceof InterfaceC0168n) {
            interfaceC0168n = (InterfaceC0168n) view;
        }
        return interfaceC0168n.a(a3);
    }

    public static void g(View view, int i3) {
        ArrayList arrayList = (ArrayList) view.getTag(2131231099);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(2131231099, arrayList);
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((AccessibilityNodeInfo.AccessibilityAction) ((O.d) arrayList.get(i10)).f5065a).getId() == i3) {
                arrayList.remove(i10);
                return;
            }
        }
    }

    public static void h(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            F.b(view, context, iArr, attributeSet, typedArray, i3, 0);
        }
    }

    public static void i(View view, C0156b c0156b) {
        if (c0156b == null && (c(view) instanceof C0155a)) {
            c0156b = new C0156b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0156b == null ? null : c0156b.f4769b);
    }

    public static void j(View view, CharSequence charSequence) {
        new C0176w(2131231102, CharSequence.class, 8, 28, 1).d(view, charSequence);
        ViewTreeObserverOnGlobalLayoutListenerC0177x viewTreeObserverOnGlobalLayoutListenerC0177x = f4736e;
        if (charSequence == null) {
            viewTreeObserverOnGlobalLayoutListenerC0177x.f4808a.remove(view);
            view.removeOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC0177x);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0177x);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC0177x.f4808a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC0177x);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0177x);
            }
        }
    }
}
