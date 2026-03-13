package d0;

import android.view.ViewGroup;
import d.C0759a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class Z {

    /* renamed from: a, reason: collision with root package name */
    public boolean f13238a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f13239b;

    public abstract void a(ViewGroup viewGroup);

    public abstract void b(ViewGroup viewGroup);

    public void c(C0759a backEvent, ViewGroup container) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        Intrinsics.checkNotNullParameter(container, "container");
    }

    public void d(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
    }
}
