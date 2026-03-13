package K9;

import com.microsoft.cognitiveservices.speech.speaker.VoiceProfile;
import com.microsoft.cognitiveservices.speech.speaker.VoiceProfileClient;
import com.microsoft.cognitiveservices.speech.speaker.VoiceProfilePhraseResult;
import com.microsoft.cognitiveservices.speech.speaker.VoiceProfileType;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import java.util.concurrent.Callable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3759a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VoiceProfileType f3760b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f3761c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ VoiceProfileClient f3762d;

    public /* synthetic */ a(VoiceProfileClient voiceProfileClient, VoiceProfileType voiceProfileType, String str, int i3) {
        this.f3759a = i3;
        this.f3762d = voiceProfileClient;
        this.f3760b = voiceProfileType;
        this.f3761c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        long createVoiceProfile;
        long activationPhrases;
        switch (this.f3759a) {
            case 0:
                IntRef intRef = new IntRef(0L);
                VoiceProfileClient voiceProfileClient = this.f3762d;
                createVoiceProfile = voiceProfileClient.createVoiceProfile(voiceProfileClient.f12631a, this.f3760b.getValue(), this.f3761c, intRef);
                Contracts.throwIfFail(createVoiceProfile);
                return new VoiceProfile(intRef.getValue());
            default:
                IntRef intRef2 = new IntRef(0L);
                VoiceProfileClient voiceProfileClient2 = this.f3762d;
                activationPhrases = voiceProfileClient2.getActivationPhrases(voiceProfileClient2.f12631a, this.f3760b.getValue(), this.f3761c, intRef2);
                Contracts.throwIfFail(activationPhrases);
                return new VoiceProfilePhraseResult(intRef2.getValue());
        }
    }
}
