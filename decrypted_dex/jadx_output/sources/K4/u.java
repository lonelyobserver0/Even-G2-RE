package K4;

import com.google.android.material.textfield.TextInputLayout;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3713a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f3714b;

    public /* synthetic */ u(TextInputLayout textInputLayout, int i3) {
        this.f3713a = i3;
        this.f3714b = textInputLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3713a) {
            case 0:
                TextInputLayout textInputLayout = this.f3714b;
                textInputLayout.f12016m0.performClick();
                textInputLayout.f12016m0.jumpDrawablesToCurrentState();
                break;
            default:
                this.f3714b.f12005c.requestLayout();
                break;
        }
    }
}
