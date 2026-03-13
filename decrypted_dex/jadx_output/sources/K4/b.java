package K4;

import N.I;
import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3647a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f3648b;

    public /* synthetic */ b(p pVar, int i3) {
        this.f3647a = i3;
        this.f3648b = pVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        p pVar = this.f3648b;
        switch (this.f3647a) {
            case 0:
                EditText editText = textInputLayout.getEditText();
                textInputLayout.setEndIconVisible(editText.getText().length() > 0);
                textInputLayout.setEndIconCheckable(false);
                f fVar = (f) pVar;
                editText.removeTextChangedListener(fVar.f3655d);
                editText.addTextChangedListener(fVar.f3655d);
                break;
            case 1:
                o oVar = (o) pVar;
                AutoCompleteTextView c10 = o.c(oVar, textInputLayout.getEditText());
                int boxBackgroundMode = oVar.f3682a.getBoxBackgroundMode();
                if (boxBackgroundMode == 2) {
                    c10.setDropDownBackgroundDrawable(oVar.f3678k);
                } else if (boxBackgroundMode == 1) {
                    c10.setDropDownBackgroundDrawable(oVar.j);
                }
                if (c10.getKeyListener() == null) {
                    TextInputLayout textInputLayout2 = oVar.f3682a;
                    int boxBackgroundMode2 = textInputLayout2.getBoxBackgroundMode();
                    I4.g boxBackground = textInputLayout2.getBoxBackground();
                    int m4 = Ec.l.m(c10, 2130903233);
                    int[][] iArr = {new int[]{R.attr.state_pressed}, new int[0]};
                    if (boxBackgroundMode2 == 2) {
                        int m10 = Ec.l.m(c10, 2130903249);
                        I4.g gVar = new I4.g(boxBackground.f3151a.f3135a);
                        int q10 = Ec.l.q(0.1f, m4, m10);
                        gVar.h(new ColorStateList(iArr, new int[]{q10, 0}));
                        gVar.setTint(m10);
                        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{q10, m10});
                        I4.g gVar2 = new I4.g(boxBackground.f3151a.f3135a);
                        gVar2.setTint(-1);
                        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar, gVar2), boxBackground});
                        WeakHashMap weakHashMap = I.f4732a;
                        c10.setBackground(layerDrawable);
                    } else if (boxBackgroundMode2 == 1) {
                        int boxBackgroundColor = textInputLayout2.getBoxBackgroundColor();
                        RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, new int[]{Ec.l.q(0.1f, m4, boxBackgroundColor), boxBackgroundColor}), boxBackground, boxBackground);
                        WeakHashMap weakHashMap2 = I.f4732a;
                        c10.setBackground(rippleDrawable);
                    }
                }
                c10.setOnTouchListener(new j(oVar, c10));
                c10.setOnFocusChangeListener(new k(oVar));
                c10.setOnDismissListener(new l(oVar));
                c10.setThreshold(0);
                a aVar = oVar.f3672d;
                c10.removeTextChangedListener(aVar);
                c10.addTextChangedListener(aVar);
                textInputLayout.setErrorIconDrawable((Drawable) null);
                textInputLayout.setTextInputAccessibilityDelegate(oVar.f3673e);
                textInputLayout.setEndIconVisible(true);
                break;
            default:
                EditText editText2 = textInputLayout.getEditText();
                textInputLayout.setEndIconVisible(true);
                t tVar = (t) pVar;
                tVar.f3684c.setChecked(!t.c(tVar));
                a aVar2 = tVar.f3710d;
                editText2.removeTextChangedListener(aVar2);
                editText2.addTextChangedListener(aVar2);
                break;
        }
    }
}
