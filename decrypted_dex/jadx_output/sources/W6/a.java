package W6;

import N6.d;
import com.stub.StubApp;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8165a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f8166b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8167c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(double d8, int i3) {
        super(1);
        this.f8166b = d8;
        this.f8167c = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f8165a) {
            case 0:
                N6.a rgba = (N6.a) obj;
                Intrinsics.checkNotNullParameter(rgba, "$this$rgba");
                int i3 = this.f8167c;
                rgba.f4929b.add(new d((i3 >> 16) & 255));
                ArrayList arrayList = rgba.f4929b;
                arrayList.add(new d((i3 >> 8) & 255));
                arrayList.add(new d(i3 & 255));
                NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.US);
                Intrinsics.checkNotNull(numberInstance, "null cannot be cast to non-null type java.text.DecimalFormat");
                DecimalFormat decimalFormat = (DecimalFormat) numberInstance;
                decimalFormat.applyPattern(StubApp.getString2(6926));
                String format = decimalFormat.format(this.f8166b);
                Intrinsics.checkNotNullExpressionValue(format, "decimalFormat.format(alpha)");
                rgba.e(Double.parseDouble(format));
                break;
            default:
                N6.a stop = (N6.a) obj;
                Intrinsics.checkNotNullParameter(stop, "$this$stop");
                stop.e(this.f8166b);
                stop.c(this.f8167c);
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i3, double d8) {
        super(1);
        this.f8167c = i3;
        this.f8166b = d8;
    }
}
