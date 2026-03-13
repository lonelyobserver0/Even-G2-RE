package V8;

import com.mapbox.bindgen.Expected;
import com.stub.StubApp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o0.InterfaceC1410G;
import r0.InterfaceC1546g;

/* renamed from: V8.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class C0352d implements Expected.Transformer, InterfaceC1546g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7822a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f7823b;

    public /* synthetic */ C0352d(int i3, List list) {
        this.f7822a = i3;
        this.f7823b = list;
    }

    @Override // com.mapbox.bindgen.Expected.Transformer
    public Object invoke(Object obj) {
        List it = (List) obj;
        String string2 = StubApp.getString2(6666);
        List list = this.f7823b;
        Intrinsics.checkNotNullParameter(list, string2);
        Intrinsics.checkNotNullParameter(it, "it");
        return new t(list, it);
    }

    public /* synthetic */ C0352d(w0.a aVar, List list) {
        this.f7822a = 2;
        this.f7823b = list;
    }

    @Override // r0.InterfaceC1546g
    /* renamed from: invoke, reason: collision with other method in class */
    public void mo0invoke(Object obj) {
        switch (this.f7822a) {
            case 1:
                ((InterfaceC1410G) obj).u(this.f7823b);
                break;
            default:
                ((w0.h) obj).getClass();
                break;
        }
    }
}
