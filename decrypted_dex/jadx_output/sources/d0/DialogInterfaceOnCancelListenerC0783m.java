package d0;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: d0.m, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class DialogInterfaceOnCancelListenerC0783m implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0786p f13315a;

    public DialogInterfaceOnCancelListenerC0783m(DialogInterfaceOnCancelListenerC0786p dialogInterfaceOnCancelListenerC0786p) {
        this.f13315a = dialogInterfaceOnCancelListenerC0786p;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0786p dialogInterfaceOnCancelListenerC0786p = this.f13315a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0786p.f13330x0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0786p.onCancel(dialog);
        }
    }
}
