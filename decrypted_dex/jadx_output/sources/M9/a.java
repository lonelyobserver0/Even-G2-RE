package M9;

import com.microsoft.cognitiveservices.speech.translation.TranslationRecognizer;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import java.util.Set;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4687a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TranslationRecognizer f4688b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TranslationRecognizer f4689c;

    public /* synthetic */ a(TranslationRecognizer translationRecognizer, TranslationRecognizer translationRecognizer2, int i3) {
        this.f4687a = i3;
        this.f4689c = translationRecognizer;
        this.f4688b = translationRecognizer2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long synthesizingSetCallback;
        switch (this.f4687a) {
            case 0:
                Set set = TranslationRecognizer.f12721c;
                TranslationRecognizer translationRecognizer = this.f4688b;
                set.add(translationRecognizer);
                Contracts.throwIfFail(this.f4689c.tokenRefreshSetCallback(translationRecognizer.getImpl().getValue()));
                break;
            case 1:
                Set set2 = TranslationRecognizer.f12721c;
                TranslationRecognizer translationRecognizer2 = this.f4688b;
                set2.add(translationRecognizer2);
                Contracts.throwIfFail(this.f4689c.speechStartDetectedSetCallback(translationRecognizer2.getImpl().getValue()));
                break;
            case 2:
                Set set3 = TranslationRecognizer.f12721c;
                TranslationRecognizer translationRecognizer3 = this.f4688b;
                set3.add(translationRecognizer3);
                Contracts.throwIfFail(this.f4689c.speechEndDetectedSetCallback(translationRecognizer3.getImpl().getValue()));
                break;
            case 3:
                Set set4 = TranslationRecognizer.f12721c;
                TranslationRecognizer translationRecognizer4 = this.f4688b;
                set4.add(translationRecognizer4);
                Contracts.throwIfFail(this.f4689c.recognizingSetCallback(translationRecognizer4.getImpl().getValue()));
                break;
            case 4:
                Set set5 = TranslationRecognizer.f12721c;
                TranslationRecognizer translationRecognizer5 = this.f4688b;
                set5.add(translationRecognizer5);
                Contracts.throwIfFail(this.f4689c.recognizedSetCallback(translationRecognizer5.getImpl().getValue()));
                break;
            case 5:
                Set set6 = TranslationRecognizer.f12721c;
                TranslationRecognizer translationRecognizer6 = this.f4688b;
                set6.add(translationRecognizer6);
                synthesizingSetCallback = this.f4689c.synthesizingSetCallback(translationRecognizer6.getImpl().getValue());
                Contracts.throwIfFail(synthesizingSetCallback);
                break;
            case 6:
                Set set7 = TranslationRecognizer.f12721c;
                TranslationRecognizer translationRecognizer7 = this.f4688b;
                set7.add(translationRecognizer7);
                Contracts.throwIfFail(this.f4689c.canceledSetCallback(translationRecognizer7.getImpl().getValue()));
                break;
            case 7:
                Set set8 = TranslationRecognizer.f12721c;
                TranslationRecognizer translationRecognizer8 = this.f4688b;
                set8.add(translationRecognizer8);
                Contracts.throwIfFail(this.f4689c.sessionStartedSetCallback(translationRecognizer8.getImpl().getValue()));
                break;
            default:
                Set set9 = TranslationRecognizer.f12721c;
                TranslationRecognizer translationRecognizer9 = this.f4688b;
                set9.add(translationRecognizer9);
                Contracts.throwIfFail(this.f4689c.sessionStoppedSetCallback(translationRecognizer9.getImpl().getValue()));
                break;
        }
    }
}
