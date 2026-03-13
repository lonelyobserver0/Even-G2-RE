package K4;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3645a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3646b;

    public /* synthetic */ a(Object obj, int i3) {
        this.f3645a = i3;
        this.f3646b = obj;
    }

    private final void a(Editable editable) {
    }

    private final void b(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void g(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void h(int i3, int i10, int i11, CharSequence charSequence) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.f3645a) {
            case 0:
                boolean z2 = editable.length() > 0;
                f fVar = (f) this.f3646b;
                if (!z2) {
                    fVar.f3657f.cancel();
                    fVar.f3658g.start();
                    break;
                } else if (!fVar.f3682a.g()) {
                    fVar.f3658g.cancel();
                    fVar.f3657f.start();
                    break;
                }
                break;
            case 1:
                o oVar = (o) this.f3646b;
                AutoCompleteTextView c10 = o.c(oVar, oVar.f3682a.getEditText());
                c10.post(new Q4.b(this, c10, 3, false));
                break;
            case 2:
                break;
            default:
                TextInputLayout textInputLayout = (TextInputLayout) this.f3646b;
                textInputLayout.r(!textInputLayout.f11997K0, false);
                if (textInputLayout.f12008f) {
                    textInputLayout.m(editable.length());
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        switch (this.f3645a) {
            case 2:
                ((t) this.f3646b).f3684c.setChecked(!t.c(r1));
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12 = this.f3645a;
    }
}
