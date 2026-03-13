package q6;

import Ya.d;
import android.content.Context;
import com.stub.StubApp;
import db.C0824a;
import db.InterfaceC0825b;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import r6.b;
import s6.C1601a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lq6/a;", "Ldb/b;", "Leb/a;", "<init>", "()V", "record_android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: q6.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1524a implements InterfaceC0825b, eb.a {

    /* renamed from: a, reason: collision with root package name */
    public MethodChannel f20078a;

    /* renamed from: b, reason: collision with root package name */
    public b f20079b;

    /* renamed from: c, reason: collision with root package name */
    public C1601a f20080c;

    /* renamed from: d, reason: collision with root package name */
    public eb.b f20081d;

    @Override // eb.a
    public final void onAttachedToActivity(eb.b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f20081d = binding;
        C1601a c1601a = this.f20080c;
        if (c1601a != null) {
            c1601a.f20776b = ((d) binding).f8882a;
            if (binding != null) {
                ((d) binding).b(c1601a);
            }
        }
    }

    @Override // db.InterfaceC0825b
    public final void onAttachedToEngine(C0824a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        C1601a c1601a = new C1601a();
        this.f20080c = c1601a;
        Intrinsics.checkNotNull(c1601a);
        BinaryMessenger binaryMessenger = binding.f13554b;
        Intrinsics.checkNotNullExpressionValue(binaryMessenger, "getBinaryMessenger(...)");
        String string2 = StubApp.getString2(11217);
        Context context = binding.f13553a;
        Intrinsics.checkNotNullExpressionValue(context, string2);
        this.f20079b = new b(c1601a, binaryMessenger, context);
        MethodChannel methodChannel = new MethodChannel(binding.f13554b, StubApp.getString2(22234));
        this.f20078a = methodChannel;
        methodChannel.setMethodCallHandler(this.f20079b);
    }

    @Override // eb.a
    public final void onDetachedFromActivity() {
        C1601a c1601a = this.f20080c;
        if (c1601a != null) {
            c1601a.f20776b = null;
            eb.b bVar = this.f20081d;
            if (bVar != null) {
                ((d) bVar).f8884c.remove(c1601a);
            }
        }
        this.f20081d = null;
    }

    @Override // eb.a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // db.InterfaceC0825b
    public final void onDetachedFromEngine(C0824a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        MethodChannel methodChannel = this.f20078a;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this.f20078a = null;
        b bVar = this.f20079b;
        if (bVar != null) {
            ConcurrentHashMap concurrentHashMap = bVar.f20363d;
            for (Object obj : concurrentHashMap.entrySet()) {
                Intrinsics.checkNotNullExpressionValue(obj, "next(...)");
                Map.Entry entry = (Map.Entry) obj;
                Object value = entry.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "<get-value>(...)");
                Object key = entry.getKey();
                Intrinsics.checkNotNullExpressionValue(key, "<get-key>(...)");
                bVar.a((r6.d) value, (String) key);
            }
            concurrentHashMap.clear();
        }
        this.f20079b = null;
    }

    @Override // eb.a
    public final void onReattachedToActivityForConfigChanges(eb.b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        onDetachedFromActivity();
        onAttachedToActivity(binding);
    }
}
