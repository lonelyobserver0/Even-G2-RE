package K4;

import android.graphics.drawable.Drawable;
import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;
import com.google.android.gms.internal.measurement.D1;
import com.google.android.material.textfield.TextInputLayout;
import java.util.LinkedHashSet;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class t extends p {

    /* renamed from: d, reason: collision with root package name */
    public final a f3710d;

    /* renamed from: e, reason: collision with root package name */
    public final b f3711e;

    /* renamed from: f, reason: collision with root package name */
    public final s f3712f;

    public t(TextInputLayout textInputLayout) {
        super(textInputLayout);
        int i3 = 2;
        this.f3710d = new a(this, i3);
        this.f3711e = new b(this, i3);
        this.f3712f = new s();
    }

    public static boolean c(t tVar) {
        EditText editText = tVar.f3682a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    @Override // K4.p
    public final void a() {
        Drawable m4 = D1.m(this.f3683b, 2131165311);
        TextInputLayout textInputLayout = this.f3682a;
        textInputLayout.setEndIconDrawable(m4);
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(2131755221));
        textInputLayout.setEndIconOnClickListener(new c(this, 2));
        LinkedHashSet linkedHashSet = textInputLayout.h0;
        b bVar = this.f3711e;
        linkedHashSet.add(bVar);
        if (textInputLayout.f12005c != null) {
            bVar.a(textInputLayout);
        }
        textInputLayout.f12018n0.add(this.f3712f);
    }
}
