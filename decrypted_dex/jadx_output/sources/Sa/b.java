package Sa;

import B3.s;
import Ya.d;
import android.content.Context;
import com.stub.StubApp;
import db.C0824a;
import db.InterfaceC0825b;
import io.flutter.plugin.common.MethodChannel;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LSa/b;", "Ldb/b;", "Leb/a;", "<init>", "()V", "share_plus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b implements InterfaceC0825b, eb.a {

    /* renamed from: a, reason: collision with root package name */
    public s f6672a;

    /* renamed from: b, reason: collision with root package name */
    public c f6673b;

    /* renamed from: c, reason: collision with root package name */
    public MethodChannel f6674c;

    @Override // eb.a
    public final void onAttachedToActivity(eb.b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        c cVar = this.f6673b;
        s sVar = null;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("manager");
            cVar = null;
        }
        d dVar = (d) binding;
        dVar.a(cVar);
        s sVar2 = this.f6672a;
        if (sVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("share");
        } else {
            sVar = sVar2;
        }
        sVar.f650b = dVar.f8882a;
    }

    @Override // db.InterfaceC0825b
    public final void onAttachedToEngine(C0824a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f6674c = new MethodChannel(binding.f13554b, StubApp.getString2(6080));
        Context context = binding.f13553a;
        Intrinsics.checkNotNullExpressionValue(context, "getApplicationContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        c cVar = new c();
        cVar.f6676b = new AtomicBoolean(true);
        this.f6673b = cVar;
        Intrinsics.checkNotNullExpressionValue(context, "getApplicationContext(...)");
        c cVar2 = this.f6673b;
        String string2 = StubApp.getString2(6081);
        MethodChannel methodChannel = null;
        if (cVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            cVar2 = null;
        }
        s sVar = new s(context, cVar2);
        this.f6672a = sVar;
        c cVar3 = this.f6673b;
        if (cVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            cVar3 = null;
        }
        a aVar = new a(sVar, cVar3);
        MethodChannel methodChannel2 = this.f6674c;
        if (methodChannel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("methodChannel");
        } else {
            methodChannel = methodChannel2;
        }
        methodChannel.setMethodCallHandler(aVar);
    }

    @Override // eb.a
    public final void onDetachedFromActivity() {
        s sVar = this.f6672a;
        if (sVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("share");
            sVar = null;
        }
        sVar.f650b = null;
    }

    @Override // eb.a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // db.InterfaceC0825b
    public final void onDetachedFromEngine(C0824a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        MethodChannel methodChannel = this.f6674c;
        if (methodChannel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("methodChannel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
    }

    @Override // eb.a
    public final void onReattachedToActivityForConfigChanges(eb.b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        onAttachedToActivity(binding);
    }
}
