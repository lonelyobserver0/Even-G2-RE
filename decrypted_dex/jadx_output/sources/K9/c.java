package K9;

import com.microsoft.cognitiveservices.speech.speaker.VoiceProfile;
import com.microsoft.cognitiveservices.speech.speaker.VoiceProfileClient;
import com.microsoft.cognitiveservices.speech.speaker.VoiceProfileEnrollmentResult;
import com.microsoft.cognitiveservices.speech.speaker.VoiceProfileResult;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import java.util.concurrent.Callable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3767a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VoiceProfile f3768b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ VoiceProfileClient f3769c;

    public /* synthetic */ c(VoiceProfileClient voiceProfileClient, VoiceProfile voiceProfile, int i3) {
        this.f3767a = i3;
        this.f3769c = voiceProfileClient;
        this.f3768b = voiceProfile;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        long deleteVoiceProfile;
        long resetVoiceProfile;
        long retrieveEnrollmentResult;
        switch (this.f3767a) {
            case 0:
                IntRef intRef = new IntRef(0L);
                VoiceProfileClient voiceProfileClient = this.f3769c;
                deleteVoiceProfile = voiceProfileClient.deleteVoiceProfile(voiceProfileClient.f12631a, this.f3768b.getImpl(), intRef);
                Contracts.throwIfFail(deleteVoiceProfile);
                return new VoiceProfileResult(intRef.getValue());
            case 1:
                IntRef intRef2 = new IntRef(0L);
                VoiceProfileClient voiceProfileClient2 = this.f3769c;
                resetVoiceProfile = voiceProfileClient2.resetVoiceProfile(voiceProfileClient2.f12631a, this.f3768b.getImpl(), intRef2);
                Contracts.throwIfFail(resetVoiceProfile);
                return new VoiceProfileResult(intRef2.getValue());
            default:
                IntRef intRef3 = new IntRef(0L);
                VoiceProfileClient voiceProfileClient3 = this.f3769c;
                SafeHandle safeHandle = voiceProfileClient3.f12631a;
                VoiceProfile voiceProfile = this.f3768b;
                retrieveEnrollmentResult = voiceProfileClient3.retrieveEnrollmentResult(safeHandle, voiceProfile.getId(), voiceProfile.getType().getValue(), intRef3);
                Contracts.throwIfFail(retrieveEnrollmentResult);
                return new VoiceProfileEnrollmentResult(intRef3.getValue());
        }
    }
}
