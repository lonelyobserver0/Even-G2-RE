package n8;

import com.mapbox.common.BillingServiceError;
import com.mapbox.common.OnBillingServiceError;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: n8.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class C1394a implements OnBillingServiceError {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17878a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B6.a f17879b;

    public /* synthetic */ C1394a(B6.a aVar, int i3) {
        this.f17878a = i3;
        this.f17879b = aVar;
    }

    @Override // com.mapbox.common.OnBillingServiceError
    public final void run(BillingServiceError it) {
        switch (this.f17878a) {
            case 0:
                B6.a this$0 = this.f17879b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullExpressionValue(it, "it");
                this$0.getClass();
                B6.a.k(it);
                break;
            default:
                B6.a this$02 = this.f17879b;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullExpressionValue(it, "it");
                this$02.getClass();
                B6.a.k(it);
                break;
        }
    }
}
