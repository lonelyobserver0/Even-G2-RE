package N6;

import a.AbstractC0378a;
import com.mapbox.bindgen.Value;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f4928a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4929b;

    public a(String operator) {
        Intrinsics.checkNotNullParameter(operator, "operator");
        Intrinsics.checkNotNullParameter(operator, "operator");
        this.f4928a = operator;
        this.f4929b = new ArrayList();
    }

    public final void a(d expression) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        this.f4929b.add(expression);
    }

    public final d b() {
        if (!Intrinsics.areEqual(this.f4928a, "match")) {
            return new d(this);
        }
        a aVar = new a("match");
        ArrayList arrayList = this.f4929b;
        int size = arrayList.size() - 1;
        Iterator it = arrayList.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i10 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            d dVar = (d) next;
            if (i3 % 2 == 1 && i3 != size) {
                Intrinsics.checkNotNullParameter(dVar, "<this>");
                if (dVar.getContents() instanceof List) {
                    Object contents = dVar.getContents();
                    Intrinsics.checkNotNull(contents, "null cannot be cast to non-null type kotlin.collections.List<com.mapbox.bindgen.Value>");
                    List list = (List) contents;
                    Object contents2 = ((Value) CollectionsKt.first(list)).getContents();
                    if (Intrinsics.areEqual("literal", contents2 instanceof String ? (String) contents2 : null)) {
                        Object contents3 = ((Value) CollectionsKt.last(list)).getContents();
                        if (contents3 instanceof List) {
                            dVar = new d((List) contents3);
                        }
                    }
                }
            }
            aVar.a(dVar);
            i3 = i10;
        }
        return new d(aVar);
    }

    public final void c(int i3) {
        this.f4929b.add(AbstractC0378a.a(i3));
    }

    public final void d() {
        this.f4929b.add(new a(StubApp.getString2(3778)).b());
    }

    public final void e(double d8) {
        this.f4929b.add(new d(d8));
    }

    public final void f(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f4929b.add(new d(value));
    }

    public final void g(Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        block.invoke(this);
    }

    public final void h() {
        this.f4929b.add(new a(StubApp.getString2(3779)).b());
    }
}
