package N1;

import C2.c;
import androidx.lifecycle.EnumC0438m;
import androidx.lifecycle.EnumC0439n;
import androidx.lifecycle.InterfaceC0444t;
import androidx.lifecycle.r;
import k7.d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class a implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4836a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4837b;

    public /* synthetic */ a(Object obj, int i3) {
        this.f4836a = i3;
        this.f4837b = obj;
    }

    @Override // androidx.lifecycle.r
    public final void h(InterfaceC0444t interfaceC0444t, EnumC0438m event) {
        switch (this.f4836a) {
            case 0:
                Intrinsics.checkNotNullParameter(interfaceC0444t, "<unused var>");
                Intrinsics.checkNotNullParameter(event, "event");
                EnumC0438m enumC0438m = EnumC0438m.ON_START;
                c cVar = (c) this.f4837b;
                if (event != enumC0438m) {
                    if (event == EnumC0438m.ON_STOP) {
                        cVar.f1050c = false;
                        break;
                    }
                } else {
                    cVar.f1050c = true;
                    break;
                }
                break;
            default:
                d this$0 = (d) this.f4837b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(interfaceC0444t, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(event, "event");
                boolean a3 = this$0.f15480b.f9925c.a(EnumC0439n.f9915c);
                if (this$0.f15481c || (a3 && event == EnumC0438m.ON_DESTROY)) {
                    this$0.f15480b.e(event);
                    break;
                }
        }
    }
}
