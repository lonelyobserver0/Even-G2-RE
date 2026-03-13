package d0;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: d0.n, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class DialogInterfaceOnDismissListenerC0784n implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0786p f13316a;

    public DialogInterfaceOnDismissListenerC0784n(DialogInterfaceOnCancelListenerC0786p dialogInterfaceOnCancelListenerC0786p) {
        this.f13316a = dialogInterfaceOnCancelListenerC0786p;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0786p dialogInterfaceOnCancelListenerC0786p = this.f13316a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0786p.f13330x0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0786p.onDismiss(dialog);
        }
    }
}
