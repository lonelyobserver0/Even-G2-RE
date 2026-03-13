package com.google.android.gms.common;

import S3.D;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class c extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    public Dialog f11179a;

    /* renamed from: b, reason: collision with root package name */
    public DialogInterface.OnCancelListener f11180b;

    /* renamed from: c, reason: collision with root package name */
    public AlertDialog f11181c;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f11180b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f11179a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f11181c == null) {
            Activity activity = getActivity();
            D.h(activity);
            this.f11181c = new AlertDialog.Builder(activity).create();
        }
        return this.f11181c;
    }
}
