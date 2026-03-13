package S;

import N.C0156b;
import N.I;
import Z9.q;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.jvm.internal.IntCompanionObject;
import z4.C2008b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class b extends C0156b {

    /* renamed from: n, reason: collision with root package name */
    public static final Rect f6407n = new Rect(IntCompanionObject.MAX_VALUE, IntCompanionObject.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o, reason: collision with root package name */
    public static final I4.e f6408o = new I4.e(18);

    /* renamed from: p, reason: collision with root package name */
    public static final u5.d f6409p = new u5.d(18);

    /* renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f6414h;

    /* renamed from: i, reason: collision with root package name */
    public final Chip f6415i;
    public a j;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f6410d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Rect f6411e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f6412f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final int[] f6413g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    public int f6416k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public int f6417l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public int f6418m = Integer.MIN_VALUE;

    public b(Chip chip) {
        this.f6415i = chip;
        this.f6414h = (AccessibilityManager) chip.getContext().getSystemService(StubApp.getString2(3258));
        chip.setFocusable(true);
        WeakHashMap weakHashMap = I.f4732a;
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    @Override // N.C0156b
    public final q b(View view) {
        if (this.j == null) {
            this.j = new a(this);
        }
        return this.j;
    }

    @Override // N.C0156b
    public final void d(View view, O.e eVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f4768a;
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f5069a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((C2008b) this).f24044q;
        accessibilityNodeInfo.setCheckable(chip.c());
        accessibilityNodeInfo.setClickable(chip.isClickable());
        if (chip.c() || chip.isClickable()) {
            accessibilityNodeInfo.setClassName(chip.c() ? StubApp.getString2(5905) : StubApp.getString2(5906));
        } else {
            accessibilityNodeInfo.setClassName(StubApp.getString2(5904));
        }
        accessibilityNodeInfo.setText(chip.getText());
    }

    public final boolean j(int i3) {
        if (this.f6417l != i3) {
            return false;
        }
        this.f6417l = Integer.MIN_VALUE;
        C2008b c2008b = (C2008b) this;
        if (i3 == 1) {
            Chip chip = c2008b.f24044q;
            chip.f11878n = false;
            chip.refreshDrawableState();
        }
        q(i3, 8);
        return true;
    }

    public final O.e k(int i3) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        O.e eVar = new O.e(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        obtain.setClassName(StubApp.getString2(5904));
        Rect rect = f6407n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        Chip chip = this.f6415i;
        obtain.setParent(chip);
        o(i3, eVar);
        if (eVar.g() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException(StubApp.getString2(5907));
        }
        Rect rect2 = this.f6411e;
        eVar.f(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException(StubApp.getString2(5910));
        }
        int actions = obtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException(StubApp.getString2(5909));
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException(StubApp.getString2(5908));
        }
        obtain.setPackageName(chip.getContext().getPackageName());
        eVar.f5070b = i3;
        obtain.setSource(chip, i3);
        if (this.f6416k == i3) {
            obtain.setAccessibilityFocused(true);
            eVar.a(128);
        } else {
            obtain.setAccessibilityFocused(false);
            eVar.a(64);
        }
        boolean z2 = this.f6417l == i3;
        if (z2) {
            eVar.a(2);
        } else if (obtain.isFocusable()) {
            eVar.a(1);
        }
        obtain.setFocused(z2);
        int[] iArr = this.f6413g;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.f6410d;
        obtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            eVar.f(rect3);
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.f6412f;
        if (chip.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect4)) {
                obtain.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view = (View) parent;
                            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                                break;
                            }
                            parent = view.getParent();
                        } else if (parent != null) {
                            obtain.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return eVar;
    }

    public abstract void l(ArrayList arrayList);

    /* JADX WARN: Removed duplicated region for block: B:27:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(int r21, android.graphics.Rect r22) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S.b.m(int, android.graphics.Rect):boolean");
    }

    public final O.e n(int i3) {
        if (i3 != -1) {
            return k(i3);
        }
        Chip chip = this.f6415i;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(chip);
        O.e eVar = new O.e(obtain);
        WeakHashMap weakHashMap = I.f4732a;
        chip.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException(StubApp.getString2(5914));
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            eVar.f5069a.addChild(chip, ((Integer) arrayList.get(i10)).intValue());
        }
        return eVar;
    }

    public abstract void o(int i3, O.e eVar);

    public final boolean p(int i3) {
        int i10;
        Chip chip = this.f6415i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i10 = this.f6417l) == i3) {
            return false;
        }
        if (i10 != Integer.MIN_VALUE) {
            j(i10);
        }
        if (i3 == Integer.MIN_VALUE) {
            return false;
        }
        this.f6417l = i3;
        C2008b c2008b = (C2008b) this;
        if (i3 == 1) {
            Chip chip2 = c2008b.f24044q;
            chip2.f11878n = true;
            chip2.refreshDrawableState();
        }
        q(i3, 8);
        return true;
    }

    public final void q(int i3, int i10) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i3 == Integer.MIN_VALUE || !this.f6414h.isEnabled() || (parent = (view = this.f6415i).getParent()) == null) {
            return;
        }
        if (i3 != -1) {
            obtain = AccessibilityEvent.obtain(i10);
            O.e n10 = n(i3);
            obtain.getText().add(n10.g());
            AccessibilityNodeInfo accessibilityNodeInfo = n10.f5069a;
            obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            obtain.setScrollable(accessibilityNodeInfo.isScrollable());
            obtain.setPassword(accessibilityNodeInfo.isPassword());
            obtain.setEnabled(accessibilityNodeInfo.isEnabled());
            obtain.setChecked(accessibilityNodeInfo.isChecked());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException(StubApp.getString2(5915));
            }
            obtain.setClassName(accessibilityNodeInfo.getClassName());
            obtain.setSource(view, i3);
            obtain.setPackageName(view.getContext().getPackageName());
        } else {
            obtain = AccessibilityEvent.obtain(i10);
            view.onInitializeAccessibilityEvent(obtain);
        }
        parent.requestSendAccessibilityEvent(view, obtain);
    }

    public final void r(int i3) {
        int i10 = this.f6418m;
        if (i10 == i3) {
            return;
        }
        this.f6418m = i3;
        q(i3, 128);
        q(i10, 256);
    }
}
