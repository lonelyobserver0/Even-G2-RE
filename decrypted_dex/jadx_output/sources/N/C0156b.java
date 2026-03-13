package N;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.stub.StubApp;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: N.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class C0156b {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f4767c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f4768a;

    /* renamed from: b, reason: collision with root package name */
    public final C0155a f4769b;

    public C0156b() {
        this(f4767c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f4768a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public Z9.q b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f4768a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new Z9.q(accessibilityNodeProvider, 13);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f4768a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, O.e eVar) {
        this.f4768a.onInitializeAccessibilityNodeInfo(view, eVar.f5069a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f4768a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f4768a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i3, Bundle bundle) {
        boolean z2;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(2131231099);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= list.size()) {
                break;
            }
            O.d dVar = (O.d) list.get(i10);
            if (((AccessibilityNodeInfo.AccessibilityAction) dVar.f5065a).getId() == i3) {
                E0.x xVar = dVar.f5068d;
                if (xVar != null) {
                    Class cls = dVar.f5067c;
                    if (cls != null) {
                        try {
                            if (cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception e10) {
                            Log.e(StubApp.getString2(3625), StubApp.getString2(3624).concat(cls.getName()), e10);
                        }
                    }
                    ((BottomSheetBehavior) xVar.f1862b).A(xVar.f1861a);
                    z2 = true;
                }
            } else {
                i10++;
            }
        }
        z2 = false;
        if (!z2) {
            z2 = this.f4768a.performAccessibilityAction(view, i3, bundle);
        }
        if (z2 || i3 != 2131230730 || bundle == null) {
            return z2;
        }
        int i11 = bundle.getInt(StubApp.getString2(3626), -1);
        SparseArray sparseArray = (SparseArray) view.getTag(2131231100);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i11)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i12 = 0;
            while (true) {
                if (clickableSpanArr == null || i12 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i12])) {
                    clickableSpan.onClick(view);
                    z10 = true;
                    break;
                }
                i12++;
            }
        }
        return z10;
    }

    public void h(View view, int i3) {
        this.f4768a.sendAccessibilityEvent(view, i3);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f4768a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0156b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f4768a = accessibilityDelegate;
        this.f4769b = new C0155a(this);
    }
}
