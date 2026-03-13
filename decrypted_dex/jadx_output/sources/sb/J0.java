package sb;

import android.webkit.JsResult;
import java.util.Objects;
import kotlin.jvm.functions.Function1;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class J0 implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20871a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L0 f20872b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ JsResult f20873c;

    public /* synthetic */ J0(L0 l02, JsResult jsResult, int i3) {
        this.f20871a = i3;
        this.f20872b = l02;
        this.f20873c = jsResult;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        A0 a02 = (A0) obj;
        switch (this.f20871a) {
            case 0:
                L0 l02 = this.f20872b;
                if (!a02.f20847d) {
                    boolean equals = Boolean.TRUE.equals(a02.f20845b);
                    JsResult jsResult = this.f20873c;
                    if (!equals) {
                        jsResult.cancel();
                        break;
                    } else {
                        jsResult.confirm();
                        break;
                    }
                } else {
                    B3.s sVar = l02.f20879b.f20977a;
                    Throwable th = a02.f20846c;
                    Objects.requireNonNull(th);
                    sVar.getClass();
                    B3.s.m(th);
                    break;
                }
            default:
                L0 l03 = this.f20872b;
                if (!a02.f20847d) {
                    this.f20873c.confirm();
                    break;
                } else {
                    B3.s sVar2 = l03.f20879b.f20977a;
                    Throwable th2 = a02.f20846c;
                    Objects.requireNonNull(th2);
                    sVar2.getClass();
                    B3.s.m(th2);
                    break;
                }
        }
        return null;
    }
}
