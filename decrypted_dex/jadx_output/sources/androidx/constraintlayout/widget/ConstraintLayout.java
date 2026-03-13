package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.IntCompanionObject;
import org.bouncycastle.asn1.eac.EACTags;
import w.C1855d;
import x.C1895b;
import x.C1897d;
import x.C1898e;
import x.C1900g;
import y.AbstractC1956b;
import y.AbstractC1957c;
import y.AbstractC1962h;
import y.C1958d;
import y.C1960f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f9618a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f9619b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f9620c;

    /* renamed from: d, reason: collision with root package name */
    public final C1898e f9621d;

    /* renamed from: e, reason: collision with root package name */
    public int f9622e;

    /* renamed from: f, reason: collision with root package name */
    public int f9623f;

    /* renamed from: g, reason: collision with root package name */
    public int f9624g;

    /* renamed from: h, reason: collision with root package name */
    public int f9625h;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final int f9626k;

    /* renamed from: l, reason: collision with root package name */
    public C1960f f9627l;

    /* renamed from: m, reason: collision with root package name */
    public final int f9628m;

    /* renamed from: n, reason: collision with root package name */
    public HashMap f9629n;

    /* renamed from: p, reason: collision with root package name */
    public int f9630p;

    /* renamed from: q, reason: collision with root package name */
    public int f9631q;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        SparseArray sparseArray = new SparseArray();
        this.f9618a = sparseArray;
        this.f9619b = new ArrayList(4);
        this.f9620c = new ArrayList(100);
        C1898e c1898e = new C1898e();
        c1898e.f22587i0 = new ArrayList();
        c1898e.f22588j0 = false;
        c1898e.f22589k0 = new C1855d();
        c1898e.f22591m0 = 0;
        c1898e.f22592n0 = 0;
        c1898e.f22593o0 = new C1895b[4];
        c1898e.f22594p0 = new C1895b[4];
        c1898e.f22595q0 = new ArrayList();
        c1898e.f22596r0 = false;
        c1898e.f22597s0 = false;
        c1898e.f22598t0 = false;
        c1898e.f22599u0 = 0;
        c1898e.f22600v0 = 0;
        c1898e.f22601w0 = 7;
        c1898e.f22602x0 = false;
        c1898e.f22603y0 = false;
        c1898e.f22604z0 = false;
        this.f9621d = c1898e;
        this.f9622e = 0;
        this.f9623f = 0;
        this.f9624g = IntCompanionObject.MAX_VALUE;
        this.f9625h = IntCompanionObject.MAX_VALUE;
        this.j = true;
        this.f9626k = 7;
        this.f9627l = null;
        this.f9628m = -1;
        this.f9629n = new HashMap();
        this.f9630p = -1;
        this.f9631q = -1;
        c1898e.f22551W = this;
        sparseArray.put(getId(), this);
        this.f9627l = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1962h.f23324a);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 3) {
                    this.f9622e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f9622e);
                } else if (index == 4) {
                    this.f9623f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f9623f);
                } else if (index == 1) {
                    this.f9624g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f9624g);
                } else if (index == 2) {
                    this.f9625h = obtainStyledAttributes.getDimensionPixelOffset(index, this.f9625h);
                } else if (index == 59) {
                    this.f9626k = obtainStyledAttributes.getInt(index, this.f9626k);
                } else if (index == 8) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C1960f c1960f = new C1960f();
                        c1960f.f23323a = new HashMap();
                        this.f9627l = c1960f;
                        c1960f.c(getContext(), resourceId);
                    } catch (Resources.NotFoundException unused) {
                        this.f9627l = null;
                    }
                    this.f9628m = resourceId;
                }
            }
            obtainStyledAttributes.recycle();
        }
        c1898e.f22601w0 = this.f9626k;
    }

    public static C1958d a() {
        C1958d c1958d = new C1958d(-2, -2);
        c1958d.f23219a = -1;
        c1958d.f23221b = -1;
        c1958d.f23223c = -1.0f;
        c1958d.f23225d = -1;
        c1958d.f23227e = -1;
        c1958d.f23229f = -1;
        c1958d.f23231g = -1;
        c1958d.f23233h = -1;
        c1958d.f23234i = -1;
        c1958d.j = -1;
        c1958d.f23237k = -1;
        c1958d.f23238l = -1;
        c1958d.f23239m = -1;
        c1958d.f23240n = 0;
        c1958d.f23241o = 0.0f;
        c1958d.f23242p = -1;
        c1958d.f23243q = -1;
        c1958d.f23244r = -1;
        c1958d.f23245s = -1;
        c1958d.f23246t = -1;
        c1958d.f23247u = -1;
        c1958d.f23248v = -1;
        c1958d.f23249w = -1;
        c1958d.f23250x = -1;
        c1958d.f23251y = -1;
        c1958d.f23252z = 0.5f;
        c1958d.f23193A = 0.5f;
        c1958d.f23194B = null;
        c1958d.f23195C = 1;
        c1958d.f23196D = -1.0f;
        c1958d.f23197E = -1.0f;
        c1958d.f23198F = 0;
        c1958d.f23199G = 0;
        c1958d.f23200H = 0;
        c1958d.f23201I = 0;
        c1958d.f23202J = 0;
        c1958d.f23203K = 0;
        c1958d.f23204L = 0;
        c1958d.f23205M = 0;
        c1958d.f23206N = 1.0f;
        c1958d.f23207O = 1.0f;
        c1958d.f23208P = -1;
        c1958d.f23209Q = -1;
        c1958d.f23210R = -1;
        c1958d.f23211S = false;
        c1958d.f23212T = false;
        c1958d.f23213U = true;
        c1958d.f23214V = true;
        c1958d.f23215W = false;
        c1958d.f23216X = false;
        c1958d.f23217Y = false;
        c1958d.f23218Z = -1;
        c1958d.f23220a0 = -1;
        c1958d.f23222b0 = -1;
        c1958d.f23224c0 = -1;
        c1958d.f23226d0 = -1;
        c1958d.f23228e0 = -1;
        c1958d.f23230f0 = 0.5f;
        c1958d.f23236j0 = new C1897d();
        return c1958d;
    }

    public final C1897d b(int i3) {
        C1898e c1898e = this.f9621d;
        if (i3 == 0) {
            return c1898e;
        }
        View view = (View) this.f9618a.get(i3);
        if (view == null && (view = findViewById(i3)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return c1898e;
        }
        if (view == null) {
            return null;
        }
        return ((C1958d) view.getLayoutParams()).f23236j0;
    }

    public final C1897d c(View view) {
        if (view == this) {
            return this.f9621d;
        }
        if (view == null) {
            return null;
        }
        return ((C1958d) view.getLayoutParams()).f23236j0;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1958d;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x023c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(int r27, int r28) {
        /*
            Method dump skipped, instructions count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.d(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i10 = (int) ((parseInt / 1080.0f) * width);
                        int i11 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = i10;
                        float f11 = i11;
                        float f12 = i10 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float parseInt4 = i11 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f12, f11, f12, parseInt4, paint);
                        canvas.drawLine(f12, parseInt4, f10, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f12, f11, paint);
                    }
                }
            }
        }
    }

    public final void e(String str, Integer num) {
        if (str != null) {
            if (this.f9629n == null) {
                this.f9629n = new HashMap();
            }
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f9629n.put(str, num);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        int i3;
        Context context = getContext();
        C1958d c1958d = new C1958d(context, attributeSet);
        c1958d.f23219a = -1;
        c1958d.f23221b = -1;
        c1958d.f23223c = -1.0f;
        c1958d.f23225d = -1;
        c1958d.f23227e = -1;
        c1958d.f23229f = -1;
        c1958d.f23231g = -1;
        c1958d.f23233h = -1;
        c1958d.f23234i = -1;
        c1958d.j = -1;
        c1958d.f23237k = -1;
        c1958d.f23238l = -1;
        c1958d.f23239m = -1;
        c1958d.f23240n = 0;
        c1958d.f23241o = 0.0f;
        c1958d.f23242p = -1;
        c1958d.f23243q = -1;
        c1958d.f23244r = -1;
        c1958d.f23245s = -1;
        c1958d.f23246t = -1;
        c1958d.f23247u = -1;
        c1958d.f23248v = -1;
        c1958d.f23249w = -1;
        c1958d.f23250x = -1;
        c1958d.f23251y = -1;
        c1958d.f23252z = 0.5f;
        c1958d.f23193A = 0.5f;
        c1958d.f23194B = null;
        c1958d.f23195C = 1;
        c1958d.f23196D = -1.0f;
        c1958d.f23197E = -1.0f;
        c1958d.f23198F = 0;
        c1958d.f23199G = 0;
        c1958d.f23200H = 0;
        c1958d.f23201I = 0;
        c1958d.f23202J = 0;
        c1958d.f23203K = 0;
        c1958d.f23204L = 0;
        c1958d.f23205M = 0;
        c1958d.f23206N = 1.0f;
        c1958d.f23207O = 1.0f;
        c1958d.f23208P = -1;
        c1958d.f23209Q = -1;
        c1958d.f23210R = -1;
        c1958d.f23211S = false;
        c1958d.f23212T = false;
        c1958d.f23213U = true;
        c1958d.f23214V = true;
        c1958d.f23215W = false;
        c1958d.f23216X = false;
        c1958d.f23217Y = false;
        c1958d.f23218Z = -1;
        c1958d.f23220a0 = -1;
        c1958d.f23222b0 = -1;
        c1958d.f23224c0 = -1;
        c1958d.f23226d0 = -1;
        c1958d.f23228e0 = -1;
        c1958d.f23230f0 = 0.5f;
        c1958d.f23236j0 = new C1897d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1962h.f23324a);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            int i11 = AbstractC1957c.f23192a.get(index);
            switch (i11) {
                case 1:
                    c1958d.f23210R = obtainStyledAttributes.getInt(index, c1958d.f23210R);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, c1958d.f23239m);
                    c1958d.f23239m = resourceId;
                    if (resourceId == -1) {
                        c1958d.f23239m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    c1958d.f23240n = obtainStyledAttributes.getDimensionPixelSize(index, c1958d.f23240n);
                    break;
                case 4:
                    float f10 = obtainStyledAttributes.getFloat(index, c1958d.f23241o) % 360.0f;
                    c1958d.f23241o = f10;
                    if (f10 < 0.0f) {
                        c1958d.f23241o = (360.0f - f10) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    c1958d.f23219a = obtainStyledAttributes.getDimensionPixelOffset(index, c1958d.f23219a);
                    break;
                case 6:
                    c1958d.f23221b = obtainStyledAttributes.getDimensionPixelOffset(index, c1958d.f23221b);
                    break;
                case 7:
                    c1958d.f23223c = obtainStyledAttributes.getFloat(index, c1958d.f23223c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, c1958d.f23225d);
                    c1958d.f23225d = resourceId2;
                    if (resourceId2 == -1) {
                        c1958d.f23225d = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, c1958d.f23227e);
                    c1958d.f23227e = resourceId3;
                    if (resourceId3 == -1) {
                        c1958d.f23227e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, c1958d.f23229f);
                    c1958d.f23229f = resourceId4;
                    if (resourceId4 == -1) {
                        c1958d.f23229f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, c1958d.f23231g);
                    c1958d.f23231g = resourceId5;
                    if (resourceId5 == -1) {
                        c1958d.f23231g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, c1958d.f23233h);
                    c1958d.f23233h = resourceId6;
                    if (resourceId6 == -1) {
                        c1958d.f23233h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, c1958d.f23234i);
                    c1958d.f23234i = resourceId7;
                    if (resourceId7 == -1) {
                        c1958d.f23234i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, c1958d.j);
                    c1958d.j = resourceId8;
                    if (resourceId8 == -1) {
                        c1958d.j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, c1958d.f23237k);
                    c1958d.f23237k = resourceId9;
                    if (resourceId9 == -1) {
                        c1958d.f23237k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, c1958d.f23238l);
                    c1958d.f23238l = resourceId10;
                    if (resourceId10 == -1) {
                        c1958d.f23238l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, c1958d.f23242p);
                    c1958d.f23242p = resourceId11;
                    if (resourceId11 == -1) {
                        c1958d.f23242p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, c1958d.f23243q);
                    c1958d.f23243q = resourceId12;
                    if (resourceId12 == -1) {
                        c1958d.f23243q = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, c1958d.f23244r);
                    c1958d.f23244r = resourceId13;
                    if (resourceId13 == -1) {
                        c1958d.f23244r = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, c1958d.f23245s);
                    c1958d.f23245s = resourceId14;
                    if (resourceId14 == -1) {
                        c1958d.f23245s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    c1958d.f23246t = obtainStyledAttributes.getDimensionPixelSize(index, c1958d.f23246t);
                    break;
                case 22:
                    c1958d.f23247u = obtainStyledAttributes.getDimensionPixelSize(index, c1958d.f23247u);
                    break;
                case 23:
                    c1958d.f23248v = obtainStyledAttributes.getDimensionPixelSize(index, c1958d.f23248v);
                    break;
                case 24:
                    c1958d.f23249w = obtainStyledAttributes.getDimensionPixelSize(index, c1958d.f23249w);
                    break;
                case 25:
                    c1958d.f23250x = obtainStyledAttributes.getDimensionPixelSize(index, c1958d.f23250x);
                    break;
                case 26:
                    c1958d.f23251y = obtainStyledAttributes.getDimensionPixelSize(index, c1958d.f23251y);
                    break;
                case 27:
                    c1958d.f23211S = obtainStyledAttributes.getBoolean(index, c1958d.f23211S);
                    break;
                case 28:
                    c1958d.f23212T = obtainStyledAttributes.getBoolean(index, c1958d.f23212T);
                    break;
                case 29:
                    c1958d.f23252z = obtainStyledAttributes.getFloat(index, c1958d.f23252z);
                    break;
                case 30:
                    c1958d.f23193A = obtainStyledAttributes.getFloat(index, c1958d.f23193A);
                    break;
                case 31:
                    int i12 = obtainStyledAttributes.getInt(index, 0);
                    c1958d.f23200H = i12;
                    if (i12 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i13 = obtainStyledAttributes.getInt(index, 0);
                    c1958d.f23201I = i13;
                    if (i13 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        c1958d.f23202J = obtainStyledAttributes.getDimensionPixelSize(index, c1958d.f23202J);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, c1958d.f23202J) == -2) {
                            c1958d.f23202J = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        c1958d.f23204L = obtainStyledAttributes.getDimensionPixelSize(index, c1958d.f23204L);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, c1958d.f23204L) == -2) {
                            c1958d.f23204L = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    c1958d.f23206N = Math.max(0.0f, obtainStyledAttributes.getFloat(index, c1958d.f23206N));
                    break;
                case EACTags.APPLICATION_EXPIRATION_DATE /* 36 */:
                    try {
                        c1958d.f23203K = obtainStyledAttributes.getDimensionPixelSize(index, c1958d.f23203K);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, c1958d.f23203K) == -2) {
                            c1958d.f23203K = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                    try {
                        c1958d.f23205M = obtainStyledAttributes.getDimensionPixelSize(index, c1958d.f23205M);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, c1958d.f23205M) == -2) {
                            c1958d.f23205M = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                    c1958d.f23207O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, c1958d.f23207O));
                    break;
                default:
                    switch (i11) {
                        case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                            String string = obtainStyledAttributes.getString(index);
                            c1958d.f23194B = string;
                            c1958d.f23195C = -1;
                            if (string != null) {
                                int length = string.length();
                                int indexOf = c1958d.f23194B.indexOf(44);
                                if (indexOf <= 0 || indexOf >= length - 1) {
                                    i3 = 0;
                                } else {
                                    String substring = c1958d.f23194B.substring(0, indexOf);
                                    if (substring.equalsIgnoreCase("W")) {
                                        c1958d.f23195C = 0;
                                    } else if (substring.equalsIgnoreCase("H")) {
                                        c1958d.f23195C = 1;
                                    }
                                    i3 = indexOf + 1;
                                }
                                int indexOf2 = c1958d.f23194B.indexOf(58);
                                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                                    String substring2 = c1958d.f23194B.substring(i3);
                                    if (substring2.length() > 0) {
                                        Float.parseFloat(substring2);
                                        break;
                                    } else {
                                        break;
                                    }
                                } else {
                                    String substring3 = c1958d.f23194B.substring(i3, indexOf2);
                                    String substring4 = c1958d.f23194B.substring(indexOf2 + 1);
                                    if (substring3.length() > 0 && substring4.length() > 0) {
                                        try {
                                            float parseFloat = Float.parseFloat(substring3);
                                            float parseFloat2 = Float.parseFloat(substring4);
                                            if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                if (c1958d.f23195C == 1) {
                                                    Math.abs(parseFloat2 / parseFloat);
                                                    break;
                                                } else {
                                                    Math.abs(parseFloat / parseFloat2);
                                                    break;
                                                }
                                            }
                                        } catch (NumberFormatException unused5) {
                                            break;
                                        }
                                    }
                                }
                            } else {
                                break;
                            }
                            break;
                        case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                            c1958d.f23196D = obtainStyledAttributes.getFloat(index, c1958d.f23196D);
                            break;
                        case 46:
                            c1958d.f23197E = obtainStyledAttributes.getFloat(index, c1958d.f23197E);
                            break;
                        case EACTags.PIN_USAGE_POLICY /* 47 */:
                            c1958d.f23198F = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            c1958d.f23199G = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            c1958d.f23208P = obtainStyledAttributes.getDimensionPixelOffset(index, c1958d.f23208P);
                            break;
                        case 50:
                            c1958d.f23209Q = obtainStyledAttributes.getDimensionPixelOffset(index, c1958d.f23209Q);
                            break;
                    }
            }
        }
        obtainStyledAttributes.recycle();
        c1958d.a();
        return c1958d;
    }

    public int getMaxHeight() {
        return this.f9625h;
    }

    public int getMaxWidth() {
        return this.f9624g;
    }

    public int getMinHeight() {
        return this.f9623f;
    }

    public int getMinWidth() {
        return this.f9622e;
    }

    public int getOptimizationLevel() {
        return this.f9621d.f22601w0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i3, int i10, int i11, int i12) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            C1958d c1958d = (C1958d) childAt.getLayoutParams();
            C1897d c1897d = c1958d.f23236j0;
            if (childAt.getVisibility() != 8 || c1958d.f23216X || c1958d.f23217Y || isInEditMode) {
                int i14 = c1897d.f22540L + c1897d.f22542N;
                int i15 = c1897d.f22541M + c1897d.f22543O;
                childAt.layout(i14, i15, c1897d.k() + i14, c1897d.g() + i15);
            }
        }
        ArrayList arrayList = this.f9619b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i16 = 0; i16 < size; i16++) {
                ((AbstractC1956b) arrayList.get(i16)).getClass();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:631:0x0845, code lost:
    
        if (r3.f23200H != 1) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x085c, code lost:
    
        if (r12 != (-1)) goto L391;
     */
    /* JADX WARN: Removed duplicated region for block: B:317:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x08b1  */
    /* JADX WARN: Removed duplicated region for block: B:643:0x08b5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r55, int r56) {
        /*
            Method dump skipped, instructions count: 3276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C1897d c10 = c(view);
        if ((view instanceof Guideline) && !(c10 instanceof C1900g)) {
            C1958d c1958d = (C1958d) view.getLayoutParams();
            C1900g c1900g = new C1900g();
            c1958d.f23236j0 = c1900g;
            c1958d.f23216X = true;
            c1900g.A(c1958d.f23210R);
        }
        if (view instanceof AbstractC1956b) {
            AbstractC1956b abstractC1956b = (AbstractC1956b) view;
            abstractC1956b.c();
            ((C1958d) view.getLayoutParams()).f23217Y = true;
            ArrayList arrayList = this.f9619b;
            if (!arrayList.contains(abstractC1956b)) {
                arrayList.add(abstractC1956b);
            }
        }
        this.f9618a.put(view.getId(), view);
        this.j = true;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f9618a.remove(view.getId());
        C1897d c10 = c(view);
        this.f9621d.f22587i0.remove(c10);
        c10.f22531C = null;
        this.f9619b.remove(view);
        this.f9620c.remove(c10);
        this.j = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        this.j = true;
        this.f9630p = -1;
        this.f9631q = -1;
    }

    public void setConstraintSet(C1960f c1960f) {
        this.f9627l = c1960f;
    }

    @Override // android.view.View
    public void setId(int i3) {
        SparseArray sparseArray = this.f9618a;
        sparseArray.remove(getId());
        super.setId(i3);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i3) {
        if (i3 == this.f9625h) {
            return;
        }
        this.f9625h = i3;
        requestLayout();
    }

    public void setMaxWidth(int i3) {
        if (i3 == this.f9624g) {
            return;
        }
        this.f9624g = i3;
        requestLayout();
    }

    public void setMinHeight(int i3) {
        if (i3 == this.f9623f) {
            return;
        }
        this.f9623f = i3;
        requestLayout();
    }

    public void setMinWidth(int i3) {
        if (i3 == this.f9622e) {
            return;
        }
        this.f9622e = i3;
        requestLayout();
    }

    public void setOptimizationLevel(int i3) {
        this.f9621d.f22601w0 = i3;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C1958d c1958d = new C1958d(layoutParams);
        c1958d.f23219a = -1;
        c1958d.f23221b = -1;
        c1958d.f23223c = -1.0f;
        c1958d.f23225d = -1;
        c1958d.f23227e = -1;
        c1958d.f23229f = -1;
        c1958d.f23231g = -1;
        c1958d.f23233h = -1;
        c1958d.f23234i = -1;
        c1958d.j = -1;
        c1958d.f23237k = -1;
        c1958d.f23238l = -1;
        c1958d.f23239m = -1;
        c1958d.f23240n = 0;
        c1958d.f23241o = 0.0f;
        c1958d.f23242p = -1;
        c1958d.f23243q = -1;
        c1958d.f23244r = -1;
        c1958d.f23245s = -1;
        c1958d.f23246t = -1;
        c1958d.f23247u = -1;
        c1958d.f23248v = -1;
        c1958d.f23249w = -1;
        c1958d.f23250x = -1;
        c1958d.f23251y = -1;
        c1958d.f23252z = 0.5f;
        c1958d.f23193A = 0.5f;
        c1958d.f23194B = null;
        c1958d.f23195C = 1;
        c1958d.f23196D = -1.0f;
        c1958d.f23197E = -1.0f;
        c1958d.f23198F = 0;
        c1958d.f23199G = 0;
        c1958d.f23200H = 0;
        c1958d.f23201I = 0;
        c1958d.f23202J = 0;
        c1958d.f23203K = 0;
        c1958d.f23204L = 0;
        c1958d.f23205M = 0;
        c1958d.f23206N = 1.0f;
        c1958d.f23207O = 1.0f;
        c1958d.f23208P = -1;
        c1958d.f23209Q = -1;
        c1958d.f23210R = -1;
        c1958d.f23211S = false;
        c1958d.f23212T = false;
        c1958d.f23213U = true;
        c1958d.f23214V = true;
        c1958d.f23215W = false;
        c1958d.f23216X = false;
        c1958d.f23217Y = false;
        c1958d.f23218Z = -1;
        c1958d.f23220a0 = -1;
        c1958d.f23222b0 = -1;
        c1958d.f23224c0 = -1;
        c1958d.f23226d0 = -1;
        c1958d.f23228e0 = -1;
        c1958d.f23230f0 = 0.5f;
        c1958d.f23236j0 = new C1897d();
        return c1958d;
    }
}
