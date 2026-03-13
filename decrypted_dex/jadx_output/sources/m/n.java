package m;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.gms.internal.measurement.D1;
import com.stub.StubApp;
import f4.C0882f;
import java.util.ArrayList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class n implements H.a {

    /* renamed from: A, reason: collision with root package name */
    public o f16948A;

    /* renamed from: B, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f16949B;

    /* renamed from: a, reason: collision with root package name */
    public final int f16951a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16952b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16953c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16954d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f16955e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f16956f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f16957g;

    /* renamed from: h, reason: collision with root package name */
    public char f16958h;
    public char j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f16961l;

    /* renamed from: n, reason: collision with root package name */
    public final l f16963n;

    /* renamed from: o, reason: collision with root package name */
    public SubMenuC1257D f16964o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f16965p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f16966q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f16967r;

    /* renamed from: y, reason: collision with root package name */
    public int f16974y;

    /* renamed from: z, reason: collision with root package name */
    public View f16975z;

    /* renamed from: i, reason: collision with root package name */
    public int f16959i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f16960k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f16962m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f16968s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f16969t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f16970u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f16971v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f16972w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f16973x = 16;

    /* renamed from: C, reason: collision with root package name */
    public boolean f16950C = false;

    public n(l lVar, int i3, int i10, int i11, int i12, CharSequence charSequence, int i13) {
        this.f16963n = lVar;
        this.f16951a = i10;
        this.f16952b = i3;
        this.f16953c = i11;
        this.f16954d = i12;
        this.f16955e = charSequence;
        this.f16974y = i13;
    }

    public static void c(StringBuilder sb2, int i3, int i10, String str) {
        if ((i3 & i10) == i10) {
            sb2.append(str);
        }
    }

    @Override // H.a
    public final H.a a(o oVar) {
        this.f16975z = null;
        this.f16948A = oVar;
        this.f16963n.p(true);
        o oVar2 = this.f16948A;
        if (oVar2 != null) {
            oVar2.f16976a = new C0882f(this, 9);
            oVar2.f16977b.setVisibilityListener(oVar2);
        }
        return this;
    }

    @Override // H.a
    public final o b() {
        return this.f16948A;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f16974y & 8) == 0) {
            return false;
        }
        if (this.f16975z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f16949B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f16963n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f16972w && (this.f16970u || this.f16971v)) {
            drawable = drawable.mutate();
            if (this.f16970u) {
                drawable.setTintList(this.f16968s);
            }
            if (this.f16971v) {
                drawable.setTintMode(this.f16969t);
            }
            this.f16972w = false;
        }
        return drawable;
    }

    public final boolean e() {
        o oVar;
        if ((this.f16974y & 8) != 0) {
            if (this.f16975z == null && (oVar = this.f16948A) != null) {
                this.f16975z = oVar.f16977b.onCreateActionView(this);
            }
            if (this.f16975z != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f16949B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f16963n.f(this);
        }
        return false;
    }

    public final void f(boolean z2) {
        if (z2) {
            this.f16973x |= 32;
        } else {
            this.f16973x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException(StubApp.getString2(21044));
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f16975z;
        if (view != null) {
            return view;
        }
        o oVar = this.f16948A;
        if (oVar == null) {
            return null;
        }
        View onCreateActionView = oVar.f16977b.onCreateActionView(this);
        this.f16975z = onCreateActionView;
        return onCreateActionView;
    }

    @Override // H.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f16960k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.j;
    }

    @Override // H.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f16966q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f16952b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f16961l;
        if (drawable != null) {
            return d(drawable);
        }
        int i3 = this.f16962m;
        if (i3 == 0) {
            return null;
        }
        Drawable m4 = D1.m(this.f16963n.f16922a, i3);
        this.f16962m = 0;
        this.f16961l = m4;
        return d(m4);
    }

    @Override // H.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f16968s;
    }

    @Override // H.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f16969t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f16957g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f16951a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // H.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f16959i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f16958h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f16953c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f16964o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f16955e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f16956f;
        return charSequence != null ? charSequence : this.f16955e;
    }

    @Override // H.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f16967r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f16964o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f16950C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f16973x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f16973x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f16973x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        o oVar = this.f16948A;
        return (oVar == null || !oVar.f16977b.overridesItemVisibility()) ? (this.f16973x & 8) == 0 : (this.f16973x & 8) == 0 && this.f16948A.f16977b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException(StubApp.getString2(21045));
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i3;
        this.f16975z = view;
        this.f16948A = null;
        if (view != null && view.getId() == -1 && (i3 = this.f16951a) > 0) {
            view.setId(i3);
        }
        l lVar = this.f16963n;
        lVar.f16931k = true;
        lVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.j == c10) {
            return this;
        }
        this.j = Character.toLowerCase(c10);
        this.f16963n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int i3 = this.f16973x;
        int i10 = (z2 ? 1 : 0) | (i3 & (-2));
        this.f16973x = i10;
        if (i3 != i10) {
            this.f16963n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int i3 = this.f16973x;
        if ((i3 & 4) == 0) {
            int i10 = (i3 & (-3)) | (z2 ? 2 : 0);
            this.f16973x = i10;
            if (i3 != i10) {
                this.f16963n.p(false);
            }
            return this;
        }
        l lVar = this.f16963n;
        lVar.getClass();
        ArrayList arrayList = lVar.f16927f;
        int size = arrayList.size();
        lVar.w();
        for (int i11 = 0; i11 < size; i11++) {
            n nVar = (n) arrayList.get(i11);
            if (nVar.f16952b == this.f16952b && (nVar.f16973x & 4) != 0 && nVar.isCheckable()) {
                boolean z10 = nVar == this;
                int i12 = nVar.f16973x;
                int i13 = (z10 ? 2 : 0) | (i12 & (-3));
                nVar.f16973x = i13;
                if (i12 != i13) {
                    nVar.f16963n.p(false);
                }
            }
        }
        lVar.v();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.f16973x |= 16;
        } else {
            this.f16973x &= -17;
        }
        this.f16963n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f16962m = 0;
        this.f16961l = drawable;
        this.f16972w = true;
        this.f16963n.p(false);
        return this;
    }

    @Override // H.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f16968s = colorStateList;
        this.f16970u = true;
        this.f16972w = true;
        this.f16963n.p(false);
        return this;
    }

    @Override // H.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f16969t = mode;
        this.f16971v = true;
        this.f16972w = true;
        this.f16963n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f16957g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        if (this.f16958h == c10) {
            return this;
        }
        this.f16958h = c10;
        this.f16963n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f16949B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f16965p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f16958h = c10;
        this.j = Character.toLowerCase(c11);
        this.f16963n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i3) {
        int i10 = i3 & 3;
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException(StubApp.getString2(21046));
        }
        this.f16974y = i3;
        l lVar = this.f16963n;
        lVar.f16931k = true;
        lVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i3) {
        setShowAsAction(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f16955e = charSequence;
        this.f16963n.p(false);
        SubMenuC1257D subMenuC1257D = this.f16964o;
        if (subMenuC1257D != null) {
            subMenuC1257D.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f16956f = charSequence;
        this.f16963n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i3 = this.f16973x;
        int i10 = (z2 ? 0 : 8) | (i3 & (-9));
        this.f16973x = i10;
        if (i3 != i10) {
            l lVar = this.f16963n;
            lVar.f16929h = true;
            lVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f16955e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // H.a, android.view.MenuItem
    public final H.a setContentDescription(CharSequence charSequence) {
        this.f16966q = charSequence;
        this.f16963n.p(false);
        return this;
    }

    @Override // H.a, android.view.MenuItem
    public final H.a setTooltipText(CharSequence charSequence) {
        this.f16967r = charSequence;
        this.f16963n.p(false);
        return this;
    }

    @Override // H.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i3) {
        if (this.j == c10 && this.f16960k == i3) {
            return this;
        }
        this.j = Character.toLowerCase(c10);
        this.f16960k = KeyEvent.normalizeMetaState(i3);
        this.f16963n.p(false);
        return this;
    }

    @Override // H.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i3) {
        if (this.f16958h == c10 && this.f16959i == i3) {
            return this;
        }
        this.f16958h = c10;
        this.f16959i = KeyEvent.normalizeMetaState(i3);
        this.f16963n.p(false);
        return this;
    }

    @Override // H.a, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i3, int i10) {
        this.f16958h = c10;
        this.f16959i = KeyEvent.normalizeMetaState(i3);
        this.j = Character.toLowerCase(c11);
        this.f16960k = KeyEvent.normalizeMetaState(i10);
        this.f16963n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i3) {
        this.f16961l = null;
        this.f16962m = i3;
        this.f16972w = true;
        this.f16963n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i3) {
        setTitle(this.f16963n.f16922a.getString(i3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i3) {
        int i10;
        Context context = this.f16963n.f16922a;
        View inflate = LayoutInflater.from(context).inflate(i3, (ViewGroup) new LinearLayout(context), false);
        this.f16975z = inflate;
        this.f16948A = null;
        if (inflate != null && inflate.getId() == -1 && (i10 = this.f16951a) > 0) {
            inflate.setId(i10);
        }
        l lVar = this.f16963n;
        lVar.f16931k = true;
        lVar.p(true);
        return this;
    }
}
