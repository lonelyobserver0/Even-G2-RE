package V8;

import com.stub.StubApp;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class o extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7856a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7857b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f7858c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f7859d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, int i3, q qVar, String str2) {
        super(0);
        this.f7856a = str;
        this.f7857b = i3;
        this.f7858c = qVar;
        this.f7859d = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(6683));
        sb2.append(this.f7856a);
        sb2.append(StubApp.getString2(6684));
        sb2.append(this.f7857b);
        sb2.append(StubApp.getString2(6685));
        com.mapbox.navigation.base.route.g gVar = this.f7858c.f7876g;
        sb2.append(gVar != null ? gVar.f12506i : null);
        sb2.append(StubApp.getString2(6619));
        sb2.append(this.f7859d);
        return sb2.toString();
    }
}
