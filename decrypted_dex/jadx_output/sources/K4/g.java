package K4;

import android.graphics.drawable.Drawable;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g extends p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3659d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(TextInputLayout textInputLayout, int i3) {
        super(textInputLayout);
        this.f3659d = i3;
    }

    @Override // K4.p
    public final void a() {
        switch (this.f3659d) {
            case 0:
                TextInputLayout textInputLayout = this.f3682a;
                textInputLayout.setEndIconOnClickListener(null);
                textInputLayout.setEndIconOnLongClickListener(null);
                break;
            default:
                TextInputLayout textInputLayout2 = this.f3682a;
                textInputLayout2.setEndIconOnClickListener(null);
                textInputLayout2.setEndIconDrawable((Drawable) null);
                textInputLayout2.setEndIconContentDescription((CharSequence) null);
                break;
        }
    }
}
