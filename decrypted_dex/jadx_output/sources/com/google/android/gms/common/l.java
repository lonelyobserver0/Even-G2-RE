package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.IntentSender;
import f.AbstractC0863c;
import f.C0867g;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class l implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f11199a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11200b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0863c f11201c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ GoogleApiAvailability f11202d;

    public l(GoogleApiAvailability googleApiAvailability, Activity activity, int i3, AbstractC0863c abstractC0863c) {
        this.f11202d = googleApiAvailability;
        this.f11199a = activity;
        this.f11200b = i3;
        this.f11201c = abstractC0863c;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i3) {
        dialogInterface.dismiss();
        PendingIntent errorResolutionPendingIntent = this.f11202d.getErrorResolutionPendingIntent(this.f11199a, this.f11200b, 0);
        if (errorResolutionPendingIntent == null) {
            return;
        }
        IntentSender intentSender = errorResolutionPendingIntent.getIntentSender();
        Intrinsics.checkNotNullParameter(intentSender, "intentSender");
        this.f11201c.a(new C0867g(intentSender, null, 0, 0));
    }
}
