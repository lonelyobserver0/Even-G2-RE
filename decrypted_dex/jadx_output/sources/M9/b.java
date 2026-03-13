package M9;

import com.google.android.gms.internal.measurement.N1;
import com.microsoft.cognitiveservices.speech.intent.IntentRecognitionResult;
import com.microsoft.cognitiveservices.speech.intent.IntentRecognizer;
import com.microsoft.cognitiveservices.speech.translation.TranslationRecognitionResult;
import com.microsoft.cognitiveservices.speech.translation.TranslationRecognizer;
import com.stub.StubApp;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import l4.BinderC1212t0;
import l4.C1179g0;
import l4.C1215v;
import l4.F1;
import l4.W;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4690a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4691b;

    public /* synthetic */ b(Object obj, int i3) {
        this.f4690a = i3;
        this.f4691b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object obj = this.f4691b;
        switch (this.f4690a) {
            case 0:
                TranslationRecognitionResult[] translationRecognitionResultArr = new TranslationRecognitionResult[1];
                Q4.b bVar = new Q4.b(this, translationRecognitionResultArr, 6, false);
                Set set = TranslationRecognizer.f12721c;
                ((TranslationRecognizer) obj).doAsyncRecognitionAction(bVar);
                return translationRecognitionResultArr[0];
            case 1:
                IntentRecognitionResult[] intentRecognitionResultArr = new IntentRecognitionResult[1];
                Q4.b bVar2 = new Q4.b(this, intentRecognitionResultArr, 18, false);
                Set set2 = IntentRecognizer.f12590b;
                ((IntentRecognizer) obj).doAsyncRecognitionAction(bVar2);
                return intentRecognitionResultArr[0];
            case 2:
                return new N1(((C1179g0) obj).f16439l);
            default:
                BinderC1212t0 binderC1212t0 = (BinderC1212t0) obj;
                binderC1212t0.f16629e.A();
                W w10 = binderC1212t0.f16629e.f16066h;
                F1.S(w10);
                w10.k();
                throw new IllegalStateException(StubApp.getString2(3565));
        }
    }

    public b(BinderC1212t0 binderC1212t0, C1215v c1215v, String str) {
        this.f4690a = 3;
        Objects.requireNonNull(binderC1212t0);
        this.f4691b = binderC1212t0;
    }
}
