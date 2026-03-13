package l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.stub.StubApp;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import m.n;
import m.o;
import m.s;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class g {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f15665A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f15666B;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ h f15669E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f15670a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f15677h;

    /* renamed from: i, reason: collision with root package name */
    public int f15678i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f15679k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f15680l;

    /* renamed from: m, reason: collision with root package name */
    public int f15681m;

    /* renamed from: n, reason: collision with root package name */
    public char f15682n;

    /* renamed from: o, reason: collision with root package name */
    public int f15683o;

    /* renamed from: p, reason: collision with root package name */
    public char f15684p;

    /* renamed from: q, reason: collision with root package name */
    public int f15685q;

    /* renamed from: r, reason: collision with root package name */
    public int f15686r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f15687s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f15688t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f15689u;

    /* renamed from: v, reason: collision with root package name */
    public int f15690v;

    /* renamed from: w, reason: collision with root package name */
    public int f15691w;

    /* renamed from: x, reason: collision with root package name */
    public String f15692x;

    /* renamed from: y, reason: collision with root package name */
    public String f15693y;

    /* renamed from: z, reason: collision with root package name */
    public o f15694z;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f15667C = null;

    /* renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f15668D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f15671b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f15672c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f15673d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f15674e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f15675f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15676g = true;

    public g(h hVar, Menu menu) {
        this.f15669E = hVar;
        this.f15670a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f15669E.f15699c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e10) {
            Log.w(StubApp.getString2(19200), StubApp.getString2(19199) + str, e10);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z2 = false;
        menuItem.setChecked(this.f15687s).setVisible(this.f15688t).setEnabled(this.f15689u).setCheckable(this.f15686r >= 1).setTitleCondensed(this.f15680l).setIcon(this.f15681m);
        int i3 = this.f15690v;
        if (i3 >= 0) {
            menuItem.setShowAsAction(i3);
        }
        String str = this.f15693y;
        h hVar = this.f15669E;
        if (str != null) {
            if (hVar.f15699c.isRestricted()) {
                throw new IllegalStateException(StubApp.getString2(19203));
            }
            if (hVar.f15700d == null) {
                hVar.f15700d = h.a(hVar.f15699c);
            }
            Object obj = hVar.f15700d;
            String str2 = this.f15693y;
            MenuItemOnMenuItemClickListenerC1135f menuItemOnMenuItemClickListenerC1135f = new MenuItemOnMenuItemClickListenerC1135f();
            menuItemOnMenuItemClickListenerC1135f.f15663a = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC1135f.f15664b = cls.getMethod(str2, MenuItemOnMenuItemClickListenerC1135f.f15662c);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC1135f);
            } catch (Exception e10) {
                StringBuilder l9 = com.mapbox.common.b.l(StubApp.getString2(19201), str2, StubApp.getString2(19202));
                l9.append(cls.getName());
                InflateException inflateException = new InflateException(l9.toString());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }
        if (this.f15686r >= 2) {
            if (menuItem instanceof n) {
                n nVar = (n) menuItem;
                nVar.f16973x = (nVar.f16973x & (-5)) | 4;
            } else if (menuItem instanceof s) {
                s sVar = (s) menuItem;
                try {
                    Method method = sVar.f16985d;
                    H.a aVar = sVar.f16984c;
                    if (method == null) {
                        sVar.f16985d = aVar.getClass().getDeclaredMethod(StubApp.getString2("19204"), Boolean.TYPE);
                    }
                    sVar.f16985d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e11) {
                    Log.w(StubApp.getString2(19205), StubApp.getString2(19206), e11);
                }
            }
        }
        String str3 = this.f15692x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, h.f15695e, hVar.f15697a));
            z2 = true;
        }
        int i10 = this.f15691w;
        if (i10 > 0) {
            if (z2) {
                Log.w(StubApp.getString2(19200), StubApp.getString2(19207));
            } else {
                menuItem.setActionView(i10);
            }
        }
        o oVar = this.f15694z;
        if (oVar != null) {
            if (menuItem instanceof H.a) {
                ((H.a) menuItem).a(oVar);
            } else {
                Log.w(StubApp.getString2(19208), StubApp.getString2(19209));
            }
        }
        CharSequence charSequence = this.f15665A;
        boolean z10 = menuItem instanceof H.a;
        if (z10) {
            ((H.a) menuItem).setContentDescription(charSequence);
        } else {
            menuItem.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f15666B;
        if (z10) {
            ((H.a) menuItem).setTooltipText(charSequence2);
        } else {
            menuItem.setTooltipText(charSequence2);
        }
        char c10 = this.f15682n;
        int i11 = this.f15683o;
        if (z10) {
            ((H.a) menuItem).setAlphabeticShortcut(c10, i11);
        } else {
            menuItem.setAlphabeticShortcut(c10, i11);
        }
        char c11 = this.f15684p;
        int i12 = this.f15685q;
        if (z10) {
            ((H.a) menuItem).setNumericShortcut(c11, i12);
        } else {
            menuItem.setNumericShortcut(c11, i12);
        }
        PorterDuff.Mode mode = this.f15668D;
        if (mode != null) {
            if (z10) {
                ((H.a) menuItem).setIconTintMode(mode);
            } else {
                menuItem.setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.f15667C;
        if (colorStateList != null) {
            if (z10) {
                ((H.a) menuItem).setIconTintList(colorStateList);
            } else {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }
}
