package com.microsoft.cognitiveservices.speech.intent;

import com.microsoft.cognitiveservices.speech.util.Contracts;
import java.util.Set;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12604a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IntentRecognizer f12605b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IntentRecognizer f12606c;

    public /* synthetic */ a(IntentRecognizer intentRecognizer, IntentRecognizer intentRecognizer2, int i3) {
        this.f12604a = i3;
        this.f12606c = intentRecognizer;
        this.f12605b = intentRecognizer2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12604a) {
            case 0:
                Set set = IntentRecognizer.f12590b;
                IntentRecognizer intentRecognizer = this.f12605b;
                set.add(intentRecognizer);
                Contracts.throwIfFail(this.f12606c.sessionStartedSetCallback(intentRecognizer.getImpl().getValue()));
                break;
            case 1:
                Set set2 = IntentRecognizer.f12590b;
                IntentRecognizer intentRecognizer2 = this.f12605b;
                set2.add(intentRecognizer2);
                Contracts.throwIfFail(this.f12606c.sessionStoppedSetCallback(intentRecognizer2.getImpl().getValue()));
                break;
            case 2:
                Set set3 = IntentRecognizer.f12590b;
                IntentRecognizer intentRecognizer3 = this.f12605b;
                set3.add(intentRecognizer3);
                Contracts.throwIfFail(this.f12606c.speechStartDetectedSetCallback(intentRecognizer3.getImpl().getValue()));
                break;
            case 3:
                Set set4 = IntentRecognizer.f12590b;
                IntentRecognizer intentRecognizer4 = this.f12605b;
                set4.add(intentRecognizer4);
                Contracts.throwIfFail(this.f12606c.speechEndDetectedSetCallback(intentRecognizer4.getImpl().getValue()));
                break;
            case 4:
                Set set5 = IntentRecognizer.f12590b;
                IntentRecognizer intentRecognizer5 = this.f12605b;
                set5.add(intentRecognizer5);
                Contracts.throwIfFail(this.f12606c.recognizingSetCallback(intentRecognizer5.getImpl().getValue()));
                break;
            case 5:
                Set set6 = IntentRecognizer.f12590b;
                IntentRecognizer intentRecognizer6 = this.f12605b;
                set6.add(intentRecognizer6);
                Contracts.throwIfFail(this.f12606c.recognizedSetCallback(intentRecognizer6.getImpl().getValue()));
                break;
            default:
                Set set7 = IntentRecognizer.f12590b;
                IntentRecognizer intentRecognizer7 = this.f12605b;
                set7.add(intentRecognizer7);
                Contracts.throwIfFail(this.f12606c.canceledSetCallback(intentRecognizer7.getImpl().getValue()));
                break;
        }
    }
}
