package K4;

import android.os.Message;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import androidx.appcompat.widget.Toolbar;
import i.C1024e;
import l.AbstractC1130a;
import n.U0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3649a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3650b;

    public /* synthetic */ c(Object obj, int i3) {
        this.f3649a = i3;
        this.f3650b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        switch (this.f3649a) {
            case 0:
                ((f) this.f3650b).f3682a.getEditText().setText((CharSequence) null);
                return;
            case 1:
                o oVar = (o) this.f3650b;
                o.d(oVar, (AutoCompleteTextView) oVar.f3682a.getEditText());
                return;
            case 2:
                t tVar = (t) this.f3650b;
                EditText editText = tVar.f3682a.getEditText();
                if (editText == null) {
                    return;
                }
                int selectionEnd = editText.getSelectionEnd();
                if (t.c(tVar)) {
                    editText.setTransformationMethod(null);
                } else {
                    editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    editText.setSelection(selectionEnd);
                    return;
                }
                return;
            case 3:
                com.google.android.material.datepicker.i iVar = (com.google.android.material.datepicker.i) this.f3650b;
                int i3 = iVar.f11916s0;
                if (i3 == 2) {
                    iVar.N(1);
                    return;
                } else {
                    if (i3 == 1) {
                        iVar.N(2);
                        return;
                    }
                    return;
                }
            case 4:
                com.google.android.material.datepicker.j jVar = (com.google.android.material.datepicker.j) this.f3650b;
                jVar.f11931L0.toggle();
                jVar.Q(jVar.f11931L0);
                jVar.P();
                throw null;
            case 5:
                C1024e c1024e = (C1024e) this.f3650b;
                Message obtain = (view != c1024e.f14580g || (message3 = c1024e.f14582i) == null) ? (view != c1024e.j || (message2 = c1024e.f14584l) == null) ? (view != c1024e.f14585m || (message = c1024e.f14587o) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
                if (obtain != null) {
                    obtain.sendToTarget();
                }
                c1024e.f14572C.obtainMessage(1, c1024e.f14575b).sendToTarget();
                return;
            case 6:
                ((AbstractC1130a) this.f3650b).a();
                return;
            default:
                U0 u02 = ((Toolbar) this.f3650b).h0;
                m.n nVar = u02 == null ? null : u02.f17467b;
                if (nVar != null) {
                    nVar.collapseActionView();
                    return;
                }
                return;
        }
    }
}
