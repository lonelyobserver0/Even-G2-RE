package K4;

import N.I;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import s4.AbstractC1598a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3690a;

    /* renamed from: b, reason: collision with root package name */
    public final TextInputLayout f3691b;

    /* renamed from: c, reason: collision with root package name */
    public LinearLayout f3692c;

    /* renamed from: d, reason: collision with root package name */
    public int f3693d;

    /* renamed from: e, reason: collision with root package name */
    public FrameLayout f3694e;

    /* renamed from: f, reason: collision with root package name */
    public int f3695f;

    /* renamed from: g, reason: collision with root package name */
    public AnimatorSet f3696g;

    /* renamed from: h, reason: collision with root package name */
    public final float f3697h;

    /* renamed from: i, reason: collision with root package name */
    public int f3698i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f3699k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3700l;

    /* renamed from: m, reason: collision with root package name */
    public AppCompatTextView f3701m;

    /* renamed from: n, reason: collision with root package name */
    public int f3702n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f3703o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f3704p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3705q;

    /* renamed from: r, reason: collision with root package name */
    public AppCompatTextView f3706r;

    /* renamed from: s, reason: collision with root package name */
    public int f3707s;

    /* renamed from: t, reason: collision with root package name */
    public ColorStateList f3708t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f3709u;

    public r(TextInputLayout textInputLayout) {
        this.f3690a = textInputLayout.getContext();
        this.f3691b = textInputLayout;
        this.f3697h = r0.getResources().getDimensionPixelSize(2131099792);
    }

    public final void a(AppCompatTextView appCompatTextView, int i3) {
        if (this.f3692c == null && this.f3694e == null) {
            Context context = this.f3690a;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f3692c = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f3692c;
            TextInputLayout textInputLayout = this.f3691b;
            textInputLayout.addView(linearLayout2, -1, -2);
            FrameLayout frameLayout = new FrameLayout(context);
            this.f3694e = frameLayout;
            this.f3692c.addView(frameLayout, -1, new FrameLayout.LayoutParams(-2, -2));
            this.f3692c.addView(new Space(context), new LinearLayout.LayoutParams(0, 0, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i3 == 0 || i3 == 1) {
            this.f3694e.setVisibility(0);
            this.f3694e.addView(appCompatTextView);
            this.f3695f++;
        } else {
            this.f3692c.addView(appCompatTextView, i3);
        }
        this.f3692c.setVisibility(0);
        this.f3693d++;
    }

    public final void b() {
        if (this.f3692c != null) {
            TextInputLayout textInputLayout = this.f3691b;
            if (textInputLayout.getEditText() != null) {
                LinearLayout linearLayout = this.f3692c;
                EditText editText = textInputLayout.getEditText();
                WeakHashMap weakHashMap = I.f4732a;
                linearLayout.setPaddingRelative(editText.getPaddingStart(), 0, textInputLayout.getEditText().getPaddingEnd(), 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f3696g;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z2, AppCompatTextView appCompatTextView, int i3, int i10, int i11) {
        if (appCompatTextView == null || !z2) {
            return;
        }
        if (i3 == i11 || i3 == i10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.ALPHA, i11 == i3 ? 1.0f : 0.0f);
            ofFloat.setDuration(167L);
            ofFloat.setInterpolator(AbstractC1598a.f20746a);
            arrayList.add(ofFloat);
            if (i11 == i3) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.TRANSLATION_Y, -this.f3697h, 0.0f);
                ofFloat2.setDuration(217L);
                ofFloat2.setInterpolator(AbstractC1598a.f20749d);
                arrayList.add(ofFloat2);
            }
        }
    }

    public final boolean e() {
        return (this.j != 1 || this.f3701m == null || TextUtils.isEmpty(this.f3699k)) ? false : true;
    }

    public final TextView f(int i3) {
        if (i3 == 1) {
            return this.f3701m;
        }
        if (i3 != 2) {
            return null;
        }
        return this.f3706r;
    }

    public final void g() {
        this.f3699k = null;
        c();
        if (this.f3698i == 1) {
            if (!this.f3705q || TextUtils.isEmpty(this.f3704p)) {
                this.j = 0;
            } else {
                this.j = 2;
            }
        }
        j(this.f3698i, this.j, i(this.f3701m, null));
    }

    public final void h(AppCompatTextView appCompatTextView, int i3) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f3692c;
        if (linearLayout == null) {
            return;
        }
        if (!(i3 == 0 || i3 == 1) || (frameLayout = this.f3694e) == null) {
            linearLayout.removeView(appCompatTextView);
        } else {
            int i10 = this.f3695f - 1;
            this.f3695f = i10;
            if (i10 == 0) {
                frameLayout.setVisibility(8);
            }
            this.f3694e.removeView(appCompatTextView);
        }
        int i11 = this.f3693d - 1;
        this.f3693d = i11;
        LinearLayout linearLayout2 = this.f3692c;
        if (i11 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean i(AppCompatTextView appCompatTextView, CharSequence charSequence) {
        WeakHashMap weakHashMap = I.f4732a;
        TextInputLayout textInputLayout = this.f3691b;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.j == this.f3698i && appCompatTextView != null && TextUtils.equals(appCompatTextView.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public final void j(int i3, int i10, boolean z2) {
        TextView f10;
        TextView f11;
        r rVar = this;
        if (z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            rVar.f3696g = animatorSet;
            ArrayList arrayList = new ArrayList();
            rVar.d(arrayList, rVar.f3705q, rVar.f3706r, 2, i3, i10);
            rVar.d(arrayList, rVar.f3700l, rVar.f3701m, 1, i3, i10);
            int size = arrayList.size();
            long j = 0;
            for (int i11 = 0; i11 < size; i11++) {
                Animator animator = (Animator) arrayList.get(i11);
                j = Math.max(j, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
            ofInt.setDuration(j);
            arrayList.add(0, ofInt);
            animatorSet.playTogether(arrayList);
            q qVar = new q(this, i10, f(i3), i3, rVar.f(i10));
            rVar = this;
            animatorSet.addListener(qVar);
            animatorSet.start();
        } else if (i3 != i10) {
            if (i10 != 0 && (f11 = rVar.f(i10)) != null) {
                f11.setVisibility(0);
                f11.setAlpha(1.0f);
            }
            if (i3 != 0 && (f10 = f(i3)) != null) {
                f10.setVisibility(4);
                if (i3 == 1) {
                    f10.setText((CharSequence) null);
                }
            }
            rVar.f3698i = i10;
        }
        TextInputLayout textInputLayout = rVar.f3691b;
        textInputLayout.o();
        textInputLayout.r(z2, false);
        textInputLayout.s();
    }
}
