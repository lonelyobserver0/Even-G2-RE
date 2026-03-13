package s6;

import Xa.AbstractActivityC0364d;
import io.flutter.plugin.common.PluginRegistry;
import kotlin.jvm.internal.Intrinsics;
import r6.C1574a;

/* renamed from: s6.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1601a implements PluginRegistry.RequestPermissionsResultListener {

    /* renamed from: a, reason: collision with root package name */
    public C1574a f20775a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractActivityC0364d f20776b;

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public final boolean onRequestPermissionsResult(int i3, String[] permissions, int[] grantResults) {
        C1574a c1574a;
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        boolean z2 = false;
        if (i3 != 1001 || (c1574a = this.f20775a) == null) {
            return false;
        }
        if (grantResults.length != 0 && grantResults[0] == 0) {
            z2 = true;
        }
        Intrinsics.checkNotNull(c1574a);
        c1574a.f20359a.success(Boolean.valueOf(z2));
        this.f20775a = null;
        return true;
    }
}
