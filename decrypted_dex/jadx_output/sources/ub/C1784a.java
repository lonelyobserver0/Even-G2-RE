package ub;

import android.content.Context;
import com.stub.StubApp;
import db.C0824a;
import db.InterfaceC0825b;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lub/a;", "Ldb/b;", "<init>", "()V", "fluttertoast_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ub.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1784a implements InterfaceC0825b {

    /* renamed from: a, reason: collision with root package name */
    public MethodChannel f21482a;

    @Override // db.InterfaceC0825b
    public final void onAttachedToEngine(C0824a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        BinaryMessenger binaryMessenger = binding.f13554b;
        Intrinsics.checkNotNullExpressionValue(binaryMessenger, "getBinaryMessenger(...)");
        Context context = binding.f13553a;
        Intrinsics.checkNotNullExpressionValue(context, "getApplicationContext(...)");
        this.f21482a = new MethodChannel(binaryMessenger, StubApp.getString2(23585));
        Intrinsics.checkNotNullParameter(context, "context");
        C1786c c1786c = new C1786c();
        c1786c.f21484a = context;
        MethodChannel methodChannel = this.f21482a;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(c1786c);
        }
    }

    @Override // db.InterfaceC0825b
    public final void onDetachedFromEngine(C0824a p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        MethodChannel methodChannel = this.f21482a;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this.f21482a = null;
    }
}
