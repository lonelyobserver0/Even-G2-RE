package d0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f13287a;

    /* renamed from: b, reason: collision with root package name */
    public static final c0 f13288b;

    /* renamed from: c, reason: collision with root package name */
    public static final c0 f13289c;

    /* renamed from: d, reason: collision with root package name */
    public static final c0 f13290d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ c0[] f13291e;

    static {
        c0 c0Var = new c0(StubApp.getString2(16686), 0);
        f13287a = c0Var;
        c0 c0Var2 = new c0(StubApp.getString2(16687), 1);
        f13288b = c0Var2;
        c0 c0Var3 = new c0(StubApp.getString2(16688), 2);
        f13289c = c0Var3;
        c0 c0Var4 = new c0(StubApp.getString2(14612), 3);
        f13290d = c0Var4;
        f13291e = new c0[]{c0Var, c0Var2, c0Var3, c0Var4};
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) f13291e.clone();
    }

    public final void a(View view, ViewGroup container) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(container, "container");
        int ordinal = ordinal();
        String string2 = StubApp.getString2(49);
        if (ordinal == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                if (M.J(2)) {
                    Log.v(string2, StubApp.getString2(16695) + view + StubApp.getString2(16696) + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        String string22 = StubApp.getString2(16689);
        if (ordinal == 1) {
            if (M.J(2)) {
                Log.v(string2, string22 + view + StubApp.getString2(16692));
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (M.J(2)) {
                    Log.v(string2, StubApp.getString2(16693) + view + StubApp.getString2(16694) + container);
                }
                container.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (ordinal == 2) {
            if (M.J(2)) {
                Log.v(string2, string22 + view + StubApp.getString2(16691));
            }
            view.setVisibility(8);
            return;
        }
        if (ordinal != 3) {
            return;
        }
        if (M.J(2)) {
            Log.v(string2, string22 + view + StubApp.getString2(16690));
        }
        view.setVisibility(4);
    }
}
