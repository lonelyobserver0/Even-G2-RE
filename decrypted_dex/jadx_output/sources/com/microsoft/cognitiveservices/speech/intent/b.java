package com.microsoft.cognitiveservices.speech.intent;

import L9.n;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class b implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12607a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IntentRecognizer f12608b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IntentRecognizer f12609c;

    public /* synthetic */ b(IntentRecognizer intentRecognizer, IntentRecognizer intentRecognizer2, int i3) {
        this.f12607a = i3;
        this.f12609c = intentRecognizer;
        this.f12608b = intentRecognizer2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        IntentRecognizer intentRecognizer = this.f12608b;
        switch (this.f12607a) {
            case 0:
                n nVar = new n(this, 23);
                Set set = IntentRecognizer.f12590b;
                intentRecognizer.doAsyncRecognitionAction(nVar);
                break;
            case 1:
                n nVar2 = new n(this, 24);
                Set set2 = IntentRecognizer.f12590b;
                intentRecognizer.doAsyncRecognitionAction(nVar2);
                break;
            default:
                n nVar3 = new n(this, 26);
                Set set3 = IntentRecognizer.f12590b;
                intentRecognizer.doAsyncRecognitionAction(nVar3);
                break;
        }
        return null;
    }
}
