package n;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.stub.StubApp;
import f4.C0882f;
import java.util.ArrayList;
import m.SubMenuC1257D;

/* renamed from: n.k, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1345k implements m.x {

    /* renamed from: a, reason: collision with root package name */
    public final Context f17532a;

    /* renamed from: b, reason: collision with root package name */
    public Context f17533b;

    /* renamed from: c, reason: collision with root package name */
    public m.l f17534c;

    /* renamed from: d, reason: collision with root package name */
    public final LayoutInflater f17535d;

    /* renamed from: e, reason: collision with root package name */
    public m.w f17536e;

    /* renamed from: h, reason: collision with root package name */
    public m.z f17539h;
    public C1343j j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f17540k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f17541l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f17542m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f17543n;

    /* renamed from: p, reason: collision with root package name */
    public int f17544p;

    /* renamed from: q, reason: collision with root package name */
    public int f17545q;

    /* renamed from: r, reason: collision with root package name */
    public int f17546r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f17547s;

    /* renamed from: v, reason: collision with root package name */
    public C1337g f17549v;

    /* renamed from: w, reason: collision with root package name */
    public C1337g f17550w;

    /* renamed from: x, reason: collision with root package name */
    public RunnableC1341i f17551x;

    /* renamed from: y, reason: collision with root package name */
    public C1339h f17552y;

    /* renamed from: f, reason: collision with root package name */
    public final int f17537f = 2131427331;

    /* renamed from: g, reason: collision with root package name */
    public final int f17538g = 2131427330;

    /* renamed from: t, reason: collision with root package name */
    public final SparseBooleanArray f17548t = new SparseBooleanArray();

    /* renamed from: z, reason: collision with root package name */
    public final C0882f f17553z = new C0882f(this, 12);

    public C1345k(Context context) {
        this.f17532a = context;
        this.f17535d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [m.y] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(m.n nVar, View view, ViewGroup viewGroup) {
        View actionView = nVar.getActionView();
        if (actionView == null || nVar.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof m.y ? (m.y) view : (m.y) this.f17535d.inflate(this.f17538g, viewGroup, false);
            actionMenuItemView.a(nVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f17539h);
            if (this.f17552y == null) {
                this.f17552y = new C1339h(this);
            }
            actionMenuItemView2.setPopupCallback(this.f17552y);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(nVar.f16950C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C1349m)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // m.x
    public final void b(m.l lVar, boolean z2) {
        g();
        C1337g c1337g = this.f17550w;
        if (c1337g != null && c1337g.b()) {
            c1337g.f16996i.dismiss();
        }
        m.w wVar = this.f17536e;
        if (wVar != null) {
            wVar.b(lVar, z2);
        }
    }

    @Override // m.x
    public final void c(Context context, m.l lVar) {
        this.f17533b = context;
        LayoutInflater.from(context);
        this.f17534c = lVar;
        Resources resources = context.getResources();
        if (!this.f17543n) {
            this.f17542m = true;
        }
        int i3 = 2;
        this.f17544p = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i10 > 600 || ((i10 > 960 && i11 > 720) || (i10 > 720 && i11 > 960))) {
            i3 = 5;
        } else if (i10 >= 500 || ((i10 > 640 && i11 > 480) || (i10 > 480 && i11 > 640))) {
            i3 = 4;
        } else if (i10 >= 360) {
            i3 = 3;
        }
        this.f17546r = i3;
        int i12 = this.f17544p;
        if (this.f17542m) {
            if (this.j == null) {
                C1343j c1343j = new C1343j(this, this.f17532a);
                this.j = c1343j;
                if (this.f17541l) {
                    c1343j.setImageDrawable(this.f17540k);
                    this.f17540k = null;
                    this.f17541l = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.j.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i12 -= this.j.getMeasuredWidth();
        } else {
            this.j = null;
        }
        this.f17545q = i12;
        float f10 = resources.getDisplayMetrics().density;
    }

    @Override // m.x
    public final boolean d() {
        int i3;
        ArrayList arrayList;
        int i10;
        boolean z2;
        C1345k c1345k = this;
        m.l lVar = c1345k.f17534c;
        if (lVar != null) {
            arrayList = lVar.l();
            i3 = arrayList.size();
        } else {
            i3 = 0;
            arrayList = null;
        }
        int i11 = c1345k.f17546r;
        int i12 = c1345k.f17545q;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c1345k.f17539h;
        int i13 = 0;
        boolean z10 = false;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i10 = 2;
            z2 = true;
            if (i13 >= i3) {
                break;
            }
            m.n nVar = (m.n) arrayList.get(i13);
            int i16 = nVar.f16974y;
            if ((i16 & 2) == 2) {
                i14++;
            } else if ((i16 & 1) == 1) {
                i15++;
            } else {
                z10 = true;
            }
            if (c1345k.f17547s && nVar.f16950C) {
                i11 = 0;
            }
            i13++;
        }
        if (c1345k.f17542m && (z10 || i15 + i14 > i11)) {
            i11--;
        }
        int i17 = i11 - i14;
        SparseBooleanArray sparseBooleanArray = c1345k.f17548t;
        sparseBooleanArray.clear();
        int i18 = 0;
        int i19 = 0;
        while (i18 < i3) {
            m.n nVar2 = (m.n) arrayList.get(i18);
            int i20 = nVar2.f16974y;
            boolean z11 = (i20 & 2) == i10 ? z2 : false;
            int i21 = nVar2.f16952b;
            if (z11) {
                View a3 = c1345k.a(nVar2, null, viewGroup);
                a3.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a3.getMeasuredWidth();
                i12 -= measuredWidth;
                if (i19 == 0) {
                    i19 = measuredWidth;
                }
                if (i21 != 0) {
                    sparseBooleanArray.put(i21, z2);
                }
                nVar2.f(z2);
            } else if ((i20 & 1) == z2) {
                boolean z12 = sparseBooleanArray.get(i21);
                boolean z13 = ((i17 > 0 || z12) && i12 > 0) ? z2 : false;
                if (z13) {
                    View a9 = c1345k.a(nVar2, null, viewGroup);
                    a9.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a9.getMeasuredWidth();
                    i12 -= measuredWidth2;
                    if (i19 == 0) {
                        i19 = measuredWidth2;
                    }
                    z13 &= i12 + i19 > 0;
                }
                if (z13 && i21 != 0) {
                    sparseBooleanArray.put(i21, true);
                } else if (z12) {
                    sparseBooleanArray.put(i21, false);
                    for (int i22 = 0; i22 < i18; i22++) {
                        m.n nVar3 = (m.n) arrayList.get(i22);
                        if (nVar3.f16952b == i21) {
                            if ((nVar3.f16973x & 32) == 32) {
                                i17++;
                            }
                            nVar3.f(false);
                        }
                    }
                }
                if (z13) {
                    i17--;
                }
                nVar2.f(z13);
            } else {
                nVar2.f(false);
                i18++;
                i10 = 2;
                c1345k = this;
                z2 = true;
            }
            i18++;
            i10 = 2;
            c1345k = this;
            z2 = true;
        }
        return z2;
    }

    @Override // m.x
    public final void e(m.w wVar) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m.x
    public final void f() {
        int i3;
        ViewGroup viewGroup = (ViewGroup) this.f17539h;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            m.l lVar = this.f17534c;
            if (lVar != null) {
                lVar.i();
                ArrayList l9 = this.f17534c.l();
                int size = l9.size();
                i3 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    m.n nVar = (m.n) l9.get(i10);
                    if ((nVar.f16973x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i3);
                        m.n itemData = childAt instanceof m.y ? ((m.y) childAt).getItemData() : null;
                        View a3 = a(nVar, childAt, viewGroup);
                        if (nVar != itemData) {
                            a3.setPressed(false);
                            a3.jumpDrawablesToCurrentState();
                        }
                        if (a3 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a3.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a3);
                            }
                            ((ViewGroup) this.f17539h).addView(a3, i3);
                        }
                        i3++;
                    }
                }
            } else {
                i3 = 0;
            }
            while (i3 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i3) == this.j) {
                    i3++;
                } else {
                    viewGroup.removeViewAt(i3);
                }
            }
        }
        ((View) this.f17539h).requestLayout();
        m.l lVar2 = this.f17534c;
        if (lVar2 != null) {
            lVar2.i();
            ArrayList arrayList2 = lVar2.f16930i;
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                m.o oVar = ((m.n) arrayList2.get(i11)).f16948A;
            }
        }
        m.l lVar3 = this.f17534c;
        if (lVar3 != null) {
            lVar3.i();
            arrayList = lVar3.j;
        }
        if (this.f17542m && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((m.n) arrayList.get(0)).f16950C;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.j == null) {
                this.j = new C1343j(this, this.f17532a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.j.getParent();
            if (viewGroup3 != this.f17539h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.j);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f17539h;
                C1343j c1343j = this.j;
                actionMenuView.getClass();
                C1349m j = ActionMenuView.j();
                j.f17557a = true;
                actionMenuView.addView(c1343j, j);
            }
        } else {
            C1343j c1343j2 = this.j;
            if (c1343j2 != null) {
                Object parent = c1343j2.getParent();
                Object obj = this.f17539h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.j);
                }
            }
        }
        ((ActionMenuView) this.f17539h).setOverflowReserved(this.f17542m);
    }

    public final boolean g() {
        Object obj;
        RunnableC1341i runnableC1341i = this.f17551x;
        if (runnableC1341i != null && (obj = this.f17539h) != null) {
            ((View) obj).removeCallbacks(runnableC1341i);
            this.f17551x = null;
            return true;
        }
        C1337g c1337g = this.f17549v;
        if (c1337g == null) {
            return false;
        }
        if (c1337g.b()) {
            c1337g.f16996i.dismiss();
        }
        return true;
    }

    @Override // m.x
    public final boolean h(m.n nVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m.x
    public final boolean i(SubMenuC1257D subMenuC1257D) {
        boolean z2;
        if (subMenuC1257D.hasVisibleItems()) {
            SubMenuC1257D subMenuC1257D2 = subMenuC1257D;
            while (true) {
                m.l lVar = subMenuC1257D2.f16860z;
                if (lVar == this.f17534c) {
                    break;
                }
                subMenuC1257D2 = (SubMenuC1257D) lVar;
            }
            ViewGroup viewGroup = (ViewGroup) this.f17539h;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i3 = 0;
                while (true) {
                    if (i3 >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i3);
                    if ((childAt instanceof m.y) && ((m.y) childAt).getItemData() == subMenuC1257D2.f16859A) {
                        view = childAt;
                        break;
                    }
                    i3++;
                }
            }
            if (view != null) {
                subMenuC1257D.f16859A.getClass();
                int size = subMenuC1257D.f16927f.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        z2 = false;
                        break;
                    }
                    MenuItem item = subMenuC1257D.getItem(i10);
                    if (item.isVisible() && item.getIcon() != null) {
                        z2 = true;
                        break;
                    }
                    i10++;
                }
                C1337g c1337g = new C1337g(this, this.f17533b, subMenuC1257D, view);
                this.f17550w = c1337g;
                c1337g.f16994g = z2;
                m.t tVar = c1337g.f16996i;
                if (tVar != null) {
                    tVar.n(z2);
                }
                C1337g c1337g2 = this.f17550w;
                if (!c1337g2.b()) {
                    if (c1337g2.f16992e == null) {
                        throw new IllegalStateException(StubApp.getString2(21251));
                    }
                    c1337g2.d(0, 0, false, false);
                }
                m.w wVar = this.f17536e;
                if (wVar != null) {
                    wVar.m(subMenuC1257D);
                }
                return true;
            }
        }
        return false;
    }

    @Override // m.x
    public final boolean j(m.n nVar) {
        return false;
    }

    public final boolean k() {
        C1337g c1337g = this.f17549v;
        return c1337g != null && c1337g.b();
    }

    public final boolean l() {
        m.l lVar;
        if (!this.f17542m || k() || (lVar = this.f17534c) == null || this.f17539h == null || this.f17551x != null) {
            return false;
        }
        lVar.i();
        if (lVar.j.isEmpty()) {
            return false;
        }
        RunnableC1341i runnableC1341i = new RunnableC1341i(this, new C1337g(this, this.f17533b, this.f17534c, this.j));
        this.f17551x = runnableC1341i;
        ((View) this.f17539h).post(runnableC1341i);
        return true;
    }
}
