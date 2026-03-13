package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class k<S> extends r {

    /* renamed from: p0, reason: collision with root package name */
    public b f11933p0;

    @Override // d0.AbstractComponentCallbacksC0789t
    public final void D(Bundle bundle) {
        bundle.putParcelable(StubApp.getString2(12510), null);
        bundle.putParcelable(StubApp.getString2(12502), this.f11933p0);
    }

    @Override // d0.AbstractComponentCallbacksC0789t
    public final void w(Bundle bundle) {
        super.w(bundle);
        if (bundle == null) {
            bundle = this.f13369f;
        }
        if (bundle.getParcelable(StubApp.getString2(12510)) != null) {
            throw new ClassCastException();
        }
        this.f11933p0 = (b) bundle.getParcelable(StubApp.getString2(12502));
    }

    @Override // d0.AbstractComponentCallbacksC0789t
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        throw null;
    }
}
