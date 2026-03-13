package k9;

import android.view.animation.PathInterpolator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final PathInterpolator f15508a;

    static {
        PathInterpolator pathInterpolator = new PathInterpolator(0.4f, 0.0f, 0.4f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(pathInterpolator, "create(0.4f, 0f, 0.4f, 1f)");
        f15508a = pathInterpolator;
    }
}
