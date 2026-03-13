package M9;

import L9.n;
import com.microsoft.cognitiveservices.speech.translation.TranslationRecognizer;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4692a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TranslationRecognizer f4693b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TranslationRecognizer f4694c;

    public /* synthetic */ c(TranslationRecognizer translationRecognizer, TranslationRecognizer translationRecognizer2, int i3) {
        this.f4692a = i3;
        this.f4694c = translationRecognizer;
        this.f4693b = translationRecognizer2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        TranslationRecognizer translationRecognizer = this.f4693b;
        switch (this.f4692a) {
            case 0:
                n nVar = new n(this, 11);
                Set set = TranslationRecognizer.f12721c;
                translationRecognizer.doAsyncRecognitionAction(nVar);
                break;
            default:
                n nVar2 = new n(this, 12);
                Set set2 = TranslationRecognizer.f12721c;
                translationRecognizer.doAsyncRecognitionAction(nVar2);
                break;
        }
        return null;
    }
}
