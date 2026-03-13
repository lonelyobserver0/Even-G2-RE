package K4;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f3682a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f3683b;

    /* renamed from: c, reason: collision with root package name */
    public final CheckableImageButton f3684c;

    public p(TextInputLayout textInputLayout) {
        this.f3682a = textInputLayout;
        this.f3683b = textInputLayout.getContext();
        this.f3684c = textInputLayout.getEndIconView();
    }

    public abstract void a();

    public boolean b(int i3) {
        return true;
    }
}
