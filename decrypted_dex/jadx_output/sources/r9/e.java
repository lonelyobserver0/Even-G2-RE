package r9;

import com.stub.StubApp;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class e extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20422a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y9.q f20423b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(y9.q qVar, int i3) {
        super(1);
        this.f20422a = i3;
        this.f20423b = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20422a) {
            case 0:
                N6.a product = (N6.a) obj;
                Intrinsics.checkNotNullParameter(product, "$this$product");
                y9.q qVar = this.f20423b;
                product.e(qVar.f23598b);
                product.e(qVar.f23599c);
                break;
            default:
                N6.a stop = (N6.a) obj;
                Intrinsics.checkNotNullParameter(stop, "$this$stop");
                y9.q qVar2 = this.f20423b;
                stop.e(qVar2.f23597a);
                e block = new e(qVar2, 0);
                Intrinsics.checkNotNullParameter(block, "block");
                ArrayList arrayList = stop.f4929b;
                Intrinsics.checkNotNullParameter(block, "block");
                N6.a aVar = new N6.a(StubApp.getString2(602));
                block.invoke(aVar);
                arrayList.add(aVar.b());
                break;
        }
        return Unit.INSTANCE;
    }
}
