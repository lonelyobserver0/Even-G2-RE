package a0;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

/* renamed from: a0.f, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0384f implements KeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final KeyListener f9243a;

    /* renamed from: b, reason: collision with root package name */
    public final C2.i f9244b;

    public C0384f(KeyListener keyListener) {
        C2.i iVar = new C2.i();
        this.f9243a = keyListener;
        this.f9244b = iVar;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i3) {
        this.f9243a.clearMetaKeyState(view, editable, i3);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f9243a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i3, KeyEvent keyEvent) {
        boolean z2;
        this.f9244b.getClass();
        if (i3 != 67 ? i3 != 112 ? false : Q2.g.z(editable, keyEvent, true) : Q2.g.z(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z2 = true;
        } else {
            z2 = false;
        }
        return z2 || this.f9243a.onKeyDown(view, editable, i3, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f9243a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i3, KeyEvent keyEvent) {
        return this.f9243a.onKeyUp(view, editable, i3, keyEvent);
    }
}
