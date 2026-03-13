package E9;

import D5.C0043g;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import com.mapbox.bindgen.Expected;
import f4.C0879c;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import m8.F;
import v0.C1803F;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class q extends Lambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2099a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2100b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Object obj, int i3) {
        super(2);
        this.f2099a = i3;
        this.f2100b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2099a) {
            case 0:
                TextToSpeech textToSpeech = (TextToSpeech) obj;
                Bundle it = (Bundle) obj2;
                Intrinsics.checkNotNullParameter(textToSpeech, "$this$null");
                Intrinsics.checkNotNullParameter(it, "it");
                textToSpeech.setAudioAttributes(((r) this.f2100b).a(F9.a.f2332b));
                return Unit.INSTANCE;
            case 1:
                Continuation continuation = (Continuation) obj;
                Expected expected = (Expected) obj2;
                Intrinsics.checkNotNullParameter(continuation, "continuation");
                Intrinsics.checkNotNullParameter(expected, "expected");
                expected.fold(new C0043g(15, (com.mapbox.navigation.base.route.g) this.f2100b, continuation), new C2.d(continuation, 29));
                return Unit.INSTANCE;
            case 2:
                List routes = (List) obj;
                int intValue = ((Number) obj2).intValue();
                Intrinsics.checkNotNullParameter(routes, "routes");
                ((m8.r) this.f2100b).h(routes, new F(intValue), null);
                return Unit.INSTANCE;
            default:
                Integer num = (Integer) obj;
                ((Number) obj2).intValue();
                C0879c c0879c = (C0879c) this.f2100b;
                return Integer.valueOf((num == null || !((IntRange) ((C1803F) c0879c.f13742a).f21582b).contains(num.intValue())) ? 0 : ((IntRange) ((C1803F) c0879c.f13742a).f21581a).getLast());
        }
    }
}
