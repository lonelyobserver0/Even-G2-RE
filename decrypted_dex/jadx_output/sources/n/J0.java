package n;

import R8.C0250h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import t.AbstractC1695h;
import t.C1694g;
import t.C1698k;
import u.AbstractC1769a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class J0 {

    /* renamed from: g, reason: collision with root package name */
    public static J0 f17415g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f17417a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f17418b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f17419c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17420d;

    /* renamed from: e, reason: collision with root package name */
    public C0250h f17421e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f17414f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h, reason: collision with root package name */
    public static final I0 f17416h = new I0(6);

    public static synchronized J0 b() {
        J0 j02;
        synchronized (J0.class) {
            try {
                if (f17415g == null) {
                    f17415g = new J0();
                }
                j02 = f17415g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j02;
    }

    public static synchronized PorterDuffColorFilter e(int i3, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (J0.class) {
            I0 i02 = f17416h;
            i02.getClass();
            int i10 = (31 + i3) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) i02.b(Integer.valueOf(mode.hashCode() + i10));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i3, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i3) {
        Drawable drawable;
        if (this.f17419c == null) {
            this.f17419c = new TypedValue();
        }
        TypedValue typedValue = this.f17419c;
        context.getResources().getValue(i3, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            C1694g c1694g = (C1694g) this.f17418b.get(context);
            drawable = null;
            if (c1694g != null) {
                WeakReference weakReference = (WeakReference) c1694g.b(j);
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawable = constantState.newDrawable(context.getResources());
                    } else {
                        int b2 = AbstractC1769a.b(c1694g.f21027b, c1694g.f21029d, j);
                        if (b2 >= 0) {
                            Object[] objArr = c1694g.f21028c;
                            Object obj = objArr[b2];
                            Object obj2 = AbstractC1695h.f21030a;
                            if (obj != obj2) {
                                objArr[b2] = obj2;
                                c1694g.f21026a = true;
                            }
                        }
                    }
                }
            }
        }
        if (drawable != null) {
            return drawable;
        }
        LayerDrawable layerDrawable = null;
        if (this.f17421e != null) {
            if (i3 == 2131165206) {
                layerDrawable = new LayerDrawable(new Drawable[]{c(context, 2131165205), c(context, 2131165207)});
            } else if (i3 == 2131165241) {
                layerDrawable = C0250h.f(this, context, 2131099707);
            } else if (i3 == 2131165240) {
                layerDrawable = C0250h.f(this, context, 2131099708);
            } else if (i3 == 2131165242) {
                layerDrawable = C0250h.f(this, context, 2131099709);
            }
        }
        if (layerDrawable == null) {
            return layerDrawable;
        }
        layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawable.getConstantState();
                if (constantState2 != null) {
                    C1694g c1694g2 = (C1694g) this.f17418b.get(context);
                    if (c1694g2 == null) {
                        c1694g2 = new C1694g();
                        this.f17418b.put(context, c1694g2);
                    }
                    c1694g2.d(j, new WeakReference(constantState2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return layerDrawable;
    }

    public final synchronized Drawable c(Context context, int i3) {
        return d(context, i3, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0028, code lost:
    
        if (com.stub.StubApp.getString2("21228").equals(r0.getClass().getName()) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized android.graphics.drawable.Drawable d(android.content.Context r3, int r4, boolean r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f17420d     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L6
            goto L2a
        L6:
            r0 = 1
            r2.f17420d = r0     // Catch: java.lang.Throwable -> L3b
            r0 = 2131165268(0x7f070054, float:1.7944748E38)
            android.graphics.drawable.Drawable r0 = r2.c(r3, r0)     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L44
            boolean r1 = r0 instanceof U1.a     // Catch: java.lang.Throwable -> L3b
            if (r1 != 0) goto L2a
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r1 = "21228"
            java.lang.String r1 = com.stub.StubApp.getString2(r1)     // Catch: java.lang.Throwable -> L3b
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L44
        L2a:
            android.graphics.drawable.Drawable r0 = r2.a(r3, r4)     // Catch: java.lang.Throwable -> L3b
            if (r0 != 0) goto L34
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r4)     // Catch: java.lang.Throwable -> L3b
        L34:
            if (r0 == 0) goto L3d
            android.graphics.drawable.Drawable r0 = r2.g(r3, r4, r5, r0)     // Catch: java.lang.Throwable -> L3b
            goto L3d
        L3b:
            r3 = move-exception
            goto L53
        L3d:
            if (r0 == 0) goto L42
            n.AbstractC1346k0.a(r0)     // Catch: java.lang.Throwable -> L3b
        L42:
            monitor-exit(r2)
            return r0
        L44:
            r3 = 0
            r2.f17420d = r3     // Catch: java.lang.Throwable -> L3b
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3b
            java.lang.String r4 = "21229"
            java.lang.String r4 = com.stub.StubApp.getString2(r4)     // Catch: java.lang.Throwable -> L3b
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L3b
            throw r3     // Catch: java.lang.Throwable -> L3b
        L53:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3b
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: n.J0.d(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    public final synchronized ColorStateList f(Context context, int i3) {
        ColorStateList colorStateList;
        C1698k c1698k;
        WeakHashMap weakHashMap = this.f17417a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (c1698k = (C1698k) weakHashMap.get(context)) == null) ? null : (ColorStateList) c1698k.b(i3);
        if (colorStateList == null) {
            C0250h c0250h = this.f17421e;
            if (c0250h != null) {
                colorStateList2 = c0250h.g(context, i3);
            }
            if (colorStateList2 != null) {
                if (this.f17417a == null) {
                    this.f17417a = new WeakHashMap();
                }
                C1698k c1698k2 = (C1698k) this.f17417a.get(context);
                if (c1698k2 == null) {
                    c1698k2 = new C1698k();
                    this.f17417a.put(context, c1698k2);
                }
                c1698k2.a(i3, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable g(android.content.Context r8, int r9, boolean r10, android.graphics.drawable.Drawable r11) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n.J0.g(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
