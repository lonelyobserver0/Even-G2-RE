package b3;

import D5.C0043g;
import X2.C0359a;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.stub.StubApp;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.MessageCodec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b3.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0502d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0503e f10609a;

    public C0502d(C0503e c0503e) {
        this.f10609a = c0503e;
    }

    public final void a(b7.a annotation) {
        C0359a c0359a;
        JsonObject asJsonObject;
        JsonElement jsonElement;
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        JsonElement jsonElement2 = annotation.f10710b.get(StubApp.getString2(8557));
        Integer valueOf = (jsonElement2 == null || (asJsonObject = jsonElement2.getAsJsonObject()) == null || (jsonElement = asJsonObject.get(StubApp.getString2(8110))) == null) ? null : Integer.valueOf(jsonElement.getAsInt());
        C0503e c0503e = this.f10609a;
        c0503e.getClass();
        R2.c.b(StubApp.getString2(7105), StubApp.getString2(9139) + valueOf);
        if (valueOf == null || (c0359a = c0503e.f10616f) == null) {
            return;
        }
        long intValue = valueOf.intValue();
        X2.u callback = new X2.u(c0503e, 1);
        Intrinsics.checkNotNullParameter(callback, "callback");
        String str = c0359a.f8258b;
        String j = E1.a.j(StubApp.getString2(9140), str.length() > 0 ? StubApp.getString2(1).concat(str) : "");
        new BasicMessageChannel(c0359a.f8257a, j, (MessageCodec) C0359a.f8256c.getValue()).send(CollectionsKt.listOf(Long.valueOf(intValue)), new C0043g(14, callback, j));
    }
}
