package a0;

import Y.t;
import android.text.Editable;

/* renamed from: a0.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0380b extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f9234a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0380b f9235b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f9236c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f9236c;
        return cls != null ? new t(cls, charSequence) : super.newEditable(charSequence);
    }
}
