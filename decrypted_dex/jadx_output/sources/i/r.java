package i;

import N.AbstractC0179z;
import N.I;
import N.L;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import com.stub.StubApp;
import f4.C0879c;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import l.AbstractC1130a;
import l.C1132c;
import l.C1133d;
import t.C1697j;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class r implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Window.Callback f14621a;

    /* renamed from: b, reason: collision with root package name */
    public C0879c f14622b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14623c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14624d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14625e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v f14626f;

    public r(v vVar, Window.Callback callback) {
        this.f14626f = vVar;
        if (callback == null) {
            throw new IllegalArgumentException(StubApp.getString2(18394));
        }
        this.f14621a = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f14623c = true;
            callback.onContentChanged();
        } finally {
            this.f14623c = false;
        }
    }

    public final boolean b(int i3, Menu menu) {
        return this.f14621a.onMenuOpened(i3, menu);
    }

    public final void c(int i3, Menu menu) {
        this.f14621a.onPanelClosed(i3, menu);
    }

    public final void d(List list, Menu menu, int i3) {
        l.l.a(this.f14621a, list, menu, i3);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f14621a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z2 = this.f14624d;
        Window.Callback callback = this.f14621a;
        return z2 ? callback.dispatchKeyEvent(keyEvent) : this.f14626f.u(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.f14621a.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            v vVar = this.f14626f;
            vVar.A();
            Oc.a aVar = vVar.f14678q;
            if (aVar == null || !aVar.F(keyCode, keyEvent)) {
                u uVar = vVar.f14664X;
                if (uVar == null || !vVar.F(uVar, keyEvent.getKeyCode(), keyEvent)) {
                    if (vVar.f14664X == null) {
                        u z2 = vVar.z(0);
                        vVar.G(z2, keyEvent);
                        boolean F3 = vVar.F(z2, keyEvent.getKeyCode(), keyEvent);
                        z2.f14639k = false;
                        if (F3) {
                        }
                    }
                    return false;
                }
                u uVar2 = vVar.f14664X;
                if (uVar2 != null) {
                    uVar2.f14640l = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f14621a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f14621a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f14621a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f14621a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f14621a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f14621a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f14623c) {
            this.f14621a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i3, Menu menu) {
        if (i3 != 0 || (menu instanceof m.l)) {
            return this.f14621a.onCreatePanelMenu(i3, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i3) {
        C0879c c0879c = this.f14622b;
        if (c0879c != null) {
            View view = i3 == 0 ? new View(((C1019C) c0879c.f13742a).f14504b.f17488a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.f14621a.onCreatePanelView(i3);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f14621a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i3, MenuItem menuItem) {
        return this.f14621a.onMenuItemSelected(i3, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i3, Menu menu) {
        b(i3, menu);
        v vVar = this.f14626f;
        if (i3 == 108) {
            vVar.A();
            Oc.a aVar = vVar.f14678q;
            if (aVar != null) {
                aVar.n(true);
            }
        } else {
            vVar.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i3, Menu menu) {
        if (this.f14625e) {
            this.f14621a.onPanelClosed(i3, menu);
            return;
        }
        c(i3, menu);
        v vVar = this.f14626f;
        if (i3 == 108) {
            vVar.A();
            Oc.a aVar = vVar.f14678q;
            if (aVar != null) {
                aVar.n(false);
                return;
            }
            return;
        }
        if (i3 != 0) {
            vVar.getClass();
            return;
        }
        u z2 = vVar.z(i3);
        if (z2.f14641m) {
            vVar.s(z2, false);
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z2) {
        l.m.a(this.f14621a, z2);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i3, View view, Menu menu) {
        m.l lVar = menu instanceof m.l ? (m.l) menu : null;
        if (i3 == 0 && lVar == null) {
            return false;
        }
        if (lVar != null) {
            lVar.f16944x = true;
        }
        C0879c c0879c = this.f14622b;
        if (c0879c != null && i3 == 0) {
            C1019C c1019c = (C1019C) c0879c.f13742a;
            if (!c1019c.f14507e) {
                c1019c.f14504b.f17498l = true;
                c1019c.f14507e = true;
            }
        }
        boolean onPreparePanel = this.f14621a.onPreparePanel(i3, view, menu);
        if (lVar != null) {
            lVar.f16944x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i3) {
        m.l lVar = this.f14626f.z(0).f14637h;
        if (lVar != null) {
            d(list, lVar, i3);
        } else {
            d(list, menu, i3);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return l.k.a(this.f14621a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f14621a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) {
        this.f14621a.onWindowFocusChanged(z2);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i3) {
        ViewGroup viewGroup;
        int i10 = 1;
        boolean z2 = false;
        v vVar = this.f14626f;
        vVar.getClass();
        if (i3 != 0) {
            return l.k.b(this.f14621a, callback, i3);
        }
        Context context = vVar.f14669l;
        p2.h hVar = new p2.h();
        hVar.f19672b = context;
        hVar.f19671a = callback;
        hVar.f19673c = new ArrayList();
        hVar.f19674d = new C1697j(0);
        AbstractC1130a abstractC1130a = vVar.f14691x;
        if (abstractC1130a != null) {
            abstractC1130a.a();
        }
        Y.m mVar = new Y.m(vVar, hVar, 16, z2);
        vVar.A();
        Oc.a aVar = vVar.f14678q;
        if (aVar != null) {
            vVar.f14691x = aVar.R(mVar);
        }
        if (vVar.f14691x == null) {
            L l9 = vVar.f14650B;
            if (l9 != null) {
                l9.b();
            }
            AbstractC1130a abstractC1130a2 = vVar.f14691x;
            if (abstractC1130a2 != null) {
                abstractC1130a2.a();
            }
            if (vVar.f14693y == null) {
                boolean z10 = vVar.f14660O;
                Context context2 = vVar.f14669l;
                if (z10) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context2.getTheme();
                    theme.resolveAttribute(2130903049, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context2.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        C1132c c1132c = new C1132c(context2, 0);
                        c1132c.getTheme().setTo(newTheme);
                        context2 = c1132c;
                    }
                    vVar.f14693y = new ActionBarContextView(context2, null);
                    PopupWindow popupWindow = new PopupWindow(context2, (AttributeSet) null, 2130903064);
                    vVar.f14695z = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    vVar.f14695z.setContentView(vVar.f14693y);
                    vVar.f14695z.setWidth(-1);
                    context2.getTheme().resolveAttribute(2130903043, typedValue, true);
                    vVar.f14693y.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context2.getResources().getDisplayMetrics()));
                    vVar.f14695z.setHeight(-2);
                    vVar.f14648A = new m(vVar, i10);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) vVar.f14652D.findViewById(2131230778);
                    if (viewStubCompat != null) {
                        vVar.A();
                        Oc.a aVar2 = vVar.f14678q;
                        Context s10 = aVar2 != null ? aVar2.s() : null;
                        if (s10 != null) {
                            context2 = s10;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context2));
                        vVar.f14693y = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (vVar.f14693y != null) {
                L l10 = vVar.f14650B;
                if (l10 != null) {
                    l10.b();
                }
                vVar.f14693y.e();
                Context context3 = vVar.f14693y.getContext();
                ActionBarContextView actionBarContextView = vVar.f14693y;
                C1133d c1133d = new C1133d();
                c1133d.f15654c = context3;
                c1133d.f15655d = actionBarContextView;
                c1133d.f15656e = mVar;
                m.l lVar = new m.l(actionBarContextView.getContext());
                lVar.f16932l = 1;
                c1133d.f15659h = lVar;
                lVar.f16926e = c1133d;
                if (((p2.h) mVar.f8674b).f(c1133d, lVar)) {
                    c1133d.g();
                    vVar.f14693y.c(c1133d);
                    vVar.f14691x = c1133d;
                    if (vVar.f14651C && (viewGroup = vVar.f14652D) != null && viewGroup.isLaidOut()) {
                        vVar.f14693y.setAlpha(0.0f);
                        L a3 = I.a(vVar.f14693y);
                        a3.a(1.0f);
                        vVar.f14650B = a3;
                        a3.d(new n(vVar, i10));
                    } else {
                        vVar.f14693y.setAlpha(1.0f);
                        vVar.f14693y.setVisibility(0);
                        if (vVar.f14693y.getParent() instanceof View) {
                            View view = (View) vVar.f14693y.getParent();
                            WeakHashMap weakHashMap = I.f4732a;
                            AbstractC0179z.c(view);
                        }
                    }
                    if (vVar.f14695z != null) {
                        vVar.f14671m.getDecorView().post(vVar.f14648A);
                    }
                } else {
                    vVar.f14691x = null;
                }
            }
            vVar.I();
            vVar.f14691x = vVar.f14691x;
        }
        vVar.I();
        AbstractC1130a abstractC1130a3 = vVar.f14691x;
        if (abstractC1130a3 != null) {
            return hVar.c(abstractC1130a3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f14621a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
