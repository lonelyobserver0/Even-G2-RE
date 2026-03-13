package i;

import N.I;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* renamed from: i.f, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class DialogInterfaceC1025f extends d.m implements DialogInterface, i {

    /* renamed from: d, reason: collision with root package name */
    public v f14599d;

    /* renamed from: e, reason: collision with root package name */
    public final w f14600e;

    /* renamed from: f, reason: collision with root package name */
    public final C1024e f14601f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DialogInterfaceC1025f(android.view.ContextThemeWrapper r5, int r6) {
        /*
            r4 = this;
            int r6 = g(r5, r6)
            r0 = 1
            r1 = 2130903302(0x7f030106, float:1.7413418E38)
            if (r6 != 0) goto L19
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L1a
        L19:
            r2 = r6
        L1a:
            r4.<init>(r5, r2)
            i.w r2 = new i.w
            r2.<init>(r4)
            r4.f14600e = r2
            i.l r2 = r4.d()
            if (r6 != 0) goto L38
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L38:
            r5 = r2
            i.v r5 = (i.v) r5
            r5.f14674n0 = r6
            r2.d()
            i.e r5 = new i.e
            android.content.Context r6 = r4.getContext()
            android.view.Window r0 = r4.getWindow()
            r5.<init>(r6, r4, r0)
            r4.f14601f = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.DialogInterfaceC1025f.<init>(android.view.ContextThemeWrapper, int):void");
    }

    public static int g(Context context, int i3) {
        if (((i3 >>> 24) & 255) >= 1) {
            return i3;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130903083, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // d.m, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        v vVar = (v) d();
        vVar.w();
        ((ViewGroup) vVar.f14652D.findViewById(R.id.content)).addView(view, layoutParams);
        vVar.f14673n.a(vVar.f14671m.getCallback());
    }

    public final l d() {
        if (this.f14599d == null) {
            J1.A a3 = l.f14609a;
            this.f14599d = new v(getContext(), getWindow(), this, this);
        }
        return this.f14599d;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        d().e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        w wVar = this.f14600e;
        if (wVar == null) {
            return false;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e(Bundle bundle) {
        d().a();
        super.onCreate(bundle);
        d().d();
    }

    @Override // android.app.Dialog
    public final View findViewById(int i3) {
        v vVar = (v) d();
        vVar.w();
        return vVar.f14671m.findViewById(i3);
    }

    public final void h(CharSequence charSequence) {
        super.setTitle(charSequence);
        d().l(charSequence);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        d().b();
    }

    @Override // d.m, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i3;
        ListAdapter listAdapter;
        View findViewById;
        e(bundle);
        C1024e c1024e = this.f14601f;
        c1024e.f14575b.setContentView(c1024e.f14596x);
        Window window = c1024e.f14576c;
        View findViewById2 = window.findViewById(2131231002);
        View findViewById3 = findViewById2.findViewById(2131231139);
        View findViewById4 = findViewById2.findViewById(2131230830);
        View findViewById5 = findViewById2.findViewById(2131230808);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(2131230838);
        window.setFlags(PKIFailureInfo.unsupportedVersion, PKIFailureInfo.unsupportedVersion);
        viewGroup.setVisibility(8);
        View findViewById6 = viewGroup.findViewById(2131231139);
        View findViewById7 = viewGroup.findViewById(2131230830);
        View findViewById8 = viewGroup.findViewById(2131230808);
        ViewGroup a3 = C1024e.a(findViewById6, findViewById3);
        ViewGroup a9 = C1024e.a(findViewById7, findViewById4);
        ViewGroup a10 = C1024e.a(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(2131231040);
        c1024e.f14588p = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c1024e.f14588p.setNestedScrollingEnabled(false);
        TextView textView = (TextView) a9.findViewById(R.id.message);
        c1024e.f14592t = textView;
        if (textView != null) {
            CharSequence charSequence = c1024e.f14578e;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                c1024e.f14588p.removeView(c1024e.f14592t);
                if (c1024e.f14579f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) c1024e.f14588p.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(c1024e.f14588p);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(c1024e.f14579f, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    a9.setVisibility(8);
                }
            }
        }
        Button button = (Button) a10.findViewById(R.id.button1);
        c1024e.f14580g = button;
        K4.c cVar = c1024e.f14573D;
        button.setOnClickListener(cVar);
        if (TextUtils.isEmpty(c1024e.f14581h)) {
            c1024e.f14580g.setVisibility(8);
            i3 = 0;
        } else {
            c1024e.f14580g.setText(c1024e.f14581h);
            c1024e.f14580g.setVisibility(0);
            i3 = 1;
        }
        Button button2 = (Button) a10.findViewById(R.id.button2);
        c1024e.j = button2;
        button2.setOnClickListener(cVar);
        if (TextUtils.isEmpty(c1024e.f14583k)) {
            c1024e.j.setVisibility(8);
        } else {
            c1024e.j.setText(c1024e.f14583k);
            c1024e.j.setVisibility(0);
            i3 |= 2;
        }
        Button button3 = (Button) a10.findViewById(R.id.button3);
        c1024e.f14585m = button3;
        button3.setOnClickListener(cVar);
        if (TextUtils.isEmpty(c1024e.f14586n)) {
            c1024e.f14585m.setVisibility(8);
        } else {
            c1024e.f14585m.setText(c1024e.f14586n);
            c1024e.f14585m.setVisibility(0);
            i3 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        c1024e.f14574a.getTheme().resolveAttribute(2130903081, typedValue, true);
        if (typedValue.data != 0) {
            if (i3 == 1) {
                Button button4 = c1024e.f14580g;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i3 == 2) {
                Button button5 = c1024e.j;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i3 == 4) {
                Button button6 = c1024e.f14585m;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i3 == 0) {
            a10.setVisibility(8);
        }
        if (c1024e.f14593u != null) {
            a3.addView(c1024e.f14593u, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(2131231135).setVisibility(8);
        } else {
            c1024e.f14590r = (ImageView) window.findViewById(R.id.icon);
            if (TextUtils.isEmpty(c1024e.f14577d) || !c1024e.f14571B) {
                window.findViewById(2131231135).setVisibility(8);
                c1024e.f14590r.setVisibility(8);
                a3.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(2131230787);
                c1024e.f14591s = textView2;
                textView2.setText(c1024e.f14577d);
                Drawable drawable = c1024e.f14589q;
                if (drawable != null) {
                    c1024e.f14590r.setImageDrawable(drawable);
                } else {
                    c1024e.f14591s.setPadding(c1024e.f14590r.getPaddingLeft(), c1024e.f14590r.getPaddingTop(), c1024e.f14590r.getPaddingRight(), c1024e.f14590r.getPaddingBottom());
                    c1024e.f14590r.setVisibility(8);
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i10 = (a3 == null || a3.getVisibility() == 8) ? 0 : 1;
        boolean z10 = a10.getVisibility() != 8;
        if (!z10 && (findViewById = a9.findViewById(2131231119)) != null) {
            findViewById.setVisibility(0);
        }
        if (i10 != 0) {
            NestedScrollView nestedScrollView2 = c1024e.f14588p;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = (c1024e.f14578e == null && c1024e.f14579f == null) ? null : a3.findViewById(2131231134);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = a9.findViewById(2131231120);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c1024e.f14579f;
        if (alertController$RecycleListView != null && (!z10 || i10 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i10 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f9387a, alertController$RecycleListView.getPaddingRight(), z10 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f9388b);
        }
        if (!z2) {
            View view = c1024e.f14579f;
            if (view == null) {
                view = c1024e.f14588p;
            }
            if (view != null) {
                int i11 = (z10 ? 2 : 0) | i10;
                View findViewById11 = window.findViewById(2131231039);
                View findViewById12 = window.findViewById(2131231038);
                WeakHashMap weakHashMap = I.f4732a;
                N.C.b(view, i11, 3);
                if (findViewById11 != null) {
                    a9.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    a9.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c1024e.f14579f;
        if (alertController$RecycleListView2 == null || (listAdapter = c1024e.f14594v) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i12 = c1024e.f14595w;
        if (i12 > -1) {
            alertController$RecycleListView2.setItemChecked(i12, true);
            alertController$RecycleListView2.setSelection(i12);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f14601f.f14588p;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyDown(i3, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i3, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f14601f.f14588p;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyUp(i3, keyEvent);
        }
        return true;
    }

    @Override // d.m, android.app.Dialog
    public final void onStop() {
        super.onStop();
        v vVar = (v) d();
        vVar.A();
        Oc.a aVar = vVar.f14678q;
        if (aVar != null) {
            aVar.P(false);
        }
    }

    @Override // d.m, android.app.Dialog
    public final void setContentView(int i3) {
        c();
        d().i(i3);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i3) {
        super.setTitle(i3);
        d().l(getContext().getString(i3));
    }

    @Override // d.m, android.app.Dialog
    public final void setContentView(View view) {
        c();
        d().j(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        h(charSequence);
        C1024e c1024e = this.f14601f;
        c1024e.f14577d = charSequence;
        TextView textView = c1024e.f14591s;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // d.m, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        d().k(view, layoutParams);
    }
}
