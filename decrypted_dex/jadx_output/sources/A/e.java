package A;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.stub.StubApp;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import z.AbstractC1984a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public b f8a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14g;

    /* renamed from: h, reason: collision with root package name */
    public int f15h;

    /* renamed from: i, reason: collision with root package name */
    public int f16i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public View f17k;

    /* renamed from: l, reason: collision with root package name */
    public View f18l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f19m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f20n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f21o;

    public e() {
        super(-2, -2);
        this.f9b = false;
        this.f10c = 0;
        this.f11d = 0;
        this.f12e = -1;
        this.f13f = -1;
        this.f14g = 0;
        this.f15h = 0;
        this.f21o = new Rect();
    }

    public final boolean a(int i3) {
        if (i3 == 0) {
            return this.f19m;
        }
        if (i3 != 1) {
            return false;
        }
        return this.f20n;
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b bVar;
        this.f9b = false;
        this.f10c = 0;
        this.f11d = 0;
        this.f12e = -1;
        this.f13f = -1;
        this.f14g = 0;
        this.f15h = 0;
        this.f21o = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1984a.f23635b);
        this.f10c = obtainStyledAttributes.getInteger(0, 0);
        this.f13f = obtainStyledAttributes.getResourceId(1, -1);
        this.f11d = obtainStyledAttributes.getInteger(2, 0);
        this.f12e = obtainStyledAttributes.getInteger(6, -1);
        this.f14g = obtainStyledAttributes.getInt(5, 0);
        this.f15h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f9b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f9633w;
            if (TextUtils.isEmpty(string)) {
                bVar = null;
            } else {
                if (string.startsWith(StubApp.getString2(1))) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f9633w;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f9635y;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f9634x);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    bVar = (b) constructor.newInstance(context, attributeSet);
                } catch (Exception e10) {
                    throw new RuntimeException(E1.a.j(StubApp.getString2(2), string), e10);
                }
            }
            this.f8a = bVar;
        }
        obtainStyledAttributes.recycle();
        b bVar2 = this.f8a;
        if (bVar2 != null) {
            bVar2.c(this);
        }
    }

    public e(e eVar) {
        super((ViewGroup.MarginLayoutParams) eVar);
        this.f9b = false;
        this.f10c = 0;
        this.f11d = 0;
        this.f12e = -1;
        this.f13f = -1;
        this.f14g = 0;
        this.f15h = 0;
        this.f21o = new Rect();
    }

    public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f9b = false;
        this.f10c = 0;
        this.f11d = 0;
        this.f12e = -1;
        this.f13f = -1;
        this.f14g = 0;
        this.f15h = 0;
        this.f21o = new Rect();
    }

    public e(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f9b = false;
        this.f10c = 0;
        this.f11d = 0;
        this.f12e = -1;
        this.f13f = -1;
        this.f14g = 0;
        this.f15h = 0;
        this.f21o = new Rect();
    }
}
