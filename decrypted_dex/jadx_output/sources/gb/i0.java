package gb;

import android.os.Bundle;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface i0 {
    void clearClient();

    void finishAutofillContext(boolean z2);

    void hide();

    void requestAutofill();

    void sendAppPrivateCommand(String str, Bundle bundle);

    void setClient(int i3, e0 e0Var);

    void setEditableSizeAndTransform(double d8, double d10, double[] dArr);

    void setEditingState(h0 h0Var);

    void setPlatformViewClient(int i3, boolean z2);

    void show();
}
