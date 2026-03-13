package n;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.google.android.gms.internal.measurement.D1;
import com.stub.StubApp;
import h.AbstractC0997a;
import java.lang.reflect.Method;
import kotlin.jvm.internal.IntCompanionObject;
import m.InterfaceC1255B;

/* renamed from: n.C0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1299C0 implements InterfaceC1255B {

    /* renamed from: C, reason: collision with root package name */
    public static final Method f17369C;

    /* renamed from: D, reason: collision with root package name */
    public static final Method f17370D;

    /* renamed from: A, reason: collision with root package name */
    public boolean f17371A;

    /* renamed from: B, reason: collision with root package name */
    public final C1294A f17372B;

    /* renamed from: a, reason: collision with root package name */
    public final Context f17373a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f17374b;

    /* renamed from: c, reason: collision with root package name */
    public C1358q0 f17375c;

    /* renamed from: f, reason: collision with root package name */
    public int f17378f;

    /* renamed from: g, reason: collision with root package name */
    public int f17379g;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f17381k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f17382l;

    /* renamed from: p, reason: collision with root package name */
    public C1376z0 f17385p;

    /* renamed from: q, reason: collision with root package name */
    public View f17386q;

    /* renamed from: r, reason: collision with root package name */
    public AdapterView.OnItemClickListener f17387r;

    /* renamed from: x, reason: collision with root package name */
    public final Handler f17392x;

    /* renamed from: z, reason: collision with root package name */
    public Rect f17394z;

    /* renamed from: d, reason: collision with root package name */
    public final int f17376d = -2;

    /* renamed from: e, reason: collision with root package name */
    public int f17377e = -2;

    /* renamed from: h, reason: collision with root package name */
    public final int f17380h = 1002;

    /* renamed from: m, reason: collision with root package name */
    public int f17383m = 0;

    /* renamed from: n, reason: collision with root package name */
    public final int f17384n = IntCompanionObject.MAX_VALUE;

    /* renamed from: s, reason: collision with root package name */
    public final RunnableC1374y0 f17388s = new RunnableC1374y0(this, 1);

    /* renamed from: t, reason: collision with root package name */
    public final ViewOnTouchListenerC1297B0 f17389t = new ViewOnTouchListenerC1297B0(this);

    /* renamed from: v, reason: collision with root package name */
    public final C1295A0 f17390v = new C1295A0(this);

    /* renamed from: w, reason: collision with root package name */
    public final RunnableC1374y0 f17391w = new RunnableC1374y0(this, 0);

    /* renamed from: y, reason: collision with root package name */
    public final Rect f17393y = new Rect();

    static {
        String string2 = StubApp.getString2(21219);
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f17369C = PopupWindow.class.getDeclaredMethod(StubApp.getString2("21220"), Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i(string2, StubApp.getString2(21221));
            }
            try {
                f17370D = PopupWindow.class.getDeclaredMethod(StubApp.getString2("21222"), Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i(string2, StubApp.getString2(21223));
            }
        }
    }

    public AbstractC1299C0(Context context, AttributeSet attributeSet, int i3) {
        int resourceId;
        this.f17373a = context;
        this.f17392x = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0997a.f14407o, i3, 0);
        this.f17378f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f17379g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.j = true;
        }
        obtainStyledAttributes.recycle();
        C1294A c1294a = new C1294A(context, attributeSet, i3, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0997a.f14411s, i3, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            c1294a.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        c1294a.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : D1.m(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f17372B = c1294a;
        c1294a.setInputMethodMode(1);
    }

    @Override // m.InterfaceC1255B
    public final boolean a() {
        return this.f17372B.isShowing();
    }

    public final int b() {
        return this.f17378f;
    }

    public final void c(int i3) {
        this.f17378f = i3;
    }

    @Override // m.InterfaceC1255B
    public final void dismiss() {
        C1294A c1294a = this.f17372B;
        c1294a.dismiss();
        c1294a.setContentView(null);
        this.f17375c = null;
        this.f17392x.removeCallbacks(this.f17388s);
    }

    public final Drawable f() {
        return this.f17372B.getBackground();
    }

    @Override // m.InterfaceC1255B
    public final C1358q0 g() {
        return this.f17375c;
    }

    public final void i(Drawable drawable) {
        this.f17372B.setBackgroundDrawable(drawable);
    }

    public final void j(int i3) {
        this.f17379g = i3;
        this.j = true;
    }

    public final int m() {
        if (this.j) {
            return this.f17379g;
        }
        return 0;
    }

    public void n(ListAdapter listAdapter) {
        C1376z0 c1376z0 = this.f17385p;
        if (c1376z0 == null) {
            this.f17385p = new C1376z0(this);
        } else {
            ListAdapter listAdapter2 = this.f17374b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c1376z0);
            }
        }
        this.f17374b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f17385p);
        }
        C1358q0 c1358q0 = this.f17375c;
        if (c1358q0 != null) {
            c1358q0.setAdapter(this.f17374b);
        }
    }

    public C1358q0 o(Context context, boolean z2) {
        return new C1358q0(context, z2);
    }

    public final void p(int i3) {
        Drawable background = this.f17372B.getBackground();
        if (background == null) {
            this.f17377e = i3;
            return;
        }
        Rect rect = this.f17393y;
        background.getPadding(rect);
        this.f17377e = rect.left + rect.right + i3;
    }

    @Override // m.InterfaceC1255B
    public final void show() {
        int i3;
        int paddingBottom;
        C1358q0 c1358q0;
        C1358q0 c1358q02 = this.f17375c;
        C1294A c1294a = this.f17372B;
        Context context = this.f17373a;
        if (c1358q02 == null) {
            C1358q0 o5 = o(context, !this.f17371A);
            this.f17375c = o5;
            o5.setAdapter(this.f17374b);
            this.f17375c.setOnItemClickListener(this.f17387r);
            this.f17375c.setFocusable(true);
            this.f17375c.setFocusableInTouchMode(true);
            this.f17375c.setOnItemSelectedListener(new C1368v0(this));
            this.f17375c.setOnScrollListener(this.f17390v);
            c1294a.setContentView(this.f17375c);
        }
        Drawable background = c1294a.getBackground();
        Rect rect = this.f17393y;
        if (background != null) {
            background.getPadding(rect);
            int i10 = rect.top;
            i3 = rect.bottom + i10;
            if (!this.j) {
                this.f17379g = -i10;
            }
        } else {
            rect.setEmpty();
            i3 = 0;
        }
        int a3 = AbstractC1370w0.a(c1294a, this.f17386q, this.f17379g, c1294a.getInputMethodMode() == 2);
        int i11 = this.f17376d;
        if (i11 == -1) {
            paddingBottom = a3 + i3;
        } else {
            int i12 = this.f17377e;
            int a9 = this.f17375c.a(i12 != -2 ? i12 != -1 ? View.MeasureSpec.makeMeasureSpec(i12, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a3);
            paddingBottom = a9 + (a9 > 0 ? this.f17375c.getPaddingBottom() + this.f17375c.getPaddingTop() + i3 : 0);
        }
        boolean z2 = this.f17372B.getInputMethodMode() == 2;
        c1294a.setWindowLayoutType(this.f17380h);
        if (c1294a.isShowing()) {
            if (this.f17386q.isAttachedToWindow()) {
                int i13 = this.f17377e;
                if (i13 == -1) {
                    i13 = -1;
                } else if (i13 == -2) {
                    i13 = this.f17386q.getWidth();
                }
                if (i11 == -1) {
                    i11 = z2 ? paddingBottom : -1;
                    if (z2) {
                        c1294a.setWidth(this.f17377e == -1 ? -1 : 0);
                        c1294a.setHeight(0);
                    } else {
                        c1294a.setWidth(this.f17377e == -1 ? -1 : 0);
                        c1294a.setHeight(-1);
                    }
                } else if (i11 == -2) {
                    i11 = paddingBottom;
                }
                c1294a.setOutsideTouchable(true);
                View view = this.f17386q;
                int i14 = this.f17378f;
                int i15 = this.f17379g;
                if (i13 < 0) {
                    i13 = -1;
                }
                c1294a.update(view, i14, i15, i13, i11 < 0 ? -1 : i11);
                return;
            }
            return;
        }
        int i16 = this.f17377e;
        if (i16 == -1) {
            i16 = -1;
        } else if (i16 == -2) {
            i16 = this.f17386q.getWidth();
        }
        if (i11 == -1) {
            i11 = -1;
        } else if (i11 == -2) {
            i11 = paddingBottom;
        }
        c1294a.setWidth(i16);
        c1294a.setHeight(i11);
        int i17 = Build.VERSION.SDK_INT;
        String string2 = StubApp.getString2(21219);
        if (i17 <= 28) {
            Method method = f17369C;
            if (method != null) {
                try {
                    method.invoke(c1294a, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i(string2, StubApp.getString2(21224));
                }
            }
        } else {
            AbstractC1372x0.b(c1294a, true);
        }
        c1294a.setOutsideTouchable(true);
        c1294a.setTouchInterceptor(this.f17389t);
        if (this.f17382l) {
            c1294a.setOverlapAnchor(this.f17381k);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f17370D;
            if (method2 != null) {
                try {
                    method2.invoke(c1294a, this.f17394z);
                } catch (Exception e10) {
                    Log.e(string2, StubApp.getString2(21225), e10);
                }
            }
        } else {
            AbstractC1372x0.a(c1294a, this.f17394z);
        }
        c1294a.showAsDropDown(this.f17386q, this.f17378f, this.f17379g, this.f17383m);
        this.f17375c.setSelection(-1);
        if ((!this.f17371A || this.f17375c.isInTouchMode()) && (c1358q0 = this.f17375c) != null) {
            c1358q0.setListSelectionHidden(true);
            c1358q0.requestLayout();
        }
        if (this.f17371A) {
            return;
        }
        this.f17392x.post(this.f17391w);
    }
}
