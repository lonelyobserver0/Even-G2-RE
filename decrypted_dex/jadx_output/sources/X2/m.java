package X2;

import android.content.Context;
import androidx.lifecycle.InterfaceC0444t;
import b3.C0503e;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class m extends PlatformViewFactory {

    /* renamed from: a, reason: collision with root package name */
    public final BinaryMessenger f8305a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0444t f8306b;

    /* renamed from: c, reason: collision with root package name */
    public C0503e f8307c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(BinaryMessenger messenger, InterfaceC0444t lifecycleOwner) {
        super(new StandardMessageCodec());
        Intrinsics.checkNotNullParameter(messenger, "messenger");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.f8305a = messenger;
        this.f8306b = lifecycleOwner;
    }

    @Override // io.flutter.plugin.platform.PlatformViewFactory
    public final PlatformView create(Context context, int i3, Object obj) {
        C0503e c0503e = new C0503e(context, obj instanceof Map ? (Map) obj : null, this.f8305a, this.f8306b, i3);
        this.f8307c = c0503e;
        return c0503e;
    }
}
