package K9;

import J1.l;
import L9.n;
import com.microsoft.cognitiveservices.speech.audio.AudioConfig;
import com.microsoft.cognitiveservices.speech.intent.IntentRecognitionResult;
import com.microsoft.cognitiveservices.speech.intent.IntentRecognizer;
import com.microsoft.cognitiveservices.speech.speaker.VoiceProfile;
import com.microsoft.cognitiveservices.speech.speaker.VoiceProfileClient;
import com.microsoft.cognitiveservices.speech.speaker.VoiceProfileEnrollmentResult;
import com.microsoft.cognitiveservices.speech.transcription.ConversationTranslator;
import com.microsoft.cognitiveservices.speech.transcription.MeetingTranscriber;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3763a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AutoCloseable f3764b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3765c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AutoCloseable f3766d;

    public /* synthetic */ b(AutoCloseable autoCloseable, AutoCloseable autoCloseable2, Object obj, int i3) {
        this.f3763a = i3;
        this.f3766d = autoCloseable;
        this.f3764b = autoCloseable2;
        this.f3765c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        long enrollVoiceProfile;
        boolean z2 = false;
        AutoCloseable autoCloseable = this.f3764b;
        switch (this.f3763a) {
            case 0:
                IntRef intRef = new IntRef(0L);
                VoiceProfileClient voiceProfileClient = (VoiceProfileClient) this.f3766d;
                enrollVoiceProfile = voiceProfileClient.enrollVoiceProfile(voiceProfileClient.f12631a, ((VoiceProfile) autoCloseable).getImpl(), ((AudioConfig) this.f3765c).getImpl(), intRef);
                Contracts.throwIfFail(enrollVoiceProfile);
                return new VoiceProfileEnrollmentResult(intRef.getValue());
            case 1:
                ConversationTranslator.A((ConversationTranslator) autoCloseable, new l(this, 20));
                return null;
            case 2:
                n nVar = new n(this, 7);
                Set set = MeetingTranscriber.f12695b;
                ((MeetingTranscriber) autoCloseable).doAsyncRecognitionAction(nVar);
                return null;
            case 3:
                IntentRecognitionResult[] intentRecognitionResultArr = new IntentRecognitionResult[1];
                Q4.b bVar = new Q4.b(this, intentRecognitionResultArr, 19, z2);
                Set set2 = IntentRecognizer.f12590b;
                ((IntentRecognizer) autoCloseable).doAsyncRecognitionAction(bVar);
                return intentRecognitionResultArr[0];
            default:
                n nVar2 = new n(this, 25);
                Set set3 = IntentRecognizer.f12590b;
                ((IntentRecognizer) autoCloseable).doAsyncRecognitionAction(nVar2);
                return null;
        }
    }
}
