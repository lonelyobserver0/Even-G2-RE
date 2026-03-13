package J9;

import com.microsoft.cognitiveservices.speech.dialog.DialogServiceConnector;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import java.util.Set;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3456a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DialogServiceConnector f3457b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DialogServiceConnector f3458c;

    public /* synthetic */ a(DialogServiceConnector dialogServiceConnector, DialogServiceConnector dialogServiceConnector2, int i3) {
        this.f3456a = i3;
        this.f3458c = dialogServiceConnector;
        this.f3457b = dialogServiceConnector2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long sessionStartedSetCallback;
        long sessionStoppedSetCallback;
        long speechStartDetectedSetCallback;
        long speechEndDetectedSetCallback;
        long canceledSetCallback;
        long activityReceivedSetCallback;
        long turnStatusReceivedSetCallback;
        long recognizingSetCallback;
        long recognizedSetCallback;
        switch (this.f3456a) {
            case 0:
                Set set = DialogServiceConnector.f12576d;
                DialogServiceConnector dialogServiceConnector = this.f3457b;
                set.add(dialogServiceConnector);
                sessionStartedSetCallback = this.f3458c.sessionStartedSetCallback(dialogServiceConnector.f12578b.getValue());
                Contracts.throwIfFail(sessionStartedSetCallback);
                break;
            case 1:
                Set set2 = DialogServiceConnector.f12576d;
                DialogServiceConnector dialogServiceConnector2 = this.f3457b;
                set2.add(dialogServiceConnector2);
                sessionStoppedSetCallback = this.f3458c.sessionStoppedSetCallback(dialogServiceConnector2.f12578b.getValue());
                Contracts.throwIfFail(sessionStoppedSetCallback);
                break;
            case 2:
                Set set3 = DialogServiceConnector.f12576d;
                DialogServiceConnector dialogServiceConnector3 = this.f3457b;
                set3.add(dialogServiceConnector3);
                speechStartDetectedSetCallback = this.f3458c.speechStartDetectedSetCallback(dialogServiceConnector3.f12578b.getValue());
                Contracts.throwIfFail(speechStartDetectedSetCallback);
                break;
            case 3:
                Set set4 = DialogServiceConnector.f12576d;
                DialogServiceConnector dialogServiceConnector4 = this.f3457b;
                set4.add(dialogServiceConnector4);
                speechEndDetectedSetCallback = this.f3458c.speechEndDetectedSetCallback(dialogServiceConnector4.f12578b.getValue());
                Contracts.throwIfFail(speechEndDetectedSetCallback);
                break;
            case 4:
                Set set5 = DialogServiceConnector.f12576d;
                DialogServiceConnector dialogServiceConnector5 = this.f3457b;
                set5.add(dialogServiceConnector5);
                canceledSetCallback = this.f3458c.canceledSetCallback(dialogServiceConnector5.f12578b.getValue());
                Contracts.throwIfFail(canceledSetCallback);
                break;
            case 5:
                Set set6 = DialogServiceConnector.f12576d;
                DialogServiceConnector dialogServiceConnector6 = this.f3457b;
                set6.add(dialogServiceConnector6);
                activityReceivedSetCallback = this.f3458c.activityReceivedSetCallback(dialogServiceConnector6.f12578b.getValue());
                Contracts.throwIfFail(activityReceivedSetCallback);
                break;
            case 6:
                Set set7 = DialogServiceConnector.f12576d;
                DialogServiceConnector dialogServiceConnector7 = this.f3457b;
                set7.add(dialogServiceConnector7);
                turnStatusReceivedSetCallback = this.f3458c.turnStatusReceivedSetCallback(dialogServiceConnector7.f12578b.getValue());
                Contracts.throwIfFail(turnStatusReceivedSetCallback);
                break;
            case 7:
                Set set8 = DialogServiceConnector.f12576d;
                DialogServiceConnector dialogServiceConnector8 = this.f3457b;
                set8.add(dialogServiceConnector8);
                recognizingSetCallback = this.f3458c.recognizingSetCallback(dialogServiceConnector8.f12578b.getValue());
                Contracts.throwIfFail(recognizingSetCallback);
                break;
            default:
                Set set9 = DialogServiceConnector.f12576d;
                DialogServiceConnector dialogServiceConnector9 = this.f3457b;
                set9.add(dialogServiceConnector9);
                recognizedSetCallback = this.f3458c.recognizedSetCallback(dialogServiceConnector9.f12578b.getValue());
                Contracts.throwIfFail(recognizedSetCallback);
                break;
        }
    }
}
