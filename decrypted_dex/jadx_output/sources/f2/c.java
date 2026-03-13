package f2;

import androidx.window.sidecar.SidecarDisplayFeature;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class c extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final c f13716a = new c(1);

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(SidecarDisplayFeature require) {
        Intrinsics.checkNotNullParameter(require, "$this$require");
        return Boolean.valueOf((require.getRect().width() == 0 && require.getRect().height() == 0) ? false : true);
    }
}
