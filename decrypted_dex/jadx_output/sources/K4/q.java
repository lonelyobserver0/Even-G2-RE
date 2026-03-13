package K4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class q extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3685a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f3686b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3687c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f3688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f3689e;

    public q(r rVar, int i3, TextView textView, int i10, TextView textView2) {
        this.f3689e = rVar;
        this.f3685a = i3;
        this.f3686b = textView;
        this.f3687c = i10;
        this.f3688d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AppCompatTextView appCompatTextView;
        int i3 = this.f3685a;
        r rVar = this.f3689e;
        rVar.f3698i = i3;
        rVar.f3696g = null;
        TextView textView = this.f3686b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f3687c == 1 && (appCompatTextView = rVar.f3701m) != null) {
                appCompatTextView.setText((CharSequence) null);
            }
            TextView textView2 = this.f3688d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                textView2.setAlpha(1.0f);
            }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f3688d;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }
}
