package K4;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import com.google.android.gms.internal.measurement.D1;
import com.google.android.material.textfield.TextInputLayout;
import java.util.LinkedHashSet;
import s4.AbstractC1598a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f extends p {

    /* renamed from: d, reason: collision with root package name */
    public final a f3655d;

    /* renamed from: e, reason: collision with root package name */
    public final b f3656e;

    /* renamed from: f, reason: collision with root package name */
    public AnimatorSet f3657f;

    /* renamed from: g, reason: collision with root package name */
    public ValueAnimator f3658g;

    public f(TextInputLayout textInputLayout) {
        super(textInputLayout);
        int i3 = 0;
        this.f3655d = new a(this, i3);
        this.f3656e = new b(this, i3);
    }

    @Override // K4.p
    public final void a() {
        int i3 = 1;
        Drawable m4 = D1.m(this.f3683b, 2131165576);
        TextInputLayout textInputLayout = this.f3682a;
        textInputLayout.setEndIconDrawable(m4);
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(2131755052));
        int i10 = 0;
        textInputLayout.setEndIconOnClickListener(new c(this, i10));
        LinkedHashSet linkedHashSet = textInputLayout.h0;
        b bVar = this.f3656e;
        linkedHashSet.add(bVar);
        if (textInputLayout.f12005c != null) {
            bVar.a(textInputLayout);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(AbstractC1598a.f20749d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new e(this, 1));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        LinearInterpolator linearInterpolator = AbstractC1598a.f20746a;
        ofFloat2.setInterpolator(linearInterpolator);
        ofFloat2.setDuration(100L);
        ofFloat2.addUpdateListener(new e(this, 0));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f3657f = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f3657f.addListener(new d(this, i10));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(linearInterpolator);
        ofFloat3.setDuration(100L);
        ofFloat3.addUpdateListener(new e(this, 0));
        this.f3658g = ofFloat3;
        ofFloat3.addListener(new d(this, i3));
    }
}
