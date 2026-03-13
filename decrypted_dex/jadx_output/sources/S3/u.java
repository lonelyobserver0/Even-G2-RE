package S3;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.os.Build;
import android.util.Log;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class u implements DialogInterface.OnClickListener {
    public abstract void a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i3) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e10) {
                String string2 = StubApp.getString2("6004");
                String string22 = StubApp.getString2("6005");
                if (true == Build.FINGERPRINT.contains(StubApp.getString2("5879"))) {
                    string2 = string22;
                }
                Log.e(StubApp.getString2("6006"), string2, e10);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
