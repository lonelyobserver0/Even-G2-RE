package m;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import i.DialogInterfaceC1025f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class m implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, w {

    /* renamed from: a, reason: collision with root package name */
    public SubMenuC1257D f16945a;

    /* renamed from: b, reason: collision with root package name */
    public DialogInterfaceC1025f f16946b;

    /* renamed from: c, reason: collision with root package name */
    public h f16947c;

    @Override // m.w
    public final void b(l lVar, boolean z2) {
        DialogInterfaceC1025f dialogInterfaceC1025f;
        if ((z2 || lVar == this.f16945a) && (dialogInterfaceC1025f = this.f16946b) != null) {
            dialogInterfaceC1025f.dismiss();
        }
    }

    @Override // m.w
    public final boolean m(l lVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i3) {
        h hVar = this.f16947c;
        if (hVar.f16914f == null) {
            hVar.f16914f = new g(hVar);
        }
        this.f16945a.q(hVar.f16914f.getItem(i3), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f16947c.b(this.f16945a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i3, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC1257D subMenuC1257D = this.f16945a;
        if (i3 == 82 || i3 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f16946b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f16946b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC1257D.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC1257D.performShortcut(i3, keyEvent, 0);
    }
}
