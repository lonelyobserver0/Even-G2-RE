package sb;

import android.webkit.ValueCallback;
import kotlin.Result;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* renamed from: sb.m, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class C1659m implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20975a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f20976b;

    public /* synthetic */ C1659m(int i3, Function1 function1) {
        this.f20975a = i3;
        this.f20976b = function1;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        switch (this.f20975a) {
            case 0:
                X2.z callback = (X2.z) this.f20976b;
                Intrinsics.checkNotNullParameter(callback, "callback");
                ((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(callback, 1)).invoke(Result.m39boximpl(Result.m40constructorimpl((Boolean) obj)));
                break;
            default:
                X2.z callback2 = (X2.z) this.f20976b;
                Intrinsics.checkNotNullParameter(callback2, "callback");
                ((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(callback2, 1)).invoke(Result.m39boximpl(Result.m40constructorimpl((String) obj)));
                break;
        }
    }
}
