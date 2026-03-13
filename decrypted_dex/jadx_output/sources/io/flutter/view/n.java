package io.flutter.view;

import android.view.View;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final View f15216a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15217b;

    public n(View view, int i3) {
        this.f15216a = view;
        this.f15217b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f15217b == nVar.f15217b && this.f15216a.equals(nVar.f15216a);
    }

    public final int hashCode() {
        return ((this.f15216a.hashCode() + 31) * 31) + this.f15217b;
    }
}
