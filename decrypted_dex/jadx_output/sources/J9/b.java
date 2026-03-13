package J9;

import com.microsoft.cognitiveservices.speech.dialog.DialogServiceConnector;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import java.util.concurrent.Callable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3459a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DialogServiceConnector f3460b;

    public /* synthetic */ b(DialogServiceConnector dialogServiceConnector, int i3) {
        this.f3459a = i3;
        this.f3460b = dialogServiceConnector;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        long connect;
        long disconnect;
        long listenOnce;
        long stopListening;
        long stopKeywordRecognition;
        switch (this.f3459a) {
            case 0:
                DialogServiceConnector dialogServiceConnector = this.f3460b;
                connect = dialogServiceConnector.connect(dialogServiceConnector.f12578b);
                Contracts.throwIfFail(connect);
                break;
            case 1:
                DialogServiceConnector dialogServiceConnector2 = this.f3460b;
                disconnect = dialogServiceConnector2.disconnect(dialogServiceConnector2.f12578b);
                Contracts.throwIfFail(disconnect);
                break;
            case 2:
                IntRef intRef = new IntRef(0L);
                DialogServiceConnector dialogServiceConnector3 = this.f3460b;
                listenOnce = dialogServiceConnector3.listenOnce(dialogServiceConnector3.f12578b, intRef);
                Contracts.throwIfFail(listenOnce);
                break;
            case 3:
                DialogServiceConnector dialogServiceConnector4 = this.f3460b;
                stopListening = dialogServiceConnector4.stopListening(dialogServiceConnector4.f12578b);
                Contracts.throwIfFail(stopListening);
                break;
            default:
                DialogServiceConnector dialogServiceConnector5 = this.f3460b;
                stopKeywordRecognition = dialogServiceConnector5.stopKeywordRecognition(dialogServiceConnector5.f12578b);
                Contracts.throwIfFail(stopKeywordRecognition);
                break;
        }
        return null;
    }
}
