package i;

import N.I;
import a0.C0379a;
import aa.C0398e;
import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import f4.C0879c;
import f4.C0882f;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n.C1345k;
import n.U0;
import n.Z0;

/* renamed from: i.C, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1019C extends Oc.a {

    /* renamed from: b, reason: collision with root package name */
    public final Z0 f14504b;

    /* renamed from: c, reason: collision with root package name */
    public final r f14505c;

    /* renamed from: d, reason: collision with root package name */
    public final C0879c f14506d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14507e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14508f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f14509g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f14510h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final RunnableC1018B f14511i = new RunnableC1018B(this, 0);

    public C1019C(Toolbar toolbar, CharSequence charSequence, r rVar) {
        C0882f c0882f = new C0882f(this, 4);
        Z0 z02 = new Z0(toolbar, false);
        this.f14504b = z02;
        rVar.getClass();
        this.f14505c = rVar;
        z02.f17497k = rVar;
        toolbar.setOnMenuItemClickListener(c0882f);
        if (!z02.f17494g) {
            z02.f17495h = charSequence;
            if ((z02.f17489b & 8) != 0) {
                Toolbar toolbar2 = z02.f17488a;
                toolbar2.setTitle(charSequence);
                if (z02.f17494g) {
                    I.j(toolbar2.getRootView(), charSequence);
                }
            }
        }
        this.f14506d = new C0879c(this);
    }

    @Override // Oc.a
    public final void D() {
    }

    @Override // Oc.a
    public final void E() {
        this.f14504b.f17488a.removeCallbacks(this.f14511i);
    }

    @Override // Oc.a
    public final boolean F(int i3, KeyEvent keyEvent) {
        Menu V10 = V();
        if (V10 == null) {
            return false;
        }
        V10.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return V10.performShortcut(i3, keyEvent, 0);
    }

    @Override // Oc.a
    public final boolean G(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            H();
        }
        return true;
    }

    @Override // Oc.a
    public final boolean H() {
        return this.f14504b.f17488a.u();
    }

    @Override // Oc.a
    public final void N(boolean z2) {
    }

    @Override // Oc.a
    public final void O() {
        Z0 z02 = this.f14504b;
        z02.a(z02.f17489b & (-9));
    }

    @Override // Oc.a
    public final void P(boolean z2) {
    }

    @Override // Oc.a
    public final void Q(CharSequence charSequence) {
        Z0 z02 = this.f14504b;
        if (z02.f17494g) {
            return;
        }
        z02.f17495h = charSequence;
        if ((z02.f17489b & 8) != 0) {
            Toolbar toolbar = z02.f17488a;
            toolbar.setTitle(charSequence);
            if (z02.f17494g) {
                I.j(toolbar.getRootView(), charSequence);
            }
        }
    }

    public final Menu V() {
        boolean z2 = this.f14508f;
        Z0 z02 = this.f14504b;
        if (!z2) {
            C0398e c0398e = new C0398e(this);
            C0379a c0379a = new C0379a(this, 10);
            Toolbar toolbar = z02.f17488a;
            toolbar.f9585k0 = c0398e;
            toolbar.f9587l0 = c0379a;
            ActionMenuView actionMenuView = toolbar.f9576a;
            if (actionMenuView != null) {
                actionMenuView.f9483x = c0398e;
                actionMenuView.f9484y = c0379a;
            }
            this.f14508f = true;
        }
        return z02.f17488a.getMenu();
    }

    @Override // Oc.a
    public final boolean j() {
        C1345k c1345k;
        ActionMenuView actionMenuView = this.f14504b.f17488a.f9576a;
        return (actionMenuView == null || (c1345k = actionMenuView.f9482w) == null || !c1345k.g()) ? false : true;
    }

    @Override // Oc.a
    public final boolean k() {
        m.n nVar;
        U0 u02 = this.f14504b.f17488a.h0;
        if (u02 == null || (nVar = u02.f17467b) == null) {
            return false;
        }
        if (u02 == null) {
            nVar = null;
        }
        if (nVar == null) {
            return true;
        }
        nVar.collapseActionView();
        return true;
    }

    @Override // Oc.a
    public final void n(boolean z2) {
        if (z2 == this.f14509g) {
            return;
        }
        this.f14509g = z2;
        ArrayList arrayList = this.f14510h;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // Oc.a
    public final int o() {
        return this.f14504b.f17489b;
    }

    @Override // Oc.a
    public final Context s() {
        return this.f14504b.f17488a.getContext();
    }

    @Override // Oc.a
    public final boolean v() {
        Z0 z02 = this.f14504b;
        Toolbar toolbar = z02.f17488a;
        RunnableC1018B runnableC1018B = this.f14511i;
        toolbar.removeCallbacks(runnableC1018B);
        Toolbar toolbar2 = z02.f17488a;
        WeakHashMap weakHashMap = I.f4732a;
        toolbar2.postOnAnimation(runnableC1018B);
        return true;
    }
}
