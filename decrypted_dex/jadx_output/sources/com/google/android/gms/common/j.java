package com.google.android.gms.common;

import S3.D;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import d0.DialogInterfaceOnCancelListenerC0786p;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class j extends DialogInterfaceOnCancelListenerC0786p {

    /* renamed from: C0, reason: collision with root package name */
    public Dialog f11193C0;

    /* renamed from: D0, reason: collision with root package name */
    public DialogInterface.OnCancelListener f11194D0;

    /* renamed from: E0, reason: collision with root package name */
    public AlertDialog f11195E0;

    @Override // d0.DialogInterfaceOnCancelListenerC0786p
    public final Dialog M() {
        Dialog dialog = this.f11193C0;
        if (dialog != null) {
            return dialog;
        }
        this.f13326t0 = false;
        if (this.f11195E0 == null) {
            Context m4 = m();
            D.h(m4);
            this.f11195E0 = new AlertDialog.Builder(m4).create();
        }
        return this.f11195E0;
    }

    @Override // d0.DialogInterfaceOnCancelListenerC0786p, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f11194D0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
