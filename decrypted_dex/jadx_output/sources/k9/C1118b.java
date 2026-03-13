package k9;

import android.view.animation.PathInterpolator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: k9.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1118b {

    /* renamed from: b, reason: collision with root package name */
    public static final PathInterpolator f15498b;

    /* renamed from: a, reason: collision with root package name */
    public final Y6.a f15499a;

    static {
        PathInterpolator pathInterpolator = new PathInterpolator(0.0f, 0.0f, 1.0f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(pathInterpolator, "create(0f, 0f, 1f, 1f)");
        f15498b = pathInterpolator;
    }

    public C1118b(Y6.a cameraPlugin) {
        Intrinsics.checkNotNullParameter(cameraPlugin, "cameraPlugin");
        this.f15499a = cameraPlugin;
    }
}
